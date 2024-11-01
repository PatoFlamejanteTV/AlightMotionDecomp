package com.stripe.android.paymentsheet.addresselement;

import Q5.I;
import Q5.InterfaceC1416k;
import Q5.l;
import Q5.t;
import R5.AbstractC1435t;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.compose.BackHandlerKt;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.WindowCompat;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NamedNavArgumentKt;
import androidx.navigation.NavArgumentBuilder;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.NavType;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavGraphBuilderKt;
import androidx.navigation.compose.NavHostControllerKt;
import androidx.navigation.compose.NavHostKt;
import c6.InterfaceC2072n;
import c6.InterfaceC2074p;
import com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract;
import com.stripe.android.paymentsheet.addresselement.b;
import com.stripe.android.paymentsheet.addresselement.c;
import com.stripe.android.paymentsheet.w;
import com.stripe.android.paymentsheet.x;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.C3269a;
import kotlin.jvm.internal.U;
import n6.AbstractC3462k;
import n6.M;
import o4.AbstractC3539m;
import s4.AbstractC3966h;
import s4.C3965g;
import u2.AbstractC4074a;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class AddressElementActivity extends ComponentActivity {

    /* renamed from: a, reason: collision with root package name */
    private ViewModelProvider.Factory f26842a = new c.a(new f(), new g());

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1416k f26843b = new ViewModelLazy(U.b(com.stripe.android.paymentsheet.addresselement.c.class), new b(this), new e(), new c(null, this));

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1416k f26844c = l.b(new d());

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.paymentsheet.addresselement.AddressElementActivity$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0577a extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AddressElementActivity f26846a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0577a(AddressElementActivity addressElementActivity) {
                super(0);
                this.f26846a = addressElementActivity;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5494invoke();
                return I.f8786a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5494invoke() {
                this.f26846a.k().c().e();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ M f26847a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C3965g f26848b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AddressElementActivity f26849c;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.addresselement.AddressElementActivity$a$b$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0578a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

                /* renamed from: a, reason: collision with root package name */
                int f26850a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C3965g f26851b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ AddressElementActivity f26852c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ com.stripe.android.paymentsheet.addresselement.d f26853d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0578a(C3965g c3965g, AddressElementActivity addressElementActivity, com.stripe.android.paymentsheet.addresselement.d dVar, U5.d dVar2) {
                    super(2, dVar2);
                    this.f26851b = c3965g;
                    this.f26852c = addressElementActivity;
                    this.f26853d = dVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final U5.d create(Object obj, U5.d dVar) {
                    return new C0578a(this.f26851b, this.f26852c, this.f26853d, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = V5.b.e();
                    int i8 = this.f26850a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        t.b(obj);
                        C3965g c3965g = this.f26851b;
                        this.f26850a = 1;
                        if (c3965g.c(this) == e8) {
                            return e8;
                        }
                    }
                    this.f26852c.m(this.f26853d);
                    this.f26852c.finish();
                    return I.f8786a;
                }

                @Override // c6.InterfaceC2072n
                public final Object invoke(M m8, U5.d dVar) {
                    return ((C0578a) create(m8, dVar)).invokeSuspend(I.f8786a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(M m8, C3965g c3965g, AddressElementActivity addressElementActivity) {
                super(1);
                this.f26847a = m8;
                this.f26848b = c3965g;
                this.f26849c = addressElementActivity;
            }

            public final void a(com.stripe.android.paymentsheet.addresselement.d result) {
                AbstractC3292y.i(result, "result");
                AbstractC3462k.d(this.f26847a, null, null, new C0578a(this.f26848b, this.f26849c, result, null), 3, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((com.stripe.android.paymentsheet.addresselement.d) obj);
                return I.f8786a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class c extends AbstractC3293z implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C3965g f26854a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AddressElementActivity f26855b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ NavHostController f26856c;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.addresselement.AddressElementActivity$a$c$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public /* synthetic */ class C0579a extends C3269a implements Function0 {
                C0579a(Object obj) {
                    super(0, obj, com.stripe.android.paymentsheet.addresselement.a.class, "dismiss", "dismiss(Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;)V", 0);
                }

                public final void a() {
                    com.stripe.android.paymentsheet.addresselement.a.b((com.stripe.android.paymentsheet.addresselement.a) this.receiver, null, 1, null);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    a();
                    return I.f8786a;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes4.dex */
            public static final class b extends AbstractC3293z implements InterfaceC2072n {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ NavHostController f26857a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ AddressElementActivity f26858b;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: com.stripe.android.paymentsheet.addresselement.AddressElementActivity$a$c$b$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0580a extends AbstractC3293z implements InterfaceC2072n {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ NavHostController f26859a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ AddressElementActivity f26860b;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* renamed from: com.stripe.android.paymentsheet.addresselement.AddressElementActivity$a$c$b$a$a, reason: collision with other inner class name */
                    /* loaded from: classes4.dex */
                    public static final class C0581a extends AbstractC3293z implements Function1 {

                        /* renamed from: a, reason: collision with root package name */
                        final /* synthetic */ AddressElementActivity f26861a;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* renamed from: com.stripe.android.paymentsheet.addresselement.AddressElementActivity$a$c$b$a$a$a, reason: collision with other inner class name */
                        /* loaded from: classes4.dex */
                        public static final class C0582a extends AbstractC3293z implements InterfaceC2074p {

                            /* renamed from: a, reason: collision with root package name */
                            final /* synthetic */ AddressElementActivity f26862a;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C0582a(AddressElementActivity addressElementActivity) {
                                super(4);
                                this.f26862a = addressElementActivity;
                            }

                            @Override // c6.InterfaceC2074p
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                invoke((AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
                                return I.f8786a;
                            }

                            public final void invoke(AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i8) {
                                AbstractC3292y.i(composable, "$this$composable");
                                AbstractC3292y.i(it, "it");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(11906891, i8, -1, "com.stripe.android.paymentsheet.addresselement.AddressElementActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddressElementActivity.kt:81)");
                                }
                                i.a(this.f26862a.k().b(), composer, 8);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* renamed from: com.stripe.android.paymentsheet.addresselement.AddressElementActivity$a$c$b$a$a$b, reason: collision with other inner class name */
                        /* loaded from: classes4.dex */
                        public static final class C0583b extends AbstractC3293z implements Function1 {

                            /* renamed from: a, reason: collision with root package name */
                            public static final C0583b f26863a = new C0583b();

                            C0583b() {
                                super(1);
                            }

                            public final void a(NavArgumentBuilder navArgument) {
                                AbstractC3292y.i(navArgument, "$this$navArgument");
                                navArgument.setType(NavType.StringType);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                a((NavArgumentBuilder) obj);
                                return I.f8786a;
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* renamed from: com.stripe.android.paymentsheet.addresselement.AddressElementActivity$a$c$b$a$a$c, reason: collision with other inner class name */
                        /* loaded from: classes4.dex */
                        public static final class C0584c extends AbstractC3293z implements InterfaceC2074p {

                            /* renamed from: a, reason: collision with root package name */
                            final /* synthetic */ AddressElementActivity f26864a;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C0584c(AddressElementActivity addressElementActivity) {
                                super(4);
                                this.f26864a = addressElementActivity;
                            }

                            @Override // c6.InterfaceC2074p
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                invoke((AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
                                return I.f8786a;
                            }

                            public final void invoke(AnimatedContentScope composable, NavBackStackEntry backStackEntry, Composer composer, int i8) {
                                AbstractC3292y.i(composable, "$this$composable");
                                AbstractC3292y.i(backStackEntry, "backStackEntry");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1704615618, i8, -1, "com.stripe.android.paymentsheet.addresselement.AddressElementActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddressElementActivity.kt:91)");
                                }
                                Bundle arguments = backStackEntry.getArguments();
                                com.stripe.android.paymentsheet.addresselement.e.a(this.f26864a.k().a(), arguments != null ? arguments.getString("country") : null, composer, 8);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C0581a(AddressElementActivity addressElementActivity) {
                            super(1);
                            this.f26861a = addressElementActivity;
                        }

                        public final void a(NavGraphBuilder NavHost) {
                            AbstractC3292y.i(NavHost, "$this$NavHost");
                            NavGraphBuilderKt.composable$default(NavHost, b.C0588b.f26885b.a(), null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(11906891, true, new C0582a(this.f26861a)), 126, null);
                            NavGraphBuilderKt.composable$default(NavHost, "Autocomplete?country={country}", AbstractC1435t.e(NamedNavArgumentKt.navArgument("country", C0583b.f26863a)), null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(1704615618, true, new C0584c(this.f26861a)), 124, null);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            a((NavGraphBuilder) obj);
                            return I.f8786a;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0580a(NavHostController navHostController, AddressElementActivity addressElementActivity) {
                        super(2);
                        this.f26859a = navHostController;
                        this.f26860b = addressElementActivity;
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
                            ComposerKt.traceEventStart(-1329641751, i8, -1, "com.stripe.android.paymentsheet.addresselement.AddressElementActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddressElementActivity.kt:76)");
                        }
                        NavHostKt.NavHost(this.f26859a, b.C0588b.f26885b.a(), null, null, null, null, null, null, null, new C0581a(this.f26860b), composer, 8, TypedValues.PositionType.TYPE_CURVE_FIT);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(NavHostController navHostController, AddressElementActivity addressElementActivity) {
                    super(2);
                    this.f26857a = navHostController;
                    this.f26858b = addressElementActivity;
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
                        ComposerKt.traceEventStart(-665209427, i8, -1, "com.stripe.android.paymentsheet.addresselement.AddressElementActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (AddressElementActivity.kt:75)");
                    }
                    SurfaceKt.m1330SurfaceFjzlyU(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), null, 0L, 0L, null, 0.0f, ComposableLambdaKt.composableLambda(composer, -1329641751, true, new C0580a(this.f26857a, this.f26858b)), composer, 1572870, 62);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(C3965g c3965g, AddressElementActivity addressElementActivity, NavHostController navHostController) {
                super(2);
                this.f26854a = c3965g;
                this.f26855b = addressElementActivity;
                this.f26856c = navHostController;
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
                    ComposerKt.traceEventStart(1044576262, i8, -1, "com.stripe.android.paymentsheet.addresselement.AddressElementActivity.onCreate.<anonymous>.<anonymous> (AddressElementActivity.kt:71)");
                }
                AbstractC4074a.a(this.f26854a, null, new C0579a(this.f26855b.k().c()), ComposableLambdaKt.composableLambda(composer, -665209427, true, new b(this.f26856c, this.f26855b)), composer, C3965g.f39091e | 3072, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        a() {
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
                ComposerKt.traceEventStart(1953035352, i8, -1, "com.stripe.android.paymentsheet.addresselement.AddressElementActivity.onCreate.<anonymous> (AddressElementActivity.kt:51)");
            }
            composer.startReplaceableGroup(773894976);
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(U5.h.f10149a, composer));
                composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            composer.endReplaceableGroup();
            M coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            composer.endReplaceableGroup();
            NavHostController rememberNavController = NavHostControllerKt.rememberNavController(new Navigator[0], composer, 8);
            AddressElementActivity.this.k().c().f(rememberNavController);
            C3965g b9 = AbstractC3966h.b(null, null, composer, 0, 3);
            BackHandlerKt.BackHandler(false, new C0577a(AddressElementActivity.this), composer, 0, 1);
            AddressElementActivity.this.k().c().g(new b(coroutineScope, b9, AddressElementActivity.this));
            AbstractC3539m.a(null, null, null, ComposableLambdaKt.composableLambda(composer, 1044576262, true, new c(b9, AddressElementActivity.this, rememberNavController)), composer, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f26865a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f26865a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f26865a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f26866a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f26867b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f26866a = function0;
            this.f26867b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f26866a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f26867b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3293z implements Function0 {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AddressElementActivityContract.a invoke() {
            AddressElementActivityContract.a.C0585a c0585a = AddressElementActivityContract.a.f26873c;
            Intent intent = AddressElementActivity.this.getIntent();
            AbstractC3292y.h(intent, "getIntent(...)");
            AddressElementActivityContract.a a9 = c0585a.a(intent);
            if (a9 != null) {
                return a9;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3293z implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return AddressElementActivity.this.l();
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3293z implements Function0 {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Application invoke() {
            Application application = AddressElementActivity.this.getApplication();
            AbstractC3292y.h(application, "getApplication(...)");
            return application;
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends AbstractC3293z implements Function0 {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AddressElementActivityContract.a invoke() {
            return AddressElementActivity.this.j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AddressElementActivityContract.a j() {
        return (AddressElementActivityContract.a) this.f26844c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.stripe.android.paymentsheet.addresselement.c k() {
        return (com.stripe.android.paymentsheet.addresselement.c) this.f26843b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(com.stripe.android.paymentsheet.addresselement.d dVar) {
        setResult(dVar.a(), new Intent().putExtras(new AddressElementActivityContract.c(dVar).b()));
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        A4.c.a(this);
    }

    public final ViewModelProvider.Factory l() {
        return this.f26842a;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        w.b h8;
        super.onCreate(bundle);
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        w3.e a9 = j().a();
        if (a9 != null && (h8 = a9.h()) != null) {
            x.a(h8);
        }
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(1953035352, true, new a()), 1, null);
    }
}
