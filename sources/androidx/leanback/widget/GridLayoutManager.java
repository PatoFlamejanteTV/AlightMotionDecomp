package androidx.leanback.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.annotation.VisibleForTesting;
import androidx.collection.CircularIntArray;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.leanback.widget.Grid;
import androidx.leanback.widget.ItemAlignmentFacet;
import androidx.leanback.widget.WindowAlignment;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class GridLayoutManager extends RecyclerView.LayoutManager {
    static final boolean DEBUG = false;
    static final int DEFAULT_MAX_PENDING_MOVES = 10;
    static final int MIN_MS_SMOOTH_SCROLL_MAIN_SCREEN = 30;
    private static final int NEXT_ITEM = 1;
    private static final int NEXT_ROW = 3;
    static final int PF_FAST_RELAYOUT = 4;
    static final int PF_FAST_RELAYOUT_UPDATED_SELECTED_POSITION = 8;
    static final int PF_FOCUS_OUT_END = 4096;
    static final int PF_FOCUS_OUT_FRONT = 2048;
    static final int PF_FOCUS_OUT_MASKS = 6144;
    static final int PF_FOCUS_OUT_SIDE_END = 16384;
    static final int PF_FOCUS_OUT_SIDE_MASKS = 24576;
    static final int PF_FOCUS_OUT_SIDE_START = 8192;
    static final int PF_FOCUS_SEARCH_DISABLED = 32768;
    static final int PF_FORCE_FULL_LAYOUT = 256;
    static final int PF_IN_LAYOUT_SEARCH_FOCUS = 16;
    static final int PF_IN_SELECTION = 32;
    static final int PF_LAYOUT_EATEN_IN_SLIDING = 128;
    static final int PF_LAYOUT_ENABLED = 512;
    static final int PF_PRUNE_CHILD = 65536;
    static final int PF_REVERSE_FLOW_MASK = 786432;
    static final int PF_REVERSE_FLOW_PRIMARY = 262144;
    static final int PF_REVERSE_FLOW_SECONDARY = 524288;
    static final int PF_ROW_SECONDARY_SIZE_REFRESH = 1024;
    static final int PF_SCROLL_ENABLED = 131072;
    static final int PF_SLIDING = 64;
    static final int PF_STAGE_LAYOUT = 1;
    static final int PF_STAGE_MASK = 3;
    static final int PF_STAGE_SCROLL = 2;
    private static final int PREV_ITEM = 0;
    private static final int PREV_ROW = 2;
    private static final String TAG = "GridLayoutManager";
    static final boolean TRACE = false;
    private static final Rect sTempRect = new Rect();
    static int[] sTwoInts = new int[2];
    final BaseGridView mBaseGridView;
    GridLinearSmoothScroller mCurrentSmoothScroller;
    int[] mDisappearingPositions;
    private int mExtraLayoutSpace;
    int mExtraLayoutSpaceInPreLayout;
    private FacetProviderAdapter mFacetProviderAdapter;
    private int mFixedRowSizeSecondary;
    Grid mGrid;
    private int mHorizontalSpacing;

    @VisibleForTesting
    OnLayoutCompleteListener mLayoutCompleteListener;
    private int mMaxSizeSecondary;
    int mNumRows;
    PendingMoveSmoothScroller mPendingMoveSmoothScroller;
    int mPositionDeltaInPreLayout;
    private int mPrimaryScrollExtra;
    RecyclerView.Recycler mRecycler;
    private int[] mRowSizeSecondary;
    private int mRowSizeSecondaryRequested;
    int mScrollOffsetSecondary;
    private int mSizePrimary;
    private int mSpacingPrimary;
    private int mSpacingSecondary;
    RecyclerView.State mState;
    private int mVerticalSpacing;
    int mMaxPendingMoves = 10;
    int mOrientation = 0;
    private OrientationHelper mOrientationHelper = OrientationHelper.createHorizontalHelper(this);
    final SparseIntArray mPositionToRowInPostLayout = new SparseIntArray();
    int mFlag = 221696;
    private OnChildSelectedListener mChildSelectedListener = null;
    private ArrayList<OnChildViewHolderSelectedListener> mChildViewHolderSelectedListeners = null;
    OnChildLaidOutListener mChildLaidOutListener = null;
    int mFocusPosition = -1;
    int mSubFocusPosition = 0;
    private int mFocusPositionOffset = 0;
    private int mGravity = 8388659;
    private int mNumRowsRequested = 1;
    private int mFocusScrollStrategy = 0;
    final WindowAlignment mWindowAlignment = new WindowAlignment();
    private final ItemAlignment mItemAlignment = new ItemAlignment();
    private int[] mMeasuredDimension = new int[2];
    final ViewsStateBundle mChildrenStates = new ViewsStateBundle();
    private final Runnable mRequestLayoutRunnable = new Runnable() { // from class: androidx.leanback.widget.GridLayoutManager.1
        @Override // java.lang.Runnable
        public void run() {
            GridLayoutManager.this.requestLayout();
        }
    };
    private Grid.Provider mGridProvider = new Grid.Provider() { // from class: androidx.leanback.widget.GridLayoutManager.2
        @Override // androidx.leanback.widget.Grid.Provider
        public void addItem(Object obj, int i8, int i9, int i10, int i11) {
            int i12;
            int i13;
            long itemId;
            PendingMoveSmoothScroller pendingMoveSmoothScroller;
            View view = (View) obj;
            if (i11 == Integer.MIN_VALUE || i11 == Integer.MAX_VALUE) {
                if (!GridLayoutManager.this.mGrid.isReversedFlow()) {
                    i11 = GridLayoutManager.this.mWindowAlignment.mainAxis().getPaddingMin();
                } else {
                    i11 = GridLayoutManager.this.mWindowAlignment.mainAxis().getSize() - GridLayoutManager.this.mWindowAlignment.mainAxis().getPaddingMax();
                }
            }
            if (!GridLayoutManager.this.mGrid.isReversedFlow()) {
                i13 = i9 + i11;
                i12 = i11;
            } else {
                i12 = i11 - i9;
                i13 = i11;
            }
            int rowStartSecondary = GridLayoutManager.this.getRowStartSecondary(i10) + GridLayoutManager.this.mWindowAlignment.secondAxis().getPaddingMin();
            GridLayoutManager gridLayoutManager = GridLayoutManager.this;
            int i14 = rowStartSecondary - gridLayoutManager.mScrollOffsetSecondary;
            gridLayoutManager.mChildrenStates.loadView(view, i8);
            GridLayoutManager.this.layoutChild(i10, view, i12, i13, i14);
            if (!GridLayoutManager.this.mState.isPreLayout()) {
                GridLayoutManager.this.updateScrollLimits();
            }
            GridLayoutManager gridLayoutManager2 = GridLayoutManager.this;
            if ((gridLayoutManager2.mFlag & 3) != 1 && (pendingMoveSmoothScroller = gridLayoutManager2.mPendingMoveSmoothScroller) != null) {
                pendingMoveSmoothScroller.consumePendingMovesAfterLayout();
            }
            GridLayoutManager gridLayoutManager3 = GridLayoutManager.this;
            if (gridLayoutManager3.mChildLaidOutListener != null) {
                RecyclerView.ViewHolder childViewHolder = gridLayoutManager3.mBaseGridView.getChildViewHolder(view);
                GridLayoutManager gridLayoutManager4 = GridLayoutManager.this;
                OnChildLaidOutListener onChildLaidOutListener = gridLayoutManager4.mChildLaidOutListener;
                BaseGridView baseGridView = gridLayoutManager4.mBaseGridView;
                if (childViewHolder == null) {
                    itemId = -1;
                } else {
                    itemId = childViewHolder.getItemId();
                }
                onChildLaidOutListener.onChildLaidOut(baseGridView, view, i8, itemId);
            }
        }

        @Override // androidx.leanback.widget.Grid.Provider
        public int createItem(int i8, boolean z8, Object[] objArr, boolean z9) {
            GridLayoutManager gridLayoutManager = GridLayoutManager.this;
            View viewForPosition = gridLayoutManager.getViewForPosition(i8 - gridLayoutManager.mPositionDeltaInPreLayout);
            LayoutParams layoutParams = (LayoutParams) viewForPosition.getLayoutParams();
            layoutParams.setItemAlignmentFacet((ItemAlignmentFacet) GridLayoutManager.this.getFacet(GridLayoutManager.this.mBaseGridView.getChildViewHolder(viewForPosition), ItemAlignmentFacet.class));
            if (!layoutParams.isItemRemoved()) {
                if (z9) {
                    if (z8) {
                        GridLayoutManager.this.addDisappearingView(viewForPosition);
                    } else {
                        GridLayoutManager.this.addDisappearingView(viewForPosition, 0);
                    }
                } else if (z8) {
                    GridLayoutManager.this.addView(viewForPosition);
                } else {
                    GridLayoutManager.this.addView(viewForPosition, 0);
                }
                int i9 = GridLayoutManager.this.mChildVisibility;
                if (i9 != -1) {
                    viewForPosition.setVisibility(i9);
                }
                PendingMoveSmoothScroller pendingMoveSmoothScroller = GridLayoutManager.this.mPendingMoveSmoothScroller;
                if (pendingMoveSmoothScroller != null) {
                    pendingMoveSmoothScroller.consumePendingMovesBeforeLayout();
                }
                int subPositionByView = GridLayoutManager.this.getSubPositionByView(viewForPosition, viewForPosition.findFocus());
                GridLayoutManager gridLayoutManager2 = GridLayoutManager.this;
                int i10 = gridLayoutManager2.mFlag;
                if ((i10 & 3) != 1) {
                    if (i8 == gridLayoutManager2.mFocusPosition && subPositionByView == gridLayoutManager2.mSubFocusPosition && gridLayoutManager2.mPendingMoveSmoothScroller == null) {
                        gridLayoutManager2.dispatchChildSelected();
                    }
                } else if ((i10 & 4) == 0) {
                    if ((i10 & 16) == 0 && i8 == gridLayoutManager2.mFocusPosition && subPositionByView == gridLayoutManager2.mSubFocusPosition) {
                        gridLayoutManager2.dispatchChildSelected();
                    } else if ((i10 & 16) != 0 && i8 >= gridLayoutManager2.mFocusPosition && viewForPosition.hasFocusable()) {
                        GridLayoutManager gridLayoutManager3 = GridLayoutManager.this;
                        gridLayoutManager3.mFocusPosition = i8;
                        gridLayoutManager3.mSubFocusPosition = subPositionByView;
                        gridLayoutManager3.mFlag &= -17;
                        gridLayoutManager3.dispatchChildSelected();
                    }
                }
                GridLayoutManager.this.measureChild(viewForPosition);
            }
            objArr[0] = viewForPosition;
            GridLayoutManager gridLayoutManager4 = GridLayoutManager.this;
            if (gridLayoutManager4.mOrientation == 0) {
                return gridLayoutManager4.getDecoratedMeasuredWidthWithMargin(viewForPosition);
            }
            return gridLayoutManager4.getDecoratedMeasuredHeightWithMargin(viewForPosition);
        }

        @Override // androidx.leanback.widget.Grid.Provider
        public int getCount() {
            return GridLayoutManager.this.mState.getItemCount() + GridLayoutManager.this.mPositionDeltaInPreLayout;
        }

        @Override // androidx.leanback.widget.Grid.Provider
        public int getEdge(int i8) {
            GridLayoutManager gridLayoutManager = GridLayoutManager.this;
            View findViewByPosition = gridLayoutManager.findViewByPosition(i8 - gridLayoutManager.mPositionDeltaInPreLayout);
            GridLayoutManager gridLayoutManager2 = GridLayoutManager.this;
            if ((gridLayoutManager2.mFlag & 262144) != 0) {
                return gridLayoutManager2.getViewMax(findViewByPosition);
            }
            return gridLayoutManager2.getViewMin(findViewByPosition);
        }

        @Override // androidx.leanback.widget.Grid.Provider
        public int getMinIndex() {
            return GridLayoutManager.this.mPositionDeltaInPreLayout;
        }

        @Override // androidx.leanback.widget.Grid.Provider
        public int getSize(int i8) {
            GridLayoutManager gridLayoutManager = GridLayoutManager.this;
            return gridLayoutManager.getViewPrimarySize(gridLayoutManager.findViewByPosition(i8 - gridLayoutManager.mPositionDeltaInPreLayout));
        }

        @Override // androidx.leanback.widget.Grid.Provider
        public void removeItem(int i8) {
            GridLayoutManager gridLayoutManager = GridLayoutManager.this;
            View findViewByPosition = gridLayoutManager.findViewByPosition(i8 - gridLayoutManager.mPositionDeltaInPreLayout);
            GridLayoutManager gridLayoutManager2 = GridLayoutManager.this;
            if ((gridLayoutManager2.mFlag & 3) == 1) {
                gridLayoutManager2.detachAndScrapView(findViewByPosition, gridLayoutManager2.mRecycler);
            } else {
                gridLayoutManager2.removeAndRecycleView(findViewByPosition, gridLayoutManager2.mRecycler);
            }
        }
    };
    int mChildVisibility = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public abstract class GridLinearSmoothScroller extends LinearSmoothScroller {
        boolean mSkipOnStopInternal;

        GridLinearSmoothScroller() {
            super(GridLayoutManager.this.mBaseGridView.getContext());
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        protected int calculateTimeForScrolling(int i8) {
            int calculateTimeForScrolling = super.calculateTimeForScrolling(i8);
            if (GridLayoutManager.this.mWindowAlignment.mainAxis().getSize() > 0) {
                float size = (30.0f / GridLayoutManager.this.mWindowAlignment.mainAxis().getSize()) * i8;
                if (calculateTimeForScrolling < size) {
                    return (int) size;
                }
                return calculateTimeForScrolling;
            }
            return calculateTimeForScrolling;
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
        protected void onStop() {
            super.onStop();
            if (!this.mSkipOnStopInternal) {
                onStopInternal();
            }
            GridLayoutManager gridLayoutManager = GridLayoutManager.this;
            if (gridLayoutManager.mCurrentSmoothScroller == this) {
                gridLayoutManager.mCurrentSmoothScroller = null;
            }
            if (gridLayoutManager.mPendingMoveSmoothScroller == this) {
                gridLayoutManager.mPendingMoveSmoothScroller = null;
            }
        }

        protected void onStopInternal() {
            View findViewByPosition = findViewByPosition(getTargetPosition());
            if (findViewByPosition == null) {
                if (getTargetPosition() >= 0) {
                    GridLayoutManager.this.scrollToSelection(getTargetPosition(), 0, false, 0);
                    return;
                }
                return;
            }
            if (GridLayoutManager.this.mFocusPosition != getTargetPosition()) {
                GridLayoutManager.this.mFocusPosition = getTargetPosition();
            }
            if (GridLayoutManager.this.hasFocus()) {
                GridLayoutManager.this.mFlag |= 32;
                findViewByPosition.requestFocus();
                GridLayoutManager.this.mFlag &= -33;
            }
            GridLayoutManager.this.dispatchChildSelected();
            GridLayoutManager.this.dispatchChildSelectedAndPositioned();
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
        protected void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
            int i8;
            int i9;
            if (GridLayoutManager.this.getScrollPosition(view, null, GridLayoutManager.sTwoInts)) {
                if (GridLayoutManager.this.mOrientation == 0) {
                    int[] iArr = GridLayoutManager.sTwoInts;
                    i9 = iArr[0];
                    i8 = iArr[1];
                } else {
                    int[] iArr2 = GridLayoutManager.sTwoInts;
                    int i10 = iArr2[1];
                    i8 = iArr2[0];
                    i9 = i10;
                }
                action.update(i9, i8, calculateTimeForDeceleration((int) Math.sqrt((i9 * i9) + (i8 * i8))), this.mDecelerateInterpolator);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class LayoutParams extends RecyclerView.LayoutParams {
        private int[] mAlignMultiple;
        private int mAlignX;
        private int mAlignY;
        private ItemAlignmentFacet mAlignmentFacet;
        int mBottomInset;
        int mLeftInset;
        int mRightInset;
        int mTopInset;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        void calculateItemAlignments(int i8, View view) {
            ItemAlignmentFacet.ItemAlignmentDef[] alignmentDefs = this.mAlignmentFacet.getAlignmentDefs();
            int[] iArr = this.mAlignMultiple;
            if (iArr == null || iArr.length != alignmentDefs.length) {
                this.mAlignMultiple = new int[alignmentDefs.length];
            }
            for (int i9 = 0; i9 < alignmentDefs.length; i9++) {
                this.mAlignMultiple[i9] = ItemAlignmentFacetHelper.getAlignmentPosition(view, alignmentDefs[i9], i8);
            }
            if (i8 == 0) {
                this.mAlignX = this.mAlignMultiple[0];
            } else {
                this.mAlignY = this.mAlignMultiple[0];
            }
        }

        int[] getAlignMultiple() {
            return this.mAlignMultiple;
        }

        int getAlignX() {
            return this.mAlignX;
        }

        int getAlignY() {
            return this.mAlignY;
        }

        ItemAlignmentFacet getItemAlignmentFacet() {
            return this.mAlignmentFacet;
        }

        int getOpticalBottom(View view) {
            return view.getBottom() - this.mBottomInset;
        }

        int getOpticalBottomInset() {
            return this.mBottomInset;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int getOpticalHeight(View view) {
            return (view.getHeight() - this.mTopInset) - this.mBottomInset;
        }

        int getOpticalLeft(View view) {
            return view.getLeft() + this.mLeftInset;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int getOpticalLeftInset() {
            return this.mLeftInset;
        }

        int getOpticalRight(View view) {
            return view.getRight() - this.mRightInset;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int getOpticalRightInset() {
            return this.mRightInset;
        }

        int getOpticalTop(View view) {
            return view.getTop() + this.mTopInset;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int getOpticalTopInset() {
            return this.mTopInset;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int getOpticalWidth(View view) {
            return (view.getWidth() - this.mLeftInset) - this.mRightInset;
        }

        void setAlignX(int i8) {
            this.mAlignX = i8;
        }

        void setAlignY(int i8) {
            this.mAlignY = i8;
        }

        void setItemAlignmentFacet(ItemAlignmentFacet itemAlignmentFacet) {
            this.mAlignmentFacet = itemAlignmentFacet;
        }

        void setOpticalInsets(int i8, int i9, int i10, int i11) {
            this.mLeftInset = i8;
            this.mTopInset = i9;
            this.mRightInset = i10;
            this.mBottomInset = i11;
        }

        public LayoutParams(int i8, int i9) {
            super(i8, i9);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(RecyclerView.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((RecyclerView.LayoutParams) layoutParams);
        }
    }

    @VisibleForTesting
    /* loaded from: classes3.dex */
    public static class OnLayoutCompleteListener {
        public void onLayoutCompleted(RecyclerView.State state) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public final class PendingMoveSmoothScroller extends GridLinearSmoothScroller {
        static final int TARGET_UNDEFINED = -2;
        private int mPendingMoves;
        private final boolean mStaggeredGrid;

        PendingMoveSmoothScroller(int i8, boolean z8) {
            super();
            this.mPendingMoves = i8;
            this.mStaggeredGrid = z8;
            setTargetPosition(-2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
        public PointF computeScrollVectorForPosition(int i8) {
            int i9;
            int i10 = this.mPendingMoves;
            if (i10 == 0) {
                return null;
            }
            GridLayoutManager gridLayoutManager = GridLayoutManager.this;
            if ((gridLayoutManager.mFlag & 262144) == 0 ? i10 < 0 : i10 > 0) {
                i9 = -1;
            } else {
                i9 = 1;
            }
            if (gridLayoutManager.mOrientation == 0) {
                return new PointF(i9, 0.0f);
            }
            return new PointF(0.0f, i9);
        }

        void consumePendingMovesAfterLayout() {
            int i8;
            if (this.mStaggeredGrid && (i8 = this.mPendingMoves) != 0) {
                this.mPendingMoves = GridLayoutManager.this.processSelectionMoves(true, i8);
            }
            int i9 = this.mPendingMoves;
            if (i9 == 0 || ((i9 > 0 && GridLayoutManager.this.hasCreatedLastItem()) || (this.mPendingMoves < 0 && GridLayoutManager.this.hasCreatedFirstItem()))) {
                setTargetPosition(GridLayoutManager.this.mFocusPosition);
                stop();
            }
        }

        void consumePendingMovesBeforeLayout() {
            int i8;
            int i9;
            View findViewByPosition;
            if (!this.mStaggeredGrid && (i8 = this.mPendingMoves) != 0) {
                if (i8 > 0) {
                    GridLayoutManager gridLayoutManager = GridLayoutManager.this;
                    i9 = gridLayoutManager.mFocusPosition + gridLayoutManager.mNumRows;
                } else {
                    GridLayoutManager gridLayoutManager2 = GridLayoutManager.this;
                    i9 = gridLayoutManager2.mFocusPosition - gridLayoutManager2.mNumRows;
                }
                View view = null;
                while (this.mPendingMoves != 0 && (findViewByPosition = findViewByPosition(i9)) != null) {
                    if (GridLayoutManager.this.canScrollTo(findViewByPosition)) {
                        GridLayoutManager gridLayoutManager3 = GridLayoutManager.this;
                        gridLayoutManager3.mFocusPosition = i9;
                        gridLayoutManager3.mSubFocusPosition = 0;
                        int i10 = this.mPendingMoves;
                        if (i10 > 0) {
                            this.mPendingMoves = i10 - 1;
                        } else {
                            this.mPendingMoves = i10 + 1;
                        }
                        view = findViewByPosition;
                    }
                    if (this.mPendingMoves > 0) {
                        i9 += GridLayoutManager.this.mNumRows;
                    } else {
                        i9 -= GridLayoutManager.this.mNumRows;
                    }
                }
                if (view != null && GridLayoutManager.this.hasFocus()) {
                    GridLayoutManager.this.mFlag |= 32;
                    view.requestFocus();
                    GridLayoutManager.this.mFlag &= -33;
                }
            }
        }

        void decreasePendingMoves() {
            int i8 = this.mPendingMoves;
            if (i8 > (-GridLayoutManager.this.mMaxPendingMoves)) {
                this.mPendingMoves = i8 - 1;
            }
        }

        void increasePendingMoves() {
            int i8 = this.mPendingMoves;
            if (i8 < GridLayoutManager.this.mMaxPendingMoves) {
                this.mPendingMoves = i8 + 1;
            }
        }

        @Override // androidx.leanback.widget.GridLayoutManager.GridLinearSmoothScroller
        protected void onStopInternal() {
            super.onStopInternal();
            this.mPendingMoves = 0;
            View findViewByPosition = findViewByPosition(getTargetPosition());
            if (findViewByPosition != null) {
                GridLayoutManager.this.scrollToView(findViewByPosition, true);
            }
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        protected void updateActionForInterimTarget(RecyclerView.SmoothScroller.Action action) {
            if (this.mPendingMoves == 0) {
                return;
            }
            super.updateActionForInterimTarget(action);
        }
    }

    public GridLayoutManager(BaseGridView baseGridView) {
        this.mBaseGridView = baseGridView;
        setItemPrefetchEnabled(false);
    }

    private boolean appendOneColumnVisibleItems() {
        return this.mGrid.appendOneColumnVisibleItems();
    }

    private void appendVisibleItems() {
        int i8;
        Grid grid = this.mGrid;
        if ((this.mFlag & 262144) != 0) {
            i8 = (-this.mExtraLayoutSpace) - this.mExtraLayoutSpaceInPreLayout;
        } else {
            i8 = this.mSizePrimary + this.mExtraLayoutSpace + this.mExtraLayoutSpaceInPreLayout;
        }
        grid.appendVisibleItems(i8);
    }

    private void discardLayoutInfo() {
        this.mGrid = null;
        this.mRowSizeSecondary = null;
        this.mFlag &= -1025;
    }

    private void fastRelayout() {
        Grid.Location location;
        int decoratedMeasuredHeightWithMargin;
        int childCount = getChildCount();
        int firstVisibleIndex = this.mGrid.getFirstVisibleIndex();
        this.mFlag &= -9;
        int i8 = 0;
        while (i8 < childCount) {
            View childAt = getChildAt(i8);
            if (firstVisibleIndex == getAdapterPositionByView(childAt) && (location = this.mGrid.getLocation(firstVisibleIndex)) != null) {
                int rowStartSecondary = (getRowStartSecondary(location.row) + this.mWindowAlignment.secondAxis().getPaddingMin()) - this.mScrollOffsetSecondary;
                int viewMin = getViewMin(childAt);
                int viewPrimarySize = getViewPrimarySize(childAt);
                if (((LayoutParams) childAt.getLayoutParams()).viewNeedsUpdate()) {
                    this.mFlag |= 8;
                    detachAndScrapView(childAt, this.mRecycler);
                    childAt = getViewForPosition(firstVisibleIndex);
                    addView(childAt, i8);
                }
                View view = childAt;
                measureChild(view);
                if (this.mOrientation == 0) {
                    decoratedMeasuredHeightWithMargin = getDecoratedMeasuredWidthWithMargin(view);
                } else {
                    decoratedMeasuredHeightWithMargin = getDecoratedMeasuredHeightWithMargin(view);
                }
                layoutChild(location.row, view, viewMin, viewMin + decoratedMeasuredHeightWithMargin, rowStartSecondary);
                if (viewPrimarySize == decoratedMeasuredHeightWithMargin) {
                    i8++;
                    firstVisibleIndex++;
                }
            }
            int lastVisibleIndex = this.mGrid.getLastVisibleIndex();
            for (int i9 = childCount - 1; i9 >= i8; i9--) {
                detachAndScrapView(getChildAt(i9), this.mRecycler);
            }
            this.mGrid.invalidateItemsAfter(firstVisibleIndex);
            if ((this.mFlag & 65536) != 0) {
                appendVisibleItems();
                int i10 = this.mFocusPosition;
                if (i10 >= 0 && i10 <= lastVisibleIndex) {
                    while (this.mGrid.getLastVisibleIndex() < this.mFocusPosition) {
                        this.mGrid.appendOneColumnVisibleItems();
                    }
                }
                updateScrollLimits();
                updateSecondaryScrollLimits();
            }
            while (this.mGrid.appendOneColumnVisibleItems() && this.mGrid.getLastVisibleIndex() < lastVisibleIndex) {
            }
            updateScrollLimits();
            updateSecondaryScrollLimits();
        }
        updateScrollLimits();
        updateSecondaryScrollLimits();
    }

    private int findImmediateChildIndex(View view) {
        View findContainingItemView;
        BaseGridView baseGridView = this.mBaseGridView;
        if (baseGridView != null && view != baseGridView && (findContainingItemView = findContainingItemView(view)) != null) {
            int childCount = getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                if (getChildAt(i8) == findContainingItemView) {
                    return i8;
                }
            }
            return -1;
        }
        return -1;
    }

    private void focusToViewInLayout(boolean z8, boolean z9, int i8, int i9) {
        View findViewByPosition = findViewByPosition(this.mFocusPosition);
        if (findViewByPosition != null && z9) {
            scrollToView(findViewByPosition, false, i8, i9);
        }
        if (findViewByPosition != null && z8 && !findViewByPosition.hasFocus()) {
            findViewByPosition.requestFocus();
            return;
        }
        if (!z8 && !this.mBaseGridView.hasFocus()) {
            if (findViewByPosition != null && findViewByPosition.hasFocusable()) {
                this.mBaseGridView.focusableViewAvailable(findViewByPosition);
            } else {
                int childCount = getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 < childCount) {
                        findViewByPosition = getChildAt(i10);
                        if (findViewByPosition != null && findViewByPosition.hasFocusable()) {
                            this.mBaseGridView.focusableViewAvailable(findViewByPosition);
                            break;
                        }
                        i10++;
                    } else {
                        break;
                    }
                }
            }
            if (z9 && findViewByPosition != null && findViewByPosition.hasFocus()) {
                scrollToView(findViewByPosition, false, i8, i9);
            }
        }
    }

    private void forceRequestLayout() {
        ViewCompat.postOnAnimation(this.mBaseGridView, this.mRequestLayoutRunnable);
    }

    private int getAdapterPositionByIndex(int i8) {
        return getAdapterPositionByView(getChildAt(i8));
    }

    private int getAdapterPositionByView(View view) {
        LayoutParams layoutParams;
        if (view == null || (layoutParams = (LayoutParams) view.getLayoutParams()) == null || layoutParams.isItemRemoved()) {
            return -1;
        }
        return layoutParams.getViewAdapterPosition();
    }

    private int getAdjustedPrimaryAlignedScrollDistance(int i8, View view, View view2) {
        int subPositionByView = getSubPositionByView(view, view2);
        if (subPositionByView != 0) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            return i8 + (layoutParams.getAlignMultiple()[subPositionByView] - layoutParams.getAlignMultiple()[0]);
        }
        return i8;
    }

    private int getAdjustedViewCenter(View view) {
        View findFocus;
        if (view.hasFocus() && (findFocus = view.findFocus()) != null && findFocus != view) {
            return getAdjustedPrimaryAlignedScrollDistance(getViewCenter(view), view, findFocus);
        }
        return getViewCenter(view);
    }

    private boolean getAlignedPosition(View view, View view2, int[] iArr) {
        int primaryAlignedScrollDistance = getPrimaryAlignedScrollDistance(view);
        if (view2 != null) {
            primaryAlignedScrollDistance = getAdjustedPrimaryAlignedScrollDistance(primaryAlignedScrollDistance, view, view2);
        }
        int secondaryScrollDistance = getSecondaryScrollDistance(view);
        int i8 = primaryAlignedScrollDistance + this.mPrimaryScrollExtra;
        if (i8 == 0 && secondaryScrollDistance == 0) {
            iArr[0] = 0;
            iArr[1] = 0;
            return false;
        }
        iArr[0] = i8;
        iArr[1] = secondaryScrollDistance;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:            if ((r9.mFlag & 262144) == 0) goto L13;     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:            r4 = 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:            r4 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:            if ((r9.mFlag & 262144) == 0) goto L14;     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0042, code lost:            if ((r9.mFlag & 524288) == 0) goto L10;     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0048, code lost:            if ((r9.mFlag & 524288) == 0) goto L18;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int getMovement(int r10) {
        /*
            r9 = this;
            int r0 = r9.mOrientation
            r1 = 130(0x82, float:1.82E-43)
            r2 = 66
            r3 = 33
            r4 = 2
            r5 = 0
            r6 = 3
            r7 = 1
            r8 = 17
            if (r0 != 0) goto L30
            r0 = 262144(0x40000, float:3.67342E-40)
            if (r10 == r8) goto L28
            if (r10 == r3) goto L2e
            if (r10 == r2) goto L1f
            if (r10 == r1) goto L1d
            r4 = 17
            goto L2e
        L1d:
            r4 = 3
            goto L2e
        L1f:
            int r10 = r9.mFlag
            r10 = r10 & r0
            if (r10 != 0) goto L26
        L24:
            r4 = 1
            goto L2e
        L26:
            r4 = 0
            goto L2e
        L28:
            int r10 = r9.mFlag
            r10 = r10 & r0
            if (r10 != 0) goto L24
            goto L26
        L2e:
            r5 = r4
            goto L4d
        L30:
            if (r0 != r7) goto L4b
            r0 = 524288(0x80000, float:7.34684E-40)
            if (r10 == r8) goto L45
            if (r10 == r3) goto L4d
            if (r10 == r2) goto L3f
            if (r10 == r1) goto L3d
            goto L4b
        L3d:
            r5 = 1
            goto L4d
        L3f:
            int r10 = r9.mFlag
            r10 = r10 & r0
            if (r10 != 0) goto L2e
            goto L1d
        L45:
            int r10 = r9.mFlag
            r10 = r10 & r0
            if (r10 != 0) goto L1d
            goto L2e
        L4b:
            r5 = 17
        L4d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.GridLayoutManager.getMovement(int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x009f, code lost:            if (r2 != null) goto L32;     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean getNoneAlignedPosition(android.view.View r13, int[] r14) {
        /*
            r12 = this;
            int r0 = r12.getAdapterPositionByView(r13)
            int r1 = r12.getViewMin(r13)
            int r2 = r12.getViewMax(r13)
            androidx.leanback.widget.WindowAlignment r3 = r12.mWindowAlignment
            androidx.leanback.widget.WindowAlignment$Axis r3 = r3.mainAxis()
            int r3 = r3.getPaddingMin()
            androidx.leanback.widget.WindowAlignment r4 = r12.mWindowAlignment
            androidx.leanback.widget.WindowAlignment$Axis r4 = r4.mainAxis()
            int r4 = r4.getClientSize()
            androidx.leanback.widget.Grid r5 = r12.mGrid
            int r5 = r5.getRowIndex(r0)
            r6 = 1
            r7 = 0
            r8 = 2
            r9 = 0
            if (r1 >= r3) goto L6f
            int r1 = r12.mFocusScrollStrategy
            if (r1 != r8) goto L6c
            r1 = r13
        L31:
            boolean r10 = r12.prependOneColumnVisibleItems()
            if (r10 == 0) goto L69
            androidx.leanback.widget.Grid r1 = r12.mGrid
            int r10 = r1.getFirstVisibleIndex()
            androidx.collection.CircularIntArray[] r1 = r1.getItemPositionsInRows(r10, r0)
            r1 = r1[r5]
            int r10 = r1.get(r7)
            android.view.View r10 = r12.findViewByPosition(r10)
            int r11 = r12.getViewMin(r10)
            int r11 = r2 - r11
            if (r11 <= r4) goto L67
            int r0 = r1.size()
            if (r0 <= r8) goto L64
            int r0 = r1.get(r8)
            android.view.View r0 = r12.findViewByPosition(r0)
            r2 = r9
            r9 = r0
            goto La5
        L64:
            r2 = r9
            r9 = r10
            goto La5
        L67:
            r1 = r10
            goto L31
        L69:
            r2 = r9
            r9 = r1
            goto La5
        L6c:
            r2 = r9
        L6d:
            r9 = r13
            goto La5
        L6f:
            int r10 = r4 + r3
            if (r2 <= r10) goto La4
            int r2 = r12.mFocusScrollStrategy
            if (r2 != r8) goto La2
        L77:
            androidx.leanback.widget.Grid r2 = r12.mGrid
            int r8 = r2.getLastVisibleIndex()
            androidx.collection.CircularIntArray[] r2 = r2.getItemPositionsInRows(r0, r8)
            r2 = r2[r5]
            int r8 = r2.size()
            int r8 = r8 - r6
            int r2 = r2.get(r8)
            android.view.View r2 = r12.findViewByPosition(r2)
            int r8 = r12.getViewMax(r2)
            int r8 = r8 - r1
            if (r8 <= r4) goto L99
            r2 = r9
            goto L9f
        L99:
            boolean r8 = r12.appendOneColumnVisibleItems()
            if (r8 != 0) goto L77
        L9f:
            if (r2 == 0) goto L6d
            goto La5
        La2:
            r2 = r13
            goto La5
        La4:
            r2 = r9
        La5:
            if (r9 == 0) goto Lad
            int r0 = r12.getViewMin(r9)
        Lab:
            int r0 = r0 - r3
            goto Lb6
        Lad:
            if (r2 == 0) goto Lb5
            int r0 = r12.getViewMax(r2)
            int r3 = r3 + r4
            goto Lab
        Lb5:
            r0 = 0
        Lb6:
            if (r9 == 0) goto Lba
            r13 = r9
            goto Lbd
        Lba:
            if (r2 == 0) goto Lbd
            r13 = r2
        Lbd:
            int r13 = r12.getSecondaryScrollDistance(r13)
            if (r0 != 0) goto Lc7
            if (r13 == 0) goto Lc6
            goto Lc7
        Lc6:
            return r7
        Lc7:
            r14[r7] = r0
            r14[r6] = r13
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.GridLayoutManager.getNoneAlignedPosition(android.view.View, int[]):boolean");
    }

    private int getPrimaryAlignedScrollDistance(View view) {
        return this.mWindowAlignment.mainAxis().getScroll(getViewCenter(view));
    }

    private int getRowSizeSecondary(int i8) {
        int i9 = this.mFixedRowSizeSecondary;
        if (i9 != 0) {
            return i9;
        }
        int[] iArr = this.mRowSizeSecondary;
        if (iArr == null) {
            return 0;
        }
        return iArr[i8];
    }

    private int getSecondaryScrollDistance(View view) {
        return this.mWindowAlignment.secondAxis().getScroll(getViewCenterSecondary(view));
    }

    private int getSizeSecondary() {
        int i8;
        if ((this.mFlag & 524288) != 0) {
            i8 = 0;
        } else {
            i8 = this.mNumRows - 1;
        }
        return getRowStartSecondary(i8) + getRowSizeSecondary(i8);
    }

    private int getViewCenter(View view) {
        if (this.mOrientation == 0) {
            return getViewCenterX(view);
        }
        return getViewCenterY(view);
    }

    private int getViewCenterSecondary(View view) {
        if (this.mOrientation == 0) {
            return getViewCenterY(view);
        }
        return getViewCenterX(view);
    }

    private int getViewCenterX(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        return layoutParams.getOpticalLeft(view) + layoutParams.getAlignX();
    }

    private int getViewCenterY(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        return layoutParams.getOpticalTop(view) + layoutParams.getAlignY();
    }

    private boolean gridOnRequestFocusInDescendantsAligned(RecyclerView recyclerView, int i8, Rect rect) {
        View findViewByPosition = findViewByPosition(this.mFocusPosition);
        if (findViewByPosition != null) {
            return findViewByPosition.requestFocus(i8, rect);
        }
        return false;
    }

    private boolean gridOnRequestFocusInDescendantsUnaligned(RecyclerView recyclerView, int i8, Rect rect) {
        int i9;
        int i10;
        int i11;
        int childCount = getChildCount();
        if ((i8 & 2) != 0) {
            i10 = childCount;
            i9 = 0;
            i11 = 1;
        } else {
            i9 = childCount - 1;
            i10 = -1;
            i11 = -1;
        }
        int paddingMin = this.mWindowAlignment.mainAxis().getPaddingMin();
        int clientSize = this.mWindowAlignment.mainAxis().getClientSize() + paddingMin;
        while (i9 != i10) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() == 0 && getViewMin(childAt) >= paddingMin && getViewMax(childAt) <= clientSize && childAt.requestFocus(i8, rect)) {
                return true;
            }
            i9 += i11;
        }
        return false;
    }

    private void initScrollController() {
        this.mWindowAlignment.reset();
        this.mWindowAlignment.horizontal.setSize(getWidth());
        this.mWindowAlignment.vertical.setSize(getHeight());
        this.mWindowAlignment.horizontal.setPadding(getPaddingLeft(), getPaddingRight());
        this.mWindowAlignment.vertical.setPadding(getPaddingTop(), getPaddingBottom());
        this.mSizePrimary = this.mWindowAlignment.mainAxis().getSize();
        this.mScrollOffsetSecondary = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:            if (r0 != r5.mGrid.isReversedFlow()) goto L33;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean layoutInit() {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$State r0 = r5.mState
            int r0 = r0.getItemCount()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L10
            r5.mFocusPosition = r1
            r5.mSubFocusPosition = r3
            goto L22
        L10:
            int r4 = r5.mFocusPosition
            if (r4 < r0) goto L1a
            int r0 = r0 - r2
            r5.mFocusPosition = r0
            r5.mSubFocusPosition = r3
            goto L22
        L1a:
            if (r4 != r1) goto L22
            if (r0 <= 0) goto L22
            r5.mFocusPosition = r3
            r5.mSubFocusPosition = r3
        L22:
            androidx.recyclerview.widget.RecyclerView$State r0 = r5.mState
            boolean r0 = r0.didStructureChange()
            if (r0 != 0) goto L52
            androidx.leanback.widget.Grid r0 = r5.mGrid
            if (r0 == 0) goto L52
            int r0 = r0.getFirstVisibleIndex()
            if (r0 < 0) goto L52
            int r0 = r5.mFlag
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 != 0) goto L52
            androidx.leanback.widget.Grid r0 = r5.mGrid
            int r0 = r0.getNumRows()
            int r1 = r5.mNumRows
            if (r0 != r1) goto L52
            r5.updateScrollController()
            r5.updateSecondaryScrollLimits()
            androidx.leanback.widget.Grid r0 = r5.mGrid
            int r1 = r5.mSpacingPrimary
            r0.setSpacing(r1)
            return r2
        L52:
            int r0 = r5.mFlag
            r0 = r0 & (-257(0xfffffffffffffeff, float:NaN))
            r5.mFlag = r0
            androidx.leanback.widget.Grid r0 = r5.mGrid
            r1 = 262144(0x40000, float:3.67342E-40)
            if (r0 == 0) goto L76
            int r4 = r5.mNumRows
            int r0 = r0.getNumRows()
            if (r4 != r0) goto L76
            int r0 = r5.mFlag
            r0 = r0 & r1
            if (r0 == 0) goto L6d
            r0 = 1
            goto L6e
        L6d:
            r0 = 0
        L6e:
            androidx.leanback.widget.Grid r4 = r5.mGrid
            boolean r4 = r4.isReversedFlow()
            if (r0 == r4) goto L8f
        L76:
            int r0 = r5.mNumRows
            androidx.leanback.widget.Grid r0 = androidx.leanback.widget.Grid.createGrid(r0)
            r5.mGrid = r0
            androidx.leanback.widget.Grid$Provider r4 = r5.mGridProvider
            r0.setProvider(r4)
            androidx.leanback.widget.Grid r0 = r5.mGrid
            int r4 = r5.mFlag
            r1 = r1 & r4
            if (r1 == 0) goto L8b
            goto L8c
        L8b:
            r2 = 0
        L8c:
            r0.setReversedFlow(r2)
        L8f:
            r5.initScrollController()
            r5.updateSecondaryScrollLimits()
            androidx.leanback.widget.Grid r0 = r5.mGrid
            int r1 = r5.mSpacingPrimary
            r0.setSpacing(r1)
            androidx.recyclerview.widget.RecyclerView$Recycler r0 = r5.mRecycler
            r5.detachAndScrapAttachedViews(r0)
            androidx.leanback.widget.Grid r0 = r5.mGrid
            r0.resetVisibleIndex()
            androidx.leanback.widget.WindowAlignment r0 = r5.mWindowAlignment
            androidx.leanback.widget.WindowAlignment$Axis r0 = r0.mainAxis()
            r0.invalidateScrollMin()
            androidx.leanback.widget.WindowAlignment r0 = r5.mWindowAlignment
            androidx.leanback.widget.WindowAlignment$Axis r0 = r0.mainAxis()
            r0.invalidateScrollMax()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.GridLayoutManager.layoutInit():boolean");
    }

    private void leaveContext() {
        this.mRecycler = null;
        this.mState = null;
        this.mPositionDeltaInPreLayout = 0;
        this.mExtraLayoutSpaceInPreLayout = 0;
    }

    private void measureScrapChild(int i8, int i9, int i10, int[] iArr) {
        View viewForPosition = this.mRecycler.getViewForPosition(i8);
        if (viewForPosition != null) {
            LayoutParams layoutParams = (LayoutParams) viewForPosition.getLayoutParams();
            Rect rect = sTempRect;
            calculateItemDecorationsForChild(viewForPosition, rect);
            viewForPosition.measure(ViewGroup.getChildMeasureSpec(i9, getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + rect.left + rect.right, ((ViewGroup.MarginLayoutParams) layoutParams).width), ViewGroup.getChildMeasureSpec(i10, getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + rect.top + rect.bottom, ((ViewGroup.MarginLayoutParams) layoutParams).height));
            iArr[0] = getDecoratedMeasuredWidthWithMargin(viewForPosition);
            iArr[1] = getDecoratedMeasuredHeightWithMargin(viewForPosition);
            this.mRecycler.recycleView(viewForPosition);
        }
    }

    private void offsetChildrenPrimary(int i8) {
        int childCount = getChildCount();
        int i9 = 0;
        if (this.mOrientation == 1) {
            while (i9 < childCount) {
                getChildAt(i9).offsetTopAndBottom(i8);
                i9++;
            }
        } else {
            while (i9 < childCount) {
                getChildAt(i9).offsetLeftAndRight(i8);
                i9++;
            }
        }
    }

    private void offsetChildrenSecondary(int i8) {
        int childCount = getChildCount();
        int i9 = 0;
        if (this.mOrientation == 0) {
            while (i9 < childCount) {
                getChildAt(i9).offsetTopAndBottom(i8);
                i9++;
            }
        } else {
            while (i9 < childCount) {
                getChildAt(i9).offsetLeftAndRight(i8);
                i9++;
            }
        }
    }

    private boolean prependOneColumnVisibleItems() {
        return this.mGrid.prependOneColumnVisibleItems();
    }

    private void prependVisibleItems() {
        int i8;
        Grid grid = this.mGrid;
        if ((this.mFlag & 262144) != 0) {
            i8 = this.mSizePrimary + this.mExtraLayoutSpace + this.mExtraLayoutSpaceInPreLayout;
        } else {
            i8 = (-this.mExtraLayoutSpace) - this.mExtraLayoutSpaceInPreLayout;
        }
        grid.prependVisibleItems(i8);
    }

    private void processPendingMovement(boolean z8) {
        int i8;
        if (z8) {
            if (hasCreatedLastItem()) {
                return;
            }
        } else if (hasCreatedFirstItem()) {
            return;
        }
        PendingMoveSmoothScroller pendingMoveSmoothScroller = this.mPendingMoveSmoothScroller;
        if (pendingMoveSmoothScroller == null) {
            this.mBaseGridView.stopScroll();
            boolean z9 = true;
            if (z8) {
                i8 = 1;
            } else {
                i8 = -1;
            }
            if (this.mNumRows <= 1) {
                z9 = false;
            }
            PendingMoveSmoothScroller pendingMoveSmoothScroller2 = new PendingMoveSmoothScroller(i8, z9);
            this.mFocusPositionOffset = 0;
            startSmoothScroll(pendingMoveSmoothScroller2);
            return;
        }
        if (z8) {
            pendingMoveSmoothScroller.increasePendingMoves();
        } else {
            pendingMoveSmoothScroller.decreasePendingMoves();
        }
    }

    private boolean processRowSizeSecondary(boolean z8) {
        CircularIntArray[] itemPositionsInRows;
        CircularIntArray circularIntArray;
        int size;
        int decoratedMeasuredWidthWithMargin;
        if (this.mFixedRowSizeSecondary != 0 || this.mRowSizeSecondary == null) {
            return false;
        }
        Grid grid = this.mGrid;
        if (grid == null) {
            itemPositionsInRows = null;
        } else {
            itemPositionsInRows = grid.getItemPositionsInRows();
        }
        boolean z9 = false;
        int i8 = -1;
        for (int i9 = 0; i9 < this.mNumRows; i9++) {
            if (itemPositionsInRows == null) {
                circularIntArray = null;
            } else {
                circularIntArray = itemPositionsInRows[i9];
            }
            if (circularIntArray == null) {
                size = 0;
            } else {
                size = circularIntArray.size();
            }
            int i10 = -1;
            for (int i11 = 0; i11 < size; i11 += 2) {
                int i12 = circularIntArray.get(i11 + 1);
                for (int i13 = circularIntArray.get(i11); i13 <= i12; i13++) {
                    View findViewByPosition = findViewByPosition(i13 - this.mPositionDeltaInPreLayout);
                    if (findViewByPosition != null) {
                        if (z8) {
                            measureChild(findViewByPosition);
                        }
                        if (this.mOrientation == 0) {
                            decoratedMeasuredWidthWithMargin = getDecoratedMeasuredHeightWithMargin(findViewByPosition);
                        } else {
                            decoratedMeasuredWidthWithMargin = getDecoratedMeasuredWidthWithMargin(findViewByPosition);
                        }
                        if (decoratedMeasuredWidthWithMargin > i10) {
                            i10 = decoratedMeasuredWidthWithMargin;
                        }
                    }
                }
            }
            int itemCount = this.mState.getItemCount();
            if (!this.mBaseGridView.hasFixedSize() && z8 && i10 < 0 && itemCount > 0) {
                if (i8 < 0) {
                    int i14 = this.mFocusPosition;
                    if (i14 < 0) {
                        i14 = 0;
                    } else if (i14 >= itemCount) {
                        i14 = itemCount - 1;
                    }
                    if (getChildCount() > 0) {
                        int layoutPosition = this.mBaseGridView.getChildViewHolder(getChildAt(0)).getLayoutPosition();
                        int layoutPosition2 = this.mBaseGridView.getChildViewHolder(getChildAt(getChildCount() - 1)).getLayoutPosition();
                        if (i14 >= layoutPosition && i14 <= layoutPosition2) {
                            i14 = i14 - layoutPosition <= layoutPosition2 - i14 ? layoutPosition - 1 : layoutPosition2 + 1;
                            if (i14 < 0 && layoutPosition2 < itemCount - 1) {
                                i14 = layoutPosition2 + 1;
                            } else if (i14 >= itemCount && layoutPosition > 0) {
                                i14 = layoutPosition - 1;
                            }
                        }
                    }
                    if (i14 >= 0 && i14 < itemCount) {
                        measureScrapChild(i14, View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0), this.mMeasuredDimension);
                        if (this.mOrientation == 0) {
                            i8 = this.mMeasuredDimension[1];
                        } else {
                            i8 = this.mMeasuredDimension[0];
                        }
                    }
                }
                if (i8 >= 0) {
                    i10 = i8;
                }
            }
            if (i10 < 0) {
                i10 = 0;
            }
            int[] iArr = this.mRowSizeSecondary;
            if (iArr[i9] != i10) {
                iArr[i9] = i10;
                z9 = true;
            }
        }
        return z9;
    }

    private void removeInvisibleViewsAtEnd() {
        int i8;
        int i9 = this.mFlag;
        if ((65600 & i9) == 65536) {
            Grid grid = this.mGrid;
            int i10 = this.mFocusPosition;
            if ((i9 & 262144) != 0) {
                i8 = -this.mExtraLayoutSpace;
            } else {
                i8 = this.mSizePrimary + this.mExtraLayoutSpace;
            }
            grid.removeInvisibleItemsAtEnd(i10, i8);
        }
    }

    private void removeInvisibleViewsAtFront() {
        int i8;
        int i9 = this.mFlag;
        if ((65600 & i9) == 65536) {
            Grid grid = this.mGrid;
            int i10 = this.mFocusPosition;
            if ((i9 & 262144) != 0) {
                i8 = this.mSizePrimary + this.mExtraLayoutSpace;
            } else {
                i8 = -this.mExtraLayoutSpace;
            }
            grid.removeInvisibleItemsAtFront(i10, i8);
        }
    }

    private void saveContext(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.mRecycler != null || this.mState != null) {
            Log.e(TAG, "Recycler information was not released, bug!");
        }
        this.mRecycler = recycler;
        this.mState = state;
        this.mPositionDeltaInPreLayout = 0;
        this.mExtraLayoutSpaceInPreLayout = 0;
    }

    private int scrollDirectionPrimary(int i8) {
        boolean z8;
        int minScroll;
        int i9 = this.mFlag;
        boolean z9 = true;
        if ((i9 & 64) == 0 && (i9 & 3) != 1 && (i8 <= 0 ? !(i8 >= 0 || this.mWindowAlignment.mainAxis().isMinUnknown() || i8 >= (minScroll = this.mWindowAlignment.mainAxis().getMinScroll())) : !(this.mWindowAlignment.mainAxis().isMaxUnknown() || i8 <= (minScroll = this.mWindowAlignment.mainAxis().getMaxScroll())))) {
            i8 = minScroll;
        }
        if (i8 == 0) {
            return 0;
        }
        offsetChildrenPrimary(-i8);
        if ((this.mFlag & 3) == 1) {
            updateScrollLimits();
            return i8;
        }
        int childCount = getChildCount();
        if ((this.mFlag & 262144) == 0 ? i8 < 0 : i8 > 0) {
            prependVisibleItems();
        } else {
            appendVisibleItems();
        }
        if (getChildCount() > childCount) {
            z8 = true;
        } else {
            z8 = false;
        }
        int childCount2 = getChildCount();
        if ((262144 & this.mFlag) == 0 ? i8 < 0 : i8 > 0) {
            removeInvisibleViewsAtEnd();
        } else {
            removeInvisibleViewsAtFront();
        }
        if (getChildCount() >= childCount2) {
            z9 = false;
        }
        if (z8 | z9) {
            updateRowSecondarySizeRefresh();
        }
        this.mBaseGridView.invalidate();
        updateScrollLimits();
        return i8;
    }

    private int scrollDirectionSecondary(int i8) {
        if (i8 == 0) {
            return 0;
        }
        offsetChildrenSecondary(-i8);
        this.mScrollOffsetSecondary += i8;
        updateSecondaryScrollLimits();
        this.mBaseGridView.invalidate();
        return i8;
    }

    private void scrollGrid(int i8, int i9, boolean z8) {
        if ((this.mFlag & 3) == 1) {
            scrollDirectionPrimary(i8);
            scrollDirectionSecondary(i9);
            return;
        }
        if (this.mOrientation != 0) {
            i9 = i8;
            i8 = i9;
        }
        if (z8) {
            this.mBaseGridView.smoothScrollBy(i8, i9);
        } else {
            this.mBaseGridView.scrollBy(i8, i9);
            dispatchChildSelectedAndPositioned();
        }
    }

    private void updateChildAlignments(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (layoutParams.getItemAlignmentFacet() == null) {
            layoutParams.setAlignX(this.mItemAlignment.horizontal.getAlignmentPosition(view));
            layoutParams.setAlignY(this.mItemAlignment.vertical.getAlignmentPosition(view));
            return;
        }
        layoutParams.calculateItemAlignments(this.mOrientation, view);
        if (this.mOrientation == 0) {
            layoutParams.setAlignY(this.mItemAlignment.vertical.getAlignmentPosition(view));
        } else {
            layoutParams.setAlignX(this.mItemAlignment.horizontal.getAlignmentPosition(view));
        }
    }

    private void updateRowSecondarySizeRefresh() {
        int i8 = this.mFlag & (-1025);
        int i9 = 0;
        if (processRowSizeSecondary(false)) {
            i9 = 1024;
        }
        int i10 = i8 | i9;
        this.mFlag = i10;
        if ((i10 & 1024) != 0) {
            forceRequestLayout();
        }
    }

    private void updateScrollController() {
        this.mWindowAlignment.horizontal.setSize(getWidth());
        this.mWindowAlignment.vertical.setSize(getHeight());
        this.mWindowAlignment.horizontal.setPadding(getPaddingLeft(), getPaddingRight());
        this.mWindowAlignment.vertical.setPadding(getPaddingTop(), getPaddingBottom());
        this.mSizePrimary = this.mWindowAlignment.mainAxis().getSize();
    }

    private void updateSecondaryScrollLimits() {
        WindowAlignment.Axis secondAxis = this.mWindowAlignment.secondAxis();
        int paddingMin = secondAxis.getPaddingMin() - this.mScrollOffsetSecondary;
        int sizeSecondary = getSizeSecondary() + paddingMin;
        secondAxis.updateMinMax(paddingMin, sizeSecondary, paddingMin, sizeSecondary);
    }

    public void addOnChildViewHolderSelectedListener(OnChildViewHolderSelectedListener onChildViewHolderSelectedListener) {
        if (this.mChildViewHolderSelectedListeners == null) {
            this.mChildViewHolderSelectedListeners = new ArrayList<>();
        }
        this.mChildViewHolderSelectedListeners.add(onChildViewHolderSelectedListener);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        if (this.mOrientation == 0 || this.mNumRows > 1) {
            return true;
        }
        return false;
    }

    boolean canScrollTo(View view) {
        if (view.getVisibility() == 0 && (!hasFocus() || view.hasFocusable())) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        if (this.mOrientation == 1 || this.mNumRows > 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void collectAdjacentPrefetchPositions(int i8, int i9, RecyclerView.State state, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        int i10;
        try {
            saveContext(null, state);
            if (this.mOrientation != 0) {
                i8 = i9;
            }
            if (getChildCount() != 0 && i8 != 0) {
                if (i8 < 0) {
                    i10 = -this.mExtraLayoutSpace;
                } else {
                    i10 = this.mSizePrimary + this.mExtraLayoutSpace;
                }
                this.mGrid.collectAdjacentPrefetchPositions(i10, i8, layoutPrefetchRegistry);
                leaveContext();
            }
        } finally {
            leaveContext();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void collectInitialPrefetchPositions(int i8, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        int i9 = this.mBaseGridView.mInitialPrefetchItemCount;
        if (i8 != 0 && i9 != 0) {
            int max = Math.max(0, Math.min(this.mFocusPosition - ((i9 - 1) / 2), i8 - i9));
            for (int i10 = max; i10 < i8 && i10 < max + i9; i10++) {
                layoutPrefetchRegistry.addPosition(i10, 0);
            }
        }
    }

    void dispatchChildSelected() {
        View findViewByPosition;
        long itemId;
        if (this.mChildSelectedListener == null && !hasOnChildViewHolderSelectedListener()) {
            return;
        }
        int i8 = this.mFocusPosition;
        if (i8 == -1) {
            findViewByPosition = null;
        } else {
            findViewByPosition = findViewByPosition(i8);
        }
        if (findViewByPosition != null) {
            RecyclerView.ViewHolder childViewHolder = this.mBaseGridView.getChildViewHolder(findViewByPosition);
            OnChildSelectedListener onChildSelectedListener = this.mChildSelectedListener;
            if (onChildSelectedListener != null) {
                BaseGridView baseGridView = this.mBaseGridView;
                int i9 = this.mFocusPosition;
                if (childViewHolder == null) {
                    itemId = -1;
                } else {
                    itemId = childViewHolder.getItemId();
                }
                onChildSelectedListener.onChildSelected(baseGridView, findViewByPosition, i9, itemId);
            }
            fireOnChildViewHolderSelected(this.mBaseGridView, childViewHolder, this.mFocusPosition, this.mSubFocusPosition);
        } else {
            OnChildSelectedListener onChildSelectedListener2 = this.mChildSelectedListener;
            if (onChildSelectedListener2 != null) {
                onChildSelectedListener2.onChildSelected(this.mBaseGridView, null, -1, -1L);
            }
            fireOnChildViewHolderSelected(this.mBaseGridView, null, -1, 0);
        }
        if ((this.mFlag & 3) != 1 && !this.mBaseGridView.isLayoutRequested()) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (getChildAt(i10).isLayoutRequested()) {
                    forceRequestLayout();
                    return;
                }
            }
        }
    }

    void dispatchChildSelectedAndPositioned() {
        View findViewByPosition;
        if (!hasOnChildViewHolderSelectedListener()) {
            return;
        }
        int i8 = this.mFocusPosition;
        if (i8 == -1) {
            findViewByPosition = null;
        } else {
            findViewByPosition = findViewByPosition(i8);
        }
        if (findViewByPosition != null) {
            fireOnChildViewHolderSelectedAndPositioned(this.mBaseGridView, this.mBaseGridView.getChildViewHolder(findViewByPosition), this.mFocusPosition, this.mSubFocusPosition);
        } else {
            OnChildSelectedListener onChildSelectedListener = this.mChildSelectedListener;
            if (onChildSelectedListener != null) {
                onChildSelectedListener.onChildSelected(this.mBaseGridView, null, -1, -1L);
            }
            fireOnChildViewHolderSelectedAndPositioned(this.mBaseGridView, null, -1, 0);
        }
    }

    void fillScrapViewsInPostLayout() {
        int length;
        List<RecyclerView.ViewHolder> scrapList = this.mRecycler.getScrapList();
        int size = scrapList.size();
        if (size == 0) {
            return;
        }
        int[] iArr = this.mDisappearingPositions;
        if (iArr == null || size > iArr.length) {
            if (iArr == null) {
                length = 16;
            } else {
                length = iArr.length;
            }
            while (length < size) {
                length <<= 1;
            }
            this.mDisappearingPositions = new int[length];
        }
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            int adapterPosition = scrapList.get(i9).getAdapterPosition();
            if (adapterPosition >= 0) {
                this.mDisappearingPositions[i8] = adapterPosition;
                i8++;
            }
        }
        if (i8 > 0) {
            Arrays.sort(this.mDisappearingPositions, 0, i8);
            this.mGrid.fillDisappearingItems(this.mDisappearingPositions, i8, this.mPositionToRowInPostLayout);
        }
        this.mPositionToRowInPostLayout.clear();
    }

    void fireOnChildViewHolderSelected(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, int i8, int i9) {
        ArrayList<OnChildViewHolderSelectedListener> arrayList = this.mChildViewHolderSelectedListeners;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            this.mChildViewHolderSelectedListeners.get(size).onChildViewHolderSelected(recyclerView, viewHolder, i8, i9);
        }
    }

    void fireOnChildViewHolderSelectedAndPositioned(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, int i8, int i9) {
        ArrayList<OnChildViewHolderSelectedListener> arrayList = this.mChildViewHolderSelectedListeners;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            this.mChildViewHolderSelectedListeners.get(size).onChildViewHolderSelectedAndPositioned(recyclerView, viewHolder, i8, i9);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getChildDrawingOrder(RecyclerView recyclerView, int i8, int i9) {
        View findViewByPosition = findViewByPosition(this.mFocusPosition);
        if (findViewByPosition == null) {
            return i9;
        }
        int indexOfChild = recyclerView.indexOfChild(findViewByPosition);
        if (i9 < indexOfChild) {
            return i9;
        }
        if (i9 < i8 - 1) {
            return ((indexOfChild + i8) - 1) - i9;
        }
        return indexOfChild;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getColumnCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state) {
        Grid grid;
        if (this.mOrientation == 1 && (grid = this.mGrid) != null) {
            return grid.getNumRows();
        }
        return super.getColumnCountForAccessibility(recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getDecoratedBottom(View view) {
        return super.getDecoratedBottom(view) - ((LayoutParams) view.getLayoutParams()).mBottomInset;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        super.getDecoratedBoundsWithMargins(view, rect);
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        rect.left += layoutParams.mLeftInset;
        rect.top += layoutParams.mTopInset;
        rect.right -= layoutParams.mRightInset;
        rect.bottom -= layoutParams.mBottomInset;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getDecoratedLeft(View view) {
        return super.getDecoratedLeft(view) + ((LayoutParams) view.getLayoutParams()).mLeftInset;
    }

    int getDecoratedMeasuredHeightWithMargin(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        return getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
    }

    int getDecoratedMeasuredWidthWithMargin(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        return getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getDecoratedRight(View view) {
        return super.getDecoratedRight(view) - ((LayoutParams) view.getLayoutParams()).mRightInset;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getDecoratedTop(View view) {
        return super.getDecoratedTop(view) + ((LayoutParams) view.getLayoutParams()).mTopInset;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getExtraLayoutSpace() {
        return this.mExtraLayoutSpace;
    }

    /* JADX WARN: Multi-variable type inference failed */
    <E> E getFacet(RecyclerView.ViewHolder viewHolder, Class<? extends E> cls) {
        E e8;
        FacetProviderAdapter facetProviderAdapter;
        FacetProvider facetProvider;
        if (viewHolder instanceof FacetProvider) {
            e8 = (E) ((FacetProvider) viewHolder).getFacet(cls);
        } else {
            e8 = null;
        }
        return (e8 != null || (facetProviderAdapter = this.mFacetProviderAdapter) == null || (facetProvider = facetProviderAdapter.getFacetProvider(viewHolder.getItemViewType())) == null) ? e8 : (E) facetProvider.getFacet(cls);
    }

    public int getFocusScrollStrategy() {
        return this.mFocusScrollStrategy;
    }

    public int getHorizontalSpacing() {
        return this.mHorizontalSpacing;
    }

    public int getItemAlignmentOffset() {
        return this.mItemAlignment.mainAxis().getItemAlignmentOffset();
    }

    public float getItemAlignmentOffsetPercent() {
        return this.mItemAlignment.mainAxis().getItemAlignmentOffsetPercent();
    }

    public int getItemAlignmentViewId() {
        return this.mItemAlignment.mainAxis().getItemAlignmentViewId();
    }

    final int getOpticalBottom(View view) {
        return ((LayoutParams) view.getLayoutParams()).getOpticalBottom(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int getOpticalLeft(View view) {
        return ((LayoutParams) view.getLayoutParams()).getOpticalLeft(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int getOpticalRight(View view) {
        return ((LayoutParams) view.getLayoutParams()).getOpticalRight(view);
    }

    final int getOpticalTop(View view) {
        return ((LayoutParams) view.getLayoutParams()).getOpticalTop(view);
    }

    public boolean getPruneChild() {
        if ((this.mFlag & 65536) != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getRowCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state) {
        Grid grid;
        if (this.mOrientation == 0 && (grid = this.mGrid) != null) {
            return grid.getNumRows();
        }
        return super.getRowCountForAccessibility(recycler, state);
    }

    int getRowStartSecondary(int i8) {
        int i9 = 0;
        if ((this.mFlag & 524288) != 0) {
            for (int i10 = this.mNumRows - 1; i10 > i8; i10--) {
                i9 += getRowSizeSecondary(i10) + this.mSpacingSecondary;
            }
            return i9;
        }
        int i11 = 0;
        while (i9 < i8) {
            i11 += getRowSizeSecondary(i9) + this.mSpacingSecondary;
            i9++;
        }
        return i11;
    }

    boolean getScrollPosition(View view, View view2, int[] iArr) {
        int i8 = this.mFocusScrollStrategy;
        if (i8 != 1 && i8 != 2) {
            return getAlignedPosition(view, view2, iArr);
        }
        return getNoneAlignedPosition(view, iArr);
    }

    public int getSelection() {
        return this.mFocusPosition;
    }

    int getSlideOutDistance() {
        int i8;
        int left;
        int right;
        if (this.mOrientation == 1) {
            i8 = -getHeight();
            if (getChildCount() <= 0 || (left = getChildAt(0).getTop()) >= 0) {
                return i8;
            }
        } else {
            if ((this.mFlag & 262144) != 0) {
                int width = getWidth();
                if (getChildCount() > 0 && (right = getChildAt(0).getRight()) > width) {
                    return right;
                }
                return width;
            }
            i8 = -getWidth();
            if (getChildCount() <= 0 || (left = getChildAt(0).getLeft()) >= 0) {
                return i8;
            }
        }
        return i8 + left;
    }

    int getSubPositionByView(View view, View view2) {
        ItemAlignmentFacet itemAlignmentFacet;
        if (view != null && view2 != null && (itemAlignmentFacet = ((LayoutParams) view.getLayoutParams()).getItemAlignmentFacet()) != null) {
            ItemAlignmentFacet.ItemAlignmentDef[] alignmentDefs = itemAlignmentFacet.getAlignmentDefs();
            if (alignmentDefs.length > 1) {
                while (view2 != view) {
                    int id = view2.getId();
                    if (id != -1) {
                        for (int i8 = 1; i8 < alignmentDefs.length; i8++) {
                            if (alignmentDefs[i8].getItemAlignmentFocusViewId() == id) {
                                return i8;
                            }
                        }
                    }
                    view2 = (View) view2.getParent();
                }
            }
        }
        return 0;
    }

    public int getSubSelection() {
        return this.mSubFocusPosition;
    }

    String getTag() {
        return "GridLayoutManager:" + this.mBaseGridView.getId();
    }

    public int getVerticalSpacing() {
        return this.mVerticalSpacing;
    }

    protected View getViewForPosition(int i8) {
        return this.mRecycler.getViewForPosition(i8);
    }

    int getViewMax(View view) {
        return this.mOrientationHelper.getDecoratedEnd(view);
    }

    int getViewMin(View view) {
        return this.mOrientationHelper.getDecoratedStart(view);
    }

    int getViewPrimarySize(View view) {
        Rect rect = sTempRect;
        getDecoratedBoundsWithMargins(view, rect);
        if (this.mOrientation == 0) {
            return rect.width();
        }
        return rect.height();
    }

    public void getViewSelectedOffsets(View view, int[] iArr) {
        if (this.mOrientation == 0) {
            iArr[0] = getPrimaryAlignedScrollDistance(view);
            iArr[1] = getSecondaryScrollDistance(view);
        } else {
            iArr[1] = getPrimaryAlignedScrollDistance(view);
            iArr[0] = getSecondaryScrollDistance(view);
        }
    }

    public int getWindowAlignment() {
        return this.mWindowAlignment.mainAxis().getWindowAlignment();
    }

    public int getWindowAlignmentOffset() {
        return this.mWindowAlignment.mainAxis().getWindowAlignmentOffset();
    }

    public float getWindowAlignmentOffsetPercent() {
        return this.mWindowAlignment.mainAxis().getWindowAlignmentOffsetPercent();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean gridOnRequestFocusInDescendants(RecyclerView recyclerView, int i8, Rect rect) {
        int i9 = this.mFocusScrollStrategy;
        if (i9 != 1 && i9 != 2) {
            return gridOnRequestFocusInDescendantsAligned(recyclerView, i8, rect);
        }
        return gridOnRequestFocusInDescendantsUnaligned(recyclerView, i8, rect);
    }

    boolean hasCreatedFirstItem() {
        if (getItemCount() != 0 && this.mBaseGridView.findViewHolderForAdapterPosition(0) == null) {
            return false;
        }
        return true;
    }

    boolean hasCreatedLastItem() {
        int itemCount = getItemCount();
        if (itemCount == 0 || this.mBaseGridView.findViewHolderForAdapterPosition(itemCount - 1) != null) {
            return true;
        }
        return false;
    }

    protected boolean hasDoneFirstLayout() {
        if (this.mGrid != null) {
            return true;
        }
        return false;
    }

    boolean hasOnChildViewHolderSelectedListener() {
        ArrayList<OnChildViewHolderSelectedListener> arrayList = this.mChildViewHolderSelectedListeners;
        if (arrayList != null && arrayList.size() > 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean hasPreviousViewInSameRow(int i8) {
        Grid grid = this.mGrid;
        if (grid != null && i8 != -1 && grid.getFirstVisibleIndex() >= 0) {
            if (this.mGrid.getFirstVisibleIndex() > 0) {
                return true;
            }
            int i9 = this.mGrid.getLocation(i8).row;
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                int adapterPositionByIndex = getAdapterPositionByIndex(childCount);
                Grid.Location location = this.mGrid.getLocation(adapterPositionByIndex);
                if (location != null && location.row == i9 && adapterPositionByIndex < i8) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isFocusSearchDisabled() {
        if ((this.mFlag & 32768) != 0) {
            return true;
        }
        return false;
    }

    public boolean isItemAlignmentOffsetWithPadding() {
        return this.mItemAlignment.mainAxis().isItemAlignmentOffsetWithPadding();
    }

    boolean isItemFullyVisible(int i8) {
        RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.mBaseGridView.findViewHolderForAdapterPosition(i8);
        if (findViewHolderForAdapterPosition == null || findViewHolderForAdapterPosition.itemView.getLeft() < 0 || findViewHolderForAdapterPosition.itemView.getRight() > this.mBaseGridView.getWidth() || findViewHolderForAdapterPosition.itemView.getTop() < 0 || findViewHolderForAdapterPosition.itemView.getBottom() > this.mBaseGridView.getHeight()) {
            return false;
        }
        return true;
    }

    public boolean isScrollEnabled() {
        if ((this.mFlag & 131072) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isSlidingChildViews() {
        if ((this.mFlag & 64) != 0) {
            return true;
        }
        return false;
    }

    void layoutChild(int i8, View view, int i9, int i10, int i11) {
        int decoratedMeasuredWidthWithMargin;
        int i12;
        int rowSizeSecondary;
        int i13;
        if (this.mOrientation == 0) {
            decoratedMeasuredWidthWithMargin = getDecoratedMeasuredHeightWithMargin(view);
        } else {
            decoratedMeasuredWidthWithMargin = getDecoratedMeasuredWidthWithMargin(view);
        }
        int i14 = this.mFixedRowSizeSecondary;
        if (i14 > 0) {
            decoratedMeasuredWidthWithMargin = Math.min(decoratedMeasuredWidthWithMargin, i14);
        }
        int i15 = this.mGravity;
        int i16 = i15 & 112;
        if ((this.mFlag & PF_REVERSE_FLOW_MASK) != 0) {
            i12 = Gravity.getAbsoluteGravity(i15 & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK, 1);
        } else {
            i12 = i15 & 7;
        }
        int i17 = this.mOrientation;
        if ((i17 != 0 || i16 != 48) && (i17 != 1 || i12 != 3)) {
            if ((i17 == 0 && i16 == 80) || (i17 == 1 && i12 == 5)) {
                rowSizeSecondary = getRowSizeSecondary(i8) - decoratedMeasuredWidthWithMargin;
            } else if ((i17 == 0 && i16 == 16) || (i17 == 1 && i12 == 1)) {
                rowSizeSecondary = (getRowSizeSecondary(i8) - decoratedMeasuredWidthWithMargin) / 2;
            }
            i11 += rowSizeSecondary;
        }
        if (this.mOrientation == 0) {
            i13 = decoratedMeasuredWidthWithMargin + i11;
        } else {
            int i18 = decoratedMeasuredWidthWithMargin + i11;
            int i19 = i11;
            i11 = i9;
            i9 = i19;
            i13 = i10;
            i10 = i18;
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        layoutDecoratedWithMargins(view, i9, i11, i10, i13);
        Rect rect = sTempRect;
        super.getDecoratedBoundsWithMargins(view, rect);
        layoutParams.setOpticalInsets(i9 - rect.left, i11 - rect.top, rect.right - i10, rect.bottom - i13);
        updateChildAlignments(view);
    }

    void measureChild(View view) {
        int makeMeasureSpec;
        int childMeasureSpec;
        int i8;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect = sTempRect;
        calculateItemDecorationsForChild(view, rect);
        int i9 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + rect.left + rect.right;
        int i10 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + rect.top + rect.bottom;
        if (this.mRowSizeSecondaryRequested == -2) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.mFixedRowSizeSecondary, 1073741824);
        }
        if (this.mOrientation == 0) {
            childMeasureSpec = ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(0, 0), i9, ((ViewGroup.MarginLayoutParams) layoutParams).width);
            i8 = ViewGroup.getChildMeasureSpec(makeMeasureSpec, i10, ((ViewGroup.MarginLayoutParams) layoutParams).height);
        } else {
            int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(0, 0), i10, ((ViewGroup.MarginLayoutParams) layoutParams).height);
            childMeasureSpec = ViewGroup.getChildMeasureSpec(makeMeasureSpec, i9, ((ViewGroup.MarginLayoutParams) layoutParams).width);
            i8 = childMeasureSpec2;
        }
        view.measure(childMeasureSpec, i8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        if (adapter != null) {
            discardLayoutInfo();
            this.mFocusPosition = -1;
            this.mFocusPositionOffset = 0;
            this.mChildrenStates.clear();
        }
        if (adapter2 instanceof FacetProviderAdapter) {
            this.mFacetProviderAdapter = (FacetProviderAdapter) adapter2;
        } else {
            this.mFacetProviderAdapter = null;
        }
        super.onAdapterChanged(adapter, adapter2);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b5  */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onAddFocusables(androidx.recyclerview.widget.RecyclerView r18, java.util.ArrayList<android.view.View> r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.GridLayoutManager.onAddFocusables(androidx.recyclerview.widget.RecyclerView, java.util.ArrayList, int, int):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onChildRecycled(RecyclerView.ViewHolder viewHolder) {
        int adapterPosition = viewHolder.getAdapterPosition();
        if (adapterPosition != -1) {
            this.mChildrenStates.saveOffscreenView(viewHolder.itemView, adapterPosition);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onFocusChanged(boolean z8, int i8, Rect rect) {
        if (z8) {
            int i9 = this.mFocusPosition;
            while (true) {
                View findViewByPosition = findViewByPosition(i9);
                if (findViewByPosition != null) {
                    if (findViewByPosition.getVisibility() == 0 && findViewByPosition.hasFocusable()) {
                        findViewByPosition.requestFocus();
                        return;
                    }
                    i9++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityNodeInfo(RecyclerView.Recycler recycler, RecyclerView.State state, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        boolean z8;
        AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat;
        AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat2;
        saveContext(recycler, state);
        int itemCount = state.getItemCount();
        if ((this.mFlag & 262144) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (itemCount > 1 && !isItemFullyVisible(0)) {
            if (Build.VERSION.SDK_INT >= 23) {
                if (this.mOrientation == 0) {
                    if (z8) {
                        accessibilityActionCompat2 = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_RIGHT;
                    } else {
                        accessibilityActionCompat2 = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_LEFT;
                    }
                    accessibilityNodeInfoCompat.addAction(accessibilityActionCompat2);
                } else {
                    accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_UP);
                }
            } else {
                accessibilityNodeInfoCompat.addAction(8192);
            }
            accessibilityNodeInfoCompat.setScrollable(true);
        }
        if (itemCount > 1 && !isItemFullyVisible(itemCount - 1)) {
            if (Build.VERSION.SDK_INT >= 23) {
                if (this.mOrientation == 0) {
                    if (z8) {
                        accessibilityActionCompat = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_LEFT;
                    } else {
                        accessibilityActionCompat = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_RIGHT;
                    }
                    accessibilityNodeInfoCompat.addAction(accessibilityActionCompat);
                } else {
                    accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_DOWN);
                }
            } else {
                accessibilityNodeInfoCompat.addAction(4096);
            }
            accessibilityNodeInfoCompat.setScrollable(true);
        }
        accessibilityNodeInfoCompat.setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(getRowCountForAccessibility(recycler, state), getColumnCountForAccessibility(recycler, state), isLayoutHierarchical(recycler, state), getSelectionModeForAccessibility(recycler, state)));
        leaveContext();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.Recycler recycler, RecyclerView.State state, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        int i8;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (this.mGrid != null && (layoutParams instanceof LayoutParams)) {
            int viewAdapterPosition = ((LayoutParams) layoutParams).getViewAdapterPosition();
            if (viewAdapterPosition >= 0) {
                i8 = this.mGrid.getRowIndex(viewAdapterPosition);
            } else {
                i8 = -1;
            }
            if (i8 < 0) {
                return;
            }
            int numRows = viewAdapterPosition / this.mGrid.getNumRows();
            if (this.mOrientation == 0) {
                accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(i8, 1, numRows, 1, false, false));
            } else {
                accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(numRows, 1, i8, 1, false, false));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cc  */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View onInterceptFocusSearch(android.view.View r8, int r9) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.GridLayoutManager.onInterceptFocusSearch(android.view.View, int):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(RecyclerView recyclerView, int i8, int i9) {
        Grid grid;
        int i10;
        if (this.mFocusPosition != -1 && (grid = this.mGrid) != null && grid.getFirstVisibleIndex() >= 0 && (i10 = this.mFocusPositionOffset) != Integer.MIN_VALUE && i8 <= this.mFocusPosition + i10) {
            this.mFocusPositionOffset = i10 + i9;
        }
        this.mChildrenStates.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsChanged(RecyclerView recyclerView) {
        this.mFocusPositionOffset = 0;
        this.mChildrenStates.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsMoved(RecyclerView recyclerView, int i8, int i9, int i10) {
        int i11;
        int i12 = this.mFocusPosition;
        if (i12 != -1 && (i11 = this.mFocusPositionOffset) != Integer.MIN_VALUE) {
            int i13 = i12 + i11;
            if (i8 <= i13 && i13 < i8 + i10) {
                this.mFocusPositionOffset = i11 + (i9 - i8);
            } else if (i8 < i13 && i9 > i13 - i10) {
                this.mFocusPositionOffset = i11 - i10;
            } else if (i8 > i13 && i9 < i13) {
                this.mFocusPositionOffset = i11 + i10;
            }
        }
        this.mChildrenStates.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(RecyclerView recyclerView, int i8, int i9) {
        Grid grid;
        int i10;
        int i11;
        int i12;
        if (this.mFocusPosition != -1 && (grid = this.mGrid) != null && grid.getFirstVisibleIndex() >= 0 && (i10 = this.mFocusPositionOffset) != Integer.MIN_VALUE && i8 <= (i12 = (i11 = this.mFocusPosition) + i10)) {
            if (i8 + i9 > i12) {
                this.mFocusPosition = i11 + i10 + (i8 - i12);
                this.mFocusPositionOffset = Integer.MIN_VALUE;
            } else {
                this.mFocusPositionOffset = i10 - i9;
            }
        }
        this.mChildrenStates.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(RecyclerView recyclerView, int i8, int i9) {
        int i10 = i9 + i8;
        while (i8 < i10) {
            this.mChildrenStates.remove(i8);
            i8++;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 226
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(androidx.recyclerview.widget.RecyclerView.Recycler r14, androidx.recyclerview.widget.RecyclerView.State r15) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.GridLayoutManager.onLayoutChildren(androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        OnLayoutCompleteListener onLayoutCompleteListener = this.mLayoutCompleteListener;
        if (onLayoutCompleteListener != null) {
            onLayoutCompleteListener.onLayoutCompleted(state);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onMeasure(RecyclerView.Recycler recycler, RecyclerView.State state, int i8, int i9) {
        int size;
        int size2;
        int mode;
        int paddingLeft;
        int paddingRight;
        saveContext(recycler, state);
        if (this.mOrientation == 0) {
            size2 = View.MeasureSpec.getSize(i8);
            size = View.MeasureSpec.getSize(i9);
            mode = View.MeasureSpec.getMode(i9);
            paddingLeft = getPaddingTop();
            paddingRight = getPaddingBottom();
        } else {
            size = View.MeasureSpec.getSize(i8);
            size2 = View.MeasureSpec.getSize(i9);
            mode = View.MeasureSpec.getMode(i8);
            paddingLeft = getPaddingLeft();
            paddingRight = getPaddingRight();
        }
        int i10 = paddingLeft + paddingRight;
        this.mMaxSizeSecondary = size;
        int i11 = this.mRowSizeSecondaryRequested;
        if (i11 == -2) {
            int i12 = this.mNumRowsRequested;
            if (i12 == 0) {
                i12 = 1;
            }
            this.mNumRows = i12;
            this.mFixedRowSizeSecondary = 0;
            int[] iArr = this.mRowSizeSecondary;
            if (iArr == null || iArr.length != i12) {
                this.mRowSizeSecondary = new int[i12];
            }
            if (this.mState.isPreLayout()) {
                updatePositionDeltaInPreLayout();
            }
            processRowSizeSecondary(true);
            if (mode != Integer.MIN_VALUE) {
                if (mode != 0) {
                    if (mode == 1073741824) {
                        size = this.mMaxSizeSecondary;
                    } else {
                        throw new IllegalStateException("wrong spec");
                    }
                } else {
                    size = getSizeSecondary() + i10;
                }
            } else {
                size = Math.min(getSizeSecondary() + i10, this.mMaxSizeSecondary);
            }
        } else {
            if (mode != Integer.MIN_VALUE) {
                if (mode != 0) {
                    if (mode != 1073741824) {
                        throw new IllegalStateException("wrong spec");
                    }
                } else {
                    if (i11 == 0) {
                        i11 = size - i10;
                    }
                    this.mFixedRowSizeSecondary = i11;
                    int i13 = this.mNumRowsRequested;
                    if (i13 == 0) {
                        i13 = 1;
                    }
                    this.mNumRows = i13;
                    size = (i11 * i13) + (this.mSpacingSecondary * (i13 - 1)) + i10;
                }
            }
            int i14 = this.mNumRowsRequested;
            if (i14 == 0 && i11 == 0) {
                this.mNumRows = 1;
                this.mFixedRowSizeSecondary = size - i10;
            } else if (i14 == 0) {
                this.mFixedRowSizeSecondary = i11;
                int i15 = this.mSpacingSecondary;
                this.mNumRows = (size + i15) / (i11 + i15);
            } else if (i11 == 0) {
                this.mNumRows = i14;
                this.mFixedRowSizeSecondary = ((size - i10) - (this.mSpacingSecondary * (i14 - 1))) / i14;
            } else {
                this.mNumRows = i14;
                this.mFixedRowSizeSecondary = i11;
            }
            if (mode == Integer.MIN_VALUE) {
                int i16 = this.mFixedRowSizeSecondary;
                int i17 = this.mNumRows;
                int i18 = (i16 * i17) + (this.mSpacingSecondary * (i17 - 1)) + i10;
                if (i18 < size) {
                    size = i18;
                }
            }
        }
        if (this.mOrientation == 0) {
            setMeasuredDimension(size2, size);
        } else {
            setMeasuredDimension(size, size2);
        }
        leaveContext();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean onRequestChildFocus(RecyclerView recyclerView, View view, View view2) {
        if ((this.mFlag & 32768) == 0 && getAdapterPositionByView(view) != -1 && (this.mFlag & 35) == 0) {
            scrollToView(view, view2, true);
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.mFocusPosition = savedState.index;
        this.mFocusPositionOffset = 0;
        this.mChildrenStates.loadFromBundle(savedState.childStates);
        this.mFlag |= 256;
        requestLayout();
    }

    public void onRtlPropertiesChanged(int i8) {
        int i9;
        boolean z8 = false;
        if (this.mOrientation == 0) {
            if (i8 == 1) {
                i9 = 262144;
            }
            i9 = 0;
        } else {
            if (i8 == 1) {
                i9 = 524288;
            }
            i9 = 0;
        }
        int i10 = this.mFlag;
        if ((PF_REVERSE_FLOW_MASK & i10) == i9) {
            return;
        }
        this.mFlag = i9 | (i10 & (-786433)) | 256;
        WindowAlignment.Axis axis = this.mWindowAlignment.horizontal;
        if (i8 == 1) {
            z8 = true;
        }
        axis.setReversedFlow(z8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState();
        savedState.index = getSelection();
        Bundle saveAsBundle = this.mChildrenStates.saveAsBundle();
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            int adapterPositionByView = getAdapterPositionByView(childAt);
            if (adapterPositionByView != -1) {
                saveAsBundle = this.mChildrenStates.saveOnScreenView(saveAsBundle, childAt, adapterPositionByView);
            }
        }
        savedState.childStates = saveAsBundle;
        return savedState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:            if (r5 != false) goto L26;     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:            r7 = 4096;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:            if (r5 != false) goto L23;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:            if (r7 == androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_DOWN.getId()) goto L26;     */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean performAccessibilityAction(androidx.recyclerview.widget.RecyclerView.Recycler r5, androidx.recyclerview.widget.RecyclerView.State r6, int r7, android.os.Bundle r8) {
        /*
            r4 = this;
            boolean r8 = r4.isScrollEnabled()
            r0 = 1
            if (r8 != 0) goto L8
            return r0
        L8:
            r4.saveContext(r5, r6)
            int r5 = r4.mFlag
            r6 = 262144(0x40000, float:3.67342E-40)
            r5 = r5 & r6
            r6 = 0
            if (r5 == 0) goto L15
            r5 = 1
            goto L16
        L15:
            r5 = 0
        L16:
            int r8 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            r2 = 8192(0x2000, float:1.148E-41)
            r3 = 4096(0x1000, float:5.74E-42)
            if (r8 < r1) goto L4f
            int r8 = r4.mOrientation
            if (r8 != 0) goto L3a
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r8 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_LEFT
            int r8 = r8.getId()
            if (r7 != r8) goto L2f
            if (r5 == 0) goto L42
            goto L4d
        L2f:
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r8 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_RIGHT
            int r8 = r8.getId()
            if (r7 != r8) goto L4f
            if (r5 == 0) goto L4d
            goto L42
        L3a:
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r5 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_UP
            int r5 = r5.getId()
            if (r7 != r5) goto L45
        L42:
            r7 = 8192(0x2000, float:1.148E-41)
            goto L4f
        L45:
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r5 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_DOWN
            int r5 = r5.getId()
            if (r7 != r5) goto L4f
        L4d:
            r7 = 4096(0x1000, float:5.74E-42)
        L4f:
            if (r7 == r3) goto L5c
            if (r7 == r2) goto L54
            goto L62
        L54:
            r4.processPendingMovement(r6)
            r5 = -1
            r4.processSelectionMoves(r6, r5)
            goto L62
        L5c:
            r4.processPendingMovement(r0)
            r4.processSelectionMoves(r6, r0)
        L62:
            r4.leaveContext()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.GridLayoutManager.performAccessibilityAction(androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State, int, android.os.Bundle):boolean");
    }

    int processSelectionMoves(boolean z8, int i8) {
        int i9;
        int i10;
        Grid grid = this.mGrid;
        if (grid == null) {
            return i8;
        }
        int i11 = this.mFocusPosition;
        if (i11 != -1) {
            i9 = grid.getRowIndex(i11);
        } else {
            i9 = -1;
        }
        int childCount = getChildCount();
        View view = null;
        for (int i12 = 0; i12 < childCount && i8 != 0; i12++) {
            if (i8 > 0) {
                i10 = i12;
            } else {
                i10 = (childCount - 1) - i12;
            }
            View childAt = getChildAt(i10);
            if (canScrollTo(childAt)) {
                int adapterPositionByIndex = getAdapterPositionByIndex(i10);
                int rowIndex = this.mGrid.getRowIndex(adapterPositionByIndex);
                if (i9 == -1) {
                    i11 = adapterPositionByIndex;
                    view = childAt;
                    i9 = rowIndex;
                } else if (rowIndex == i9 && ((i8 > 0 && adapterPositionByIndex > i11) || (i8 < 0 && adapterPositionByIndex < i11))) {
                    i8 = i8 > 0 ? i8 - 1 : i8 + 1;
                    i11 = adapterPositionByIndex;
                    view = childAt;
                }
            }
        }
        if (view != null) {
            if (z8) {
                if (hasFocus()) {
                    this.mFlag |= 32;
                    view.requestFocus();
                    this.mFlag &= -33;
                }
                this.mFocusPosition = i11;
                this.mSubFocusPosition = 0;
            } else {
                scrollToView(view, true);
            }
        }
        return i8;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void removeAndRecycleAllViews(RecyclerView.Recycler recycler) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            removeAndRecycleViewAt(childCount, recycler);
        }
    }

    public void removeOnChildViewHolderSelectedListener(OnChildViewHolderSelectedListener onChildViewHolderSelectedListener) {
        ArrayList<OnChildViewHolderSelectedListener> arrayList = this.mChildViewHolderSelectedListeners;
        if (arrayList != null) {
            arrayList.remove(onChildViewHolderSelectedListener);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z8) {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i8, RecyclerView.Recycler recycler, RecyclerView.State state) {
        int scrollDirectionSecondary;
        if ((this.mFlag & 512) != 0 && hasDoneFirstLayout()) {
            saveContext(recycler, state);
            this.mFlag = (this.mFlag & (-4)) | 2;
            if (this.mOrientation == 0) {
                scrollDirectionSecondary = scrollDirectionPrimary(i8);
            } else {
                scrollDirectionSecondary = scrollDirectionSecondary(i8);
            }
            leaveContext();
            this.mFlag &= -4;
            return scrollDirectionSecondary;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i8) {
        setSelection(i8, 0, false, 0);
    }

    void scrollToSelection(int i8, int i9, boolean z8, int i10) {
        this.mPrimaryScrollExtra = i10;
        View findViewByPosition = findViewByPosition(i8);
        boolean z9 = !isSmoothScrolling();
        if (z9 && !this.mBaseGridView.isLayoutRequested() && findViewByPosition != null && getAdapterPositionByView(findViewByPosition) == i8) {
            this.mFlag |= 32;
            scrollToView(findViewByPosition, z8);
            this.mFlag &= -33;
            return;
        }
        int i11 = this.mFlag;
        if ((i11 & 512) != 0 && (i11 & 64) == 0) {
            if (z8 && !this.mBaseGridView.isLayoutRequested()) {
                this.mFocusPosition = i8;
                this.mSubFocusPosition = i9;
                this.mFocusPositionOffset = Integer.MIN_VALUE;
                if (!hasDoneFirstLayout()) {
                    Log.w(getTag(), "setSelectionSmooth should not be called before first layout pass");
                    return;
                }
                int startPositionSmoothScroller = startPositionSmoothScroller(i8);
                if (startPositionSmoothScroller != this.mFocusPosition) {
                    this.mFocusPosition = startPositionSmoothScroller;
                    this.mSubFocusPosition = 0;
                    return;
                }
                return;
            }
            if (!z9) {
                skipSmoothScrollerOnStopInternal();
                this.mBaseGridView.stopScroll();
            }
            if (!this.mBaseGridView.isLayoutRequested() && findViewByPosition != null && getAdapterPositionByView(findViewByPosition) == i8) {
                this.mFlag |= 32;
                scrollToView(findViewByPosition, z8);
                this.mFlag &= -33;
                return;
            } else {
                this.mFocusPosition = i8;
                this.mSubFocusPosition = i9;
                this.mFocusPositionOffset = Integer.MIN_VALUE;
                this.mFlag |= 256;
                requestLayout();
                return;
            }
        }
        this.mFocusPosition = i8;
        this.mSubFocusPosition = i9;
        this.mFocusPositionOffset = Integer.MIN_VALUE;
    }

    void scrollToView(View view, boolean z8) {
        scrollToView(view, view == null ? null : view.findFocus(), z8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i8, RecyclerView.Recycler recycler, RecyclerView.State state) {
        int scrollDirectionSecondary;
        if ((this.mFlag & 512) != 0 && hasDoneFirstLayout()) {
            this.mFlag = (this.mFlag & (-4)) | 2;
            saveContext(recycler, state);
            if (this.mOrientation == 1) {
                scrollDirectionSecondary = scrollDirectionPrimary(i8);
            } else {
                scrollDirectionSecondary = scrollDirectionSecondary(i8);
            }
            leaveContext();
            this.mFlag &= -4;
            return scrollDirectionSecondary;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setChildrenVisibility(int i8) {
        this.mChildVisibility = i8;
        if (i8 != -1) {
            int childCount = getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                getChildAt(i9).setVisibility(this.mChildVisibility);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setExtraLayoutSpace(int i8) {
        int i9 = this.mExtraLayoutSpace;
        if (i9 == i8) {
            return;
        }
        if (i9 >= 0) {
            this.mExtraLayoutSpace = i8;
            requestLayout();
            return;
        }
        throw new IllegalArgumentException("ExtraLayoutSpace must >= 0");
    }

    public void setFocusOutAllowed(boolean z8, boolean z9) {
        int i8;
        int i9 = this.mFlag & (-6145);
        int i10 = 0;
        if (z8) {
            i8 = 2048;
        } else {
            i8 = 0;
        }
        int i11 = i8 | i9;
        if (z9) {
            i10 = 4096;
        }
        this.mFlag = i11 | i10;
    }

    public void setFocusOutSideAllowed(boolean z8, boolean z9) {
        int i8;
        int i9 = this.mFlag & (-24577);
        int i10 = 0;
        if (z8) {
            i8 = 8192;
        } else {
            i8 = 0;
        }
        int i11 = i8 | i9;
        if (z9) {
            i10 = 16384;
        }
        this.mFlag = i11 | i10;
    }

    public void setFocusScrollStrategy(int i8) {
        this.mFocusScrollStrategy = i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setFocusSearchDisabled(boolean z8) {
        int i8;
        int i9 = this.mFlag & (-32769);
        if (z8) {
            i8 = 32768;
        } else {
            i8 = 0;
        }
        this.mFlag = i8 | i9;
    }

    public void setGravity(int i8) {
        this.mGravity = i8;
    }

    public void setHorizontalSpacing(int i8) {
        if (this.mOrientation == 0) {
            this.mHorizontalSpacing = i8;
            this.mSpacingPrimary = i8;
        } else {
            this.mHorizontalSpacing = i8;
            this.mSpacingSecondary = i8;
        }
    }

    public void setItemAlignmentOffset(int i8) {
        this.mItemAlignment.mainAxis().setItemAlignmentOffset(i8);
        updateChildAlignments();
    }

    public void setItemAlignmentOffsetPercent(float f8) {
        this.mItemAlignment.mainAxis().setItemAlignmentOffsetPercent(f8);
        updateChildAlignments();
    }

    public void setItemAlignmentOffsetWithPadding(boolean z8) {
        this.mItemAlignment.mainAxis().setItemAlignmentOffsetWithPadding(z8);
        updateChildAlignments();
    }

    public void setItemAlignmentViewId(int i8) {
        this.mItemAlignment.mainAxis().setItemAlignmentViewId(i8);
        updateChildAlignments();
    }

    public void setItemSpacing(int i8) {
        this.mHorizontalSpacing = i8;
        this.mVerticalSpacing = i8;
        this.mSpacingSecondary = i8;
        this.mSpacingPrimary = i8;
    }

    public void setLayoutEnabled(boolean z8) {
        boolean z9;
        int i8 = this.mFlag;
        int i9 = 0;
        if ((i8 & 512) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9 != z8) {
            int i10 = i8 & (-513);
            if (z8) {
                i9 = 512;
            }
            this.mFlag = i10 | i9;
            requestLayout();
        }
    }

    public void setNumRows(int i8) {
        if (i8 >= 0) {
            this.mNumRowsRequested = i8;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setOnChildLaidOutListener(OnChildLaidOutListener onChildLaidOutListener) {
        this.mChildLaidOutListener = onChildLaidOutListener;
    }

    public void setOnChildSelectedListener(OnChildSelectedListener onChildSelectedListener) {
        this.mChildSelectedListener = onChildSelectedListener;
    }

    public void setOnChildViewHolderSelectedListener(OnChildViewHolderSelectedListener onChildViewHolderSelectedListener) {
        if (onChildViewHolderSelectedListener == null) {
            this.mChildViewHolderSelectedListeners = null;
            return;
        }
        ArrayList<OnChildViewHolderSelectedListener> arrayList = this.mChildViewHolderSelectedListeners;
        if (arrayList == null) {
            this.mChildViewHolderSelectedListeners = new ArrayList<>();
        } else {
            arrayList.clear();
        }
        this.mChildViewHolderSelectedListeners.add(onChildViewHolderSelectedListener);
    }

    public void setOrientation(int i8) {
        if (i8 != 0 && i8 != 1) {
            return;
        }
        this.mOrientation = i8;
        this.mOrientationHelper = OrientationHelper.createOrientationHelper(this, i8);
        this.mWindowAlignment.setOrientation(i8);
        this.mItemAlignment.setOrientation(i8);
        this.mFlag |= 256;
    }

    public void setPruneChild(boolean z8) {
        boolean z9;
        int i8 = this.mFlag;
        int i9 = 65536;
        if ((i8 & 65536) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9 != z8) {
            int i10 = i8 & (-65537);
            if (!z8) {
                i9 = 0;
            }
            this.mFlag = i10 | i9;
            if (z8) {
                requestLayout();
            }
        }
    }

    public void setRowHeight(int i8) {
        if (i8 < 0 && i8 != -2) {
            throw new IllegalArgumentException("Invalid row height: " + i8);
        }
        this.mRowSizeSecondaryRequested = i8;
    }

    public void setScrollEnabled(boolean z8) {
        boolean z9;
        int i8;
        int i9 = this.mFlag;
        int i10 = 0;
        if ((i9 & 131072) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9 != z8) {
            int i11 = i9 & (-131073);
            if (z8) {
                i10 = 131072;
            }
            int i12 = i11 | i10;
            this.mFlag = i12;
            if ((i12 & 131072) != 0 && this.mFocusScrollStrategy == 0 && (i8 = this.mFocusPosition) != -1) {
                scrollToSelection(i8, this.mSubFocusPosition, true, this.mPrimaryScrollExtra);
            }
        }
    }

    public void setSelection(int i8, int i9) {
        setSelection(i8, 0, false, i9);
    }

    public void setSelectionSmooth(int i8) {
        setSelection(i8, 0, true, 0);
    }

    public void setSelectionSmoothWithSub(int i8, int i9) {
        setSelection(i8, i9, true, 0);
    }

    public void setSelectionWithSub(int i8, int i9, int i10) {
        setSelection(i8, i9, false, i10);
    }

    public void setVerticalSpacing(int i8) {
        if (this.mOrientation == 1) {
            this.mVerticalSpacing = i8;
            this.mSpacingPrimary = i8;
        } else {
            this.mVerticalSpacing = i8;
            this.mSpacingSecondary = i8;
        }
    }

    public void setWindowAlignment(int i8) {
        this.mWindowAlignment.mainAxis().setWindowAlignment(i8);
    }

    public void setWindowAlignmentOffset(int i8) {
        this.mWindowAlignment.mainAxis().setWindowAlignmentOffset(i8);
    }

    public void setWindowAlignmentOffsetPercent(float f8) {
        this.mWindowAlignment.mainAxis().setWindowAlignmentOffsetPercent(f8);
    }

    void skipSmoothScrollerOnStopInternal() {
        GridLinearSmoothScroller gridLinearSmoothScroller = this.mCurrentSmoothScroller;
        if (gridLinearSmoothScroller != null) {
            gridLinearSmoothScroller.mSkipOnStopInternal = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void slideIn() {
        int i8 = this.mFlag;
        if ((i8 & 64) != 0) {
            this.mFlag = i8 & (-65);
            int i9 = this.mFocusPosition;
            if (i9 >= 0) {
                scrollToSelection(i9, this.mSubFocusPosition, true, this.mPrimaryScrollExtra);
            } else {
                this.mFlag = i8 & (-193);
                requestLayout();
            }
            int i10 = this.mFlag;
            if ((i10 & 128) != 0) {
                this.mFlag = i10 & (-129);
                if (this.mBaseGridView.getScrollState() == 0 && !isSmoothScrolling()) {
                    requestLayout();
                } else {
                    this.mBaseGridView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: androidx.leanback.widget.GridLayoutManager.3
                        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                        public void onScrollStateChanged(RecyclerView recyclerView, int i11) {
                            if (i11 == 0) {
                                GridLayoutManager.this.mBaseGridView.removeOnScrollListener(this);
                                GridLayoutManager.this.requestLayout();
                            }
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void slideOut() {
        int i8 = this.mFlag;
        if ((i8 & 64) != 0) {
            return;
        }
        this.mFlag = i8 | 64;
        if (getChildCount() == 0) {
            return;
        }
        if (this.mOrientation == 1) {
            this.mBaseGridView.smoothScrollBy(0, getSlideOutDistance(), new AccelerateDecelerateInterpolator());
        } else {
            this.mBaseGridView.smoothScrollBy(getSlideOutDistance(), 0, new AccelerateDecelerateInterpolator());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i8) {
        setSelection(i8, 0, true, 0);
    }

    int startPositionSmoothScroller(int i8) {
        GridLinearSmoothScroller gridLinearSmoothScroller = new GridLinearSmoothScroller() { // from class: androidx.leanback.widget.GridLayoutManager.4
            @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
            public PointF computeScrollVectorForPosition(int i9) {
                int i10;
                if (getChildCount() == 0) {
                    return null;
                }
                GridLayoutManager gridLayoutManager = GridLayoutManager.this;
                int position = gridLayoutManager.getPosition(gridLayoutManager.getChildAt(0));
                GridLayoutManager gridLayoutManager2 = GridLayoutManager.this;
                if ((gridLayoutManager2.mFlag & 262144) == 0 ? i9 < position : i9 > position) {
                    i10 = -1;
                } else {
                    i10 = 1;
                }
                if (gridLayoutManager2.mOrientation == 0) {
                    return new PointF(i10, 0.0f);
                }
                return new PointF(0.0f, i10);
            }
        };
        gridLinearSmoothScroller.setTargetPosition(i8);
        startSmoothScroll(gridLinearSmoothScroller);
        return gridLinearSmoothScroller.getTargetPosition();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void startSmoothScroll(RecyclerView.SmoothScroller smoothScroller) {
        skipSmoothScrollerOnStopInternal();
        super.startSmoothScroll(smoothScroller);
        if (smoothScroller.isRunning() && (smoothScroller instanceof GridLinearSmoothScroller)) {
            GridLinearSmoothScroller gridLinearSmoothScroller = (GridLinearSmoothScroller) smoothScroller;
            this.mCurrentSmoothScroller = gridLinearSmoothScroller;
            if (gridLinearSmoothScroller instanceof PendingMoveSmoothScroller) {
                this.mPendingMoveSmoothScroller = (PendingMoveSmoothScroller) gridLinearSmoothScroller;
                return;
            } else {
                this.mPendingMoveSmoothScroller = null;
                return;
            }
        }
        this.mCurrentSmoothScroller = null;
        this.mPendingMoveSmoothScroller = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        return true;
    }

    void updatePositionDeltaInPreLayout() {
        if (getChildCount() > 0) {
            this.mPositionDeltaInPreLayout = this.mGrid.getFirstVisibleIndex() - ((LayoutParams) getChildAt(0).getLayoutParams()).getViewLayoutPosition();
        } else {
            this.mPositionDeltaInPreLayout = 0;
        }
    }

    void updatePositionToRowMapInPostLayout() {
        Grid.Location location;
        this.mPositionToRowInPostLayout.clear();
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            int oldPosition = this.mBaseGridView.getChildViewHolder(getChildAt(i8)).getOldPosition();
            if (oldPosition >= 0 && (location = this.mGrid.getLocation(oldPosition)) != null) {
                this.mPositionToRowInPostLayout.put(oldPosition, location.row);
            }
        }
    }

    void updateScrollLimits() {
        int firstVisibleIndex;
        int lastVisibleIndex;
        int itemCount;
        int i8;
        boolean z8;
        boolean z9;
        int i9;
        int i10;
        int i11;
        int i12;
        if (this.mState.getItemCount() == 0) {
            return;
        }
        if ((this.mFlag & 262144) == 0) {
            firstVisibleIndex = this.mGrid.getLastVisibleIndex();
            i8 = this.mState.getItemCount() - 1;
            lastVisibleIndex = this.mGrid.getFirstVisibleIndex();
            itemCount = 0;
        } else {
            firstVisibleIndex = this.mGrid.getFirstVisibleIndex();
            lastVisibleIndex = this.mGrid.getLastVisibleIndex();
            itemCount = this.mState.getItemCount() - 1;
            i8 = 0;
        }
        if (firstVisibleIndex >= 0 && lastVisibleIndex >= 0) {
            if (firstVisibleIndex == i8) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (lastVisibleIndex == itemCount) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!z8 && this.mWindowAlignment.mainAxis().isMaxUnknown() && !z9 && this.mWindowAlignment.mainAxis().isMinUnknown()) {
                return;
            }
            if (z8) {
                i9 = this.mGrid.findRowMax(true, sTwoInts);
                View findViewByPosition = findViewByPosition(sTwoInts[1]);
                i10 = getViewCenter(findViewByPosition);
                int[] alignMultiple = ((LayoutParams) findViewByPosition.getLayoutParams()).getAlignMultiple();
                if (alignMultiple != null && alignMultiple.length > 0) {
                    i10 += alignMultiple[alignMultiple.length - 1] - alignMultiple[0];
                }
            } else {
                i9 = Integer.MAX_VALUE;
                i10 = Integer.MAX_VALUE;
            }
            if (z9) {
                i11 = this.mGrid.findRowMin(false, sTwoInts);
                i12 = getViewCenter(findViewByPosition(sTwoInts[1]));
            } else {
                i11 = Integer.MIN_VALUE;
                i12 = Integer.MIN_VALUE;
            }
            this.mWindowAlignment.mainAxis().updateMinMax(i11, i9, i12, i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof RecyclerView.LayoutParams) {
            return new LayoutParams((RecyclerView.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    void scrollToView(View view, boolean z8, int i8, int i9) {
        scrollToView(view, view == null ? null : view.findFocus(), z8, i8, i9);
    }

    public void setSelection(int i8, int i9, boolean z8, int i10) {
        if ((this.mFocusPosition == i8 || i8 == -1) && i9 == this.mSubFocusPosition && i10 == this.mPrimaryScrollExtra) {
            return;
        }
        scrollToSelection(i8, i9, z8, i10);
    }

    private void scrollToView(View view, View view2, boolean z8) {
        scrollToView(view, view2, z8, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.leanback.widget.GridLayoutManager.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i8) {
                return new SavedState[i8];
            }
        };
        Bundle childStates;
        int index;

        SavedState(Parcel parcel) {
            this.childStates = Bundle.EMPTY;
            this.index = parcel.readInt();
            this.childStates = parcel.readBundle(GridLayoutManager.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            parcel.writeInt(this.index);
            parcel.writeBundle(this.childStates);
        }

        SavedState() {
            this.childStates = Bundle.EMPTY;
        }
    }

    private void scrollToView(View view, View view2, boolean z8, int i8, int i9) {
        if ((this.mFlag & 64) != 0) {
            return;
        }
        int adapterPositionByView = getAdapterPositionByView(view);
        int subPositionByView = getSubPositionByView(view, view2);
        if (adapterPositionByView != this.mFocusPosition || subPositionByView != this.mSubFocusPosition) {
            this.mFocusPosition = adapterPositionByView;
            this.mSubFocusPosition = subPositionByView;
            this.mFocusPositionOffset = 0;
            if ((this.mFlag & 3) != 1) {
                dispatchChildSelected();
            }
            if (this.mBaseGridView.isChildrenDrawingOrderEnabledInternal()) {
                this.mBaseGridView.invalidate();
            }
        }
        if (view == null) {
            return;
        }
        if (!view.hasFocus() && this.mBaseGridView.hasFocus()) {
            view.requestFocus();
        }
        if ((this.mFlag & 131072) == 0 && z8) {
            return;
        }
        if (!getScrollPosition(view, view2, sTwoInts) && i8 == 0 && i9 == 0) {
            return;
        }
        int[] iArr = sTwoInts;
        scrollGrid(iArr[0] + i8, iArr[1] + i9, z8);
    }

    private void updateChildAlignments() {
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            updateChildAlignments(getChildAt(i8));
        }
    }
}
