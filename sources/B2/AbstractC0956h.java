package B2;

import R5.AbstractC1435t;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: B2.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0956h {
    private static final D6.i b(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : AbstractC1435t.j0(list)) {
            if (obj instanceof Map) {
                arrayList.add(c((Map) obj));
            } else if (obj instanceof List) {
                arrayList.add(b((List) obj));
            } else {
                arrayList.add(D6.j.a(obj.toString()));
            }
        }
        return new D6.b(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final D6.i c(Map map) {
        String str;
        Object value;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            if (key instanceof String) {
                str = (String) key;
            } else {
                str = null;
            }
            if (str != null && (value = entry.getValue()) != null) {
                if (value instanceof Map) {
                    linkedHashMap.put(str, c((Map) value));
                } else if (value instanceof List) {
                    linkedHashMap.put(str, b((List) value));
                } else {
                    linkedHashMap.put(str, D6.j.a(value.toString()));
                }
            }
        }
        return new D6.v(linkedHashMap);
    }
}
