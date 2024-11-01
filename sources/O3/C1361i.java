package O3;

import O3.InterfaceC1354b;
import Q5.C1413h;
import c6.InterfaceC2072n;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import d3.C2752d;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.C3289v;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.U0;
import q6.AbstractC3815N;
import q6.InterfaceC3813L;
import q6.InterfaceC3822g;
import v3.C4131k;
import y3.C4243a;

/* renamed from: O3.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1361i implements InterfaceC1354b {

    /* renamed from: r, reason: collision with root package name */
    public static final e f7563r = new e(null);

    /* renamed from: s, reason: collision with root package name */
    public static final int f7564s = 8;

    /* renamed from: a, reason: collision with root package name */
    private final String f7565a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3813L f7566b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3813L f7567c;

    /* renamed from: d, reason: collision with root package name */
    private final List f7568d;

    /* renamed from: e, reason: collision with root package name */
    private final Function1 f7569e;

    /* renamed from: f, reason: collision with root package name */
    private final Function1 f7570f;

    /* renamed from: g, reason: collision with root package name */
    private final Function0 f7571g;

    /* renamed from: h, reason: collision with root package name */
    private final Function1 f7572h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC2072n f7573i;

    /* renamed from: j, reason: collision with root package name */
    private final Function1 f7574j;

    /* renamed from: k, reason: collision with root package name */
    private final Function1 f7575k;

    /* renamed from: l, reason: collision with root package name */
    private final n6.M f7576l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f7577m;

    /* renamed from: n, reason: collision with root package name */
    private final q6.w f7578n;

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC3813L f7579o;

    /* renamed from: p, reason: collision with root package name */
    private final q6.w f7580p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC3813L f7581q;

    /* renamed from: O3.i$a */
    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f7582a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: O3.i$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0144a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1361i f7584a;

            C0144a(C1361i c1361i) {
                this.f7584a = c1361i;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(D3.f fVar, U5.d dVar) {
                this.f7584a.f7571g.invoke();
                return Q5.I.f8786a;
            }
        }

        a(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f7582a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L interfaceC3813L = C1361i.this.f7566b;
                C0144a c0144a = new C0144a(C1361i.this);
                this.f7582a = 1;
                if (interfaceC3813L.collect(c0144a, this) == e8) {
                    return e8;
                }
            }
            throw new C1413h();
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* renamed from: O3.i$b */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f7585a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: O3.i$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1361i f7587a;

            a(C1361i c1361i) {
                this.f7587a = c1361i;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(String str, U5.d dVar) {
                this.f7587a.f7580p.setValue(InterfaceC1354b.a.b((InterfaceC1354b.a) this.f7587a.f7580p.getValue(), str, null, (F3.a) this.f7587a.f7569e.invoke(str), (List) this.f7587a.f7570f.invoke(str), null, false, (G3.d) this.f7587a.f7575k.invoke(str), 50, null));
                return Q5.I.f8786a;
            }
        }

        b(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f7585a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L interfaceC3813L = C1361i.this.f7579o;
                a aVar = new a(C1361i.this);
                this.f7585a = 1;
                if (interfaceC3813L.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1413h();
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* renamed from: O3.i$c */
    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f7588a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: O3.i$c$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1361i f7590a;

            a(C1361i c1361i) {
                this.f7590a = c1361i;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(D3.f fVar, U5.d dVar) {
                this.f7590a.f7580p.setValue(InterfaceC1354b.a.b((InterfaceC1354b.a) this.f7590a.f7580p.getValue(), null, null, null, null, fVar, false, null, 111, null));
                return Q5.I.f8786a;
            }
        }

        c(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f7588a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L interfaceC3813L = C1361i.this.f7566b;
                a aVar = new a(C1361i.this);
                this.f7588a = 1;
                if (interfaceC3813L.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1413h();
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* renamed from: O3.i$d */
    /* loaded from: classes4.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f7591a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: O3.i$d$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1361i f7593a;

            a(C1361i c1361i) {
                this.f7593a = c1361i;
            }

            public final Object b(boolean z8, U5.d dVar) {
                this.f7593a.f7580p.setValue(InterfaceC1354b.a.b((InterfaceC1354b.a) this.f7593a.f7580p.getValue(), null, null, null, null, null, z8, null, 95, null));
                return Q5.I.f8786a;
            }

            @Override // q6.InterfaceC3822g
            public /* bridge */ /* synthetic */ Object emit(Object obj, U5.d dVar) {
                return b(((Boolean) obj).booleanValue(), dVar);
            }
        }

        d(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new d(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f7591a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L interfaceC3813L = C1361i.this.f7567c;
                a aVar = new a(C1361i.this);
                this.f7591a = 1;
                if (interfaceC3813L.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1413h();
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* renamed from: O3.i$e */
    /* loaded from: classes4.dex */
    public static final class e {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: O3.i$e$a */
        /* loaded from: classes4.dex */
        public /* synthetic */ class a extends C3289v implements Function1 {
            a(Object obj) {
                super(1, obj, C4131k.class, "createFormArguments", "createFormArguments(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final F3.a invoke(String p02) {
                AbstractC3292y.i(p02, "p0");
                return ((C4131k) this.receiver).a(p02);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: O3.i$e$b */
        /* loaded from: classes4.dex */
        public /* synthetic */ class b extends C3289v implements Function1 {
            b(Object obj) {
                super(1, obj, C4131k.class, "formElementsForCode", "formElementsForCode(Ljava/lang/String;)Ljava/util/List;", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final List invoke(String p02) {
                AbstractC3292y.i(p02, "p0");
                return ((C4131k) this.receiver).b(p02);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: O3.i$e$c */
        /* loaded from: classes4.dex */
        public /* synthetic */ class c extends C3289v implements Function0 {
            c(Object obj) {
                super(0, obj, R3.a.class, "clearErrorMessages", "clearErrorMessages()V", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m34invoke();
                return Q5.I.f8786a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m34invoke() {
                ((R3.a) this.receiver).b();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: O3.i$e$d */
        /* loaded from: classes4.dex */
        public /* synthetic */ class d extends C3289v implements Function1 {
            d(Object obj) {
                super(1, obj, C4243a.class, "reportFieldInteraction", "reportFieldInteraction(Ljava/lang/String;)V", 0);
            }

            public final void d(String p02) {
                AbstractC3292y.i(p02, "p0");
                ((C4243a) this.receiver).f(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                d((String) obj);
                return Q5.I.f8786a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: O3.i$e$e, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C0145e extends C3289v implements InterfaceC2072n {
            C0145e(Object obj) {
                super(2, obj, C4131k.class, "onFormFieldValuesChanged", "onFormFieldValuesChanged(Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Ljava/lang/String;)V", 0);
            }

            public final void d(B3.c cVar, String p12) {
                AbstractC3292y.i(p12, "p1");
                ((C4131k) this.receiver).c(cVar, p12);
            }

            @Override // c6.InterfaceC2072n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                d((B3.c) obj, (String) obj2);
                return Q5.I.f8786a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: O3.i$e$f */
        /* loaded from: classes4.dex */
        public /* synthetic */ class f extends C3289v implements Function1 {
            f(Object obj) {
                super(1, obj, EventReporter.class, "onSelectPaymentMethod", "onSelectPaymentMethod(Ljava/lang/String;)V", 0);
            }

            public final void d(String p02) {
                AbstractC3292y.i(p02, "p0");
                ((EventReporter) this.receiver).h(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                d((String) obj);
                return Q5.I.f8786a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: O3.i$e$g */
        /* loaded from: classes4.dex */
        public static final class g extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ R3.a f7594a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C2752d f7595b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            g(R3.a aVar, C2752d c2752d) {
                super(1);
                this.f7594a = aVar;
                this.f7595b = c2752d;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final G3.d invoke(String it) {
                AbstractC3292y.i(it, "it");
                return G3.d.f2858q.a(this.f7594a, this.f7595b, "payment_element", it);
            }
        }

        private e() {
        }

        public final InterfaceC1354b a(R3.a viewModel, C2752d paymentMethodMetadata) {
            AbstractC3292y.i(viewModel, "viewModel");
            AbstractC3292y.i(paymentMethodMetadata, "paymentMethodMetadata");
            n6.M a9 = n6.N.a(C3445b0.a().plus(U0.b(null, 1, null)));
            C4131k a10 = C4131k.f40492g.a(viewModel, v3.m.f40502h.a(viewModel, a9), paymentMethodMetadata);
            return new C1361i(viewModel.o(), viewModel.y(), viewModel.v(), paymentMethodMetadata.e0(), new a(a10), new b(a10), new c(viewModel), new d(viewModel.c()), new C0145e(a10), new f(viewModel.n()), new g(viewModel, paymentMethodMetadata), a9, paymentMethodMetadata.W().c());
        }

        public /* synthetic */ e(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public C1361i(String initiallySelectedPaymentMethodType, InterfaceC3813L selection, InterfaceC3813L processing, List supportedPaymentMethods, Function1 createFormArguments, Function1 formElementsForCode, Function0 clearErrorMessages, Function1 reportFieldInteraction, InterfaceC2072n onFormFieldValuesChanged, Function1 reportPaymentMethodTypeSelected, Function1 createUSBankAccountFormArguments, n6.M coroutineScope, boolean z8) {
        AbstractC3292y.i(initiallySelectedPaymentMethodType, "initiallySelectedPaymentMethodType");
        AbstractC3292y.i(selection, "selection");
        AbstractC3292y.i(processing, "processing");
        AbstractC3292y.i(supportedPaymentMethods, "supportedPaymentMethods");
        AbstractC3292y.i(createFormArguments, "createFormArguments");
        AbstractC3292y.i(formElementsForCode, "formElementsForCode");
        AbstractC3292y.i(clearErrorMessages, "clearErrorMessages");
        AbstractC3292y.i(reportFieldInteraction, "reportFieldInteraction");
        AbstractC3292y.i(onFormFieldValuesChanged, "onFormFieldValuesChanged");
        AbstractC3292y.i(reportPaymentMethodTypeSelected, "reportPaymentMethodTypeSelected");
        AbstractC3292y.i(createUSBankAccountFormArguments, "createUSBankAccountFormArguments");
        AbstractC3292y.i(coroutineScope, "coroutineScope");
        this.f7565a = initiallySelectedPaymentMethodType;
        this.f7566b = selection;
        this.f7567c = processing;
        this.f7568d = supportedPaymentMethods;
        this.f7569e = createFormArguments;
        this.f7570f = formElementsForCode;
        this.f7571g = clearErrorMessages;
        this.f7572h = reportFieldInteraction;
        this.f7573i = onFormFieldValuesChanged;
        this.f7574j = reportPaymentMethodTypeSelected;
        this.f7575k = createUSBankAccountFormArguments;
        this.f7576l = coroutineScope;
        this.f7577m = z8;
        q6.w a9 = AbstractC3815N.a(initiallySelectedPaymentMethodType);
        this.f7578n = a9;
        this.f7579o = a9;
        q6.w a10 = AbstractC3815N.a(k());
        this.f7580p = a10;
        this.f7581q = a10;
        AbstractC3462k.d(coroutineScope, null, null, new a(null), 3, null);
        AbstractC3462k.d(coroutineScope, null, null, new b(null), 3, null);
        AbstractC3462k.d(coroutineScope, null, null, new c(null), 3, null);
        AbstractC3462k.d(coroutineScope, null, null, new d(null), 3, null);
    }

    private final InterfaceC1354b.a k() {
        String str = (String) this.f7579o.getValue();
        return new InterfaceC1354b.a(str, this.f7568d, (F3.a) this.f7569e.invoke(str), (List) this.f7570f.invoke(str), (D3.f) this.f7566b.getValue(), ((Boolean) this.f7567c.getValue()).booleanValue(), (G3.d) this.f7575k.invoke(str));
    }

    @Override // O3.InterfaceC1354b
    public boolean c() {
        return this.f7577m;
    }

    @Override // O3.InterfaceC1354b
    public void close() {
        n6.N.d(this.f7576l, null, 1, null);
    }

    @Override // O3.InterfaceC1354b
    public void d(InterfaceC1354b.AbstractC0139b viewAction) {
        AbstractC3292y.i(viewAction, "viewAction");
        if (viewAction instanceof InterfaceC1354b.AbstractC0139b.c) {
            this.f7572h.invoke(((InterfaceC1354b.AbstractC0139b.c) viewAction).a());
            return;
        }
        if (viewAction instanceof InterfaceC1354b.AbstractC0139b.a) {
            InterfaceC1354b.AbstractC0139b.a aVar = (InterfaceC1354b.AbstractC0139b.a) viewAction;
            this.f7573i.invoke(aVar.a(), aVar.b());
        } else if (viewAction instanceof InterfaceC1354b.AbstractC0139b.C0140b) {
            InterfaceC1354b.AbstractC0139b.C0140b c0140b = (InterfaceC1354b.AbstractC0139b.C0140b) viewAction;
            if (!AbstractC3292y.d(this.f7579o.getValue(), c0140b.a())) {
                this.f7578n.setValue(c0140b.a());
                this.f7574j.invoke(c0140b.a());
            }
        }
    }

    @Override // O3.InterfaceC1354b
    public InterfaceC3813L getState() {
        return this.f7581q;
    }
}
