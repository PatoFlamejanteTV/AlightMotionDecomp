package androidx.customview.widget;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.SparseArrayCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.core.view.accessibility.AccessibilityRecordCompat;
import androidx.customview.widget.FocusStrategy;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class ExploreByTouchHelper extends AccessibilityDelegateCompat {
    private static final String DEFAULT_CLASS_NAME = "android.view.View";
    public static final int HOST_ID = -1;
    public static final int INVALID_ID = Integer.MIN_VALUE;
    private static final Rect INVALID_PARENT_BOUNDS = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    private static final FocusStrategy.BoundsAdapter<AccessibilityNodeInfoCompat> NODE_ADAPTER = new FocusStrategy.BoundsAdapter<AccessibilityNodeInfoCompat>() { // from class: androidx.customview.widget.ExploreByTouchHelper.1
        @Override // androidx.customview.widget.FocusStrategy.BoundsAdapter
        public void obtainBounds(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, Rect rect) {
            accessibilityNodeInfoCompat.getBoundsInParent(rect);
        }
    };
    private static final FocusStrategy.CollectionAdapter<SparseArrayCompat<AccessibilityNodeInfoCompat>, AccessibilityNodeInfoCompat> SPARSE_VALUES_ADAPTER = new FocusStrategy.CollectionAdapter<SparseArrayCompat<AccessibilityNodeInfoCompat>, AccessibilityNodeInfoCompat>() { // from class: androidx.customview.widget.ExploreByTouchHelper.2
        @Override // androidx.customview.widget.FocusStrategy.CollectionAdapter
        public AccessibilityNodeInfoCompat get(SparseArrayCompat<AccessibilityNodeInfoCompat> sparseArrayCompat, int i8) {
            return sparseArrayCompat.valueAt(i8);
        }

        @Override // androidx.customview.widget.FocusStrategy.CollectionAdapter
        public int size(SparseArrayCompat<AccessibilityNodeInfoCompat> sparseArrayCompat) {
            return sparseArrayCompat.size();
        }
    };
    private final View mHost;
    private final AccessibilityManager mManager;
    private MyNodeProvider mNodeProvider;
    private final Rect mTempScreenRect = new Rect();
    private final Rect mTempParentRect = new Rect();
    private final Rect mTempVisibleRect = new Rect();
    private final int[] mTempGlobalRect = new int[2];
    int mAccessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
    int mKeyboardFocusedVirtualViewId = Integer.MIN_VALUE;
    private int mHoveredVirtualViewId = Integer.MIN_VALUE;

    /* loaded from: classes3.dex */
    private class MyNodeProvider extends AccessibilityNodeProviderCompat {
        MyNodeProvider() {
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int i8) {
            return AccessibilityNodeInfoCompat.obtain(ExploreByTouchHelper.this.obtainAccessibilityNodeInfo(i8));
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public AccessibilityNodeInfoCompat findFocus(int i8) {
            int i9;
            if (i8 == 2) {
                i9 = ExploreByTouchHelper.this.mAccessibilityFocusedVirtualViewId;
            } else {
                i9 = ExploreByTouchHelper.this.mKeyboardFocusedVirtualViewId;
            }
            if (i9 == Integer.MIN_VALUE) {
                return null;
            }
            return createAccessibilityNodeInfo(i9);
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public boolean performAction(int i8, int i9, Bundle bundle) {
            return ExploreByTouchHelper.this.performAction(i8, i9, bundle);
        }
    }

    public ExploreByTouchHelper(@NonNull View view) {
        if (view != null) {
            this.mHost = view;
            this.mManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (ViewCompat.getImportantForAccessibility(view) == 0) {
                ViewCompat.setImportantForAccessibility(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    private boolean clearAccessibilityFocus(int i8) {
        if (this.mAccessibilityFocusedVirtualViewId == i8) {
            this.mAccessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
            this.mHost.invalidate();
            sendEventForVirtualView(i8, 65536);
            return true;
        }
        return false;
    }

    private boolean clickKeyboardFocusedVirtualView() {
        int i8 = this.mKeyboardFocusedVirtualViewId;
        if (i8 != Integer.MIN_VALUE && onPerformActionForVirtualView(i8, 16, null)) {
            return true;
        }
        return false;
    }

    private AccessibilityEvent createEvent(int i8, int i9) {
        if (i8 != -1) {
            return createEventForChild(i8, i9);
        }
        return createEventForHost(i9);
    }

    private AccessibilityEvent createEventForChild(int i8, int i9) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i9);
        AccessibilityNodeInfoCompat obtainAccessibilityNodeInfo = obtainAccessibilityNodeInfo(i8);
        obtain.getText().add(obtainAccessibilityNodeInfo.getText());
        obtain.setContentDescription(obtainAccessibilityNodeInfo.getContentDescription());
        obtain.setScrollable(obtainAccessibilityNodeInfo.isScrollable());
        obtain.setPassword(obtainAccessibilityNodeInfo.isPassword());
        obtain.setEnabled(obtainAccessibilityNodeInfo.isEnabled());
        obtain.setChecked(obtainAccessibilityNodeInfo.isChecked());
        onPopulateEventForVirtualView(i8, obtain);
        if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        obtain.setClassName(obtainAccessibilityNodeInfo.getClassName());
        AccessibilityRecordCompat.setSource(obtain, this.mHost, i8);
        obtain.setPackageName(this.mHost.getContext().getPackageName());
        return obtain;
    }

    private AccessibilityEvent createEventForHost(int i8) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i8);
        this.mHost.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    @NonNull
    private AccessibilityNodeInfoCompat createNodeForChild(int i8) {
        boolean z8;
        AccessibilityNodeInfoCompat obtain = AccessibilityNodeInfoCompat.obtain();
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        obtain.setClassName("android.view.View");
        Rect rect = INVALID_PARENT_BOUNDS;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        obtain.setParent(this.mHost);
        onPopulateNodeForVirtualView(i8, obtain);
        if (obtain.getText() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        obtain.getBoundsInParent(this.mTempParentRect);
        if (!this.mTempParentRect.equals(rect)) {
            int actions = obtain.getActions();
            if ((actions & 64) == 0) {
                if ((actions & 128) == 0) {
                    obtain.setPackageName(this.mHost.getContext().getPackageName());
                    obtain.setSource(this.mHost, i8);
                    if (this.mAccessibilityFocusedVirtualViewId == i8) {
                        obtain.setAccessibilityFocused(true);
                        obtain.addAction(128);
                    } else {
                        obtain.setAccessibilityFocused(false);
                        obtain.addAction(64);
                    }
                    if (this.mKeyboardFocusedVirtualViewId == i8) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (z8) {
                        obtain.addAction(2);
                    } else if (obtain.isFocusable()) {
                        obtain.addAction(1);
                    }
                    obtain.setFocused(z8);
                    this.mHost.getLocationOnScreen(this.mTempGlobalRect);
                    obtain.getBoundsInScreen(this.mTempScreenRect);
                    if (this.mTempScreenRect.equals(rect)) {
                        obtain.getBoundsInParent(this.mTempScreenRect);
                        if (obtain.mParentVirtualDescendantId != -1) {
                            AccessibilityNodeInfoCompat obtain2 = AccessibilityNodeInfoCompat.obtain();
                            for (int i9 = obtain.mParentVirtualDescendantId; i9 != -1; i9 = obtain2.mParentVirtualDescendantId) {
                                obtain2.setParent(this.mHost, -1);
                                obtain2.setBoundsInParent(INVALID_PARENT_BOUNDS);
                                onPopulateNodeForVirtualView(i9, obtain2);
                                obtain2.getBoundsInParent(this.mTempParentRect);
                                Rect rect2 = this.mTempScreenRect;
                                Rect rect3 = this.mTempParentRect;
                                rect2.offset(rect3.left, rect3.top);
                            }
                            obtain2.recycle();
                        }
                        this.mTempScreenRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
                    }
                    if (this.mHost.getLocalVisibleRect(this.mTempVisibleRect)) {
                        this.mTempVisibleRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
                        if (this.mTempScreenRect.intersect(this.mTempVisibleRect)) {
                            obtain.setBoundsInScreen(this.mTempScreenRect);
                            if (isVisibleToUser(this.mTempScreenRect)) {
                                obtain.setVisibleToUser(true);
                            }
                        }
                    }
                    return obtain;
                }
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
    }

    @NonNull
    private AccessibilityNodeInfoCompat createNodeForHost() {
        AccessibilityNodeInfoCompat obtain = AccessibilityNodeInfoCompat.obtain(this.mHost);
        ViewCompat.onInitializeAccessibilityNodeInfo(this.mHost, obtain);
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            obtain.addChild(this.mHost, ((Integer) arrayList.get(i8)).intValue());
        }
        return obtain;
    }

    private SparseArrayCompat<AccessibilityNodeInfoCompat> getAllNodes() {
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        SparseArrayCompat<AccessibilityNodeInfoCompat> sparseArrayCompat = new SparseArrayCompat<>();
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            sparseArrayCompat.put(arrayList.get(i8).intValue(), createNodeForChild(arrayList.get(i8).intValue()));
        }
        return sparseArrayCompat;
    }

    private void getBoundsInParent(int i8, Rect rect) {
        obtainAccessibilityNodeInfo(i8).getBoundsInParent(rect);
    }

    private static Rect guessPreviouslyFocusedRect(@NonNull View view, int i8, @NonNull Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i8 != 17) {
            if (i8 != 33) {
                if (i8 != 66) {
                    if (i8 == 130) {
                        rect.set(0, -1, width, -1);
                    } else {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                } else {
                    rect.set(-1, 0, -1, height);
                }
            } else {
                rect.set(0, height, width, height);
            }
        } else {
            rect.set(width, 0, width, height);
        }
        return rect;
    }

    private boolean isVisibleToUser(Rect rect) {
        if (rect == null || rect.isEmpty() || this.mHost.getWindowVisibility() != 0) {
            return false;
        }
        Object parent = this.mHost.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        if (parent == null) {
            return false;
        }
        return true;
    }

    private static int keyToDirection(int i8) {
        if (i8 == 19) {
            return 33;
        }
        if (i8 == 21) {
            return 17;
        }
        if (i8 != 22) {
            return TsExtractor.TS_STREAM_TYPE_HDMV_DTS;
        }
        return 66;
    }

    private boolean moveFocus(int i8, @Nullable Rect rect) {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat;
        boolean z8;
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2;
        SparseArrayCompat<AccessibilityNodeInfoCompat> allNodes = getAllNodes();
        int i9 = this.mKeyboardFocusedVirtualViewId;
        int i10 = Integer.MIN_VALUE;
        if (i9 == Integer.MIN_VALUE) {
            accessibilityNodeInfoCompat = null;
        } else {
            accessibilityNodeInfoCompat = allNodes.get(i9);
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat3 = accessibilityNodeInfoCompat;
        if (i8 != 1 && i8 != 2) {
            if (i8 != 17 && i8 != 33 && i8 != 66 && i8 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i11 = this.mKeyboardFocusedVirtualViewId;
            if (i11 != Integer.MIN_VALUE) {
                getBoundsInParent(i11, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                guessPreviouslyFocusedRect(this.mHost, i8, rect2);
            }
            accessibilityNodeInfoCompat2 = (AccessibilityNodeInfoCompat) FocusStrategy.findNextFocusInAbsoluteDirection(allNodes, SPARSE_VALUES_ADAPTER, NODE_ADAPTER, accessibilityNodeInfoCompat3, rect2, i8);
        } else {
            if (ViewCompat.getLayoutDirection(this.mHost) == 1) {
                z8 = true;
            } else {
                z8 = false;
            }
            accessibilityNodeInfoCompat2 = (AccessibilityNodeInfoCompat) FocusStrategy.findNextFocusInRelativeDirection(allNodes, SPARSE_VALUES_ADAPTER, NODE_ADAPTER, accessibilityNodeInfoCompat3, i8, z8, false);
        }
        if (accessibilityNodeInfoCompat2 != null) {
            i10 = allNodes.keyAt(allNodes.indexOfValue(accessibilityNodeInfoCompat2));
        }
        return requestKeyboardFocusForVirtualView(i10);
    }

    private boolean performActionForChild(int i8, int i9, Bundle bundle) {
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 64) {
                    if (i9 != 128) {
                        return onPerformActionForVirtualView(i8, i9, bundle);
                    }
                    return clearAccessibilityFocus(i8);
                }
                return requestAccessibilityFocus(i8);
            }
            return clearKeyboardFocusForVirtualView(i8);
        }
        return requestKeyboardFocusForVirtualView(i8);
    }

    private boolean performActionForHost(int i8, Bundle bundle) {
        return ViewCompat.performAccessibilityAction(this.mHost, i8, bundle);
    }

    private boolean requestAccessibilityFocus(int i8) {
        int i9;
        if (!this.mManager.isEnabled() || !this.mManager.isTouchExplorationEnabled() || (i9 = this.mAccessibilityFocusedVirtualViewId) == i8) {
            return false;
        }
        if (i9 != Integer.MIN_VALUE) {
            clearAccessibilityFocus(i9);
        }
        this.mAccessibilityFocusedVirtualViewId = i8;
        this.mHost.invalidate();
        sendEventForVirtualView(i8, 32768);
        return true;
    }

    private void updateHoveredVirtualView(int i8) {
        int i9 = this.mHoveredVirtualViewId;
        if (i9 == i8) {
            return;
        }
        this.mHoveredVirtualViewId = i8;
        sendEventForVirtualView(i8, 128);
        sendEventForVirtualView(i9, 256);
    }

    public final boolean clearKeyboardFocusForVirtualView(int i8) {
        if (this.mKeyboardFocusedVirtualViewId != i8) {
            return false;
        }
        this.mKeyboardFocusedVirtualViewId = Integer.MIN_VALUE;
        onVirtualViewKeyboardFocusChanged(i8, false);
        sendEventForVirtualView(i8, 8);
        return true;
    }

    public final boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent) {
        if (!this.mManager.isEnabled() || !this.mManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7 && action != 9) {
            if (action != 10 || this.mHoveredVirtualViewId == Integer.MIN_VALUE) {
                return false;
            }
            updateHoveredVirtualView(Integer.MIN_VALUE);
            return true;
        }
        int virtualViewAt = getVirtualViewAt(motionEvent.getX(), motionEvent.getY());
        updateHoveredVirtualView(virtualViewAt);
        if (virtualViewAt == Integer.MIN_VALUE) {
            return false;
        }
        return true;
    }

    public final boolean dispatchKeyEvent(@NonNull KeyEvent keyEvent) {
        int i8 = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 61) {
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (!keyEvent.hasNoModifiers()) {
                            return false;
                        }
                        int keyToDirection = keyToDirection(keyCode);
                        int repeatCount = keyEvent.getRepeatCount() + 1;
                        boolean z8 = false;
                        while (i8 < repeatCount && moveFocus(keyToDirection, null)) {
                            i8++;
                            z8 = true;
                        }
                        return z8;
                    case 23:
                        break;
                    default:
                        return false;
                }
            }
            if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
                return false;
            }
            clickKeyboardFocusedVirtualView();
            return true;
        }
        if (keyEvent.hasNoModifiers()) {
            return moveFocus(2, null);
        }
        if (!keyEvent.hasModifiers(1)) {
            return false;
        }
        return moveFocus(1, null);
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.mAccessibilityFocusedVirtualViewId;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view) {
        if (this.mNodeProvider == null) {
            this.mNodeProvider = new MyNodeProvider();
        }
        return this.mNodeProvider;
    }

    @Deprecated
    public int getFocusedVirtualView() {
        return getAccessibilityFocusedVirtualViewId();
    }

    public final int getKeyboardFocusedVirtualViewId() {
        return this.mKeyboardFocusedVirtualViewId;
    }

    protected abstract int getVirtualViewAt(float f8, float f9);

    protected abstract void getVisibleVirtualViews(List<Integer> list);

    public final void invalidateRoot() {
        invalidateVirtualView(-1, 1);
    }

    public final void invalidateVirtualView(int i8) {
        invalidateVirtualView(i8, 0);
    }

    @NonNull
    AccessibilityNodeInfoCompat obtainAccessibilityNodeInfo(int i8) {
        if (i8 == -1) {
            return createNodeForHost();
        }
        return createNodeForChild(i8);
    }

    public final void onFocusChanged(boolean z8, int i8, @Nullable Rect rect) {
        int i9 = this.mKeyboardFocusedVirtualViewId;
        if (i9 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i9);
        }
        if (z8) {
            moveFocus(i8, rect);
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        onPopulateEventForHost(accessibilityEvent);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        onPopulateNodeForHost(accessibilityNodeInfoCompat);
    }

    protected abstract boolean onPerformActionForVirtualView(int i8, int i9, @Nullable Bundle bundle);

    protected void onPopulateEventForHost(@NonNull AccessibilityEvent accessibilityEvent) {
    }

    protected void onPopulateEventForVirtualView(int i8, @NonNull AccessibilityEvent accessibilityEvent) {
    }

    protected void onPopulateNodeForHost(@NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
    }

    protected abstract void onPopulateNodeForVirtualView(int i8, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat);

    protected void onVirtualViewKeyboardFocusChanged(int i8, boolean z8) {
    }

    boolean performAction(int i8, int i9, Bundle bundle) {
        if (i8 != -1) {
            return performActionForChild(i8, i9, bundle);
        }
        return performActionForHost(i9, bundle);
    }

    public final boolean requestKeyboardFocusForVirtualView(int i8) {
        int i9;
        if ((!this.mHost.isFocused() && !this.mHost.requestFocus()) || (i9 = this.mKeyboardFocusedVirtualViewId) == i8) {
            return false;
        }
        if (i9 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i9);
        }
        if (i8 == Integer.MIN_VALUE) {
            return false;
        }
        this.mKeyboardFocusedVirtualViewId = i8;
        onVirtualViewKeyboardFocusChanged(i8, true);
        sendEventForVirtualView(i8, 8);
        return true;
    }

    public final boolean sendEventForVirtualView(int i8, int i9) {
        ViewParent parent;
        if (i8 == Integer.MIN_VALUE || !this.mManager.isEnabled() || (parent = this.mHost.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.mHost, createEvent(i8, i9));
    }

    public final void invalidateVirtualView(int i8, int i9) {
        ViewParent parent;
        if (i8 == Integer.MIN_VALUE || !this.mManager.isEnabled() || (parent = this.mHost.getParent()) == null) {
            return;
        }
        AccessibilityEvent createEvent = createEvent(i8, 2048);
        AccessibilityEventCompat.setContentChangeTypes(createEvent, i9);
        parent.requestSendAccessibilityEvent(this.mHost, createEvent);
    }
}
