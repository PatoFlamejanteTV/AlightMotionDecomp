package B3;

import d3.C2752d;
import h4.InterfaceC2949a;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f565a = new b();

    private b() {
    }

    public final F3.a a(String paymentMethodCode, F2.c configuration, String merchantName, InterfaceC2949a cbcEligibility) {
        AbstractC3292y.i(paymentMethodCode, "paymentMethodCode");
        AbstractC3292y.i(configuration, "configuration");
        AbstractC3292y.i(merchantName, "merchantName");
        AbstractC3292y.i(cbcEligibility, "cbcEligibility");
        return new F3.a(paymentMethodCode, cbcEligibility, merchantName, null, configuration.h(), null, configuration.f(), 40, null);
    }

    public final F3.a b(String paymentMethodCode, C2752d metadata) {
        AbstractC3292y.i(paymentMethodCode, "paymentMethodCode");
        AbstractC3292y.i(metadata, "metadata");
        return new F3.a(paymentMethodCode, metadata.w(), metadata.Q(), metadata.h(), metadata.x(), metadata.q(), metadata.v());
    }
}
