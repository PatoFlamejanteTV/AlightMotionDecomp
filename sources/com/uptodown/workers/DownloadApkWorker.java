package com.uptodown.workers;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import androidx.work.WorkerParameters;
import c5.Q;
import c5.r;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.uptodown.UptodownApp;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.workers.DownloadWorker;
import java.io.File;
import java.net.URL;
import java.util.Iterator;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.S;
import kotlin.jvm.internal.T;
import l6.n;
import q5.C3770C;
import q5.C3776a;
import q5.C3788m;
import q5.C3791p;
import q5.C3794s;
import q5.C3795t;
import q5.C3797v;
import q5.C3800y;

/* loaded from: classes5.dex */
public final class DownloadApkWorker extends DownloadWorker {

    /* renamed from: k, reason: collision with root package name */
    public static final a f31190k = new a(null);

    /* renamed from: l, reason: collision with root package name */
    private static r f31191l;

    /* renamed from: i, reason: collision with root package name */
    private String f31192i;

    /* renamed from: j, reason: collision with root package name */
    private String f31193j;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final void a(long j8) {
            DownloadWorker.f31208c.j(c(j8));
        }

        public final r b() {
            return DownloadApkWorker.f31191l;
        }

        public final boolean c(long j8) {
            if (DownloadApkWorker.f31191l != null) {
                r rVar = DownloadApkWorker.f31191l;
                AbstractC3292y.f(rVar);
                if (rVar.h() == j8) {
                    return true;
                }
            }
            return false;
        }

        public final boolean d(long j8, long j9) {
            if (DownloadApkWorker.f31191l != null) {
                r rVar = DownloadApkWorker.f31191l;
                AbstractC3292y.f(rVar);
                if (rVar.h() == j8) {
                    r rVar2 = DownloadApkWorker.f31191l;
                    AbstractC3292y.f(rVar2);
                    if (rVar2.e0() == j9) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final boolean e(r d8) {
            AbstractC3292y.i(d8, "d");
            if (DownloadApkWorker.f31191l != null) {
                r rVar = DownloadApkWorker.f31191l;
                AbstractC3292y.f(rVar);
                if (rVar.w() != null) {
                    r rVar2 = DownloadApkWorker.f31191l;
                    AbstractC3292y.f(rVar2);
                    if (n.s(rVar2.w(), d8.w(), true)) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final boolean f(Context context, int i8) {
            AbstractC3292y.i(context, "context");
            if (!UptodownApp.f29249C.W("downloadApkWorker", context)) {
                Data.Builder putInt = new Data.Builder().putInt("downloadId", i8);
                AbstractC3292y.h(putInt, "putInt(...)");
                OneTimeWorkRequest.Builder addTag = new OneTimeWorkRequest.Builder(DownloadApkWorker.class).addTag("downloadApkWorker");
                Data build = putInt.build();
                AbstractC3292y.h(build, "build(...)");
                WorkManager.getInstance(context).enqueue(addTag.setInputData(build).build());
                return true;
            }
            return false;
        }

        public final boolean g(Context context, String url) {
            AbstractC3292y.i(context, "context");
            AbstractC3292y.i(url, "url");
            if (!UptodownApp.f29249C.W("downloadApkWorker", context)) {
                Data.Builder putString = new Data.Builder().putString("url", url);
                AbstractC3292y.h(putString, "putString(...)");
                OneTimeWorkRequest.Builder addTag = new OneTimeWorkRequest.Builder(DownloadApkWorker.class).addTag("downloadApkWorker");
                Data build = putString.build();
                AbstractC3292y.h(build, "build(...)");
                WorkManager.getInstance(context).enqueue(addTag.setInputData(build).build());
                return true;
            }
            return false;
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    public static final class b implements DownloadWorker.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ S f31194a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ S f31195b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ DownloadApkWorker f31196c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ T f31197d;

        b(S s8, S s9, DownloadApkWorker downloadApkWorker, T t8) {
            this.f31194a = s8;
            this.f31195b = s9;
            this.f31196c = downloadApkWorker;
            this.f31197d = t8;
        }

        @Override // com.uptodown.workers.DownloadWorker.b
        public void a(int i8, long j8) {
            if (DownloadApkWorker.f31191l != null) {
                Data.Builder builder = new Data.Builder();
                builder.putInt("downloadProgress", i8);
                this.f31196c.setProgressAsync(builder.build());
                r rVar = DownloadApkWorker.f31191l;
                AbstractC3292y.f(rVar);
                rVar.F0(i8);
                r rVar2 = DownloadApkWorker.f31191l;
                AbstractC3292y.f(rVar2);
                rVar2.v0(j8);
                C3791p a9 = C3791p.f37286s.a(this.f31196c.s());
                a9.a();
                r rVar3 = DownloadApkWorker.f31191l;
                AbstractC3292y.f(rVar3);
                a9.q1(rVar3);
                a9.i();
                C3800y.f37330a.i(this.f31196c.s());
                if (!((File) this.f31197d.f34573a).exists()) {
                    DownloadWorker.f31208c.j(true);
                }
                DownloadApkWorker downloadApkWorker = this.f31196c;
                r rVar4 = DownloadApkWorker.f31191l;
                AbstractC3292y.f(rVar4);
                downloadApkWorker.J(rVar4, ComposerKt.providerKey);
            }
        }

        @Override // com.uptodown.workers.DownloadWorker.b
        public void b(long j8) {
            this.f31194a.f34572a = j8;
        }

        @Override // com.uptodown.workers.DownloadWorker.b
        public void c() {
            DownloadWorker.f31208c.j(true);
        }

        @Override // com.uptodown.workers.DownloadWorker.b
        public void d(long j8) {
            this.f31195b.f34572a = j8;
            Bundle bundle = new Bundle();
            bundle.putString("type", "first_data");
            DownloadApkWorker downloadApkWorker = this.f31196c;
            downloadApkWorker.z(bundle, downloadApkWorker.f31193j);
        }

        @Override // com.uptodown.workers.DownloadWorker.b
        public void e() {
            Bundle bundle = new Bundle();
            bundle.putString("type", "reconnected");
            DownloadApkWorker downloadApkWorker = this.f31196c;
            downloadApkWorker.z(bundle, downloadApkWorker.f31193j);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadApkWorker(Context c8, WorkerParameters params) {
        super(c8, params);
        AbstractC3292y.i(c8, "c");
        AbstractC3292y.i(params, "params");
        w();
        DownloadWorker.a aVar = DownloadWorker.f31208c;
        aVar.j(false);
        aVar.l(false);
        int i8 = params.getInputData().getInt("downloadId", -1);
        if (i8 >= 0) {
            C3791p a9 = C3791p.f37286s.a(s());
            a9.a();
            f31191l = a9.e1(i8);
            a9.i();
        }
        this.f31192i = params.getInputData().getString("url");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final android.os.Bundle N(android.os.Bundle r7) {
        /*
            r6 = this;
            com.uptodown.UptodownApp$a r0 = com.uptodown.UptodownApp.f29249C
            c5.l r1 = r0.p()
            r2 = 1
            java.lang.String r3 = "deeplink"
            r4 = 0
            if (r1 == 0) goto L2a
            c5.r r1 = com.uptodown.workers.DownloadApkWorker.f31191l
            if (r1 == 0) goto L2a
            c5.l r0 = r0.p()
            kotlin.jvm.internal.AbstractC3292y.f(r0)
            int r0 = r0.b()
            c5.r r1 = com.uptodown.workers.DownloadApkWorker.f31191l
            kotlin.jvm.internal.AbstractC3292y.f(r1)
            int r1 = r1.y()
            if (r0 != r1) goto L2a
            r7.putInt(r3, r2)
            goto L2d
        L2a:
            r7.putInt(r3, r4)
        L2d:
            c5.A$a r0 = c5.C2031A.f15554f
            android.content.Context r1 = r6.s()
            c5.A r0 = r0.b(r1)
            if (r0 == 0) goto L55
            c5.r r1 = com.uptodown.workers.DownloadApkWorker.f31191l
            java.lang.String r3 = "notification_fcm"
            if (r1 == 0) goto L52
            int r0 = r0.c()
            c5.r r1 = com.uptodown.workers.DownloadApkWorker.f31191l
            kotlin.jvm.internal.AbstractC3292y.f(r1)
            int r1 = r1.y()
            if (r0 != r1) goto L52
            r7.putInt(r3, r2)
            goto L55
        L52:
            r7.putInt(r3, r4)
        L55:
            c5.j$a r0 = c5.C2045j.f15879n
            android.content.Context r1 = r6.s()
            c5.j r0 = r0.d(r1)
            java.lang.String r1 = "adView"
            if (r0 == 0) goto L79
            c5.r r2 = com.uptodown.workers.DownloadApkWorker.f31191l
            if (r2 == 0) goto L79
            int r3 = r0.m()
            int r2 = r2.y()
            if (r3 != r2) goto L79
            java.lang.String r0 = r0.s()
            r7.putString(r1, r0)
            goto L9a
        L79:
            c5.x$a r0 = c5.C2058x.f15962n
            android.content.Context r2 = r6.s()
            c5.x r0 = r0.d(r2)
            if (r0 == 0) goto L9a
            c5.r r2 = com.uptodown.workers.DownloadApkWorker.f31191l
            if (r2 == 0) goto L9a
            int r3 = r0.m()
            int r2 = r2.y()
            if (r3 != r2) goto L9a
            java.lang.String r0 = r0.s()
            r7.putString(r1, r0)
        L9a:
            java.lang.String r0 = r6.f31193j
            if (r0 == 0) goto La3
            java.lang.String r1 = "host"
            r7.putString(r1, r0)
        La3:
            c5.r r0 = com.uptodown.workers.DownloadApkWorker.f31191l
            if (r0 == 0) goto Le4
            kotlin.jvm.internal.AbstractC3292y.f(r0)
            java.lang.String r0 = r0.w()
            if (r0 == 0) goto Lc1
            c5.r r0 = com.uptodown.workers.DownloadApkWorker.f31191l
            kotlin.jvm.internal.AbstractC3292y.f(r0)
            java.lang.String r0 = r0.w()
            kotlin.jvm.internal.AbstractC3292y.f(r0)
            java.lang.String r1 = "fileId"
            r7.putString(r1, r0)
        Lc1:
            c5.r r0 = com.uptodown.workers.DownloadApkWorker.f31191l
            kotlin.jvm.internal.AbstractC3292y.f(r0)
            long r0 = r0.a0()
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto Le4
            q5.u r0 = q5.C3796u.f37312a
            c5.r r1 = com.uptodown.workers.DownloadApkWorker.f31191l
            kotlin.jvm.internal.AbstractC3292y.f(r1)
            long r1 = r1.a0()
            java.lang.String r0 = r0.d(r1)
            java.lang.String r1 = "size"
            r7.putString(r1, r0)
        Le4:
            java.lang.String r0 = "update"
            r7.putInt(r0, r4)
            q5.u r0 = q5.C3796u.f37312a
            android.os.Bundle r7 = r0.a(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.workers.DownloadApkWorker.N(android.os.Bundle):android.os.Bundle");
    }

    private final void O() {
        r rVar;
        if (!C3797v.f37313a.d()) {
            C3770C.f37260a.e().send(209, null);
            return;
        }
        Iterator it = new C3788m().k(s()).iterator();
        AbstractC3292y.h(it, "iterator(...)");
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                AbstractC3292y.h(next, "next(...)");
                rVar = (r) next;
                if (!rVar.b(s()) && (SettingsPreferences.f30529b.b0(s()) || C3797v.f37313a.f() || rVar.s() == 1)) {
                    break;
                }
            } else {
                rVar = null;
                break;
            }
        }
        f31191l = null;
        if (rVar != null) {
            DownloadWorker.a aVar = DownloadWorker.f31208c;
            aVar.j(false);
            aVar.h();
            f31191l = rVar;
            AbstractC3292y.f(rVar);
            if (rVar.w() != null) {
                r rVar2 = f31191l;
                AbstractC3292y.f(rVar2);
                String R8 = R(rVar2);
                if (R8 != null) {
                    Q(R8);
                    O();
                }
            }
        }
    }

    private final void P(long j8) {
        if (f31191l != null) {
            C3791p a9 = C3791p.f37286s.a(s());
            a9.a();
            a9.z(f31191l);
            a9.i();
        }
        C3800y.f37330a.d(s());
        Bundle bundle = new Bundle();
        bundle.putString("type", "cancelled");
        if (j8 > 0) {
            bundle.putLong(TypedValues.TransitionType.S_DURATION, (System.currentTimeMillis() - j8) / 1000);
        }
        z(bundle, this.f31193j);
        U(f31191l);
    }

    private final void Q(String str) {
        long j8;
        this.f31193j = null;
        DownloadWorker.a aVar = DownloadWorker.f31208c;
        aVar.h();
        if (!C3797v.f37313a.d()) {
            C3770C.f37260a.e().send(209, null);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Bundle bundle = new Bundle();
        bundle.putString("type", "start");
        z(bundle, new URL(str).getHost());
        HttpsURLConnection I8 = DownloadWorker.I(this, str, currentTimeMillis, null, null, 12, null);
        if (I8 == null) {
            return;
        }
        this.f31193j = I8.getURL().getHost();
        String url = I8.getURL().toString();
        AbstractC3292y.h(url, "toString(...)");
        String u8 = u(url);
        if (n.R(u8, ".", 0, false, 6, null) < 0) {
            String url2 = I8.getURL().toString();
            AbstractC3292y.h(url2, "toString(...)");
            u8 = u8 + t(url2);
        }
        r rVar = f31191l;
        if (rVar == null) {
            r rVar2 = new r();
            f31191l = rVar2;
            AbstractC3292y.f(rVar2);
            rVar2.D0(u8);
            r rVar3 = f31191l;
            AbstractC3292y.f(rVar3);
            rVar3.m0(s());
        } else {
            AbstractC3292y.f(rVar);
            rVar.D0(u8);
        }
        File f8 = new C3794s().f(s());
        if (!f8.exists() && !f8.mkdirs()) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("type", "fail");
            bundle2.putString(CampaignEx.JSON_NATIVE_VIDEO_ERROR, "cant_mkdir");
            p(" (106)", "download", bundle2, currentTimeMillis);
            return;
        }
        T t8 = new T();
        r rVar4 = f31191l;
        AbstractC3292y.f(rVar4);
        String X8 = rVar4.X();
        AbstractC3292y.f(X8);
        File file = new File(f8, X8);
        t8.f34573a = file;
        if (file.exists()) {
            j8 = ((File) t8.f34573a).length();
        } else {
            j8 = 0;
        }
        if (aVar.a()) {
            P(currentTimeMillis);
            return;
        }
        if (C(I8, currentTimeMillis)) {
            r rVar5 = f31191l;
            AbstractC3292y.f(rVar5);
            if (new C3776a().c(new C3794s().k(s(), f8), rVar5.a0() - ((File) t8.f34573a).length())) {
                r rVar6 = f31191l;
                AbstractC3292y.f(rVar6);
                J(rVar6, 200);
                r rVar7 = f31191l;
                AbstractC3292y.f(rVar7);
                if (rVar7.Y() != null) {
                    C3791p a9 = C3791p.f37286s.a(s());
                    a9.a();
                    r rVar8 = f31191l;
                    AbstractC3292y.f(rVar8);
                    String Y8 = rVar8.Y();
                    AbstractC3292y.f(Y8);
                    Q s02 = a9.s0(Y8);
                    if (s02 != null) {
                        r rVar9 = f31191l;
                        AbstractC3292y.f(rVar9);
                        s02.U(rVar9.X());
                        a9.p1(s02);
                    }
                    a9.i();
                }
                S s8 = new S();
                S s9 = new S();
                b bVar = new b(s8, s9, this, t8);
                File file2 = (File) t8.f34573a;
                r rVar10 = f31191l;
                AbstractC3292y.f(rVar10);
                String str2 = this.f31193j;
                AbstractC3292y.f(str2);
                long n8 = n(I8, file2, rVar10, str2, currentTimeMillis, bVar);
                if (n8 < 0) {
                    return;
                }
                C3791p a10 = C3791p.f37286s.a(s());
                a10.a();
                File l8 = l((File) t8.f34573a, s());
                if (l8 != null) {
                    r rVar11 = f31191l;
                    AbstractC3292y.f(rVar11);
                    rVar11.D0(l8.getName());
                    r rVar12 = f31191l;
                    AbstractC3292y.f(rVar12);
                    rVar12.o0(l8.getAbsolutePath());
                    r rVar13 = f31191l;
                    AbstractC3292y.f(rVar13);
                    a10.q1(rVar13);
                    t8.f34573a = l8;
                }
                a10.i();
                if (aVar.a()) {
                    P(currentTimeMillis);
                    return;
                }
                r rVar14 = f31191l;
                AbstractC3292y.f(rVar14);
                J(rVar14, 205);
                File file3 = (File) t8.f34573a;
                r rVar15 = f31191l;
                AbstractC3292y.f(rVar15);
                long a02 = rVar15.a0();
                r rVar16 = f31191l;
                AbstractC3292y.f(rVar16);
                String x8 = rVar16.x();
                AbstractC3292y.f(x8);
                Bundle k8 = k(j8, n8, file3, a02, x8);
                if (k8 != null) {
                    C3776a c3776a = new C3776a();
                    Context s10 = s();
                    r rVar17 = f31191l;
                    AbstractC3292y.f(rVar17);
                    c3776a.a(s10, rVar17.X());
                    p(" (111)", "download", k8, currentTimeMillis);
                    return;
                }
                r rVar18 = f31191l;
                AbstractC3292y.f(rVar18);
                J(rVar18, ComposerKt.referenceKey);
                Bundle bundle3 = new Bundle();
                bundle3.putString("type", "completed");
                if (s8.f34572a == 0) {
                    long currentTimeMillis2 = (System.currentTimeMillis() - s9.f34572a) / 1000;
                    if (currentTimeMillis2 > 0) {
                        s8.f34572a = n8 / currentTimeMillis2;
                    }
                }
                bundle3.putLong("speed", s8.f34572a);
                bundle3.putLong(TypedValues.TransitionType.S_DURATION, (System.currentTimeMillis() - currentTimeMillis) / 1000);
                z(bundle3, this.f31193j);
                if (new L4.a(s()).m()) {
                    UptodownApp.a.Z(UptodownApp.f29249C, (File) t8.f34573a, s(), null, 4, null);
                }
                r rVar19 = f31191l;
                AbstractC3292y.f(rVar19);
                J(rVar19, ComposerKt.compositionLocalMapKey);
                C3800y.f37330a.d(s());
                return;
            }
            I8.disconnect();
            C3776a c3776a2 = new C3776a();
            Context s11 = s();
            r rVar20 = f31191l;
            AbstractC3292y.f(rVar20);
            c3776a2.a(s11, rVar20.X());
            Bundle bundle4 = new Bundle();
            bundle4.putString("type", "fail");
            bundle4.putString(CampaignEx.JSON_NATIVE_VIDEO_ERROR, "no_enough_space");
            p(" (112)", "download", bundle4, currentTimeMillis);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String R(c5.r r10) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.workers.DownloadApkWorker.R(c5.r):java.lang.String");
    }

    private final void S(String str, Bundle bundle) {
        p(str, "getUrlByFileId", bundle, 0L);
    }

    private final void T(r rVar, String str) {
        if (rVar != null) {
            C3791p a9 = C3791p.f37286s.a(s());
            a9.a();
            rVar.r0(rVar.l() + 1);
            a9.z(rVar);
            if (rVar.l() >= 4) {
                new C3776a().a(s(), rVar.X());
            } else {
                a9.D0(rVar);
            }
            a9.i();
            V(rVar);
        }
        C3800y.f37330a.t(s(), rVar, str);
    }

    private final void U(r rVar) {
        Bundle bundle = new Bundle();
        if (rVar != null) {
            bundle.putParcelable("download", rVar);
        }
        C3770C.f37260a.e().send(ComposerKt.reuseKey, bundle);
    }

    private final void V(r rVar) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("download", rVar);
        C3770C.f37260a.e().send(ComposerKt.providerValuesKey, bundle);
    }

    @Override // com.uptodown.workers.DownloadWorker
    public void G(String errorCode, String event, Bundle bundle, long j8, Q q8, String str) {
        AbstractC3292y.i(errorCode, "errorCode");
        AbstractC3292y.i(event, "event");
        AbstractC3292y.i(bundle, "bundle");
        if (str != null) {
            this.f31193j = str;
        }
        T(f31191l, errorCode);
        if (j8 > 0) {
            bundle.putLong(TypedValues.TransitionType.S_DURATION, (System.currentTimeMillis() - j8) / 1000);
        }
        Bundle N8 = N(bundle);
        C3795t v8 = v();
        if (v8 != null) {
            v8.e(event, N8);
        }
    }

    @Override // com.uptodown.workers.DownloadWorker
    public void J(r download, int i8) {
        AbstractC3292y.i(download, "download");
        Bundle bundle = new Bundle();
        bundle.putParcelable("download", download);
        C3770C.f37260a.e().send(i8, bundle);
    }

    @Override // com.uptodown.workers.DownloadWorker, androidx.work.Worker
    public ListenableWorker.Result doWork() {
        String str = this.f31192i;
        if (str != null) {
            AbstractC3292y.f(str);
            Q(str);
            O();
        } else {
            r rVar = f31191l;
            if (rVar == null) {
                T(null, " (100)");
            } else {
                AbstractC3292y.f(rVar);
                if (rVar.w() == null) {
                    T(f31191l, " (103)");
                    Bundle bundle = new Bundle();
                    bundle.putString("type", "fileId_null");
                    r rVar2 = f31191l;
                    AbstractC3292y.f(rVar2);
                    bundle.putString("packagename", rVar2.Y());
                    C3795t v8 = v();
                    if (v8 != null) {
                        v8.e("getUrlByFileId", bundle);
                    }
                } else {
                    r rVar3 = f31191l;
                    AbstractC3292y.f(rVar3);
                    String R8 = R(rVar3);
                    if (R8 != null) {
                        Q(R8);
                        O();
                    }
                }
            }
        }
        C3770C.f37260a.e().send(210, null);
        ListenableWorker.Result success = ListenableWorker.Result.success();
        AbstractC3292y.h(success, "success(...)");
        return success;
    }

    @Override // com.uptodown.workers.DownloadWorker
    public void o() {
        P(0L);
    }

    @Override // com.uptodown.workers.DownloadWorker
    public void p(String errorCode, String event, Bundle bundle, long j8) {
        AbstractC3292y.i(errorCode, "errorCode");
        AbstractC3292y.i(event, "event");
        AbstractC3292y.i(bundle, "bundle");
        T(f31191l, errorCode);
        if (j8 > 0) {
            bundle.putLong(TypedValues.TransitionType.S_DURATION, (System.currentTimeMillis() - j8) / 1000);
        }
        Bundle N8 = N(bundle);
        C3795t v8 = v();
        if (v8 != null) {
            v8.e(event, N8);
        }
    }

    @Override // com.uptodown.workers.DownloadWorker
    public boolean x() {
        return DownloadWorker.f31208c.a();
    }

    @Override // com.uptodown.workers.DownloadWorker
    public void z(Bundle bundle, String str) {
        AbstractC3292y.i(bundle, "bundle");
        this.f31193j = str;
        Bundle N8 = N(bundle);
        C3795t v8 = v();
        if (v8 != null) {
            v8.e("download", N8);
        }
    }
}
