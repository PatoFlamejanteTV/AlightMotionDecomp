package com.stripe.android.paymentsheet;

import R5.Q;
import androidx.annotation.Keep;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import com.stripe.android.model.StripeIntent;
import java.util.Map;
import q3.AbstractC3637f;

@StabilityInferred(parameters = 1)
@Keep
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class PaymentSheetNextActionHandlers {
    public static final int $stable = 0;
    public static final PaymentSheetNextActionHandlers INSTANCE = new PaymentSheetNextActionHandlers();

    private PaymentSheetNextActionHandlers() {
    }

    public final Map<Class<? extends StripeIntent.a>, AbstractC3637f> get() {
        return Q.k(Q5.x.a(StripeIntent.a.l.class, new com.stripe.android.paymentsheet.paymentdatacollection.polling.a()), Q5.x.a(StripeIntent.a.b.class, new com.stripe.android.paymentsheet.paymentdatacollection.polling.a()));
    }
}
