package f4;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentFactory;
import c4.v;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: f4.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2855g extends FragmentFactory {

    /* renamed from: a, reason: collision with root package name */
    private final Y3.m f31869a;

    /* renamed from: b, reason: collision with root package name */
    private final v f31870b;

    /* renamed from: c, reason: collision with root package name */
    private final com.stripe.android.stripe3ds2.transaction.k f31871c;

    /* renamed from: d, reason: collision with root package name */
    private final Z3.c f31872d;

    /* renamed from: e, reason: collision with root package name */
    private final com.stripe.android.stripe3ds2.transaction.b f31873e;

    /* renamed from: f, reason: collision with root package name */
    private final d4.g f31874f;

    /* renamed from: g, reason: collision with root package name */
    private final com.stripe.android.stripe3ds2.transaction.n f31875g;

    /* renamed from: h, reason: collision with root package name */
    private final U5.g f31876h;

    public C2855g(Y3.m uiCustomization, v transactionTimer, com.stripe.android.stripe3ds2.transaction.k errorRequestExecutor, Z3.c errorReporter, com.stripe.android.stripe3ds2.transaction.b challengeActionHandler, d4.g gVar, com.stripe.android.stripe3ds2.transaction.n intentData, U5.g workContext) {
        AbstractC3292y.i(uiCustomization, "uiCustomization");
        AbstractC3292y.i(transactionTimer, "transactionTimer");
        AbstractC3292y.i(errorRequestExecutor, "errorRequestExecutor");
        AbstractC3292y.i(errorReporter, "errorReporter");
        AbstractC3292y.i(challengeActionHandler, "challengeActionHandler");
        AbstractC3292y.i(intentData, "intentData");
        AbstractC3292y.i(workContext, "workContext");
        this.f31869a = uiCustomization;
        this.f31870b = transactionTimer;
        this.f31871c = errorRequestExecutor;
        this.f31872d = errorReporter;
        this.f31873e = challengeActionHandler;
        this.f31874f = gVar;
        this.f31875g = intentData;
        this.f31876h = workContext;
    }

    @Override // androidx.fragment.app.FragmentFactory
    public Fragment instantiate(ClassLoader classLoader, String className) {
        AbstractC3292y.i(classLoader, "classLoader");
        AbstractC3292y.i(className, "className");
        if (AbstractC3292y.d(className, com.stripe.android.stripe3ds2.views.c.class.getName())) {
            return new com.stripe.android.stripe3ds2.views.c(this.f31869a, this.f31870b, this.f31871c, this.f31872d, this.f31873e, this.f31874f, this.f31875g, this.f31876h);
        }
        Fragment instantiate = super.instantiate(classLoader, className);
        AbstractC3292y.f(instantiate);
        return instantiate;
    }
}
