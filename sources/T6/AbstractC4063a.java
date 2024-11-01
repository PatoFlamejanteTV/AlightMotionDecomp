package t6;

import Q5.I;
import Q5.s;
import Q5.t;
import U5.d;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;
import s6.AbstractC3991k;

/* renamed from: t6.a */
/* loaded from: classes5.dex */
public abstract class AbstractC4063a {
    private static final void a(d dVar, Throwable th) {
        s.a aVar = s.f8810b;
        dVar.resumeWith(s.b(t.a(th)));
        throw th;
    }

    public static final void b(d dVar, d dVar2) {
        try {
            d c8 = V5.b.c(dVar);
            s.a aVar = s.f8810b;
            AbstractC3991k.c(c8, s.b(I.f8786a), null, 2, null);
        } catch (Throwable th) {
            a(dVar2, th);
        }
    }

    public static final void c(InterfaceC2072n interfaceC2072n, Object obj, d dVar, Function1 function1) {
        try {
            d c8 = V5.b.c(V5.b.a(interfaceC2072n, obj, dVar));
            s.a aVar = s.f8810b;
            AbstractC3991k.b(c8, s.b(I.f8786a), function1);
        } catch (Throwable th) {
            a(dVar, th);
        }
    }

    public static /* synthetic */ void d(InterfaceC2072n interfaceC2072n, Object obj, d dVar, Function1 function1, int i8, Object obj2) {
        if ((i8 & 4) != 0) {
            function1 = null;
        }
        c(interfaceC2072n, obj, dVar, function1);
    }
}
