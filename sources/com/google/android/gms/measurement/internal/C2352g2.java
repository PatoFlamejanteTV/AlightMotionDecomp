package com.google.android.gms.measurement.internal;

import Q.AbstractC1396p;
import android.content.Context;
import com.google.android.gms.internal.measurement.v7;
import com.google.android.gms.measurement.internal.A3;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.gms.measurement.internal.g2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2352g2 extends AbstractC2477y2 {

    /* renamed from: c, reason: collision with root package name */
    private String f17814c;

    /* renamed from: d, reason: collision with root package name */
    private String f17815d;

    /* renamed from: e, reason: collision with root package name */
    private int f17816e;

    /* renamed from: f, reason: collision with root package name */
    private String f17817f;

    /* renamed from: g, reason: collision with root package name */
    private long f17818g;

    /* renamed from: h, reason: collision with root package name */
    private long f17819h;

    /* renamed from: i, reason: collision with root package name */
    private List f17820i;

    /* renamed from: j, reason: collision with root package name */
    private String f17821j;

    /* renamed from: k, reason: collision with root package name */
    private int f17822k;

    /* renamed from: l, reason: collision with root package name */
    private String f17823l;

    /* renamed from: m, reason: collision with root package name */
    private String f17824m;

    /* renamed from: n, reason: collision with root package name */
    private String f17825n;

    /* renamed from: o, reason: collision with root package name */
    private long f17826o;

    /* renamed from: p, reason: collision with root package name */
    private String f17827p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2352g2(S2 s22, long j8) {
        super(s22);
        this.f17826o = 0L;
        this.f17827p = null;
        this.f17819h = j8;
    }

    private final String J() {
        if (v7.a() && b().q(G.f17332s0)) {
            a().K().a("Disabled IID for tests.");
            return null;
        }
        try {
            Class<?> loadClass = w().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
            if (loadClass == null) {
                return null;
            }
            try {
                Object invoke = loadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, w());
                if (invoke == null) {
                    return null;
                }
                try {
                    return (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(invoke, null);
                } catch (Exception unused) {
                    a().M().a("Failed to retrieve Firebase Instance Id");
                    return null;
                }
            } catch (Exception unused2) {
                a().N().a("Failed to obtain Firebase Analytics instance");
                return null;
            }
        } catch (ClassNotFoundException unused3) {
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2477y2
    protected final boolean A() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0169  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.M5 B(java.lang.String r49) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2352g2.B(java.lang.String):com.google.android.gms.measurement.internal.M5");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int C() {
        s();
        return this.f17822k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int D() {
        s();
        return this.f17816e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String E() {
        s();
        return this.f17824m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String F() {
        s();
        AbstractC1396p.l(this.f17814c);
        return this.f17814c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String G() {
        k();
        s();
        AbstractC1396p.l(this.f17823l);
        return this.f17823l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List H() {
        return this.f17820i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void I() {
        String format;
        String str;
        k();
        if (!e().M().m(A3.a.ANALYTICS_STORAGE)) {
            a().F().a("Analytics Storage consent is not granted");
            format = null;
        } else {
            byte[] bArr = new byte[16];
            g().W0().nextBytes(bArr);
            format = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        }
        C2415p2 F8 = a().F();
        if (format == null) {
            str = "null";
        } else {
            str = "not null";
        }
        F8.a(String.format("Resetting session stitching token to %s", str));
        this.f17825n = format;
        this.f17826o = x().currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean K(String str) {
        boolean z8;
        String str2 = this.f17827p;
        if (str2 != null && !str2.equals(str)) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f17827p = str;
        return z8;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3, com.google.android.gms.measurement.internal.InterfaceC2478y3
    public final /* bridge */ /* synthetic */ C2401n2 a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ C2349g b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ C2467x c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ C2359h2 d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ C2484z2 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3, com.google.android.gms.measurement.internal.InterfaceC2478y3
    public final /* bridge */ /* synthetic */ P2 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ d6 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2309a1, com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2309a1, com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2309a1, com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2309a1
    public final /* bridge */ /* synthetic */ C2474y l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2309a1
    public final /* bridge */ /* synthetic */ C2352g2 m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2309a1
    public final /* bridge */ /* synthetic */ C2345f2 n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2309a1
    public final /* bridge */ /* synthetic */ F3 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2309a1
    public final /* bridge */ /* synthetic */ C2465w4 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2309a1
    public final /* bridge */ /* synthetic */ F4 q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2309a1
    public final /* bridge */ /* synthetic */ C2418p5 r() {
        return super.r();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0190 A[Catch: IllegalStateException -> 0x01a8, TryCatch #3 {IllegalStateException -> 0x01a8, blocks: (B:18:0x016b, B:21:0x0188, B:23:0x0190, B:25:0x01ac, B:27:0x01c0, B:28:0x01c5, B:30:0x01c3), top: B:17:0x016b }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01ac A[Catch: IllegalStateException -> 0x01a8, TryCatch #3 {IllegalStateException -> 0x01a8, blocks: (B:18:0x016b, B:21:0x0188, B:23:0x0190, B:25:0x01ac, B:27:0x01c0, B:28:0x01c5, B:30:0x01c3), top: B:17:0x016b }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014c  */
    @Override // com.google.android.gms.measurement.internal.AbstractC2477y2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void v() {
        /*
            Method dump skipped, instructions count: 578
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2352g2.v():void");
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3, com.google.android.gms.measurement.internal.InterfaceC2478y3
    public final /* bridge */ /* synthetic */ Context w() {
        return super.w();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3, com.google.android.gms.measurement.internal.InterfaceC2478y3
    public final /* bridge */ /* synthetic */ V.d x() {
        return super.x();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3, com.google.android.gms.measurement.internal.InterfaceC2478y3
    public final /* bridge */ /* synthetic */ C2321c y() {
        return super.y();
    }
}
