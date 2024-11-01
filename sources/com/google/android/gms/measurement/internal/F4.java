package com.google.android.gms.measurement.internal;

import N.AbstractC1349l;
import Q.AbstractC1396p;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C2148g6;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import l0.C3302b;
import l0.InterfaceC3306f;

/* loaded from: classes3.dex */
public final class F4 extends AbstractC2477y2 {

    /* renamed from: c, reason: collision with root package name */
    private final ServiceConnectionC2334d5 f17222c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC3306f f17223d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Boolean f17224e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC2439t f17225f;

    /* renamed from: g, reason: collision with root package name */
    private final C2480y5 f17226g;

    /* renamed from: h, reason: collision with root package name */
    private final List f17227h;

    /* renamed from: i, reason: collision with root package name */
    private final AbstractC2439t f17228i;

    /* JADX INFO: Access modifiers changed from: protected */
    public F4(S2 s22) {
        super(s22);
        this.f17227h = new ArrayList();
        this.f17226g = new C2480y5(s22.x());
        this.f17222c = new ServiceConnectionC2334d5(this);
        this.f17225f = new G4(this, s22);
        this.f17228i = new T4(this, s22);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void K(F4 f42, ComponentName componentName) {
        f42.k();
        if (f42.f17223d != null) {
            f42.f17223d = null;
            f42.a().K().b("Disconnected from device MeasurementService", componentName);
            f42.k();
            f42.Z();
        }
    }

    private final void N(Runnable runnable) {
        k();
        if (g0()) {
            runnable.run();
        } else {
            if (this.f17227h.size() >= 1000) {
                a().G().a("Discarding data. Max runnable queue size reached");
                return;
            }
            this.f17227h.add(runnable);
            this.f17228i.b(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
            Z();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l0() {
        k();
        a().K().b("Processing queued up service tasks", Integer.valueOf(this.f17227h.size()));
        Iterator it = this.f17227h.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e8) {
                a().G().b("Task exception while flushing queue", e8);
            }
        }
        this.f17227h.clear();
        this.f17228i.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m0() {
        k();
        this.f17226g.c();
        this.f17225f.b(((Long) G.f17254M.a(null)).longValue());
    }

    private final M5 p0(boolean z8) {
        String str;
        C2352g2 m8 = m();
        if (z8) {
            str = a().O();
        } else {
            str = null;
        }
        return m8.B(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void r0(F4 f42) {
        f42.k();
        if (f42.g0()) {
            f42.a().K().a("Inactivity, disconnecting from the service");
            f42.a0();
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2477y2
    protected final boolean A() {
        return false;
    }

    public final void C(Bundle bundle) {
        k();
        s();
        N(new S4(this, p0(false), bundle));
    }

    public final void D(com.google.android.gms.internal.measurement.U0 u02) {
        k();
        s();
        N(new P4(this, p0(false), u02));
    }

    public final void E(com.google.android.gms.internal.measurement.U0 u02, E e8, String str) {
        k();
        s();
        if (g().r(AbstractC1349l.f6370a) != 0) {
            a().L().a("Not bundling data. Service unavailable or out of date");
            g().V(u02, new byte[0]);
        } else {
            N(new V4(this, e8, str, u02));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void F(com.google.android.gms.internal.measurement.U0 u02, String str, String str2) {
        k();
        s();
        N(new RunnableC2320b5(this, str, str2, p0(false), u02));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void G(com.google.android.gms.internal.measurement.U0 u02, String str, String str2, boolean z8) {
        k();
        s();
        N(new I4(this, str, str2, p0(false), z8, u02));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void H(C2335e c2335e) {
        AbstractC1396p.l(c2335e);
        k();
        s();
        N(new Z4(this, true, p0(true), n().E(c2335e), new C2335e(c2335e), c2335e));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void I(E e8, String str) {
        AbstractC1396p.l(e8);
        k();
        s();
        N(new W4(this, true, p0(true), n().F(e8), e8, str));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void J(C2472x4 c2472x4) {
        k();
        s();
        N(new Q4(this, c2472x4));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void M(Y5 y52) {
        k();
        s();
        N(new J4(this, p0(true), n().G(y52), y52));
    }

    public final void O(AtomicReference atomicReference) {
        k();
        s();
        N(new L4(this, atomicReference, p0(false)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void P(AtomicReference atomicReference, Bundle bundle) {
        k();
        s();
        N(new K4(this, atomicReference, p0(false), bundle));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void Q(AtomicReference atomicReference, String str, String str2, String str3) {
        k();
        s();
        N(new Y4(this, atomicReference, str, str2, str3, p0(false)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void R(AtomicReference atomicReference, String str, String str2, String str3, boolean z8) {
        k();
        s();
        N(new RunnableC2313a5(this, atomicReference, str, str2, str3, p0(false), z8));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void S(InterfaceC3306f interfaceC3306f) {
        k();
        AbstractC1396p.l(interfaceC3306f);
        this.f17223d = interfaceC3306f;
        m0();
        l0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013a A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void T(l0.InterfaceC3306f r37, R.a r38, com.google.android.gms.measurement.internal.M5 r39) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.F4.T(l0.f, R.a, com.google.android.gms.measurement.internal.M5):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void U(boolean z8) {
        k();
        s();
        if ((!C2148g6.a() || !b().q(G.f17279Y0)) && z8) {
            n().H();
        }
        if (i0()) {
            N(new X4(this, p0(false)));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final C3302b V() {
        k();
        s();
        InterfaceC3306f interfaceC3306f = this.f17223d;
        if (interfaceC3306f == null) {
            Z();
            a().F().a("Failed to get consents; not connected to service yet.");
            return null;
        }
        M5 p02 = p0(false);
        AbstractC1396p.l(p02);
        try {
            C3302b b02 = interfaceC3306f.b0(p02);
            m0();
            return b02;
        } catch (RemoteException e8) {
            a().G().b("Failed to get consents; remote exception", e8);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Boolean W() {
        return this.f17224e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void X() {
        k();
        s();
        N(new R4(this, p0(true)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void Y() {
        k();
        s();
        M5 p02 = p0(true);
        n().I();
        N(new O4(this, p02));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void Z() {
        k();
        s();
        if (g0()) {
            return;
        }
        if (k0()) {
            this.f17222c.a();
            return;
        }
        if (!b().X()) {
            List<ResolveInfo> queryIntentServices = w().getPackageManager().queryIntentServices(new Intent().setClassName(w(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                Intent intent = new Intent("com.google.android.gms.measurement.START");
                intent.setComponent(new ComponentName(w(), "com.google.android.gms.measurement.AppMeasurementService"));
                this.f17222c.b(intent);
                return;
            }
            a().G().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3, com.google.android.gms.measurement.internal.InterfaceC2478y3
    public final /* bridge */ /* synthetic */ C2401n2 a() {
        return super.a();
    }

    public final void a0() {
        k();
        s();
        this.f17222c.d();
        try {
            U.b.b().c(w(), this.f17222c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f17223d = null;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ C2349g b() {
        return super.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void b0() {
        InterfaceC3306f interfaceC3306f = this.f17223d;
        if (interfaceC3306f == null) {
            a().G().a("Failed to send Dma consent settings to service");
            return;
        }
        try {
            M5 p02 = p0(false);
            AbstractC1396p.l(p02);
            interfaceC3306f.i0(p02);
            m0();
        } catch (RemoteException e8) {
            a().G().b("Failed to send Dma consent settings to the service", e8);
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ C2467x c() {
        return super.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void c0() {
        InterfaceC3306f interfaceC3306f = this.f17223d;
        if (interfaceC3306f == null) {
            a().G().a("Failed to send storage consent settings to service");
            return;
        }
        try {
            M5 p02 = p0(false);
            AbstractC1396p.l(p02);
            interfaceC3306f.a0(p02);
            m0();
        } catch (RemoteException e8) {
            a().G().b("Failed to send storage consent settings to the service", e8);
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ C2359h2 d() {
        return super.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d0() {
        k();
        s();
        M5 p02 = p0(false);
        n().H();
        N(new N4(this, p02));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ C2484z2 e() {
        return super.e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e0() {
        k();
        s();
        N(new Runnable() { // from class: com.google.android.gms.measurement.internal.H4
            @Override // java.lang.Runnable
            public final void run() {
                F4.this.b0();
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3, com.google.android.gms.measurement.internal.InterfaceC2478y3
    public final /* bridge */ /* synthetic */ P2 f() {
        return super.f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void f0() {
        k();
        s();
        N(new U4(this, p0(true)));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ d6 g() {
        return super.g();
    }

    public final boolean g0() {
        k();
        s();
        if (this.f17223d != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean h0() {
        k();
        s();
        if (!k0() || g().I0() >= 200900) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2309a1, com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean i0() {
        k();
        s();
        if (!k0() || g().I0() >= ((Integer) G.f17336u0.a(null)).intValue()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2309a1, com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean j0() {
        k();
        s();
        if (!k0() || g().I0() >= 241200) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2309a1, com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean k0() {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.F4.k0():boolean");
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

    /* JADX INFO: Access modifiers changed from: protected */
    public final void o0(boolean z8) {
        k();
        s();
        if ((!C2148g6.a() || !b().q(G.f17279Y0)) && z8) {
            n().H();
        }
        N(new Runnable() { // from class: com.google.android.gms.measurement.internal.E4
            @Override // java.lang.Runnable
            public final void run() {
                F4.this.c0();
            }
        });
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
