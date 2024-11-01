package k3;

import Q5.p;
import android.content.Context;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.n;
import com.stripe.android.model.o;
import com.stripe.android.model.u;
import kotlin.jvm.internal.AbstractC3292y;
import n2.AbstractC3394E;

/* renamed from: k3.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3236b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f34403a;

    public C3236b(Context context) {
        AbstractC3292y.i(context, "context");
        this.f34403a = context;
    }

    private final String b(n nVar) {
        String str;
        n.g.c cVar;
        o r8;
        o.p pVar;
        if (nVar.getStatus() != StripeIntent.Status.f25371e || ((r8 = nVar.r()) != null && (pVar = r8.f25635e) != null && pVar.f25775c)) {
            n.g i8 = nVar.i();
            if (i8 != null) {
                str = i8.o();
            } else {
                str = null;
            }
            if (!AbstractC3292y.d(str, "payment_intent_authentication_failure")) {
                n.g i9 = nVar.i();
                if (i9 != null) {
                    cVar = i9.h();
                } else {
                    cVar = null;
                }
                if (cVar != n.g.c.f25616f) {
                    return null;
                }
                return j3.l.c(nVar.i(), this.f34403a).f();
            }
        }
        return this.f34403a.getResources().getString(AbstractC3394E.f35247n0);
    }

    private final String c(u uVar) {
        String str;
        u.e.c cVar;
        u.e f8 = uVar.f();
        if (f8 != null) {
            str = f8.o();
        } else {
            str = null;
        }
        if (AbstractC3292y.d(str, "setup_intent_authentication_failure")) {
            return this.f34403a.getResources().getString(AbstractC3394E.f35247n0);
        }
        u.e f9 = uVar.f();
        if (f9 != null) {
            cVar = f9.h();
        } else {
            cVar = null;
        }
        if (cVar != u.e.c.f25954f) {
            return null;
        }
        return j3.l.d(uVar.f(), this.f34403a).f();
    }

    private final boolean d(StripeIntent stripeIntent) {
        o.p pVar;
        o r8 = stripeIntent.r();
        if (r8 != null) {
            pVar = r8.f25635e;
        } else {
            pVar = null;
        }
        if (pVar == o.p.f25755i && (stripeIntent.j() instanceof StripeIntent.a.j.b)) {
            return true;
        }
        return false;
    }

    public final String a(StripeIntent intent, int i8) {
        AbstractC3292y.i(intent, "intent");
        if (i8 == 4) {
            return this.f34403a.getResources().getString(AbstractC3394E.f35249o0);
        }
        if (d(intent) || (intent.getStatus() != StripeIntent.Status.f25373g && intent.getStatus() != StripeIntent.Status.f25371e)) {
            return null;
        }
        if (intent instanceof n) {
            return b((n) intent);
        }
        if (intent instanceof u) {
            return c((u) intent);
        }
        throw new p();
    }
}
