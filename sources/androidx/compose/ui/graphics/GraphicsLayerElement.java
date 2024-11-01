package androidx.compose.ui.graphics;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class GraphicsLayerElement extends ModifierNodeElement<SimpleGraphicsLayerModifier> {
    private final float alpha;
    private final long ambientShadowColor;
    private final float cameraDistance;
    private final boolean clip;
    private final int compositingStrategy;
    private final RenderEffect renderEffect;
    private final float rotationX;
    private final float rotationY;
    private final float rotationZ;
    private final float scaleX;
    private final float scaleY;
    private final float shadowElevation;
    private final Shape shape;
    private final long spotShadowColor;
    private final long transformOrigin;
    private final float translationX;
    private final float translationY;

    public /* synthetic */ GraphicsLayerElement(float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, long j8, Shape shape, boolean z8, RenderEffect renderEffect, long j9, long j10, int i8, AbstractC3284p abstractC3284p) {
        this(f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, j8, shape, z8, renderEffect, j9, j10, i8);
    }

    public final float component1() {
        return this.scaleX;
    }

    public final float component10() {
        return this.cameraDistance;
    }

    /* renamed from: component11-SzJe1aQ, reason: not valid java name */
    public final long m3096component11SzJe1aQ() {
        return this.transformOrigin;
    }

    public final Shape component12() {
        return this.shape;
    }

    public final boolean component13() {
        return this.clip;
    }

    public final RenderEffect component14() {
        return this.renderEffect;
    }

    /* renamed from: component15-0d7_KjU, reason: not valid java name */
    public final long m3097component150d7_KjU() {
        return this.ambientShadowColor;
    }

    /* renamed from: component16-0d7_KjU, reason: not valid java name */
    public final long m3098component160d7_KjU() {
        return this.spotShadowColor;
    }

    /* renamed from: component17--NrFUSI, reason: not valid java name */
    public final int m3099component17NrFUSI() {
        return this.compositingStrategy;
    }

    public final float component2() {
        return this.scaleY;
    }

    public final float component3() {
        return this.alpha;
    }

    public final float component4() {
        return this.translationX;
    }

    public final float component5() {
        return this.translationY;
    }

    public final float component6() {
        return this.shadowElevation;
    }

    public final float component7() {
        return this.rotationX;
    }

    public final float component8() {
        return this.rotationY;
    }

    public final float component9() {
        return this.rotationZ;
    }

    /* renamed from: copy-JVvOYNQ, reason: not valid java name */
    public final GraphicsLayerElement m3100copyJVvOYNQ(float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, long j8, Shape shape, boolean z8, RenderEffect renderEffect, long j9, long j10, int i8) {
        return new GraphicsLayerElement(f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, j8, shape, z8, renderEffect, j9, j10, i8, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        return Float.compare(this.scaleX, graphicsLayerElement.scaleX) == 0 && Float.compare(this.scaleY, graphicsLayerElement.scaleY) == 0 && Float.compare(this.alpha, graphicsLayerElement.alpha) == 0 && Float.compare(this.translationX, graphicsLayerElement.translationX) == 0 && Float.compare(this.translationY, graphicsLayerElement.translationY) == 0 && Float.compare(this.shadowElevation, graphicsLayerElement.shadowElevation) == 0 && Float.compare(this.rotationX, graphicsLayerElement.rotationX) == 0 && Float.compare(this.rotationY, graphicsLayerElement.rotationY) == 0 && Float.compare(this.rotationZ, graphicsLayerElement.rotationZ) == 0 && Float.compare(this.cameraDistance, graphicsLayerElement.cameraDistance) == 0 && TransformOrigin.m3310equalsimpl0(this.transformOrigin, graphicsLayerElement.transformOrigin) && AbstractC3292y.d(this.shape, graphicsLayerElement.shape) && this.clip == graphicsLayerElement.clip && AbstractC3292y.d(this.renderEffect, graphicsLayerElement.renderEffect) && Color.m2949equalsimpl0(this.ambientShadowColor, graphicsLayerElement.ambientShadowColor) && Color.m2949equalsimpl0(this.spotShadowColor, graphicsLayerElement.spotShadowColor) && CompositingStrategy.m3032equalsimpl0(this.compositingStrategy, graphicsLayerElement.compositingStrategy);
    }

    public final float getAlpha() {
        return this.alpha;
    }

    /* renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
    public final long m3101getAmbientShadowColor0d7_KjU() {
        return this.ambientShadowColor;
    }

    public final float getCameraDistance() {
        return this.cameraDistance;
    }

    public final boolean getClip() {
        return this.clip;
    }

    /* renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
    public final int m3102getCompositingStrategyNrFUSI() {
        return this.compositingStrategy;
    }

    public final RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    public final float getRotationX() {
        return this.rotationX;
    }

    public final float getRotationY() {
        return this.rotationY;
    }

    public final float getRotationZ() {
        return this.rotationZ;
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getScaleY() {
        return this.scaleY;
    }

    public final float getShadowElevation() {
        return this.shadowElevation;
    }

    public final Shape getShape() {
        return this.shape;
    }

    /* renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
    public final long m3103getSpotShadowColor0d7_KjU() {
        return this.spotShadowColor;
    }

    /* renamed from: getTransformOrigin-SzJe1aQ, reason: not valid java name */
    public final long m3104getTransformOriginSzJe1aQ() {
        return this.transformOrigin;
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode;
        int floatToIntBits = ((((((((((((((((((((((((Float.floatToIntBits(this.scaleX) * 31) + Float.floatToIntBits(this.scaleY)) * 31) + Float.floatToIntBits(this.alpha)) * 31) + Float.floatToIntBits(this.translationX)) * 31) + Float.floatToIntBits(this.translationY)) * 31) + Float.floatToIntBits(this.shadowElevation)) * 31) + Float.floatToIntBits(this.rotationX)) * 31) + Float.floatToIntBits(this.rotationY)) * 31) + Float.floatToIntBits(this.rotationZ)) * 31) + Float.floatToIntBits(this.cameraDistance)) * 31) + TransformOrigin.m3313hashCodeimpl(this.transformOrigin)) * 31) + this.shape.hashCode()) * 31) + androidx.compose.foundation.a.a(this.clip)) * 31;
        RenderEffect renderEffect = this.renderEffect;
        if (renderEffect == null) {
            hashCode = 0;
        } else {
            hashCode = renderEffect.hashCode();
        }
        return ((((((floatToIntBits + hashCode) * 31) + Color.m2955hashCodeimpl(this.ambientShadowColor)) * 31) + Color.m2955hashCodeimpl(this.spotShadowColor)) * 31) + CompositingStrategy.m3033hashCodeimpl(this.compositingStrategy);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("graphicsLayer");
        inspectorInfo.getProperties().set("scaleX", Float.valueOf(this.scaleX));
        inspectorInfo.getProperties().set("scaleY", Float.valueOf(this.scaleY));
        inspectorInfo.getProperties().set("alpha", Float.valueOf(this.alpha));
        inspectorInfo.getProperties().set("translationX", Float.valueOf(this.translationX));
        inspectorInfo.getProperties().set("translationY", Float.valueOf(this.translationY));
        inspectorInfo.getProperties().set("shadowElevation", Float.valueOf(this.shadowElevation));
        inspectorInfo.getProperties().set("rotationX", Float.valueOf(this.rotationX));
        inspectorInfo.getProperties().set("rotationY", Float.valueOf(this.rotationY));
        inspectorInfo.getProperties().set("rotationZ", Float.valueOf(this.rotationZ));
        inspectorInfo.getProperties().set("cameraDistance", Float.valueOf(this.cameraDistance));
        inspectorInfo.getProperties().set("transformOrigin", TransformOrigin.m3303boximpl(this.transformOrigin));
        inspectorInfo.getProperties().set("shape", this.shape);
        inspectorInfo.getProperties().set("clip", Boolean.valueOf(this.clip));
        inspectorInfo.getProperties().set("renderEffect", this.renderEffect);
        inspectorInfo.getProperties().set("ambientShadowColor", Color.m2938boximpl(this.ambientShadowColor));
        inspectorInfo.getProperties().set("spotShadowColor", Color.m2938boximpl(this.spotShadowColor));
        inspectorInfo.getProperties().set("compositingStrategy", CompositingStrategy.m3029boximpl(this.compositingStrategy));
    }

    public String toString() {
        return "GraphicsLayerElement(scaleX=" + this.scaleX + ", scaleY=" + this.scaleY + ", alpha=" + this.alpha + ", translationX=" + this.translationX + ", translationY=" + this.translationY + ", shadowElevation=" + this.shadowElevation + ", rotationX=" + this.rotationX + ", rotationY=" + this.rotationY + ", rotationZ=" + this.rotationZ + ", cameraDistance=" + this.cameraDistance + ", transformOrigin=" + ((Object) TransformOrigin.m3314toStringimpl(this.transformOrigin)) + ", shape=" + this.shape + ", clip=" + this.clip + ", renderEffect=" + this.renderEffect + ", ambientShadowColor=" + ((Object) Color.m2956toStringimpl(this.ambientShadowColor)) + ", spotShadowColor=" + ((Object) Color.m2956toStringimpl(this.spotShadowColor)) + ", compositingStrategy=" + ((Object) CompositingStrategy.m3034toStringimpl(this.compositingStrategy)) + ')';
    }

    private GraphicsLayerElement(float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, long j8, Shape shape, boolean z8, RenderEffect renderEffect, long j9, long j10, int i8) {
        this.scaleX = f8;
        this.scaleY = f9;
        this.alpha = f10;
        this.translationX = f11;
        this.translationY = f12;
        this.shadowElevation = f13;
        this.rotationX = f14;
        this.rotationY = f15;
        this.rotationZ = f16;
        this.cameraDistance = f17;
        this.transformOrigin = j8;
        this.shape = shape;
        this.clip = z8;
        this.renderEffect = renderEffect;
        this.ambientShadowColor = j9;
        this.spotShadowColor = j10;
        this.compositingStrategy = i8;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public SimpleGraphicsLayerModifier create() {
        return new SimpleGraphicsLayerModifier(this.scaleX, this.scaleY, this.alpha, this.translationX, this.translationY, this.shadowElevation, this.rotationX, this.rotationY, this.rotationZ, this.cameraDistance, this.transformOrigin, this.shape, this.clip, this.renderEffect, this.ambientShadowColor, this.spotShadowColor, this.compositingStrategy, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(SimpleGraphicsLayerModifier simpleGraphicsLayerModifier) {
        simpleGraphicsLayerModifier.setScaleX(this.scaleX);
        simpleGraphicsLayerModifier.setScaleY(this.scaleY);
        simpleGraphicsLayerModifier.setAlpha(this.alpha);
        simpleGraphicsLayerModifier.setTranslationX(this.translationX);
        simpleGraphicsLayerModifier.setTranslationY(this.translationY);
        simpleGraphicsLayerModifier.setShadowElevation(this.shadowElevation);
        simpleGraphicsLayerModifier.setRotationX(this.rotationX);
        simpleGraphicsLayerModifier.setRotationY(this.rotationY);
        simpleGraphicsLayerModifier.setRotationZ(this.rotationZ);
        simpleGraphicsLayerModifier.setCameraDistance(this.cameraDistance);
        simpleGraphicsLayerModifier.m3259setTransformOrigin__ExYCQ(this.transformOrigin);
        simpleGraphicsLayerModifier.setShape(this.shape);
        simpleGraphicsLayerModifier.setClip(this.clip);
        simpleGraphicsLayerModifier.setRenderEffect(this.renderEffect);
        simpleGraphicsLayerModifier.m3256setAmbientShadowColor8_81llA(this.ambientShadowColor);
        simpleGraphicsLayerModifier.m3258setSpotShadowColor8_81llA(this.spotShadowColor);
        simpleGraphicsLayerModifier.m3257setCompositingStrategyaDBOjCE(this.compositingStrategy);
        simpleGraphicsLayerModifier.invalidateLayerBlock();
    }
}
