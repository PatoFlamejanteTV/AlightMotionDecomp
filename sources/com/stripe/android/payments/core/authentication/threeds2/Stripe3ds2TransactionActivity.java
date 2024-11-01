package com.stripe.android.payments.core.authentication.threeds2;

import Q5.I;
import Q5.InterfaceC1416k;
import Q5.l;
import Q5.s;
import Q5.t;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import c6.InterfaceC2072n;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import com.stripe.android.stripe3ds2.transaction.ChallengeContract;
import com.stripe.android.stripe3ds2.transaction.h;
import f4.C2856h;
import k3.C3237c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.U;
import n6.AbstractC3462k;
import n6.InterfaceC3488x0;
import n6.M;
import x2.k;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class Stripe3ds2TransactionActivity extends AppCompatActivity {

    /* renamed from: b, reason: collision with root package name */
    public Stripe3ds2TransactionContract.a f26392b;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1416k f26391a = l.b(new f());

    /* renamed from: c, reason: collision with root package name */
    private ViewModelProvider.Factory f26393c = new com.stripe.android.payments.core.authentication.threeds2.e(new g());

    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f26394a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ComponentActivity componentActivity) {
            super(0);
            this.f26394a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f26394a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f26395a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f26396b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f26395a = function0;
            this.f26396b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f26395a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f26396b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f26397a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ActivityResultLauncher f26399c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1 f26400d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ActivityResultLauncher f26401e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC1416k f26402f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ActivityResultLauncher activityResultLauncher, Function1 function1, ActivityResultLauncher activityResultLauncher2, InterfaceC1416k interfaceC1416k, U5.d dVar) {
            super(2, dVar);
            this.f26399c = activityResultLauncher;
            this.f26400d = function1;
            this.f26401e = activityResultLauncher2;
            this.f26402f = interfaceC1416k;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new c(this.f26399c, this.f26400d, this.f26401e, this.f26402f, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0059  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = V5.b.e()
                int r1 = r4.f26397a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                Q5.t.b(r5)
                goto L53
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                Q5.t.b(r5)
                goto L38
            L1e:
                Q5.t.b(r5)
                com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity r5 = com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity.this
                boolean r5 = r5.isFinishing()
                if (r5 != 0) goto L94
                Q5.k r5 = r4.f26402f
                com.stripe.android.payments.core.authentication.threeds2.d r5 = com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity.n(r5)
                r4.f26397a = r3
                java.lang.Object r5 = r5.m(r4)
                if (r5 != r0) goto L38
                return r0
            L38:
                com.stripe.android.payments.core.authentication.threeds2.a r5 = (com.stripe.android.payments.core.authentication.threeds2.a) r5
                boolean r1 = r5 instanceof com.stripe.android.payments.core.authentication.threeds2.a.b
                if (r1 == 0) goto L75
                Q5.k r1 = r4.f26402f
                com.stripe.android.payments.core.authentication.threeds2.d r1 = com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity.n(r1)
                com.stripe.android.payments.core.authentication.threeds2.a$b r5 = (com.stripe.android.payments.core.authentication.threeds2.a.b) r5
                c4.m r5 = r5.a()
                r4.f26397a = r2
                java.lang.Object r5 = r1.h(r5, r4)
                if (r5 != r0) goto L53
                return r0
            L53:
                com.stripe.android.stripe3ds2.transaction.m r5 = (com.stripe.android.stripe3ds2.transaction.m) r5
                boolean r0 = r5 instanceof com.stripe.android.stripe3ds2.transaction.m.c
                if (r0 == 0) goto L65
                androidx.activity.result.ActivityResultLauncher r0 = r4.f26399c
                com.stripe.android.stripe3ds2.transaction.m$c r5 = (com.stripe.android.stripe3ds2.transaction.m.c) r5
                com.stripe.android.stripe3ds2.views.d r5 = r5.a()
                r0.launch(r5)
                goto L94
            L65:
                boolean r0 = r5 instanceof com.stripe.android.stripe3ds2.transaction.m.b
                if (r0 == 0) goto L94
                kotlin.jvm.functions.Function1 r0 = r4.f26400d
                com.stripe.android.stripe3ds2.transaction.m$b r5 = (com.stripe.android.stripe3ds2.transaction.m.b) r5
                com.stripe.android.stripe3ds2.transaction.h r5 = r5.a()
                r0.invoke(r5)
                goto L94
            L75:
                boolean r0 = r5 instanceof com.stripe.android.payments.core.authentication.threeds2.a.c
                if (r0 == 0) goto L85
                androidx.activity.result.ActivityResultLauncher r0 = r4.f26401e
                com.stripe.android.payments.core.authentication.threeds2.a$c r5 = (com.stripe.android.payments.core.authentication.threeds2.a.c) r5
                com.stripe.android.auth.PaymentBrowserAuthContract$a r5 = r5.a()
                r0.launch(r5)
                goto L94
            L85:
                boolean r0 = r5 instanceof com.stripe.android.payments.core.authentication.threeds2.a.C0547a
                if (r0 == 0) goto L94
                com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity r0 = com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity.this
                com.stripe.android.payments.core.authentication.threeds2.a$a r5 = (com.stripe.android.payments.core.authentication.threeds2.a.C0547a) r5
                k3.c r5 = r5.a()
                com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity.m(r0, r5)
            L94:
                Q5.I r5 = Q5.I.f8786a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3293z implements Function1 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC1416k f26404b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            Object f26405a;

            /* renamed from: b, reason: collision with root package name */
            int f26406b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Stripe3ds2TransactionActivity f26407c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ h f26408d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC1416k f26409e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Stripe3ds2TransactionActivity stripe3ds2TransactionActivity, h hVar, InterfaceC1416k interfaceC1416k, U5.d dVar) {
                super(2, dVar);
                this.f26407c = stripe3ds2TransactionActivity;
                this.f26408d = hVar;
                this.f26409e = interfaceC1416k;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f26407c, this.f26408d, this.f26409e, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Stripe3ds2TransactionActivity stripe3ds2TransactionActivity;
                Object e8 = V5.b.e();
                int i8 = this.f26406b;
                if (i8 != 0) {
                    if (i8 == 1) {
                        stripe3ds2TransactionActivity = (Stripe3ds2TransactionActivity) this.f26405a;
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    Stripe3ds2TransactionActivity stripe3ds2TransactionActivity2 = this.f26407c;
                    com.stripe.android.payments.core.authentication.threeds2.d s8 = Stripe3ds2TransactionActivity.s(this.f26409e);
                    h hVar = this.f26408d;
                    this.f26405a = stripe3ds2TransactionActivity2;
                    this.f26406b = 1;
                    Object l8 = s8.l(hVar, this);
                    if (l8 == e8) {
                        return e8;
                    }
                    stripe3ds2TransactionActivity = stripe3ds2TransactionActivity2;
                    obj = l8;
                }
                stripe3ds2TransactionActivity.o((C3237c) obj);
                return I.f8786a;
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC1416k interfaceC1416k) {
            super(1);
            this.f26404b = interfaceC1416k;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3488x0 invoke(h challengeResult) {
            InterfaceC3488x0 d8;
            AbstractC3292y.i(challengeResult, "challengeResult");
            d8 = AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(Stripe3ds2TransactionActivity.this), null, null, new a(Stripe3ds2TransactionActivity.this, challengeResult, this.f26404b, null), 3, null);
            return d8;
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3293z implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return Stripe3ds2TransactionActivity.this.r();
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3293z implements Function0 {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final L2.a invoke() {
            L2.a c8 = L2.a.c(Stripe3ds2TransactionActivity.this.getLayoutInflater());
            AbstractC3292y.h(c8, "inflate(...)");
            return c8;
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends AbstractC3293z implements Function0 {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Stripe3ds2TransactionContract.a invoke() {
            return Stripe3ds2TransactionActivity.this.p();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(C3237c c3237c) {
        setResult(-1, new Intent().putExtras(c3237c.u()));
        finish();
    }

    private final L2.a q() {
        return (L2.a) this.f26391a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.stripe.android.payments.core.authentication.threeds2.d s(InterfaceC1416k interfaceC1416k) {
        return (com.stripe.android.payments.core.authentication.threeds2.d) interfaceC1416k.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(Function1 onChallengeResult, h hVar) {
        AbstractC3292y.i(onChallengeResult, "$onChallengeResult");
        AbstractC3292y.f(hVar);
        onChallengeResult.invoke(hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(Stripe3ds2TransactionActivity this$0, C3237c c3237c) {
        AbstractC3292y.i(this$0, "this$0");
        AbstractC3292y.f(c3237c);
        this$0.o(c3237c);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object b9;
        Stripe3ds2TransactionContract.a a9;
        Object b10;
        Integer num;
        try {
            s.a aVar = s.f8810b;
            Stripe3ds2TransactionContract.a.C0546a c0546a = Stripe3ds2TransactionContract.a.f26413j;
            Intent intent = getIntent();
            AbstractC3292y.h(intent, "getIntent(...)");
            a9 = c0546a.a(intent);
        } catch (Throwable th) {
            s.a aVar2 = s.f8810b;
            b9 = s.b(t.a(th));
        }
        if (a9 != null) {
            String h8 = a9.a().f().a().h();
            if (h8 != null) {
                try {
                    AbstractC3292y.f(h8);
                    b10 = s.b(Integer.valueOf(Color.parseColor(h8)));
                } catch (Throwable th2) {
                    s.a aVar3 = s.f8810b;
                    b10 = s.b(t.a(th2));
                }
                if (s.g(b10)) {
                    b10 = null;
                }
                num = (Integer) b10;
            } else {
                num = null;
            }
            getSupportFragmentManager().setFragmentFactory(new C2856h(a9.f().b(), a9.s(), num));
            b9 = s.b(a9);
            super.onCreate(bundle);
            Throwable e8 = s.e(b9);
            if (e8 == null) {
                v((Stripe3ds2TransactionContract.a) b9);
                setContentView(q().getRoot());
                Integer u8 = p().u();
                if (u8 != null) {
                    getWindow().setStatusBarColor(u8.intValue());
                }
                ViewModelLazy viewModelLazy = new ViewModelLazy(U.b(com.stripe.android.payments.core.authentication.threeds2.d.class), new a(this), new e(), new b(null, this));
                final d dVar = new d(viewModelLazy);
                ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ChallengeContract(), new ActivityResultCallback() { // from class: r3.e
                    @Override // androidx.activity.result.ActivityResultCallback
                    public final void onActivityResult(Object obj) {
                        Stripe3ds2TransactionActivity.t(Function1.this, (h) obj);
                    }
                });
                AbstractC3292y.h(registerForActivityResult, "registerForActivityResult(...)");
                ActivityResultLauncher registerForActivityResult2 = registerForActivityResult(new PaymentBrowserAuthContract(), new ActivityResultCallback() { // from class: r3.f
                    @Override // androidx.activity.result.ActivityResultCallback
                    public final void onActivityResult(Object obj) {
                        Stripe3ds2TransactionActivity.u(Stripe3ds2TransactionActivity.this, (C3237c) obj);
                    }
                });
                AbstractC3292y.h(registerForActivityResult2, "registerForActivityResult(...)");
                if (!s(viewModelLazy).f()) {
                    LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new c(registerForActivityResult, dVar, registerForActivityResult2, viewModelLazy, null));
                    return;
                }
                return;
            }
            o(new C3237c(null, 2, k.f40948e.b(e8), false, null, null, null, 121, null));
            return;
        }
        throw new IllegalArgumentException("Error while attempting to initiate 3DS2 transaction.".toString());
    }

    public final Stripe3ds2TransactionContract.a p() {
        Stripe3ds2TransactionContract.a aVar = this.f26392b;
        if (aVar != null) {
            return aVar;
        }
        AbstractC3292y.y("args");
        return null;
    }

    public final ViewModelProvider.Factory r() {
        return this.f26393c;
    }

    public final void v(Stripe3ds2TransactionContract.a aVar) {
        AbstractC3292y.i(aVar, "<set-?>");
        this.f26392b = aVar;
    }
}
