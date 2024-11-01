package j4;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n2.AbstractC3394E;
import o4.AbstractC3539m;
import z4.AbstractC4271c;

/* renamed from: j4.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3186j {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j4.j$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3188k f34161a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f34162b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C3188k c3188k, int i8) {
            super(2);
            this.f34161a = c3188k;
            this.f34162b = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC3186j.a(this.f34161a, composer, RecomposeScopeImplKt.updateChangedFlags(this.f34162b | 1));
        }
    }

    public static final void a(C3188k element, Composer composer, int i8) {
        AbstractC3292y.i(element, "element");
        Composer startRestartGroup = composer.startRestartGroup(-839067707);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-839067707, i8, -1, "com.stripe.android.ui.core.elements.AuBecsDebitMandateElementUI (AuBecsDebitMandateElementUI.kt:17)");
        }
        int i9 = AbstractC3394E.f35202L;
        String f8 = element.f();
        if (f8 == null) {
            f8 = "";
        }
        String stringResource = StringResources_androidKt.stringResource(i9, new Object[]{f8}, startRestartGroup, 64);
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        int i10 = MaterialTheme.$stable;
        AbstractC4271c.b(stringResource, PaddingKt.m579paddingVpY3zN4$default(Modifier.Companion, 0.0f, Dp.m5155constructorimpl(8), 1, null), null, AbstractC3539m.n(materialTheme, startRestartGroup, i10).j(), materialTheme.getTypography(startRestartGroup, i10).getBody2(), false, null, 0, null, startRestartGroup, 48, 484);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new a(element, i8));
        }
    }
}
