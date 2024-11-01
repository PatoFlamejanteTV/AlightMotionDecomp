package F4;

import J4.j;
import Y4.C1533x;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.net.nsd.NsdServiceInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.FileProvider;
import androidx.documentfile.provider.DocumentFile;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.work.Data;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import b5.InterfaceC1975D;
import b5.InterfaceC1976E;
import b5.InterfaceC1984h;
import c5.C2041f;
import c5.C2043h;
import c6.InterfaceC2072n;
import com.mbridge.msdk.MBridgeConstans;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.AbstractActivityC2691a;
import com.uptodown.activities.AppInstalledDetailsActivity;
import com.uptodown.activities.OldVersionsActivity;
import com.uptodown.activities.VirusTotalReport;
import com.uptodown.core.activities.FileExplorerActivity;
import com.uptodown.workers.DownloadApkWorker;
import com.uptodown.workers.DownloadUpdatesWorker;
import com.uptodown.workers.GenerateQueueWorker;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.InterfaceC3488x0;
import q5.C3776a;
import q5.C3791p;
import q5.C3794s;

/* renamed from: F4.w2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractActivityC1198w2 extends AbstractActivityC2691a {

    /* renamed from: O, reason: collision with root package name */
    private ProgressBar f2620O;

    /* renamed from: P, reason: collision with root package name */
    private TextView f2621P;

    /* renamed from: Q, reason: collision with root package name */
    private TextView f2622Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f2623R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f2624S;

    /* renamed from: T, reason: collision with root package name */
    private InterfaceC3488x0 f2625T;

    /* renamed from: V, reason: collision with root package name */
    private boolean f2627V;

    /* renamed from: W, reason: collision with root package name */
    private C1533x f2628W;

    /* renamed from: X, reason: collision with root package name */
    private HashMap f2629X;

    /* renamed from: Y, reason: collision with root package name */
    private File f2630Y;

    /* renamed from: Z, reason: collision with root package name */
    private boolean f2631Z;

    /* renamed from: U, reason: collision with root package name */
    private ArrayList f2626U = new ArrayList();

    /* renamed from: p0, reason: collision with root package name */
    private e f2632p0 = new e();

    /* renamed from: F4.w2$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC1984h {
        a() {
        }

        @Override // b5.InterfaceC1984h
        public void a(ArrayList positives) {
            AbstractC3292y.i(positives, "positives");
            UptodownApp.f29249C.A0(positives);
            AbstractActivityC1198w2.this.o4();
            AbstractActivityC1198w2.this.f2623R = false;
        }

        @Override // b5.InterfaceC1984h
        public void b() {
            UptodownApp.f29249C.A0(new ArrayList());
            AbstractActivityC1198w2.this.o4();
            AbstractActivityC1198w2.this.f2623R = false;
        }
    }

    /* renamed from: F4.w2$c */
    /* loaded from: classes4.dex */
    public static final class c implements b5.r {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2041f f2638b;

        c(C2041f c2041f) {
            this.f2638b = c2041f;
        }

        @Override // b5.r
        public void b(int i8) {
            AbstractActivityC1198w2 abstractActivityC1198w2 = AbstractActivityC1198w2.this;
            String string = abstractActivityC1198w2.getString(R.string.rollback_not_available, this.f2638b.z());
            AbstractC3292y.h(string, "getString(...)");
            abstractActivityC1198w2.Z1(string);
        }

        @Override // b5.r
        public void c(C2043h appInfo) {
            AbstractC3292y.i(appInfo, "appInfo");
            if (appInfo.b()) {
                Intent intent = new Intent(AbstractActivityC1198w2.this.getApplicationContext(), (Class<?>) OldVersionsActivity.class);
                intent.putExtra(MBridgeConstans.DYNAMIC_VIEW_WX_APP, this.f2638b);
                intent.putExtra("appInfo", appInfo);
                AbstractActivityC1198w2 abstractActivityC1198w2 = AbstractActivityC1198w2.this;
                abstractActivityC1198w2.startActivity(intent, UptodownApp.f29249C.a(abstractActivityC1198w2));
                return;
            }
            AbstractActivityC1198w2 abstractActivityC1198w22 = AbstractActivityC1198w2.this;
            String string = abstractActivityC1198w22.getString(R.string.rollback_not_available, appInfo.q0());
            AbstractC3292y.h(string, "getString(...)");
            abstractActivityC1198w22.Z1(string);
        }
    }

    /* renamed from: F4.w2$d */
    /* loaded from: classes4.dex */
    public static final class d implements b5.J {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2041f f2640b;

        d(C2041f c2041f) {
            this.f2640b = c2041f;
        }

        @Override // b5.J
        public void a() {
            AbstractActivityC1198w2.this.F2(this.f2640b.X());
        }

        @Override // b5.J
        public void b(c5.J reportVT) {
            AbstractC3292y.i(reportVT, "reportVT");
            Intent intent = new Intent(AbstractActivityC1198w2.this, (Class<?>) VirusTotalReport.class);
            intent.putExtra("app_selected", this.f2640b);
            intent.putExtra("appReportVT", reportVT);
            AbstractActivityC1198w2 abstractActivityC1198w2 = AbstractActivityC1198w2.this;
            abstractActivityC1198w2.startActivity(intent, UptodownApp.f29249C.a(abstractActivityC1198w2));
        }
    }

    /* renamed from: F4.w2$e */
    /* loaded from: classes4.dex */
    public static final class e implements InterfaceC1975D {
        e() {
        }

        @Override // b5.InterfaceC1975D
        public void a(String appName) {
            AbstractC3292y.i(appName, "appName");
            AbstractActivityC1198w2.this.Z1(appName);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F4.w2$f */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f2642a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f2643b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractActivityC1198w2 f2644c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(int i8, AbstractActivityC1198w2 abstractActivityC1198w2, U5.d dVar) {
            super(2, dVar);
            this.f2643b = i8;
            this.f2644c = abstractActivityC1198w2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new f(this.f2643b, this.f2644c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f2642a == 0) {
                Q5.t.b(obj);
                C1533x c1533x = null;
                switch (this.f2643b) {
                    case 106:
                        C1533x c1533x2 = this.f2644c.f2628W;
                        if (c1533x2 == null) {
                            AbstractC3292y.y("dialogBinding");
                        } else {
                            c1533x = c1533x2;
                        }
                        c1533x.f13069n.setText(this.f2644c.getString(R.string.action_update));
                        break;
                    case 107:
                        C1533x c1533x3 = this.f2644c.f2628W;
                        if (c1533x3 == null) {
                            AbstractC3292y.y("dialogBinding");
                        } else {
                            c1533x = c1533x3;
                        }
                        c1533x.f13069n.setText(this.f2644c.getString(R.string.action_cancel_download));
                        break;
                    case 108:
                        C1533x c1533x4 = this.f2644c.f2628W;
                        if (c1533x4 == null) {
                            AbstractC3292y.y("dialogBinding");
                        } else {
                            c1533x = c1533x4;
                        }
                        c1533x.f13069n.setText(this.f2644c.getString(R.string.notification_msg_update_uptodown));
                        break;
                }
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    private final void B3() {
        new X4.a(this, new a(), LifecycleOwnerKt.getLifecycleScope(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C3(String str, int i8) {
        Window window;
        if (i8 == 0) {
            AlertDialog o22 = o2();
            if (o22 != null) {
                o22.dismiss();
            }
            View inflate = getLayoutInflater().inflate(R.layout.dialog_backup_app, (ViewGroup) null, false);
            TextView textView = (TextView) inflate.findViewById(R.id.tv_title_dialog_backup_app);
            j.a aVar = J4.j.f4395g;
            textView.setTypeface(aVar.u());
            TextView textView2 = (TextView) inflate.findViewById(R.id.tv_name_dialog_backup_app);
            this.f2621P = textView2;
            if (textView2 != null) {
                textView2.setTypeface(aVar.v());
            }
            TextView textView3 = (TextView) inflate.findViewById(R.id.tv_percentage_dialog_backup_app);
            this.f2622Q = textView3;
            if (textView3 != null) {
                textView3.setTypeface(aVar.v());
            }
            this.f2620O = (ProgressBar) inflate.findViewById(R.id.progressbar_dialog_backup_app);
            View findViewById = inflate.findViewById(R.id.tv_cancel_dialog_backup_app);
            AbstractC3292y.h(findViewById, "findViewById(...)");
            TextView textView4 = (TextView) findViewById;
            textView4.setTypeface(aVar.u());
            textView4.setOnClickListener(new View.OnClickListener() { // from class: F4.n2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractActivityC1198w2.D3(AbstractActivityC1198w2.this, view);
                }
            });
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setView(inflate);
            builder.setCancelable(false);
            K2(builder.create());
            AlertDialog o23 = o2();
            if (o23 != null && (window = o23.getWindow()) != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            AlertDialog o24 = o2();
            if (o24 != null) {
                o24.show();
            }
        }
        TextView textView5 = this.f2621P;
        if (textView5 != null) {
            textView5.setText(str);
        }
        TextView textView6 = this.f2622Q;
        if (textView6 != null) {
            textView6.setText("0%");
        }
        ProgressBar progressBar = this.f2620O;
        if (progressBar != null) {
            progressBar.setProgress(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D3(AbstractActivityC1198w2 abstractActivityC1198w2, View view) {
        if (UptodownApp.f29249C.a0()) {
            InterfaceC3488x0 interfaceC3488x0 = abstractActivityC1198w2.f2625T;
            if (interfaceC3488x0 == null) {
                AbstractC3292y.y("jobBackup");
                interfaceC3488x0 = null;
            }
            InterfaceC3488x0.a.a(interfaceC3488x0, null, 1, null);
            AlertDialog o22 = abstractActivityC1198w2.o2();
            if (o22 != null) {
                o22.dismiss();
            }
            abstractActivityC1198w2.K2(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E3(String str, final String str2) {
        AlertDialog o22 = o2();
        if (o22 != null) {
            o22.dismiss();
        }
        View inflate = getLayoutInflater().inflate(R.layout.dialog_backup_result, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(R.id.tv_title_dialog_backup_result);
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.u());
        TextView textView2 = (TextView) inflate.findViewById(R.id.tv_msg_dialog_backup_result);
        textView2.setTypeface(aVar.v());
        textView2.setText(str);
        TextView textView3 = (TextView) inflate.findViewById(R.id.tv_ok_dialog_backup_result);
        textView3.setTypeface(aVar.u());
        textView3.setOnClickListener(new View.OnClickListener() { // from class: F4.j2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractActivityC1198w2.F3(AbstractActivityC1198w2.this, view);
            }
        });
        TextView textView4 = (TextView) inflate.findViewById(R.id.tv_browse_dialog_backup_result);
        textView4.setTypeface(aVar.u());
        textView4.setOnClickListener(new View.OnClickListener() { // from class: F4.k2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractActivityC1198w2.G3(AbstractActivityC1198w2.this, view);
            }
        });
        if (str2 != null && str2.length() != 0) {
            TextView textView5 = (TextView) inflate.findViewById(R.id.tv_share_dialog_backup_result);
            textView5.setTypeface(aVar.u());
            textView5.setOnClickListener(new View.OnClickListener() { // from class: F4.l2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractActivityC1198w2.H3(AbstractActivityC1198w2.this, str2, view);
                }
            });
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(inflate);
        K2(builder.create());
        AlertDialog o23 = o2();
        AbstractC3292y.f(o23);
        Window window = o23.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        AlertDialog o24 = o2();
        AbstractC3292y.f(o24);
        o24.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F3(AbstractActivityC1198w2 abstractActivityC1198w2, View view) {
        if (UptodownApp.f29249C.a0()) {
            AlertDialog o22 = abstractActivityC1198w2.o2();
            if (o22 != null) {
                o22.dismiss();
            }
            abstractActivityC1198w2.K2(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G3(AbstractActivityC1198w2 abstractActivityC1198w2, View view) {
        if (UptodownApp.f29249C.a0()) {
            Intent intent = new Intent(abstractActivityC1198w2, (Class<?>) FileExplorerActivity.class);
            intent.putExtra("subdir", new L4.a(abstractActivityC1198w2).c());
            intent.putExtra("subdir_sd", new L4.a(abstractActivityC1198w2).n());
            abstractActivityC1198w2.startActivity(intent);
            AlertDialog o22 = abstractActivityC1198w2.o2();
            if (o22 != null) {
                o22.dismiss();
            }
            abstractActivityC1198w2.K2(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H3(AbstractActivityC1198w2 abstractActivityC1198w2, String str, View view) {
        if (UptodownApp.f29249C.a0()) {
            Intent intent = new Intent("android.intent.action.SEND");
            Object b9 = new L4.a(abstractActivityC1198w2).b();
            if (b9 instanceof File) {
                File file = new File((File) b9, str);
                if (file.exists()) {
                    intent.setType("application/vnd.android.package-archive");
                    intent.putExtra("android.intent.extra.STREAM", FileProvider.getUriForFile(abstractActivityC1198w2, abstractActivityC1198w2.getPackageName() + ".provider", file));
                    abstractActivityC1198w2.startActivity(Intent.createChooser(intent, abstractActivityC1198w2.getString(R.string.intent_chooser_title_share_file)));
                    return;
                }
                return;
            }
            if (b9 instanceof DocumentFile) {
                intent.putExtra("android.intent.extra.STREAM", ((DocumentFile) b9).getUri());
                abstractActivityC1198w2.startActivity(Intent.createChooser(intent, abstractActivityC1198w2.getString(R.string.intent_chooser_title_share_file)));
            }
        }
    }

    private final void I3(C2041f c2041f, c5.Q q8) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater layoutInflater = getLayoutInflater();
        AbstractC3292y.h(layoutInflater, "getLayoutInflater(...)");
        View inflate = layoutInflater.inflate(R.layout.version_details_dialog, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(R.id.tv_title_vd);
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.u());
        ((TextView) inflate.findViewById(R.id.tv_label_app_name_vd)).setTypeface(aVar.v());
        TextView textView2 = (TextView) inflate.findViewById(R.id.tv_app_name_vd);
        textView2.setTypeface(aVar.u());
        textView2.setText(c2041f.z());
        ((TextView) inflate.findViewById(R.id.tv_label_installed_version_vd)).setTypeface(aVar.v());
        TextView textView3 = (TextView) inflate.findViewById(R.id.tv_installed_version_vd);
        textView3.setTypeface(aVar.u());
        kotlin.jvm.internal.Y y8 = kotlin.jvm.internal.Y.f34578a;
        String format = String.format("%s(%s)", Arrays.copyOf(new Object[]{c2041f.h0(), Long.valueOf(c2041f.f0())}, 2));
        AbstractC3292y.h(format, "format(...)");
        textView3.setText(format);
        ((TextView) inflate.findViewById(R.id.tv_label_update_version_vd)).setTypeface(aVar.v());
        TextView textView4 = (TextView) inflate.findViewById(R.id.tv_update_version_vd);
        textView4.setTypeface(aVar.u());
        String format2 = String.format("%s(%s)", Arrays.copyOf(new Object[]{q8.x(), Long.valueOf(q8.w())}, 2));
        AbstractC3292y.h(format2, "format(...)");
        textView4.setText(format2);
        ((TextView) inflate.findViewById(R.id.tv_label_packagename_vd)).setTypeface(aVar.v());
        TextView textView5 = (TextView) inflate.findViewById(R.id.tv_packagename_vd);
        textView5.setTypeface(aVar.u());
        textView5.setText(c2041f.Q());
        ((TextView) inflate.findViewById(R.id.tv_label_size_vd)).setTypeface(aVar.v());
        TextView textView6 = (TextView) inflate.findViewById(R.id.tv_size_vd);
        textView6.setTypeface(aVar.u());
        textView6.setText(new S4.g().c(q8.v()));
        ((TextView) inflate.findViewById(R.id.tv_label_filename_vd)).setTypeface(aVar.v());
        TextView textView7 = (TextView) inflate.findViewById(R.id.tv_filename_vd);
        textView7.setTypeface(aVar.u());
        String l8 = q8.l();
        if (l8 != null && l8.length() != 0) {
            textView7.setText(q8.l());
        } else {
            textView7.setText(getString(R.string.version_details_filename_not_found, c2041f.z()));
        }
        TextView textView8 = (TextView) inflate.findViewById(R.id.tv_version_details_accept);
        textView8.setTypeface(aVar.u());
        textView8.setOnClickListener(new View.OnClickListener() { // from class: F4.i2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractActivityC1198w2.J3(AbstractActivityC1198w2.this, view);
            }
        });
        builder.setView(inflate);
        K2(builder.create());
        if (!isFinishing()) {
            AlertDialog o22 = o2();
            AbstractC3292y.f(o22);
            Window window = o22.getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            AlertDialog o23 = o2();
            AbstractC3292y.f(o23);
            o23.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J3(AbstractActivityC1198w2 abstractActivityC1198w2, View view) {
        if (UptodownApp.f29249C.a0()) {
            AlertDialog o22 = abstractActivityC1198w2.o2();
            AbstractC3292y.f(o22);
            o22.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L3(AbstractActivityC1198w2 abstractActivityC1198w2, C2041f c2041f, View view) {
        if (UptodownApp.f29249C.a0()) {
            abstractActivityC1198w2.C2(c2041f.b());
            AlertDialog o22 = abstractActivityC1198w2.o2();
            AbstractC3292y.f(o22);
            abstractActivityC1198w2.b4(o22);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M3(AbstractActivityC1198w2 abstractActivityC1198w2, C2041f c2041f, View view) {
        if (UptodownApp.f29249C.a0()) {
            abstractActivityC1198w2.l4(c2041f);
            AlertDialog o22 = abstractActivityC1198w2.o2();
            AbstractC3292y.f(o22);
            abstractActivityC1198w2.b4(o22);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N3(C2041f c2041f, AbstractActivityC1198w2 abstractActivityC1198w2, View view) {
        if (UptodownApp.f29249C.a0()) {
            String Q8 = c2041f.Q();
            if (Q8 != null && Q8.length() != 0) {
                PackageManager packageManager = abstractActivityC1198w2.getPackageManager();
                String Q9 = c2041f.Q();
                AbstractC3292y.f(Q9);
                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(Q9);
                if (launchIntentForPackage != null) {
                    abstractActivityC1198w2.startActivity(launchIntentForPackage);
                } else {
                    String string = abstractActivityC1198w2.getString(R.string.error_open_app, c2041f.z());
                    AbstractC3292y.h(string, "getString(...)");
                    abstractActivityC1198w2.Z1(string);
                }
            }
            AlertDialog o22 = abstractActivityC1198w2.o2();
            AbstractC3292y.f(o22);
            abstractActivityC1198w2.b4(o22);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O3(C2041f c2041f, AbstractActivityC1198w2 abstractActivityC1198w2, View view) {
        if (UptodownApp.f29249C.a0()) {
            String Q8 = c2041f.Q();
            if (Q8 != null && Q8.length() != 0) {
                J4.i iVar = new J4.i(abstractActivityC1198w2);
                String Q9 = c2041f.Q();
                AbstractC3292y.f(Q9);
                iVar.h(Q9);
            }
            AlertDialog o22 = abstractActivityC1198w2.o2();
            AbstractC3292y.f(o22);
            abstractActivityC1198w2.b4(o22);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P3(AbstractActivityC1198w2 abstractActivityC1198w2, C2041f c2041f, View view) {
        UptodownApp.a aVar = UptodownApp.f29249C;
        if (aVar.a0()) {
            Intent intent = new Intent(abstractActivityC1198w2.getApplicationContext(), (Class<?>) G4.b.class);
            intent.putExtra("AppIndex", c2041f.Q());
            abstractActivityC1198w2.startActivity(intent, aVar.a(abstractActivityC1198w2));
            AlertDialog o22 = abstractActivityC1198w2.o2();
            AbstractC3292y.f(o22);
            abstractActivityC1198w2.b4(o22);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q3(AbstractActivityC1198w2 abstractActivityC1198w2, C2041f c2041f, View view) {
        if (UptodownApp.f29249C.a0()) {
            new X4.r(abstractActivityC1198w2, null, c2041f, abstractActivityC1198w2.f2632p0, LifecycleOwnerKt.getLifecycleScope(abstractActivityC1198w2));
            AlertDialog o22 = abstractActivityC1198w2.o2();
            AbstractC3292y.f(o22);
            abstractActivityC1198w2.b4(o22);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:            if (r0.size() > 0) goto L8;     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0045, code lost:            if (r0.size() > 0) goto L8;     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0047, code lost:            r5 = true;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void R3(F4.AbstractActivityC1198w2 r6, c5.C2041f r7, android.view.View r8) {
        /*
            com.uptodown.UptodownApp$a r8 = com.uptodown.UptodownApp.f29249C
            boolean r8 = r8.a0()
            if (r8 == 0) goto L75
            android.app.AlertDialog r8 = r6.o2()
            kotlin.jvm.internal.AbstractC3292y.f(r8)
            r6.b4(r8)
            r8 = 1
            r6.f2631Z = r8
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.f2626U = r0
            P4.b r0 = new P4.b
            java.lang.String r1 = r7.Q()
            kotlin.jvm.internal.AbstractC3292y.f(r1)
            java.lang.String r2 = r7.z()
            kotlin.jvm.internal.AbstractC3292y.f(r2)
            r0.<init>(r1, r2)
            java.util.ArrayList r1 = r6.f2626U
            r1.add(r0)
            java.util.ArrayList r0 = r7.b0()
            if (r0 == 0) goto L49
            java.util.ArrayList r0 = r7.b0()
            kotlin.jvm.internal.AbstractC3292y.f(r0)
            int r0 = r0.size()
            if (r0 <= 0) goto L49
        L47:
            r5 = 1
            goto L5f
        L49:
            java.util.ArrayList r0 = r7.I()
            if (r0 == 0) goto L5d
            java.util.ArrayList r0 = r7.I()
            kotlin.jvm.internal.AbstractC3292y.f(r0)
            int r0 = r0.size()
            if (r0 <= 0) goto L5d
            goto L47
        L5d:
            r8 = 0
            r5 = 0
        L5f:
            java.lang.String r1 = r7.z()
            kotlin.jvm.internal.AbstractC3292y.f(r1)
            java.lang.String r2 = r7.Q()
            kotlin.jvm.internal.AbstractC3292y.f(r2)
            long r3 = r7.f0()
            r0 = r6
            r0.y(r1, r2, r3, r5)
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: F4.AbstractActivityC1198w2.R3(F4.w2, c5.f, android.view.View):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S3(AbstractActivityC1198w2 abstractActivityC1198w2, C2041f c2041f, View view) {
        abstractActivityC1198w2.m4(c2041f);
        AlertDialog o22 = abstractActivityC1198w2.o2();
        AbstractC3292y.f(o22);
        abstractActivityC1198w2.b4(o22);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T3(AbstractActivityC1198w2 abstractActivityC1198w2, C3791p c3791p, C2041f c2041f, InterfaceC1976E interfaceC1976E, int i8, View view) {
        if (UptodownApp.f29249C.a0()) {
            AlertDialog o22 = abstractActivityC1198w2.o2();
            AbstractC3292y.f(o22);
            abstractActivityC1198w2.b4(o22);
            c3791p.a();
            if (c2041f.i() == 0) {
                c2041f.t0(1);
                c2041f.J0(C2041f.c.f15791b);
                C3794s c3794s = new C3794s();
                Context applicationContext = abstractActivityC1198w2.getApplicationContext();
                AbstractC3292y.h(applicationContext, "getApplicationContext(...)");
                c3794s.c(applicationContext);
            } else {
                c2041f.t0(0);
                c2041f.J0(C2041f.c.f15790a);
            }
            c3791p.h1(c2041f);
            c3791p.i();
            interfaceC1976E.d(i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U3(C3791p c3791p, c5.Q q8, AbstractActivityC1198w2 abstractActivityC1198w2, View view) {
        UptodownApp.a aVar = UptodownApp.f29249C;
        if (aVar.a0()) {
            c3791p.a();
            q8.X(0);
            c3791p.p1(q8);
            c3791p.i();
            aVar.c0(q8.s(), abstractActivityC1198w2);
            C3776a c3776a = new C3776a();
            Context applicationContext = abstractActivityC1198w2.getApplicationContext();
            AbstractC3292y.h(applicationContext, "getApplicationContext(...)");
            c3776a.b(applicationContext, q8.l());
            UptodownApp.a.M0(aVar, abstractActivityC1198w2, false, 2, null);
            AlertDialog o22 = abstractActivityC1198w2.o2();
            AbstractC3292y.f(o22);
            abstractActivityC1198w2.b4(o22);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V3(AbstractActivityC1198w2 abstractActivityC1198w2, C2041f c2041f, c5.Q q8, View view) {
        if (UptodownApp.f29249C.a0()) {
            AlertDialog o22 = abstractActivityC1198w2.o2();
            AbstractC3292y.f(o22);
            abstractActivityC1198w2.b4(o22);
            abstractActivityC1198w2.I3(c2041f, q8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W3(AbstractActivityC1198w2 abstractActivityC1198w2, c5.Q q8, C3791p c3791p, InterfaceC1976E interfaceC1976E, int i8, View view) {
        UptodownApp.a aVar = UptodownApp.f29249C;
        if (aVar.a0()) {
            AlertDialog o22 = abstractActivityC1198w2.o2();
            AbstractC3292y.f(o22);
            abstractActivityC1198w2.b4(o22);
            if (q8.h() == 1) {
                q8.I(0);
            } else {
                q8.I(1);
            }
            c3791p.a();
            c3791p.p1(q8);
            c3791p.i();
            C3776a c3776a = new C3776a();
            Context applicationContext = abstractActivityC1198w2.getApplicationContext();
            AbstractC3292y.h(applicationContext, "getApplicationContext(...)");
            c3776a.b(applicationContext, q8.l());
            interfaceC1976E.d(i8);
            UptodownApp.a.M0(aVar, abstractActivityC1198w2, false, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:            if (r9.size() > 0) goto L8;     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0043, code lost:            if (r9.size() > 0) goto L8;     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0045, code lost:            r6 = true;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void X3(F4.AbstractActivityC1198w2 r7, c5.C2041f r8, android.view.View r9) {
        /*
            com.uptodown.UptodownApp$a r9 = com.uptodown.UptodownApp.f29249C
            boolean r9 = r9.a0()
            if (r9 == 0) goto L73
            android.app.AlertDialog r9 = r7.o2()
            kotlin.jvm.internal.AbstractC3292y.f(r9)
            r7.b4(r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r7.f2626U = r9
            P4.b r9 = new P4.b
            java.lang.String r0 = r8.Q()
            kotlin.jvm.internal.AbstractC3292y.f(r0)
            java.lang.String r1 = r8.z()
            kotlin.jvm.internal.AbstractC3292y.f(r1)
            r9.<init>(r0, r1)
            java.util.ArrayList r0 = r7.f2626U
            r0.add(r9)
            java.util.ArrayList r9 = r8.b0()
            r0 = 1
            if (r9 == 0) goto L47
            java.util.ArrayList r9 = r8.b0()
            kotlin.jvm.internal.AbstractC3292y.f(r9)
            int r9 = r9.size()
            if (r9 <= 0) goto L47
        L45:
            r6 = 1
            goto L5d
        L47:
            java.util.ArrayList r9 = r8.I()
            if (r9 == 0) goto L5b
            java.util.ArrayList r9 = r8.I()
            kotlin.jvm.internal.AbstractC3292y.f(r9)
            int r9 = r9.size()
            if (r9 <= 0) goto L5b
            goto L45
        L5b:
            r0 = 0
            r6 = 0
        L5d:
            java.lang.String r2 = r8.z()
            kotlin.jvm.internal.AbstractC3292y.f(r2)
            java.lang.String r3 = r8.Q()
            kotlin.jvm.internal.AbstractC3292y.f(r3)
            long r4 = r8.f0()
            r1 = r7
            r1.y(r2, r3, r4, r6)
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: F4.AbstractActivityC1198w2.X3(F4.w2, c5.f, android.view.View):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y3(AbstractActivityC1198w2 abstractActivityC1198w2, C2041f c2041f, View view) {
        if (UptodownApp.f29249C.a0()) {
            AlertDialog o22 = abstractActivityC1198w2.o2();
            AbstractC3292y.f(o22);
            abstractActivityC1198w2.b4(o22);
            abstractActivityC1198w2.n4(c2041f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z3(AbstractActivityC1198w2 abstractActivityC1198w2, C2041f c2041f, View view) {
        UptodownApp.a aVar = UptodownApp.f29249C;
        if (aVar.a0()) {
            AlertDialog o22 = abstractActivityC1198w2.o2();
            AbstractC3292y.f(o22);
            abstractActivityC1198w2.b4(o22);
            Intent intent = new Intent(abstractActivityC1198w2, (Class<?>) AppInstalledDetailsActivity.class);
            intent.putExtra("appInstalled", c2041f);
            abstractActivityC1198w2.startActivity(intent, aVar.a(abstractActivityC1198w2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a4(AbstractActivityC1198w2 abstractActivityC1198w2, DialogInterface dialogInterface) {
        abstractActivityC1198w2.f2627V = false;
    }

    private final void b4(AlertDialog alertDialog) {
        alertDialog.dismiss();
        this.f2627V = false;
    }

    private final void d4(C2041f c2041f) {
        UptodownApp.a aVar = UptodownApp.f29249C;
        if (aVar.c(c2041f).size() < 2 && aVar.F().size() < 2) {
            t4();
        }
    }

    private final void n4(C2041f c2041f) {
        if (!isFinishing()) {
            new X4.m(this, null, c2041f.X(), new d(c2041f), LifecycleOwnerKt.getLifecycleScope(this));
        }
    }

    private final void t4() {
        Data build = new Data.Builder().putInt("downloadAutostartedInBackground", 0).putBoolean("downloadAnyway", false).build();
        AbstractC3292y.h(build, "build(...)");
        WorkManager.getInstance(this).enqueue(new OneTimeWorkRequest.Builder(DownloadUpdatesWorker.class).addTag("DownloadUpdatesWorker").setInputData(build).build());
    }

    public final void A3(int i8, boolean z8, Toolbar toolbar) {
        AbstractC3292y.i(toolbar, "toolbar");
        if (toolbar.getMenu() != null) {
            Menu menu = toolbar.getMenu();
            AbstractC3292y.f(menu);
            menu.findItem(i8).setChecked(z8);
        }
    }

    public final void K3(final C2041f c2041f, final int i8, final InterfaceC1976E listener) {
        C1533x c1533x;
        Window window;
        String str;
        NsdServiceInfo e8;
        String x8;
        AbstractC3292y.i(listener, "listener");
        if (!isFinishing() && c2041f != null) {
            C1533x c8 = C1533x.c(getLayoutInflater());
            this.f2628W = c8;
            if (c8 == null) {
                AbstractC3292y.y("dialogBinding");
                c8 = null;
            }
            TextView textView = c8.f13067l;
            j.a aVar = J4.j.f4395g;
            textView.setTypeface(aVar.u());
            C1533x c1533x2 = this.f2628W;
            if (c1533x2 == null) {
                AbstractC3292y.y("dialogBinding");
                c1533x2 = null;
            }
            c1533x2.f13067l.setText(c2041f.z());
            String Q8 = c2041f.Q();
            if (Q8 != null && Q8.length() != 0 && (x8 = c2041f.x()) != null && x8.length() != 0 && c2041f.b() != 0) {
                C1533x c1533x3 = this.f2628W;
                if (c1533x3 == null) {
                    AbstractC3292y.y("dialogBinding");
                    c1533x3 = null;
                }
                c1533x3.f13065j.setTypeface(aVar.v());
                C1533x c1533x4 = this.f2628W;
                if (c1533x4 == null) {
                    AbstractC3292y.y("dialogBinding");
                    c1533x4 = null;
                }
                c1533x4.f13065j.setOnClickListener(new View.OnClickListener() { // from class: F4.b2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        AbstractActivityC1198w2.L3(AbstractActivityC1198w2.this, c2041f, view);
                    }
                });
            } else {
                C1533x c1533x5 = this.f2628W;
                if (c1533x5 == null) {
                    AbstractC3292y.y("dialogBinding");
                    c1533x5 = null;
                }
                c1533x5.f13065j.setVisibility(8);
            }
            C3791p.a aVar2 = C3791p.f37286s;
            Context applicationContext = getApplicationContext();
            AbstractC3292y.h(applicationContext, "getApplicationContext(...)");
            final C3791p a9 = aVar2.a(applicationContext);
            a9.a();
            String Q9 = c2041f.Q();
            AbstractC3292y.f(Q9);
            final c5.Q s02 = a9.s0(Q9);
            a9.i();
            if (s02 != null) {
                C1533x c1533x6 = this.f2628W;
                if (c1533x6 == null) {
                    AbstractC3292y.y("dialogBinding");
                    c1533x6 = null;
                }
                c1533x6.f13069n.setTypeface(aVar.v());
                if (s02.a()) {
                    C1533x c1533x7 = this.f2628W;
                    if (c1533x7 == null) {
                        AbstractC3292y.y("dialogBinding");
                        c1533x7 = null;
                    }
                    c1533x7.f13069n.setText(getString(R.string.action_cancel_download));
                } else if (s02.u() == 100) {
                    C1533x c1533x8 = this.f2628W;
                    if (c1533x8 == null) {
                        AbstractC3292y.y("dialogBinding");
                        c1533x8 = null;
                    }
                    c1533x8.f13069n.setText(getString(R.string.notification_msg_update_uptodown));
                } else if (s02.u() > 0) {
                    C1533x c1533x9 = this.f2628W;
                    if (c1533x9 == null) {
                        AbstractC3292y.y("dialogBinding");
                        c1533x9 = null;
                    }
                    c1533x9.f13069n.setText(getString(R.string.updates_button_resume));
                } else {
                    C1533x c1533x10 = this.f2628W;
                    if (c1533x10 == null) {
                        AbstractC3292y.y("dialogBinding");
                        c1533x10 = null;
                    }
                    c1533x10.f13069n.setText(getString(R.string.action_update));
                }
                C1533x c1533x11 = this.f2628W;
                if (c1533x11 == null) {
                    AbstractC3292y.y("dialogBinding");
                    c1533x11 = null;
                }
                c1533x11.f13069n.setOnClickListener(new View.OnClickListener() { // from class: F4.t2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        AbstractActivityC1198w2.M3(AbstractActivityC1198w2.this, c2041f, view);
                    }
                });
            } else {
                C1533x c1533x12 = this.f2628W;
                if (c1533x12 == null) {
                    AbstractC3292y.y("dialogBinding");
                    c1533x12 = null;
                }
                c1533x12.f13069n.setVisibility(8);
            }
            if (!l6.n.s(getPackageName(), c2041f.Q(), true)) {
                C1533x c1533x13 = this.f2628W;
                if (c1533x13 == null) {
                    AbstractC3292y.y("dialogBinding");
                    c1533x13 = null;
                }
                c1533x13.f13064i.setTypeface(aVar.v());
                C1533x c1533x14 = this.f2628W;
                if (c1533x14 == null) {
                    AbstractC3292y.y("dialogBinding");
                    c1533x14 = null;
                }
                c1533x14.f13064i.setOnClickListener(new View.OnClickListener() { // from class: F4.u2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        AbstractActivityC1198w2.N3(C2041f.this, this, view);
                    }
                });
                C1533x c1533x15 = this.f2628W;
                if (c1533x15 == null) {
                    AbstractC3292y.y("dialogBinding");
                    c1533x15 = null;
                }
                c1533x15.f13068m.setTypeface(aVar.v());
                C1533x c1533x16 = this.f2628W;
                if (c1533x16 == null) {
                    AbstractC3292y.y("dialogBinding");
                    c1533x16 = null;
                }
                c1533x16.f13068m.setOnClickListener(new View.OnClickListener() { // from class: F4.v2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        AbstractActivityC1198w2.O3(C2041f.this, this, view);
                    }
                });
            } else {
                C1533x c1533x17 = this.f2628W;
                if (c1533x17 == null) {
                    AbstractC3292y.y("dialogBinding");
                    c1533x17 = null;
                }
                c1533x17.f13064i.setVisibility(8);
                C1533x c1533x18 = this.f2628W;
                if (c1533x18 == null) {
                    AbstractC3292y.y("dialogBinding");
                    c1533x18 = null;
                }
                c1533x18.f13068m.setVisibility(8);
            }
            if (UptodownApp.f29249C.M()) {
                C1533x c1533x19 = this.f2628W;
                if (c1533x19 == null) {
                    AbstractC3292y.y("dialogBinding");
                    c1533x19 = null;
                }
                c1533x19.f13064i.setText(R.string.debug_title_info_app);
                C1533x c1533x20 = this.f2628W;
                if (c1533x20 == null) {
                    AbstractC3292y.y("dialogBinding");
                    c1533x20 = null;
                }
                c1533x20.f13064i.setOnClickListener(new View.OnClickListener() { // from class: F4.c2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        AbstractActivityC1198w2.P3(AbstractActivityC1198w2.this, c2041f, view);
                    }
                });
                C1533x c1533x21 = this.f2628W;
                if (c1533x21 == null) {
                    AbstractC3292y.y("dialogBinding");
                    c1533x21 = null;
                }
                c1533x21.f13064i.setVisibility(0);
            }
            String e02 = c2041f.e0();
            if (e02 != null && e02.length() != 0) {
                C1533x c1533x22 = this.f2628W;
                if (c1533x22 == null) {
                    AbstractC3292y.y("dialogBinding");
                    c1533x22 = null;
                }
                c1533x22.f13066k.setTypeface(aVar.v());
                C1533x c1533x23 = this.f2628W;
                if (c1533x23 == null) {
                    AbstractC3292y.y("dialogBinding");
                    c1533x23 = null;
                }
                c1533x23.f13066k.setOnClickListener(new View.OnClickListener() { // from class: F4.d2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        AbstractActivityC1198w2.Q3(AbstractActivityC1198w2.this, c2041f, view);
                    }
                });
            } else {
                C1533x c1533x24 = this.f2628W;
                if (c1533x24 == null) {
                    AbstractC3292y.y("dialogBinding");
                    c1533x24 = null;
                }
                c1533x24.f13066k.setVisibility(8);
            }
            C1533x c1533x25 = this.f2628W;
            if (c1533x25 == null) {
                AbstractC3292y.y("dialogBinding");
                c1533x25 = null;
            }
            c1533x25.f13062g.setTypeface(aVar.v());
            C1533x c1533x26 = this.f2628W;
            if (c1533x26 == null) {
                AbstractC3292y.y("dialogBinding");
                c1533x26 = null;
            }
            c1533x26.f13062g.setOnClickListener(new View.OnClickListener() { // from class: F4.e2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractActivityC1198w2.R3(AbstractActivityC1198w2.this, c2041f, view);
                }
            });
            Q4.c p8 = aVar.p();
            if (p8 != null && p8.j()) {
                Q4.h m8 = aVar.m();
                if (m8 != null && (e8 = m8.e()) != null) {
                    str = e8.getServiceName();
                } else {
                    str = null;
                }
                if (str != null) {
                    C1533x c1533x27 = this.f2628W;
                    if (c1533x27 == null) {
                        AbstractC3292y.y("dialogBinding");
                        c1533x27 = null;
                    }
                    TextView textView2 = c1533x27.f13062g;
                    kotlin.jvm.internal.Y y8 = kotlin.jvm.internal.Y.f34578a;
                    String format = String.format("%s%s", Arrays.copyOf(new Object[]{getString(R.string.nsd_option_send_to), Q4.h.f8759h.c(str)}, 2));
                    AbstractC3292y.h(format, "format(...)");
                    textView2.setText(format);
                } else {
                    C1533x c1533x28 = this.f2628W;
                    if (c1533x28 == null) {
                        AbstractC3292y.y("dialogBinding");
                        c1533x28 = null;
                    }
                    c1533x28.f13062g.setVisibility(8);
                }
            }
            if (c2041f.s() == 1 && c2041f.b() != 0) {
                C1533x c1533x29 = this.f2628W;
                if (c1533x29 == null) {
                    AbstractC3292y.y("dialogBinding");
                    c1533x29 = null;
                }
                c1533x29.f13063h.setTypeface(aVar.v());
                C1533x c1533x30 = this.f2628W;
                if (c1533x30 == null) {
                    AbstractC3292y.y("dialogBinding");
                    c1533x30 = null;
                }
                c1533x30.f13063h.setOnClickListener(new View.OnClickListener() { // from class: F4.f2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        AbstractActivityC1198w2.S3(AbstractActivityC1198w2.this, c2041f, view);
                    }
                });
            } else {
                C1533x c1533x31 = this.f2628W;
                if (c1533x31 == null) {
                    AbstractC3292y.y("dialogBinding");
                    c1533x31 = null;
                }
                c1533x31.f13063h.setVisibility(8);
            }
            C1533x c1533x32 = this.f2628W;
            if (c1533x32 == null) {
                AbstractC3292y.y("dialogBinding");
                c1533x32 = null;
            }
            c1533x32.f13060e.setTypeface(aVar.v());
            if (c2041f.i() == 0) {
                C1533x c1533x33 = this.f2628W;
                if (c1533x33 == null) {
                    AbstractC3292y.y("dialogBinding");
                    c1533x33 = null;
                }
                c1533x33.f13060e.setText(getString(R.string.not_offer_updates));
            } else {
                C1533x c1533x34 = this.f2628W;
                if (c1533x34 == null) {
                    AbstractC3292y.y("dialogBinding");
                    c1533x34 = null;
                }
                c1533x34.f13060e.setText(getString(R.string.offer_updates_again));
            }
            C1533x c1533x35 = this.f2628W;
            if (c1533x35 == null) {
                AbstractC3292y.y("dialogBinding");
                c1533x35 = null;
            }
            c1533x35.f13060e.setOnClickListener(new View.OnClickListener() { // from class: F4.g2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractActivityC1198w2.T3(AbstractActivityC1198w2.this, a9, c2041f, listener, i8, view);
                }
            });
            if (s02 != null && c2041f.c0() == C2041f.c.f15790a && c2041f.i() == 0) {
                C1533x c1533x36 = this.f2628W;
                if (c1533x36 == null) {
                    AbstractC3292y.y("dialogBinding");
                    c1533x36 = null;
                }
                c1533x36.f13059d.setTypeface(aVar.v());
                C1533x c1533x37 = this.f2628W;
                if (c1533x37 == null) {
                    AbstractC3292y.y("dialogBinding");
                    c1533x37 = null;
                }
                c1533x37.f13059d.setOnClickListener(new View.OnClickListener() { // from class: F4.h2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        AbstractActivityC1198w2.U3(C3791p.this, s02, this, view);
                    }
                });
                C1533x c1533x38 = this.f2628W;
                if (c1533x38 == null) {
                    AbstractC3292y.y("dialogBinding");
                    c1533x38 = null;
                }
                c1533x38.f13070o.setTypeface(aVar.v());
                C1533x c1533x39 = this.f2628W;
                if (c1533x39 == null) {
                    AbstractC3292y.y("dialogBinding");
                    c1533x39 = null;
                }
                c1533x39.f13070o.setOnClickListener(new View.OnClickListener() { // from class: F4.m2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        AbstractActivityC1198w2.V3(AbstractActivityC1198w2.this, c2041f, s02, view);
                    }
                });
            } else {
                C1533x c1533x40 = this.f2628W;
                if (c1533x40 == null) {
                    AbstractC3292y.y("dialogBinding");
                    c1533x40 = null;
                }
                c1533x40.f13059d.setVisibility(8);
                C1533x c1533x41 = this.f2628W;
                if (c1533x41 == null) {
                    AbstractC3292y.y("dialogBinding");
                    c1533x41 = null;
                }
                c1533x41.f13070o.setVisibility(8);
            }
            if (s02 != null) {
                C1533x c1533x42 = this.f2628W;
                if (c1533x42 == null) {
                    AbstractC3292y.y("dialogBinding");
                    c1533x42 = null;
                }
                c1533x42.f13061f.setVisibility(0);
                C1533x c1533x43 = this.f2628W;
                if (c1533x43 == null) {
                    AbstractC3292y.y("dialogBinding");
                    c1533x43 = null;
                }
                c1533x43.f13061f.setTypeface(aVar.v());
                if (s02.h() == 1) {
                    C1533x c1533x44 = this.f2628W;
                    if (c1533x44 == null) {
                        AbstractC3292y.y("dialogBinding");
                        c1533x44 = null;
                    }
                    c1533x44.f13061f.setText(R.string.reactivate_skipped_update);
                } else {
                    C1533x c1533x45 = this.f2628W;
                    if (c1533x45 == null) {
                        AbstractC3292y.y("dialogBinding");
                        c1533x45 = null;
                    }
                    c1533x45.f13061f.setText(R.string.skip_update);
                }
                C1533x c1533x46 = this.f2628W;
                if (c1533x46 == null) {
                    AbstractC3292y.y("dialogBinding");
                    c1533x46 = null;
                }
                c1533x46.f13061f.setOnClickListener(new View.OnClickListener() { // from class: F4.o2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        AbstractActivityC1198w2.W3(AbstractActivityC1198w2.this, s02, a9, listener, i8, view);
                    }
                });
            } else {
                C1533x c1533x47 = this.f2628W;
                if (c1533x47 == null) {
                    AbstractC3292y.y("dialogBinding");
                    c1533x47 = null;
                }
                c1533x47.f13061f.setVisibility(8);
            }
            if (c2041f.Q() != null) {
                C1533x c1533x48 = this.f2628W;
                if (c1533x48 == null) {
                    AbstractC3292y.y("dialogBinding");
                    c1533x48 = null;
                }
                c1533x48.f13058c.setVisibility(0);
                C1533x c1533x49 = this.f2628W;
                if (c1533x49 == null) {
                    AbstractC3292y.y("dialogBinding");
                    c1533x49 = null;
                }
                c1533x49.f13058c.setTypeface(aVar.v());
                C1533x c1533x50 = this.f2628W;
                if (c1533x50 == null) {
                    AbstractC3292y.y("dialogBinding");
                    c1533x50 = null;
                }
                c1533x50.f13058c.setOnClickListener(new View.OnClickListener() { // from class: F4.p2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        AbstractActivityC1198w2.X3(AbstractActivityC1198w2.this, c2041f, view);
                    }
                });
            }
            if (c2041f.X() != null) {
                C1533x c1533x51 = this.f2628W;
                if (c1533x51 == null) {
                    AbstractC3292y.y("dialogBinding");
                    c1533x51 = null;
                }
                c1533x51.f13071p.setVisibility(0);
                C1533x c1533x52 = this.f2628W;
                if (c1533x52 == null) {
                    AbstractC3292y.y("dialogBinding");
                    c1533x52 = null;
                }
                c1533x52.f13071p.setTypeface(aVar.v());
                C1533x c1533x53 = this.f2628W;
                if (c1533x53 == null) {
                    AbstractC3292y.y("dialogBinding");
                    c1533x53 = null;
                }
                c1533x53.f13071p.setOnClickListener(new View.OnClickListener() { // from class: F4.q2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        AbstractActivityC1198w2.Y3(AbstractActivityC1198w2.this, c2041f, view);
                    }
                });
            }
            C1533x c1533x54 = this.f2628W;
            if (c1533x54 == null) {
                AbstractC3292y.y("dialogBinding");
                c1533x54 = null;
            }
            c1533x54.f13057b.setTypeface(aVar.v());
            C1533x c1533x55 = this.f2628W;
            if (c1533x55 == null) {
                AbstractC3292y.y("dialogBinding");
                c1533x55 = null;
            }
            c1533x55.f13057b.setOnClickListener(new View.OnClickListener() { // from class: F4.r2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractActivityC1198w2.Z3(AbstractActivityC1198w2.this, c2041f, view);
                }
            });
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            C1533x c1533x56 = this.f2628W;
            if (c1533x56 == null) {
                AbstractC3292y.y("dialogBinding");
                c1533x = null;
            } else {
                c1533x = c1533x56;
            }
            builder.setView(c1533x.getRoot());
            K2(builder.create());
            AlertDialog o22 = o2();
            if (o22 != null) {
                o22.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: F4.s2
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        AbstractActivityC1198w2.a4(AbstractActivityC1198w2.this, dialogInterface);
                    }
                });
                Q5.I i9 = Q5.I.f8786a;
            }
            if (!isFinishing()) {
                AlertDialog o23 = o2();
                if (o23 != null && (window = o23.getWindow()) != null) {
                    window.setBackgroundDrawable(new ColorDrawable(0));
                    Q5.I i10 = Q5.I.f8786a;
                }
                AlertDialog o24 = o2();
                if (o24 != null) {
                    o24.show();
                    Q5.I i11 = Q5.I.f8786a;
                }
                this.f2627V = true;
            }
        }
    }

    @Override // K4.r
    public void V() {
        this.f2625T = new N4.a(this, new b()).t(this.f2626U);
        this.f2626U = new ArrayList();
    }

    @Override // K4.a1
    public void W0() {
        File file;
        super.W0();
        Q4.h m8 = J4.j.f4395g.m();
        AbstractC3292y.f(m8);
        if (m8.e() != null && (file = this.f2630Y) != null) {
            AbstractC3292y.f(file);
            if (!file.isDirectory()) {
                UptodownApp uptodownApp = new UptodownApp();
                File file2 = this.f2630Y;
                AbstractC3292y.f(file2);
                uptodownApp.T(file2);
            }
        }
    }

    public final void c4(int i8, boolean z8, Toolbar toolbar) {
        AbstractC3292y.i(toolbar, "toolbar");
        if (toolbar.getMenu() != null) {
            Menu menu = toolbar.getMenu();
            AbstractC3292y.f(menu);
            menu.findItem(i8).setEnabled(z8);
        }
    }

    public final HashMap e4() {
        return this.f2629X;
    }

    public final File f4() {
        return this.f2630Y;
    }

    public final boolean g4() {
        return this.f2624S;
    }

    public final boolean h4() {
        return this.f2631Z;
    }

    public final boolean i4() {
        return this.f2627V;
    }

    public final void j4() {
        if (!this.f2623R) {
            this.f2623R = true;
            B3();
        }
    }

    public final void k4(C2041f c2041f) {
        String str;
        String str2 = null;
        if (c2041f != null) {
            str = c2041f.Q();
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            UptodownApp.a aVar = UptodownApp.f29249C;
            if (c2041f != null) {
                str2 = c2041f.Q();
            }
            AbstractC3292y.f(str2);
            aVar.c0(str2, this);
            C3791p a9 = C3791p.f37286s.a(this);
            a9.a();
            String Q8 = c2041f.Q();
            AbstractC3292y.f(Q8);
            c5.r a02 = a9.a0(Q8);
            a9.i();
            if (a02 != null) {
                DownloadApkWorker.a aVar2 = DownloadApkWorker.f31190k;
                if (aVar2.d(c2041f.b(), a02.e0()) || a02.h0()) {
                    aVar2.a(c2041f.b());
                    new C3776a().a(this, a02.X());
                    a02.n0(this);
                }
            }
        }
    }

    public final void l4(C2041f c2041f) {
        String str;
        c5.r rVar;
        String str2 = null;
        if (c2041f != null) {
            str = c2041f.Q();
        } else {
            str = null;
        }
        if (str != null) {
            C3791p.a aVar = C3791p.f37286s;
            Context applicationContext = getApplicationContext();
            AbstractC3292y.h(applicationContext, "getApplicationContext(...)");
            C3791p a9 = aVar.a(applicationContext);
            a9.a();
            String Q8 = c2041f.Q();
            AbstractC3292y.f(Q8);
            c5.Q s02 = a9.s0(Q8);
            if (s02 != null) {
                String Q9 = c2041f.Q();
                AbstractC3292y.f(Q9);
                rVar = a9.b0(Q9, s02.w());
            } else {
                rVar = null;
            }
            if (s02 != null && s02.a()) {
                UptodownApp.a aVar2 = UptodownApp.f29249C;
                if (aVar2.O(this)) {
                    C3776a c3776a = new C3776a();
                    Context applicationContext2 = getApplicationContext();
                    AbstractC3292y.h(applicationContext2, "getApplicationContext(...)");
                    if (!c3776a.b(applicationContext2, s02.l())) {
                        aVar2.c0(s02.s(), this);
                    } else {
                        s02.X(0);
                        a9.p1(s02);
                        DownloadUpdatesWorker.a aVar3 = DownloadUpdatesWorker.f31198k;
                        String Q10 = c2041f.Q();
                        AbstractC3292y.f(Q10);
                        aVar3.a(Q10);
                    }
                } else {
                    u4(c2041f.Q(), false);
                }
            } else {
                if (s02 != null) {
                    str2 = s02.l();
                }
                if (str2 != null) {
                    if (rVar != null) {
                        DownloadApkWorker.a aVar4 = DownloadApkWorker.f31190k;
                        if (!aVar4.d(c2041f.b(), rVar.e0()) && !rVar.h0()) {
                            C3794s c3794s = new C3794s();
                            Context applicationContext3 = getApplicationContext();
                            AbstractC3292y.h(applicationContext3, "getApplicationContext(...)");
                            UptodownApp.f29249C.Y(new File(c3794s.f(applicationContext3), rVar.X()), this, c2041f.g0());
                        } else {
                            aVar4.a(c2041f.b());
                            new C3776a().a(this, rVar.X());
                            rVar.n0(this);
                        }
                    } else {
                        C3794s c3794s2 = new C3794s();
                        Context applicationContext4 = getApplicationContext();
                        AbstractC3292y.h(applicationContext4, "getApplicationContext(...)");
                        File g8 = c3794s2.g(applicationContext4);
                        String l8 = s02.l();
                        AbstractC3292y.f(l8);
                        File file = new File(g8, l8);
                        if (file.exists() && s02.u() == 100) {
                            if (l6.n.s(s02.s(), getApplicationContext().getPackageName(), true)) {
                                X1(file);
                            } else {
                                UptodownApp.f29249C.Y(file, this, c2041f.g0());
                            }
                        } else {
                            UptodownApp.a aVar5 = UptodownApp.f29249C;
                            if (!aVar5.O(this)) {
                                u4(c2041f.Q(), false);
                            } else {
                                String Q11 = c2041f.Q();
                                AbstractC3292y.f(Q11);
                                if (aVar5.R(Q11)) {
                                    String Q12 = c2041f.Q();
                                    AbstractC3292y.f(Q12);
                                    aVar5.c0(Q12, this);
                                } else {
                                    d4(c2041f);
                                }
                            }
                        }
                    }
                } else if (rVar != null) {
                    DownloadApkWorker.a aVar6 = DownloadApkWorker.f31190k;
                    if (!aVar6.d(c2041f.b(), rVar.e0()) && !rVar.h0()) {
                        C3794s c3794s3 = new C3794s();
                        Context applicationContext5 = getApplicationContext();
                        AbstractC3292y.h(applicationContext5, "getApplicationContext(...)");
                        UptodownApp.f29249C.Y(new File(c3794s3.f(applicationContext5), rVar.X()), this, c2041f.g0());
                    } else {
                        aVar6.a(c2041f.b());
                        new C3776a().a(this, rVar.X());
                        rVar.n0(this);
                    }
                } else if (!UptodownApp.f29249C.O(this)) {
                    u4(c2041f.Q(), false);
                } else {
                    d4(c2041f);
                }
            }
            a9.i();
        }
    }

    public final void m4(C2041f app) {
        AbstractC3292y.i(app, "app");
        new X4.i(this, app.b(), new c(app), LifecycleOwnerKt.getLifecycleScope(this));
    }

    protected abstract void o4();

    public final void p4(HashMap hashMap) {
        this.f2629X = hashMap;
    }

    public final void q4(File file) {
        this.f2630Y = file;
    }

    public final void r4(boolean z8) {
        this.f2631Z = z8;
    }

    public final void s4(boolean z8) {
        this.f2624S = z8;
    }

    public final void u4(String str, boolean z8) {
        UptodownApp.a aVar = UptodownApp.f29249C;
        if (!aVar.W("GenerateQueueWorker", this) && !aVar.W("downloadApkWorker", this)) {
            boolean z9 = true;
            this.f2624S = true;
            if (str != null && str.length() != 0) {
                z9 = false;
            }
            aVar.t0(z9);
            Data build = new Data.Builder().putInt("downloadAutostartedInBackground", 0).putBoolean("downloadAnyway", z8).putString("packagename", str).build();
            AbstractC3292y.h(build, "build(...)");
            AbstractC3292y.f(WorkManager.getInstance(this).enqueue(new OneTimeWorkRequest.Builder(GenerateQueueWorker.class).addTag("GenerateQueueWorker").setInputData(build).build()));
            return;
        }
        String string = getString(R.string.error_download_in_progress_wait);
        AbstractC3292y.h(string, "getString(...)");
        Z1(string);
    }

    public final void v4(int i8) {
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new f(i8, this, null), 2, null);
    }

    /* renamed from: F4.w2$b */
    /* loaded from: classes4.dex */
    public static final class b implements O4.b {
        b() {
        }

        @Override // O4.b
        public void a(P4.b app, int i8) {
            AbstractC3292y.i(app, "app");
            AbstractActivityC1198w2.this.C3(app.b(), i8);
        }

        @Override // O4.b
        public void b(P4.b app) {
            AbstractC3292y.i(app, "app");
            AbstractActivityC1198w2 abstractActivityC1198w2 = AbstractActivityC1198w2.this;
            abstractActivityC1198w2.F(abstractActivityC1198w2.getString(R.string.core_msg_cannot_write_path));
        }

        @Override // O4.b
        public void c(ArrayList apps) {
            AbstractC3292y.i(apps, "apps");
            NsdServiceInfo nsdServiceInfo = null;
            if (apps.size() == 1) {
                if (!AbstractActivityC1198w2.this.h4()) {
                    AbstractActivityC1198w2.this.E3(((P4.b) apps.get(0)).b(), ((P4.b) apps.get(0)).a());
                    return;
                }
                AlertDialog o22 = AbstractActivityC1198w2.this.o2();
                if (o22 != null) {
                    o22.dismiss();
                }
                AbstractActivityC1198w2.this.r4(false);
                Object b9 = new L4.a(AbstractActivityC1198w2.this).b();
                if (b9 instanceof File) {
                    AbstractActivityC1198w2 abstractActivityC1198w2 = AbstractActivityC1198w2.this;
                    String a9 = ((P4.b) apps.get(0)).a();
                    AbstractC3292y.f(a9);
                    abstractActivityC1198w2.q4(new File((File) b9, a9));
                    Q4.h m8 = J4.j.f4395g.m();
                    if (m8 != null) {
                        nsdServiceInfo = m8.e();
                    }
                    if (nsdServiceInfo == null) {
                        AbstractActivityC1198w2.this.O0();
                        return;
                    }
                    File f42 = AbstractActivityC1198w2.this.f4();
                    if (f42 != null && f42.exists()) {
                        File f43 = AbstractActivityC1198w2.this.f4();
                        AbstractC3292y.f(f43);
                        if (!f43.isDirectory()) {
                            UptodownApp uptodownApp = new UptodownApp();
                            File f44 = AbstractActivityC1198w2.this.f4();
                            AbstractC3292y.f(f44);
                            uptodownApp.T(f44);
                            return;
                        }
                    }
                    AbstractActivityC1198w2 abstractActivityC1198w22 = AbstractActivityC1198w2.this;
                    abstractActivityC1198w22.F(abstractActivityC1198w22.getString(R.string.error_generico));
                    return;
                }
                if (b9 instanceof DocumentFile) {
                    String a10 = ((P4.b) apps.get(0)).a();
                    AbstractC3292y.f(a10);
                    DocumentFile findFile = ((DocumentFile) b9).findFile(a10);
                    if (findFile != null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(findFile);
                        new N4.b(arrayList, new S4.f().g(AbstractActivityC1198w2.this), new a(AbstractActivityC1198w2.this, apps), false, AbstractActivityC1198w2.this);
                        return;
                    }
                    return;
                }
                return;
            }
            if (apps.size() > 0) {
                kotlin.jvm.internal.Y y8 = kotlin.jvm.internal.Y.f34578a;
                String string = AbstractActivityC1198w2.this.getString(R.string.msg_backup_x_apps);
                AbstractC3292y.h(string, "getString(...)");
                String format = String.format(string, Arrays.copyOf(new Object[]{String.valueOf(apps.size())}, 1));
                AbstractC3292y.h(format, "format(...)");
                AbstractActivityC1198w2.this.E3(format, null);
            }
        }

        @Override // O4.b
        public void d(P4.b app) {
            AbstractC3292y.i(app, "app");
            AbstractActivityC1198w2 abstractActivityC1198w2 = AbstractActivityC1198w2.this;
            abstractActivityC1198w2.F(abstractActivityC1198w2.getString(R.string.core_msg_cannot_write_path));
        }

        @Override // O4.b
        public void e(String appName) {
            AbstractC3292y.i(appName, "appName");
            TextView textView = AbstractActivityC1198w2.this.f2621P;
            if (textView != null) {
                textView.setText(appName);
            }
            TextView textView2 = AbstractActivityC1198w2.this.f2622Q;
            if (textView2 != null) {
                kotlin.jvm.internal.Y y8 = kotlin.jvm.internal.Y.f34578a;
                String format = String.format(Locale.getDefault(), "%d%%", Arrays.copyOf(new Object[]{0}, 1));
                AbstractC3292y.h(format, "format(...)");
                textView2.setText(format);
            }
            ProgressBar progressBar = AbstractActivityC1198w2.this.f2620O;
            if (progressBar != null) {
                progressBar.setProgress(0);
            }
        }

        @Override // O4.b
        public void f(P4.b app) {
            AbstractC3292y.i(app, "app");
            AbstractActivityC1198w2 abstractActivityC1198w2 = AbstractActivityC1198w2.this;
            abstractActivityC1198w2.F(abstractActivityC1198w2.getString(R.string.backup_no_free_space));
        }

        @Override // O4.b
        public void g(int i8) {
            TextView textView = AbstractActivityC1198w2.this.f2622Q;
            if (textView != null) {
                kotlin.jvm.internal.Y y8 = kotlin.jvm.internal.Y.f34578a;
                String format = String.format(Locale.getDefault(), "%d%%", Arrays.copyOf(new Object[]{Integer.valueOf(i8)}, 1));
                AbstractC3292y.h(format, "format(...)");
                textView.setText(format);
            }
            ProgressBar progressBar = AbstractActivityC1198w2.this.f2620O;
            if (progressBar != null) {
                progressBar.setProgress(i8);
            }
        }

        /* renamed from: F4.w2$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements O4.d {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractActivityC1198w2 f2635a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ArrayList f2636b;

            a(AbstractActivityC1198w2 abstractActivityC1198w2, ArrayList arrayList) {
                this.f2635a = abstractActivityC1198w2;
                this.f2636b = arrayList;
            }

            @Override // O4.d
            public void a(DocumentFile docFile) {
                AbstractC3292y.i(docFile, "docFile");
            }

            @Override // O4.d
            public void c(File file) {
                AbstractC3292y.i(file, "file");
            }

            @Override // O4.d
            public void d(DocumentFile docFile) {
                AbstractC3292y.i(docFile, "docFile");
            }

            @Override // O4.d
            public void e(File file) {
                AbstractC3292y.i(file, "file");
            }

            @Override // O4.d
            public void f(Object file, int i8) {
                AbstractC3292y.i(file, "file");
            }

            @Override // O4.d
            public void h(Object file) {
                AbstractC3292y.i(file, "file");
            }

            @Override // O4.d
            public void i() {
                NsdServiceInfo nsdServiceInfo;
                AbstractActivityC1198w2 abstractActivityC1198w2 = this.f2635a;
                File g8 = new S4.f().g(this.f2635a);
                String a9 = ((P4.b) this.f2636b.get(0)).a();
                AbstractC3292y.f(a9);
                abstractActivityC1198w2.q4(new File(g8, a9));
                Q4.h m8 = J4.j.f4395g.m();
                if (m8 != null) {
                    nsdServiceInfo = m8.e();
                } else {
                    nsdServiceInfo = null;
                }
                if (nsdServiceInfo == null) {
                    this.f2635a.O0();
                    return;
                }
                File f42 = this.f2635a.f4();
                if (f42 != null && f42.exists()) {
                    File f43 = this.f2635a.f4();
                    AbstractC3292y.f(f43);
                    if (!f43.isDirectory()) {
                        UptodownApp uptodownApp = new UptodownApp();
                        File f44 = this.f2635a.f4();
                        AbstractC3292y.f(f44);
                        uptodownApp.T(f44);
                        return;
                    }
                }
                AbstractActivityC1198w2 abstractActivityC1198w22 = this.f2635a;
                abstractActivityC1198w22.F(abstractActivityC1198w22.getString(R.string.error_generico));
            }

            @Override // O4.d
            public void g() {
            }

            @Override // O4.d
            public void b(int i8) {
            }
        }
    }
}
