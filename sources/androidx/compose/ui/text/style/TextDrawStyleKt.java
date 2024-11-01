package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.SpanStyleKt;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class TextDrawStyleKt {
    public static final TextForegroundStyle lerp(TextForegroundStyle textForegroundStyle, TextForegroundStyle textForegroundStyle2, float f8) {
        boolean z8 = textForegroundStyle instanceof BrushStyle;
        if (!z8 && !(textForegroundStyle2 instanceof BrushStyle)) {
            return TextForegroundStyle.Companion.m5080from8_81llA(ColorKt.m2999lerpjxsXWHM(textForegroundStyle.mo4957getColor0d7_KjU(), textForegroundStyle2.mo4957getColor0d7_KjU(), f8));
        }
        if (z8 && (textForegroundStyle2 instanceof BrushStyle)) {
            return TextForegroundStyle.Companion.from((Brush) SpanStyleKt.lerpDiscrete(((BrushStyle) textForegroundStyle).getBrush(), ((BrushStyle) textForegroundStyle2).getBrush(), f8), MathHelpersKt.lerp(textForegroundStyle.getAlpha(), textForegroundStyle2.getAlpha(), f8));
        }
        return (TextForegroundStyle) SpanStyleKt.lerpDiscrete(textForegroundStyle, textForegroundStyle2, f8);
    }

    /* renamed from: modulate-DxMtmZc */
    public static final long m5079modulateDxMtmZc(long j8, float f8) {
        if (!Float.isNaN(f8) && f8 < 1.0f) {
            return Color.m2947copywmQWz5c$default(j8, Color.m2950getAlphaimpl(j8) * f8, 0.0f, 0.0f, 0.0f, 14, null);
        }
        return j8;
    }

    public static final float takeOrElse(float f8, Function0 function0) {
        if (Float.isNaN(f8)) {
            return ((Number) function0.invoke()).floatValue();
        }
        return f8;
    }
}
