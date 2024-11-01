package com.stripe.android.googlepaylauncher;

import B2.j;
import R5.a0;
import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContractV2;
import com.stripe.android.googlepaylauncher.j;
import j6.InterfaceC3214c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n2.m;
import n2.r;
import org.json.JSONObject;
import q6.AbstractC3815N;
import q6.AbstractC3823h;
import q6.InterfaceC3813L;
import q6.w;
import r0.C3875m;

/* loaded from: classes4.dex */
public final class l extends ViewModel {

    /* renamed from: j, reason: collision with root package name */
    private static final a f25164j = new a(null);

    /* renamed from: k, reason: collision with root package name */
    public static final int f25165k = 8;

    /* renamed from: a, reason: collision with root package name */
    private final C3875m f25166a;

    /* renamed from: b, reason: collision with root package name */
    private final j.c f25167b;

    /* renamed from: c, reason: collision with root package name */
    private final GooglePayPaymentMethodLauncherContractV2.a f25168c;

    /* renamed from: d, reason: collision with root package name */
    private final j3.m f25169d;

    /* renamed from: e, reason: collision with root package name */
    private final n2.m f25170e;

    /* renamed from: f, reason: collision with root package name */
    private final n f25171f;

    /* renamed from: g, reason: collision with root package name */
    private final SavedStateHandle f25172g;

    /* renamed from: h, reason: collision with root package name */
    private final w f25173h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC3813L f25174i;

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final GooglePayPaymentMethodLauncherContractV2.a f25175a;

        /* loaded from: classes4.dex */
        static final class a extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Application f25176a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Application application) {
                super(0);
                this.f25176a = application;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return r.f35413c.a(this.f25176a).f();
            }
        }

        /* renamed from: com.stripe.android.googlepaylauncher.l$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0476b extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Application f25177a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0476b(Application application) {
                super(0);
                this.f25177a = application;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return r.f35413c.a(this.f25177a).h();
            }
        }

        public b(GooglePayPaymentMethodLauncherContractV2.a args) {
            AbstractC3292y.i(args, "args");
            this.f25175a = args;
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
            l a10 = O2.b.a().a(a9).d(false).c(new a(a9)).e(new C0476b(a9)).b(a0.d("GooglePayPaymentMethodLauncher")).f(this.f25175a.b()).build().a().b(this.f25175a).a(SavedStateHandleSupport.createSavedStateHandle(extras)).build().a();
            AbstractC3292y.g(a10, "null cannot be cast to non-null type T of com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel.Factory.create");
            return a10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f25178a;

        /* renamed from: c, reason: collision with root package name */
        int f25180c;

        c(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25178a = obj;
            this.f25180c |= Integer.MIN_VALUE;
            return l.this.b(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f25181a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f25182b;

        /* renamed from: d, reason: collision with root package name */
        int f25184d;

        d(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25182b = obj;
            this.f25184d |= Integer.MIN_VALUE;
            return l.this.g(this);
        }
    }

    public l(C3875m paymentsClient, j.c requestOptions, GooglePayPaymentMethodLauncherContractV2.a args, j3.m stripeRepository, n2.m googlePayJsonFactory, n googlePayRepository, SavedStateHandle savedStateHandle) {
        AbstractC3292y.i(paymentsClient, "paymentsClient");
        AbstractC3292y.i(requestOptions, "requestOptions");
        AbstractC3292y.i(args, "args");
        AbstractC3292y.i(stripeRepository, "stripeRepository");
        AbstractC3292y.i(googlePayJsonFactory, "googlePayJsonFactory");
        AbstractC3292y.i(googlePayRepository, "googlePayRepository");
        AbstractC3292y.i(savedStateHandle, "savedStateHandle");
        this.f25166a = paymentsClient;
        this.f25167b = requestOptions;
        this.f25168c = args;
        this.f25169d = stripeRepository;
        this.f25170e = googlePayJsonFactory;
        this.f25171f = googlePayRepository;
        this.f25172g = savedStateHandle;
        w a9 = AbstractC3815N.a(null);
        this.f25173h = a9;
        this.f25174i = AbstractC3823h.b(a9);
    }

    public final JSONObject a() {
        return n2.m.e(this.f25170e, c(this.f25168c), com.stripe.android.googlepaylauncher.a.b(this.f25168c.b().b()), null, this.f25168c.b().p(), new m.c(this.f25168c.b().l()), Boolean.valueOf(this.f25168c.b().a()), 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(r0.C3871i r5, U5.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.stripe.android.googlepaylauncher.l.c
            if (r0 == 0) goto L13
            r0 = r6
            com.stripe.android.googlepaylauncher.l$c r0 = (com.stripe.android.googlepaylauncher.l.c) r0
            int r1 = r0.f25180c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25180c = r1
            goto L18
        L13:
            com.stripe.android.googlepaylauncher.l$c r0 = new com.stripe.android.googlepaylauncher.l$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f25178a
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f25180c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            Q5.t.b(r6)
            Q5.s r6 = (Q5.s) r6
            java.lang.Object r5 = r6.j()
            goto L56
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            Q5.t.b(r6)
            org.json.JSONObject r6 = new org.json.JSONObject
            java.lang.String r5 = r5.u()
            r6.<init>(r5)
            com.stripe.android.model.p$e r5 = com.stripe.android.model.p.f25804u
            com.stripe.android.model.p r5 = r5.j(r6)
            j3.m r6 = r4.f25169d
            B2.j$c r2 = r4.f25167b
            r0.f25180c = r3
            java.lang.Object r5 = r6.w(r5, r2, r0)
            if (r5 != r1) goto L56
            return r1
        L56:
            java.lang.Throwable r6 = Q5.s.e(r5)
            if (r6 != 0) goto L64
            com.stripe.android.model.o r5 = (com.stripe.android.model.o) r5
            com.stripe.android.googlepaylauncher.j$f$b r6 = new com.stripe.android.googlepaylauncher.j$f$b
            r6.<init>(r5)
            goto L75
        L64:
            com.stripe.android.googlepaylauncher.j$f$c r5 = new com.stripe.android.googlepaylauncher.j$f$c
            boolean r0 = r6 instanceof x2.C4207a
            if (r0 == 0) goto L6c
            r3 = 3
            goto L71
        L6c:
            boolean r0 = r6 instanceof x2.C4212f
            if (r0 == 0) goto L71
            r3 = 2
        L71:
            r5.<init>(r6, r3)
            r6 = r5
        L75:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.googlepaylauncher.l.b(r0.i, U5.d):java.lang.Object");
    }

    public final m.e c(GooglePayPaymentMethodLauncherContractV2.a args) {
        AbstractC3292y.i(args, "args");
        return new m.e(args.f(), m.e.c.f35385c, args.b().i(), args.i(), Long.valueOf(args.a()), args.h(), m.e.a.f35379b);
    }

    public final InterfaceC3813L d() {
        return this.f25174i;
    }

    public final boolean e() {
        return AbstractC3292y.d(this.f25172g.get("has_launched"), Boolean.TRUE);
    }

    public final Object f(U5.d dVar) {
        return AbstractC3823h.w(this.f25171f.isReady(), dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(U5.d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.stripe.android.googlepaylauncher.l.d
            if (r0 == 0) goto L13
            r0 = r6
            com.stripe.android.googlepaylauncher.l$d r0 = (com.stripe.android.googlepaylauncher.l.d) r0
            int r1 = r0.f25184d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25184d = r1
            goto L18
        L13:
            com.stripe.android.googlepaylauncher.l$d r0 = new com.stripe.android.googlepaylauncher.l$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f25182b
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f25184d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            Q5.t.b(r6)
            goto L76
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.f25181a
            com.stripe.android.googlepaylauncher.l r2 = (com.stripe.android.googlepaylauncher.l) r2
            Q5.t.b(r6)
            goto L4b
        L3c:
            Q5.t.b(r6)
            r0.f25181a = r5
            r0.f25184d = r4
            java.lang.Object r6 = r5.f(r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            r2 = r5
        L4b:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L77
            r0.m r6 = r2.f25166a
            org.json.JSONObject r2 = r2.a()
            java.lang.String r2 = r2.toString()
            r0.j r2 = r0.C3872j.s(r2)
            com.google.android.gms.tasks.Task r6 = r6.t(r2)
            java.lang.String r2 = "loadPaymentData(...)"
            kotlin.jvm.internal.AbstractC3292y.h(r6, r2)
            r2 = 0
            r0.f25181a = r2
            r0.f25184d = r3
            java.lang.Object r6 = N2.h.b(r6, r2, r0, r4, r2)
            if (r6 != r1) goto L76
            return r1
        L76:
            return r6
        L77:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Google Pay is unavailable."
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.googlepaylauncher.l.g(U5.d):java.lang.Object");
    }

    public final void h(boolean z8) {
        this.f25172g.set("has_launched", Boolean.valueOf(z8));
    }

    public final void i(j.f result) {
        AbstractC3292y.i(result, "result");
        this.f25173h.setValue(result);
    }
}
