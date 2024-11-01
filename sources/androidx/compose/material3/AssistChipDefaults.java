package androidx.compose.material3;

import androidx.compose.material3.tokens.AssistChipTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;

@StabilityInferred(parameters = 0)
@ExperimentalMaterial3Api
/* loaded from: classes.dex */
public final class AssistChipDefaults {
    public static final int $stable = 0;
    private static final float Height;
    public static final AssistChipDefaults INSTANCE = new AssistChipDefaults();
    private static final float IconSize;

    static {
        AssistChipTokens assistChipTokens = AssistChipTokens.INSTANCE;
        Height = assistChipTokens.m1938getContainerHeightD9Ej5fM();
        IconSize = assistChipTokens.m1947getIconSizeD9Ej5fM();
    }

    private AssistChipDefaults() {
    }

    @Composable
    /* renamed from: assistChipBorder-d_3_b6Q, reason: not valid java name */
    public final ChipBorder m1442assistChipBorderd_3_b6Q(long j8, long j9, float f8, Composer composer, int i8, int i9) {
        long j10;
        long j11;
        float f9;
        composer.startReplaceableGroup(382372847);
        if ((i9 & 1) != 0) {
            j10 = ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getFlatOutlineColor(), composer, 6);
        } else {
            j10 = j8;
        }
        if ((i9 & 2) != 0) {
            j11 = Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getFlatDisabledOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j11 = j9;
        }
        if ((i9 & 4) != 0) {
            f9 = AssistChipTokens.INSTANCE.m1946getFlatOutlineWidthD9Ej5fM();
        } else {
            f9 = f8;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(382372847, i8, -1, "androidx.compose.material3.AssistChipDefaults.assistChipBorder (Chip.kt:708)");
        }
        ChipBorder chipBorder = new ChipBorder(j10, j11, f9, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipBorder;
    }

    @Composable
    /* renamed from: assistChipColors-oq7We08, reason: not valid java name */
    public final ChipColors m1443assistChipColorsoq7We08(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, Composer composer, int i8, int i9) {
        long j16;
        long j17;
        long j18;
        long j19;
        long j20;
        long j21;
        long j22;
        long j23;
        composer.startReplaceableGroup(-391745725);
        if ((i9 & 1) != 0) {
            j16 = Color.Companion.m2983getTransparent0d7_KjU();
        } else {
            j16 = j8;
        }
        if ((i9 & 2) != 0) {
            j17 = ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getLabelTextColor(), composer, 6);
        } else {
            j17 = j9;
        }
        if ((i9 & 4) != 0) {
            j18 = ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getIconColor(), composer, 6);
        } else {
            j18 = j10;
        }
        if ((i9 & 8) != 0) {
            j19 = j18;
        } else {
            j19 = j11;
        }
        if ((i9 & 16) != 0) {
            j20 = Color.Companion.m2983getTransparent0d7_KjU();
        } else {
            j20 = j12;
        }
        if ((i9 & 32) != 0) {
            j21 = Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getDisabledLabelTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j21 = j13;
        }
        if ((i9 & 64) != 0) {
            j22 = Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getDisabledIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j22 = j14;
        }
        if ((i9 & 128) != 0) {
            j23 = j22;
        } else {
            j23 = j15;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-391745725, i8, -1, "androidx.compose.material3.AssistChipDefaults.assistChipColors (Chip.kt:648)");
        }
        ChipColors chipColors = new ChipColors(j16, j17, j18, j19, j20, j21, j22, j23, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipColors;
    }

    @Composable
    /* renamed from: assistChipElevation-aqJV_2Y, reason: not valid java name */
    public final ChipElevation m1444assistChipElevationaqJV_2Y(float f8, float f9, float f10, float f11, float f12, float f13, Composer composer, int i8, int i9) {
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        composer.startReplaceableGroup(245366099);
        if ((i9 & 1) != 0) {
            f14 = AssistChipTokens.INSTANCE.m1945getFlatContainerElevationD9Ej5fM();
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
            f18 = AssistChipTokens.INSTANCE.m1939getDraggedContainerElevationD9Ej5fM();
        } else {
            f18 = f12;
        }
        if ((i9 & 32) != 0) {
            f19 = f14;
        } else {
            f19 = f13;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(245366099, i8, -1, "androidx.compose.material3.AssistChipDefaults.assistChipElevation (Chip.kt:684)");
        }
        ChipElevation chipElevation = new ChipElevation(f14, f15, f16, f17, f18, f19, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipElevation;
    }

    @Composable
    /* renamed from: elevatedAssistChipColors-oq7We08, reason: not valid java name */
    public final ChipColors m1445elevatedAssistChipColorsoq7We08(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, Composer composer, int i8, int i9) {
        long j16;
        long j17;
        long j18;
        long j19;
        long j20;
        long j21;
        long j22;
        long j23;
        composer.startReplaceableGroup(-535762675);
        if ((i9 & 1) != 0) {
            j16 = ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getElevatedContainerColor(), composer, 6);
        } else {
            j16 = j8;
        }
        if ((i9 & 2) != 0) {
            j17 = ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getLabelTextColor(), composer, 6);
        } else {
            j17 = j9;
        }
        if ((i9 & 4) != 0) {
            j18 = ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getIconColor(), composer, 6);
        } else {
            j18 = j10;
        }
        if ((i9 & 8) != 0) {
            j19 = j18;
        } else {
            j19 = j11;
        }
        if ((i9 & 16) != 0) {
            j20 = Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getElevatedDisabledContainerColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j20 = j12;
        }
        if ((i9 & 32) != 0) {
            j21 = Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getDisabledLabelTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j21 = j13;
        }
        if ((i9 & 64) != 0) {
            j22 = Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getDisabledIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j22 = j14;
        }
        if ((i9 & 128) != 0) {
            j23 = j22;
        } else {
            j23 = j15;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-535762675, i8, -1, "androidx.compose.material3.AssistChipDefaults.elevatedAssistChipColors (Chip.kt:733)");
        }
        ChipColors chipColors = new ChipColors(j16, j17, j18, j19, j20, j21, j22, j23, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipColors;
    }

    @Composable
    /* renamed from: elevatedAssistChipElevation-aqJV_2Y, reason: not valid java name */
    public final ChipElevation m1446elevatedAssistChipElevationaqJV_2Y(float f8, float f9, float f10, float f11, float f12, float f13, Composer composer, int i8, int i9) {
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        composer.startReplaceableGroup(1457698077);
        if ((i9 & 1) != 0) {
            f14 = AssistChipTokens.INSTANCE.m1940getElevatedContainerElevationD9Ej5fM();
        } else {
            f14 = f8;
        }
        if ((i9 & 2) != 0) {
            f15 = AssistChipTokens.INSTANCE.m1944getElevatedPressedContainerElevationD9Ej5fM();
        } else {
            f15 = f9;
        }
        if ((i9 & 4) != 0) {
            f16 = AssistChipTokens.INSTANCE.m1942getElevatedFocusContainerElevationD9Ej5fM();
        } else {
            f16 = f10;
        }
        if ((i9 & 8) != 0) {
            f17 = AssistChipTokens.INSTANCE.m1943getElevatedHoverContainerElevationD9Ej5fM();
        } else {
            f17 = f11;
        }
        if ((i9 & 16) != 0) {
            f18 = AssistChipTokens.INSTANCE.m1939getDraggedContainerElevationD9Ej5fM();
        } else {
            f18 = f12;
        }
        if ((i9 & 32) != 0) {
            f19 = AssistChipTokens.INSTANCE.m1941getElevatedDisabledContainerElevationD9Ej5fM();
        } else {
            f19 = f13;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1457698077, i8, -1, "androidx.compose.material3.AssistChipDefaults.elevatedAssistChipElevation (Chip.kt:770)");
        }
        ChipElevation chipElevation = new ChipElevation(f14, f15, f16, f17, f18, f19, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipElevation;
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public final float m1447getHeightD9Ej5fM() {
        return Height;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1448getIconSizeD9Ej5fM() {
        return IconSize;
    }

    @Composable
    public final Shape getShape(Composer composer, int i8) {
        composer.startReplaceableGroup(1988153916);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1988153916, i8, -1, "androidx.compose.material3.AssistChipDefaults.<get-shape> (Chip.kt:787)");
        }
        Shape shape = ShapesKt.toShape(AssistChipTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }
}
