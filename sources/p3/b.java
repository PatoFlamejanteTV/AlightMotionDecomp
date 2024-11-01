package P3;

import Q5.I;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;
import v3.s;

/* loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f8066a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i8) {
            super(2);
            this.f8066a = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            b.a(composer, RecomposeScopeImplKt.updateChangedFlags(this.f8066a | 1));
        }
    }

    public static final void a(Composer composer, int i8) {
        Composer startRestartGroup = composer.startRestartGroup(-1248477155);
        if (i8 == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1248477155, i8, -1, "com.stripe.android.paymentsheet.utils.PaymentSheetContentPadding (EdgeToEdge.kt:10)");
            }
            SpacerKt.Spacer(SizeKt.m613requiredHeight3ABfNKs(Modifier.Companion, PrimitiveResources_androidKt.dimensionResource(s.f40538a, startRestartGroup, 0)), startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new a(i8));
        }
    }
}
