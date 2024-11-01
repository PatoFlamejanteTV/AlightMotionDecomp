package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.tokens.ElevatedButtonTokens;
import androidx.compose.material3.tokens.FilledButtonTokens;
import androidx.compose.material3.tokens.FilledTonalButtonTokens;
import androidx.compose.material3.tokens.OutlinedButtonTokens;
import androidx.compose.material3.tokens.TextButtonTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class ButtonDefaults {
    public static final int $stable = 0;
    private static final float ButtonHorizontalPadding;
    private static final float ButtonVerticalPadding;
    private static final PaddingValues ButtonWithIconContentPadding;
    private static final float ButtonWithIconHorizontalStartPadding;
    private static final PaddingValues ContentPadding;
    public static final ButtonDefaults INSTANCE = new ButtonDefaults();
    private static final float IconSize;
    private static final float IconSpacing;
    private static final float MinHeight;
    private static final float MinWidth;
    private static final PaddingValues TextButtonContentPadding;
    private static final float TextButtonHorizontalPadding;

    static {
        float m5155constructorimpl = Dp.m5155constructorimpl(24);
        ButtonHorizontalPadding = m5155constructorimpl;
        float f8 = 8;
        float m5155constructorimpl2 = Dp.m5155constructorimpl(f8);
        ButtonVerticalPadding = m5155constructorimpl2;
        PaddingValues m573PaddingValuesa9UjIt4 = PaddingKt.m573PaddingValuesa9UjIt4(m5155constructorimpl, m5155constructorimpl2, m5155constructorimpl, m5155constructorimpl2);
        ContentPadding = m573PaddingValuesa9UjIt4;
        float m5155constructorimpl3 = Dp.m5155constructorimpl(16);
        ButtonWithIconHorizontalStartPadding = m5155constructorimpl3;
        ButtonWithIconContentPadding = PaddingKt.m573PaddingValuesa9UjIt4(m5155constructorimpl3, m5155constructorimpl2, m5155constructorimpl, m5155constructorimpl2);
        float m5155constructorimpl4 = Dp.m5155constructorimpl(12);
        TextButtonHorizontalPadding = m5155constructorimpl4;
        TextButtonContentPadding = PaddingKt.m573PaddingValuesa9UjIt4(m5155constructorimpl4, m573PaddingValuesa9UjIt4.mo530calculateTopPaddingD9Ej5fM(), m5155constructorimpl4, m573PaddingValuesa9UjIt4.mo527calculateBottomPaddingD9Ej5fM());
        MinWidth = Dp.m5155constructorimpl(58);
        MinHeight = Dp.m5155constructorimpl(40);
        IconSize = FilledButtonTokens.INSTANCE.m2124getIconSizeD9Ej5fM();
        IconSpacing = Dp.m5155constructorimpl(f8);
    }

    private ButtonDefaults() {
    }

    @Composable
    /* renamed from: buttonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m1451buttonColorsro_MJ88(long j8, long j9, long j10, long j11, Composer composer, int i8, int i9) {
        long j12;
        long j13;
        long j14;
        long j15;
        composer.startReplaceableGroup(-339300779);
        if ((i9 & 1) != 0) {
            j12 = ColorSchemeKt.toColor(FilledButtonTokens.INSTANCE.getContainerColor(), composer, 6);
        } else {
            j12 = j8;
        }
        if ((i9 & 2) != 0) {
            j13 = ColorSchemeKt.toColor(FilledButtonTokens.INSTANCE.getLabelTextColor(), composer, 6);
        } else {
            j13 = j9;
        }
        if ((i9 & 4) != 0) {
            j14 = Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(FilledButtonTokens.INSTANCE.getDisabledContainerColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j14 = j10;
        }
        if ((i9 & 8) != 0) {
            j15 = Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(FilledButtonTokens.INSTANCE.getDisabledLabelTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j15 = j11;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-339300779, i8, -1, "androidx.compose.material3.ButtonDefaults.buttonColors (Button.kt:547)");
        }
        ButtonColors buttonColors = new ButtonColors(j12, j13, j14, j15, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return buttonColors;
    }

    @Composable
    /* renamed from: buttonElevation-R_JCAzs, reason: not valid java name */
    public final ButtonElevation m1452buttonElevationR_JCAzs(float f8, float f9, float f10, float f11, float f12, Composer composer, int i8, int i9) {
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        composer.startReplaceableGroup(1827791191);
        if ((i9 & 1) != 0) {
            f13 = FilledButtonTokens.INSTANCE.m2119getContainerElevationD9Ej5fM();
        } else {
            f13 = f8;
        }
        if ((i9 & 2) != 0) {
            f14 = FilledButtonTokens.INSTANCE.m2125getPressedContainerElevationD9Ej5fM();
        } else {
            f14 = f9;
        }
        if ((i9 & 4) != 0) {
            f15 = FilledButtonTokens.INSTANCE.m2122getFocusContainerElevationD9Ej5fM();
        } else {
            f15 = f10;
        }
        if ((i9 & 8) != 0) {
            f16 = FilledButtonTokens.INSTANCE.m2123getHoverContainerElevationD9Ej5fM();
        } else {
            f16 = f11;
        }
        if ((i9 & 16) != 0) {
            f17 = FilledButtonTokens.INSTANCE.m2121getDisabledContainerElevationD9Ej5fM();
        } else {
            f17 = f12;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1827791191, i8, -1, "androidx.compose.material3.ButtonDefaults.buttonElevation (Button.kt:674)");
        }
        ButtonElevation buttonElevation = new ButtonElevation(f13, f14, f15, f16, f17, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return buttonElevation;
    }

    @Composable
    /* renamed from: elevatedButtonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m1453elevatedButtonColorsro_MJ88(long j8, long j9, long j10, long j11, Composer composer, int i8, int i9) {
        long j12;
        long j13;
        long j14;
        long j15;
        composer.startReplaceableGroup(1507908383);
        if ((i9 & 1) != 0) {
            j12 = ColorSchemeKt.toColor(ElevatedButtonTokens.INSTANCE.getContainerColor(), composer, 6);
        } else {
            j12 = j8;
        }
        if ((i9 & 2) != 0) {
            j13 = ColorSchemeKt.toColor(ElevatedButtonTokens.INSTANCE.getLabelTextColor(), composer, 6);
        } else {
            j13 = j9;
        }
        if ((i9 & 4) != 0) {
            j14 = Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(ElevatedButtonTokens.INSTANCE.getDisabledContainerColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j14 = j10;
        }
        if ((i9 & 8) != 0) {
            j15 = Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(ElevatedButtonTokens.INSTANCE.getDisabledLabelTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j15 = j11;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1507908383, i8, -1, "androidx.compose.material3.ButtonDefaults.elevatedButtonColors (Button.kt:572)");
        }
        ButtonColors buttonColors = new ButtonColors(j12, j13, j14, j15, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return buttonColors;
    }

    @Composable
    /* renamed from: elevatedButtonElevation-R_JCAzs, reason: not valid java name */
    public final ButtonElevation m1454elevatedButtonElevationR_JCAzs(float f8, float f9, float f10, float f11, float f12, Composer composer, int i8, int i9) {
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        composer.startReplaceableGroup(1065482445);
        if ((i9 & 1) != 0) {
            f13 = ElevatedButtonTokens.INSTANCE.m2035getContainerElevationD9Ej5fM();
        } else {
            f13 = f8;
        }
        if ((i9 & 2) != 0) {
            f14 = ElevatedButtonTokens.INSTANCE.m2041getPressedContainerElevationD9Ej5fM();
        } else {
            f14 = f9;
        }
        if ((i9 & 4) != 0) {
            f15 = ElevatedButtonTokens.INSTANCE.m2038getFocusContainerElevationD9Ej5fM();
        } else {
            f15 = f10;
        }
        if ((i9 & 8) != 0) {
            f16 = ElevatedButtonTokens.INSTANCE.m2039getHoverContainerElevationD9Ej5fM();
        } else {
            f16 = f11;
        }
        if ((i9 & 16) != 0) {
            f17 = ElevatedButtonTokens.INSTANCE.m2037getDisabledContainerElevationD9Ej5fM();
        } else {
            f17 = f12;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1065482445, i8, -1, "androidx.compose.material3.ButtonDefaults.elevatedButtonElevation (Button.kt:700)");
        }
        ButtonElevation buttonElevation = new ButtonElevation(f13, f14, f15, f16, f17, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return buttonElevation;
    }

    @Composable
    /* renamed from: filledTonalButtonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m1455filledTonalButtonColorsro_MJ88(long j8, long j9, long j10, long j11, Composer composer, int i8, int i9) {
        long j12;
        long j13;
        long j14;
        long j15;
        composer.startReplaceableGroup(1670757653);
        if ((i9 & 1) != 0) {
            j12 = ColorSchemeKt.toColor(FilledTonalButtonTokens.INSTANCE.getContainerColor(), composer, 6);
        } else {
            j12 = j8;
        }
        if ((i9 & 2) != 0) {
            j13 = ColorSchemeKt.toColor(FilledTonalButtonTokens.INSTANCE.getLabelTextColor(), composer, 6);
        } else {
            j13 = j9;
        }
        if ((i9 & 4) != 0) {
            j14 = Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(FilledTonalButtonTokens.INSTANCE.getDisabledContainerColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j14 = j10;
        }
        if ((i9 & 8) != 0) {
            j15 = Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(FilledTonalButtonTokens.INSTANCE.getDisabledLabelTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j15 = j11;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1670757653, i8, -1, "androidx.compose.material3.ButtonDefaults.filledTonalButtonColors (Button.kt:598)");
        }
        ButtonColors buttonColors = new ButtonColors(j12, j13, j14, j15, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return buttonColors;
    }

    @Composable
    /* renamed from: filledTonalButtonElevation-R_JCAzs, reason: not valid java name */
    public final ButtonElevation m1456filledTonalButtonElevationR_JCAzs(float f8, float f9, float f10, float f11, float f12, Composer composer, int i8, int i9) {
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        composer.startReplaceableGroup(5982871);
        if ((i9 & 1) != 0) {
            f13 = FilledTonalButtonTokens.INSTANCE.m2142getContainerElevationD9Ej5fM();
        } else {
            f13 = f8;
        }
        if ((i9 & 2) != 0) {
            f14 = FilledTonalButtonTokens.INSTANCE.m2148getPressedContainerElevationD9Ej5fM();
        } else {
            f14 = f9;
        }
        if ((i9 & 4) != 0) {
            f15 = FilledTonalButtonTokens.INSTANCE.m2145getFocusContainerElevationD9Ej5fM();
        } else {
            f15 = f10;
        }
        if ((i9 & 8) != 0) {
            f16 = FilledTonalButtonTokens.INSTANCE.m2146getHoverContainerElevationD9Ej5fM();
        } else {
            f16 = f11;
        }
        if ((i9 & 16) != 0) {
            f17 = Dp.m5155constructorimpl(0);
        } else {
            f17 = f12;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(5982871, i8, -1, "androidx.compose.material3.ButtonDefaults.filledTonalButtonElevation (Button.kt:727)");
        }
        ButtonElevation buttonElevation = new ButtonElevation(f13, f14, f15, f16, f17, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return buttonElevation;
    }

    public final PaddingValues getButtonWithIconContentPadding() {
        return ButtonWithIconContentPadding;
    }

    public final PaddingValues getContentPadding() {
        return ContentPadding;
    }

    @Composable
    public final Shape getElevatedShape(Composer composer, int i8) {
        composer.startReplaceableGroup(2143958791);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2143958791, i8, -1, "androidx.compose.material3.ButtonDefaults.<get-elevatedShape> (Button.kt:526)");
        }
        Shape shape = ShapesKt.toShape(ElevatedButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @Composable
    public final Shape getFilledTonalShape(Composer composer, int i8) {
        composer.startReplaceableGroup(-886584987);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-886584987, i8, -1, "androidx.compose.material3.ButtonDefaults.<get-filledTonalShape> (Button.kt:529)");
        }
        Shape shape = ShapesKt.toShape(FilledTonalButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1457getIconSizeD9Ej5fM() {
        return IconSize;
    }

    /* renamed from: getIconSpacing-D9Ej5fM, reason: not valid java name */
    public final float m1458getIconSpacingD9Ej5fM() {
        return IconSpacing;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m1459getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m1460getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    @Composable
    public final BorderStroke getOutlinedButtonBorder(Composer composer, int i8) {
        composer.startReplaceableGroup(-563957672);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-563957672, i8, -1, "androidx.compose.material3.ButtonDefaults.<get-outlinedButtonBorder> (Button.kt:744)");
        }
        OutlinedButtonTokens outlinedButtonTokens = OutlinedButtonTokens.INSTANCE;
        BorderStroke m286BorderStrokecXLIe8U = BorderStrokeKt.m286BorderStrokecXLIe8U(outlinedButtonTokens.m2225getOutlineWidthD9Ej5fM(), ColorSchemeKt.toColor(outlinedButtonTokens.getOutlineColor(), composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m286BorderStrokecXLIe8U;
    }

    @Composable
    public final Shape getOutlinedShape(Composer composer, int i8) {
        composer.startReplaceableGroup(-2045213065);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2045213065, i8, -1, "androidx.compose.material3.ButtonDefaults.<get-outlinedShape> (Button.kt:532)");
        }
        Shape shape = ShapesKt.toShape(OutlinedButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @Composable
    public final Shape getShape(Composer composer, int i8) {
        composer.startReplaceableGroup(-1234923021);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1234923021, i8, -1, "androidx.compose.material3.ButtonDefaults.<get-shape> (Button.kt:523)");
        }
        Shape shape = ShapesKt.toShape(FilledButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    public final PaddingValues getTextButtonContentPadding() {
        return TextButtonContentPadding;
    }

    @Composable
    public final Shape getTextShape(Composer composer, int i8) {
        composer.startReplaceableGroup(-349121587);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-349121587, i8, -1, "androidx.compose.material3.ButtonDefaults.<get-textShape> (Button.kt:535)");
        }
        Shape shape = ShapesKt.toShape(TextButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @Composable
    /* renamed from: outlinedButtonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m1461outlinedButtonColorsro_MJ88(long j8, long j9, long j10, long j11, Composer composer, int i8, int i9) {
        long j12;
        long j13;
        long j14;
        long j15;
        composer.startReplaceableGroup(-1778526249);
        if ((i9 & 1) != 0) {
            j12 = Color.Companion.m2983getTransparent0d7_KjU();
        } else {
            j12 = j8;
        }
        if ((i9 & 2) != 0) {
            j13 = ColorSchemeKt.toColor(OutlinedButtonTokens.INSTANCE.getLabelTextColor(), composer, 6);
        } else {
            j13 = j9;
        }
        if ((i9 & 4) != 0) {
            j14 = Color.Companion.m2983getTransparent0d7_KjU();
        } else {
            j14 = j10;
        }
        if ((i9 & 8) != 0) {
            j15 = Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedButtonTokens.INSTANCE.getDisabledLabelTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j15 = j11;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1778526249, i8, -1, "androidx.compose.material3.ButtonDefaults.outlinedButtonColors (Button.kt:624)");
        }
        ButtonColors buttonColors = new ButtonColors(j12, j13, j14, j15, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return buttonColors;
    }

    @Composable
    /* renamed from: textButtonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m1462textButtonColorsro_MJ88(long j8, long j9, long j10, long j11, Composer composer, int i8, int i9) {
        long j12;
        long j13;
        long j14;
        long j15;
        composer.startReplaceableGroup(-1402274782);
        if ((i9 & 1) != 0) {
            j12 = Color.Companion.m2983getTransparent0d7_KjU();
        } else {
            j12 = j8;
        }
        if ((i9 & 2) != 0) {
            j13 = ColorSchemeKt.toColor(TextButtonTokens.INSTANCE.getLabelTextColor(), composer, 6);
        } else {
            j13 = j9;
        }
        if ((i9 & 4) != 0) {
            j14 = Color.Companion.m2983getTransparent0d7_KjU();
        } else {
            j14 = j10;
        }
        if ((i9 & 8) != 0) {
            j15 = Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(TextButtonTokens.INSTANCE.getDisabledLabelTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j15 = j11;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1402274782, i8, -1, "androidx.compose.material3.ButtonDefaults.textButtonColors (Button.kt:648)");
        }
        ButtonColors buttonColors = new ButtonColors(j12, j13, j14, j15, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return buttonColors;
    }
}
