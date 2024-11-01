package com.stripe.android.paymentsheet.paymentdatacollection.polling;

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
import com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingContract;
import com.stripe.android.paymentsheet.paymentdatacollection.polling.b;
import k3.C3237c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.U;
import m6.AbstractC3376c;
import m6.C3374a;
import m6.EnumC3377d;
import n6.M;
import o4.AbstractC3539m;
import s4.AbstractC3966h;
import s4.C3965g;
import u2.AbstractC4074a;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class PollingActivity extends AppCompatActivity {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1416k f27565a = l.b(new a());

    /* renamed from: b, reason: collision with root package name */
    private ViewModelProvider.Factory f27566b = new b.f(new f());

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1416k f27567c = new ViewModelLazy(U.b(com.stripe.android.paymentsheet.paymentdatacollection.polling.b.class), new c(this), new e(), new d(null, this));

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PollingContract.a invoke() {
            PollingContract.a.C0641a c0641a = PollingContract.a.f27586g;
            Intent intent = PollingActivity.this.getIntent();
            AbstractC3292y.h(intent, "getIntent(...)");
            PollingContract.a a9 = c0641a.a(intent);
            if (a9 != null) {
                return a9;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3293z implements InterfaceC2072n {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3293z implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ PollingActivity f27570a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingActivity$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0639a extends AbstractC3293z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ PollingActivity f27571a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ State f27572b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0639a(PollingActivity pollingActivity, State state) {
                    super(0);
                    this.f27571a = pollingActivity;
                    this.f27572b = state;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m5514invoke();
                    return I.f8786a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m5514invoke() {
                    if (a.b(this.f27572b).e() == K3.e.f4626c) {
                        this.f27571a.p().k();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingActivity$b$a$b, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0640b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

                /* renamed from: a, reason: collision with root package name */
                Object f27573a;

                /* renamed from: b, reason: collision with root package name */
                int f27574b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ PollingActivity f27575c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ C3965g f27576d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ State f27577e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0640b(PollingActivity pollingActivity, C3965g c3965g, State state, U5.d dVar) {
                    super(2, dVar);
                    this.f27575c = pollingActivity;
                    this.f27576d = c3965g;
                    this.f27577e = state;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final U5.d create(Object obj, U5.d dVar) {
                    return new C0640b(this.f27575c, this.f27576d, this.f27577e, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    C3237c c3237c;
                    Object e8 = V5.b.e();
                    int i8 = this.f27574b;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            c3237c = (C3237c) this.f27573a;
                            t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        t.b(obj);
                        C3237c d8 = com.stripe.android.paymentsheet.paymentdatacollection.polling.c.d(a.b(this.f27577e).e(), this.f27575c.o());
                        if (d8 != null) {
                            C3965g c3965g = this.f27576d;
                            this.f27573a = d8;
                            this.f27574b = 1;
                            if (c3965g.c(this) == e8) {
                                return e8;
                            }
                            c3237c = d8;
                        }
                        return I.f8786a;
                    }
                    this.f27575c.n(c3237c);
                    return I.f8786a;
                }

                @Override // c6.InterfaceC2072n
                public final Object invoke(M m8, U5.d dVar) {
                    return ((C0640b) create(m8, dVar)).invokeSuspend(I.f8786a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes4.dex */
            public static final class c extends AbstractC3293z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                public static final c f27578a = new c();

                c() {
                    super(0);
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m5515invoke() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m5515invoke();
                    return I.f8786a;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes4.dex */
            public static final class d extends AbstractC3293z implements InterfaceC2072n {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ PollingActivity f27579a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(PollingActivity pollingActivity) {
                    super(2);
                    this.f27579a = pollingActivity;
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
                        ComposerKt.traceEventStart(-246136616, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (PollingActivity.kt:81)");
                    }
                    K3.d.d(this.f27579a.p(), null, composer, 8, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes4.dex */
            public static final class e extends AbstractC3293z implements Function1 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ State f27580a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                e(State state) {
                    super(1);
                    this.f27580a = state;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(ModalBottomSheetValue proposedValue) {
                    AbstractC3292y.i(proposedValue, "proposedValue");
                    boolean z8 = true;
                    if (proposedValue == ModalBottomSheetValue.Hidden && a.b(this.f27580a).e() == K3.e.f4624a) {
                        z8 = false;
                    }
                    return Boolean.valueOf(z8);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(PollingActivity pollingActivity) {
                super(2);
                this.f27570a = pollingActivity;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final K3.f b(State state) {
                return (K3.f) state.getValue();
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
                    ComposerKt.traceEventStart(1217612191, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingActivity.onCreate.<anonymous>.<anonymous> (PollingActivity.kt:49)");
                }
                State a9 = A4.f.a(this.f27570a.p().j(), composer, 8);
                composer.startReplaceableGroup(1911403227);
                boolean changed = composer.changed(a9);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new e(a9);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                C3965g b9 = AbstractC3966h.b(null, (Function1) rememberedValue, composer, 0, 1);
                BackHandlerKt.BackHandler(true, new C0639a(this.f27570a, a9), composer, 6, 0);
                EffectsKt.LaunchedEffect(b(a9).e(), new C0640b(this.f27570a, b9, a9, null), composer, 64);
                AbstractC4074a.a(b9, null, c.f27578a, ComposableLambdaKt.composableLambda(composer, -246136616, true, new d(this.f27570a)), composer, C3965g.f39091e | 3456, 2);
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
                ComposerKt.traceEventStart(-684927091, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingActivity.onCreate.<anonymous> (PollingActivity.kt:48)");
            }
            AbstractC3539m.a(null, null, null, ComposableLambdaKt.composableLambda(composer, 1217612191, true, new a(PollingActivity.this)), composer, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f27581a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f27581a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f27581a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f27582a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f27583b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f27582a = function0;
            this.f27583b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f27582a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f27583b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3293z implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return PollingActivity.this.q();
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3293z implements Function0 {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b.e invoke() {
            String d8 = PollingActivity.this.o().d();
            C3374a.C0804a c0804a = C3374a.f35036b;
            int h8 = PollingActivity.this.o().h();
            EnumC3377d enumC3377d = EnumC3377d.f35046e;
            return new b.e(d8, AbstractC3376c.s(h8, enumC3377d), AbstractC3376c.s(PollingActivity.this.o().b(), enumC3377d), PollingActivity.this.o().f(), PollingActivity.this.o().a(), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(C3237c c3237c) {
        setResult(-1, new Intent().putExtras(c3237c.u()));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PollingContract.a o() {
        return (PollingContract.a) this.f27565a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.stripe.android.paymentsheet.paymentdatacollection.polling.b p() {
        return (com.stripe.android.paymentsheet.paymentdatacollection.polling.b) this.f27567c.getValue();
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
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-684927091, true, new b()), 1, null);
    }

    public final ViewModelProvider.Factory q() {
        return this.f27566b;
    }
}
