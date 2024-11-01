package androidx.compose.material3;

import androidx.compose.material3.tokens.SuggestionChipTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;

@StabilityInferred(parameters = 0)
@ExperimentalMaterial3Api
/* loaded from: classes.dex */
public final class SuggestionChipDefaults {
    public static final int $stable = 0;
    private static final float Height;
    public static final SuggestionChipDefaults INSTANCE = new SuggestionChipDefaults();
    private static final float IconSize;

    static {
        SuggestionChipTokens suggestionChipTokens = SuggestionChipTokens.INSTANCE;
        Height = suggestionChipTokens.m2348getContainerHeightD9Ej5fM();
        IconSize = suggestionChipTokens.m2357getLeadingIconSizeD9Ej5fM();
    }

    private SuggestionChipDefaults() {
    }

    @Composable
    /* renamed from: elevatedSuggestionChipColors-5tl4gsc, reason: not valid java name */
    public final ChipColors m1773elevatedSuggestionChipColors5tl4gsc(long j8, long j9, long j10, long j11, long j12, long j13, Composer composer, int i8, int i9) {
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        composer.startReplaceableGroup(1269423125);
        if ((i9 & 1) != 0) {
            j14 = ColorSchemeKt.toColor(SuggestionChipTokens.INSTANCE.getElevatedContainerColor(), composer, 6);
        } else {
            j14 = j8;
        }
        if ((i9 & 2) != 0) {
            j15 = ColorSchemeKt.toColor(SuggestionChipTokens.INSTANCE.getLabelTextColor(), composer, 6);
        } else {
            j15 = j9;
        }
        if ((i9 & 4) != 0) {
            j16 = MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1498getOnSurfaceVariant0d7_KjU();
        } else {
            j16 = j10;
        }
        if ((i9 & 8) != 0) {
            j17 = Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(SuggestionChipTokens.INSTANCE.getElevatedDisabledContainerColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j17 = j11;
        }
        if ((i9 & 16) != 0) {
            j18 = Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(SuggestionChipTokens.INSTANCE.getDisabledLabelTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j18 = j12;
        }
        if ((i9 & 32) != 0) {
            j19 = Color.m2947copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1497getOnSurface0d7_KjU(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j19 = j13;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1269423125, i8, -1, "androidx.compose.material3.SuggestionChipDefaults.elevatedSuggestionChipColors (Chip.kt:1249)");
        }
        Color.Companion companion = Color.Companion;
        ChipColors chipColors = new ChipColors(j14, j15, j16, companion.m2984getUnspecified0d7_KjU(), j17, j18, j19, companion.m2984getUnspecified0d7_KjU(), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipColors;
    }

    @Composable
    /* renamed from: elevatedSuggestionChipElevation-aqJV_2Y, reason: not valid java name */
    public final ChipElevation m1774elevatedSuggestionChipElevationaqJV_2Y(float f8, float f9, float f10, float f11, float f12, float f13, Composer composer, int i8, int i9) {
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        composer.startReplaceableGroup(1118088467);
        if ((i9 & 1) != 0) {
            f14 = SuggestionChipTokens.INSTANCE.m2350getElevatedContainerElevationD9Ej5fM();
        } else {
            f14 = f8;
        }
        if ((i9 & 2) != 0) {
            f15 = SuggestionChipTokens.INSTANCE.m2354getElevatedPressedContainerElevationD9Ej5fM();
        } else {
            f15 = f9;
        }
        if ((i9 & 4) != 0) {
            f16 = SuggestionChipTokens.INSTANCE.m2352getElevatedFocusContainerElevationD9Ej5fM();
        } else {
            f16 = f10;
        }
        if ((i9 & 8) != 0) {
            f17 = SuggestionChipTokens.INSTANCE.m2353getElevatedHoverContainerElevationD9Ej5fM();
        } else {
            f17 = f11;
        }
        if ((i9 & 16) != 0) {
            f18 = SuggestionChipTokens.INSTANCE.m2349getDraggedContainerElevationD9Ej5fM();
        } else {
            f18 = f12;
        }
        if ((i9 & 32) != 0) {
            f19 = SuggestionChipTokens.INSTANCE.m2351getElevatedDisabledContainerElevationD9Ej5fM();
        } else {
            f19 = f13;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1118088467, i8, -1, "androidx.compose.material3.SuggestionChipDefaults.elevatedSuggestionChipElevation (Chip.kt:1286)");
        }
        ChipElevation chipElevation = new ChipElevation(f14, f15, f16, f17, f18, f19, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipElevation;
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public final float m1775getHeightD9Ej5fM() {
        return Height;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1776getIconSizeD9Ej5fM() {
        return IconSize;
    }

    @Composable
    public final Shape getShape(Composer composer, int i8) {
        composer.startReplaceableGroup(641188183);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(641188183, i8, -1, "androidx.compose.material3.SuggestionChipDefaults.<get-shape> (Chip.kt:1303)");
        }
        Shape shape = ShapesKt.toShape(SuggestionChipTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @Composable
    /* renamed from: suggestionChipBorder-d_3_b6Q, reason: not valid java name */
    public final ChipBorder m1777suggestionChipBorderd_3_b6Q(long j8, long j9, float f8, Composer composer, int i8, int i9) {
        long j10;
        long j11;
        float f9;
        composer.startReplaceableGroup(439283919);
        if ((i9 & 1) != 0) {
            j10 = ColorSchemeKt.toColor(SuggestionChipTokens.INSTANCE.getFlatOutlineColor(), composer, 6);
        } else {
            j10 = j8;
        }
        if ((i9 & 2) != 0) {
            j11 = Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(SuggestionChipTokens.INSTANCE.getFlatDisabledOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j11 = j9;
        }
        if ((i9 & 4) != 0) {
            f9 = SuggestionChipTokens.INSTANCE.m2356getFlatOutlineWidthD9Ej5fM();
        } else {
            f9 = f8;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(439283919, i8, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipBorder (Chip.kt:1226)");
        }
        ChipBorder chipBorder = new ChipBorder(j10, j11, f9, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipBorder;
    }

    @Composable
    /* renamed from: suggestionChipColors-5tl4gsc, reason: not valid java name */
    public final ChipColors m1778suggestionChipColors5tl4gsc(long j8, long j9, long j10, long j11, long j12, long j13, Composer composer, int i8, int i9) {
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        composer.startReplaceableGroup(1882647883);
        if ((i9 & 1) != 0) {
            j14 = Color.Companion.m2983getTransparent0d7_KjU();
        } else {
            j14 = j8;
        }
        if ((i9 & 2) != 0) {
            j15 = ColorSchemeKt.toColor(SuggestionChipTokens.INSTANCE.getLabelTextColor(), composer, 6);
        } else {
            j15 = j9;
        }
        if ((i9 & 4) != 0) {
            j16 = ColorSchemeKt.toColor(SuggestionChipTokens.INSTANCE.getLeadingIconColor(), composer, 6);
        } else {
            j16 = j10;
        }
        if ((i9 & 8) != 0) {
            j17 = Color.Companion.m2983getTransparent0d7_KjU();
        } else {
            j17 = j11;
        }
        if ((i9 & 16) != 0) {
            j18 = Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(SuggestionChipTokens.INSTANCE.getDisabledLabelTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j18 = j12;
        }
        if ((i9 & 32) != 0) {
            j19 = Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(SuggestionChipTokens.INSTANCE.getDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j19 = j13;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1882647883, i8, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipColors (Chip.kt:1169)");
        }
        Color.Companion companion = Color.Companion;
        ChipColors chipColors = new ChipColors(j14, j15, j16, companion.m2984getUnspecified0d7_KjU(), j17, j18, j19, companion.m2984getUnspecified0d7_KjU(), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipColors;
    }

    @Composable
    /* renamed from: suggestionChipElevation-aqJV_2Y, reason: not valid java name */
    public final ChipElevation m1779suggestionChipElevationaqJV_2Y(float f8, float f9, float f10, float f11, float f12, float f13, Composer composer, int i8, int i9) {
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        composer.startReplaceableGroup(1929994057);
        if ((i9 & 1) != 0) {
            f14 = SuggestionChipTokens.INSTANCE.m2355getFlatContainerElevationD9Ej5fM();
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
            f18 = SuggestionChipTokens.INSTANCE.m2349getDraggedContainerElevationD9Ej5fM();
        } else {
            f18 = f12;
        }
        if ((i9 & 32) != 0) {
            f19 = f14;
        } else {
            f19 = f13;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1929994057, i8, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipElevation (Chip.kt:1202)");
        }
        ChipElevation chipElevation = new ChipElevation(f14, f15, f16, f17, f18, f19, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipElevation;
    }
}
