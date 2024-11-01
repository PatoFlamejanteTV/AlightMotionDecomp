package com.google.android.material.sidesheet;

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
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.BackEventCompat;
import androidx.annotation.GravityInt;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.ViewDragHelper;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MaterialSideContainerBackHelper;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> implements Sheet<SideSheetCallback> {
    private static final int DEFAULT_ACCESSIBILITY_PANE_TITLE = R.string.side_sheet_accessibility_pane_title;
    private static final int DEF_STYLE_RES = R.style.Widget_Material3_SideSheet;
    private static final float HIDE_FRICTION = 0.1f;
    private static final float HIDE_THRESHOLD = 0.5f;
    private static final int NO_MAX_SIZE = -1;
    static final int SIGNIFICANT_VEL_THRESHOLD = 500;

    @Nullable
    private ColorStateList backgroundTint;

    @NonNull
    private final Set<SideSheetCallback> callbacks;
    private int childWidth;

    @IdRes
    private int coplanarSiblingViewId;

    @Nullable
    private WeakReference<View> coplanarSiblingViewRef;
    private final ViewDragHelper.Callback dragCallback;
    private boolean draggable;
    private float elevation;
    private float hideFriction;
    private boolean ignoreEvents;
    private int initialX;
    private int innerMargin;
    private int lastStableState;

    @Nullable
    private MaterialShapeDrawable materialShapeDrawable;
    private float maximumVelocity;
    private int parentInnerEdge;
    private int parentWidth;
    private ShapeAppearanceModel shapeAppearanceModel;
    private SheetDelegate sheetDelegate;

    @Nullable
    private MaterialSideContainerBackHelper sideContainerBackHelper;
    private int state;
    private final SideSheetBehavior<V>.StateSettlingTracker stateSettlingTracker;

    @Nullable
    private VelocityTracker velocityTracker;

    @Nullable
    private ViewDragHelper viewDragHelper;

    @Nullable
    private WeakReference<V> viewRef;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes3.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.sidesheet.SideSheetBehavior.SavedState.1
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
        final int state;

        public SavedState(@NonNull Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeInt(this.state);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.state = parcel.readInt();
        }

        public SavedState(Parcelable parcelable, @NonNull SideSheetBehavior<?> sideSheetBehavior) {
            super(parcelable);
            this.state = ((SideSheetBehavior) sideSheetBehavior).state;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class StateSettlingTracker {
        private final Runnable continueSettlingRunnable = new Runnable() { // from class: com.google.android.material.sidesheet.e
            @Override // java.lang.Runnable
            public final void run() {
                SideSheetBehavior.StateSettlingTracker.this.lambda$new$0();
            }
        };
        private boolean isContinueSettlingRunnablePosted;
        private int targetState;

        StateSettlingTracker() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0() {
            this.isContinueSettlingRunnablePosted = false;
            if (SideSheetBehavior.this.viewDragHelper != null && SideSheetBehavior.this.viewDragHelper.continueSettling(true)) {
                continueSettlingToState(this.targetState);
            } else if (SideSheetBehavior.this.state == 2) {
                SideSheetBehavior.this.setStateInternal(this.targetState);
            }
        }

        void continueSettlingToState(int i8) {
            if (SideSheetBehavior.this.viewRef != null && SideSheetBehavior.this.viewRef.get() != null) {
                this.targetState = i8;
                if (!this.isContinueSettlingRunnablePosted) {
                    ViewCompat.postOnAnimation((View) SideSheetBehavior.this.viewRef.get(), this.continueSettlingRunnable);
                    this.isContinueSettlingRunnablePosted = true;
                }
            }
        }
    }

    public SideSheetBehavior() {
        this.stateSettlingTracker = new StateSettlingTracker();
        this.draggable = true;
        this.state = 5;
        this.lastStableState = 5;
        this.hideFriction = 0.1f;
        this.coplanarSiblingViewId = -1;
        this.callbacks = new LinkedHashSet();
        this.dragCallback = new ViewDragHelper.Callback() { // from class: com.google.android.material.sidesheet.SideSheetBehavior.1
            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionHorizontal(@NonNull View view, int i8, int i9) {
                return MathUtils.clamp(i8, SideSheetBehavior.this.sheetDelegate.getMinViewPositionHorizontal(), SideSheetBehavior.this.sheetDelegate.getMaxViewPositionHorizontal());
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionVertical(@NonNull View view, int i8, int i9) {
                return view.getTop();
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int getViewHorizontalDragRange(@NonNull View view) {
                return SideSheetBehavior.this.childWidth + SideSheetBehavior.this.getInnerMargin();
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewDragStateChanged(int i8) {
                if (i8 == 1 && SideSheetBehavior.this.draggable) {
                    SideSheetBehavior.this.setStateInternal(1);
                }
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewPositionChanged(@NonNull View view, int i8, int i9, int i10, int i11) {
                ViewGroup.MarginLayoutParams marginLayoutParams;
                View coplanarSiblingView = SideSheetBehavior.this.getCoplanarSiblingView();
                if (coplanarSiblingView != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) coplanarSiblingView.getLayoutParams()) != null) {
                    SideSheetBehavior.this.sheetDelegate.updateCoplanarSiblingLayoutParams(marginLayoutParams, view.getLeft(), view.getRight());
                    coplanarSiblingView.setLayoutParams(marginLayoutParams);
                }
                SideSheetBehavior.this.dispatchOnSlide(view, i8);
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewReleased(@NonNull View view, float f8, float f9) {
                int calculateTargetStateOnViewReleased = SideSheetBehavior.this.calculateTargetStateOnViewReleased(view, f8, f9);
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                sideSheetBehavior.startSettling(view, calculateTargetStateOnViewReleased, sideSheetBehavior.shouldSkipSmoothAnimation());
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public boolean tryCaptureView(@NonNull View view, int i8) {
                if (SideSheetBehavior.this.state == 1 || SideSheetBehavior.this.viewRef == null || SideSheetBehavior.this.viewRef.get() != view) {
                    return false;
                }
                return true;
            }
        };
    }

    private int calculateCurrentOffset(int i8, V v8) {
        int i9 = this.state;
        if (i9 != 1 && i9 != 2) {
            if (i9 != 3) {
                if (i9 == 5) {
                    return this.sheetDelegate.getHiddenOffset();
                }
                throw new IllegalStateException("Unexpected value: " + this.state);
            }
            return 0;
        }
        return i8 - this.sheetDelegate.getOuterEdge(v8);
    }

    private float calculateDragDistance(float f8, float f9) {
        return Math.abs(f8 - f9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int calculateTargetStateOnViewReleased(@NonNull View view, float f8, float f9) {
        if (isExpandingOutwards(f8)) {
            return 3;
        }
        if (shouldHide(view, f8)) {
            if (!this.sheetDelegate.isSwipeSignificant(f8, f9) && !this.sheetDelegate.isReleasedCloseToInnerEdge(view)) {
                return 3;
            }
        } else if (f8 == 0.0f || !SheetUtils.isSwipeMostlyHorizontal(f8, f9)) {
            int left = view.getLeft();
            if (Math.abs(left - getExpandedOffset()) < Math.abs(left - this.sheetDelegate.getHiddenOffset())) {
                return 3;
            }
        }
        return 5;
    }

    private void clearCoplanarSiblingView() {
        WeakReference<View> weakReference = this.coplanarSiblingViewRef;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.coplanarSiblingViewRef = null;
    }

    private AccessibilityViewCommand createAccessibilityViewCommandForState(final int i8) {
        return new AccessibilityViewCommand() { // from class: com.google.android.material.sidesheet.c
            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
            public final boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
                boolean lambda$createAccessibilityViewCommandForState$2;
                lambda$createAccessibilityViewCommandForState$2 = SideSheetBehavior.this.lambda$createAccessibilityViewCommandForState$2(i8, view, commandArguments);
                return lambda$createAccessibilityViewCommandForState$2;
            }
        };
    }

    private void createMaterialShapeDrawableIfNeeded(@NonNull Context context) {
        if (this.shapeAppearanceModel == null) {
            return;
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.shapeAppearanceModel);
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

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchOnSlide(@NonNull View view, int i8) {
        if (!this.callbacks.isEmpty()) {
            float calculateSlideOffset = this.sheetDelegate.calculateSlideOffset(i8);
            Iterator<SideSheetCallback> it = this.callbacks.iterator();
            while (it.hasNext()) {
                it.next().onSlide(view, calculateSlideOffset);
            }
        }
    }

    private void ensureAccessibilityPaneTitleIsSet(View view) {
        if (ViewCompat.getAccessibilityPaneTitle(view) == null) {
            ViewCompat.setAccessibilityPaneTitle(view, view.getResources().getString(DEFAULT_ACCESSIBILITY_PANE_TITLE));
        }
    }

    @NonNull
    public static <V extends View> SideSheetBehavior<V> from(@NonNull V v8) {
        ViewGroup.LayoutParams layoutParams = v8.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
            if (behavior instanceof SideSheetBehavior) {
                return (SideSheetBehavior) behavior;
            }
            throw new IllegalArgumentException("The view is not associated with SideSheetBehavior");
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

    @Nullable
    private ValueAnimator.AnimatorUpdateListener getCoplanarFinishAnimatorUpdateListener() {
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        final View coplanarSiblingView = getCoplanarSiblingView();
        if (coplanarSiblingView == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) coplanarSiblingView.getLayoutParams()) == null) {
            return null;
        }
        final int coplanarSiblingAdjacentMargin = this.sheetDelegate.getCoplanarSiblingAdjacentMargin(marginLayoutParams);
        return new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.sidesheet.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SideSheetBehavior.this.lambda$getCoplanarFinishAnimatorUpdateListener$1(marginLayoutParams, coplanarSiblingAdjacentMargin, coplanarSiblingView, valueAnimator);
            }
        };
    }

    @GravityInt
    private int getGravityFromSheetEdge() {
        SheetDelegate sheetDelegate = this.sheetDelegate;
        if (sheetDelegate == null || sheetDelegate.getSheetEdge() == 0) {
            return 5;
        }
        return 3;
    }

    @Nullable
    private CoordinatorLayout.LayoutParams getViewLayoutParams() {
        V v8;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference != null && (v8 = weakReference.get()) != null && (v8.getLayoutParams() instanceof CoordinatorLayout.LayoutParams)) {
            return (CoordinatorLayout.LayoutParams) v8.getLayoutParams();
        }
        return null;
    }

    private boolean hasLeftMargin() {
        CoordinatorLayout.LayoutParams viewLayoutParams = getViewLayoutParams();
        if (viewLayoutParams != null && ((ViewGroup.MarginLayoutParams) viewLayoutParams).leftMargin > 0) {
            return true;
        }
        return false;
    }

    private boolean hasRightMargin() {
        CoordinatorLayout.LayoutParams viewLayoutParams = getViewLayoutParams();
        if (viewLayoutParams != null && ((ViewGroup.MarginLayoutParams) viewLayoutParams).rightMargin > 0) {
            return true;
        }
        return false;
    }

    private boolean isDraggedFarEnough(@NonNull MotionEvent motionEvent) {
        if (!shouldHandleDraggingWithHelper() || calculateDragDistance(this.initialX, motionEvent.getX()) <= this.viewDragHelper.getTouchSlop()) {
            return false;
        }
        return true;
    }

    private boolean isExpandingOutwards(float f8) {
        return this.sheetDelegate.isExpandingOutwards(f8);
    }

    private boolean isLayingOut(@NonNull V v8) {
        ViewParent parent = v8.getParent();
        if (parent != null && parent.isLayoutRequested() && ViewCompat.isAttachedToWindow(v8)) {
            return true;
        }
        return false;
    }

    private boolean isSettling(View view, int i8, boolean z8) {
        int outerEdgeOffsetForState = getOuterEdgeOffsetForState(i8);
        ViewDragHelper viewDragHelper = getViewDragHelper();
        if (viewDragHelper != null && (!z8 ? viewDragHelper.smoothSlideViewTo(view, outerEdgeOffsetForState, view.getTop()) : viewDragHelper.settleCapturedViewAt(outerEdgeOffsetForState, view.getTop()))) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$createAccessibilityViewCommandForState$2(int i8, View view, AccessibilityViewCommand.CommandArguments commandArguments) {
        setState(i8);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getCoplanarFinishAnimatorUpdateListener$1(ViewGroup.MarginLayoutParams marginLayoutParams, int i8, View view, ValueAnimator valueAnimator) {
        this.sheetDelegate.updateCoplanarSiblingAdjacentMargin(marginLayoutParams, AnimationUtils.lerp(i8, 0, valueAnimator.getAnimatedFraction()));
        view.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setState$0(int i8) {
        V v8 = this.viewRef.get();
        if (v8 != null) {
            startSettling(v8, i8, false);
        }
    }

    private void maybeAssignCoplanarSiblingViewBasedId(@NonNull CoordinatorLayout coordinatorLayout) {
        int i8;
        View findViewById;
        if (this.coplanarSiblingViewRef == null && (i8 = this.coplanarSiblingViewId) != -1 && (findViewById = coordinatorLayout.findViewById(i8)) != null) {
            this.coplanarSiblingViewRef = new WeakReference<>(findViewById);
        }
    }

    private void replaceAccessibilityActionForState(V v8, AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat, int i8) {
        ViewCompat.replaceAccessibilityAction(v8, accessibilityActionCompat, null, createAccessibilityViewCommandForState(i8));
    }

    private void resetVelocity() {
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.velocityTracker = null;
        }
    }

    private void runAfterLayout(@NonNull V v8, Runnable runnable) {
        if (isLayingOut(v8)) {
            v8.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void setSheetEdge(@NonNull V v8, int i8) {
        setSheetEdge(GravityCompat.getAbsoluteGravity(((CoordinatorLayout.LayoutParams) v8.getLayoutParams()).gravity, i8) == 3 ? 1 : 0);
    }

    private boolean shouldHandleDraggingWithHelper() {
        if (this.viewDragHelper != null && (this.draggable || this.state == 1)) {
            return true;
        }
        return false;
    }

    private boolean shouldInterceptTouchEvent(@NonNull V v8) {
        if ((v8.isShown() || ViewCompat.getAccessibilityPaneTitle(v8) != null) && this.draggable) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSettling(View view, int i8, boolean z8) {
        if (isSettling(view, i8, z8)) {
            setStateInternal(2);
            this.stateSettlingTracker.continueSettlingToState(i8);
        } else {
            setStateInternal(i8);
        }
    }

    private void updateAccessibilityActions() {
        V v8;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || (v8 = weakReference.get()) == null) {
            return;
        }
        ViewCompat.removeAccessibilityAction(v8, 262144);
        ViewCompat.removeAccessibilityAction(v8, 1048576);
        if (this.state != 5) {
            replaceAccessibilityActionForState(v8, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS, 5);
        }
        if (this.state != 3) {
            replaceAccessibilityActionForState(v8, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_EXPAND, 3);
        }
    }

    private void updateCoplanarSiblingBackProgress() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference != null && weakReference.get() != null) {
            V v8 = this.viewRef.get();
            View coplanarSiblingView = getCoplanarSiblingView();
            if (coplanarSiblingView == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) coplanarSiblingView.getLayoutParams()) == null) {
                return;
            }
            this.sheetDelegate.updateCoplanarSiblingAdjacentMargin(marginLayoutParams, (int) ((this.childWidth * v8.getScaleX()) + this.innerMargin));
            coplanarSiblingView.requestLayout();
        }
    }

    private void updateMaterialShapeDrawable(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        MaterialShapeDrawable materialShapeDrawable = this.materialShapeDrawable;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        }
    }

    private void updateSheetVisibility(@NonNull View view) {
        int i8;
        if (this.state == 5) {
            i8 = 4;
        } else {
            i8 = 0;
        }
        if (view.getVisibility() != i8) {
            view.setVisibility(i8);
        }
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void cancelBackProgress() {
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.sideContainerBackHelper;
        if (materialSideContainerBackHelper == null) {
            return;
        }
        materialSideContainerBackHelper.cancelBackProgress();
    }

    public void expand() {
        setState(3);
    }

    @Nullable
    @VisibleForTesting
    MaterialSideContainerBackHelper getBackHelper() {
        return this.sideContainerBackHelper;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getChildWidth() {
        return this.childWidth;
    }

    @Nullable
    public View getCoplanarSiblingView() {
        WeakReference<View> weakReference = this.coplanarSiblingViewRef;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int getExpandedOffset() {
        return this.sheetDelegate.getExpandedOffset();
    }

    public float getHideFriction() {
        return this.hideFriction;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getHideThreshold() {
        return 0.5f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getInnerMargin() {
        return this.innerMargin;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getLastStableState() {
        return this.lastStableState;
    }

    int getOuterEdgeOffsetForState(int i8) {
        if (i8 != 3) {
            if (i8 == 5) {
                return this.sheetDelegate.getHiddenOffset();
            }
            throw new IllegalArgumentException("Invalid state to get outer edge offset: " + i8);
        }
        return getExpandedOffset();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getParentInnerEdge() {
        return this.parentInnerEdge;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getParentWidth() {
        return this.parentWidth;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSignificantVelocityThreshold() {
        return SIGNIFICANT_VEL_THRESHOLD;
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public int getState() {
        return this.state;
    }

    @Nullable
    ViewDragHelper getViewDragHelper() {
        return this.viewDragHelper;
    }

    float getXVelocity() {
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.maximumVelocity);
        return this.velocityTracker.getXVelocity();
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void handleBackInvoked() {
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.sideContainerBackHelper;
        if (materialSideContainerBackHelper == null) {
            return;
        }
        BackEventCompat onHandleBackInvoked = materialSideContainerBackHelper.onHandleBackInvoked();
        if (onHandleBackInvoked != null && Build.VERSION.SDK_INT >= 34) {
            this.sideContainerBackHelper.finishBackProgress(onHandleBackInvoked, getGravityFromSheetEdge(), new AnimatorListenerAdapter() { // from class: com.google.android.material.sidesheet.SideSheetBehavior.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    SideSheetBehavior.this.setStateInternal(5);
                    if (SideSheetBehavior.this.viewRef != null && SideSheetBehavior.this.viewRef.get() != null) {
                        ((View) SideSheetBehavior.this.viewRef.get()).requestLayout();
                    }
                }
            }, getCoplanarFinishAnimatorUpdateListener());
        } else {
            setState(5);
        }
    }

    public void hide() {
        setState(5);
    }

    public boolean isDraggable() {
        return this.draggable;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onAttachedToLayoutParams(@NonNull CoordinatorLayout.LayoutParams layoutParams) {
        super.onAttachedToLayoutParams(layoutParams);
        this.viewRef = null;
        this.viewDragHelper = null;
        this.sideContainerBackHelper = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.viewRef = null;
        this.viewDragHelper = null;
        this.sideContainerBackHelper = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v8, @NonNull MotionEvent motionEvent) {
        ViewDragHelper viewDragHelper;
        if (!shouldInterceptTouchEvent(v8)) {
            this.ignoreEvents = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            resetVelocity();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (actionMasked != 0) {
            if ((actionMasked == 1 || actionMasked == 3) && this.ignoreEvents) {
                this.ignoreEvents = false;
                return false;
            }
        } else {
            this.initialX = (int) motionEvent.getX();
        }
        if (!this.ignoreEvents && (viewDragHelper = this.viewDragHelper) != null && viewDragHelper.shouldInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v8, int i8) {
        int i9;
        if (ViewCompat.getFitsSystemWindows(coordinatorLayout) && !ViewCompat.getFitsSystemWindows(v8)) {
            v8.setFitsSystemWindows(true);
        }
        if (this.viewRef == null) {
            this.viewRef = new WeakReference<>(v8);
            this.sideContainerBackHelper = new MaterialSideContainerBackHelper(v8);
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
            updateSheetVisibility(v8);
            updateAccessibilityActions();
            if (ViewCompat.getImportantForAccessibility(v8) == 0) {
                ViewCompat.setImportantForAccessibility(v8, 1);
            }
            ensureAccessibilityPaneTitleIsSet(v8);
        }
        setSheetEdge(v8, i8);
        if (this.viewDragHelper == null) {
            this.viewDragHelper = ViewDragHelper.create(coordinatorLayout, this.dragCallback);
        }
        int outerEdge = this.sheetDelegate.getOuterEdge(v8);
        coordinatorLayout.onLayoutChild(v8, i8);
        this.parentWidth = coordinatorLayout.getWidth();
        this.parentInnerEdge = this.sheetDelegate.getParentInnerEdge(coordinatorLayout);
        this.childWidth = v8.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v8.getLayoutParams();
        if (marginLayoutParams != null) {
            i9 = this.sheetDelegate.calculateInnerMargin(marginLayoutParams);
        } else {
            i9 = 0;
        }
        this.innerMargin = i9;
        ViewCompat.offsetLeftAndRight(v8, calculateCurrentOffset(outerEdge, v8));
        maybeAssignCoplanarSiblingViewBasedId(coordinatorLayout);
        for (SideSheetCallback sideSheetCallback : this.callbacks) {
            if (sideSheetCallback instanceof SideSheetCallback) {
                sideSheetCallback.onLayout(v8);
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v8, int i8, int i9, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v8.getLayoutParams();
        v8.measure(getChildMeasureSpec(i8, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i9, -1, marginLayoutParams.width), getChildMeasureSpec(i10, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i11, -1, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v8, @NonNull Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        if (savedState.getSuperState() != null) {
            super.onRestoreInstanceState(coordinatorLayout, v8, savedState.getSuperState());
        }
        int i8 = savedState.state;
        if (i8 == 1 || i8 == 2) {
            i8 = 5;
        }
        this.state = i8;
        this.lastStableState = i8;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @NonNull
    public Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v8) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, v8), (SideSheetBehavior<?>) this);
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
            resetVelocity();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (shouldHandleDraggingWithHelper() && actionMasked == 2 && !this.ignoreEvents && isDraggedFarEnough(motionEvent)) {
            this.viewDragHelper.captureChildView(v8, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.ignoreEvents;
    }

    public void setCoplanarSiblingView(@Nullable View view) {
        this.coplanarSiblingViewId = -1;
        if (view == null) {
            clearCoplanarSiblingView();
            return;
        }
        this.coplanarSiblingViewRef = new WeakReference<>(view);
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference != null) {
            V v8 = weakReference.get();
            if (ViewCompat.isLaidOut(v8)) {
                v8.requestLayout();
            }
        }
    }

    public void setCoplanarSiblingViewId(@IdRes int i8) {
        this.coplanarSiblingViewId = i8;
        clearCoplanarSiblingView();
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference != null) {
            V v8 = weakReference.get();
            if (i8 != -1 && ViewCompat.isLaidOut(v8)) {
                v8.requestLayout();
            }
        }
    }

    public void setDraggable(boolean z8) {
        this.draggable = z8;
    }

    public void setHideFriction(float f8) {
        this.hideFriction = f8;
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public void setState(final int i8) {
        String str;
        if (i8 != 1 && i8 != 2) {
            WeakReference<V> weakReference = this.viewRef;
            if (weakReference != null && weakReference.get() != null) {
                runAfterLayout(this.viewRef.get(), new Runnable() { // from class: com.google.android.material.sidesheet.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        SideSheetBehavior.this.lambda$setState$0(i8);
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
        if (i8 == 3 || i8 == 5) {
            this.lastStableState = i8;
        }
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || (v8 = weakReference.get()) == null) {
            return;
        }
        updateSheetVisibility(v8);
        Iterator<SideSheetCallback> it = this.callbacks.iterator();
        while (it.hasNext()) {
            it.next().onStateChanged(v8, i8);
        }
        updateAccessibilityActions();
    }

    boolean shouldHide(@NonNull View view, float f8) {
        return this.sheetDelegate.shouldHide(view, f8);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean shouldSkipSmoothAnimation() {
        return true;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void startBackProgress(@NonNull BackEventCompat backEventCompat) {
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.sideContainerBackHelper;
        if (materialSideContainerBackHelper == null) {
            return;
        }
        materialSideContainerBackHelper.startBackProgress(backEventCompat);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void updateBackProgress(@NonNull BackEventCompat backEventCompat) {
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.sideContainerBackHelper;
        if (materialSideContainerBackHelper == null) {
            return;
        }
        materialSideContainerBackHelper.updateBackProgress(backEventCompat, getGravityFromSheetEdge());
        updateCoplanarSiblingBackProgress();
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public void addCallback(@NonNull SideSheetCallback sideSheetCallback) {
        this.callbacks.add(sideSheetCallback);
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public void removeCallback(@NonNull SideSheetCallback sideSheetCallback) {
        this.callbacks.remove(sideSheetCallback);
    }

    private void setSheetEdge(int i8) {
        SheetDelegate sheetDelegate = this.sheetDelegate;
        if (sheetDelegate == null || sheetDelegate.getSheetEdge() != i8) {
            if (i8 == 0) {
                this.sheetDelegate = new RightSheetDelegate(this);
                if (this.shapeAppearanceModel == null || hasRightMargin()) {
                    return;
                }
                ShapeAppearanceModel.Builder builder = this.shapeAppearanceModel.toBuilder();
                builder.setTopRightCornerSize(0.0f).setBottomRightCornerSize(0.0f);
                updateMaterialShapeDrawable(builder.build());
                return;
            }
            if (i8 == 1) {
                this.sheetDelegate = new LeftSheetDelegate(this);
                if (this.shapeAppearanceModel == null || hasLeftMargin()) {
                    return;
                }
                ShapeAppearanceModel.Builder builder2 = this.shapeAppearanceModel.toBuilder();
                builder2.setTopLeftCornerSize(0.0f).setBottomLeftCornerSize(0.0f);
                updateMaterialShapeDrawable(builder2.build());
                return;
            }
            throw new IllegalArgumentException("Invalid sheet edge position value: " + i8 + ". Must be 0 or 1.");
        }
    }

    public SideSheetBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.stateSettlingTracker = new StateSettlingTracker();
        this.draggable = true;
        this.state = 5;
        this.lastStableState = 5;
        this.hideFriction = 0.1f;
        this.coplanarSiblingViewId = -1;
        this.callbacks = new LinkedHashSet();
        this.dragCallback = new ViewDragHelper.Callback() { // from class: com.google.android.material.sidesheet.SideSheetBehavior.1
            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionHorizontal(@NonNull View view, int i8, int i9) {
                return MathUtils.clamp(i8, SideSheetBehavior.this.sheetDelegate.getMinViewPositionHorizontal(), SideSheetBehavior.this.sheetDelegate.getMaxViewPositionHorizontal());
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionVertical(@NonNull View view, int i8, int i9) {
                return view.getTop();
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int getViewHorizontalDragRange(@NonNull View view) {
                return SideSheetBehavior.this.childWidth + SideSheetBehavior.this.getInnerMargin();
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewDragStateChanged(int i8) {
                if (i8 == 1 && SideSheetBehavior.this.draggable) {
                    SideSheetBehavior.this.setStateInternal(1);
                }
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewPositionChanged(@NonNull View view, int i8, int i9, int i10, int i11) {
                ViewGroup.MarginLayoutParams marginLayoutParams;
                View coplanarSiblingView = SideSheetBehavior.this.getCoplanarSiblingView();
                if (coplanarSiblingView != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) coplanarSiblingView.getLayoutParams()) != null) {
                    SideSheetBehavior.this.sheetDelegate.updateCoplanarSiblingLayoutParams(marginLayoutParams, view.getLeft(), view.getRight());
                    coplanarSiblingView.setLayoutParams(marginLayoutParams);
                }
                SideSheetBehavior.this.dispatchOnSlide(view, i8);
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewReleased(@NonNull View view, float f8, float f9) {
                int calculateTargetStateOnViewReleased = SideSheetBehavior.this.calculateTargetStateOnViewReleased(view, f8, f9);
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                sideSheetBehavior.startSettling(view, calculateTargetStateOnViewReleased, sideSheetBehavior.shouldSkipSmoothAnimation());
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public boolean tryCaptureView(@NonNull View view, int i8) {
                if (SideSheetBehavior.this.state == 1 || SideSheetBehavior.this.viewRef == null || SideSheetBehavior.this.viewRef.get() != view) {
                    return false;
                }
                return true;
            }
        };
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SideSheetBehavior_Layout);
        int i8 = R.styleable.SideSheetBehavior_Layout_backgroundTint;
        if (obtainStyledAttributes.hasValue(i8)) {
            this.backgroundTint = MaterialResources.getColorStateList(context, obtainStyledAttributes, i8);
        }
        if (obtainStyledAttributes.hasValue(R.styleable.SideSheetBehavior_Layout_shapeAppearance)) {
            this.shapeAppearanceModel = ShapeAppearanceModel.builder(context, attributeSet, 0, DEF_STYLE_RES).build();
        }
        int i9 = R.styleable.SideSheetBehavior_Layout_coplanarSiblingViewId;
        if (obtainStyledAttributes.hasValue(i9)) {
            setCoplanarSiblingViewId(obtainStyledAttributes.getResourceId(i9, -1));
        }
        createMaterialShapeDrawableIfNeeded(context);
        this.elevation = obtainStyledAttributes.getDimension(R.styleable.SideSheetBehavior_Layout_android_elevation, -1.0f);
        setDraggable(obtainStyledAttributes.getBoolean(R.styleable.SideSheetBehavior_Layout_behavior_draggable, true));
        obtainStyledAttributes.recycle();
        this.maximumVelocity = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
