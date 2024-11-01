package n6;

import s6.C3990j;

/* loaded from: classes5.dex */
public abstract class r {
    public static final void a(InterfaceC3470o interfaceC3470o, InterfaceC3449d0 interfaceC3449d0) {
        interfaceC3470o.f(new C3451e0(interfaceC3449d0));
    }

    public static final C3472p b(U5.d dVar) {
        if (!(dVar instanceof C3990j)) {
            return new C3472p(dVar, 1);
        }
        C3472p l8 = ((C3990j) dVar).l();
        if (l8 != null) {
            if (!l8.L()) {
                l8 = null;
            }
            if (l8 != null) {
                return l8;
            }
        }
        return new C3472p(dVar, 2);
    }
}
