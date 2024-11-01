package n6;

import U5.g;
import c6.InterfaceC2072n;

/* loaded from: classes5.dex */
public interface V0 extends g.b {

    /* loaded from: classes5.dex */
    public static final class a {
        public static Object a(V0 v02, Object obj, InterfaceC2072n interfaceC2072n) {
            return g.b.a.a(v02, obj, interfaceC2072n);
        }

        public static U5.g b(V0 v02, U5.g gVar) {
            return g.b.a.d(v02, gVar);
        }
    }

    void restoreThreadContext(U5.g gVar, Object obj);

    Object updateThreadContext(U5.g gVar);
}
