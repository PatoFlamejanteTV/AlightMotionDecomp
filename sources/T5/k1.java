package t5;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import c5.C2041f;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import java.io.File;
import kotlin.jvm.internal.AbstractC3292y;
import q5.C3784i;
import q5.C3791p;
import q5.C3794s;

/* loaded from: classes5.dex */
public final class k1 extends AbstractC4032k {

    /* renamed from: d, reason: collision with root package name */
    private final Y4.J0 f39935d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f39936e;

    /* renamed from: f, reason: collision with root package name */
    private final b5.L f39937f;

    /* renamed from: g, reason: collision with root package name */
    private a f39938g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f39939a = new a("DOWNLOAD", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f39940b = new a("OPEN", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final a f39941c = new a("INSTALLING", 2);

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ a[] f39942d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ W5.a f39943e;

        static {
            a[] a9 = a();
            f39942d = a9;
            f39943e = W5.b.a(a9);
        }

        private a(String str, int i8) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f39939a, f39940b, f39941c};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f39942d.clone();
        }
    }

    /* loaded from: classes5.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39944a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.f39939a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.f39940b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.f39941c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f39944a = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public k1(Y4.J0 r3, android.content.Context r4, b5.L r5) {
        /*
            r2 = this;
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.AbstractC3292y.i(r3, r0)
            java.lang.String r0 = "context"
            kotlin.jvm.internal.AbstractC3292y.i(r4, r0)
            android.widget.RelativeLayout r0 = r3.getRoot()
            java.lang.String r1 = "getRoot(...)"
            kotlin.jvm.internal.AbstractC3292y.h(r0, r1)
            r2.<init>(r0, r4)
            r2.f39935d = r3
            r2.f39936e = r4
            r2.f39937f = r5
            t5.k1$a r4 = t5.k1.a.f39939a
            r2.f39938g = r4
            android.widget.RelativeLayout r4 = r3.f12228h
            t5.h1 r5 = new t5.h1
            r5.<init>()
            r4.setOnClickListener(r5)
            android.widget.RelativeLayout r4 = r3.f12228h
            t5.i1 r5 = new t5.i1
            r5.<init>()
            r4.setOnLongClickListener(r5)
            android.widget.RelativeLayout r4 = r3.f12226f
            t5.j1 r5 = new t5.j1
            r5.<init>()
            r4.setOnClickListener(r5)
            android.widget.TextView r4 = r3.f12230j
            J4.j$a r5 = J4.j.f4395g
            android.graphics.Typeface r0 = r5.u()
            r4.setTypeface(r0)
            android.widget.TextView r4 = r3.f12231k
            android.graphics.Typeface r0 = r5.u()
            r4.setTypeface(r0)
            android.widget.TextView r4 = r3.f12234n
            android.graphics.Typeface r0 = r5.v()
            r4.setTypeface(r0)
            android.widget.TextView r3 = r3.f12233m
            android.graphics.Typeface r4 = r5.u()
            r3.setTypeface(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.k1.<init>(Y4.J0, android.content.Context, b5.L):void");
    }

    private final boolean A(c5.Q q8) {
        if (q8.l() != null) {
            File g8 = new C3794s().g(this.f39936e);
            String l8 = q8.l();
            AbstractC3292y.f(l8);
            return new File(g8, l8).exists();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(k1 k1Var, View view) {
        int bindingAdapterPosition;
        if (k1Var.f39937f != null && (bindingAdapterPosition = k1Var.getBindingAdapterPosition()) != -1) {
            k1Var.f39937f.a(bindingAdapterPosition);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(k1 k1Var, View view) {
        int bindingAdapterPosition;
        if (k1Var.f39937f != null && (bindingAdapterPosition = k1Var.getBindingAdapterPosition()) != -1) {
            b5.L l8 = k1Var.f39937f;
            AbstractC3292y.f(view);
            l8.b(view, bindingAdapterPosition);
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(k1 k1Var, View view) {
        if (UptodownApp.f29249C.a0()) {
            int i8 = b.f39944a[k1Var.f39938g.ordinal()];
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 3) {
                        throw new Q5.p();
                    }
                    return;
                } else {
                    b5.L l8 = k1Var.f39937f;
                    if (l8 != null) {
                        l8.d(k1Var.getBindingAdapterPosition());
                        return;
                    }
                    return;
                }
            }
            b5.L l9 = k1Var.f39937f;
            if (l9 != null) {
                l9.c(k1Var.getBindingAdapterPosition());
            }
        }
    }

    private final boolean m(C2041f c2041f) {
        PackageManager packageManager = this.f39936e.getPackageManager();
        AbstractC3292y.h(packageManager, "getPackageManager(...)");
        String Q8 = c2041f.Q();
        AbstractC3292y.f(Q8);
        ApplicationInfo a9 = S4.r.a(packageManager, Q8, 0);
        if (c2041f.i() != 0 || !a9.enabled) {
            return false;
        }
        return true;
    }

    private final void o(ProgressBar progressBar) {
        progressBar.setVisibility(8);
    }

    private final void p(c5.Q q8, TextView textView) {
        if (q8 != null && q8.h() == 0) {
            textView.setText(this.f39936e.getString(R.string.status_download_update));
            textView.setTypeface(J4.j.f4395g.u());
            textView.setTextColor(ContextCompat.getColor(this.f39936e, R.color.white));
            textView.setBackground(ContextCompat.getDrawable(this.f39936e, R.drawable.ripple_install_button));
        } else {
            textView.setText(this.f39936e.getString(R.string.status_download_installed));
            textView.setTextColor(ContextCompat.getColor(this.f39936e, R.color.download_installed_status));
            textView.setBackground(ContextCompat.getDrawable(this.f39936e, R.drawable.bg_status_download_installed));
        }
        textView.setVisibility(0);
    }

    private final void q(String str, TextView textView) {
        if (new C3784i().t(str, this.f39936e)) {
            C3791p a9 = C3791p.f37286s.a(this.f39936e);
            a9.a();
            c5.Q s02 = a9.s0(str);
            C2041f S8 = a9.S(str);
            a9.i();
            if (S8 != null) {
                if (m(S8)) {
                    p(s02, textView);
                } else {
                    textView.setVisibility(8);
                }
            }
        }
    }

    private final void r() {
        this.f39935d.f12227g.setVisibility(0);
        this.f39935d.f12222b.setVisibility(0);
        this.f39935d.f12232l.setVisibility(0);
        this.f39935d.f12230j.setVisibility(8);
        this.f39935d.f12234n.setVisibility(0);
    }

    private final void s() {
        this.f39938g = a.f39939a;
        this.f39935d.f12230j.setVisibility(0);
        this.f39935d.f12230j.setText(this.f39936e.getString(R.string.updates_button_download_app));
        this.f39935d.f12230j.setBackground(ContextCompat.getDrawable(this.f39936e, R.drawable.ripple_blue_primary_button));
        this.f39935d.f12230j.setTextColor(ContextCompat.getColor(this.f39936e, R.color.white));
        this.f39935d.f12227g.setVisibility(8);
        this.f39935d.f12234n.setVisibility(8);
    }

    private final void t() {
        ProgressBar pbProgressWishlistItem = this.f39935d.f12225e;
        AbstractC3292y.h(pbProgressWishlistItem, "pbProgressWishlistItem");
        ImageView ivIconWishlistItem = this.f39935d.f12223c;
        AbstractC3292y.h(ivIconWishlistItem, "ivIconWishlistItem");
        e(pbProgressWishlistItem, ivIconWishlistItem);
        this.f39935d.f12227g.setVisibility(0);
        this.f39935d.f12222b.setVisibility(0);
        this.f39935d.f12232l.setVisibility(8);
        this.f39935d.f12230j.setVisibility(8);
        this.f39935d.f12234n.setVisibility(0);
        this.f39935d.f12233m.setVisibility(8);
    }

    private final void u() {
        this.f39935d.f12230j.setVisibility(0);
        this.f39935d.f12230j.setText(this.f39936e.getString(R.string.option_button_install));
        this.f39935d.f12230j.setVisibility(0);
        this.f39935d.f12230j.setBackground(ContextCompat.getDrawable(this.f39936e, R.drawable.ripple_install_button));
        this.f39935d.f12227g.setVisibility(8);
        this.f39935d.f12234n.setVisibility(8);
    }

    private final void v() {
        this.f39938g = a.f39941c;
        this.f39935d.f12230j.setText(this.f39936e.getString(R.string.installing));
        this.f39935d.f12230j.setVisibility(0);
        this.f39935d.f12230j.setBackground(ContextCompat.getDrawable(this.f39936e, R.drawable.bg_status_download_installed));
        this.f39935d.f12230j.setTextColor(ContextCompat.getColor(this.f39936e, R.color.download_installed_status));
        this.f39935d.f12227g.setVisibility(8);
        this.f39935d.f12234n.setVisibility(8);
    }

    private final void w() {
        this.f39938g = a.f39940b;
        this.f39935d.f12230j.setVisibility(0);
        this.f39935d.f12230j.setText(this.f39936e.getString(R.string.open));
        this.f39935d.f12230j.setBackground(ContextCompat.getDrawable(this.f39936e, R.drawable.ripple_blue_primary_button));
        this.f39935d.f12230j.setTextColor(ContextCompat.getColor(this.f39936e, R.color.white));
        this.f39935d.f12227g.setVisibility(8);
        this.f39935d.f12234n.setVisibility(8);
    }

    private final void x() {
        this.f39935d.f12230j.setVisibility(0);
        this.f39935d.f12227g.setVisibility(8);
        this.f39935d.f12230j.setText(this.f39936e.getString(R.string.updates_button_resume));
        this.f39935d.f12230j.setTextColor(ContextCompat.getColor(this.f39936e, R.color.white));
        this.f39935d.f12230j.setBackground(ContextCompat.getDrawable(this.f39936e, R.drawable.ripple_blue_primary_button));
        this.f39935d.f12234n.setVisibility(8);
    }

    private final void y(ProgressBar progressBar) {
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
    }

    private final void z(ProgressBar progressBar, int i8) {
        progressBar.setIndeterminate(false);
        progressBar.setProgress(i8);
        progressBar.setVisibility(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00ae, code lost:            if (com.uptodown.workers.DownloadApkWorker.f31190k.d(r11.h(), r11.e0()) == false) goto L22;     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0194  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(c5.W r17) {
        /*
            Method dump skipped, instructions count: 712
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.k1.n(c5.W):void");
    }
}
