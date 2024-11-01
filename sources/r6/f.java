package r6;

import c6.InterfaceC2072n;
import kotlin.jvm.internal.Z;
import q6.InterfaceC3822g;
import s6.J;

/* loaded from: classes5.dex */
public abstract class f {
    public static final /* synthetic */ InterfaceC3822g a(InterfaceC3822g interfaceC3822g, U5.g gVar) {
        return d(interfaceC3822g, gVar);
    }

    public static final Object b(U5.g gVar, Object obj, Object obj2, InterfaceC2072n interfaceC2072n, U5.d dVar) {
        Object c8 = J.c(gVar, obj2);
        try {
            Object invoke = ((InterfaceC2072n) Z.d(interfaceC2072n, 2)).invoke(obj, new x(dVar, gVar));
            J.a(gVar, c8);
            if (invoke == V5.b.e()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return invoke;
        } catch (Throwable th) {
            J.a(gVar, c8);
            throw th;
        }
    }

    public static /* synthetic */ Object c(U5.g gVar, Object obj, Object obj2, InterfaceC2072n interfaceC2072n, U5.d dVar, int i8, Object obj3) {
        if ((i8 & 4) != 0) {
            obj2 = J.b(gVar);
        }
        return b(gVar, obj, obj2, interfaceC2072n, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3822g d(InterfaceC3822g interfaceC3822g, U5.g gVar) {
        boolean z8;
        if (interfaceC3822g instanceof w) {
            z8 = true;
        } else {
            z8 = interfaceC3822g instanceof r;
        }
        if (!z8) {
            return new z(interfaceC3822g, gVar);
        }
        return interfaceC3822g;
    }
}
