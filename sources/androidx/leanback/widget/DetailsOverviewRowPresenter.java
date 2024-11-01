package androidx.leanback.widget;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.ColorInt;
import androidx.leanback.R;
import androidx.leanback.widget.BaseGridView;
import androidx.leanback.widget.DetailsOverviewRow;
import androidx.leanback.widget.ItemBridgeAdapter;
import androidx.leanback.widget.Presenter;
import androidx.leanback.widget.RowPresenter;
import androidx.recyclerview.widget.RecyclerView;

@Deprecated
/* loaded from: classes3.dex */
public class DetailsOverviewRowPresenter extends RowPresenter {
    static final boolean DEBUG = false;
    private static final long DEFAULT_TIMEOUT = 5000;
    private static final int MORE_ACTIONS_FADE_MS = 100;
    static final String TAG = "DetailsOverviewRowP";
    OnActionClickedListener mActionClickedListener;
    private boolean mBackgroundColorSet;
    final Presenter mDetailsPresenter;
    private DetailsOverviewSharedElementHelper mSharedElementHelper;
    private int mBackgroundColor = 0;
    private boolean mIsStyleLarge = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class ActionsItemBridgeAdapter extends ItemBridgeAdapter {
        ViewHolder mViewHolder;

        ActionsItemBridgeAdapter(ViewHolder viewHolder) {
            this.mViewHolder = viewHolder;
        }

        @Override // androidx.leanback.widget.ItemBridgeAdapter
        public void onAttachedToWindow(ItemBridgeAdapter.ViewHolder viewHolder) {
            viewHolder.itemView.removeOnLayoutChangeListener(this.mViewHolder.mLayoutChangeListener);
            viewHolder.itemView.addOnLayoutChangeListener(this.mViewHolder.mLayoutChangeListener);
        }

        @Override // androidx.leanback.widget.ItemBridgeAdapter
        public void onBind(final ItemBridgeAdapter.ViewHolder viewHolder) {
            if (this.mViewHolder.getOnItemViewClickedListener() != null || DetailsOverviewRowPresenter.this.mActionClickedListener != null) {
                viewHolder.getPresenter().setOnClickListener(viewHolder.getViewHolder(), new View.OnClickListener() { // from class: androidx.leanback.widget.DetailsOverviewRowPresenter.ActionsItemBridgeAdapter.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        if (ActionsItemBridgeAdapter.this.mViewHolder.getOnItemViewClickedListener() != null) {
                            BaseOnItemViewClickedListener onItemViewClickedListener = ActionsItemBridgeAdapter.this.mViewHolder.getOnItemViewClickedListener();
                            Presenter.ViewHolder viewHolder2 = viewHolder.getViewHolder();
                            Object item = viewHolder.getItem();
                            ViewHolder viewHolder3 = ActionsItemBridgeAdapter.this.mViewHolder;
                            onItemViewClickedListener.onItemClicked(viewHolder2, item, viewHolder3, viewHolder3.getRow());
                        }
                        OnActionClickedListener onActionClickedListener = DetailsOverviewRowPresenter.this.mActionClickedListener;
                        if (onActionClickedListener != null) {
                            onActionClickedListener.onActionClicked((Action) viewHolder.getItem());
                        }
                    }
                });
            }
        }

        @Override // androidx.leanback.widget.ItemBridgeAdapter
        public void onDetachedFromWindow(ItemBridgeAdapter.ViewHolder viewHolder) {
            viewHolder.itemView.removeOnLayoutChangeListener(this.mViewHolder.mLayoutChangeListener);
            this.mViewHolder.checkFirstAndLastPosition(false);
        }

        @Override // androidx.leanback.widget.ItemBridgeAdapter
        public void onUnbind(ItemBridgeAdapter.ViewHolder viewHolder) {
            if (this.mViewHolder.getOnItemViewClickedListener() != null || DetailsOverviewRowPresenter.this.mActionClickedListener != null) {
                viewHolder.getPresenter().setOnClickListener(viewHolder.getViewHolder(), null);
            }
        }
    }

    /* loaded from: classes3.dex */
    public final class ViewHolder extends RowPresenter.ViewHolder {
        ItemBridgeAdapter mActionBridgeAdapter;
        final HorizontalGridView mActionsRow;
        final OnChildSelectedListener mChildSelectedListener;
        final FrameLayout mDetailsDescriptionFrame;
        public final Presenter.ViewHolder mDetailsDescriptionViewHolder;
        final Handler mHandler;
        final ImageView mImageView;
        final View.OnLayoutChangeListener mLayoutChangeListener;
        final DetailsOverviewRow.Listener mListener;
        int mNumItems;
        final FrameLayout mOverviewFrame;
        final ViewGroup mOverviewView;
        final ViewGroup mRightPanel;
        final RecyclerView.OnScrollListener mScrollListener;
        boolean mShowMoreLeft;
        boolean mShowMoreRight;
        final Runnable mUpdateDrawableCallback;

        public ViewHolder(View view, Presenter presenter) {
            super(view);
            this.mHandler = new Handler();
            this.mUpdateDrawableCallback = new Runnable() { // from class: androidx.leanback.widget.DetailsOverviewRowPresenter.ViewHolder.1
                @Override // java.lang.Runnable
                public void run() {
                    ViewHolder viewHolder = ViewHolder.this;
                    DetailsOverviewRowPresenter.this.bindImageDrawable(viewHolder);
                }
            };
            this.mListener = new DetailsOverviewRow.Listener() { // from class: androidx.leanback.widget.DetailsOverviewRowPresenter.ViewHolder.2
                @Override // androidx.leanback.widget.DetailsOverviewRow.Listener
                public void onActionsAdapterChanged(DetailsOverviewRow detailsOverviewRow) {
                    ViewHolder.this.bindActions(detailsOverviewRow.getActionsAdapter());
                }

                @Override // androidx.leanback.widget.DetailsOverviewRow.Listener
                public void onImageDrawableChanged(DetailsOverviewRow detailsOverviewRow) {
                    ViewHolder viewHolder = ViewHolder.this;
                    viewHolder.mHandler.removeCallbacks(viewHolder.mUpdateDrawableCallback);
                    ViewHolder viewHolder2 = ViewHolder.this;
                    viewHolder2.mHandler.post(viewHolder2.mUpdateDrawableCallback);
                }

                @Override // androidx.leanback.widget.DetailsOverviewRow.Listener
                public void onItemChanged(DetailsOverviewRow detailsOverviewRow) {
                    ViewHolder viewHolder = ViewHolder.this;
                    Presenter.ViewHolder viewHolder2 = viewHolder.mDetailsDescriptionViewHolder;
                    if (viewHolder2 != null) {
                        DetailsOverviewRowPresenter.this.mDetailsPresenter.onUnbindViewHolder(viewHolder2);
                    }
                    ViewHolder viewHolder3 = ViewHolder.this;
                    DetailsOverviewRowPresenter.this.mDetailsPresenter.onBindViewHolder(viewHolder3.mDetailsDescriptionViewHolder, detailsOverviewRow.getItem());
                }
            };
            this.mLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: androidx.leanback.widget.DetailsOverviewRowPresenter.ViewHolder.3
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
                    ViewHolder.this.checkFirstAndLastPosition(false);
                }
            };
            OnChildSelectedListener onChildSelectedListener = new OnChildSelectedListener() { // from class: androidx.leanback.widget.DetailsOverviewRowPresenter.ViewHolder.4
                @Override // androidx.leanback.widget.OnChildSelectedListener
                public void onChildSelected(ViewGroup viewGroup, View view2, int i8, long j8) {
                    ViewHolder.this.dispatchItemSelection(view2);
                }
            };
            this.mChildSelectedListener = onChildSelectedListener;
            RecyclerView.OnScrollListener onScrollListener = new RecyclerView.OnScrollListener() { // from class: androidx.leanback.widget.DetailsOverviewRowPresenter.ViewHolder.5
                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrollStateChanged(RecyclerView recyclerView, int i8) {
                }

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrolled(RecyclerView recyclerView, int i8, int i9) {
                    ViewHolder.this.checkFirstAndLastPosition(true);
                }
            };
            this.mScrollListener = onScrollListener;
            this.mOverviewFrame = (FrameLayout) view.findViewById(R.id.details_frame);
            this.mOverviewView = (ViewGroup) view.findViewById(R.id.details_overview);
            this.mImageView = (ImageView) view.findViewById(R.id.details_overview_image);
            ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.details_overview_right_panel);
            this.mRightPanel = viewGroup;
            FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(R.id.details_overview_description);
            this.mDetailsDescriptionFrame = frameLayout;
            HorizontalGridView horizontalGridView = (HorizontalGridView) viewGroup.findViewById(R.id.details_overview_actions);
            this.mActionsRow = horizontalGridView;
            horizontalGridView.setHasOverlappingRendering(false);
            horizontalGridView.setOnScrollListener(onScrollListener);
            horizontalGridView.setAdapter(this.mActionBridgeAdapter);
            horizontalGridView.setOnChildSelectedListener(onChildSelectedListener);
            int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.lb_details_overview_actions_fade_size);
            horizontalGridView.setFadingRightEdgeLength(dimensionPixelSize);
            horizontalGridView.setFadingLeftEdgeLength(dimensionPixelSize);
            Presenter.ViewHolder onCreateViewHolder = presenter.onCreateViewHolder(frameLayout);
            this.mDetailsDescriptionViewHolder = onCreateViewHolder;
            frameLayout.addView(onCreateViewHolder.view);
        }

        private int getViewCenter(View view) {
            return (view.getRight() - view.getLeft()) / 2;
        }

        private void showMoreLeft(boolean z8) {
            if (z8 != this.mShowMoreLeft) {
                this.mActionsRow.setFadingLeftEdge(z8);
                this.mShowMoreLeft = z8;
            }
        }

        private void showMoreRight(boolean z8) {
            if (z8 != this.mShowMoreRight) {
                this.mActionsRow.setFadingRightEdge(z8);
                this.mShowMoreRight = z8;
            }
        }

        void bindActions(ObjectAdapter objectAdapter) {
            this.mActionBridgeAdapter.setAdapter(objectAdapter);
            this.mActionsRow.setAdapter(this.mActionBridgeAdapter);
            this.mNumItems = this.mActionBridgeAdapter.getItemCount();
            this.mShowMoreRight = false;
            this.mShowMoreLeft = true;
            showMoreLeft(false);
        }

        void checkFirstAndLastPosition(boolean z8) {
            boolean z9;
            boolean z10 = true;
            RecyclerView.ViewHolder findViewHolderForPosition = this.mActionsRow.findViewHolderForPosition(this.mNumItems - 1);
            if (findViewHolderForPosition != null && findViewHolderForPosition.itemView.getRight() <= this.mActionsRow.getWidth()) {
                z9 = false;
            } else {
                z9 = true;
            }
            RecyclerView.ViewHolder findViewHolderForPosition2 = this.mActionsRow.findViewHolderForPosition(0);
            if (findViewHolderForPosition2 != null && findViewHolderForPosition2.itemView.getLeft() >= 0) {
                z10 = false;
            }
            showMoreRight(z9);
            showMoreLeft(z10);
        }

        void dispatchItemSelection(View view) {
            RecyclerView.ViewHolder findViewHolderForPosition;
            if (!isSelected()) {
                return;
            }
            if (view != null) {
                findViewHolderForPosition = this.mActionsRow.getChildViewHolder(view);
            } else {
                HorizontalGridView horizontalGridView = this.mActionsRow;
                findViewHolderForPosition = horizontalGridView.findViewHolderForPosition(horizontalGridView.getSelectedPosition());
            }
            ItemBridgeAdapter.ViewHolder viewHolder = (ItemBridgeAdapter.ViewHolder) findViewHolderForPosition;
            if (viewHolder == null) {
                if (getOnItemViewSelectedListener() != null) {
                    getOnItemViewSelectedListener().onItemSelected(null, null, this, getRow());
                }
            } else if (getOnItemViewSelectedListener() != null) {
                getOnItemViewSelectedListener().onItemSelected(viewHolder.getViewHolder(), viewHolder.getItem(), this, getRow());
            }
        }
    }

    public DetailsOverviewRowPresenter(Presenter presenter) {
        setHeaderPresenter(null);
        setSelectEffectEnabled(false);
        this.mDetailsPresenter = presenter;
    }

    private int getCardHeight(Context context) {
        int i8;
        if (this.mIsStyleLarge) {
            i8 = R.dimen.lb_details_overview_height_large;
        } else {
            i8 = R.dimen.lb_details_overview_height_small;
        }
        return context.getResources().getDimensionPixelSize(i8);
    }

    private int getDefaultBackgroundColor(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.defaultBrandColor, typedValue, true)) {
            return context.getResources().getColor(typedValue.resourceId);
        }
        return context.getResources().getColor(R.color.lb_default_brand_color);
    }

    private static int getNonNegativeHeight(Drawable drawable) {
        int intrinsicHeight;
        if (drawable == null) {
            intrinsicHeight = 0;
        } else {
            intrinsicHeight = drawable.getIntrinsicHeight();
        }
        if (intrinsicHeight <= 0) {
            return 0;
        }
        return intrinsicHeight;
    }

    private static int getNonNegativeWidth(Drawable drawable) {
        int intrinsicWidth;
        if (drawable == null) {
            intrinsicWidth = 0;
        } else {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        if (intrinsicWidth <= 0) {
            return 0;
        }
        return intrinsicWidth;
    }

    private void initDetailsOverview(final ViewHolder viewHolder) {
        viewHolder.mActionBridgeAdapter = new ActionsItemBridgeAdapter(viewHolder);
        FrameLayout frameLayout = viewHolder.mOverviewFrame;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.height = getCardHeight(frameLayout.getContext());
        frameLayout.setLayoutParams(layoutParams);
        if (!getSelectEffectEnabled()) {
            viewHolder.mOverviewFrame.setForeground(null);
        }
        viewHolder.mActionsRow.setOnUnhandledKeyListener(new BaseGridView.OnUnhandledKeyListener() { // from class: androidx.leanback.widget.DetailsOverviewRowPresenter.1
            @Override // androidx.leanback.widget.BaseGridView.OnUnhandledKeyListener
            public boolean onUnhandledKey(KeyEvent keyEvent) {
                if (viewHolder.getOnKeyListener() != null && viewHolder.getOnKeyListener().onKey(viewHolder.view, keyEvent.getKeyCode(), keyEvent)) {
                    return true;
                }
                return false;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0068 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void bindImageDrawable(androidx.leanback.widget.DetailsOverviewRowPresenter.ViewHolder r14) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.DetailsOverviewRowPresenter.bindImageDrawable(androidx.leanback.widget.DetailsOverviewRowPresenter$ViewHolder):void");
    }

    @Override // androidx.leanback.widget.RowPresenter
    protected RowPresenter.ViewHolder createRowViewHolder(ViewGroup viewGroup) {
        ViewHolder viewHolder = new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.lb_details_overview, viewGroup, false), this.mDetailsPresenter);
        initDetailsOverview(viewHolder);
        return viewHolder;
    }

    @ColorInt
    public int getBackgroundColor() {
        return this.mBackgroundColor;
    }

    public OnActionClickedListener getOnActionClickedListener() {
        return this.mActionClickedListener;
    }

    public boolean isStyleLarge() {
        return this.mIsStyleLarge;
    }

    @Override // androidx.leanback.widget.RowPresenter
    public final boolean isUsingDefaultSelectEffect() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.leanback.widget.RowPresenter
    public void onBindRowViewHolder(RowPresenter.ViewHolder viewHolder, Object obj) {
        super.onBindRowViewHolder(viewHolder, obj);
        DetailsOverviewRow detailsOverviewRow = (DetailsOverviewRow) obj;
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        bindImageDrawable(viewHolder2);
        this.mDetailsPresenter.onBindViewHolder(viewHolder2.mDetailsDescriptionViewHolder, detailsOverviewRow.getItem());
        viewHolder2.bindActions(detailsOverviewRow.getActionsAdapter());
        detailsOverviewRow.addListener(viewHolder2.mListener);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.leanback.widget.RowPresenter
    public void onRowViewAttachedToWindow(RowPresenter.ViewHolder viewHolder) {
        super.onRowViewAttachedToWindow(viewHolder);
        Presenter presenter = this.mDetailsPresenter;
        if (presenter != null) {
            presenter.onViewAttachedToWindow(((ViewHolder) viewHolder).mDetailsDescriptionViewHolder);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.leanback.widget.RowPresenter
    public void onRowViewDetachedFromWindow(RowPresenter.ViewHolder viewHolder) {
        super.onRowViewDetachedFromWindow(viewHolder);
        Presenter presenter = this.mDetailsPresenter;
        if (presenter != null) {
            presenter.onViewDetachedFromWindow(((ViewHolder) viewHolder).mDetailsDescriptionViewHolder);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.leanback.widget.RowPresenter
    public void onRowViewSelected(RowPresenter.ViewHolder viewHolder, boolean z8) {
        super.onRowViewSelected(viewHolder, z8);
        if (z8) {
            ((ViewHolder) viewHolder).dispatchItemSelection(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.leanback.widget.RowPresenter
    public void onSelectLevelChanged(RowPresenter.ViewHolder viewHolder) {
        super.onSelectLevelChanged(viewHolder);
        if (getSelectEffectEnabled()) {
            ViewHolder viewHolder2 = (ViewHolder) viewHolder;
            ((ColorDrawable) viewHolder2.mOverviewFrame.getForeground().mutate()).setColor(viewHolder2.mColorDimmer.getPaint().getColor());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.leanback.widget.RowPresenter
    public void onUnbindRowViewHolder(RowPresenter.ViewHolder viewHolder) {
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        ((DetailsOverviewRow) viewHolder2.getRow()).removeListener(viewHolder2.mListener);
        Presenter.ViewHolder viewHolder3 = viewHolder2.mDetailsDescriptionViewHolder;
        if (viewHolder3 != null) {
            this.mDetailsPresenter.onUnbindViewHolder(viewHolder3);
        }
        super.onUnbindRowViewHolder(viewHolder);
    }

    public void setBackgroundColor(@ColorInt int i8) {
        this.mBackgroundColor = i8;
        this.mBackgroundColorSet = true;
    }

    public void setOnActionClickedListener(OnActionClickedListener onActionClickedListener) {
        this.mActionClickedListener = onActionClickedListener;
    }

    public final void setSharedElementEnterTransition(Activity activity, String str, long j8) {
        if (this.mSharedElementHelper == null) {
            this.mSharedElementHelper = new DetailsOverviewSharedElementHelper();
        }
        this.mSharedElementHelper.setSharedElementEnterTransition(activity, str, j8);
    }

    public void setStyleLarge(boolean z8) {
        this.mIsStyleLarge = z8;
    }

    public final void setSharedElementEnterTransition(Activity activity, String str) {
        setSharedElementEnterTransition(activity, str, 5000L);
    }
}
