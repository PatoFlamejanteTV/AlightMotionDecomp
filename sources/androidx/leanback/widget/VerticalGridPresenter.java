package androidx.leanback.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.R;
import androidx.leanback.system.Settings;
import androidx.leanback.transition.TransitionHelper;
import androidx.leanback.widget.ItemBridgeAdapter;
import androidx.leanback.widget.Presenter;
import androidx.leanback.widget.ShadowOverlayHelper;

/* loaded from: classes3.dex */
public class VerticalGridPresenter extends Presenter {
    private static final boolean DEBUG = false;
    private static final String TAG = "GridPresenter";
    private int mFocusZoomFactor;
    private boolean mKeepChildForeground;
    private int mNumColumns;
    private OnItemViewClickedListener mOnItemViewClickedListener;
    private OnItemViewSelectedListener mOnItemViewSelectedListener;
    private boolean mRoundedCornersEnabled;
    private boolean mShadowEnabled;
    ShadowOverlayHelper mShadowOverlayHelper;
    private ItemBridgeAdapter.Wrapper mShadowOverlayWrapper;
    private boolean mUseFocusDimmer;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class VerticalGridItemBridgeAdapter extends ItemBridgeAdapter {
        VerticalGridItemBridgeAdapter() {
        }

        @Override // androidx.leanback.widget.ItemBridgeAdapter
        public void onAttachedToWindow(ItemBridgeAdapter.ViewHolder viewHolder) {
            viewHolder.itemView.setActivated(true);
        }

        @Override // androidx.leanback.widget.ItemBridgeAdapter
        public void onBind(final ItemBridgeAdapter.ViewHolder viewHolder) {
            if (VerticalGridPresenter.this.getOnItemViewClickedListener() != null) {
                viewHolder.mHolder.view.setOnClickListener(new View.OnClickListener() { // from class: androidx.leanback.widget.VerticalGridPresenter.VerticalGridItemBridgeAdapter.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        if (VerticalGridPresenter.this.getOnItemViewClickedListener() != null) {
                            OnItemViewClickedListener onItemViewClickedListener = VerticalGridPresenter.this.getOnItemViewClickedListener();
                            ItemBridgeAdapter.ViewHolder viewHolder2 = viewHolder;
                            onItemViewClickedListener.onItemClicked(viewHolder2.mHolder, viewHolder2.mItem, null, null);
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
            ShadowOverlayHelper shadowOverlayHelper = VerticalGridPresenter.this.mShadowOverlayHelper;
            if (shadowOverlayHelper != null) {
                shadowOverlayHelper.onViewCreated(viewHolder.itemView);
            }
        }

        @Override // androidx.leanback.widget.ItemBridgeAdapter
        public void onUnbind(ItemBridgeAdapter.ViewHolder viewHolder) {
            if (VerticalGridPresenter.this.getOnItemViewClickedListener() != null) {
                viewHolder.mHolder.view.setOnClickListener(null);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class ViewHolder extends Presenter.ViewHolder {
        final VerticalGridView mGridView;
        boolean mInitialized;
        ItemBridgeAdapter mItemBridgeAdapter;

        public ViewHolder(VerticalGridView verticalGridView) {
            super(verticalGridView);
            this.mGridView = verticalGridView;
        }

        public VerticalGridView getGridView() {
            return this.mGridView;
        }
    }

    public VerticalGridPresenter() {
        this(3);
    }

    public final boolean areChildRoundedCornersEnabled() {
        return this.mRoundedCornersEnabled;
    }

    protected ViewHolder createGridViewHolder(ViewGroup viewGroup) {
        return new ViewHolder((VerticalGridView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.lb_vertical_grid, viewGroup, false).findViewById(R.id.browse_grid));
    }

    protected ShadowOverlayHelper.Options createShadowOverlayOptions() {
        return ShadowOverlayHelper.Options.DEFAULT;
    }

    public final void enableChildRoundedCorners(boolean z8) {
        this.mRoundedCornersEnabled = z8;
    }

    public final int getFocusZoomFactor() {
        return this.mFocusZoomFactor;
    }

    public final boolean getKeepChildForeground() {
        return this.mKeepChildForeground;
    }

    public int getNumberOfColumns() {
        return this.mNumColumns;
    }

    public final OnItemViewClickedListener getOnItemViewClickedListener() {
        return this.mOnItemViewClickedListener;
    }

    public final OnItemViewSelectedListener getOnItemViewSelectedListener() {
        return this.mOnItemViewSelectedListener;
    }

    public final boolean getShadowEnabled() {
        return this.mShadowEnabled;
    }

    protected void initializeGridViewHolder(final ViewHolder viewHolder) {
        if (this.mNumColumns != -1) {
            viewHolder.getGridView().setNumColumns(this.mNumColumns);
            boolean z8 = true;
            viewHolder.mInitialized = true;
            Context context = viewHolder.mGridView.getContext();
            if (this.mShadowOverlayHelper == null) {
                ShadowOverlayHelper build = new ShadowOverlayHelper.Builder().needsOverlay(this.mUseFocusDimmer).needsShadow(needsDefaultShadow()).needsRoundedCorner(areChildRoundedCornersEnabled()).preferZOrder(isUsingZOrder(context)).keepForegroundDrawable(this.mKeepChildForeground).options(createShadowOverlayOptions()).build(context);
                this.mShadowOverlayHelper = build;
                if (build.needsWrapper()) {
                    this.mShadowOverlayWrapper = new ItemBridgeAdapterShadowOverlayWrapper(this.mShadowOverlayHelper);
                }
            }
            viewHolder.mItemBridgeAdapter.setWrapper(this.mShadowOverlayWrapper);
            this.mShadowOverlayHelper.prepareParentForShadow(viewHolder.mGridView);
            VerticalGridView gridView = viewHolder.getGridView();
            if (this.mShadowOverlayHelper.getShadowType() == 3) {
                z8 = false;
            }
            gridView.setFocusDrawingOrderEnabled(z8);
            FocusHighlightHelper.setupBrowseItemFocusHighlight(viewHolder.mItemBridgeAdapter, this.mFocusZoomFactor, this.mUseFocusDimmer);
            viewHolder.getGridView().setOnChildSelectedListener(new OnChildSelectedListener() { // from class: androidx.leanback.widget.VerticalGridPresenter.1
                @Override // androidx.leanback.widget.OnChildSelectedListener
                public void onChildSelected(ViewGroup viewGroup, View view, int i8, long j8) {
                    VerticalGridPresenter.this.selectChildView(viewHolder, view);
                }
            });
            return;
        }
        throw new IllegalStateException("Number of columns must be set");
    }

    public final boolean isFocusDimmerUsed() {
        return this.mUseFocusDimmer;
    }

    public boolean isUsingDefaultShadow() {
        return ShadowOverlayHelper.supportsShadow();
    }

    public boolean isUsingZOrder(Context context) {
        return !Settings.getInstance(context).preferStaticShadows();
    }

    final boolean needsDefaultShadow() {
        if (isUsingDefaultShadow() && getShadowEnabled()) {
            return true;
        }
        return false;
    }

    @Override // androidx.leanback.widget.Presenter
    public void onBindViewHolder(Presenter.ViewHolder viewHolder, Object obj) {
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        viewHolder2.mItemBridgeAdapter.setAdapter((ObjectAdapter) obj);
        viewHolder2.getGridView().setAdapter(viewHolder2.mItemBridgeAdapter);
    }

    @Override // androidx.leanback.widget.Presenter
    public void onUnbindViewHolder(Presenter.ViewHolder viewHolder) {
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        viewHolder2.mItemBridgeAdapter.setAdapter(null);
        viewHolder2.getGridView().setAdapter(null);
    }

    void selectChildView(ViewHolder viewHolder, View view) {
        ItemBridgeAdapter.ViewHolder viewHolder2;
        if (getOnItemViewSelectedListener() != null) {
            if (view == null) {
                viewHolder2 = null;
            } else {
                viewHolder2 = (ItemBridgeAdapter.ViewHolder) viewHolder.getGridView().getChildViewHolder(view);
            }
            if (viewHolder2 == null) {
                getOnItemViewSelectedListener().onItemSelected(null, null, null, null);
            } else {
                getOnItemViewSelectedListener().onItemSelected(viewHolder2.mHolder, viewHolder2.mItem, null, null);
            }
        }
    }

    public void setEntranceTransitionState(ViewHolder viewHolder, boolean z8) {
        int i8;
        VerticalGridView verticalGridView = viewHolder.mGridView;
        if (z8) {
            i8 = 0;
        } else {
            i8 = 4;
        }
        verticalGridView.setChildrenVisibility(i8);
    }

    public final void setKeepChildForeground(boolean z8) {
        this.mKeepChildForeground = z8;
    }

    public void setNumberOfColumns(int i8) {
        if (i8 >= 0) {
            if (this.mNumColumns != i8) {
                this.mNumColumns = i8;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid number of columns");
    }

    public final void setOnItemViewClickedListener(OnItemViewClickedListener onItemViewClickedListener) {
        this.mOnItemViewClickedListener = onItemViewClickedListener;
    }

    public final void setOnItemViewSelectedListener(OnItemViewSelectedListener onItemViewSelectedListener) {
        this.mOnItemViewSelectedListener = onItemViewSelectedListener;
    }

    public final void setShadowEnabled(boolean z8) {
        this.mShadowEnabled = z8;
    }

    public VerticalGridPresenter(int i8) {
        this(i8, true);
    }

    @Override // androidx.leanback.widget.Presenter
    public final ViewHolder onCreateViewHolder(ViewGroup viewGroup) {
        ViewHolder createGridViewHolder = createGridViewHolder(viewGroup);
        createGridViewHolder.mInitialized = false;
        createGridViewHolder.mItemBridgeAdapter = new VerticalGridItemBridgeAdapter();
        initializeGridViewHolder(createGridViewHolder);
        if (createGridViewHolder.mInitialized) {
            return createGridViewHolder;
        }
        throw new RuntimeException("super.initializeGridViewHolder() must be called");
    }

    public VerticalGridPresenter(int i8, boolean z8) {
        this.mNumColumns = -1;
        this.mShadowEnabled = true;
        this.mKeepChildForeground = true;
        this.mRoundedCornersEnabled = true;
        this.mFocusZoomFactor = i8;
        this.mUseFocusDimmer = z8;
    }
}
