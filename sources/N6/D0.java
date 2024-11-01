package n6;

import java.util.concurrent.CancellationException;
import n6.InterfaceC3488x0;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class D0 {
    public static final InterfaceC3435A a(InterfaceC3488x0 interfaceC3488x0) {
        return new A0(interfaceC3488x0);
    }

    public static /* synthetic */ InterfaceC3435A b(InterfaceC3488x0 interfaceC3488x0, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            interfaceC3488x0 = null;
        }
        return B0.a(interfaceC3488x0);
    }

    public static final void c(U5.g gVar, CancellationException cancellationException) {
        InterfaceC3488x0 interfaceC3488x0 = (InterfaceC3488x0) gVar.get(InterfaceC3488x0.f35757n0);
        if (interfaceC3488x0 != null) {
            interfaceC3488x0.cancel(cancellationException);
        }
    }

    public static final void d(InterfaceC3488x0 interfaceC3488x0, String str, Throwable th) {
        interfaceC3488x0.cancel(AbstractC3467m0.a(str, th));
    }

    public static /* synthetic */ void e(U5.g gVar, CancellationException cancellationException, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            cancellationException = null;
        }
        B0.c(gVar, cancellationException);
    }

    public static /* synthetic */ void f(InterfaceC3488x0 interfaceC3488x0, String str, Throwable th, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            th = null;
        }
        B0.d(interfaceC3488x0, str, th);
    }

    public static final Object g(InterfaceC3488x0 interfaceC3488x0, U5.d dVar) {
        InterfaceC3488x0.a.a(interfaceC3488x0, null, 1, null);
        Object k8 = interfaceC3488x0.k(dVar);
        if (k8 == V5.b.e()) {
            return k8;
        }
        return Q5.I.f8786a;
    }

    public static final InterfaceC3449d0 h(InterfaceC3488x0 interfaceC3488x0, InterfaceC3449d0 interfaceC3449d0) {
        return interfaceC3488x0.u(new C3453f0(interfaceC3449d0));
    }

    public static final void i(U5.g gVar) {
        InterfaceC3488x0 interfaceC3488x0 = (InterfaceC3488x0) gVar.get(InterfaceC3488x0.f35757n0);
        if (interfaceC3488x0 != null) {
            B0.k(interfaceC3488x0);
        }
    }

    public static final void j(InterfaceC3488x0 interfaceC3488x0) {
        if (interfaceC3488x0.isActive()) {
        } else {
            throw interfaceC3488x0.q();
        }
    }

    public static final InterfaceC3488x0 k(U5.g gVar) {
        InterfaceC3488x0 interfaceC3488x0 = (InterfaceC3488x0) gVar.get(InterfaceC3488x0.f35757n0);
        if (interfaceC3488x0 != null) {
            return interfaceC3488x0;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + gVar).toString());
    }

    public static final boolean l(U5.g gVar) {
        InterfaceC3488x0 interfaceC3488x0 = (InterfaceC3488x0) gVar.get(InterfaceC3488x0.f35757n0);
        if (interfaceC3488x0 != null) {
            return interfaceC3488x0.isActive();
        }
        return true;
    }
}
