package D3;

import Q5.s;
import Q5.t;
import R5.AbstractC1435t;
import R5.a0;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.n;
import com.stripe.android.model.u;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public abstract class m {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(n nVar) {
        return AbstractC1435t.d0(a0.i(StripeIntent.Status.f25369c, StripeIntent.Status.f25374h, StripeIntent.Status.f25375i), nVar.getStatus());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(u uVar) {
        return AbstractC1435t.d0(a0.i(StripeIntent.Status.f25369c, StripeIntent.Status.f25374h), uVar.getStatus());
    }

    public static final N3.j e(StripeIntent stripeIntent) {
        Object b9;
        AbstractC3292y.i(stripeIntent, "<this>");
        try {
            s.a aVar = s.f8810b;
            b9 = s.b(l.f1319a.a(stripeIntent));
        } catch (Throwable th) {
            s.a aVar2 = s.f8810b;
            b9 = s.b(t.a(th));
        }
        Throwable e8 = s.e(b9);
        if (e8 != null) {
            return N3.k.a(e8);
        }
        return null;
    }
}
