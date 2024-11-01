package com.google.android.material.carousel;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

/* loaded from: classes3.dex */
public class CarouselSnapHelper extends SnapHelper {
    private static final float HORIZONTAL_SNAP_SPEED = 100.0f;
    private static final float VERTICAL_SNAP_SPEED = 50.0f;
    private final boolean disableFling;
    private RecyclerView recyclerView;

    public CarouselSnapHelper() {
        this(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] calculateDistanceToSnap(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull View view, boolean z8) {
        if (!(layoutManager instanceof CarouselLayoutManager)) {
            return new int[]{0, 0};
        }
        int distanceToFirstFocalKeyline = distanceToFirstFocalKeyline(view, (CarouselLayoutManager) layoutManager, z8);
        if (layoutManager.canScrollHorizontally()) {
            return new int[]{distanceToFirstFocalKeyline, 0};
        }
        if (layoutManager.canScrollVertically()) {
            return new int[]{0, distanceToFirstFocalKeyline};
        }
        return new int[]{0, 0};
    }

    private int distanceToFirstFocalKeyline(@NonNull View view, CarouselLayoutManager carouselLayoutManager, boolean z8) {
        return carouselLayoutManager.getOffsetToScrollToPositionForSnap(carouselLayoutManager.getPosition(view), z8);
    }

    @Nullable
    private View findViewNearestFirstKeyline(RecyclerView.LayoutManager layoutManager) {
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount != 0 && (layoutManager instanceof CarouselLayoutManager)) {
            CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) layoutManager;
            int i8 = Integer.MAX_VALUE;
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = layoutManager.getChildAt(i9);
                int abs = Math.abs(carouselLayoutManager.getOffsetToScrollToPositionForSnap(layoutManager.getPosition(childAt), false));
                if (abs < i8) {
                    view = childAt;
                    i8 = abs;
                }
            }
        }
        return view;
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
    public void attachToRecyclerView(@Nullable RecyclerView recyclerView) {
        super.attachToRecyclerView(recyclerView);
        this.recyclerView = recyclerView;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    @Nullable
    public int[] calculateDistanceToFinalSnap(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull View view) {
        return calculateDistanceToSnap(layoutManager, view, false);
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    @Nullable
    protected RecyclerView.SmoothScroller createScroller(@NonNull final RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) {
            return new LinearSmoothScroller(this.recyclerView.getContext()) { // from class: com.google.android.material.carousel.CarouselSnapHelper.1
                @Override // androidx.recyclerview.widget.LinearSmoothScroller
                protected float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                    float f8;
                    float f9;
                    if (layoutManager.canScrollVertically()) {
                        f8 = displayMetrics.densityDpi;
                        f9 = 50.0f;
                    } else {
                        f8 = displayMetrics.densityDpi;
                        f9 = 100.0f;
                    }
                    return f9 / f8;
                }

                @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
                protected void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
                    if (CarouselSnapHelper.this.recyclerView != null) {
                        CarouselSnapHelper carouselSnapHelper = CarouselSnapHelper.this;
                        int[] calculateDistanceToSnap = carouselSnapHelper.calculateDistanceToSnap(carouselSnapHelper.recyclerView.getLayoutManager(), view, true);
                        int i8 = calculateDistanceToSnap[0];
                        int i9 = calculateDistanceToSnap[1];
                        int calculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i8), Math.abs(i9)));
                        if (calculateTimeForDeceleration > 0) {
                            action.update(i8, i9, calculateTimeForDeceleration, this.mDecelerateInterpolator);
                        }
                    }
                }
            };
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    @Nullable
    public View findSnapView(RecyclerView.LayoutManager layoutManager) {
        return findViewNearestFirstKeyline(layoutManager);
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i8, int i9) {
        int itemCount;
        int i10;
        if (!this.disableFling || (itemCount = layoutManager.getItemCount()) == 0) {
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
                int distanceToFirstFocalKeyline = distanceToFirstFocalKeyline(childAt, (CarouselLayoutManager) layoutManager, false);
                if (distanceToFirstFocalKeyline <= 0 && distanceToFirstFocalKeyline > i11) {
                    view2 = childAt;
                    i11 = distanceToFirstFocalKeyline;
                }
                if (distanceToFirstFocalKeyline >= 0 && distanceToFirstFocalKeyline < i12) {
                    view = childAt;
                    i12 = distanceToFirstFocalKeyline;
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

    public CarouselSnapHelper(boolean z8) {
        this.disableFling = z8;
    }
}
