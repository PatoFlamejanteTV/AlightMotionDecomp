package l5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.widget.Presenter;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3292y;
import p5.C3586d;

/* loaded from: classes5.dex */
public final class h extends Presenter {

    /* renamed from: a, reason: collision with root package name */
    private Context f34736a;

    public h(Context context) {
        AbstractC3292y.i(context, "context");
        this.f34736a = context;
    }

    @Override // androidx.leanback.widget.Presenter
    public void onBindViewHolder(Presenter.ViewHolder viewHolder, Object item) {
        AbstractC3292y.i(viewHolder, "viewHolder");
        AbstractC3292y.i(item, "item");
        if (viewHolder instanceof C3586d) {
            ((C3586d) viewHolder).b(item);
        }
    }

    @Override // androidx.leanback.widget.Presenter
    public Presenter.ViewHolder onCreateViewHolder(ViewGroup parent) {
        AbstractC3292y.i(parent, "parent");
        if (parent.getContext() != null) {
            View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.tv_home_card_featured_item, parent, false);
            AbstractC3292y.f(inflate);
            return new C3586d(inflate, this.f34736a);
        }
        return null;
    }

    @Override // androidx.leanback.widget.Presenter
    public void onUnbindViewHolder(Presenter.ViewHolder viewHolder) {
        AbstractC3292y.i(viewHolder, "viewHolder");
        if (viewHolder instanceof C3586d) {
            ((C3586d) viewHolder).h();
        }
    }
}
