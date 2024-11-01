package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class Z3 {
    public static InterfaceC2243s a(B2 b22) {
        if (b22 == null) {
            return InterfaceC2243s.f16971b0;
        }
        int i8 = AbstractC2303z3.f17095a[b22.H().ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    if (i8 != 4) {
                        if (i8 != 5) {
                            throw new IllegalStateException("Invalid entity: " + String.valueOf(b22));
                        }
                        throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
                    }
                    List L8 = b22.L();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = L8.iterator();
                    while (it.hasNext()) {
                        arrayList.add(a((B2) it.next()));
                    }
                    return new C2267v(b22.J(), arrayList);
                }
                if (b22.N()) {
                    return new C2150h(Boolean.valueOf(b22.M()));
                }
                return new C2150h(null);
            }
            if (b22.O()) {
                return new C2177k(Double.valueOf(b22.G()));
            }
            return new C2177k(null);
        }
        if (b22.P()) {
            return new C2259u(b22.K());
        }
        return InterfaceC2243s.f16978i0;
    }

    public static InterfaceC2243s b(Object obj) {
        if (obj == null) {
            return InterfaceC2243s.f16972c0;
        }
        if (obj instanceof String) {
            return new C2259u((String) obj);
        }
        if (obj instanceof Double) {
            return new C2177k((Double) obj);
        }
        if (obj instanceof Long) {
            return new C2177k(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new C2177k(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new C2150h((Boolean) obj);
        }
        if (obj instanceof Map) {
            r rVar = new r();
            Map map = (Map) obj;
            for (Object obj2 : map.keySet()) {
                InterfaceC2243s b9 = b(map.get(obj2));
                if (obj2 != null) {
                    if (!(obj2 instanceof String)) {
                        obj2 = obj2.toString();
                    }
                    rVar.j((String) obj2, b9);
                }
            }
            return rVar;
        }
        if (obj instanceof List) {
            C2141g c2141g = new C2141g();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c2141g.l(b(it.next()));
            }
            return c2141g;
        }
        throw new IllegalArgumentException("Invalid value type");
    }
}
