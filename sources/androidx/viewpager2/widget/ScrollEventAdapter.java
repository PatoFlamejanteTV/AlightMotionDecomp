package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ScrollEventAdapter extends RecyclerView.OnScrollListener {
    private static final int NO_POSITION = -1;
    private static final int STATE_IDLE = 0;
    private static final int STATE_IN_PROGRESS_FAKE_DRAG = 4;
    private static final int STATE_IN_PROGRESS_IMMEDIATE_SCROLL = 3;
    private static final int STATE_IN_PROGRESS_MANUAL_DRAG = 1;
    private static final int STATE_IN_PROGRESS_SMOOTH_SCROLL = 2;
    private int mAdapterState;
    private ViewPager2.OnPageChangeCallback mCallback;
    private boolean mDataSetChangeHappened;
    private boolean mDispatchSelected;
    private int mDragStartPosition;
    private boolean mFakeDragging;

    @NonNull
    private final LinearLayoutManager mLayoutManager;

    @NonNull
    private final RecyclerView mRecyclerView;
    private boolean mScrollHappened;
    private int mScrollState;
    private ScrollEventValues mScrollValues;
    private int mTarget;

    @NonNull
    private final ViewPager2 mViewPager;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class ScrollEventValues {
        float mOffset;
        int mOffsetPx;
        int mPosition;

        ScrollEventValues() {
        }

        void reset() {
            this.mPosition = -1;
            this.mOffset = 0.0f;
            this.mOffsetPx = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ScrollEventAdapter(@NonNull ViewPager2 viewPager2) {
        this.mViewPager = viewPager2;
        RecyclerView recyclerView = viewPager2.mRecyclerView;
        this.mRecyclerView = recyclerView;
        this.mLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.mScrollValues = new ScrollEventValues();
        resetState();
    }

    private void dispatchScrolled(int i8, float f8, int i9) {
        ViewPager2.OnPageChangeCallback onPageChangeCallback = this.mCallback;
        if (onPageChangeCallback != null) {
            onPageChangeCallback.onPageScrolled(i8, f8, i9);
        }
    }

    private void dispatchSelected(int i8) {
        ViewPager2.OnPageChangeCallback onPageChangeCallback = this.mCallback;
        if (onPageChangeCallback != null) {
            onPageChangeCallback.onPageSelected(i8);
        }
    }

    private void dispatchStateChanged(int i8) {
        if ((this.mAdapterState == 3 && this.mScrollState == 0) || this.mScrollState == i8) {
            return;
        }
        this.mScrollState = i8;
        ViewPager2.OnPageChangeCallback onPageChangeCallback = this.mCallback;
        if (onPageChangeCallback != null) {
            onPageChangeCallback.onPageScrollStateChanged(i8);
        }
    }

    private int getPosition() {
        return this.mLayoutManager.findFirstVisibleItemPosition();
    }

    private boolean isInAnyDraggingState() {
        int i8 = this.mAdapterState;
        if (i8 == 1 || i8 == 4) {
            return true;
        }
        return false;
    }

    private void resetState() {
        this.mAdapterState = 0;
        this.mScrollState = 0;
        this.mScrollValues.reset();
        this.mDragStartPosition = -1;
        this.mTarget = -1;
        this.mDispatchSelected = false;
        this.mScrollHappened = false;
        this.mFakeDragging = false;
        this.mDataSetChangeHappened = false;
    }

    private void startDrag(boolean z8) {
        int i8;
        this.mFakeDragging = z8;
        if (z8) {
            i8 = 4;
        } else {
            i8 = 1;
        }
        this.mAdapterState = i8;
        int i9 = this.mTarget;
        if (i9 != -1) {
            this.mDragStartPosition = i9;
            this.mTarget = -1;
        } else if (this.mDragStartPosition == -1) {
            this.mDragStartPosition = getPosition();
        }
        dispatchStateChanged(1);
    }

    private void updateScrollEventValues() {
        int top;
        float f8;
        ScrollEventValues scrollEventValues = this.mScrollValues;
        int findFirstVisibleItemPosition = this.mLayoutManager.findFirstVisibleItemPosition();
        scrollEventValues.mPosition = findFirstVisibleItemPosition;
        if (findFirstVisibleItemPosition == -1) {
            scrollEventValues.reset();
            return;
        }
        View findViewByPosition = this.mLayoutManager.findViewByPosition(findFirstVisibleItemPosition);
        if (findViewByPosition == null) {
            scrollEventValues.reset();
            return;
        }
        int leftDecorationWidth = this.mLayoutManager.getLeftDecorationWidth(findViewByPosition);
        int rightDecorationWidth = this.mLayoutManager.getRightDecorationWidth(findViewByPosition);
        int topDecorationHeight = this.mLayoutManager.getTopDecorationHeight(findViewByPosition);
        int bottomDecorationHeight = this.mLayoutManager.getBottomDecorationHeight(findViewByPosition);
        ViewGroup.LayoutParams layoutParams = findViewByPosition.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            leftDecorationWidth += marginLayoutParams.leftMargin;
            rightDecorationWidth += marginLayoutParams.rightMargin;
            topDecorationHeight += marginLayoutParams.topMargin;
            bottomDecorationHeight += marginLayoutParams.bottomMargin;
        }
        int height = findViewByPosition.getHeight() + topDecorationHeight + bottomDecorationHeight;
        int width = findViewByPosition.getWidth() + leftDecorationWidth + rightDecorationWidth;
        if (this.mLayoutManager.getOrientation() == 0) {
            top = (findViewByPosition.getLeft() - leftDecorationWidth) - this.mRecyclerView.getPaddingLeft();
            if (this.mViewPager.isRtl()) {
                top = -top;
            }
            height = width;
        } else {
            top = (findViewByPosition.getTop() - topDecorationHeight) - this.mRecyclerView.getPaddingTop();
        }
        int i8 = -top;
        scrollEventValues.mOffsetPx = i8;
        if (i8 < 0) {
            if (new AnimateLayoutChangeDetector(this.mLayoutManager).mayHaveInterferingAnimations()) {
                throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
            }
            throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(scrollEventValues.mOffsetPx)));
        }
        if (height == 0) {
            f8 = 0.0f;
        } else {
            f8 = i8 / height;
        }
        scrollEventValues.mOffset = f8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double getRelativeScrollPosition() {
        updateScrollEventValues();
        ScrollEventValues scrollEventValues = this.mScrollValues;
        return scrollEventValues.mPosition + scrollEventValues.mOffset;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getScrollState() {
        return this.mScrollState;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isDragging() {
        if (this.mScrollState == 1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isFakeDragging() {
        return this.mFakeDragging;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isIdle() {
        if (this.mScrollState == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void notifyBeginFakeDrag() {
        this.mAdapterState = 4;
        startDrag(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void notifyDataSetChangeHappened() {
        this.mDataSetChangeHappened = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void notifyEndFakeDrag() {
        if (isDragging() && !this.mFakeDragging) {
            return;
        }
        this.mFakeDragging = false;
        updateScrollEventValues();
        ScrollEventValues scrollEventValues = this.mScrollValues;
        if (scrollEventValues.mOffsetPx == 0) {
            int i8 = scrollEventValues.mPosition;
            if (i8 != this.mDragStartPosition) {
                dispatchSelected(i8);
            }
            dispatchStateChanged(0);
            resetState();
            return;
        }
        dispatchStateChanged(2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void notifyProgrammaticScroll(int i8, boolean z8) {
        int i9;
        if (z8) {
            i9 = 2;
        } else {
            i9 = 3;
        }
        this.mAdapterState = i9;
        boolean z9 = false;
        this.mFakeDragging = false;
        if (this.mTarget != i8) {
            z9 = true;
        }
        this.mTarget = i8;
        dispatchStateChanged(2);
        if (z9) {
            dispatchSelected(i8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i8) {
        if ((this.mAdapterState != 1 || this.mScrollState != 1) && i8 == 1) {
            startDrag(false);
            return;
        }
        if (isInAnyDraggingState() && i8 == 2) {
            if (this.mScrollHappened) {
                dispatchStateChanged(2);
                this.mDispatchSelected = true;
                return;
            }
            return;
        }
        if (isInAnyDraggingState() && i8 == 0) {
            updateScrollEventValues();
            if (!this.mScrollHappened) {
                int i9 = this.mScrollValues.mPosition;
                if (i9 != -1) {
                    dispatchScrolled(i9, 0.0f, 0);
                }
            } else {
                ScrollEventValues scrollEventValues = this.mScrollValues;
                if (scrollEventValues.mOffsetPx == 0) {
                    int i10 = this.mDragStartPosition;
                    int i11 = scrollEventValues.mPosition;
                    if (i10 != i11) {
                        dispatchSelected(i11);
                    }
                }
            }
            dispatchStateChanged(0);
            resetState();
        }
        if (this.mAdapterState == 2 && i8 == 0 && this.mDataSetChangeHappened) {
            updateScrollEventValues();
            ScrollEventValues scrollEventValues2 = this.mScrollValues;
            if (scrollEventValues2.mOffsetPx == 0) {
                int i12 = this.mTarget;
                int i13 = scrollEventValues2.mPosition;
                if (i12 != i13) {
                    if (i13 == -1) {
                        i13 = 0;
                    }
                    dispatchSelected(i13);
                }
                dispatchStateChanged(0);
                resetState();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:            if (r5 == r3.mViewPager.isRtl()) goto L12;     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onScrolled(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r4, int r5, int r6) {
        /*
            r3 = this;
            r4 = 1
            r3.mScrollHappened = r4
            r3.updateScrollEventValues()
            boolean r0 = r3.mDispatchSelected
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L37
            r3.mDispatchSelected = r2
            if (r6 > 0) goto L1f
            if (r6 != 0) goto L29
            if (r5 >= 0) goto L16
            r5 = 1
            goto L17
        L16:
            r5 = 0
        L17:
            androidx.viewpager2.widget.ViewPager2 r6 = r3.mViewPager
            boolean r6 = r6.isRtl()
            if (r5 != r6) goto L29
        L1f:
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r5 = r3.mScrollValues
            int r6 = r5.mOffsetPx
            if (r6 == 0) goto L29
            int r5 = r5.mPosition
            int r5 = r5 + r4
            goto L2d
        L29:
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r5 = r3.mScrollValues
            int r5 = r5.mPosition
        L2d:
            r3.mTarget = r5
            int r6 = r3.mDragStartPosition
            if (r6 == r5) goto L45
            r3.dispatchSelected(r5)
            goto L45
        L37:
            int r5 = r3.mAdapterState
            if (r5 != 0) goto L45
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r5 = r3.mScrollValues
            int r5 = r5.mPosition
            if (r5 != r1) goto L42
            r5 = 0
        L42:
            r3.dispatchSelected(r5)
        L45:
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r5 = r3.mScrollValues
            int r6 = r5.mPosition
            if (r6 != r1) goto L4c
            r6 = 0
        L4c:
            float r0 = r5.mOffset
            int r5 = r5.mOffsetPx
            r3.dispatchScrolled(r6, r0, r5)
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r5 = r3.mScrollValues
            int r6 = r5.mPosition
            int r0 = r3.mTarget
            if (r6 == r0) goto L5d
            if (r0 != r1) goto L6b
        L5d:
            int r5 = r5.mOffsetPx
            if (r5 != 0) goto L6b
            int r5 = r3.mScrollState
            if (r5 == r4) goto L6b
            r3.dispatchStateChanged(r2)
            r3.resetState()
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.ScrollEventAdapter.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setOnPageChangeCallback(ViewPager2.OnPageChangeCallback onPageChangeCallback) {
        this.mCallback = onPageChangeCallback;
    }
}
