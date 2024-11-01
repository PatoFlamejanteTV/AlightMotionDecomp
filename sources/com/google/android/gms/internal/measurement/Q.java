package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
final class Q implements P {

    /* renamed from: a, reason: collision with root package name */
    private final Y2 f16424a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16425b;

    public Q(Y2 y22, String str) {
        this.f16424a = y22;
        this.f16425b = str;
    }

    @Override // com.google.android.gms.internal.measurement.P
    public final Y2 a(InterfaceC2243s interfaceC2243s) {
        Y2 d8 = this.f16424a.d();
        d8.e(this.f16425b, interfaceC2243s);
        return d8;
    }
}
