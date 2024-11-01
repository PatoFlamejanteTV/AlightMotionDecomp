package com.google.android.material.bottomsheet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.BackEventCompat;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.ViewDragHelper;
import com.google.android.material.R;
import com.google.android.material.color.utilities.Contrast;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.motion.MaterialBottomContainerBackHelper;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> implements MaterialBackHandler {
    private static final int CORNER_ANIMATION_DURATION = 500;

    @VisibleForTesting
    static final int DEFAULT_SIGNIFICANT_VEL_THRESHOLD = 500;
    private static final int DEF_STYLE_RES = R.style.Widget_Design_BottomSheet_Modal;
    private static final float HIDE_FRICTION = 0.1f;
    private static final float HIDE_THRESHOLD = 0.5f;
    private static final int INVALID_POSITION = -1;
    private static final int NO_MAX_SIZE = -1;
    public static final int PEEK_HEIGHT_AUTO = -1;
    public static final int SAVE_ALL = -1;
    public static final int SAVE_FIT_TO_CONTENTS = 2;
    public static final int SAVE_HIDEABLE = 4;
    public static final int SAVE_NONE = 0;
    public static final int SAVE_PEEK_HEIGHT = 1;
    public static final int SAVE_SKIP_COLLAPSED = 8;
    public static final int STATE_COLLAPSED = 4;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_EXPANDED = 3;
    public static final int STATE_HALF_EXPANDED = 6;
    public static final int STATE_HIDDEN = 5;
    public static final int STATE_SETTLING = 2;
    private static final String TAG = "BottomSheetBehavior";

    @VisibleForTesting
    static final int VIEW_INDEX_ACCESSIBILITY_DELEGATE_VIEW = 1;
    private static final int VIEW_INDEX_BOTTOM_SHEET = 0;

    @Nullable
    WeakReference<View> accessibilityDelegateViewRef;
    int activePointerId;

    @Nullable
    private ColorStateList backgroundTint;

    @Nullable
    MaterialBottomContainerBackHelper bottomContainerBackHelper;

    @NonNull
    private final ArrayList<BottomSheetCallback> callbacks;
    private int childHeight;
    int collapsedOffset;
    private final ViewDragHelper.Callback dragCallback;
    private boolean draggable;
    float elevation;

    @VisibleForTesting
    final SparseIntArray expandHalfwayActionIds;
    private boolean expandedCornersRemoved;
    int expandedOffset;
    private boolean fitToContents;
    int fitToContentsOffset;
    private int gestureInsetBottom;
    private boolean gestureInsetBottomIgnored;
    int halfExpandedOffset;
    float halfExpandedRatio;
    private float hideFriction;
    boolean hideable;
    private boolean ignoreEvents;

    @Nullable
    private Map<View, Integer> importantForAccessibilityMap;
    private int initialY;
    private int insetBottom;
    private int insetTop;

    @Nullable
    private ValueAnimator interpolatorAnimator;
    private int lastNestedScrollDy;
    int lastStableState;
    private boolean marginLeftSystemWindowInsets;
    private boolean marginRightSystemWindowInsets;
    private boolean marginTopSystemWindowInsets;
    private MaterialShapeDrawable materialShapeDrawable;
    private int maxHeight;
    private int maxWidth;
    private float maximumVelocity;
    private boolean nestedScrolled;

    @Nullable
    WeakReference<View> nestedScrollingChildRef;
    private boolean paddingBottomSystemWindowInsets;
    private boolean paddingLeftSystemWindowInsets;
    private boolean paddingRightSystemWindowInsets;
    private boolean paddingTopSystemWindowInsets;
    int parentHeight;
    int parentWidth;
    private int peekHeight;
    private boolean peekHeightAuto;
    private int peekHeightGestureInsetBuffer;
    private int peekHeightMin;
    private int saveFlags;
    private ShapeAppearanceModel shapeAppearanceModelDefault;
    private boolean shouldRemoveExpandedCorners;
    private int significantVelocityThreshold;
    private boolean skipCollapsed;
    int state;
    private final BottomSheetBehavior<V>.StateSettlingTracker stateSettlingTracker;
    boolean touchingScrollingChild;
    private boolean updateImportantForAccessibilityOnSiblings;

    @Nullable
    private VelocityTracker velocityTracker;

    @Nullable
    ViewDragHelper viewDragHelper;

    @Nullable
    WeakReference<V> viewRef;

    /* loaded from: classes3.dex */
    public static abstract class BottomSheetCallback {
        void onLayout(@NonNull View view) {
        }

        public abstract void onSlide(@NonNull View view, float f8);

        public abstract void onStateChanged(@NonNull View view, int i8);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes3.dex */
    public @interface SaveFlags {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes3.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState.1
            @Override // android.os.Parcelable.Creator
            @NonNull
            public SavedState[] newArray(int i8) {
                return new SavedState[i8];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @Nullable
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }
        };
        boolean fitToContents;
        boolean hideable;
        int peekHeight;
        boolean skipCollapsed;
        final int state;

        public SavedState(@NonNull Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeInt(this.state);
            parcel.writeInt(this.peekHeight);
            parcel.writeInt(this.fitToContents ? 1 : 0);
            parcel.writeInt(this.hideable ? 1 : 0);
            parcel.writeInt(this.skipCollapsed ? 1 : 0);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.state = parcel.readInt();
            this.peekHeight = parcel.readInt();
            this.fitToContents = parcel.readInt() == 1;
            this.hideable = parcel.readInt() == 1;
            this.skipCollapsed = parcel.readInt() == 1;
        }

        public SavedState(Parcelable parcelable, @NonNull BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.state = bottomSheetBehavior.state;
            this.peekHeight = ((BottomSheetBehavior) bottomSheetBehavior).peekHeight;
            this.fitToContents = ((BottomSheetBehavior) bottomSheetBehavior).fitToContents;
            this.hideable = bottomSheetBehavior.hideable;
            this.skipCollapsed = ((BottomSheetBehavior) bottomSheetBehavior).skipCollapsed;
        }

        @Deprecated
        public SavedState(Parcelable parcelable, int i8) {
            super(parcelable);
            this.state = i8;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes3.dex */
    public @interface StableState {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes3.dex */
    public @interface State {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class StateSettlingTracker {
        private final Runnable continueSettlingRunnable;
        private boolean isContinueSettlingRunnablePosted;
        private int targetState;

        private StateSettlingTracker() {
            this.continueSettlingRunnable = new Runnable() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.StateSettlingTracker.1
                @Override // java.lang.Runnable
                public void run() {
                    StateSettlingTracker.this.isContinueSettlingRunnablePosted = false;
                    ViewDragHelper viewDragHelper = BottomSheetBehavior.this.viewDragHelper;
                    if (viewDragHelper != null && viewDragHelper.continueSettling(true)) {
                        StateSettlingTracker stateSettlingTracker = StateSettlingTracker.this;
                        stateSettlingTracker.continueSettlingToState(stateSettlingTracker.targetState);
                        return;
                    }
                    StateSettlingTracker stateSettlingTracker2 = StateSettlingTracker.this;
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    if (bottomSheetBehavior.state == 2) {
                        bottomSheetBehavior.setStateInternal(stateSettlingTracker2.targetState);
                    }
                }
            };
        }

        void continueSettlingToState(int i8) {
            WeakReference<V> weakReference = BottomSheetBehavior.this.viewRef;
            if (weakReference != null && weakReference.get() != null) {
                this.targetState = i8;
                if (!this.isContinueSettlingRunnablePosted) {
                    ViewCompat.postOnAnimation(BottomSheetBehavior.this.viewRef.get(), this.continueSettlingRunnable);
                    this.isContinueSettlingRunnablePosted = true;
                }
            }
        }
    }

    public BottomSheetBehavior() {
        this.saveFlags = 0;
        this.fitToContents = true;
        this.updateImportantForAccessibilityOnSiblings = false;
        this.maxWidth = -1;
        this.maxHeight = -1;
        this.stateSettlingTracker = new StateSettlingTracker();
        this.halfExpandedRatio = 0.5f;
        this.elevation = -1.0f;
        this.draggable = true;
        this.state = 4;
        this.lastStableState = 4;
        this.hideFriction = 0.1f;
        this.callbacks = new ArrayList<>();
        this.initialY = -1;
        this.expandHalfwayActionIds = new SparseIntArray();
        this.dragCallback = new ViewDragHelper.Callback() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.5
            private long viewCapturedMillis;

            private boolean releasedLow(@NonNull View view) {
                int top = view.getTop();
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (top > (bottomSheetBehavior.parentHeight + bottomSheetBehavior.getExpandedOffset()) / 2) {
                    return true;
                }
                return false;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionHorizontal(@NonNull View view, int i8, int i9) {
                return view.getLeft();
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionVertical(@NonNull View view, int i8, int i9) {
                return MathUtils.clamp(i8, BottomSheetBehavior.this.getExpandedOffset(), getViewVerticalDragRange(view));
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int getViewVerticalDragRange(@NonNull View view) {
                if (BottomSheetBehavior.this.canBeHiddenByDragging()) {
                    return BottomSheetBehavior.this.parentHeight;
                }
                return BottomSheetBehavior.this.collapsedOffset;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewDragStateChanged(int i8) {
                if (i8 == 1 && BottomSheetBehavior.this.draggable) {
                    BottomSheetBehavior.this.setStateInternal(1);
                }
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewPositionChanged(@NonNull View view, int i8, int i9, int i10, int i11) {
                BottomSheetBehavior.this.dispatchOnSlide(i9);
            }

            /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:            if (r7.this$0.shouldExpandOnUpwardDrag(r3, (r9 * 100.0f) / r10.parentHeight) != false) goto L6;     */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:            if (r9 > r7.this$0.halfExpandedOffset) goto L63;     */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x0091, code lost:            if (java.lang.Math.abs(r8.getTop() - r7.this$0.getExpandedOffset()) < java.lang.Math.abs(r8.getTop() - r7.this$0.halfExpandedOffset)) goto L6;     */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x00d0, code lost:            if (r7.this$0.shouldSkipHalfExpandedStateWhenDragging() == false) goto L63;     */
            /* JADX WARN: Code restructure failed: missing block: B:44:0x00f2, code lost:            if (java.lang.Math.abs(r9 - r7.this$0.fitToContentsOffset) < java.lang.Math.abs(r9 - r7.this$0.collapsedOffset)) goto L6;     */
            /* JADX WARN: Code restructure failed: missing block: B:50:0x010e, code lost:            if (r7.this$0.shouldSkipHalfExpandedStateWhenDragging() != false) goto L39;     */
            /* JADX WARN: Code restructure failed: missing block: B:54:0x0128, code lost:            if (r7.this$0.shouldSkipHalfExpandedStateWhenDragging() == false) goto L63;     */
            @Override // androidx.customview.widget.ViewDragHelper.Callback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onViewReleased(@androidx.annotation.NonNull android.view.View r8, float r9, float r10) {
                /*
                    Method dump skipped, instructions count: 309
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.AnonymousClass5.onViewReleased(android.view.View, float, float):void");
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public boolean tryCaptureView(@NonNull View view, int i8) {
                View view2;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                int i9 = bottomSheetBehavior.state;
                if (i9 == 1 || bottomSheetBehavior.touchingScrollingChild) {
                    return false;
                }
                if (i9 == 3 && bottomSheetBehavior.activePointerId == i8) {
                    WeakReference<View> weakReference = bottomSheetBehavior.nestedScrollingChildRef;
                    if (weakReference != null) {
                        view2 = weakReference.get();
                    } else {
                        view2 = null;
                    }
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                this.viewCapturedMillis = System.currentTimeMillis();
                WeakReference<V> weakReference2 = BottomSheetBehavior.this.viewRef;
                if (weakReference2 == null || weakReference2.get() != view) {
                    return false;
                }
                return true;
            }
        };
    }

    private int addAccessibilityActionForState(View view, @StringRes int i8, int i9) {
        return ViewCompat.addAccessibilityAction(view, view.getResources().getString(i8), createAccessibilityViewCommandForState(i9));
    }

    private void calculateCollapsedOffset() {
        int calculatePeekHeight = calculatePeekHeight();
        if (this.fitToContents) {
            this.collapsedOffset = Math.max(this.parentHeight - calculatePeekHeight, this.fitToContentsOffset);
        } else {
            this.collapsedOffset = this.parentHeight - calculatePeekHeight;
        }
    }

    @RequiresApi(31)
    private float calculateCornerInterpolation(float f8, @Nullable RoundedCorner roundedCorner) {
        int radius;
        if (roundedCorner != null) {
            radius = roundedCorner.getRadius();
            float f9 = radius;
            if (f9 > 0.0f && f8 > 0.0f) {
                return f9 / f8;
            }
        }
        return 0.0f;
    }

    private void calculateHalfExpandedOffset() {
        this.halfExpandedOffset = (int) (this.parentHeight * (1.0f - this.halfExpandedRatio));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:            r0 = r0.getRootWindowInsets();     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private float calculateInterpolationWithCornersRemoved() {
        /*
            r4 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r4.materialShapeDrawable
            if (r0 == 0) goto L4b
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r4.viewRef
            if (r0 == 0) goto L4b
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L4b
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L4b
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r4.viewRef
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            boolean r1 = r4.isAtTopOfScreen()
            if (r1 == 0) goto L4b
            android.view.WindowInsets r0 = com.google.android.material.bottomsheet.a.a(r0)
            if (r0 == 0) goto L4b
            com.google.android.material.shape.MaterialShapeDrawable r1 = r4.materialShapeDrawable
            float r1 = r1.getTopLeftCornerResolvedSize()
            r2 = 0
            android.view.RoundedCorner r2 = com.google.android.material.bottomsheet.b.a(r0, r2)
            float r1 = r4.calculateCornerInterpolation(r1, r2)
            com.google.android.material.shape.MaterialShapeDrawable r2 = r4.materialShapeDrawable
            float r2 = r2.getTopRightCornerResolvedSize()
            r3 = 1
            android.view.RoundedCorner r0 = com.google.android.material.bottomsheet.b.a(r0, r3)
            float r0 = r4.calculateCornerInterpolation(r2, r0)
            float r0 = java.lang.Math.max(r1, r0)
            return r0
        L4b:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.calculateInterpolationWithCornersRemoved():float");
    }

    private int calculatePeekHeight() {
        int i8;
        if (this.peekHeightAuto) {
            return Math.min(Math.max(this.peekHeightMin, this.parentHeight - ((this.parentWidth * 9) / 16)), this.childHeight) + this.insetBottom;
        }
        if (!this.gestureInsetBottomIgnored && !this.paddingBottomSystemWindowInsets && (i8 = this.gestureInsetBottom) > 0) {
            return Math.max(this.peekHeight, i8 + this.peekHeightGestureInsetBuffer);
        }
        return this.peekHeight + this.insetBottom;
    }

    private float calculateSlideOffsetWithTop(int i8) {
        float f8;
        float f9;
        int i9 = this.collapsedOffset;
        if (i8 <= i9 && i9 != getExpandedOffset()) {
            int i10 = this.collapsedOffset;
            f8 = i10 - i8;
            f9 = i10 - getExpandedOffset();
        } else {
            int i11 = this.collapsedOffset;
            f8 = i11 - i8;
            f9 = this.parentHeight - i11;
        }
        return f8 / f9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean canBeHiddenByDragging() {
        if (isHideable() && isHideableWhenDragging()) {
            return true;
        }
        return false;
    }

    private void clearAccessibilityAction(View view, int i8) {
        if (view == null) {
            return;
        }
        ViewCompat.removeAccessibilityAction(view, 524288);
        ViewCompat.removeAccessibilityAction(view, 262144);
        ViewCompat.removeAccessibilityAction(view, 1048576);
        int i9 = this.expandHalfwayActionIds.get(i8, -1);
        if (i9 != -1) {
            ViewCompat.removeAccessibilityAction(view, i9);
            this.expandHalfwayActionIds.delete(i8);
        }
    }

    private AccessibilityViewCommand createAccessibilityViewCommandForState(final int i8) {
        return new AccessibilityViewCommand() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.6
            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
            public boolean perform(@NonNull View view, @Nullable AccessibilityViewCommand.CommandArguments commandArguments) {
                BottomSheetBehavior.this.setState(i8);
                return true;
            }
        };
    }

    private void createMaterialShapeDrawableIfNeeded(@NonNull Context context) {
        if (this.shapeAppearanceModelDefault == null) {
            return;
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.shapeAppearanceModelDefault);
        this.materialShapeDrawable = materialShapeDrawable;
        materialShapeDrawable.initializeElevationOverlay(context);
        ColorStateList colorStateList = this.backgroundTint;
        if (colorStateList != null) {
            this.materialShapeDrawable.setFillColor(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
        this.materialShapeDrawable.setTint(typedValue.data);
    }

    private void createShapeValueAnimator() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(calculateInterpolationWithCornersRemoved(), 1.0f);
        this.interpolatorAnimator = ofFloat;
        ofFloat.setDuration(500L);
        this.interpolatorAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (BottomSheetBehavior.this.materialShapeDrawable != null) {
                    BottomSheetBehavior.this.materialShapeDrawable.setInterpolation(floatValue);
                }
            }
        });
    }

    @NonNull
    public static <V extends View> BottomSheetBehavior<V> from(@NonNull V v8) {
        ViewGroup.LayoutParams layoutParams = v8.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
            if (behavior instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) behavior;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    private int getChildMeasureSpec(int i8, int i9, int i10, int i11) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i8, i9, i11);
        if (i10 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode != 1073741824) {
            if (size != 0) {
                i10 = Math.min(size, i10);
            }
            return View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, i10), 1073741824);
    }

    private int getTopOffsetForState(int i8) {
        if (i8 != 3) {
            if (i8 != 4) {
                if (i8 != 5) {
                    if (i8 == 6) {
                        return this.halfExpandedOffset;
                    }
                    throw new IllegalArgumentException("Invalid state to get top offset: " + i8);
                }
                return this.parentHeight;
            }
            return this.collapsedOffset;
        }
        return getExpandedOffset();
    }

    private float getYVelocity() {
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.maximumVelocity);
        return this.velocityTracker.getYVelocity(this.activePointerId);
    }

    private boolean isAtTopOfScreen() {
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        this.viewRef.get().getLocationOnScreen(iArr);
        if (iArr[1] != 0) {
            return false;
        }
        return true;
    }

    private boolean isExpandedAndShouldRemoveCorners() {
        if (this.state == 3 && (this.shouldRemoveExpandedCorners || isAtTopOfScreen())) {
            return true;
        }
        return false;
    }

    private boolean isLayouting(V v8) {
        ViewParent parent = v8.getParent();
        if (parent != null && parent.isLayoutRequested() && ViewCompat.isAttachedToWindow(v8)) {
            return true;
        }
        return false;
    }

    private void replaceAccessibilityActionForState(View view, AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat, int i8) {
        ViewCompat.replaceAccessibilityAction(view, accessibilityActionCompat, null, createAccessibilityViewCommandForState(i8));
    }

    private void reset() {
        this.activePointerId = -1;
        this.initialY = -1;
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.velocityTracker = null;
        }
    }

    private void restoreOptionalState(@NonNull SavedState savedState) {
        int i8 = this.saveFlags;
        if (i8 == 0) {
            return;
        }
        if (i8 == -1 || (i8 & 1) == 1) {
            this.peekHeight = savedState.peekHeight;
        }
        if (i8 == -1 || (i8 & 2) == 2) {
            this.fitToContents = savedState.fitToContents;
        }
        if (i8 == -1 || (i8 & 4) == 4) {
            this.hideable = savedState.hideable;
        }
        if (i8 == -1 || (i8 & 8) == 8) {
            this.skipCollapsed = savedState.skipCollapsed;
        }
    }

    private void runAfterLayout(V v8, Runnable runnable) {
        if (isLayouting(v8)) {
            v8.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void setWindowInsetsListener(@NonNull View view) {
        final boolean z8;
        if (Build.VERSION.SDK_INT >= 29 && !isGestureInsetBottomIgnored() && !this.peekHeightAuto) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (!this.paddingBottomSystemWindowInsets && !this.paddingLeftSystemWindowInsets && !this.paddingRightSystemWindowInsets && !this.marginLeftSystemWindowInsets && !this.marginRightSystemWindowInsets && !this.marginTopSystemWindowInsets && !z8) {
            return;
        }
        ViewUtils.doOnApplyWindowInsets(view, new ViewUtils.OnApplyWindowInsetsListener() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.4
            /* JADX WARN: Removed duplicated region for block: B:23:0x0089  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x00b4  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public androidx.core.view.WindowInsetsCompat onApplyWindowInsets(android.view.View r11, androidx.core.view.WindowInsetsCompat r12, com.google.android.material.internal.ViewUtils.RelativePadding r13) {
                /*
                    r10 = this;
                    int r0 = androidx.core.view.WindowInsetsCompat.Type.systemBars()
                    androidx.core.graphics.Insets r0 = r12.getInsets(r0)
                    int r1 = androidx.core.view.WindowInsetsCompat.Type.mandatorySystemGestures()
                    androidx.core.graphics.Insets r1 = r12.getInsets(r1)
                    com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                    int r3 = r0.top
                    com.google.android.material.bottomsheet.BottomSheetBehavior.access$302(r2, r3)
                    boolean r2 = com.google.android.material.internal.ViewUtils.isLayoutRtl(r11)
                    int r3 = r11.getPaddingBottom()
                    int r4 = r11.getPaddingLeft()
                    int r5 = r11.getPaddingRight()
                    com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                    boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.access$400(r6)
                    if (r6 == 0) goto L41
                    com.google.android.material.bottomsheet.BottomSheetBehavior r3 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                    int r6 = r12.getSystemWindowInsetBottom()
                    com.google.android.material.bottomsheet.BottomSheetBehavior.access$502(r3, r6)
                    int r3 = r13.bottom
                    com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                    int r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.access$500(r6)
                    int r3 = r3 + r6
                L41:
                    com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                    boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.access$600(r6)
                    if (r6 == 0) goto L53
                    if (r2 == 0) goto L4e
                    int r4 = r13.end
                    goto L50
                L4e:
                    int r4 = r13.start
                L50:
                    int r6 = r0.left
                    int r4 = r4 + r6
                L53:
                    com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                    boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.access$700(r6)
                    if (r6 == 0) goto L66
                    if (r2 == 0) goto L60
                    int r13 = r13.start
                    goto L62
                L60:
                    int r13 = r13.end
                L62:
                    int r2 = r0.right
                    int r5 = r13 + r2
                L66:
                    android.view.ViewGroup$LayoutParams r13 = r11.getLayoutParams()
                    android.view.ViewGroup$MarginLayoutParams r13 = (android.view.ViewGroup.MarginLayoutParams) r13
                    com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                    boolean r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.access$800(r2)
                    r6 = 0
                    r7 = 1
                    if (r2 == 0) goto L80
                    int r2 = r13.leftMargin
                    int r8 = r0.left
                    if (r2 == r8) goto L80
                    r13.leftMargin = r8
                    r2 = 1
                    goto L81
                L80:
                    r2 = 0
                L81:
                    com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                    boolean r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.access$900(r8)
                    if (r8 == 0) goto L92
                    int r8 = r13.rightMargin
                    int r9 = r0.right
                    if (r8 == r9) goto L92
                    r13.rightMargin = r9
                    r2 = 1
                L92:
                    com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                    boolean r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.access$1000(r8)
                    if (r8 == 0) goto La3
                    int r8 = r13.topMargin
                    int r0 = r0.top
                    if (r8 == r0) goto La3
                    r13.topMargin = r0
                    goto La4
                La3:
                    r7 = r2
                La4:
                    if (r7 == 0) goto La9
                    r11.setLayoutParams(r13)
                La9:
                    int r13 = r11.getPaddingTop()
                    r11.setPadding(r4, r13, r5, r3)
                    boolean r11 = r2
                    if (r11 == 0) goto Lbb
                    com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                    int r13 = r1.bottom
                    com.google.android.material.bottomsheet.BottomSheetBehavior.access$1102(r11, r13)
                Lbb:
                    com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                    boolean r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.access$400(r11)
                    if (r11 != 0) goto Lc7
                    boolean r11 = r2
                    if (r11 == 0) goto Lcc
                Lc7:
                    com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                    com.google.android.material.bottomsheet.BottomSheetBehavior.access$1200(r11, r6)
                Lcc:
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.AnonymousClass4.onApplyWindowInsets(android.view.View, androidx.core.view.WindowInsetsCompat, com.google.android.material.internal.ViewUtils$RelativePadding):androidx.core.view.WindowInsetsCompat");
            }
        });
    }

    private boolean shouldHandleDraggingWithHelper() {
        if (this.viewDragHelper != null && (this.draggable || this.state == 1)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSettling(View view, int i8, boolean z8) {
        int topOffsetForState = getTopOffsetForState(i8);
        ViewDragHelper viewDragHelper = this.viewDragHelper;
        if (viewDragHelper != null && (!z8 ? viewDragHelper.smoothSlideViewTo(view, view.getLeft(), topOffsetForState) : viewDragHelper.settleCapturedViewAt(view.getLeft(), topOffsetForState))) {
            setStateInternal(2);
            updateDrawableForTargetState(i8, true);
            this.stateSettlingTracker.continueSettlingToState(i8);
            return;
        }
        setStateInternal(i8);
    }

    private void updateAccessibilityActions() {
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference != null) {
            updateAccessibilityActions(weakReference.get(), 0);
        }
        WeakReference<View> weakReference2 = this.accessibilityDelegateViewRef;
        if (weakReference2 != null) {
            updateAccessibilityActions(weakReference2.get(), 1);
        }
    }

    private void updateDrawableForTargetState(int i8, boolean z8) {
        boolean isExpandedAndShouldRemoveCorners;
        ValueAnimator valueAnimator;
        if (i8 != 2 && this.expandedCornersRemoved != (isExpandedAndShouldRemoveCorners = isExpandedAndShouldRemoveCorners()) && this.materialShapeDrawable != null) {
            this.expandedCornersRemoved = isExpandedAndShouldRemoveCorners;
            float f8 = 1.0f;
            if (z8 && (valueAnimator = this.interpolatorAnimator) != null) {
                if (valueAnimator.isRunning()) {
                    this.interpolatorAnimator.reverse();
                    return;
                }
                float interpolation = this.materialShapeDrawable.getInterpolation();
                if (isExpandedAndShouldRemoveCorners) {
                    f8 = calculateInterpolationWithCornersRemoved();
                }
                this.interpolatorAnimator.setFloatValues(interpolation, f8);
                this.interpolatorAnimator.start();
                return;
            }
            ValueAnimator valueAnimator2 = this.interpolatorAnimator;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.interpolatorAnimator.cancel();
            }
            MaterialShapeDrawable materialShapeDrawable = this.materialShapeDrawable;
            if (this.expandedCornersRemoved) {
                f8 = calculateInterpolationWithCornersRemoved();
            }
            materialShapeDrawable.setInterpolation(f8);
        }
    }

    private void updateImportantForAccessibility(boolean z8) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (!(parent instanceof CoordinatorLayout)) {
            return;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
        int childCount = coordinatorLayout.getChildCount();
        if (z8) {
            if (this.importantForAccessibilityMap == null) {
                this.importantForAccessibilityMap = new HashMap(childCount);
            } else {
                return;
            }
        }
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = coordinatorLayout.getChildAt(i8);
            if (childAt != this.viewRef.get()) {
                if (z8) {
                    this.importantForAccessibilityMap.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    if (this.updateImportantForAccessibilityOnSiblings) {
                        ViewCompat.setImportantForAccessibility(childAt, 4);
                    }
                } else if (this.updateImportantForAccessibilityOnSiblings && (map = this.importantForAccessibilityMap) != null && map.containsKey(childAt)) {
                    ViewCompat.setImportantForAccessibility(childAt, this.importantForAccessibilityMap.get(childAt).intValue());
                }
            }
        }
        if (!z8) {
            this.importantForAccessibilityMap = null;
        } else if (this.updateImportantForAccessibilityOnSiblings) {
            this.viewRef.get().sendAccessibilityEvent(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePeekHeight(boolean z8) {
        V v8;
        if (this.viewRef != null) {
            calculateCollapsedOffset();
            if (this.state == 4 && (v8 = this.viewRef.get()) != null) {
                if (z8) {
                    setState(4);
                } else {
                    v8.requestLayout();
                }
            }
        }
    }

    public void addBottomSheetCallback(@NonNull BottomSheetCallback bottomSheetCallback) {
        if (!this.callbacks.contains(bottomSheetCallback)) {
            this.callbacks.add(bottomSheetCallback);
        }
    }

    public float calculateSlideOffset() {
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference != null && weakReference.get() != null) {
            return calculateSlideOffsetWithTop(this.viewRef.get().getTop());
        }
        return -1.0f;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void cancelBackProgress() {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.bottomContainerBackHelper;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        materialBottomContainerBackHelper.cancelBackProgress();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public void disableShapeAnimations() {
        this.interpolatorAnimator = null;
    }

    void dispatchOnSlide(int i8) {
        V v8 = this.viewRef.get();
        if (v8 != null && !this.callbacks.isEmpty()) {
            float calculateSlideOffsetWithTop = calculateSlideOffsetWithTop(i8);
            for (int i9 = 0; i9 < this.callbacks.size(); i9++) {
                this.callbacks.get(i9).onSlide(v8, calculateSlideOffsetWithTop);
            }
        }
    }

    @Nullable
    @VisibleForTesting
    View findScrollingChild(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (ViewCompat.isNestedScrollingEnabled(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View findScrollingChild = findScrollingChild(viewGroup.getChildAt(i8));
                if (findScrollingChild != null) {
                    return findScrollingChild;
                }
            }
        }
        return null;
    }

    @Nullable
    @VisibleForTesting
    MaterialBottomContainerBackHelper getBackHelper() {
        return this.bottomContainerBackHelper;
    }

    public int getExpandedOffset() {
        int i8;
        if (this.fitToContents) {
            return this.fitToContentsOffset;
        }
        int i9 = this.expandedOffset;
        if (this.paddingTopSystemWindowInsets) {
            i8 = 0;
        } else {
            i8 = this.insetTop;
        }
        return Math.max(i9, i8);
    }

    @FloatRange(from = 0.0d, to = Contrast.RATIO_MIN)
    public float getHalfExpandedRatio() {
        return this.halfExpandedRatio;
    }

    public float getHideFriction() {
        return this.hideFriction;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getLastStableState() {
        return this.lastStableState;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MaterialShapeDrawable getMaterialShapeDrawable() {
        return this.materialShapeDrawable;
    }

    @Px
    public int getMaxHeight() {
        return this.maxHeight;
    }

    @Px
    public int getMaxWidth() {
        return this.maxWidth;
    }

    public int getPeekHeight() {
        if (this.peekHeightAuto) {
            return -1;
        }
        return this.peekHeight;
    }

    @VisibleForTesting
    int getPeekHeightMin() {
        return this.peekHeightMin;
    }

    public int getSaveFlags() {
        return this.saveFlags;
    }

    public int getSignificantVelocityThreshold() {
        return this.significantVelocityThreshold;
    }

    public boolean getSkipCollapsed() {
        return this.skipCollapsed;
    }

    public int getState() {
        return this.state;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void handleBackInvoked() {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.bottomContainerBackHelper;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        BackEventCompat onHandleBackInvoked = materialBottomContainerBackHelper.onHandleBackInvoked();
        int i8 = 4;
        if (onHandleBackInvoked != null && Build.VERSION.SDK_INT >= 34) {
            if (this.hideable) {
                this.bottomContainerBackHelper.finishBackProgressNotPersistent(onHandleBackInvoked, new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.2
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        BottomSheetBehavior.this.setStateInternal(5);
                        WeakReference<V> weakReference = BottomSheetBehavior.this.viewRef;
                        if (weakReference != null && weakReference.get() != null) {
                            BottomSheetBehavior.this.viewRef.get().requestLayout();
                        }
                    }
                });
                return;
            } else {
                this.bottomContainerBackHelper.finishBackProgressPersistent(onHandleBackInvoked, null);
                setState(4);
                return;
            }
        }
        if (this.hideable) {
            i8 = 5;
        }
        setState(i8);
    }

    public boolean isDraggable() {
        return this.draggable;
    }

    public boolean isFitToContents() {
        return this.fitToContents;
    }

    public boolean isGestureInsetBottomIgnored() {
        return this.gestureInsetBottomIgnored;
    }

    public boolean isHideable() {
        return this.hideable;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isHideableWhenDragging() {
        return true;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isNestedScrollingCheckEnabled() {
        return true;
    }

    public boolean isShouldRemoveExpandedCorners() {
        return this.shouldRemoveExpandedCorners;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onAttachedToLayoutParams(@NonNull CoordinatorLayout.LayoutParams layoutParams) {
        super.onAttachedToLayoutParams(layoutParams);
        this.viewRef = null;
        this.viewDragHelper = null;
        this.bottomContainerBackHelper = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.viewRef = null;
        this.viewDragHelper = null;
        this.bottomContainerBackHelper = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v8, @NonNull MotionEvent motionEvent) {
        boolean z8;
        View view;
        int i8;
        ViewDragHelper viewDragHelper;
        if (v8.isShown() && this.draggable) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                reset();
            }
            if (this.velocityTracker == null) {
                this.velocityTracker = VelocityTracker.obtain();
            }
            this.velocityTracker.addMovement(motionEvent);
            View view2 = null;
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    this.touchingScrollingChild = false;
                    this.activePointerId = -1;
                    if (this.ignoreEvents) {
                        this.ignoreEvents = false;
                        return false;
                    }
                }
            } else {
                int x8 = (int) motionEvent.getX();
                this.initialY = (int) motionEvent.getY();
                if (this.state != 2) {
                    WeakReference<View> weakReference = this.nestedScrollingChildRef;
                    if (weakReference != null) {
                        view = weakReference.get();
                    } else {
                        view = null;
                    }
                    if (view != null && coordinatorLayout.isPointInChildBounds(view, x8, this.initialY)) {
                        this.activePointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.touchingScrollingChild = true;
                    }
                }
                if (this.activePointerId == -1 && !coordinatorLayout.isPointInChildBounds(v8, x8, this.initialY)) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                this.ignoreEvents = z8;
            }
            if (!this.ignoreEvents && (viewDragHelper = this.viewDragHelper) != null && viewDragHelper.shouldInterceptTouchEvent(motionEvent)) {
                return true;
            }
            WeakReference<View> weakReference2 = this.nestedScrollingChildRef;
            if (weakReference2 != null) {
                view2 = weakReference2.get();
            }
            if (actionMasked != 2 || view2 == null || this.ignoreEvents || this.state == 1 || coordinatorLayout.isPointInChildBounds(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.viewDragHelper == null || (i8 = this.initialY) == -1 || Math.abs(i8 - motionEvent.getY()) <= this.viewDragHelper.getTouchSlop()) {
                return false;
            }
            return true;
        }
        this.ignoreEvents = true;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v8, int i8) {
        if (ViewCompat.getFitsSystemWindows(coordinatorLayout) && !ViewCompat.getFitsSystemWindows(v8)) {
            v8.setFitsSystemWindows(true);
        }
        if (this.viewRef == null) {
            this.peekHeightMin = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            setWindowInsetsListener(v8);
            ViewCompat.setWindowInsetsAnimationCallback(v8, new InsetsAnimationCallback(v8));
            this.viewRef = new WeakReference<>(v8);
            this.bottomContainerBackHelper = new MaterialBottomContainerBackHelper(v8);
            MaterialShapeDrawable materialShapeDrawable = this.materialShapeDrawable;
            if (materialShapeDrawable != null) {
                ViewCompat.setBackground(v8, materialShapeDrawable);
                MaterialShapeDrawable materialShapeDrawable2 = this.materialShapeDrawable;
                float f8 = this.elevation;
                if (f8 == -1.0f) {
                    f8 = ViewCompat.getElevation(v8);
                }
                materialShapeDrawable2.setElevation(f8);
            } else {
                ColorStateList colorStateList = this.backgroundTint;
                if (colorStateList != null) {
                    ViewCompat.setBackgroundTintList(v8, colorStateList);
                }
            }
            updateAccessibilityActions();
            if (ViewCompat.getImportantForAccessibility(v8) == 0) {
                ViewCompat.setImportantForAccessibility(v8, 1);
            }
        }
        if (this.viewDragHelper == null) {
            this.viewDragHelper = ViewDragHelper.create(coordinatorLayout, this.dragCallback);
        }
        int top = v8.getTop();
        coordinatorLayout.onLayoutChild(v8, i8);
        this.parentWidth = coordinatorLayout.getWidth();
        this.parentHeight = coordinatorLayout.getHeight();
        int height = v8.getHeight();
        this.childHeight = height;
        int i9 = this.parentHeight;
        int i10 = i9 - height;
        int i11 = this.insetTop;
        if (i10 < i11) {
            if (this.paddingTopSystemWindowInsets) {
                int i12 = this.maxHeight;
                if (i12 != -1) {
                    i9 = Math.min(i9, i12);
                }
                this.childHeight = i9;
            } else {
                int i13 = i9 - i11;
                int i14 = this.maxHeight;
                if (i14 != -1) {
                    i13 = Math.min(i13, i14);
                }
                this.childHeight = i13;
            }
        }
        this.fitToContentsOffset = Math.max(0, this.parentHeight - this.childHeight);
        calculateHalfExpandedOffset();
        calculateCollapsedOffset();
        int i15 = this.state;
        if (i15 == 3) {
            ViewCompat.offsetTopAndBottom(v8, getExpandedOffset());
        } else if (i15 == 6) {
            ViewCompat.offsetTopAndBottom(v8, this.halfExpandedOffset);
        } else if (this.hideable && i15 == 5) {
            ViewCompat.offsetTopAndBottom(v8, this.parentHeight);
        } else if (i15 == 4) {
            ViewCompat.offsetTopAndBottom(v8, this.collapsedOffset);
        } else if (i15 == 1 || i15 == 2) {
            ViewCompat.offsetTopAndBottom(v8, top - v8.getTop());
        }
        updateDrawableForTargetState(this.state, false);
        this.nestedScrollingChildRef = new WeakReference<>(findScrollingChild(v8));
        for (int i16 = 0; i16 < this.callbacks.size(); i16++) {
            this.callbacks.get(i16).onLayout(v8);
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v8, int i8, int i9, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v8.getLayoutParams();
        v8.measure(getChildMeasureSpec(i8, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i9, this.maxWidth, marginLayoutParams.width), getChildMeasureSpec(i10, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i11, this.maxHeight, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onNestedPreFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v8, @NonNull View view, float f8, float f9) {
        WeakReference<View> weakReference;
        if (!isNestedScrollingCheckEnabled() || (weakReference = this.nestedScrollingChildRef) == null || view != weakReference.get()) {
            return false;
        }
        if (this.state == 3 && !super.onNestedPreFling(coordinatorLayout, v8, view, f8, f9)) {
            return false;
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v8, @NonNull View view, int i8, int i9, @NonNull int[] iArr, int i10) {
        View view2;
        if (i10 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.nestedScrollingChildRef;
        if (weakReference != null) {
            view2 = weakReference.get();
        } else {
            view2 = null;
        }
        if (isNestedScrollingCheckEnabled() && view != view2) {
            return;
        }
        int top = v8.getTop();
        int i11 = top - i9;
        if (i9 > 0) {
            if (i11 < getExpandedOffset()) {
                int expandedOffset = top - getExpandedOffset();
                iArr[1] = expandedOffset;
                ViewCompat.offsetTopAndBottom(v8, -expandedOffset);
                setStateInternal(3);
            } else {
                if (!this.draggable) {
                    return;
                }
                iArr[1] = i9;
                ViewCompat.offsetTopAndBottom(v8, -i9);
                setStateInternal(1);
            }
        } else if (i9 < 0 && !view.canScrollVertically(-1)) {
            if (i11 > this.collapsedOffset && !canBeHiddenByDragging()) {
                int i12 = top - this.collapsedOffset;
                iArr[1] = i12;
                ViewCompat.offsetTopAndBottom(v8, -i12);
                setStateInternal(4);
            } else {
                if (!this.draggable) {
                    return;
                }
                iArr[1] = i9;
                ViewCompat.offsetTopAndBottom(v8, -i9);
                setStateInternal(1);
            }
        }
        dispatchOnSlide(v8.getTop());
        this.lastNestedScrollDy = i9;
        this.nestedScrolled = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v8, @NonNull View view, int i8, int i9, int i10, int i11, int i12, @NonNull int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v8, @NonNull Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v8, savedState.getSuperState());
        restoreOptionalState(savedState);
        int i8 = savedState.state;
        if (i8 != 1 && i8 != 2) {
            this.state = i8;
            this.lastStableState = i8;
        } else {
            this.state = 4;
            this.lastStableState = 4;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @NonNull
    public Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v8) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, v8), (BottomSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v8, @NonNull View view, @NonNull View view2, int i8, int i9) {
        this.lastNestedScrollDy = 0;
        this.nestedScrolled = false;
        if ((i8 & 2) == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0035, code lost:            if (r4.getTop() <= r2.halfExpandedOffset) goto L52;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a9, code lost:            r0 = 6;     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0065, code lost:            if (java.lang.Math.abs(r3 - r2.fitToContentsOffset) < java.lang.Math.abs(r3 - r2.collapsedOffset)) goto L52;     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007b, code lost:            if (shouldSkipHalfExpandedStateWhenDragging() != false) goto L48;     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008b, code lost:            if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.collapsedOffset)) goto L51;     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a7, code lost:            if (java.lang.Math.abs(r3 - r2.halfExpandedOffset) < java.lang.Math.abs(r3 - r2.collapsedOffset)) goto L51;     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onStopNestedScroll(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r3, @androidx.annotation.NonNull V r4, @androidx.annotation.NonNull android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.getExpandedOffset()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.setStateInternal(r0)
            return
        Lf:
            boolean r3 = r2.isNestedScrollingCheckEnabled()
            if (r3 == 0) goto L24
            java.lang.ref.WeakReference<android.view.View> r3 = r2.nestedScrollingChildRef
            if (r3 == 0) goto L23
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L23
            boolean r3 = r2.nestedScrolled
            if (r3 != 0) goto L24
        L23:
            return
        L24:
            int r3 = r2.lastNestedScrollDy
            r5 = 6
            if (r3 <= 0) goto L39
            boolean r3 = r2.fitToContents
            if (r3 == 0) goto L2f
            goto Laa
        L2f:
            int r3 = r4.getTop()
            int r6 = r2.halfExpandedOffset
            if (r3 <= r6) goto Laa
            goto La9
        L39:
            boolean r3 = r2.hideable
            if (r3 == 0) goto L49
            float r3 = r2.getYVelocity()
            boolean r3 = r2.shouldHide(r4, r3)
            if (r3 == 0) goto L49
            r0 = 5
            goto Laa
        L49:
            int r3 = r2.lastNestedScrollDy
            r6 = 4
            if (r3 != 0) goto L8e
            int r3 = r4.getTop()
            boolean r1 = r2.fitToContents
            if (r1 == 0) goto L68
            int r5 = r2.fitToContentsOffset
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.collapsedOffset
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L92
            goto Laa
        L68:
            int r1 = r2.halfExpandedOffset
            if (r3 >= r1) goto L7e
            int r1 = r2.collapsedOffset
            int r1 = r3 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r3 >= r1) goto L77
            goto Laa
        L77:
            boolean r3 = r2.shouldSkipHalfExpandedStateWhenDragging()
            if (r3 == 0) goto La9
            goto L92
        L7e:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.collapsedOffset
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
            goto La9
        L8e:
            boolean r3 = r2.fitToContents
            if (r3 == 0) goto L94
        L92:
            r0 = 4
            goto Laa
        L94:
            int r3 = r4.getTop()
            int r0 = r2.halfExpandedOffset
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.collapsedOffset
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
        La9:
            r0 = 6
        Laa:
            r3 = 0
            r2.startSettling(r4, r0, r3)
            r2.nestedScrolled = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.onStopNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v8, @NonNull MotionEvent motionEvent) {
        if (!v8.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.state == 1 && actionMasked == 0) {
            return true;
        }
        if (shouldHandleDraggingWithHelper()) {
            this.viewDragHelper.processTouchEvent(motionEvent);
        }
        if (actionMasked == 0) {
            reset();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (shouldHandleDraggingWithHelper() && actionMasked == 2 && !this.ignoreEvents && Math.abs(this.initialY - motionEvent.getY()) > this.viewDragHelper.getTouchSlop()) {
            this.viewDragHelper.captureChildView(v8, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.ignoreEvents;
    }

    public void removeBottomSheetCallback(@NonNull BottomSheetCallback bottomSheetCallback) {
        this.callbacks.remove(bottomSheetCallback);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setAccessibilityDelegateView(@Nullable View view) {
        WeakReference<View> weakReference;
        if (view == null && (weakReference = this.accessibilityDelegateViewRef) != null) {
            clearAccessibilityAction(weakReference.get(), 1);
            this.accessibilityDelegateViewRef = null;
        } else {
            this.accessibilityDelegateViewRef = new WeakReference<>(view);
            updateAccessibilityActions(view, 1);
        }
    }

    @Deprecated
    public void setBottomSheetCallback(BottomSheetCallback bottomSheetCallback) {
        Log.w(TAG, "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        this.callbacks.clear();
        if (bottomSheetCallback != null) {
            this.callbacks.add(bottomSheetCallback);
        }
    }

    public void setDraggable(boolean z8) {
        this.draggable = z8;
    }

    public void setExpandedOffset(int i8) {
        if (i8 >= 0) {
            this.expandedOffset = i8;
            updateDrawableForTargetState(this.state, true);
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    public void setFitToContents(boolean z8) {
        int i8;
        if (this.fitToContents == z8) {
            return;
        }
        this.fitToContents = z8;
        if (this.viewRef != null) {
            calculateCollapsedOffset();
        }
        if (this.fitToContents && this.state == 6) {
            i8 = 3;
        } else {
            i8 = this.state;
        }
        setStateInternal(i8);
        updateDrawableForTargetState(this.state, true);
        updateAccessibilityActions();
    }

    public void setGestureInsetBottomIgnored(boolean z8) {
        this.gestureInsetBottomIgnored = z8;
    }

    public void setHalfExpandedRatio(@FloatRange(from = 0.0d, fromInclusive = false, to = 1.0d, toInclusive = false) float f8) {
        if (f8 > 0.0f && f8 < 1.0f) {
            this.halfExpandedRatio = f8;
            if (this.viewRef != null) {
                calculateHalfExpandedOffset();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    public void setHideFriction(float f8) {
        this.hideFriction = f8;
    }

    public void setHideable(boolean z8) {
        if (this.hideable != z8) {
            this.hideable = z8;
            if (!z8 && this.state == 5) {
                setState(4);
            }
            updateAccessibilityActions();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setHideableInternal(boolean z8) {
        this.hideable = z8;
    }

    public void setMaxHeight(@Px int i8) {
        this.maxHeight = i8;
    }

    public void setMaxWidth(@Px int i8) {
        this.maxWidth = i8;
    }

    public void setPeekHeight(int i8) {
        setPeekHeight(i8, false);
    }

    public void setSaveFlags(int i8) {
        this.saveFlags = i8;
    }

    public void setShouldRemoveExpandedCorners(boolean z8) {
        if (this.shouldRemoveExpandedCorners != z8) {
            this.shouldRemoveExpandedCorners = z8;
            updateDrawableForTargetState(getState(), true);
        }
    }

    public void setSignificantVelocityThreshold(int i8) {
        this.significantVelocityThreshold = i8;
    }

    public void setSkipCollapsed(boolean z8) {
        this.skipCollapsed = z8;
    }

    public void setState(int i8) {
        String str;
        final int i9;
        if (i8 != 1 && i8 != 2) {
            if (!this.hideable && i8 == 5) {
                Log.w(TAG, "Cannot set state: " + i8);
                return;
            }
            if (i8 == 6 && this.fitToContents && getTopOffsetForState(i8) <= this.fitToContentsOffset) {
                i9 = 3;
            } else {
                i9 = i8;
            }
            WeakReference<V> weakReference = this.viewRef;
            if (weakReference != null && weakReference.get() != null) {
                final V v8 = this.viewRef.get();
                runAfterLayout(v8, new Runnable() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.1
                    @Override // java.lang.Runnable
                    public void run() {
                        BottomSheetBehavior.this.startSettling(v8, i9, false);
                    }
                });
                return;
            } else {
                setStateInternal(i8);
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("STATE_");
        if (i8 == 1) {
            str = "DRAGGING";
        } else {
            str = "SETTLING";
        }
        sb.append(str);
        sb.append(" should not be set externally.");
        throw new IllegalArgumentException(sb.toString());
    }

    void setStateInternal(int i8) {
        V v8;
        if (this.state == i8) {
            return;
        }
        this.state = i8;
        if (i8 == 4 || i8 == 3 || i8 == 6 || (this.hideable && i8 == 5)) {
            this.lastStableState = i8;
        }
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || (v8 = weakReference.get()) == null) {
            return;
        }
        if (i8 == 3) {
            updateImportantForAccessibility(true);
        } else if (i8 == 6 || i8 == 5 || i8 == 4) {
            updateImportantForAccessibility(false);
        }
        updateDrawableForTargetState(i8, true);
        for (int i9 = 0; i9 < this.callbacks.size(); i9++) {
            this.callbacks.get(i9).onStateChanged(v8, i8);
        }
        updateAccessibilityActions();
    }

    public void setUpdateImportantForAccessibilityOnSiblings(boolean z8) {
        this.updateImportantForAccessibilityOnSiblings = z8;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean shouldExpandOnUpwardDrag(long j8, @FloatRange(from = 0.0d, to = 100.0d) float f8) {
        return false;
    }

    boolean shouldHide(@NonNull View view, float f8) {
        if (this.skipCollapsed) {
            return true;
        }
        if (!isHideableWhenDragging() || view.getTop() < this.collapsedOffset) {
            return false;
        }
        if (Math.abs((view.getTop() + (f8 * this.hideFriction)) - this.collapsedOffset) / calculatePeekHeight() > 0.5f) {
            return true;
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean shouldSkipHalfExpandedStateWhenDragging() {
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean shouldSkipSmoothAnimation() {
        return true;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void startBackProgress(@NonNull BackEventCompat backEventCompat) {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.bottomContainerBackHelper;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        materialBottomContainerBackHelper.startBackProgress(backEventCompat);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void updateBackProgress(@NonNull BackEventCompat backEventCompat) {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.bottomContainerBackHelper;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        materialBottomContainerBackHelper.updateBackProgress(backEventCompat);
    }

    public final void setPeekHeight(int i8, boolean z8) {
        if (i8 == -1) {
            if (this.peekHeightAuto) {
                return;
            } else {
                this.peekHeightAuto = true;
            }
        } else {
            if (!this.peekHeightAuto && this.peekHeight == i8) {
                return;
            }
            this.peekHeightAuto = false;
            this.peekHeight = Math.max(0, i8);
        }
        updatePeekHeight(z8);
    }

    private void updateAccessibilityActions(View view, int i8) {
        if (view == null) {
            return;
        }
        clearAccessibilityAction(view, i8);
        if (!this.fitToContents && this.state != 6) {
            this.expandHalfwayActionIds.put(i8, addAccessibilityActionForState(view, R.string.bottomsheet_action_expand_halfway, 6));
        }
        if (this.hideable && isHideableWhenDragging() && this.state != 5) {
            replaceAccessibilityActionForState(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS, 5);
        }
        int i9 = this.state;
        if (i9 == 3) {
            replaceAccessibilityActionForState(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_COLLAPSE, this.fitToContents ? 4 : 6);
            return;
        }
        if (i9 == 4) {
            replaceAccessibilityActionForState(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_EXPAND, this.fitToContents ? 3 : 6);
        } else {
            if (i9 != 6) {
                return;
            }
            replaceAccessibilityActionForState(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_COLLAPSE, 4);
            replaceAccessibilityActionForState(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_EXPAND, 3);
        }
    }

    public BottomSheetBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        int i8;
        this.saveFlags = 0;
        this.fitToContents = true;
        this.updateImportantForAccessibilityOnSiblings = false;
        this.maxWidth = -1;
        this.maxHeight = -1;
        this.stateSettlingTracker = new StateSettlingTracker();
        this.halfExpandedRatio = 0.5f;
        this.elevation = -1.0f;
        this.draggable = true;
        this.state = 4;
        this.lastStableState = 4;
        this.hideFriction = 0.1f;
        this.callbacks = new ArrayList<>();
        this.initialY = -1;
        this.expandHalfwayActionIds = new SparseIntArray();
        this.dragCallback = new ViewDragHelper.Callback() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.5
            private long viewCapturedMillis;

            private boolean releasedLow(@NonNull View view) {
                int top = view.getTop();
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (top > (bottomSheetBehavior.parentHeight + bottomSheetBehavior.getExpandedOffset()) / 2) {
                    return true;
                }
                return false;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionHorizontal(@NonNull View view, int i82, int i9) {
                return view.getLeft();
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionVertical(@NonNull View view, int i82, int i9) {
                return MathUtils.clamp(i82, BottomSheetBehavior.this.getExpandedOffset(), getViewVerticalDragRange(view));
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int getViewVerticalDragRange(@NonNull View view) {
                if (BottomSheetBehavior.this.canBeHiddenByDragging()) {
                    return BottomSheetBehavior.this.parentHeight;
                }
                return BottomSheetBehavior.this.collapsedOffset;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewDragStateChanged(int i82) {
                if (i82 == 1 && BottomSheetBehavior.this.draggable) {
                    BottomSheetBehavior.this.setStateInternal(1);
                }
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewPositionChanged(@NonNull View view, int i82, int i9, int i10, int i11) {
                BottomSheetBehavior.this.dispatchOnSlide(i9);
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewReleased(@NonNull View view, float f8, float f9) {
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                    	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                    	at java.base/java.util.ArrayList.forEach(Unknown Source)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                    */
                /*
                    Method dump skipped, instructions count: 309
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.AnonymousClass5.onViewReleased(android.view.View, float, float):void");
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public boolean tryCaptureView(@NonNull View view, int i82) {
                View view2;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                int i9 = bottomSheetBehavior.state;
                if (i9 == 1 || bottomSheetBehavior.touchingScrollingChild) {
                    return false;
                }
                if (i9 == 3 && bottomSheetBehavior.activePointerId == i82) {
                    WeakReference<View> weakReference = bottomSheetBehavior.nestedScrollingChildRef;
                    if (weakReference != null) {
                        view2 = weakReference.get();
                    } else {
                        view2 = null;
                    }
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                this.viewCapturedMillis = System.currentTimeMillis();
                WeakReference<V> weakReference2 = BottomSheetBehavior.this.viewRef;
                if (weakReference2 == null || weakReference2.get() != view) {
                    return false;
                }
                return true;
            }
        };
        this.peekHeightGestureInsetBuffer = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.BottomSheetBehavior_Layout);
        int i9 = R.styleable.BottomSheetBehavior_Layout_backgroundTint;
        if (obtainStyledAttributes.hasValue(i9)) {
            this.backgroundTint = MaterialResources.getColorStateList(context, obtainStyledAttributes, i9);
        }
        if (obtainStyledAttributes.hasValue(R.styleable.BottomSheetBehavior_Layout_shapeAppearance)) {
            this.shapeAppearanceModelDefault = ShapeAppearanceModel.builder(context, attributeSet, R.attr.bottomSheetStyle, DEF_STYLE_RES).build();
        }
        createMaterialShapeDrawableIfNeeded(context);
        createShapeValueAnimator();
        this.elevation = obtainStyledAttributes.getDimension(R.styleable.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        int i10 = R.styleable.BottomSheetBehavior_Layout_android_maxWidth;
        if (obtainStyledAttributes.hasValue(i10)) {
            setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(i10, -1));
        }
        int i11 = R.styleable.BottomSheetBehavior_Layout_android_maxHeight;
        if (obtainStyledAttributes.hasValue(i11)) {
            setMaxHeight(obtainStyledAttributes.getDimensionPixelSize(i11, -1));
        }
        int i12 = R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight;
        TypedValue peekValue = obtainStyledAttributes.peekValue(i12);
        if (peekValue != null && (i8 = peekValue.data) == -1) {
            setPeekHeight(i8);
        } else {
            setPeekHeight(obtainStyledAttributes.getDimensionPixelSize(i12, -1));
        }
        setHideable(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_hideable, false));
        setGestureInsetBottomIgnored(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false));
        setFitToContents(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        setSkipCollapsed(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        setDraggable(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_draggable, true));
        setSaveFlags(obtainStyledAttributes.getInt(R.styleable.BottomSheetBehavior_Layout_behavior_saveFlags, 0));
        setHalfExpandedRatio(obtainStyledAttributes.getFloat(R.styleable.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f));
        int i13 = R.styleable.BottomSheetBehavior_Layout_behavior_expandedOffset;
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(i13);
        if (peekValue2 != null && peekValue2.type == 16) {
            setExpandedOffset(peekValue2.data);
        } else {
            setExpandedOffset(obtainStyledAttributes.getDimensionPixelOffset(i13, 0));
        }
        setSignificantVelocityThreshold(obtainStyledAttributes.getInt(R.styleable.BottomSheetBehavior_Layout_behavior_significantVelocityThreshold, 500));
        this.paddingBottomSystemWindowInsets = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingBottomSystemWindowInsets, false);
        this.paddingLeftSystemWindowInsets = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingLeftSystemWindowInsets, false);
        this.paddingRightSystemWindowInsets = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingRightSystemWindowInsets, false);
        this.paddingTopSystemWindowInsets = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingTopSystemWindowInsets, true);
        this.marginLeftSystemWindowInsets = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_marginLeftSystemWindowInsets, false);
        this.marginRightSystemWindowInsets = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_marginRightSystemWindowInsets, false);
        this.marginTopSystemWindowInsets = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_marginTopSystemWindowInsets, false);
        this.shouldRemoveExpandedCorners = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_shouldRemoveExpandedCorners, true);
        obtainStyledAttributes.recycle();
        this.maximumVelocity = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
