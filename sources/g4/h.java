package g4;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class h {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Map b(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }
}
