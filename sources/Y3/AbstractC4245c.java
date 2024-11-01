package y3;

import D3.f;
import Q5.p;
import Q5.x;
import R5.Q;
import com.stripe.android.model.o;
import java.util.Map;
import m6.C3374a;
import m6.EnumC3377d;

/* renamed from: y3.c */
/* loaded from: classes4.dex */
public abstract class AbstractC4245c {
    public static final /* synthetic */ float a(long j8) {
        return d(j8);
    }

    public static final /* synthetic */ Map b(f fVar) {
        return f(fVar);
    }

    public static final String c(f fVar) {
        if (fVar instanceof f.c) {
            return "google_pay";
        }
        if (fVar instanceof f.d) {
            return "link";
        }
        if (fVar instanceof f.e) {
            return ((f.e) fVar).h().u();
        }
        if (fVar instanceof f.C0023f) {
            o.p pVar = ((f.C0023f) fVar).r().f25635e;
            if (pVar != null) {
                return pVar.f25773a;
            }
        } else {
            if (fVar instanceof f.b) {
                return ((f.b) fVar).getType();
            }
            if (fVar != null) {
                throw new p();
            }
        }
        return null;
    }

    public static final float d(long j8) {
        return (float) C3374a.K(j8, EnumC3377d.f35046e);
    }

    public static final String e(f fVar) {
        boolean z8;
        boolean z9;
        boolean z10;
        if (fVar instanceof f.d) {
            return "wallet";
        }
        if (fVar instanceof f.e.d) {
            if (((f.e.d) fVar).s() != null) {
                return "instant_debits";
            }
        } else {
            boolean z11 = true;
            if (fVar instanceof f.c) {
                z8 = true;
            } else {
                z8 = fVar instanceof f.e;
            }
            if (z8) {
                z9 = true;
            } else {
                z9 = fVar instanceof f.C0023f;
            }
            if (z9) {
                z10 = true;
            } else {
                z10 = fVar instanceof f.b;
            }
            if (!z10 && fVar != null) {
                z11 = false;
            }
            if (!z11) {
                throw new p();
            }
        }
        return null;
    }

    public static final Map f(f fVar) {
        return B4.b.a(Q.k(x.a("selected_lpm", c(fVar)), x.a("link_context", e(fVar))));
    }
}
