package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.math.MathUtils;
import androidx.core.util.ObjectsCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.AttachedBehavior {
    private static final int DEF_STYLE_RES = R.style.Widget_Design_AppBarLayout;
    private static final int INVALID_SCROLL_RANGE = -1;
    static final int PENDING_ACTION_ANIMATE_ENABLED = 4;
    static final int PENDING_ACTION_COLLAPSED = 2;
    static final int PENDING_ACTION_EXPANDED = 1;
    static final int PENDING_ACTION_FORCE = 8;
    static final int PENDING_ACTION_NONE = 0;
    private final float appBarElevation;
    private Behavior behavior;
    private int currentOffset;
    private int downPreScrollRange;
    private int downScrollRange;
    private final boolean hasLiftOnScrollColor;
    private boolean haveChildWithInterpolator;

    @Nullable
    private WindowInsetsCompat lastInsets;
    private boolean liftOnScroll;

    @Nullable
    private ValueAnimator liftOnScrollColorAnimator;
    private final long liftOnScrollColorDuration;
    private final TimeInterpolator liftOnScrollColorInterpolator;

    @Nullable
    private ValueAnimator.AnimatorUpdateListener liftOnScrollColorUpdateListener;
    private final List<LiftOnScrollListener> liftOnScrollListeners;

    @Nullable
    private WeakReference<View> liftOnScrollTargetView;

    @IdRes
    private int liftOnScrollTargetViewId;
    private boolean liftable;
    private boolean liftableOverride;
    private boolean lifted;
    private List<BaseOnOffsetChangedListener> listeners;
    private int pendingAction;

    @Nullable
    private Drawable statusBarForeground;

    @Nullable
    private Integer statusBarForegroundOriginalColor;
    private int[] tmpStatesArray;
    private int totalScrollRange;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes3.dex */
    public static class BaseBehavior<T extends AppBarLayout> extends HeaderBehavior<T> {
        private static final int MAX_OFFSET_ANIMATION_DURATION = 600;

        @Nullable
        private WeakReference<View> lastNestedScrollingChildRef;
        private int lastStartedType;
        private ValueAnimator offsetAnimator;
        private int offsetDelta;
        private BaseDragCallback onDragCallback;
        private SavedState savedState;

        /* loaded from: classes3.dex */
        public static abstract class BaseDragCallback<T extends AppBarLayout> {
            public abstract boolean canDrag(@NonNull T t8);
        }

        public BaseBehavior() {
        }

        private void addAccessibilityDelegateIfNeeded(final CoordinatorLayout coordinatorLayout, @NonNull final T t8) {
            if (!ViewCompat.hasAccessibilityDelegate(coordinatorLayout)) {
                ViewCompat.setAccessibilityDelegate(coordinatorLayout, new AccessibilityDelegateCompat() { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.2
                    @Override // androidx.core.view.AccessibilityDelegateCompat
                    public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                        View childWithScrollingBehavior;
                        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                        accessibilityNodeInfoCompat.setClassName(ScrollView.class.getName());
                        if (t8.getTotalScrollRange() == 0 || (childWithScrollingBehavior = BaseBehavior.this.getChildWithScrollingBehavior(coordinatorLayout)) == null || !BaseBehavior.this.childrenHaveScrollFlags(t8)) {
                            return;
                        }
                        if (BaseBehavior.this.getTopBottomOffsetForScrollingSibling() != (-t8.getTotalScrollRange())) {
                            accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                            accessibilityNodeInfoCompat.setScrollable(true);
                        }
                        if (BaseBehavior.this.getTopBottomOffsetForScrollingSibling() != 0) {
                            if (childWithScrollingBehavior.canScrollVertically(-1)) {
                                if ((-t8.getDownNestedPreScrollRange()) != 0) {
                                    accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                                    accessibilityNodeInfoCompat.setScrollable(true);
                                    return;
                                }
                                return;
                            }
                            accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                            accessibilityNodeInfoCompat.setScrollable(true);
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // androidx.core.view.AccessibilityDelegateCompat
                    public boolean performAccessibilityAction(View view, int i8, Bundle bundle) {
                        if (i8 == 4096) {
                            t8.setExpanded(false);
                            return true;
                        }
                        if (i8 == 8192) {
                            if (BaseBehavior.this.getTopBottomOffsetForScrollingSibling() != 0) {
                                View childWithScrollingBehavior = BaseBehavior.this.getChildWithScrollingBehavior(coordinatorLayout);
                                if (childWithScrollingBehavior.canScrollVertically(-1)) {
                                    int i9 = -t8.getDownNestedPreScrollRange();
                                    if (i9 != 0) {
                                        BaseBehavior.this.onNestedPreScroll(coordinatorLayout, (CoordinatorLayout) t8, childWithScrollingBehavior, 0, i9, new int[]{0, 0}, 1);
                                        return true;
                                    }
                                } else {
                                    t8.setExpanded(true);
                                    return true;
                                }
                            }
                            return false;
                        }
                        return super.performAccessibilityAction(view, i8, bundle);
                    }
                });
            }
        }

        private void animateOffsetTo(CoordinatorLayout coordinatorLayout, @NonNull T t8, int i8, float f8) {
            int height;
            int abs = Math.abs(getTopBottomOffsetForScrollingSibling() - i8);
            float abs2 = Math.abs(f8);
            if (abs2 > 0.0f) {
                height = Math.round((abs / abs2) * 1000.0f) * 3;
            } else {
                height = (int) (((abs / t8.getHeight()) + 1.0f) * 150.0f);
            }
            animateOffsetWithDuration(coordinatorLayout, t8, i8, height);
        }

        private void animateOffsetWithDuration(final CoordinatorLayout coordinatorLayout, final T t8, int i8, int i9) {
            int topBottomOffsetForScrollingSibling = getTopBottomOffsetForScrollingSibling();
            if (topBottomOffsetForScrollingSibling == i8) {
                ValueAnimator valueAnimator = this.offsetAnimator;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.offsetAnimator.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.offsetAnimator;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.offsetAnimator = valueAnimator3;
                valueAnimator3.setInterpolator(AnimationUtils.DECELERATE_INTERPOLATOR);
                this.offsetAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator4) {
                        BaseBehavior.this.setHeaderTopBottomOffset(coordinatorLayout, t8, ((Integer) valueAnimator4.getAnimatedValue()).intValue());
                    }
                });
            } else {
                valueAnimator2.cancel();
            }
            this.offsetAnimator.setDuration(Math.min(i9, 600));
            this.offsetAnimator.setIntValues(topBottomOffsetForScrollingSibling, i8);
            this.offsetAnimator.start();
        }

        private int calculateSnapOffset(int i8, int i9, int i10) {
            if (i8 >= (i9 + i10) / 2) {
                return i10;
            }
            return i9;
        }

        private boolean canScrollChildren(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t8, @NonNull View view) {
            if (t8.hasScrollableChildren() && coordinatorLayout.getHeight() - view.getHeight() <= t8.getHeight()) {
                return true;
            }
            return false;
        }

        private static boolean checkFlag(int i8, int i9) {
            return (i8 & i9) == i9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean childrenHaveScrollFlags(AppBarLayout appBarLayout) {
            int childCount = appBarLayout.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                if (((LayoutParams) appBarLayout.getChildAt(i8).getLayoutParams()).scrollFlags != 0) {
                    return true;
                }
            }
            return false;
        }

        @Nullable
        private View findFirstScrollingChild(@NonNull CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = coordinatorLayout.getChildAt(i8);
                if ((childAt instanceof NestedScrollingChild) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        @Nullable
        private static View getAppBarChildOnOffset(@NonNull AppBarLayout appBarLayout, int i8) {
            int abs = Math.abs(i8);
            int childCount = appBarLayout.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = appBarLayout.getChildAt(i9);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private int getChildIndexOnOffset(@NonNull T t8, int i8) {
            int childCount = t8.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = t8.getChildAt(i9);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (checkFlag(layoutParams.getScrollFlags(), 32)) {
                    top -= ((LinearLayout.LayoutParams) layoutParams).topMargin;
                    bottom += ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                }
                int i10 = -i8;
                if (top <= i10 && bottom >= i10) {
                    return i9;
                }
            }
            return -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Nullable
        public View getChildWithScrollingBehavior(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = coordinatorLayout.getChildAt(i8);
                if (((CoordinatorLayout.LayoutParams) childAt.getLayoutParams()).getBehavior() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        private int interpolateOffset(@NonNull T t8, int i8) {
            int abs = Math.abs(i8);
            int childCount = t8.getChildCount();
            int i9 = 0;
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    break;
                }
                View childAt = t8.getChildAt(i10);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                Interpolator scrollInterpolator = layoutParams.getScrollInterpolator();
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    if (scrollInterpolator != null) {
                        int scrollFlags = layoutParams.getScrollFlags();
                        if ((scrollFlags & 1) != 0) {
                            i9 = childAt.getHeight() + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                            if ((scrollFlags & 2) != 0) {
                                i9 -= ViewCompat.getMinimumHeight(childAt);
                            }
                        }
                        if (ViewCompat.getFitsSystemWindows(childAt)) {
                            i9 -= t8.getTopInset();
                        }
                        if (i9 > 0) {
                            float f8 = i9;
                            return Integer.signum(i8) * (childAt.getTop() + Math.round(f8 * scrollInterpolator.getInterpolation((abs - childAt.getTop()) / f8)));
                        }
                    }
                } else {
                    i10++;
                }
            }
            return i8;
        }

        private boolean shouldJumpElevationState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t8) {
            List<View> dependents = coordinatorLayout.getDependents(t8);
            int size = dependents.size();
            for (int i8 = 0; i8 < size; i8++) {
                CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) dependents.get(i8).getLayoutParams()).getBehavior();
                if (behavior instanceof ScrollingViewBehavior) {
                    if (((ScrollingViewBehavior) behavior).getOverlayTop() == 0) {
                        return false;
                    }
                    return true;
                }
            }
            return false;
        }

        private void snapToChildIfNeeded(CoordinatorLayout coordinatorLayout, @NonNull T t8) {
            int topInset = t8.getTopInset() + t8.getPaddingTop();
            int topBottomOffsetForScrollingSibling = getTopBottomOffsetForScrollingSibling() - topInset;
            int childIndexOnOffset = getChildIndexOnOffset(t8, topBottomOffsetForScrollingSibling);
            if (childIndexOnOffset >= 0) {
                View childAt = t8.getChildAt(childIndexOnOffset);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int scrollFlags = layoutParams.getScrollFlags();
                if ((scrollFlags & 17) == 17) {
                    int i8 = -childAt.getTop();
                    int i9 = -childAt.getBottom();
                    if (childIndexOnOffset == 0 && ViewCompat.getFitsSystemWindows(t8) && ViewCompat.getFitsSystemWindows(childAt)) {
                        i8 -= t8.getTopInset();
                    }
                    if (checkFlag(scrollFlags, 2)) {
                        i9 += ViewCompat.getMinimumHeight(childAt);
                    } else if (checkFlag(scrollFlags, 5)) {
                        int minimumHeight = ViewCompat.getMinimumHeight(childAt) + i9;
                        if (topBottomOffsetForScrollingSibling < minimumHeight) {
                            i8 = minimumHeight;
                        } else {
                            i9 = minimumHeight;
                        }
                    }
                    if (checkFlag(scrollFlags, 32)) {
                        i8 += ((LinearLayout.LayoutParams) layoutParams).topMargin;
                        i9 -= ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                    }
                    animateOffsetTo(coordinatorLayout, t8, MathUtils.clamp(calculateSnapOffset(topBottomOffsetForScrollingSibling, i9, i8) + topInset, -t8.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        private void updateAppBarLayoutDrawableState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t8, int i8, int i9, boolean z8) {
            Drawable foreground;
            Drawable foreground2;
            View appBarChildOnOffset = getAppBarChildOnOffset(t8, i8);
            boolean z9 = false;
            if (appBarChildOnOffset != null) {
                int scrollFlags = ((LayoutParams) appBarChildOnOffset.getLayoutParams()).getScrollFlags();
                if ((scrollFlags & 1) != 0) {
                    int minimumHeight = ViewCompat.getMinimumHeight(appBarChildOnOffset);
                    if (i9 <= 0 || (scrollFlags & 12) == 0 ? !((scrollFlags & 2) == 0 || (-i8) < (appBarChildOnOffset.getBottom() - minimumHeight) - t8.getTopInset()) : (-i8) >= (appBarChildOnOffset.getBottom() - minimumHeight) - t8.getTopInset()) {
                        z9 = true;
                    }
                }
            }
            if (t8.isLiftOnScroll()) {
                z9 = t8.shouldLift(findFirstScrollingChild(coordinatorLayout));
            }
            boolean liftedState = t8.setLiftedState(z9);
            if (z8 || (liftedState && shouldJumpElevationState(coordinatorLayout, t8))) {
                if (t8.getBackground() != null) {
                    t8.getBackground().jumpToCurrentState();
                }
                if (Build.VERSION.SDK_INT >= 23) {
                    foreground = t8.getForeground();
                    if (foreground != null) {
                        foreground2 = t8.getForeground();
                        foreground2.jumpToCurrentState();
                    }
                }
                if (t8.getStateListAnimator() != null) {
                    t8.getStateListAnimator().jumpToCurrentState();
                }
            }
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        int getTopBottomOffsetForScrollingSibling() {
            return getTopAndBottomOffset() + this.offsetDelta;
        }

        @VisibleForTesting
        boolean isOffsetAnimatorRunning() {
            ValueAnimator valueAnimator = this.offsetAnimator;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                return true;
            }
            return false;
        }

        void restoreScrollState(@Nullable SavedState savedState, boolean z8) {
            if (this.savedState == null || z8) {
                this.savedState = savedState;
            }
        }

        @Nullable
        SavedState saveScrollState(@Nullable Parcelable parcelable, @NonNull T t8) {
            boolean z8;
            boolean z9;
            int topAndBottomOffset = getTopAndBottomOffset();
            int childCount = t8.getChildCount();
            boolean z10 = false;
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = t8.getChildAt(i8);
                int bottom = childAt.getBottom() + topAndBottomOffset;
                if (childAt.getTop() + topAndBottomOffset <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.EMPTY_STATE;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    if (topAndBottomOffset == 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    savedState.fullyExpanded = z8;
                    if (!z8 && (-topAndBottomOffset) >= t8.getTotalScrollRange()) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    savedState.fullyScrolled = z9;
                    savedState.firstVisibleChildIndex = i8;
                    if (bottom == ViewCompat.getMinimumHeight(childAt) + t8.getTopInset()) {
                        z10 = true;
                    }
                    savedState.firstVisibleChildAtMinimumHeight = z10;
                    savedState.firstVisibleChildPercentageShown = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }

        public void setDragCallback(@Nullable BaseDragCallback baseDragCallback) {
            this.onDragCallback = baseDragCallback;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.HeaderBehavior
        public boolean canDragView(T t8) {
            BaseDragCallback baseDragCallback = this.onDragCallback;
            if (baseDragCallback != null) {
                return baseDragCallback.canDrag(t8);
            }
            WeakReference<View> weakReference = this.lastNestedScrollingChildRef;
            if (weakReference == null) {
                return true;
            }
            View view = weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.HeaderBehavior
        public int getMaxDragOffset(@NonNull T t8) {
            return (-t8.getDownNestedScrollRange()) + t8.getTopInset();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.HeaderBehavior
        public int getScrollRangeForDragFling(@NonNull T t8) {
            return t8.getTotalScrollRange();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.HeaderBehavior
        public void onFlingFinished(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t8) {
            snapToChildIfNeeded(coordinatorLayout, t8);
            if (t8.isLiftOnScroll()) {
                t8.setLiftedState(t8.shouldLift(findFirstScrollingChild(coordinatorLayout)));
            }
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t8, int i8) {
            int round;
            boolean onLayoutChild = super.onLayoutChild(coordinatorLayout, (CoordinatorLayout) t8, i8);
            int pendingAction = t8.getPendingAction();
            SavedState savedState = this.savedState;
            if (savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z8 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i9 = -t8.getUpNestedPreScrollRange();
                        if (z8) {
                            animateOffsetTo(coordinatorLayout, t8, i9, 0.0f);
                        } else {
                            setHeaderTopBottomOffset(coordinatorLayout, t8, i9);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z8) {
                            animateOffsetTo(coordinatorLayout, t8, 0, 0.0f);
                        } else {
                            setHeaderTopBottomOffset(coordinatorLayout, t8, 0);
                        }
                    }
                }
            } else if (savedState.fullyScrolled) {
                setHeaderTopBottomOffset(coordinatorLayout, t8, -t8.getTotalScrollRange());
            } else if (savedState.fullyExpanded) {
                setHeaderTopBottomOffset(coordinatorLayout, t8, 0);
            } else {
                View childAt = t8.getChildAt(savedState.firstVisibleChildIndex);
                int i10 = -childAt.getBottom();
                if (this.savedState.firstVisibleChildAtMinimumHeight) {
                    round = ViewCompat.getMinimumHeight(childAt) + t8.getTopInset();
                } else {
                    round = Math.round(childAt.getHeight() * this.savedState.firstVisibleChildPercentageShown);
                }
                setHeaderTopBottomOffset(coordinatorLayout, t8, i10 + round);
            }
            t8.resetPendingAction();
            this.savedState = null;
            setTopAndBottomOffset(MathUtils.clamp(getTopAndBottomOffset(), -t8.getTotalScrollRange(), 0));
            updateAppBarLayoutDrawableState(coordinatorLayout, t8, getTopAndBottomOffset(), 0, true);
            t8.onOffsetChanged(getTopAndBottomOffset());
            addAccessibilityDelegateIfNeeded(coordinatorLayout, t8);
            return onLayoutChild;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t8, int i8, int i9, int i10, int i11) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) t8.getLayoutParams())).height == -2) {
                coordinatorLayout.onMeasureChild(t8, i8, i9, View.MeasureSpec.makeMeasureSpec(0, 0), i11);
                return true;
            }
            return super.onMeasureChild(coordinatorLayout, (CoordinatorLayout) t8, i8, i9, i10, i11);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, @NonNull T t8, View view, int i8, int i9, int[] iArr, int i10) {
            int i11;
            int i12;
            if (i9 != 0) {
                if (i9 < 0) {
                    int i13 = -t8.getTotalScrollRange();
                    i11 = i13;
                    i12 = t8.getDownNestedPreScrollRange() + i13;
                } else {
                    i11 = -t8.getUpNestedPreScrollRange();
                    i12 = 0;
                }
                if (i11 != i12) {
                    iArr[1] = scroll(coordinatorLayout, t8, i9, i11, i12);
                }
            }
            if (t8.isLiftOnScroll()) {
                t8.setLiftedState(t8.shouldLift(view));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull T t8, View view, int i8, int i9, int i10, int i11, int i12, int[] iArr) {
            if (i11 < 0) {
                iArr[1] = scroll(coordinatorLayout, t8, i11, -t8.getDownNestedScrollRange(), 0);
            }
            if (i11 == 0) {
                addAccessibilityDelegateIfNeeded(coordinatorLayout, t8);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t8, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                restoreScrollState((SavedState) parcelable, true);
                super.onRestoreInstanceState(coordinatorLayout, (CoordinatorLayout) t8, this.savedState.getSuperState());
            } else {
                super.onRestoreInstanceState(coordinatorLayout, (CoordinatorLayout) t8, parcelable);
                this.savedState = null;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t8) {
            Parcelable onSaveInstanceState = super.onSaveInstanceState(coordinatorLayout, (CoordinatorLayout) t8);
            SavedState saveScrollState = saveScrollState(onSaveInstanceState, t8);
            return saveScrollState == null ? onSaveInstanceState : saveScrollState;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t8, @NonNull View view, View view2, int i8, int i9) {
            ValueAnimator valueAnimator;
            boolean z8 = (i8 & 2) != 0 && (t8.isLiftOnScroll() || canScrollChildren(coordinatorLayout, t8, view));
            if (z8 && (valueAnimator = this.offsetAnimator) != null) {
                valueAnimator.cancel();
            }
            this.lastNestedScrollingChildRef = null;
            this.lastStartedType = i9;
            return z8;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull T t8, View view, int i8) {
            if (this.lastStartedType == 0 || i8 == 1) {
                snapToChildIfNeeded(coordinatorLayout, t8);
                if (t8.isLiftOnScroll()) {
                    t8.setLiftedState(t8.shouldLift(view));
                }
            }
            this.lastNestedScrollingChildRef = new WeakReference<>(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.HeaderBehavior
        public int setHeaderTopBottomOffset(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t8, int i8, int i9, int i10) {
            int topBottomOffsetForScrollingSibling = getTopBottomOffsetForScrollingSibling();
            int i11 = 0;
            if (i9 != 0 && topBottomOffsetForScrollingSibling >= i9 && topBottomOffsetForScrollingSibling <= i10) {
                int clamp = MathUtils.clamp(i8, i9, i10);
                if (topBottomOffsetForScrollingSibling != clamp) {
                    int interpolateOffset = t8.hasChildWithInterpolator() ? interpolateOffset(t8, clamp) : clamp;
                    boolean topAndBottomOffset = setTopAndBottomOffset(interpolateOffset);
                    int i12 = topBottomOffsetForScrollingSibling - clamp;
                    this.offsetDelta = clamp - interpolateOffset;
                    if (topAndBottomOffset) {
                        while (i11 < t8.getChildCount()) {
                            LayoutParams layoutParams = (LayoutParams) t8.getChildAt(i11).getLayoutParams();
                            ChildScrollEffect scrollEffect = layoutParams.getScrollEffect();
                            if (scrollEffect != null && (layoutParams.getScrollFlags() & 1) != 0) {
                                scrollEffect.onOffsetChanged(t8, t8.getChildAt(i11), getTopAndBottomOffset());
                            }
                            i11++;
                        }
                    }
                    if (!topAndBottomOffset && t8.hasChildWithInterpolator()) {
                        coordinatorLayout.dispatchDependentViewsChanged(t8);
                    }
                    t8.onOffsetChanged(getTopAndBottomOffset());
                    updateAppBarLayoutDrawableState(coordinatorLayout, t8, clamp, clamp < topBottomOffsetForScrollingSibling ? -1 : 1, false);
                    i11 = i12;
                }
            } else {
                this.offsetDelta = 0;
            }
            addAccessibilityDelegateIfNeeded(coordinatorLayout, t8);
            return i11;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* loaded from: classes3.dex */
        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState.1
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
                    return new SavedState(parcel, null);
                }
            };
            boolean firstVisibleChildAtMinimumHeight;
            int firstVisibleChildIndex;
            float firstVisibleChildPercentageShown;
            boolean fullyExpanded;
            boolean fullyScrolled;

            public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.fullyScrolled = parcel.readByte() != 0;
                this.fullyExpanded = parcel.readByte() != 0;
                this.firstVisibleChildIndex = parcel.readInt();
                this.firstVisibleChildPercentageShown = parcel.readFloat();
                this.firstVisibleChildAtMinimumHeight = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public void writeToParcel(@NonNull Parcel parcel, int i8) {
                super.writeToParcel(parcel, i8);
                parcel.writeByte(this.fullyScrolled ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.fullyExpanded ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.firstVisibleChildIndex);
                parcel.writeFloat(this.firstVisibleChildPercentageShown);
                parcel.writeByte(this.firstVisibleChildAtMinimumHeight ? (byte) 1 : (byte) 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface BaseOnOffsetChangedListener<T extends AppBarLayout> {
        void onOffsetChanged(T t8, int i8);
    }

    /* loaded from: classes3.dex */
    public static class Behavior extends BaseBehavior<AppBarLayout> {

        /* loaded from: classes3.dex */
        public static abstract class DragCallback extends BaseBehavior.BaseDragCallback<AppBarLayout> {
        }

        public Behavior() {
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getLeftAndRightOffset() {
            return super.getLeftAndRightOffset();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getTopAndBottomOffset() {
            return super.getTopAndBottomOffset();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isHorizontalOffsetEnabled() {
            return super.isHorizontalOffsetEnabled();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isVerticalOffsetEnabled() {
            return super.isVerticalOffsetEnabled();
        }

        @Override // com.google.android.material.appbar.HeaderBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, int i8) {
            return super.onLayoutChild(coordinatorLayout, (CoordinatorLayout) appBarLayout, i8);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, int i8, int i9, int i10, int i11) {
            return super.onMeasureChild(coordinatorLayout, (CoordinatorLayout) appBarLayout, i8, i9, i10, i11);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onNestedPreScroll(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, View view, int i8, int i9, int[] iArr, int i10) {
            super.onNestedPreScroll(coordinatorLayout, (CoordinatorLayout) appBarLayout, view, i8, i9, iArr, i10);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, View view, int i8, int i9, int i10, int i11, int i12, int[] iArr) {
            super.onNestedScroll(coordinatorLayout, (CoordinatorLayout) appBarLayout, view, i8, i9, i10, i11, i12, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, Parcelable parcelable) {
            super.onRestoreInstanceState(coordinatorLayout, (CoordinatorLayout) appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout) {
            return super.onSaveInstanceState(coordinatorLayout, (CoordinatorLayout) appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull View view, View view2, int i8, int i9) {
            return super.onStartNestedScroll(coordinatorLayout, (CoordinatorLayout) appBarLayout, view, view2, i8, i9);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onStopNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, View view, int i8) {
            super.onStopNestedScroll(coordinatorLayout, (CoordinatorLayout) appBarLayout, view, i8);
        }

        @Override // com.google.android.material.appbar.HeaderBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            return super.onTouchEvent(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void setDragCallback(@Nullable BaseBehavior.BaseDragCallback baseDragCallback) {
            super.setDragCallback(baseDragCallback);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setHorizontalOffsetEnabled(boolean z8) {
            super.setHorizontalOffsetEnabled(z8);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setLeftAndRightOffset(int i8) {
            return super.setLeftAndRightOffset(i8);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setTopAndBottomOffset(int i8) {
            return super.setTopAndBottomOffset(i8);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setVerticalOffsetEnabled(boolean z8) {
            super.setVerticalOffsetEnabled(z8);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class ChildScrollEffect {
        public abstract void onOffsetChanged(@NonNull AppBarLayout appBarLayout, @NonNull View view, float f8);
    }

    /* loaded from: classes3.dex */
    public static class CompressChildScrollEffect extends ChildScrollEffect {
        private static final float COMPRESS_DISTANCE_FACTOR = 0.3f;
        private final Rect relativeRect = new Rect();
        private final Rect ghostRect = new Rect();

        private static void updateRelativeRect(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ChildScrollEffect
        public void onOffsetChanged(@NonNull AppBarLayout appBarLayout, @NonNull View view, float f8) {
            updateRelativeRect(this.relativeRect, appBarLayout, view);
            float abs = this.relativeRect.top - Math.abs(f8);
            if (abs <= 0.0f) {
                float clamp = 1.0f - MathUtils.clamp(Math.abs(abs / this.relativeRect.height()), 0.0f, 1.0f);
                float height = (-abs) - ((this.relativeRect.height() * 0.3f) * (1.0f - (clamp * clamp)));
                view.setTranslationY(height);
                view.getDrawingRect(this.ghostRect);
                this.ghostRect.offset(0, (int) (-height));
                if (height >= this.ghostRect.height()) {
                    view.setVisibility(4);
                } else {
                    view.setVisibility(0);
                }
                ViewCompat.setClipBounds(view, this.ghostRect);
                return;
            }
            ViewCompat.setClipBounds(view, null);
            view.setTranslationY(0.0f);
            view.setVisibility(0);
        }
    }

    /* loaded from: classes3.dex */
    public static class LayoutParams extends LinearLayout.LayoutParams {
        static final int COLLAPSIBLE_FLAGS = 10;
        static final int FLAG_QUICK_RETURN = 5;
        static final int FLAG_SNAP = 17;
        public static final int SCROLL_EFFECT_COMPRESS = 1;
        public static final int SCROLL_EFFECT_NONE = 0;
        public static final int SCROLL_FLAG_ENTER_ALWAYS = 4;
        public static final int SCROLL_FLAG_ENTER_ALWAYS_COLLAPSED = 8;
        public static final int SCROLL_FLAG_EXIT_UNTIL_COLLAPSED = 2;
        public static final int SCROLL_FLAG_NO_SCROLL = 0;
        public static final int SCROLL_FLAG_SCROLL = 1;
        public static final int SCROLL_FLAG_SNAP = 16;
        public static final int SCROLL_FLAG_SNAP_MARGINS = 32;
        private ChildScrollEffect scrollEffect;
        int scrollFlags;
        Interpolator scrollInterpolator;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* loaded from: classes3.dex */
        public @interface ScrollEffect {
        }

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* loaded from: classes3.dex */
        public @interface ScrollFlags {
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.scrollFlags = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.AppBarLayout_Layout);
            this.scrollFlags = obtainStyledAttributes.getInt(R.styleable.AppBarLayout_Layout_layout_scrollFlags, 0);
            setScrollEffect(obtainStyledAttributes.getInt(R.styleable.AppBarLayout_Layout_layout_scrollEffect, 0));
            int i8 = R.styleable.AppBarLayout_Layout_layout_scrollInterpolator;
            if (obtainStyledAttributes.hasValue(i8)) {
                this.scrollInterpolator = android.view.animation.AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(i8, 0));
            }
            obtainStyledAttributes.recycle();
        }

        @Nullable
        private ChildScrollEffect createScrollEffectFromInt(int i8) {
            if (i8 != 1) {
                return null;
            }
            return new CompressChildScrollEffect();
        }

        @Nullable
        public ChildScrollEffect getScrollEffect() {
            return this.scrollEffect;
        }

        public int getScrollFlags() {
            return this.scrollFlags;
        }

        public Interpolator getScrollInterpolator() {
            return this.scrollInterpolator;
        }

        boolean isCollapsible() {
            int i8 = this.scrollFlags;
            if ((i8 & 1) == 1 && (i8 & 10) != 0) {
                return true;
            }
            return false;
        }

        public void setScrollEffect(@Nullable ChildScrollEffect childScrollEffect) {
            this.scrollEffect = childScrollEffect;
        }

        public void setScrollFlags(int i8) {
            this.scrollFlags = i8;
        }

        public void setScrollInterpolator(Interpolator interpolator) {
            this.scrollInterpolator = interpolator;
        }

        public void setScrollEffect(int i8) {
            this.scrollEffect = createScrollEffectFromInt(i8);
        }

        public LayoutParams(int i8, int i9) {
            super(i8, i9);
            this.scrollFlags = 1;
        }

        public LayoutParams(int i8, int i9, float f8) {
            super(i8, i9, f8);
            this.scrollFlags = 1;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.scrollFlags = 1;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.scrollFlags = 1;
        }

        @RequiresApi(19)
        public LayoutParams(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.scrollFlags = 1;
        }

        @RequiresApi(19)
        public LayoutParams(@NonNull LayoutParams layoutParams) {
            super((LinearLayout.LayoutParams) layoutParams);
            this.scrollFlags = 1;
            this.scrollFlags = layoutParams.scrollFlags;
            this.scrollEffect = layoutParams.scrollEffect;
            this.scrollInterpolator = layoutParams.scrollInterpolator;
        }
    }

    /* loaded from: classes3.dex */
    public interface LiftOnScrollListener {
        void onUpdate(@Dimension float f8, @ColorInt int i8);
    }

    /* loaded from: classes3.dex */
    public interface OnOffsetChangedListener extends BaseOnOffsetChangedListener<AppBarLayout> {
        @Override // com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
        void onOffsetChanged(AppBarLayout appBarLayout, int i8);
    }

    /* loaded from: classes3.dex */
    public static class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        public ScrollingViewBehavior() {
        }

        private static int getAppBarLayoutOffset(@NonNull AppBarLayout appBarLayout) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) appBarLayout.getLayoutParams()).getBehavior();
            if (behavior instanceof BaseBehavior) {
                return ((BaseBehavior) behavior).getTopBottomOffsetForScrollingSibling();
            }
            return 0;
        }

        private void offsetChildAsNeeded(@NonNull View view, @NonNull View view2) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) view2.getLayoutParams()).getBehavior();
            if (behavior instanceof BaseBehavior) {
                ViewCompat.offsetTopAndBottom(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) behavior).offsetDelta) + getVerticalLayoutGap()) - getOverlapPixelsForOffset(view2));
            }
        }

        private void updateLiftedStateIfNeeded(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.isLiftOnScroll()) {
                    appBarLayout.setLiftedState(appBarLayout.shouldLift(view));
                }
            }
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        @Nullable
        /* bridge */ /* synthetic */ View findFirstDependency(@NonNull List list) {
            return findFirstDependency((List<View>) list);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getLeftAndRightOffset() {
            return super.getLeftAndRightOffset();
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        float getOverlapRatioForOffset(View view) {
            int i8;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int appBarLayoutOffset = getAppBarLayoutOffset(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + appBarLayoutOffset > downNestedPreScrollRange) && (i8 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (appBarLayoutOffset / i8) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        int getScrollRange(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return super.getScrollRange(view);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getTopAndBottomOffset() {
            return super.getTopAndBottomOffset();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isHorizontalOffsetEnabled() {
            return super.isHorizontalOffsetEnabled();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isVerticalOffsetEnabled() {
            return super.isVerticalOffsetEnabled();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onDependentViewChanged(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
            offsetChildAsNeeded(view, view2);
            updateLiftedStateIfNeeded(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onDependentViewRemoved(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
            if (view2 instanceof AppBarLayout) {
                ViewCompat.setAccessibilityDelegate(coordinatorLayout, null);
            }
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i8) {
            return super.onLayoutChild(coordinatorLayout, view, i8);
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i8, int i9, int i10, int i11) {
            return super.onMeasureChild(coordinatorLayout, view, i8, i9, i10, i11);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onRequestChildRectangleOnScreen(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull Rect rect, boolean z8) {
            AppBarLayout findFirstDependency = findFirstDependency(coordinatorLayout.getDependencies(view));
            if (findFirstDependency != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                Rect rect3 = this.tempRect1;
                rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect3.contains(rect2)) {
                    findFirstDependency.setExpanded(false, !z8);
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setHorizontalOffsetEnabled(boolean z8) {
            super.setHorizontalOffsetEnabled(z8);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setLeftAndRightOffset(int i8) {
            return super.setLeftAndRightOffset(i8);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setTopAndBottomOffset(int i8) {
            return super.setTopAndBottomOffset(i8);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setVerticalOffsetEnabled(boolean z8) {
            super.setVerticalOffsetEnabled(z8);
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ScrollingViewBehavior_Layout);
            setOverlayTop(obtainStyledAttributes.getDimensionPixelSize(R.styleable.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            obtainStyledAttributes.recycle();
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        @Nullable
        AppBarLayout findFirstDependency(@NonNull List<View> list) {
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                View view = list.get(i8);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }
    }

    public AppBarLayout(@NonNull Context context) {
        this(context, null);
    }

    private void clearLiftOnScrollTargetView() {
        WeakReference<View> weakReference = this.liftOnScrollTargetView;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.liftOnScrollTargetView = null;
    }

    @Nullable
    private Integer extractStatusBarForegroundColor() {
        Drawable drawable = this.statusBarForeground;
        if (drawable instanceof MaterialShapeDrawable) {
            return Integer.valueOf(((MaterialShapeDrawable) drawable).getResolvedTintColor());
        }
        ColorStateList colorStateListOrNull = DrawableUtils.getColorStateListOrNull(drawable);
        if (colorStateListOrNull != null) {
            return Integer.valueOf(colorStateListOrNull.getDefaultColor());
        }
        return null;
    }

    @Nullable
    private View findLiftOnScrollTargetView(@Nullable View view) {
        int i8;
        View view2;
        if (this.liftOnScrollTargetView == null && (i8 = this.liftOnScrollTargetViewId) != -1) {
            if (view != null) {
                view2 = view.findViewById(i8);
            } else {
                view2 = null;
            }
            if (view2 == null && (getParent() instanceof ViewGroup)) {
                view2 = ((ViewGroup) getParent()).findViewById(this.liftOnScrollTargetViewId);
            }
            if (view2 != null) {
                this.liftOnScrollTargetView = new WeakReference<>(view2);
            }
        }
        WeakReference<View> weakReference = this.liftOnScrollTargetView;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    private boolean hasCollapsibleChild() {
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            if (((LayoutParams) getChildAt(i8).getLayoutParams()).isCollapsible()) {
                return true;
            }
        }
        return false;
    }

    private void initializeLiftOnScrollWithColor(final MaterialShapeDrawable materialShapeDrawable, @NonNull final ColorStateList colorStateList, @NonNull final ColorStateList colorStateList2) {
        final Integer colorOrNull = MaterialColors.getColorOrNull(getContext(), R.attr.colorSurface);
        this.liftOnScrollColorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AppBarLayout.this.lambda$initializeLiftOnScrollWithColor$0(colorStateList, colorStateList2, materialShapeDrawable, colorOrNull, valueAnimator);
            }
        };
        ViewCompat.setBackground(this, materialShapeDrawable);
    }

    private void initializeLiftOnScrollWithElevation(Context context, final MaterialShapeDrawable materialShapeDrawable) {
        materialShapeDrawable.initializeElevationOverlay(context);
        this.liftOnScrollColorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AppBarLayout.this.lambda$initializeLiftOnScrollWithElevation$1(materialShapeDrawable, valueAnimator);
            }
        };
        ViewCompat.setBackground(this, materialShapeDrawable);
    }

    private void invalidateScrollRanges() {
        BaseBehavior.SavedState savedState;
        Behavior behavior = this.behavior;
        if (behavior != null && this.totalScrollRange != -1 && this.pendingAction == 0) {
            savedState = behavior.saveScrollState(AbsSavedState.EMPTY_STATE, this);
        } else {
            savedState = null;
        }
        this.totalScrollRange = -1;
        this.downPreScrollRange = -1;
        this.downScrollRange = -1;
        if (savedState != null) {
            this.behavior.restoreScrollState(savedState, false);
        }
    }

    private boolean isLiftOnScrollCompatibleBackground() {
        return getBackground() instanceof MaterialShapeDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initializeLiftOnScrollWithColor$0(ColorStateList colorStateList, ColorStateList colorStateList2, MaterialShapeDrawable materialShapeDrawable, Integer num, ValueAnimator valueAnimator) {
        Integer num2;
        int layer = MaterialColors.layer(colorStateList.getDefaultColor(), colorStateList2.getDefaultColor(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
        materialShapeDrawable.setFillColor(ColorStateList.valueOf(layer));
        if (this.statusBarForeground != null && (num2 = this.statusBarForegroundOriginalColor) != null && num2.equals(num)) {
            DrawableCompat.setTint(this.statusBarForeground, layer);
        }
        if (!this.liftOnScrollListeners.isEmpty()) {
            for (LiftOnScrollListener liftOnScrollListener : this.liftOnScrollListeners) {
                if (materialShapeDrawable.getFillColor() != null) {
                    liftOnScrollListener.onUpdate(0.0f, layer);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initializeLiftOnScrollWithElevation$1(MaterialShapeDrawable materialShapeDrawable, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        materialShapeDrawable.setElevation(floatValue);
        Drawable drawable = this.statusBarForeground;
        if (drawable instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable) drawable).setElevation(floatValue);
        }
        Iterator<LiftOnScrollListener> it = this.liftOnScrollListeners.iterator();
        while (it.hasNext()) {
            it.next().onUpdate(floatValue, materialShapeDrawable.getResolvedTintColor());
        }
    }

    private boolean setLiftableState(boolean z8) {
        if (this.liftable != z8) {
            this.liftable = z8;
            refreshDrawableState();
            return true;
        }
        return false;
    }

    private boolean shouldDrawStatusBarForeground() {
        if (this.statusBarForeground != null && getTopInset() > 0) {
            return true;
        }
        return false;
    }

    private boolean shouldOffsetFirstChild() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8 || ViewCompat.getFitsSystemWindows(childAt)) {
            return false;
        }
        return true;
    }

    private void startLiftOnScrollColorAnimation(float f8, float f9) {
        ValueAnimator valueAnimator = this.liftOnScrollColorAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f8, f9);
        this.liftOnScrollColorAnimator = ofFloat;
        ofFloat.setDuration(this.liftOnScrollColorDuration);
        this.liftOnScrollColorAnimator.setInterpolator(this.liftOnScrollColorInterpolator);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.liftOnScrollColorUpdateListener;
        if (animatorUpdateListener != null) {
            this.liftOnScrollColorAnimator.addUpdateListener(animatorUpdateListener);
        }
        this.liftOnScrollColorAnimator.start();
    }

    private void updateWillNotDraw() {
        setWillNotDraw(!shouldDrawStatusBarForeground());
    }

    public void addLiftOnScrollListener(@NonNull LiftOnScrollListener liftOnScrollListener) {
        this.liftOnScrollListeners.add(liftOnScrollListener);
    }

    public void addOnOffsetChangedListener(@Nullable BaseOnOffsetChangedListener baseOnOffsetChangedListener) {
        if (this.listeners == null) {
            this.listeners = new ArrayList();
        }
        if (baseOnOffsetChangedListener == null || this.listeners.contains(baseOnOffsetChangedListener)) {
            return;
        }
        this.listeners.add(baseOnOffsetChangedListener);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void clearLiftOnScrollListener() {
        this.liftOnScrollListeners.clear();
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        if (shouldDrawStatusBarForeground()) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.currentOffset);
            this.statusBarForeground.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.statusBarForeground;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NonNull
    public CoordinatorLayout.Behavior<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.behavior = behavior;
        return behavior;
    }

    int getDownNestedPreScrollRange() {
        int i8;
        int minimumHeight;
        int i9 = this.downPreScrollRange;
        if (i9 != -1) {
            return i9;
        }
        int i10 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i11 = layoutParams.scrollFlags;
                if ((i11 & 5) == 5) {
                    int i12 = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                    if ((i11 & 8) != 0) {
                        minimumHeight = ViewCompat.getMinimumHeight(childAt);
                    } else if ((i11 & 2) != 0) {
                        minimumHeight = measuredHeight - ViewCompat.getMinimumHeight(childAt);
                    } else {
                        i8 = i12 + measuredHeight;
                        if (childCount == 0 && ViewCompat.getFitsSystemWindows(childAt)) {
                            i8 = Math.min(i8, measuredHeight - getTopInset());
                        }
                        i10 += i8;
                    }
                    i8 = i12 + minimumHeight;
                    if (childCount == 0) {
                        i8 = Math.min(i8, measuredHeight - getTopInset());
                    }
                    i10 += i8;
                } else if (i10 > 0) {
                    break;
                }
            }
        }
        int max = Math.max(0, i10);
        this.downPreScrollRange = max;
        return max;
    }

    int getDownNestedScrollRange() {
        int i8 = this.downScrollRange;
        if (i8 != -1) {
            return i8;
        }
        int childCount = getChildCount();
        int i9 = 0;
        int i10 = 0;
        while (true) {
            if (i9 >= childCount) {
                break;
            }
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                int i11 = layoutParams.scrollFlags;
                if ((i11 & 1) == 0) {
                    break;
                }
                i10 += measuredHeight;
                if ((i11 & 2) != 0) {
                    i10 -= ViewCompat.getMinimumHeight(childAt);
                    break;
                }
            }
            i9++;
        }
        int max = Math.max(0, i10);
        this.downScrollRange = max;
        return max;
    }

    @IdRes
    public int getLiftOnScrollTargetViewId() {
        return this.liftOnScrollTargetViewId;
    }

    @Nullable
    public MaterialShapeDrawable getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof MaterialShapeDrawable) {
            return (MaterialShapeDrawable) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int minimumHeight = ViewCompat.getMinimumHeight(this);
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            if (childCount >= 1) {
                minimumHeight = ViewCompat.getMinimumHeight(getChildAt(childCount - 1));
            } else {
                minimumHeight = 0;
            }
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return (minimumHeight * 2) + topInset;
    }

    int getPendingAction() {
        return this.pendingAction;
    }

    @Nullable
    public Drawable getStatusBarForeground() {
        return this.statusBarForeground;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    @VisibleForTesting
    final int getTopInset() {
        WindowInsetsCompat windowInsetsCompat = this.lastInsets;
        if (windowInsetsCompat != null) {
            return windowInsetsCompat.getSystemWindowInsetTop();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i8 = this.totalScrollRange;
        if (i8 != -1) {
            return i8;
        }
        int childCount = getChildCount();
        int i9 = 0;
        int i10 = 0;
        while (true) {
            if (i9 >= childCount) {
                break;
            }
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i11 = layoutParams.scrollFlags;
                if ((i11 & 1) == 0) {
                    break;
                }
                i10 += measuredHeight + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                if (i9 == 0 && ViewCompat.getFitsSystemWindows(childAt)) {
                    i10 -= getTopInset();
                }
                if ((i11 & 2) != 0) {
                    i10 -= ViewCompat.getMinimumHeight(childAt);
                    break;
                }
            }
            i9++;
        }
        int max = Math.max(0, i10);
        this.totalScrollRange = max;
        return max;
    }

    int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    boolean hasChildWithInterpolator() {
        return this.haveChildWithInterpolator;
    }

    boolean hasScrollableChildren() {
        if (getTotalScrollRange() != 0) {
            return true;
        }
        return false;
    }

    public boolean isLiftOnScroll() {
        return this.liftOnScroll;
    }

    public boolean isLifted() {
        return this.lifted;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i8) {
        int i9;
        int i10;
        if (this.tmpStatesArray == null) {
            this.tmpStatesArray = new int[4];
        }
        int[] iArr = this.tmpStatesArray;
        int[] onCreateDrawableState = super.onCreateDrawableState(i8 + iArr.length);
        boolean z8 = this.liftable;
        int i11 = R.attr.state_liftable;
        if (!z8) {
            i11 = -i11;
        }
        iArr[0] = i11;
        if (z8 && this.lifted) {
            i9 = R.attr.state_lifted;
        } else {
            i9 = -R.attr.state_lifted;
        }
        iArr[1] = i9;
        int i12 = R.attr.state_collapsible;
        if (!z8) {
            i12 = -i12;
        }
        iArr[2] = i12;
        if (z8 && this.lifted) {
            i10 = R.attr.state_collapsed;
        } else {
            i10 = -R.attr.state_collapsed;
        }
        iArr[3] = i10;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearLiftOnScrollTargetView();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        super.onLayout(z8, i8, i9, i10, i11);
        boolean z9 = true;
        if (ViewCompat.getFitsSystemWindows(this) && shouldOffsetFirstChild()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                ViewCompat.offsetTopAndBottom(getChildAt(childCount), topInset);
            }
        }
        invalidateScrollRanges();
        this.haveChildWithInterpolator = false;
        int childCount2 = getChildCount();
        int i12 = 0;
        while (true) {
            if (i12 >= childCount2) {
                break;
            }
            if (((LayoutParams) getChildAt(i12).getLayoutParams()).getScrollInterpolator() != null) {
                this.haveChildWithInterpolator = true;
                break;
            }
            i12++;
        }
        Drawable drawable = this.statusBarForeground;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.liftableOverride) {
            if (!this.liftOnScroll && !hasCollapsibleChild()) {
                z9 = false;
            }
            setLiftableState(z9);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i8, int i9) {
        super.onMeasure(i8, i9);
        int mode = View.MeasureSpec.getMode(i9);
        if (mode != 1073741824 && ViewCompat.getFitsSystemWindows(this) && shouldOffsetFirstChild()) {
            int measuredHeight = getMeasuredHeight();
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    measuredHeight += getTopInset();
                }
            } else {
                measuredHeight = MathUtils.clamp(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i9));
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        invalidateScrollRanges();
    }

    void onOffsetChanged(int i8) {
        this.currentOffset = i8;
        if (!willNotDraw()) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
        List<BaseOnOffsetChangedListener> list = this.listeners;
        if (list != null) {
            int size = list.size();
            for (int i9 = 0; i9 < size; i9++) {
                BaseOnOffsetChangedListener baseOnOffsetChangedListener = this.listeners.get(i9);
                if (baseOnOffsetChangedListener != null) {
                    baseOnOffsetChangedListener.onOffsetChanged(this, i8);
                }
            }
        }
    }

    WindowInsetsCompat onWindowInsetChanged(WindowInsetsCompat windowInsetsCompat) {
        WindowInsetsCompat windowInsetsCompat2;
        if (ViewCompat.getFitsSystemWindows(this)) {
            windowInsetsCompat2 = windowInsetsCompat;
        } else {
            windowInsetsCompat2 = null;
        }
        if (!ObjectsCompat.equals(this.lastInsets, windowInsetsCompat2)) {
            this.lastInsets = windowInsetsCompat2;
            updateWillNotDraw();
            requestLayout();
        }
        return windowInsetsCompat;
    }

    public boolean removeLiftOnScrollListener(@NonNull LiftOnScrollListener liftOnScrollListener) {
        return this.liftOnScrollListeners.remove(liftOnScrollListener);
    }

    public void removeOnOffsetChangedListener(@Nullable BaseOnOffsetChangedListener baseOnOffsetChangedListener) {
        List<BaseOnOffsetChangedListener> list = this.listeners;
        if (list == null || baseOnOffsetChangedListener == null) {
            return;
        }
        list.remove(baseOnOffsetChangedListener);
    }

    void resetPendingAction() {
        this.pendingAction = 0;
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f8) {
        super.setElevation(f8);
        MaterialShapeUtils.setElevation(this, f8);
    }

    public void setExpanded(boolean z8) {
        setExpanded(z8, ViewCompat.isLaidOut(this));
    }

    public void setLiftOnScroll(boolean z8) {
        this.liftOnScroll = z8;
    }

    public void setLiftOnScrollTargetView(@Nullable View view) {
        this.liftOnScrollTargetViewId = -1;
        if (view == null) {
            clearLiftOnScrollTargetView();
        } else {
            this.liftOnScrollTargetView = new WeakReference<>(view);
        }
    }

    public void setLiftOnScrollTargetViewId(@IdRes int i8) {
        this.liftOnScrollTargetViewId = i8;
        clearLiftOnScrollTargetView();
    }

    public boolean setLiftable(boolean z8) {
        this.liftableOverride = true;
        return setLiftableState(z8);
    }

    public void setLiftableOverrideEnabled(boolean z8) {
        this.liftableOverride = z8;
    }

    public boolean setLifted(boolean z8) {
        return setLiftedState(z8, true);
    }

    boolean setLiftedState(boolean z8) {
        return setLiftedState(z8, !this.liftableOverride);
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i8) {
        if (i8 == 1) {
            super.setOrientation(i8);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(@Nullable Drawable drawable) {
        boolean z8;
        Drawable drawable2 = this.statusBarForeground;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.statusBarForeground = drawable3;
            this.statusBarForegroundOriginalColor = extractStatusBarForegroundColor();
            Drawable drawable4 = this.statusBarForeground;
            if (drawable4 != null) {
                if (drawable4.isStateful()) {
                    this.statusBarForeground.setState(getDrawableState());
                }
                DrawableCompat.setLayoutDirection(this.statusBarForeground, ViewCompat.getLayoutDirection(this));
                Drawable drawable5 = this.statusBarForeground;
                if (getVisibility() == 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                drawable5.setVisible(z8, false);
                this.statusBarForeground.setCallback(this);
            }
            updateWillNotDraw();
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void setStatusBarForegroundColor(@ColorInt int i8) {
        setStatusBarForeground(new ColorDrawable(i8));
    }

    public void setStatusBarForegroundResource(@DrawableRes int i8) {
        setStatusBarForeground(AppCompatResources.getDrawable(getContext(), i8));
    }

    @Deprecated
    public void setTargetElevation(float f8) {
        ViewUtilsLollipop.setDefaultAppBarLayoutStateListAnimator(this, f8);
    }

    @Override // android.view.View
    public void setVisibility(int i8) {
        boolean z8;
        super.setVisibility(i8);
        if (i8 == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        Drawable drawable = this.statusBarForeground;
        if (drawable != null) {
            drawable.setVisible(z8, false);
        }
    }

    boolean shouldLift(@Nullable View view) {
        View findLiftOnScrollTargetView = findLiftOnScrollTargetView(view);
        if (findLiftOnScrollTargetView != null) {
            view = findLiftOnScrollTargetView;
        }
        if (view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(@NonNull Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.statusBarForeground) {
            return false;
        }
        return true;
    }

    public AppBarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.appBarLayoutStyle);
    }

    public void setExpanded(boolean z8, boolean z9) {
        setExpanded(z8, z9, true);
    }

    boolean setLiftedState(boolean z8, boolean z9) {
        if (!z9 || this.lifted == z8) {
            return false;
        }
        this.lifted = z8;
        refreshDrawableState();
        if (!isLiftOnScrollCompatibleBackground()) {
            return true;
        }
        if (this.hasLiftOnScrollColor) {
            startLiftOnScrollColorAnimation(z8 ? 0.0f : 1.0f, z8 ? 1.0f : 0.0f);
            return true;
        }
        if (!this.liftOnScroll) {
            return true;
        }
        startLiftOnScrollColorAnimation(z8 ? 0.0f : this.appBarElevation, z8 ? this.appBarElevation : 0.0f);
        return true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AppBarLayout(@androidx.annotation.NonNull android.content.Context r11, @androidx.annotation.Nullable android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            int r4 = com.google.android.material.appbar.AppBarLayout.DEF_STYLE_RES
            android.content.Context r11 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r11, r12, r13, r4)
            r10.<init>(r11, r12, r13)
            r11 = -1
            r10.totalScrollRange = r11
            r10.downPreScrollRange = r11
            r10.downScrollRange = r11
            r6 = 0
            r10.pendingAction = r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.liftOnScrollListeners = r0
            android.content.Context r7 = r10.getContext()
            r8 = 1
            r10.setOrientation(r8)
            int r9 = android.os.Build.VERSION.SDK_INT
            android.view.ViewOutlineProvider r0 = r10.getOutlineProvider()
            android.view.ViewOutlineProvider r1 = android.view.ViewOutlineProvider.BACKGROUND
            if (r0 != r1) goto L2f
            com.google.android.material.appbar.ViewUtilsLollipop.setBoundsViewOutlineProvider(r10)
        L2f:
            com.google.android.material.appbar.ViewUtilsLollipop.setStateListAnimatorFromAttrs(r10, r12, r13, r4)
            int[] r2 = com.google.android.material.R.styleable.AppBarLayout
            int[] r5 = new int[r6]
            r0 = r7
            r1 = r12
            r3 = r13
            android.content.res.TypedArray r12 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r0, r1, r2, r3, r4, r5)
            int r13 = com.google.android.material.R.styleable.AppBarLayout_android_background
            android.graphics.drawable.Drawable r13 = r12.getDrawable(r13)
            androidx.core.view.ViewCompat.setBackground(r10, r13)
            int r13 = com.google.android.material.R.styleable.AppBarLayout_liftOnScrollColor
            android.content.res.ColorStateList r13 = com.google.android.material.resources.MaterialResources.getColorStateList(r7, r12, r13)
            if (r13 == 0) goto L4f
            goto L50
        L4f:
            r8 = 0
        L50:
            r10.hasLiftOnScrollColor = r8
            android.graphics.drawable.Drawable r0 = r10.getBackground()
            android.content.res.ColorStateList r0 = com.google.android.material.drawable.DrawableUtils.getColorStateListOrNull(r0)
            if (r0 == 0) goto L6d
            com.google.android.material.shape.MaterialShapeDrawable r1 = new com.google.android.material.shape.MaterialShapeDrawable
            r1.<init>()
            r1.setFillColor(r0)
            if (r13 == 0) goto L6a
            r10.initializeLiftOnScrollWithColor(r1, r0, r13)
            goto L6d
        L6a:
            r10.initializeLiftOnScrollWithElevation(r7, r1)
        L6d:
            int r13 = com.google.android.material.R.attr.motionDurationMedium2
            android.content.res.Resources r0 = r10.getResources()
            int r1 = com.google.android.material.R.integer.app_bar_elevation_anim_duration
            int r0 = r0.getInteger(r1)
            int r13 = com.google.android.material.motion.MotionUtils.resolveThemeDuration(r7, r13, r0)
            long r0 = (long) r13
            r10.liftOnScrollColorDuration = r0
            int r13 = com.google.android.material.R.attr.motionEasingStandardInterpolator
            android.animation.TimeInterpolator r0 = com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR
            android.animation.TimeInterpolator r13 = com.google.android.material.motion.MotionUtils.resolveThemeInterpolator(r7, r13, r0)
            r10.liftOnScrollColorInterpolator = r13
            int r13 = com.google.android.material.R.styleable.AppBarLayout_expanded
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L99
            boolean r13 = r12.getBoolean(r13, r6)
            r10.setExpanded(r13, r6, r6)
        L99:
            int r13 = com.google.android.material.R.styleable.AppBarLayout_elevation
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto La9
            int r13 = r12.getDimensionPixelSize(r13, r6)
            float r13 = (float) r13
            com.google.android.material.appbar.ViewUtilsLollipop.setDefaultAppBarLayoutStateListAnimator(r10, r13)
        La9:
            r13 = 26
            if (r9 < r13) goto Lcb
            int r13 = com.google.android.material.R.styleable.AppBarLayout_android_keyboardNavigationCluster
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto Lbc
            boolean r13 = r12.getBoolean(r13, r6)
            com.google.android.material.appbar.a.a(r10, r13)
        Lbc:
            int r13 = com.google.android.material.R.styleable.AppBarLayout_android_touchscreenBlocksFocus
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto Lcb
            boolean r13 = r12.getBoolean(r13, r6)
            r10.setTouchscreenBlocksFocus(r13)
        Lcb:
            android.content.res.Resources r13 = r10.getResources()
            int r0 = com.google.android.material.R.dimen.design_appbar_elevation
            float r13 = r13.getDimension(r0)
            r10.appBarElevation = r13
            int r13 = com.google.android.material.R.styleable.AppBarLayout_liftOnScroll
            boolean r13 = r12.getBoolean(r13, r6)
            r10.liftOnScroll = r13
            int r13 = com.google.android.material.R.styleable.AppBarLayout_liftOnScrollTargetViewId
            int r11 = r12.getResourceId(r13, r11)
            r10.liftOnScrollTargetViewId = r11
            int r11 = com.google.android.material.R.styleable.AppBarLayout_statusBarForeground
            android.graphics.drawable.Drawable r11 = r12.getDrawable(r11)
            r10.setStatusBarForeground(r11)
            r12.recycle()
            com.google.android.material.appbar.AppBarLayout$1 r11 = new com.google.android.material.appbar.AppBarLayout$1
            r11.<init>()
            androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private void setExpanded(boolean z8, boolean z9, boolean z10) {
        this.pendingAction = (z8 ? 1 : 2) | (z9 ? 4 : 0) | (z10 ? 8 : 0);
        requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -2);
    }

    public void removeOnOffsetChangedListener(OnOffsetChangedListener onOffsetChangedListener) {
        removeOnOffsetChangedListener((BaseOnOffsetChangedListener) onOffsetChangedListener);
    }

    public void addOnOffsetChangedListener(OnOffsetChangedListener onOffsetChangedListener) {
        addOnOffsetChangedListener((BaseOnOffsetChangedListener) onOffsetChangedListener);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new LayoutParams((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }
}
