package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
final class N implements P {

    /* renamed from: a, reason: collision with root package name */
    private final Y2 f16402a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16403b;

    public N(Y2 y22, String str) {
        this.f16402a = y22;
        this.f16403b = str;
    }

    @Override // com.google.android.gms.internal.measurement.P
    public final Y2 a(InterfaceC2243s interfaceC2243s) {
        Y2 d8 = this.f16402a.d();
        d8.f(this.f16403b, interfaceC2243s);
        return d8;
    }
}
