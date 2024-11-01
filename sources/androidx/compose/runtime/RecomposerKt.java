package androidx.compose.runtime;

import R5.AbstractC1435t;
import c6.InterfaceC2073o;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import n6.N;

/* loaded from: classes.dex */
public final class RecomposerKt {
    private static final int RecomposerCompoundHashKey = 1000;
    private static final Object ProduceAnotherFrame = new Object();
    private static final Object FramePending = new Object();

    public static final <K, V> boolean addMultiValue(Map<K, List<V>> map, K k8, V v8) {
        List<V> list = map.get(k8);
        if (list == null) {
            list = new ArrayList<>();
            map.put(k8, list);
        }
        return list.add(v8);
    }

    public static final <K, V> V removeLastMultiValue(Map<K, List<V>> map, K k8) {
        List<V> list = map.get(k8);
        if (list != null) {
            V v8 = (V) AbstractC1435t.N(list);
            if (list.isEmpty()) {
                map.remove(k8);
                return v8;
            }
            return v8;
        }
        return null;
    }

    public static final <R> Object withRunningRecomposer(InterfaceC2073o interfaceC2073o, U5.d dVar) {
        return N.e(new RecomposerKt$withRunningRecomposer$2(interfaceC2073o, null), dVar);
    }
}
