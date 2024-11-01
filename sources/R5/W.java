package R5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k6.InterfaceC3255g;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class W extends V {
    public static InterfaceC3255g C(Map map) {
        AbstractC3292y.i(map, "<this>");
        return AbstractC1435t.c0(map.entrySet());
    }

    public static List D(Map map) {
        AbstractC3292y.i(map, "<this>");
        if (map.size() == 0) {
            return AbstractC1435t.m();
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return AbstractC1435t.m();
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (!it.hasNext()) {
            return AbstractC1435t.e(new Q5.r(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new Q5.r(entry.getKey(), entry.getValue()));
        do {
            Map.Entry entry2 = (Map.Entry) it.next();
            arrayList.add(new Q5.r(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }
}
