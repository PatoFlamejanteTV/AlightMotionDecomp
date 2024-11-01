package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.InterfaceC2984b;
import j$.time.temporal.w;

/* loaded from: classes2.dex */
final class o implements j$.time.temporal.o {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2984b f32925a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ j$.time.temporal.o f32926b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ j$.time.chrono.m f32927c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ZoneId f32928d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(InterfaceC2984b interfaceC2984b, j$.time.temporal.o oVar, j$.time.chrono.m mVar, ZoneId zoneId) {
        this.f32925a = interfaceC2984b;
        this.f32926b = oVar;
        this.f32927c = mVar;
        this.f32928d = zoneId;
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        InterfaceC2984b interfaceC2984b = this.f32925a;
        return (interfaceC2984b == null || !rVar.v()) ? this.f32926b.f(rVar) : interfaceC2984b.f(rVar);
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ int j(j$.time.temporal.r rVar) {
        return j$.time.temporal.n.a(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final w m(j$.time.temporal.r rVar) {
        InterfaceC2984b interfaceC2984b = this.f32925a;
        return (interfaceC2984b == null || !rVar.v()) ? this.f32926b.m(rVar) : interfaceC2984b.m(rVar);
    }

    @Override // j$.time.temporal.o
    public final long r(j$.time.temporal.r rVar) {
        InterfaceC2984b interfaceC2984b = this.f32925a;
        return (interfaceC2984b == null || !rVar.v()) ? this.f32926b.r(rVar) : interfaceC2984b.r(rVar);
    }

    public final String toString() {
        String str;
        String str2 = "";
        j$.time.chrono.m mVar = this.f32927c;
        if (mVar != null) {
            str = " with chronology " + mVar;
        } else {
            str = "";
        }
        ZoneId zoneId = this.f32928d;
        if (zoneId != null) {
            str2 = " with zone " + zoneId;
        }
        return this.f32926b + str + str2;
    }

    @Override // j$.time.temporal.o
    public final Object u(j$.time.temporal.t tVar) {
        return tVar == j$.time.temporal.n.e() ? this.f32927c : tVar == j$.time.temporal.n.k() ? this.f32928d : tVar == j$.time.temporal.n.i() ? this.f32926b.u(tVar) : tVar.a(this);
    }
}
