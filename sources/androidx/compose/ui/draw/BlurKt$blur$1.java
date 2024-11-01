package androidx.compose.ui.draw;

import Q5.I;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RenderEffectKt;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class BlurKt$blur$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ boolean $clip;
    final /* synthetic */ Shape $edgeTreatment;
    final /* synthetic */ float $radiusX;
    final /* synthetic */ float $radiusY;
    final /* synthetic */ int $tileMode;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlurKt$blur$1(float f8, float f9, int i8, Shape shape, boolean z8) {
        super(1);
        this.$radiusX = f8;
        this.$radiusY = f9;
        this.$tileMode = i8;
        this.$edgeTreatment = shape;
        this.$clip = z8;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((GraphicsLayerScope) obj);
        return I.f8786a;
    }

    public final void invoke(GraphicsLayerScope graphicsLayerScope) {
        float mo425toPx0680j_4 = graphicsLayerScope.mo425toPx0680j_4(this.$radiusX);
        float mo425toPx0680j_42 = graphicsLayerScope.mo425toPx0680j_4(this.$radiusY);
        graphicsLayerScope.setRenderEffect((mo425toPx0680j_4 <= 0.0f || mo425toPx0680j_42 <= 0.0f) ? null : RenderEffectKt.m3233BlurEffect3YTHUZs(mo425toPx0680j_4, mo425toPx0680j_42, this.$tileMode));
        Shape shape = this.$edgeTreatment;
        if (shape == null) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        graphicsLayerScope.setShape(shape);
        graphicsLayerScope.setClip(this.$clip);
    }
}
