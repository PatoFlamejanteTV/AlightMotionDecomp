package com.stripe.android.payments.bankaccount.ui;

import Q5.I;
import Q5.t;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.n;
import androidx.lifecycle.viewmodel.CreationExtras;
import c6.InterfaceC2072n;
import com.stripe.android.financialconnections.FinancialConnectionsSheetResult;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetInstantDebitsResult;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import com.stripe.android.payments.bankaccount.navigation.c;
import com.stripe.android.payments.bankaccount.navigation.d;
import com.stripe.android.payments.bankaccount.ui.a;
import j6.InterfaceC3214c;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import m3.AbstractC3369h;
import n3.C3410a;
import n3.C3411b;
import n3.C3412c;
import n6.AbstractC3462k;
import n6.M;
import q6.AbstractC3804C;
import q6.InterfaceC3802A;
import q6.v;

/* loaded from: classes4.dex */
public final class b extends ViewModel {

    /* renamed from: i, reason: collision with root package name */
    public static final C0545b f26357i = new C0545b(null);

    /* renamed from: j, reason: collision with root package name */
    public static final int f26358j = 8;

    /* renamed from: a, reason: collision with root package name */
    private final CollectBankAccountContract.a f26359a;

    /* renamed from: b, reason: collision with root package name */
    private final v f26360b;

    /* renamed from: c, reason: collision with root package name */
    private final C3411b f26361c;

    /* renamed from: d, reason: collision with root package name */
    private final C3410a f26362d;

    /* renamed from: e, reason: collision with root package name */
    private final C3412c f26363e;

    /* renamed from: f, reason: collision with root package name */
    private final SavedStateHandle f26364f;

    /* renamed from: g, reason: collision with root package name */
    private final v2.d f26365g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3802A f26366h;

    /* loaded from: classes4.dex */
    static final class a extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f26367a;

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
            int i8 = this.f26367a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                b bVar = b.this;
                this.f26367a = 1;
                if (bVar.l(this) == e8) {
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

    /* renamed from: com.stripe.android.payments.bankaccount.ui.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0545b {
        private C0545b() {
        }

        public /* synthetic */ C0545b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final Function0 f26369a;

        public c(Function0 argsSupplier) {
            AbstractC3292y.i(argsSupplier, "argsSupplier");
            this.f26369a = argsSupplier;
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
            b a9 = AbstractC3369h.a().a(SavedStateHandleSupport.createSavedStateHandle(extras)).b(E2.b.a(extras)).d(AbstractC3804C.b(0, 0, null, 7, null)).c((CollectBankAccountContract.a) this.f26369a.invoke()).build().a();
            AbstractC3292y.g(a9, "null cannot be cast to non-null type T of com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel.Factory.create");
            return a9;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        Object f26370a;

        /* renamed from: b, reason: collision with root package name */
        int f26371b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ FinancialConnectionsSession f26373d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(FinancialConnectionsSession financialConnectionsSession, U5.d dVar) {
            super(2, dVar);
            this.f26373d = financialConnectionsSession;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new d(this.f26373d, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x010f  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00f0  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 303
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.bankaccount.ui.b.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f26374a;

        /* renamed from: b, reason: collision with root package name */
        Object f26375b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f26376c;

        /* renamed from: e, reason: collision with root package name */
        int f26378e;

        e(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26376c = obj;
            this.f26378e |= Integer.MIN_VALUE;
            return b.this.l(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ FinancialConnectionsSheetInstantDebitsResult.Completed f26379a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(FinancialConnectionsSheetInstantDebitsResult.Completed completed) {
            super(1);
            this.f26379a = completed;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.stripe.android.payments.bankaccount.navigation.c invoke(StripeIntent stripeIntent) {
            return new com.stripe.android.payments.bankaccount.navigation.c(stripeIntent, null, new c.b(this.f26379a.getPaymentMethodId(), this.f26379a.getLast4(), this.f26379a.getBankName()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        Object f26380a;

        /* renamed from: b, reason: collision with root package name */
        int f26381b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1 f26383d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Function1 function1, U5.d dVar) {
            super(2, dVar);
            this.f26383d = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new g(this.f26383d, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x007a  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = V5.b.e()
                int r1 = r6.f26381b
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2f
                if (r1 == r4) goto L24
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                Q5.t.b(r7)
                goto L93
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                java.lang.Object r1 = r6.f26380a
                Q5.t.b(r7)
                goto L70
            L24:
                Q5.t.b(r7)
                Q5.s r7 = (Q5.s) r7
                java.lang.Object r7 = r7.j()
            L2d:
                r1 = r7
                goto L5d
            L2f:
                Q5.t.b(r7)
                com.stripe.android.payments.bankaccount.ui.b r7 = com.stripe.android.payments.bankaccount.ui.b.this
                com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract$a r7 = com.stripe.android.payments.bankaccount.ui.b.g(r7)
                java.lang.String r7 = r7.d()
                if (r7 != 0) goto L44
                r7 = 0
                java.lang.Object r7 = Q5.s.b(r7)
                goto L2d
            L44:
                com.stripe.android.payments.bankaccount.ui.b r1 = com.stripe.android.payments.bankaccount.ui.b.this
                n3.c r1 = com.stripe.android.payments.bankaccount.ui.b.j(r1)
                com.stripe.android.payments.bankaccount.ui.b r5 = com.stripe.android.payments.bankaccount.ui.b.this
                com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract$a r5 = com.stripe.android.payments.bankaccount.ui.b.g(r5)
                java.lang.String r5 = r5.h()
                r6.f26381b = r4
                java.lang.Object r7 = r1.a(r5, r7, r6)
                if (r7 != r0) goto L2d
                return r0
            L5d:
                com.stripe.android.payments.bankaccount.ui.b r7 = com.stripe.android.payments.bankaccount.ui.b.this
                java.lang.Throwable r4 = Q5.s.e(r1)
                if (r4 == 0) goto L70
                r6.f26380a = r1
                r6.f26381b = r3
                java.lang.Object r7 = com.stripe.android.payments.bankaccount.ui.b.c(r7, r4, r6)
                if (r7 != r0) goto L70
                return r0
            L70:
                kotlin.jvm.functions.Function1 r7 = r6.f26383d
                com.stripe.android.payments.bankaccount.ui.b r3 = com.stripe.android.payments.bankaccount.ui.b.this
                boolean r4 = Q5.s.h(r1)
                if (r4 == 0) goto L93
                r4 = r1
                com.stripe.android.model.StripeIntent r4 = (com.stripe.android.model.StripeIntent) r4
                java.lang.Object r7 = r7.invoke(r4)
                com.stripe.android.payments.bankaccount.navigation.c r7 = (com.stripe.android.payments.bankaccount.navigation.c) r7
                com.stripe.android.payments.bankaccount.navigation.d$b r4 = new com.stripe.android.payments.bankaccount.navigation.d$b
                r4.<init>(r7)
                r6.f26380a = r1
                r6.f26381b = r2
                java.lang.Object r7 = com.stripe.android.payments.bankaccount.ui.b.e(r3, r4, r6)
                if (r7 != r0) goto L93
                return r0
            L93:
                Q5.I r7 = Q5.I.f8786a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.bankaccount.ui.b.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ FinancialConnectionsSession f26384a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(FinancialConnectionsSession financialConnectionsSession) {
            super(1);
            this.f26384a = financialConnectionsSession;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.stripe.android.payments.bankaccount.navigation.c invoke(StripeIntent stripeIntent) {
            return new com.stripe.android.payments.bankaccount.navigation.c(stripeIntent, new c.C0542c(this.f26384a), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f26385a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FinancialConnectionsSheetResult f26386b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f26387c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(FinancialConnectionsSheetResult financialConnectionsSheetResult, b bVar, U5.d dVar) {
            super(2, dVar);
            this.f26386b = financialConnectionsSheetResult;
            this.f26387c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new i(this.f26386b, this.f26387c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f26385a;
            if (i8 != 0) {
                if (i8 != 1 && i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                FinancialConnectionsSheetResult.Failed failed = this.f26386b;
                if (failed instanceof FinancialConnectionsSheetResult.Canceled) {
                    b bVar = this.f26387c;
                    d.a aVar = d.a.f26337b;
                    this.f26385a = 1;
                    if (bVar.p(aVar, this) == e8) {
                        return e8;
                    }
                } else if (failed instanceof FinancialConnectionsSheetResult.Failed) {
                    b bVar2 = this.f26387c;
                    Throwable error = failed.getError();
                    this.f26385a = 2;
                    if (bVar2.m(error, this) == e8) {
                        return e8;
                    }
                } else if (failed instanceof FinancialConnectionsSheetResult.Completed) {
                    if (this.f26387c.f26359a.a()) {
                        this.f26387c.k(this.f26386b.getFinancialConnectionsSession());
                    } else {
                        this.f26387c.q(this.f26386b.getFinancialConnectionsSession());
                    }
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((i) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f26388a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FinancialConnectionsSheetInstantDebitsResult f26389b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f26390c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(FinancialConnectionsSheetInstantDebitsResult financialConnectionsSheetInstantDebitsResult, b bVar, U5.d dVar) {
            super(2, dVar);
            this.f26389b = financialConnectionsSheetInstantDebitsResult;
            this.f26390c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new j(this.f26389b, this.f26390c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f26388a;
            if (i8 != 0) {
                if (i8 != 1 && i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                FinancialConnectionsSheetInstantDebitsResult.Failed failed = this.f26389b;
                if (failed instanceof FinancialConnectionsSheetInstantDebitsResult.Canceled) {
                    b bVar = this.f26390c;
                    d.a aVar = d.a.f26337b;
                    this.f26388a = 1;
                    if (bVar.p(aVar, this) == e8) {
                        return e8;
                    }
                } else if (failed instanceof FinancialConnectionsSheetInstantDebitsResult.Failed) {
                    b bVar2 = this.f26390c;
                    Throwable error = failed.getError();
                    this.f26388a = 2;
                    if (bVar2.m(error, this) == e8) {
                        return e8;
                    }
                } else if (failed instanceof FinancialConnectionsSheetInstantDebitsResult.Completed) {
                    this.f26390c.n((FinancialConnectionsSheetInstantDebitsResult.Completed) failed);
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((j) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    public b(CollectBankAccountContract.a args, v _viewEffect, C3411b createFinancialConnectionsSession, C3410a attachFinancialConnectionsSession, C3412c retrieveStripeIntent, SavedStateHandle savedStateHandle, v2.d logger) {
        AbstractC3292y.i(args, "args");
        AbstractC3292y.i(_viewEffect, "_viewEffect");
        AbstractC3292y.i(createFinancialConnectionsSession, "createFinancialConnectionsSession");
        AbstractC3292y.i(attachFinancialConnectionsSession, "attachFinancialConnectionsSession");
        AbstractC3292y.i(retrieveStripeIntent, "retrieveStripeIntent");
        AbstractC3292y.i(savedStateHandle, "savedStateHandle");
        AbstractC3292y.i(logger, "logger");
        this.f26359a = args;
        this.f26360b = _viewEffect;
        this.f26361c = createFinancialConnectionsSession;
        this.f26362d = attachFinancialConnectionsSession;
        this.f26363e = retrieveStripeIntent;
        this.f26364f = savedStateHandle;
        this.f26365g = logger;
        this.f26366h = _viewEffect;
        if (!r()) {
            AbstractC3462k.d(ViewModelKt.getViewModelScope(this), null, null, new a(null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(FinancialConnectionsSession financialConnectionsSession) {
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), null, null, new d(financialConnectionsSession, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0021. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0142 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(U5.d r14) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.bankaccount.ui.b.l(U5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object m(Throwable th, U5.d dVar) {
        this.f26365g.a("Error", new Exception(th));
        Object p8 = p(new d.c(th), dVar);
        if (p8 == V5.b.e()) {
            return p8;
        }
        return I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(FinancialConnectionsSheetInstantDebitsResult.Completed completed) {
        o(new f(completed));
    }

    private final void o(Function1 function1) {
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), null, null, new g(function1, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object p(com.stripe.android.payments.bankaccount.navigation.d dVar, U5.d dVar2) {
        Object emit = this.f26360b.emit(new a.C0544a(dVar), dVar2);
        if (emit == V5.b.e()) {
            return emit;
        }
        return I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(FinancialConnectionsSession financialConnectionsSession) {
        o(new h(financialConnectionsSession));
    }

    private final boolean r() {
        return AbstractC3292y.d(this.f26364f.get("key_has_launched"), Boolean.TRUE);
    }

    private final void v(boolean z8) {
        this.f26364f.set("key_has_launched", Boolean.valueOf(z8));
    }

    public final InterfaceC3802A s() {
        return this.f26366h;
    }

    public final void t(FinancialConnectionsSheetResult result) {
        AbstractC3292y.i(result, "result");
        v(false);
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), null, null, new i(result, this, null), 3, null);
    }

    public final void u(FinancialConnectionsSheetInstantDebitsResult result) {
        AbstractC3292y.i(result, "result");
        v(false);
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), null, null, new j(result, this, null), 3, null);
    }
}
