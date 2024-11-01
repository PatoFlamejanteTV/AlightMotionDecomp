package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.r0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2236r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC2236r0 f16953a;

    /* renamed from: b, reason: collision with root package name */
    static final AbstractC2236r0 f16954b;

    static {
        AbstractC2229q0 b9 = new C2160i0().e("").c(false).b(EnumC2252t0.ALL_CHECKS);
        EnumC2244s0 enumC2244s0 = EnumC2244s0.READ_AND_WRITE;
        f16953a = b9.a(enumC2244s0).d();
        f16954b = new C2160i0().e("").c(false).b(EnumC2252t0.NO_CHECKS).a(enumC2244s0).d();
        new C2160i0().e("").c(false).b(EnumC2252t0.SKIP_COMPLIANCE_CHECK).a(enumC2244s0).d();
    }

    public abstract InterfaceC2151h0 a();

    public abstract InterfaceC2142g0 b();

    public abstract EnumC2252t0 c();

    public abstract EnumC2244s0 d();

    public abstract String e();

    public abstract boolean f();
}
