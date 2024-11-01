package s6;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import k6.AbstractC3258j;
import n6.J0;

/* loaded from: classes5.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final u f39226a;

    /* renamed from: b, reason: collision with root package name */
    public static final J0 f39227b;

    static {
        u uVar = new u();
        f39226a = uVar;
        G.f("kotlinx.coroutines.fast.service.loader", true);
        f39227b = uVar.a();
    }

    private u() {
    }

    private final J0 a() {
        Object next;
        J0 e8;
        try {
            List D8 = AbstractC3258j.D(AbstractC3258j.c(ServiceLoader.load(t.class, t.class.getClassLoader()).iterator()));
            Iterator it = D8.iterator();
            if (!it.hasNext()) {
                next = null;
            } else {
                next = it.next();
                if (it.hasNext()) {
                    int c8 = ((t) next).c();
                    do {
                        Object next2 = it.next();
                        int c9 = ((t) next2).c();
                        if (c8 < c9) {
                            next = next2;
                            c8 = c9;
                        }
                    } while (it.hasNext());
                }
            }
            t tVar = (t) next;
            if (tVar != null && (e8 = v.e(tVar, D8)) != null) {
                return e8;
            }
            v.b(null, null, 3, null);
            return null;
        } catch (Throwable th) {
            v.b(th, null, 2, null);
            return null;
        }
    }
}
