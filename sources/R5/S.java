package R5;

import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
abstract class S {
    public static final Object a(Map map, Object obj) {
        AbstractC3292y.i(map, "<this>");
        if (map instanceof P) {
            return ((P) map).d(obj);
        }
        Object obj2 = map.get(obj);
        if (obj2 == null && !map.containsKey(obj)) {
            throw new NoSuchElementException("Key " + obj + " is missing in the map.");
        }
        return obj2;
    }
}
