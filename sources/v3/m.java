package v3;

import D3.f;
import Q5.I;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import c6.InterfaceC2074p;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.C3289v;
import kotlin.jvm.internal.O;
import n6.AbstractC3462k;
import n6.M;
import q6.AbstractC3815N;
import q6.AbstractC3823h;
import q6.InterfaceC3813L;
import q6.InterfaceC3821f;
import q6.InterfaceC3822g;

/* loaded from: classes4.dex */
public final class m {

    /* renamed from: h, reason: collision with root package name */
    public static final b f40502h = new b(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f40503i = 8;

    /* renamed from: a, reason: collision with root package name */
    private final M f40504a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2074p f40505b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3813L f40506c;

    /* renamed from: d, reason: collision with root package name */
    private final Function1 f40507d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3813L f40508e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f40509f;

    /* renamed from: g, reason: collision with root package name */
    private final q6.w f40510g;

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f40511a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: v3.m$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0912a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2073o {

            /* renamed from: a, reason: collision with root package name */
            int f40513a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f40514b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f40515c;

            C0912a(U5.d dVar) {
                super(3, dVar);
            }

            @Override // c6.InterfaceC2073o
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(D3.f fVar, Y2.e eVar, U5.d dVar) {
                C0912a c0912a = new C0912a(dVar);
                c0912a.f40514b = fVar;
                c0912a.f40515c = eVar;
                return c0912a.invokeSuspend(I.f8786a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f40513a == 0) {
                    Q5.t.b(obj);
                    return new Q5.r((D3.f) this.f40514b, (Y2.e) this.f40515c);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ O f40516a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f40517b;

            b(O o8, m mVar) {
                this.f40516a = o8;
                this.f40517b = mVar;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(Q5.r rVar, U5.d dVar) {
                D3.f fVar = (D3.f) rVar.a();
                Y2.e eVar = (Y2.e) rVar.b();
                if (!(fVar instanceof f.e.a)) {
                    if (this.f40516a.f34569a) {
                        if (!(fVar instanceof f.e.d)) {
                            this.f40517b.f40507d.invoke(null);
                        }
                        this.f40516a.f34569a = false;
                    }
                    return I.f8786a;
                }
                this.f40516a.f34569a = true;
                if (eVar != null) {
                    this.f40517b.j(eVar);
                }
                return I.f8786a;
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
            int i8 = this.f40511a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                O o8 = new O();
                InterfaceC3821f k8 = AbstractC3823h.k(m.this.f40506c, m.this.f40510g, new C0912a(null));
                b bVar = new b(o8, m.this);
                this.f40511a = 1;
                if (k8.collect(bVar, this) == e8) {
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
        public /* synthetic */ class a extends C3289v implements InterfaceC2074p {
            a(Object obj) {
                super(4, obj, com.stripe.android.paymentsheet.i.class, "payWithLinkInline", "payWithLinkInline(Lcom/stripe/android/link/ui/inline/UserInput;Lcom/stripe/android/paymentsheet/model/PaymentSelection;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            public final Object d(Y2.m mVar, D3.f fVar, boolean z8, U5.d dVar) {
                return ((com.stripe.android.paymentsheet.i) this.receiver).k(mVar, fVar, z8, dVar);
            }

            @Override // c6.InterfaceC2074p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return d((Y2.m) obj, (D3.f) obj2, ((Boolean) obj3).booleanValue(), (U5.d) obj4);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: v3.m$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0913b extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ R3.a f40518a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0913b(R3.a aVar) {
                super(1);
                this.f40518a = aVar;
            }

            public final void a(PrimaryButton.b bVar) {
                this.f40518a.g().setValue(bVar);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((PrimaryButton.b) obj);
                return I.f8786a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class c extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final c f40519a = new c();

            c() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C2.c invoke(PrimaryButton.b bVar) {
                if (bVar != null) {
                    return bVar.d();
                }
                return null;
            }
        }

        private b() {
        }

        public final m a(R3.a viewModel, M coroutineScope) {
            AbstractC3292y.i(viewModel, "viewModel");
            AbstractC3292y.i(coroutineScope, "coroutineScope");
            return new m(coroutineScope, new a(viewModel.p()), viewModel.y(), new C0913b(viewModel), A4.g.m(viewModel.u(), c.f40519a), viewModel.F());
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f40520a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Y2.m f40522c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Y2.m mVar, U5.d dVar) {
            super(2, dVar);
            this.f40522c = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new c(this.f40522c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f40520a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                InterfaceC2074p interfaceC2074p = m.this.f40505b;
                Y2.m mVar = this.f40522c;
                Object value = m.this.f40506c.getValue();
                Boolean a9 = kotlin.coroutines.jvm.internal.b.a(m.this.f40509f);
                this.f40520a = 1;
                if (interfaceC2074p.invoke(mVar, value, a9, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3293z implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Y2.m f40524b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Y2.m mVar) {
            super(0);
            this.f40524b = mVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5583invoke();
            return I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5583invoke() {
            m.this.i(this.f40524b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final e f40525a = new e();

        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5584invoke();
            return I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5584invoke() {
        }
    }

    public m(M coroutineScope, InterfaceC2074p payWithLink, InterfaceC3813L selection, Function1 updateLinkPrimaryButtonUiState, InterfaceC3813L primaryButtonLabel, boolean z8) {
        AbstractC3292y.i(coroutineScope, "coroutineScope");
        AbstractC3292y.i(payWithLink, "payWithLink");
        AbstractC3292y.i(selection, "selection");
        AbstractC3292y.i(updateLinkPrimaryButtonUiState, "updateLinkPrimaryButtonUiState");
        AbstractC3292y.i(primaryButtonLabel, "primaryButtonLabel");
        this.f40504a = coroutineScope;
        this.f40505b = payWithLink;
        this.f40506c = selection;
        this.f40507d = updateLinkPrimaryButtonUiState;
        this.f40508e = primaryButtonLabel;
        this.f40509f = z8;
        this.f40510g = AbstractC3815N.a(null);
        AbstractC3462k.d(coroutineScope, null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(Y2.m mVar) {
        AbstractC3462k.d(this.f40504a, null, null, new c(mVar, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(Y2.e eVar) {
        PrimaryButton.b bVar;
        C2.c cVar = (C2.c) this.f40508e.getValue();
        if (cVar == null) {
            return;
        }
        Function1 function1 = this.f40507d;
        if (eVar.h()) {
            Y2.m i8 = eVar.i();
            D3.f fVar = (D3.f) this.f40506c.getValue();
            if (i8 != null && fVar != null) {
                bVar = new PrimaryButton.b(cVar, new d(i8), true, this.f40509f);
            } else {
                bVar = new PrimaryButton.b(cVar, e.f40525a, false, this.f40509f);
            }
        } else {
            bVar = null;
        }
        function1.invoke(bVar);
    }

    public final void h(Y2.e state) {
        AbstractC3292y.i(state, "state");
        this.f40510g.setValue(state);
    }
}
