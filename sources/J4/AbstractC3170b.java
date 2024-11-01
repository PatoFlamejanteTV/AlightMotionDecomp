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
import java.util.Map;
import kotlin.jvm.internal.AbstractC3293z;
import n2.AbstractC3394E;
import o4.AbstractC3539m;
import z4.AbstractC4270b;
import z4.AbstractC4271c;

/* renamed from: j4.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3170b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j4.b$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f34089a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i8) {
            super(2);
            this.f34089a = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC3170b.a(composer, RecomposeScopeImplKt.updateChangedFlags(this.f34089a | 1));
        }
    }

    public static final void a(Composer composer, int i8) {
        Composer startRestartGroup = composer.startRestartGroup(-172812001);
        if (i8 == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-172812001, i8, -1, "com.stripe.android.ui.core.elements.AffirmElementUI (AffirmElementUI.kt:17)");
            }
            String stringResource = StringResources_androidKt.stringResource(AbstractC3394E.f35196I, startRestartGroup, 0);
            Map e8 = R5.Q.e(Q5.x.a("affirm", new AbstractC4270b.a(g4.k.f32332a, g4.n.f32375L, null, 4, null)));
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i9 = MaterialTheme.$stable;
            AbstractC4271c.b(stringResource, PaddingKt.m579paddingVpY3zN4$default(Modifier.Companion, 0.0f, Dp.m5155constructorimpl(8), 1, null), e8, AbstractC3539m.n(materialTheme, startRestartGroup, i9).j(), materialTheme.getTypography(startRestartGroup, i9).getH6(), false, null, 0, null, startRestartGroup, (AbstractC4270b.a.f41481d << 6) | 48, 480);
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
