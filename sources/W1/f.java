package W1;

import java.util.HashMap;
import java.util.LinkedHashSet;

/* loaded from: classes4.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    protected static HashMap f10729a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    protected static HashMap f10730b = new HashMap();

    static {
        a(Object.class, h.class);
        a(Object.class, g.class);
    }

    public static void a(Class cls, Class cls2) {
        synchronized (f10729a) {
            try {
                LinkedHashSet linkedHashSet = (LinkedHashSet) f10729a.get(cls);
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    f10729a.put(cls, linkedHashSet);
                }
                linkedHashSet.add(cls2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
