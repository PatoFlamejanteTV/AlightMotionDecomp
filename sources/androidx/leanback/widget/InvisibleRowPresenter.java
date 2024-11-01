package androidx.leanback.widget;

import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.RestrictTo;
import androidx.leanback.widget.RowPresenter;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class InvisibleRowPresenter extends RowPresenter {
    public InvisibleRowPresenter() {
        setHeaderPresenter(null);
    }

    @Override // androidx.leanback.widget.RowPresenter
    protected RowPresenter.ViewHolder createRowViewHolder(ViewGroup viewGroup) {
        RelativeLayout relativeLayout = new RelativeLayout(viewGroup.getContext());
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(0, 0));
        return new RowPresenter.ViewHolder(relativeLayout);
    }
}
