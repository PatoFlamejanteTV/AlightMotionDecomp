package androidx.compose.material;

import Q5.I;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.unit.Constraints;
import c6.InterfaceC2072n;
import c6.InterfaceC2074p;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class BackdropScaffoldKt$BackdropStack$1$1$placeables$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ float $backLayerHeight;
    final /* synthetic */ long $constraints;
    final /* synthetic */ InterfaceC2074p $frontLayer;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldKt$BackdropStack$1$1$placeables$1(InterfaceC2074p interfaceC2074p, long j8, float f8, int i8) {
        super(2);
        this.$frontLayer = interfaceC2074p;
        this.$constraints = j8;
        this.$backLayerHeight = f8;
        this.$$dirty = i8;
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
            ComposerKt.traceEventStart(-1222642649, i8, -1, "androidx.compose.material.BackdropStack.<anonymous>.<anonymous>.<anonymous> (BackdropScaffold.kt:465)");
        }
        this.$frontLayer.invoke(Constraints.m5111boximpl(this.$constraints), Float.valueOf(this.$backLayerHeight), composer, Integer.valueOf((this.$$dirty >> 3) & 896));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
