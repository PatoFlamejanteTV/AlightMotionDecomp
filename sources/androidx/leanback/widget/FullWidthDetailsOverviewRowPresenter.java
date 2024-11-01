package androidx.leanback.widget;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.leanback.R;
import androidx.leanback.widget.BaseGridView;
import androidx.leanback.widget.DetailsOverviewLogoPresenter;
import androidx.leanback.widget.DetailsOverviewRow;
import androidx.leanback.widget.ItemBridgeAdapter;
import androidx.leanback.widget.Presenter;
import androidx.leanback.widget.RowPresenter;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public class FullWidthDetailsOverviewRowPresenter extends RowPresenter {
    public static final int ALIGN_MODE_MIDDLE = 1;
    public static final int ALIGN_MODE_START = 0;
    static final boolean DEBUG = false;
    public static final int STATE_FULL = 1;
    public static final int STATE_HALF = 0;
    public static final int STATE_SMALL = 2;
    static final String TAG = "FullWidthDetailsRP";
    OnActionClickedListener mActionClickedListener;
    private int mActionsBackgroundColor;
    private boolean mActionsBackgroundColorSet;
    private int mAlignmentMode;
    private int mBackgroundColor;
    private boolean mBackgroundColorSet;
    final DetailsOverviewLogoPresenter mDetailsOverviewLogoPresenter;
    final Presenter mDetailsPresenter;
    protected int mInitialState;
    private Listener mListener;
    private boolean mParticipatingEntranceTransition;
    private static Rect sTmpRect = new Rect();
    static final Handler sHandler = new Handler();

    /* loaded from: classes3.dex */
    class ActionsItemBridgeAdapter extends ItemBridgeAdapter {
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
            if (this.mViewHolder.getOnItemViewClickedListener() != null || FullWidthDetailsOverviewRowPresenter.this.mActionClickedListener != null) {
                viewHolder.getPresenter().setOnClickListener(viewHolder.getViewHolder(), new View.OnClickListener() { // from class: androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter.ActionsItemBridgeAdapter.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        if (ActionsItemBridgeAdapter.this.mViewHolder.getOnItemViewClickedListener() != null) {
                            BaseOnItemViewClickedListener onItemViewClickedListener = ActionsItemBridgeAdapter.this.mViewHolder.getOnItemViewClickedListener();
                            Presenter.ViewHolder viewHolder2 = viewHolder.getViewHolder();
                            Object item = viewHolder.getItem();
                            ViewHolder viewHolder3 = ActionsItemBridgeAdapter.this.mViewHolder;
                            onItemViewClickedListener.onItemClicked(viewHolder2, item, viewHolder3, viewHolder3.getRow());
                        }
                        OnActionClickedListener onActionClickedListener = FullWidthDetailsOverviewRowPresenter.this.mActionClickedListener;
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
            if (this.mViewHolder.getOnItemViewClickedListener() != null || FullWidthDetailsOverviewRowPresenter.this.mActionClickedListener != null) {
                viewHolder.getPresenter().setOnClickListener(viewHolder.getViewHolder(), null);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class Listener {
        public void onBindLogo(ViewHolder viewHolder) {
        }
    }

    /* loaded from: classes3.dex */
    public class ViewHolder extends RowPresenter.ViewHolder {
        ItemBridgeAdapter mActionBridgeAdapter;
        final HorizontalGridView mActionsRow;
        final OnChildSelectedListener mChildSelectedListener;
        final ViewGroup mDetailsDescriptionFrame;
        final Presenter.ViewHolder mDetailsDescriptionViewHolder;
        final DetailsOverviewLogoPresenter.ViewHolder mDetailsLogoViewHolder;
        final View.OnLayoutChangeListener mLayoutChangeListener;
        int mNumItems;
        final FrameLayout mOverviewFrame;
        final ViewGroup mOverviewRoot;
        protected final DetailsOverviewRow.Listener mRowListener;
        final RecyclerView.OnScrollListener mScrollListener;
        int mState;
        final Runnable mUpdateDrawableCallback;

        /* loaded from: classes3.dex */
        public class DetailsOverviewRowListener extends DetailsOverviewRow.Listener {
            public DetailsOverviewRowListener() {
            }

            @Override // androidx.leanback.widget.DetailsOverviewRow.Listener
            public void onActionsAdapterChanged(DetailsOverviewRow detailsOverviewRow) {
                ViewHolder.this.bindActions(detailsOverviewRow.getActionsAdapter());
            }

            @Override // androidx.leanback.widget.DetailsOverviewRow.Listener
            public void onImageDrawableChanged(DetailsOverviewRow detailsOverviewRow) {
                Handler handler = FullWidthDetailsOverviewRowPresenter.sHandler;
                handler.removeCallbacks(ViewHolder.this.mUpdateDrawableCallback);
                handler.post(ViewHolder.this.mUpdateDrawableCallback);
            }

            @Override // androidx.leanback.widget.DetailsOverviewRow.Listener
            public void onItemChanged(DetailsOverviewRow detailsOverviewRow) {
                ViewHolder viewHolder = ViewHolder.this;
                Presenter.ViewHolder viewHolder2 = viewHolder.mDetailsDescriptionViewHolder;
                if (viewHolder2 != null) {
                    FullWidthDetailsOverviewRowPresenter.this.mDetailsPresenter.onUnbindViewHolder(viewHolder2);
                }
                ViewHolder viewHolder3 = ViewHolder.this;
                FullWidthDetailsOverviewRowPresenter.this.mDetailsPresenter.onBindViewHolder(viewHolder3.mDetailsDescriptionViewHolder, detailsOverviewRow.getItem());
            }
        }

        public ViewHolder(View view, Presenter presenter, DetailsOverviewLogoPresenter detailsOverviewLogoPresenter) {
            super(view);
            this.mRowListener = createRowListener();
            this.mState = 0;
            this.mUpdateDrawableCallback = new Runnable() { // from class: androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter.ViewHolder.1
                @Override // java.lang.Runnable
                public void run() {
                    Row row = ViewHolder.this.getRow();
                    if (row == null) {
                        return;
                    }
                    ViewHolder viewHolder = ViewHolder.this;
                    FullWidthDetailsOverviewRowPresenter.this.mDetailsOverviewLogoPresenter.onBindViewHolder(viewHolder.mDetailsLogoViewHolder, row);
                }
            };
            this.mLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter.ViewHolder.2
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
                    ViewHolder.this.checkFirstAndLastPosition(false);
                }
            };
            OnChildSelectedListener onChildSelectedListener = new OnChildSelectedListener() { // from class: androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter.ViewHolder.3
                @Override // androidx.leanback.widget.OnChildSelectedListener
                public void onChildSelected(ViewGroup viewGroup, View view2, int i8, long j8) {
                    ViewHolder.this.dispatchItemSelection(view2);
                }
            };
            this.mChildSelectedListener = onChildSelectedListener;
            RecyclerView.OnScrollListener onScrollListener = new RecyclerView.OnScrollListener() { // from class: androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter.ViewHolder.4
                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrollStateChanged(RecyclerView recyclerView, int i8) {
                }

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrolled(RecyclerView recyclerView, int i8, int i9) {
                    ViewHolder.this.checkFirstAndLastPosition(true);
                }
            };
            this.mScrollListener = onScrollListener;
            ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.details_root);
            this.mOverviewRoot = viewGroup;
            FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.details_frame);
            this.mOverviewFrame = frameLayout;
            ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.details_overview_description);
            this.mDetailsDescriptionFrame = viewGroup2;
            HorizontalGridView horizontalGridView = (HorizontalGridView) frameLayout.findViewById(R.id.details_overview_actions);
            this.mActionsRow = horizontalGridView;
            horizontalGridView.setHasOverlappingRendering(false);
            horizontalGridView.setOnScrollListener(onScrollListener);
            horizontalGridView.setAdapter(this.mActionBridgeAdapter);
            horizontalGridView.setOnChildSelectedListener(onChildSelectedListener);
            int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.lb_details_overview_actions_fade_size);
            horizontalGridView.setFadingRightEdgeLength(dimensionPixelSize);
            horizontalGridView.setFadingLeftEdgeLength(dimensionPixelSize);
            Presenter.ViewHolder onCreateViewHolder = presenter.onCreateViewHolder(viewGroup2);
            this.mDetailsDescriptionViewHolder = onCreateViewHolder;
            viewGroup2.addView(onCreateViewHolder.view);
            DetailsOverviewLogoPresenter.ViewHolder viewHolder = (DetailsOverviewLogoPresenter.ViewHolder) detailsOverviewLogoPresenter.onCreateViewHolder(viewGroup);
            this.mDetailsLogoViewHolder = viewHolder;
            viewGroup.addView(viewHolder.view);
        }

        private int getViewCenter(View view) {
            return (view.getRight() - view.getLeft()) / 2;
        }

        void bindActions(ObjectAdapter objectAdapter) {
            this.mActionBridgeAdapter.setAdapter(objectAdapter);
            this.mActionsRow.setAdapter(this.mActionBridgeAdapter);
            this.mNumItems = this.mActionBridgeAdapter.getItemCount();
        }

        void checkFirstAndLastPosition(boolean z8) {
            RecyclerView.ViewHolder findViewHolderForPosition = this.mActionsRow.findViewHolderForPosition(this.mNumItems - 1);
            if (findViewHolderForPosition != null) {
                findViewHolderForPosition.itemView.getRight();
                this.mActionsRow.getWidth();
            }
            RecyclerView.ViewHolder findViewHolderForPosition2 = this.mActionsRow.findViewHolderForPosition(0);
            if (findViewHolderForPosition2 != null) {
                findViewHolderForPosition2.itemView.getLeft();
            }
        }

        protected DetailsOverviewRow.Listener createRowListener() {
            return new DetailsOverviewRowListener();
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

        public final ViewGroup getActionsRow() {
            return this.mActionsRow;
        }

        public final ViewGroup getDetailsDescriptionFrame() {
            return this.mDetailsDescriptionFrame;
        }

        public final Presenter.ViewHolder getDetailsDescriptionViewHolder() {
            return this.mDetailsDescriptionViewHolder;
        }

        public final DetailsOverviewLogoPresenter.ViewHolder getLogoViewHolder() {
            return this.mDetailsLogoViewHolder;
        }

        public final ViewGroup getOverviewView() {
            return this.mOverviewFrame;
        }

        public final int getState() {
            return this.mState;
        }

        void onBind() {
            DetailsOverviewRow detailsOverviewRow = (DetailsOverviewRow) getRow();
            bindActions(detailsOverviewRow.getActionsAdapter());
            detailsOverviewRow.addListener(this.mRowListener);
        }

        void onUnbind() {
            ((DetailsOverviewRow) getRow()).removeListener(this.mRowListener);
            FullWidthDetailsOverviewRowPresenter.sHandler.removeCallbacks(this.mUpdateDrawableCallback);
        }
    }

    public FullWidthDetailsOverviewRowPresenter(Presenter presenter) {
        this(presenter, new DetailsOverviewLogoPresenter());
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

    @Override // androidx.leanback.widget.RowPresenter
    protected RowPresenter.ViewHolder createRowViewHolder(ViewGroup viewGroup) {
        final ViewHolder viewHolder = new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(getLayoutResourceId(), viewGroup, false), this.mDetailsPresenter, this.mDetailsOverviewLogoPresenter);
        this.mDetailsOverviewLogoPresenter.setContext(viewHolder.mDetailsLogoViewHolder, viewHolder, this);
        setState(viewHolder, this.mInitialState);
        viewHolder.mActionBridgeAdapter = new ActionsItemBridgeAdapter(viewHolder);
        FrameLayout frameLayout = viewHolder.mOverviewFrame;
        if (this.mBackgroundColorSet) {
            frameLayout.setBackgroundColor(this.mBackgroundColor);
        }
        if (this.mActionsBackgroundColorSet) {
            frameLayout.findViewById(R.id.details_overview_actions_background).setBackgroundColor(this.mActionsBackgroundColor);
        }
        RoundedRectHelper.setClipToRoundedOutline(frameLayout, true);
        if (!getSelectEffectEnabled()) {
            viewHolder.mOverviewFrame.setForeground(null);
        }
        viewHolder.mActionsRow.setOnUnhandledKeyListener(new BaseGridView.OnUnhandledKeyListener() { // from class: androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter.1
            @Override // androidx.leanback.widget.BaseGridView.OnUnhandledKeyListener
            public boolean onUnhandledKey(KeyEvent keyEvent) {
                if (viewHolder.getOnKeyListener() != null && viewHolder.getOnKeyListener().onKey(viewHolder.view, keyEvent.getKeyCode(), keyEvent)) {
                    return true;
                }
                return false;
            }
        });
        return viewHolder;
    }

    public final int getActionsBackgroundColor() {
        return this.mActionsBackgroundColor;
    }

    public final int getAlignmentMode() {
        return this.mAlignmentMode;
    }

    public final int getBackgroundColor() {
        return this.mBackgroundColor;
    }

    public final int getInitialState() {
        return this.mInitialState;
    }

    protected int getLayoutResourceId() {
        return R.layout.lb_fullwidth_details_overview;
    }

    public OnActionClickedListener getOnActionClickedListener() {
        return this.mActionClickedListener;
    }

    @Override // androidx.leanback.widget.RowPresenter
    protected boolean isClippingChildren() {
        return true;
    }

    public final boolean isParticipatingEntranceTransition() {
        return this.mParticipatingEntranceTransition;
    }

    @Override // androidx.leanback.widget.RowPresenter
    public final boolean isUsingDefaultSelectEffect() {
        return false;
    }

    public final void notifyOnBindLogo(ViewHolder viewHolder) {
        onLayoutOverviewFrame(viewHolder, viewHolder.getState(), true);
        onLayoutLogo(viewHolder, viewHolder.getState(), true);
        Listener listener = this.mListener;
        if (listener != null) {
            listener.onBindLogo(viewHolder);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.leanback.widget.RowPresenter
    public void onBindRowViewHolder(RowPresenter.ViewHolder viewHolder, Object obj) {
        super.onBindRowViewHolder(viewHolder, obj);
        DetailsOverviewRow detailsOverviewRow = (DetailsOverviewRow) obj;
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        this.mDetailsOverviewLogoPresenter.onBindViewHolder(viewHolder2.mDetailsLogoViewHolder, detailsOverviewRow);
        this.mDetailsPresenter.onBindViewHolder(viewHolder2.mDetailsDescriptionViewHolder, detailsOverviewRow.getItem());
        viewHolder2.onBind();
    }

    protected void onLayoutLogo(ViewHolder viewHolder, int i8, boolean z8) {
        View view = viewHolder.getLogoViewHolder().view;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (this.mAlignmentMode != 1) {
            marginLayoutParams.setMarginStart(view.getResources().getDimensionPixelSize(R.dimen.lb_details_v2_logo_margin_start));
        } else {
            marginLayoutParams.setMarginStart(view.getResources().getDimensionPixelSize(R.dimen.lb_details_v2_left) - marginLayoutParams.width);
        }
        int state = viewHolder.getState();
        if (state != 0) {
            if (state != 2) {
                marginLayoutParams.topMargin = view.getResources().getDimensionPixelSize(R.dimen.lb_details_v2_blank_height) - (marginLayoutParams.height / 2);
            } else {
                marginLayoutParams.topMargin = 0;
            }
        } else {
            marginLayoutParams.topMargin = view.getResources().getDimensionPixelSize(R.dimen.lb_details_v2_blank_height) + view.getResources().getDimensionPixelSize(R.dimen.lb_details_v2_actions_height) + view.getResources().getDimensionPixelSize(R.dimen.lb_details_v2_description_margin_top);
        }
        view.setLayoutParams(marginLayoutParams);
    }

    protected void onLayoutOverviewFrame(ViewHolder viewHolder, int i8, boolean z8) {
        boolean z9;
        boolean z10;
        int i9;
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int i10 = 0;
        if (i8 == 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (viewHolder.getState() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z9 != z10 || z8) {
            Resources resources = viewHolder.view.getResources();
            if (this.mDetailsOverviewLogoPresenter.isBoundToImage(viewHolder.getLogoViewHolder(), (DetailsOverviewRow) viewHolder.getRow())) {
                i9 = viewHolder.getLogoViewHolder().view.getLayoutParams().width;
            } else {
                i9 = 0;
            }
            if (this.mAlignmentMode != 1) {
                if (z10) {
                    dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.lb_details_v2_logo_margin_start);
                } else {
                    i9 += resources.getDimensionPixelSize(R.dimen.lb_details_v2_logo_margin_start);
                    dimensionPixelSize = 0;
                }
            } else if (z10) {
                dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.lb_details_v2_left) - i9;
            } else {
                i9 = resources.getDimensionPixelSize(R.dimen.lb_details_v2_left);
                dimensionPixelSize = 0;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewHolder.getOverviewView().getLayoutParams();
            if (z10) {
                dimensionPixelSize2 = 0;
            } else {
                dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.lb_details_v2_blank_height);
            }
            marginLayoutParams.topMargin = dimensionPixelSize2;
            marginLayoutParams.rightMargin = dimensionPixelSize;
            marginLayoutParams.leftMargin = dimensionPixelSize;
            viewHolder.getOverviewView().setLayoutParams(marginLayoutParams);
            ViewGroup detailsDescriptionFrame = viewHolder.getDetailsDescriptionFrame();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) detailsDescriptionFrame.getLayoutParams();
            marginLayoutParams2.setMarginStart(i9);
            detailsDescriptionFrame.setLayoutParams(marginLayoutParams2);
            ViewGroup actionsRow = viewHolder.getActionsRow();
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) actionsRow.getLayoutParams();
            marginLayoutParams3.setMarginStart(i9);
            if (!z10) {
                i10 = resources.getDimensionPixelSize(R.dimen.lb_details_v2_actions_height);
            }
            marginLayoutParams3.height = i10;
            actionsRow.setLayoutParams(marginLayoutParams3);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.leanback.widget.RowPresenter
    public void onRowViewAttachedToWindow(RowPresenter.ViewHolder viewHolder) {
        super.onRowViewAttachedToWindow(viewHolder);
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        this.mDetailsPresenter.onViewAttachedToWindow(viewHolder2.mDetailsDescriptionViewHolder);
        this.mDetailsOverviewLogoPresenter.onViewAttachedToWindow(viewHolder2.mDetailsLogoViewHolder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.leanback.widget.RowPresenter
    public void onRowViewDetachedFromWindow(RowPresenter.ViewHolder viewHolder) {
        super.onRowViewDetachedFromWindow(viewHolder);
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        this.mDetailsPresenter.onViewDetachedFromWindow(viewHolder2.mDetailsDescriptionViewHolder);
        this.mDetailsOverviewLogoPresenter.onViewDetachedFromWindow(viewHolder2.mDetailsLogoViewHolder);
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

    protected void onStateChanged(ViewHolder viewHolder, int i8) {
        onLayoutOverviewFrame(viewHolder, i8, false);
        onLayoutLogo(viewHolder, i8, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.leanback.widget.RowPresenter
    public void onUnbindRowViewHolder(RowPresenter.ViewHolder viewHolder) {
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        viewHolder2.onUnbind();
        this.mDetailsPresenter.onUnbindViewHolder(viewHolder2.mDetailsDescriptionViewHolder);
        this.mDetailsOverviewLogoPresenter.onUnbindViewHolder(viewHolder2.mDetailsLogoViewHolder);
        super.onUnbindRowViewHolder(viewHolder);
    }

    public final void setActionsBackgroundColor(int i8) {
        this.mActionsBackgroundColor = i8;
        this.mActionsBackgroundColorSet = true;
    }

    public final void setAlignmentMode(int i8) {
        this.mAlignmentMode = i8;
    }

    public final void setBackgroundColor(int i8) {
        this.mBackgroundColor = i8;
        this.mBackgroundColorSet = true;
    }

    @Override // androidx.leanback.widget.RowPresenter
    public void setEntranceTransitionState(RowPresenter.ViewHolder viewHolder, boolean z8) {
        int i8;
        super.setEntranceTransitionState(viewHolder, z8);
        if (this.mParticipatingEntranceTransition) {
            View view = viewHolder.view;
            if (z8) {
                i8 = 0;
            } else {
                i8 = 4;
            }
            view.setVisibility(i8);
        }
    }

    public final void setInitialState(int i8) {
        this.mInitialState = i8;
    }

    public final void setListener(Listener listener) {
        this.mListener = listener;
    }

    public void setOnActionClickedListener(OnActionClickedListener onActionClickedListener) {
        this.mActionClickedListener = onActionClickedListener;
    }

    public final void setParticipatingEntranceTransition(boolean z8) {
        this.mParticipatingEntranceTransition = z8;
    }

    public final void setState(ViewHolder viewHolder, int i8) {
        if (viewHolder.getState() != i8) {
            int state = viewHolder.getState();
            viewHolder.mState = i8;
            onStateChanged(viewHolder, state);
        }
    }

    public FullWidthDetailsOverviewRowPresenter(Presenter presenter, DetailsOverviewLogoPresenter detailsOverviewLogoPresenter) {
        this.mInitialState = 0;
        this.mBackgroundColor = 0;
        this.mActionsBackgroundColor = 0;
        setHeaderPresenter(null);
        setSelectEffectEnabled(false);
        this.mDetailsPresenter = presenter;
        this.mDetailsOverviewLogoPresenter = detailsOverviewLogoPresenter;
    }
}
