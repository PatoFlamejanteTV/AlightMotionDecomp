package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.measurement.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2096b {

    /* renamed from: a, reason: collision with root package name */
    private final TreeMap f16582a = new TreeMap();

    /* renamed from: b, reason: collision with root package name */
    private final TreeMap f16583b = new TreeMap();

    private static int a(Y2 y22, C2251t c2251t, InterfaceC2243s interfaceC2243s) {
        InterfaceC2243s a9 = c2251t.a(y22, Collections.singletonList(interfaceC2243s));
        if (a9 instanceof C2177k) {
            return AbstractC2262u2.i(a9.z().doubleValue());
        }
        return -1;
    }

    public final void b(Y2 y22, C2114d c2114d) {
        T5 t52 = new T5(c2114d);
        for (Integer num : this.f16582a.keySet()) {
            C2123e c2123e = (C2123e) c2114d.d().clone();
            int a9 = a(y22, (C2251t) this.f16582a.get(num), t52);
            if (a9 == 2 || a9 == -1) {
                c2114d.e(c2123e);
            }
        }
        Iterator it = this.f16583b.keySet().iterator();
        while (it.hasNext()) {
            a(y22, (C2251t) this.f16583b.get((Integer) it.next()), t52);
        }
    }

    public final void c(String str, int i8, C2251t c2251t, String str2) {
        TreeMap treeMap;
        if ("create".equals(str2)) {
            treeMap = this.f16583b;
        } else if ("edit".equals(str2)) {
            treeMap = this.f16582a;
        } else {
            throw new IllegalStateException("Unknown callback type: " + str2);
        }
        if (treeMap.containsKey(Integer.valueOf(i8))) {
            i8 = ((Integer) treeMap.lastKey()).intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i8), c2251t);
    }
}
