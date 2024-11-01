package l5;

import S4.r;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.leanback.widget.Presenter;
import c5.C2041f;
import c5.C2043h;
import c5.Q;
import com.squareup.picasso.s;
import com.uptodown.R;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.tv.utils.CropImageViewTv;
import kotlin.jvm.internal.AbstractC3292y;
import q5.C3770C;
import q5.C3784i;
import q5.C3791p;
import u5.C4087g;

/* loaded from: classes5.dex */
public final class d extends Presenter {

    /* renamed from: a, reason: collision with root package name */
    private Context f34724a;

    /* renamed from: b, reason: collision with root package name */
    private CropImageViewTv f34725b;

    /* renamed from: c, reason: collision with root package name */
    private ImageView f34726c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f34727d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f34728e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f34729f;

    public d(Context context) {
        AbstractC3292y.i(context, "context");
        this.f34724a = context;
    }

    private final boolean a(C2041f c2041f) {
        PackageManager packageManager = this.f34724a.getPackageManager();
        AbstractC3292y.h(packageManager, "getPackageManager(...)");
        String Q8 = c2041f.Q();
        AbstractC3292y.f(Q8);
        ApplicationInfo a9 = r.a(packageManager, Q8, 0);
        if (c2041f.i() != 0 || !a9.enabled) {
            return false;
        }
        return true;
    }

    private final void b(Q q8, TextView textView, TextView textView2, boolean z8) {
        if (q8 != null && q8.h() == 0) {
            textView.setText(this.f34724a.getString(R.string.status_download_update));
            textView.setTextColor(ContextCompat.getColor(this.f34724a, R.color.white));
            textView.setBackground(ContextCompat.getDrawable(this.f34724a, R.drawable.ripple_install_button));
        } else {
            textView.setText(this.f34724a.getString(R.string.status_download_installed));
            textView.setTextColor(ContextCompat.getColor(this.f34724a, R.color.download_installed_status));
            textView.setBackground(ContextCompat.getDrawable(this.f34724a, R.drawable.bg_status_download_installed));
        }
        textView.setVisibility(0);
        if (z8) {
            textView2.setVisibility(8);
        }
    }

    private final void c(String str, TextView textView, TextView textView2, boolean z8) {
        if (new C3784i().t(str, this.f34724a)) {
            C3791p a9 = C3791p.f37286s.a(this.f34724a);
            a9.a();
            AbstractC3292y.f(str);
            Q s02 = a9.s0(str);
            C2041f S8 = a9.S(str);
            a9.i();
            if (S8 != null) {
                if (S8.l0() && SettingsPreferences.f30529b.g0(this.f34724a) && a(S8)) {
                    b(s02, textView, textView2, z8);
                    return;
                }
                if (a(S8) && !S8.l0()) {
                    b(s02, textView, textView2, z8);
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

    private final void d(ImageView imageView, String str, String str2) {
        if (new C3784i().t(str2, this.f34724a)) {
            imageView.setImageDrawable(C3770C.f37260a.i(this.f34724a, str2));
        } else {
            s.h().l(str).l(R.drawable.shape_bg_placeholder).n(new C4087g((int) this.f34724a.getResources().getDimension(R.dimen.border_radius_m), null, 2, null)).i(imageView);
        }
    }

    private final void e(String str, String str2, TextView textView, TextView textView2) {
        textView.setText(str);
        textView2.setText(str2);
    }

    @Override // androidx.leanback.widget.Presenter
    public void onBindViewHolder(Presenter.ViewHolder viewHolder, Object item) {
        AbstractC3292y.i(viewHolder, "viewHolder");
        AbstractC3292y.i(item, "item");
        C2043h c2043h = (C2043h) item;
        s.h().l(c2043h.c0()).l(R.color.main_blue).i(this.f34725b);
        String q02 = c2043h.q0();
        String N02 = c2043h.N0();
        TextView textView = this.f34727d;
        AbstractC3292y.f(textView);
        TextView textView2 = this.f34728e;
        AbstractC3292y.f(textView2);
        e(q02, N02, textView, textView2);
        String v02 = c2043h.v0();
        TextView textView3 = this.f34729f;
        AbstractC3292y.f(textView3);
        TextView textView4 = this.f34728e;
        AbstractC3292y.f(textView4);
        c(v02, textView3, textView4, false);
        ImageView imageView = this.f34726c;
        AbstractC3292y.f(imageView);
        d(imageView, c2043h.j0(), c2043h.v0());
    }

    @Override // androidx.leanback.widget.Presenter
    public Presenter.ViewHolder onCreateViewHolder(ViewGroup parent) {
        AbstractC3292y.i(parent, "parent");
        if (parent.getContext() != null) {
            View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.tv_card_featured, parent, false);
            this.f34725b = (CropImageViewTv) inflate.findViewById(R.id.iv_featured);
            this.f34726c = (ImageView) inflate.findViewById(R.id.iv_logo_card);
            this.f34727d = (TextView) inflate.findViewById(R.id.tv_titulo_card);
            this.f34728e = (TextView) inflate.findViewById(R.id.tv_resumen_card);
            this.f34729f = (TextView) inflate.findViewById(R.id.tv_status_card);
            TextView textView = this.f34727d;
            if (textView != null) {
                textView.setTypeface(J4.j.f4395g.u());
            }
            TextView textView2 = this.f34728e;
            if (textView2 != null) {
                textView2.setTypeface(J4.j.f4395g.v());
            }
            TextView textView3 = this.f34729f;
            if (textView3 != null) {
                textView3.setTypeface(J4.j.f4395g.v());
            }
            return new Presenter.ViewHolder(inflate);
        }
        return null;
    }

    @Override // androidx.leanback.widget.Presenter
    public void onUnbindViewHolder(Presenter.ViewHolder viewHolder) {
        AbstractC3292y.i(viewHolder, "viewHolder");
    }
}
