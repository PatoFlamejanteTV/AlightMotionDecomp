package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* renamed from: com.google.android.gms.measurement.internal.p5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2418p5 extends AbstractC2477y2 {

    /* renamed from: c, reason: collision with root package name */
    private Handler f18012c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f18013d;

    /* renamed from: e, reason: collision with root package name */
    protected final C2466w5 f18014e;

    /* renamed from: f, reason: collision with root package name */
    protected final C2452u5 f18015f;

    /* renamed from: g, reason: collision with root package name */
    private final C2445t5 f18016g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2418p5(S2 s22) {
        super(s22);
        this.f18013d = true;
        this.f18014e = new C2466w5(this);
        this.f18015f = new C2452u5(this);
        this.f18016g = new C2445t5(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void C(C2418p5 c2418p5, long j8) {
        c2418p5.k();
        c2418p5.G();
        c2418p5.a().K().b("Activity paused, time", Long.valueOf(j8));
        c2418p5.f18016g.b(j8);
        if (c2418p5.b().V()) {
            c2418p5.f18015f.e(j8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G() {
        k();
        if (this.f18012c == null) {
            this.f18012c = new com.google.android.gms.internal.measurement.N0(Looper.getMainLooper());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void I(C2418p5 c2418p5, long j8) {
        c2418p5.k();
        c2418p5.G();
        c2418p5.a().K().b("Activity resumed, time", Long.valueOf(j8));
        if (c2418p5.b().q(G.f17261P0)) {
            if (c2418p5.b().V() || c2418p5.f18013d) {
                c2418p5.f18015f.f(j8);
            }
        } else if (c2418p5.b().V() || c2418p5.e().f18162u.b()) {
            c2418p5.f18015f.f(j8);
        }
        c2418p5.f18016g.a();
        C2466w5 c2466w5 = c2418p5.f18014e;
        c2466w5.f18110a.k();
        if (c2466w5.f18110a.f18099a.m()) {
            c2466w5.b(c2466w5.f18110a.x().currentTimeMillis(), false);
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2477y2
    protected final boolean A() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void D(boolean z8) {
        k();
        this.f18013d = z8;
    }

    public final boolean E(boolean z8, boolean z9, long j8) {
        return this.f18015f.d(z8, z9, j8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean F() {
        k();
        return this.f18013d;
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
