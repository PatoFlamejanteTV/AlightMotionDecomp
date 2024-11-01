package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;

/* loaded from: classes.dex */
public final class NavigationDrawerTokens {
    private static final ColorSchemeKeyTokens ActiveFocusIconColor;
    private static final ColorSchemeKeyTokens ActiveFocusLabelTextColor;
    private static final ColorSchemeKeyTokens ActiveHoverIconColor;
    private static final ColorSchemeKeyTokens ActiveHoverLabelTextColor;
    private static final ColorSchemeKeyTokens ActiveIconColor;
    private static final ColorSchemeKeyTokens ActiveIndicatorColor;
    private static final float ActiveIndicatorHeight;
    private static final ShapeKeyTokens ActiveIndicatorShape;
    private static final float ActiveIndicatorWidth;
    private static final ColorSchemeKeyTokens ActiveLabelTextColor;
    private static final ColorSchemeKeyTokens ActivePressedIconColor;
    private static final ColorSchemeKeyTokens ActivePressedLabelTextColor;
    private static final ShapeKeyTokens BottomContainerShape;
    private static final ColorSchemeKeyTokens ContainerColor;
    public static final float ContainerHeightPercent = 100.0f;
    private static final ShapeKeyTokens ContainerShape;
    private static final ColorSchemeKeyTokens ContainerSurfaceTintLayerColor;
    private static final float ContainerWidth;
    private static final ColorSchemeKeyTokens HeadlineColor;
    private static final TypographyKeyTokens HeadlineFont;
    public static final NavigationDrawerTokens INSTANCE = new NavigationDrawerTokens();
    private static final float IconSize;
    private static final ColorSchemeKeyTokens InactiveFocusIconColor;
    private static final ColorSchemeKeyTokens InactiveFocusLabelTextColor;
    private static final ColorSchemeKeyTokens InactiveHoverIconColor;
    private static final ColorSchemeKeyTokens InactiveHoverLabelTextColor;
    private static final ColorSchemeKeyTokens InactiveIconColor;
    private static final ColorSchemeKeyTokens InactiveLabelTextColor;
    private static final ColorSchemeKeyTokens InactivePressedIconColor;
    private static final ColorSchemeKeyTokens InactivePressedLabelTextColor;
    private static final TypographyKeyTokens LabelTextFont;
    private static final ColorSchemeKeyTokens LargeBadgeLabelColor;
    private static final TypographyKeyTokens LargeBadgeLabelFont;
    private static final float ModalContainerElevation;
    private static final float StandardContainerElevation;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSecondaryContainer;
        ActiveFocusIconColor = colorSchemeKeyTokens;
        ActiveFocusLabelTextColor = colorSchemeKeyTokens;
        ActiveHoverIconColor = colorSchemeKeyTokens;
        ActiveHoverLabelTextColor = colorSchemeKeyTokens;
        ActiveIconColor = colorSchemeKeyTokens;
        ActiveIndicatorColor = ColorSchemeKeyTokens.SecondaryContainer;
        ActiveIndicatorHeight = Dp.m5155constructorimpl((float) 56.0d);
        ActiveIndicatorShape = ShapeKeyTokens.CornerFull;
        ActiveIndicatorWidth = Dp.m5155constructorimpl((float) 336.0d);
        ActiveLabelTextColor = colorSchemeKeyTokens;
        ActivePressedIconColor = colorSchemeKeyTokens;
        ActivePressedLabelTextColor = colorSchemeKeyTokens;
        BottomContainerShape = ShapeKeyTokens.CornerLargeTop;
        ContainerColor = ColorSchemeKeyTokens.Surface;
        ContainerShape = ShapeKeyTokens.CornerLargeEnd;
        ContainerSurfaceTintLayerColor = ColorSchemeKeyTokens.SurfaceTint;
        ContainerWidth = Dp.m5155constructorimpl((float) 360.0d);
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurfaceVariant;
        HeadlineColor = colorSchemeKeyTokens2;
        HeadlineFont = TypographyKeyTokens.TitleSmall;
        IconSize = Dp.m5155constructorimpl((float) 24.0d);
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.OnSurface;
        InactiveFocusIconColor = colorSchemeKeyTokens3;
        InactiveFocusLabelTextColor = colorSchemeKeyTokens3;
        InactiveHoverIconColor = colorSchemeKeyTokens3;
        InactiveHoverLabelTextColor = colorSchemeKeyTokens3;
        InactiveIconColor = colorSchemeKeyTokens2;
        InactiveLabelTextColor = colorSchemeKeyTokens2;
        InactivePressedIconColor = colorSchemeKeyTokens3;
        InactivePressedLabelTextColor = colorSchemeKeyTokens3;
        TypographyKeyTokens typographyKeyTokens = TypographyKeyTokens.LabelLarge;
        LabelTextFont = typographyKeyTokens;
        LargeBadgeLabelColor = colorSchemeKeyTokens2;
        LargeBadgeLabelFont = typographyKeyTokens;
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        ModalContainerElevation = elevationTokens.m2050getLevel1D9Ej5fM();
        StandardContainerElevation = elevationTokens.m2049getLevel0D9Ej5fM();
    }

    private NavigationDrawerTokens() {
    }

    public final ColorSchemeKeyTokens getActiveFocusIconColor() {
        return ActiveFocusIconColor;
    }

    public final ColorSchemeKeyTokens getActiveFocusLabelTextColor() {
        return ActiveFocusLabelTextColor;
    }

    public final ColorSchemeKeyTokens getActiveHoverIconColor() {
        return ActiveHoverIconColor;
    }

    public final ColorSchemeKeyTokens getActiveHoverLabelTextColor() {
        return ActiveHoverLabelTextColor;
    }

    public final ColorSchemeKeyTokens getActiveIconColor() {
        return ActiveIconColor;
    }

    public final ColorSchemeKeyTokens getActiveIndicatorColor() {
        return ActiveIndicatorColor;
    }

    /* renamed from: getActiveIndicatorHeight-D9Ej5fM, reason: not valid java name */
    public final float m2200getActiveIndicatorHeightD9Ej5fM() {
        return ActiveIndicatorHeight;
    }

    public final ShapeKeyTokens getActiveIndicatorShape() {
        return ActiveIndicatorShape;
    }

    /* renamed from: getActiveIndicatorWidth-D9Ej5fM, reason: not valid java name */
    public final float m2201getActiveIndicatorWidthD9Ej5fM() {
        return ActiveIndicatorWidth;
    }

    public final ColorSchemeKeyTokens getActiveLabelTextColor() {
        return ActiveLabelTextColor;
    }

    public final ColorSchemeKeyTokens getActivePressedIconColor() {
        return ActivePressedIconColor;
    }

    public final ColorSchemeKeyTokens getActivePressedLabelTextColor() {
        return ActivePressedLabelTextColor;
    }

    public final ShapeKeyTokens getBottomContainerShape() {
        return BottomContainerShape;
    }

    public final ColorSchemeKeyTokens getContainerColor() {
        return ContainerColor;
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    public final ColorSchemeKeyTokens getContainerSurfaceTintLayerColor() {
        return ContainerSurfaceTintLayerColor;
    }

    /* renamed from: getContainerWidth-D9Ej5fM, reason: not valid java name */
    public final float m2202getContainerWidthD9Ej5fM() {
        return ContainerWidth;
    }

    public final ColorSchemeKeyTokens getHeadlineColor() {
        return HeadlineColor;
    }

    public final TypographyKeyTokens getHeadlineFont() {
        return HeadlineFont;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m2203getIconSizeD9Ej5fM() {
        return IconSize;
    }

    public final ColorSchemeKeyTokens getInactiveFocusIconColor() {
        return InactiveFocusIconColor;
    }

    public final ColorSchemeKeyTokens getInactiveFocusLabelTextColor() {
        return InactiveFocusLabelTextColor;
    }

    public final ColorSchemeKeyTokens getInactiveHoverIconColor() {
        return InactiveHoverIconColor;
    }

    public final ColorSchemeKeyTokens getInactiveHoverLabelTextColor() {
        return InactiveHoverLabelTextColor;
    }

    public final ColorSchemeKeyTokens getInactiveIconColor() {
        return InactiveIconColor;
    }

    public final ColorSchemeKeyTokens getInactiveLabelTextColor() {
        return InactiveLabelTextColor;
    }

    public final ColorSchemeKeyTokens getInactivePressedIconColor() {
        return InactivePressedIconColor;
    }

    public final ColorSchemeKeyTokens getInactivePressedLabelTextColor() {
        return InactivePressedLabelTextColor;
    }

    public final TypographyKeyTokens getLabelTextFont() {
        return LabelTextFont;
    }

    public final ColorSchemeKeyTokens getLargeBadgeLabelColor() {
        return LargeBadgeLabelColor;
    }

    public final TypographyKeyTokens getLargeBadgeLabelFont() {
        return LargeBadgeLabelFont;
    }

    /* renamed from: getModalContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2204getModalContainerElevationD9Ej5fM() {
        return ModalContainerElevation;
    }

    /* renamed from: getStandardContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2205getStandardContainerElevationD9Ej5fM() {
        return StandardContainerElevation;
    }
}
