package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.IntSize;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class TextPainter {
    public static final int $stable = 0;
    public static final TextPainter INSTANCE = new TextPainter();

    private TextPainter() {
    }

    public final void paint(Canvas canvas, TextLayoutResult textLayoutResult) {
        boolean z8;
        long m2974getBlack0d7_KjU;
        float f8;
        if (textLayoutResult.getHasVisualOverflow() && !TextOverflow.m5101equalsimpl0(textLayoutResult.getLayoutInput().m4638getOverflowgIe3tQ8(), TextOverflow.Companion.m5110getVisiblegIe3tQ8())) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            Rect m2752Recttz77jQw = RectKt.m2752Recttz77jQw(Offset.Companion.m2728getZeroF1C5BW0(), SizeKt.Size(IntSize.m5321getWidthimpl(textLayoutResult.m4642getSizeYbymL2g()), IntSize.m5320getHeightimpl(textLayoutResult.m4642getSizeYbymL2g())));
            canvas.save();
            T.o(canvas, m2752Recttz77jQw, 0, 2, null);
        }
        SpanStyle spanStyle$ui_text_release = textLayoutResult.getLayoutInput().getStyle().getSpanStyle$ui_text_release();
        TextDecoration textDecoration = spanStyle$ui_text_release.getTextDecoration();
        if (textDecoration == null) {
            textDecoration = TextDecoration.Companion.getNone();
        }
        TextDecoration textDecoration2 = textDecoration;
        Shadow shadow = spanStyle$ui_text_release.getShadow();
        if (shadow == null) {
            shadow = Shadow.Companion.getNone();
        }
        Shadow shadow2 = shadow;
        DrawStyle drawStyle = spanStyle$ui_text_release.getDrawStyle();
        if (drawStyle == null) {
            drawStyle = Fill.INSTANCE;
        }
        DrawStyle drawStyle2 = drawStyle;
        try {
            Brush brush = spanStyle$ui_text_release.getBrush();
            if (brush != null) {
                if (spanStyle$ui_text_release.getTextForegroundStyle$ui_text_release() != TextForegroundStyle.Unspecified.INSTANCE) {
                    f8 = spanStyle$ui_text_release.getTextForegroundStyle$ui_text_release().getAlpha();
                } else {
                    f8 = 1.0f;
                }
                MultiParagraph.m4547painthn5TExg$default(textLayoutResult.getMultiParagraph(), canvas, brush, f8, shadow2, textDecoration2, drawStyle2, 0, 64, null);
            } else {
                if (spanStyle$ui_text_release.getTextForegroundStyle$ui_text_release() != TextForegroundStyle.Unspecified.INSTANCE) {
                    m2974getBlack0d7_KjU = spanStyle$ui_text_release.getTextForegroundStyle$ui_text_release().mo4957getColor0d7_KjU();
                } else {
                    m2974getBlack0d7_KjU = Color.Companion.m2974getBlack0d7_KjU();
                }
                MultiParagraph.m4545paintLG529CI$default(textLayoutResult.getMultiParagraph(), canvas, m2974getBlack0d7_KjU, shadow2, textDecoration2, drawStyle2, 0, 32, null);
            }
            if (z8) {
                canvas.restore();
            }
        } catch (Throwable th) {
            if (z8) {
                canvas.restore();
            }
            throw th;
        }
    }
}
