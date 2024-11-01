package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.y4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2296y4 extends AbstractC2204n {

    /* renamed from: c, reason: collision with root package name */
    private final C2114d f17086c;

    public C2296y4(C2114d c2114d) {
        super("internal.eventLogger");
        this.f17086c = c2114d;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2204n
    public final InterfaceC2243s a(Y2 y22, List list) {
        Map hashMap;
        AbstractC2262u2.g(this.f16887a, 3, list);
        String A8 = y22.b((InterfaceC2243s) list.get(0)).A();
        long a9 = (long) AbstractC2262u2.a(y22.b((InterfaceC2243s) list.get(1)).z().doubleValue());
        InterfaceC2243s b9 = y22.b((InterfaceC2243s) list.get(2));
        if (b9 instanceof r) {
            hashMap = AbstractC2262u2.e((r) b9);
        } else {
            hashMap = new HashMap();
        }
        this.f17086c.c(A8, a9, hashMap);
        return InterfaceC2243s.f16971b0;
    }
}
