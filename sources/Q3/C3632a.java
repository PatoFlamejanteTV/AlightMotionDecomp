package q3;

import Q5.InterfaceC1416k;
import R5.Q;
import R5.a0;
import android.content.Context;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import com.stripe.android.PaymentRelayContract;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.model.Source;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import s3.AbstractC3950b;

/* renamed from: q3.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3632a implements InterfaceC3639h {

    /* renamed from: h, reason: collision with root package name */
    public static final C0827a f36661h = new C0827a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f36662i = 8;

    /* renamed from: a, reason: collision with root package name */
    private final C3635d f36663a;

    /* renamed from: b, reason: collision with root package name */
    private final C3643l f36664b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f36665c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f36666d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC1416k f36667e;

    /* renamed from: f, reason: collision with root package name */
    private ActivityResultLauncher f36668f;

    /* renamed from: g, reason: collision with root package name */
    private ActivityResultLauncher f36669g;

    /* renamed from: q3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0827a {
        private C0827a() {
        }

        public final InterfaceC3639h a(Context context, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, boolean z8, U5.g workContext, U5.g uiContext, Map threeDs1IntentReturnUrlMap, Function0 publishableKeyProvider, Set productUsage, boolean z9, boolean z10) {
            AbstractC3292y.i(context, "context");
            AbstractC3292y.i(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
            AbstractC3292y.i(workContext, "workContext");
            AbstractC3292y.i(uiContext, "uiContext");
            AbstractC3292y.i(threeDs1IntentReturnUrlMap, "threeDs1IntentReturnUrlMap");
            AbstractC3292y.i(publishableKeyProvider, "publishableKeyProvider");
            AbstractC3292y.i(productUsage, "productUsage");
            return AbstractC3950b.a().a(context).i(paymentAnalyticsRequestFactory).d(z8).f(workContext).h(uiContext).g(threeDs1IntentReturnUrlMap).c(publishableKeyProvider).b(productUsage).e(z9).j(z10).build().a();
        }

        public /* synthetic */ C0827a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: q3.a$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC3293z implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f36671b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context) {
            super(0);
            this.f36671b = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Map invoke() {
            return AbstractC3633b.a(C3632a.this.f36666d, this.f36671b);
        }
    }

    public C3632a(C3635d noOpIntentNextActionHandler, C3643l sourceNextActionHandler, Map paymentNextActionHandlers, boolean z8, Context applicationContext) {
        AbstractC3292y.i(noOpIntentNextActionHandler, "noOpIntentNextActionHandler");
        AbstractC3292y.i(sourceNextActionHandler, "sourceNextActionHandler");
        AbstractC3292y.i(paymentNextActionHandlers, "paymentNextActionHandlers");
        AbstractC3292y.i(applicationContext, "applicationContext");
        this.f36663a = noOpIntentNextActionHandler;
        this.f36664b = sourceNextActionHandler;
        this.f36665c = paymentNextActionHandlers;
        this.f36666d = z8;
        this.f36667e = Q5.l.b(new b(applicationContext));
    }

    private final Map h() {
        return (Map) this.f36667e.getValue();
    }

    @Override // q3.InterfaceC3639h
    public AbstractC3637f a(Object obj) {
        AbstractC3637f abstractC3637f;
        if (obj instanceof StripeIntent) {
            StripeIntent stripeIntent = (StripeIntent) obj;
            if (!stripeIntent.t()) {
                C3635d c3635d = this.f36663a;
                AbstractC3292y.g(c3635d, "null cannot be cast to non-null type com.stripe.android.payments.core.authentication.PaymentNextActionHandler<Actionable of com.stripe.android.payments.core.authentication.DefaultPaymentNextActionHandlerRegistry.getNextActionHandler>");
                return c3635d;
            }
            Map q8 = Q.q(this.f36665c, h());
            StripeIntent.a j8 = stripeIntent.j();
            if (j8 == null || (abstractC3637f = (AbstractC3637f) q8.get(j8.getClass())) == null) {
                abstractC3637f = this.f36663a;
            }
            AbstractC3292y.g(abstractC3637f, "null cannot be cast to non-null type com.stripe.android.payments.core.authentication.PaymentNextActionHandler<Actionable of com.stripe.android.payments.core.authentication.DefaultPaymentNextActionHandlerRegistry.getNextActionHandler>");
            return abstractC3637f;
        }
        if (obj instanceof Source) {
            C3643l c3643l = this.f36664b;
            AbstractC3292y.g(c3643l, "null cannot be cast to non-null type com.stripe.android.payments.core.authentication.PaymentNextActionHandler<Actionable of com.stripe.android.payments.core.authentication.DefaultPaymentNextActionHandlerRegistry.getNextActionHandler>");
            return c3643l;
        }
        throw new IllegalStateException(("No suitable PaymentNextActionHandler for " + obj).toString());
    }

    @Override // o3.InterfaceC3526a
    public void b(ActivityResultCaller activityResultCaller, ActivityResultCallback activityResultCallback) {
        AbstractC3292y.i(activityResultCaller, "activityResultCaller");
        AbstractC3292y.i(activityResultCallback, "activityResultCallback");
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((AbstractC3637f) it.next()).b(activityResultCaller, activityResultCallback);
        }
        this.f36668f = activityResultCaller.registerForActivityResult(new PaymentRelayContract(), activityResultCallback);
        this.f36669g = activityResultCaller.registerForActivityResult(new PaymentBrowserAuthContract(), activityResultCallback);
    }

    @Override // o3.InterfaceC3526a
    public void c() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((AbstractC3637f) it.next()).c();
        }
        ActivityResultLauncher activityResultLauncher = this.f36668f;
        if (activityResultLauncher != null) {
            activityResultLauncher.unregister();
        }
        ActivityResultLauncher activityResultLauncher2 = this.f36669g;
        if (activityResultLauncher2 != null) {
            activityResultLauncher2.unregister();
        }
        this.f36668f = null;
        this.f36669g = null;
    }

    public final Set e() {
        Set b9 = a0.b();
        b9.add(this.f36663a);
        b9.add(this.f36664b);
        b9.addAll(this.f36665c.values());
        b9.addAll(h().values());
        return a0.a(b9);
    }

    public final ActivityResultLauncher f() {
        return this.f36669g;
    }

    public final ActivityResultLauncher g() {
        return this.f36668f;
    }
}
