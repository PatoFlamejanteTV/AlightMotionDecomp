package n6;

import s6.AbstractC3991k;
import s6.C3990j;

/* loaded from: classes5.dex */
public abstract class g1 {
    public static final Object a(U5.d dVar) {
        C3990j c3990j;
        Object obj;
        U5.g context = dVar.getContext();
        B0.j(context);
        U5.d c8 = V5.b.c(dVar);
        if (c8 instanceof C3990j) {
            c3990j = (C3990j) c8;
        } else {
            c3990j = null;
        }
        if (c3990j == null) {
            obj = Q5.I.f8786a;
        } else {
            if (c3990j.f39196d.isDispatchNeeded(context)) {
                c3990j.p(context, Q5.I.f8786a);
            } else {
                f1 f1Var = new f1();
                U5.g plus = context.plus(f1Var);
                Q5.I i8 = Q5.I.f8786a;
                c3990j.p(plus, i8);
                if (f1Var.f35718a) {
                    if (AbstractC3991k.d(c3990j)) {
                        obj = V5.b.e();
                    } else {
                        obj = i8;
                    }
                }
            }
            obj = V5.b.e();
        }
        if (obj == V5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        if (obj == V5.b.e()) {
            return obj;
        }
        return Q5.I.f8786a;
    }
}
