package androidx.compose.ui.graphics;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.DpRect;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class ReusableGraphicsLayerScope implements GraphicsLayerScope {
    public static final int $stable = 0;
    private boolean clip;
    private int mutatedFields;
    private RenderEffect renderEffect;
    private float rotationX;
    private float rotationY;
    private float rotationZ;
    private float shadowElevation;
    private float translationX;
    private float translationY;
    private float scaleX = 1.0f;
    private float scaleY = 1.0f;
    private float alpha = 1.0f;
    private long ambientShadowColor = GraphicsLayerScopeKt.getDefaultShadowColor();
    private long spotShadowColor = GraphicsLayerScopeKt.getDefaultShadowColor();
    private float cameraDistance = 8.0f;
    private long transformOrigin = TransformOrigin.Companion.m3316getCenterSzJe1aQ();
    private Shape shape = RectangleShapeKt.getRectangleShape();
    private int compositingStrategy = CompositingStrategy.Companion.m3036getAutoNrFUSI();
    private long size = Size.Companion.m2789getUnspecifiedNHjbRc();
    private Density graphicsDensity = DensityKt.Density$default(1.0f, 0.0f, 2, null);

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getAlpha() {
        return this.alpha;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* renamed from: getAmbientShadowColor-0d7_KjU */
    public long mo3113getAmbientShadowColor0d7_KjU() {
        return this.ambientShadowColor;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getCameraDistance() {
        return this.cameraDistance;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public boolean getClip() {
        return this.clip;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* renamed from: getCompositingStrategy--NrFUSI */
    public int mo3114getCompositingStrategyNrFUSI() {
        return this.compositingStrategy;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.graphicsDensity.getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.graphicsDensity.getFontScale();
    }

    public final Density getGraphicsDensity$ui_release() {
        return this.graphicsDensity;
    }

    public final int getMutatedFields$ui_release() {
        return this.mutatedFields;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getRotationX() {
        return this.rotationX;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getRotationY() {
        return this.rotationY;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getRotationZ() {
        return this.rotationZ;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getScaleX() {
        return this.scaleX;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getScaleY() {
        return this.scaleY;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getShadowElevation() {
        return this.shadowElevation;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public Shape getShape() {
        return this.shape;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* renamed from: getSize-NH-jbRc */
    public long mo3115getSizeNHjbRc() {
        return this.size;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* renamed from: getSpotShadowColor-0d7_KjU */
    public long mo3116getSpotShadowColor0d7_KjU() {
        return this.spotShadowColor;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* renamed from: getTransformOrigin-SzJe1aQ */
    public long mo3117getTransformOriginSzJe1aQ() {
        return this.transformOrigin;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getTranslationX() {
        return this.translationX;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getTranslationY() {
        return this.translationY;
    }

    public final void reset() {
        setScaleX(1.0f);
        setScaleY(1.0f);
        setAlpha(1.0f);
        setTranslationX(0.0f);
        setTranslationY(0.0f);
        setShadowElevation(0.0f);
        mo3118setAmbientShadowColor8_81llA(GraphicsLayerScopeKt.getDefaultShadowColor());
        mo3120setSpotShadowColor8_81llA(GraphicsLayerScopeKt.getDefaultShadowColor());
        setRotationX(0.0f);
        setRotationY(0.0f);
        setRotationZ(0.0f);
        setCameraDistance(8.0f);
        mo3121setTransformOrigin__ExYCQ(TransformOrigin.Companion.m3316getCenterSzJe1aQ());
        setShape(RectangleShapeKt.getRectangleShape());
        setClip(false);
        setRenderEffect(null);
        mo3119setCompositingStrategyaDBOjCE(CompositingStrategy.Companion.m3036getAutoNrFUSI());
        m3237setSizeuvyYCjk(Size.Companion.m2789getUnspecifiedNHjbRc());
        this.mutatedFields = 0;
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx--R2X_6o */
    public /* synthetic */ int mo418roundToPxR2X_6o(long j8) {
        return androidx.compose.ui.unit.a.a(this, j8);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx-0680j_4 */
    public /* synthetic */ int mo419roundToPx0680j_4(float f8) {
        return androidx.compose.ui.unit.a.b(this, f8);
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setAlpha(float f8) {
        if (this.alpha != f8) {
            this.mutatedFields |= 4;
            this.alpha = f8;
        }
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* renamed from: setAmbientShadowColor-8_81llA */
    public void mo3118setAmbientShadowColor8_81llA(long j8) {
        if (!Color.m2949equalsimpl0(this.ambientShadowColor, j8)) {
            this.mutatedFields |= 64;
            this.ambientShadowColor = j8;
        }
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setCameraDistance(float f8) {
        if (this.cameraDistance != f8) {
            this.mutatedFields |= 2048;
            this.cameraDistance = f8;
        }
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setClip(boolean z8) {
        if (this.clip != z8) {
            this.mutatedFields |= 16384;
            this.clip = z8;
        }
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* renamed from: setCompositingStrategy-aDBOjCE */
    public void mo3119setCompositingStrategyaDBOjCE(int i8) {
        if (!CompositingStrategy.m3032equalsimpl0(this.compositingStrategy, i8)) {
            this.mutatedFields |= 32768;
            this.compositingStrategy = i8;
        }
    }

    public final void setGraphicsDensity$ui_release(Density density) {
        this.graphicsDensity = density;
    }

    public final void setMutatedFields$ui_release(int i8) {
        this.mutatedFields = i8;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setRenderEffect(RenderEffect renderEffect) {
        if (!AbstractC3292y.d(this.renderEffect, renderEffect)) {
            this.mutatedFields |= 131072;
            this.renderEffect = renderEffect;
        }
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setRotationX(float f8) {
        if (this.rotationX != f8) {
            this.mutatedFields |= 256;
            this.rotationX = f8;
        }
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setRotationY(float f8) {
        if (this.rotationY != f8) {
            this.mutatedFields |= 512;
            this.rotationY = f8;
        }
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setRotationZ(float f8) {
        if (this.rotationZ != f8) {
            this.mutatedFields |= 1024;
            this.rotationZ = f8;
        }
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setScaleX(float f8) {
        if (this.scaleX != f8) {
            this.mutatedFields |= 1;
            this.scaleX = f8;
        }
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setScaleY(float f8) {
        if (this.scaleY != f8) {
            this.mutatedFields |= 2;
            this.scaleY = f8;
        }
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setShadowElevation(float f8) {
        if (this.shadowElevation != f8) {
            this.mutatedFields |= 32;
            this.shadowElevation = f8;
        }
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setShape(Shape shape) {
        if (!AbstractC3292y.d(this.shape, shape)) {
            this.mutatedFields |= 8192;
            this.shape = shape;
        }
    }

    /* renamed from: setSize-uvyYCjk, reason: not valid java name */
    public void m3237setSizeuvyYCjk(long j8) {
        this.size = j8;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* renamed from: setSpotShadowColor-8_81llA */
    public void mo3120setSpotShadowColor8_81llA(long j8) {
        if (!Color.m2949equalsimpl0(this.spotShadowColor, j8)) {
            this.mutatedFields |= 128;
            this.spotShadowColor = j8;
        }
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* renamed from: setTransformOrigin-__ExYCQ */
    public void mo3121setTransformOrigin__ExYCQ(long j8) {
        if (!TransformOrigin.m3310equalsimpl0(this.transformOrigin, j8)) {
            this.mutatedFields |= 4096;
            this.transformOrigin = j8;
        }
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setTranslationX(float f8) {
        if (this.translationX != f8) {
            this.mutatedFields |= 8;
            this.translationX = f8;
        }
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setTranslationY(float f8) {
        if (this.translationY != f8) {
            this.mutatedFields |= 16;
            this.translationY = f8;
        }
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toDp-GaN1DYA */
    public /* synthetic */ float mo420toDpGaN1DYA(long j8) {
        return androidx.compose.ui.unit.b.a(this, j8);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public /* synthetic */ float mo421toDpu2uoSUM(float f8) {
        return androidx.compose.ui.unit.a.c(this, f8);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    public /* synthetic */ long mo423toDpSizekrfVVM(long j8) {
        return androidx.compose.ui.unit.a.e(this, j8);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx--R2X_6o */
    public /* synthetic */ float mo424toPxR2X_6o(long j8) {
        return androidx.compose.ui.unit.a.f(this, j8);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx-0680j_4 */
    public /* synthetic */ float mo425toPx0680j_4(float f8) {
        return androidx.compose.ui.unit.a.g(this, f8);
    }

    @Override // androidx.compose.ui.unit.Density
    public /* synthetic */ Rect toRect(DpRect dpRect) {
        return androidx.compose.ui.unit.a.h(this, dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSize-XkaWNTQ */
    public /* synthetic */ long mo426toSizeXkaWNTQ(long j8) {
        return androidx.compose.ui.unit.a.i(this, j8);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toSp-0xMU5do */
    public /* synthetic */ long mo427toSp0xMU5do(float f8) {
        return androidx.compose.ui.unit.b.b(this, f8);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public /* synthetic */ long mo428toSpkPz2Gy4(float f8) {
        return androidx.compose.ui.unit.a.j(this, f8);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public /* synthetic */ float mo422toDpu2uoSUM(int i8) {
        return androidx.compose.ui.unit.a.d(this, i8);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public /* synthetic */ long mo429toSpkPz2Gy4(int i8) {
        return androidx.compose.ui.unit.a.k(this, i8);
    }
}
