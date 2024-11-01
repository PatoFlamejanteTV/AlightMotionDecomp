package androidx.compose.material3;

import Q5.I;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.material3.tokens.NavigationBarTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutIdKt;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class NavigationBarKt$NavigationBarItem$3$indicator$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ State<Float> $animationProgress$delegate;
    final /* synthetic */ NavigationBarItemColors $colors;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationBarKt$NavigationBarItem$3$indicator$1(NavigationBarItemColors navigationBarItemColors, State<Float> state) {
        super(2);
        this.$colors = navigationBarItemColors;
        this.$animationProgress$delegate = state;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i8) {
        float m1678NavigationBarItem$lambda9$lambda6;
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-474426875, i8, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:237)");
        }
        Modifier layoutId = LayoutIdKt.layoutId(Modifier.Companion, "indicator");
        long m1673getIndicatorColor0d7_KjU$material3_release = this.$colors.m1673getIndicatorColor0d7_KjU$material3_release();
        m1678NavigationBarItem$lambda9$lambda6 = NavigationBarKt.m1678NavigationBarItem$lambda9$lambda6(this.$animationProgress$delegate);
        BoxKt.Box(BackgroundKt.m258backgroundbw27NRU(layoutId, Color.m2947copywmQWz5c$default(m1673getIndicatorColor0d7_KjU$material3_release, m1678NavigationBarItem$lambda9$lambda6, 0.0f, 0.0f, 0.0f, 14, null), ShapesKt.toShape(NavigationBarTokens.INSTANCE.getActiveIndicatorShape(), composer, 6)), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
