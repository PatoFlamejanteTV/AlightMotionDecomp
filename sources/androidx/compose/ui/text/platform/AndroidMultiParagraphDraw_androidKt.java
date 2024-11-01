package androidx.compose.ui.text.platform;

import android.graphics.Matrix;
import android.graphics.Shader;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.BrushKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.ParagraphInfo;
import androidx.compose.ui.text.style.TextDecoration;
import java.util.List;

/* loaded from: classes.dex */
public final class AndroidMultiParagraphDraw_androidKt {
    /* renamed from: drawMultiParagraph-7AXcY_I, reason: not valid java name */
    public static final void m4911drawMultiParagraph7AXcY_I(MultiParagraph multiParagraph, Canvas canvas, Brush brush, float f8, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i8) {
        canvas.save();
        if (multiParagraph.getParagraphInfoList$ui_text_release().size() <= 1) {
            m4913drawParagraphs7AXcY_I(multiParagraph, canvas, brush, f8, shadow, textDecoration, drawStyle, i8);
        } else if (brush instanceof SolidColor) {
            m4913drawParagraphs7AXcY_I(multiParagraph, canvas, brush, f8, shadow, textDecoration, drawStyle, i8);
        } else if (brush instanceof ShaderBrush) {
            List<ParagraphInfo> paragraphInfoList$ui_text_release = multiParagraph.getParagraphInfoList$ui_text_release();
            int size = paragraphInfoList$ui_text_release.size();
            float f9 = 0.0f;
            float f10 = 0.0f;
            for (int i9 = 0; i9 < size; i9++) {
                ParagraphInfo paragraphInfo = paragraphInfoList$ui_text_release.get(i9);
                f10 += paragraphInfo.getParagraph().getHeight();
                f9 = Math.max(f9, paragraphInfo.getParagraph().getWidth());
            }
            Shader mo2923createShaderuvyYCjk = ((ShaderBrush) brush).mo2923createShaderuvyYCjk(SizeKt.Size(f9, f10));
            Matrix matrix = new Matrix();
            mo2923createShaderuvyYCjk.getLocalMatrix(matrix);
            List<ParagraphInfo> paragraphInfoList$ui_text_release2 = multiParagraph.getParagraphInfoList$ui_text_release();
            int size2 = paragraphInfoList$ui_text_release2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                ParagraphInfo paragraphInfo2 = paragraphInfoList$ui_text_release2.get(i10);
                paragraphInfo2.getParagraph().mo4524painthn5TExg(canvas, BrushKt.ShaderBrush(mo2923createShaderuvyYCjk), f8, shadow, textDecoration, drawStyle, i8);
                canvas.translate(0.0f, paragraphInfo2.getParagraph().getHeight());
                matrix.setTranslate(0.0f, -paragraphInfo2.getParagraph().getHeight());
                mo2923createShaderuvyYCjk.setLocalMatrix(matrix);
            }
        }
        canvas.restore();
    }

    /* renamed from: drawMultiParagraph-7AXcY_I$default, reason: not valid java name */
    public static /* synthetic */ void m4912drawMultiParagraph7AXcY_I$default(MultiParagraph multiParagraph, Canvas canvas, Brush brush, float f8, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i8, int i9, Object obj) {
        float f9;
        Shadow shadow2;
        TextDecoration textDecoration2;
        DrawStyle drawStyle2;
        int i10;
        if ((i9 & 4) != 0) {
            f9 = Float.NaN;
        } else {
            f9 = f8;
        }
        if ((i9 & 8) != 0) {
            shadow2 = null;
        } else {
            shadow2 = shadow;
        }
        if ((i9 & 16) != 0) {
            textDecoration2 = null;
        } else {
            textDecoration2 = textDecoration;
        }
        if ((i9 & 32) != 0) {
            drawStyle2 = null;
        } else {
            drawStyle2 = drawStyle;
        }
        if ((i9 & 64) != 0) {
            i10 = BlendMode.Companion.m2896getSrcOver0nO6VwU();
        } else {
            i10 = i8;
        }
        m4911drawMultiParagraph7AXcY_I(multiParagraph, canvas, brush, f9, shadow2, textDecoration2, drawStyle2, i10);
    }

    /* renamed from: drawParagraphs-7AXcY_I, reason: not valid java name */
    private static final void m4913drawParagraphs7AXcY_I(MultiParagraph multiParagraph, Canvas canvas, Brush brush, float f8, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i8) {
        List<ParagraphInfo> paragraphInfoList$ui_text_release = multiParagraph.getParagraphInfoList$ui_text_release();
        int size = paragraphInfoList$ui_text_release.size();
        for (int i9 = 0; i9 < size; i9++) {
            ParagraphInfo paragraphInfo = paragraphInfoList$ui_text_release.get(i9);
            paragraphInfo.getParagraph().mo4524painthn5TExg(canvas, brush, f8, shadow, textDecoration, drawStyle, i8);
            canvas.translate(0.0f, paragraphInfo.getParagraph().getHeight());
        }
    }
}
