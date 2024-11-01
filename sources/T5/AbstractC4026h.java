package t5;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import b5.InterfaceC1980d;
import c5.C2041f;
import c5.C2043h;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.workers.DownloadApkWorker;
import kotlin.jvm.internal.AbstractC3292y;
import q5.C3784i;
import q5.C3791p;
import s5.C3969c;

/* renamed from: t5.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4026h extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private Context f39909a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC4026h(View itemView, Context context) {
        super(itemView);
        AbstractC3292y.i(itemView, "itemView");
        AbstractC3292y.i(context, "context");
        this.f39909a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(InterfaceC1980d interfaceC1980d, C2043h c2043h, View view) {
        interfaceC1980d.a(c2043h);
    }

    private final void f(C2041f c2041f, c5.Q q8, TextView textView) {
        if (q8 != null && q8.h() == 0) {
            textView.setText(this.f39909a.getString(R.string.status_download_update));
            textView.setTextColor(ContextCompat.getColor(this.f39909a, R.color.white));
            textView.setBackground(ContextCompat.getDrawable(this.f39909a, R.drawable.ripple_install_button));
        } else if (c2041f.h()) {
            textView.setText(this.f39909a.getString(R.string.dark_mode_disabled));
            textView.setTextColor(ContextCompat.getColor(this.f39909a, R.color.main_light_grey));
            textView.setBackground(ContextCompat.getDrawable(this.f39909a, R.drawable.bg_status_download_installed));
        } else {
            textView.setText(this.f39909a.getString(R.string.status_download_installed));
            textView.setTextColor(ContextCompat.getColor(this.f39909a, R.color.main_blue));
            textView.setBackground(ContextCompat.getDrawable(this.f39909a, R.drawable.shape_stroke_blue_primary));
        }
        textView.setTypeface(J4.j.f4395g.u());
    }

    private final void j(String str, ProgressBar progressBar, ImageView imageView, TextView textView, TextView textView2, LinearLayout linearLayout) {
        C3969c.f39130a.c(progressBar, imageView);
        linearLayout.setVisibility(8);
        if (textView2 != null) {
            g(str, textView2, textView);
        }
    }

    private final void k(int i8, long j8, ProgressBar progressBar, ImageView imageView, TextView textView, TextView textView2, TextView textView3, LinearLayout linearLayout) {
        C3969c.f39130a.e(progressBar, imageView);
        textView.setVisibility(8);
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        linearLayout.setVisibility(0);
        if (i8 == 0) {
            progressBar.setIndeterminate(true);
            textView2.setText(this.f39909a.getString(R.string.status_download_update_pending));
        } else {
            progressBar.setIndeterminate(false);
            progressBar.setProgress(i8);
            textView2.setText(this.f39909a.getString(R.string.percent_of_total_size, Integer.valueOf(i8), new S4.g().c(j8)));
        }
    }

    public final RelativeLayout.LayoutParams b(RelativeLayout.LayoutParams layoutParams, Context context, int i8, int i9) {
        AbstractC3292y.i(layoutParams, "<this>");
        AbstractC3292y.i(context, "context");
        int dimension = (int) context.getResources().getDimension(R.dimen.margin_m);
        if (AbstractC3292y.d(SettingsPreferences.f30529b.p(context), "ar")) {
            if (i8 == i9) {
                layoutParams.setMargins(dimension, 0, 0, 0);
            } else if (i8 == 1) {
                layoutParams.setMargins(dimension, 0, dimension, 0);
            } else {
                layoutParams.setMargins(dimension, 0, 0, 0);
            }
        } else if (i8 == i9) {
            layoutParams.setMargins(dimension, 0, dimension, 0);
        } else {
            layoutParams.setMargins(dimension, 0, 0, 0);
        }
        return layoutParams;
    }

    public final void c(View view, final InterfaceC1980d listener, final C2043h app) {
        AbstractC3292y.i(view, "<this>");
        AbstractC3292y.i(listener, "listener");
        AbstractC3292y.i(app, "app");
        view.setOnClickListener(new View.OnClickListener() { // from class: t5.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AbstractC4026h.d(InterfaceC1980d.this, app, view2);
            }
        });
    }

    public final void e(C2043h app, ProgressBar pb, ImageView ivIcon, TextView tvDesc, TextView tvProgress, TextView textView, LinearLayout llProgress) {
        c5.Q q8;
        boolean z8;
        String v02;
        AbstractC3292y.i(app, "app");
        AbstractC3292y.i(pb, "pb");
        AbstractC3292y.i(ivIcon, "ivIcon");
        AbstractC3292y.i(tvDesc, "tvDesc");
        AbstractC3292y.i(tvProgress, "tvProgress");
        AbstractC3292y.i(llProgress, "llProgress");
        C3791p a9 = C3791p.f37286s.a(this.f39909a);
        a9.a();
        c5.r Z8 = a9.Z(String.valueOf(app.d0()));
        if (Z8 == null && (v02 = app.v0()) != null && v02.length() != 0) {
            String v03 = app.v0();
            AbstractC3292y.f(v03);
            Z8 = a9.a0(v03);
        }
        String v04 = app.v0();
        if (v04 != null && v04.length() != 0) {
            String v05 = app.v0();
            AbstractC3292y.f(v05);
            q8 = a9.s0(v05);
        } else {
            q8 = null;
        }
        boolean z9 = false;
        if (UptodownApp.f29249C.V("downloadApkWorker", this.f39909a) && DownloadApkWorker.f31190k.c(app.h())) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (Z8 != null && Z8.h0()) {
            z9 = true;
        }
        if (Z8 != null && (z8 || z9)) {
            k(Z8.Z(), Z8.a0(), pb, ivIcon, tvDesc, tvProgress, textView, llProgress);
        } else if (q8 != null && q8.a()) {
            k(q8.u(), q8.v(), pb, ivIcon, tvDesc, tvProgress, textView, llProgress);
        } else {
            j(app.v0(), pb, ivIcon, tvDesc, textView, llProgress);
        }
    }

    public final void g(String str, TextView tvStatus, TextView tvDesc) {
        AbstractC3292y.i(tvStatus, "tvStatus");
        AbstractC3292y.i(tvDesc, "tvDesc");
        if (new C3784i().t(str, this.f39909a)) {
            C3791p a9 = C3791p.f37286s.a(this.f39909a);
            a9.a();
            AbstractC3292y.f(str);
            c5.Q s02 = a9.s0(str);
            C2041f S8 = a9.S(str);
            a9.i();
            if (S8 != null) {
                if (S8.i() == 0 && !S8.n0()) {
                    f(S8, s02, tvStatus);
                    tvStatus.setVisibility(0);
                    tvDesc.setVisibility(8);
                    return;
                } else {
                    tvStatus.setVisibility(8);
                    tvDesc.setVisibility(0);
                    return;
                }
            }
            tvStatus.setVisibility(0);
            tvDesc.setVisibility(8);
            return;
        }
        tvStatus.setText(this.f39909a.getString(R.string.status_download_installed));
        tvStatus.setTextColor(ContextCompat.getColor(this.f39909a, R.color.main_blue));
        tvStatus.setBackground(ContextCompat.getDrawable(this.f39909a, R.drawable.shape_stroke_blue_primary));
        tvStatus.setTypeface(J4.j.f4395g.u());
        tvStatus.setVisibility(8);
        tvDesc.setVisibility(0);
    }

    public final void h(ImageView iv, String str) {
        AbstractC3292y.i(iv, "iv");
        if (str != null) {
            com.squareup.picasso.s.h().l(str).l(R.drawable.shape_bg_placeholder).n(UptodownApp.f29249C.f0(this.f39909a)).i(iv);
        } else {
            iv.setImageDrawable(ContextCompat.getDrawable(this.f39909a, R.drawable.vector_app_icon_placeholder));
        }
    }

    public final void i(C2043h app, TextView tvName, TextView tvDesc) {
        AbstractC3292y.i(app, "app");
        AbstractC3292y.i(tvName, "tvName");
        AbstractC3292y.i(tvDesc, "tvDesc");
        tvName.setText(app.q0());
        String N02 = app.N0();
        if (N02 == null || N02.length() == 0) {
            N02 = app.l();
        }
        tvDesc.setText(N02);
    }
}
