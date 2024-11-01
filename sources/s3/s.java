package s3;

import android.content.Context;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import k3.C3235a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import q3.C3632a;
import q3.InterfaceC3639h;
import v0.AbstractC4118a;

/* loaded from: classes4.dex */
public final class s {
    public final C3235a a(Context context) {
        AbstractC3292y.i(context, "context");
        return C3235a.f34401b.a(context);
    }

    public final boolean b(Context context) {
        AbstractC3292y.i(context, "context");
        return AbstractC4118a.c(context);
    }

    public final InterfaceC3639h c(Context context, boolean z8, U5.g workContext, U5.g uiContext, Map threeDs1IntentReturnUrlMap, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, Function0 publishableKeyProvider, Set productUsage, boolean z9, boolean z10) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(workContext, "workContext");
        AbstractC3292y.i(uiContext, "uiContext");
        AbstractC3292y.i(threeDs1IntentReturnUrlMap, "threeDs1IntentReturnUrlMap");
        AbstractC3292y.i(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        AbstractC3292y.i(publishableKeyProvider, "publishableKeyProvider");
        AbstractC3292y.i(productUsage, "productUsage");
        return C3632a.f36661h.a(context, paymentAnalyticsRequestFactory, z8, workContext, uiContext, threeDs1IntentReturnUrlMap, publishableKeyProvider, productUsage, z9, z10);
    }

    public final Map d() {
        return new LinkedHashMap();
    }
}
