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
import q5.C3770C;
import q5.C3784i;
import q5.C3791p;
import u5.C4087g;

/* renamed from: p5.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3587e extends Presenter.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private Context f36342a;

    /* renamed from: b, reason: collision with root package name */
    private ImageView f36343b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f36344c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f36345d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f36346e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3587e(View view, Context context) {
        super(view);
        AbstractC3292y.i(view, "view");
        AbstractC3292y.i(context, "context");
        this.f36342a = context;
        this.f36343b = (ImageView) view.findViewById(R.id.iv_logo_home_card_item);
        this.f36344c = (TextView) view.findViewById(R.id.tv_name_home_card_item);
        this.f36345d = (TextView) view.findViewById(R.id.tv_desc_home_card_item);
        this.f36346e = (TextView) view.findViewById(R.id.tv_status_home_card_item);
        TextView textView = this.f36344c;
        if (textView != null) {
            textView.setTypeface(j.f4395g.u());
        }
        TextView textView2 = this.f36345d;
        if (textView2 != null) {
            textView2.setTypeface(j.f4395g.v());
        }
        TextView textView3 = this.f36346e;
        if (textView3 != null) {
            textView3.setTypeface(j.f4395g.v());
        }
    }

    private final boolean a(C2041f c2041f) {
        PackageManager packageManager = this.f36342a.getPackageManager();
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
            textView.setText(this.f36342a.getString(R.string.status_download_update));
            textView.setTextColor(ContextCompat.getColor(this.f36342a, R.color.white));
            textView.setBackground(ContextCompat.getDrawable(this.f36342a, R.drawable.ripple_install_button));
        } else {
            textView.setText(this.f36342a.getString(R.string.status_download_installed));
            textView.setTextColor(ContextCompat.getColor(this.f36342a, R.color.download_installed_status));
            textView.setBackground(ContextCompat.getDrawable(this.f36342a, R.drawable.bg_status_download_installed));
        }
        textView.setVisibility(0);
        if (z8) {
            textView2.setVisibility(8);
        }
    }

    private final void d(String str, TextView textView, TextView textView2, boolean z8) {
        if (new C3784i().t(str, this.f36342a)) {
            C3791p a9 = C3791p.f37286s.a(this.f36342a);
            a9.a();
            AbstractC3292y.f(str);
            Q s02 = a9.s0(str);
            C2041f S8 = a9.S(str);
            a9.i();
            if (S8 != null) {
                if (S8.l0() && SettingsPreferences.f30529b.g0(this.f36342a) && a(S8)) {
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

    static /* synthetic */ void e(C3587e c3587e, String str, TextView textView, TextView textView2, boolean z8, int i8, Object obj) {
        if ((i8 & 8) != 0) {
            z8 = true;
        }
        c3587e.d(str, textView, textView2, z8);
    }

    private final void f(ImageView imageView, String str, String str2) {
        if (new C3784i().t(str2, this.f36342a)) {
            imageView.setImageDrawable(C3770C.f37260a.i(this.f36342a, str2));
        } else {
            s.h().l(str).l(R.drawable.shape_bg_placeholder).n(new C4087g((int) this.f36342a.getResources().getDimension(R.dimen.border_radius_s), null, 2, null)).i(imageView);
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
            String q02 = c2043h.q0();
            String N02 = c2043h.N0();
            TextView textView = this.f36344c;
            AbstractC3292y.f(textView);
            TextView textView2 = this.f36345d;
            AbstractC3292y.f(textView2);
            g(q02, N02, textView, textView2);
            String v02 = c2043h.v0();
            TextView textView3 = this.f36346e;
            AbstractC3292y.f(textView3);
            TextView textView4 = this.f36345d;
            AbstractC3292y.f(textView4);
            e(this, v02, textView3, textView4, false, 8, null);
            ImageView imageView = this.f36343b;
            AbstractC3292y.f(imageView);
            f(imageView, c2043h.j0(), c2043h.v0());
            return;
        }
        if (item instanceof j5.c) {
            C2046k a9 = ((j5.c) item).a();
            AbstractC3292y.f(a9);
            String h8 = a9.h();
            TextView textView5 = this.f36344c;
            AbstractC3292y.f(textView5);
            TextView textView6 = this.f36345d;
            AbstractC3292y.f(textView6);
            g(h8, null, textView5, textView6);
            TextView textView7 = this.f36346e;
            if (textView7 != null) {
                textView7.setVisibility(8);
            }
            int color = ContextCompat.getColor(this.f36342a, R.color.main_blue);
            Drawable drawable = ContextCompat.getDrawable(this.f36342a, R.drawable.vector_plus);
            if (drawable != null) {
                drawable.setTint(color);
            }
            ImageView imageView2 = this.f36343b;
            if (imageView2 != null) {
                imageView2.setImageDrawable(drawable);
                return;
            }
            return;
        }
        throw new Exception("item unknown!");
    }

    public final void h() {
        ImageView imageView = this.f36343b;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        TextView textView = this.f36344c;
        if (textView != null) {
            textView.setText((CharSequence) null);
        }
        TextView textView2 = this.f36345d;
        if (textView2 != null) {
            textView2.setText((CharSequence) null);
        }
        TextView textView3 = this.f36346e;
        if (textView3 != null) {
            textView3.setText((CharSequence) null);
        }
    }
}
