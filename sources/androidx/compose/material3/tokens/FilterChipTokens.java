package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;

/* loaded from: classes.dex */
public final class FilterChipTokens {
    private static final ColorSchemeKeyTokens DisabledIconColor;
    public static final float DisabledIconOpacity = 0.38f;
    private static final ColorSchemeKeyTokens DisabledLabelTextColor;
    public static final float DisabledLabelTextOpacity = 0.38f;
    private static final float DraggedContainerElevation;
    private static final float ElevatedContainerElevation;
    private static final ColorSchemeKeyTokens ElevatedDisabledContainerColor;
    private static final float ElevatedDisabledContainerElevation;
    public static final float ElevatedDisabledContainerOpacity = 0.12f;
    private static final float ElevatedFocusContainerElevation;
    private static final float ElevatedHoverContainerElevation;
    private static final float ElevatedPressedContainerElevation;
    private static final ColorSchemeKeyTokens ElevatedSelectedContainerColor;
    private static final ColorSchemeKeyTokens ElevatedUnselectedContainerColor;
    private static final float FlatContainerElevation;
    private static final ColorSchemeKeyTokens FlatDisabledSelectedContainerColor;
    public static final float FlatDisabledSelectedContainerOpacity = 0.12f;
    private static final ColorSchemeKeyTokens FlatDisabledUnselectedOutlineColor;
    public static final float FlatDisabledUnselectedOutlineOpacity = 0.12f;
    private static final ColorSchemeKeyTokens FlatSelectedContainerColor;
    private static final float FlatSelectedFocusContainerElevation;
    private static final float FlatSelectedHoverContainerElevation;
    private static final float FlatSelectedOutlineWidth;
    private static final float FlatSelectedPressedContainerElevation;
    private static final float FlatUnselectedFocusContainerElevation;
    private static final ColorSchemeKeyTokens FlatUnselectedFocusOutlineColor;
    private static final float FlatUnselectedHoverContainerElevation;
    private static final ColorSchemeKeyTokens FlatUnselectedOutlineColor;
    private static final float FlatUnselectedOutlineWidth;
    private static final float FlatUnselectedPressedContainerElevation;
    private static final float IconSize;
    private static final TypographyKeyTokens LabelTextFont;
    private static final ColorSchemeKeyTokens SelectedDraggedIconColor;
    private static final ColorSchemeKeyTokens SelectedDraggedLabelTextColor;
    private static final ColorSchemeKeyTokens SelectedFocusIconColor;
    private static final ColorSchemeKeyTokens SelectedFocusLabelTextColor;
    private static final ColorSchemeKeyTokens SelectedHoverIconColor;
    private static final ColorSchemeKeyTokens SelectedHoverLabelTextColor;
    private static final ColorSchemeKeyTokens SelectedIconColor;
    private static final ColorSchemeKeyTokens SelectedLabelTextColor;
    private static final ColorSchemeKeyTokens SelectedPressedIconColor;
    private static final ColorSchemeKeyTokens SelectedPressedLabelTextColor;
    private static final ColorSchemeKeyTokens UnselectedDraggedIconColor;
    private static final ColorSchemeKeyTokens UnselectedDraggedLabelTextColor;
    private static final ColorSchemeKeyTokens UnselectedFocusIconColor;
    private static final ColorSchemeKeyTokens UnselectedFocusLabelTextColor;
    private static final ColorSchemeKeyTokens UnselectedHoverIconColor;
    private static final ColorSchemeKeyTokens UnselectedHoverLabelTextColor;
    private static final ColorSchemeKeyTokens UnselectedIconColor;
    private static final ColorSchemeKeyTokens UnselectedLabelTextColor;
    private static final ColorSchemeKeyTokens UnselectedPressedIconColor;
    private static final ColorSchemeKeyTokens UnselectedPressedLabelTextColor;
    public static final FilterChipTokens INSTANCE = new FilterChipTokens();
    private static final float ContainerHeight = Dp.m5155constructorimpl((float) 32.0d);
    private static final ShapeKeyTokens ContainerShape = ShapeKeyTokens.CornerSmall;
    private static final ColorSchemeKeyTokens ContainerSurfaceTintLayerColor = ColorSchemeKeyTokens.SurfaceTint;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurface;
        DisabledLabelTextColor = colorSchemeKeyTokens;
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        DraggedContainerElevation = elevationTokens.m2053getLevel4D9Ej5fM();
        ElevatedContainerElevation = elevationTokens.m2050getLevel1D9Ej5fM();
        ElevatedDisabledContainerColor = colorSchemeKeyTokens;
        ElevatedDisabledContainerElevation = elevationTokens.m2049getLevel0D9Ej5fM();
        ElevatedFocusContainerElevation = elevationTokens.m2050getLevel1D9Ej5fM();
        ElevatedHoverContainerElevation = elevationTokens.m2051getLevel2D9Ej5fM();
        ElevatedPressedContainerElevation = elevationTokens.m2050getLevel1D9Ej5fM();
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.SecondaryContainer;
        ElevatedSelectedContainerColor = colorSchemeKeyTokens2;
        ElevatedUnselectedContainerColor = ColorSchemeKeyTokens.Surface;
        FlatContainerElevation = elevationTokens.m2049getLevel0D9Ej5fM();
        FlatDisabledSelectedContainerColor = colorSchemeKeyTokens;
        FlatDisabledUnselectedOutlineColor = colorSchemeKeyTokens;
        FlatSelectedContainerColor = colorSchemeKeyTokens2;
        FlatSelectedFocusContainerElevation = elevationTokens.m2049getLevel0D9Ej5fM();
        FlatSelectedHoverContainerElevation = elevationTokens.m2050getLevel1D9Ej5fM();
        FlatSelectedOutlineWidth = Dp.m5155constructorimpl((float) 0.0d);
        FlatSelectedPressedContainerElevation = elevationTokens.m2049getLevel0D9Ej5fM();
        FlatUnselectedFocusContainerElevation = elevationTokens.m2049getLevel0D9Ej5fM();
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.OnSurfaceVariant;
        FlatUnselectedFocusOutlineColor = colorSchemeKeyTokens3;
        FlatUnselectedHoverContainerElevation = elevationTokens.m2049getLevel0D9Ej5fM();
        FlatUnselectedOutlineColor = ColorSchemeKeyTokens.Outline;
        FlatUnselectedOutlineWidth = Dp.m5155constructorimpl((float) 1.0d);
        FlatUnselectedPressedContainerElevation = elevationTokens.m2049getLevel0D9Ej5fM();
        LabelTextFont = TypographyKeyTokens.LabelLarge;
        ColorSchemeKeyTokens colorSchemeKeyTokens4 = ColorSchemeKeyTokens.OnSecondaryContainer;
        SelectedDraggedLabelTextColor = colorSchemeKeyTokens4;
        SelectedFocusLabelTextColor = colorSchemeKeyTokens4;
        SelectedHoverLabelTextColor = colorSchemeKeyTokens4;
        SelectedLabelTextColor = colorSchemeKeyTokens4;
        SelectedPressedLabelTextColor = colorSchemeKeyTokens4;
        UnselectedDraggedLabelTextColor = colorSchemeKeyTokens3;
        UnselectedFocusLabelTextColor = colorSchemeKeyTokens3;
        UnselectedHoverLabelTextColor = colorSchemeKeyTokens3;
        UnselectedLabelTextColor = colorSchemeKeyTokens3;
        UnselectedPressedLabelTextColor = colorSchemeKeyTokens3;
        DisabledIconColor = colorSchemeKeyTokens;
        IconSize = Dp.m5155constructorimpl((float) 18.0d);
        SelectedDraggedIconColor = colorSchemeKeyTokens4;
        SelectedFocusIconColor = colorSchemeKeyTokens4;
        SelectedHoverIconColor = colorSchemeKeyTokens4;
        SelectedIconColor = colorSchemeKeyTokens4;
        SelectedPressedIconColor = colorSchemeKeyTokens4;
        UnselectedDraggedIconColor = colorSchemeKeyTokens3;
        UnselectedFocusIconColor = colorSchemeKeyTokens3;
        UnselectedHoverIconColor = colorSchemeKeyTokens3;
        UnselectedIconColor = colorSchemeKeyTokens3;
        UnselectedPressedIconColor = colorSchemeKeyTokens3;
    }

    private FilterChipTokens() {
    }

    /* renamed from: getContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m2151getContainerHeightD9Ej5fM() {
        return ContainerHeight;
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    public final ColorSchemeKeyTokens getContainerSurfaceTintLayerColor() {
        return ContainerSurfaceTintLayerColor;
    }

    public final ColorSchemeKeyTokens getDisabledIconColor() {
        return DisabledIconColor;
    }

    public final ColorSchemeKeyTokens getDisabledLabelTextColor() {
        return DisabledLabelTextColor;
    }

    /* renamed from: getDraggedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2152getDraggedContainerElevationD9Ej5fM() {
        return DraggedContainerElevation;
    }

    /* renamed from: getElevatedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2153getElevatedContainerElevationD9Ej5fM() {
        return ElevatedContainerElevation;
    }

    public final ColorSchemeKeyTokens getElevatedDisabledContainerColor() {
        return ElevatedDisabledContainerColor;
    }

    /* renamed from: getElevatedDisabledContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2154getElevatedDisabledContainerElevationD9Ej5fM() {
        return ElevatedDisabledContainerElevation;
    }

    /* renamed from: getElevatedFocusContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2155getElevatedFocusContainerElevationD9Ej5fM() {
        return ElevatedFocusContainerElevation;
    }

    /* renamed from: getElevatedHoverContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2156getElevatedHoverContainerElevationD9Ej5fM() {
        return ElevatedHoverContainerElevation;
    }

    /* renamed from: getElevatedPressedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2157getElevatedPressedContainerElevationD9Ej5fM() {
        return ElevatedPressedContainerElevation;
    }

    public final ColorSchemeKeyTokens getElevatedSelectedContainerColor() {
        return ElevatedSelectedContainerColor;
    }

    public final ColorSchemeKeyTokens getElevatedUnselectedContainerColor() {
        return ElevatedUnselectedContainerColor;
    }

    /* renamed from: getFlatContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2158getFlatContainerElevationD9Ej5fM() {
        return FlatContainerElevation;
    }

    public final ColorSchemeKeyTokens getFlatDisabledSelectedContainerColor() {
        return FlatDisabledSelectedContainerColor;
    }

    public final ColorSchemeKeyTokens getFlatDisabledUnselectedOutlineColor() {
        return FlatDisabledUnselectedOutlineColor;
    }

    public final ColorSchemeKeyTokens getFlatSelectedContainerColor() {
        return FlatSelectedContainerColor;
    }

    /* renamed from: getFlatSelectedFocusContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2159getFlatSelectedFocusContainerElevationD9Ej5fM() {
        return FlatSelectedFocusContainerElevation;
    }

    /* renamed from: getFlatSelectedHoverContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2160getFlatSelectedHoverContainerElevationD9Ej5fM() {
        return FlatSelectedHoverContainerElevation;
    }

    /* renamed from: getFlatSelectedOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m2161getFlatSelectedOutlineWidthD9Ej5fM() {
        return FlatSelectedOutlineWidth;
    }

    /* renamed from: getFlatSelectedPressedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2162getFlatSelectedPressedContainerElevationD9Ej5fM() {
        return FlatSelectedPressedContainerElevation;
    }

    /* renamed from: getFlatUnselectedFocusContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2163getFlatUnselectedFocusContainerElevationD9Ej5fM() {
        return FlatUnselectedFocusContainerElevation;
    }

    public final ColorSchemeKeyTokens getFlatUnselectedFocusOutlineColor() {
        return FlatUnselectedFocusOutlineColor;
    }

    /* renamed from: getFlatUnselectedHoverContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2164getFlatUnselectedHoverContainerElevationD9Ej5fM() {
        return FlatUnselectedHoverContainerElevation;
    }

    public final ColorSchemeKeyTokens getFlatUnselectedOutlineColor() {
        return FlatUnselectedOutlineColor;
    }

    /* renamed from: getFlatUnselectedOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m2165getFlatUnselectedOutlineWidthD9Ej5fM() {
        return FlatUnselectedOutlineWidth;
    }

    /* renamed from: getFlatUnselectedPressedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2166getFlatUnselectedPressedContainerElevationD9Ej5fM() {
        return FlatUnselectedPressedContainerElevation;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m2167getIconSizeD9Ej5fM() {
        return IconSize;
    }

    public final TypographyKeyTokens getLabelTextFont() {
        return LabelTextFont;
    }

    public final ColorSchemeKeyTokens getSelectedDraggedIconColor() {
        return SelectedDraggedIconColor;
    }

    public final ColorSchemeKeyTokens getSelectedDraggedLabelTextColor() {
        return SelectedDraggedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getSelectedFocusIconColor() {
        return SelectedFocusIconColor;
    }

    public final ColorSchemeKeyTokens getSelectedFocusLabelTextColor() {
        return SelectedFocusLabelTextColor;
    }

    public final ColorSchemeKeyTokens getSelectedHoverIconColor() {
        return SelectedHoverIconColor;
    }

    public final ColorSchemeKeyTokens getSelectedHoverLabelTextColor() {
        return SelectedHoverLabelTextColor;
    }

    public final ColorSchemeKeyTokens getSelectedIconColor() {
        return SelectedIconColor;
    }

    public final ColorSchemeKeyTokens getSelectedLabelTextColor() {
        return SelectedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getSelectedPressedIconColor() {
        return SelectedPressedIconColor;
    }

    public final ColorSchemeKeyTokens getSelectedPressedLabelTextColor() {
        return SelectedPressedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getUnselectedDraggedIconColor() {
        return UnselectedDraggedIconColor;
    }

    public final ColorSchemeKeyTokens getUnselectedDraggedLabelTextColor() {
        return UnselectedDraggedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getUnselectedFocusIconColor() {
        return UnselectedFocusIconColor;
    }

    public final ColorSchemeKeyTokens getUnselectedFocusLabelTextColor() {
        return UnselectedFocusLabelTextColor;
    }

    public final ColorSchemeKeyTokens getUnselectedHoverIconColor() {
        return UnselectedHoverIconColor;
    }

    public final ColorSchemeKeyTokens getUnselectedHoverLabelTextColor() {
        return UnselectedHoverLabelTextColor;
    }

    public final ColorSchemeKeyTokens getUnselectedIconColor() {
        return UnselectedIconColor;
    }

    public final ColorSchemeKeyTokens getUnselectedLabelTextColor() {
        return UnselectedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getUnselectedPressedIconColor() {
        return UnselectedPressedIconColor;
    }

    public final ColorSchemeKeyTokens getUnselectedPressedLabelTextColor() {
        return UnselectedPressedLabelTextColor;
    }
}
