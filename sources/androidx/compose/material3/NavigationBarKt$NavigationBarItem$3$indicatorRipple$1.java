package androidx.compose.material3;

import Q5.I;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.material3.tokens.NavigationBarTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.LayoutIdKt;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class NavigationBarKt$NavigationBarItem$3$indicatorRipple$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ MappedInteractionSource $offsetInteractionSource;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationBarKt$NavigationBarItem$3$indicatorRipple$1(MappedInteractionSource mappedInteractionSource) {
        super(2);
        this.$offsetInteractionSource = mappedInteractionSource;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i8) {
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(691730997, i8, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:229)");
        }
        BoxKt.Box(IndicationKt.indication(ClipKt.clip(LayoutIdKt.layoutId(Modifier.Companion, "indicatorRipple"), ShapesKt.toShape(NavigationBarTokens.INSTANCE.getActiveIndicatorShape(), composer, 6)), this.$offsetInteractionSource, RippleKt.m1421rememberRipple9IZ8Weo(false, 0.0f, 0L, composer, 0, 7)), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
