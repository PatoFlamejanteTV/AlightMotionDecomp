package n6;

import U5.e;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3292y;
import s6.C3976B;
import t6.AbstractC4063a;
import t6.AbstractC4064b;

/* renamed from: n6.k */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC3462k {
    public static final U a(M m8, U5.g gVar, O o8, InterfaceC2072n interfaceC2072n) {
        V v8;
        U5.g e8 = H.e(m8, gVar);
        if (o8.c()) {
            v8 = new H0(e8, interfaceC2072n);
        } else {
            v8 = new V(e8, true);
        }
        v8.M0(o8, v8, interfaceC2072n);
        return v8;
    }

    public static /* synthetic */ U b(M m8, U5.g gVar, O o8, InterfaceC2072n interfaceC2072n, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            gVar = U5.h.f10149a;
        }
        if ((i8 & 2) != 0) {
            o8 = O.DEFAULT;
        }
        return AbstractC3458i.a(m8, gVar, o8, interfaceC2072n);
    }

    public static final InterfaceC3488x0 c(M m8, U5.g gVar, O o8, InterfaceC2072n interfaceC2072n) {
        S0 s02;
        U5.g e8 = H.e(m8, gVar);
        if (o8.c()) {
            s02 = new I0(e8, interfaceC2072n);
        } else {
            s02 = new S0(e8, true);
        }
        s02.M0(o8, s02, interfaceC2072n);
        return s02;
    }

    public static /* synthetic */ InterfaceC3488x0 d(M m8, U5.g gVar, O o8, InterfaceC2072n interfaceC2072n, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            gVar = U5.h.f10149a;
        }
        if ((i8 & 2) != 0) {
            o8 = O.DEFAULT;
        }
        return AbstractC3458i.c(m8, gVar, o8, interfaceC2072n);
    }

    public static final Object e(U5.g gVar, InterfaceC2072n interfaceC2072n, U5.d dVar) {
        Object N02;
        U5.g context = dVar.getContext();
        U5.g d8 = H.d(context, gVar);
        B0.j(d8);
        if (d8 == context) {
            C3976B c3976b = new C3976B(d8, dVar);
            N02 = AbstractC4064b.b(c3976b, c3976b, interfaceC2072n);
        } else {
            e.b bVar = U5.e.f10146a0;
            if (AbstractC3292y.d(d8.get(bVar), context.get(bVar))) {
                c1 c1Var = new c1(d8, dVar);
                U5.g context2 = c1Var.getContext();
                Object c8 = s6.J.c(context2, null);
                try {
                    Object b9 = AbstractC4064b.b(c1Var, c1Var, interfaceC2072n);
                    s6.J.a(context2, c8);
                    N02 = b9;
                } catch (Throwable th) {
                    s6.J.a(context2, c8);
                    throw th;
                }
            } else {
                Y y8 = new Y(d8, dVar);
                AbstractC4063a.d(interfaceC2072n, y8, y8, null, 4, null);
                N02 = y8.N0();
            }
        }
        if (N02 == V5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return N02;
    }
}
