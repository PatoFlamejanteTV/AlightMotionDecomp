package androidx.compose.ui.draw;

import Q5.I;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class ShadowKt$shadow$2$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ long $ambientColor;
    final /* synthetic */ boolean $clip;
    final /* synthetic */ float $elevation;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ long $spotColor;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShadowKt$shadow$2$1(float f8, Shape shape, boolean z8, long j8, long j9) {
        super(1);
        this.$elevation = f8;
        this.$shape = shape;
        this.$clip = z8;
        this.$ambientColor = j8;
        this.$spotColor = j9;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((GraphicsLayerScope) obj);
        return I.f8786a;
    }

    public final void invoke(GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setShadowElevation(graphicsLayerScope.mo425toPx0680j_4(this.$elevation));
        graphicsLayerScope.setShape(this.$shape);
        graphicsLayerScope.setClip(this.$clip);
        graphicsLayerScope.mo3118setAmbientShadowColor8_81llA(this.$ambientColor);
        graphicsLayerScope.mo3120setSpotShadowColor8_81llA(this.$spotColor);
    }
}
