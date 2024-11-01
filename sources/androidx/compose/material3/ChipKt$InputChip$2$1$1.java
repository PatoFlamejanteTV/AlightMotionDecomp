package androidx.compose.material3;

import Q5.I;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class ChipKt$InputChip$2$1$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ float $avatarOpacity;
    final /* synthetic */ Shape $avatarShape;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChipKt$InputChip$2$1$1(float f8, Shape shape) {
        super(1);
        this.$avatarOpacity = f8;
        this.$avatarShape = shape;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((GraphicsLayerScope) obj);
        return I.f8786a;
    }

    public final void invoke(GraphicsLayerScope graphicsLayer) {
        AbstractC3292y.i(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setAlpha(this.$avatarOpacity);
        graphicsLayer.setShape(this.$avatarShape);
        graphicsLayer.setClip(true);
    }
}
