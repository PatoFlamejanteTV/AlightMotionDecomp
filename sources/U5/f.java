package U5;

import Q5.I;
import Q5.s;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public abstract class f {
    public static final d a(InterfaceC2072n interfaceC2072n, Object obj, d completion) {
        AbstractC3292y.i(interfaceC2072n, "<this>");
        AbstractC3292y.i(completion, "completion");
        return new i(V5.b.c(V5.b.a(interfaceC2072n, obj, completion)), V5.b.e());
    }

    public static final void b(InterfaceC2072n interfaceC2072n, Object obj, d completion) {
        AbstractC3292y.i(interfaceC2072n, "<this>");
        AbstractC3292y.i(completion, "completion");
        d c8 = V5.b.c(V5.b.a(interfaceC2072n, obj, completion));
        s.a aVar = s.f8810b;
        c8.resumeWith(s.b(I.f8786a));
    }
}
