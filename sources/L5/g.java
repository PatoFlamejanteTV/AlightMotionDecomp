package l5;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.leanback.widget.Presenter;
import c5.C2046k;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class g extends Presenter {
    @Override // androidx.leanback.widget.Presenter
    public void onBindViewHolder(Presenter.ViewHolder viewHolder, Object item) {
        AbstractC3292y.i(viewHolder, "viewHolder");
        AbstractC3292y.i(item, "item");
        TextView textView = (TextView) viewHolder.view.findViewById(R.id.tv_name);
        textView.setTypeface(J4.j.f4395g.u());
        textView.setText(((C2046k) item).h());
    }

    @Override // androidx.leanback.widget.Presenter
    public Presenter.ViewHolder onCreateViewHolder(ViewGroup parent) {
        AbstractC3292y.i(parent, "parent");
        return new Presenter.ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.tv_category_tag, parent, false));
    }

    @Override // androidx.leanback.widget.Presenter
    public void onUnbindViewHolder(Presenter.ViewHolder viewHolder) {
        AbstractC3292y.i(viewHolder, "viewHolder");
    }
}
