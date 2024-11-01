package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.core.view.ViewCompat;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
@RequiresApi(23)
/* loaded from: classes.dex */
public final class RenderNodeApi23 implements DeviceRenderNode {
    private static boolean testFailCreateRenderNode;
    private int bottom;
    private boolean clipToBounds;
    private int internalCompositingStrategy;
    private int left;
    private final AndroidComposeView ownerView;
    private RenderEffect renderEffect;
    private final RenderNode renderNode;
    private int right;
    private int top;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static boolean needToValidateAccess = true;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final boolean getTestFailCreateRenderNode$ui_release() {
            return RenderNodeApi23.testFailCreateRenderNode;
        }

        public final void setTestFailCreateRenderNode$ui_release(boolean z8) {
            RenderNodeApi23.testFailCreateRenderNode = z8;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public RenderNodeApi23(AndroidComposeView androidComposeView) {
        this.ownerView = androidComposeView;
        RenderNode create = RenderNode.create("Compose", androidComposeView);
        this.renderNode = create;
        this.internalCompositingStrategy = CompositingStrategy.Companion.m3036getAutoNrFUSI();
        if (needToValidateAccess) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            verifyShadowColorProperties(create);
            discardDisplayListInternal();
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
            needToValidateAccess = false;
        }
        if (!testFailCreateRenderNode) {
        } else {
            throw new NoClassDefFoundError();
        }
    }

    private final void discardDisplayListInternal() {
        if (Build.VERSION.SDK_INT >= 24) {
            RenderNodeVerificationHelper24.INSTANCE.discardDisplayList(this.renderNode);
        } else {
            RenderNodeVerificationHelper23.INSTANCE.destroyDisplayListData(this.renderNode);
        }
    }

    private final void verifyShadowColorProperties(RenderNode renderNode) {
        if (Build.VERSION.SDK_INT >= 28) {
            RenderNodeVerificationHelper28 renderNodeVerificationHelper28 = RenderNodeVerificationHelper28.INSTANCE;
            renderNodeVerificationHelper28.setAmbientShadowColor(renderNode, renderNodeVerificationHelper28.getAmbientShadowColor(renderNode));
            renderNodeVerificationHelper28.setSpotShadowColor(renderNode, renderNodeVerificationHelper28.getSpotShadowColor(renderNode));
        }
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void discardDisplayList() {
        discardDisplayListInternal();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void drawInto(Canvas canvas) {
        AbstractC3292y.g(canvas, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        ((DisplayListCanvas) canvas).drawRenderNode(this.renderNode);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public DeviceRenderNodeData dumpRenderNodeData() {
        return new DeviceRenderNodeData(0L, 0, 0, 0, 0, 0, 0, this.renderNode.getScaleX(), this.renderNode.getScaleY(), this.renderNode.getTranslationX(), this.renderNode.getTranslationY(), this.renderNode.getElevation(), getAmbientShadowColor(), getSpotShadowColor(), this.renderNode.getRotation(), this.renderNode.getRotationX(), this.renderNode.getRotationY(), this.renderNode.getCameraDistance(), this.renderNode.getPivotX(), this.renderNode.getPivotY(), this.renderNode.getClipToOutline(), getClipToBounds(), this.renderNode.getAlpha(), getRenderEffect(), this.internalCompositingStrategy, null);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getAlpha() {
        return this.renderNode.getAlpha();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getAmbientShadowColor() {
        if (Build.VERSION.SDK_INT >= 28) {
            return RenderNodeVerificationHelper28.INSTANCE.getAmbientShadowColor(this.renderNode);
        }
        return ViewCompat.MEASURED_STATE_MASK;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getBottom() {
        return this.bottom;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getCameraDistance() {
        return -this.renderNode.getCameraDistance();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public boolean getClipToBounds() {
        return this.clipToBounds;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public boolean getClipToOutline() {
        return this.renderNode.getClipToOutline();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    /* renamed from: getCompositingStrategy--NrFUSI */
    public int mo4431getCompositingStrategyNrFUSI() {
        return this.internalCompositingStrategy;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getElevation() {
        return this.renderNode.getElevation();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public boolean getHasDisplayList() {
        return this.renderNode.isValid();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getHeight() {
        return getBottom() - getTop();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void getInverseMatrix(Matrix matrix) {
        this.renderNode.getInverseMatrix(matrix);
    }

    public final int getLayerType$ui_release() {
        if (CompositingStrategy.m3032equalsimpl0(this.internalCompositingStrategy, CompositingStrategy.Companion.m3038getOffscreenNrFUSI())) {
            return 2;
        }
        return 0;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getLeft() {
        return this.left;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void getMatrix(Matrix matrix) {
        this.renderNode.getMatrix(matrix);
    }

    public final AndroidComposeView getOwnerView() {
        return this.ownerView;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getPivotX() {
        return this.renderNode.getPivotX();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getPivotY() {
        return this.renderNode.getPivotY();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getRight() {
        return this.right;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getRotationX() {
        return this.renderNode.getRotationX();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getRotationY() {
        return this.renderNode.getRotationY();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getRotationZ() {
        return this.renderNode.getRotation();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getScaleX() {
        return this.renderNode.getScaleX();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getScaleY() {
        return this.renderNode.getScaleY();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getSpotShadowColor() {
        if (Build.VERSION.SDK_INT >= 28) {
            return RenderNodeVerificationHelper28.INSTANCE.getSpotShadowColor(this.renderNode);
        }
        return ViewCompat.MEASURED_STATE_MASK;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getTop() {
        return this.top;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getTranslationX() {
        return this.renderNode.getTranslationX();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getTranslationY() {
        return this.renderNode.getTranslationY();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public long getUniqueId() {
        return 0L;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getWidth() {
        return getRight() - getLeft();
    }

    public final boolean hasOverlappingRendering$ui_release() {
        return this.renderNode.hasOverlappingRendering();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void offsetLeftAndRight(int i8) {
        setLeft(getLeft() + i8);
        setRight(getRight() + i8);
        this.renderNode.offsetLeftAndRight(i8);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void offsetTopAndBottom(int i8) {
        setTop(getTop() + i8);
        setBottom(getBottom() + i8);
        this.renderNode.offsetTopAndBottom(i8);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void record(CanvasHolder canvasHolder, Path path, Function1 function1) {
        DisplayListCanvas start = this.renderNode.start(getWidth(), getHeight());
        Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().setInternalCanvas((Canvas) start);
        AndroidCanvas androidCanvas = canvasHolder.getAndroidCanvas();
        if (path != null) {
            androidCanvas.save();
            androidx.compose.ui.graphics.T.m(androidCanvas, path, 0, 2, null);
        }
        function1.invoke(androidCanvas);
        if (path != null) {
            androidCanvas.restore();
        }
        canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
        this.renderNode.end(start);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setAlpha(float f8) {
        this.renderNode.setAlpha(f8);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setAmbientShadowColor(int i8) {
        if (Build.VERSION.SDK_INT >= 28) {
            RenderNodeVerificationHelper28.INSTANCE.setAmbientShadowColor(this.renderNode, i8);
        }
    }

    public void setBottom(int i8) {
        this.bottom = i8;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setCameraDistance(float f8) {
        this.renderNode.setCameraDistance(-f8);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setClipToBounds(boolean z8) {
        this.clipToBounds = z8;
        this.renderNode.setClipToBounds(z8);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setClipToOutline(boolean z8) {
        this.renderNode.setClipToOutline(z8);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    /* renamed from: setCompositingStrategy-aDBOjCE */
    public void mo4432setCompositingStrategyaDBOjCE(int i8) {
        CompositingStrategy.Companion companion = CompositingStrategy.Companion;
        if (CompositingStrategy.m3032equalsimpl0(i8, companion.m3038getOffscreenNrFUSI())) {
            this.renderNode.setLayerType(2);
            this.renderNode.setHasOverlappingRendering(true);
        } else if (CompositingStrategy.m3032equalsimpl0(i8, companion.m3037getModulateAlphaNrFUSI())) {
            this.renderNode.setLayerType(0);
            this.renderNode.setHasOverlappingRendering(false);
        } else {
            this.renderNode.setLayerType(0);
            this.renderNode.setHasOverlappingRendering(true);
        }
        this.internalCompositingStrategy = i8;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setElevation(float f8) {
        this.renderNode.setElevation(f8);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public boolean setHasOverlappingRendering(boolean z8) {
        return this.renderNode.setHasOverlappingRendering(z8);
    }

    public void setLeft(int i8) {
        this.left = i8;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setOutline(Outline outline) {
        this.renderNode.setOutline(outline);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setPivotX(float f8) {
        this.renderNode.setPivotX(f8);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setPivotY(float f8) {
        this.renderNode.setPivotY(f8);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public boolean setPosition(int i8, int i9, int i10, int i11) {
        setLeft(i8);
        setTop(i9);
        setRight(i10);
        setBottom(i11);
        return this.renderNode.setLeftTopRightBottom(i8, i9, i10, i11);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setRenderEffect(RenderEffect renderEffect) {
        this.renderEffect = renderEffect;
    }

    public void setRight(int i8) {
        this.right = i8;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setRotationX(float f8) {
        this.renderNode.setRotationX(f8);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setRotationY(float f8) {
        this.renderNode.setRotationY(f8);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setRotationZ(float f8) {
        this.renderNode.setRotation(f8);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setScaleX(float f8) {
        this.renderNode.setScaleX(f8);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setScaleY(float f8) {
        this.renderNode.setScaleY(f8);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setSpotShadowColor(int i8) {
        if (Build.VERSION.SDK_INT >= 28) {
            RenderNodeVerificationHelper28.INSTANCE.setSpotShadowColor(this.renderNode, i8);
        }
    }

    public void setTop(int i8) {
        this.top = i8;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setTranslationX(float f8) {
        this.renderNode.setTranslationX(f8);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setTranslationY(float f8) {
        this.renderNode.setTranslationY(f8);
    }
}
