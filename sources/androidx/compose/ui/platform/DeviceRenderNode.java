package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RenderEffect;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public interface DeviceRenderNode {
    void discardDisplayList();

    void drawInto(Canvas canvas);

    DeviceRenderNodeData dumpRenderNodeData();

    float getAlpha();

    int getAmbientShadowColor();

    int getBottom();

    float getCameraDistance();

    boolean getClipToBounds();

    boolean getClipToOutline();

    /* renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
    int mo4431getCompositingStrategyNrFUSI();

    float getElevation();

    boolean getHasDisplayList();

    int getHeight();

    void getInverseMatrix(Matrix matrix);

    int getLeft();

    void getMatrix(Matrix matrix);

    float getPivotX();

    float getPivotY();

    RenderEffect getRenderEffect();

    int getRight();

    float getRotationX();

    float getRotationY();

    float getRotationZ();

    float getScaleX();

    float getScaleY();

    int getSpotShadowColor();

    int getTop();

    float getTranslationX();

    float getTranslationY();

    long getUniqueId();

    int getWidth();

    void offsetLeftAndRight(int i8);

    void offsetTopAndBottom(int i8);

    void record(CanvasHolder canvasHolder, Path path, Function1 function1);

    void setAlpha(float f8);

    void setAmbientShadowColor(int i8);

    void setCameraDistance(float f8);

    void setClipToBounds(boolean z8);

    void setClipToOutline(boolean z8);

    /* renamed from: setCompositingStrategy-aDBOjCE, reason: not valid java name */
    void mo4432setCompositingStrategyaDBOjCE(int i8);

    void setElevation(float f8);

    boolean setHasOverlappingRendering(boolean z8);

    void setOutline(Outline outline);

    void setPivotX(float f8);

    void setPivotY(float f8);

    boolean setPosition(int i8, int i9, int i10, int i11);

    void setRenderEffect(RenderEffect renderEffect);

    void setRotationX(float f8);

    void setRotationY(float f8);

    void setRotationZ(float f8);

    void setScaleX(float f8);

    void setScaleY(float f8);

    void setSpotShadowColor(int i8);

    void setTranslationX(float f8);

    void setTranslationY(float f8);
}
