package Q3;

import D3.f;
import Q3.i;
import Q5.C1413h;
import Q5.I;
import R5.AbstractC1435t;
import c6.InterfaceC2072n;
import c6.InterfaceC2075q;
import com.stripe.android.paymentsheet.D;
import d3.C2752d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.C3289v;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.M;
import n6.N;
import n6.U0;
import q6.InterfaceC3813L;
import q6.InterfaceC3822g;
import v3.C4122b;
import v3.C4127g;

/* loaded from: classes4.dex */
public final class b implements i {

    /* renamed from: q, reason: collision with root package name */
    public static final c f8419q = new c(null);

    /* renamed from: r, reason: collision with root package name */
    public static final int f8420r = 8;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3813L f8421a;

    /* renamed from: b, reason: collision with root package name */
    private final C2752d f8422b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3813L f8423c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3813L f8424d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3813L f8425e;

    /* renamed from: f, reason: collision with root package name */
    private final Function0 f8426f;

    /* renamed from: g, reason: collision with root package name */
    private final Function1 f8427g;

    /* renamed from: h, reason: collision with root package name */
    private final Function1 f8428h;

    /* renamed from: i, reason: collision with root package name */
    private final Function1 f8429i;

    /* renamed from: j, reason: collision with root package name */
    private final Function1 f8430j;

    /* renamed from: k, reason: collision with root package name */
    private final Function1 f8431k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f8432l;

    /* renamed from: m, reason: collision with root package name */
    private final M f8433m;

    /* renamed from: n, reason: collision with root package name */
    private final AtomicBoolean f8434n;

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC3813L f8435o;

    /* renamed from: p, reason: collision with root package name */
    private final InterfaceC3813L f8436p;

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f8437a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: Q3.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0167a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f8439a;

            C0167a(b bVar) {
                this.f8439a = bVar;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(i.a aVar, U5.d dVar) {
                if (!aVar.e() && !aVar.a() && aVar.d().size() == 1) {
                    this.f8439a.h((C4127g) AbstractC1435t.m0(aVar.d()));
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
            int i8 = this.f8437a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L state = b.this.getState();
                C0167a c0167a = new C0167a(b.this);
                this.f8437a = 1;
                if (state.collect(c0167a, this) == e8) {
                    return e8;
                }
            }
            throw new C1413h();
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* renamed from: Q3.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0168b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f8440a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: Q3.b$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f8442a;

            a(b bVar) {
                this.f8442a = bVar;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(List list, U5.d dVar) {
                if (list.isEmpty()) {
                    this.f8442a.i(false);
                }
                return I.f8786a;
            }
        }

        C0168b(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new C0168b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f8440a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L interfaceC3813L = b.this.f8421a;
                a aVar = new a(b.this);
                this.f8440a = 1;
                if (interfaceC3813L.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1413h();
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((C0168b) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c {

        /* loaded from: classes4.dex */
        /* synthetic */ class a extends C3289v implements Function0 {
            a(Object obj) {
                super(0, obj, D.class, "toggleEditing", "toggleEditing()V", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m47invoke();
                return I.f8786a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m47invoke() {
                ((D) this.receiver).x();
            }
        }

        /* renamed from: Q3.b$c$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0169b extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ R3.a f8443a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0169b(R3.a aVar) {
                super(1);
                this.f8443a = aVar;
            }

            public final void a(C4127g it) {
                AbstractC3292y.i(it, "it");
                f.C0023f c0023f = new f.C0023f(it.d(), null, null, 6, null);
                this.f8443a.E(c0023f);
                this.f8443a.n().o(c0023f);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C4127g) obj);
                return I.f8786a;
            }
        }

        /* renamed from: Q3.b$c$c, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0170c extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ D f8444a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0170c(D d8) {
                super(1);
                this.f8444a = d8;
            }

            public final void a(C4127g it) {
                AbstractC3292y.i(it, "it");
                this.f8444a.u(it.d());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C4127g) obj);
                return I.f8786a;
            }
        }

        /* loaded from: classes4.dex */
        static final class d extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ D f8445a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(D d8) {
                super(1);
                this.f8445a = d8;
            }

            public final void a(C4127g it) {
                AbstractC3292y.i(it, "it");
                this.f8445a.s(it.d());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C4127g) obj);
                return I.f8786a;
            }
        }

        /* loaded from: classes4.dex */
        static final class e extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ R3.a f8446a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(R3.a aVar) {
                super(1);
                this.f8446a = aVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return I.f8786a;
            }

            public final void invoke(boolean z8) {
                if (z8) {
                    this.f8446a.r().k();
                } else {
                    this.f8446a.r().i();
                }
            }
        }

        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C4127g c(D3.f fVar, List list) {
            boolean z8;
            boolean d8;
            boolean d9;
            boolean z9 = true;
            if (fVar == null) {
                z8 = true;
            } else {
                z8 = fVar instanceof f.b;
            }
            if (z8) {
                d8 = true;
            } else {
                d8 = AbstractC3292y.d(fVar, f.c.f1258a);
            }
            if (d8) {
                d9 = true;
            } else {
                d9 = AbstractC3292y.d(fVar, f.d.f1259a);
            }
            if (!d9) {
                z9 = fVar instanceof f.e;
            }
            Object obj = null;
            if (z9) {
                return null;
            }
            if (fVar instanceof f.C0023f) {
                String str = ((f.C0023f) fVar).r().f25631a;
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (AbstractC3292y.d(((C4127g) next).d().f25631a, str)) {
                        obj = next;
                        break;
                    }
                }
                return (C4127g) obj;
            }
            throw new Q5.p();
        }

        public final i b(R3.a viewModel, C2752d paymentMethodMetadata, C4122b customerStateHolder, D savedPaymentMethodMutator) {
            AbstractC3292y.i(viewModel, "viewModel");
            AbstractC3292y.i(paymentMethodMetadata, "paymentMethodMetadata");
            AbstractC3292y.i(customerStateHolder, "customerStateHolder");
            AbstractC3292y.i(savedPaymentMethodMutator, "savedPaymentMethodMutator");
            InterfaceC3813L c8 = customerStateHolder.c();
            InterfaceC3813L y8 = viewModel.y();
            InterfaceC3813L n8 = savedPaymentMethodMutator.n();
            InterfaceC3813L l8 = savedPaymentMethodMutator.l();
            return new b(c8, paymentMethodMetadata, y8, n8, savedPaymentMethodMutator.m(), l8, new a(savedPaymentMethodMutator), savedPaymentMethodMutator.q(), new C0169b(viewModel), new C0170c(savedPaymentMethodMutator), new d(savedPaymentMethodMutator), new e(viewModel), paymentMethodMetadata.W().c(), null, 8192, null);
        }

        public /* synthetic */ c(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3293z implements Function1 {
        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke(List paymentMethods) {
            AbstractC3292y.i(paymentMethods, "paymentMethods");
            List list = paymentMethods;
            b bVar = b.this;
            ArrayList arrayList = new ArrayList(AbstractC1435t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(q.a((com.stripe.android.model.o) it.next(), bVar.f8427g, bVar.f8422b));
            }
            return arrayList;
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3293z implements InterfaceC2075q {

        /* renamed from: a, reason: collision with root package name */
        public static final e f8448a = new e();

        e() {
            super(5);
        }

        public final i.a a(List displayablePaymentMethods, D3.f fVar, boolean z8, boolean z9, boolean z10) {
            C4127g c8;
            AbstractC3292y.i(displayablePaymentMethods, "displayablePaymentMethods");
            if (!z8) {
                c8 = b.f8419q.c(fVar, displayablePaymentMethods);
            } else {
                c8 = null;
            }
            return new i.a(displayablePaymentMethods, c8, z8, z9, z10);
        }

        @Override // c6.InterfaceC2075q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return a((List) obj, (D3.f) obj2, ((Boolean) obj3).booleanValue(), ((Boolean) obj4).booleanValue(), ((Boolean) obj5).booleanValue());
        }
    }

    public b(InterfaceC3813L paymentMethods, C2752d paymentMethodMetadata, InterfaceC3813L selection, InterfaceC3813L editing, InterfaceC3813L canRemove, InterfaceC3813L canEdit, Function0 toggleEdit, Function1 providePaymentMethodName, Function1 onSelectPaymentMethod, Function1 onDeletePaymentMethod, Function1 onEditPaymentMethod, Function1 navigateBack, boolean z8, U5.g dispatcher) {
        AbstractC3292y.i(paymentMethods, "paymentMethods");
        AbstractC3292y.i(paymentMethodMetadata, "paymentMethodMetadata");
        AbstractC3292y.i(selection, "selection");
        AbstractC3292y.i(editing, "editing");
        AbstractC3292y.i(canRemove, "canRemove");
        AbstractC3292y.i(canEdit, "canEdit");
        AbstractC3292y.i(toggleEdit, "toggleEdit");
        AbstractC3292y.i(providePaymentMethodName, "providePaymentMethodName");
        AbstractC3292y.i(onSelectPaymentMethod, "onSelectPaymentMethod");
        AbstractC3292y.i(onDeletePaymentMethod, "onDeletePaymentMethod");
        AbstractC3292y.i(onEditPaymentMethod, "onEditPaymentMethod");
        AbstractC3292y.i(navigateBack, "navigateBack");
        AbstractC3292y.i(dispatcher, "dispatcher");
        this.f8421a = paymentMethods;
        this.f8422b = paymentMethodMetadata;
        this.f8423c = selection;
        this.f8424d = editing;
        this.f8425e = canEdit;
        this.f8426f = toggleEdit;
        this.f8427g = providePaymentMethodName;
        this.f8428h = onSelectPaymentMethod;
        this.f8429i = onDeletePaymentMethod;
        this.f8430j = onEditPaymentMethod;
        this.f8431k = navigateBack;
        this.f8432l = z8;
        M a9 = N.a(dispatcher.plus(U0.b(null, 1, null)));
        this.f8433m = a9;
        this.f8434n = new AtomicBoolean(false);
        InterfaceC3813L m8 = A4.g.m(paymentMethods, new d());
        this.f8435o = m8;
        this.f8436p = A4.g.g(m8, selection, editing, canRemove, canEdit, e.f8448a);
        AbstractC3462k.d(a9, null, null, new a(null), 3, null);
        AbstractC3462k.d(a9, null, null, new C0168b(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(C4127g c4127g) {
        this.f8428h.invoke(c4127g);
        i(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(boolean z8) {
        if (!this.f8434n.getAndSet(true)) {
            this.f8431k.invoke(Boolean.valueOf(z8));
        }
    }

    @Override // Q3.i
    public void a(i.b viewAction) {
        AbstractC3292y.i(viewAction, "viewAction");
        if (viewAction instanceof i.b.c) {
            h(((i.b.c) viewAction).a());
            return;
        }
        if (viewAction instanceof i.b.a) {
            this.f8429i.invoke(((i.b.a) viewAction).a());
        } else if (viewAction instanceof i.b.C0178b) {
            this.f8430j.invoke(((i.b.C0178b) viewAction).a());
        } else if (AbstractC3292y.d(viewAction, i.b.d.f8564a)) {
            this.f8426f.invoke();
        }
    }

    @Override // Q3.i
    public boolean c() {
        return this.f8432l;
    }

    @Override // Q3.i
    public void close() {
        N.d(this.f8433m, null, 1, null);
    }

    @Override // Q3.i
    public InterfaceC3813L getState() {
        return this.f8436p;
    }

    public /* synthetic */ b(InterfaceC3813L interfaceC3813L, C2752d c2752d, InterfaceC3813L interfaceC3813L2, InterfaceC3813L interfaceC3813L3, InterfaceC3813L interfaceC3813L4, InterfaceC3813L interfaceC3813L5, Function0 function0, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, boolean z8, U5.g gVar, int i8, AbstractC3284p abstractC3284p) {
        this(interfaceC3813L, c2752d, interfaceC3813L2, interfaceC3813L3, interfaceC3813L4, interfaceC3813L5, function0, function1, function12, function13, function14, function15, z8, (i8 & 8192) != 0 ? C3445b0.a() : gVar);
    }
}
