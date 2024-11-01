package Q3;

import Q3.f;
import Q5.I;
import R5.AbstractC1435t;
import com.stripe.android.paymentsheet.D;
import d3.C2752d;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.C3289v;
import v3.C4122b;

/* loaded from: classes4.dex */
public final class a implements f {

    /* renamed from: d, reason: collision with root package name */
    public static final C0165a f8414d = new C0165a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f8415e = 8;

    /* renamed from: a, reason: collision with root package name */
    private final Function1 f8416a;

    /* renamed from: b, reason: collision with root package name */
    private final Function0 f8417b;

    /* renamed from: c, reason: collision with root package name */
    private final f.a f8418c;

    /* renamed from: Q3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0165a {

        /* renamed from: Q3.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        /* synthetic */ class C0166a extends C3289v implements Function1 {
            C0166a(Object obj) {
                super(1, obj, D.class, "removePaymentMethod", "removePaymentMethod(Lcom/stripe/android/model/PaymentMethod;)V", 0);
            }

            public final void d(com.stripe.android.model.o p02) {
                AbstractC3292y.i(p02, "p0");
                ((D) this.receiver).u(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                d((com.stripe.android.model.o) obj);
                return I.f8786a;
            }
        }

        /* renamed from: Q3.a$a$b */
        /* loaded from: classes4.dex */
        /* synthetic */ class b extends C3289v implements Function0 {
            b(Object obj) {
                super(0, obj, R3.a.class, "handleBackPressed", "handleBackPressed()V", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m46invoke();
                return I.f8786a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m46invoke() {
                ((R3.a) this.receiver).C();
            }
        }

        private C0165a() {
        }

        public final f a(R3.a viewModel, C2752d paymentMethodMetadata, C4122b customerStateHolder, D savedPaymentMethodMutator) {
            AbstractC3292y.i(viewModel, "viewModel");
            AbstractC3292y.i(paymentMethodMetadata, "paymentMethodMetadata");
            AbstractC3292y.i(customerStateHolder, "customerStateHolder");
            AbstractC3292y.i(savedPaymentMethodMutator, "savedPaymentMethodMutator");
            return new a((com.stripe.android.model.o) AbstractC1435t.m0((List) customerStateHolder.c().getValue()), paymentMethodMetadata, savedPaymentMethodMutator.q(), new C0166a(savedPaymentMethodMutator), new b(viewModel));
        }

        public /* synthetic */ C0165a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public a(com.stripe.android.model.o paymentMethod, C2752d paymentMethodMetadata, Function1 providePaymentMethodName, Function1 onDeletePaymentMethod, Function0 navigateBack) {
        AbstractC3292y.i(paymentMethod, "paymentMethod");
        AbstractC3292y.i(paymentMethodMetadata, "paymentMethodMetadata");
        AbstractC3292y.i(providePaymentMethodName, "providePaymentMethodName");
        AbstractC3292y.i(onDeletePaymentMethod, "onDeletePaymentMethod");
        AbstractC3292y.i(navigateBack, "navigateBack");
        this.f8416a = onDeletePaymentMethod;
        this.f8417b = navigateBack;
        this.f8418c = new f.a(q.a(paymentMethod, providePaymentMethodName, paymentMethodMetadata), paymentMethodMetadata.W().c());
    }

    @Override // Q3.f
    public void a(f.b viewAction) {
        AbstractC3292y.i(viewAction, "viewAction");
        if (viewAction instanceof f.b.a) {
            this.f8416a.invoke(getState().a().d());
            this.f8417b.invoke();
        }
    }

    @Override // Q3.f
    public f.a getState() {
        return this.f8418c;
    }
}
