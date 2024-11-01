package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC2220p {
    public static InterfaceC2243s a(InterfaceC2195m interfaceC2195m, InterfaceC2243s interfaceC2243s, Y2 y22, List list) {
        if (interfaceC2195m.g(interfaceC2243s.A())) {
            InterfaceC2243s c8 = interfaceC2195m.c(interfaceC2243s.A());
            if (c8 instanceof AbstractC2204n) {
                return ((AbstractC2204n) c8).a(y22, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", interfaceC2243s.A()));
        }
        if ("hasOwnProperty".equals(interfaceC2243s.A())) {
            AbstractC2262u2.g("hasOwnProperty", 1, list);
            if (interfaceC2195m.g(y22.b((InterfaceC2243s) list.get(0)).A())) {
                return InterfaceC2243s.f16976g0;
            }
            return InterfaceC2243s.f16977h0;
        }
        throw new IllegalArgumentException(String.format("Object has no function %s", interfaceC2243s.A()));
    }

    public static Iterator b(Map map) {
        return new C2212o(map.keySet().iterator());
    }
}
