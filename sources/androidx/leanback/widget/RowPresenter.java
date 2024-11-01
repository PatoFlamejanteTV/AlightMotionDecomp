package androidx.leanback.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.graphics.ColorOverlayDimmer;
import androidx.leanback.widget.Presenter;
import androidx.leanback.widget.RowHeaderPresenter;

/* loaded from: classes3.dex */
public abstract class RowPresenter extends Presenter {
    public static final int SYNC_ACTIVATED_CUSTOM = 0;
    public static final int SYNC_ACTIVATED_TO_EXPANDED = 1;
    public static final int SYNC_ACTIVATED_TO_EXPANDED_AND_SELECTED = 3;
    public static final int SYNC_ACTIVATED_TO_SELECTED = 2;
    private RowHeaderPresenter mHeaderPresenter;
    boolean mSelectEffectEnabled;
    int mSyncActivatePolicy;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class ContainerViewHolder extends Presenter.ViewHolder {
        final ViewHolder mRowViewHolder;

        public ContainerViewHolder(RowContainerView rowContainerView, ViewHolder viewHolder) {
            super(rowContainerView);
            rowContainerView.addRowView(viewHolder.view);
            RowHeaderPresenter.ViewHolder viewHolder2 = viewHolder.mHeaderViewHolder;
            if (viewHolder2 != null) {
                rowContainerView.addHeaderView(viewHolder2.view);
            }
            this.mRowViewHolder = viewHolder;
            viewHolder.mContainerViewHolder = this;
        }
    }

    /* loaded from: classes3.dex */
    public static class ViewHolder extends Presenter.ViewHolder {
        private static final int ACTIVATED = 1;
        private static final int ACTIVATED_NOT_ASSIGNED = 0;
        private static final int NOT_ACTIVATED = 2;
        int mActivated;
        protected final ColorOverlayDimmer mColorDimmer;
        ContainerViewHolder mContainerViewHolder;
        boolean mExpanded;
        RowHeaderPresenter.ViewHolder mHeaderViewHolder;
        boolean mInitialzed;
        private BaseOnItemViewClickedListener mOnItemViewClickedListener;
        BaseOnItemViewSelectedListener mOnItemViewSelectedListener;
        private View.OnKeyListener mOnKeyListener;
        Row mRow;
        Object mRowObject;
        float mSelectLevel;
        boolean mSelected;

        public ViewHolder(View view) {
            super(view);
            this.mActivated = 0;
            this.mSelectLevel = 0.0f;
            this.mColorDimmer = ColorOverlayDimmer.createDefault(view.getContext());
        }

        public final RowHeaderPresenter.ViewHolder getHeaderViewHolder() {
            return this.mHeaderViewHolder;
        }

        public final BaseOnItemViewClickedListener getOnItemViewClickedListener() {
            return this.mOnItemViewClickedListener;
        }

        public final BaseOnItemViewSelectedListener getOnItemViewSelectedListener() {
            return this.mOnItemViewSelectedListener;
        }

        public View.OnKeyListener getOnKeyListener() {
            return this.mOnKeyListener;
        }

        public final Row getRow() {
            return this.mRow;
        }

        public final Object getRowObject() {
            return this.mRowObject;
        }

        public final float getSelectLevel() {
            return this.mSelectLevel;
        }

        public Object getSelectedItem() {
            return null;
        }

        public Presenter.ViewHolder getSelectedItemViewHolder() {
            return null;
        }

        public final boolean isExpanded() {
            return this.mExpanded;
        }

        public final boolean isSelected() {
            return this.mSelected;
        }

        public final void setActivated(boolean z8) {
            int i8;
            if (z8) {
                i8 = 1;
            } else {
                i8 = 2;
            }
            this.mActivated = i8;
        }

        public final void setOnItemViewClickedListener(BaseOnItemViewClickedListener baseOnItemViewClickedListener) {
            this.mOnItemViewClickedListener = baseOnItemViewClickedListener;
        }

        public final void setOnItemViewSelectedListener(BaseOnItemViewSelectedListener baseOnItemViewSelectedListener) {
            this.mOnItemViewSelectedListener = baseOnItemViewSelectedListener;
        }

        public void setOnKeyListener(View.OnKeyListener onKeyListener) {
            this.mOnKeyListener = onKeyListener;
        }

        public final void syncActivatedStatus(View view) {
            int i8 = this.mActivated;
            if (i8 == 1) {
                view.setActivated(true);
            } else if (i8 == 2) {
                view.setActivated(false);
            }
        }
    }

    public RowPresenter() {
        RowHeaderPresenter rowHeaderPresenter = new RowHeaderPresenter();
        this.mHeaderPresenter = rowHeaderPresenter;
        this.mSelectEffectEnabled = true;
        this.mSyncActivatePolicy = 1;
        rowHeaderPresenter.setNullItemVisibilityGone(true);
    }

    private void updateActivateStatus(ViewHolder viewHolder, View view) {
        int i8 = this.mSyncActivatePolicy;
        boolean z8 = true;
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3) {
                    if (!viewHolder.isExpanded() || !viewHolder.isSelected()) {
                        z8 = false;
                    }
                    viewHolder.setActivated(z8);
                }
            } else {
                viewHolder.setActivated(viewHolder.isSelected());
            }
        } else {
            viewHolder.setActivated(viewHolder.isExpanded());
        }
        viewHolder.syncActivatedStatus(view);
    }

    private void updateHeaderViewVisibility(ViewHolder viewHolder) {
        if (this.mHeaderPresenter != null && viewHolder.mHeaderViewHolder != null) {
            ((RowContainerView) viewHolder.mContainerViewHolder.view).showHeader(viewHolder.isExpanded());
        }
    }

    protected abstract ViewHolder createRowViewHolder(ViewGroup viewGroup);

    /* JADX INFO: Access modifiers changed from: protected */
    public void dispatchItemSelectedListener(ViewHolder viewHolder, boolean z8) {
        BaseOnItemViewSelectedListener baseOnItemViewSelectedListener;
        if (z8 && (baseOnItemViewSelectedListener = viewHolder.mOnItemViewSelectedListener) != null) {
            baseOnItemViewSelectedListener.onItemSelected(null, null, viewHolder, viewHolder.getRowObject());
        }
    }

    public void freeze(ViewHolder viewHolder, boolean z8) {
    }

    public final RowHeaderPresenter getHeaderPresenter() {
        return this.mHeaderPresenter;
    }

    public final ViewHolder getRowViewHolder(Presenter.ViewHolder viewHolder) {
        if (viewHolder instanceof ContainerViewHolder) {
            return ((ContainerViewHolder) viewHolder).mRowViewHolder;
        }
        return (ViewHolder) viewHolder;
    }

    public final boolean getSelectEffectEnabled() {
        return this.mSelectEffectEnabled;
    }

    public final float getSelectLevel(Presenter.ViewHolder viewHolder) {
        return getRowViewHolder(viewHolder).mSelectLevel;
    }

    public final int getSyncActivatePolicy() {
        return this.mSyncActivatePolicy;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void initializeRowViewHolder(ViewHolder viewHolder) {
        viewHolder.mInitialzed = true;
        if (!isClippingChildren()) {
            View view = viewHolder.view;
            if (view instanceof ViewGroup) {
                ((ViewGroup) view).setClipChildren(false);
            }
            ContainerViewHolder containerViewHolder = viewHolder.mContainerViewHolder;
            if (containerViewHolder != null) {
                ((ViewGroup) containerViewHolder.view).setClipChildren(false);
            }
        }
    }

    protected boolean isClippingChildren() {
        return false;
    }

    public boolean isUsingDefaultSelectEffect() {
        return true;
    }

    final boolean needsDefaultSelectEffect() {
        if (isUsingDefaultSelectEffect() && getSelectEffectEnabled()) {
            return true;
        }
        return false;
    }

    final boolean needsRowContainerView() {
        if (this.mHeaderPresenter == null && !needsDefaultSelectEffect()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onBindRowViewHolder(ViewHolder viewHolder, Object obj) {
        Row row;
        viewHolder.mRowObject = obj;
        if (obj instanceof Row) {
            row = (Row) obj;
        } else {
            row = null;
        }
        viewHolder.mRow = row;
        if (viewHolder.mHeaderViewHolder != null && viewHolder.getRow() != null) {
            this.mHeaderPresenter.onBindViewHolder(viewHolder.mHeaderViewHolder, obj);
        }
    }

    @Override // androidx.leanback.widget.Presenter
    public final void onBindViewHolder(Presenter.ViewHolder viewHolder, Object obj) {
        onBindRowViewHolder(getRowViewHolder(viewHolder), obj);
    }

    @Override // androidx.leanback.widget.Presenter
    public final Presenter.ViewHolder onCreateViewHolder(ViewGroup viewGroup) {
        Presenter.ViewHolder viewHolder;
        ViewHolder createRowViewHolder = createRowViewHolder(viewGroup);
        createRowViewHolder.mInitialzed = false;
        if (needsRowContainerView()) {
            RowContainerView rowContainerView = new RowContainerView(viewGroup.getContext());
            RowHeaderPresenter rowHeaderPresenter = this.mHeaderPresenter;
            if (rowHeaderPresenter != null) {
                createRowViewHolder.mHeaderViewHolder = (RowHeaderPresenter.ViewHolder) rowHeaderPresenter.onCreateViewHolder((ViewGroup) createRowViewHolder.view);
            }
            viewHolder = new ContainerViewHolder(rowContainerView, createRowViewHolder);
        } else {
            viewHolder = createRowViewHolder;
        }
        initializeRowViewHolder(createRowViewHolder);
        if (createRowViewHolder.mInitialzed) {
            return viewHolder;
        }
        throw new RuntimeException("super.initializeRowViewHolder() must be called");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onRowViewAttachedToWindow(ViewHolder viewHolder) {
        RowHeaderPresenter.ViewHolder viewHolder2 = viewHolder.mHeaderViewHolder;
        if (viewHolder2 != null) {
            this.mHeaderPresenter.onViewAttachedToWindow(viewHolder2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onRowViewDetachedFromWindow(ViewHolder viewHolder) {
        RowHeaderPresenter.ViewHolder viewHolder2 = viewHolder.mHeaderViewHolder;
        if (viewHolder2 != null) {
            this.mHeaderPresenter.onViewDetachedFromWindow(viewHolder2);
        }
        Presenter.cancelAnimationsRecursive(viewHolder.view);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onRowViewExpanded(ViewHolder viewHolder, boolean z8) {
        updateHeaderViewVisibility(viewHolder);
        updateActivateStatus(viewHolder, viewHolder.view);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onRowViewSelected(ViewHolder viewHolder, boolean z8) {
        dispatchItemSelectedListener(viewHolder, z8);
        updateHeaderViewVisibility(viewHolder);
        updateActivateStatus(viewHolder, viewHolder.view);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onSelectLevelChanged(ViewHolder viewHolder) {
        if (getSelectEffectEnabled()) {
            viewHolder.mColorDimmer.setActiveLevel(viewHolder.mSelectLevel);
            RowHeaderPresenter.ViewHolder viewHolder2 = viewHolder.mHeaderViewHolder;
            if (viewHolder2 != null) {
                this.mHeaderPresenter.setSelectLevel(viewHolder2, viewHolder.mSelectLevel);
            }
            if (isUsingDefaultSelectEffect()) {
                ((RowContainerView) viewHolder.mContainerViewHolder.view).setForegroundColor(viewHolder.mColorDimmer.getPaint().getColor());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onUnbindRowViewHolder(ViewHolder viewHolder) {
        RowHeaderPresenter.ViewHolder viewHolder2 = viewHolder.mHeaderViewHolder;
        if (viewHolder2 != null) {
            this.mHeaderPresenter.onUnbindViewHolder(viewHolder2);
        }
        viewHolder.mRow = null;
        viewHolder.mRowObject = null;
    }

    @Override // androidx.leanback.widget.Presenter
    public final void onUnbindViewHolder(Presenter.ViewHolder viewHolder) {
        onUnbindRowViewHolder(getRowViewHolder(viewHolder));
    }

    @Override // androidx.leanback.widget.Presenter
    public final void onViewAttachedToWindow(Presenter.ViewHolder viewHolder) {
        onRowViewAttachedToWindow(getRowViewHolder(viewHolder));
    }

    @Override // androidx.leanback.widget.Presenter
    public final void onViewDetachedFromWindow(Presenter.ViewHolder viewHolder) {
        onRowViewDetachedFromWindow(getRowViewHolder(viewHolder));
    }

    public void setEntranceTransitionState(ViewHolder viewHolder, boolean z8) {
        int i8;
        RowHeaderPresenter.ViewHolder viewHolder2 = viewHolder.mHeaderViewHolder;
        if (viewHolder2 != null && viewHolder2.view.getVisibility() != 8) {
            View view = viewHolder.mHeaderViewHolder.view;
            if (z8) {
                i8 = 0;
            } else {
                i8 = 4;
            }
            view.setVisibility(i8);
        }
    }

    public final void setHeaderPresenter(RowHeaderPresenter rowHeaderPresenter) {
        this.mHeaderPresenter = rowHeaderPresenter;
    }

    public final void setRowViewExpanded(Presenter.ViewHolder viewHolder, boolean z8) {
        ViewHolder rowViewHolder = getRowViewHolder(viewHolder);
        rowViewHolder.mExpanded = z8;
        onRowViewExpanded(rowViewHolder, z8);
    }

    public final void setRowViewSelected(Presenter.ViewHolder viewHolder, boolean z8) {
        ViewHolder rowViewHolder = getRowViewHolder(viewHolder);
        rowViewHolder.mSelected = z8;
        onRowViewSelected(rowViewHolder, z8);
    }

    public final void setSelectEffectEnabled(boolean z8) {
        this.mSelectEffectEnabled = z8;
    }

    public final void setSelectLevel(Presenter.ViewHolder viewHolder, float f8) {
        ViewHolder rowViewHolder = getRowViewHolder(viewHolder);
        rowViewHolder.mSelectLevel = f8;
        onSelectLevelChanged(rowViewHolder);
    }

    public final void setSyncActivatePolicy(int i8) {
        this.mSyncActivatePolicy = i8;
    }
}
