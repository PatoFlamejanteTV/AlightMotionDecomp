package Q3;

import Q3.s;
import Q5.I;
import b3.C1969a;
import c6.InterfaceC2072n;
import com.stripe.android.model.o;
import d3.C2752d;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.C3289v;
import n6.C3445b0;
import n6.M;
import n6.N;
import n6.U0;
import q6.InterfaceC3813L;
import v3.C4122b;
import v3.C4131k;
import y3.C4243a;

/* loaded from: classes4.dex */
public final class d implements s {

    /* renamed from: l, reason: collision with root package name */
    public static final a f8504l = new a(null);

    /* renamed from: m, reason: collision with root package name */
    public static final int f8505m = 8;

    /* renamed from: a, reason: collision with root package name */
    private final String f8506a;

    /* renamed from: b, reason: collision with root package name */
    private final F3.a f8507b;

    /* renamed from: c, reason: collision with root package name */
    private final List f8508c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC2072n f8509d;

    /* renamed from: e, reason: collision with root package name */
    private final G3.d f8510e;

    /* renamed from: f, reason: collision with root package name */
    private final Function1 f8511f;

    /* renamed from: g, reason: collision with root package name */
    private final C1969a f8512g;

    /* renamed from: h, reason: collision with root package name */
    private final Function0 f8513h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f8514i;

    /* renamed from: j, reason: collision with root package name */
    private final M f8515j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC3813L f8516k;

    /* loaded from: classes4.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: Q3.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C0175a extends C3289v implements InterfaceC2072n {
            C0175a(Object obj) {
                super(2, obj, C4131k.class, "onFormFieldValuesChanged", "onFormFieldValuesChanged(Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Ljava/lang/String;)V", 0);
            }

            public final void d(B3.c cVar, String p12) {
                AbstractC3292y.i(p12, "p1");
                ((C4131k) this.receiver).c(cVar, p12);
            }

            @Override // c6.InterfaceC2072n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                d((B3.c) obj, (String) obj2);
                return I.f8786a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public /* synthetic */ class b extends C3289v implements Function1 {
            b(Object obj) {
                super(1, obj, C4243a.class, "reportFieldInteraction", "reportFieldInteraction(Ljava/lang/String;)V", 0);
            }

            public final void d(String p02) {
                AbstractC3292y.i(p02, "p0");
                ((C4243a) this.receiver).f(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                d((String) obj);
                return I.f8786a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class c extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ R3.a f8517a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(R3.a aVar) {
                super(0);
                this.f8517a = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(this.f8517a.r().e());
            }
        }

        private a() {
        }

        public final s a(String selectedPaymentMethodCode, R3.a viewModel, C2752d paymentMethodMetadata, C4122b customerStateHolder) {
            String str;
            AbstractC3292y.i(selectedPaymentMethodCode, "selectedPaymentMethodCode");
            AbstractC3292y.i(viewModel, "viewModel");
            AbstractC3292y.i(paymentMethodMetadata, "paymentMethodMetadata");
            AbstractC3292y.i(customerStateHolder, "customerStateHolder");
            boolean z8 = true;
            M a9 = N.a(C3445b0.a().plus(U0.b(null, 1, null)));
            C4131k a10 = C4131k.f40492g.a(viewModel, v3.m.f40502h.a(viewModel, a9), paymentMethodMetadata);
            F3.a a11 = a10.a(selectedPaymentMethodCode);
            List b9 = a10.b(selectedPaymentMethodCode);
            C0175a c0175a = new C0175a(a10);
            G3.d a12 = G3.d.f2858q.a(viewModel, paymentMethodMetadata, "payment_element", selectedPaymentMethodCode);
            Iterable iterable = (Iterable) customerStateHolder.c().getValue();
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    o.p pVar = ((com.stripe.android.model.o) it.next()).f25635e;
                    if (pVar != null) {
                        str = pVar.f25773a;
                    } else {
                        str = null;
                    }
                    if (AbstractC3292y.d(str, selectedPaymentMethodCode)) {
                        break;
                    }
                }
            }
            z8 = false;
            return new d(selectedPaymentMethodCode, a11, b9, c0175a, a12, new b(viewModel.c()), paymentMethodMetadata.p(selectedPaymentMethodCode, z8), new c(viewModel), paymentMethodMetadata.W().c(), viewModel.v(), a9);
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3293z implements Function1 {
        b() {
            super(1);
        }

        public final s.a a(boolean z8) {
            return new s.a(d.this.f8506a, z8, d.this.f8510e, d.this.f8507b, d.this.f8508c, d.this.f8512g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Boolean) obj).booleanValue());
        }
    }

    public d(String selectedPaymentMethodCode, F3.a formArguments, List formElements, InterfaceC2072n onFormFieldValuesChanged, G3.d usBankAccountArguments, Function1 reportFieldInteraction, C1969a c1969a, Function0 canGoBackDelegate, boolean z8, InterfaceC3813L processing, M coroutineScope) {
        AbstractC3292y.i(selectedPaymentMethodCode, "selectedPaymentMethodCode");
        AbstractC3292y.i(formArguments, "formArguments");
        AbstractC3292y.i(formElements, "formElements");
        AbstractC3292y.i(onFormFieldValuesChanged, "onFormFieldValuesChanged");
        AbstractC3292y.i(usBankAccountArguments, "usBankAccountArguments");
        AbstractC3292y.i(reportFieldInteraction, "reportFieldInteraction");
        AbstractC3292y.i(canGoBackDelegate, "canGoBackDelegate");
        AbstractC3292y.i(processing, "processing");
        AbstractC3292y.i(coroutineScope, "coroutineScope");
        this.f8506a = selectedPaymentMethodCode;
        this.f8507b = formArguments;
        this.f8508c = formElements;
        this.f8509d = onFormFieldValuesChanged;
        this.f8510e = usBankAccountArguments;
        this.f8511f = reportFieldInteraction;
        this.f8512g = c1969a;
        this.f8513h = canGoBackDelegate;
        this.f8514i = z8;
        this.f8515j = coroutineScope;
        this.f8516k = A4.g.m(processing, new b());
    }

    @Override // Q3.s
    public boolean a() {
        return ((Boolean) this.f8513h.invoke()).booleanValue();
    }

    @Override // Q3.s
    public void b(s.b viewAction) {
        AbstractC3292y.i(viewAction, "viewAction");
        if (AbstractC3292y.d(viewAction, s.b.a.f8718a)) {
            this.f8511f.invoke(this.f8506a);
        } else if (viewAction instanceof s.b.C0181b) {
            this.f8509d.invoke(((s.b.C0181b) viewAction).a(), this.f8506a);
        }
    }

    @Override // Q3.s
    public boolean c() {
        return this.f8514i;
    }

    @Override // Q3.s
    public void close() {
        N.d(this.f8515j, null, 1, null);
    }

    @Override // Q3.s
    public InterfaceC3813L getState() {
        return this.f8516k;
    }
}
