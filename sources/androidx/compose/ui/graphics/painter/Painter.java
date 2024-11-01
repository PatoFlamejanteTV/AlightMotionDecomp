package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public abstract class Painter {
    private ColorFilter colorFilter;
    private Paint layerPaint;
    private boolean useLayer;
    private float alpha = 1.0f;
    private LayoutDirection layoutDirection = LayoutDirection.Ltr;
    private final Function1 drawLambda = new Painter$drawLambda$1(this);

    private final void configureAlpha(float f8) {
        if (this.alpha != f8) {
            if (!applyAlpha(f8)) {
                if (f8 == 1.0f) {
                    Paint paint = this.layerPaint;
                    if (paint != null) {
                        paint.setAlpha(f8);
                    }
                    this.useLayer = false;
                } else {
                    obtainPaint().setAlpha(f8);
                    this.useLayer = true;
                }
            }
            this.alpha = f8;
        }
    }

    private final void configureColorFilter(ColorFilter colorFilter) {
        if (!AbstractC3292y.d(this.colorFilter, colorFilter)) {
            if (!applyColorFilter(colorFilter)) {
                if (colorFilter == null) {
                    Paint paint = this.layerPaint;
                    if (paint != null) {
                        paint.setColorFilter(null);
                    }
                    this.useLayer = false;
                } else {
                    obtainPaint().setColorFilter(colorFilter);
                    this.useLayer = true;
                }
            }
            this.colorFilter = colorFilter;
        }
    }

    private final void configureLayoutDirection(LayoutDirection layoutDirection) {
        if (this.layoutDirection != layoutDirection) {
            applyLayoutDirection(layoutDirection);
            this.layoutDirection = layoutDirection;
        }
    }

    /* renamed from: draw-x_KDEd0$default, reason: not valid java name */
    public static /* synthetic */ void m3490drawx_KDEd0$default(Painter painter, DrawScope drawScope, long j8, float f8, ColorFilter colorFilter, int i8, Object obj) {
        float f9;
        if (obj == null) {
            if ((i8 & 2) != 0) {
                f9 = 1.0f;
            } else {
                f9 = f8;
            }
            if ((i8 & 4) != 0) {
                colorFilter = null;
            }
            painter.m3491drawx_KDEd0(drawScope, j8, f9, colorFilter);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: draw-x_KDEd0");
    }

    private final Paint obtainPaint() {
        Paint paint = this.layerPaint;
        if (paint == null) {
            Paint Paint = AndroidPaint_androidKt.Paint();
            this.layerPaint = Paint;
            return Paint;
        }
        return paint;
    }

    protected boolean applyAlpha(float f8) {
        return false;
    }

    protected boolean applyColorFilter(ColorFilter colorFilter) {
        return false;
    }

    protected boolean applyLayoutDirection(LayoutDirection layoutDirection) {
        return false;
    }

    /* renamed from: draw-x_KDEd0, reason: not valid java name */
    public final void m3491drawx_KDEd0(DrawScope drawScope, long j8, float f8, ColorFilter colorFilter) {
        configureAlpha(f8);
        configureColorFilter(colorFilter);
        configureLayoutDirection(drawScope.getLayoutDirection());
        float m2781getWidthimpl = Size.m2781getWidthimpl(drawScope.mo3391getSizeNHjbRc()) - Size.m2781getWidthimpl(j8);
        float m2778getHeightimpl = Size.m2778getHeightimpl(drawScope.mo3391getSizeNHjbRc()) - Size.m2778getHeightimpl(j8);
        drawScope.getDrawContext().getTransform().inset(0.0f, 0.0f, m2781getWidthimpl, m2778getHeightimpl);
        if (f8 > 0.0f && Size.m2781getWidthimpl(j8) > 0.0f && Size.m2778getHeightimpl(j8) > 0.0f) {
            if (this.useLayer) {
                Rect m2752Recttz77jQw = RectKt.m2752Recttz77jQw(Offset.Companion.m2728getZeroF1C5BW0(), SizeKt.Size(Size.m2781getWidthimpl(j8), Size.m2778getHeightimpl(j8)));
                Canvas canvas = drawScope.getDrawContext().getCanvas();
                try {
                    canvas.saveLayer(m2752Recttz77jQw, obtainPaint());
                    onDraw(drawScope);
                } finally {
                    canvas.restore();
                }
            } else {
                onDraw(drawScope);
            }
        }
        drawScope.getDrawContext().getTransform().inset(-0.0f, -0.0f, -m2781getWidthimpl, -m2778getHeightimpl);
    }

    /* renamed from: getIntrinsicSize-NH-jbRc */
    public abstract long mo3485getIntrinsicSizeNHjbRc();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void onDraw(DrawScope drawScope);
}
