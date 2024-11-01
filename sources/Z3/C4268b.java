package z3;

import D3.f;
import J3.d;
import Q5.I;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.n;
import com.stripe.android.model.o;
import com.stripe.android.paymentsheet.w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: z3.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4268b implements InterfaceC4267a {
    private final boolean d(w.l lVar) {
        w.l.a aVar;
        w.m b9;
        if (lVar instanceof w.l.a) {
            aVar = (w.l.a) lVar;
        } else {
            aVar = null;
        }
        if (aVar != null && (b9 = aVar.b()) != null && b9.h() && (((w.l.a) lVar).b().a() instanceof w.m.d.a)) {
            return true;
        }
        return false;
    }

    private final boolean e(StripeIntent stripeIntent, w.l lVar) {
        n nVar;
        if (stripeIntent instanceof n) {
            nVar = (n) stripeIntent;
        } else {
            nVar = null;
        }
        if (nVar != null && nVar.l() && (lVar instanceof w.l.b)) {
            return true;
        }
        return false;
    }

    private final boolean f(f fVar) {
        if ((fVar instanceof f.C0023f) && ((f.C0023f) fVar).r().f25635e == o.p.f25755i) {
            return true;
        }
        return false;
    }

    @Override // z3.InterfaceC4267a
    public boolean a(StripeIntent stripeIntent, f fVar, w.l lVar, Function0 extraRequirements) {
        AbstractC3292y.i(extraRequirements, "extraRequirements");
        if (f(fVar) && c(stripeIntent, lVar) && ((Boolean) extraRequirements.invoke()).booleanValue()) {
            return true;
        }
        return false;
    }

    @Override // z3.InterfaceC4267a
    public void b(f fVar, Function1 launch) {
        f.C0023f c0023f;
        o.g gVar;
        o r8;
        AbstractC3292y.i(launch, "launch");
        I i8 = null;
        if (fVar instanceof f.C0023f) {
            c0023f = (f.C0023f) fVar;
        } else {
            c0023f = null;
        }
        if (c0023f != null && (r8 = c0023f.r()) != null) {
            gVar = r8.f25638h;
        } else {
            gVar = null;
        }
        d a9 = d.f4094c.a(gVar);
        if (a9 != null) {
            launch.invoke(a9);
            i8 = I.f8786a;
        }
        if (i8 != null) {
        } else {
            throw new IllegalStateException("unable to create CvcRecollectionData");
        }
    }

    @Override // z3.InterfaceC4267a
    public boolean c(StripeIntent stripeIntent, w.l lVar) {
        if (!d(lVar) && !e(stripeIntent, lVar)) {
            return false;
        }
        return true;
    }
}
