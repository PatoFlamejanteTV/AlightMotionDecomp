package n6;

import Q5.s;
import kotlin.jvm.internal.AbstractC3292y;
import s6.C3990j;

/* renamed from: n6.a0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3443a0 {
    public static final void a(Z z8, int i8) {
        boolean z9;
        U5.d d8 = z8.d();
        if (i8 == 4) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9 && (d8 instanceof C3990j) && b(i8) == b(z8.f35687c)) {
            I i9 = ((C3990j) d8).f39196d;
            U5.g context = d8.getContext();
            if (i9.isDispatchNeeded(context)) {
                i9.dispatch(context, z8);
                return;
            } else {
                e(z8);
                return;
            }
        }
        d(z8, d8, z9);
    }

    public static final boolean b(int i8) {
        if (i8 == 1 || i8 == 2) {
            return true;
        }
        return false;
    }

    public static final boolean c(int i8) {
        if (i8 == 2) {
            return true;
        }
        return false;
    }

    public static final void d(Z z8, U5.d dVar, boolean z9) {
        Object h8;
        c1 c1Var;
        boolean N02;
        Object j8 = z8.j();
        Throwable g8 = z8.g(j8);
        if (g8 != null) {
            s.a aVar = Q5.s.f8810b;
            h8 = Q5.t.a(g8);
        } else {
            s.a aVar2 = Q5.s.f8810b;
            h8 = z8.h(j8);
        }
        Object b9 = Q5.s.b(h8);
        if (z9) {
            AbstractC3292y.g(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            C3990j c3990j = (C3990j) dVar;
            U5.d dVar2 = c3990j.f39197e;
            Object obj = c3990j.f39199g;
            U5.g context = dVar2.getContext();
            Object c8 = s6.J.c(context, obj);
            if (c8 != s6.J.f39169a) {
                c1Var = H.g(dVar2, context, c8);
            } else {
                c1Var = null;
            }
            try {
                c3990j.f39197e.resumeWith(b9);
                Q5.I i8 = Q5.I.f8786a;
                if (c1Var != null) {
                    if (!N02) {
                        return;
                    }
                }
                return;
            } finally {
                if (c1Var == null || c1Var.N0()) {
                    s6.J.a(context, c8);
                }
            }
        }
        dVar.resumeWith(b9);
    }

    private static final void e(Z z8) {
        AbstractC3457h0 b9 = X0.f35683a.b();
        if (b9.L()) {
            b9.H(z8);
            return;
        }
        b9.J(true);
        try {
            d(z8, z8.d(), true);
            do {
            } while (b9.O());
        } finally {
            try {
            } finally {
            }
        }
    }
}
