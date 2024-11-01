package t5;

import J4.j;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import b5.InterfaceC1976E;
import c5.C2041f;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.workers.DownloadApkWorker;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3292y;
import q5.C3770C;
import q5.C3791p;
import q5.C3794s;

/* loaded from: classes5.dex */
public final class R0 extends AbstractC4032k {

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1976E f39763d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f39764e;

    /* renamed from: f, reason: collision with root package name */
    private final ImageView f39765f;

    /* renamed from: g, reason: collision with root package name */
    private final TextView f39766g;

    /* renamed from: h, reason: collision with root package name */
    private final ProgressBar f39767h;

    /* renamed from: i, reason: collision with root package name */
    private final TextView f39768i;

    /* renamed from: j, reason: collision with root package name */
    private final TextView f39769j;

    /* renamed from: k, reason: collision with root package name */
    private final TextView f39770k;

    /* renamed from: l, reason: collision with root package name */
    private final RelativeLayout f39771l;

    /* renamed from: m, reason: collision with root package name */
    private final TextView f39772m;

    /* renamed from: n, reason: collision with root package name */
    private final ImageView f39773n;

    /* renamed from: o, reason: collision with root package name */
    private final RelativeLayout f39774o;

    /* renamed from: p, reason: collision with root package name */
    private final TextView f39775p;

    /* renamed from: q, reason: collision with root package name */
    private final RelativeLayout f39776q;

    /* renamed from: r, reason: collision with root package name */
    private final RelativeLayout f39777r;

    /* renamed from: s, reason: collision with root package name */
    private final TextView f39778s;

    /* renamed from: t, reason: collision with root package name */
    private final ImageView f39779t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R0(View itemView, InterfaceC1976E interfaceC1976E, Context context) {
        super(itemView, context);
        AbstractC3292y.i(itemView, "itemView");
        AbstractC3292y.i(context, "context");
        this.f39763d = interfaceC1976E;
        this.f39764e = context;
        View findViewById = itemView.findViewById(R.id.iv_icon_update_item);
        AbstractC3292y.h(findViewById, "findViewById(...)");
        this.f39765f = (ImageView) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_name_update_item);
        AbstractC3292y.h(findViewById2, "findViewById(...)");
        TextView textView = (TextView) findViewById2;
        this.f39766g = textView;
        View findViewById3 = itemView.findViewById(R.id.pb_progress_update_item);
        AbstractC3292y.h(findViewById3, "findViewById(...)");
        this.f39767h = (ProgressBar) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.tv_version_update_item);
        AbstractC3292y.h(findViewById4, "findViewById(...)");
        TextView textView2 = (TextView) findViewById4;
        this.f39768i = textView2;
        View findViewById5 = itemView.findViewById(R.id.tv_verified_by_uptodown_update_item);
        AbstractC3292y.h(findViewById5, "findViewById(...)");
        TextView textView3 = (TextView) findViewById5;
        this.f39769j = textView3;
        View findViewById6 = itemView.findViewById(R.id.tv_action_update_item);
        AbstractC3292y.h(findViewById6, "findViewById(...)");
        TextView textView4 = (TextView) findViewById6;
        this.f39770k = textView4;
        View findViewById7 = itemView.findViewById(R.id.rl_actions_update_item);
        AbstractC3292y.h(findViewById7, "findViewById(...)");
        this.f39771l = (RelativeLayout) findViewById7;
        View findViewById8 = itemView.findViewById(R.id.tv_excluded_update_item);
        AbstractC3292y.h(findViewById8, "findViewById(...)");
        TextView textView5 = (TextView) findViewById8;
        this.f39772m = textView5;
        View findViewById9 = itemView.findViewById(R.id.iv_version_details_update_item);
        AbstractC3292y.h(findViewById9, "findViewById(...)");
        this.f39773n = (ImageView) findViewById9;
        View findViewById10 = itemView.findViewById(R.id.rl_version_details_update_item);
        AbstractC3292y.h(findViewById10, "findViewById(...)");
        this.f39774o = (RelativeLayout) findViewById10;
        View findViewById11 = itemView.findViewById(R.id.tv_version_details_update_item);
        AbstractC3292y.h(findViewById11, "findViewById(...)");
        TextView textView6 = (TextView) findViewById11;
        this.f39775p = textView6;
        View findViewById12 = itemView.findViewById(R.id.rl_container_update_item);
        AbstractC3292y.h(findViewById12, "findViewById(...)");
        RelativeLayout relativeLayout = (RelativeLayout) findViewById12;
        this.f39776q = relativeLayout;
        View findViewById13 = itemView.findViewById(R.id.rl_cancel_update_item);
        AbstractC3292y.h(findViewById13, "findViewById(...)");
        this.f39777r = (RelativeLayout) findViewById13;
        View findViewById14 = itemView.findViewById(R.id.tv_pending_update_item);
        AbstractC3292y.h(findViewById14, "findViewById(...)");
        TextView textView7 = (TextView) findViewById14;
        this.f39778s = textView7;
        View findViewById15 = itemView.findViewById(R.id.iv_cancel_update_item);
        AbstractC3292y.h(findViewById15, "findViewById(...)");
        ImageView imageView = (ImageView) findViewById15;
        this.f39779t = imageView;
        relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: t5.O0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                R0.k(R0.this, view);
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() { // from class: t5.P0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                R0.l(R0.this, view);
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() { // from class: t5.Q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                R0.m(R0.this, view);
            }
        });
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.u());
        textView2.setTypeface(aVar.v());
        textView3.setTypeface(aVar.v());
        textView7.setTypeface(aVar.u());
        textView6.setTypeface(aVar.v());
        textView5.setTypeface(aVar.u());
        textView4.setTypeface(aVar.u());
    }

    private final void A() {
        this.f39777r.setVisibility(8);
        this.f39770k.setText(this.f39764e.getString(R.string.updates_button_update_app));
        this.f39770k.setTextColor(ContextCompat.getColor(this.f39764e, R.color.blue_primary));
        this.f39770k.setBackground(ContextCompat.getDrawable(this.f39764e, R.drawable.ripple_download_icon_button));
        this.f39773n.setVisibility(8);
        this.f39769j.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(R0 r02, View view) {
        int bindingAdapterPosition;
        if (r02.f39763d != null && (bindingAdapterPosition = r02.getBindingAdapterPosition()) != -1) {
            r02.f39763d.a(bindingAdapterPosition);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(R0 r02, View view) {
        InterfaceC1976E interfaceC1976E = r02.f39763d;
        if (interfaceC1976E != null) {
            interfaceC1976E.c(r02.getBindingAdapterPosition());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(R0 r02, View view) {
        InterfaceC1976E interfaceC1976E = r02.f39763d;
        if (interfaceC1976E != null) {
            interfaceC1976E.e(r02.getBindingAdapterPosition());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(C2041f c2041f, R0 r02, View view) {
        if (UptodownApp.f29249C.a0()) {
            if (!c2041f.Y()) {
                InterfaceC1976E interfaceC1976E = r02.f39763d;
                if (interfaceC1976E != null) {
                    interfaceC1976E.b(r02.getBindingAdapterPosition());
                    return;
                }
                return;
            }
            InterfaceC1976E interfaceC1976E2 = r02.f39763d;
            if (interfaceC1976E2 != null) {
                interfaceC1976E2.f(r02.getBindingAdapterPosition());
            }
        }
    }

    private final void p(C2041f c2041f) {
        if (c2041f.h()) {
            this.itemView.setAlpha(0.3f);
        } else {
            this.itemView.setAlpha(1.0f);
        }
    }

    private final void q() {
        this.f39775p.setVisibility(8);
        this.f39774o.setVisibility(8);
        this.f39773n.setScaleY(1.0f);
        this.f39773n.setContentDescription(this.f39764e.getString(R.string.cd_expand_version_details));
    }

    private final void r() {
        this.f39774o.setVisibility(0);
        this.f39775p.setVisibility(0);
        this.f39773n.setScaleY(-1.0f);
        this.f39773n.setContentDescription(this.f39764e.getString(R.string.cd_collapse_version_details));
    }

    private final void s() {
        this.f39778s.setVisibility(0);
        this.f39770k.setVisibility(8);
        this.f39773n.setVisibility(8);
        this.f39777r.setVisibility(0);
    }

    private final void t() {
        this.f39777r.setVisibility(8);
        this.f39773n.setVisibility(0);
        this.f39770k.setText(this.f39764e.getString(R.string.updates_button_download_app));
        this.f39770k.setTextColor(ContextCompat.getColor(this.f39764e, R.color.white));
        this.f39770k.setBackground(ContextCompat.getDrawable(this.f39764e, R.drawable.ripple_blue_primary_button));
        this.f39769j.setVisibility(8);
    }

    private final void u(C2041f c2041f) {
        if (c2041f.c0() == C2041f.c.f15790a) {
            this.f39770k.setVisibility(0);
        } else {
            this.f39770k.setVisibility(8);
        }
        this.f39767h.setIndeterminate(false);
    }

    private final void v() {
        this.f39777r.setVisibility(8);
        this.f39773n.setVisibility(0);
        this.f39770k.setText(this.f39764e.getString(R.string.updates_button_download_app));
        this.f39770k.setTextColor(ContextCompat.getColor(this.f39764e, R.color.white));
        this.f39770k.setBackground(ContextCompat.getDrawable(this.f39764e, R.drawable.ripple_blue_primary_button));
        this.f39769j.setVisibility(8);
    }

    private final void w() {
        this.f39778s.setVisibility(8);
        this.f39770k.setVisibility(8);
        this.f39773n.setVisibility(0);
        this.f39777r.setVisibility(0);
        this.f39768i.setVisibility(0);
        this.f39772m.setVisibility(8);
        this.f39769j.setVisibility(0);
    }

    private final void x(String str) {
        this.f39772m.setText(str);
        this.f39772m.setVisibility(0);
        this.f39770k.setVisibility(8);
        this.f39769j.setVisibility(8);
        this.f39771l.setVisibility(8);
    }

    private final void y() {
        this.f39777r.setVisibility(8);
        this.f39770k.setVisibility(8);
        this.f39768i.setVisibility(0);
        this.f39768i.setText(this.f39764e.getString(R.string.installing));
        this.f39769j.setVisibility(0);
        this.f39767h.setIndeterminate(true);
        this.f39771l.setVisibility(8);
        e(this.f39767h, this.f39765f);
    }

    private final void z() {
        this.f39777r.setVisibility(8);
        this.f39773n.setVisibility(0);
        this.f39770k.setText(this.f39764e.getString(R.string.updates_button_resume));
        this.f39770k.setTextColor(ContextCompat.getColor(this.f39764e, R.color.white));
        this.f39770k.setBackground(ContextCompat.getDrawable(this.f39764e, R.drawable.ripple_blue_primary_button));
        this.f39768i.setVisibility(0);
        this.f39769j.setVisibility(8);
    }

    public final void n(final C2041f app) {
        String str;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        AbstractC3292y.i(app, "app");
        u(app);
        p(app);
        this.f39765f.setImageDrawable(C3770C.f37260a.j(this.f39764e, app.Q(), R.drawable.vector_uptodown_logo_bag_disabled));
        this.f39766g.setText(app.z());
        C3791p a9 = C3791p.f37286s.a(this.f39764e);
        a9.a();
        String Q8 = app.Q();
        AbstractC3292y.f(Q8);
        c5.Q s02 = a9.s0(Q8);
        String Q9 = app.Q();
        AbstractC3292y.f(Q9);
        c5.r a02 = a9.a0(Q9);
        a9.i();
        if (s02 != null) {
            this.f39768i.setText(s02.x());
        } else {
            this.f39768i.setText(app.h0());
        }
        P4.a h8 = J4.j.f4395g.h();
        if (h8 != null) {
            str = h8.b();
        } else {
            str = null;
        }
        if (l6.n.s(str, app.Q(), true)) {
            y();
        } else if (s02 != null) {
            if (s02.l() != null) {
                File g8 = new C3794s().g(this.f39764e);
                String l8 = s02.l();
                AbstractC3292y.f(l8);
                z8 = new File(g8, l8).exists();
            } else {
                z8 = false;
            }
            if (!z8) {
                if (s02.u() > 0) {
                    s02.X(0);
                    a9.a();
                    a9.p1(s02);
                    a9.i();
                }
                UptodownApp.a aVar = UptodownApp.f29249C;
                if (aVar.O(this.f39764e)) {
                    String Q10 = app.Q();
                    AbstractC3292y.f(Q10);
                    if (!aVar.R(Q10) && !s02.a()) {
                        if (aVar.h()) {
                            t();
                        } else {
                            v();
                        }
                    } else {
                        s();
                    }
                } else if (aVar.W("downloadApkWorker", this.f39764e)) {
                    if (DownloadApkWorker.f31190k.d(app.b(), s02.w())) {
                        if (a02 != null) {
                            this.f39768i.setText(this.itemView.getContext().getString(R.string.percent_of_total_size, Integer.valueOf(a02.Z()), new S4.g().c(a02.a0())));
                        }
                        s();
                    } else {
                        if (a02 != null && a02.h0()) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            s();
                        } else if (aVar.h()) {
                            t();
                        } else {
                            v();
                        }
                    }
                } else {
                    if (a02 != null && a02.Z() == 100) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12 && s02.u() != 100) {
                        v();
                    } else {
                        A();
                    }
                }
            } else {
                ArrayList G8 = UptodownApp.f29249C.G();
                if (G8 != null) {
                    Iterator it = G8.iterator();
                    AbstractC3292y.h(it, "iterator(...)");
                    while (it.hasNext()) {
                        Object next = it.next();
                        AbstractC3292y.h(next, "next(...)");
                        if (l6.n.s(((C2041f) next).Q(), s02.s(), true)) {
                            z9 = true;
                            break;
                        }
                    }
                }
                z9 = false;
                if (a02 == null) {
                    if (z9 && s02.u() != 100) {
                        s();
                    } else if (s02.a()) {
                        this.f39768i.setText(this.itemView.getContext().getString(R.string.percent_of_total_size, Integer.valueOf(s02.u()), new S4.g().c(s02.v())));
                        w();
                    } else {
                        int u8 = s02.u();
                        if (1 <= u8 && u8 < 100) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            z();
                        } else {
                            A();
                        }
                    }
                } else if (a02.h0() && a02.Z() != 100) {
                    s();
                } else if (DownloadApkWorker.f31190k.d(app.b(), s02.w())) {
                    this.f39768i.setText(this.itemView.getContext().getString(R.string.percent_of_total_size, Integer.valueOf(a02.Z()), new S4.g().c(a02.a0())));
                    w();
                } else {
                    int Z8 = a02.Z();
                    if (1 <= Z8 && Z8 < 100) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        z();
                    } else {
                        A();
                    }
                }
            }
            if (a02 == null) {
                this.f39767h.setProgress(s02.u());
                if (s02.a()) {
                    e(this.f39767h, this.f39765f);
                } else {
                    app.H0(false);
                    c(this.f39767h, this.f39765f);
                }
            } else {
                this.f39767h.setProgress(a02.Z());
                if (DownloadApkWorker.f31190k.d(app.b(), s02.w())) {
                    e(this.f39767h, this.f39765f);
                } else {
                    app.H0(false);
                    c(this.f39767h, this.f39765f);
                }
            }
        } else {
            v();
        }
        if (s02 != null && s02.h() == 1) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z14 && !s02.a()) {
            String string = this.f39764e.getString(R.string.skipped_update);
            AbstractC3292y.h(string, "getString(...)");
            x(string);
        } else if (app.i() == 1 && (s02 == null || !s02.a())) {
            String string2 = this.f39764e.getString(R.string.disabled_updates);
            AbstractC3292y.h(string2, "getString(...)");
            x(string2);
        } else {
            this.f39771l.setVisibility(0);
            this.f39772m.setVisibility(8);
        }
        if (app.Y()) {
            this.f39775p.setText(app.g0());
            r();
        } else {
            q();
        }
        if (app.g0() == null) {
            this.f39775p.setVisibility(8);
            this.f39774o.setVisibility(8);
            this.f39773n.setVisibility(8);
        } else if (app.Y()) {
            this.f39775p.setText(app.g0());
            r();
        } else {
            q();
        }
        this.f39773n.setOnClickListener(new View.OnClickListener() { // from class: t5.N0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                R0.o(C2041f.this, this, view);
            }
        });
    }
}
