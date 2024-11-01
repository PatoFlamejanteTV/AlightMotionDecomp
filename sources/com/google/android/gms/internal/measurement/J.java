package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes3.dex */
public final class J extends A {
    /* JADX INFO: Access modifiers changed from: protected */
    public J() {
        this.f16219a.add(Z.AND);
        this.f16219a.add(Z.NOT);
        this.f16219a.add(Z.OR);
    }

    @Override // com.google.android.gms.internal.measurement.A
    public final InterfaceC2243s b(String str, Y2 y22, List list) {
        int i8 = M.f16385a[AbstractC2262u2.c(str).ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    return super.a(str);
                }
                AbstractC2262u2.f(Z.OR, 2, list);
                InterfaceC2243s b9 = y22.b((InterfaceC2243s) list.get(0));
                if (b9.y().booleanValue()) {
                    return b9;
                }
                return y22.b((InterfaceC2243s) list.get(1));
            }
            AbstractC2262u2.f(Z.NOT, 1, list);
            return new C2150h(Boolean.valueOf(!y22.b((InterfaceC2243s) list.get(0)).y().booleanValue()));
        }
        AbstractC2262u2.f(Z.AND, 2, list);
        InterfaceC2243s b10 = y22.b((InterfaceC2243s) list.get(0));
        if (!b10.y().booleanValue()) {
            return b10;
        }
        return y22.b((InterfaceC2243s) list.get(1));
    }
}
