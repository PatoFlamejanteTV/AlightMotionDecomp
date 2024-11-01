package p5;

import J4.j;
import S4.r;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.leanback.widget.Presenter;
import c5.C2041f;
import c5.C2043h;
import c5.C2046k;
import c5.Q;
import com.squareup.picasso.s;
import com.uptodown.R;
import com.uptodown.activities.preferences.SettingsPreferences;
import kotlin.jvm.internal.AbstractC3292y;
import q5.C3784i;
import q5.C3791p;
import u5.C4087g;

/* renamed from: p5.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3586d extends Presenter.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private Context f36336a;

    /* renamed from: b, reason: collision with root package name */
    private ImageView f36337b;

    /* renamed from: c, reason: collision with root package name */
    private ImageView f36338c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f36339d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f36340e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f36341f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3586d(View view, Context context) {
        super(view);
        AbstractC3292y.i(view, "view");
        AbstractC3292y.i(context, "context");
        this.f36336a = context;
        View findViewById = view.findViewById(R.id.iv_home_card_featured_item);
        AbstractC3292y.h(findViewById, "findViewById(...)");
        this.f36337b = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.iv_logo_home_card_featured_item);
        AbstractC3292y.h(findViewById2, "findViewById(...)");
        this.f36338c = (ImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.tv_name_home_card_featured_item);
        AbstractC3292y.h(findViewById3, "findViewById(...)");
        this.f36339d = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.tv_desc_home_card_featured_item);
        AbstractC3292y.h(findViewById4, "findViewById(...)");
        this.f36340e = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.tv_status_home_card_featured_item);
        AbstractC3292y.h(findViewById5, "findViewById(...)");
        this.f36341f = (TextView) findViewById5;
        TextView textView = this.f36339d;
        j.a aVar = j.f4395g;
        textView.setTypeface(aVar.u());
        this.f36340e.setTypeface(aVar.v());
        this.f36341f.setTypeface(aVar.v());
    }

    private final boolean a(C2041f c2041f) {
        PackageManager packageManager = this.f36336a.getPackageManager();
        AbstractC3292y.h(packageManager, "getPackageManager(...)");
        String Q8 = c2041f.Q();
        AbstractC3292y.f(Q8);
        ApplicationInfo a9 = r.a(packageManager, Q8, 0);
        if (c2041f.i() != 0 || !a9.enabled) {
            return false;
        }
        return true;
    }

    private final void c(Q q8, TextView textView, TextView textView2, boolean z8) {
        if (q8 != null && q8.h() == 0) {
            textView.setText(this.f36336a.getString(R.string.status_download_update));
            textView.setTextColor(ContextCompat.getColor(this.f36336a, R.color.white));
            textView.setBackground(ContextCompat.getDrawable(this.f36336a, R.drawable.ripple_install_button));
        } else {
            textView.setText(this.f36336a.getString(R.string.status_download_installed));
            textView.setTextColor(ContextCompat.getColor(this.f36336a, R.color.download_installed_status));
            textView.setBackground(ContextCompat.getDrawable(this.f36336a, R.drawable.bg_status_download_installed));
        }
        textView.setVisibility(0);
        if (z8) {
            textView2.setVisibility(8);
        }
    }

    private final void d(String str, TextView textView, TextView textView2, boolean z8) {
        if (new C3784i().t(str, this.f36336a)) {
            C3791p a9 = C3791p.f37286s.a(this.f36336a);
            a9.a();
            AbstractC3292y.f(str);
            Q s02 = a9.s0(str);
            C2041f S8 = a9.S(str);
            a9.i();
            if (S8 != null) {
                if (S8.l0() && SettingsPreferences.f30529b.g0(this.f36336a) && a(S8)) {
                    c(s02, textView, textView2, z8);
                    return;
                }
                if (a(S8) && !S8.l0()) {
                    c(s02, textView, textView2, z8);
                    return;
                }
                textView.setVisibility(8);
                if (z8) {
                    textView2.setVisibility(0);
                    return;
                }
                return;
            }
            return;
        }
        if (z8) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(4);
        }
        textView2.setVisibility(0);
    }

    static /* synthetic */ void e(C3586d c3586d, String str, TextView textView, TextView textView2, boolean z8, int i8, Object obj) {
        if ((i8 & 8) != 0) {
            z8 = true;
        }
        c3586d.d(str, textView, textView2, z8);
    }

    private final void f(ImageView imageView, String str) {
        if (str != null) {
            s.h().l(str).l(R.drawable.shape_bg_placeholder).n(new C4087g((int) this.f36336a.getResources().getDimension(R.dimen.border_radius_m), null, 2, null)).i(imageView);
        } else {
            imageView.setImageDrawable(ContextCompat.getDrawable(this.f36336a, R.drawable.vector_app_icon_placeholder));
        }
    }

    private final void g(String str, String str2, TextView textView, TextView textView2) {
        textView.setText(str);
        textView2.setText(str2);
    }

    public final void b(Object item) {
        AbstractC3292y.i(item, "item");
        if (item instanceof C2043h) {
            C2043h c2043h = (C2043h) item;
            String c02 = c2043h.c0();
            if (c02 != null && c02.length() != 0) {
                s.h().l(c2043h.g0()).n(new C4087g((int) this.f36336a.getResources().getDimension(R.dimen.border_radius_m), null, 2, null)).a().f().l(R.drawable.shape_bg_placeholder).i(this.f36337b);
            } else {
                this.f36337b.setImageDrawable(ContextCompat.getDrawable(this.f36336a, R.drawable.shape_bg_placeholder));
            }
            g(c2043h.q0(), c2043h.N0(), this.f36339d, this.f36340e);
            e(this, c2043h.v0(), this.f36341f, this.f36340e, false, 8, null);
            f(this.f36338c, c2043h.k0());
            return;
        }
        if (item instanceof j5.c) {
            C2046k a9 = ((j5.c) item).a();
            AbstractC3292y.f(a9);
            g(a9.h(), null, this.f36339d, this.f36340e);
            this.f36341f.setVisibility(8);
            int color = ContextCompat.getColor(this.f36336a, R.color.main_blue);
            Drawable drawable = ContextCompat.getDrawable(this.f36336a, R.drawable.vector_plus);
            if (drawable != null) {
                drawable.setTint(color);
            }
            this.f36337b.setImageDrawable(drawable);
            this.f36338c.setImageDrawable(null);
            return;
        }
        throw new Exception("item unknown!");
    }

    public final void h() {
        this.f36337b.setImageDrawable(null);
        this.f36338c.setImageDrawable(null);
        this.f36339d.setText((CharSequence) null);
        this.f36340e.setText((CharSequence) null);
        this.f36341f.setText((CharSequence) null);
    }
}
