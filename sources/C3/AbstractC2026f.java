package c3;

import Q5.p;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.n;
import com.stripe.android.model.u;
import d3.InterfaceC2755g;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: c3.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2026f {
    public static final boolean a(String code, InterfaceC2755g paymentMethodSaveConsentBehavior, StripeIntent intent, boolean z8) {
        AbstractC3292y.i(code, "code");
        AbstractC3292y.i(paymentMethodSaveConsentBehavior, "paymentMethodSaveConsentBehavior");
        AbstractC3292y.i(intent, "intent");
        if (!(paymentMethodSaveConsentBehavior instanceof InterfaceC2755g.a)) {
            if (!(paymentMethodSaveConsentBehavior instanceof InterfaceC2755g.b)) {
                if (paymentMethodSaveConsentBehavior instanceof InterfaceC2755g.c) {
                    if (intent instanceof n) {
                        if (!((n) intent).u(code)) {
                            return z8;
                        }
                    } else if (!(intent instanceof u)) {
                        throw new p();
                    }
                } else {
                    throw new p();
                }
            } else {
                return z8;
            }
        }
        return false;
    }
}
