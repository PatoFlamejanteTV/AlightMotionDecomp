package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.f7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2140f7 implements InterfaceC2113c7 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC2163i3 f16724a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC2163i3 f16725b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC2163i3 f16726c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC2163i3 f16727d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC2163i3 f16728e;

    /* renamed from: f, reason: collision with root package name */
    private static final AbstractC2163i3 f16729f;

    static {
        C2232q3 e8 = new C2232q3(AbstractC2172j3.a("com.google.android.gms.measurement")).f().e();
        f16724a = e8.d("measurement.test.boolean_flag", false);
        f16725b = e8.b("measurement.test.cached_long_flag", -1L);
        f16726c = e8.a("measurement.test.double_flag", -3.0d);
        f16727d = e8.b("measurement.test.int_flag", -2L);
        f16728e = e8.b("measurement.test.long_flag", -1L);
        f16729f = e8.c("measurement.test.string_flag", "---");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2113c7
    public final boolean A() {
        return ((Boolean) f16724a.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2113c7
    public final long b() {
        return ((Long) f16727d.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2113c7
    public final double w() {
        return ((Double) f16726c.e()).doubleValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2113c7
    public final long x() {
        return ((Long) f16725b.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2113c7
    public final long y() {
        return ((Long) f16728e.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2113c7
    public final String z() {
        return (String) f16729f.e();
    }
}
