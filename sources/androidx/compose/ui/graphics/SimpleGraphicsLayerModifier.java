package androidx.compose.ui.graphics;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SimpleGraphicsLayerModifier extends Modifier.Node implements LayoutModifierNode {
    private float alpha;
    private long ambientShadowColor;
    private float cameraDistance;
    private boolean clip;
    private int compositingStrategy;
    private Function1 layerBlock;
    private RenderEffect renderEffect;
    private float rotationX;
    private float rotationY;
    private float rotationZ;
    private float scaleX;
    private float scaleY;
    private float shadowElevation;
    private Shape shape;
    private long spotShadowColor;
    private long transformOrigin;
    private float translationX;
    private float translationY;

    public /* synthetic */ SimpleGraphicsLayerModifier(float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, long j8, Shape shape, boolean z8, RenderEffect renderEffect, long j9, long j10, int i8, AbstractC3284p abstractC3284p) {
        this(f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, j8, shape, z8, renderEffect, j9, j10, i8);
    }

    public final float getAlpha() {
        return this.alpha;
    }

    /* renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
    public final long m3252getAmbientShadowColor0d7_KjU() {
        return this.ambientShadowColor;
    }

    public final float getCameraDistance() {
        return this.cameraDistance;
    }

    public final boolean getClip() {
        return this.clip;
    }

    /* renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
    public final int m3253getCompositingStrategyNrFUSI() {
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

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    /* renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
    public final long m3254getSpotShadowColor0d7_KjU() {
        return this.spotShadowColor;
    }

    /* renamed from: getTransformOrigin-SzJe1aQ, reason: not valid java name */
    public final long m3255getTransformOriginSzJe1aQ() {
        return this.transformOrigin;
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    public final void invalidateLayerBlock() {
        NodeCoordinator wrapped$ui_release = DelegatableNodeKt.m4203requireCoordinator64DMado(this, NodeKind.m4320constructorimpl(2)).getWrapped$ui_release();
        if (wrapped$ui_release != null) {
            wrapped$ui_release.updateLayerBlock(this.layerBlock, true);
        }
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        return LayoutModifierNode.CC.a(this, intrinsicMeasureScope, intrinsicMeasurable, i8);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        return LayoutModifierNode.CC.b(this, intrinsicMeasureScope, intrinsicMeasurable, i8);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo340measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j8) {
        Placeable mo4108measureBRTryo0 = measurable.mo4108measureBRTryo0(j8);
        return MeasureScope.CC.q(measureScope, mo4108measureBRTryo0.getWidth(), mo4108measureBRTryo0.getHeight(), null, new SimpleGraphicsLayerModifier$measure$1(mo4108measureBRTryo0, this), 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        return LayoutModifierNode.CC.c(this, intrinsicMeasureScope, intrinsicMeasurable, i8);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        return LayoutModifierNode.CC.d(this, intrinsicMeasureScope, intrinsicMeasurable, i8);
    }

    public final void setAlpha(float f8) {
        this.alpha = f8;
    }

    /* renamed from: setAmbientShadowColor-8_81llA, reason: not valid java name */
    public final void m3256setAmbientShadowColor8_81llA(long j8) {
        this.ambientShadowColor = j8;
    }

    public final void setCameraDistance(float f8) {
        this.cameraDistance = f8;
    }

    public final void setClip(boolean z8) {
        this.clip = z8;
    }

    /* renamed from: setCompositingStrategy-aDBOjCE, reason: not valid java name */
    public final void m3257setCompositingStrategyaDBOjCE(int i8) {
        this.compositingStrategy = i8;
    }

    public final void setRenderEffect(RenderEffect renderEffect) {
        this.renderEffect = renderEffect;
    }

    public final void setRotationX(float f8) {
        this.rotationX = f8;
    }

    public final void setRotationY(float f8) {
        this.rotationY = f8;
    }

    public final void setRotationZ(float f8) {
        this.rotationZ = f8;
    }

    public final void setScaleX(float f8) {
        this.scaleX = f8;
    }

    public final void setScaleY(float f8) {
        this.scaleY = f8;
    }

    public final void setShadowElevation(float f8) {
        this.shadowElevation = f8;
    }

    public final void setShape(Shape shape) {
        this.shape = shape;
    }

    /* renamed from: setSpotShadowColor-8_81llA, reason: not valid java name */
    public final void m3258setSpotShadowColor8_81llA(long j8) {
        this.spotShadowColor = j8;
    }

    /* renamed from: setTransformOrigin-__ExYCQ, reason: not valid java name */
    public final void m3259setTransformOrigin__ExYCQ(long j8) {
        this.transformOrigin = j8;
    }

    public final void setTranslationX(float f8) {
        this.translationX = f8;
    }

    public final void setTranslationY(float f8) {
        this.translationY = f8;
    }

    public String toString() {
        return "SimpleGraphicsLayerModifier(scaleX=" + this.scaleX + ", scaleY=" + this.scaleY + ", alpha = " + this.alpha + ", translationX=" + this.translationX + ", translationY=" + this.translationY + ", shadowElevation=" + this.shadowElevation + ", rotationX=" + this.rotationX + ", rotationY=" + this.rotationY + ", rotationZ=" + this.rotationZ + ", cameraDistance=" + this.cameraDistance + ", transformOrigin=" + ((Object) TransformOrigin.m3314toStringimpl(this.transformOrigin)) + ", shape=" + this.shape + ", clip=" + this.clip + ", renderEffect=" + this.renderEffect + ", ambientShadowColor=" + ((Object) Color.m2956toStringimpl(this.ambientShadowColor)) + ", spotShadowColor=" + ((Object) Color.m2956toStringimpl(this.spotShadowColor)) + ", compositingStrategy=" + ((Object) CompositingStrategy.m3034toStringimpl(this.compositingStrategy)) + ')';
    }

    public /* synthetic */ SimpleGraphicsLayerModifier(float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, long j8, Shape shape, boolean z8, RenderEffect renderEffect, long j9, long j10, int i8, int i9, AbstractC3284p abstractC3284p) {
        this(f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, j8, shape, z8, renderEffect, j9, j10, (i9 & 65536) != 0 ? CompositingStrategy.Companion.m3036getAutoNrFUSI() : i8, null);
    }

    private SimpleGraphicsLayerModifier(float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, long j8, Shape shape, boolean z8, RenderEffect renderEffect, long j9, long j10, int i8) {
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
        this.layerBlock = new SimpleGraphicsLayerModifier$layerBlock$1(this);
    }
}
