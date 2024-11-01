package I2;

import B2.C0953e;
import B2.InterfaceC0951c;
import I2.d;
import O3.C1362j;
import O3.InterfaceC1371t;
import R5.a0;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.paymentsheet.f;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n6.C3445b0;
import t3.C4005a;

/* loaded from: classes4.dex */
public interface d {

    /* renamed from: a, reason: collision with root package name */
    public static final a f3329a = a.f3330a;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f3330a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final D3.f f3331b = null;

        /* renamed from: I2.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0066a extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ N5.a f3332a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0066a(N5.a aVar) {
                super(0);
                this.f3332a = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(l6.n.B(((n2.r) this.f3332a.get()).f(), "pk_live", false, 2, null));
            }
        }

        /* loaded from: classes4.dex */
        static final class b extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ N5.a f3333a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(N5.a aVar) {
                super(0);
                this.f3333a = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return ((n2.r) this.f3333a.get()).f();
            }
        }

        /* loaded from: classes4.dex */
        static final class c extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ N5.a f3334a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(N5.a aVar) {
                super(0);
                this.f3334a = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return ((n2.r) this.f3334a.get()).h();
            }
        }

        /* renamed from: I2.d$a$d, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0067d extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Integer f3335a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0067d(Integer num) {
                super(0);
                this.f3335a = num;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                return this.f3335a;
            }
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String f(N5.a paymentConfiguration) {
            AbstractC3292y.i(paymentConfiguration, "$paymentConfiguration");
            return ((n2.r) paymentConfiguration.get()).f();
        }

        public final Context b(Application application) {
            AbstractC3292y.i(application, "application");
            return application;
        }

        public final U5.g c() {
            return C3445b0.b();
        }

        public final Function0 d(N5.a paymentConfiguration) {
            AbstractC3292y.i(paymentConfiguration, "paymentConfiguration");
            return new C0066a(paymentConfiguration);
        }

        public final n2.r e(Application application) {
            AbstractC3292y.i(application, "application");
            return n2.r.f35413c.a(application);
        }

        public final C0953e g(Application application, final N5.a paymentConfiguration) {
            AbstractC3292y.i(application, "application");
            AbstractC3292y.i(paymentConfiguration, "paymentConfiguration");
            PackageManager packageManager = application.getPackageManager();
            String packageName = application.getPackageName();
            if (packageName == null) {
                packageName = "";
            }
            return new C0953e(packageManager, E2.a.f1549a.a(application), packageName, new N5.a() { // from class: I2.b
                @Override // N5.a
                public final Object get() {
                    String f8;
                    f8 = d.a.f(N5.a.this);
                    return f8;
                }
            }, new I2.c(new B2.u(application)), null, 32, null);
        }

        public final U5.g h() {
            return C3445b0.b();
        }

        public final boolean i() {
            return false;
        }

        public final v2.d j(boolean z8) {
            return v2.d.f40434a.a(z8);
        }

        public final Set k() {
            return a0.d("CustomerSheet");
        }

        public final Function0 l(N5.a paymentConfiguration) {
            AbstractC3292y.i(paymentConfiguration, "paymentConfiguration");
            return new b(paymentConfiguration);
        }

        public final Function0 m(N5.a paymentConfiguration) {
            AbstractC3292y.i(paymentConfiguration, "paymentConfiguration");
            return new c(paymentConfiguration);
        }

        public final com.stripe.android.paymentsheet.paymentdatacollection.bacs.b n() {
            return com.stripe.android.paymentsheet.paymentdatacollection.bacs.g.f27481a;
        }

        public final InterfaceC1371t.a o() {
            return C1362j.a.f7608a;
        }

        public final boolean p() {
            return false;
        }

        public final p3.i q(C0953e analyticsRequestFactory, InterfaceC0951c analyticsRequestExecutor) {
            AbstractC3292y.i(analyticsRequestFactory, "analyticsRequestFactory");
            AbstractC3292y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
            return new p3.j(analyticsRequestExecutor, analyticsRequestFactory);
        }

        public final f.d r(SavedStateHandle savedStateHandle, N5.a paymentConfigurationProvider, com.stripe.android.paymentsheet.paymentdatacollection.bacs.b bacsMandateConfirmationLauncherFactory, com.stripe.android.payments.paymentlauncher.d stripePaymentLauncherAssistedFactory, Integer num, com.stripe.android.paymentsheet.g intentConfirmationInterceptor, p3.i errorReporter) {
            AbstractC3292y.i(savedStateHandle, "savedStateHandle");
            AbstractC3292y.i(paymentConfigurationProvider, "paymentConfigurationProvider");
            AbstractC3292y.i(bacsMandateConfirmationLauncherFactory, "bacsMandateConfirmationLauncherFactory");
            AbstractC3292y.i(stripePaymentLauncherAssistedFactory, "stripePaymentLauncherAssistedFactory");
            AbstractC3292y.i(intentConfirmationInterceptor, "intentConfirmationInterceptor");
            AbstractC3292y.i(errorReporter, "errorReporter");
            return new f.d(intentConfirmationInterceptor, paymentConfigurationProvider, bacsMandateConfirmationLauncherFactory, stripePaymentLauncherAssistedFactory, null, savedStateHandle, new C0067d(num), errorReporter, null);
        }

        public final t3.d s() {
            return C4005a.f39466a;
        }

        public final D3.f t() {
            return f3331b;
        }
    }
}
