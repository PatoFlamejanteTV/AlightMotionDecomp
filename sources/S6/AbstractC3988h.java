package s6;

import Q5.AbstractC1410e;
import java.util.Iterator;

/* renamed from: s6.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3988h {
    public static final void a(U5.g gVar, Throwable th) {
        Iterator it = AbstractC3987g.a().iterator();
        while (it.hasNext()) {
            try {
                ((n6.J) it.next()).handleException(gVar, th);
            } catch (Throwable th2) {
                AbstractC3987g.b(n6.K.b(th, th2));
            }
        }
        try {
            AbstractC1410e.a(th, new C3989i(gVar));
        } catch (Throwable unused) {
        }
        AbstractC3987g.b(th);
    }
}
