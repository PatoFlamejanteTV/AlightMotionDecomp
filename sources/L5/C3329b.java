package l5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.widget.Presenter;
import c5.C2043h;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3292y;
import p5.C3585c;

/* renamed from: l5.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3329b extends Presenter {

    /* renamed from: a, reason: collision with root package name */
    private C3585c f34723a;

    public final void a(Context context, C2043h c2043h) {
        AbstractC3292y.i(context, "context");
        C3585c c3585c = this.f34723a;
        if (c3585c != null) {
            AbstractC3292y.f(c3585c);
            c3585c.d(context, c2043h);
        }
    }

    public final void b(int i8) {
        C3585c c3585c = this.f34723a;
        if (c3585c != null) {
            AbstractC3292y.f(c3585c);
            c3585c.h(i8);
        }
    }

    public final void c(boolean z8) {
        C3585c c3585c = this.f34723a;
        if (c3585c != null) {
            AbstractC3292y.f(c3585c);
            c3585c.i(z8);
        }
    }

    @Override // androidx.leanback.widget.Presenter
    public void onBindViewHolder(Presenter.ViewHolder viewHolder, Object item) {
        AbstractC3292y.i(viewHolder, "viewHolder");
        AbstractC3292y.i(item, "item");
        C3585c c3585c = (C3585c) viewHolder;
        this.f34723a = c3585c;
        AbstractC3292y.f(c3585c);
        Context context = viewHolder.view.getContext();
        AbstractC3292y.h(context, "getContext(...)");
        c3585c.c(context, (C2043h) item, 0);
    }

    @Override // androidx.leanback.widget.Presenter
    public Presenter.ViewHolder onCreateViewHolder(ViewGroup parent) {
        AbstractC3292y.i(parent, "parent");
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.tv_app_detail, parent, false);
        AbstractC3292y.f(inflate);
        return new C3585c(inflate);
    }

    @Override // androidx.leanback.widget.Presenter
    public void onUnbindViewHolder(Presenter.ViewHolder viewHolder) {
        AbstractC3292y.i(viewHolder, "viewHolder");
    }
}
