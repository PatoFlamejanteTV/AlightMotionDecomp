package E6;

import A6.j;
import A6.k;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public abstract class V {
    public static final A6.f a(A6.f fVar, F6.b module) {
        A6.f a9;
        AbstractC3292y.i(fVar, "<this>");
        AbstractC3292y.i(module, "module");
        if (AbstractC3292y.d(fVar.getKind(), j.a.f286a)) {
            A6.f b9 = A6.b.b(module, fVar);
            if (b9 != null && (a9 = a(b9, module)) != null) {
                return a9;
            }
            return fVar;
        }
        if (fVar.isInline()) {
            return a(fVar.h(0), module);
        }
        return fVar;
    }

    public static final U b(D6.a aVar, A6.f desc) {
        AbstractC3292y.i(aVar, "<this>");
        AbstractC3292y.i(desc, "desc");
        A6.j kind = desc.getKind();
        if (kind instanceof A6.d) {
            return U.f2053f;
        }
        if (AbstractC3292y.d(kind, k.b.f289a)) {
            return U.f2051d;
        }
        if (AbstractC3292y.d(kind, k.c.f290a)) {
            A6.f a9 = a(desc.h(0), aVar.e());
            A6.j kind2 = a9.getKind();
            if (!(kind2 instanceof A6.e) && !AbstractC3292y.d(kind2, j.b.f287a)) {
                if (aVar.d().b()) {
                    return U.f2051d;
                }
                throw B.c(a9);
            }
            return U.f2052e;
        }
        return U.f2050c;
    }
}
