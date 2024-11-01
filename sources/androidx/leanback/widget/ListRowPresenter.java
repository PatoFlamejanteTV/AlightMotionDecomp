package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.R;
import androidx.leanback.system.Settings;
import androidx.leanback.transition.TransitionHelper;
import androidx.leanback.widget.BaseGridView;
import androidx.leanback.widget.ItemBridgeAdapter;
import androidx.leanback.widget.Presenter;
import androidx.leanback.widget.RowHeaderPresenter;
import androidx.leanback.widget.RowPresenter;
import androidx.leanback.widget.ShadowOverlayHelper;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class ListRowPresenter extends RowPresenter {
    private static final boolean DEBUG = false;
    private static final int DEFAULT_RECYCLED_POOL_SIZE = 24;
    private static final String TAG = "ListRowPresenter";
    private static int sExpandedRowNoHovercardBottomPadding;
    private static int sExpandedSelectedRowTopPadding;
    private static int sSelectedRowTopPadding;
    private int mBrowseRowsFadingEdgeLength;
    private int mExpandedRowHeight;
    private int mFocusZoomFactor;
    private PresenterSelector mHoverCardPresenterSelector;
    private boolean mKeepChildForeground;
    private int mNumRows;
    private HashMap<Presenter, Integer> mRecycledPoolSize;
    private boolean mRoundedCornersEnabled;
    private int mRowHeight;
    private boolean mShadowEnabled;
    ShadowOverlayHelper mShadowOverlayHelper;
    private ItemBridgeAdapter.Wrapper mShadowOverlayWrapper;
    private boolean mUseFocusDimmer;

    /* loaded from: classes3.dex */
    class ListRowPresenterItemBridgeAdapter extends ItemBridgeAdapter {
        ViewHolder mRowViewHolder;

        ListRowPresenterItemBridgeAdapter(ViewHolder viewHolder) {
            this.mRowViewHolder = viewHolder;
        }

        @Override // androidx.leanback.widget.ItemBridgeAdapter
        public void onAddPresenter(Presenter presenter, int i8) {
            this.mRowViewHolder.getGridView().getRecycledViewPool().setMaxRecycledViews(i8, ListRowPresenter.this.getRecycledPoolSize(presenter));
        }

        @Override // androidx.leanback.widget.ItemBridgeAdapter
        public void onAttachedToWindow(ItemBridgeAdapter.ViewHolder viewHolder) {
            ListRowPresenter.this.applySelectLevelToChild(this.mRowViewHolder, viewHolder.itemView);
            this.mRowViewHolder.syncActivatedStatus(viewHolder.itemView);
        }

        @Override // androidx.leanback.widget.ItemBridgeAdapter
        public void onBind(final ItemBridgeAdapter.ViewHolder viewHolder) {
            if (this.mRowViewHolder.getOnItemViewClickedListener() != null) {
                viewHolder.mHolder.view.setOnClickListener(new View.OnClickListener() { // from class: androidx.leanback.widget.ListRowPresenter.ListRowPresenterItemBridgeAdapter.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        ItemBridgeAdapter.ViewHolder viewHolder2 = (ItemBridgeAdapter.ViewHolder) ListRowPresenterItemBridgeAdapter.this.mRowViewHolder.mGridView.getChildViewHolder(viewHolder.itemView);
                        if (ListRowPresenterItemBridgeAdapter.this.mRowViewHolder.getOnItemViewClickedListener() != null) {
                            BaseOnItemViewClickedListener onItemViewClickedListener = ListRowPresenterItemBridgeAdapter.this.mRowViewHolder.getOnItemViewClickedListener();
                            Presenter.ViewHolder viewHolder3 = viewHolder.mHolder;
                            Object obj = viewHolder2.mItem;
                            ViewHolder viewHolder4 = ListRowPresenterItemBridgeAdapter.this.mRowViewHolder;
                            onItemViewClickedListener.onItemClicked(viewHolder3, obj, viewHolder4, (ListRow) viewHolder4.mRow);
                        }
                    }
                });
            }
        }

        @Override // androidx.leanback.widget.ItemBridgeAdapter
        protected void onCreate(ItemBridgeAdapter.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            if (view instanceof ViewGroup) {
                TransitionHelper.setTransitionGroup((ViewGroup) view, true);
            }
            ShadowOverlayHelper shadowOverlayHelper = ListRowPresenter.this.mShadowOverlayHelper;
            if (shadowOverlayHelper != null) {
                shadowOverlayHelper.onViewCreated(viewHolder.itemView);
            }
        }

        @Override // androidx.leanback.widget.ItemBridgeAdapter
        public void onUnbind(ItemBridgeAdapter.ViewHolder viewHolder) {
            if (this.mRowViewHolder.getOnItemViewClickedListener() != null) {
                viewHolder.mHolder.view.setOnClickListener(null);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class SelectItemViewHolderTask extends Presenter.ViewHolderTask {
        private int mItemPosition;
        Presenter.ViewHolderTask mItemTask;
        private boolean mSmoothScroll = true;

        public SelectItemViewHolderTask(int i8) {
            setItemPosition(i8);
        }

        public int getItemPosition() {
            return this.mItemPosition;
        }

        public Presenter.ViewHolderTask getItemTask() {
            return this.mItemTask;
        }

        public boolean isSmoothScroll() {
            return this.mSmoothScroll;
        }

        @Override // androidx.leanback.widget.Presenter.ViewHolderTask
        public void run(Presenter.ViewHolder viewHolder) {
            ViewHolderTask viewHolderTask;
            if (viewHolder instanceof ViewHolder) {
                HorizontalGridView gridView = ((ViewHolder) viewHolder).getGridView();
                if (this.mItemTask != null) {
                    viewHolderTask = new ViewHolderTask() { // from class: androidx.leanback.widget.ListRowPresenter.SelectItemViewHolderTask.1
                        final Presenter.ViewHolderTask itemTask;

                        {
                            this.itemTask = SelectItemViewHolderTask.this.mItemTask;
                        }

                        @Override // androidx.leanback.widget.ViewHolderTask
                        public void run(RecyclerView.ViewHolder viewHolder2) {
                            this.itemTask.run(((ItemBridgeAdapter.ViewHolder) viewHolder2).getViewHolder());
                        }
                    };
                } else {
                    viewHolderTask = null;
                }
                if (isSmoothScroll()) {
                    gridView.setSelectedPositionSmooth(this.mItemPosition, viewHolderTask);
                } else {
                    gridView.setSelectedPosition(this.mItemPosition, viewHolderTask);
                }
            }
        }

        public void setItemPosition(int i8) {
            this.mItemPosition = i8;
        }

        public void setItemTask(Presenter.ViewHolderTask viewHolderTask) {
            this.mItemTask = viewHolderTask;
        }

        public void setSmoothScroll(boolean z8) {
            this.mSmoothScroll = z8;
        }
    }

    /* loaded from: classes3.dex */
    public static class ViewHolder extends RowPresenter.ViewHolder {
        final HorizontalGridView mGridView;
        final HorizontalHoverCardSwitcher mHoverCardViewSwitcher;
        ItemBridgeAdapter mItemBridgeAdapter;
        final ListRowPresenter mListRowPresenter;
        final int mPaddingBottom;
        final int mPaddingLeft;
        final int mPaddingRight;
        final int mPaddingTop;

        public ViewHolder(View view, HorizontalGridView horizontalGridView, ListRowPresenter listRowPresenter) {
            super(view);
            this.mHoverCardViewSwitcher = new HorizontalHoverCardSwitcher();
            this.mGridView = horizontalGridView;
            this.mListRowPresenter = listRowPresenter;
            this.mPaddingTop = horizontalGridView.getPaddingTop();
            this.mPaddingBottom = horizontalGridView.getPaddingBottom();
            this.mPaddingLeft = horizontalGridView.getPaddingLeft();
            this.mPaddingRight = horizontalGridView.getPaddingRight();
        }

        public final ItemBridgeAdapter getBridgeAdapter() {
            return this.mItemBridgeAdapter;
        }

        public final HorizontalGridView getGridView() {
            return this.mGridView;
        }

        public Presenter.ViewHolder getItemViewHolder(int i8) {
            ItemBridgeAdapter.ViewHolder viewHolder = (ItemBridgeAdapter.ViewHolder) this.mGridView.findViewHolderForAdapterPosition(i8);
            if (viewHolder == null) {
                return null;
            }
            return viewHolder.getViewHolder();
        }

        public final ListRowPresenter getListRowPresenter() {
            return this.mListRowPresenter;
        }

        @Override // androidx.leanback.widget.RowPresenter.ViewHolder
        public Object getSelectedItem() {
            ItemBridgeAdapter.ViewHolder viewHolder = (ItemBridgeAdapter.ViewHolder) this.mGridView.findViewHolderForAdapterPosition(getSelectedPosition());
            if (viewHolder == null) {
                return null;
            }
            return viewHolder.getItem();
        }

        @Override // androidx.leanback.widget.RowPresenter.ViewHolder
        public Presenter.ViewHolder getSelectedItemViewHolder() {
            return getItemViewHolder(getSelectedPosition());
        }

        public int getSelectedPosition() {
            return this.mGridView.getSelectedPosition();
        }
    }

    public ListRowPresenter() {
        this(2);
    }

    private int getSpaceUnderBaseline(ViewHolder viewHolder) {
        RowHeaderPresenter.ViewHolder headerViewHolder = viewHolder.getHeaderViewHolder();
        if (headerViewHolder != null) {
            if (getHeaderPresenter() != null) {
                return getHeaderPresenter().getSpaceUnderBaseline(headerViewHolder);
            }
            return headerViewHolder.view.getPaddingBottom();
        }
        return 0;
    }

    private static void initStatics(Context context) {
        if (sSelectedRowTopPadding == 0) {
            sSelectedRowTopPadding = context.getResources().getDimensionPixelSize(R.dimen.lb_browse_selected_row_top_padding);
            sExpandedSelectedRowTopPadding = context.getResources().getDimensionPixelSize(R.dimen.lb_browse_expanded_selected_row_top_padding);
            sExpandedRowNoHovercardBottomPadding = context.getResources().getDimensionPixelSize(R.dimen.lb_browse_expanded_row_no_hovercard_bottom_padding);
        }
    }

    private void setVerticalPadding(ViewHolder viewHolder) {
        int i8;
        int i9;
        int i10;
        if (viewHolder.isExpanded()) {
            int spaceUnderBaseline = getSpaceUnderBaseline(viewHolder);
            if (viewHolder.isSelected()) {
                i10 = sExpandedSelectedRowTopPadding;
            } else {
                i10 = viewHolder.mPaddingTop;
            }
            i9 = i10 - spaceUnderBaseline;
            if (this.mHoverCardPresenterSelector == null) {
                i8 = sExpandedRowNoHovercardBottomPadding;
            } else {
                i8 = viewHolder.mPaddingBottom;
            }
        } else if (viewHolder.isSelected()) {
            i8 = sSelectedRowTopPadding;
            i9 = i8 - viewHolder.mPaddingBottom;
        } else {
            i8 = viewHolder.mPaddingBottom;
            i9 = 0;
        }
        viewHolder.getGridView().setPadding(viewHolder.mPaddingLeft, i9, viewHolder.mPaddingRight, i8);
    }

    private void setupFadingEffect(ListRowView listRowView) {
        HorizontalGridView gridView = listRowView.getGridView();
        if (this.mBrowseRowsFadingEdgeLength < 0) {
            TypedArray obtainStyledAttributes = gridView.getContext().obtainStyledAttributes(R.styleable.LeanbackTheme);
            this.mBrowseRowsFadingEdgeLength = (int) obtainStyledAttributes.getDimension(R.styleable.LeanbackTheme_browseRowsFadingEdgeLength, 0.0f);
            obtainStyledAttributes.recycle();
        }
        gridView.setFadingLeftEdgeLength(this.mBrowseRowsFadingEdgeLength);
    }

    private void updateFooterViewSwitcher(ViewHolder viewHolder) {
        View view;
        if (viewHolder.mExpanded && viewHolder.mSelected) {
            PresenterSelector presenterSelector = this.mHoverCardPresenterSelector;
            if (presenterSelector != null) {
                viewHolder.mHoverCardViewSwitcher.init((ViewGroup) viewHolder.view, presenterSelector);
            }
            HorizontalGridView horizontalGridView = viewHolder.mGridView;
            ItemBridgeAdapter.ViewHolder viewHolder2 = (ItemBridgeAdapter.ViewHolder) horizontalGridView.findViewHolderForPosition(horizontalGridView.getSelectedPosition());
            if (viewHolder2 == null) {
                view = null;
            } else {
                view = viewHolder2.itemView;
            }
            selectChildView(viewHolder, view, false);
            return;
        }
        if (this.mHoverCardPresenterSelector != null) {
            viewHolder.mHoverCardViewSwitcher.unselect();
        }
    }

    protected void applySelectLevelToChild(ViewHolder viewHolder, View view) {
        ShadowOverlayHelper shadowOverlayHelper = this.mShadowOverlayHelper;
        if (shadowOverlayHelper != null && shadowOverlayHelper.needsOverlay()) {
            this.mShadowOverlayHelper.setOverlayColor(view, viewHolder.mColorDimmer.getPaint().getColor());
        }
    }

    public final boolean areChildRoundedCornersEnabled() {
        return this.mRoundedCornersEnabled;
    }

    @Override // androidx.leanback.widget.RowPresenter
    protected RowPresenter.ViewHolder createRowViewHolder(ViewGroup viewGroup) {
        initStatics(viewGroup.getContext());
        ListRowView listRowView = new ListRowView(viewGroup.getContext());
        setupFadingEffect(listRowView);
        if (this.mRowHeight != 0) {
            listRowView.getGridView().setRowHeight(this.mRowHeight);
        }
        return new ViewHolder(listRowView, listRowView.getGridView(), this);
    }

    protected ShadowOverlayHelper.Options createShadowOverlayOptions() {
        return ShadowOverlayHelper.Options.DEFAULT;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.leanback.widget.RowPresenter
    public void dispatchItemSelectedListener(RowPresenter.ViewHolder viewHolder, boolean z8) {
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        HorizontalGridView horizontalGridView = viewHolder2.mGridView;
        ItemBridgeAdapter.ViewHolder viewHolder3 = (ItemBridgeAdapter.ViewHolder) horizontalGridView.findViewHolderForPosition(horizontalGridView.getSelectedPosition());
        if (viewHolder3 == null) {
            super.dispatchItemSelectedListener(viewHolder, z8);
        } else if (z8 && viewHolder.getOnItemViewSelectedListener() != null) {
            viewHolder.getOnItemViewSelectedListener().onItemSelected(viewHolder3.getViewHolder(), viewHolder3.mItem, viewHolder2, viewHolder2.getRow());
        }
    }

    public final void enableChildRoundedCorners(boolean z8) {
        this.mRoundedCornersEnabled = z8;
    }

    @Override // androidx.leanback.widget.RowPresenter
    public void freeze(RowPresenter.ViewHolder viewHolder, boolean z8) {
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        viewHolder2.mGridView.setScrollEnabled(!z8);
        viewHolder2.mGridView.setAnimateChildLayout(!z8);
    }

    public int getExpandedRowHeight() {
        int i8 = this.mExpandedRowHeight;
        if (i8 == 0) {
            return this.mRowHeight;
        }
        return i8;
    }

    public final int getFocusZoomFactor() {
        return this.mFocusZoomFactor;
    }

    public final PresenterSelector getHoverCardPresenterSelector() {
        return this.mHoverCardPresenterSelector;
    }

    public int getRecycledPoolSize(Presenter presenter) {
        if (this.mRecycledPoolSize.containsKey(presenter)) {
            return this.mRecycledPoolSize.get(presenter).intValue();
        }
        return 24;
    }

    public int getRowHeight() {
        return this.mRowHeight;
    }

    public final boolean getShadowEnabled() {
        return this.mShadowEnabled;
    }

    @Deprecated
    public final int getZoomFactor() {
        return this.mFocusZoomFactor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.leanback.widget.RowPresenter
    public void initializeRowViewHolder(RowPresenter.ViewHolder viewHolder) {
        boolean z8;
        super.initializeRowViewHolder(viewHolder);
        final ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        Context context = viewHolder.view.getContext();
        boolean z9 = false;
        if (this.mShadowOverlayHelper == null) {
            ShadowOverlayHelper.Builder needsShadow = new ShadowOverlayHelper.Builder().needsOverlay(needsDefaultListSelectEffect()).needsShadow(needsDefaultShadow());
            if (isUsingOutlineClipping(context) && areChildRoundedCornersEnabled()) {
                z8 = true;
            } else {
                z8 = false;
            }
            ShadowOverlayHelper build = needsShadow.needsRoundedCorner(z8).preferZOrder(isUsingZOrder(context)).keepForegroundDrawable(this.mKeepChildForeground).options(createShadowOverlayOptions()).build(context);
            this.mShadowOverlayHelper = build;
            if (build.needsWrapper()) {
                this.mShadowOverlayWrapper = new ItemBridgeAdapterShadowOverlayWrapper(this.mShadowOverlayHelper);
            }
        }
        ListRowPresenterItemBridgeAdapter listRowPresenterItemBridgeAdapter = new ListRowPresenterItemBridgeAdapter(viewHolder2);
        viewHolder2.mItemBridgeAdapter = listRowPresenterItemBridgeAdapter;
        listRowPresenterItemBridgeAdapter.setWrapper(this.mShadowOverlayWrapper);
        this.mShadowOverlayHelper.prepareParentForShadow(viewHolder2.mGridView);
        FocusHighlightHelper.setupBrowseItemFocusHighlight(viewHolder2.mItemBridgeAdapter, this.mFocusZoomFactor, this.mUseFocusDimmer);
        HorizontalGridView horizontalGridView = viewHolder2.mGridView;
        if (this.mShadowOverlayHelper.getShadowType() != 3) {
            z9 = true;
        }
        horizontalGridView.setFocusDrawingOrderEnabled(z9);
        viewHolder2.mGridView.setOnChildSelectedListener(new OnChildSelectedListener() { // from class: androidx.leanback.widget.ListRowPresenter.1
            @Override // androidx.leanback.widget.OnChildSelectedListener
            public void onChildSelected(ViewGroup viewGroup, View view, int i8, long j8) {
                ListRowPresenter.this.selectChildView(viewHolder2, view, true);
            }
        });
        viewHolder2.mGridView.setOnUnhandledKeyListener(new BaseGridView.OnUnhandledKeyListener() { // from class: androidx.leanback.widget.ListRowPresenter.2
            @Override // androidx.leanback.widget.BaseGridView.OnUnhandledKeyListener
            public boolean onUnhandledKey(KeyEvent keyEvent) {
                if (viewHolder2.getOnKeyListener() != null && viewHolder2.getOnKeyListener().onKey(viewHolder2.view, keyEvent.getKeyCode(), keyEvent)) {
                    return true;
                }
                return false;
            }
        });
        viewHolder2.mGridView.setNumRows(this.mNumRows);
    }

    public final boolean isFocusDimmerUsed() {
        return this.mUseFocusDimmer;
    }

    public final boolean isKeepChildForeground() {
        return this.mKeepChildForeground;
    }

    public boolean isUsingDefaultListSelectEffect() {
        return true;
    }

    @Override // androidx.leanback.widget.RowPresenter
    public final boolean isUsingDefaultSelectEffect() {
        return false;
    }

    public boolean isUsingDefaultShadow() {
        return ShadowOverlayHelper.supportsShadow();
    }

    public boolean isUsingOutlineClipping(Context context) {
        return !Settings.getInstance(context).isOutlineClippingDisabled();
    }

    public boolean isUsingZOrder(Context context) {
        return !Settings.getInstance(context).preferStaticShadows();
    }

    final boolean needsDefaultListSelectEffect() {
        if (isUsingDefaultListSelectEffect() && getSelectEffectEnabled()) {
            return true;
        }
        return false;
    }

    final boolean needsDefaultShadow() {
        if (isUsingDefaultShadow() && getShadowEnabled()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.leanback.widget.RowPresenter
    public void onBindRowViewHolder(RowPresenter.ViewHolder viewHolder, Object obj) {
        super.onBindRowViewHolder(viewHolder, obj);
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        ListRow listRow = (ListRow) obj;
        viewHolder2.mItemBridgeAdapter.setAdapter(listRow.getAdapter());
        viewHolder2.mGridView.setAdapter(viewHolder2.mItemBridgeAdapter);
        viewHolder2.mGridView.setContentDescription(listRow.getContentDescription());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.leanback.widget.RowPresenter
    public void onRowViewExpanded(RowPresenter.ViewHolder viewHolder, boolean z8) {
        int rowHeight;
        super.onRowViewExpanded(viewHolder, z8);
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        if (getRowHeight() != getExpandedRowHeight()) {
            if (z8) {
                rowHeight = getExpandedRowHeight();
            } else {
                rowHeight = getRowHeight();
            }
            viewHolder2.getGridView().setRowHeight(rowHeight);
        }
        setVerticalPadding(viewHolder2);
        updateFooterViewSwitcher(viewHolder2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.leanback.widget.RowPresenter
    public void onRowViewSelected(RowPresenter.ViewHolder viewHolder, boolean z8) {
        super.onRowViewSelected(viewHolder, z8);
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        setVerticalPadding(viewHolder2);
        updateFooterViewSwitcher(viewHolder2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.leanback.widget.RowPresenter
    public void onSelectLevelChanged(RowPresenter.ViewHolder viewHolder) {
        super.onSelectLevelChanged(viewHolder);
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        int childCount = viewHolder2.mGridView.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            applySelectLevelToChild(viewHolder2, viewHolder2.mGridView.getChildAt(i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.leanback.widget.RowPresenter
    public void onUnbindRowViewHolder(RowPresenter.ViewHolder viewHolder) {
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        viewHolder2.mGridView.setAdapter(null);
        viewHolder2.mItemBridgeAdapter.clear();
        super.onUnbindRowViewHolder(viewHolder);
    }

    void selectChildView(ViewHolder viewHolder, View view, boolean z8) {
        if (view != null) {
            if (viewHolder.mSelected) {
                ItemBridgeAdapter.ViewHolder viewHolder2 = (ItemBridgeAdapter.ViewHolder) viewHolder.mGridView.getChildViewHolder(view);
                if (this.mHoverCardPresenterSelector != null) {
                    viewHolder.mHoverCardViewSwitcher.select(viewHolder.mGridView, view, viewHolder2.mItem);
                }
                if (z8 && viewHolder.getOnItemViewSelectedListener() != null) {
                    viewHolder.getOnItemViewSelectedListener().onItemSelected(viewHolder2.mHolder, viewHolder2.mItem, viewHolder, viewHolder.mRow);
                    return;
                }
                return;
            }
            return;
        }
        if (this.mHoverCardPresenterSelector != null) {
            viewHolder.mHoverCardViewSwitcher.unselect();
        }
        if (z8 && viewHolder.getOnItemViewSelectedListener() != null) {
            viewHolder.getOnItemViewSelectedListener().onItemSelected(null, null, viewHolder, viewHolder.mRow);
        }
    }

    @Override // androidx.leanback.widget.RowPresenter
    public void setEntranceTransitionState(RowPresenter.ViewHolder viewHolder, boolean z8) {
        int i8;
        super.setEntranceTransitionState(viewHolder, z8);
        HorizontalGridView horizontalGridView = ((ViewHolder) viewHolder).mGridView;
        if (z8) {
            i8 = 0;
        } else {
            i8 = 4;
        }
        horizontalGridView.setChildrenVisibility(i8);
    }

    public void setExpandedRowHeight(int i8) {
        this.mExpandedRowHeight = i8;
    }

    public final void setHoverCardPresenterSelector(PresenterSelector presenterSelector) {
        this.mHoverCardPresenterSelector = presenterSelector;
    }

    public final void setKeepChildForeground(boolean z8) {
        this.mKeepChildForeground = z8;
    }

    public void setNumRows(int i8) {
        this.mNumRows = i8;
    }

    public void setRecycledPoolSize(Presenter presenter, int i8) {
        this.mRecycledPoolSize.put(presenter, Integer.valueOf(i8));
    }

    public void setRowHeight(int i8) {
        this.mRowHeight = i8;
    }

    public final void setShadowEnabled(boolean z8) {
        this.mShadowEnabled = z8;
    }

    public ListRowPresenter(int i8) {
        this(i8, false);
    }

    public ListRowPresenter(int i8, boolean z8) {
        this.mNumRows = 1;
        this.mShadowEnabled = true;
        this.mBrowseRowsFadingEdgeLength = -1;
        this.mRoundedCornersEnabled = true;
        this.mKeepChildForeground = true;
        this.mRecycledPoolSize = new HashMap<>();
        if (FocusHighlightHelper.isValidZoomIndex(i8)) {
            this.mFocusZoomFactor = i8;
            this.mUseFocusDimmer = z8;
            return;
        }
        throw new IllegalArgumentException("Unhandled zoom factor");
    }
}
