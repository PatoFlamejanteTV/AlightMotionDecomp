package androidx.compose.ui.platform;

import android.os.Build;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.layout.GraphicLayerInfo;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;

@StabilityInferred(parameters = 0)
@RequiresApi(23)
/* loaded from: classes.dex */
public final class RenderNodeLayer implements OwnedLayer, GraphicLayerInfo {
    private Function1 drawBlock;
    private boolean drawnWithZ;
    private Function0 invalidateParentLayer;
    private boolean isDestroyed;
    private boolean isDirty;
    private int mutatedFields;
    private final OutlineResolver outlineResolver;
    private final AndroidComposeView ownerView;
    private final DeviceRenderNode renderNode;
    private Paint softwareLayerPaint;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC2072n getMatrix = RenderNodeLayer$Companion$getMatrix$1.INSTANCE;
    private final LayerMatrixCache<DeviceRenderNode> matrixCache = new LayerMatrixCache<>(getMatrix);
    private final CanvasHolder canvasHolder = new CanvasHolder();
    private long transformOrigin = TransformOrigin.Companion.m3316getCenterSzJe1aQ();

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    @RequiresApi(29)
    /* loaded from: classes.dex */
    private static final class UniqueDrawingIdApi29 {
        public static final UniqueDrawingIdApi29 INSTANCE = new UniqueDrawingIdApi29();

        private UniqueDrawingIdApi29() {
        }

        @DoNotInline
        public static final long getUniqueDrawingId(View view) {
            long uniqueDrawingId;
            uniqueDrawingId = view.getUniqueDrawingId();
            return uniqueDrawingId;
        }
    }

    public RenderNodeLayer(AndroidComposeView androidComposeView, Function1 function1, Function0 function0) {
        DeviceRenderNode renderNodeApi23;
        this.ownerView = androidComposeView;
        this.drawBlock = function1;
        this.invalidateParentLayer = function0;
        this.outlineResolver = new OutlineResolver(androidComposeView.getDensity());
        if (Build.VERSION.SDK_INT >= 29) {
            renderNodeApi23 = new RenderNodeApi29(androidComposeView);
        } else {
            renderNodeApi23 = new RenderNodeApi23(androidComposeView);
        }
        renderNodeApi23.setHasOverlappingRendering(true);
        renderNodeApi23.setClipToBounds(false);
        this.renderNode = renderNodeApi23;
    }

    private final void clipRenderNode(Canvas canvas) {
        if (this.renderNode.getClipToOutline() || this.renderNode.getClipToBounds()) {
            this.outlineResolver.clipToOutline(canvas);
        }
    }

    private final void setDirty(boolean z8) {
        if (z8 != this.isDirty) {
            this.isDirty = z8;
            this.ownerView.notifyLayerIsDirty$ui_release(this, z8);
        }
    }

    private final void triggerRepaint() {
        if (Build.VERSION.SDK_INT >= 26) {
            WrapperRenderNodeLayerHelperMethods.INSTANCE.onDescendantInvalidated(this.ownerView);
        } else {
            this.ownerView.invalidate();
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void destroy() {
        if (this.renderNode.getHasDisplayList()) {
            this.renderNode.discardDisplayList();
        }
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        this.isDestroyed = true;
        setDirty(false);
        this.ownerView.requestClearInvalidObservations();
        this.ownerView.recycle$ui_release(this);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void drawLayer(Canvas canvas) {
        android.graphics.Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        boolean z8 = false;
        if (nativeCanvas.isHardwareAccelerated()) {
            updateDisplayList();
            if (this.renderNode.getElevation() > 0.0f) {
                z8 = true;
            }
            this.drawnWithZ = z8;
            if (z8) {
                canvas.enableZ();
            }
            this.renderNode.drawInto(nativeCanvas);
            if (this.drawnWithZ) {
                canvas.disableZ();
                return;
            }
            return;
        }
        float left = this.renderNode.getLeft();
        float top = this.renderNode.getTop();
        float right = this.renderNode.getRight();
        float bottom = this.renderNode.getBottom();
        if (this.renderNode.getAlpha() < 1.0f) {
            Paint paint = this.softwareLayerPaint;
            if (paint == null) {
                paint = AndroidPaint_androidKt.Paint();
                this.softwareLayerPaint = paint;
            }
            paint.setAlpha(this.renderNode.getAlpha());
            nativeCanvas.saveLayer(left, top, right, bottom, paint.asFrameworkPaint());
        } else {
            canvas.save();
        }
        canvas.translate(left, top);
        canvas.mo2809concat58bKbWc(this.matrixCache.m4449calculateMatrixGrdbGEg(this.renderNode));
        clipRenderNode(canvas);
        Function1 function1 = this.drawBlock;
        if (function1 != null) {
            function1.invoke(canvas);
        }
        canvas.restore();
        setDirty(false);
    }

    @Override // androidx.compose.ui.layout.GraphicLayerInfo
    public long getLayerId() {
        return this.renderNode.getUniqueId();
    }

    public final AndroidComposeView getOwnerView() {
        return this.ownerView;
    }

    @Override // androidx.compose.ui.layout.GraphicLayerInfo
    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return UniqueDrawingIdApi29.getUniqueDrawingId(this.ownerView);
        }
        return -1L;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void invalidate() {
        if (!this.isDirty && !this.isDestroyed) {
            this.ownerView.invalidate();
            setDirty(true);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: inverseTransform-58bKbWc */
    public void mo4367inverseTransform58bKbWc(float[] fArr) {
        float[] m4448calculateInverseMatrixbWbORWo = this.matrixCache.m4448calculateInverseMatrixbWbORWo(this.renderNode);
        if (m4448calculateInverseMatrixbWbORWo != null) {
            Matrix.m3176timesAssign58bKbWc(fArr, m4448calculateInverseMatrixbWbORWo);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: isInLayer-k-4lQ0M */
    public boolean mo4368isInLayerk4lQ0M(long j8) {
        float m2712getXimpl = Offset.m2712getXimpl(j8);
        float m2713getYimpl = Offset.m2713getYimpl(j8);
        if (this.renderNode.getClipToBounds()) {
            if (0.0f <= m2712getXimpl && m2712getXimpl < this.renderNode.getWidth() && 0.0f <= m2713getYimpl && m2713getYimpl < this.renderNode.getHeight()) {
                return true;
            }
            return false;
        }
        if (!this.renderNode.getClipToOutline()) {
            return true;
        }
        return this.outlineResolver.m4471isInOutlinek4lQ0M(j8);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void mapBounds(MutableRect mutableRect, boolean z8) {
        if (z8) {
            float[] m4448calculateInverseMatrixbWbORWo = this.matrixCache.m4448calculateInverseMatrixbWbORWo(this.renderNode);
            if (m4448calculateInverseMatrixbWbORWo == null) {
                mutableRect.set(0.0f, 0.0f, 0.0f, 0.0f);
                return;
            } else {
                Matrix.m3167mapimpl(m4448calculateInverseMatrixbWbORWo, mutableRect);
                return;
            }
        }
        Matrix.m3167mapimpl(this.matrixCache.m4449calculateMatrixGrdbGEg(this.renderNode), mutableRect);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: mapOffset-8S9VItk */
    public long mo4369mapOffset8S9VItk(long j8, boolean z8) {
        if (z8) {
            float[] m4448calculateInverseMatrixbWbORWo = this.matrixCache.m4448calculateInverseMatrixbWbORWo(this.renderNode);
            if (m4448calculateInverseMatrixbWbORWo != null) {
                return Matrix.m3165mapMKHz9U(m4448calculateInverseMatrixbWbORWo, j8);
            }
            return Offset.Companion.m2726getInfiniteF1C5BW0();
        }
        return Matrix.m3165mapMKHz9U(this.matrixCache.m4449calculateMatrixGrdbGEg(this.renderNode), j8);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: move--gyyYBs */
    public void mo4370movegyyYBs(long j8) {
        int left = this.renderNode.getLeft();
        int top = this.renderNode.getTop();
        int m5279getXimpl = IntOffset.m5279getXimpl(j8);
        int m5280getYimpl = IntOffset.m5280getYimpl(j8);
        if (left != m5279getXimpl || top != m5280getYimpl) {
            if (left != m5279getXimpl) {
                this.renderNode.offsetLeftAndRight(m5279getXimpl - left);
            }
            if (top != m5280getYimpl) {
                this.renderNode.offsetTopAndBottom(m5280getYimpl - top);
            }
            triggerRepaint();
            this.matrixCache.invalidate();
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: resize-ozmzZPI */
    public void mo4371resizeozmzZPI(long j8) {
        int m5321getWidthimpl = IntSize.m5321getWidthimpl(j8);
        int m5320getHeightimpl = IntSize.m5320getHeightimpl(j8);
        float f8 = m5321getWidthimpl;
        this.renderNode.setPivotX(TransformOrigin.m3311getPivotFractionXimpl(this.transformOrigin) * f8);
        float f9 = m5320getHeightimpl;
        this.renderNode.setPivotY(TransformOrigin.m3312getPivotFractionYimpl(this.transformOrigin) * f9);
        DeviceRenderNode deviceRenderNode = this.renderNode;
        if (deviceRenderNode.setPosition(deviceRenderNode.getLeft(), this.renderNode.getTop(), this.renderNode.getLeft() + m5321getWidthimpl, this.renderNode.getTop() + m5320getHeightimpl)) {
            this.outlineResolver.m4472updateuvyYCjk(SizeKt.Size(f8, f9));
            this.renderNode.setOutline(this.outlineResolver.getOutline());
            invalidate();
            this.matrixCache.invalidate();
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void reuseLayer(Function1 function1, Function0 function0) {
        setDirty(false);
        this.isDestroyed = false;
        this.drawnWithZ = false;
        this.transformOrigin = TransformOrigin.Companion.m3316getCenterSzJe1aQ();
        this.drawBlock = function1;
        this.invalidateParentLayer = function0;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: transform-58bKbWc */
    public void mo4372transform58bKbWc(float[] fArr) {
        Matrix.m3176timesAssign58bKbWc(fArr, this.matrixCache.m4449calculateMatrixGrdbGEg(this.renderNode));
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void updateDisplayList() {
        Path path;
        if (this.isDirty || !this.renderNode.getHasDisplayList()) {
            if (this.renderNode.getClipToOutline() && !this.outlineResolver.getOutlineClipSupported()) {
                path = this.outlineResolver.getClipPath();
            } else {
                path = null;
            }
            Function1 function1 = this.drawBlock;
            if (function1 != null) {
                this.renderNode.record(this.canvasHolder, path, function1);
            }
            setDirty(false);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void updateLayerProperties(ReusableGraphicsLayerScope reusableGraphicsLayerScope, LayoutDirection layoutDirection, Density density) {
        boolean z8;
        boolean z9;
        Function0 function0;
        boolean z10;
        int mutatedFields$ui_release = reusableGraphicsLayerScope.getMutatedFields$ui_release() | this.mutatedFields;
        int i8 = mutatedFields$ui_release & 4096;
        if (i8 != 0) {
            this.transformOrigin = reusableGraphicsLayerScope.mo3117getTransformOriginSzJe1aQ();
        }
        boolean z11 = false;
        if (this.renderNode.getClipToOutline() && !this.outlineResolver.getOutlineClipSupported()) {
            z8 = true;
        } else {
            z8 = false;
        }
        if ((mutatedFields$ui_release & 1) != 0) {
            this.renderNode.setScaleX(reusableGraphicsLayerScope.getScaleX());
        }
        if ((mutatedFields$ui_release & 2) != 0) {
            this.renderNode.setScaleY(reusableGraphicsLayerScope.getScaleY());
        }
        if ((mutatedFields$ui_release & 4) != 0) {
            this.renderNode.setAlpha(reusableGraphicsLayerScope.getAlpha());
        }
        if ((mutatedFields$ui_release & 8) != 0) {
            this.renderNode.setTranslationX(reusableGraphicsLayerScope.getTranslationX());
        }
        if ((mutatedFields$ui_release & 16) != 0) {
            this.renderNode.setTranslationY(reusableGraphicsLayerScope.getTranslationY());
        }
        if ((mutatedFields$ui_release & 32) != 0) {
            this.renderNode.setElevation(reusableGraphicsLayerScope.getShadowElevation());
        }
        if ((mutatedFields$ui_release & 64) != 0) {
            this.renderNode.setAmbientShadowColor(ColorKt.m3002toArgb8_81llA(reusableGraphicsLayerScope.mo3113getAmbientShadowColor0d7_KjU()));
        }
        if ((mutatedFields$ui_release & 128) != 0) {
            this.renderNode.setSpotShadowColor(ColorKt.m3002toArgb8_81llA(reusableGraphicsLayerScope.mo3116getSpotShadowColor0d7_KjU()));
        }
        if ((mutatedFields$ui_release & 1024) != 0) {
            this.renderNode.setRotationZ(reusableGraphicsLayerScope.getRotationZ());
        }
        if ((mutatedFields$ui_release & 256) != 0) {
            this.renderNode.setRotationX(reusableGraphicsLayerScope.getRotationX());
        }
        if ((mutatedFields$ui_release & 512) != 0) {
            this.renderNode.setRotationY(reusableGraphicsLayerScope.getRotationY());
        }
        if ((mutatedFields$ui_release & 2048) != 0) {
            this.renderNode.setCameraDistance(reusableGraphicsLayerScope.getCameraDistance());
        }
        if (i8 != 0) {
            this.renderNode.setPivotX(TransformOrigin.m3311getPivotFractionXimpl(this.transformOrigin) * this.renderNode.getWidth());
            this.renderNode.setPivotY(TransformOrigin.m3312getPivotFractionYimpl(this.transformOrigin) * this.renderNode.getHeight());
        }
        if (reusableGraphicsLayerScope.getClip() && reusableGraphicsLayerScope.getShape() != RectangleShapeKt.getRectangleShape()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if ((mutatedFields$ui_release & 24576) != 0) {
            this.renderNode.setClipToOutline(z9);
            DeviceRenderNode deviceRenderNode = this.renderNode;
            if (reusableGraphicsLayerScope.getClip() && reusableGraphicsLayerScope.getShape() == RectangleShapeKt.getRectangleShape()) {
                z10 = true;
            } else {
                z10 = false;
            }
            deviceRenderNode.setClipToBounds(z10);
        }
        if ((131072 & mutatedFields$ui_release) != 0) {
            this.renderNode.setRenderEffect(reusableGraphicsLayerScope.getRenderEffect());
        }
        if ((32768 & mutatedFields$ui_release) != 0) {
            this.renderNode.mo4432setCompositingStrategyaDBOjCE(reusableGraphicsLayerScope.mo3114getCompositingStrategyNrFUSI());
        }
        boolean update = this.outlineResolver.update(reusableGraphicsLayerScope.getShape(), reusableGraphicsLayerScope.getAlpha(), z9, reusableGraphicsLayerScope.getShadowElevation(), layoutDirection, density);
        if (this.outlineResolver.getCacheIsDirty$ui_release()) {
            this.renderNode.setOutline(this.outlineResolver.getOutline());
        }
        if (z9 && !this.outlineResolver.getOutlineClipSupported()) {
            z11 = true;
        }
        if (z8 == z11 && (!z11 || !update)) {
            triggerRepaint();
        } else {
            invalidate();
        }
        if (!this.drawnWithZ && this.renderNode.getElevation() > 0.0f && (function0 = this.invalidateParentLayer) != null) {
            function0.invoke();
        }
        if ((mutatedFields$ui_release & Fields.MatrixAffectingFields) != 0) {
            this.matrixCache.invalidate();
        }
        this.mutatedFields = reusableGraphicsLayerScope.getMutatedFields$ui_release();
    }
}
