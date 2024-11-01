package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.measurement.w1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2277w1 {

    /* renamed from: a, reason: collision with root package name */
    private final E f17058a;

    /* renamed from: b, reason: collision with root package name */
    final Y2 f17059b;

    /* renamed from: c, reason: collision with root package name */
    final Y2 f17060c;

    /* renamed from: d, reason: collision with root package name */
    private final V4 f17061d;

    public C2277w1() {
        E e8 = new E();
        this.f17058a = e8;
        Y2 y22 = new Y2(null, e8);
        this.f17060c = y22;
        this.f17059b = y22.d();
        V4 v42 = new V4();
        this.f17061d = v42;
        y22.h("require", new M7(v42));
        v42.b("internal.platform", new Callable() { // from class: com.google.android.gms.internal.measurement.g1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new L7();
            }
        });
        y22.h("runtime.counter", new C2177k(Double.valueOf(0.0d)));
    }

    public final InterfaceC2243s a(Y2 y22, B2... b2Arr) {
        InterfaceC2243s interfaceC2243s = InterfaceC2243s.f16971b0;
        for (B2 b22 : b2Arr) {
            interfaceC2243s = Z3.a(b22);
            AbstractC2262u2.b(this.f17060c);
            if ((interfaceC2243s instanceof C2267v) || (interfaceC2243s instanceof C2251t)) {
                interfaceC2243s = this.f17058a.a(y22, interfaceC2243s);
            }
        }
        return interfaceC2243s;
    }

    public final void b(String str, Callable callable) {
        this.f17061d.b(str, callable);
    }
}
