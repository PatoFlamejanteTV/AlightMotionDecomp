package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class V6 extends AbstractC2204n {

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ InterfaceC2266u6 f16475c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V6(C2257t5 c2257t5, String str, InterfaceC2266u6 interfaceC2266u6) {
        super(str);
        this.f16475c = interfaceC2266u6;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2204n
    public final InterfaceC2243s a(Y2 y22, List list) {
        AbstractC2262u2.g("getValue", 2, list);
        InterfaceC2243s b9 = y22.b((InterfaceC2243s) list.get(0));
        InterfaceC2243s b10 = y22.b((InterfaceC2243s) list.get(1));
        String c8 = this.f16475c.c(b9.A());
        if (c8 != null) {
            return new C2259u(c8);
        }
        return b10;
    }
}
