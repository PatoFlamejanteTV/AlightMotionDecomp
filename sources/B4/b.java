package B4;

import Q5.r;
import Q5.x;
import R5.Q;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public abstract class b {
    public static final Map a(Map map) {
        r rVar;
        AbstractC3292y.i(map, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                rVar = x.a(key, value);
            } else {
                rVar = null;
            }
            if (rVar != null) {
                arrayList.add(rVar);
            }
        }
        return Q.u(arrayList);
    }
}
