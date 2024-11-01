package com.stripe.android.paymentsheet;

import D3.f;
import E3.c;
import O3.C1361i;
import O3.InterfaceC1366n;
import O3.InterfaceC1371t;
import Q5.C1413h;
import Q5.I;
import Q5.InterfaceC1416k;
import R5.AbstractC1435t;
import androidx.lifecycle.ViewModelKt;
import c3.C2027g;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import com.stripe.android.model.o;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.r;
import d3.C2752d;
import g3.EnumC2906e;
import h4.InterfaceC2949a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n6.AbstractC3462k;
import n6.M;
import n6.X;
import q6.AbstractC3815N;
import q6.InterfaceC3813L;
import q6.InterfaceC3822g;
import v3.C4122b;

/* loaded from: classes4.dex */
public final class D {

    /* renamed from: u, reason: collision with root package name */
    public static final e f26679u = new e(null);

    /* renamed from: v, reason: collision with root package name */
    public static final int f26680v = 8;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1371t.a f26681a;

    /* renamed from: b, reason: collision with root package name */
    private final EventReporter f26682b;

    /* renamed from: c, reason: collision with root package name */
    private final M f26683c;

    /* renamed from: d, reason: collision with root package name */
    private final U5.g f26684d;

    /* renamed from: e, reason: collision with root package name */
    private final E3.b f26685e;

    /* renamed from: f, reason: collision with root package name */
    private final M3.c f26686f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f26687g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3813L f26688h;

    /* renamed from: i, reason: collision with root package name */
    private final Function1 f26689i;

    /* renamed from: j, reason: collision with root package name */
    private final Function0 f26690j;

    /* renamed from: k, reason: collision with root package name */
    private final Function0 f26691k;

    /* renamed from: l, reason: collision with root package name */
    private final Function0 f26692l;

    /* renamed from: m, reason: collision with root package name */
    private final C4122b f26693m;

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC3813L f26694n;

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC3813L f26695o;

    /* renamed from: p, reason: collision with root package name */
    private final InterfaceC1416k f26696p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC3813L f26697q;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC3813L f26698r;

    /* renamed from: s, reason: collision with root package name */
    private final q6.w f26699s;

    /* renamed from: t, reason: collision with root package name */
    private final InterfaceC3813L f26700t;

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f26701a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.paymentsheet.D$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0563a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ D f26703a;

            C0563a(D d8) {
                this.f26703a = d8;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(D3.f fVar, U5.d dVar) {
                if (fVar instanceof f.C0023f) {
                    this.f26703a.f26693m.e(((f.C0023f) fVar).r());
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
            int i8 = this.f26701a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L interfaceC3813L = D.this.f26688h;
                C0563a c0563a = new C0563a(D.this);
                this.f26701a = 1;
                if (interfaceC3813L.collect(c0563a, this) == e8) {
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

    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f26704a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ D f26706a;

            a(D d8) {
                this.f26706a = d8;
            }

            public final Object b(boolean z8, U5.d dVar) {
                if (!z8 && ((Boolean) this.f26706a.n().getValue()).booleanValue()) {
                    this.f26706a.f26699s.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                }
                return I.f8786a;
            }

            @Override // q6.InterfaceC3822g
            public /* bridge */ /* synthetic */ Object emit(Object obj, U5.d dVar) {
                return b(((Boolean) obj).booleanValue(), dVar);
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
            int i8 = this.f26704a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L l8 = D.this.l();
                a aVar = new a(D.this);
                this.f26704a = 1;
                if (l8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1413h();
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f26707a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ D f26709a;

            a(D d8) {
                this.f26709a = d8;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(List list, U5.d dVar) {
                if (list.isEmpty() && ((Boolean) this.f26709a.n().getValue()).booleanValue()) {
                    this.f26709a.f26699s.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                }
                return I.f8786a;
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
            int i8 = this.f26707a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L c8 = D.this.f26693m.c();
                a aVar = new a(D.this);
                this.f26707a = 1;
                if (c8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1413h();
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f26710a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ D f26712a;

            a(D d8) {
                this.f26712a = d8;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(E3.c cVar, U5.d dVar) {
                if (cVar instanceof c.k) {
                    this.f26712a.f26699s.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                }
                return I.f8786a;
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
            int i8 = this.f26710a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L interfaceC3813L = D.this.f26694n;
                a aVar = new a(D.this);
                this.f26710a = 1;
                if (interfaceC3813L.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1413h();
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class e {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final a f26713a = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(C2752d c2752d) {
                boolean z8 = false;
                if (c2752d != null && c2752d.a0()) {
                    z8 = true;
                }
                return Boolean.valueOf(z8);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ R3.a f26714a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(R3.a aVar) {
                super(1);
                this.f26714a = aVar;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C2.c invoke(String str) {
                C2027g c2027g;
                C2.c cVar = null;
                if (str != null) {
                    C2752d c2752d = (C2752d) this.f26714a.t().getValue();
                    if (c2752d != null) {
                        c2027g = c2752d.g0(str);
                    } else {
                        c2027g = null;
                    }
                    if (c2027g != null) {
                        cVar = c2027g.f();
                    }
                }
                return C2.d.c(cVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class c extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ R3.a f26715a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(R3.a aVar) {
                super(0);
                this.f26715a = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final E3.c invoke() {
                C1361i.e eVar = C1361i.f7563r;
                R3.a aVar = this.f26715a;
                Object value = aVar.t().getValue();
                if (value != null) {
                    return new c.b(eVar.a(aVar, (C2752d) value));
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class d extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ R3.a f26716a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(R3.a aVar) {
                super(0);
                this.f26716a = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5491invoke();
                return I.f8786a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5491invoke() {
                this.f26716a.M(null);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.paymentsheet.D$e$e, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0564e extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ R3.a f26717a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0564e(R3.a aVar) {
                super(0);
                this.f26717a = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                Object value = this.f26717a.t().getValue();
                if (value != null) {
                    return Boolean.valueOf(((C2752d) value).W().c());
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class f extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ R3.a f26718a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(R3.a aVar) {
                super(0);
                this.f26718a = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                C2752d c2752d = (C2752d) this.f26718a.t().getValue();
                return Boolean.valueOf((c2752d != null ? c2752d.w() : null) instanceof InterfaceC2949a.b);
            }
        }

        private e() {
        }

        public final D a(R3.a viewModel) {
            AbstractC3292y.i(viewModel, "viewModel");
            return new D(viewModel.l(), viewModel.n(), ViewModelKt.getViewModelScope(viewModel), viewModel.B(), viewModel.r(), viewModel.h(), viewModel.f().f(), viewModel.y(), new b(viewModel), new c(viewModel), new d(viewModel), new C0564e(viewModel), viewModel.i(), viewModel.r().f(), new f(viewModel), A4.g.m(viewModel.t(), a.f26713a), viewModel.p().g(), !viewModel.F());
        }

        public /* synthetic */ e(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public static final f f26719a = new f();

        f() {
            super(2);
        }

        public final Boolean a(boolean z8, List items) {
            boolean z9;
            AbstractC3292y.i(items, "items");
            if (!z8) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : items) {
                    if (obj instanceof r.d) {
                        arrayList.add(obj);
                    }
                }
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((r.d) it.next()).f()) {
                        }
                    }
                }
                z9 = false;
                return Boolean.valueOf(z9);
            }
            z9 = true;
            return Boolean.valueOf(z9);
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Boolean) obj).booleanValue(), (List) obj2);
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends AbstractC3293z implements Function1 {
        g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(N3.a aVar) {
            boolean z8 = false;
            if (aVar != null) {
                D d8 = D.this;
                boolean b9 = aVar.i().b();
                int size = aVar.h().size();
                if (size != 0) {
                    if (size != 1) {
                        z8 = b9;
                    } else if (d8.f26687g && b9) {
                        z8 = true;
                    }
                }
            }
            return Boolean.valueOf(z8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f26721a;

        /* renamed from: b, reason: collision with root package name */
        Object f26722b;

        /* renamed from: c, reason: collision with root package name */
        Object f26723c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f26724d;

        /* renamed from: f, reason: collision with root package name */
        int f26726f;

        h(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26724d = obj;
            this.f26726f |= Integer.MIN_VALUE;
            Object r8 = D.this.r(null, null, this);
            return r8 == V5.b.e() ? r8 : Q5.s.a(r8);
        }
    }

    /* loaded from: classes4.dex */
    static final class i extends AbstractC3293z implements Function1 {
        i() {
            super(1);
        }

        public final void a(InterfaceC1366n.a event) {
            AbstractC3292y.i(event, "event");
            if (event instanceof InterfaceC1366n.a.b) {
                D.this.f26682b.s(EventReporter.a.f27037a, ((InterfaceC1366n.a.b) event).a());
            } else if (event instanceof InterfaceC1366n.a.C0149a) {
                D.this.f26682b.q(EventReporter.a.f27037a, ((InterfaceC1366n.a.C0149a) event).a());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC1366n.a) obj);
            return I.f8786a;
        }
    }

    /* loaded from: classes4.dex */
    static final class j extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f26728a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f26729b;

        j(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            j jVar = new j(dVar);
            jVar.f26729b = obj;
            return jVar;
        }

        @Override // c6.InterfaceC2072n
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.stripe.android.model.o oVar, U5.d dVar) {
            return ((j) create(oVar, dVar)).invokeSuspend(I.f8786a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f26728a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                com.stripe.android.model.o oVar = (com.stripe.android.model.o) this.f26729b;
                D d8 = D.this;
                this.f26728a = 1;
                obj = d8.v(oVar, this);
                if (obj == e8) {
                    return e8;
                }
            }
            return obj;
        }
    }

    /* loaded from: classes4.dex */
    static final class k extends kotlin.coroutines.jvm.internal.l implements InterfaceC2073o {

        /* renamed from: a, reason: collision with root package name */
        int f26731a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f26732b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f26733c;

        k(U5.d dVar) {
            super(3, dVar);
        }

        @Override // c6.InterfaceC2073o
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.stripe.android.model.o oVar, EnumC2906e enumC2906e, U5.d dVar) {
            k kVar = new k(dVar);
            kVar.f26732b = oVar;
            kVar.f26733c = enumC2906e;
            return kVar.invokeSuspend(I.f8786a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object r8;
            Object e8 = V5.b.e();
            int i8 = this.f26731a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                    r8 = ((Q5.s) obj).j();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                com.stripe.android.model.o oVar = (com.stripe.android.model.o) this.f26732b;
                EnumC2906e enumC2906e = (EnumC2906e) this.f26733c;
                D d8 = D.this;
                this.f26732b = null;
                this.f26731a = 1;
                r8 = d8.r(oVar, enumC2906e, this);
                if (r8 == e8) {
                    return e8;
                }
            }
            return Q5.s.a(r8);
        }
    }

    /* loaded from: classes4.dex */
    static final class l extends AbstractC3293z implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3813L f26736b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3813L f26737c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f26738d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0 f26739e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(InterfaceC3813L interfaceC3813L, InterfaceC3813L interfaceC3813L2, boolean z8, Function0 function0) {
            super(0);
            this.f26736b = interfaceC3813L;
            this.f26737c = interfaceC3813L2;
            this.f26738d = z8;
            this.f26739e = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R3.b invoke() {
            InterfaceC3813L a9 = D.this.f26693m.a();
            Function1 q8 = D.this.q();
            return new R3.b(a9, this.f26736b, this.f26737c, D.this.m(), q8, this.f26738d, this.f26739e);
        }
    }

    /* loaded from: classes4.dex */
    static final class m extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f26740a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f26742c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, U5.d dVar) {
            super(2, dVar);
            this.f26742c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new m(this.f26742c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f26740a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                    ((Q5.s) obj).j();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                D.this.t(this.f26742c);
                D d8 = D.this;
                String str = this.f26742c;
                this.f26740a = 1;
                if (d8.w(str, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((m) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class n extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f26743a;

        /* renamed from: b, reason: collision with root package name */
        Object f26744b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f26745c;

        /* renamed from: e, reason: collision with root package name */
        int f26747e;

        n(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26745c = obj;
            this.f26747e |= Integer.MIN_VALUE;
            return D.this.v(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class o extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f26748a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f26750c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(String str, U5.d dVar) {
            super(2, dVar);
            this.f26750c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new o(this.f26750c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f26748a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                D.this.f26685e.i();
                this.f26748a = 1;
                if (X.b(600L, this) == e8) {
                    return e8;
                }
            }
            D.this.t(this.f26750c);
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((o) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class p extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26751a;

        /* renamed from: c, reason: collision with root package name */
        int f26753c;

        p(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26751a = obj;
            this.f26753c |= Integer.MIN_VALUE;
            Object w8 = D.this.w(null, this);
            return w8 == V5.b.e() ? w8 : Q5.s.a(w8);
        }
    }

    public D(InterfaceC1371t.a editInteractorFactory, EventReporter eventReporter, M coroutineScope, U5.g workContext, E3.b navigationHandler, M3.c customerRepository, boolean z8, InterfaceC3813L selection, Function1 providePaymentMethodName, Function0 addFirstPaymentMethodScreenFactory, Function0 clearSelection, Function0 isLiveModeProvider, C4122b customerStateHolder, InterfaceC3813L currentScreen, Function0 isCbcEligible, InterfaceC3813L isGooglePayReady, InterfaceC3813L isLinkEnabled, boolean z9) {
        AbstractC3292y.i(editInteractorFactory, "editInteractorFactory");
        AbstractC3292y.i(eventReporter, "eventReporter");
        AbstractC3292y.i(coroutineScope, "coroutineScope");
        AbstractC3292y.i(workContext, "workContext");
        AbstractC3292y.i(navigationHandler, "navigationHandler");
        AbstractC3292y.i(customerRepository, "customerRepository");
        AbstractC3292y.i(selection, "selection");
        AbstractC3292y.i(providePaymentMethodName, "providePaymentMethodName");
        AbstractC3292y.i(addFirstPaymentMethodScreenFactory, "addFirstPaymentMethodScreenFactory");
        AbstractC3292y.i(clearSelection, "clearSelection");
        AbstractC3292y.i(isLiveModeProvider, "isLiveModeProvider");
        AbstractC3292y.i(customerStateHolder, "customerStateHolder");
        AbstractC3292y.i(currentScreen, "currentScreen");
        AbstractC3292y.i(isCbcEligible, "isCbcEligible");
        AbstractC3292y.i(isGooglePayReady, "isGooglePayReady");
        AbstractC3292y.i(isLinkEnabled, "isLinkEnabled");
        this.f26681a = editInteractorFactory;
        this.f26682b = eventReporter;
        this.f26683c = coroutineScope;
        this.f26684d = workContext;
        this.f26685e = navigationHandler;
        this.f26686f = customerRepository;
        this.f26687g = z8;
        this.f26688h = selection;
        this.f26689i = providePaymentMethodName;
        this.f26690j = addFirstPaymentMethodScreenFactory;
        this.f26691k = clearSelection;
        this.f26692l = isLiveModeProvider;
        this.f26693m = customerStateHolder;
        this.f26694n = currentScreen;
        InterfaceC3813L m8 = A4.g.m(customerStateHolder.a(), new g());
        this.f26695o = m8;
        this.f26696p = Q5.l.b(new l(isGooglePayReady, isLinkEnabled, z9, isCbcEligible));
        InterfaceC3813L c8 = p().c();
        this.f26697q = c8;
        this.f26698r = A4.g.d(m8, c8, f.f26719a);
        q6.w a9 = AbstractC3815N.a(Boolean.FALSE);
        this.f26699s = a9;
        this.f26700t = a9;
        AbstractC3462k.d(coroutineScope, null, null, new a(null), 3, null);
        AbstractC3462k.d(coroutineScope, null, null, new b(null), 3, null);
        AbstractC3462k.d(coroutineScope, null, null, new c(null), 3, null);
        AbstractC3462k.d(coroutineScope, null, null, new d(null), 3, null);
    }

    private final R3.b p() {
        return (R3.b) this.f26696p.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(com.stripe.android.model.o r18, g3.EnumC2906e r19, U5.d r20) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.D.r(com.stripe.android.model.o, g3.e, U5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(String str) {
        String str2;
        f.C0023f c0023f;
        com.stripe.android.model.o r8;
        N3.a aVar = (N3.a) this.f26693m.a().getValue();
        if (aVar == null) {
            return;
        }
        C4122b c4122b = this.f26693m;
        List h8 = aVar.h();
        ArrayList arrayList = new ArrayList();
        for (Object obj : h8) {
            if (!AbstractC3292y.d(((com.stripe.android.model.o) obj).f25631a, str)) {
                arrayList.add(obj);
            }
        }
        c4122b.d(N3.a.b(aVar, null, null, arrayList, null, 11, null));
        com.stripe.android.model.o oVar = (com.stripe.android.model.o) this.f26693m.b().getValue();
        String str3 = null;
        if (oVar != null) {
            str2 = oVar.f25631a;
        } else {
            str2 = null;
        }
        if (AbstractC3292y.d(str2, str)) {
            this.f26693m.e(null);
        }
        Object value = this.f26688h.getValue();
        if (value instanceof f.C0023f) {
            c0023f = (f.C0023f) value;
        } else {
            c0023f = null;
        }
        if (c0023f != null && (r8 = c0023f.r()) != null) {
            str3 = r8.f25631a;
        }
        if (AbstractC3292y.d(str3, str)) {
            this.f26691k.invoke();
        }
        if (((List) this.f26693m.c().getValue()).isEmpty() && (this.f26685e.f().getValue() instanceof c.j)) {
            this.f26685e.l(AbstractC1435t.e(this.f26690j.invoke()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object v(com.stripe.android.model.o r9, U5.d r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.stripe.android.paymentsheet.D.n
            if (r0 == 0) goto L13
            r0 = r10
            com.stripe.android.paymentsheet.D$n r0 = (com.stripe.android.paymentsheet.D.n) r0
            int r1 = r0.f26747e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26747e = r1
            goto L18
        L13:
            com.stripe.android.paymentsheet.D$n r0 = new com.stripe.android.paymentsheet.D$n
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f26745c
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f26747e
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r9 = r0.f26744b
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r0 = r0.f26743a
            com.stripe.android.paymentsheet.D r0 = (com.stripe.android.paymentsheet.D) r0
            Q5.t.b(r10)
            Q5.s r10 = (Q5.s) r10
            java.lang.Object r10 = r10.j()
            goto L55
        L37:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3f:
            Q5.t.b(r10)
            java.lang.String r9 = r9.f25631a
            kotlin.jvm.internal.AbstractC3292y.f(r9)
            r0.f26743a = r8
            r0.f26744b = r9
            r0.f26747e = r3
            java.lang.Object r10 = r8.w(r9, r0)
            if (r10 != r1) goto L54
            return r1
        L54:
            r0 = r8
        L55:
            boolean r1 = Q5.s.h(r10)
            if (r1 == 0) goto L6b
            n6.M r2 = r0.f26683c
            U5.g r3 = r0.f26684d
            com.stripe.android.paymentsheet.D$o r5 = new com.stripe.android.paymentsheet.D$o
            r1 = 0
            r5.<init>(r9, r1)
            r6 = 2
            r7 = 0
            r4 = 0
            n6.AbstractC3458i.d(r2, r3, r4, r5, r6, r7)
        L6b:
            java.lang.Throwable r9 = Q5.s.e(r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.D.v(com.stripe.android.model.o, U5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object w(java.lang.String r8, U5.d r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.stripe.android.paymentsheet.D.p
            if (r0 == 0) goto L13
            r0 = r9
            com.stripe.android.paymentsheet.D$p r0 = (com.stripe.android.paymentsheet.D.p) r0
            int r1 = r0.f26753c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26753c = r1
            goto L18
        L13:
            com.stripe.android.paymentsheet.D$p r0 = new com.stripe.android.paymentsheet.D$p
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f26751a
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f26753c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            Q5.t.b(r9)
            Q5.s r9 = (Q5.s) r9
            java.lang.Object r8 = r9.j()
            goto L9e
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            Q5.t.b(r9)
            v3.b r9 = r7.f26693m
            q6.L r9 = r9.a()
            java.lang.Object r9 = r9.getValue()
            N3.a r9 = (N3.a) r9
            if (r9 != 0) goto L5a
            Q5.s$a r8 = Q5.s.f8810b
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Could not remove payment method because CustomerConfiguration was not found! Make sure it is provided as part of PaymentSheet.Configuration"
            r8.<init>(r9)
            java.lang.Object r8 = Q5.t.a(r8)
            java.lang.Object r8 = Q5.s.b(r8)
            return r8
        L5a:
            q6.L r2 = r7.f26688h
            java.lang.Object r2 = r2.getValue()
            boolean r4 = r2 instanceof D3.f.C0023f
            r5 = 0
            if (r4 == 0) goto L68
            D3.f$f r2 = (D3.f.C0023f) r2
            goto L69
        L68:
            r2 = r5
        L69:
            if (r2 == 0) goto L73
            com.stripe.android.model.o r2 = r2.r()
            if (r2 == 0) goto L73
            java.lang.String r5 = r2.f25631a
        L73:
            boolean r2 = kotlin.jvm.internal.AbstractC3292y.d(r5, r8)
            if (r2 == 0) goto L7e
            kotlin.jvm.functions.Function0 r2 = r7.f26691k
            r2.invoke()
        L7e:
            M3.c r2 = r7.f26686f
            M3.c$a r4 = new M3.c$a
            java.lang.String r5 = r9.getId()
            java.lang.String r6 = r9.f()
            r4.<init>(r5, r6)
            N3.a$c r9 = r9.i()
            boolean r9 = r9.a()
            r0.f26753c = r3
            java.lang.Object r8 = r2.d(r4, r8, r9, r0)
            if (r8 != r1) goto L9e
            return r1
        L9e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.D.w(java.lang.String, U5.d):java.lang.Object");
    }

    public final InterfaceC3813L l() {
        return this.f26698r;
    }

    public final InterfaceC3813L m() {
        return this.f26695o;
    }

    public final InterfaceC3813L n() {
        return this.f26700t;
    }

    public final InterfaceC3813L o() {
        return this.f26697q;
    }

    public final Function1 q() {
        return this.f26689i;
    }

    public final void s(com.stripe.android.model.o paymentMethod) {
        String str;
        AbstractC3292y.i(paymentMethod, "paymentMethod");
        E3.b bVar = this.f26685e;
        InterfaceC1371t.a aVar = this.f26681a;
        Function1 function1 = this.f26689i;
        o.p pVar = paymentMethod.f25635e;
        if (pVar != null) {
            str = pVar.f25773a;
        } else {
            str = null;
        }
        bVar.m(new c.f(aVar.a(paymentMethod, new i(), new j(null), new k(null), (C2.c) function1.invoke(str), ((Boolean) this.f26695o.getValue()).booleanValue(), ((Boolean) this.f26692l.invoke()).booleanValue())));
    }

    public final void u(com.stripe.android.model.o paymentMethod) {
        AbstractC3292y.i(paymentMethod, "paymentMethod");
        String str = paymentMethod.f25631a;
        if (str != null) {
            AbstractC3462k.d(this.f26683c, this.f26684d, null, new m(str, null), 2, null);
        }
    }

    public final void x() {
        q6.w wVar = this.f26699s;
        do {
        } while (!wVar.a(wVar.getValue(), Boolean.valueOf(!((Boolean) r1).booleanValue())));
    }
}
