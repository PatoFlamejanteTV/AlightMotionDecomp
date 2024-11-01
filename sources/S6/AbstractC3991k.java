package s6;

import Q5.s;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import n6.AbstractC3441G;
import n6.AbstractC3457h0;
import n6.InterfaceC3488x0;
import n6.X0;
import n6.c1;

/* renamed from: s6.k */
/* loaded from: classes5.dex */
public abstract class AbstractC3991k {

    /* renamed from: a */
    private static final C3980F f39200a = new C3980F("UNDEFINED");

    /* renamed from: b */
    public static final C3980F f39201b = new C3980F("REUSABLE_CLAIMED");

    public static final void b(U5.d dVar, Object obj, Function1 function1) {
        c1 c1Var;
        if (dVar instanceof C3990j) {
            C3990j c3990j = (C3990j) dVar;
            Object b9 = AbstractC3441G.b(obj, function1);
            if (c3990j.f39196d.isDispatchNeeded(c3990j.getContext())) {
                c3990j.f39198f = b9;
                c3990j.f35687c = 1;
                c3990j.f39196d.dispatch(c3990j.getContext(), c3990j);
                return;
            }
            AbstractC3457h0 b10 = X0.f35683a.b();
            if (b10.L()) {
                c3990j.f39198f = b9;
                c3990j.f35687c = 1;
                b10.H(c3990j);
                return;
            }
            b10.J(true);
            try {
                InterfaceC3488x0 interfaceC3488x0 = (InterfaceC3488x0) c3990j.getContext().get(InterfaceC3488x0.f35757n0);
                if (interfaceC3488x0 != null && !interfaceC3488x0.isActive()) {
                    CancellationException q8 = interfaceC3488x0.q();
                    c3990j.c(b9, q8);
                    s.a aVar = Q5.s.f8810b;
                    c3990j.resumeWith(Q5.s.b(Q5.t.a(q8)));
                } else {
                    U5.d dVar2 = c3990j.f39197e;
                    Object obj2 = c3990j.f39199g;
                    U5.g context = dVar2.getContext();
                    Object c8 = J.c(context, obj2);
                    if (c8 != J.f39169a) {
                        c1Var = n6.H.g(dVar2, context, c8);
                    } else {
                        c1Var = null;
                    }
                    try {
                        c3990j.f39197e.resumeWith(obj);
                        Q5.I i8 = Q5.I.f8786a;
                    } finally {
                        if (c1Var == null || c1Var.N0()) {
                            J.a(context, c8);
                        }
                    }
                }
                do {
                } while (b10.O());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        dVar.resumeWith(obj);
    }

    public static /* synthetic */ void c(U5.d dVar, Object obj, Function1 function1, int i8, Object obj2) {
        if ((i8 & 2) != 0) {
            function1 = null;
        }
        b(dVar, obj, function1);
    }

    public static final boolean d(C3990j c3990j) {
        Q5.I i8 = Q5.I.f8786a;
        AbstractC3457h0 b9 = X0.f35683a.b();
        if (b9.M()) {
            return false;
        }
        if (b9.L()) {
            c3990j.f39198f = i8;
            c3990j.f35687c = 1;
            b9.H(c3990j);
            return true;
        }
        b9.J(true);
        try {
            c3990j.run();
            do {
            } while (b9.O());
        } finally {
            try {
                return false;
            } finally {
            }
        }
        return false;
    }
}
