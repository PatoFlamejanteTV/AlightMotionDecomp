package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Matrix;
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
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class ViewLayer extends View implements OwnedLayer, GraphicLayerInfo {
    private static boolean hasRetrievedMethod;
    private static Field recreateDisplayList;
    private static boolean shouldUseDispatchDraw;
    private static Method updateDisplayListIfDirtyMethod;
    private final CanvasHolder canvasHolder;
    private Rect clipBoundsCache;
    private boolean clipToBounds;
    private final DrawChildContainer container;
    private Function1 drawBlock;
    private boolean drawnWithZ;
    private Function0 invalidateParentLayer;
    private boolean isInvalidated;
    private final long layerId;
    private boolean mHasOverlappingRendering;
    private long mTransformOrigin;
    private final LayerMatrixCache<View> matrixCache;
    private int mutatedFields;
    private final OutlineResolver outlineResolver;
    private final AndroidComposeView ownerView;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC2072n getMatrix = ViewLayer$Companion$getMatrix$1.INSTANCE;
    private static final ViewOutlineProvider OutlineProvider = new ViewOutlineProvider() { // from class: androidx.compose.ui.platform.ViewLayer$Companion$OutlineProvider$1
        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            OutlineResolver outlineResolver;
            AbstractC3292y.g(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            outlineResolver = ((ViewLayer) view).outlineResolver;
            Outline outline2 = outlineResolver.getOutline();
            AbstractC3292y.f(outline2);
            outline.set(outline2);
        }
    };

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final boolean getHasRetrievedMethod() {
            return ViewLayer.hasRetrievedMethod;
        }

        public final ViewOutlineProvider getOutlineProvider() {
            return ViewLayer.OutlineProvider;
        }

        public final boolean getShouldUseDispatchDraw() {
            return ViewLayer.shouldUseDispatchDraw;
        }

        public final void setShouldUseDispatchDraw$ui_release(boolean z8) {
            ViewLayer.shouldUseDispatchDraw = z8;
        }

        @SuppressLint({"BanUncheckedReflection"})
        public final void updateDisplayList(View view) {
            try {
                if (!getHasRetrievedMethod()) {
                    ViewLayer.hasRetrievedMethod = true;
                    if (Build.VERSION.SDK_INT < 28) {
                        ViewLayer.updateDisplayListIfDirtyMethod = View.class.getDeclaredMethod("updateDisplayListIfDirty", null);
                        ViewLayer.recreateDisplayList = View.class.getDeclaredField("mRecreateDisplayList");
                    } else {
                        ViewLayer.updateDisplayListIfDirtyMethod = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                        ViewLayer.recreateDisplayList = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                    }
                    Method method = ViewLayer.updateDisplayListIfDirtyMethod;
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    Field field = ViewLayer.recreateDisplayList;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                }
                Field field2 = ViewLayer.recreateDisplayList;
                if (field2 != null) {
                    field2.setBoolean(view, true);
                }
                Method method2 = ViewLayer.updateDisplayListIfDirtyMethod;
                if (method2 != null) {
                    method2.invoke(view, null);
                }
            } catch (Throwable unused) {
                setShouldUseDispatchDraw$ui_release(true);
            }
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

    public ViewLayer(AndroidComposeView androidComposeView, DrawChildContainer drawChildContainer, Function1 function1, Function0 function0) {
        super(androidComposeView.getContext());
        this.ownerView = androidComposeView;
        this.container = drawChildContainer;
        this.drawBlock = function1;
        this.invalidateParentLayer = function0;
        this.outlineResolver = new OutlineResolver(androidComposeView.getDensity());
        this.canvasHolder = new CanvasHolder();
        this.matrixCache = new LayerMatrixCache<>(getMatrix);
        this.mTransformOrigin = TransformOrigin.Companion.m3316getCenterSzJe1aQ();
        this.mHasOverlappingRendering = true;
        setWillNotDraw(false);
        drawChildContainer.addView(this);
        this.layerId = View.generateViewId();
    }

    private final Path getManualClipPath() {
        if (getClipToOutline() && !this.outlineResolver.getOutlineClipSupported()) {
            return this.outlineResolver.getClipPath();
        }
        return null;
    }

    private final void resetClipBounds() {
        Rect rect;
        if (this.clipToBounds) {
            Rect rect2 = this.clipBoundsCache;
            if (rect2 == null) {
                this.clipBoundsCache = new Rect(0, 0, getWidth(), getHeight());
            } else {
                AbstractC3292y.f(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.clipBoundsCache;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    private final void setInvalidated(boolean z8) {
        if (z8 != this.isInvalidated) {
            this.isInvalidated = z8;
            this.ownerView.notifyLayerIsDirty$ui_release(this, z8);
        }
    }

    private final void updateOutlineResolver() {
        ViewOutlineProvider viewOutlineProvider;
        if (this.outlineResolver.getOutline() != null) {
            viewOutlineProvider = OutlineProvider;
        } else {
            viewOutlineProvider = null;
        }
        setOutlineProvider(viewOutlineProvider);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void destroy() {
        setInvalidated(false);
        this.ownerView.requestClearInvalidObservations();
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        boolean recycle$ui_release = this.ownerView.recycle$ui_release(this);
        if (Build.VERSION.SDK_INT < 23 && !shouldUseDispatchDraw && recycle$ui_release) {
            setVisibility(8);
        } else {
            this.container.removeViewInLayout(this);
        }
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
        boolean z8;
        CanvasHolder canvasHolder = this.canvasHolder;
        Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().setInternalCanvas(canvas);
        AndroidCanvas androidCanvas = canvasHolder.getAndroidCanvas();
        if (getManualClipPath() == null && canvas.isHardwareAccelerated()) {
            z8 = false;
        } else {
            androidCanvas.save();
            this.outlineResolver.clipToOutline(androidCanvas);
            z8 = true;
        }
        Function1 function1 = this.drawBlock;
        if (function1 != null) {
            function1.invoke(androidCanvas);
        }
        if (z8) {
            androidCanvas.restore();
        }
        canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
        setInvalidated(false);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void drawLayer(androidx.compose.ui.graphics.Canvas canvas) {
        boolean z8;
        if (getElevation() > 0.0f) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.drawnWithZ = z8;
        if (z8) {
            canvas.enableZ();
        }
        this.container.drawChild$ui_release(canvas, this, getDrawingTime());
        if (this.drawnWithZ) {
            canvas.disableZ();
        }
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final DrawChildContainer getContainer() {
        return this.container;
    }

    @Override // androidx.compose.ui.layout.GraphicLayerInfo
    public long getLayerId() {
        return this.layerId;
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

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.mHasOverlappingRendering;
    }

    @Override // android.view.View, androidx.compose.ui.node.OwnedLayer
    public void invalidate() {
        if (!this.isInvalidated) {
            setInvalidated(true);
            super.invalidate();
            this.ownerView.invalidate();
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: inverseTransform-58bKbWc */
    public void mo4367inverseTransform58bKbWc(float[] fArr) {
        float[] m4448calculateInverseMatrixbWbORWo = this.matrixCache.m4448calculateInverseMatrixbWbORWo(this);
        if (m4448calculateInverseMatrixbWbORWo != null) {
            Matrix.m3176timesAssign58bKbWc(fArr, m4448calculateInverseMatrixbWbORWo);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: isInLayer-k-4lQ0M */
    public boolean mo4368isInLayerk4lQ0M(long j8) {
        float m2712getXimpl = Offset.m2712getXimpl(j8);
        float m2713getYimpl = Offset.m2713getYimpl(j8);
        if (this.clipToBounds) {
            if (0.0f <= m2712getXimpl && m2712getXimpl < getWidth() && 0.0f <= m2713getYimpl && m2713getYimpl < getHeight()) {
                return true;
            }
            return false;
        }
        if (!getClipToOutline()) {
            return true;
        }
        return this.outlineResolver.m4471isInOutlinek4lQ0M(j8);
    }

    public final boolean isInvalidated() {
        return this.isInvalidated;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void mapBounds(MutableRect mutableRect, boolean z8) {
        if (z8) {
            float[] m4448calculateInverseMatrixbWbORWo = this.matrixCache.m4448calculateInverseMatrixbWbORWo(this);
            if (m4448calculateInverseMatrixbWbORWo != null) {
                Matrix.m3167mapimpl(m4448calculateInverseMatrixbWbORWo, mutableRect);
                return;
            } else {
                mutableRect.set(0.0f, 0.0f, 0.0f, 0.0f);
                return;
            }
        }
        Matrix.m3167mapimpl(this.matrixCache.m4449calculateMatrixGrdbGEg(this), mutableRect);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: mapOffset-8S9VItk */
    public long mo4369mapOffset8S9VItk(long j8, boolean z8) {
        if (z8) {
            float[] m4448calculateInverseMatrixbWbORWo = this.matrixCache.m4448calculateInverseMatrixbWbORWo(this);
            if (m4448calculateInverseMatrixbWbORWo != null) {
                return Matrix.m3165mapMKHz9U(m4448calculateInverseMatrixbWbORWo, j8);
            }
            return Offset.Companion.m2726getInfiniteF1C5BW0();
        }
        return Matrix.m3165mapMKHz9U(this.matrixCache.m4449calculateMatrixGrdbGEg(this), j8);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: move--gyyYBs */
    public void mo4370movegyyYBs(long j8) {
        int m5279getXimpl = IntOffset.m5279getXimpl(j8);
        if (m5279getXimpl != getLeft()) {
            offsetLeftAndRight(m5279getXimpl - getLeft());
            this.matrixCache.invalidate();
        }
        int m5280getYimpl = IntOffset.m5280getYimpl(j8);
        if (m5280getYimpl != getTop()) {
            offsetTopAndBottom(m5280getYimpl - getTop());
            this.matrixCache.invalidate();
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: resize-ozmzZPI */
    public void mo4371resizeozmzZPI(long j8) {
        int m5321getWidthimpl = IntSize.m5321getWidthimpl(j8);
        int m5320getHeightimpl = IntSize.m5320getHeightimpl(j8);
        if (m5321getWidthimpl != getWidth() || m5320getHeightimpl != getHeight()) {
            float f8 = m5321getWidthimpl;
            setPivotX(TransformOrigin.m3311getPivotFractionXimpl(this.mTransformOrigin) * f8);
            float f9 = m5320getHeightimpl;
            setPivotY(TransformOrigin.m3312getPivotFractionYimpl(this.mTransformOrigin) * f9);
            this.outlineResolver.m4472updateuvyYCjk(SizeKt.Size(f8, f9));
            updateOutlineResolver();
            layout(getLeft(), getTop(), getLeft() + m5321getWidthimpl, getTop() + m5320getHeightimpl);
            resetClipBounds();
            this.matrixCache.invalidate();
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void reuseLayer(Function1 function1, Function0 function0) {
        if (Build.VERSION.SDK_INT < 23 && !shouldUseDispatchDraw) {
            setVisibility(0);
        } else {
            this.container.addView(this);
        }
        this.clipToBounds = false;
        this.drawnWithZ = false;
        this.mTransformOrigin = TransformOrigin.Companion.m3316getCenterSzJe1aQ();
        this.drawBlock = function1;
        this.invalidateParentLayer = function0;
    }

    public final void setCameraDistancePx(float f8) {
        setCameraDistance(f8 * getResources().getDisplayMetrics().densityDpi);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: transform-58bKbWc */
    public void mo4372transform58bKbWc(float[] fArr) {
        Matrix.m3176timesAssign58bKbWc(fArr, this.matrixCache.m4449calculateMatrixGrdbGEg(this));
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void updateDisplayList() {
        if (this.isInvalidated && !shouldUseDispatchDraw) {
            Companion.updateDisplayList(this);
            setInvalidated(false);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void updateLayerProperties(ReusableGraphicsLayerScope reusableGraphicsLayerScope, LayoutDirection layoutDirection, Density density) {
        boolean z8;
        boolean z9;
        boolean z10;
        Function0 function0;
        boolean z11;
        int mutatedFields$ui_release = reusableGraphicsLayerScope.getMutatedFields$ui_release() | this.mutatedFields;
        if ((mutatedFields$ui_release & 4096) != 0) {
            long mo3117getTransformOriginSzJe1aQ = reusableGraphicsLayerScope.mo3117getTransformOriginSzJe1aQ();
            this.mTransformOrigin = mo3117getTransformOriginSzJe1aQ;
            setPivotX(TransformOrigin.m3311getPivotFractionXimpl(mo3117getTransformOriginSzJe1aQ) * getWidth());
            setPivotY(TransformOrigin.m3312getPivotFractionYimpl(this.mTransformOrigin) * getHeight());
        }
        if ((mutatedFields$ui_release & 1) != 0) {
            setScaleX(reusableGraphicsLayerScope.getScaleX());
        }
        if ((mutatedFields$ui_release & 2) != 0) {
            setScaleY(reusableGraphicsLayerScope.getScaleY());
        }
        if ((mutatedFields$ui_release & 4) != 0) {
            setAlpha(reusableGraphicsLayerScope.getAlpha());
        }
        if ((mutatedFields$ui_release & 8) != 0) {
            setTranslationX(reusableGraphicsLayerScope.getTranslationX());
        }
        if ((mutatedFields$ui_release & 16) != 0) {
            setTranslationY(reusableGraphicsLayerScope.getTranslationY());
        }
        if ((mutatedFields$ui_release & 32) != 0) {
            setElevation(reusableGraphicsLayerScope.getShadowElevation());
        }
        if ((mutatedFields$ui_release & 1024) != 0) {
            setRotation(reusableGraphicsLayerScope.getRotationZ());
        }
        if ((mutatedFields$ui_release & 256) != 0) {
            setRotationX(reusableGraphicsLayerScope.getRotationX());
        }
        if ((mutatedFields$ui_release & 512) != 0) {
            setRotationY(reusableGraphicsLayerScope.getRotationY());
        }
        if ((mutatedFields$ui_release & 2048) != 0) {
            setCameraDistancePx(reusableGraphicsLayerScope.getCameraDistance());
        }
        boolean z12 = false;
        if (getManualClipPath() != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (reusableGraphicsLayerScope.getClip() && reusableGraphicsLayerScope.getShape() != RectangleShapeKt.getRectangleShape()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if ((mutatedFields$ui_release & 24576) != 0) {
            if (reusableGraphicsLayerScope.getClip() && reusableGraphicsLayerScope.getShape() == RectangleShapeKt.getRectangleShape()) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.clipToBounds = z11;
            resetClipBounds();
            setClipToOutline(z9);
        }
        boolean update = this.outlineResolver.update(reusableGraphicsLayerScope.getShape(), reusableGraphicsLayerScope.getAlpha(), z9, reusableGraphicsLayerScope.getShadowElevation(), layoutDirection, density);
        if (this.outlineResolver.getCacheIsDirty$ui_release()) {
            updateOutlineResolver();
        }
        if (getManualClipPath() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z8 != z10 || (z10 && update)) {
            invalidate();
        }
        if (!this.drawnWithZ && getElevation() > 0.0f && (function0 = this.invalidateParentLayer) != null) {
            function0.invoke();
        }
        if ((mutatedFields$ui_release & Fields.MatrixAffectingFields) != 0) {
            this.matrixCache.invalidate();
        }
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 28) {
            if ((mutatedFields$ui_release & 64) != 0) {
                ViewLayerVerificationHelper28.INSTANCE.setOutlineAmbientShadowColor(this, ColorKt.m3002toArgb8_81llA(reusableGraphicsLayerScope.mo3113getAmbientShadowColor0d7_KjU()));
            }
            if ((mutatedFields$ui_release & 128) != 0) {
                ViewLayerVerificationHelper28.INSTANCE.setOutlineSpotShadowColor(this, ColorKt.m3002toArgb8_81llA(reusableGraphicsLayerScope.mo3116getSpotShadowColor0d7_KjU()));
            }
        }
        if (i8 >= 31 && (131072 & mutatedFields$ui_release) != 0) {
            ViewLayerVerificationHelper31.INSTANCE.setRenderEffect(this, reusableGraphicsLayerScope.getRenderEffect());
        }
        if ((mutatedFields$ui_release & 32768) != 0) {
            int mo3114getCompositingStrategyNrFUSI = reusableGraphicsLayerScope.mo3114getCompositingStrategyNrFUSI();
            CompositingStrategy.Companion companion = CompositingStrategy.Companion;
            if (CompositingStrategy.m3032equalsimpl0(mo3114getCompositingStrategyNrFUSI, companion.m3038getOffscreenNrFUSI())) {
                setLayerType(2, null);
            } else if (CompositingStrategy.m3032equalsimpl0(mo3114getCompositingStrategyNrFUSI, companion.m3037getModulateAlphaNrFUSI())) {
                setLayerType(0, null);
                this.mHasOverlappingRendering = z12;
            } else {
                setLayerType(0, null);
            }
            z12 = true;
            this.mHasOverlappingRendering = z12;
        }
        this.mutatedFields = reusableGraphicsLayerScope.getMutatedFields$ui_release();
    }
}
