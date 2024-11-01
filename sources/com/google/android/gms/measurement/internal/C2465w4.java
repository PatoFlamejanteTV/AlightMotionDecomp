package com.google.android.gms.measurement.internal;

import Q.AbstractC1396p;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.mbridge.msdk.MBridgeConstans;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.w4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2465w4 extends AbstractC2477y2 {

    /* renamed from: c, reason: collision with root package name */
    private volatile C2472x4 f18100c;

    /* renamed from: d, reason: collision with root package name */
    private volatile C2472x4 f18101d;

    /* renamed from: e, reason: collision with root package name */
    protected C2472x4 f18102e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f18103f;

    /* renamed from: g, reason: collision with root package name */
    private Activity f18104g;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f18105h;

    /* renamed from: i, reason: collision with root package name */
    private volatile C2472x4 f18106i;

    /* renamed from: j, reason: collision with root package name */
    private C2472x4 f18107j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f18108k;

    /* renamed from: l, reason: collision with root package name */
    private final Object f18109l;

    public C2465w4(S2 s22) {
        super(s22);
        this.f18109l = new Object();
        this.f18103f = new ConcurrentHashMap();
    }

    private final String D(Class cls, String str) {
        String str2;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return str;
        }
        String[] split = canonicalName.split("\\.");
        if (split.length > 0) {
            str2 = split[split.length - 1];
        } else {
            str2 = "";
        }
        if (str2.length() > b().o(null, false)) {
            return str2.substring(0, b().o(null, false));
        }
        return str2;
    }

    private final void G(Activity activity, C2472x4 c2472x4, boolean z8) {
        C2472x4 c2472x42;
        C2472x4 c2472x43;
        String str;
        if (this.f18100c == null) {
            c2472x42 = this.f18101d;
        } else {
            c2472x42 = this.f18100c;
        }
        C2472x4 c2472x44 = c2472x42;
        if (c2472x4.f18121b == null) {
            if (activity != null) {
                str = D(activity.getClass(), "Activity");
            } else {
                str = null;
            }
            c2472x43 = new C2472x4(c2472x4.f18120a, str, c2472x4.f18122c, c2472x4.f18124e, c2472x4.f18125f);
        } else {
            c2472x43 = c2472x4;
        }
        this.f18101d = this.f18100c;
        this.f18100c = c2472x43;
        f().D(new RunnableC2479y4(this, c2472x43, c2472x44, x().elapsedRealtime(), z8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void J(C2465w4 c2465w4, Bundle bundle, C2472x4 c2472x4, C2472x4 c2472x42, long j8) {
        if (bundle != null) {
            bundle.remove("screen_name");
            bundle.remove("screen_class");
        }
        c2465w4.N(c2472x4, c2472x42, j8, true, c2465w4.g().F(null, "screen_view", bundle, null, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.os.BaseBundle, long] */
    public final void N(C2472x4 c2472x4, C2472x4 c2472x42, long j8, boolean z8, Bundle bundle) {
        boolean z9;
        Bundle bundle2;
        String str;
        long j9;
        k();
        boolean z10 = false;
        if (c2472x42 != null && c2472x42.f18122c == c2472x4.f18122c && Objects.equals(c2472x42.f18121b, c2472x4.f18121b) && Objects.equals(c2472x42.f18120a, c2472x4.f18120a)) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z8 && this.f18102e != null) {
            z10 = true;
        }
        if (z9) {
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            d6.X(c2472x4, bundle2, true);
            if (c2472x42 != null) {
                String str2 = c2472x42.f18120a;
                if (str2 != null) {
                    "_pn".putString("_pn", str2);
                }
                String str3 = c2472x42.f18121b;
                if (str3 != null) {
                    "_pc".putString("_pc", str3);
                }
                ?? r8 = c2472x42.f18122c;
                r8.putLong("_pi", r8);
            }
            ?? r82 = 0;
            if (z10) {
                long a9 = r().f18015f.a(j8);
                if (a9 > 0) {
                    g().M(null, a9);
                }
            }
            if (!b().V()) {
                r82.putLong("_mst", 1L);
            }
            if (c2472x4.f18124e) {
                str = MBridgeConstans.DYNAMIC_VIEW_WX_APP;
            } else {
                str = "auto";
            }
            String str4 = str;
            long currentTimeMillis = x().currentTimeMillis();
            if (c2472x4.f18124e) {
                currentTimeMillis = c2472x4.f18125f;
                if (currentTimeMillis != 0) {
                    j9 = currentTimeMillis;
                    o().c0(str4, "_vs", j9, null);
                }
            }
            j9 = currentTimeMillis;
            o().c0(str4, "_vs", j9, null);
        }
        if (z10) {
            O(this.f18102e, true, j8);
        }
        this.f18102e = c2472x4;
        if (c2472x4.f18124e) {
            this.f18107j = c2472x4;
        }
        q().J(c2472x4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(C2472x4 c2472x4, boolean z8, long j8) {
        boolean z9;
        l().s(x().elapsedRealtime());
        if (c2472x4 != null && c2472x4.f18123d) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (r().E(z9, z8, j8) && c2472x4 != null) {
            c2472x4.f18123d = false;
        }
    }

    private final C2472x4 T(Activity activity) {
        AbstractC1396p.l(activity);
        C2472x4 c2472x4 = (C2472x4) this.f18103f.get(Integer.valueOf(activity.hashCode()));
        if (c2472x4 == null) {
            C2472x4 c2472x42 = new C2472x4(null, D(activity.getClass(), "Activity"), g().R0());
            this.f18103f.put(Integer.valueOf(activity.hashCode()), c2472x42);
            c2472x4 = c2472x42;
        }
        if (this.f18106i != null) {
            return this.f18106i;
        }
        return c2472x4;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2477y2
    protected final boolean A() {
        return false;
    }

    public final C2472x4 C(boolean z8) {
        s();
        k();
        if (!z8) {
            return this.f18102e;
        }
        C2472x4 c2472x4 = this.f18102e;
        if (c2472x4 != null) {
            return c2472x4;
        }
        return this.f18107j;
    }

    public final void E(Activity activity) {
        synchronized (this.f18109l) {
            try {
                if (activity == this.f18104g) {
                    this.f18104g = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!b().V()) {
            return;
        }
        this.f18103f.remove(Integer.valueOf(activity.hashCode()));
    }

    public final void F(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!b().V() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f18103f.put(Integer.valueOf(activity.hashCode()), new C2472x4(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final void H(Activity activity, String str, String str2) {
        String str3;
        if (!b().V()) {
            a().M().a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        C2472x4 c2472x4 = this.f18100c;
        if (c2472x4 == null) {
            a().M().a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if (this.f18103f.get(Integer.valueOf(activity.hashCode())) == null) {
            a().M().a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = D(activity.getClass(), "Activity");
        }
        boolean equals = Objects.equals(c2472x4.f18121b, str2);
        boolean equals2 = Objects.equals(c2472x4.f18120a, str);
        if (equals && equals2) {
            a().M().a("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > b().o(null, false))) {
            a().M().b("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > b().o(null, false))) {
            a().M().b("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        C2415p2 K8 = a().K();
        if (str == null) {
            str3 = "null";
        } else {
            str3 = str;
        }
        K8.c("Setting current screen to name, class", str3, str2);
        C2472x4 c2472x42 = new C2472x4(str, str2, g().R0());
        this.f18103f.put(Integer.valueOf(activity.hashCode()), c2472x42);
        G(activity, c2472x42, true);
    }

    public final void I(Bundle bundle, long j8) {
        String str;
        String str2;
        String str3;
        C2472x4 c2472x4;
        synchronized (this.f18109l) {
            try {
                if (!this.f18108k) {
                    a().M().a("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String str4 = null;
                if (bundle != null) {
                    String string = bundle.getString("screen_name");
                    if (string != null && (string.length() <= 0 || string.length() > b().o(null, false))) {
                        a().M().b("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                        return;
                    }
                    String string2 = bundle.getString("screen_class");
                    if (string2 != null && (string2.length() <= 0 || string2.length() > b().o(null, false))) {
                        a().M().b("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                        return;
                    } else {
                        str = string;
                        str4 = string2;
                    }
                } else {
                    str = null;
                }
                if (str4 == null) {
                    Activity activity = this.f18104g;
                    if (activity != null) {
                        str4 = D(activity.getClass(), "Activity");
                    } else {
                        str4 = "Activity";
                    }
                }
                String str5 = str4;
                C2472x4 c2472x42 = this.f18100c;
                if (this.f18105h && c2472x42 != null) {
                    this.f18105h = false;
                    boolean equals = Objects.equals(c2472x42.f18121b, str5);
                    boolean equals2 = Objects.equals(c2472x42.f18120a, str);
                    if (equals && equals2) {
                        a().M().a("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                C2415p2 K8 = a().K();
                if (str == null) {
                    str2 = "null";
                } else {
                    str2 = str;
                }
                if (str5 == null) {
                    str3 = "null";
                } else {
                    str3 = str5;
                }
                K8.c("Logging screen view with name, class", str2, str3);
                if (this.f18100c == null) {
                    c2472x4 = this.f18101d;
                } else {
                    c2472x4 = this.f18100c;
                }
                C2472x4 c2472x43 = c2472x4;
                C2472x4 c2472x44 = new C2472x4(str, str5, g().R0(), true, j8);
                this.f18100c = c2472x44;
                this.f18101d = c2472x43;
                this.f18106i = c2472x44;
                f().D(new RunnableC2486z4(this, bundle, c2472x44, c2472x43, x().elapsedRealtime()));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C2472x4 P() {
        return this.f18100c;
    }

    public final void Q(Activity activity) {
        synchronized (this.f18109l) {
            this.f18108k = false;
            this.f18105h = true;
        }
        long elapsedRealtime = x().elapsedRealtime();
        if (!b().V()) {
            this.f18100c = null;
            f().D(new A4(this, elapsedRealtime));
        } else {
            C2472x4 T8 = T(activity);
            this.f18101d = this.f18100c;
            this.f18100c = null;
            f().D(new D4(this, T8, elapsedRealtime));
        }
    }

    public final void R(Activity activity, Bundle bundle) {
        C2472x4 c2472x4;
        if (!b().V() || bundle == null || (c2472x4 = (C2472x4) this.f18103f.get(Integer.valueOf(activity.hashCode()))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", c2472x4.f18122c);
        bundle2.putString("name", c2472x4.f18120a);
        bundle2.putString("referrer_name", c2472x4.f18121b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    public final void S(Activity activity) {
        synchronized (this.f18109l) {
            this.f18108k = true;
            if (activity != this.f18104g) {
                synchronized (this.f18109l) {
                    this.f18104g = activity;
                    this.f18105h = false;
                }
                if (b().V()) {
                    this.f18106i = null;
                    f().D(new C4(this));
                }
            }
        }
        if (!b().V()) {
            this.f18100c = this.f18106i;
            f().D(new B4(this));
        } else {
            G(activity, T(activity), false);
            C2474y l8 = l();
            l8.f().D(new Y(l8, l8.x().elapsedRealtime()));
        }
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
