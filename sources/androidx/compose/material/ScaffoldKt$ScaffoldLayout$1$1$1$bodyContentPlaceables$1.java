package androidx.compose.material;

import Q5.I;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class ScaffoldKt$ScaffoldLayout$1$1$1$bodyContentPlaceables$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $bottomBarHeight;
    final /* synthetic */ InterfaceC2073o $content;
    final /* synthetic */ SubcomposeMeasureScope $this_SubcomposeLayout;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScaffoldKt$ScaffoldLayout$1$1$1$bodyContentPlaceables$1(SubcomposeMeasureScope subcomposeMeasureScope, int i8, InterfaceC2073o interfaceC2073o, int i9) {
        super(2);
        this.$this_SubcomposeLayout = subcomposeMeasureScope;
        this.$bottomBarHeight = i8;
        this.$content = interfaceC2073o;
        this.$$dirty = i9;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    @Composable
    public final void invoke(Composer composer, int i8) {
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1132241596, i8, -1, "androidx.compose.material.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:319)");
        }
        this.$content.invoke(PaddingKt.m574PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, this.$this_SubcomposeLayout.mo422toDpu2uoSUM(this.$bottomBarHeight), 7, null), composer, Integer.valueOf((this.$$dirty >> 6) & 112));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
