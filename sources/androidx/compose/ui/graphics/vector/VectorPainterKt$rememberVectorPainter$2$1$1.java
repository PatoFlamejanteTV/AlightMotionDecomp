package androidx.compose.ui.graphics.vector;

import Q5.I;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.geometry.Size;
import c6.InterfaceC2072n;
import c6.InterfaceC2074p;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class VectorPainterKt$rememberVectorPainter$2$1$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ InterfaceC2074p $content;
    final /* synthetic */ long $viewport;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorPainterKt$rememberVectorPainter$2$1$1(InterfaceC2074p interfaceC2074p, long j8) {
        super(2);
        this.$content = interfaceC2074p;
        this.$viewport = j8;
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
            ComposerKt.traceEventStart(-824421385, i8, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter.<anonymous>.<anonymous>.<anonymous> (VectorPainter.kt:154)");
        }
        this.$content.invoke(Float.valueOf(Size.m2781getWidthimpl(this.$viewport)), Float.valueOf(Size.m2778getHeightimpl(this.$viewport)), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
