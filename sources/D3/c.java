package D3;

import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.n;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public abstract class c {
    public static final String a(StripeIntent stripeIntent) {
        AbstractC3292y.i(stripeIntent, "<this>");
        if (stripeIntent instanceof n) {
            return ((n) stripeIntent).L();
        }
        return null;
    }
}
