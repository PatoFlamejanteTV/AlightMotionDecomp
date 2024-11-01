package j$.time.format;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final Map f32932a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(Map map) {
        Comparator comparator;
        Comparator comparator2;
        this.f32932a = map;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                String str = (String) entry2.getValue();
                String str2 = (String) entry2.getValue();
                Long l8 = (Long) entry2.getKey();
                int i8 = b.f32894c;
                hashMap2.put(str, new AbstractMap.SimpleImmutableEntry(str2, l8));
            }
            ArrayList arrayList2 = new ArrayList(hashMap2.values());
            comparator2 = b.f32893b;
            Collections.sort(arrayList2, comparator2);
            hashMap.put((v) entry.getKey(), arrayList2);
            arrayList.addAll(arrayList2);
            hashMap.put(null, arrayList);
        }
        comparator = b.f32893b;
        Collections.sort(arrayList, comparator);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String a(long j8, v vVar) {
        Map map = (Map) this.f32932a.get(vVar);
        if (map != null) {
            return (String) map.get(Long.valueOf(j8));
        }
        return null;
    }
}
