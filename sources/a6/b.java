package A6;

import C6.m0;
import j6.InterfaceC3214c;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public abstract class b {
    public static final InterfaceC3214c a(f fVar) {
        AbstractC3292y.i(fVar, "<this>");
        if (fVar instanceof c) {
            return ((c) fVar).f252b;
        }
        if (fVar instanceof m0) {
            return a(((m0) fVar).j());
        }
        return null;
    }

    public static final f b(F6.b bVar, f descriptor) {
        y6.b c8;
        AbstractC3292y.i(bVar, "<this>");
        AbstractC3292y.i(descriptor, "descriptor");
        InterfaceC3214c a9 = a(descriptor);
        if (a9 == null || (c8 = F6.b.c(bVar, a9, null, 2, null)) == null) {
            return null;
        }
        return c8.a();
    }

    public static final f c(f fVar, InterfaceC3214c context) {
        AbstractC3292y.i(fVar, "<this>");
        AbstractC3292y.i(context, "context");
        return new c(fVar, context);
    }
}
