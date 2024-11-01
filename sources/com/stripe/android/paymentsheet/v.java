package com.stripe.android.paymentsheet;

import C3.AbstractC0995p;
import D3.f;
import E3.c;
import N3.n;
import O3.C1361i;
import O3.C1363k;
import O3.InterfaceC1371t;
import Q5.I;
import R5.AbstractC1435t;
import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import com.stripe.android.paymentsheet.PaymentOptionContract;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.i;
import com.stripe.android.paymentsheet.k;
import com.stripe.android.paymentsheet.q;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import com.stripe.android.paymentsheet.w;
import d3.C2752d;
import j6.InterfaceC3214c;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n6.AbstractC3458i;
import n6.M;
import o2.C3525g;
import p2.InterfaceC3560b;
import q6.AbstractC3804C;
import q6.AbstractC3815N;
import q6.AbstractC3823h;
import q6.InterfaceC3802A;
import q6.InterfaceC3808G;
import q6.InterfaceC3813L;
import q6.InterfaceC3821f;
import q6.InterfaceC3822g;
import u3.AbstractC4079c;
import v3.C4122b;

/* loaded from: classes4.dex */
public final class v extends R3.a {

    /* renamed from: C, reason: collision with root package name */
    private final PaymentOptionContract.a f27868C;

    /* renamed from: D, reason: collision with root package name */
    private final R3.c f27869D;

    /* renamed from: E, reason: collision with root package name */
    private final q6.v f27870E;

    /* renamed from: F, reason: collision with root package name */
    private final InterfaceC3802A f27871F;

    /* renamed from: G, reason: collision with root package name */
    private final q6.w f27872G;

    /* renamed from: H, reason: collision with root package name */
    private final InterfaceC3813L f27873H;

    /* renamed from: I, reason: collision with root package name */
    private final InterfaceC3813L f27874I;

    /* renamed from: J, reason: collision with root package name */
    private final InterfaceC3813L f27875J;

    /* renamed from: K, reason: collision with root package name */
    private k f27876K;

    /* renamed from: L, reason: collision with root package name */
    private final InterfaceC3813L f27877L;

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f27878a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f27879b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ v f27880c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.paymentsheet.v$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0659a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ v f27881a;

            C0659a(v vVar) {
                this.f27881a = vVar;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(i.a aVar, U5.d dVar) {
                this.f27881a.S(aVar);
                return I.f8786a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i iVar, v vVar, U5.d dVar) {
            super(2, dVar);
            this.f27879b = iVar;
            this.f27880c = vVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new a(this.f27879b, this.f27880c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f27878a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                InterfaceC3821f f8 = this.f27879b.f();
                C0659a c0659a = new C0659a(this.f27880c);
                this.f27878a = 1;
                if (f8.collect(c0659a, this) == e8) {
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
    public static final class b implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final Function0 f27882a;

        public b(Function0 starterArgsSupplier) {
            AbstractC3292y.i(starterArgsSupplier, "starterArgsSupplier");
            this.f27882a = starterArgsSupplier;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(InterfaceC3214c interfaceC3214c, CreationExtras creationExtras) {
            return androidx.lifecycle.n.a(this, interfaceC3214c, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls) {
            return androidx.lifecycle.n.b(this, cls);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class modelClass, CreationExtras extras) {
            AbstractC3292y.i(modelClass, "modelClass");
            AbstractC3292y.i(extras, "extras");
            Application a9 = E2.b.a(extras);
            SavedStateHandle createSavedStateHandle = SavedStateHandleSupport.createSavedStateHandle(extras);
            PaymentOptionContract.a aVar = (PaymentOptionContract.a) this.f27882a.invoke();
            v a10 = AbstractC0995p.a().a(a9).b(aVar.a()).build().a().b(a9).c(aVar).a(createSavedStateHandle).build().a();
            AbstractC3292y.g(a10, "null cannot be cast to non-null type T of com.stripe.android.paymentsheet.PaymentOptionsViewModel.Factory.create");
            return a10;
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ EventReporter f27883a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ v f27884b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(EventReporter eventReporter, v vVar) {
            super(0);
            this.f27883a = eventReporter;
            this.f27884b = vVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5524invoke();
            return I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5524invoke() {
            this.f27883a.l((D3.f) this.f27884b.y().getValue());
            this.f27884b.U();
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3293z implements InterfaceC2073o {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ v f27886a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(v vVar) {
                super(0);
                this.f27886a = vVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5525invoke();
                return I.f8786a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5525invoke() {
                this.f27886a.M(f.c.f1258a);
                this.f27886a.U();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ v f27887a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(v vVar) {
                super(0);
                this.f27887a = vVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5526invoke();
                return I.f8786a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5526invoke() {
                this.f27887a.M(f.d.f1259a);
                this.f27887a.U();
            }
        }

        d() {
            super(3);
        }

        public final N3.n a(Boolean bool, String str, boolean z8) {
            C2752d h8 = v.this.f27868C.b().h();
            n.a aVar = N3.n.f6609g;
            boolean a02 = h8.a0();
            List h02 = h8.h0();
            return aVar.a(bool, str, a02, D3.b.f1238f, z8, h02, null, new a(v.this), new b(v.this), h8.W() instanceof com.stripe.android.model.u);
        }

        @Override // c6.InterfaceC2073o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((Boolean) obj, (String) obj2, ((Boolean) obj3).booleanValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(PaymentOptionContract.a args, EventReporter eventReporter, M3.c customerRepository, U5.g workContext, SavedStateHandle savedStateHandle, i linkHandler, InterfaceC3560b.a cardAccountRangeRepositoryFactory, InterfaceC1371t.a editInteractorFactory) {
        super(args.b().a(), eventReporter, customerRepository, workContext, savedStateHandle, linkHandler, editInteractorFactory, cardAccountRangeRepositoryFactory, false);
        k kVar;
        AbstractC3292y.i(args, "args");
        AbstractC3292y.i(eventReporter, "eventReporter");
        AbstractC3292y.i(customerRepository, "customerRepository");
        AbstractC3292y.i(workContext, "workContext");
        AbstractC3292y.i(savedStateHandle, "savedStateHandle");
        AbstractC3292y.i(linkHandler, "linkHandler");
        AbstractC3292y.i(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        AbstractC3292y.i(editInteractorFactory, "editInteractorFactory");
        this.f27868C = args;
        R3.c cVar = new R3.c(f(), args.b().p() instanceof com.stripe.android.model.n, r().f(), d(), A4.g.n(args.b().h().h()), y(), g(), k(), new c(eventReporter, this));
        this.f27869D = cVar;
        q6.v b9 = AbstractC3804C.b(1, 0, null, 6, null);
        this.f27870E = b9;
        this.f27871F = b9;
        q6.w a9 = AbstractC3815N.a(null);
        this.f27872G = a9;
        this.f27873H = a9;
        this.f27874I = AbstractC3823h.b(AbstractC3815N.a(null));
        this.f27875J = A4.g.e(linkHandler.g(), linkHandler.e().f(), d(), new d());
        D3.f i8 = args.b().i();
        if (i8 instanceof f.e) {
            kVar = new k.b((f.e) i8);
        } else if (i8 instanceof f.b) {
            kVar = new k.a((f.b) i8);
        } else {
            kVar = null;
        }
        this.f27876K = kVar;
        this.f27877L = AbstractC3823h.J(cVar.i(), ViewModelKt.getViewModelScope(this), InterfaceC3808G.a.b(InterfaceC3808G.f37362a, 0L, 0L, 3, null), null);
        C3525g.f35925a.c(this, savedStateHandle);
        AbstractC3458i.d(ViewModelKt.getViewModelScope(this), null, null, new a(linkHandler, this, null), 3, null);
        w.j.f27963a.a(linkHandler);
        linkHandler.m(args.b().f());
        if (t().getValue() == null) {
            J(args.b().h());
        }
        i().d(args.b().b());
        savedStateHandle.set("processing", Boolean.FALSE);
        M(args.b().i());
        r().l(P(args.b().h(), i()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [E3.c$j] */
    private final List P(C2752d c2752d, C4122b c4122b) {
        c.b bVar;
        if (f().w() == w.n.f28014d) {
            return Q3.u.f8728a.a(this, c2752d, c4122b);
        }
        if (this.f27868C.b().l()) {
            bVar = new c.j(C1363k.f7617r.a(this, c2752d, c4122b, w()), null, 2, false ? 1 : 0);
        } else {
            bVar = new c.b(C1361i.f7563r.a(this, c2752d));
        }
        List c8 = AbstractC1435t.c();
        c8.add(bVar);
        if ((bVar instanceof c.j) && s() != null) {
            c8.add(new c.a(C1361i.f7563r.a(this, c2752d)));
        }
        return AbstractC1435t.a(c8);
    }

    private final D3.f Q() {
        D3.f i8 = this.f27868C.b().i();
        if (i8 instanceof f.C0023f) {
            return X((f.C0023f) i8);
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S(i.a aVar) {
        I i8;
        if (AbstractC3292y.d(aVar, i.a.C0610a.f27306a)) {
            T(AbstractC4079c.a.f40269c);
            return;
        }
        if (!(aVar instanceof i.a.f)) {
            if (aVar instanceof i.a.c) {
                T(((i.a.c) aVar).a());
                return;
            }
            if (!AbstractC3292y.d(aVar, i.a.d.f27310a)) {
                if (aVar instanceof i.a.e) {
                    D3.f a9 = ((i.a.e) aVar).a();
                    if (a9 != null) {
                        M(a9);
                        U();
                        i8 = I.f8786a;
                    } else {
                        i8 = null;
                    }
                    if (i8 == null) {
                        U();
                        return;
                    }
                    return;
                }
                if (AbstractC3292y.d(aVar, i.a.g.f27314a)) {
                    L(PrimaryButton.a.b.f27693b);
                    return;
                } else if (AbstractC3292y.d(aVar, i.a.h.f27315a)) {
                    L(PrimaryButton.a.c.f27694b);
                    return;
                } else {
                    if (AbstractC3292y.d(aVar, i.a.b.f27307a)) {
                        U();
                        return;
                    }
                    return;
                }
            }
            return;
        }
        throw new Q5.q("An operation is not implemented: This can't happen. Will follow up to remodel the states better.");
    }

    private final void V(D3.f fVar) {
        this.f27870E.d(new q.c(fVar, (List) i().c().getValue()));
    }

    private final void W(D3.f fVar) {
        this.f27870E.d(new q.c(fVar, (List) i().c().getValue()));
    }

    private final f.C0023f X(f.C0023f c0023f) {
        List list = (List) i().c().getValue();
        boolean z8 = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (AbstractC3292y.d(((com.stripe.android.model.o) it.next()).f25631a, c0023f.r().f25631a)) {
                    z8 = true;
                    break;
                }
            }
        }
        if (!z8) {
            return null;
        }
        return c0023f;
    }

    @Override // R3.a
    public InterfaceC3813L A() {
        return this.f27875J;
    }

    @Override // R3.a
    public void D(f.e.d paymentSelection) {
        AbstractC3292y.i(paymentSelection, "paymentSelection");
        M(paymentSelection);
        n().l((D3.f) y().getValue());
        U();
    }

    @Override // R3.a
    public void E(D3.f fVar) {
        M(fVar);
        if (fVar == null || !fVar.a()) {
            U();
        }
    }

    @Override // R3.a
    public void G(C2.c cVar) {
        this.f27872G.setValue(cVar);
    }

    @Override // R3.a
    public void H() {
        n().onDismiss();
        this.f27870E.d(new q.a(null, Q(), (List) i().c().getValue()));
    }

    @Override // R3.a
    public void I(k kVar) {
        this.f27876K = kVar;
    }

    public final InterfaceC3802A R() {
        return this.f27871F;
    }

    public void T(AbstractC4079c paymentResult) {
        AbstractC3292y.i(paymentResult, "paymentResult");
        x().set("processing", Boolean.FALSE);
    }

    public final void U() {
        boolean z8;
        b();
        D3.f fVar = (D3.f) y().getValue();
        if (fVar != null) {
            n().o(fVar);
            boolean z9 = true;
            if (fVar instanceof f.C0023f) {
                z8 = true;
            } else {
                z8 = fVar instanceof f.c;
            }
            if (!z8) {
                z9 = fVar instanceof f.d;
            }
            if (z9) {
                V(fVar);
            } else if (fVar instanceof f.e) {
                W(fVar);
            } else if (fVar instanceof f.b) {
                W(fVar);
            }
        }
    }

    @Override // R3.a
    public void b() {
        this.f27872G.setValue(null);
    }

    @Override // R3.a
    public InterfaceC3813L m() {
        return this.f27873H;
    }

    @Override // R3.a
    public k s() {
        return this.f27876K;
    }

    @Override // R3.a
    public InterfaceC3813L u() {
        return this.f27877L;
    }

    @Override // R3.a
    public InterfaceC3813L z() {
        return this.f27874I;
    }
}
