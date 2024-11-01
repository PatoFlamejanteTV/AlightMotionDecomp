package E6;

import R5.a0;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;
import z6.AbstractC4273a;

/* loaded from: classes5.dex */
public abstract class P {

    /* renamed from: a, reason: collision with root package name */
    private static final Set f2046a = a0.i(AbstractC4273a.r(Q5.A.f8770b).a(), AbstractC4273a.s(Q5.C.f8775b).a(), AbstractC4273a.q(Q5.y.f8824b).a(), AbstractC4273a.t(Q5.F.f8781b).a());

    public static final boolean a(A6.f fVar) {
        AbstractC3292y.i(fVar, "<this>");
        if (fVar.isInline() && AbstractC3292y.d(fVar, D6.j.j())) {
            return true;
        }
        return false;
    }

    public static final boolean b(A6.f fVar) {
        AbstractC3292y.i(fVar, "<this>");
        if (fVar.isInline() && f2046a.contains(fVar)) {
            return true;
        }
        return false;
    }
}
