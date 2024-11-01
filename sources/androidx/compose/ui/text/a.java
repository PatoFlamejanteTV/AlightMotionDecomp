package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.style.TextDecoration;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ int a(Paragraph paragraph, int i8, boolean z8, int i9, Object obj) {
        if (obj == null) {
            if ((i9 & 2) != 0) {
                z8 = false;
            }
            return paragraph.getLineEnd(i8, z8);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEnd");
    }

    public static /* synthetic */ void b(Paragraph paragraph, Canvas canvas, long j8, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i8, int i9, Object obj) {
        long j9;
        Shadow shadow2;
        TextDecoration textDecoration2;
        int i10;
        if (obj == null) {
            if ((i9 & 2) != 0) {
                j9 = Color.Companion.m2984getUnspecified0d7_KjU();
            } else {
                j9 = j8;
            }
            DrawStyle drawStyle2 = null;
            if ((i9 & 4) != 0) {
                shadow2 = null;
            } else {
                shadow2 = shadow;
            }
            if ((i9 & 8) != 0) {
                textDecoration2 = null;
            } else {
                textDecoration2 = textDecoration;
            }
            if ((i9 & 16) == 0) {
                drawStyle2 = drawStyle;
            }
            if ((i9 & 32) != 0) {
                i10 = DrawScope.Companion.m3421getDefaultBlendMode0nO6VwU();
            } else {
                i10 = i8;
            }
            paragraph.mo4522paintLG529CI(canvas, j9, shadow2, textDecoration2, drawStyle2, i10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-LG529CI");
    }

    public static /* synthetic */ void c(Paragraph paragraph, Canvas canvas, long j8, Shadow shadow, TextDecoration textDecoration, int i8, Object obj) {
        Shadow shadow2;
        TextDecoration textDecoration2;
        if (obj == null) {
            if ((i8 & 2) != 0) {
                j8 = Color.Companion.m2984getUnspecified0d7_KjU();
            }
            long j9 = j8;
            if ((i8 & 4) != 0) {
                shadow2 = null;
            } else {
                shadow2 = shadow;
            }
            if ((i8 & 8) != 0) {
                textDecoration2 = null;
            } else {
                textDecoration2 = textDecoration;
            }
            paragraph.mo4523paintRPmYEkk(canvas, j9, shadow2, textDecoration2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-RPmYEkk");
    }

    public static /* synthetic */ void d(Paragraph paragraph, Canvas canvas, Brush brush, float f8, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i8, int i9, Object obj) {
        float f9;
        Shadow shadow2;
        TextDecoration textDecoration2;
        DrawStyle drawStyle2;
        int i10;
        if (obj == null) {
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
                i10 = DrawScope.Companion.m3421getDefaultBlendMode0nO6VwU();
            } else {
                i10 = i8;
            }
            paragraph.mo4524painthn5TExg(canvas, brush, f9, shadow2, textDecoration2, drawStyle2, i10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-hn5TExg");
    }
}
