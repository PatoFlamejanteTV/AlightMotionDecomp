package com.stripe.android.paymentsheet.paymentdatacollection.polling;

import Q5.InterfaceC1412g;
import Q5.t;
import S3.c;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.n;
import androidx.lifecycle.viewmodel.CreationExtras;
import c6.InterfaceC2072n;
import j6.InterfaceC3214c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.C3269a;
import kotlin.jvm.internal.InterfaceC3286s;
import m6.AbstractC3376c;
import m6.C3374a;
import m6.EnumC3377d;
import n6.AbstractC3458i;
import n6.C3445b0;
import n6.I;
import n6.M;
import n6.X;
import q6.AbstractC3815N;
import q6.AbstractC3823h;
import q6.InterfaceC3813L;
import q6.InterfaceC3821f;
import q6.InterfaceC3822g;
import q6.w;

/* loaded from: classes4.dex */
public final class b extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final e f27595a;

    /* renamed from: b, reason: collision with root package name */
    private final S3.c f27596b;

    /* renamed from: c, reason: collision with root package name */
    private final K3.h f27597c;

    /* renamed from: d, reason: collision with root package name */
    private final I f27598d;

    /* renamed from: e, reason: collision with root package name */
    private final SavedStateHandle f27599e;

    /* renamed from: f, reason: collision with root package name */
    private final w f27600f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3813L f27601g;

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f27602a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f27604c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j8, U5.d dVar) {
            super(2, dVar);
            this.f27604c = j8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new a(this.f27604c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f27602a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                b bVar = b.this;
                long j8 = this.f27604c;
                this.f27602a = 1;
                if (bVar.m(j8, this) == e8) {
                    return e8;
                }
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0643b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f27605a;

        C0643b(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new C0643b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f27605a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                b bVar = b.this;
                this.f27605a = 1;
                if (bVar.n(this) == e8) {
                    return e8;
                }
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((C0643b) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f27607a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f27608b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f27609c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j8, b bVar, U5.d dVar) {
            super(2, dVar);
            this.f27608b = j8;
            this.f27609c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new c(this.f27608b, this.f27609c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f27607a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        t.b(obj);
                        return Q5.I.f8786a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                long j8 = this.f27608b;
                this.f27607a = 1;
                if (X.c(j8, this) == e8) {
                    return e8;
                }
            }
            b bVar = this.f27609c;
            this.f27607a = 2;
            if (bVar.l(this) == e8) {
                return e8;
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f27610a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f27611b;

        d(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            d dVar2 = new d(dVar);
            dVar2.f27611b = obj;
            return dVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            M m8;
            Object e8 = V5.b.e();
            int i8 = this.f27610a;
            if (i8 != 0) {
                if (i8 == 1) {
                    m8 = (M) this.f27611b;
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                M m9 = (M) this.f27611b;
                long c8 = b.this.f27595a.c();
                this.f27611b = m9;
                this.f27610a = 1;
                if (X.c(c8, this) == e8) {
                    return e8;
                }
                m8 = m9;
            }
            b.this.f27596b.a(m8);
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        private final String f27613a;

        /* renamed from: b, reason: collision with root package name */
        private final long f27614b;

        /* renamed from: c, reason: collision with root package name */
        private final long f27615c;

        /* renamed from: d, reason: collision with root package name */
        private final int f27616d;

        /* renamed from: e, reason: collision with root package name */
        private final int f27617e;

        public /* synthetic */ e(String str, long j8, long j9, int i8, int i9, AbstractC3284p abstractC3284p) {
            this(str, j8, j9, i8, i9);
        }

        public final String a() {
            return this.f27613a;
        }

        public final int b() {
            return this.f27617e;
        }

        public final long c() {
            return this.f27615c;
        }

        public final int d() {
            return this.f27616d;
        }

        public final long e() {
            return this.f27614b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return AbstractC3292y.d(this.f27613a, eVar.f27613a) && C3374a.j(this.f27614b, eVar.f27614b) && C3374a.j(this.f27615c, eVar.f27615c) && this.f27616d == eVar.f27616d && this.f27617e == eVar.f27617e;
        }

        public int hashCode() {
            return (((((((this.f27613a.hashCode() * 31) + C3374a.A(this.f27614b)) * 31) + C3374a.A(this.f27615c)) * 31) + this.f27616d) * 31) + this.f27617e;
        }

        public String toString() {
            return "Args(clientSecret=" + this.f27613a + ", timeLimit=" + C3374a.N(this.f27614b) + ", initialDelay=" + C3374a.N(this.f27615c) + ", maxAttempts=" + this.f27616d + ", ctaText=" + this.f27617e + ")";
        }

        private e(String clientSecret, long j8, long j9, int i8, int i9) {
            AbstractC3292y.i(clientSecret, "clientSecret");
            this.f27613a = clientSecret;
            this.f27614b = j8;
            this.f27615c = j9;
            this.f27616d = i8;
            this.f27617e = i9;
        }
    }

    /* loaded from: classes4.dex */
    public static final class f implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final Function0 f27618a;

        public f(Function0 argsSupplier) {
            AbstractC3292y.i(argsSupplier, "argsSupplier");
            this.f27618a = argsSupplier;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(InterfaceC3214c interfaceC3214c, CreationExtras creationExtras) {
            return n.a(this, interfaceC3214c, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls) {
            return n.b(this, cls);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class modelClass, CreationExtras extras) {
            AbstractC3292y.i(modelClass, "modelClass");
            AbstractC3292y.i(extras, "extras");
            e eVar = (e) this.f27618a.invoke();
            b a9 = L3.b.a().b(E2.b.a(extras)).c(new c.a(eVar.a(), eVar.d())).a(C3445b0.b()).build().a().b(eVar).a(SavedStateHandleSupport.createSavedStateHandle(extras)).build().a();
            AbstractC3292y.g(a9, "null cannot be cast to non-null type T of com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel.Factory.create");
            return a9;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f27619a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f27620b;

        /* renamed from: d, reason: collision with root package name */
        int f27622d;

        g(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27620b = obj;
            this.f27622d |= Integer.MIN_VALUE;
            return b.this.l(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h implements InterfaceC3822g {
        h() {
        }

        public final Object b(long j8, U5.d dVar) {
            Object value;
            w wVar = b.this.f27600f;
            do {
                value = wVar.getValue();
            } while (!wVar.a(value, K3.f.b((K3.f) value, j8, 0, null, 6, null)));
            return Q5.I.f8786a;
        }

        @Override // q6.InterfaceC3822g
        public /* bridge */ /* synthetic */ Object emit(Object obj, U5.d dVar) {
            return b(((C3374a) obj).P(), dVar);
        }
    }

    /* loaded from: classes4.dex */
    public static final class i implements InterfaceC3821f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3821f f27624a;

        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3822g f27625a;

            /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.b$i$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0644a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f27626a;

                /* renamed from: b, reason: collision with root package name */
                int f27627b;

                public C0644a(U5.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f27626a = obj;
                    this.f27627b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC3822g interfaceC3822g) {
                this.f27625a = interfaceC3822g;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // q6.InterfaceC3822g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r5, U5.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.stripe.android.paymentsheet.paymentdatacollection.polling.b.i.a.C0644a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.stripe.android.paymentsheet.paymentdatacollection.polling.b$i$a$a r0 = (com.stripe.android.paymentsheet.paymentdatacollection.polling.b.i.a.C0644a) r0
                    int r1 = r0.f27627b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f27627b = r1
                    goto L18
                L13:
                    com.stripe.android.paymentsheet.paymentdatacollection.polling.b$i$a$a r0 = new com.stripe.android.paymentsheet.paymentdatacollection.polling.b$i$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f27626a
                    java.lang.Object r1 = V5.b.e()
                    int r2 = r0.f27627b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    Q5.t.b(r6)
                    goto L4b
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    Q5.t.b(r6)
                    q6.g r6 = r4.f27625a
                    com.stripe.android.model.StripeIntent$Status r5 = (com.stripe.android.model.StripeIntent.Status) r5
                    if (r5 == 0) goto L40
                    K3.e r5 = com.stripe.android.paymentsheet.paymentdatacollection.polling.c.b(r5)
                    if (r5 != 0) goto L42
                L40:
                    K3.e r5 = K3.e.f4624a
                L42:
                    r0.f27627b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4b
                    return r1
                L4b:
                    Q5.I r5 = Q5.I.f8786a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.paymentdatacollection.polling.b.i.a.emit(java.lang.Object, U5.d):java.lang.Object");
            }
        }

        public i(InterfaceC3821f interfaceC3821f) {
            this.f27624a = interfaceC3821f;
        }

        @Override // q6.InterfaceC3821f
        public Object collect(InterfaceC3822g interfaceC3822g, U5.d dVar) {
            Object collect = this.f27624a.collect(new a(interfaceC3822g), dVar);
            if (collect == V5.b.e()) {
                return collect;
            }
            return Q5.I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f27629a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f27630b;

        j(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            j jVar = new j(dVar);
            jVar.f27630b = obj;
            return jVar;
        }

        @Override // c6.InterfaceC2072n
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(K3.e eVar, U5.d dVar) {
            return ((j) create(eVar, dVar)).invokeSuspend(Q5.I.f8786a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f27629a == 0) {
                t.b(obj);
                if (((K3.e) this.f27630b) == K3.e.f4626c) {
                    b.this.f27596b.b();
                }
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class k implements InterfaceC3822g, InterfaceC3286s {
        k() {
        }

        @Override // q6.InterfaceC3822g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object emit(K3.e eVar, U5.d dVar) {
            Object o8 = b.o(b.this, eVar, dVar);
            if (o8 == V5.b.e()) {
                return o8;
            }
            return Q5.I.f8786a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC3822g) && (obj instanceof InterfaceC3286s)) {
                return AbstractC3292y.d(getFunctionDelegate(), ((InterfaceC3286s) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC3286s
        public final InterfaceC1412g getFunctionDelegate() {
            return new C3269a(2, b.this, b.class, "updatePollingState", "updatePollingState(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;)V", 4);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f27633a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f27634b;

        /* renamed from: d, reason: collision with root package name */
        int f27636d;

        l(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27634b = obj;
            this.f27636d |= Integer.MIN_VALUE;
            return b.this.q(this);
        }
    }

    /* loaded from: classes4.dex */
    static final class m extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f27637a;

        m(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new m(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f27637a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                long c8 = b.this.f27595a.c();
                this.f27637a = 1;
                if (X.c(c8, this) == e8) {
                    return e8;
                }
            }
            b.this.f27596b.a(ViewModelKt.getViewModelScope(b.this));
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((m) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    public b(e args, S3.c poller, K3.h timeProvider, I dispatcher, SavedStateHandle savedStateHandle) {
        AbstractC3292y.i(args, "args");
        AbstractC3292y.i(poller, "poller");
        AbstractC3292y.i(timeProvider, "timeProvider");
        AbstractC3292y.i(dispatcher, "dispatcher");
        AbstractC3292y.i(savedStateHandle, "savedStateHandle");
        this.f27595a = args;
        this.f27596b = poller;
        this.f27597c = timeProvider;
        this.f27598d = dispatcher;
        this.f27599e = savedStateHandle;
        w a9 = AbstractC3815N.a(new K3.f(args.e(), args.b(), null, 4, null));
        this.f27600f = a9;
        this.f27601g = a9;
        long i8 = i();
        AbstractC3458i.d(ViewModelKt.getViewModelScope(this), dispatcher, null, new a(i8, null), 2, null);
        AbstractC3458i.d(ViewModelKt.getViewModelScope(this), dispatcher, null, new C0643b(null), 2, null);
        AbstractC3458i.d(ViewModelKt.getViewModelScope(this), dispatcher, null, new c(i8, this, null), 2, null);
        AbstractC3458i.d(ViewModelKt.getViewModelScope(this), dispatcher, null, new d(null), 2, null);
    }

    private final long i() {
        Long l8 = (Long) this.f27599e.get("KEY_CURRENT_POLLING_START_TIME");
        if (l8 == null) {
            this.f27599e.set("KEY_CURRENT_POLLING_START_TIME", Long.valueOf(this.f27597c.a()));
        }
        if (l8 != null) {
            return ((C3374a) T5.a.c(C3374a.e(AbstractC3376c.t((l8.longValue() + C3374a.o(this.f27595a.e())) - this.f27597c.a(), EnumC3377d.f35045d)), C3374a.e(C3374a.f35036b.b()))).P();
        }
        return this.f27595a.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(U5.d r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.stripe.android.paymentsheet.paymentdatacollection.polling.b.g
            if (r0 == 0) goto L13
            r0 = r8
            com.stripe.android.paymentsheet.paymentdatacollection.polling.b$g r0 = (com.stripe.android.paymentsheet.paymentdatacollection.polling.b.g) r0
            int r1 = r0.f27622d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27622d = r1
            goto L18
        L13:
            com.stripe.android.paymentsheet.paymentdatacollection.polling.b$g r0 = new com.stripe.android.paymentsheet.paymentdatacollection.polling.b$g
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f27620b
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f27622d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            Q5.t.b(r8)
            goto L65
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            java.lang.Object r2 = r0.f27619a
            com.stripe.android.paymentsheet.paymentdatacollection.polling.b r2 = (com.stripe.android.paymentsheet.paymentdatacollection.polling.b) r2
            Q5.t.b(r8)
            goto L59
        L3c:
            Q5.t.b(r8)
            S3.c r8 = r7.f27596b
            r8.b()
            m6.a$a r8 = m6.C3374a.f35036b
            r8 = 3
            m6.d r2 = m6.EnumC3377d.f35046e
            long r5 = m6.AbstractC3376c.s(r8, r2)
            r0.f27619a = r7
            r0.f27622d = r4
            java.lang.Object r8 = n6.X.c(r5, r0)
            if (r8 != r1) goto L58
            return r1
        L58:
            r2 = r7
        L59:
            r8 = 0
            r0.f27619a = r8
            r0.f27622d = r3
            java.lang.Object r8 = r2.q(r0)
            if (r8 != r1) goto L65
            return r1
        L65:
            Q5.I r8 = Q5.I.f8786a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.paymentdatacollection.polling.b.l(U5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object m(long j8, U5.d dVar) {
        Object collect = com.stripe.android.paymentsheet.paymentdatacollection.polling.c.a(j8).collect(new h(), dVar);
        if (collect == V5.b.e()) {
            return collect;
        }
        return Q5.I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object n(U5.d dVar) {
        Object collect = AbstractC3823h.G(new i(this.f27596b.getState()), new j(null)).collect(new k(), dVar);
        if (collect == V5.b.e()) {
            return collect;
        }
        return Q5.I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object o(b bVar, K3.e eVar, U5.d dVar) {
        bVar.s(eVar);
        return Q5.I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(U5.d r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.stripe.android.paymentsheet.paymentdatacollection.polling.b.l
            if (r0 == 0) goto L13
            r0 = r9
            com.stripe.android.paymentsheet.paymentdatacollection.polling.b$l r0 = (com.stripe.android.paymentsheet.paymentdatacollection.polling.b.l) r0
            int r1 = r0.f27636d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27636d = r1
            goto L18
        L13:
            com.stripe.android.paymentsheet.paymentdatacollection.polling.b$l r0 = new com.stripe.android.paymentsheet.paymentdatacollection.polling.b$l
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f27634b
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f27636d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f27633a
            com.stripe.android.paymentsheet.paymentdatacollection.polling.b r0 = (com.stripe.android.paymentsheet.paymentdatacollection.polling.b) r0
            Q5.t.b(r9)
            goto L46
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L35:
            Q5.t.b(r9)
            S3.c r9 = r8.f27596b
            r0.f27633a = r8
            r0.f27636d = r3
            java.lang.Object r9 = r9.c(r0)
            if (r9 != r1) goto L45
            return r1
        L45:
            r0 = r8
        L46:
            com.stripe.android.model.StripeIntent$Status r9 = (com.stripe.android.model.StripeIntent.Status) r9
            com.stripe.android.model.StripeIntent$Status r1 = com.stripe.android.model.StripeIntent.Status.f25374h
            if (r9 != r1) goto L67
            q6.w r9 = r0.f27600f
        L4e:
            java.lang.Object r0 = r9.getValue()
            r1 = r0
            K3.f r1 = (K3.f) r1
            K3.e r5 = K3.e.f4625b
            r6 = 3
            r7 = 0
            r2 = 0
            r4 = 0
            K3.f r1 = K3.f.b(r1, r2, r4, r5, r6, r7)
            boolean r0 = r9.a(r0, r1)
            if (r0 == 0) goto L4e
            goto L81
        L67:
            q6.w r9 = r0.f27600f
        L69:
            java.lang.Object r0 = r9.getValue()
            r1 = r0
            K3.f r1 = (K3.f) r1
            K3.e r5 = K3.e.f4626c
            r6 = 3
            r7 = 0
            r2 = 0
            r4 = 0
            K3.f r1 = K3.f.b(r1, r2, r4, r5, r6, r7)
            boolean r0 = r9.a(r0, r1)
            if (r0 == 0) goto L69
        L81:
            Q5.I r9 = Q5.I.f8786a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.paymentdatacollection.polling.b.q(U5.d):java.lang.Object");
    }

    private final void s(K3.e eVar) {
        Object value;
        w wVar = this.f27600f;
        do {
            value = wVar.getValue();
        } while (!wVar.a(value, K3.f.b((K3.f) value, 0L, 0, eVar, 3, null)));
    }

    public final InterfaceC3813L j() {
        return this.f27601g;
    }

    public final void k() {
        Object value;
        w wVar = this.f27600f;
        do {
            value = wVar.getValue();
        } while (!wVar.a(value, K3.f.b((K3.f) value, 0L, 0, K3.e.f4627d, 3, null)));
        this.f27596b.b();
    }

    public final void p() {
        this.f27596b.b();
    }

    public final void r() {
        AbstractC3458i.d(ViewModelKt.getViewModelScope(this), this.f27598d, null, new m(null), 2, null);
    }
}
