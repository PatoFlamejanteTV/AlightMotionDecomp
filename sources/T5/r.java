package t5;

import S4.x;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import b5.InterfaceC1985i;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.workers.DownloadApkWorker;
import com.uptodown.workers.DownloadWorker;
import java.io.File;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class r extends AbstractC4032k {

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1985i f39991d;

    /* renamed from: e, reason: collision with root package name */
    private RelativeLayout f39992e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f39993f;

    /* renamed from: g, reason: collision with root package name */
    private TextView f39994g;

    /* renamed from: h, reason: collision with root package name */
    private TextView f39995h;

    /* renamed from: i, reason: collision with root package name */
    private TextView f39996i;

    /* renamed from: j, reason: collision with root package name */
    private ProgressBar f39997j;

    /* renamed from: k, reason: collision with root package name */
    private ImageView f39998k;

    /* renamed from: l, reason: collision with root package name */
    private ImageView f39999l;

    /* renamed from: m, reason: collision with root package name */
    private TextView f40000m;

    /* renamed from: n, reason: collision with root package name */
    private ImageView f40001n;

    /* renamed from: o, reason: collision with root package name */
    private RelativeLayout f40002o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public r(android.view.View r3, b5.InterfaceC1985i r4) {
        /*
            r2 = this;
            java.lang.String r0 = "itemView"
            kotlin.jvm.internal.AbstractC3292y.i(r3, r0)
            android.content.Context r0 = r3.getContext()
            java.lang.String r1 = "getContext(...)"
            kotlin.jvm.internal.AbstractC3292y.h(r0, r1)
            r2.<init>(r3, r0)
            r2.f39991d = r4
            r4 = 2131428750(0x7f0b058e, float:1.8479153E38)
            android.view.View r4 = r3.findViewById(r4)
            java.lang.String r0 = "findViewById(...)"
            kotlin.jvm.internal.AbstractC3292y.h(r4, r0)
            android.widget.RelativeLayout r4 = (android.widget.RelativeLayout) r4
            r2.f39992e = r4
            r4 = 2131429531(0x7f0b089b, float:1.8480737E38)
            android.view.View r4 = r3.findViewById(r4)
            kotlin.jvm.internal.AbstractC3292y.h(r4, r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r2.f39993f = r4
            r4 = 2131429923(0x7f0b0a23, float:1.8481532E38)
            android.view.View r4 = r3.findViewById(r4)
            kotlin.jvm.internal.AbstractC3292y.h(r4, r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r2.f39994g = r4
            r4 = 2131429738(0x7f0b096a, float:1.8481157E38)
            android.view.View r4 = r3.findViewById(r4)
            kotlin.jvm.internal.AbstractC3292y.h(r4, r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r2.f39995h = r4
            r4 = 2131429287(0x7f0b07a7, float:1.8480242E38)
            android.view.View r4 = r3.findViewById(r4)
            kotlin.jvm.internal.AbstractC3292y.h(r4, r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r2.f39996i = r4
            r4 = 2131428604(0x7f0b04fc, float:1.8478857E38)
            android.view.View r4 = r3.findViewById(r4)
            kotlin.jvm.internal.AbstractC3292y.h(r4, r0)
            android.widget.ProgressBar r4 = (android.widget.ProgressBar) r4
            r2.f39997j = r4
            r4 = 2131427898(0x7f0b023a, float:1.8477425E38)
            android.view.View r4 = r3.findViewById(r4)
            kotlin.jvm.internal.AbstractC3292y.h(r4, r0)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r2.f39998k = r4
            r4 = 2131427950(0x7f0b026e, float:1.847753E38)
            android.view.View r4 = r3.findViewById(r4)
            kotlin.jvm.internal.AbstractC3292y.h(r4, r0)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r2.f39999l = r4
            r4 = 2131429434(0x7f0b083a, float:1.848054E38)
            android.view.View r4 = r3.findViewById(r4)
            kotlin.jvm.internal.AbstractC3292y.h(r4, r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r2.f40000m = r4
            r4 = 2131428021(0x7f0b02b5, float:1.8477675E38)
            android.view.View r4 = r3.findViewById(r4)
            kotlin.jvm.internal.AbstractC3292y.h(r4, r0)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r2.f40001n = r4
            r4 = 2131428730(0x7f0b057a, float:1.8479113E38)
            android.view.View r4 = r3.findViewById(r4)
            kotlin.jvm.internal.AbstractC3292y.h(r4, r0)
            android.widget.RelativeLayout r4 = (android.widget.RelativeLayout) r4
            r2.f40002o = r4
            t5.n r4 = new t5.n
            r4.<init>()
            r3.setOnClickListener(r4)
            t5.o r4 = new t5.o
            r4.<init>()
            r3.setOnLongClickListener(r4)
            android.widget.TextView r3 = r2.f39993f
            J4.j$a r4 = J4.j.f4395g
            android.graphics.Typeface r0 = r4.u()
            r3.setTypeface(r0)
            android.widget.TextView r3 = r2.f39994g
            android.graphics.Typeface r0 = r4.v()
            r3.setTypeface(r0)
            android.widget.TextView r3 = r2.f39995h
            android.graphics.Typeface r0 = r4.u()
            r3.setTypeface(r0)
            android.widget.TextView r3 = r2.f39996i
            android.graphics.Typeface r0 = r4.v()
            r3.setTypeface(r0)
            android.widget.TextView r3 = r2.f40000m
            android.graphics.Typeface r4 = r4.u()
            r3.setTypeface(r4)
            android.widget.ImageView r3 = r2.f39998k
            t5.p r4 = new t5.p
            r4.<init>()
            r3.setOnClickListener(r4)
            android.widget.ImageView r3 = r2.f40001n
            t5.q r4 = new t5.q
            r4.<init>()
            r3.setOnClickListener(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.r.<init>(android.view.View, b5.i):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(r rVar, View view) {
        int bindingAdapterPosition;
        if (rVar.f39991d != null && (bindingAdapterPosition = rVar.getBindingAdapterPosition()) != -1) {
            rVar.f39991d.a(bindingAdapterPosition);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(r rVar, View view) {
        int bindingAdapterPosition;
        if (rVar.f39991d != null && (bindingAdapterPosition = rVar.getBindingAdapterPosition()) != -1) {
            rVar.f39991d.c(bindingAdapterPosition);
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(r rVar, View view) {
        InterfaceC1985i interfaceC1985i;
        int bindingAdapterPosition = rVar.getBindingAdapterPosition();
        if (bindingAdapterPosition != -1 && (interfaceC1985i = rVar.f39991d) != null) {
            interfaceC1985i.b(bindingAdapterPosition);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(r rVar, View view) {
        InterfaceC1985i interfaceC1985i;
        int bindingAdapterPosition = rVar.getBindingAdapterPosition();
        if (bindingAdapterPosition != -1 && (interfaceC1985i = rVar.f39991d) != null) {
            interfaceC1985i.d(bindingAdapterPosition);
        }
    }

    public final void o(c5.r download, boolean z8, boolean z9) {
        AbstractC3292y.i(download, "download");
        this.f39999l.setPadding(0, 0, 0, 0);
        String d02 = download.d0();
        if (d02 != null && d02.length() != 0) {
            com.squareup.picasso.w l8 = com.squareup.picasso.s.h().l(download.d0());
            UptodownApp.a aVar = UptodownApp.f29249C;
            Context context = this.itemView.getContext();
            AbstractC3292y.h(context, "getContext(...)");
            l8.n(aVar.f0(context)).i(this.f39999l);
        } else {
            if (download.f() != null) {
                String f8 = download.f();
                AbstractC3292y.f(f8);
                if (l6.n.r(f8, ".apk", false, 2, null)) {
                    this.f39999l.setImageResource(R.drawable.core_vector_apk);
                }
            }
            if (download.f() != null) {
                x.a aVar2 = S4.x.f9510b;
                String f9 = download.f();
                AbstractC3292y.f(f9);
                if (aVar2.a(f9)) {
                    this.f39999l.setImageResource(R.drawable.core_vector_xapk);
                }
            }
            this.f39999l.setImageDrawable(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.core_vector_apk));
        }
        this.f39993f.setText(download.X());
        if (download.e0() > 0) {
            this.f39994g.setText(String.valueOf(download.e0()));
        }
        this.f40001n.setVisibility(8);
        if (download.z() == 1) {
            TextView textView = this.f39995h;
            kotlin.jvm.internal.Y y8 = kotlin.jvm.internal.Y.f34578a;
            String format = String.format(Locale.getDefault(), "%d%%", Arrays.copyOf(new Object[]{Integer.valueOf(download.Z())}, 1));
            AbstractC3292y.h(format, "format(...)");
            textView.setText(format);
            this.f39996i.setVisibility(8);
            this.f39997j.setProgress(download.Z());
            this.f39997j.setVisibility(0);
            this.f40000m.setText("");
            this.f40000m.setVisibility(8);
            this.f40002o.setVisibility(0);
            this.f39998k.setVisibility(0);
        } else {
            this.f39996i.setVisibility(0);
            if (download.i0()) {
                this.f39997j.setIndeterminate(true);
                this.f39997j.setVisibility(8);
                this.f39996i.setVisibility(8);
                this.f39995h.setText("");
                this.f40000m.setText(this.itemView.getContext().getString(R.string.installing));
                this.f40000m.setTextColor(ContextCompat.getColor(this.itemView.getContext(), R.color.download_installed_status));
                this.f40000m.setBackground(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.bg_status_download_installed));
                this.f40002o.setVisibility(8);
                e(this.f39997j, this.f39999l);
            } else {
                String f10 = download.f();
                AbstractC3292y.f(f10);
                File file = new File(f10);
                this.f39996i.setText(DateFormat.getDateTimeInstance().format(new Date(file.lastModified())));
                this.f39997j.setVisibility(4);
                this.f39995h.setText(new S4.g().c(file.length()));
                this.f40000m.setText(this.itemView.getContext().getString(R.string.option_button_install));
                this.f40000m.setTextColor(ContextCompat.getColor(this.itemView.getContext(), R.color.white));
                this.f40000m.setBackground(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.shape_bg_accent_green));
                this.f40000m.setVisibility(0);
                this.f40002o.setVisibility(8);
                c(this.f39997j, this.f39999l);
            }
        }
        if (download.g0() > -1 && download.f0() > -1) {
            this.f40000m.setVisibility(0);
            this.f39997j.setVisibility(4);
            this.f40002o.setVisibility(8);
            this.f39998k.setVisibility(8);
            if (download.g0() > download.f0()) {
                this.f40000m.setText(this.itemView.getContext().getString(R.string.status_download_oldversion));
                this.f40000m.setTextColor(ContextCompat.getColor(this.itemView.getContext(), R.color.white));
                this.f40000m.setBackground(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.bg_status_download_outdate));
            } else if (download.g0() < download.f0()) {
                this.f40000m.setText(this.itemView.getContext().getString(R.string.action_update));
                this.f40000m.setTextColor(ContextCompat.getColor(this.itemView.getContext(), R.color.white));
                this.f40000m.setBackground(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.shape_bg_accent_green));
            } else {
                this.f40000m.setText(this.itemView.getContext().getString(R.string.status_download_installed));
                this.f40000m.setTextColor(ContextCompat.getColor(this.itemView.getContext(), R.color.download_installed_status));
                this.f40000m.setBackground(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.bg_status_download_installed));
            }
        }
        if (z8) {
            if (z9) {
                this.f39992e.setBackground(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.shape_bg_selected_item));
                return;
            } else {
                this.f39992e.setBackground(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.ripple_bg_card));
                return;
            }
        }
        this.f39992e.setBackground(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.ripple_bg_card));
    }

    public final void p(c5.r download, boolean z8, boolean z9) {
        boolean z10;
        AbstractC3292y.i(download, "download");
        String d02 = download.d0();
        if (d02 != null && d02.length() != 0) {
            ImageView imageView = this.f39999l;
            int dimension = (int) this.itemView.getContext().getResources().getDimension(R.dimen.downloading_item_icon_padding);
            imageView.setPadding(dimension, dimension, dimension, dimension);
            com.squareup.picasso.w l8 = com.squareup.picasso.s.h().l(download.d0());
            UptodownApp.a aVar = UptodownApp.f29249C;
            Context context = this.itemView.getContext();
            AbstractC3292y.h(context, "getContext(...)");
            l8.n(aVar.f0(context)).i(this.f39999l);
        }
        String X8 = download.X();
        if (X8 == null) {
            X8 = download.Y() + download.e0();
        }
        this.f39993f.setText(X8);
        this.f39994g.setText(String.valueOf(download.e0()));
        this.f39996i.setVisibility(8);
        if (download.a0() == 0) {
            this.f39995h.setVisibility(8);
        } else {
            this.f39995h.setVisibility(0);
            this.f39995h.setText(new S4.g().c(download.a0()));
        }
        this.f40002o.setVisibility(0);
        this.f39998k.setVisibility(0);
        this.f40001n.setVisibility(8);
        this.f40000m.setVisibility(8);
        this.f39997j.setVisibility(0);
        int Z8 = download.Z();
        if (1 <= Z8 && Z8 < 100) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            UptodownApp.a aVar2 = UptodownApp.f29249C;
            Context context2 = this.itemView.getContext();
            AbstractC3292y.h(context2, "getContext(...)");
            if (aVar2.V("downloadApkWorker", context2) && DownloadApkWorker.f31190k.d(download.h(), download.e0())) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        if (z10) {
            TextView textView = this.f39995h;
            kotlin.jvm.internal.Y y8 = kotlin.jvm.internal.Y.f34578a;
            String format = String.format("%s/%s", Arrays.copyOf(new Object[]{new S4.g().c(download.u()), new S4.g().c(download.a0())}, 2));
            AbstractC3292y.h(format, "format(...)");
            textView.setText(format);
            TextView textView2 = this.f39996i;
            String format2 = String.format(Locale.getDefault(), "%d%%", Arrays.copyOf(new Object[]{Integer.valueOf(download.Z())}, 1));
            AbstractC3292y.h(format2, "format(...)");
            textView2.setText(format2);
            this.f39996i.setVisibility(0);
            this.f39997j.setIndeterminate(false);
            this.f39997j.setProgress(download.Z());
            this.f40002o.setVisibility(0);
            if (DownloadWorker.f31208c.c()) {
                this.f39998k.setVisibility(8);
                this.f40001n.setVisibility(0);
            } else {
                this.f39998k.setVisibility(0);
                this.f40001n.setVisibility(8);
            }
        } else {
            TextView textView3 = this.f39995h;
            kotlin.jvm.internal.Y y9 = kotlin.jvm.internal.Y.f34578a;
            String format3 = String.format("%s/%s", Arrays.copyOf(new Object[]{new S4.g().c(download.u()), new S4.g().c(download.a0())}, 2));
            AbstractC3292y.h(format3, "format(...)");
            textView3.setText(format3);
            TextView textView4 = this.f39996i;
            String format4 = String.format(Locale.getDefault(), "%d%%", Arrays.copyOf(new Object[]{Integer.valueOf(download.Z())}, 1));
            AbstractC3292y.h(format4, "format(...)");
            textView4.setText(format4);
            this.f39996i.setVisibility(0);
            this.f39997j.setIndeterminate(true);
        }
        if (z8) {
            if (z9) {
                this.f39992e.setBackground(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.shape_bg_selected_item));
            } else {
                this.f39992e.setBackground(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.ripple_bg_card));
            }
        }
    }
}
