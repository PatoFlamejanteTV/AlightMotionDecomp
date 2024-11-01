package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.leanback.R;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;

/* loaded from: classes3.dex */
public abstract class BaseGridView extends RecyclerView {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final int FOCUS_SCROLL_ALIGNED = 0;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final int FOCUS_SCROLL_ITEM = 1;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final int FOCUS_SCROLL_PAGE = 2;
    public static final float ITEM_ALIGN_OFFSET_PERCENT_DISABLED = -1.0f;
    public static final int SAVE_ALL_CHILD = 3;
    public static final int SAVE_LIMITED_CHILD = 2;
    public static final int SAVE_NO_CHILD = 0;
    public static final int SAVE_ON_SCREEN_CHILD = 1;
    public static final int WINDOW_ALIGN_BOTH_EDGE = 3;
    public static final int WINDOW_ALIGN_HIGH_EDGE = 2;
    public static final int WINDOW_ALIGN_LOW_EDGE = 1;
    public static final int WINDOW_ALIGN_NO_EDGE = 0;
    public static final float WINDOW_ALIGN_OFFSET_PERCENT_DISABLED = -1.0f;
    private boolean mAnimateChildLayout;
    RecyclerView.RecyclerListener mChainedRecyclerListener;
    private boolean mHasOverlappingRendering;
    int mInitialPrefetchItemCount;
    final GridLayoutManager mLayoutManager;
    private OnKeyInterceptListener mOnKeyInterceptListener;
    private OnMotionInterceptListener mOnMotionInterceptListener;
    private OnTouchInterceptListener mOnTouchInterceptListener;
    private OnUnhandledKeyListener mOnUnhandledKeyListener;
    private RecyclerView.ItemAnimator mSavedItemAnimator;

    /* loaded from: classes3.dex */
    public interface OnKeyInterceptListener {
        boolean onInterceptKeyEvent(KeyEvent keyEvent);
    }

    /* loaded from: classes3.dex */
    public interface OnMotionInterceptListener {
        boolean onInterceptMotionEvent(MotionEvent motionEvent);
    }

    /* loaded from: classes3.dex */
    public interface OnTouchInterceptListener {
        boolean onInterceptTouchEvent(MotionEvent motionEvent);
    }

    /* loaded from: classes3.dex */
    public interface OnUnhandledKeyListener {
        boolean onUnhandledKey(KeyEvent keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BaseGridView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.mAnimateChildLayout = true;
        this.mHasOverlappingRendering = true;
        this.mInitialPrefetchItemCount = 4;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this);
        this.mLayoutManager = gridLayoutManager;
        setLayoutManager(gridLayoutManager);
        setPreserveFocusAfterLayout(false);
        setDescendantFocusability(262144);
        setHasFixedSize(true);
        setChildrenDrawingOrderEnabled(true);
        setWillNotDraw(true);
        setOverScrollMode(2);
        ((SimpleItemAnimator) getItemAnimator()).setSupportsChangeAnimations(false);
        super.setRecyclerListener(new RecyclerView.RecyclerListener() { // from class: androidx.leanback.widget.BaseGridView.1
            @Override // androidx.recyclerview.widget.RecyclerView.RecyclerListener
            public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
                BaseGridView.this.mLayoutManager.onChildRecycled(viewHolder);
                RecyclerView.RecyclerListener recyclerListener = BaseGridView.this.mChainedRecyclerListener;
                if (recyclerListener != null) {
                    recyclerListener.onViewRecycled(viewHolder);
                }
            }
        });
    }

    public void addOnChildViewHolderSelectedListener(OnChildViewHolderSelectedListener onChildViewHolderSelectedListener) {
        this.mLayoutManager.addOnChildViewHolderSelectedListener(onChildViewHolderSelectedListener);
    }

    public void animateIn() {
        this.mLayoutManager.slideIn();
    }

    public void animateOut() {
        this.mLayoutManager.slideOut();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected boolean dispatchGenericFocusedEvent(MotionEvent motionEvent) {
        OnMotionInterceptListener onMotionInterceptListener = this.mOnMotionInterceptListener;
        if (onMotionInterceptListener != null && onMotionInterceptListener.onInterceptMotionEvent(motionEvent)) {
            return true;
        }
        return super.dispatchGenericFocusedEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        OnKeyInterceptListener onKeyInterceptListener = this.mOnKeyInterceptListener;
        if ((onKeyInterceptListener != null && onKeyInterceptListener.onInterceptKeyEvent(keyEvent)) || super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        OnUnhandledKeyListener onUnhandledKeyListener = this.mOnUnhandledKeyListener;
        if (onUnhandledKeyListener != null && onUnhandledKeyListener.onUnhandledKey(keyEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        OnTouchInterceptListener onTouchInterceptListener = this.mOnTouchInterceptListener;
        if (onTouchInterceptListener != null && onTouchInterceptListener.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public View focusSearch(int i8) {
        if (isFocused()) {
            GridLayoutManager gridLayoutManager = this.mLayoutManager;
            View findViewByPosition = gridLayoutManager.findViewByPosition(gridLayoutManager.getSelection());
            if (findViewByPosition != null) {
                return focusSearch(findViewByPosition, i8);
            }
        }
        return super.focusSearch(i8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public int getChildDrawingOrder(int i8, int i9) {
        return this.mLayoutManager.getChildDrawingOrder(this, i8, i9);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getExtraLayoutSpace() {
        return this.mLayoutManager.getExtraLayoutSpace();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getFocusScrollStrategy() {
        return this.mLayoutManager.getFocusScrollStrategy();
    }

    @Deprecated
    public int getHorizontalMargin() {
        return this.mLayoutManager.getHorizontalSpacing();
    }

    public int getHorizontalSpacing() {
        return this.mLayoutManager.getHorizontalSpacing();
    }

    public int getInitialPrefetchItemCount() {
        return this.mInitialPrefetchItemCount;
    }

    public int getItemAlignmentOffset() {
        return this.mLayoutManager.getItemAlignmentOffset();
    }

    public float getItemAlignmentOffsetPercent() {
        return this.mLayoutManager.getItemAlignmentOffsetPercent();
    }

    public int getItemAlignmentViewId() {
        return this.mLayoutManager.getItemAlignmentViewId();
    }

    public OnUnhandledKeyListener getOnUnhandledKeyListener() {
        return this.mOnUnhandledKeyListener;
    }

    public final int getSaveChildrenLimitNumber() {
        return this.mLayoutManager.mChildrenStates.getLimitNumber();
    }

    public final int getSaveChildrenPolicy() {
        return this.mLayoutManager.mChildrenStates.getSavePolicy();
    }

    public int getSelectedPosition() {
        return this.mLayoutManager.getSelection();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getSelectedSubPosition() {
        return this.mLayoutManager.getSubSelection();
    }

    @Deprecated
    public int getVerticalMargin() {
        return this.mLayoutManager.getVerticalSpacing();
    }

    public int getVerticalSpacing() {
        return this.mLayoutManager.getVerticalSpacing();
    }

    public void getViewSelectedOffsets(View view, int[] iArr) {
        this.mLayoutManager.getViewSelectedOffsets(view, iArr);
    }

    public int getWindowAlignment() {
        return this.mLayoutManager.getWindowAlignment();
    }

    public int getWindowAlignmentOffset() {
        return this.mLayoutManager.getWindowAlignmentOffset();
    }

    public float getWindowAlignmentOffsetPercent() {
        return this.mLayoutManager.getWindowAlignmentOffsetPercent();
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.mHasOverlappingRendering;
    }

    public boolean hasPreviousViewInSameRow(int i8) {
        return this.mLayoutManager.hasPreviousViewInSameRow(i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void initBaseGridViewAttributes(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.lbBaseGridView);
        this.mLayoutManager.setFocusOutAllowed(obtainStyledAttributes.getBoolean(R.styleable.lbBaseGridView_focusOutFront, false), obtainStyledAttributes.getBoolean(R.styleable.lbBaseGridView_focusOutEnd, false));
        this.mLayoutManager.setFocusOutSideAllowed(obtainStyledAttributes.getBoolean(R.styleable.lbBaseGridView_focusOutSideStart, true), obtainStyledAttributes.getBoolean(R.styleable.lbBaseGridView_focusOutSideEnd, true));
        this.mLayoutManager.setVerticalSpacing(obtainStyledAttributes.getDimensionPixelSize(R.styleable.lbBaseGridView_android_verticalSpacing, obtainStyledAttributes.getDimensionPixelSize(R.styleable.lbBaseGridView_verticalMargin, 0)));
        this.mLayoutManager.setHorizontalSpacing(obtainStyledAttributes.getDimensionPixelSize(R.styleable.lbBaseGridView_android_horizontalSpacing, obtainStyledAttributes.getDimensionPixelSize(R.styleable.lbBaseGridView_horizontalMargin, 0)));
        int i8 = R.styleable.lbBaseGridView_android_gravity;
        if (obtainStyledAttributes.hasValue(i8)) {
            setGravity(obtainStyledAttributes.getInt(i8, 0));
        }
        obtainStyledAttributes.recycle();
    }

    public boolean isChildLayoutAnimated() {
        return this.mAnimateChildLayout;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean isChildrenDrawingOrderEnabledInternal() {
        return isChildrenDrawingOrderEnabled();
    }

    public boolean isFocusDrawingOrderEnabled() {
        return super.isChildrenDrawingOrderEnabled();
    }

    public final boolean isFocusSearchDisabled() {
        return this.mLayoutManager.isFocusSearchDisabled();
    }

    public boolean isItemAlignmentOffsetWithPadding() {
        return this.mLayoutManager.isItemAlignmentOffsetWithPadding();
    }

    public boolean isScrollEnabled() {
        return this.mLayoutManager.isScrollEnabled();
    }

    public boolean isWindowAlignmentPreferKeyLineOverHighEdge() {
        return this.mLayoutManager.mWindowAlignment.mainAxis().isPreferKeylineOverHighEdge();
    }

    public boolean isWindowAlignmentPreferKeyLineOverLowEdge() {
        return this.mLayoutManager.mWindowAlignment.mainAxis().isPreferKeylineOverLowEdge();
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z8, int i8, Rect rect) {
        super.onFocusChanged(z8, i8, rect);
        this.mLayoutManager.onFocusChanged(z8, i8, rect);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i8, Rect rect) {
        return this.mLayoutManager.gridOnRequestFocusInDescendants(this, i8, rect);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i8) {
        this.mLayoutManager.onRtlPropertiesChanged(i8);
    }

    public void removeOnChildViewHolderSelectedListener(OnChildViewHolderSelectedListener onChildViewHolderSelectedListener) {
        this.mLayoutManager.removeOnChildViewHolderSelectedListener(onChildViewHolderSelectedListener);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void scrollToPosition(int i8) {
        if (this.mLayoutManager.isSlidingChildViews()) {
            this.mLayoutManager.setSelectionWithSub(i8, 0, 0);
        } else {
            super.scrollToPosition(i8);
        }
    }

    public void setAnimateChildLayout(boolean z8) {
        if (this.mAnimateChildLayout != z8) {
            this.mAnimateChildLayout = z8;
            if (!z8) {
                this.mSavedItemAnimator = getItemAnimator();
                super.setItemAnimator(null);
            } else {
                super.setItemAnimator(this.mSavedItemAnimator);
            }
        }
    }

    public void setChildrenVisibility(int i8) {
        this.mLayoutManager.setChildrenVisibility(i8);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setExtraLayoutSpace(int i8) {
        this.mLayoutManager.setExtraLayoutSpace(i8);
    }

    public void setFocusDrawingOrderEnabled(boolean z8) {
        super.setChildrenDrawingOrderEnabled(z8);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setFocusScrollStrategy(int i8) {
        if (i8 != 0 && i8 != 1 && i8 != 2) {
            throw new IllegalArgumentException("Invalid scrollStrategy");
        }
        this.mLayoutManager.setFocusScrollStrategy(i8);
        requestLayout();
    }

    public final void setFocusSearchDisabled(boolean z8) {
        int i8;
        if (z8) {
            i8 = 393216;
        } else {
            i8 = 262144;
        }
        setDescendantFocusability(i8);
        this.mLayoutManager.setFocusSearchDisabled(z8);
    }

    public void setGravity(int i8) {
        this.mLayoutManager.setGravity(i8);
        requestLayout();
    }

    public void setHasOverlappingRendering(boolean z8) {
        this.mHasOverlappingRendering = z8;
    }

    @Deprecated
    public void setHorizontalMargin(int i8) {
        setHorizontalSpacing(i8);
    }

    public void setHorizontalSpacing(int i8) {
        this.mLayoutManager.setHorizontalSpacing(i8);
        requestLayout();
    }

    public void setInitialPrefetchItemCount(int i8) {
        this.mInitialPrefetchItemCount = i8;
    }

    public void setItemAlignmentOffset(int i8) {
        this.mLayoutManager.setItemAlignmentOffset(i8);
        requestLayout();
    }

    public void setItemAlignmentOffsetPercent(float f8) {
        this.mLayoutManager.setItemAlignmentOffsetPercent(f8);
        requestLayout();
    }

    public void setItemAlignmentOffsetWithPadding(boolean z8) {
        this.mLayoutManager.setItemAlignmentOffsetWithPadding(z8);
        requestLayout();
    }

    public void setItemAlignmentViewId(int i8) {
        this.mLayoutManager.setItemAlignmentViewId(i8);
    }

    @Deprecated
    public void setItemMargin(int i8) {
        setItemSpacing(i8);
    }

    public void setItemSpacing(int i8) {
        this.mLayoutManager.setItemSpacing(i8);
        requestLayout();
    }

    public void setLayoutEnabled(boolean z8) {
        this.mLayoutManager.setLayoutEnabled(z8);
    }

    public void setOnChildLaidOutListener(OnChildLaidOutListener onChildLaidOutListener) {
        this.mLayoutManager.setOnChildLaidOutListener(onChildLaidOutListener);
    }

    public void setOnChildSelectedListener(OnChildSelectedListener onChildSelectedListener) {
        this.mLayoutManager.setOnChildSelectedListener(onChildSelectedListener);
    }

    public void setOnChildViewHolderSelectedListener(OnChildViewHolderSelectedListener onChildViewHolderSelectedListener) {
        this.mLayoutManager.setOnChildViewHolderSelectedListener(onChildViewHolderSelectedListener);
    }

    public void setOnKeyInterceptListener(OnKeyInterceptListener onKeyInterceptListener) {
        this.mOnKeyInterceptListener = onKeyInterceptListener;
    }

    public void setOnMotionInterceptListener(OnMotionInterceptListener onMotionInterceptListener) {
        this.mOnMotionInterceptListener = onMotionInterceptListener;
    }

    public void setOnTouchInterceptListener(OnTouchInterceptListener onTouchInterceptListener) {
        this.mOnTouchInterceptListener = onTouchInterceptListener;
    }

    public void setOnUnhandledKeyListener(OnUnhandledKeyListener onUnhandledKeyListener) {
        this.mOnUnhandledKeyListener = onUnhandledKeyListener;
    }

    public void setPruneChild(boolean z8) {
        this.mLayoutManager.setPruneChild(z8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setRecyclerListener(RecyclerView.RecyclerListener recyclerListener) {
        this.mChainedRecyclerListener = recyclerListener;
    }

    public final void setSaveChildrenLimitNumber(int i8) {
        this.mLayoutManager.mChildrenStates.setLimitNumber(i8);
    }

    public final void setSaveChildrenPolicy(int i8) {
        this.mLayoutManager.mChildrenStates.setSavePolicy(i8);
    }

    public void setScrollEnabled(boolean z8) {
        this.mLayoutManager.setScrollEnabled(z8);
    }

    public void setSelectedPosition(int i8) {
        this.mLayoutManager.setSelection(i8, 0);
    }

    public void setSelectedPositionSmooth(int i8) {
        this.mLayoutManager.setSelectionSmooth(i8);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSelectedPositionSmoothWithSub(int i8, int i9) {
        this.mLayoutManager.setSelectionSmoothWithSub(i8, i9);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSelectedPositionWithSub(int i8, int i9) {
        this.mLayoutManager.setSelectionWithSub(i8, i9, 0);
    }

    @Deprecated
    public void setVerticalMargin(int i8) {
        setVerticalSpacing(i8);
    }

    public void setVerticalSpacing(int i8) {
        this.mLayoutManager.setVerticalSpacing(i8);
        requestLayout();
    }

    public void setWindowAlignment(int i8) {
        this.mLayoutManager.setWindowAlignment(i8);
        requestLayout();
    }

    public void setWindowAlignmentOffset(int i8) {
        this.mLayoutManager.setWindowAlignmentOffset(i8);
        requestLayout();
    }

    public void setWindowAlignmentOffsetPercent(float f8) {
        this.mLayoutManager.setWindowAlignmentOffsetPercent(f8);
        requestLayout();
    }

    public void setWindowAlignmentPreferKeyLineOverHighEdge(boolean z8) {
        this.mLayoutManager.mWindowAlignment.mainAxis().setPreferKeylineOverHighEdge(z8);
        requestLayout();
    }

    public void setWindowAlignmentPreferKeyLineOverLowEdge(boolean z8) {
        this.mLayoutManager.mWindowAlignment.mainAxis().setPreferKeylineOverLowEdge(z8);
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void smoothScrollToPosition(int i8) {
        if (this.mLayoutManager.isSlidingChildViews()) {
            this.mLayoutManager.setSelectionWithSub(i8, 0, 0);
        } else {
            super.smoothScrollToPosition(i8);
        }
    }

    public void setSelectedPosition(int i8, int i9) {
        this.mLayoutManager.setSelection(i8, i9);
    }

    public void setSelectedPositionSmooth(final int i8, final ViewHolderTask viewHolderTask) {
        if (viewHolderTask != null) {
            RecyclerView.ViewHolder findViewHolderForPosition = findViewHolderForPosition(i8);
            if (findViewHolderForPosition != null && !hasPendingAdapterUpdates()) {
                viewHolderTask.run(findViewHolderForPosition);
            } else {
                addOnChildViewHolderSelectedListener(new OnChildViewHolderSelectedListener() { // from class: androidx.leanback.widget.BaseGridView.2
                    @Override // androidx.leanback.widget.OnChildViewHolderSelectedListener
                    public void onChildViewHolderSelected(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, int i9, int i10) {
                        if (i9 == i8) {
                            BaseGridView.this.removeOnChildViewHolderSelectedListener(this);
                            viewHolderTask.run(viewHolder);
                        }
                    }
                });
            }
        }
        setSelectedPositionSmooth(i8);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSelectedPositionWithSub(int i8, int i9, int i10) {
        this.mLayoutManager.setSelectionWithSub(i8, i9, i10);
    }

    public void setSelectedPosition(final int i8, final ViewHolderTask viewHolderTask) {
        if (viewHolderTask != null) {
            RecyclerView.ViewHolder findViewHolderForPosition = findViewHolderForPosition(i8);
            if (findViewHolderForPosition != null && !hasPendingAdapterUpdates()) {
                viewHolderTask.run(findViewHolderForPosition);
            } else {
                addOnChildViewHolderSelectedListener(new OnChildViewHolderSelectedListener() { // from class: androidx.leanback.widget.BaseGridView.3
                    @Override // androidx.leanback.widget.OnChildViewHolderSelectedListener
                    public void onChildViewHolderSelectedAndPositioned(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, int i9, int i10) {
                        if (i9 == i8) {
                            BaseGridView.this.removeOnChildViewHolderSelectedListener(this);
                            viewHolderTask.run(viewHolder);
                        }
                    }
                });
            }
        }
        setSelectedPosition(i8);
    }
}
