package s3;

import Q5.s;
import kotlin.jvm.internal.AbstractC3292y;
import q3.AbstractC3637f;
import q3.C3645n;

/* loaded from: classes4.dex */
public final class I {
    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC3637f a(C3645n unsupportedNextActionHandler) {
        C3645n c3645n;
        AbstractC3292y.i(unsupportedNextActionHandler, "unsupportedNextActionHandler");
        try {
            s.a aVar = Q5.s.f8810b;
            Object newInstance = Class.forName("com.stripe.android.payments.wechatpay.WeChatPayNextActionHandler").getConstructor(null).newInstance(null);
            AbstractC3292y.g(newInstance, "null cannot be cast to non-null type com.stripe.android.payments.core.authentication.PaymentNextActionHandler<com.stripe.android.model.StripeIntent>");
            c3645n = Q5.s.b((AbstractC3637f) newInstance);
        } catch (Throwable th) {
            s.a aVar2 = Q5.s.f8810b;
            c3645n = Q5.s.b(Q5.t.a(th));
        }
        if (!Q5.s.g(c3645n)) {
            unsupportedNextActionHandler = c3645n;
        }
        return unsupportedNextActionHandler;
    }
}
