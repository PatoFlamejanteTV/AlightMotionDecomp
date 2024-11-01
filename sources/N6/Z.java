package n6;

import Q5.AbstractC1410e;
import Q5.s;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC3292y;
import s6.C3990j;
import u6.AbstractRunnableC4097h;
import u6.InterfaceC4098i;

/* loaded from: classes5.dex */
public abstract class Z extends AbstractRunnableC4097h {

    /* renamed from: c, reason: collision with root package name */
    public int f35687c;

    public Z(int i8) {
        this.f35687c = i8;
    }

    public abstract void c(Object obj, Throwable th);

    public abstract U5.d d();

    public Throwable g(Object obj) {
        C3437C c3437c;
        if (obj instanceof C3437C) {
            c3437c = (C3437C) obj;
        } else {
            c3437c = null;
        }
        if (c3437c == null) {
            return null;
        }
        return c3437c.f35626a;
    }

    public final void i(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            AbstractC1410e.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        AbstractC3292y.f(th);
        K.a(d().getContext(), new P("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object j();

    @Override // java.lang.Runnable
    public final void run() {
        Object b9;
        c1 c1Var;
        InterfaceC3488x0 interfaceC3488x0;
        Object b10;
        InterfaceC4098i interfaceC4098i = this.f40365b;
        try {
            U5.d d8 = d();
            AbstractC3292y.g(d8, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            C3990j c3990j = (C3990j) d8;
            U5.d dVar = c3990j.f39197e;
            Object obj = c3990j.f39199g;
            U5.g context = dVar.getContext();
            Object c8 = s6.J.c(context, obj);
            if (c8 != s6.J.f39169a) {
                c1Var = H.g(dVar, context, c8);
            } else {
                c1Var = null;
            }
            try {
                U5.g context2 = dVar.getContext();
                Object j8 = j();
                Throwable g8 = g(j8);
                if (g8 == null && AbstractC3443a0.b(this.f35687c)) {
                    interfaceC3488x0 = (InterfaceC3488x0) context2.get(InterfaceC3488x0.f35757n0);
                } else {
                    interfaceC3488x0 = null;
                }
                if (interfaceC3488x0 != null && !interfaceC3488x0.isActive()) {
                    CancellationException q8 = interfaceC3488x0.q();
                    c(j8, q8);
                    s.a aVar = Q5.s.f8810b;
                    dVar.resumeWith(Q5.s.b(Q5.t.a(q8)));
                } else if (g8 != null) {
                    s.a aVar2 = Q5.s.f8810b;
                    dVar.resumeWith(Q5.s.b(Q5.t.a(g8)));
                } else {
                    s.a aVar3 = Q5.s.f8810b;
                    dVar.resumeWith(Q5.s.b(h(j8)));
                }
                Q5.I i8 = Q5.I.f8786a;
                if (c1Var == null || c1Var.N0()) {
                    s6.J.a(context, c8);
                }
                try {
                    interfaceC4098i.a();
                    b10 = Q5.s.b(Q5.I.f8786a);
                } catch (Throwable th) {
                    s.a aVar4 = Q5.s.f8810b;
                    b10 = Q5.s.b(Q5.t.a(th));
                }
                i(null, Q5.s.e(b10));
            } catch (Throwable th2) {
                if (c1Var == null || c1Var.N0()) {
                    s6.J.a(context, c8);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                s.a aVar5 = Q5.s.f8810b;
                interfaceC4098i.a();
                b9 = Q5.s.b(Q5.I.f8786a);
            } catch (Throwable th4) {
                s.a aVar6 = Q5.s.f8810b;
                b9 = Q5.s.b(Q5.t.a(th4));
            }
            i(th3, Q5.s.e(b9));
        }
    }

    public Object h(Object obj) {
        return obj;
    }
}
