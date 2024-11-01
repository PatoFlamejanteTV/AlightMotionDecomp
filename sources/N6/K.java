package n6;

import Q5.AbstractC1410e;
import s6.AbstractC3988h;

/* loaded from: classes5.dex */
public abstract class K {
    public static final void a(U5.g gVar, Throwable th) {
        try {
            J j8 = (J) gVar.get(J.f35662m0);
            if (j8 != null) {
                j8.handleException(gVar, th);
            } else {
                AbstractC3988h.a(gVar, th);
            }
        } catch (Throwable th2) {
            AbstractC3988h.a(gVar, b(th, th2));
        }
    }

    public static final Throwable b(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        AbstractC1410e.a(runtimeException, th);
        return runtimeException;
    }
}
