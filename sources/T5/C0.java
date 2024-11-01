package t5;

import J4.j;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import b5.InterfaceC1977a;
import b5.InterfaceC1980d;
import b5.InterfaceC1981e;
import c5.C2043h;
import c5.C2051p;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.workers.DownloadApkWorker;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3292y;
import q5.C3784i;
import q5.C3791p;
import s5.C3969c;

/* loaded from: classes5.dex */
public final class C0 extends AbstractC4026h {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1980d f39643b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1981e f39644c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1977a f39645d;

    /* renamed from: e, reason: collision with root package name */
    private Context f39646e;

    /* renamed from: f, reason: collision with root package name */
    private RelativeLayout f39647f;

    /* renamed from: g, reason: collision with root package name */
    private ImageView f39648g;

    /* renamed from: h, reason: collision with root package name */
    private TextView f39649h;

    /* renamed from: i, reason: collision with root package name */
    private TextView f39650i;

    /* renamed from: j, reason: collision with root package name */
    private TextView f39651j;

    /* renamed from: k, reason: collision with root package name */
    private TextView f39652k;

    /* renamed from: l, reason: collision with root package name */
    private TextView f39653l;

    /* renamed from: m, reason: collision with root package name */
    private TextView f39654m;

    /* renamed from: n, reason: collision with root package name */
    private LinearLayout f39655n;

    /* renamed from: o, reason: collision with root package name */
    private LinearLayout f39656o;

    /* renamed from: p, reason: collision with root package name */
    private TextView f39657p;

    /* renamed from: q, reason: collision with root package name */
    private ProgressBar f39658q;

    /* renamed from: r, reason: collision with root package name */
    private TextView f39659r;

    /* renamed from: s, reason: collision with root package name */
    private TextView f39660s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0(View itemView, InterfaceC1980d listener, InterfaceC1981e topItemsListener, InterfaceC1977a actionsClickListener, Context context) {
        super(itemView, context);
        AbstractC3292y.i(itemView, "itemView");
        AbstractC3292y.i(listener, "listener");
        AbstractC3292y.i(topItemsListener, "topItemsListener");
        AbstractC3292y.i(actionsClickListener, "actionsClickListener");
        AbstractC3292y.i(context, "context");
        this.f39643b = listener;
        this.f39644c = topItemsListener;
        this.f39645d = actionsClickListener;
        this.f39646e = context;
        View findViewById = itemView.findViewById(R.id.rl_app_info_top_by_cat_item);
        AbstractC3292y.h(findViewById, "findViewById(...)");
        this.f39647f = (RelativeLayout) findViewById;
        View findViewById2 = itemView.findViewById(R.id.iv_logo_app_info_top_by_cat_item);
        AbstractC3292y.h(findViewById2, "findViewById(...)");
        this.f39648g = (ImageView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.tv_name_app_info_top_by_cat_item);
        AbstractC3292y.h(findViewById3, "findViewById(...)");
        this.f39649h = (TextView) findViewById3;
        this.f39650i = (TextView) itemView.findViewById(R.id.tv_number_app_info_top_by_cat_item);
        View findViewById4 = itemView.findViewById(R.id.tv_desc_app_info_top_by_cat_item);
        AbstractC3292y.h(findViewById4, "findViewById(...)");
        this.f39651j = (TextView) findViewById4;
        View findViewById5 = itemView.findViewById(R.id.tv_action_app_info_top_by_cat_info_item);
        AbstractC3292y.h(findViewById5, "findViewById(...)");
        this.f39652k = (TextView) findViewById5;
        this.f39653l = (TextView) itemView.findViewById(R.id.tv_valoration_app_info_top_by_cat_info_item);
        this.f39654m = (TextView) itemView.findViewById(R.id.tv_downloads_counter_app_info_top_by_cat_info_item);
        this.f39655n = (LinearLayout) itemView.findViewById(R.id.ll_info_app_info_top_by_cat_info_item);
        View findViewById6 = itemView.findViewById(R.id.ll_download_app_info_top_by_cat_info_item);
        AbstractC3292y.h(findViewById6, "findViewById(...)");
        this.f39656o = (LinearLayout) findViewById6;
        View findViewById7 = itemView.findViewById(R.id.tv_progress_app_info_top_by_cat_info_item);
        AbstractC3292y.h(findViewById7, "findViewById(...)");
        this.f39657p = (TextView) findViewById7;
        View findViewById8 = itemView.findViewById(R.id.pb_progress_app_info_top_by_cat_item);
        AbstractC3292y.h(findViewById8, "findViewById(...)");
        this.f39658q = (ProgressBar) findViewById8;
        View findViewById9 = itemView.findViewById(R.id.tv_verified_app_info_top_by_cat_info_item);
        AbstractC3292y.h(findViewById9, "findViewById(...)");
        this.f39659r = (TextView) findViewById9;
        this.f39660s = (TextView) itemView.findViewById(R.id.tv_badge_promoted);
        TextView textView = this.f39649h;
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.u());
        TextView textView2 = this.f39650i;
        if (textView2 != null) {
            textView2.setTypeface(aVar.u());
        }
        TextView textView3 = this.f39653l;
        if (textView3 != null) {
            textView3.setTypeface(aVar.v());
        }
        TextView textView4 = this.f39654m;
        if (textView4 != null) {
            textView4.setTypeface(aVar.v());
        }
        this.f39651j.setTypeface(aVar.v());
        this.f39652k.setTypeface(aVar.u());
        this.f39659r.setTypeface(aVar.v());
        this.f39657p.setTypeface(aVar.v());
        TextView textView5 = this.f39660s;
        if (textView5 != null) {
            textView5.setTypeface(aVar.v());
        }
    }

    private final void A(int i8, long j8, final C2043h c2043h, final int i9) {
        C3969c.f39130a.e(this.f39658q, this.f39648g);
        LinearLayout linearLayout = this.f39655n;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        this.f39652k.setText(R.string.option_button_cancel);
        this.f39652k.setBackground(ContextCompat.getDrawable(this.f39646e, R.drawable.shape_stroke_blue_primary));
        this.f39652k.setTextColor(ContextCompat.getColor(this.f39646e, R.color.blue_primary));
        this.f39652k.setOnClickListener(new View.OnClickListener() { // from class: t5.A0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0.B(C0.this, c2043h, i9, view);
            }
        });
        this.f39651j.setVisibility(8);
        this.f39656o.setVisibility(0);
        if (i8 == 0) {
            this.f39657p.setText(this.f39646e.getString(R.string.status_download_update_pending));
            this.f39658q.setIndeterminate(true);
        } else {
            this.f39658q.setIndeterminate(false);
            this.f39657p.setText(this.f39646e.getString(R.string.percent_of_total_size, Integer.valueOf(i8), new S4.g().c(j8)));
            this.f39658q.setProgress(i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(C0 c02, C2043h c2043h, int i8, View view) {
        c02.f39644c.a(c2043h, i8);
    }

    private final void C(final C2043h c2043h, final int i8) {
        w(c2043h, i8);
        this.f39652k.setText(R.string.option_button_install);
        this.f39652k.setOnClickListener(new View.OnClickListener() { // from class: t5.y0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0.D(C0.this, c2043h, i8, view);
            }
        });
        this.f39652k.setBackground(ContextCompat.getDrawable(this.f39646e, R.drawable.ripple_install_button));
        this.f39652k.setTextColor(ContextCompat.getColor(this.f39646e, R.color.white));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(C0 c02, C2043h c2043h, int i8, View view) {
        c02.f39644c.b(c2043h, i8);
        c02.E();
    }

    private final void E() {
        C3969c.f39130a.e(this.f39658q, this.f39648g);
        LinearLayout linearLayout = this.f39655n;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        this.f39652k.setVisibility(8);
        this.f39651j.setVisibility(8);
        this.f39656o.setVisibility(0);
        this.f39657p.setText(this.f39646e.getString(R.string.installing));
        this.f39658q.setIndeterminate(true);
    }

    private final void F(C2043h c2043h, int i8) {
        w(c2043h, i8);
        this.f39652k.setText(R.string.open);
        this.f39652k.setBackground(ContextCompat.getDrawable(this.f39646e, R.drawable.ripple_blue_primary_button));
        this.f39652k.setTextColor(ContextCompat.getColor(this.f39646e, R.color.white));
    }

    private final void G(final C2043h c2043h, final int i8) {
        w(c2043h, i8);
        this.f39652k.setText(this.f39646e.getString(R.string.status_download_update));
        this.f39652k.setOnClickListener(new View.OnClickListener() { // from class: t5.B0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0.H(C0.this, c2043h, i8, view);
            }
        });
        this.f39652k.setTextColor(ContextCompat.getColor(this.f39646e, R.color.white));
        this.f39652k.setBackground(ContextCompat.getDrawable(this.f39646e, R.drawable.ripple_install_button));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(C0 c02, C2043h c2043h, int i8, View view) {
        c02.f39644c.b(c2043h, i8);
        c02.E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean s(C0 c02, C2043h c2043h, int i8, View view) {
        c02.f39645d.a(c2043h, i8);
        return true;
    }

    private final String t(long j8) {
        if (j8 < 1000) {
            return String.valueOf(j8);
        }
        if (j8 < 1000000) {
            kotlin.jvm.internal.Y y8 = kotlin.jvm.internal.Y.f34578a;
            String format = String.format(Locale.getDefault(), "%dK", Arrays.copyOf(new Object[]{Integer.valueOf(((int) j8) / 1000)}, 1));
            AbstractC3292y.h(format, "format(...)");
            return format;
        }
        kotlin.jvm.internal.Y y9 = kotlin.jvm.internal.Y.f34578a;
        String format2 = String.format(Locale.getDefault(), "%dM", Arrays.copyOf(new Object[]{Integer.valueOf(((int) j8) / 1000000)}, 1));
        AbstractC3292y.h(format2, "format(...)");
        return format2;
    }

    private final void u(final C2043h c2043h, final int i8) {
        this.f39652k.setOnClickListener(new View.OnClickListener() { // from class: t5.x0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0.v(C0.this, c2043h, i8, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(C0 c02, C2043h c2043h, int i8, View view) {
        c02.f39644c.b(c2043h, i8);
    }

    private final void w(final C2043h c2043h, final int i8) {
        C3969c.f39130a.c(this.f39658q, this.f39648g);
        this.f39652k.setOnClickListener(new View.OnClickListener() { // from class: t5.z0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0.x(C0.this, c2043h, i8, view);
            }
        });
        this.f39656o.setVisibility(8);
        this.f39651j.setVisibility(0);
        this.f39652k.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(C0 c02, C2043h c2043h, int i8, View view) {
        c02.f39644c.b(c2043h, i8);
    }

    private final void y(C2043h c2043h, int i8) {
        c5.Q q8;
        boolean z8;
        boolean z9;
        String v02;
        u(c2043h, i8);
        C3791p a9 = C3791p.f37286s.a(this.f39646e);
        a9.a();
        c5.r Z8 = a9.Z(String.valueOf(c2043h.d0()));
        if (Z8 == null && (v02 = c2043h.v0()) != null && v02.length() != 0) {
            String v03 = c2043h.v0();
            AbstractC3292y.f(v03);
            Z8 = a9.a0(v03);
        }
        String v04 = c2043h.v0();
        if (v04 != null && v04.length() != 0) {
            String v05 = c2043h.v0();
            AbstractC3292y.f(v05);
            q8 = a9.s0(v05);
        } else {
            q8 = null;
        }
        boolean t8 = new C3784i().t(c2043h.v0(), this.f39646e);
        boolean z10 = true;
        if (UptodownApp.f29249C.V("downloadApkWorker", this.f39646e) && DownloadApkWorker.f31190k.c(c2043h.h())) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (Z8 != null && Z8.z() == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (Z8 == null || !Z8.h0()) {
            z10 = false;
        }
        if (Z8 != null && (z8 || z10)) {
            A(Z8.Z(), Z8.a0(), c2043h, i8);
        } else if (q8 != null && q8.a()) {
            A(q8.u(), q8.v(), c2043h, i8);
        } else if (t8) {
            if (q8 != null) {
                if (q8.u() != 100 && !z9) {
                    z(c2043h, i8);
                } else {
                    G(c2043h, i8);
                }
            } else {
                F(c2043h, i8);
            }
        } else if (z9) {
            C(c2043h, i8);
        } else {
            z(c2043h, i8);
        }
        a9.i();
    }

    private final void z(C2043h c2043h, int i8) {
        w(c2043h, i8);
        this.f39652k.setText(R.string.updates_button_download_app);
        this.f39652k.setBackground(ContextCompat.getDrawable(this.f39646e, R.drawable.ripple_blue_primary_button));
        this.f39652k.setTextColor(ContextCompat.getColor(this.f39646e, R.color.white));
    }

    public final void r(final C2043h app, int i8, final int i9) {
        AbstractC3292y.i(app, "app");
        this.f39647f.setOnLongClickListener(new View.OnLongClickListener() { // from class: t5.w0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean s8;
                s8 = C0.s(C0.this, app, i9, view);
                return s8;
            }
        });
        c(this.f39647f, this.f39643b, app);
        TextView textView = this.f39650i;
        if (textView != null) {
            textView.setText(this.f39646e.getResources().getString(R.string.top_index_format, String.valueOf(i8)));
        }
        if (app.B0() > 0 && app.I() > 0) {
            TextView textView2 = this.f39653l;
            if (textView2 != null) {
                textView2.setText(String.valueOf(app.B0() / 10.0d));
            }
            TextView textView3 = this.f39654m;
            if (textView3 != null) {
                textView3.setText(this.f39646e.getString(R.string.downloads_counter_multiple, t(app.I())));
            }
            LinearLayout linearLayout = this.f39655n;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
        } else {
            LinearLayout linearLayout2 = this.f39655n;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(4);
            }
        }
        this.f39649h.setText(app.q0());
        String u8 = app.u();
        if (u8 != null && u8.length() != 0) {
            TextView textView4 = this.f39651j;
            C2051p.a aVar = C2051p.f15893f;
            String u9 = app.u();
            AbstractC3292y.f(u9);
            textView4.setText(aVar.g(new SpannableStringBuilder(u9)));
        } else {
            this.f39651j.setText(app.l());
        }
        h(this.f39648g, app.j0());
        y(app, i9);
    }
}
