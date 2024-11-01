package com.uptodown.workers;

import J4.j;
import S4.h;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import c5.C2037b;
import c5.C2041f;
import c5.C2047l;
import c5.Q;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.uptodown.UptodownApp;
import com.uptodown.activities.Updates;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.workers.DownloadWorker;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.S;
import l6.n;
import q5.C3770C;
import q5.C3776a;
import q5.C3788m;
import q5.C3791p;
import q5.C3794s;
import q5.C3795t;
import q5.C3796u;
import q5.C3797v;
import q5.C3800y;

/* loaded from: classes5.dex */
public final class DownloadUpdatesWorker extends DownloadWorker {

    /* renamed from: k, reason: collision with root package name */
    public static final a f31198k = new a(null);

    /* renamed from: l, reason: collision with root package name */
    private static String f31199l;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f31200i;

    /* renamed from: j, reason: collision with root package name */
    private final int f31201j;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final void a(String packagename) {
            AbstractC3292y.i(packagename, "packagename");
            DownloadUpdatesWorker.f31199l = packagename;
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    public static final class b implements DownloadWorker.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ O f31202a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ S f31203b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ S f31204c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ DownloadUpdatesWorker f31205d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Q f31206e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f31207f;

        b(O o8, S s8, S s9, DownloadUpdatesWorker downloadUpdatesWorker, Q q8, String str) {
            this.f31202a = o8;
            this.f31203b = s8;
            this.f31204c = s9;
            this.f31205d = downloadUpdatesWorker;
            this.f31206e = q8;
            this.f31207f = str;
        }

        @Override // com.uptodown.workers.DownloadWorker.b
        public void a(int i8, long j8) {
            this.f31206e.X(i8);
            C3791p.a aVar = C3791p.f37286s;
            Context applicationContext = this.f31205d.getApplicationContext();
            AbstractC3292y.h(applicationContext, "getApplicationContext(...)");
            C3791p a9 = aVar.a(applicationContext);
            a9.a();
            a9.p1(this.f31206e);
            a9.i();
            if (i8 > 0) {
                Bundle bundle = new Bundle();
                bundle.putString("packagename", this.f31206e.s());
                C3770C.f37260a.f().send(101, bundle);
            }
        }

        @Override // com.uptodown.workers.DownloadWorker.b
        public void b(long j8) {
            this.f31203b.f34572a = j8;
        }

        @Override // com.uptodown.workers.DownloadWorker.b
        public void c() {
            this.f31202a.f34569a = true;
        }

        @Override // com.uptodown.workers.DownloadWorker.b
        public void d(long j8) {
            this.f31204c.f34572a = j8;
            Bundle bundle = new Bundle();
            bundle.putString("type", "first_data");
            this.f31205d.A(this.f31206e, bundle, this.f31207f);
        }

        @Override // com.uptodown.workers.DownloadWorker.b
        public void e() {
            Bundle bundle = new Bundle();
            bundle.putString("type", "reconnected");
            this.f31205d.A(this.f31206e, bundle, this.f31207f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadUpdatesWorker(Context c8, WorkerParameters params) {
        super(c8, params);
        AbstractC3292y.i(c8, "c");
        AbstractC3292y.i(params, "params");
        this.f31200i = params.getInputData().getBoolean("downloadAnyway", false);
        this.f31201j = params.getInputData().getInt("downloadAutostartedInBackground", 0);
        DownloadWorker.a aVar = DownloadWorker.f31208c;
        aVar.k(false);
        aVar.m(false);
        aVar.n(false);
        w();
    }

    private final Bundle M(Bundle bundle, Q q8, String str) {
        if (str != null) {
            bundle.putString("host", str);
        }
        if (q8 != null) {
            if (q8.b() != null) {
                String b9 = q8.b();
                AbstractC3292y.f(b9);
                bundle.putString("fileId", b9);
            }
            if (q8.v() > 0) {
                bundle.putString("size", C3796u.f37312a.d(q8.v()));
            }
            UptodownApp.a aVar = UptodownApp.f29249C;
            if (aVar.p() != null) {
                C2047l p8 = aVar.p();
                AbstractC3292y.f(p8);
                if (AbstractC3292y.d(p8.d(), q8.s())) {
                    bundle.putInt("deeplink", 1);
                }
            }
            bundle.putInt("deeplink", 0);
        }
        Bundle a9 = C3796u.f37312a.a(bundle);
        a9.putInt("update", 1);
        a9.putInt("notification_fcm", 0);
        return a9;
    }

    private final void N(String str, Q q8) {
        long j8;
        File file;
        String str2;
        O o8 = new O();
        long currentTimeMillis = System.currentTimeMillis();
        Bundle bundle = new Bundle();
        bundle.putString("packagename", q8.s());
        C3770C c3770c = C3770C.f37260a;
        c3770c.f().send(109, bundle);
        Bundle bundle2 = new Bundle();
        bundle2.putString("type", "start");
        A(q8, bundle2, new URL(str).getHost());
        HttpsURLConnection I8 = DownloadWorker.I(this, str, currentTimeMillis, q8, null, 8, null);
        if (I8 == null) {
            return;
        }
        String host = I8.getURL().getHost();
        String url = I8.getURL().toString();
        AbstractC3292y.h(url, "toString(...)");
        String t8 = t(url);
        StringBuilder sb = new StringBuilder();
        sb.append(q8.s());
        sb.append('_');
        String b9 = q8.b();
        AbstractC3292y.f(b9);
        sb.append(b9);
        sb.append('.');
        sb.append(t8);
        q8.U(sb.toString());
        C3794s c3794s = new C3794s();
        Context applicationContext = getApplicationContext();
        AbstractC3292y.h(applicationContext, "getApplicationContext(...)");
        File g8 = c3794s.g(applicationContext);
        if (!g8.exists() && !g8.mkdirs()) {
            Bundle bundle3 = new Bundle();
            bundle3.putString(CampaignEx.JSON_NATIVE_VIDEO_ERROR, "cant_mkdir");
            B(q8, bundle3, host, currentTimeMillis);
            return;
        }
        String l8 = q8.l();
        AbstractC3292y.f(l8);
        File file2 = new File(g8, l8);
        if (file2.exists()) {
            j8 = file2.length();
        } else {
            j8 = 0;
        }
        if (D(I8, q8, currentTimeMillis)) {
            if (new C3776a().c(new C3794s().k(s(), g8), q8.v() - j8)) {
                S s8 = new S();
                S s9 = new S();
                b bVar = new b(o8, s8, s9, this, q8, host);
                AbstractC3292y.f(host);
                long q9 = q(I8, file2, q8, host, currentTimeMillis, bVar);
                if (q9 < 0) {
                    return;
                }
                File l9 = l(file2, s());
                if (l9 != null) {
                    q8.U(l9.getName());
                    C3791p a9 = C3791p.f37286s.a(s());
                    a9.a();
                    a9.p1(q8);
                    a9.i();
                    file = l9;
                } else {
                    file = file2;
                }
                if (!o8.f34569a) {
                    DownloadWorker.a aVar = DownloadWorker.f31208c;
                    if (!aVar.b()) {
                        long v8 = q8.v();
                        String f8 = q8.f();
                        AbstractC3292y.f(f8);
                        File file3 = file;
                        Bundle k8 = k(j8, q9, file, v8, f8);
                        if (k8 == null) {
                            str2 = "packagename";
                            Bundle bundle4 = new Bundle();
                            bundle4.putString(str2, q8.s());
                            c3770c.f().send(100, bundle4);
                        } else {
                            C3776a c3776a = new C3776a();
                            Context applicationContext2 = getApplicationContext();
                            AbstractC3292y.h(applicationContext2, "getApplicationContext(...)");
                            c3776a.b(applicationContext2, q8.l());
                            if (q8.u() > 0) {
                                q8.X(0);
                                C3791p.a aVar2 = C3791p.f37286s;
                                Context applicationContext3 = getApplicationContext();
                                AbstractC3292y.h(applicationContext3, "getApplicationContext(...)");
                                C3791p a10 = aVar2.a(applicationContext3);
                                a10.a();
                                a10.p1(q8);
                                a10.i();
                            }
                            Bundle bundle5 = new Bundle();
                            str2 = "packagename";
                            bundle5.putString(str2, q8.s());
                            c3770c.f().send(102, bundle5);
                            B(q8, k8, host, currentTimeMillis);
                        }
                        if (n.s(q8.s(), s().getPackageName(), true)) {
                            UptodownApp.a aVar3 = UptodownApp.f29249C;
                            if (aVar3.Q()) {
                                j.a aVar4 = j.f4395g;
                                if (aVar4.f() != null && this.f31201j == 1 && (aVar4.f() instanceof Updates)) {
                                    aVar.k(true);
                                }
                            }
                            if (Build.VERSION.SDK_INT >= 31 && !aVar3.Q()) {
                                h.u(new h(s(), null), file3, false, 2, null);
                                aVar.k(true);
                            } else {
                                try {
                                    C3800y.f37330a.v(s(), new C3788m().t(file3, s()));
                                } catch (Exception e8) {
                                    e8.printStackTrace();
                                }
                            }
                        } else {
                            InstallUpdatesWorker.f31231b.b(s());
                        }
                        Bundle bundle6 = new Bundle();
                        bundle6.putString(str2, q8.s());
                        C3770C.f37260a.f().send(108, bundle6);
                        Bundle bundle7 = new Bundle();
                        if (s8.f34572a == 0) {
                            long currentTimeMillis2 = (System.currentTimeMillis() - s9.f34572a) / 1000;
                            if (currentTimeMillis2 > 0) {
                                s8.f34572a = q9 / currentTimeMillis2;
                            }
                        }
                        bundle7.putLong("speed", s8.f34572a);
                        bundle7.putLong(TypedValues.TransitionType.S_DURATION, (System.currentTimeMillis() - currentTimeMillis) / 1000);
                        bundle7.putString("type", "completed");
                        A(q8, bundle7, host);
                        if (!UptodownApp.f29249C.Q()) {
                            C2037b c2037b = new C2037b();
                            C3791p.a aVar5 = C3791p.f37286s;
                            Context applicationContext4 = getApplicationContext();
                            AbstractC3292y.h(applicationContext4, "getApplicationContext(...)");
                            C3791p a11 = aVar5.a(applicationContext4);
                            a11.a();
                            C2041f S8 = a11.S(q8.s());
                            if (S8 != null) {
                                c2037b.j(S8, q8, a11);
                            }
                            a11.i();
                            return;
                        }
                        return;
                    }
                }
                if (!DownloadWorker.f31208c.e()) {
                    C3776a c3776a2 = new C3776a();
                    Context applicationContext5 = getApplicationContext();
                    AbstractC3292y.h(applicationContext5, "getApplicationContext(...)");
                    c3776a2.b(applicationContext5, q8.l());
                    if (q8.u() > 0) {
                        q8.X(0);
                        C3791p.a aVar6 = C3791p.f37286s;
                        Context applicationContext6 = getApplicationContext();
                        AbstractC3292y.h(applicationContext6, "getApplicationContext(...)");
                        C3791p a12 = aVar6.a(applicationContext6);
                        a12.a();
                        a12.p1(q8);
                        a12.i();
                    }
                    Bundle bundle8 = new Bundle();
                    bundle8.putString("packagename", q8.s());
                    c3770c.f().send(106, bundle8);
                    P(q8, host, currentTimeMillis);
                    return;
                }
                return;
            }
            I8.disconnect();
            C3776a c3776a3 = new C3776a();
            Context applicationContext7 = getApplicationContext();
            AbstractC3292y.h(applicationContext7, "getApplicationContext(...)");
            c3776a3.b(applicationContext7, q8.l());
            C3794s c3794s2 = new C3794s();
            Context applicationContext8 = getApplicationContext();
            AbstractC3292y.h(applicationContext8, "getApplicationContext(...)");
            c3794s2.c(applicationContext8);
            q8.X(0);
            c3770c.f().send(104, null);
            Bundle bundle9 = new Bundle();
            bundle9.putString(CampaignEx.JSON_NATIVE_VIDEO_ERROR, "no_enough_space");
            B(q8, bundle9, host, currentTimeMillis);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void O() {
        /*
            Method dump skipped, instructions count: 495
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.workers.DownloadUpdatesWorker.O():void");
    }

    private final void P(Q q8, String str, long j8) {
        f31199l = null;
        Bundle bundle = new Bundle();
        bundle.putString("type", "cancelled");
        if (j8 > 0) {
            bundle.putLong(TypedValues.TransitionType.S_DURATION, (System.currentTimeMillis() - j8) / 1000);
        }
        A(q8, bundle, str);
    }

    @Override // com.uptodown.workers.DownloadWorker
    public void A(Q update, Bundle bundle, String str) {
        AbstractC3292y.i(update, "update");
        AbstractC3292y.i(bundle, "bundle");
        Bundle M8 = M(bundle, update, str);
        C3795t v8 = v();
        if (v8 != null) {
            v8.e("download", M8);
        }
    }

    @Override // com.uptodown.workers.DownloadWorker
    public void B(Q update, Bundle bundleParamsFail, String str, long j8) {
        AbstractC3292y.i(update, "update");
        AbstractC3292y.i(bundleParamsFail, "bundleParamsFail");
        bundleParamsFail.putString("type", "fail");
        if (j8 > 0) {
            bundleParamsFail.putLong(TypedValues.TransitionType.S_DURATION, (System.currentTimeMillis() - j8) / 1000);
        }
        A(update, bundleParamsFail, str);
    }

    @Override // com.uptodown.workers.DownloadWorker
    public void G(String errorCode, String event, Bundle bundle, long j8, Q q8, String str) {
        AbstractC3292y.i(errorCode, "errorCode");
        AbstractC3292y.i(event, "event");
        AbstractC3292y.i(bundle, "bundle");
        if (j8 > 0) {
            bundle.putLong(TypedValues.TransitionType.S_DURATION, (System.currentTimeMillis() - j8) / 1000);
        }
        Bundle M8 = M(bundle, q8, str);
        C3795t v8 = v();
        if (v8 != null) {
            v8.e(event, M8);
        }
    }

    @Override // com.uptodown.workers.DownloadWorker
    public void K(Q update, int i8) {
        AbstractC3292y.i(update, "update");
        Bundle bundle = new Bundle();
        bundle.putParcelable("update", update);
        C3770C.f37260a.f().send(i8, bundle);
    }

    @Override // com.uptodown.workers.DownloadWorker, androidx.work.Worker
    public ListenableWorker.Result doWork() {
        C3770C c3770c = C3770C.f37260a;
        c3770c.f().send(107, null);
        C3797v c3797v = C3797v.f37313a;
        if (c3797v.d()) {
            C3794s c3794s = new C3794s();
            Context applicationContext = getApplicationContext();
            AbstractC3292y.h(applicationContext, "getApplicationContext(...)");
            c3794s.c(applicationContext);
            ArrayList G8 = UptodownApp.f29249C.G();
            if (G8 != null && G8.size() > 0) {
                if (SettingsPreferences.f30529b.b0(s())) {
                    if (!c3797v.f() && !this.f31200i) {
                        Bundle bundle = new Bundle();
                        bundle.putParcelableArrayList("apps_parcelable", G8);
                        c3770c.f().send(105, bundle);
                    } else {
                        O();
                    }
                } else {
                    O();
                }
            }
        } else {
            c3770c.f().send(110, null);
        }
        UptodownApp.f29249C.t0(false);
        InstallUpdatesWorker.f31231b.b(s());
        c3770c.f().send(103, null);
        ListenableWorker.Result success = ListenableWorker.Result.success();
        AbstractC3292y.h(success, "success(...)");
        return success;
    }

    @Override // androidx.work.ListenableWorker
    public void onStopped() {
        DownloadWorker.f31208c.k(true);
        super.onStopped();
    }

    @Override // com.uptodown.workers.DownloadWorker
    public boolean y(Q update) {
        AbstractC3292y.i(update, "update");
        if (n.s(update.s(), f31199l, true) || DownloadWorker.f31208c.b()) {
            return true;
        }
        return false;
    }
}
