package com.stripe.android.paymentsheet.paymentdatacollection.bacs;

import O3.E;
import O3.F;
import O3.G;
import Q5.I;
import Q5.InterfaceC1416k;
import Q5.l;
import Q5.t;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.activity.compose.ComponentActivityKt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.WindowCompat;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import c6.InterfaceC2072n;
import com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationContract;
import com.stripe.android.paymentsheet.paymentdatacollection.bacs.c;
import com.stripe.android.paymentsheet.paymentdatacollection.bacs.d;
import com.stripe.android.paymentsheet.paymentdatacollection.bacs.e;
import com.stripe.android.paymentsheet.x;
import g4.n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.U;
import n6.M;
import o4.AbstractC3539m;
import q6.AbstractC3823h;
import q6.InterfaceC3802A;
import s4.AbstractC3966h;
import s4.C3965g;
import u2.AbstractC4074a;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class BacsMandateConfirmationActivity extends AppCompatActivity {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1416k f27400a = l.b(new e());

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1416k f27401b = new ViewModelLazy(U.b(com.stripe.android.paymentsheet.paymentdatacollection.bacs.e.class), new c(this), new f(), new d(null, this));

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements Function1 {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((OnBackPressedCallback) obj);
            return I.f8786a;
        }

        public final void invoke(OnBackPressedCallback addCallback) {
            AbstractC3292y.i(addCallback, "$this$addCallback");
            BacsMandateConfirmationActivity.this.n().g(d.a.f27462a);
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3293z implements InterfaceC2072n {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3293z implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ BacsMandateConfirmationActivity f27404a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0615a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

                /* renamed from: a, reason: collision with root package name */
                int f27405a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ BacsMandateConfirmationActivity f27406b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C3965g f27407c;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity$b$a$a$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0616a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

                    /* renamed from: a, reason: collision with root package name */
                    int f27408a;

                    /* renamed from: b, reason: collision with root package name */
                    /* synthetic */ Object f27409b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ BacsMandateConfirmationActivity f27410c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ C3965g f27411d;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0616a(BacsMandateConfirmationActivity bacsMandateConfirmationActivity, C3965g c3965g, U5.d dVar) {
                        super(2, dVar);
                        this.f27410c = bacsMandateConfirmationActivity;
                        this.f27411d = c3965g;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final U5.d create(Object obj, U5.d dVar) {
                        C0616a c0616a = new C0616a(this.f27410c, this.f27411d, dVar);
                        c0616a.f27409b = obj;
                        return c0616a;
                    }

                    @Override // c6.InterfaceC2072n
                    /* renamed from: i, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(com.stripe.android.paymentsheet.paymentdatacollection.bacs.c cVar, U5.d dVar) {
                        return ((C0616a) create(cVar, dVar)).invokeSuspend(I.f8786a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        Object e8 = V5.b.e();
                        int i8 = this.f27408a;
                        if (i8 != 0) {
                            if (i8 == 1) {
                                t.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            t.b(obj);
                            com.stripe.android.paymentsheet.paymentdatacollection.bacs.c cVar = (com.stripe.android.paymentsheet.paymentdatacollection.bacs.c) this.f27409b;
                            BacsMandateConfirmationActivity bacsMandateConfirmationActivity = this.f27410c;
                            c.b bVar = com.stripe.android.paymentsheet.paymentdatacollection.bacs.c.f27457j0;
                            Intent intent = bacsMandateConfirmationActivity.getIntent();
                            AbstractC3292y.h(intent, "getIntent(...)");
                            bacsMandateConfirmationActivity.setResult(-1, bVar.b(intent, cVar));
                            C3965g c3965g = this.f27411d;
                            this.f27408a = 1;
                            if (c3965g.c(this) == e8) {
                                return e8;
                            }
                        }
                        this.f27410c.finish();
                        return I.f8786a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0615a(BacsMandateConfirmationActivity bacsMandateConfirmationActivity, C3965g c3965g, U5.d dVar) {
                    super(2, dVar);
                    this.f27406b = bacsMandateConfirmationActivity;
                    this.f27407c = c3965g;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final U5.d create(Object obj, U5.d dVar) {
                    return new C0615a(this.f27406b, this.f27407c, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = V5.b.e();
                    int i8 = this.f27405a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        t.b(obj);
                        InterfaceC3802A e9 = this.f27406b.n().e();
                        C0616a c0616a = new C0616a(this.f27406b, this.f27407c, null);
                        this.f27405a = 1;
                        if (AbstractC3823h.j(e9, c0616a, this) == e8) {
                            return e8;
                        }
                    }
                    return I.f8786a;
                }

                @Override // c6.InterfaceC2072n
                public final Object invoke(M m8, U5.d dVar) {
                    return ((C0615a) create(m8, dVar)).invokeSuspend(I.f8786a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity$b$a$b, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0617b extends AbstractC3293z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ BacsMandateConfirmationActivity f27412a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0617b(BacsMandateConfirmationActivity bacsMandateConfirmationActivity) {
                    super(0);
                    this.f27412a = bacsMandateConfirmationActivity;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m5504invoke();
                    return I.f8786a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m5504invoke() {
                    this.f27412a.n().g(d.a.f27462a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes4.dex */
            public static final class c extends AbstractC3293z implements InterfaceC2072n {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ BacsMandateConfirmationActivity f27413a;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity$b$a$c$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0618a extends AbstractC3293z implements InterfaceC2072n {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ BacsMandateConfirmationActivity f27414a;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity$b$a$c$a$a, reason: collision with other inner class name */
                    /* loaded from: classes4.dex */
                    public static final class C0619a extends AbstractC3293z implements Function0 {

                        /* renamed from: a, reason: collision with root package name */
                        public static final C0619a f27415a = new C0619a();

                        C0619a() {
                            super(0);
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m5505invoke() {
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m5505invoke();
                            return I.f8786a;
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity$b$a$c$a$b, reason: collision with other inner class name */
                    /* loaded from: classes4.dex */
                    public static final class C0620b extends AbstractC3293z implements Function0 {

                        /* renamed from: a, reason: collision with root package name */
                        final /* synthetic */ BacsMandateConfirmationActivity f27416a;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C0620b(BacsMandateConfirmationActivity bacsMandateConfirmationActivity) {
                            super(0);
                            this.f27416a = bacsMandateConfirmationActivity;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m5506invoke();
                            return I.f8786a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m5506invoke() {
                            this.f27416a.n().g(d.a.f27462a);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0618a(BacsMandateConfirmationActivity bacsMandateConfirmationActivity) {
                        super(2);
                        this.f27414a = bacsMandateConfirmationActivity;
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
                            ComposerKt.traceEventStart(544780398, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BacsMandateConfirmationActivity.kt:69)");
                        }
                        F.b(new G(v3.t.f40563r, n.f32394c, false, false, false, C0619a.f27415a), true, new C0620b(this.f27414a), 0.0f, composer, 48, 8);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity$b$a$c$b, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0621b extends AbstractC3293z implements InterfaceC2072n {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ BacsMandateConfirmationActivity f27417a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0621b(BacsMandateConfirmationActivity bacsMandateConfirmationActivity) {
                        super(2);
                        this.f27417a = bacsMandateConfirmationActivity;
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
                            ComposerKt.traceEventStart(405994991, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BacsMandateConfirmationActivity.kt:85)");
                        }
                        com.stripe.android.paymentsheet.paymentdatacollection.bacs.a.a(this.f27417a.n(), composer, 8, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(BacsMandateConfirmationActivity bacsMandateConfirmationActivity) {
                    super(2);
                    this.f27413a = bacsMandateConfirmationActivity;
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
                        ComposerKt.traceEventStart(-1540472878, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (BacsMandateConfirmationActivity.kt:67)");
                    }
                    E.a(ComposableLambdaKt.composableLambda(composer, 544780398, true, new C0618a(this.f27413a)), ComposableLambdaKt.composableLambda(composer, 405994991, true, new C0621b(this.f27413a)), null, composer, 54, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(BacsMandateConfirmationActivity bacsMandateConfirmationActivity) {
                super(2);
                this.f27404a = bacsMandateConfirmationActivity;
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
                    ComposerKt.traceEventStart(-723148693, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity.onCreate.<anonymous>.<anonymous> (BacsMandateConfirmationActivity.kt:50)");
                }
                C3965g b9 = AbstractC3966h.b(null, null, composer, 0, 3);
                C0615a c0615a = new C0615a(this.f27404a, b9, null);
                int i9 = C3965g.f39091e;
                EffectsKt.LaunchedEffect(b9, c0615a, composer, i9 | 64);
                AbstractC4074a.a(b9, null, new C0617b(this.f27404a), ComposableLambdaKt.composableLambda(composer, -1540472878, true, new c(this.f27404a)), composer, i9 | 3072, 2);
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
                ComposerKt.traceEventStart(1408942397, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity.onCreate.<anonymous> (BacsMandateConfirmationActivity.kt:49)");
            }
            AbstractC3539m.a(null, null, null, ComposableLambdaKt.composableLambda(composer, -723148693, true, new a(BacsMandateConfirmationActivity.this)), composer, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f27418a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f27418a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f27418a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f27419a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f27420b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f27419a = function0;
            this.f27420b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f27419a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f27420b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3293z implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BacsMandateConfirmationContract.a invoke() {
            BacsMandateConfirmationContract.a.C0622a c0622a = BacsMandateConfirmationContract.a.f27424f;
            Intent intent = BacsMandateConfirmationActivity.this.getIntent();
            AbstractC3292y.h(intent, "getIntent(...)");
            BacsMandateConfirmationContract.a a9 = c0622a.a(intent);
            if (a9 != null) {
                return a9;
            }
            throw new IllegalStateException("Cannot start Bacs mandate confirmation flow without arguments");
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3293z implements Function0 {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return new e.b(BacsMandateConfirmationActivity.this.m());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BacsMandateConfirmationContract.a m() {
        return (BacsMandateConfirmationContract.a) this.f27400a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.stripe.android.paymentsheet.paymentdatacollection.bacs.e n() {
        return (com.stripe.android.paymentsheet.paymentdatacollection.bacs.e) this.f27401b.getValue();
    }

    private final void o() {
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
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
        o();
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        AbstractC3292y.h(onBackPressedDispatcher, "<get-onBackPressedDispatcher>(...)");
        OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, null, false, new a(), 3, null);
        x.a(m().b());
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(1408942397, true, new b()), 1, null);
    }
}
