package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public class PagerSnapHelper extends SnapHelper {
    private static final int MAX_SCROLL_ON_FLING_DURATION = 100;

    @Nullable
    private OrientationHelper mHorizontalHelper;

    @Nullable
    private OrientationHelper mVerticalHelper;

    private int distanceToCenter(@NonNull View view, OrientationHelper orientationHelper) {
        return (orientationHelper.getDecoratedStart(view) + (orientationHelper.getDecoratedMeasurement(view) / 2)) - (orientationHelper.getStartAfterPadding() + (orientationHelper.getTotalSpace() / 2));
    }

    @Nullable
    private View findCenterView(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper) {
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int startAfterPadding = orientationHelper.getStartAfterPadding() + (orientationHelper.getTotalSpace() / 2);
        int i8 = Integer.MAX_VALUE;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = layoutManager.getChildAt(i9);
            int abs = Math.abs((orientationHelper.getDecoratedStart(childAt) + (orientationHelper.getDecoratedMeasurement(childAt) / 2)) - startAfterPadding);
            if (abs < i8) {
                view = childAt;
                i8 = abs;
            }
        }
        return view;
    }

    @NonNull
    private OrientationHelper getHorizontalHelper(@NonNull RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.mHorizontalHelper;
        if (orientationHelper == null || orientationHelper.mLayoutManager != layoutManager) {
            this.mHorizontalHelper = OrientationHelper.createHorizontalHelper(layoutManager);
        }
        return this.mHorizontalHelper;
    }

    @Nullable
    private OrientationHelper getOrientationHelper(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.canScrollVertically()) {
            return getVerticalHelper(layoutManager);
        }
        if (layoutManager.canScrollHorizontally()) {
            return getHorizontalHelper(layoutManager);
        }
        return null;
    }

    @NonNull
    private OrientationHelper getVerticalHelper(@NonNull RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.mVerticalHelper;
        if (orientationHelper == null || orientationHelper.mLayoutManager != layoutManager) {
            this.mVerticalHelper = OrientationHelper.createVerticalHelper(layoutManager);
        }
        return this.mVerticalHelper;
    }

    private boolean isForwardFling(RecyclerView.LayoutManager layoutManager, int i8, int i9) {
        if (layoutManager.canScrollHorizontally()) {
            if (i8 <= 0) {
                return false;
            }
            return true;
        }
        if (i9 <= 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean isReverseLayout(RecyclerView.LayoutManager layoutManager) {
        PointF computeScrollVectorForPosition;
        int itemCount = layoutManager.getItemCount();
        if (!(layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) || (computeScrollVectorForPosition = ((RecyclerView.SmoothScroller.ScrollVectorProvider) layoutManager).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return false;
        }
        if (computeScrollVectorForPosition.x >= 0.0f && computeScrollVectorForPosition.y >= 0.0f) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    @Nullable
    public int[] calculateDistanceToFinalSnap(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull View view) {
        int[] iArr = new int[2];
        if (layoutManager.canScrollHorizontally()) {
            iArr[0] = distanceToCenter(view, getHorizontalHelper(layoutManager));
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.canScrollVertically()) {
            iArr[1] = distanceToCenter(view, getVerticalHelper(layoutManager));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    @Nullable
    protected RecyclerView.SmoothScroller createScroller(@NonNull RecyclerView.LayoutManager layoutManager) {
        if (!(layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider)) {
            return null;
        }
        return new LinearSmoothScroller(this.mRecyclerView.getContext()) { // from class: androidx.recyclerview.widget.PagerSnapHelper.1
            @Override // androidx.recyclerview.widget.LinearSmoothScroller
            protected float calculateSpeedPerPixel(@NonNull DisplayMetrics displayMetrics) {
                return 100.0f / displayMetrics.densityDpi;
            }

            @Override // androidx.recyclerview.widget.LinearSmoothScroller
            protected int calculateTimeForScrolling(int i8) {
                return Math.min(100, super.calculateTimeForScrolling(i8));
            }

            @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
            protected void onTargetFound(@NonNull View view, @NonNull RecyclerView.State state, @NonNull RecyclerView.SmoothScroller.Action action) {
                PagerSnapHelper pagerSnapHelper = PagerSnapHelper.this;
                int[] calculateDistanceToFinalSnap = pagerSnapHelper.calculateDistanceToFinalSnap(pagerSnapHelper.mRecyclerView.getLayoutManager(), view);
                int i8 = calculateDistanceToFinalSnap[0];
                int i9 = calculateDistanceToFinalSnap[1];
                int calculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i8), Math.abs(i9)));
                if (calculateTimeForDeceleration > 0) {
                    action.update(i8, i9, calculateTimeForDeceleration, this.mDecelerateInterpolator);
                }
            }
        };
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    @Nullable
    @SuppressLint({"UnknownNullness"})
    public View findSnapView(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.canScrollVertically()) {
            return findCenterView(layoutManager, getVerticalHelper(layoutManager));
        }
        if (layoutManager.canScrollHorizontally()) {
            return findCenterView(layoutManager, getHorizontalHelper(layoutManager));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    @SuppressLint({"UnknownNullness"})
    public int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i8, int i9) {
        OrientationHelper orientationHelper;
        int i10;
        int itemCount = layoutManager.getItemCount();
        if (itemCount == 0 || (orientationHelper = getOrientationHelper(layoutManager)) == null) {
            return -1;
        }
        int childCount = layoutManager.getChildCount();
        View view = null;
        View view2 = null;
        int i11 = Integer.MIN_VALUE;
        int i12 = Integer.MAX_VALUE;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = layoutManager.getChildAt(i13);
            if (childAt != null) {
                int distanceToCenter = distanceToCenter(childAt, orientationHelper);
                if (distanceToCenter <= 0 && distanceToCenter > i11) {
                    view2 = childAt;
                    i11 = distanceToCenter;
                }
                if (distanceToCenter >= 0 && distanceToCenter < i12) {
                    view = childAt;
                    i12 = distanceToCenter;
                }
            }
        }
        boolean isForwardFling = isForwardFling(layoutManager, i8, i9);
        if (isForwardFling && view != null) {
            return layoutManager.getPosition(view);
        }
        if (!isForwardFling && view2 != null) {
            return layoutManager.getPosition(view2);
        }
        if (isForwardFling) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int position = layoutManager.getPosition(view);
        if (isReverseLayout(layoutManager) == isForwardFling) {
            i10 = -1;
        } else {
            i10 = 1;
        }
        int i14 = position + i10;
        if (i14 < 0 || i14 >= itemCount) {
            return -1;
        }
        return i14;
    }
}
