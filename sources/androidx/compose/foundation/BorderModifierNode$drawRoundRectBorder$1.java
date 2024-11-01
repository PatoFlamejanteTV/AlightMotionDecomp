package androidx.compose.foundation;

import Q5.I;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.Stroke;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class BorderModifierNode$drawRoundRectBorder$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ long $borderSize;
    final /* synthetic */ Stroke $borderStroke;
    final /* synthetic */ Brush $brush;
    final /* synthetic */ long $cornerRadius;
    final /* synthetic */ boolean $fillArea;
    final /* synthetic */ float $halfStroke;
    final /* synthetic */ float $strokeWidth;
    final /* synthetic */ long $topLeft;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BorderModifierNode$drawRoundRectBorder$1(boolean z8, Brush brush, long j8, float f8, float f9, long j9, long j10, Stroke stroke) {
        super(1);
        this.$fillArea = z8;
        this.$brush = brush;
        this.$cornerRadius = j8;
        this.$halfStroke = f8;
        this.$strokeWidth = f9;
        this.$topLeft = j9;
        this.$borderSize = j10;
        this.$borderStroke = stroke;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ContentDrawScope) obj);
        return I.f8786a;
    }

    public final void invoke(ContentDrawScope onDrawWithContent) {
        long m274shrinkKibmq7A;
        AbstractC3292y.i(onDrawWithContent, "$this$onDrawWithContent");
        onDrawWithContent.drawContent();
        if (this.$fillArea) {
            androidx.compose.ui.graphics.drawscope.c.L(onDrawWithContent, this.$brush, 0L, 0L, this.$cornerRadius, 0.0f, null, null, 0, 246, null);
            return;
        }
        float m2687getXimpl = CornerRadius.m2687getXimpl(this.$cornerRadius);
        float f8 = this.$halfStroke;
        if (m2687getXimpl < f8) {
            float f9 = this.$strokeWidth;
            float m2781getWidthimpl = Size.m2781getWidthimpl(onDrawWithContent.mo3391getSizeNHjbRc()) - this.$strokeWidth;
            float m2778getHeightimpl = Size.m2778getHeightimpl(onDrawWithContent.mo3391getSizeNHjbRc()) - this.$strokeWidth;
            int m2936getDifferencertfAjoo = ClipOp.Companion.m2936getDifferencertfAjoo();
            Brush brush = this.$brush;
            long j8 = this.$cornerRadius;
            DrawContext drawContext = onDrawWithContent.getDrawContext();
            long mo3397getSizeNHjbRc = drawContext.mo3397getSizeNHjbRc();
            drawContext.getCanvas().save();
            drawContext.getTransform().mo3400clipRectN_I0leg(f9, f9, m2781getWidthimpl, m2778getHeightimpl, m2936getDifferencertfAjoo);
            androidx.compose.ui.graphics.drawscope.c.L(onDrawWithContent, brush, 0L, 0L, j8, 0.0f, null, null, 0, 246, null);
            drawContext.getCanvas().restore();
            drawContext.mo3398setSizeuvyYCjk(mo3397getSizeNHjbRc);
            return;
        }
        Brush brush2 = this.$brush;
        long j9 = this.$topLeft;
        long j10 = this.$borderSize;
        m274shrinkKibmq7A = BorderKt.m274shrinkKibmq7A(this.$cornerRadius, f8);
        androidx.compose.ui.graphics.drawscope.c.L(onDrawWithContent, brush2, j9, j10, m274shrinkKibmq7A, 0.0f, this.$borderStroke, null, 0, 208, null);
    }
}
