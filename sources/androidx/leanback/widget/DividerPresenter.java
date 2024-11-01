package androidx.leanback.widget;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.leanback.R;
import androidx.leanback.widget.Presenter;

/* loaded from: classes3.dex */
public class DividerPresenter extends Presenter {
    private final int mLayoutResourceId;

    public DividerPresenter() {
        this(R.layout.lb_divider);
    }

    @Override // androidx.leanback.widget.Presenter
    public void onBindViewHolder(Presenter.ViewHolder viewHolder, Object obj) {
    }

    @Override // androidx.leanback.widget.Presenter
    public Presenter.ViewHolder onCreateViewHolder(ViewGroup viewGroup) {
        return new Presenter.ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(this.mLayoutResourceId, viewGroup, false));
    }

    @Override // androidx.leanback.widget.Presenter
    public void onUnbindViewHolder(Presenter.ViewHolder viewHolder) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public DividerPresenter(int i8) {
        this.mLayoutResourceId = i8;
    }
}
