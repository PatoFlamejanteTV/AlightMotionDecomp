package F;

import android.util.SparseArray;
import java.util.HashMap;
import s.f;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static SparseArray f2088a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    private static HashMap f2089b;

    static {
        HashMap hashMap = new HashMap();
        f2089b = hashMap;
        hashMap.put(f.DEFAULT, 0);
        f2089b.put(f.VERY_LOW, 1);
        f2089b.put(f.HIGHEST, 2);
        for (f fVar : f2089b.keySet()) {
            f2088a.append(((Integer) f2089b.get(fVar)).intValue(), fVar);
        }
    }

    public static int a(f fVar) {
        Integer num = (Integer) f2089b.get(fVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + fVar);
    }

    public static f b(int i8) {
        f fVar = (f) f2088a.get(i8);
        if (fVar != null) {
            return fVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i8);
    }
}
