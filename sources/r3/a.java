package R3;

import D3.f;
import O3.G;
import O3.InterfaceC1371t;
import Q5.C1413h;
import Q5.I;
import Q5.t;
import R5.AbstractC1435t;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import c6.InterfaceC2072n;
import com.stripe.android.model.o;
import com.stripe.android.paymentsheet.D;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.i;
import com.stripe.android.paymentsheet.j;
import com.stripe.android.paymentsheet.k;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import com.stripe.android.paymentsheet.w;
import d3.C2752d;
import g3.EnumC2906e;
import j4.P;
import j4.Q;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n6.AbstractC3462k;
import n6.M;
import p2.InterfaceC3560b;
import q6.AbstractC3815N;
import q6.AbstractC3823h;
import q6.InterfaceC3813L;
import q6.InterfaceC3821f;
import q6.InterfaceC3822g;
import v3.C4122b;
import y3.C4243a;

/* loaded from: classes4.dex */
public abstract class a extends ViewModel {

    /* renamed from: A, reason: collision with root package name */
    public static final b f9203A = new b(null);

    /* renamed from: B, reason: collision with root package name */
    public static final int f9204B = 8;

    /* renamed from: a, reason: collision with root package name */
    private final w.g f9205a;

    /* renamed from: b, reason: collision with root package name */
    private final EventReporter f9206b;

    /* renamed from: c, reason: collision with root package name */
    private final M3.c f9207c;

    /* renamed from: d, reason: collision with root package name */
    private final U5.g f9208d;

    /* renamed from: e, reason: collision with root package name */
    private final SavedStateHandle f9209e;

    /* renamed from: f, reason: collision with root package name */
    private final i f9210f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC1371t.a f9211g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3560b.a f9212h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f9213i;

    /* renamed from: j, reason: collision with root package name */
    private final q6.w f9214j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC3813L f9215k;

    /* renamed from: l, reason: collision with root package name */
    private final E3.b f9216l;

    /* renamed from: m, reason: collision with root package name */
    private final InterfaceC3813L f9217m;

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC3813L f9218n;

    /* renamed from: o, reason: collision with root package name */
    private final q6.w f9219o;

    /* renamed from: p, reason: collision with root package name */
    private final InterfaceC3813L f9220p;

    /* renamed from: q, reason: collision with root package name */
    private final q6.w f9221q;

    /* renamed from: r, reason: collision with root package name */
    private final j f9222r;

    /* renamed from: s, reason: collision with root package name */
    private final q6.w f9223s;

    /* renamed from: t, reason: collision with root package name */
    private final InterfaceC3813L f9224t;

    /* renamed from: u, reason: collision with root package name */
    private final q6.w f9225u;

    /* renamed from: v, reason: collision with root package name */
    private final InterfaceC3813L f9226v;

    /* renamed from: w, reason: collision with root package name */
    private final C4243a f9227w;

    /* renamed from: x, reason: collision with root package name */
    private final C4122b f9228x;

    /* renamed from: y, reason: collision with root package name */
    private final D f9229y;

    /* renamed from: z, reason: collision with root package name */
    private final InterfaceC3813L f9230z;

    /* renamed from: R3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0186a extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f9231a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: R3.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0187a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ a f9233a;

            C0187a(a aVar) {
                this.f9233a = aVar;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(E3.c cVar, U5.d dVar) {
                this.f9233a.b();
                return I.f8786a;
            }
        }

        C0186a(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new C0186a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f9231a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                InterfaceC3821f q8 = AbstractC3823h.q(a.this.r().f(), 1);
                C0187a c0187a = new C0187a(a.this);
                this.f9231a = 1;
                if (q8.collect(c0187a, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((C0186a) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3293z implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return a.this.o();
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f9235a = new d();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: R3.a$d$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0188a extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final C0188a f9236a = new C0188a();

            C0188a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(G g8) {
                boolean z8 = false;
                if (g8 != null && g8.g()) {
                    z8 = true;
                }
                return Boolean.valueOf(z8);
            }
        }

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3813L invoke(E3.c currentScreen) {
            AbstractC3292y.i(currentScreen, "currentScreen");
            return A4.g.m(currentScreen.p(), C0188a.f9236a);
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f9237a = new e();

        e() {
            super(2);
        }

        public final Boolean a(boolean z8, boolean z9) {
            boolean z10;
            if (!z8 && !z9) {
                z10 = true;
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3293z implements Function1 {
        f() {
            super(1);
        }

        public final void a(E3.c poppedScreen) {
            AbstractC3292y.i(poppedScreen, "poppedScreen");
            a.this.c().h(poppedScreen);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((E3.c) obj);
            return I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f9239a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: R3.a$g$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0189a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ a f9241a;

            C0189a(a aVar) {
                this.f9241a = aVar;
            }

            public final Object b(boolean z8, U5.d dVar) {
                this.f9241a.f9225u.setValue(kotlin.coroutines.jvm.internal.b.a(z8));
                return I.f8786a;
            }

            @Override // q6.InterfaceC3822g
            public /* bridge */ /* synthetic */ Object emit(Object obj, U5.d dVar) {
                return b(((Boolean) obj).booleanValue(), dVar);
            }
        }

        g(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new g(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f9239a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                InterfaceC3813L t8 = ((Q) a.this.j().getValue()).t();
                C0189a c0189a = new C0189a(a.this);
                this.f9239a = 1;
                if (t8.collect(c0189a, this) == e8) {
                    return e8;
                }
            }
            throw new C1413h();
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    public a(w.g config, EventReporter eventReporter, M3.c customerRepository, U5.g workContext, SavedStateHandle savedStateHandle, i linkHandler, InterfaceC1371t.a editInteractorFactory, InterfaceC3560b.a cardAccountRangeRepositoryFactory, boolean z8) {
        AbstractC3292y.i(config, "config");
        AbstractC3292y.i(eventReporter, "eventReporter");
        AbstractC3292y.i(customerRepository, "customerRepository");
        AbstractC3292y.i(workContext, "workContext");
        AbstractC3292y.i(savedStateHandle, "savedStateHandle");
        AbstractC3292y.i(linkHandler, "linkHandler");
        AbstractC3292y.i(editInteractorFactory, "editInteractorFactory");
        AbstractC3292y.i(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        this.f9205a = config;
        this.f9206b = eventReporter;
        this.f9207c = customerRepository;
        this.f9208d = workContext;
        this.f9209e = savedStateHandle;
        this.f9210f = linkHandler;
        this.f9211g = editInteractorFactory;
        this.f9212h = cardAccountRangeRepositoryFactory;
        this.f9213i = z8;
        q6.w a9 = AbstractC3815N.a(null);
        this.f9214j = a9;
        this.f9215k = a9;
        E3.b bVar = new E3.b(ViewModelKt.getViewModelScope(this), new f());
        this.f9216l = bVar;
        this.f9217m = savedStateHandle.getStateFlow("selection", null);
        InterfaceC3813L stateFlow = savedStateHandle.getStateFlow("processing", Boolean.FALSE);
        this.f9218n = stateFlow;
        q6.w a10 = AbstractC3815N.a(null);
        this.f9219o = a10;
        this.f9220p = a10;
        this.f9221q = AbstractC3815N.a(null);
        this.f9222r = j.f27336g.a(this);
        q6.w a11 = AbstractC3815N.a(new Q(new P(), A4.g.n(EnumC2906e.f32125w), null, false, 12, null));
        this.f9223s = a11;
        this.f9224t = a11;
        q6.w a12 = AbstractC3815N.a(Boolean.TRUE);
        this.f9225u = a12;
        this.f9226v = a12;
        this.f9227w = new C4243a(savedStateHandle, eventReporter, bVar.f(), ViewModelKt.getViewModelScope(this), new c());
        this.f9228x = C4122b.f40456f.a(this);
        this.f9229y = D.f26679u.a(this);
        this.f9230z = A4.g.d(stateFlow, A4.g.l(bVar.f(), d.f9235a), e.f9237a);
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), null, null, new C0186a(null), 3, null);
    }

    private final void K(D3.f fVar) {
        EnumC2906e enumC2906e;
        if (fVar instanceof f.C0023f) {
            f.C0023f c0023f = (f.C0023f) fVar;
            if (c0023f.r().f25635e == o.p.f25755i) {
                q6.w wVar = this.f9223s;
                P p8 = new P();
                o.g gVar = c0023f.r().f25638h;
                if (gVar == null || (enumC2906e = gVar.f25698a) == null) {
                    enumC2906e = EnumC2906e.f32125w;
                }
                wVar.setValue(new Q(p8, A4.g.n(enumC2906e), null, false, 12, null));
                AbstractC3462k.d(ViewModelKt.getViewModelScope(this), null, null, new g(null), 3, null);
            }
        }
    }

    public abstract InterfaceC3813L A();

    public final U5.g B() {
        return this.f9208d;
    }

    public final void C() {
        if (((Boolean) this.f9218n.getValue()).booleanValue()) {
            return;
        }
        if (this.f9216l.e()) {
            this.f9216l.i();
        } else {
            H();
        }
    }

    public abstract void D(f.e.d dVar);

    public abstract void E(D3.f fVar);

    public final boolean F() {
        return this.f9213i;
    }

    public abstract void G(C2.c cVar);

    public abstract void H();

    public abstract void I(k kVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void J(C2752d c2752d) {
        this.f9214j.setValue(c2752d);
    }

    public final void L(PrimaryButton.a state) {
        AbstractC3292y.i(state, "state");
        this.f9219o.setValue(state);
    }

    public final void M(D3.f fVar) {
        if (fVar instanceof f.e) {
            I(new k.b((f.e) fVar));
        } else if (fVar instanceof f.b) {
            I(new k.a((f.b) fVar));
        }
        this.f9209e.set("selection", fVar);
        K(fVar);
        b();
    }

    public abstract void b();

    public final C4243a c() {
        return this.f9227w;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final InterfaceC3813L d() {
        return this.f9230z;
    }

    public final InterfaceC3560b.a e() {
        return this.f9212h;
    }

    public final w.g f() {
        return this.f9205a;
    }

    public final q6.w g() {
        return this.f9221q;
    }

    public final M3.c h() {
        return this.f9207c;
    }

    public final C4122b i() {
        return this.f9228x;
    }

    public final InterfaceC3813L j() {
        return this.f9224t;
    }

    public final InterfaceC3813L k() {
        return this.f9226v;
    }

    public final InterfaceC1371t.a l() {
        return this.f9211g;
    }

    public abstract InterfaceC3813L m();

    public final EventReporter n() {
        return this.f9206b;
    }

    public final String o() {
        String b9;
        k s8 = s();
        if (s8 == null || (b9 = s8.b()) == null) {
            Object value = this.f9215k.getValue();
            AbstractC3292y.f(value);
            return (String) AbstractC1435t.m0(((C2752d) value).h0());
        }
        return b9;
    }

    public final i p() {
        return this.f9210f;
    }

    public final j q() {
        return this.f9222r;
    }

    public final E3.b r() {
        return this.f9216l;
    }

    public abstract k s();

    public final InterfaceC3813L t() {
        return this.f9215k;
    }

    public abstract InterfaceC3813L u();

    public final InterfaceC3813L v() {
        return this.f9218n;
    }

    public final D w() {
        return this.f9229y;
    }

    public final SavedStateHandle x() {
        return this.f9209e;
    }

    public final InterfaceC3813L y() {
        return this.f9217m;
    }

    public abstract InterfaceC3813L z();
}
