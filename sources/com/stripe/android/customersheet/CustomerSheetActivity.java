package com.stripe.android.customersheet;

import Q5.I;
import Q5.InterfaceC1416k;
import Q5.l;
import Q5.t;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.compose.BackHandlerKt;
import androidx.activity.compose.ComponentActivityKt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.WindowCompat;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import c6.InterfaceC2072n;
import com.stripe.android.customersheet.CustomerSheetContract;
import com.stripe.android.customersheet.a;
import com.stripe.android.customersheet.b;
import com.stripe.android.customersheet.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.C3289v;
import kotlin.jvm.internal.U;
import n6.M;
import o4.AbstractC3539m;
import s4.AbstractC3966h;
import s4.C3965g;
import u2.AbstractC4074a;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class CustomerSheetActivity extends AppCompatActivity {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1416k f24760a = l.b(new a());

    /* renamed from: b, reason: collision with root package name */
    private Function0 f24761b = new f();

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1416k f24762c = new ViewModelLazy(U.b(com.stripe.android.customersheet.b.class), new c(this), new e(), new d(null, this));

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CustomerSheetContract.a invoke() {
            CustomerSheetContract.a.C0458a c0458a = CustomerSheetContract.a.f24782c;
            Intent intent = CustomerSheetActivity.this.getIntent();
            AbstractC3292y.h(intent, "getIntent(...)");
            return c0458a.a(intent);
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3293z implements InterfaceC2072n {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3293z implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CustomerSheetActivity f24765a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.customersheet.CustomerSheetActivity$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0454a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

                /* renamed from: a, reason: collision with root package name */
                Object f24766a;

                /* renamed from: b, reason: collision with root package name */
                Object f24767b;

                /* renamed from: c, reason: collision with root package name */
                int f24768c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ State f24769d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ C3965g f24770e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ CustomerSheetActivity f24771f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0454a(State state, C3965g c3965g, CustomerSheetActivity customerSheetActivity, U5.d dVar) {
                    super(2, dVar);
                    this.f24769d = state;
                    this.f24770e = c3965g;
                    this.f24771f = customerSheetActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final U5.d create(Object obj, U5.d dVar) {
                    return new C0454a(this.f24769d, this.f24770e, this.f24771f, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    com.stripe.android.customersheet.d dVar;
                    CustomerSheetActivity customerSheetActivity;
                    Object e8 = V5.b.e();
                    int i8 = this.f24768c;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            dVar = (com.stripe.android.customersheet.d) this.f24767b;
                            customerSheetActivity = (CustomerSheetActivity) this.f24766a;
                            t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        t.b(obj);
                        com.stripe.android.customersheet.d d8 = a.d(this.f24769d);
                        if (d8 != null) {
                            C3965g c3965g = this.f24770e;
                            CustomerSheetActivity customerSheetActivity2 = this.f24771f;
                            this.f24766a = customerSheetActivity2;
                            this.f24767b = d8;
                            this.f24768c = 1;
                            if (c3965g.c(this) == e8) {
                                return e8;
                            }
                            dVar = d8;
                            customerSheetActivity = customerSheetActivity2;
                        }
                        return I.f8786a;
                    }
                    customerSheetActivity.n(dVar);
                    return I.f8786a;
                }

                @Override // c6.InterfaceC2072n
                public final Object invoke(M m8, U5.d dVar) {
                    return ((C0454a) create(m8, dVar)).invokeSuspend(I.f8786a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.customersheet.CustomerSheetActivity$b$a$b, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0455b extends AbstractC3293z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ CustomerSheetActivity f24772a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0455b(CustomerSheetActivity customerSheetActivity) {
                    super(0);
                    this.f24772a = customerSheetActivity;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m5463invoke();
                    return I.f8786a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m5463invoke() {
                    this.f24772a.p().R(a.c.f24788a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes4.dex */
            public static final class c extends AbstractC3293z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ CustomerSheetActivity f24773a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(CustomerSheetActivity customerSheetActivity) {
                    super(0);
                    this.f24773a = customerSheetActivity;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m5464invoke();
                    return I.f8786a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m5464invoke() {
                    this.f24773a.p().R(a.h.f24794a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes4.dex */
            public static final class d extends AbstractC3293z implements InterfaceC2072n {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ CustomerSheetActivity f24774a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ State f24775b;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: com.stripe.android.customersheet.CustomerSheetActivity$b$a$d$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public /* synthetic */ class C0456a extends C3289v implements Function1 {
                    C0456a(Object obj) {
                        super(1, obj, com.stripe.android.customersheet.b.class, "handleViewAction", "handleViewAction(Lcom/stripe/android/customersheet/CustomerSheetViewAction;)V", 0);
                    }

                    public final void d(com.stripe.android.customersheet.a p02) {
                        AbstractC3292y.i(p02, "p0");
                        ((com.stripe.android.customersheet.b) this.receiver).R(p02);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        d((com.stripe.android.customersheet.a) obj);
                        return I.f8786a;
                    }
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: com.stripe.android.customersheet.CustomerSheetActivity$b$a$d$b, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public /* synthetic */ class C0457b extends C3289v implements Function1 {
                    C0457b(Object obj) {
                        super(1, obj, com.stripe.android.customersheet.b.class, "providePaymentMethodName", "providePaymentMethodName(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;", 0);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    /* renamed from: d, reason: merged with bridge method [inline-methods] */
                    public final C2.c invoke(String str) {
                        return ((com.stripe.android.customersheet.b) this.receiver).j0(str);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(CustomerSheetActivity customerSheetActivity, State state) {
                    super(2);
                    this.f24774a = customerSheetActivity;
                    this.f24775b = state;
                }

                @Override // c6.InterfaceC2072n
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return I.f8786a;
                }

                public final void invoke(Composer composer, int i8) {
                    if ((i8 & 11) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1927642793, i8, -1, "com.stripe.android.customersheet.CustomerSheetActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (CustomerSheetActivity.kt:97)");
                    }
                    J2.a.b(a.c(this.f24775b), false, null, new C0456a(this.f24774a.p()), new C0457b(this.f24774a.p()), composer, 0, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes4.dex */
            public static final class e extends AbstractC3293z implements Function1 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ CustomerSheetActivity f24776a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                e(CustomerSheetActivity customerSheetActivity) {
                    super(1);
                    this.f24776a = customerSheetActivity;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(ModalBottomSheetValue it) {
                    AbstractC3292y.i(it, "it");
                    return Boolean.valueOf(it == ModalBottomSheetValue.Hidden ? this.f24776a.p().G() : true);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(CustomerSheetActivity customerSheetActivity) {
                super(2);
                this.f24765a = customerSheetActivity;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final com.stripe.android.customersheet.c c(State state) {
                return (com.stripe.android.customersheet.c) state.getValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final com.stripe.android.customersheet.d d(State state) {
                return (com.stripe.android.customersheet.d) state.getValue();
            }

            @Override // c6.InterfaceC2072n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f8786a;
            }

            public final void invoke(Composer composer, int i8) {
                if ((i8 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-295136510, i8, -1, "com.stripe.android.customersheet.CustomerSheetActivity.onCreate.<anonymous>.<anonymous> (CustomerSheetActivity.kt:69)");
                }
                C3965g b9 = AbstractC3966h.b(null, new e(this.f24765a), composer, 0, 1);
                State a9 = A4.f.a(this.f24765a.p().O(), composer, 8);
                State a10 = A4.f.a(this.f24765a.p().N(), composer, 8);
                EffectsKt.LaunchedEffect(d(a10), new C0454a(a10, b9, this.f24765a, null), composer, 64);
                BackHandlerKt.BackHandler(false, new C0455b(this.f24765a), composer, 0, 1);
                AbstractC4074a.a(b9, null, new c(this.f24765a), ComposableLambdaKt.composableLambda(composer, 1927642793, true, new d(this.f24765a, a9)), composer, C3965g.f39091e | 3072, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        b() {
            super(2);
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(602239828, i8, -1, "com.stripe.android.customersheet.CustomerSheetActivity.onCreate.<anonymous> (CustomerSheetActivity.kt:68)");
            }
            AbstractC3539m.a(null, null, null, ComposableLambdaKt.composableLambda(composer, -295136510, true, new a(CustomerSheetActivity.this)), composer, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f24777a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f24777a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f24777a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f24778a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f24779b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f24778a = function0;
            this.f24779b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f24778a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f24779b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3293z implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return (ViewModelProvider.Factory) CustomerSheetActivity.this.q().invoke();
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3293z implements Function0 {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b.C2604g invoke() {
            CustomerSheetContract.a o8 = CustomerSheetActivity.this.o();
            AbstractC3292y.f(o8);
            return new b.C2604g(o8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(com.stripe.android.customersheet.d dVar) {
        setResult(-1, new Intent().putExtras(dVar.a()));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CustomerSheetContract.a o() {
        return (CustomerSheetContract.a) this.f24760a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.stripe.android.customersheet.b p() {
        return (com.stripe.android.customersheet.b) this.f24762c.getValue();
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        A4.c.a(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        if (o() == null) {
            n(new d.c(new IllegalStateException("No CustomerSheetContract.Args provided")));
        } else {
            p().k0(this, this);
            ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(602239828, true, new b()), 1, null);
        }
    }

    public final Function0 q() {
        return this.f24761b;
    }
}
