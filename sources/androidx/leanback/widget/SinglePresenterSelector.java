package androidx.leanback.widget;

/* loaded from: classes3.dex */
public final class SinglePresenterSelector extends PresenterSelector {
    private final Presenter mPresenter;

    public SinglePresenterSelector(Presenter presenter) {
        this.mPresenter = presenter;
    }

    @Override // androidx.leanback.widget.PresenterSelector
    public Presenter getPresenter(Object obj) {
        return this.mPresenter;
    }

    @Override // androidx.leanback.widget.PresenterSelector
    public Presenter[] getPresenters() {
        return new Presenter[]{this.mPresenter};
    }
}
