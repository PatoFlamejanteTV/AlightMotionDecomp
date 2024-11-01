package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2291y extends A {
    public C2291y() {
        this.f16219a.add(Z.BITWISE_AND);
        this.f16219a.add(Z.BITWISE_LEFT_SHIFT);
        this.f16219a.add(Z.BITWISE_NOT);
        this.f16219a.add(Z.BITWISE_OR);
        this.f16219a.add(Z.BITWISE_RIGHT_SHIFT);
        this.f16219a.add(Z.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.f16219a.add(Z.BITWISE_XOR);
    }

    @Override // com.google.android.gms.internal.measurement.A
    public final InterfaceC2243s b(String str, Y2 y22, List list) {
        switch (B.f16228a[AbstractC2262u2.c(str).ordinal()]) {
            case 1:
                AbstractC2262u2.f(Z.BITWISE_AND, 2, list);
                return new C2177k(Double.valueOf(AbstractC2262u2.i(y22.b((InterfaceC2243s) list.get(0)).z().doubleValue()) & AbstractC2262u2.i(y22.b((InterfaceC2243s) list.get(1)).z().doubleValue())));
            case 2:
                AbstractC2262u2.f(Z.BITWISE_LEFT_SHIFT, 2, list);
                return new C2177k(Double.valueOf(AbstractC2262u2.i(y22.b((InterfaceC2243s) list.get(0)).z().doubleValue()) << ((int) (AbstractC2262u2.m(y22.b((InterfaceC2243s) list.get(1)).z().doubleValue()) & 31))));
            case 3:
                AbstractC2262u2.f(Z.BITWISE_NOT, 1, list);
                return new C2177k(Double.valueOf(~AbstractC2262u2.i(y22.b((InterfaceC2243s) list.get(0)).z().doubleValue())));
            case 4:
                AbstractC2262u2.f(Z.BITWISE_OR, 2, list);
                return new C2177k(Double.valueOf(AbstractC2262u2.i(y22.b((InterfaceC2243s) list.get(0)).z().doubleValue()) | AbstractC2262u2.i(y22.b((InterfaceC2243s) list.get(1)).z().doubleValue())));
            case 5:
                AbstractC2262u2.f(Z.BITWISE_RIGHT_SHIFT, 2, list);
                return new C2177k(Double.valueOf(AbstractC2262u2.i(y22.b((InterfaceC2243s) list.get(0)).z().doubleValue()) >> ((int) (AbstractC2262u2.m(y22.b((InterfaceC2243s) list.get(1)).z().doubleValue()) & 31))));
            case 6:
                AbstractC2262u2.f(Z.BITWISE_UNSIGNED_RIGHT_SHIFT, 2, list);
                return new C2177k(Double.valueOf(AbstractC2262u2.m(y22.b((InterfaceC2243s) list.get(0)).z().doubleValue()) >>> ((int) (AbstractC2262u2.m(y22.b((InterfaceC2243s) list.get(1)).z().doubleValue()) & 31))));
            case 7:
                AbstractC2262u2.f(Z.BITWISE_XOR, 2, list);
                return new C2177k(Double.valueOf(AbstractC2262u2.i(y22.b((InterfaceC2243s) list.get(0)).z().doubleValue()) ^ AbstractC2262u2.i(y22.b((InterfaceC2243s) list.get(1)).z().doubleValue())));
            default:
                return super.a(str);
        }
    }
}
