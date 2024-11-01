package androidx.compose.material3;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.ItemTouchHelper;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class TabRowDefaults$tabIndicatorOffset$2 extends AbstractC3293z implements InterfaceC2073o {
    final /* synthetic */ TabPosition $currentTabPosition;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabRowDefaults$tabIndicatorOffset$2(TabPosition tabPosition) {
        super(3);
        this.$currentTabPosition = tabPosition;
    }

    /* renamed from: invoke$lambda-0, reason: not valid java name */
    private static final float m1811invoke$lambda0(State<Dp> state) {
        return state.getValue().m5169unboximpl();
    }

    /* renamed from: invoke$lambda-1, reason: not valid java name */
    private static final float m1812invoke$lambda1(State<Dp> state) {
        return state.getValue().m5169unboximpl();
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    public final Modifier invoke(Modifier composed, Composer composer, int i8) {
        AbstractC3292y.i(composed, "$this$composed");
        composer.startReplaceableGroup(-1541271084);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1541271084, i8, -1, "androidx.compose.material3.TabRowDefaults.tabIndicatorOffset.<anonymous> (TabRow.kt:400)");
        }
        State m177animateDpAsStateKz89ssw = AnimateAsStateKt.m177animateDpAsStateKz89ssw(this.$currentTabPosition.m1809getWidthD9Ej5fM(), AnimationSpecKt.tween$default(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 0, EasingKt.getFastOutSlowInEasing(), 2, null), null, composer, 0, 4);
        Modifier m629width3ABfNKs = SizeKt.m629width3ABfNKs(OffsetKt.m538offsetVpY3zN4$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(composed, 0.0f, 1, null), Alignment.Companion.getBottomStart(), false, 2, null), m1812invoke$lambda1(AnimateAsStateKt.m177animateDpAsStateKz89ssw(this.$currentTabPosition.m1807getLeftD9Ej5fM(), AnimationSpecKt.tween$default(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 0, EasingKt.getFastOutSlowInEasing(), 2, null), null, composer, 0, 4)), 0.0f, 2, null), m1811invoke$lambda0(m177animateDpAsStateKz89ssw));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m629width3ABfNKs;
    }
}
