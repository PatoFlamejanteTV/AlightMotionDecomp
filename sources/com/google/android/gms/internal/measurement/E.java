package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    private Map f16274a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private U f16275b = new U();

    public E() {
        b(new C2291y());
        b(new D());
        b(new F());
        b(new J());
        b(new L());
        b(new S());
        b(new X());
    }

    private final void b(A a9) {
        Iterator it = a9.f16219a.iterator();
        while (it.hasNext()) {
            this.f16274a.put(((Z) it.next()).toString(), a9);
        }
    }

    public final InterfaceC2243s a(Y2 y22, InterfaceC2243s interfaceC2243s) {
        A a9;
        AbstractC2262u2.b(y22);
        if (interfaceC2243s instanceof C2267v) {
            C2267v c2267v = (C2267v) interfaceC2243s;
            ArrayList c8 = c2267v.c();
            String a10 = c2267v.a();
            if (this.f16274a.containsKey(a10)) {
                a9 = (A) this.f16274a.get(a10);
            } else {
                a9 = this.f16275b;
            }
            return a9.b(a10, y22, c8);
        }
        return interfaceC2243s;
    }
}
