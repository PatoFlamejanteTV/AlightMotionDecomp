package n4;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;
import r4.G;

/* renamed from: n4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3413a {
    private static final void a(Map map, String str, Map map2) {
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value == null) {
                map2.put(G.Companion.b(b(str, (String) entry.getKey())), null);
            } else if (value instanceof String) {
                G b9 = G.Companion.b(b(str, (String) entry.getKey()));
                Object value2 = entry.getValue();
                AbstractC3292y.g(value2, "null cannot be cast to non-null type kotlin.String");
                map2.put(b9, (String) value2);
            } else if (value instanceof Map) {
                Object value3 = entry.getValue();
                AbstractC3292y.g(value3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                a((Map) value3, b(str, (String) entry.getKey()), map2);
            }
        }
    }

    private static final String b(String str, String str2) {
        if (str.length() != 0) {
            return str + "[" + str2 + "]";
        }
        return str2;
    }

    public static final Map c(Map paramMap) {
        AbstractC3292y.i(paramMap, "paramMap");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a(paramMap, "", linkedHashMap);
        return linkedHashMap;
    }
}
