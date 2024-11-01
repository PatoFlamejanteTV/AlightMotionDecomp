package androidx.compose.material3;

import androidx.compose.material3.tokens.InputChipTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;

@StabilityInferred(parameters = 0)
@ExperimentalMaterial3Api
/* loaded from: classes.dex */
public final class InputChipDefaults {
    public static final int $stable = 0;
    private static final float AvatarSize;
    private static final float Height;
    public static final InputChipDefaults INSTANCE = new InputChipDefaults();
    private static final float IconSize;

    static {
        InputChipTokens inputChipTokens = InputChipTokens.INSTANCE;
        Height = inputChipTokens.m2172getContainerHeightD9Ej5fM();
        IconSize = inputChipTokens.m2174getLeadingIconSizeD9Ej5fM();
        AvatarSize = inputChipTokens.m2170getAvatarSizeD9Ej5fM();
    }

    private InputChipDefaults() {
    }

    /* renamed from: getAvatarSize-D9Ej5fM, reason: not valid java name */
    public final float m1649getAvatarSizeD9Ej5fM() {
        return AvatarSize;
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public final float m1650getHeightD9Ej5fM() {
        return Height;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1651getIconSizeD9Ej5fM() {
        return IconSize;
    }

    @Composable
    public final Shape getShape(Composer composer, int i8) {
        composer.startReplaceableGroup(1052444143);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1052444143, i8, -1, "androidx.compose.material3.InputChipDefaults.<get-shape> (Chip.kt:1138)");
        }
        Shape shape = ShapesKt.toShape(InputChipTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @Composable
    /* renamed from: inputChipBorder-gHcDVlo, reason: not valid java name */
    public final SelectableChipBorder m1652inputChipBordergHcDVlo(long j8, long j9, long j10, long j11, float f8, float f9, Composer composer, int i8, int i9) {
        long j12;
        long j13;
        long j14;
        long j15;
        float f10;
        float f11;
        composer.startReplaceableGroup(-324924235);
        if ((i9 & 1) != 0) {
            j12 = ColorSchemeKt.toColor(InputChipTokens.INSTANCE.getUnselectedOutlineColor(), composer, 6);
        } else {
            j12 = j8;
        }
        if ((i9 & 2) != 0) {
            j13 = Color.Companion.m2983getTransparent0d7_KjU();
        } else {
            j13 = j9;
        }
        if ((i9 & 4) != 0) {
            j14 = Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(InputChipTokens.INSTANCE.getDisabledUnselectedOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j14 = j10;
        }
        if ((i9 & 8) != 0) {
            j15 = Color.Companion.m2983getTransparent0d7_KjU();
        } else {
            j15 = j11;
        }
        if ((i9 & 16) != 0) {
            f10 = InputChipTokens.INSTANCE.m2177getUnselectedOutlineWidthD9Ej5fM();
        } else {
            f10 = f8;
        }
        if ((i9 & 32) != 0) {
            f11 = InputChipTokens.INSTANCE.m2175getSelectedOutlineWidthD9Ej5fM();
        } else {
            f11 = f9;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-324924235, i8, -1, "androidx.compose.material3.InputChipDefaults.inputChipBorder (Chip.kt:1120)");
        }
        SelectableChipBorder selectableChipBorder = new SelectableChipBorder(j12, j13, j14, j15, f10, f11, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return selectableChipBorder;
    }

    @Composable
    /* renamed from: inputChipColors-kwJvTHA, reason: not valid java name */
    public final SelectableChipColors m1653inputChipColorskwJvTHA(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, Composer composer, int i8, int i9, int i10) {
        long j21;
        long j22;
        long j23;
        long j24;
        long j25;
        long j26;
        long j27;
        long j28;
        long j29;
        long j30;
        long j31;
        long j32;
        long j33;
        composer.startReplaceableGroup(1312840646);
        if ((i10 & 1) != 0) {
            j21 = Color.Companion.m2983getTransparent0d7_KjU();
        } else {
            j21 = j8;
        }
        if ((i10 & 2) != 0) {
            j22 = ColorSchemeKt.toColor(InputChipTokens.INSTANCE.getUnselectedLabelTextColor(), composer, 6);
        } else {
            j22 = j9;
        }
        if ((i10 & 4) != 0) {
            j23 = ColorSchemeKt.toColor(InputChipTokens.INSTANCE.getUnselectedLeadingIconColor(), composer, 6);
        } else {
            j23 = j10;
        }
        if ((i10 & 8) != 0) {
            j24 = ColorSchemeKt.toColor(InputChipTokens.INSTANCE.getUnselectedTrailingIconColor(), composer, 6);
        } else {
            j24 = j11;
        }
        if ((i10 & 16) != 0) {
            j25 = Color.Companion.m2983getTransparent0d7_KjU();
        } else {
            j25 = j12;
        }
        if ((i10 & 32) != 0) {
            j26 = Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(InputChipTokens.INSTANCE.getDisabledLabelTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j26 = j13;
        }
        if ((i10 & 64) != 0) {
            j27 = Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(InputChipTokens.INSTANCE.getDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j27 = j14;
        }
        if ((i10 & 128) != 0) {
            j28 = Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(InputChipTokens.INSTANCE.getDisabledTrailingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j28 = j15;
        }
        if ((i10 & 256) != 0) {
            j29 = ColorSchemeKt.toColor(InputChipTokens.INSTANCE.getSelectedContainerColor(), composer, 6);
        } else {
            j29 = j16;
        }
        if ((i10 & 512) != 0) {
            j30 = Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(InputChipTokens.INSTANCE.getDisabledSelectedContainerColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j30 = j17;
        }
        if ((i10 & 1024) != 0) {
            j31 = ColorSchemeKt.toColor(InputChipTokens.INSTANCE.getSelectedLabelTextColor(), composer, 6);
        } else {
            j31 = j18;
        }
        if ((i10 & 2048) != 0) {
            j32 = ColorSchemeKt.toColor(InputChipTokens.INSTANCE.getSelectedLeadingIconColor(), composer, 6);
        } else {
            j32 = j19;
        }
        if ((i10 & 4096) != 0) {
            j33 = ColorSchemeKt.toColor(InputChipTokens.INSTANCE.getSelectedTrailingIconColor(), composer, 6);
        } else {
            j33 = j20;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1312840646, i8, i9, "androidx.compose.material3.InputChipDefaults.inputChipColors (Chip.kt:1043)");
        }
        SelectableChipColors selectableChipColors = new SelectableChipColors(j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return selectableChipColors;
    }

    @Composable
    /* renamed from: inputChipElevation-aqJV_2Y, reason: not valid java name */
    public final SelectableChipElevation m1654inputChipElevationaqJV_2Y(float f8, float f9, float f10, float f11, float f12, float f13, Composer composer, int i8, int i9) {
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        composer.startReplaceableGroup(1745270109);
        if ((i9 & 1) != 0) {
            f14 = InputChipTokens.INSTANCE.m2171getContainerElevationD9Ej5fM();
        } else {
            f14 = f8;
        }
        if ((i9 & 2) != 0) {
            f15 = f14;
        } else {
            f15 = f9;
        }
        if ((i9 & 4) != 0) {
            f16 = f14;
        } else {
            f16 = f10;
        }
        if ((i9 & 8) != 0) {
            f17 = f14;
        } else {
            f17 = f11;
        }
        if ((i9 & 16) != 0) {
            f18 = InputChipTokens.INSTANCE.m2173getDraggedContainerElevationD9Ej5fM();
        } else {
            f18 = f12;
        }
        if ((i9 & 32) != 0) {
            f19 = f14;
        } else {
            f19 = f13;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1745270109, i8, -1, "androidx.compose.material3.InputChipDefaults.inputChipElevation (Chip.kt:1091)");
        }
        SelectableChipElevation selectableChipElevation = new SelectableChipElevation(f14, f15, f16, f17, f18, f19, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return selectableChipElevation;
    }
}
