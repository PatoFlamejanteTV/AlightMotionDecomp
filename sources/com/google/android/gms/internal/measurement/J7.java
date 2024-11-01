package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes3.dex */
public final class J7 extends AbstractC2204n {

    /* renamed from: c, reason: collision with root package name */
    private C2096b f16336c;

    public J7(C2096b c2096b) {
        super("internal.registerCallback");
        this.f16336c = c2096b;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2204n
    public final InterfaceC2243s a(Y2 y22, List list) {
        int i8;
        AbstractC2262u2.g(this.f16887a, 3, list);
        String A8 = y22.b((InterfaceC2243s) list.get(0)).A();
        InterfaceC2243s b9 = y22.b((InterfaceC2243s) list.get(1));
        if (b9 instanceof C2251t) {
            InterfaceC2243s b10 = y22.b((InterfaceC2243s) list.get(2));
            if (b10 instanceof r) {
                r rVar = (r) b10;
                if (rVar.g("type")) {
                    String A9 = rVar.c("type").A();
                    if (rVar.g("priority")) {
                        i8 = AbstractC2262u2.i(rVar.c("priority").z().doubleValue());
                    } else {
                        i8 = 1000;
                    }
                    this.f16336c.c(A8, i8, (C2251t) b9, A9);
                    return InterfaceC2243s.f16971b0;
                }
                throw new IllegalArgumentException("Undefined rule type");
            }
            throw new IllegalArgumentException("Invalid callback params");
        }
        throw new IllegalArgumentException("Invalid callback type");
    }
}
