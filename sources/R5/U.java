package R5;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k6.InterfaceC3255g;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class U extends T {
    public static final Map A(Q5.r[] rVarArr, Map destination) {
        AbstractC3292y.i(rVarArr, "<this>");
        AbstractC3292y.i(destination, "destination");
        Q.t(destination, rVarArr);
        return destination;
    }

    public static Map B(Map map) {
        AbstractC3292y.i(map, "<this>");
        return new LinkedHashMap(map);
    }

    public static Map h() {
        H h8 = H.f9299a;
        AbstractC3292y.g(h8, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return h8;
    }

    public static Object i(Map map, Object obj) {
        AbstractC3292y.i(map, "<this>");
        return S.a(map, obj);
    }

    public static HashMap j(Q5.r... pairs) {
        AbstractC3292y.i(pairs, "pairs");
        HashMap hashMap = new HashMap(Q.d(pairs.length));
        Q.t(hashMap, pairs);
        return hashMap;
    }

    public static Map k(Q5.r... pairs) {
        AbstractC3292y.i(pairs, "pairs");
        if (pairs.length > 0) {
            return A(pairs, new LinkedHashMap(Q.d(pairs.length)));
        }
        return Q.h();
    }

    public static Map l(Map map, Object obj) {
        AbstractC3292y.i(map, "<this>");
        Map B8 = Q.B(map);
        B8.remove(obj);
        return n(B8);
    }

    public static Map m(Q5.r... pairs) {
        AbstractC3292y.i(pairs, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(Q.d(pairs.length));
        Q.t(linkedHashMap, pairs);
        return linkedHashMap;
    }

    public static final Map n(Map map) {
        AbstractC3292y.i(map, "<this>");
        int size = map.size();
        if (size != 0) {
            if (size == 1) {
                return T.f(map);
            }
            return map;
        }
        return Q.h();
    }

    public static Map o(Map map, Q5.r pair) {
        AbstractC3292y.i(map, "<this>");
        AbstractC3292y.i(pair, "pair");
        if (map.isEmpty()) {
            return Q.e(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.c(), pair.d());
        return linkedHashMap;
    }

    public static Map p(Map map, Iterable pairs) {
        AbstractC3292y.i(map, "<this>");
        AbstractC3292y.i(pairs, "pairs");
        if (map.isEmpty()) {
            return Q.u(pairs);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        Q.r(linkedHashMap, pairs);
        return linkedHashMap;
    }

    public static Map q(Map map, Map map2) {
        AbstractC3292y.i(map, "<this>");
        AbstractC3292y.i(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static void r(Map map, Iterable pairs) {
        AbstractC3292y.i(map, "<this>");
        AbstractC3292y.i(pairs, "pairs");
        Iterator it = pairs.iterator();
        while (it.hasNext()) {
            Q5.r rVar = (Q5.r) it.next();
            map.put(rVar.a(), rVar.b());
        }
    }

    public static void s(Map map, InterfaceC3255g pairs) {
        AbstractC3292y.i(map, "<this>");
        AbstractC3292y.i(pairs, "pairs");
        Iterator it = pairs.iterator();
        while (it.hasNext()) {
            Q5.r rVar = (Q5.r) it.next();
            map.put(rVar.a(), rVar.b());
        }
    }

    public static void t(Map map, Q5.r[] pairs) {
        AbstractC3292y.i(map, "<this>");
        AbstractC3292y.i(pairs, "pairs");
        for (Q5.r rVar : pairs) {
            map.put(rVar.a(), rVar.b());
        }
    }

    public static Map u(Iterable iterable) {
        Object next;
        AbstractC3292y.i(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return v(iterable, new LinkedHashMap(Q.d(collection.size())));
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = iterable.iterator().next();
                }
                return Q.e((Q5.r) next);
            }
            return Q.h();
        }
        return n(v(iterable, new LinkedHashMap()));
    }

    public static final Map v(Iterable iterable, Map destination) {
        AbstractC3292y.i(iterable, "<this>");
        AbstractC3292y.i(destination, "destination");
        Q.r(destination, iterable);
        return destination;
    }

    public static Map w(Map map) {
        AbstractC3292y.i(map, "<this>");
        int size = map.size();
        if (size != 0) {
            if (size != 1) {
                return Q.B(map);
            }
            return T.f(map);
        }
        return Q.h();
    }

    public static Map x(InterfaceC3255g interfaceC3255g) {
        AbstractC3292y.i(interfaceC3255g, "<this>");
        return n(y(interfaceC3255g, new LinkedHashMap()));
    }

    public static final Map y(InterfaceC3255g interfaceC3255g, Map destination) {
        AbstractC3292y.i(interfaceC3255g, "<this>");
        AbstractC3292y.i(destination, "destination");
        Q.s(destination, interfaceC3255g);
        return destination;
    }

    public static Map z(Q5.r[] rVarArr) {
        AbstractC3292y.i(rVarArr, "<this>");
        int length = rVarArr.length;
        if (length != 0) {
            if (length != 1) {
                return A(rVarArr, new LinkedHashMap(Q.d(rVarArr.length)));
            }
            return Q.e(rVarArr[0]);
        }
        return Q.h();
    }
}
