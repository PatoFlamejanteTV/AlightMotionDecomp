package com.google.android.gms.measurement.internal;

import Q.AbstractC1396p;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.measurement.internal.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2349g extends AbstractC2464w3 {

    /* renamed from: b, reason: collision with root package name */
    private Boolean f17810b;

    /* renamed from: c, reason: collision with root package name */
    private String f17811c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC2363i f17812d;

    /* renamed from: e, reason: collision with root package name */
    private Boolean f17813e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2349g(S2 s22) {
        super(s22);
        this.f17812d = new InterfaceC2363i() { // from class: com.google.android.gms.measurement.internal.f
            @Override // com.google.android.gms.measurement.internal.InterfaceC2363i
            public final String h(String str, String str2) {
                return null;
            }
        };
    }

    public static long I() {
        return ((Long) G.f17294e.a(null)).longValue();
    }

    public static long K() {
        return ((Integer) G.f17315l.a(null)).intValue();
    }

    public static long P() {
        return ((Long) G.f17240F.a(null)).longValue();
    }

    public static long Q() {
        return ((Long) G.f17230A.a(null)).longValue();
    }

    private final String h(String str, String str2) {
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
            AbstractC1396p.l(str3);
            return str3;
        } catch (ClassNotFoundException e8) {
            a().G().b("Could not find SystemProperties class", e8);
            return str2;
        } catch (IllegalAccessException e9) {
            a().G().b("Could not access SystemProperties.get()", e9);
            return str2;
        } catch (NoSuchMethodException e10) {
            a().G().b("Could not find SystemProperties.get() method", e10);
            return str2;
        } catch (InvocationTargetException e11) {
            a().G().b("SystemProperties.get() threw an exception", e11);
            return str2;
        }
    }

    private final Bundle r() {
        try {
            if (w().getPackageManager() == null) {
                a().G().a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo c8 = X.e.a(w()).c(w().getPackageName(), 128);
            if (c8 == null) {
                a().G().a("Failed to load metadata: ApplicationInfo is null");
                return null;
            }
            return c8.metaData;
        } catch (PackageManager.NameNotFoundException e8) {
            a().G().b("Failed to load metadata: Package name not found", e8);
            return null;
        }
    }

    public final long A(String str, C2317b2 c2317b2) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) c2317b2.a(null)).longValue();
        }
        String h8 = this.f17812d.h(str, c2317b2.b());
        if (TextUtils.isEmpty(h8)) {
            return ((Long) c2317b2.a(null)).longValue();
        }
        try {
            return ((Long) c2317b2.a(Long.valueOf(Long.parseLong(h8)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) c2317b2.a(null)).longValue();
        }
    }

    public final l0.p B(String str, boolean z8) {
        Object obj;
        AbstractC1396p.f(str);
        Bundle r8 = r();
        if (r8 == null) {
            a().G().a("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = r8.get(str);
        }
        if (obj == null) {
            return l0.p.UNINITIALIZED;
        }
        if (Boolean.TRUE.equals(obj)) {
            return l0.p.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return l0.p.DENIED;
        }
        if (z8 && "eu_consent_policy".equals(obj)) {
            return l0.p.POLICY;
        }
        a().L().b("Invalid manifest metadata for", str);
        return l0.p.UNINITIALIZED;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long C(String str) {
        return A(str, G.f17285b);
    }

    public final String D(String str, C2317b2 c2317b2) {
        if (TextUtils.isEmpty(str)) {
            return (String) c2317b2.a(null);
        }
        return (String) c2317b2.a(this.f17812d.h(str, c2317b2.b()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Boolean E(String str) {
        AbstractC1396p.f(str);
        Bundle r8 = r();
        if (r8 == null) {
            a().G().a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (!r8.containsKey(str)) {
            return null;
        }
        return Boolean.valueOf(r8.getBoolean(str));
    }

    public final boolean F(String str, C2317b2 c2317b2) {
        return H(str, c2317b2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String G(String str) {
        return D(str, G.f17258O);
    }

    public final boolean H(String str, C2317b2 c2317b2) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) c2317b2.a(null)).booleanValue();
        }
        String h8 = this.f17812d.h(str, c2317b2.b());
        if (TextUtils.isEmpty(h8)) {
            return ((Boolean) c2317b2.a(null)).booleanValue();
        }
        return ((Boolean) c2317b2.a(Boolean.valueOf("1".equals(h8)))).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List J(java.lang.String r4) {
        /*
            r3 = this;
            Q.AbstractC1396p.f(r4)
            android.os.Bundle r0 = r3.r()
            r1 = 0
            if (r0 != 0) goto L19
            com.google.android.gms.measurement.internal.n2 r4 = r3.a()
            com.google.android.gms.measurement.internal.p2 r4 = r4.G()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.a(r0)
        L17:
            r4 = r1
            goto L28
        L19:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L20
            goto L17
        L20:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L28:
            if (r4 != 0) goto L2b
            return r1
        L2b:
            android.content.Context r0 = r3.w()     // Catch: android.content.res.Resources.NotFoundException -> L43
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L43
            int r4 = r4.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L43
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch: android.content.res.Resources.NotFoundException -> L43
            if (r4 != 0) goto L3e
            return r1
        L3e:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: android.content.res.Resources.NotFoundException -> L43
            return r4
        L43:
            r4 = move-exception
            com.google.android.gms.measurement.internal.n2 r0 = r3.a()
            com.google.android.gms.measurement.internal.p2 r0 = r0.G()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.b(r2, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2349g.J(java.lang.String):java.util.List");
    }

    public final void L(String str) {
        this.f17811c = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean M(String str) {
        return H(str, G.f17256N);
    }

    public final boolean N(String str) {
        return "1".equals(this.f17812d.h(str, "gaia_collection_enabled"));
    }

    public final boolean O(String str) {
        return "1".equals(this.f17812d.h(str, "measurement.event_sampling_enabled"));
    }

    public final String R() {
        return h("debug.firebase.analytics.app", "");
    }

    public final String S() {
        return h("debug.deferred.deeplink", "");
    }

    public final String T() {
        return this.f17811c;
    }

    public final boolean U() {
        Boolean E8 = E("google_analytics_adid_collection_enabled");
        if (E8 != null && !E8.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean V() {
        Boolean E8 = E("google_analytics_automatic_screen_reporting_enabled");
        if (E8 != null && !E8.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean W() {
        Boolean E8 = E("firebase_analytics_collection_deactivated");
        if (E8 != null && E8.booleanValue()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean X() {
        if (this.f17810b == null) {
            Boolean E8 = E("app_measurement_lite");
            this.f17810b = E8;
            if (E8 == null) {
                this.f17810b = Boolean.FALSE;
            }
        }
        if (!this.f17810b.booleanValue() && this.f18099a.q()) {
            return false;
        }
        return true;
    }

    public final boolean Y() {
        boolean z8;
        if (this.f17813e == null) {
            synchronized (this) {
                try {
                    if (this.f17813e == null) {
                        ApplicationInfo applicationInfo = w().getApplicationInfo();
                        String a9 = V.m.a();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            if (str != null && str.equals(a9)) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            this.f17813e = Boolean.valueOf(z8);
                        }
                        if (this.f17813e == null) {
                            this.f17813e = Boolean.TRUE;
                            a().G().a("My process not in the list of running processes");
                        }
                    }
                } finally {
                }
            }
        }
        return this.f17813e.booleanValue();
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

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    public final double l(String str, C2317b2 c2317b2) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) c2317b2.a(null)).doubleValue();
        }
        String h8 = this.f17812d.h(str, c2317b2.b());
        if (TextUtils.isEmpty(h8)) {
            return ((Double) c2317b2.a(null)).doubleValue();
        }
        try {
            return ((Double) c2317b2.a(Double.valueOf(Double.parseDouble(h8)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) c2317b2.a(null)).doubleValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int m(String str) {
        return n(str, G.f17250K, 500, 2000);
    }

    public final int n(String str, C2317b2 c2317b2, int i8, int i9) {
        return Math.max(Math.min(t(str, c2317b2), i9), i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int o(String str, boolean z8) {
        if (!z8) {
            return 500;
        }
        return n(str, G.f17270U, 100, 500);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p(InterfaceC2363i interfaceC2363i) {
        this.f17812d = interfaceC2363i;
    }

    public final boolean q(C2317b2 c2317b2) {
        return H(null, c2317b2);
    }

    public final int s(String str) {
        return n(str, G.f17252L, 25, 100);
    }

    public final int t(String str, C2317b2 c2317b2) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) c2317b2.a(null)).intValue();
        }
        String h8 = this.f17812d.h(str, c2317b2.b());
        if (TextUtils.isEmpty(h8)) {
            return ((Integer) c2317b2.a(null)).intValue();
        }
        try {
            return ((Integer) c2317b2.a(Integer.valueOf(Integer.parseInt(h8)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) c2317b2.a(null)).intValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int u(String str, boolean z8) {
        return Math.max(o(str, z8), 256);
    }

    public final int v() {
        if (g().c0(201500000, true)) {
            return 100;
        }
        return 25;
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

    public final int z(String str) {
        return t(str, G.f17325p);
    }
}
