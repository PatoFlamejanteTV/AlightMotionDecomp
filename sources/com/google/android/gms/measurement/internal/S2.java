package com.google.android.gms.measurement.internal;

import Q.AbstractC1396p;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.AbstractC2163i3;
import com.google.android.gms.internal.measurement.C2107c1;
import com.google.android.gms.internal.measurement.Q6;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import l0.C3302b;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class S2 implements InterfaceC2478y3 {

    /* renamed from: I, reason: collision with root package name */
    private static volatile S2 f17535I;

    /* renamed from: A, reason: collision with root package name */
    private volatile Boolean f17536A;

    /* renamed from: B, reason: collision with root package name */
    private Boolean f17537B;

    /* renamed from: C, reason: collision with root package name */
    private Boolean f17538C;

    /* renamed from: D, reason: collision with root package name */
    private volatile boolean f17539D;

    /* renamed from: E, reason: collision with root package name */
    private int f17540E;

    /* renamed from: F, reason: collision with root package name */
    private int f17541F;

    /* renamed from: H, reason: collision with root package name */
    final long f17543H;

    /* renamed from: a, reason: collision with root package name */
    private final Context f17544a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17545b;

    /* renamed from: c, reason: collision with root package name */
    private final String f17546c;

    /* renamed from: d, reason: collision with root package name */
    private final String f17547d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f17548e;

    /* renamed from: f, reason: collision with root package name */
    private final C2321c f17549f;

    /* renamed from: g, reason: collision with root package name */
    private final C2349g f17550g;

    /* renamed from: h, reason: collision with root package name */
    private final C2484z2 f17551h;

    /* renamed from: i, reason: collision with root package name */
    private final C2401n2 f17552i;

    /* renamed from: j, reason: collision with root package name */
    private final P2 f17553j;

    /* renamed from: k, reason: collision with root package name */
    private final C2418p5 f17554k;

    /* renamed from: l, reason: collision with root package name */
    private final d6 f17555l;

    /* renamed from: m, reason: collision with root package name */
    private final C2359h2 f17556m;

    /* renamed from: n, reason: collision with root package name */
    private final V.d f17557n;

    /* renamed from: o, reason: collision with root package name */
    private final C2465w4 f17558o;

    /* renamed from: p, reason: collision with root package name */
    private final F3 f17559p;

    /* renamed from: q, reason: collision with root package name */
    private final C2474y f17560q;

    /* renamed from: r, reason: collision with root package name */
    private final C2437s4 f17561r;

    /* renamed from: s, reason: collision with root package name */
    private final String f17562s;

    /* renamed from: t, reason: collision with root package name */
    private C2345f2 f17563t;

    /* renamed from: u, reason: collision with root package name */
    private F4 f17564u;

    /* renamed from: v, reason: collision with root package name */
    private C2467x f17565v;

    /* renamed from: w, reason: collision with root package name */
    private C2352g2 f17566w;

    /* renamed from: y, reason: collision with root package name */
    private Boolean f17568y;

    /* renamed from: z, reason: collision with root package name */
    private long f17569z;

    /* renamed from: x, reason: collision with root package name */
    private boolean f17567x = false;

    /* renamed from: G, reason: collision with root package name */
    private AtomicInteger f17542G = new AtomicInteger(0);

    private S2(D3 d32) {
        long currentTimeMillis;
        Bundle bundle;
        boolean z8 = false;
        AbstractC1396p.l(d32);
        C2321c c2321c = new C2321c(d32.f17176a);
        this.f17549f = c2321c;
        AbstractC2331d2.f17759a = c2321c;
        Context context = d32.f17176a;
        this.f17544a = context;
        this.f17545b = d32.f17177b;
        this.f17546c = d32.f17178c;
        this.f17547d = d32.f17179d;
        this.f17548e = d32.f17183h;
        this.f17536A = d32.f17180e;
        this.f17562s = d32.f17185j;
        this.f17539D = true;
        C2107c1 c2107c1 = d32.f17182g;
        if (c2107c1 != null && (bundle = c2107c1.f16613g) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f17537B = (Boolean) obj;
            }
            Object obj2 = c2107c1.f16613g.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f17538C = (Boolean) obj2;
            }
        }
        AbstractC2163i3.l(context);
        V.d b9 = V.g.b();
        this.f17557n = b9;
        Long l8 = d32.f17184i;
        if (l8 != null) {
            currentTimeMillis = l8.longValue();
        } else {
            currentTimeMillis = b9.currentTimeMillis();
        }
        this.f17543H = currentTimeMillis;
        this.f17550g = new C2349g(this);
        C2484z2 c2484z2 = new C2484z2(this);
        c2484z2.n();
        this.f17551h = c2484z2;
        C2401n2 c2401n2 = new C2401n2(this);
        c2401n2.n();
        this.f17552i = c2401n2;
        d6 d6Var = new d6(this);
        d6Var.n();
        this.f17555l = d6Var;
        this.f17556m = new C2359h2(new C3(d32, this));
        this.f17560q = new C2474y(this);
        C2465w4 c2465w4 = new C2465w4(this);
        c2465w4.t();
        this.f17558o = c2465w4;
        F3 f32 = new F3(this);
        f32.t();
        this.f17559p = f32;
        C2418p5 c2418p5 = new C2418p5(this);
        c2418p5.t();
        this.f17554k = c2418p5;
        C2437s4 c2437s4 = new C2437s4(this);
        c2437s4.n();
        this.f17561r = c2437s4;
        P2 p22 = new P2(this);
        p22.n();
        this.f17553j = p22;
        C2107c1 c2107c12 = d32.f17182g;
        if (c2107c12 != null && c2107c12.f16608b != 0) {
            z8 = true;
        }
        boolean z9 = !z8;
        if (context.getApplicationContext() instanceof Application) {
            H().V0(z9);
        } else {
            a().L().a("Application context is not an Application");
        }
        p22.D(new Y2(this, d32));
    }

    public static S2 b(Context context, C2107c1 c2107c1, Long l8) {
        Bundle bundle;
        if (c2107c1 != null && (c2107c1.f16611e == null || c2107c1.f16612f == null)) {
            c2107c1 = new C2107c1(c2107c1.f16607a, c2107c1.f16608b, c2107c1.f16609c, c2107c1.f16610d, null, null, c2107c1.f16613g, null);
        }
        AbstractC1396p.l(context);
        AbstractC1396p.l(context.getApplicationContext());
        if (f17535I == null) {
            synchronized (S2.class) {
                try {
                    if (f17535I == null) {
                        f17535I = new S2(new D3(context, c2107c1, l8));
                    }
                } finally {
                }
            }
        } else if (c2107c1 != null && (bundle = c2107c1.f16613g) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            AbstractC1396p.l(f17535I);
            f17535I.j(c2107c1.f16613g.getBoolean("dataCollectionDefaultEnabled"));
        }
        AbstractC1396p.l(f17535I);
        return f17535I;
    }

    private static void d(AbstractC2477y2 abstractC2477y2) {
        if (abstractC2477y2 != null) {
            if (abstractC2477y2.z()) {
                return;
            }
            throw new IllegalStateException("Component not initialized: " + String.valueOf(abstractC2477y2.getClass()));
        }
        throw new IllegalStateException("Component not created");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void e(S2 s22, D3 d32) {
        s22.f().k();
        C2467x c2467x = new C2467x(s22);
        c2467x.n();
        s22.f17565v = c2467x;
        C2352g2 c2352g2 = new C2352g2(s22, d32.f17181f);
        c2352g2.t();
        s22.f17566w = c2352g2;
        C2345f2 c2345f2 = new C2345f2(s22);
        c2345f2.t();
        s22.f17563t = c2345f2;
        F4 f42 = new F4(s22);
        f42.t();
        s22.f17564u = f42;
        s22.f17555l.o();
        s22.f17551h.o();
        s22.f17566w.u();
        s22.a().J().b("App measurement initialized, version", 106000L);
        s22.a().J().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String F8 = c2352g2.F();
        if (TextUtils.isEmpty(s22.f17545b)) {
            if (s22.L().E0(F8, s22.f17550g.T())) {
                s22.a().J().a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                s22.a().J().a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app " + F8);
            }
        }
        s22.a().F().a("Debug-level message logging enabled");
        if (s22.f17540E != s22.f17542G.get()) {
            s22.a().G().c("Not all components initialized", Integer.valueOf(s22.f17540E), Integer.valueOf(s22.f17542G.get()));
        }
        s22.f17567x = true;
    }

    private static void g(AbstractC2464w3 abstractC2464w3) {
        if (abstractC2464w3 != null) {
        } else {
            throw new IllegalStateException("Component not created");
        }
    }

    private static void h(AbstractC2485z3 abstractC2485z3) {
        if (abstractC2485z3 != null) {
            if (abstractC2485z3.p()) {
                return;
            }
            throw new IllegalStateException("Component not initialized: " + String.valueOf(abstractC2485z3.getClass()));
        }
        throw new IllegalStateException("Component not created");
    }

    private final C2437s4 s() {
        h(this.f17561r);
        return this.f17561r;
    }

    public final C2467x A() {
        h(this.f17565v);
        return this.f17565v;
    }

    public final C2352g2 B() {
        d(this.f17566w);
        return this.f17566w;
    }

    public final C2345f2 C() {
        d(this.f17563t);
        return this.f17563t;
    }

    public final C2359h2 D() {
        return this.f17556m;
    }

    public final C2401n2 E() {
        C2401n2 c2401n2 = this.f17552i;
        if (c2401n2 != null && c2401n2.p()) {
            return this.f17552i;
        }
        return null;
    }

    public final C2484z2 F() {
        g(this.f17551h);
        return this.f17551h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final P2 G() {
        return this.f17553j;
    }

    public final F3 H() {
        d(this.f17559p);
        return this.f17559p;
    }

    public final C2465w4 I() {
        d(this.f17558o);
        return this.f17558o;
    }

    public final F4 J() {
        d(this.f17564u);
        return this.f17564u;
    }

    public final C2418p5 K() {
        d(this.f17554k);
        return this.f17554k;
    }

    public final d6 L() {
        g(this.f17555l);
        return this.f17555l;
    }

    public final String M() {
        return this.f17545b;
    }

    public final String N() {
        return this.f17546c;
    }

    public final String O() {
        return this.f17547d;
    }

    public final String P() {
        return this.f17562s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void Q() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void R() {
        this.f17542G.incrementAndGet();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2478y3
    public final C2401n2 a() {
        h(this.f17552i);
        return this.f17552i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x00da, code lost:            if (r1.A() != false) goto L37;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(com.google.android.gms.internal.measurement.C2107c1 r12) {
        /*
            Method dump skipped, instructions count: 1084
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.S2.c(com.google.android.gms.internal.measurement.c1):void");
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2478y3
    public final P2 f() {
        h(this.f17553j);
        return this.f17553j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void i(String str, int i8, Throwable th, byte[] bArr, Map map) {
        if ((i8 == 200 || i8 == 204 || i8 == 304) && th == null) {
            F().f18163v.a(true);
            if (bArr != null && bArr.length != 0) {
                try {
                    JSONObject jSONObject = new JSONObject(new String(bArr));
                    String optString = jSONObject.optString("deeplink", "");
                    if (TextUtils.isEmpty(optString)) {
                        a().F().a("Deferred Deep Link is empty.");
                        return;
                    }
                    String optString2 = jSONObject.optString("gclid", "");
                    String optString3 = jSONObject.optString("gbraid", "");
                    String optString4 = jSONObject.optString("gad_source", "");
                    double optDouble = jSONObject.optDouble(CampaignEx.JSON_KEY_TIMESTAMP, 0.0d);
                    Bundle bundle = new Bundle();
                    if (Q6.a() && this.f17550g.q(G.f17271U0)) {
                        if (!L().L0(optString)) {
                            a().L().d("Deferred Deep Link validation failed. gclid, gbraid, deep link", optString2, optString3, optString);
                            return;
                        }
                        if (!TextUtils.isEmpty(optString3)) {
                            bundle.putString("gbraid", optString3);
                        }
                        if (!TextUtils.isEmpty(optString4)) {
                            bundle.putString("gad_source", optString4);
                        }
                    } else if (!L().L0(optString)) {
                        a().L().c("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                        return;
                    }
                    if (Q6.a()) {
                        this.f17550g.q(G.f17271U0);
                    }
                    bundle.putString("gclid", optString2);
                    bundle.putString("_cis", "ddp");
                    this.f17559p.b1("auto", "_cmp", bundle);
                    d6 L8 = L();
                    if (!TextUtils.isEmpty(optString) && L8.i0(optString, optDouble)) {
                        L8.w().sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                        return;
                    }
                    return;
                } catch (JSONException e8) {
                    a().G().b("Failed to parse the Deferred Deep Link response. exception", e8);
                    return;
                }
            }
            a().F().a("Deferred Deep Link response empty.");
            return;
        }
        a().L().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i8), th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(boolean z8) {
        this.f17536A = Boolean.valueOf(z8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k() {
        this.f17540E++;
    }

    public final boolean l() {
        if (this.f17536A != null && this.f17536A.booleanValue()) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if (u() == 0) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        f().k();
        return this.f17539D;
    }

    public final boolean o() {
        return TextUtils.isEmpty(this.f17545b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean p() {
        boolean z8;
        if (this.f17567x) {
            f().k();
            Boolean bool = this.f17568y;
            if (bool == null || this.f17569z == 0 || (bool != null && !bool.booleanValue() && Math.abs(this.f17557n.elapsedRealtime() - this.f17569z) > 1000)) {
                this.f17569z = this.f17557n.elapsedRealtime();
                boolean z9 = true;
                if (L().F0("android.permission.INTERNET") && L().F0("android.permission.ACCESS_NETWORK_STATE") && (X.e.a(this.f17544a).f() || this.f17550g.X() || (d6.d0(this.f17544a) && d6.e0(this.f17544a, false)))) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                Boolean valueOf = Boolean.valueOf(z8);
                this.f17568y = valueOf;
                if (valueOf.booleanValue()) {
                    if (!L().k0(B().G(), B().E()) && TextUtils.isEmpty(B().E())) {
                        z9 = false;
                    }
                    this.f17568y = Boolean.valueOf(z9);
                }
            }
            return this.f17568y.booleanValue();
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }

    public final boolean q() {
        return this.f17548e;
    }

    public final boolean r() {
        Bundle bundle;
        int i8;
        String str;
        f().k();
        h(s());
        String F8 = B().F();
        boolean z8 = false;
        if (!this.f17550g.U()) {
            a().K().a("ADID collection is disabled from Manifest. Skipping");
            return false;
        }
        Pair r8 = F().r(F8);
        if (!((Boolean) r8.second).booleanValue() && !TextUtils.isEmpty((CharSequence) r8.first)) {
            if (!s().t()) {
                a().L().a("Network is not available for Deferred Deep Link request. Skipping");
                return false;
            }
            StringBuilder sb = new StringBuilder();
            F4 J8 = J();
            J8.k();
            J8.s();
            if (!J8.k0() || J8.g().I0() >= 234200) {
                C3302b q02 = H().q0();
                if (q02 != null) {
                    bundle = q02.f34610a;
                } else {
                    bundle = null;
                }
                int i9 = 1;
                if (bundle == null) {
                    int i10 = this.f17541F;
                    this.f17541F = i10 + 1;
                    if (i10 < 10) {
                        z8 = true;
                    }
                    C2415p2 F9 = a().F();
                    if (z8) {
                        str = "Retrying.";
                    } else {
                        str = "Skipping.";
                    }
                    F9.b("Failed to retrieve DMA consent from the service, " + str + " retryCount", Integer.valueOf(this.f17541F));
                    return z8;
                }
                A3 c8 = A3.c(bundle, 100);
                sb.append("&gcs=");
                sb.append(c8.w());
                C2453v b9 = C2453v.b(bundle, 100);
                sb.append("&dma=");
                if (b9.h() == Boolean.FALSE) {
                    i8 = 0;
                } else {
                    i8 = 1;
                }
                sb.append(i8);
                if (!TextUtils.isEmpty(b9.i())) {
                    sb.append("&dma_cps=");
                    sb.append(b9.i());
                }
                if (C2453v.e(bundle) == Boolean.TRUE) {
                    i9 = 0;
                }
                sb.append("&npa=");
                sb.append(i9);
                a().K().b("Consent query parameters to Bow", sb);
            }
            d6 L8 = L();
            B();
            URL K8 = L8.K(106000L, F8, (String) r8.first, F().f18164w.a() - 1, sb.toString());
            if (K8 != null) {
                C2437s4 s8 = s();
                InterfaceC2430r4 interfaceC2430r4 = new InterfaceC2430r4() { // from class: com.google.android.gms.measurement.internal.V2
                    @Override // com.google.android.gms.measurement.internal.InterfaceC2430r4
                    public final void a(String str2, int i11, Throwable th, byte[] bArr, Map map) {
                        S2.this.i(str2, i11, th, bArr, map);
                    }
                };
                s8.k();
                s8.m();
                AbstractC1396p.l(K8);
                AbstractC1396p.l(interfaceC2430r4);
                s8.f().z(new RunnableC2451u4(s8, F8, K8, null, null, interfaceC2430r4));
            }
            return false;
        }
        a().K().a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
        return false;
    }

    public final void t(boolean z8) {
        f().k();
        this.f17539D = z8;
    }

    public final int u() {
        f().k();
        if (this.f17550g.W()) {
            return 1;
        }
        Boolean bool = this.f17538C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        if (!n()) {
            return 8;
        }
        Boolean P8 = F().P();
        if (P8 != null) {
            if (P8.booleanValue()) {
                return 0;
            }
            return 3;
        }
        Boolean E8 = this.f17550g.E("firebase_analytics_collection_enabled");
        if (E8 != null) {
            if (E8.booleanValue()) {
                return 0;
            }
            return 4;
        }
        Boolean bool2 = this.f17537B;
        if (bool2 != null) {
            if (bool2.booleanValue()) {
                return 0;
            }
            return 5;
        }
        if (this.f17536A == null || this.f17536A.booleanValue()) {
            return 0;
        }
        return 7;
    }

    public final C2474y v() {
        C2474y c2474y = this.f17560q;
        if (c2474y != null) {
            return c2474y;
        }
        throw new IllegalStateException("Component not created");
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2478y3
    public final Context w() {
        return this.f17544a;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2478y3
    public final V.d x() {
        return this.f17557n;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2478y3
    public final C2321c y() {
        return this.f17549f;
    }

    public final C2349g z() {
        return this.f17550g;
    }
}
