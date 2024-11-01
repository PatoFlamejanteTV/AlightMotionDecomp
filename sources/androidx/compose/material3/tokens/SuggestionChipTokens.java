package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;

/* loaded from: classes.dex */
public final class SuggestionChipTokens {
    private static final ColorSchemeKeyTokens DisabledLabelTextColor;
    public static final float DisabledLabelTextOpacity = 0.38f;
    private static final ColorSchemeKeyTokens DisabledLeadingIconColor;
    public static final float DisabledLeadingIconOpacity = 0.38f;
    private static final float DraggedContainerElevation;
    private static final ColorSchemeKeyTokens DraggedLabelTextColor;
    private static final ColorSchemeKeyTokens DraggedLeadingIconColor;
    private static final ColorSchemeKeyTokens ElevatedContainerColor;
    private static final float ElevatedContainerElevation;
    private static final ColorSchemeKeyTokens ElevatedDisabledContainerColor;
    private static final float ElevatedDisabledContainerElevation;
    public static final float ElevatedDisabledContainerOpacity = 0.12f;
    private static final float ElevatedFocusContainerElevation;
    private static final float ElevatedHoverContainerElevation;
    private static final float ElevatedPressedContainerElevation;
    private static final float FlatContainerElevation;
    private static final ColorSchemeKeyTokens FlatDisabledOutlineColor;
    public static final float FlatDisabledOutlineOpacity = 0.12f;
    private static final ColorSchemeKeyTokens FlatFocusOutlineColor;
    private static final ColorSchemeKeyTokens FlatOutlineColor;
    private static final float FlatOutlineWidth;
    private static final ColorSchemeKeyTokens FocusLabelTextColor;
    private static final ColorSchemeKeyTokens FocusLeadingIconColor;
    private static final ColorSchemeKeyTokens HoverLabelTextColor;
    private static final ColorSchemeKeyTokens HoverLeadingIconColor;
    private static final ColorSchemeKeyTokens LabelTextColor;
    private static final TypographyKeyTokens LabelTextFont;
    private static final ColorSchemeKeyTokens LeadingIconColor;
    private static final float LeadingIconSize;
    private static final ColorSchemeKeyTokens PressedLabelTextColor;
    private static final ColorSchemeKeyTokens PressedLeadingIconColor;
    public static final SuggestionChipTokens INSTANCE = new SuggestionChipTokens();
    private static final float ContainerHeight = Dp.m5155constructorimpl((float) 32.0d);
    private static final ShapeKeyTokens ContainerShape = ShapeKeyTokens.CornerSmall;
    private static final ColorSchemeKeyTokens ContainerSurfaceTintLayerColor = ColorSchemeKeyTokens.SurfaceTint;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurface;
        DisabledLabelTextColor = colorSchemeKeyTokens;
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        DraggedContainerElevation = elevationTokens.m2053getLevel4D9Ej5fM();
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurfaceVariant;
        DraggedLabelTextColor = colorSchemeKeyTokens2;
        ElevatedContainerColor = ColorSchemeKeyTokens.Surface;
        ElevatedContainerElevation = elevationTokens.m2050getLevel1D9Ej5fM();
        ElevatedDisabledContainerColor = colorSchemeKeyTokens;
        ElevatedDisabledContainerElevation = elevationTokens.m2049getLevel0D9Ej5fM();
        ElevatedFocusContainerElevation = elevationTokens.m2050getLevel1D9Ej5fM();
        ElevatedHoverContainerElevation = elevationTokens.m2051getLevel2D9Ej5fM();
        ElevatedPressedContainerElevation = elevationTokens.m2050getLevel1D9Ej5fM();
        FlatContainerElevation = elevationTokens.m2049getLevel0D9Ej5fM();
        FlatDisabledOutlineColor = colorSchemeKeyTokens;
        FlatFocusOutlineColor = colorSchemeKeyTokens2;
        FlatOutlineColor = ColorSchemeKeyTokens.Outline;
        FlatOutlineWidth = Dp.m5155constructorimpl((float) 1.0d);
        FocusLabelTextColor = colorSchemeKeyTokens2;
        HoverLabelTextColor = colorSchemeKeyTokens2;
        LabelTextColor = colorSchemeKeyTokens2;
        LabelTextFont = TypographyKeyTokens.LabelLarge;
        PressedLabelTextColor = colorSchemeKeyTokens2;
        DisabledLeadingIconColor = colorSchemeKeyTokens;
        DraggedLeadingIconColor = colorSchemeKeyTokens2;
        FocusLeadingIconColor = colorSchemeKeyTokens2;
        HoverLeadingIconColor = colorSchemeKeyTokens2;
        LeadingIconColor = colorSchemeKeyTokens2;
        LeadingIconSize = Dp.m5155constructorimpl((float) 18.0d);
        PressedLeadingIconColor = colorSchemeKeyTokens2;
    }

    private SuggestionChipTokens() {
    }

    /* renamed from: getContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m2348getContainerHeightD9Ej5fM() {
        return ContainerHeight;
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    public final ColorSchemeKeyTokens getContainerSurfaceTintLayerColor() {
        return ContainerSurfaceTintLayerColor;
    }

    public final ColorSchemeKeyTokens getDisabledLabelTextColor() {
        return DisabledLabelTextColor;
    }

    public final ColorSchemeKeyTokens getDisabledLeadingIconColor() {
        return DisabledLeadingIconColor;
    }

    /* renamed from: getDraggedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2349getDraggedContainerElevationD9Ej5fM() {
        return DraggedContainerElevation;
    }

    public final ColorSchemeKeyTokens getDraggedLabelTextColor() {
        return DraggedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getDraggedLeadingIconColor() {
        return DraggedLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getElevatedContainerColor() {
        return ElevatedContainerColor;
    }

    /* renamed from: getElevatedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2350getElevatedContainerElevationD9Ej5fM() {
        return ElevatedContainerElevation;
    }

    public final ColorSchemeKeyTokens getElevatedDisabledContainerColor() {
        return ElevatedDisabledContainerColor;
    }

    /* renamed from: getElevatedDisabledContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2351getElevatedDisabledContainerElevationD9Ej5fM() {
        return ElevatedDisabledContainerElevation;
    }

    /* renamed from: getElevatedFocusContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2352getElevatedFocusContainerElevationD9Ej5fM() {
        return ElevatedFocusContainerElevation;
    }

    /* renamed from: getElevatedHoverContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2353getElevatedHoverContainerElevationD9Ej5fM() {
        return ElevatedHoverContainerElevation;
    }

    /* renamed from: getElevatedPressedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2354getElevatedPressedContainerElevationD9Ej5fM() {
        return ElevatedPressedContainerElevation;
    }

    /* renamed from: getFlatContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2355getFlatContainerElevationD9Ej5fM() {
        return FlatContainerElevation;
    }

    public final ColorSchemeKeyTokens getFlatDisabledOutlineColor() {
        return FlatDisabledOutlineColor;
    }

    public final ColorSchemeKeyTokens getFlatFocusOutlineColor() {
        return FlatFocusOutlineColor;
    }

    public final ColorSchemeKeyTokens getFlatOutlineColor() {
        return FlatOutlineColor;
    }

    /* renamed from: getFlatOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m2356getFlatOutlineWidthD9Ej5fM() {
        return FlatOutlineWidth;
    }

    public final ColorSchemeKeyTokens getFocusLabelTextColor() {
        return FocusLabelTextColor;
    }

    public final ColorSchemeKeyTokens getFocusLeadingIconColor() {
        return FocusLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getHoverLabelTextColor() {
        return HoverLabelTextColor;
    }

    public final ColorSchemeKeyTokens getHoverLeadingIconColor() {
        return HoverLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getLabelTextColor() {
        return LabelTextColor;
    }

    public final TypographyKeyTokens getLabelTextFont() {
        return LabelTextFont;
    }

    public final ColorSchemeKeyTokens getLeadingIconColor() {
        return LeadingIconColor;
    }

    /* renamed from: getLeadingIconSize-D9Ej5fM, reason: not valid java name */
    public final float m2357getLeadingIconSizeD9Ej5fM() {
        return LeadingIconSize;
    }

    public final ColorSchemeKeyTokens getPressedLabelTextColor() {
        return PressedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getPressedLeadingIconColor() {
        return PressedLeadingIconColor;
    }
}
