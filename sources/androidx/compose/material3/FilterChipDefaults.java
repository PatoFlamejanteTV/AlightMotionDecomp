package androidx.compose.material3;

import androidx.compose.material3.tokens.FilterChipTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;

@StabilityInferred(parameters = 0)
@ExperimentalMaterial3Api
/* loaded from: classes.dex */
public final class FilterChipDefaults {
    public static final int $stable = 0;
    private static final float Height;
    public static final FilterChipDefaults INSTANCE = new FilterChipDefaults();
    private static final float IconSize;

    static {
        FilterChipTokens filterChipTokens = FilterChipTokens.INSTANCE;
        Height = filterChipTokens.m2151getContainerHeightD9Ej5fM();
        IconSize = filterChipTokens.m2167getIconSizeD9Ej5fM();
    }

    private FilterChipDefaults() {
    }

    @Composable
    /* renamed from: elevatedFilterChipColors-XqyqHi0, reason: not valid java name */
    public final SelectableChipColors m1617elevatedFilterChipColorsXqyqHi0(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, Composer composer, int i8, int i9, int i10) {
        composer.startReplaceableGroup(-915841711);
        long color = (i10 & 1) != 0 ? ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getElevatedUnselectedContainerColor(), composer, 6) : j8;
        long color2 = (i10 & 2) != 0 ? ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getUnselectedLabelTextColor(), composer, 6) : j9;
        long color3 = (i10 & 4) != 0 ? ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getUnselectedIconColor(), composer, 6) : j10;
        long m2947copywmQWz5c$default = (i10 & 8) != 0 ? Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getElevatedDisabledContainerColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long m2947copywmQWz5c$default2 = (i10 & 16) != 0 ? Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getDisabledLabelTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long m2947copywmQWz5c$default3 = (i10 & 32) != 0 ? Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getDisabledIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        long j20 = (i10 & 64) != 0 ? m2947copywmQWz5c$default3 : j14;
        long color4 = (i10 & 128) != 0 ? ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getElevatedSelectedContainerColor(), composer, 6) : j15;
        long j21 = (i10 & 256) != 0 ? m2947copywmQWz5c$default : j16;
        long color5 = (i10 & 512) != 0 ? ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getSelectedLabelTextColor(), composer, 6) : j17;
        long color6 = (i10 & 1024) != 0 ? ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getSelectedIconColor(), composer, 6) : j18;
        long j22 = (i10 & 2048) != 0 ? color6 : j19;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-915841711, i8, i9, "androidx.compose.material3.FilterChipDefaults.elevatedFilterChipColors (Chip.kt:937)");
        }
        SelectableChipColors selectableChipColors = new SelectableChipColors(color, color2, color3, color3, m2947copywmQWz5c$default, m2947copywmQWz5c$default2, m2947copywmQWz5c$default3, j20, color4, j21, color5, color6, j22, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return selectableChipColors;
    }

    @Composable
    /* renamed from: elevatedFilterChipElevation-aqJV_2Y, reason: not valid java name */
    public final SelectableChipElevation m1618elevatedFilterChipElevationaqJV_2Y(float f8, float f9, float f10, float f11, float f12, float f13, Composer composer, int i8, int i9) {
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        composer.startReplaceableGroup(684803697);
        if ((i9 & 1) != 0) {
            f14 = FilterChipTokens.INSTANCE.m2153getElevatedContainerElevationD9Ej5fM();
        } else {
            f14 = f8;
        }
        if ((i9 & 2) != 0) {
            f15 = FilterChipTokens.INSTANCE.m2157getElevatedPressedContainerElevationD9Ej5fM();
        } else {
            f15 = f9;
        }
        if ((i9 & 4) != 0) {
            f16 = FilterChipTokens.INSTANCE.m2155getElevatedFocusContainerElevationD9Ej5fM();
        } else {
            f16 = f10;
        }
        if ((i9 & 8) != 0) {
            f17 = FilterChipTokens.INSTANCE.m2156getElevatedHoverContainerElevationD9Ej5fM();
        } else {
            f17 = f11;
        }
        if ((i9 & 16) != 0) {
            f18 = FilterChipTokens.INSTANCE.m2152getDraggedContainerElevationD9Ej5fM();
        } else {
            f18 = f12;
        }
        if ((i9 & 32) != 0) {
            f19 = FilterChipTokens.INSTANCE.m2154getElevatedDisabledContainerElevationD9Ej5fM();
        } else {
            f19 = f13;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(684803697, i8, -1, "androidx.compose.material3.FilterChipDefaults.elevatedFilterChipElevation (Chip.kt:982)");
        }
        SelectableChipElevation selectableChipElevation = new SelectableChipElevation(f14, f15, f16, f17, f18, f19, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return selectableChipElevation;
    }

    @Composable
    /* renamed from: filterChipBorder-gHcDVlo, reason: not valid java name */
    public final SelectableChipBorder m1619filterChipBordergHcDVlo(long j8, long j9, long j10, long j11, float f8, float f9, Composer composer, int i8, int i9) {
        long j12;
        long j13;
        long j14;
        long j15;
        float f10;
        float f11;
        composer.startReplaceableGroup(-1884534961);
        if ((i9 & 1) != 0) {
            j12 = ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getFlatUnselectedOutlineColor(), composer, 6);
        } else {
            j12 = j8;
        }
        if ((i9 & 2) != 0) {
            j13 = Color.Companion.m2983getTransparent0d7_KjU();
        } else {
            j13 = j9;
        }
        if ((i9 & 4) != 0) {
            j14 = Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getFlatDisabledUnselectedOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j14 = j10;
        }
        if ((i9 & 8) != 0) {
            j15 = Color.Companion.m2983getTransparent0d7_KjU();
        } else {
            j15 = j11;
        }
        if ((i9 & 16) != 0) {
            f10 = FilterChipTokens.INSTANCE.m2165getFlatUnselectedOutlineWidthD9Ej5fM();
        } else {
            f10 = f8;
        }
        if ((i9 & 32) != 0) {
            f11 = FilterChipTokens.INSTANCE.m2161getFlatSelectedOutlineWidthD9Ej5fM();
        } else {
            f11 = f9;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1884534961, i8, -1, "androidx.compose.material3.FilterChipDefaults.filterChipBorder (Chip.kt:901)");
        }
        SelectableChipBorder selectableChipBorder = new SelectableChipBorder(j12, j13, j14, j15, f10, f11, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return selectableChipBorder;
    }

    @Composable
    /* renamed from: filterChipColors-XqyqHi0, reason: not valid java name */
    public final SelectableChipColors m1620filterChipColorsXqyqHi0(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, Composer composer, int i8, int i9, int i10) {
        composer.startReplaceableGroup(-1831479801);
        long m2983getTransparent0d7_KjU = (i10 & 1) != 0 ? Color.Companion.m2983getTransparent0d7_KjU() : j8;
        long color = (i10 & 2) != 0 ? ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getUnselectedLabelTextColor(), composer, 6) : j9;
        long color2 = (i10 & 4) != 0 ? ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getUnselectedIconColor(), composer, 6) : j10;
        long m2983getTransparent0d7_KjU2 = (i10 & 8) != 0 ? Color.Companion.m2983getTransparent0d7_KjU() : j11;
        long m2947copywmQWz5c$default = (i10 & 16) != 0 ? Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getDisabledLabelTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long m2947copywmQWz5c$default2 = (i10 & 32) != 0 ? Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getDisabledIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        long j20 = (i10 & 64) != 0 ? m2947copywmQWz5c$default2 : j14;
        long color3 = (i10 & 128) != 0 ? ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getFlatSelectedContainerColor(), composer, 6) : j15;
        long m2947copywmQWz5c$default3 = (i10 & 256) != 0 ? Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getFlatDisabledSelectedContainerColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long color4 = (i10 & 512) != 0 ? ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getSelectedLabelTextColor(), composer, 6) : j17;
        long color5 = (i10 & 1024) != 0 ? ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getSelectedIconColor(), composer, 6) : j18;
        long j21 = (i10 & 2048) != 0 ? color5 : j19;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1831479801, i8, i9, "androidx.compose.material3.FilterChipDefaults.filterChipColors (Chip.kt:825)");
        }
        SelectableChipColors selectableChipColors = new SelectableChipColors(m2983getTransparent0d7_KjU, color, color2, color2, m2983getTransparent0d7_KjU2, m2947copywmQWz5c$default, m2947copywmQWz5c$default2, j20, color3, m2947copywmQWz5c$default3, color4, color5, j21, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return selectableChipColors;
    }

    @Composable
    /* renamed from: filterChipElevation-aqJV_2Y, reason: not valid java name */
    public final SelectableChipElevation m1621filterChipElevationaqJV_2Y(float f8, float f9, float f10, float f11, float f12, float f13, Composer composer, int i8, int i9) {
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        composer.startReplaceableGroup(-757972185);
        if ((i9 & 1) != 0) {
            f14 = FilterChipTokens.INSTANCE.m2158getFlatContainerElevationD9Ej5fM();
        } else {
            f14 = f8;
        }
        if ((i9 & 2) != 0) {
            f15 = FilterChipTokens.INSTANCE.m2162getFlatSelectedPressedContainerElevationD9Ej5fM();
        } else {
            f15 = f9;
        }
        if ((i9 & 4) != 0) {
            f16 = FilterChipTokens.INSTANCE.m2159getFlatSelectedFocusContainerElevationD9Ej5fM();
        } else {
            f16 = f10;
        }
        if ((i9 & 8) != 0) {
            f17 = FilterChipTokens.INSTANCE.m2160getFlatSelectedHoverContainerElevationD9Ej5fM();
        } else {
            f17 = f11;
        }
        if ((i9 & 16) != 0) {
            f18 = FilterChipTokens.INSTANCE.m2152getDraggedContainerElevationD9Ej5fM();
        } else {
            f18 = f12;
        }
        if ((i9 & 32) != 0) {
            f19 = f14;
        } else {
            f19 = f13;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-757972185, i8, -1, "androidx.compose.material3.FilterChipDefaults.filterChipElevation (Chip.kt:871)");
        }
        SelectableChipElevation selectableChipElevation = new SelectableChipElevation(f14, f15, f16, f17, f18, f19, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return selectableChipElevation;
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public final float m1622getHeightD9Ej5fM() {
        return Height;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1623getIconSizeD9Ej5fM() {
        return IconSize;
    }

    @Composable
    public final Shape getShape(Composer composer, int i8) {
        composer.startReplaceableGroup(-1598643637);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1598643637, i8, -1, "androidx.compose.material3.FilterChipDefaults.<get-shape> (Chip.kt:999)");
        }
        Shape shape = ShapesKt.toShape(FilterChipTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }
}
