package n6;

import c6.InterfaceC2072n;
import java.util.concurrent.CancellationException;
import s6.C3976B;
import s6.C3986f;
import t6.AbstractC4064b;

/* loaded from: classes5.dex */
public abstract class N {
    public static final M a(U5.g gVar) {
        InterfaceC3435A b9;
        if (gVar.get(InterfaceC3488x0.f35757n0) == null) {
            b9 = D0.b(null, 1, null);
            gVar = gVar.plus(b9);
        }
        return new C3986f(gVar);
    }

    public static final M b() {
        return new C3986f(U0.b(null, 1, null).plus(C3445b0.c()));
    }

    public static final void c(M m8, CancellationException cancellationException) {
        InterfaceC3488x0 interfaceC3488x0 = (InterfaceC3488x0) m8.getCoroutineContext().get(InterfaceC3488x0.f35757n0);
        if (interfaceC3488x0 != null) {
            interfaceC3488x0.cancel(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + m8).toString());
    }

    public static /* synthetic */ void d(M m8, CancellationException cancellationException, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            cancellationException = null;
        }
        c(m8, cancellationException);
    }

    public static final Object e(InterfaceC2072n interfaceC2072n, U5.d dVar) {
        C3976B c3976b = new C3976B(dVar.getContext(), dVar);
        Object b9 = AbstractC4064b.b(c3976b, c3976b, interfaceC2072n);
        if (b9 == V5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return b9;
    }

    public static final void f(M m8) {
        B0.j(m8.getCoroutineContext());
    }

    public static final boolean g(M m8) {
        InterfaceC3488x0 interfaceC3488x0 = (InterfaceC3488x0) m8.getCoroutineContext().get(InterfaceC3488x0.f35757n0);
        if (interfaceC3488x0 != null) {
            return interfaceC3488x0.isActive();
        }
        return true;
    }

    public static final M h(M m8, U5.g gVar) {
        return new C3986f(m8.getCoroutineContext().plus(gVar));
    }
}
