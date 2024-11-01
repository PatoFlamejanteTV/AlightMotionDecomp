package com.stripe.android.paymentsheet.addresselement;

import C3.InterfaceC0984e;
import Q5.C1413h;
import Q5.I;
import Q5.s;
import Q5.t;
import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.n;
import androidx.lifecycle.viewmodel.CreationExtras;
import c6.InterfaceC2072n;
import com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract;
import com.stripe.android.paymentsheet.w;
import j6.InterfaceC3214c;
import k4.InterfaceC3244b;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n2.z;
import n6.AbstractC3462k;
import n6.InterfaceC3488x0;
import n6.M;
import n6.N;
import n6.X;
import o4.AbstractC3533g;
import q6.AbstractC3815N;
import q6.InterfaceC3813L;
import q6.InterfaceC3822g;
import q6.w;
import r4.r0;
import r4.s0;
import r4.x0;
import w3.C4154a;
import x3.InterfaceC4215b;

/* loaded from: classes4.dex */
public final class g extends AndroidViewModel {

    /* renamed from: m, reason: collision with root package name */
    public static final d f26920m = new d(null);

    /* renamed from: n, reason: collision with root package name */
    public static final int f26921n = 8;

    /* renamed from: a, reason: collision with root package name */
    private final AddressElementActivityContract.a f26922a;

    /* renamed from: b, reason: collision with root package name */
    private final com.stripe.android.paymentsheet.addresselement.a f26923b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3244b f26924c;

    /* renamed from: d, reason: collision with root package name */
    private final c f26925d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC4215b f26926e;

    /* renamed from: f, reason: collision with root package name */
    private final w f26927f;

    /* renamed from: g, reason: collision with root package name */
    private final w f26928g;

    /* renamed from: h, reason: collision with root package name */
    private final w f26929h;

    /* renamed from: i, reason: collision with root package name */
    private final r0 f26930i;

    /* renamed from: j, reason: collision with root package name */
    private final s0 f26931j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC3813L f26932k;

    /* renamed from: l, reason: collision with root package name */
    private final e f26933l;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements Function1 {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.paymentsheet.addresselement.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0592a extends l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f26935a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ g f26936b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f26937c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0592a(g gVar, String str, U5.d dVar) {
                super(2, dVar);
                this.f26936b = gVar;
                this.f26937c = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new C0592a(this.f26936b, this.f26937c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object b9;
                Object e8 = V5.b.e();
                int i8 = this.f26935a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                        b9 = ((s) obj).j();
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    InterfaceC3244b interfaceC3244b = this.f26936b.f26924c;
                    if (interfaceC3244b != null) {
                        String str = this.f26937c;
                        String a9 = this.f26936b.f26925d.a();
                        if (a9 != null) {
                            this.f26935a = 1;
                            b9 = interfaceC3244b.b(str, a9, 4, this);
                            if (b9 == e8) {
                                return e8;
                            }
                        } else {
                            throw new IllegalStateException("Country cannot be empty");
                        }
                    }
                    return I.f8786a;
                }
                g gVar = this.f26936b;
                Throwable e9 = s.e(b9);
                if (e9 == null) {
                    gVar.f26928g.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                    gVar.f26927f.setValue(((l4.f) b9).a());
                } else {
                    gVar.f26928g.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                    gVar.h().setValue(s.a(s.b(t.a(e9))));
                }
                return I.f8786a;
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((C0592a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return I.f8786a;
        }

        public final void invoke(String it) {
            AbstractC3292y.i(it, "it");
            AbstractC3462k.d(ViewModelKt.getViewModelScope(g.this), null, null, new C0592a(g.this, it, null), 3, null);
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f26938a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ g f26940a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.addresselement.g$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0593a extends AbstractC3293z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ g f26941a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0593a(g gVar) {
                    super(0);
                    this.f26941a = gVar;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m5498invoke();
                    return I.f8786a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m5498invoke() {
                    this.f26941a.g();
                }
            }

            a(g gVar) {
                this.f26940a = gVar;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(String str, U5.d dVar) {
                Object value;
                Object value2;
                if (str.length() == 0) {
                    w c8 = this.f26940a.f26930i.c();
                    do {
                        value2 = c8.getValue();
                    } while (!c8.a(value2, null));
                } else {
                    w c9 = this.f26940a.f26930i.c();
                    g gVar = this.f26940a;
                    do {
                        value = c9.getValue();
                    } while (!c9.a(value, new x0.c(z.f35478N, null, true, new C0593a(gVar), 2, null)));
                }
                return I.f8786a;
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
            int i8 = this.f26938a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                InterfaceC3813L interfaceC3813L = g.this.f26932k;
                a aVar = new a(g.this);
                this.f26938a = 1;
                if (interfaceC3813L.collect(aVar, this) == e8) {
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
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final String f26942a;

        public c(String str) {
            this.f26942a = str;
        }

        public final String a() {
            return this.f26942a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC3292y.d(this.f26942a, ((c) obj).f26942a);
        }

        public int hashCode() {
            String str = this.f26942a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Args(country=" + this.f26942a + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        private InterfaceC3488x0 f26943a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f26944a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f26945b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC3813L f26946c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ e f26947d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Function1 f26948e;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.addresselement.g$e$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0594a implements InterfaceC3822g {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ e f26949a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ M f26950b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ Function1 f26951c;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: com.stripe.android.paymentsheet.addresselement.g$e$a$a$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0595a extends l implements InterfaceC2072n {

                    /* renamed from: a, reason: collision with root package name */
                    int f26952a;

                    /* renamed from: b, reason: collision with root package name */
                    private /* synthetic */ Object f26953b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ Function1 f26954c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ String f26955d;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0595a(Function1 function1, String str, U5.d dVar) {
                        super(2, dVar);
                        this.f26954c = function1;
                        this.f26955d = str;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final U5.d create(Object obj, U5.d dVar) {
                        C0595a c0595a = new C0595a(this.f26954c, this.f26955d, dVar);
                        c0595a.f26953b = obj;
                        return c0595a;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        M m8;
                        Object e8 = V5.b.e();
                        int i8 = this.f26952a;
                        if (i8 != 0) {
                            if (i8 == 1) {
                                m8 = (M) this.f26953b;
                                t.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            t.b(obj);
                            M m9 = (M) this.f26953b;
                            this.f26953b = m9;
                            this.f26952a = 1;
                            if (X.b(1000L, this) == e8) {
                                return e8;
                            }
                            m8 = m9;
                        }
                        if (N.g(m8)) {
                            this.f26954c.invoke(this.f26955d);
                        }
                        return I.f8786a;
                    }

                    @Override // c6.InterfaceC2072n
                    public final Object invoke(M m8, U5.d dVar) {
                        return ((C0595a) create(m8, dVar)).invokeSuspend(I.f8786a);
                    }
                }

                C0594a(e eVar, M m8, Function1 function1) {
                    this.f26949a = eVar;
                    this.f26950b = m8;
                    this.f26951c = function1;
                }

                @Override // q6.InterfaceC3822g
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Object emit(String str, U5.d dVar) {
                    InterfaceC3488x0 d8;
                    if (str != null) {
                        e eVar = this.f26949a;
                        M m8 = this.f26950b;
                        Function1 function1 = this.f26951c;
                        InterfaceC3488x0 interfaceC3488x0 = eVar.f26943a;
                        if (interfaceC3488x0 != null) {
                            InterfaceC3488x0.a.a(interfaceC3488x0, null, 1, null);
                        }
                        if (str.length() > 3) {
                            d8 = AbstractC3462k.d(m8, null, null, new C0595a(function1, str, null), 3, null);
                            eVar.f26943a = d8;
                        }
                    }
                    return I.f8786a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC3813L interfaceC3813L, e eVar, Function1 function1, U5.d dVar) {
                super(2, dVar);
                this.f26946c = interfaceC3813L;
                this.f26947d = eVar;
                this.f26948e = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                a aVar = new a(this.f26946c, this.f26947d, this.f26948e, dVar);
                aVar.f26945b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = V5.b.e();
                int i8 = this.f26944a;
                if (i8 != 0) {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                } else {
                    t.b(obj);
                    M m8 = (M) this.f26945b;
                    InterfaceC3813L interfaceC3813L = this.f26946c;
                    C0594a c0594a = new C0594a(this.f26947d, m8, this.f26948e);
                    this.f26944a = 1;
                    if (interfaceC3813L.collect(c0594a, this) == e8) {
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

        public final void c(M coroutineScope, InterfaceC3813L queryFlow, Function1 onValidQuery) {
            AbstractC3292y.i(coroutineScope, "coroutineScope");
            AbstractC3292y.i(queryFlow, "queryFlow");
            AbstractC3292y.i(onValidQuery, "onValidQuery");
            AbstractC3462k.d(coroutineScope, null, null, new a(queryFlow, this, onValidQuery, null), 3, null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class f implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final N5.a f26956a;

        /* renamed from: b, reason: collision with root package name */
        private final c f26957b;

        /* renamed from: c, reason: collision with root package name */
        private final Function0 f26958c;

        public f(N5.a autoCompleteViewModelSubcomponentBuilderProvider, c args, Function0 applicationSupplier) {
            AbstractC3292y.i(autoCompleteViewModelSubcomponentBuilderProvider, "autoCompleteViewModelSubcomponentBuilderProvider");
            AbstractC3292y.i(args, "args");
            AbstractC3292y.i(applicationSupplier, "applicationSupplier");
            this.f26956a = autoCompleteViewModelSubcomponentBuilderProvider;
            this.f26957b = args;
            this.f26958c = applicationSupplier;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(InterfaceC3214c interfaceC3214c, CreationExtras creationExtras) {
            return n.a(this, interfaceC3214c, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
            return n.c(this, cls, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class modelClass) {
            AbstractC3292y.i(modelClass, "modelClass");
            g a9 = ((InterfaceC0984e.a) this.f26956a.get()).b((Application) this.f26958c.invoke()).c(this.f26957b).build().a();
            AbstractC3292y.g(a9, "null cannot be cast to non-null type T of com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel.Factory.create");
            return a9;
        }
    }

    /* renamed from: com.stripe.android.paymentsheet.addresselement.g$g, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0596g extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f26959a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ l4.d f26961c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0596g(l4.d dVar, U5.d dVar2) {
            super(2, dVar2);
            this.f26961c = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new C0596g(this.f26961c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object a9;
            Object e8 = V5.b.e();
            int i8 = this.f26959a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                    a9 = ((s) obj).j();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                g.this.f26928g.setValue(kotlin.coroutines.jvm.internal.b.a(true));
                InterfaceC3244b interfaceC3244b = g.this.f26924c;
                if (interfaceC3244b != null) {
                    String a10 = this.f26961c.a();
                    this.f26959a = 1;
                    a9 = interfaceC3244b.a(a10, this);
                    if (a9 == e8) {
                        return e8;
                    }
                }
                return I.f8786a;
            }
            g gVar = g.this;
            Throwable e9 = s.e(a9);
            if (e9 == null) {
                gVar.f26928g.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                com.stripe.android.model.a f8 = l4.h.f(((l4.e) a9).a(), gVar.getApplication());
                gVar.h().setValue(s.a(s.b(new C4154a(null, new w.a(f8.a(), f8.b(), f8.f(), f8.h(), f8.i(), f8.l()), null, null, 13, null))));
                g.p(gVar, null, 1, null);
            } else {
                gVar.f26928g.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                gVar.h().setValue(s.a(s.b(t.a(e9))));
                g.p(gVar, null, 1, null);
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((C0596g) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(AddressElementActivityContract.a args, com.stripe.android.paymentsheet.addresselement.a navigator, InterfaceC3244b interfaceC3244b, c autocompleteArgs, InterfaceC4215b eventReporter, Application application) {
        super(application);
        AbstractC3292y.i(args, "args");
        AbstractC3292y.i(navigator, "navigator");
        AbstractC3292y.i(autocompleteArgs, "autocompleteArgs");
        AbstractC3292y.i(eventReporter, "eventReporter");
        AbstractC3292y.i(application, "application");
        this.f26922a = args;
        this.f26923b = navigator;
        this.f26924c = interfaceC3244b;
        this.f26925d = autocompleteArgs;
        this.f26926e = eventReporter;
        this.f26927f = AbstractC3815N.a(null);
        this.f26928g = AbstractC3815N.a(Boolean.FALSE);
        this.f26929h = AbstractC3815N.a(null);
        r0 r0Var = new r0(Integer.valueOf(AbstractC3533g.f35957a), 0, 0, AbstractC3815N.a(null), 6, null);
        this.f26930i = r0Var;
        byte b9 = 0 == true ? 1 : 0;
        s0 s0Var = new s0(r0Var, b9, null, 6, null);
        this.f26931j = s0Var;
        InterfaceC3813L j8 = s0Var.j();
        this.f26932k = j8;
        e eVar = new e();
        this.f26933l = eVar;
        eVar.c(ViewModelKt.getViewModelScope(this), j8, new a());
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), null, null, new b(null), 3, null);
        String a9 = autocompleteArgs.a();
        if (a9 != null) {
            eventReporter.a(a9);
        }
    }

    private final void o(C4154a c4154a) {
        if (c4154a != null) {
            this.f26923b.h("AddressDetails", c4154a);
        } else {
            s sVar = (s) this.f26929h.getValue();
            if (sVar != null) {
                Object j8 = sVar.j();
                if (s.e(j8) == null) {
                    this.f26923b.h("AddressDetails", (C4154a) j8);
                } else {
                    this.f26923b.h("AddressDetails", null);
                }
            }
        }
        this.f26923b.e();
    }

    static /* synthetic */ void p(g gVar, C4154a c4154a, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            c4154a = null;
        }
        gVar.o(c4154a);
    }

    public final void g() {
        this.f26931j.q("");
        this.f26927f.setValue(null);
    }

    public final q6.w h() {
        return this.f26929h;
    }

    public final InterfaceC3813L i() {
        return this.f26928g;
    }

    public final InterfaceC3813L j() {
        return this.f26927f;
    }

    public final s0 k() {
        return this.f26931j;
    }

    public final void l() {
        C4154a c4154a;
        if (!l6.n.T((CharSequence) this.f26932k.getValue())) {
            c4154a = new C4154a(null, new w.a(null, null, (String) this.f26932k.getValue(), null, null, null, 59, null), null, null, 13, null);
        } else {
            c4154a = null;
        }
        o(c4154a);
    }

    public final void m() {
        this.f26923b.h("force_expanded_form", Boolean.TRUE);
        o(new C4154a(null, new w.a(null, null, (String) this.f26932k.getValue(), null, null, null, 59, null), null, null, 13, null));
    }

    public final void n(l4.d prediction) {
        AbstractC3292y.i(prediction, "prediction");
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), null, null, new C0596g(prediction, null), 3, null);
    }
}
