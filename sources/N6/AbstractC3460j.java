package n6;

import c6.InterfaceC2072n;

/* renamed from: n6.j */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC3460j {
    public static final Object a(U5.g gVar, InterfaceC2072n interfaceC2072n) {
        AbstractC3457h0 abstractC3457h0;
        AbstractC3457h0 a9;
        U5.g e8;
        Thread currentThread = Thread.currentThread();
        U5.e eVar = (U5.e) gVar.get(U5.e.f10146a0);
        if (eVar == null) {
            a9 = X0.f35683a.b();
            e8 = H.e(C3475q0.f35747a, gVar.plus(a9));
        } else {
            AbstractC3457h0 abstractC3457h02 = null;
            if (eVar instanceof AbstractC3457h0) {
                abstractC3457h0 = (AbstractC3457h0) eVar;
            } else {
                abstractC3457h0 = null;
            }
            if (abstractC3457h0 != null) {
                if (abstractC3457h0.P()) {
                    abstractC3457h02 = abstractC3457h0;
                }
                if (abstractC3457h02 != null) {
                    a9 = abstractC3457h02;
                    e8 = H.e(C3475q0.f35747a, gVar);
                }
            }
            a9 = X0.f35683a.a();
            e8 = H.e(C3475q0.f35747a, gVar);
        }
        C3454g c3454g = new C3454g(e8, currentThread, a9);
        c3454g.M0(O.DEFAULT, c3454g, interfaceC2072n);
        return c3454g.N0();
    }

    public static /* synthetic */ Object b(U5.g gVar, InterfaceC2072n interfaceC2072n, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            gVar = U5.h.f10149a;
        }
        return AbstractC3458i.e(gVar, interfaceC2072n);
    }
}
