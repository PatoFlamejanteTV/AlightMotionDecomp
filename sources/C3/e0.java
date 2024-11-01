package C3;

import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.paymentsheet.PaymentSheetContractV2;
import com.stripe.android.paymentsheet.f;
import com.stripe.android.paymentsheet.w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import v3.C4125e;

/* loaded from: classes4.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    private final PaymentSheetContractV2.a f806a;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return e0.this.f806a.i();
        }
    }

    public e0(PaymentSheetContractV2.a starterArgs) {
        AbstractC3292y.i(starterArgs, "starterArgs");
        this.f806a = starterArgs;
    }

    public final PaymentSheetContractV2.a b() {
        return this.f806a;
    }

    public final v3.q c(Context appContext, U5.g workContext) {
        String str;
        AbstractC3292y.i(appContext, "appContext");
        AbstractC3292y.i(workContext, "workContext");
        w.i l8 = this.f806a.a().l();
        if (l8 != null) {
            str = l8.getId();
        } else {
            str = null;
        }
        return new C4125e(appContext, str, workContext);
    }

    public final f.d d(SavedStateHandle savedStateHandle, N5.a paymentConfigurationProvider, com.stripe.android.paymentsheet.paymentdatacollection.bacs.b bacsMandateConfirmationLauncherFactory, O2.h googlePayPaymentMethodLauncherFactory, com.stripe.android.payments.paymentlauncher.d stripePaymentLauncherAssistedFactory, com.stripe.android.paymentsheet.g intentConfirmationInterceptor, p3.i errorReporter, E2.h logger) {
        AbstractC3292y.i(savedStateHandle, "savedStateHandle");
        AbstractC3292y.i(paymentConfigurationProvider, "paymentConfigurationProvider");
        AbstractC3292y.i(bacsMandateConfirmationLauncherFactory, "bacsMandateConfirmationLauncherFactory");
        AbstractC3292y.i(googlePayPaymentMethodLauncherFactory, "googlePayPaymentMethodLauncherFactory");
        AbstractC3292y.i(stripePaymentLauncherAssistedFactory, "stripePaymentLauncherAssistedFactory");
        AbstractC3292y.i(intentConfirmationInterceptor, "intentConfirmationInterceptor");
        AbstractC3292y.i(errorReporter, "errorReporter");
        AbstractC3292y.i(logger, "logger");
        return new f.d(intentConfirmationInterceptor, paymentConfigurationProvider, bacsMandateConfirmationLauncherFactory, stripePaymentLauncherAssistedFactory, googlePayPaymentMethodLauncherFactory, savedStateHandle, new a(), errorReporter, logger);
    }
}
