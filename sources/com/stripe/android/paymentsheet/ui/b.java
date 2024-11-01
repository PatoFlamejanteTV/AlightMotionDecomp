package com.stripe.android.paymentsheet.ui;

import D3.h;
import E3.c;
import N3.m;
import O3.AbstractC1368p;
import O3.AbstractC1370s;
import O3.C1359g;
import O3.D;
import O3.E;
import O3.F;
import O3.G;
import Q5.C1413h;
import Q5.I;
import Q5.InterfaceC1412g;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.viewinterop.AndroidViewBindingKt;
import androidx.profileinstaller.ProfileVerifier;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import com.stripe.android.paymentsheet.A;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import j4.AbstractC3183h0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.C3289v;
import kotlin.jvm.internal.InterfaceC3286s;
import m4.AbstractC3371b;
import m4.InterfaceC3370a;
import n2.m;
import n6.AbstractC3458i;
import n6.C3445b0;
import n6.M;
import o4.AbstractC3539m;
import o4.C3529c;
import o4.C3537k;
import q6.InterfaceC3813L;
import q6.InterfaceC3822g;
import r4.C0;
import y4.AbstractC4246a;

/* loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f27734a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextInputService f27735b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(TextInputService textInputService, U5.d dVar) {
            super(2, dVar);
            this.f27735b = textInputService;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new a(this.f27735b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f27734a == 0) {
                Q5.t.b(obj);
                TextInputService textInputService = this.f27735b;
                if (textInputService != null) {
                    textInputService.hideSoftwareKeyboard();
                }
                return I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.paymentsheet.ui.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0655b extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f27736a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f27737b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0655b(boolean z8, int i8) {
            super(2);
            this.f27736a = z8;
            this.f27737b = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            b.a(this.f27736a, composer, RecomposeScopeImplKt.updateChangedFlags(this.f27737b | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class c extends C3289v implements Function1 {
        c(Object obj) {
            super(1, obj, EventReporter.class, "onAutofill", "onAutofill(Ljava/lang/String;)V", 0);
        }

        public final void d(String p02) {
            AbstractC3292y.i(p02, "p0");
            ((EventReporter) this.receiver).f(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            d((String) obj);
            return I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class d implements InterfaceC3370a, InterfaceC3286s {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ EventReporter f27738a;

        d(EventReporter eventReporter) {
            this.f27738a = eventReporter;
        }

        @Override // m4.InterfaceC3370a
        public final void a() {
            this.f27738a.a();
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC3370a) && (obj instanceof InterfaceC3286s)) {
                return AbstractC3292y.d(getFunctionDelegate(), ((InterfaceC3286s) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC3286s
        public final InterfaceC1412g getFunctionDelegate() {
            return new C3289v(0, this.f27738a, EventReporter.class, "onCardNumberCompleted", "onCardNumberCompleted()V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f27739a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(InterfaceC2072n interfaceC2072n) {
            super(2);
            this.f27739a = interfaceC2072n;
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
                ComposerKt.traceEventStart(-878864117, i8, -1, "com.stripe.android.paymentsheet.ui.EventReporterProvider.<anonymous> (PaymentSheetScreen.kt:418)");
            }
            this.f27739a.invoke(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ R3.a f27740a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f27741b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f27742c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(R3.a aVar, InterfaceC2072n interfaceC2072n, int i8) {
            super(2);
            this.f27740a = aVar;
            this.f27741b = interfaceC2072n;
            this.f27742c = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            b.b(this.f27740a, this.f27741b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f27742c | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ R3.a f27743a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2.c f27744b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ N3.n f27745c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ N3.m f27746d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C2.c f27747e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ E3.c f27748f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ D3.d f27749g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f27750h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(R3.a aVar, C2.c cVar, N3.n nVar, N3.m mVar, C2.c cVar2, E3.c cVar3, D3.d dVar, int i8) {
            super(2);
            this.f27743a = aVar;
            this.f27744b = cVar;
            this.f27745c = nVar;
            this.f27746d = mVar;
            this.f27747e = cVar2;
            this.f27748f = cVar3;
            this.f27749g = dVar;
            this.f27750h = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            b.c(this.f27743a, this.f27744b, this.f27745c, this.f27746d, this.f27747e, this.f27748f, this.f27749g, composer, RecomposeScopeImplKt.updateChangedFlags(this.f27750h | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ E3.c f27751a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(E3.c cVar) {
            super(2);
            this.f27751a = cVar;
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
                ComposerKt.traceEventStart(-134733669, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetContent.<anonymous>.<anonymous>.<anonymous> (PaymentSheetScreen.kt:314)");
            }
            this.f27751a.h(PaddingKt.m581paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, Dp.m5155constructorimpl(8), 7, null), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ R3.a f27752a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2.c f27753b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ N3.n f27754c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ N3.m f27755d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C2.c f27756e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ E3.c f27757f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ D3.d f27758g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Modifier f27759h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f27760i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(R3.a aVar, C2.c cVar, N3.n nVar, N3.m mVar, C2.c cVar2, E3.c cVar3, D3.d dVar, Modifier modifier, int i8) {
            super(2);
            this.f27752a = aVar;
            this.f27753b = cVar;
            this.f27754c = nVar;
            this.f27755d = mVar;
            this.f27756e = cVar2;
            this.f27757f = cVar3;
            this.f27758g = dVar;
            this.f27759h = modifier;
            this.f27760i = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            b.d(this.f27752a, this.f27753b, this.f27754c, this.f27755d, this.f27756e, this.f27757f, this.f27758g, this.f27759h, composer, RecomposeScopeImplKt.updateChangedFlags(this.f27760i | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ State f27761a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ A f27762b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3293z implements InterfaceC2073o {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ A f27763a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(A a9) {
                super(3);
                this.f27763a = a9;
            }

            @Override // c6.InterfaceC2073o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                return I.f8786a;
            }

            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i8) {
                AbstractC3292y.i(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1471340973, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetScreen.<anonymous>.<anonymous> (PaymentSheetScreen.kt:83)");
                }
                b.n(this.f27763a, D.f7152a, null, composer, 56, 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(State state, A a9) {
            super(2);
            this.f27761a = state;
            this.f27762b = a9;
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
                ComposerKt.traceEventStart(358620885, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetScreen.<anonymous> (PaymentSheetScreen.kt:82)");
            }
            AnimatedVisibilityKt.AnimatedVisibility(b.i(this.f27761a), (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composer, 1471340973, true, new a(this.f27762b)), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ R3.a f27764a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f27765b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f27766c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f27767d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f27768e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(R3.a aVar, boolean z8, InterfaceC2072n interfaceC2072n, int i8, int i9) {
            super(2);
            this.f27764a = aVar;
            this.f27765b = z8;
            this.f27766c = interfaceC2072n;
            this.f27767d = i8;
            this.f27768e = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            b.f(this.f27764a, this.f27765b, this.f27766c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f27767d | 1), this.f27768e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ A f27769a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f27770b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(A a9, int i8) {
            super(2);
            this.f27769a = a9;
            this.f27770b = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            b.h(this.f27769a, composer, RecomposeScopeImplKt.updateChangedFlags(this.f27770b | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class m extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.v f27771a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(com.stripe.android.paymentsheet.v vVar) {
            super(2);
            this.f27771a = vVar;
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
                ComposerKt.traceEventStart(-314837676, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetScreen.<anonymous> (PaymentSheetScreen.kt:93)");
            }
            b.n(this.f27771a, D.f7153b, null, composer, 56, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class n extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.v f27772a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f27773b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(com.stripe.android.paymentsheet.v vVar, int i8) {
            super(2);
            this.f27772a = vVar;
            this.f27773b = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            b.g(this.f27772a, composer, RecomposeScopeImplKt.updateChangedFlags(this.f27773b | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class o extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ R3.a f27774a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ State f27775b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public /* synthetic */ class a extends C3289v implements Function0 {
            a(Object obj) {
                super(0, obj, R3.a.class, "handleBackPressed", "handleBackPressed()V", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5522invoke();
                return I.f8786a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5522invoke() {
                ((R3.a) this.receiver).C();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(R3.a aVar, State state) {
            super(2);
            this.f27774a = aVar;
            this.f27775b = state;
        }

        private static final E3.c a(State state) {
            return (E3.c) state.getValue();
        }

        private static final G b(State state) {
            return (G) state.getValue();
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
                ComposerKt.traceEventStart(589949448, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetScreen.<anonymous> (PaymentSheetScreen.kt:124)");
            }
            State a9 = A4.f.a(this.f27774a.r().f(), composer, 8);
            E3.c a10 = a(a9);
            composer.startReplaceableGroup(-1096704433);
            boolean changed = composer.changed(a10);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = a(a9).p();
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            F.b(b(A4.f.a((InterfaceC3813L) rememberedValue, composer, 8)), !b.j(this.f27775b), new a(this.f27774a), 0.0f, composer, 0, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class p extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Density f27776a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MutableState f27777b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(Density density, MutableState mutableState) {
            super(1);
            this.f27776a = density;
            this.f27777b = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((LayoutCoordinates) obj);
            return I.f8786a;
        }

        public final void invoke(LayoutCoordinates it) {
            AbstractC3292y.i(it, "it");
            b.m(this.f27777b, this.f27776a.mo422toDpu2uoSUM(IntSize.m5320getHeightimpl(it.mo4115getSizeYbymL2g())));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class q extends AbstractC3293z implements InterfaceC2073o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MutableState f27778a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ State f27779b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(MutableState mutableState, State state) {
            super(3);
            this.f27778a = mutableState;
            this.f27779b = state;
        }

        @Override // c6.InterfaceC2073o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f8786a;
        }

        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i8) {
            AbstractC3292y.i(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1377730228, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetScreen.<anonymous> (PaymentSheetScreen.kt:148)");
            }
            Alignment center = Alignment.Companion.getCenter();
            Modifier m259backgroundbw27NRU$default = BackgroundKt.m259backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(SizeKt.m613requiredHeight3ABfNKs(Modifier.Companion, b.l(this.f27778a)), 0.0f, 1, null), Color.m2947copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m1159getSurface0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
            State state = this.f27779b;
            composer.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer, 6);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 constructor = companion.getConstructor();
            InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m259backgroundbw27NRU$default);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m2473constructorimpl = Updater.m2473constructorimpl(composer);
            Updater.m2480setimpl(m2473constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            InterfaceC2072n setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            b.y(BoxScopeInstance.INSTANCE, b.k(state), composer, 6);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class r extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ R3.a f27780a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ D f27781b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f27782c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f27783d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f27784e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(R3.a aVar, D d8, Modifier modifier, int i8, int i9) {
            super(2);
            this.f27780a = aVar;
            this.f27781b = d8;
            this.f27782c = modifier;
            this.f27783d = i8;
            this.f27784e = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            b.n(this.f27780a, this.f27781b, this.f27782c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f27783d | 1), this.f27784e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class s extends AbstractC3293z implements InterfaceC2073o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ R3.a f27785a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f27786b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MutableState f27787c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(R3.a aVar, Context context, MutableState mutableState) {
            super(3);
            this.f27785a = aVar;
            this.f27786b = context;
            this.f27787c = mutableState;
        }

        public final A3.a a(LayoutInflater inflater, ViewGroup parent, boolean z8) {
            AbstractC3292y.i(inflater, "inflater");
            AbstractC3292y.i(parent, "parent");
            A3.a c8 = A3.a.c(inflater, parent, z8);
            AbstractC3292y.h(c8, "inflate(...)");
            PrimaryButton primaryButton = c8.f153b;
            AbstractC3292y.h(primaryButton, "primaryButton");
            b.x(this.f27787c, primaryButton);
            C3537k c3537k = C3537k.f35998a;
            C3529c b9 = c3537k.b();
            ColorStateList z9 = this.f27785a.f().z();
            if (z9 == null) {
                z9 = ColorStateList.valueOf(AbstractC3539m.d(c3537k.b(), this.f27786b));
                AbstractC3292y.h(z9, "valueOf(...)");
            }
            primaryButton.g(b9, z9);
            return c8;
        }

        @Override // c6.InterfaceC2073o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class t extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f27788a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ R3.a f27789b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MutableState f27790c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ MutableState f27791a;

            a(MutableState mutableState) {
                this.f27791a = mutableState;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(PrimaryButton.b bVar, U5.d dVar) {
                PrimaryButton w8 = b.w(this.f27791a);
                if (w8 != null) {
                    w8.j(bVar);
                }
                return I.f8786a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(R3.a aVar, MutableState mutableState, U5.d dVar) {
            super(2, dVar);
            this.f27789b = aVar;
            this.f27790c = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new t(this.f27789b, this.f27790c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f27788a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L u8 = this.f27789b.u();
                a aVar = new a(this.f27790c);
                this.f27788a = 1;
                if (u8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1413h();
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((t) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class u extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f27792a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ R3.a f27793b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MutableState f27794c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ MutableState f27795a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.ui.b$u$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0656a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

                /* renamed from: a, reason: collision with root package name */
                int f27796a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ D3.h f27797b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ MutableState f27798c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0656a(D3.h hVar, MutableState mutableState, U5.d dVar) {
                    super(2, dVar);
                    this.f27797b = hVar;
                    this.f27798c = mutableState;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final U5.d create(Object obj, U5.d dVar) {
                    return new C0656a(this.f27797b, this.f27798c, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    PrimaryButton.a aVar;
                    V5.b.e();
                    if (this.f27796a == 0) {
                        Q5.t.b(obj);
                        PrimaryButton w8 = b.w(this.f27798c);
                        if (w8 != null) {
                            D3.h hVar = this.f27797b;
                            if (hVar != null) {
                                aVar = b.O(hVar);
                            } else {
                                aVar = null;
                            }
                            w8.i(aVar);
                        }
                        return I.f8786a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // c6.InterfaceC2072n
                public final Object invoke(M m8, U5.d dVar) {
                    return ((C0656a) create(m8, dVar)).invokeSuspend(I.f8786a);
                }
            }

            a(MutableState mutableState) {
                this.f27795a = mutableState;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(D3.h hVar, U5.d dVar) {
                Object g8 = AbstractC3458i.g(C3445b0.c(), new C0656a(hVar, this.f27795a, null), dVar);
                if (g8 == V5.b.e()) {
                    return g8;
                }
                return I.f8786a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(R3.a aVar, MutableState mutableState, U5.d dVar) {
            super(2, dVar);
            this.f27793b = aVar;
            this.f27794c = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new u(this.f27793b, this.f27794c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            A a9;
            InterfaceC3813L m02;
            Object e8 = V5.b.e();
            int i8 = this.f27792a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                R3.a aVar = this.f27793b;
                if (aVar instanceof A) {
                    a9 = (A) aVar;
                } else {
                    a9 = null;
                }
                if (a9 != null && (m02 = a9.m0()) != null) {
                    a aVar2 = new a(this.f27794c);
                    this.f27792a = 1;
                    if (m02.collect(aVar2, this) == e8) {
                        return e8;
                    }
                } else {
                    return I.f8786a;
                }
            }
            throw new C1413h();
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((u) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class v extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ R3.a f27799a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f27800b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(R3.a aVar, int i8) {
            super(2);
            this.f27799a = aVar;
            this.f27800b = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            b.v(this.f27799a, composer, RecomposeScopeImplKt.updateChangedFlags(this.f27800b | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class w extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ State f27801a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(State state) {
            super(1);
            this.f27801a = state;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SemanticsPropertyReceiver) obj);
            return I.f8786a;
        }

        public final void invoke(SemanticsPropertyReceiver semantics) {
            AbstractC3292y.i(semantics, "$this$semantics");
            SemanticsPropertiesKt.m4516setRolekuIjeqM(semantics, Role.Companion.m4500getButtono7Vup1c());
            PrimaryButton.b bVar = (PrimaryButton.b) this.f27801a.getValue();
            if (bVar == null || !bVar.c()) {
                SemanticsPropertiesKt.disabled(semantics);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class x extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ BoxScope f27802a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ N3.m f27803b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f27804c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(BoxScope boxScope, N3.m mVar, int i8) {
            super(2);
            this.f27802a = boxScope;
            this.f27803b = mVar;
            this.f27804c = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            b.y(this.f27802a, this.f27803b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f27804c | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class y extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ N3.n f27805a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ N3.m f27806b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f27807c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0 f27808d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f27809e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f27810f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f27811g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f27812h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(N3.n nVar, N3.m mVar, Function0 function0, Function0 function02, float f8, Modifier modifier, int i8, int i9) {
            super(2);
            this.f27805a = nVar;
            this.f27806b = mVar;
            this.f27807c = function0;
            this.f27808d = function02;
            this.f27809e = f8;
            this.f27810f = modifier;
            this.f27811g = i8;
            this.f27812h = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            b.z(this.f27805a, this.f27806b, this.f27807c, this.f27808d, this.f27809e, this.f27810f, composer, RecomposeScopeImplKt.updateChangedFlags(this.f27811g | 1), this.f27812h);
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class z {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27813a;

        static {
            int[] iArr = new int[c.EnumC0031c.values().length];
            try {
                iArr[c.EnumC0031c.f1615a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.EnumC0031c.f1616b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f27813a = iArr;
        }
    }

    public static final PrimaryButton.a O(D3.h hVar) {
        AbstractC3292y.i(hVar, "<this>");
        if (hVar instanceof h.b) {
            return PrimaryButton.a.b.f27693b;
        }
        if (hVar instanceof h.c) {
            return PrimaryButton.a.c.f27694b;
        }
        if (hVar instanceof h.a) {
            return new PrimaryButton.a.C0646a(((h.a) hVar).b());
        }
        throw new Q5.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(boolean z8, Composer composer, int i8) {
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(604260770);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(z8)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i9 = i10 | i8;
        } else {
            i9 = i8;
        }
        if ((i9 & 11) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(604260770, i9, -1, "com.stripe.android.paymentsheet.ui.DismissKeyboardOnProcessing (PaymentSheetScreen.kt:161)");
            }
            TextInputService textInputService = (TextInputService) startRestartGroup.consume(CompositionLocalsKt.getLocalTextInputService());
            if (z8) {
                EffectsKt.LaunchedEffect(I.f8786a, new a(textInputService, null), startRestartGroup, 70);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new C0655b(z8, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(R3.a aVar, InterfaceC2072n interfaceC2072n, Composer composer, int i8) {
        Composer startRestartGroup = composer.startRestartGroup(1299514443);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1299514443, i8, -1, "com.stripe.android.paymentsheet.ui.EventReporterProvider (PaymentSheetScreen.kt:413)");
        }
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{C0.E().provides(new c(aVar.n())), AbstractC3371b.a().provides(new d(aVar.n()))}, ComposableLambdaKt.composableLambda(startRestartGroup, -878864117, true, new e(interfaceC2072n)), startRestartGroup, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new f(aVar, interfaceC2072n, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(R3.a aVar, C2.c cVar, N3.n nVar, N3.m mVar, C2.c cVar2, E3.c cVar3, D3.d dVar, Composer composer, int i8) {
        Composer startRestartGroup = composer.startRestartGroup(-131118148);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-131118148, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetContent (PaymentSheetScreen.kt:250)");
        }
        int i9 = z.f27813a[cVar3.b().ordinal()];
        if (i9 != 1) {
            if (i9 != 2) {
                startRestartGroup.startReplaceableGroup(-830978982);
                startRestartGroup.endReplaceableGroup();
            } else {
                startRestartGroup.startReplaceableGroup(-831112747);
                Modifier.Companion companion = Modifier.Companion;
                Modifier animateContentSize$default = AnimationModifierKt.animateContentSize$default(companion, null, null, 3, null);
                startRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                Function0 constructor = companion2.getConstructor();
                InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(animateContentSize$default);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m2473constructorimpl = Updater.m2473constructorimpl(startRestartGroup);
                Updater.m2480setimpl(m2473constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                InterfaceC2072n setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                e(aVar, cVar, nVar, mVar, cVar2, cVar3, dVar, companion, startRestartGroup, 6);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
        } else {
            startRestartGroup.startReplaceableGroup(-831241583);
            e(aVar, cVar, nVar, mVar, cVar2, cVar3, dVar, AnimationModifierKt.animateContentSize$default(Modifier.Companion, null, null, 3, null), startRestartGroup, 0);
            startRestartGroup.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new g(aVar, cVar, nVar, mVar, cVar2, cVar3, dVar, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(R3.a aVar, C2.c cVar, N3.n nVar, N3.m mVar, C2.c cVar2, E3.c cVar3, D3.d dVar, Modifier modifier, Composer composer, int i8) {
        String str;
        float f8;
        int i9;
        int i10;
        int i11;
        String a9;
        String a10;
        Composer startRestartGroup = composer.startRestartGroup(1193301967);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1193301967, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetContent (PaymentSheetScreen.kt:287)");
        }
        float dimensionResource = PrimitiveResources_androidKt.dimensionResource(v3.s.f40542e, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-483455358);
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.Vertical top = arrangement.getTop();
        Alignment.Companion companion = Alignment.Companion;
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion.getStart(), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        Function0 constructor = companion2.getConstructor();
        InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor);
        } else {
            startRestartGroup.useNode();
        }
        Composer m2473constructorimpl = Updater.m2473constructorimpl(startRestartGroup);
        Updater.m2480setimpl(m2473constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        InterfaceC2072n setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(994743446);
        if (cVar != null) {
            AbstractC3183h0.a(AbstractC4246a.a(cVar, startRestartGroup, 8), PaddingKt.m579paddingVpY3zN4$default(PaddingKt.m581paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, Dp.m5155constructorimpl(16), 7, null), dimensionResource, 0.0f, 2, null), startRestartGroup, 0, 0);
            I i12 = I.f8786a;
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(994752127);
        if (nVar == null) {
            str = null;
            f8 = 0.0f;
        } else {
            str = null;
            f8 = 0.0f;
            z(nVar, mVar, nVar.e(), nVar.f(), cVar3.r(), PaddingKt.m581paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, Dp.m5155constructorimpl(cVar3.r() - cVar3.q()), 7, null), startRestartGroup, m.a.f35359d | ((i8 >> 6) & 112), 0);
            I i13 = I.f8786a;
        }
        startRestartGroup.endReplaceableGroup();
        Modifier.Companion companion3 = Modifier.Companion;
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, f8, 1, str);
        startRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Function0 constructor2 = companion2.getConstructor();
        InterfaceC2073o modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor2);
        } else {
            startRestartGroup.useNode();
        }
        Composer m2473constructorimpl2 = Updater.m2473constructorimpl(startRestartGroup);
        Updater.m2480setimpl(m2473constructorimpl2, columnMeasurePolicy2, companion2.getSetMeasurePolicy());
        Updater.m2480setimpl(m2473constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
        InterfaceC2072n setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
        if (m2473constructorimpl2.getInserting() || !AbstractC3292y.d(m2473constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m2473constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m2473constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        modifierMaterializerOf2.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        b(aVar, ComposableLambdaKt.composableLambda(startRestartGroup, -134733669, true, new h(cVar3)), startRestartGroup, 56);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(994776336);
        if (dVar != null && dVar.a() && cVar3.i()) {
            C2.c b9 = dVar.b();
            startRestartGroup.startReplaceableGroup(994780784);
            if (b9 == null) {
                a10 = str;
                i9 = 8;
            } else {
                i9 = 8;
                a10 = AbstractC4246a.a(b9, startRestartGroup, 8);
            }
            startRestartGroup.endReplaceableGroup();
            i11 = 2;
            i10 = 0;
            AbstractC1370s.a(a10, TestTagKt.testTag(PaddingKt.m581paddingqDBjuR0$default(PaddingKt.m579paddingVpY3zN4$default(companion3, dimensionResource, f8, 2, str), 0.0f, 0.0f, 0.0f, Dp.m5155constructorimpl(i9), 7, null), "PAYMENT_SHEET_MANDATE_TEXT_TEST_TAG"), startRestartGroup, 0, 0);
        } else {
            i9 = 8;
            i10 = 0;
            i11 = 2;
        }
        startRestartGroup.endReplaceableGroup();
        SpacerKt.Spacer(SizeKt.m610height3ABfNKs(companion3, cVar3.k()), startRestartGroup, i10);
        startRestartGroup.startReplaceableGroup(994791895);
        if (cVar2 != null) {
            AbstractC1368p.a(AbstractC4246a.a(cVar2, startRestartGroup, i9), TestTagKt.testTag(PaddingKt.m578paddingVpY3zN4(companion3, dimensionResource, Dp.m5155constructorimpl(i11)), "PAYMENT_SHEET_ERROR"), startRestartGroup, i10, i10);
            I i14 = I.f8786a;
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        v(aVar, startRestartGroup, i9);
        startRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
        Function0 constructor3 = companion2.getConstructor();
        InterfaceC2073o modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifier);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor3);
        } else {
            startRestartGroup.useNode();
        }
        Composer m2473constructorimpl3 = Updater.m2473constructorimpl(startRestartGroup);
        Updater.m2480setimpl(m2473constructorimpl3, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m2480setimpl(m2473constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
        InterfaceC2072n setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
        if (m2473constructorimpl3.getInserting() || !AbstractC3292y.d(m2473constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            m2473constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            m2473constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
        }
        modifierMaterializerOf3.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(994803182);
        if (dVar != null && !dVar.a() && cVar3.i()) {
            C2.c b10 = dVar.b();
            startRestartGroup.startReplaceableGroup(994807664);
            if (b10 == null) {
                a9 = null;
            } else {
                a9 = AbstractC4246a.a(b10, startRestartGroup, i9);
            }
            startRestartGroup.endReplaceableGroup();
            AbstractC1370s.a(a9, TestTagKt.testTag(PaddingKt.m579paddingVpY3zN4$default(PaddingKt.m581paddingqDBjuR0$default(companion3, 0.0f, Dp.m5155constructorimpl(i9), 0.0f, 0.0f, 13, null), dimensionResource, 0.0f, 2, null), "PAYMENT_SHEET_MANDATE_TEXT_TEST_TAG"), startRestartGroup, 0, 0);
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new i(aVar, cVar, nVar, mVar, cVar2, cVar3, dVar, modifier, i8));
        }
    }

    private static final void e(R3.a aVar, C2.c cVar, N3.n nVar, N3.m mVar, C2.c cVar2, E3.c cVar3, D3.d dVar, Modifier modifier, Composer composer, int i8) {
        composer.startReplaceableGroup(-480887246);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-480887246, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetContent.Content (PaymentSheetScreen.kt:252)");
        }
        d(aVar, cVar, nVar, mVar, cVar2, cVar3, dVar, modifier, composer, (m.a.f35359d << 6) | 2129992 | ((i8 << 21) & 29360128));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(R3.a aVar, boolean z8, InterfaceC2072n interfaceC2072n, Composer composer, int i8, int i9) {
        boolean z9;
        boolean z10;
        Composer startRestartGroup = composer.startRestartGroup(-356906204);
        if ((i9 & 2) != 0) {
            z9 = true;
        } else {
            z9 = z8;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-356906204, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetScreen (PaymentSheetScreen.kt:112)");
        }
        State a9 = A4.f.a(aVar.v(), startRestartGroup, 8);
        State a10 = A4.f.a(aVar.z(), startRestartGroup, 8);
        Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        startRestartGroup.startReplaceableGroup(-895287138);
        Object rememberedValue = startRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m5153boximpl(Dp.m5155constructorimpl(0)), null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        startRestartGroup.endReplaceableGroup();
        a(j(a9), startRestartGroup, 0);
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, 589949448, true, new o(aVar, a9));
        Modifier.Companion companion2 = Modifier.Companion;
        startRestartGroup.startReplaceableGroup(-895267028);
        boolean changed = startRestartGroup.changed(density);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (changed || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new p(density, mutableState);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        E.a(composableLambda, interfaceC2072n, OnGloballyPositionedModifierKt.onGloballyPositioned(companion2, (Function1) rememberedValue2), startRestartGroup, ((i8 >> 3) & 112) | 6, 0);
        if (k(a10) != null && !(k(a10) instanceof m.b) && z9) {
            z10 = true;
        } else {
            z10 = false;
        }
        AnimatedVisibilityKt.AnimatedVisibility(z10, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, -1377730228, true, new q(mutableState, a10)), startRestartGroup, 200064, 18);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new k(aVar, z9, interfaceC2072n, i8, i9));
        }
    }

    public static final void g(com.stripe.android.paymentsheet.v viewModel, Composer composer, int i8) {
        AbstractC3292y.i(viewModel, "viewModel");
        Composer startRestartGroup = composer.startRestartGroup(1055407360);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1055407360, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetScreen (PaymentSheetScreen.kt:91)");
        }
        f(viewModel, false, ComposableLambdaKt.composableLambda(startRestartGroup, -314837676, true, new m(viewModel)), startRestartGroup, 392, 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new n(viewModel, i8));
        }
    }

    public static final void h(A viewModel, Composer composer, int i8) {
        AbstractC3292y.i(viewModel, "viewModel");
        Composer startRestartGroup = composer.startRestartGroup(-359505535);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-359505535, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetScreen (PaymentSheetScreen.kt:79)");
        }
        f(viewModel, false, ComposableLambdaKt.composableLambda(startRestartGroup, 358620885, true, new j(A4.f.a(viewModel.o0(), startRestartGroup, 8), viewModel)), startRestartGroup, 392, 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new l(viewModel, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final N3.m k(State state) {
        return (N3.m) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final float l(MutableState mutableState) {
        return ((Dp) mutableState.getValue()).m5169unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(MutableState mutableState, float f8) {
        mutableState.setValue(Dp.m5153boximpl(f8));
    }

    public static final void n(R3.a viewModel, D type, Modifier modifier, Composer composer, int i8, int i9) {
        Modifier modifier2;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        AbstractC3292y.i(viewModel, "viewModel");
        AbstractC3292y.i(type, "type");
        Composer startRestartGroup = composer.startRestartGroup(-610225143);
        if ((i9 & 4) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-610225143, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetScreenContent (PaymentSheetScreen.kt:177)");
        }
        State a9 = A4.f.a(viewModel.A(), startRestartGroup, 8);
        State a10 = A4.f.a(viewModel.z(), startRestartGroup, 8);
        State a11 = A4.f.a(viewModel.m(), startRestartGroup, 8);
        State a12 = A4.f.a(viewModel.q().d(), startRestartGroup, 8);
        State a13 = A4.f.a(viewModel.r().f(), startRestartGroup, 8);
        E3.c p8 = p(a13);
        startRestartGroup.startReplaceableGroup(156830829);
        boolean changed = startRestartGroup.changed(p8);
        int i10 = (i8 & 112) ^ 48;
        if ((i10 > 32 && startRestartGroup.changed(type)) || (i8 & 48) == 32) {
            z8 = true;
        } else {
            z8 = false;
        }
        boolean z14 = changed | z8;
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (z14 || rememberedValue == Composer.Companion.getEmpty()) {
            E3.c p9 = p(a13);
            if (type == D.f7152a) {
                z9 = true;
            } else {
                z9 = false;
            }
            rememberedValue = p9.t(z9);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        State a14 = A4.f.a((InterfaceC3813L) rememberedValue, startRestartGroup, 8);
        N3.n s8 = s(a9);
        if (!q(a14)) {
            s8 = null;
        }
        E3.c p10 = p(a13);
        if (s8 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        startRestartGroup.startReplaceableGroup(156838154);
        boolean changed2 = startRestartGroup.changed(p10);
        if ((i10 > 32 && startRestartGroup.changed(type)) || (i8 & 48) == 32) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean changed3 = changed2 | z11 | startRestartGroup.changed(z10);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (changed3 || rememberedValue2 == Composer.Companion.getEmpty()) {
            E3.c p11 = p(a13);
            if (type == D.f7152a) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (s8 != null) {
                z13 = true;
            } else {
                z13 = false;
            }
            rememberedValue2 = p11.j(z12, z13);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        State a15 = A4.f.a((InterfaceC3813L) rememberedValue2, startRestartGroup, 8);
        startRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Function0 constructor = companion.getConstructor();
        InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier2);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor);
        } else {
            startRestartGroup.useNode();
        }
        Composer m2473constructorimpl = Updater.m2473constructorimpl(startRestartGroup);
        Updater.m2480setimpl(m2473constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        InterfaceC2072n setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        c(viewModel, r(a15), s8, t(a10), u(a11), p(a13), o(a12), startRestartGroup, (m.a.f35359d << 6) | 2129992);
        P3.b.a(startRestartGroup, 0);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new r(viewModel, type, modifier2, i8, i9));
        }
    }

    private static final D3.d o(State state) {
        return (D3.d) state.getValue();
    }

    private static final E3.c p(State state) {
        return (E3.c) state.getValue();
    }

    private static final boolean q(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    private static final C2.c r(State state) {
        return (C2.c) state.getValue();
    }

    private static final N3.n s(State state) {
        return (N3.n) state.getValue();
    }

    private static final N3.m t(State state) {
        return (N3.m) state.getValue();
    }

    private static final C2.c u(State state) {
        return (C2.c) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(R3.a aVar, Composer composer, int i8) {
        Composer startRestartGroup = composer.startRestartGroup(-1533976193);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1533976193, i8, -1, "com.stripe.android.paymentsheet.ui.PrimaryButton (PaymentSheetScreen.kt:423)");
        }
        State a9 = A4.f.a(aVar.u(), startRestartGroup, 8);
        Modifier testTag = TestTagKt.testTag(Modifier.Companion, "PRIMARY_BUTTON");
        startRestartGroup.startReplaceableGroup(-1702358241);
        boolean changed = startRestartGroup.changed(a9);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new w(a9);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        Modifier semantics$default = SemanticsModifierKt.semantics$default(testTag, false, (Function1) rememberedValue, 1, null);
        startRestartGroup.startReplaceableGroup(-1702351495);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState = (MutableState) rememberedValue2;
        startRestartGroup.endReplaceableGroup();
        AndroidViewBindingKt.AndroidViewBinding(new s(aVar, (Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), mutableState), semantics$default, null, startRestartGroup, 0, 4);
        EffectsKt.LaunchedEffect(aVar, w(mutableState), new t(aVar, mutableState, null), startRestartGroup, 584);
        EffectsKt.LaunchedEffect(aVar, w(mutableState), new u(aVar, mutableState, null), startRestartGroup, 584);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new v(aVar, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final PrimaryButton w(MutableState mutableState) {
        return (PrimaryButton) mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(MutableState mutableState, PrimaryButton primaryButton) {
        mutableState.setValue(primaryButton);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(BoxScope boxScope, N3.m mVar, Composer composer, int i8) {
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(1706259831);
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(mVar)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i9 = i10 | i8;
        } else {
            i9 = i8;
        }
        if ((i9 & 81) == 16 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1706259831, i9, -1, "com.stripe.android.paymentsheet.ui.ProgressOverlay (PaymentSheetScreen.kt:211)");
            }
            AnimatedContentKt.AnimatedContent(mVar, null, null, null, "AnimatedProcessingState", null, C1359g.f7553a.a(), startRestartGroup, ((i9 >> 3) & 14) | 1597440, 46);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x(boxScope, mVar, i8));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void z(N3.n r22, N3.m r23, kotlin.jvm.functions.Function0 r24, kotlin.jvm.functions.Function0 r25, float r26, androidx.compose.ui.Modifier r27, androidx.compose.runtime.Composer r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.ui.b.z(N3.n, N3.m, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, float, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }
}
