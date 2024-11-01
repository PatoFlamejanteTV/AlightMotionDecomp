package n6;

import Q5.s;
import kotlin.jvm.functions.Function1;

/* renamed from: n6.G */
/* loaded from: classes5.dex */
public abstract class AbstractC3441G {
    public static final Object a(Object obj, U5.d dVar) {
        if (obj instanceof C3437C) {
            s.a aVar = Q5.s.f8810b;
            return Q5.s.b(Q5.t.a(((C3437C) obj).f35626a));
        }
        return Q5.s.b(obj);
    }

    public static final Object b(Object obj, Function1 function1) {
        Throwable e8 = Q5.s.e(obj);
        if (e8 == null) {
            if (function1 != null) {
                return new C3438D(obj, function1);
            }
            return obj;
        }
        return new C3437C(e8, false, 2, null);
    }

    public static final Object c(Object obj, InterfaceC3470o interfaceC3470o) {
        Throwable e8 = Q5.s.e(obj);
        if (e8 != null) {
            return new C3437C(e8, false, 2, null);
        }
        return obj;
    }

    public static /* synthetic */ Object d(Object obj, Function1 function1, int i8, Object obj2) {
        if ((i8 & 1) != 0) {
            function1 = null;
        }
        return b(obj, function1);
    }
}
