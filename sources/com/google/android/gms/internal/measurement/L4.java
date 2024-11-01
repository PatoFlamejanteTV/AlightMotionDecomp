package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class L4 implements InterfaceC2201m5 {

    /* renamed from: b, reason: collision with root package name */
    private static final U4 f16360b = new K4();

    /* renamed from: a, reason: collision with root package name */
    private final U4 f16361a;

    public L4() {
        this(new M4(C2248s4.c(), f16360b));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2201m5
    public final InterfaceC2210n5 a(Class cls) {
        AbstractC2146g4 abstractC2146g4;
        AbstractC2226p5.o(cls);
        W4 a9 = this.f16361a.a(cls);
        if (a9.b()) {
            return C2111c5.i(AbstractC2226p5.f(), AbstractC2155h4.a(), a9.w());
        }
        InterfaceC2129e5 a10 = AbstractC2147g5.a();
        H4 a11 = J4.a();
        D5 f8 = AbstractC2226p5.f();
        if (N4.f16408a[a9.x().ordinal()] != 1) {
            abstractC2146g4 = AbstractC2155h4.a();
        } else {
            abstractC2146g4 = null;
        }
        return C2102b5.m(cls, a9, a10, a11, f8, abstractC2146g4, S4.a());
    }

    private L4(U4 u42) {
        this.f16361a = (U4) AbstractC2256t4.f(u42, "messageInfoFactory");
    }
}
