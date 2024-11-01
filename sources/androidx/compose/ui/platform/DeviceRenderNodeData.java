package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.RenderEffect;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class DeviceRenderNodeData {
    public static final int $stable = 8;
    private float alpha;
    private int ambientShadowColor;
    private final int bottom;
    private float cameraDistance;
    private boolean clipToBounds;
    private boolean clipToOutline;
    private int compositingStrategy;
    private float elevation;
    private final int height;
    private final int left;
    private float pivotX;
    private float pivotY;
    private RenderEffect renderEffect;
    private final int right;
    private float rotationX;
    private float rotationY;
    private float rotationZ;
    private float scaleX;
    private float scaleY;
    private int spotShadowColor;
    private final int top;
    private float translationX;
    private float translationY;
    private final long uniqueId;
    private final int width;

    public /* synthetic */ DeviceRenderNodeData(long j8, int i8, int i9, int i10, int i11, int i12, int i13, float f8, float f9, float f10, float f11, float f12, int i14, int i15, float f13, float f14, float f15, float f16, float f17, float f18, boolean z8, boolean z9, float f19, RenderEffect renderEffect, int i16, AbstractC3284p abstractC3284p) {
        this(j8, i8, i9, i10, i11, i12, i13, f8, f9, f10, f11, f12, i14, i15, f13, f14, f15, f16, f17, f18, z8, z9, f19, renderEffect, i16);
    }

    public final long component1() {
        return this.uniqueId;
    }

    public final float component10() {
        return this.translationX;
    }

    public final float component11() {
        return this.translationY;
    }

    public final float component12() {
        return this.elevation;
    }

    public final int component13() {
        return this.ambientShadowColor;
    }

    public final int component14() {
        return this.spotShadowColor;
    }

    public final float component15() {
        return this.rotationZ;
    }

    public final float component16() {
        return this.rotationX;
    }

    public final float component17() {
        return this.rotationY;
    }

    public final float component18() {
        return this.cameraDistance;
    }

    public final float component19() {
        return this.pivotX;
    }

    public final int component2() {
        return this.left;
    }

    public final float component20() {
        return this.pivotY;
    }

    public final boolean component21() {
        return this.clipToOutline;
    }

    public final boolean component22() {
        return this.clipToBounds;
    }

    public final float component23() {
        return this.alpha;
    }

    public final RenderEffect component24() {
        return this.renderEffect;
    }

    /* renamed from: component25--NrFUSI, reason: not valid java name */
    public final int m4434component25NrFUSI() {
        return this.compositingStrategy;
    }

    public final int component3() {
        return this.top;
    }

    public final int component4() {
        return this.right;
    }

    public final int component5() {
        return this.bottom;
    }

    public final int component6() {
        return this.width;
    }

    public final int component7() {
        return this.height;
    }

    public final float component8() {
        return this.scaleX;
    }

    public final float component9() {
        return this.scaleY;
    }

    /* renamed from: copy-fuCbV5c, reason: not valid java name */
    public final DeviceRenderNodeData m4435copyfuCbV5c(long j8, int i8, int i9, int i10, int i11, int i12, int i13, float f8, float f9, float f10, float f11, float f12, int i14, int i15, float f13, float f14, float f15, float f16, float f17, float f18, boolean z8, boolean z9, float f19, RenderEffect renderEffect, int i16) {
        return new DeviceRenderNodeData(j8, i8, i9, i10, i11, i12, i13, f8, f9, f10, f11, f12, i14, i15, f13, f14, f15, f16, f17, f18, z8, z9, f19, renderEffect, i16, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceRenderNodeData)) {
            return false;
        }
        DeviceRenderNodeData deviceRenderNodeData = (DeviceRenderNodeData) obj;
        return this.uniqueId == deviceRenderNodeData.uniqueId && this.left == deviceRenderNodeData.left && this.top == deviceRenderNodeData.top && this.right == deviceRenderNodeData.right && this.bottom == deviceRenderNodeData.bottom && this.width == deviceRenderNodeData.width && this.height == deviceRenderNodeData.height && Float.compare(this.scaleX, deviceRenderNodeData.scaleX) == 0 && Float.compare(this.scaleY, deviceRenderNodeData.scaleY) == 0 && Float.compare(this.translationX, deviceRenderNodeData.translationX) == 0 && Float.compare(this.translationY, deviceRenderNodeData.translationY) == 0 && Float.compare(this.elevation, deviceRenderNodeData.elevation) == 0 && this.ambientShadowColor == deviceRenderNodeData.ambientShadowColor && this.spotShadowColor == deviceRenderNodeData.spotShadowColor && Float.compare(this.rotationZ, deviceRenderNodeData.rotationZ) == 0 && Float.compare(this.rotationX, deviceRenderNodeData.rotationX) == 0 && Float.compare(this.rotationY, deviceRenderNodeData.rotationY) == 0 && Float.compare(this.cameraDistance, deviceRenderNodeData.cameraDistance) == 0 && Float.compare(this.pivotX, deviceRenderNodeData.pivotX) == 0 && Float.compare(this.pivotY, deviceRenderNodeData.pivotY) == 0 && this.clipToOutline == deviceRenderNodeData.clipToOutline && this.clipToBounds == deviceRenderNodeData.clipToBounds && Float.compare(this.alpha, deviceRenderNodeData.alpha) == 0 && AbstractC3292y.d(this.renderEffect, deviceRenderNodeData.renderEffect) && CompositingStrategy.m3032equalsimpl0(this.compositingStrategy, deviceRenderNodeData.compositingStrategy);
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final int getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    public final int getBottom() {
        return this.bottom;
    }

    public final float getCameraDistance() {
        return this.cameraDistance;
    }

    public final boolean getClipToBounds() {
        return this.clipToBounds;
    }

    public final boolean getClipToOutline() {
        return this.clipToOutline;
    }

    /* renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
    public final int m4436getCompositingStrategyNrFUSI() {
        return this.compositingStrategy;
    }

    public final float getElevation() {
        return this.elevation;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getLeft() {
        return this.left;
    }

    public final float getPivotX() {
        return this.pivotX;
    }

    public final float getPivotY() {
        return this.pivotY;
    }

    public final RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    public final int getRight() {
        return this.right;
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

    public final int getSpotShadowColor() {
        return this.spotShadowColor;
    }

    public final int getTop() {
        return this.top;
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    public final long getUniqueId() {
        return this.uniqueId;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int hashCode;
        int a9 = ((((((((((((((((((((((((((((((((((((((((((((androidx.collection.a.a(this.uniqueId) * 31) + this.left) * 31) + this.top) * 31) + this.right) * 31) + this.bottom) * 31) + this.width) * 31) + this.height) * 31) + Float.floatToIntBits(this.scaleX)) * 31) + Float.floatToIntBits(this.scaleY)) * 31) + Float.floatToIntBits(this.translationX)) * 31) + Float.floatToIntBits(this.translationY)) * 31) + Float.floatToIntBits(this.elevation)) * 31) + this.ambientShadowColor) * 31) + this.spotShadowColor) * 31) + Float.floatToIntBits(this.rotationZ)) * 31) + Float.floatToIntBits(this.rotationX)) * 31) + Float.floatToIntBits(this.rotationY)) * 31) + Float.floatToIntBits(this.cameraDistance)) * 31) + Float.floatToIntBits(this.pivotX)) * 31) + Float.floatToIntBits(this.pivotY)) * 31) + androidx.compose.foundation.a.a(this.clipToOutline)) * 31) + androidx.compose.foundation.a.a(this.clipToBounds)) * 31) + Float.floatToIntBits(this.alpha)) * 31;
        RenderEffect renderEffect = this.renderEffect;
        if (renderEffect == null) {
            hashCode = 0;
        } else {
            hashCode = renderEffect.hashCode();
        }
        return ((a9 + hashCode) * 31) + CompositingStrategy.m3033hashCodeimpl(this.compositingStrategy);
    }

    public final void setAlpha(float f8) {
        this.alpha = f8;
    }

    public final void setAmbientShadowColor(int i8) {
        this.ambientShadowColor = i8;
    }

    public final void setCameraDistance(float f8) {
        this.cameraDistance = f8;
    }

    public final void setClipToBounds(boolean z8) {
        this.clipToBounds = z8;
    }

    public final void setClipToOutline(boolean z8) {
        this.clipToOutline = z8;
    }

    /* renamed from: setCompositingStrategy-aDBOjCE, reason: not valid java name */
    public final void m4437setCompositingStrategyaDBOjCE(int i8) {
        this.compositingStrategy = i8;
    }

    public final void setElevation(float f8) {
        this.elevation = f8;
    }

    public final void setPivotX(float f8) {
        this.pivotX = f8;
    }

    public final void setPivotY(float f8) {
        this.pivotY = f8;
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

    public final void setSpotShadowColor(int i8) {
        this.spotShadowColor = i8;
    }

    public final void setTranslationX(float f8) {
        this.translationX = f8;
    }

    public final void setTranslationY(float f8) {
        this.translationY = f8;
    }

    public String toString() {
        return "DeviceRenderNodeData(uniqueId=" + this.uniqueId + ", left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + ", width=" + this.width + ", height=" + this.height + ", scaleX=" + this.scaleX + ", scaleY=" + this.scaleY + ", translationX=" + this.translationX + ", translationY=" + this.translationY + ", elevation=" + this.elevation + ", ambientShadowColor=" + this.ambientShadowColor + ", spotShadowColor=" + this.spotShadowColor + ", rotationZ=" + this.rotationZ + ", rotationX=" + this.rotationX + ", rotationY=" + this.rotationY + ", cameraDistance=" + this.cameraDistance + ", pivotX=" + this.pivotX + ", pivotY=" + this.pivotY + ", clipToOutline=" + this.clipToOutline + ", clipToBounds=" + this.clipToBounds + ", alpha=" + this.alpha + ", renderEffect=" + this.renderEffect + ", compositingStrategy=" + ((Object) CompositingStrategy.m3034toStringimpl(this.compositingStrategy)) + ')';
    }

    private DeviceRenderNodeData(long j8, int i8, int i9, int i10, int i11, int i12, int i13, float f8, float f9, float f10, float f11, float f12, int i14, int i15, float f13, float f14, float f15, float f16, float f17, float f18, boolean z8, boolean z9, float f19, RenderEffect renderEffect, int i16) {
        this.uniqueId = j8;
        this.left = i8;
        this.top = i9;
        this.right = i10;
        this.bottom = i11;
        this.width = i12;
        this.height = i13;
        this.scaleX = f8;
        this.scaleY = f9;
        this.translationX = f10;
        this.translationY = f11;
        this.elevation = f12;
        this.ambientShadowColor = i14;
        this.spotShadowColor = i15;
        this.rotationZ = f13;
        this.rotationX = f14;
        this.rotationY = f15;
        this.cameraDistance = f16;
        this.pivotX = f17;
        this.pivotY = f18;
        this.clipToOutline = z8;
        this.clipToBounds = z9;
        this.alpha = f19;
        this.renderEffect = renderEffect;
        this.compositingStrategy = i16;
    }
}
