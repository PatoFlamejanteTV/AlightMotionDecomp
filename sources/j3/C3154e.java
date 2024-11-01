package j3;

import Q5.x;
import R5.Q;
import R5.a0;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: j3.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3154e {
    private final Map a(Map map, String str, C3153d c3153d) {
        Map map2;
        Object obj = map.get(str);
        Map map3 = null;
        if (obj instanceof Map) {
            map2 = (Map) obj;
        } else {
            map2 = null;
        }
        if (map2 != null) {
            if (c3153d != null) {
                map3 = c3153d.f();
            }
            if (map3 == null) {
                map3 = Q.h();
            }
            Map q8 = Q.q(map, Q.e(x.a(str, Q.q(map2, map3))));
            if (q8 != null) {
                return q8;
            }
            return map;
        }
        return map;
    }

    public final Map b(Map params, C3153d c3153d) {
        Object obj;
        Map a9;
        AbstractC3292y.i(params, "params");
        Iterator it = a0.i("source_data", "payment_method_data").iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (params.containsKey((String) obj)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        String str = (String) obj;
        if (str != null && (a9 = a(params, str, c3153d)) != null) {
            return a9;
        }
        return params;
    }
}
