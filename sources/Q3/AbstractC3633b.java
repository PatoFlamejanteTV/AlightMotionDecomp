package q3;

import R5.Q;
import android.content.Context;
import com.stripe.android.paymentsheet.PaymentSheetNextActionHandlers;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;
import p3.i;

/* renamed from: q3.b */
/* loaded from: classes4.dex */
public abstract class AbstractC3633b {
    public static final /* synthetic */ Map a(boolean z8, Context context) {
        return b(z8, context);
    }

    public static final Map b(boolean z8, Context context) {
        try {
            if (z8) {
                PaymentSheetNextActionHandlers paymentSheetNextActionHandlers = PaymentSheetNextActionHandlers.INSTANCE;
                Object obj = PaymentSheetNextActionHandlers.class.getDeclaredField("INSTANCE").get(null);
                Object invoke = obj.getClass().getDeclaredMethod("get", null).invoke(obj, null);
                AbstractC3292y.g(invoke, "null cannot be cast to non-null type kotlin.collections.Map<java.lang.Class<out com.stripe.android.model.StripeIntent.NextActionData>{ com.stripe.android.payments.core.authentication.DefaultPaymentNextActionHandlerRegistryKt.NextActionHandlerKey }, @[JvmSuppressWildcards(suppress = <null>)] com.stripe.android.payments.core.authentication.PaymentNextActionHandler<com.stripe.android.model.StripeIntent>{ com.stripe.android.payments.core.authentication.DefaultPaymentNextActionHandlerRegistryKt.NextActionHandler }>");
                return (Map) invoke;
            }
            return Q.h();
        } catch (Exception e8) {
            i.b.a(i.a.b(p3.i.f36196a, context, null, 2, null), i.f.f36242m, x2.k.f40948e.b(e8), null, 4, null);
            return Q.h();
        }
    }
}
