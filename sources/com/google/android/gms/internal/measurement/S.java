package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes3.dex */
public final class S extends A {
    /* JADX INFO: Access modifiers changed from: protected */
    public S() {
        this.f16219a.add(Z.ADD);
        this.f16219a.add(Z.DIVIDE);
        this.f16219a.add(Z.MODULUS);
        this.f16219a.add(Z.MULTIPLY);
        this.f16219a.add(Z.NEGATE);
        this.f16219a.add(Z.POST_DECREMENT);
        this.f16219a.add(Z.POST_INCREMENT);
        this.f16219a.add(Z.PRE_DECREMENT);
        this.f16219a.add(Z.PRE_INCREMENT);
        this.f16219a.add(Z.SUBTRACT);
    }

    @Override // com.google.android.gms.internal.measurement.A
    public final InterfaceC2243s b(String str, Y2 y22, List list) {
        switch (V.f16470a[AbstractC2262u2.c(str).ordinal()]) {
            case 1:
                AbstractC2262u2.f(Z.ADD, 2, list);
                InterfaceC2243s b9 = y22.b((InterfaceC2243s) list.get(0));
                InterfaceC2243s b10 = y22.b((InterfaceC2243s) list.get(1));
                if (!(b9 instanceof InterfaceC2195m) && !(b9 instanceof C2259u) && !(b10 instanceof InterfaceC2195m) && !(b10 instanceof C2259u)) {
                    return new C2177k(Double.valueOf(b9.z().doubleValue() + b10.z().doubleValue()));
                }
                return new C2259u(b9.A() + b10.A());
            case 2:
                AbstractC2262u2.f(Z.DIVIDE, 2, list);
                return new C2177k(Double.valueOf(y22.b((InterfaceC2243s) list.get(0)).z().doubleValue() / y22.b((InterfaceC2243s) list.get(1)).z().doubleValue()));
            case 3:
                AbstractC2262u2.f(Z.MODULUS, 2, list);
                return new C2177k(Double.valueOf(y22.b((InterfaceC2243s) list.get(0)).z().doubleValue() % y22.b((InterfaceC2243s) list.get(1)).z().doubleValue()));
            case 4:
                AbstractC2262u2.f(Z.MULTIPLY, 2, list);
                return new C2177k(Double.valueOf(y22.b((InterfaceC2243s) list.get(0)).z().doubleValue() * y22.b((InterfaceC2243s) list.get(1)).z().doubleValue()));
            case 5:
                AbstractC2262u2.f(Z.NEGATE, 1, list);
                return new C2177k(Double.valueOf(y22.b((InterfaceC2243s) list.get(0)).z().doubleValue() * (-1.0d)));
            case 6:
            case 7:
                AbstractC2262u2.g(str, 2, list);
                InterfaceC2243s b11 = y22.b((InterfaceC2243s) list.get(0));
                y22.b((InterfaceC2243s) list.get(1));
                return b11;
            case 8:
            case 9:
                AbstractC2262u2.g(str, 1, list);
                return y22.b((InterfaceC2243s) list.get(0));
            case 10:
                AbstractC2262u2.f(Z.SUBTRACT, 2, list);
                return new C2177k(Double.valueOf(y22.b((InterfaceC2243s) list.get(0)).z().doubleValue() + new C2177k(Double.valueOf(y22.b((InterfaceC2243s) list.get(1)).z().doubleValue() * (-1.0d))).z().doubleValue()));
            default:
                return super.a(str);
        }
    }
}
