package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class ButtonDefaults {
    public static final int $stable = 0;
    private static final float ButtonHorizontalPadding;
    private static final float ButtonVerticalPadding;
    private static final PaddingValues ContentPadding;
    public static final ButtonDefaults INSTANCE = new ButtonDefaults();
    private static final float IconSize;
    private static final float IconSpacing;
    private static final float MinHeight;
    private static final float MinWidth;
    public static final float OutlinedBorderOpacity = 0.12f;
    private static final float OutlinedBorderSize;
    private static final PaddingValues TextButtonContentPadding;
    private static final float TextButtonHorizontalPadding;

    static {
        float m5155constructorimpl = Dp.m5155constructorimpl(16);
        ButtonHorizontalPadding = m5155constructorimpl;
        float f8 = 8;
        float m5155constructorimpl2 = Dp.m5155constructorimpl(f8);
        ButtonVerticalPadding = m5155constructorimpl2;
        PaddingValues m573PaddingValuesa9UjIt4 = PaddingKt.m573PaddingValuesa9UjIt4(m5155constructorimpl, m5155constructorimpl2, m5155constructorimpl, m5155constructorimpl2);
        ContentPadding = m573PaddingValuesa9UjIt4;
        MinWidth = Dp.m5155constructorimpl(64);
        MinHeight = Dp.m5155constructorimpl(36);
        IconSize = Dp.m5155constructorimpl(18);
        IconSpacing = Dp.m5155constructorimpl(f8);
        OutlinedBorderSize = Dp.m5155constructorimpl(1);
        float m5155constructorimpl3 = Dp.m5155constructorimpl(f8);
        TextButtonHorizontalPadding = m5155constructorimpl3;
        TextButtonContentPadding = PaddingKt.m573PaddingValuesa9UjIt4(m5155constructorimpl3, m573PaddingValuesa9UjIt4.mo530calculateTopPaddingD9Ej5fM(), m5155constructorimpl3, m573PaddingValuesa9UjIt4.mo527calculateBottomPaddingD9Ej5fM());
    }

    private ButtonDefaults() {
    }

    @Composable
    /* renamed from: buttonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m1119buttonColorsro_MJ88(long j8, long j9, long j10, long j11, Composer composer, int i8, int i9) {
        long j12;
        long j13;
        long j14;
        long j15;
        composer.startReplaceableGroup(1870371134);
        if ((i9 & 1) != 0) {
            j12 = MaterialTheme.INSTANCE.getColors(composer, 6).m1155getPrimary0d7_KjU();
        } else {
            j12 = j8;
        }
        if ((i9 & 2) != 0) {
            j13 = ColorsKt.m1173contentColorForek8zF_U(j12, composer, i8 & 14);
        } else {
            j13 = j9;
        }
        if ((i9 & 4) != 0) {
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            j14 = ColorKt.m2993compositeOverOWjLjI(Color.m2947copywmQWz5c$default(materialTheme.getColors(composer, 6).m1154getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme.getColors(composer, 6).m1159getSurface0d7_KjU());
        } else {
            j14 = j10;
        }
        if ((i9 & 8) != 0) {
            j15 = Color.m2947copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1154getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j15 = j11;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1870371134, i8, -1, "androidx.compose.material.ButtonDefaults.buttonColors (Button.kt:405)");
        }
        DefaultButtonColors defaultButtonColors = new DefaultButtonColors(j12, j13, j14, j15, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultButtonColors;
    }

    @Composable
    /* renamed from: elevation-R_JCAzs, reason: not valid java name */
    public final ButtonElevation m1120elevationR_JCAzs(float f8, float f9, float f10, float f11, float f12, Composer composer, int i8, int i9) {
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        composer.startReplaceableGroup(-737170518);
        if ((i9 & 1) != 0) {
            f13 = Dp.m5155constructorimpl(2);
        } else {
            f13 = f8;
        }
        if ((i9 & 2) != 0) {
            f14 = Dp.m5155constructorimpl(8);
        } else {
            f14 = f9;
        }
        if ((i9 & 4) != 0) {
            f15 = Dp.m5155constructorimpl(0);
        } else {
            f15 = f10;
        }
        if ((i9 & 8) != 0) {
            f16 = Dp.m5155constructorimpl(4);
        } else {
            f16 = f11;
        }
        if ((i9 & 16) != 0) {
            f17 = Dp.m5155constructorimpl(4);
        } else {
            f17 = f12;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-737170518, i8, -1, "androidx.compose.material.ButtonDefaults.elevation (Button.kt:371)");
        }
        Object[] objArr = {Dp.m5153boximpl(f13), Dp.m5153boximpl(f14), Dp.m5153boximpl(f15), Dp.m5153boximpl(f16), Dp.m5153boximpl(f17)};
        composer.startReplaceableGroup(-568225417);
        boolean z8 = false;
        for (int i10 = 0; i10 < 5; i10++) {
            z8 |= composer.changed(objArr[i10]);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z8 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new DefaultButtonElevation(f13, f14, f15, f16, f17, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        DefaultButtonElevation defaultButtonElevation = (DefaultButtonElevation) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultButtonElevation;
    }

    @Composable
    /* renamed from: elevation-yajeYGU, reason: not valid java name */
    public final /* synthetic */ ButtonElevation m1121elevationyajeYGU(float f8, float f9, float f10, Composer composer, int i8, int i9) {
        float f11;
        float f12;
        float f13;
        composer.startReplaceableGroup(1428576874);
        if ((i9 & 1) != 0) {
            f11 = Dp.m5155constructorimpl(2);
        } else {
            f11 = f8;
        }
        if ((i9 & 2) != 0) {
            f12 = Dp.m5155constructorimpl(8);
        } else {
            f12 = f9;
        }
        if ((i9 & 4) != 0) {
            f13 = Dp.m5155constructorimpl(0);
        } else {
            f13 = f10;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1428576874, i8, -1, "androidx.compose.material.ButtonDefaults.elevation (Button.kt:345)");
        }
        float f14 = 4;
        ButtonElevation m1120elevationR_JCAzs = m1120elevationR_JCAzs(f11, f12, f13, Dp.m5155constructorimpl(f14), Dp.m5155constructorimpl(f14), composer, (i8 & 14) | 27648 | (i8 & 112) | (i8 & 896) | ((i8 << 6) & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m1120elevationR_JCAzs;
    }

    public final PaddingValues getContentPadding() {
        return ContentPadding;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1122getIconSizeD9Ej5fM() {
        return IconSize;
    }

    /* renamed from: getIconSpacing-D9Ej5fM, reason: not valid java name */
    public final float m1123getIconSpacingD9Ej5fM() {
        return IconSpacing;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m1124getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m1125getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    @Composable
    public final BorderStroke getOutlinedBorder(Composer composer, int i8) {
        composer.startReplaceableGroup(-2091313033);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2091313033, i8, -1, "androidx.compose.material.ButtonDefaults.<get-outlinedBorder> (Button.kt:476)");
        }
        BorderStroke m286BorderStrokecXLIe8U = BorderStrokeKt.m286BorderStrokecXLIe8U(OutlinedBorderSize, Color.m2947copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1154getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m286BorderStrokecXLIe8U;
    }

    /* renamed from: getOutlinedBorderSize-D9Ej5fM, reason: not valid java name */
    public final float m1126getOutlinedBorderSizeD9Ej5fM() {
        return OutlinedBorderSize;
    }

    public final PaddingValues getTextButtonContentPadding() {
        return TextButtonContentPadding;
    }

    @Composable
    /* renamed from: outlinedButtonColors-RGew2ao, reason: not valid java name */
    public final ButtonColors m1127outlinedButtonColorsRGew2ao(long j8, long j9, long j10, Composer composer, int i8, int i9) {
        long j11;
        long j12;
        long j13;
        composer.startReplaceableGroup(-2124406093);
        if ((i9 & 1) != 0) {
            j11 = MaterialTheme.INSTANCE.getColors(composer, 6).m1159getSurface0d7_KjU();
        } else {
            j11 = j8;
        }
        if ((i9 & 2) != 0) {
            j12 = MaterialTheme.INSTANCE.getColors(composer, 6).m1155getPrimary0d7_KjU();
        } else {
            j12 = j9;
        }
        if ((i9 & 4) != 0) {
            j13 = Color.m2947copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1154getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j13 = j10;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2124406093, i8, -1, "androidx.compose.material.ButtonDefaults.outlinedButtonColors (Button.kt:428)");
        }
        DefaultButtonColors defaultButtonColors = new DefaultButtonColors(j11, j12, j11, j13, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultButtonColors;
    }

    @Composable
    /* renamed from: textButtonColors-RGew2ao, reason: not valid java name */
    public final ButtonColors m1128textButtonColorsRGew2ao(long j8, long j9, long j10, Composer composer, int i8, int i9) {
        long j11;
        long j12;
        long j13;
        composer.startReplaceableGroup(182742216);
        if ((i9 & 1) != 0) {
            j11 = Color.Companion.m2983getTransparent0d7_KjU();
        } else {
            j11 = j8;
        }
        if ((i9 & 2) != 0) {
            j12 = MaterialTheme.INSTANCE.getColors(composer, 6).m1155getPrimary0d7_KjU();
        } else {
            j12 = j9;
        }
        if ((i9 & 4) != 0) {
            j13 = Color.m2947copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1154getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j13 = j10;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(182742216, i8, -1, "androidx.compose.material.ButtonDefaults.textButtonColors (Button.kt:449)");
        }
        DefaultButtonColors defaultButtonColors = new DefaultButtonColors(j11, j12, j11, j13, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultButtonColors;
    }
}
