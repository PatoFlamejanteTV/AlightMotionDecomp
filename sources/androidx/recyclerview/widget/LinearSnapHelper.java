package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public class LinearSnapHelper extends SnapHelper {
    private static final float INVALID_DISTANCE = 1.0f;

    @Nullable
    private OrientationHelper mHorizontalHelper;

    @Nullable
    private OrientationHelper mVerticalHelper;

    private float computeDistancePerChild(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper) {
        int childCount = layoutManager.getChildCount();
        if (childCount == 0) {
            return 1.0f;
        }
        View view = null;
        View view2 = null;
        int i8 = Integer.MAX_VALUE;
        int i9 = Integer.MIN_VALUE;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = layoutManager.getChildAt(i10);
            int position = layoutManager.getPosition(childAt);
            if (position != -1) {
                if (position < i8) {
                    view = childAt;
                    i8 = position;
                }
                if (position > i9) {
                    view2 = childAt;
                    i9 = position;
                }
            }
        }
        if (view == null || view2 == null) {
            return 1.0f;
        }
        int max = Math.max(orientationHelper.getDecoratedEnd(view), orientationHelper.getDecoratedEnd(view2)) - Math.min(orientationHelper.getDecoratedStart(view), orientationHelper.getDecoratedStart(view2));
        if (max == 0) {
            return 1.0f;
        }
        return (max * 1.0f) / ((i9 - i8) + 1);
    }

    private int distanceToCenter(@NonNull View view, OrientationHelper orientationHelper) {
        return (orientationHelper.getDecoratedStart(view) + (orientationHelper.getDecoratedMeasurement(view) / 2)) - (orientationHelper.getStartAfterPadding() + (orientationHelper.getTotalSpace() / 2));
    }

    private int estimateNextPositionDiffForFling(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper, int i8, int i9) {
        int i10;
        int[] calculateScrollDistance = calculateScrollDistance(i8, i9);
        float computeDistancePerChild = computeDistancePerChild(layoutManager, orientationHelper);
        if (computeDistancePerChild <= 0.0f) {
            return 0;
        }
        if (Math.abs(calculateScrollDistance[0]) > Math.abs(calculateScrollDistance[1])) {
            i10 = calculateScrollDistance[0];
        } else {
            i10 = calculateScrollDistance[1];
        }
        return Math.round(i10 / computeDistancePerChild);
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

    @NonNull
    private OrientationHelper getVerticalHelper(@NonNull RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.mVerticalHelper;
        if (orientationHelper == null || orientationHelper.mLayoutManager != layoutManager) {
            this.mVerticalHelper = OrientationHelper.createVerticalHelper(layoutManager);
        }
        return this.mVerticalHelper;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
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
    public View findSnapView(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.canScrollVertically()) {
            return findCenterView(layoutManager, getVerticalHelper(layoutManager));
        }
        if (layoutManager.canScrollHorizontally()) {
            return findCenterView(layoutManager, getHorizontalHelper(layoutManager));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.SnapHelper
    public int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i8, int i9) {
        int itemCount;
        View findSnapView;
        int position;
        int i10;
        PointF computeScrollVectorForPosition;
        int i11;
        int i12;
        if (!(layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) || (itemCount = layoutManager.getItemCount()) == 0 || (findSnapView = findSnapView(layoutManager)) == null || (position = layoutManager.getPosition(findSnapView)) == -1 || (computeScrollVectorForPosition = ((RecyclerView.SmoothScroller.ScrollVectorProvider) layoutManager).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return -1;
        }
        int i13 = 0;
        if (layoutManager.canScrollHorizontally()) {
            i11 = estimateNextPositionDiffForFling(layoutManager, getHorizontalHelper(layoutManager), i8, 0);
            if (computeScrollVectorForPosition.x < 0.0f) {
                i11 = -i11;
            }
        } else {
            i11 = 0;
        }
        if (layoutManager.canScrollVertically()) {
            i12 = estimateNextPositionDiffForFling(layoutManager, getVerticalHelper(layoutManager), 0, i9);
            if (computeScrollVectorForPosition.y < 0.0f) {
                i12 = -i12;
            }
        } else {
            i12 = 0;
        }
        if (layoutManager.canScrollVertically()) {
            i11 = i12;
        }
        if (i11 == 0) {
            return -1;
        }
        int i14 = position + i11;
        if (i14 >= 0) {
            i13 = i14;
        }
        if (i13 < itemCount) {
            return i13;
        }
        return i10;
    }
}
