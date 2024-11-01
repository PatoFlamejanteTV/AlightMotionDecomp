package Q3;

import Q3.f;
import Q5.I;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import v3.C4127g;

/* loaded from: classes4.dex */
public abstract class g {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements InterfaceC2073o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4127g f8530a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f8531b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: Q3.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0176a extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ f f8532a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0176a(f fVar) {
                super(1);
                this.f8532a = fVar;
            }

            public final void a(C4127g it) {
                AbstractC3292y.i(it, "it");
                this.f8532a.a(f.b.a.f8529a);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C4127g) obj);
                return I.f8786a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C4127g c4127g, f fVar) {
            super(3);
            this.f8530a = c4127g;
            this.f8531b = fVar;
        }

        @Override // c6.InterfaceC2073o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f8786a;
        }

        public final void invoke(RowScope SavedPaymentMethodRowButton, Composer composer, int i8) {
            AbstractC3292y.i(SavedPaymentMethodRowButton, "$this$SavedPaymentMethodRowButton");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(788393326, i8, -1, "com.stripe.android.paymentsheet.verticalmode.ManageOneSavedPaymentMethodUI.<anonymous> (ManageOneSavedPaymentMethodUI.kt:21)");
            }
            h.a(this.f8530a, new C0176a(this.f8531b), composer, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f8533a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f8534b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(f fVar, int i8) {
            super(2);
            this.f8533a = fVar;
            this.f8534b = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            g.a(this.f8533a, composer, RecomposeScopeImplKt.updateChangedFlags(this.f8534b | 1));
        }
    }

    public static final void a(f interactor, Composer composer, int i8) {
        int i9;
        int i10;
        AbstractC3292y.i(interactor, "interactor");
        Composer startRestartGroup = composer.startRestartGroup(-1713249349);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(interactor)) {
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
                ComposerKt.traceEventStart(-1713249349, i9, -1, "com.stripe.android.paymentsheet.verticalmode.ManageOneSavedPaymentMethodUI (ManageOneSavedPaymentMethodUI.kt:9)");
            }
            float dimensionResource = PrimitiveResources_androidKt.dimensionResource(v3.s.f40542e, startRestartGroup, 0);
            C4127g a9 = interactor.getState().a();
            p.a(a9, true, false, false, PaddingKt.m579paddingVpY3zN4$default(Modifier.Companion, dimensionResource, 0.0f, 2, null), null, ComposableLambdaKt.composableLambda(startRestartGroup, 788393326, true, new a(a9, interactor)), startRestartGroup, 1575992, 36);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new b(interactor, i8));
        }
    }
}
