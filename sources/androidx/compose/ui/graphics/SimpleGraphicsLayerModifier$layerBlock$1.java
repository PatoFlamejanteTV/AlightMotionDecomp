package androidx.compose.ui.graphics;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SimpleGraphicsLayerModifier$layerBlock$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ SimpleGraphicsLayerModifier this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleGraphicsLayerModifier$layerBlock$1(SimpleGraphicsLayerModifier simpleGraphicsLayerModifier) {
        super(1);
        this.this$0 = simpleGraphicsLayerModifier;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((GraphicsLayerScope) obj);
        return Q5.I.f8786a;
    }

    public final void invoke(GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setScaleX(this.this$0.getScaleX());
        graphicsLayerScope.setScaleY(this.this$0.getScaleY());
        graphicsLayerScope.setAlpha(this.this$0.getAlpha());
        graphicsLayerScope.setTranslationX(this.this$0.getTranslationX());
        graphicsLayerScope.setTranslationY(this.this$0.getTranslationY());
        graphicsLayerScope.setShadowElevation(this.this$0.getShadowElevation());
        graphicsLayerScope.setRotationX(this.this$0.getRotationX());
        graphicsLayerScope.setRotationY(this.this$0.getRotationY());
        graphicsLayerScope.setRotationZ(this.this$0.getRotationZ());
        graphicsLayerScope.setCameraDistance(this.this$0.getCameraDistance());
        graphicsLayerScope.mo3121setTransformOrigin__ExYCQ(this.this$0.m3255getTransformOriginSzJe1aQ());
        graphicsLayerScope.setShape(this.this$0.getShape());
        graphicsLayerScope.setClip(this.this$0.getClip());
        graphicsLayerScope.setRenderEffect(this.this$0.getRenderEffect());
        graphicsLayerScope.mo3118setAmbientShadowColor8_81llA(this.this$0.m3252getAmbientShadowColor0d7_KjU());
        graphicsLayerScope.mo3120setSpotShadowColor8_81llA(this.this$0.m3254getSpotShadowColor0d7_KjU());
        graphicsLayerScope.mo3119setCompositingStrategyaDBOjCE(this.this$0.m3253getCompositingStrategyNrFUSI());
    }
}
