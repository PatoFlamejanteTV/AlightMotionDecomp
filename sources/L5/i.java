package l5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.widget.Presenter;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3292y;
import p5.C3587e;

/* loaded from: classes5.dex */
public final class i extends Presenter {

    /* renamed from: a, reason: collision with root package name */
    private Context f34737a;

    public i(Context context) {
        AbstractC3292y.i(context, "context");
        this.f34737a = context;
    }

    @Override // androidx.leanback.widget.Presenter
    public void onBindViewHolder(Presenter.ViewHolder viewHolder, Object item) {
        AbstractC3292y.i(viewHolder, "viewHolder");
        AbstractC3292y.i(item, "item");
        if (viewHolder instanceof C3587e) {
            ((C3587e) viewHolder).b(item);
        }
    }

    @Override // androidx.leanback.widget.Presenter
    public Presenter.ViewHolder onCreateViewHolder(ViewGroup parent) {
        AbstractC3292y.i(parent, "parent");
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.tv_home_card_item, parent, false);
        AbstractC3292y.f(inflate);
        return new C3587e(inflate, this.f34737a);
    }

    @Override // androidx.leanback.widget.Presenter
    public void onUnbindViewHolder(Presenter.ViewHolder viewHolder) {
        AbstractC3292y.i(viewHolder, "viewHolder");
        if (viewHolder instanceof C3587e) {
            ((C3587e) viewHolder).h();
        }
    }
}
