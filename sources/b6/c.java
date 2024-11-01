package B6;

import kotlin.jvm.internal.AbstractC3292y;
import y6.InterfaceC4248a;

/* loaded from: classes5.dex */
public interface c {

    /* loaded from: classes5.dex */
    public static final class a {
        public static int a(c cVar, A6.f descriptor) {
            AbstractC3292y.i(descriptor, "descriptor");
            return -1;
        }

        public static boolean b(c cVar) {
            return false;
        }

        public static /* synthetic */ Object c(c cVar, A6.f fVar, int i8, InterfaceC4248a interfaceC4248a, Object obj, int i9, Object obj2) {
            if (obj2 == null) {
                if ((i9 & 8) != 0) {
                    obj = null;
                }
                return cVar.p(fVar, i8, interfaceC4248a, obj);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableElement");
        }
    }

    float B(A6.f fVar, int i8);

    byte C(A6.f fVar, int i8);

    short E(A6.f fVar, int i8);

    void a(A6.f fVar);

    F6.b b();

    double e(A6.f fVar, int i8);

    e g(A6.f fVar, int i8);

    char j(A6.f fVar, int i8);

    long k(A6.f fVar, int i8);

    boolean m(A6.f fVar, int i8);

    String o(A6.f fVar, int i8);

    Object p(A6.f fVar, int i8, InterfaceC4248a interfaceC4248a, Object obj);

    int s(A6.f fVar);

    Object t(A6.f fVar, int i8, InterfaceC4248a interfaceC4248a, Object obj);

    int u(A6.f fVar, int i8);

    int y(A6.f fVar);

    boolean z();
}
