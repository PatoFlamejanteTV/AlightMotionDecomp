package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;

/* loaded from: classes.dex */
public final class MenuTokens {
    private static final ColorSchemeKeyTokens ListItemDisabledLabelTextColor;
    public static final float ListItemDisabledLabelTextOpacity = 0.38f;
    private static final ColorSchemeKeyTokens ListItemDisabledLeadingIconColor;
    public static final float ListItemDisabledLeadingIconOpacity = 0.38f;
    private static final ColorSchemeKeyTokens ListItemDisabledTrailingIconColor;
    public static final float ListItemDisabledTrailingIconOpacity = 0.38f;
    private static final ColorSchemeKeyTokens ListItemFocusLabelTextColor;
    private static final ColorSchemeKeyTokens ListItemHoverLabelTextColor;
    private static final ColorSchemeKeyTokens ListItemLabelTextColor;
    private static final TypographyKeyTokens ListItemLabelTextFont;
    private static final ColorSchemeKeyTokens ListItemLeadingFocusIconColor;
    private static final ColorSchemeKeyTokens ListItemLeadingHoverIconColor;
    private static final ColorSchemeKeyTokens ListItemLeadingIconColor;
    private static final float ListItemLeadingIconSize;
    private static final ColorSchemeKeyTokens ListItemLeadingPressedIconColor;
    private static final ColorSchemeKeyTokens ListItemPressedLabelTextColor;
    private static final ColorSchemeKeyTokens ListItemSelectedContainerColor;
    private static final ColorSchemeKeyTokens ListItemTrailingFocusIconColor;
    private static final ColorSchemeKeyTokens ListItemTrailingHoverIconColor;
    private static final ColorSchemeKeyTokens ListItemTrailingIconColor;
    private static final float ListItemTrailingIconSize;
    private static final ColorSchemeKeyTokens ListItemTrailingPressedIconColor;
    public static final MenuTokens INSTANCE = new MenuTokens();
    private static final ColorSchemeKeyTokens ContainerColor = ColorSchemeKeyTokens.Surface;
    private static final float ContainerElevation = ElevationTokens.INSTANCE.m2051getLevel2D9Ej5fM();
    private static final ShapeKeyTokens ContainerShape = ShapeKeyTokens.CornerExtraSmall;
    private static final ColorSchemeKeyTokens ContainerSurfaceTintLayerColor = ColorSchemeKeyTokens.SurfaceTint;
    private static final float ListItemContainerHeight = Dp.m5155constructorimpl((float) 48.0d);

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurface;
        ListItemDisabledLabelTextColor = colorSchemeKeyTokens;
        ListItemFocusLabelTextColor = colorSchemeKeyTokens;
        ListItemHoverLabelTextColor = colorSchemeKeyTokens;
        ListItemLabelTextColor = colorSchemeKeyTokens;
        ListItemLabelTextFont = TypographyKeyTokens.LabelLarge;
        ListItemPressedLabelTextColor = colorSchemeKeyTokens;
        ListItemSelectedContainerColor = ColorSchemeKeyTokens.SurfaceVariant;
        ListItemDisabledLeadingIconColor = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurfaceVariant;
        ListItemLeadingFocusIconColor = colorSchemeKeyTokens2;
        ListItemLeadingHoverIconColor = colorSchemeKeyTokens2;
        ListItemLeadingIconColor = colorSchemeKeyTokens2;
        float f8 = (float) 24.0d;
        ListItemLeadingIconSize = Dp.m5155constructorimpl(f8);
        ListItemLeadingPressedIconColor = colorSchemeKeyTokens2;
        ListItemDisabledTrailingIconColor = colorSchemeKeyTokens;
        ListItemTrailingFocusIconColor = colorSchemeKeyTokens2;
        ListItemTrailingHoverIconColor = colorSchemeKeyTokens2;
        ListItemTrailingPressedIconColor = colorSchemeKeyTokens2;
        ListItemTrailingIconColor = colorSchemeKeyTokens2;
        ListItemTrailingIconSize = Dp.m5155constructorimpl(f8);
    }

    private MenuTokens() {
    }

    public final ColorSchemeKeyTokens getContainerColor() {
        return ContainerColor;
    }

    /* renamed from: getContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2191getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    public final ColorSchemeKeyTokens getContainerSurfaceTintLayerColor() {
        return ContainerSurfaceTintLayerColor;
    }

    /* renamed from: getListItemContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m2192getListItemContainerHeightD9Ej5fM() {
        return ListItemContainerHeight;
    }

    public final ColorSchemeKeyTokens getListItemDisabledLabelTextColor() {
        return ListItemDisabledLabelTextColor;
    }

    public final ColorSchemeKeyTokens getListItemDisabledLeadingIconColor() {
        return ListItemDisabledLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getListItemDisabledTrailingIconColor() {
        return ListItemDisabledTrailingIconColor;
    }

    public final ColorSchemeKeyTokens getListItemFocusLabelTextColor() {
        return ListItemFocusLabelTextColor;
    }

    public final ColorSchemeKeyTokens getListItemHoverLabelTextColor() {
        return ListItemHoverLabelTextColor;
    }

    public final ColorSchemeKeyTokens getListItemLabelTextColor() {
        return ListItemLabelTextColor;
    }

    public final TypographyKeyTokens getListItemLabelTextFont() {
        return ListItemLabelTextFont;
    }

    public final ColorSchemeKeyTokens getListItemLeadingFocusIconColor() {
        return ListItemLeadingFocusIconColor;
    }

    public final ColorSchemeKeyTokens getListItemLeadingHoverIconColor() {
        return ListItemLeadingHoverIconColor;
    }

    public final ColorSchemeKeyTokens getListItemLeadingIconColor() {
        return ListItemLeadingIconColor;
    }

    /* renamed from: getListItemLeadingIconSize-D9Ej5fM, reason: not valid java name */
    public final float m2193getListItemLeadingIconSizeD9Ej5fM() {
        return ListItemLeadingIconSize;
    }

    public final ColorSchemeKeyTokens getListItemLeadingPressedIconColor() {
        return ListItemLeadingPressedIconColor;
    }

    public final ColorSchemeKeyTokens getListItemPressedLabelTextColor() {
        return ListItemPressedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getListItemSelectedContainerColor() {
        return ListItemSelectedContainerColor;
    }

    public final ColorSchemeKeyTokens getListItemTrailingFocusIconColor() {
        return ListItemTrailingFocusIconColor;
    }

    public final ColorSchemeKeyTokens getListItemTrailingHoverIconColor() {
        return ListItemTrailingHoverIconColor;
    }

    public final ColorSchemeKeyTokens getListItemTrailingIconColor() {
        return ListItemTrailingIconColor;
    }

    /* renamed from: getListItemTrailingIconSize-D9Ej5fM, reason: not valid java name */
    public final float m2194getListItemTrailingIconSizeD9Ej5fM() {
        return ListItemTrailingIconSize;
    }

    public final ColorSchemeKeyTokens getListItemTrailingPressedIconColor() {
        return ListItemTrailingPressedIconColor;
    }
}
