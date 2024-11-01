package Q3;

import D3.f;
import E3.c;
import Q3.a;
import Q3.b;
import Q3.n;
import Q5.I;
import R5.AbstractC1435t;
import androidx.lifecycle.ViewModelKt;
import c3.C2027g;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import c6.InterfaceC2076r;
import com.stripe.android.model.o;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import d3.C2752d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.C3289v;
import n2.AbstractC3394E;
import n2.z;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.M;
import n6.N;
import n6.U0;
import q6.AbstractC3823h;
import q6.InterfaceC3813L;
import q6.InterfaceC3821f;
import q6.InterfaceC3822g;
import r4.D;
import v3.C4122b;
import v3.C4127g;
import v3.C4131k;

/* loaded from: classes4.dex */
public final class c implements n {

    /* renamed from: A, reason: collision with root package name */
    public static final b f8449A = new b(null);

    /* renamed from: B, reason: collision with root package name */
    public static final int f8450B = 8;

    /* renamed from: a, reason: collision with root package name */
    private final Function1 f8451a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f8452b;

    /* renamed from: c, reason: collision with root package name */
    private final Function1 f8453c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC2072n f8454d;

    /* renamed from: e, reason: collision with root package name */
    private final Function0 f8455e;

    /* renamed from: f, reason: collision with root package name */
    private final Function0 f8456f;

    /* renamed from: g, reason: collision with root package name */
    private final Function1 f8457g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3813L f8458h;

    /* renamed from: i, reason: collision with root package name */
    private final Function1 f8459i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC3813L f8460j;

    /* renamed from: k, reason: collision with root package name */
    private final Function1 f8461k;

    /* renamed from: l, reason: collision with root package name */
    private final Function1 f8462l;

    /* renamed from: m, reason: collision with root package name */
    private final InterfaceC3813L f8463m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f8464n;

    /* renamed from: o, reason: collision with root package name */
    private final Function1 f8465o;

    /* renamed from: p, reason: collision with root package name */
    private final Function1 f8466p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC3813L f8467q;

    /* renamed from: r, reason: collision with root package name */
    private final Function1 f8468r;

    /* renamed from: s, reason: collision with root package name */
    private final Function1 f8469s;

    /* renamed from: t, reason: collision with root package name */
    private final boolean f8470t;

    /* renamed from: u, reason: collision with root package name */
    private final M f8471u;

    /* renamed from: v, reason: collision with root package name */
    private final List f8472v;

    /* renamed from: w, reason: collision with root package name */
    private final InterfaceC3813L f8473w;

    /* renamed from: x, reason: collision with root package name */
    private final InterfaceC3813L f8474x;

    /* renamed from: y, reason: collision with root package name */
    private final InterfaceC3813L f8475y;

    /* renamed from: z, reason: collision with root package name */
    private final InterfaceC3813L f8476z;

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f8477a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3813L f8479c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: Q3.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0171a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3813L f8480a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f8481b;

            C0171a(InterfaceC3813L interfaceC3813L, c cVar) {
                this.f8480a = interfaceC3813L;
                this.f8481b = cVar;
            }

            public final Object b(boolean z8, U5.d dVar) {
                if (!z8) {
                    return I.f8786a;
                }
                D3.f fVar = (D3.f) this.f8480a.getValue();
                if (fVar == null) {
                    return I.f8786a;
                }
                if (!(fVar instanceof f.C0023f)) {
                    this.f8481b.f8466p.invoke(null);
                }
                return I.f8786a;
            }

            @Override // q6.InterfaceC3822g
            public /* bridge */ /* synthetic */ Object emit(Object obj, U5.d dVar) {
                return b(((Boolean) obj).booleanValue(), dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3813L interfaceC3813L, U5.d dVar) {
            super(2, dVar);
            this.f8479c = interfaceC3813L;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new a(this.f8479c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f8477a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                InterfaceC3821f q8 = AbstractC3823h.q(c.this.f8467q, 2);
                C0171a c0171a = new C0171a(this.f8479c, c.this);
                this.f8477a = 1;
                if (q8.collect(c0171a, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ R3.a f8482a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C2752d f8483b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C4122b f8484c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(R3.a aVar, C2752d c2752d, C4122b c4122b) {
                super(0);
                this.f8482a = aVar;
                this.f8483b = c2752d;
                this.f8484c = c4122b;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final E3.c invoke() {
                a.C0165a c0165a = Q3.a.f8414d;
                R3.a aVar = this.f8482a;
                return new c.h(c0165a.a(aVar, this.f8483b, this.f8484c, aVar.w()));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: Q3.c$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0172b extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ R3.a f8485a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C2752d f8486b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C4122b f8487c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0172b(R3.a aVar, C2752d c2752d, C4122b c4122b) {
                super(1);
                this.f8485a = aVar;
                this.f8486b = c2752d;
                this.f8487c = c4122b;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final E3.c invoke(String selectedPaymentMethodCode) {
                AbstractC3292y.i(selectedPaymentMethodCode, "selectedPaymentMethodCode");
                return new c.l(Q3.d.f8504l.a(selectedPaymentMethodCode, this.f8485a, this.f8486b, this.f8487c), false, 2, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: Q3.c$b$c, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0173c extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ R3.a f8488a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0173c(R3.a aVar) {
                super(1);
                this.f8488a = aVar;
            }

            public final void a(C4127g it) {
                AbstractC3292y.i(it, "it");
                this.f8488a.w().s(it.d());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C4127g) obj);
                return I.f8786a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class d extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ R3.a f8489a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(R3.a aVar) {
                super(1);
                this.f8489a = aVar;
            }

            public final void a(com.stripe.android.model.o it) {
                AbstractC3292y.i(it, "it");
                this.f8489a.E(new f.C0023f(it, null, null, 6, null));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((com.stripe.android.model.o) obj);
                return I.f8786a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class e extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ R3.a f8490a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(R3.a aVar) {
                super(1);
                this.f8490a = aVar;
            }

            public final void a(C2.c cVar) {
                this.f8490a.q().e(cVar, true);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C2.c) obj);
                return I.f8786a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public /* synthetic */ class f extends C3289v implements Function1 {
            f(Object obj) {
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
        /* loaded from: classes4.dex */
        public /* synthetic */ class g extends C3289v implements Function1 {
            g(Object obj) {
                super(1, obj, C4131k.class, "requiresFormScreen", "requiresFormScreen(Ljava/lang/String;)Z", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(String p02) {
                AbstractC3292y.i(p02, "p0");
                return Boolean.valueOf(((C4131k) this.receiver).d(p02));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public /* synthetic */ class h extends C3289v implements Function1 {
            h(Object obj) {
                super(1, obj, E3.b.class, "transitionToWithDelay", "transitionToWithDelay(Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;)V", 0);
            }

            public final void d(E3.c p02) {
                AbstractC3292y.i(p02, "p0");
                ((E3.b) this.receiver).o(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                d((E3.c) obj);
                return I.f8786a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public /* synthetic */ class i extends C3289v implements InterfaceC2072n {
            i(Object obj) {
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
        public /* synthetic */ class j extends C3289v implements Function1 {
            j(Object obj) {
                super(1, obj, R3.a.class, "updateSelection", "updateSelection(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V", 0);
            }

            public final void d(D3.f fVar) {
                ((R3.a) this.receiver).M(fVar);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                d((D3.f) obj);
                return I.f8786a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class k extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final k f8491a = new k();

            k() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(E3.c it) {
                AbstractC3292y.i(it, "it");
                return Boolean.valueOf(it instanceof c.k);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public /* synthetic */ class l extends C3289v implements Function1 {
            l(Object obj) {
                super(1, obj, EventReporter.class, "onSelectPaymentMethod", "onSelectPaymentMethod(Ljava/lang/String;)V", 0);
            }

            public final void d(String p02) {
                AbstractC3292y.i(p02, "p0");
                ((EventReporter) this.receiver).h(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                d((String) obj);
                return I.f8786a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public /* synthetic */ class m extends C3289v implements Function1 {
            m(Object obj) {
                super(1, obj, EventReporter.class, "onPaymentMethodFormShown", "onPaymentMethodFormShown(Ljava/lang/String;)V", 0);
            }

            public final void d(String p02) {
                AbstractC3292y.i(p02, "p0");
                ((EventReporter) this.receiver).n(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                d((String) obj);
                return I.f8786a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class n extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ R3.a f8492a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C2752d f8493b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C4122b f8494c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            n(R3.a aVar, C2752d c2752d, C4122b c4122b) {
                super(0);
                this.f8492a = aVar;
                this.f8493b = c2752d;
                this.f8494c = c4122b;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final E3.c invoke() {
                b.c cVar = Q3.b.f8419q;
                R3.a aVar = this.f8492a;
                return new c.i(cVar.b(aVar, this.f8493b, this.f8494c, aVar.w()));
            }
        }

        private b() {
        }

        public final Q3.n a(R3.a viewModel, C2752d paymentMethodMetadata, C4122b customerStateHolder) {
            AbstractC3292y.i(viewModel, "viewModel");
            AbstractC3292y.i(paymentMethodMetadata, "paymentMethodMetadata");
            AbstractC3292y.i(customerStateHolder, "customerStateHolder");
            C4131k a9 = C4131k.f40492g.a(viewModel, v3.m.f40502h.a(viewModel, ViewModelKt.getViewModelScope(viewModel)), paymentMethodMetadata);
            return new c(paymentMethodMetadata, viewModel.v(), viewModel.y(), new f(a9), new g(a9), new h(viewModel.r()), new i(a9), new n(viewModel, paymentMethodMetadata, customerStateHolder), new a(viewModel, paymentMethodMetadata, customerStateHolder), new C0172b(viewModel, paymentMethodMetadata, customerStateHolder), customerStateHolder.c(), customerStateHolder.b(), viewModel.w().q(), viewModel.w().m(), new C0173c(viewModel), new d(viewModel), viewModel.A(), !viewModel.F(), new e(viewModel), new j(viewModel), A4.g.m(viewModel.r().f(), k.f8491a), new l(viewModel.n()), new m(viewModel.n()), paymentMethodMetadata.W().c(), null, 16777216, null);
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: Q3.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0174c extends AbstractC3293z implements InterfaceC2073o {
        C0174c() {
            super(3);
        }

        public final n.a a(List paymentMethods, C4127g c4127g, boolean z8) {
            AbstractC3292y.i(paymentMethods, "paymentMethods");
            return c.this.j(paymentMethods, c4127g, z8);
        }

        @Override // c6.InterfaceC2073o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((List) obj, (C4127g) obj2, ((Boolean) obj3).booleanValue());
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2752d f8497b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C2752d c2752d) {
            super(2);
            this.f8497b = c2752d;
        }

        @Override // c6.InterfaceC2072n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4127g invoke(List paymentMethods, com.stripe.android.model.o oVar) {
            AbstractC3292y.i(paymentMethods, "paymentMethods");
            return c.this.l(paymentMethods, this.f8497b, oVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3293z implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m48invoke();
            return I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m48invoke() {
            c.this.f8466p.invoke(f.d.f1259a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3293z implements Function0 {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m49invoke();
            return I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m49invoke() {
            c.this.f8466p.invoke(f.c.f1258a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3293z implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2027g f8501b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(C2027g c2027g) {
            super(0);
            this.f8501b = c2027g;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m50invoke();
            return I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m50invoke() {
            c.this.a(new n.c.b(this.f8501b.d()));
        }
    }

    /* loaded from: classes4.dex */
    static final class h extends AbstractC3293z implements Function1 {
        h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(N3.n nVar) {
            return Boolean.valueOf(!c.this.n(nVar));
        }
    }

    /* loaded from: classes4.dex */
    static final class i extends AbstractC3293z implements InterfaceC2076r {
        i() {
            super(6);
        }

        public final n.b a(List paymentMethods, boolean z8, D3.f fVar, C4127g c4127g, N3.n nVar, n.a action) {
            AbstractC3292y.i(paymentMethods, "paymentMethods");
            AbstractC3292y.i(action, "action");
            return new n.b(c.this.k(paymentMethods, nVar), z8, fVar, c4127g, action);
        }

        @Override // c6.InterfaceC2076r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
            return a((List) obj, ((Boolean) obj2).booleanValue(), (D3.f) obj3, (C4127g) obj4, (N3.n) obj5, (n.a) obj6);
        }
    }

    public c(C2752d paymentMethodMetadata, InterfaceC3813L processing, InterfaceC3813L selection, Function1 formElementsForCode, Function1 requiresFormScreen, Function1 transitionTo, InterfaceC2072n onFormFieldValuesChanged, Function0 manageScreenFactory, Function0 manageOneSavedPaymentMethodFactory, Function1 formScreenFactory, InterfaceC3813L paymentMethods, InterfaceC3813L mostRecentlySelectedSavedPaymentMethod, Function1 providePaymentMethodName, InterfaceC3813L canRemove, Function1 onEditPaymentMethod, Function1 onSelectSavedPaymentMethod, InterfaceC3813L walletsState, boolean z8, Function1 onMandateTextUpdated, Function1 updateSelection, InterfaceC3813L isCurrentScreen, Function1 reportPaymentMethodTypeSelected, Function1 reportFormShown, boolean z9, U5.g dispatcher) {
        AbstractC3292y.i(paymentMethodMetadata, "paymentMethodMetadata");
        AbstractC3292y.i(processing, "processing");
        AbstractC3292y.i(selection, "selection");
        AbstractC3292y.i(formElementsForCode, "formElementsForCode");
        AbstractC3292y.i(requiresFormScreen, "requiresFormScreen");
        AbstractC3292y.i(transitionTo, "transitionTo");
        AbstractC3292y.i(onFormFieldValuesChanged, "onFormFieldValuesChanged");
        AbstractC3292y.i(manageScreenFactory, "manageScreenFactory");
        AbstractC3292y.i(manageOneSavedPaymentMethodFactory, "manageOneSavedPaymentMethodFactory");
        AbstractC3292y.i(formScreenFactory, "formScreenFactory");
        AbstractC3292y.i(paymentMethods, "paymentMethods");
        AbstractC3292y.i(mostRecentlySelectedSavedPaymentMethod, "mostRecentlySelectedSavedPaymentMethod");
        AbstractC3292y.i(providePaymentMethodName, "providePaymentMethodName");
        AbstractC3292y.i(canRemove, "canRemove");
        AbstractC3292y.i(onEditPaymentMethod, "onEditPaymentMethod");
        AbstractC3292y.i(onSelectSavedPaymentMethod, "onSelectSavedPaymentMethod");
        AbstractC3292y.i(walletsState, "walletsState");
        AbstractC3292y.i(onMandateTextUpdated, "onMandateTextUpdated");
        AbstractC3292y.i(updateSelection, "updateSelection");
        AbstractC3292y.i(isCurrentScreen, "isCurrentScreen");
        AbstractC3292y.i(reportPaymentMethodTypeSelected, "reportPaymentMethodTypeSelected");
        AbstractC3292y.i(reportFormShown, "reportFormShown");
        AbstractC3292y.i(dispatcher, "dispatcher");
        this.f8451a = formElementsForCode;
        this.f8452b = requiresFormScreen;
        this.f8453c = transitionTo;
        this.f8454d = onFormFieldValuesChanged;
        this.f8455e = manageScreenFactory;
        this.f8456f = manageOneSavedPaymentMethodFactory;
        this.f8457g = formScreenFactory;
        this.f8458h = mostRecentlySelectedSavedPaymentMethod;
        this.f8459i = providePaymentMethodName;
        this.f8460j = canRemove;
        this.f8461k = onEditPaymentMethod;
        this.f8462l = onSelectSavedPaymentMethod;
        this.f8463m = walletsState;
        this.f8464n = z8;
        this.f8465o = onMandateTextUpdated;
        this.f8466p = updateSelection;
        this.f8467q = isCurrentScreen;
        this.f8468r = reportPaymentMethodTypeSelected;
        this.f8469s = reportFormShown;
        this.f8470t = z9;
        M a9 = N.a(dispatcher.plus(U0.b(null, 1, null)));
        this.f8471u = a9;
        this.f8472v = paymentMethodMetadata.e0();
        InterfaceC3813L d8 = A4.g.d(paymentMethods, mostRecentlySelectedSavedPaymentMethod, new d(paymentMethodMetadata));
        this.f8473w = d8;
        InterfaceC3813L e8 = A4.g.e(paymentMethods, d8, canRemove, new C0174c());
        this.f8474x = e8;
        this.f8475y = A4.g.h(paymentMethods, processing, selection, d8, walletsState, e8, new i());
        this.f8476z = A4.g.m(walletsState, new h());
        AbstractC3462k.d(a9, null, null, new a(selection, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n.a j(List list, C4127g c4127g, boolean z8) {
        if (list != null && c4127g != null) {
            int size = list.size();
            if (size != 0) {
                if (size != 1) {
                    return n.a.f8642d;
                }
                return m(z8, c4127g);
            }
            return n.a.f8639a;
        }
        return n.a.f8639a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List k(List list, N3.n nVar) {
        List<C2027g> list2 = this.f8472v;
        ArrayList arrayList = new ArrayList(AbstractC1435t.x(list2, 10));
        for (C2027g c2027g : list2) {
            arrayList.add(c2027g.a(list, new g(c2027g)));
        }
        ArrayList arrayList2 = new ArrayList();
        if (n(nVar)) {
            if (nVar != null && nVar.d() != null) {
                arrayList2.add(new Q3.e(o.p.f25754h.f25773a, C2.d.a(AbstractC3394E.f35271z0), v3.t.f40567v, null, null, false, C2.d.a(AbstractC3394E.f35181A0), new e()));
            }
            if (nVar != null && nVar.c() != null) {
                arrayList2.add(new Q3.e("google_pay", C2.d.a(AbstractC3394E.f35255r0), z.f35487b, null, null, false, null, new f()));
            }
        }
        Iterator it = arrayList.iterator();
        int i8 = 0;
        while (true) {
            if (it.hasNext()) {
                if (AbstractC3292y.d(((Q3.e) it.next()).a(), o.p.f25755i.f25773a)) {
                    break;
                }
                i8++;
            } else {
                i8 = -1;
                break;
            }
        }
        List Z02 = AbstractC1435t.Z0(arrayList);
        Z02.addAll(i8 + 1, arrayList2);
        return Z02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C4127g l(List list, C2752d c2752d, com.stripe.android.model.o oVar) {
        if (oVar == null) {
            if (list != null) {
                oVar = (com.stripe.android.model.o) AbstractC1435t.o0(list);
            } else {
                oVar = null;
            }
        }
        if (oVar == null) {
            return null;
        }
        return q.a(oVar, this.f8459i, c2752d);
    }

    private final n.a m(boolean z8, C4127g c4127g) {
        if (c4127g != null && c4127g.f()) {
            return n.a.f8640b;
        }
        if (z8) {
            return n.a.f8641c;
        }
        return n.a.f8639a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean n(N3.n nVar) {
        if (this.f8464n && nVar != null && nVar.c() != null) {
            return true;
        }
        return false;
    }

    private final void o(String str) {
        this.f8454d.invoke(new B3.c(null, f.a.f1248d, 1, null), str);
    }

    @Override // Q3.n
    public void a(n.c viewAction) {
        C2.c cVar;
        AbstractC3292y.i(viewAction, "viewAction");
        if (viewAction instanceof n.c.b) {
            n.c.b bVar = (n.c.b) viewAction;
            this.f8468r.invoke(bVar.a());
            if (((Boolean) this.f8452b.invoke(bVar.a())).booleanValue()) {
                this.f8469s.invoke(bVar.a());
                this.f8453c.invoke(this.f8457g.invoke(bVar.a()));
                return;
            }
            o(bVar.a());
            Iterator it = ((Iterable) this.f8451a.invoke(bVar.a())).iterator();
            while (true) {
                if (it.hasNext()) {
                    cVar = ((D) it.next()).b();
                    if (cVar != null) {
                        break;
                    }
                } else {
                    cVar = null;
                    break;
                }
            }
            if (cVar != null) {
                this.f8465o.invoke(cVar);
                return;
            }
            return;
        }
        if (viewAction instanceof n.c.C0180c) {
            this.f8468r.invoke("saved");
            this.f8462l.invoke(((n.c.C0180c) viewAction).a());
        } else if (AbstractC3292y.d(viewAction, n.c.e.f8655a)) {
            this.f8453c.invoke(this.f8455e.invoke());
        } else if (AbstractC3292y.d(viewAction, n.c.d.f8654a)) {
            this.f8453c.invoke(this.f8456f.invoke());
        } else if (viewAction instanceof n.c.a) {
            this.f8461k.invoke(((n.c.a) viewAction).a());
        }
    }

    @Override // Q3.n
    public InterfaceC3813L b() {
        return this.f8476z;
    }

    @Override // Q3.n
    public boolean c() {
        return this.f8470t;
    }

    @Override // Q3.n
    public InterfaceC3813L getState() {
        return this.f8475y;
    }

    public /* synthetic */ c(C2752d c2752d, InterfaceC3813L interfaceC3813L, InterfaceC3813L interfaceC3813L2, Function1 function1, Function1 function12, Function1 function13, InterfaceC2072n interfaceC2072n, Function0 function0, Function0 function02, Function1 function14, InterfaceC3813L interfaceC3813L3, InterfaceC3813L interfaceC3813L4, Function1 function15, InterfaceC3813L interfaceC3813L5, Function1 function16, Function1 function17, InterfaceC3813L interfaceC3813L6, boolean z8, Function1 function18, Function1 function19, InterfaceC3813L interfaceC3813L7, Function1 function110, Function1 function111, boolean z9, U5.g gVar, int i8, AbstractC3284p abstractC3284p) {
        this(c2752d, interfaceC3813L, interfaceC3813L2, function1, function12, function13, interfaceC2072n, function0, function02, function14, interfaceC3813L3, interfaceC3813L4, function15, interfaceC3813L5, function16, function17, interfaceC3813L6, z8, function18, function19, interfaceC3813L7, function110, function111, z9, (i8 & 16777216) != 0 ? C3445b0.a() : gVar);
    }
}
