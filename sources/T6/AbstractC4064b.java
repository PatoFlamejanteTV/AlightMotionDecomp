package t6;

import Q5.s;
import Q5.t;
import U5.d;
import U5.g;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.Z;
import n6.C3437C;
import n6.G0;
import n6.Y0;
import s6.C3976B;
import s6.J;

/* renamed from: t6.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4064b {
    public static final void a(InterfaceC2072n interfaceC2072n, Object obj, d dVar) {
        d a9 = h.a(dVar);
        try {
            g context = dVar.getContext();
            Object c8 = J.c(context, null);
            try {
                Object invoke = ((InterfaceC2072n) Z.d(interfaceC2072n, 2)).invoke(obj, a9);
                if (invoke != V5.b.e()) {
                    a9.resumeWith(s.b(invoke));
                }
            } finally {
                J.a(context, c8);
            }
        } catch (Throwable th) {
            s.a aVar = s.f8810b;
            a9.resumeWith(s.b(t.a(th)));
        }
    }

    public static final Object b(C3976B c3976b, Object obj, InterfaceC2072n interfaceC2072n) {
        Object c3437c;
        try {
            c3437c = ((InterfaceC2072n) Z.d(interfaceC2072n, 2)).invoke(obj, c3976b);
        } catch (Throwable th) {
            c3437c = new C3437C(th, false, 2, null);
        }
        if (c3437c == V5.b.e()) {
            return V5.b.e();
        }
        Object m02 = c3976b.m0(c3437c);
        if (m02 == G0.f35649b) {
            return V5.b.e();
        }
        if (!(m02 instanceof C3437C)) {
            return G0.h(m02);
        }
        throw ((C3437C) m02).f35626a;
    }

    public static final Object c(C3976B c3976b, Object obj, InterfaceC2072n interfaceC2072n) {
        Object c3437c;
        try {
            c3437c = ((InterfaceC2072n) Z.d(interfaceC2072n, 2)).invoke(obj, c3976b);
        } catch (Throwable th) {
            c3437c = new C3437C(th, false, 2, null);
        }
        if (c3437c == V5.b.e()) {
            return V5.b.e();
        }
        Object m02 = c3976b.m0(c3437c);
        if (m02 == G0.f35649b) {
            return V5.b.e();
        }
        if (m02 instanceof C3437C) {
            Throwable th2 = ((C3437C) m02).f35626a;
            if (th2 instanceof Y0) {
                if (((Y0) th2).f35686a == c3976b) {
                    if (c3437c instanceof C3437C) {
                        throw ((C3437C) c3437c).f35626a;
                    }
                } else {
                    throw th2;
                }
            } else {
                throw th2;
            }
        } else {
            c3437c = G0.h(m02);
        }
        return c3437c;
    }
}
