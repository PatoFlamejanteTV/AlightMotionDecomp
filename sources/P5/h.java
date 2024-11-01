package p5;

import J4.j;
import S4.r;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.leanback.widget.Presenter;
import c5.C2033C;
import c5.C2041f;
import com.uptodown.R;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.Y;
import l6.n;
import q5.C3791p;

/* loaded from: classes5.dex */
public final class h extends Presenter.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private RelativeLayout f36353a;

    /* renamed from: b, reason: collision with root package name */
    private ImageView f36354b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f36355c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f36356d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f36357e;

    /* renamed from: f, reason: collision with root package name */
    private ProgressBar f36358f;

    /* renamed from: g, reason: collision with root package name */
    private TextView f36359g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(View itemView) {
        super(itemView);
        AbstractC3292y.i(itemView, "itemView");
        View findViewById = itemView.findViewById(R.id.rl_tv_old_version_item);
        AbstractC3292y.h(findViewById, "findViewById(...)");
        this.f36353a = (RelativeLayout) findViewById;
        View findViewById2 = itemView.findViewById(R.id.iv_icono_version);
        AbstractC3292y.h(findViewById2, "findViewById(...)");
        this.f36354b = (ImageView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.tv_name_version);
        AbstractC3292y.h(findViewById3, "findViewById(...)");
        this.f36355c = (TextView) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.tv_size_version);
        AbstractC3292y.h(findViewById4, "findViewById(...)");
        this.f36356d = (TextView) findViewById4;
        View findViewById5 = itemView.findViewById(R.id.tv_version);
        AbstractC3292y.h(findViewById5, "findViewById(...)");
        this.f36357e = (TextView) findViewById5;
        View findViewById6 = itemView.findViewById(R.id.progressbar_downloading_version);
        AbstractC3292y.h(findViewById6, "findViewById(...)");
        this.f36358f = (ProgressBar) findViewById6;
        View findViewById7 = itemView.findViewById(R.id.tv_action_old_version_item);
        AbstractC3292y.h(findViewById7, "findViewById(...)");
        this.f36359g = (TextView) findViewById7;
        TextView textView = this.f36355c;
        j.a aVar = j.f4395g;
        textView.setTypeface(aVar.v());
        this.f36356d.setTypeface(aVar.v());
        this.f36357e.setTypeface(aVar.v());
        this.f36359g.setTypeface(aVar.v());
    }

    public final void a(C2033C item, Context context, String str, C2041f c2041f) {
        AbstractC3292y.i(item, "item");
        AbstractC3292y.i(context, "context");
        try {
            PackageManager packageManager = context.getPackageManager();
            AbstractC3292y.h(packageManager, "getPackageManager(...)");
            AbstractC3292y.f(str);
            this.f36354b.setImageDrawable(r.d(packageManager, str, 0).applicationInfo.loadIcon(context.getPackageManager()));
        } catch (Exception unused) {
            this.f36354b.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_uptodown_logo_bag_disabled));
        }
        TextView textView = this.f36355c;
        j.a aVar = j.f4395g;
        textView.setTypeface(aVar.v());
        this.f36356d.setTypeface(aVar.v());
        this.f36357e.setTypeface(aVar.v());
        this.f36355c.setText(c2041f != null ? c2041f.z() : null);
        this.f36357e.setText(item.p());
        if ((c2041f != null ? Long.valueOf(c2041f.f0()) : null) != null && c2041f.f0() == item.l()) {
            this.f36355c.setTextColor(ContextCompat.getColor(context, R.color.white));
            this.f36356d.setTextColor(ContextCompat.getColor(context, R.color.white));
            this.f36357e.setTextColor(ContextCompat.getColor(context, R.color.white));
            this.f36353a.setBackgroundColor(ContextCompat.getColor(context, R.color.main_blue));
            this.f36359g.setVisibility(8);
            return;
        }
        C3791p a9 = C3791p.f37286s.a(context);
        a9.a();
        String a10 = item.a();
        AbstractC3292y.f(a10);
        c5.r Z8 = a9.Z(a10);
        a9.i();
        boolean z8 = Z8 != null && Z8.Z() > 0 && Z8.Z() < 100;
        if (Z8 == null) {
            this.f36359g.setText(R.string.updates_button_download_app);
            this.f36359g.setBackgroundColor(ContextCompat.getColor(context, R.color.accent_green));
            return;
        }
        if (z8) {
            TextView textView2 = this.f36356d;
            Y y8 = Y.f34578a;
            String format = String.format(Locale.getDefault(), "%d%%", Arrays.copyOf(new Object[]{Integer.valueOf(Z8.Z())}, 1));
            AbstractC3292y.h(format, "format(...)");
            textView2.setText(format);
            this.f36357e.setVisibility(8);
            this.f36358f.setProgress(Z8.Z());
            this.f36358f.setVisibility(0);
            this.f36359g.setText(android.R.string.cancel);
            this.f36359g.setBackgroundColor(ContextCompat.getColor(context, R.color.main_light_grey));
            return;
        }
        this.f36357e.setVisibility(0);
        if (item.i() > 0) {
            this.f36356d.setText(new S4.g().c(item.i()));
        }
        this.f36358f.setVisibility(4);
        P4.a h8 = aVar.h();
        if (n.s(h8 != null ? h8.b() : null, Z8.Y(), true)) {
            this.f36358f.setIndeterminate(true);
            this.f36358f.setVisibility(0);
            this.f36357e.setText(R.string.installing);
            this.f36356d.setText("");
            return;
        }
        this.f36359g.setText(R.string.option_button_install);
        this.f36359g.setBackgroundColor(ContextCompat.getColor(context, R.color.main_blue));
    }
}
