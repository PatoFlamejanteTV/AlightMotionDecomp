package androidx.leanback.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.widget.Presenter;

/* loaded from: classes3.dex */
public abstract class PresenterSwitcher {
    private Presenter mCurrentPresenter;
    private Presenter.ViewHolder mCurrentViewHolder;
    private ViewGroup mParent;
    private PresenterSelector mPresenterSelector;

    private void showView(boolean z8) {
        Presenter.ViewHolder viewHolder = this.mCurrentViewHolder;
        if (viewHolder != null) {
            showView(viewHolder.view, z8);
        }
    }

    private void switchView(Object obj) {
        Presenter presenter = this.mPresenterSelector.getPresenter(obj);
        Presenter presenter2 = this.mCurrentPresenter;
        if (presenter != presenter2) {
            showView(false);
            clear();
            this.mCurrentPresenter = presenter;
            if (presenter == null) {
                return;
            }
            Presenter.ViewHolder onCreateViewHolder = presenter.onCreateViewHolder(this.mParent);
            this.mCurrentViewHolder = onCreateViewHolder;
            insertView(onCreateViewHolder.view);
        } else if (presenter2 == null) {
            return;
        } else {
            presenter2.onUnbindViewHolder(this.mCurrentViewHolder);
        }
        this.mCurrentPresenter.onBindViewHolder(this.mCurrentViewHolder, obj);
        onViewSelected(this.mCurrentViewHolder.view);
    }

    public void clear() {
        Presenter presenter = this.mCurrentPresenter;
        if (presenter != null) {
            presenter.onUnbindViewHolder(this.mCurrentViewHolder);
            this.mParent.removeView(this.mCurrentViewHolder.view);
            this.mCurrentViewHolder = null;
            this.mCurrentPresenter = null;
        }
    }

    public final ViewGroup getParentViewGroup() {
        return this.mParent;
    }

    public void init(ViewGroup viewGroup, PresenterSelector presenterSelector) {
        clear();
        this.mParent = viewGroup;
        this.mPresenterSelector = presenterSelector;
    }

    protected abstract void insertView(View view);

    protected void onViewSelected(View view) {
    }

    public void select(Object obj) {
        switchView(obj);
        showView(true);
    }

    public void unselect() {
        showView(false);
    }

    protected void showView(View view, boolean z8) {
        view.setVisibility(z8 ? 0 : 8);
    }
}
