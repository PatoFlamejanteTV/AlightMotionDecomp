package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;

@StabilityInferred(parameters = 0)
@ExperimentalMaterialApi
/* loaded from: classes.dex */
public final class ChipDefaults {
    public static final int $stable = 0;
    public static final float ContentOpacity = 0.87f;
    public static final float LeadingIconOpacity = 0.54f;
    public static final float OutlinedBorderOpacity = 0.12f;
    public static final ChipDefaults INSTANCE = new ChipDefaults();
    private static final float MinHeight = Dp.m5155constructorimpl(32);
    private static final float OutlinedBorderSize = Dp.m5155constructorimpl(1);
    private static final float LeadingIconSize = Dp.m5155constructorimpl(20);
    private static final float SelectedIconSize = Dp.m5155constructorimpl(18);

    private ChipDefaults() {
    }

    @Composable
    /* renamed from: chipColors-5tl4gsc, reason: not valid java name */
    public final ChipColors m1138chipColors5tl4gsc(long j8, long j9, long j10, long j11, long j12, long j13, Composer composer, int i8, int i9) {
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        composer.startReplaceableGroup(1838505436);
        if ((i9 & 1) != 0) {
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            j14 = ColorKt.m2993compositeOverOWjLjI(Color.m2947copywmQWz5c$default(materialTheme.getColors(composer, 6).m1154getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme.getColors(composer, 6).m1159getSurface0d7_KjU());
        } else {
            j14 = j8;
        }
        if ((i9 & 2) != 0) {
            j15 = Color.m2947copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1154getOnSurface0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j15 = j9;
        }
        if ((i9 & 4) != 0) {
            j16 = Color.m2947copywmQWz5c$default(j15, 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j16 = j10;
        }
        if ((i9 & 8) != 0) {
            MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
            j17 = ColorKt.m2993compositeOverOWjLjI(Color.m2947copywmQWz5c$default(materialTheme2.getColors(composer, 6).m1154getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.12f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme2.getColors(composer, 6).m1159getSurface0d7_KjU());
        } else {
            j17 = j11;
        }
        if ((i9 & 16) != 0) {
            j18 = Color.m2947copywmQWz5c$default(j15, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j18 = j12;
        }
        if ((i9 & 32) != 0) {
            j19 = Color.m2947copywmQWz5c$default(j16, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j19 = j13;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1838505436, i8, -1, "androidx.compose.material.ChipDefaults.chipColors (Chip.kt:384)");
        }
        DefaultChipColors defaultChipColors = new DefaultChipColors(j14, j15, j16, j17, j18, j19, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultChipColors;
    }

    @Composable
    /* renamed from: filterChipColors-J08w3-E, reason: not valid java name */
    public final SelectableChipColors m1139filterChipColorsJ08w3E(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, Composer composer, int i8, int i9) {
        long j17;
        long j18;
        long j19;
        long j20;
        long j21;
        long j22;
        long j23;
        long j24;
        long j25;
        composer.startReplaceableGroup(830140629);
        if ((i9 & 1) != 0) {
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            j17 = ColorKt.m2993compositeOverOWjLjI(Color.m2947copywmQWz5c$default(materialTheme.getColors(composer, 6).m1154getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme.getColors(composer, 6).m1159getSurface0d7_KjU());
        } else {
            j17 = j8;
        }
        if ((i9 & 2) != 0) {
            j18 = Color.m2947copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1154getOnSurface0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j18 = j9;
        }
        if ((i9 & 4) != 0) {
            j19 = Color.m2947copywmQWz5c$default(j18, 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j19 = j10;
        }
        if ((i9 & 8) != 0) {
            MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
            j20 = ColorKt.m2993compositeOverOWjLjI(Color.m2947copywmQWz5c$default(materialTheme2.getColors(composer, 6).m1154getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.12f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme2.getColors(composer, 6).m1159getSurface0d7_KjU());
        } else {
            j20 = j11;
        }
        if ((i9 & 16) != 0) {
            j21 = Color.m2947copywmQWz5c$default(j18, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j21 = j12;
        }
        if ((i9 & 32) != 0) {
            j22 = Color.m2947copywmQWz5c$default(j19, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j22 = j13;
        }
        if ((i9 & 64) != 0) {
            j23 = ColorKt.m2993compositeOverOWjLjI(Color.m2947copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1154getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), j17);
        } else {
            j23 = j14;
        }
        if ((i9 & 128) != 0) {
            j24 = ColorKt.m2993compositeOverOWjLjI(Color.m2947copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1154getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), j18);
        } else {
            j24 = j15;
        }
        if ((i9 & 256) != 0) {
            j25 = ColorKt.m2993compositeOverOWjLjI(Color.m2947copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1154getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), j19);
        } else {
            j25 = j16;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(830140629, i8, -1, "androidx.compose.material.ChipDefaults.filterChipColors (Chip.kt:454)");
        }
        DefaultSelectableChipColors defaultSelectableChipColors = new DefaultSelectableChipColors(j17, j18, j19, j20, j21, j22, j23, j24, j25, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultSelectableChipColors;
    }

    /* renamed from: getLeadingIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1140getLeadingIconSizeD9Ej5fM() {
        return LeadingIconSize;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m1141getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    @Composable
    public final BorderStroke getOutlinedBorder(Composer composer, int i8) {
        composer.startReplaceableGroup(-1650225597);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1650225597, i8, -1, "androidx.compose.material.ChipDefaults.<get-outlinedBorder> (Chip.kt:542)");
        }
        BorderStroke m286BorderStrokecXLIe8U = BorderStrokeKt.m286BorderStrokecXLIe8U(OutlinedBorderSize, Color.m2947copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1154getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m286BorderStrokecXLIe8U;
    }

    /* renamed from: getOutlinedBorderSize-D9Ej5fM, reason: not valid java name */
    public final float m1142getOutlinedBorderSizeD9Ej5fM() {
        return OutlinedBorderSize;
    }

    /* renamed from: getSelectedIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1143getSelectedIconSizeD9Ej5fM() {
        return SelectedIconSize;
    }

    @Composable
    /* renamed from: outlinedChipColors-5tl4gsc, reason: not valid java name */
    public final ChipColors m1144outlinedChipColors5tl4gsc(long j8, long j9, long j10, long j11, long j12, long j13, Composer composer, int i8, int i9) {
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        composer.startReplaceableGroup(-1763922662);
        if ((i9 & 1) != 0) {
            j14 = MaterialTheme.INSTANCE.getColors(composer, 6).m1159getSurface0d7_KjU();
        } else {
            j14 = j8;
        }
        if ((i9 & 2) != 0) {
            j15 = Color.m2947copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1154getOnSurface0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j15 = j9;
        }
        if ((i9 & 4) != 0) {
            j16 = Color.m2947copywmQWz5c$default(j15, 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j16 = j10;
        }
        if ((i9 & 8) != 0) {
            j17 = j14;
        } else {
            j17 = j11;
        }
        if ((i9 & 16) != 0) {
            j18 = Color.m2947copywmQWz5c$default(j15, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j18 = j12;
        }
        if ((i9 & 32) != 0) {
            j19 = Color.m2947copywmQWz5c$default(j16, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j19 = j13;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1763922662, i8, -1, "androidx.compose.material.ChipDefaults.outlinedChipColors (Chip.kt:420)");
        }
        ChipColors m1138chipColors5tl4gsc = m1138chipColors5tl4gsc(j14, j15, j16, j17, j18, j19, composer, i8 & 4194302, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m1138chipColors5tl4gsc;
    }

    @Composable
    /* renamed from: outlinedFilterChipColors-J08w3-E, reason: not valid java name */
    public final SelectableChipColors m1145outlinedFilterChipColorsJ08w3E(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, Composer composer, int i8, int i9) {
        long j17;
        long j18;
        long j19;
        long j20;
        long j21;
        long j22;
        long j23;
        long j24;
        long j25;
        composer.startReplaceableGroup(346878099);
        if ((i9 & 1) != 0) {
            j17 = MaterialTheme.INSTANCE.getColors(composer, 6).m1159getSurface0d7_KjU();
        } else {
            j17 = j8;
        }
        if ((i9 & 2) != 0) {
            j18 = Color.m2947copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1154getOnSurface0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j18 = j9;
        }
        if ((i9 & 4) != 0) {
            j19 = Color.m2947copywmQWz5c$default(j18, 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j19 = j10;
        }
        if ((i9 & 8) != 0) {
            j20 = j17;
        } else {
            j20 = j11;
        }
        if ((i9 & 16) != 0) {
            j21 = Color.m2947copywmQWz5c$default(j18, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j21 = j12;
        }
        if ((i9 & 32) != 0) {
            j22 = Color.m2947copywmQWz5c$default(j19, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j22 = j13;
        }
        if ((i9 & 64) != 0) {
            j23 = ColorKt.m2993compositeOverOWjLjI(Color.m2947copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1154getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), j17);
        } else {
            j23 = j14;
        }
        if ((i9 & 128) != 0) {
            j24 = ColorKt.m2993compositeOverOWjLjI(Color.m2947copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1154getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), j18);
        } else {
            j24 = j15;
        }
        if ((i9 & 256) != 0) {
            j25 = ColorKt.m2993compositeOverOWjLjI(Color.m2947copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1154getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), j19);
        } else {
            j25 = j16;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(346878099, i8, -1, "androidx.compose.material.ChipDefaults.outlinedFilterChipColors (Chip.kt:505)");
        }
        DefaultSelectableChipColors defaultSelectableChipColors = new DefaultSelectableChipColors(j17, j18, j19, j20, j21, j22, j23, j24, j25, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultSelectableChipColors;
    }
}
