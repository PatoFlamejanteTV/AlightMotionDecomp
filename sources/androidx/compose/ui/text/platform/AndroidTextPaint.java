package androidx.compose.ui.text.platform;

import android.text.TextPaint;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.text.platform.extensions.TextPaintExtensions_androidKt;
import androidx.compose.ui.text.style.TextDecoration;
import i6.m;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class AndroidTextPaint extends TextPaint {
    public static final int $stable = 8;
    private final Paint composePaint;
    private DrawStyle drawStyle;
    private Shadow shadow;
    private TextDecoration textDecoration;

    public AndroidTextPaint(int i8, float f8) {
        super(i8);
        ((TextPaint) this).density = f8;
        this.composePaint = AndroidPaint_androidKt.asComposePaint(this);
        this.textDecoration = TextDecoration.Companion.getNone();
        this.shadow = Shadow.Companion.getNone();
    }

    @VisibleForTesting
    public static /* synthetic */ void getShadow$ui_text_release$annotations() {
    }

    /* renamed from: setBrush-12SF9DM$default, reason: not valid java name */
    public static /* synthetic */ void m4920setBrush12SF9DM$default(AndroidTextPaint androidTextPaint, Brush brush, long j8, float f8, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            f8 = Float.NaN;
        }
        androidTextPaint.m4923setBrush12SF9DM(brush, j8, f8);
    }

    /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    public final int m4921getBlendMode0nO6VwU() {
        return this.composePaint.mo2826getBlendMode0nO6VwU();
    }

    public final Shadow getShadow$ui_text_release() {
        return this.shadow;
    }

    /* renamed from: setBlendMode-s9anfk8, reason: not valid java name */
    public final void m4922setBlendModes9anfk8(int i8) {
        this.composePaint.mo2832setBlendModes9anfk8(i8);
    }

    /* renamed from: setBrush-12SF9DM, reason: not valid java name */
    public final void m4923setBrush12SF9DM(Brush brush, long j8, float f8) {
        float j9;
        if (((brush instanceof SolidColor) && ((SolidColor) brush).m3260getValue0d7_KjU() != Color.Companion.m2984getUnspecified0d7_KjU()) || ((brush instanceof ShaderBrush) && j8 != Size.Companion.m2789getUnspecifiedNHjbRc())) {
            Paint paint = this.composePaint;
            if (Float.isNaN(f8)) {
                j9 = this.composePaint.getAlpha();
            } else {
                j9 = m.j(f8, 0.0f, 1.0f);
            }
            brush.mo2901applyToPq9zytI(j8, paint, j9);
            return;
        }
        if (brush == null) {
            this.composePaint.setShader(null);
        }
    }

    /* renamed from: setColor-8_81llA, reason: not valid java name */
    public final void m4924setColor8_81llA(long j8) {
        if (j8 != Color.Companion.m2984getUnspecified0d7_KjU()) {
            this.composePaint.mo2833setColor8_81llA(j8);
            this.composePaint.setShader(null);
        }
    }

    public final void setDrawStyle(DrawStyle drawStyle) {
        if (drawStyle != null && !AbstractC3292y.d(this.drawStyle, drawStyle)) {
            this.drawStyle = drawStyle;
            if (AbstractC3292y.d(drawStyle, Fill.INSTANCE)) {
                this.composePaint.mo2837setStylek9PVt8s(PaintingStyle.Companion.m3195getFillTiuSbCo());
                return;
            }
            if (drawStyle instanceof Stroke) {
                this.composePaint.mo2837setStylek9PVt8s(PaintingStyle.Companion.m3196getStrokeTiuSbCo());
                Stroke stroke = (Stroke) drawStyle;
                this.composePaint.setStrokeWidth(stroke.getWidth());
                this.composePaint.setStrokeMiterLimit(stroke.getMiter());
                this.composePaint.mo2836setStrokeJoinWw9F2mQ(stroke.m3480getJoinLxFBmk8());
                this.composePaint.mo2835setStrokeCapBeK7IIE(stroke.m3479getCapKaPHkGw());
                this.composePaint.setPathEffect(stroke.getPathEffect());
            }
        }
    }

    public final void setShadow(Shadow shadow) {
        if (shadow != null && !AbstractC3292y.d(this.shadow, shadow)) {
            this.shadow = shadow;
            if (AbstractC3292y.d(shadow, Shadow.Companion.getNone())) {
                clearShadowLayer();
            } else {
                setShadowLayer(TextPaintExtensions_androidKt.correctBlurRadius(this.shadow.getBlurRadius()), Offset.m2712getXimpl(this.shadow.m3251getOffsetF1C5BW0()), Offset.m2713getYimpl(this.shadow.m3251getOffsetF1C5BW0()), ColorKt.m3002toArgb8_81llA(this.shadow.m3250getColor0d7_KjU()));
            }
        }
    }

    public final void setShadow$ui_text_release(Shadow shadow) {
        this.shadow = shadow;
    }

    public final void setTextDecoration(TextDecoration textDecoration) {
        if (textDecoration != null && !AbstractC3292y.d(this.textDecoration, textDecoration)) {
            this.textDecoration = textDecoration;
            TextDecoration.Companion companion = TextDecoration.Companion;
            setUnderlineText(textDecoration.contains(companion.getUnderline()));
            setStrikeThruText(this.textDecoration.contains(companion.getLineThrough()));
        }
    }
}
