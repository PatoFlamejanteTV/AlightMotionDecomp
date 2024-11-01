package n6;

import Q5.s;
import s6.C3990j;

/* loaded from: classes5.dex */
public abstract class Q {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(U5.d dVar) {
        Object b9;
        if (dVar instanceof C3990j) {
            return dVar.toString();
        }
        try {
            s.a aVar = Q5.s.f8810b;
            b9 = Q5.s.b(dVar + '@' + b(dVar));
        } catch (Throwable th) {
            s.a aVar2 = Q5.s.f8810b;
            b9 = Q5.s.b(Q5.t.a(th));
        }
        if (Q5.s.e(b9) != null) {
            b9 = dVar.getClass().getName() + '@' + b(dVar);
        }
        return (String) b9;
    }
}
