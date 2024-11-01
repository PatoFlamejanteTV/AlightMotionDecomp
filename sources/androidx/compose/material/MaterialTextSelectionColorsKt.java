package androidx.compose.material;

import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class MaterialTextSelectionColorsKt {
    private static final float DefaultSelectionBackgroundAlpha = 0.4f;
    private static final float DesiredContrastRatio = 4.5f;
    private static final float MinimumSelectionBackgroundAlpha = 0.2f;

    /* renamed from: binarySearchForAccessibleSelectionColorAlpha-ysEtTa8, reason: not valid java name */
    private static final float m1248binarySearchForAccessibleSelectionColorAlphaysEtTa8(long j8, long j9, long j10) {
        float f8 = 0.2f;
        float f9 = 0.4f;
        float f10 = 0.4f;
        for (int i8 = 0; i8 < 7; i8++) {
            float m1250calculateContrastRationb2GgbA = (m1250calculateContrastRationb2GgbA(j8, f9, j9, j10) / DesiredContrastRatio) - 1.0f;
            if (0.0f <= m1250calculateContrastRationb2GgbA && m1250calculateContrastRationb2GgbA <= 0.01f) {
                break;
            }
            if (m1250calculateContrastRationb2GgbA < 0.0f) {
                f10 = f9;
            } else {
                f8 = f9;
            }
            f9 = (f10 + f8) / 2.0f;
        }
        return f9;
    }

    /* renamed from: calculateContrastRatio--OWjLjI, reason: not valid java name */
    public static final float m1249calculateContrastRatioOWjLjI(long j8, long j9) {
        float m3000luminance8_81llA = ColorKt.m3000luminance8_81llA(j8) + 0.05f;
        float m3000luminance8_81llA2 = ColorKt.m3000luminance8_81llA(j9) + 0.05f;
        return Math.max(m3000luminance8_81llA, m3000luminance8_81llA2) / Math.min(m3000luminance8_81llA, m3000luminance8_81llA2);
    }

    /* renamed from: calculateContrastRatio-nb2GgbA, reason: not valid java name */
    private static final float m1250calculateContrastRationb2GgbA(long j8, float f8, long j9, long j10) {
        long m2993compositeOverOWjLjI = ColorKt.m2993compositeOverOWjLjI(Color.m2947copywmQWz5c$default(j8, f8, 0.0f, 0.0f, 0.0f, 14, null), j10);
        return m1249calculateContrastRatioOWjLjI(ColorKt.m2993compositeOverOWjLjI(j9, m2993compositeOverOWjLjI), m2993compositeOverOWjLjI);
    }

    /* renamed from: calculateSelectionBackgroundColor-ysEtTa8, reason: not valid java name */
    public static final long m1251calculateSelectionBackgroundColorysEtTa8(long j8, long j9, long j10) {
        float m1248binarySearchForAccessibleSelectionColorAlphaysEtTa8;
        float m1250calculateContrastRationb2GgbA = m1250calculateContrastRationb2GgbA(j8, 0.4f, j9, j10);
        float m1250calculateContrastRationb2GgbA2 = m1250calculateContrastRationb2GgbA(j8, 0.2f, j9, j10);
        if (m1250calculateContrastRationb2GgbA >= DesiredContrastRatio) {
            m1248binarySearchForAccessibleSelectionColorAlphaysEtTa8 = 0.4f;
        } else if (m1250calculateContrastRationb2GgbA2 < DesiredContrastRatio) {
            m1248binarySearchForAccessibleSelectionColorAlphaysEtTa8 = 0.2f;
        } else {
            m1248binarySearchForAccessibleSelectionColorAlphaysEtTa8 = m1248binarySearchForAccessibleSelectionColorAlphaysEtTa8(j8, j9, j10);
        }
        return Color.m2947copywmQWz5c$default(j8, m1248binarySearchForAccessibleSelectionColorAlphaysEtTa8, 0.0f, 0.0f, 0.0f, 14, null);
    }

    @Composable
    public static final TextSelectionColors rememberTextSelectionColors(Colors colors, Composer composer, int i8) {
        AbstractC3292y.i(colors, "colors");
        composer.startReplaceableGroup(-721696685);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-721696685, i8, -1, "androidx.compose.material.rememberTextSelectionColors (MaterialTextSelectionColors.kt:35)");
        }
        long m1155getPrimary0d7_KjU = colors.m1155getPrimary0d7_KjU();
        long m1148getBackground0d7_KjU = colors.m1148getBackground0d7_KjU();
        composer.startReplaceableGroup(35572910);
        long m1172contentColorFor4WTKRHQ = ColorsKt.m1172contentColorFor4WTKRHQ(colors, m1148getBackground0d7_KjU);
        if (m1172contentColorFor4WTKRHQ == Color.Companion.m2984getUnspecified0d7_KjU()) {
            m1172contentColorFor4WTKRHQ = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m2958unboximpl();
        }
        long j8 = m1172contentColorFor4WTKRHQ;
        composer.endReplaceableGroup();
        long m2947copywmQWz5c$default = Color.m2947copywmQWz5c$default(j8, ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        Color m2938boximpl = Color.m2938boximpl(m1155getPrimary0d7_KjU);
        Color m2938boximpl2 = Color.m2938boximpl(m1148getBackground0d7_KjU);
        Color m2938boximpl3 = Color.m2938boximpl(m2947copywmQWz5c$default);
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed(m2938boximpl) | composer.changed(m2938boximpl2) | composer.changed(m2938boximpl3);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new TextSelectionColors(colors.m1155getPrimary0d7_KjU(), m1251calculateSelectionBackgroundColorysEtTa8(m1155getPrimary0d7_KjU, m2947copywmQWz5c$default, m1148getBackground0d7_KjU), null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        TextSelectionColors textSelectionColors = (TextSelectionColors) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textSelectionColors;
    }
}
