package j4;

import R5.AbstractC1435t;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.unit.Dp;
import c6.InterfaceC2072n;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import o4.AbstractC3539m;

/* renamed from: j4.F, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3163F {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j4.F$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f33792a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3160C f33793b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Set f33794c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ r4.G f33795d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f33796e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z8, C3160C c3160c, Set set, r4.G g8, int i8) {
            super(2);
            this.f33792a = z8;
            this.f33793b = c3160c;
            this.f33794c = set;
            this.f33795d = g8;
            this.f33796e = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC3163F.a(this.f33792a, this.f33793b, this.f33794c, this.f33795d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f33796e | 1));
        }
    }

    public static final void a(boolean z8, C3160C controller, Set hiddenIdentifiers, r4.G g8, Composer composer, int i8) {
        int m2635getDowndhqQ8s;
        AbstractC3292y.i(controller, "controller");
        AbstractC3292y.i(hiddenIdentifiers, "hiddenIdentifiers");
        Composer startRestartGroup = composer.startRestartGroup(-1519035641);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1519035641, i8, -1, "com.stripe.android.ui.core.elements.CardDetailsElementUI (CardDetailsElementUI.kt:20)");
        }
        int i9 = 0;
        for (Object obj : controller.x()) {
            int i10 = i9 + 1;
            if (i9 < 0) {
                AbstractC1435t.w();
            }
            r4.k0 k0Var = (r4.k0) obj;
            if (AbstractC3292y.d(k0Var.a(), r4.G.Companion.j())) {
                m2635getDowndhqQ8s = FocusDirection.Companion.m2639getNextdhqQ8s();
            } else {
                m2635getDowndhqQ8s = FocusDirection.Companion.m2635getDowndhqQ8s();
            }
            r4.l0.a(z8, k0Var, null, hiddenIdentifiers, g8, m2635getDowndhqQ8s, 0, startRestartGroup, (i8 & 14) | 4160 | (r4.G.f37990d << 12) | ((i8 << 3) & 57344), 68);
            startRestartGroup.startReplaceableGroup(1631013063);
            if (i9 != AbstractC1435t.o(controller.x())) {
                MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                int i11 = MaterialTheme.$stable;
                DividerKt.m1190DivideroMI9zvI(PaddingKt.m579paddingVpY3zN4$default(Modifier.Companion, Dp.m5155constructorimpl(AbstractC3539m.o(materialTheme, startRestartGroup, i11).c()), 0.0f, 2, null), AbstractC3539m.n(materialTheme, startRestartGroup, i11).f(), Dp.m5155constructorimpl(AbstractC3539m.o(materialTheme, startRestartGroup, i11).c()), 0.0f, startRestartGroup, 0, 8);
            }
            startRestartGroup.endReplaceableGroup();
            i9 = i10;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new a(z8, controller, hiddenIdentifiers, g8, i8));
        }
    }
}
