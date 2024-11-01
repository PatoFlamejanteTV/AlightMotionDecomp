package u5;

import J4.j;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import androidx.core.content.ContextCompat;
import c5.C2041f;
import c5.C2043h;
import c5.Q;
import c5.W;
import c5.r;
import com.squareup.picasso.s;
import com.squareup.picasso.w;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.MainActivity;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.workers.DownloadApkWorker;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.T;
import q5.C3776a;
import q5.C3784i;
import q5.C3791p;
import q5.C3794s;
import q5.C3797v;
import s5.C3969c;

/* renamed from: u5.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4086f {

    /* renamed from: a, reason: collision with root package name */
    public View f40286a;

    /* renamed from: b, reason: collision with root package name */
    public RelativeLayout f40287b;

    /* renamed from: c, reason: collision with root package name */
    public ImageView f40288c;

    /* renamed from: d, reason: collision with root package name */
    public TextView f40289d;

    /* renamed from: e, reason: collision with root package name */
    public TextView f40290e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f40291f;

    /* renamed from: g, reason: collision with root package name */
    public TextView f40292g;

    /* renamed from: h, reason: collision with root package name */
    public ImageView f40293h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f40294i;

    /* renamed from: j, reason: collision with root package name */
    public ProgressBar f40295j;

    /* renamed from: k, reason: collision with root package name */
    public TextView f40296k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f40297l;

    /* renamed from: m, reason: collision with root package name */
    private long f40298m;

    /* renamed from: n, reason: collision with root package name */
    private AtomicBoolean f40299n = new AtomicBoolean(false);

    private final void A(Q q8, Context context) {
        C3969c.f39130a.e(o(), m());
        r().setVisibility(8);
        n().setVisibility(0);
        q().setText(R.string.option_button_cancel);
        q().setBackground(ContextCompat.getDrawable(t().getContext(), R.drawable.ripple_open_button));
        q().setTextColor(ContextCompat.getColor(context, R.color.blue_primary));
        if (q8.u() == 0) {
            t().setText(context.getString(R.string.status_download_update_pending));
            o().setIndeterminate(true);
        } else {
            o().setIndeterminate(false);
            t().setText(context.getString(R.string.percent_of_total_size, Integer.valueOf(q8.u()), new S4.g().c(q8.v())));
            o().setProgress(q8.u());
        }
    }

    private final void B(String str, Context context) {
        C3969c.f39130a.c(o(), m());
        q().setText(str);
        q().setBackground(ContextCompat.getDrawable(context, R.drawable.ripple_install_button));
        q().setTextColor(ContextCompat.getColor(context, R.color.white));
        n().setVisibility(8);
        r().setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(T t8, Context context, C4086f c4086f, C2043h c2043h, RelativeLayout relativeLayout, View view) {
        if (UptodownApp.f29249C.a0()) {
            Object obj = t8.f34573a;
            if (obj != null) {
                AbstractC3292y.f(obj);
                ((W) obj).i(context);
                t8.f34573a = null;
                c4086f.l().setBackground(ContextCompat.getDrawable(context, R.drawable.ripple_wishlist_added));
                c4086f.l().setImageResource(R.drawable.vector_heart_white);
            } else {
                long h8 = c2043h.h();
                String q02 = c2043h.q0();
                AbstractC3292y.f(q02);
                W w8 = new W(h8, q02, c2043h.k0(), c2043h.v0(), c2043h.g1());
                t8.f34573a = w8;
                AbstractC3292y.f(w8);
                w8.h(context);
                c4086f.l().setBackground(ContextCompat.getDrawable(context, R.drawable.ripple_wishlist));
                c4086f.l().setImageResource(R.drawable.vector_heart_red);
            }
            c4086f.f(context, relativeLayout);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(C4086f c4086f, Context context, RelativeLayout relativeLayout, View view) {
        c4086f.f(context, relativeLayout);
    }

    private final void V(r rVar, Context context) {
        z(rVar, context);
        C3969c.f39130a.e(o(), m());
        n().setVisibility(8);
        r().setVisibility(0);
    }

    private final void X(r rVar, Context context) {
        z(rVar, context);
        C3969c.f39130a.e(o(), m());
        o().setProgress(rVar.Z());
        t().setText(context.getString(R.string.percent_of_total_size, Integer.valueOf(rVar.Z()), new S4.g().c(rVar.a0())));
        n().setVisibility(0);
        r().setVisibility(8);
    }

    private final void h(Context context) {
        C3969c.f39130a.c(o(), m());
        n().setVisibility(8);
        r().setVisibility(0);
        String string = context.getString(R.string.updates_button_download_app);
        AbstractC3292y.h(string, "getString(...)");
        y(string, context);
    }

    private final void i(C2043h c2043h, Context context) {
        r rVar = new r();
        rVar.a(c2043h);
        int l02 = rVar.l0(context);
        if (l02 >= 0) {
            if (C3797v.f37313a.d()) {
                DownloadApkWorker.f31190k.f(context, l02);
            }
            if (context instanceof MainActivity) {
                ((MainActivity) context).P1(rVar);
                return;
            }
            return;
        }
        Toast.makeText(context, context.getString(R.string.error_cant_enqueue_download), 1).show();
    }

    private final void j(boolean z8, Context context) {
        String string;
        if (z8) {
            string = context.getString(R.string.updates_button_update_app);
        } else {
            string = context.getString(R.string.option_button_install);
        }
        B(string, context);
        C3969c.f39130a.c(o(), m());
        n().setVisibility(8);
        r().setVisibility(0);
    }

    private final void x(String str, Context context) {
        Intent launchIntentForPackage;
        if (str != null && str.length() != 0 && (launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str)) != null) {
            context.startActivity(launchIntentForPackage);
        }
    }

    private final void y(String str, Context context) {
        C3969c.f39130a.c(o(), m());
        q().setText(str);
        q().setBackground(ContextCompat.getDrawable(context, R.drawable.ripple_blue_primary_button));
        q().setTextColor(ContextCompat.getColor(context, R.color.white));
        n().setVisibility(8);
        r().setVisibility(0);
    }

    private final void z(r rVar, Context context) {
        C3969c.f39130a.e(o(), m());
        r().setVisibility(8);
        n().setVisibility(0);
        q().setText(R.string.option_button_cancel);
        q().setBackground(ContextCompat.getDrawable(t().getContext(), R.drawable.ripple_open_button));
        q().setTextColor(ContextCompat.getColor(context, R.color.blue_primary));
        if (rVar.Z() == 0) {
            t().setText(context.getString(R.string.status_download_update_pending));
            o().setIndeterminate(true);
        } else {
            o().setIndeterminate(false);
            t().setText(context.getString(R.string.percent_of_total_size, Integer.valueOf(rVar.Z()), new S4.g().c(rVar.a0())));
            o().setProgress(rVar.Z());
        }
    }

    public final void C(ImageView imageView) {
        AbstractC3292y.i(imageView, "<set-?>");
        this.f40293h = imageView;
    }

    public final void D(ImageView imageView) {
        AbstractC3292y.i(imageView, "<set-?>");
        this.f40288c = imageView;
    }

    public final void E(long j8) {
        this.f40298m = j8;
    }

    public final void F(LinearLayout linearLayout) {
        AbstractC3292y.i(linearLayout, "<set-?>");
        this.f40294i = linearLayout;
    }

    public final void G(ProgressBar progressBar) {
        AbstractC3292y.i(progressBar, "<set-?>");
        this.f40295j = progressBar;
    }

    public final void H(final C2043h appInfo, final Context context, final RelativeLayout appInfoSelectedView) {
        Q q8;
        boolean z8;
        boolean z9;
        AbstractC3292y.i(appInfo, "appInfo");
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(appInfoSelectedView, "appInfoSelectedView");
        this.f40298m = appInfo.h();
        U(appInfoSelectedView.findViewById(R.id.v_background_app_info_selected));
        boolean z10 = false;
        w().setVisibility(0);
        N((RelativeLayout) appInfoSelectedView.findViewById(R.id.rl_app_info_selected));
        D((ImageView) appInfoSelectedView.findViewById(R.id.iv_logo_app_info_selected));
        Q((TextView) appInfoSelectedView.findViewById(R.id.tv_name_app_info_selected));
        P((TextView) appInfoSelectedView.findViewById(R.id.tv_author_app_info_selected));
        F((LinearLayout) appInfoSelectedView.findViewById(R.id.ll_download_app_info_selected));
        G((ProgressBar) appInfoSelectedView.findViewById(R.id.pb_progress_app_info_selected));
        R((TextView) appInfoSelectedView.findViewById(R.id.tv_progress_app_info_selected));
        T((TextView) appInfoSelectedView.findViewById(R.id.tv_verified_app_info_selected));
        S((TextView) appInfoSelectedView.findViewById(R.id.tv_valoration_app_info_selected));
        O((TextView) appInfoSelectedView.findViewById(R.id.tv_action_app_info_selected));
        C((ImageView) appInfoSelectedView.findViewById(R.id.iv_wishlist_action_app_info_selected));
        TextView s8 = s();
        j.a aVar = j.f4395g;
        s8.setTypeface(aVar.u());
        r().setTypeface(aVar.v());
        t().setTypeface(aVar.v());
        v().setTypeface(aVar.v());
        u().setTypeface(aVar.v());
        q().setTypeface(aVar.u());
        w l8 = s.h().l(appInfo.j0()).l(R.drawable.shape_bg_placeholder);
        UptodownApp.a aVar2 = UptodownApp.f29249C;
        l8.n(aVar2.f0(context)).i(m());
        s().setText(appInfo.q0());
        r().setText(appInfo.l());
        u().setText(String.valueOf(appInfo.B0() / 10.0d));
        C3791p a9 = C3791p.f37286s.a(context);
        a9.a();
        final T t8 = new T();
        t8.f34573a = a9.v0(appInfo.h());
        r Z8 = a9.Z(String.valueOf(appInfo.d0()));
        String v02 = appInfo.v0();
        if (v02 != null && v02.length() != 0) {
            String v03 = appInfo.v0();
            AbstractC3292y.f(v03);
            q8 = a9.s0(v03);
        } else {
            q8 = null;
        }
        a9.i();
        q().setVisibility(8);
        if (appInfo.g1()) {
            q().setVisibility(0);
            if (aVar2.V("downloadApkWorker", context) && DownloadApkWorker.f31190k.c(appInfo.h())) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (Z8 != null && Z8.z() == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (Z8 != null && Z8.h0()) {
                z10 = true;
            }
            boolean t9 = new C3784i().t(appInfo.v0(), context);
            if (Z8 != null && (z8 || z10)) {
                z(Z8, context);
            } else if (q8 != null && q8.a()) {
                A(q8, context);
            } else if (t9) {
                if (q8 != null) {
                    if (q8.u() != 100 && !z9) {
                        String string = context.getString(R.string.updates_button_download_app);
                        AbstractC3292y.h(string, "getString(...)");
                        y(string, context);
                    } else {
                        String string2 = context.getString(R.string.updates_button_update_app);
                        AbstractC3292y.h(string2, "getString(...)");
                        B(string2, context);
                    }
                } else {
                    String string3 = context.getString(R.string.open);
                    AbstractC3292y.h(string3, "getString(...)");
                    y(string3, context);
                }
            } else if (z9) {
                String string4 = context.getString(R.string.option_button_install);
                AbstractC3292y.h(string4, "getString(...)");
                B(string4, context);
            } else {
                String string5 = context.getString(R.string.updates_button_download_app);
                AbstractC3292y.h(string5, "getString(...)");
                y(string5, context);
            }
        }
        if (t8.f34573a != null) {
            l().setBackground(ContextCompat.getDrawable(context, R.drawable.ripple_wishlist_added));
            l().setImageResource(R.drawable.vector_heart_white);
        } else {
            l().setBackground(ContextCompat.getDrawable(context, R.drawable.ripple_wishlist));
            l().setImageResource(R.drawable.vector_heart_blue);
        }
        r().setOnClickListener(new View.OnClickListener() { // from class: u5.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4086f.I(view);
            }
        });
        u().setOnClickListener(new View.OnClickListener() { // from class: u5.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4086f.J(view);
            }
        });
        p().setOnClickListener(new View.OnClickListener() { // from class: u5.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4086f.K(view);
            }
        });
        l().setOnClickListener(new View.OnClickListener() { // from class: u5.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4086f.L(T.this, context, this, appInfo, appInfoSelectedView, view);
            }
        });
        w().setOnClickListener(new View.OnClickListener() { // from class: u5.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4086f.M(C4086f.this, context, appInfoSelectedView, view);
            }
        });
    }

    public final void N(RelativeLayout relativeLayout) {
        AbstractC3292y.i(relativeLayout, "<set-?>");
        this.f40287b = relativeLayout;
    }

    public final void O(TextView textView) {
        AbstractC3292y.i(textView, "<set-?>");
        this.f40297l = textView;
    }

    public final void P(TextView textView) {
        AbstractC3292y.i(textView, "<set-?>");
        this.f40290e = textView;
    }

    public final void Q(TextView textView) {
        AbstractC3292y.i(textView, "<set-?>");
        this.f40289d = textView;
    }

    public final void R(TextView textView) {
        AbstractC3292y.i(textView, "<set-?>");
        this.f40296k = textView;
    }

    public final void S(TextView textView) {
        AbstractC3292y.i(textView, "<set-?>");
        this.f40292g = textView;
    }

    public final void T(TextView textView) {
        AbstractC3292y.i(textView, "<set-?>");
        this.f40291f = textView;
    }

    public final void U(View view) {
        AbstractC3292y.i(view, "<set-?>");
        this.f40286a = view;
    }

    public final void W(r download, RelativeLayout relativeLayout, int i8, Context context) {
        AbstractC3292y.i(download, "download");
        AbstractC3292y.i(context, "context");
        if (relativeLayout != null && download.h() == this.f40298m) {
            if (i8 != 205) {
                if (i8 != 207) {
                    switch (i8) {
                        case 200:
                            break;
                        case ComposerKt.providerKey /* 201 */:
                            X(download, context);
                            return;
                        case ComposerKt.compositionLocalMapKey /* 202 */:
                            j(new C3784i().t(download.Y(), context), context);
                            return;
                        default:
                            return;
                    }
                } else {
                    h(context);
                    return;
                }
            }
            V(download, context);
        }
    }

    public final void f(Context context, RelativeLayout appInfoSelectedView) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(appInfoSelectedView, "appInfoSelectedView");
        if (SettingsPreferences.f30529b.M(context) && !UptodownApp.f29249C.S() && this.f40299n.compareAndSet(false, true)) {
            Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.fade_out);
            Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.slide_out_bottom);
            p().startAnimation(loadAnimation2);
            loadAnimation2.setAnimationListener(new a(loadAnimation, appInfoSelectedView));
            loadAnimation.setAnimationListener(new b(appInfoSelectedView));
            return;
        }
        appInfoSelectedView.setVisibility(8);
        this.f40298m = 0L;
    }

    public final void g(C2043h appInfo, Context context) {
        String v02;
        AbstractC3292y.i(appInfo, "appInfo");
        AbstractC3292y.i(context, "context");
        C3791p a9 = C3791p.f37286s.a(context);
        a9.a();
        r Z8 = a9.Z(String.valueOf(appInfo.d0()));
        if (Z8 == null && (v02 = appInfo.v0()) != null && v02.length() != 0) {
            String v03 = appInfo.v0();
            AbstractC3292y.f(v03);
            Z8 = a9.a0(v03);
        }
        String v04 = appInfo.v0();
        AbstractC3292y.f(v04);
        C2041f S8 = a9.S(v04);
        String v05 = appInfo.v0();
        AbstractC3292y.f(v05);
        Q s02 = a9.s0(v05);
        a9.i();
        if ((new C3784i().t(appInfo.v0(), context) && s02 == null) || ((S8 != null && S8.i() == 1) || (s02 != null && s02.h() == 1))) {
            x(appInfo.v0(), context);
            return;
        }
        if (Z8 != null) {
            int Z9 = Z8.Z();
            if (1 <= Z9 && Z9 < 100) {
                DownloadApkWorker.a aVar = DownloadApkWorker.f31190k;
                if (aVar.d(appInfo.h(), appInfo.m0())) {
                    aVar.a(appInfo.h());
                    new C3776a().a(context, Z8.X());
                    Z8.n0(context);
                    if (context instanceof MainActivity) {
                        ((MainActivity) context).G2(Z8);
                        return;
                    }
                    return;
                }
            }
            if (s02 != null) {
                if (s02.u() == 100) {
                    File g8 = new C3794s().g(context);
                    String l8 = s02.l();
                    AbstractC3292y.f(l8);
                    UptodownApp.f29249C.X(new File(g8, l8), context, appInfo.r0());
                    return;
                }
                if (Z8.Z() == 100 && s02.w() == Z8.e0()) {
                    File f8 = new C3794s().f(context);
                    String X8 = Z8.X();
                    AbstractC3292y.f(X8);
                    UptodownApp.f29249C.X(new File(f8, X8), context, appInfo.r0());
                    return;
                }
                i(appInfo, context);
                return;
            }
            if (S8 != null && Z8.e0() == S8.f0()) {
                x(appInfo.v0(), context);
                return;
            }
            if (Z8.Z() == 100) {
                File f9 = new C3794s().f(context);
                String X9 = Z8.X();
                AbstractC3292y.f(X9);
                UptodownApp.f29249C.X(new File(f9, X9), context, appInfo.r0());
                return;
            }
            Z8.n0(context);
            if (context instanceof MainActivity) {
                ((MainActivity) context).G2(Z8);
                return;
            }
            return;
        }
        i(appInfo, context);
    }

    public final AtomicBoolean k() {
        return this.f40299n;
    }

    public final ImageView l() {
        ImageView imageView = this.f40293h;
        if (imageView != null) {
            return imageView;
        }
        AbstractC3292y.y("ivLikeAppInfoSelected");
        return null;
    }

    public final ImageView m() {
        ImageView imageView = this.f40288c;
        if (imageView != null) {
            return imageView;
        }
        AbstractC3292y.y("ivLogoAppIndoSelected");
        return null;
    }

    public final LinearLayout n() {
        LinearLayout linearLayout = this.f40294i;
        if (linearLayout != null) {
            return linearLayout;
        }
        AbstractC3292y.y("llAppInfoSelected");
        return null;
    }

    public final ProgressBar o() {
        ProgressBar progressBar = this.f40295j;
        if (progressBar != null) {
            return progressBar;
        }
        AbstractC3292y.y("pbAppInfoSelected");
        return null;
    }

    public final RelativeLayout p() {
        RelativeLayout relativeLayout = this.f40287b;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        AbstractC3292y.y("rlAppInfoSelected");
        return null;
    }

    public final TextView q() {
        TextView textView = this.f40297l;
        if (textView != null) {
            return textView;
        }
        AbstractC3292y.y("tvActionAppInfoSelected");
        return null;
    }

    public final TextView r() {
        TextView textView = this.f40290e;
        if (textView != null) {
            return textView;
        }
        AbstractC3292y.y("tvAuthorAppInfoSelected");
        return null;
    }

    public final TextView s() {
        TextView textView = this.f40289d;
        if (textView != null) {
            return textView;
        }
        AbstractC3292y.y("tvNameAppInfoSelected");
        return null;
    }

    public final TextView t() {
        TextView textView = this.f40296k;
        if (textView != null) {
            return textView;
        }
        AbstractC3292y.y("tvProgressAppInfoSelected");
        return null;
    }

    public final TextView u() {
        TextView textView = this.f40292g;
        if (textView != null) {
            return textView;
        }
        AbstractC3292y.y("tvValorationAppInfoSelected");
        return null;
    }

    public final TextView v() {
        TextView textView = this.f40291f;
        if (textView != null) {
            return textView;
        }
        AbstractC3292y.y("tvVerifiedAppInfoSelected");
        return null;
    }

    public final View w() {
        View view = this.f40286a;
        if (view != null) {
            return view;
        }
        AbstractC3292y.y("vBackground");
        return null;
    }

    /* renamed from: u5.f$a */
    /* loaded from: classes5.dex */
    public static final class a implements Animation.AnimationListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Animation f40301b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ RelativeLayout f40302c;

        a(Animation animation, RelativeLayout relativeLayout) {
            this.f40301b = animation;
            this.f40302c = relativeLayout;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            C4086f.this.p().setVisibility(8);
            this.f40302c.setVisibility(8);
            C4086f.this.k().set(false);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            C4086f.this.w().startAnimation(this.f40301b);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }
    }

    /* renamed from: u5.f$b */
    /* loaded from: classes5.dex */
    public static final class b implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RelativeLayout f40303a;

        b(RelativeLayout relativeLayout) {
            this.f40303a = relativeLayout;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f40303a.findViewById(R.id.v_background_app_info_selected).setVisibility(8);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(View view) {
    }
}
