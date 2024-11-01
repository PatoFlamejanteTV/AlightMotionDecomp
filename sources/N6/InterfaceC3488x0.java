package n6;

import U5.g;
import c6.InterfaceC2072n;
import java.util.concurrent.CancellationException;
import k6.InterfaceC3255g;
import kotlin.jvm.functions.Function1;

/* renamed from: n6.x0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC3488x0 extends g.b {

    /* renamed from: n0, reason: collision with root package name */
    public static final b f35757n0 = b.f35758a;

    /* renamed from: n6.x0$a */
    /* loaded from: classes5.dex */
    public static final class a {
        public static /* synthetic */ void a(InterfaceC3488x0 interfaceC3488x0, CancellationException cancellationException, int i8, Object obj) {
            if (obj == null) {
                if ((i8 & 1) != 0) {
                    cancellationException = null;
                }
                interfaceC3488x0.cancel(cancellationException);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        public static Object b(InterfaceC3488x0 interfaceC3488x0, Object obj, InterfaceC2072n interfaceC2072n) {
            return g.b.a.a(interfaceC3488x0, obj, interfaceC2072n);
        }

        public static g.b c(InterfaceC3488x0 interfaceC3488x0, g.c cVar) {
            return g.b.a.b(interfaceC3488x0, cVar);
        }

        public static /* synthetic */ InterfaceC3449d0 d(InterfaceC3488x0 interfaceC3488x0, boolean z8, boolean z9, Function1 function1, int i8, Object obj) {
            if (obj == null) {
                if ((i8 & 1) != 0) {
                    z8 = false;
                }
                if ((i8 & 2) != 0) {
                    z9 = true;
                }
                return interfaceC3488x0.p(z8, z9, function1);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }

        public static U5.g e(InterfaceC3488x0 interfaceC3488x0, g.c cVar) {
            return g.b.a.c(interfaceC3488x0, cVar);
        }

        public static U5.g f(InterfaceC3488x0 interfaceC3488x0, U5.g gVar) {
            return g.b.a.d(interfaceC3488x0, gVar);
        }
    }

    /* renamed from: n6.x0$b */
    /* loaded from: classes5.dex */
    public static final class b implements g.c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f35758a = new b();

        private b() {
        }
    }

    InterfaceC3481u B(InterfaceC3485w interfaceC3485w);

    boolean b();

    void cancel(CancellationException cancellationException);

    InterfaceC3488x0 getParent();

    boolean isActive();

    boolean isCancelled();

    InterfaceC3255g j();

    Object k(U5.d dVar);

    InterfaceC3449d0 p(boolean z8, boolean z9, Function1 function1);

    CancellationException q();

    boolean start();

    InterfaceC3449d0 u(Function1 function1);
}
