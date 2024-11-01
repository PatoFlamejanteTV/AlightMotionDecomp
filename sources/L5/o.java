package l5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.leanback.widget.Presenter;
import c5.C2033C;
import c5.C2041f;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class o extends Presenter {

    /* renamed from: a, reason: collision with root package name */
    private String f34749a;

    /* renamed from: b, reason: collision with root package name */
    private C2041f f34750b;

    public o(String str) {
        this.f34749a = str;
    }

    @Override // androidx.leanback.widget.Presenter
    public void onBindViewHolder(Presenter.ViewHolder viewHolder, Object object) {
        AbstractC3292y.i(viewHolder, "viewHolder");
        AbstractC3292y.i(object, "object");
        p5.h hVar = (p5.h) viewHolder;
        Context context = viewHolder.view.getContext();
        AbstractC3292y.h(context, "getContext(...)");
        hVar.a((C2033C) object, context, this.f34749a, this.f34750b);
    }

    @Override // androidx.leanback.widget.Presenter
    public Presenter.ViewHolder onCreateViewHolder(ViewGroup parent) {
        AbstractC3292y.i(parent, "parent");
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.tv_old_version_item, parent, false);
        inflate.setFocusable(true);
        inflate.setFocusableInTouchMode(true);
        inflate.setBackgroundColor(ContextCompat.getColor(parent.getContext(), R.color.white));
        AbstractC3292y.f(inflate);
        return new p5.h(inflate);
    }

    @Override // androidx.leanback.widget.Presenter
    public void onUnbindViewHolder(Presenter.ViewHolder viewHolder) {
        AbstractC3292y.i(viewHolder, "viewHolder");
    }

    public o(C2041f appInstalled) {
        AbstractC3292y.i(appInstalled, "appInstalled");
        this.f34749a = appInstalled.Q();
        this.f34750b = appInstalled;
    }
}
