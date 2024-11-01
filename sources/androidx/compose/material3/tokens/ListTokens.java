package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;

/* loaded from: classes.dex */
public final class ListTokens {
    public static final ListTokens INSTANCE = new ListTokens();
    private static final ColorSchemeKeyTokens ListItemContainerColor = ColorSchemeKeyTokens.Surface;
    private static final float ListItemContainerElevation;
    private static final float ListItemContainerHeight;
    private static final ShapeKeyTokens ListItemContainerShape;
    private static final ColorSchemeKeyTokens ListItemDisabledLabelTextColor;
    public static final float ListItemDisabledLabelTextOpacity = 0.3f;
    private static final ColorSchemeKeyTokens ListItemDisabledLeadingIconColor;
    public static final float ListItemDisabledLeadingIconOpacity = 0.38f;
    private static final ColorSchemeKeyTokens ListItemDisabledTrailingIconColor;
    public static final float ListItemDisabledTrailingIconOpacity = 0.38f;
    private static final float ListItemDraggedContainerElevation;
    private static final ColorSchemeKeyTokens ListItemDraggedLabelTextColor;
    private static final ColorSchemeKeyTokens ListItemDraggedLeadingIconColor;
    private static final ColorSchemeKeyTokens ListItemDraggedTrailingIconColor;
    private static final ColorSchemeKeyTokens ListItemFocusLabelTextColor;
    private static final ColorSchemeKeyTokens ListItemFocusLeadingIconColor;
    private static final ColorSchemeKeyTokens ListItemFocusTrailingIconColor;
    private static final ColorSchemeKeyTokens ListItemHoverLabelTextColor;
    private static final ColorSchemeKeyTokens ListItemHoverLeadingIconColor;
    private static final ColorSchemeKeyTokens ListItemHoverTrailingIconColor;
    private static final ColorSchemeKeyTokens ListItemLabelTextColor;
    private static final TypographyKeyTokens ListItemLabelTextFont;
    private static final float ListItemLargeLeadingVideoHeight;
    private static final ColorSchemeKeyTokens ListItemLeadingAvatarColor;
    private static final ColorSchemeKeyTokens ListItemLeadingAvatarLabelColor;
    private static final TypographyKeyTokens ListItemLeadingAvatarLabelFont;
    private static final ShapeKeyTokens ListItemLeadingAvatarShape;
    private static final float ListItemLeadingAvatarSize;
    private static final ColorSchemeKeyTokens ListItemLeadingIconColor;
    private static final float ListItemLeadingIconSize;
    private static final float ListItemLeadingImageHeight;
    private static final ShapeKeyTokens ListItemLeadingImageShape;
    private static final float ListItemLeadingImageWidth;
    private static final ShapeKeyTokens ListItemLeadingVideoShape;
    private static final float ListItemLeadingVideoWidth;
    private static final ColorSchemeKeyTokens ListItemOverlineColor;
    private static final TypographyKeyTokens ListItemOverlineFont;
    private static final ColorSchemeKeyTokens ListItemPressedLabelTextColor;
    private static final ColorSchemeKeyTokens ListItemPressedLeadingIconColor;
    private static final ColorSchemeKeyTokens ListItemPressedTrailingIconColor;
    private static final ColorSchemeKeyTokens ListItemSelectedTrailingIconColor;
    private static final float ListItemSmallLeadingVideoHeight;
    private static final ColorSchemeKeyTokens ListItemSupportingTextColor;
    private static final TypographyKeyTokens ListItemSupportingTextFont;
    private static final ColorSchemeKeyTokens ListItemTrailingIconColor;
    private static final float ListItemTrailingIconSize;
    private static final ColorSchemeKeyTokens ListItemTrailingSupportingTextColor;
    private static final TypographyKeyTokens ListItemTrailingSupportingTextFont;
    private static final ColorSchemeKeyTokens ListItemUnselectedTrailingIconColor;

    static {
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        ListItemContainerElevation = elevationTokens.m2049getLevel0D9Ej5fM();
        float f8 = (float) 56.0d;
        ListItemContainerHeight = Dp.m5155constructorimpl(f8);
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerNone;
        ListItemContainerShape = shapeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurface;
        ListItemDisabledLabelTextColor = colorSchemeKeyTokens;
        ListItemDisabledLeadingIconColor = colorSchemeKeyTokens;
        ListItemDisabledTrailingIconColor = colorSchemeKeyTokens;
        ListItemDraggedContainerElevation = elevationTokens.m2053getLevel4D9Ej5fM();
        ListItemDraggedLabelTextColor = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurfaceVariant;
        ListItemDraggedLeadingIconColor = colorSchemeKeyTokens2;
        ListItemDraggedTrailingIconColor = colorSchemeKeyTokens2;
        ListItemFocusLabelTextColor = colorSchemeKeyTokens;
        ListItemFocusLeadingIconColor = colorSchemeKeyTokens2;
        ListItemFocusTrailingIconColor = colorSchemeKeyTokens2;
        ListItemHoverLabelTextColor = colorSchemeKeyTokens;
        ListItemHoverLeadingIconColor = colorSchemeKeyTokens2;
        ListItemHoverTrailingIconColor = colorSchemeKeyTokens2;
        ListItemLabelTextColor = colorSchemeKeyTokens;
        ListItemLabelTextFont = TypographyKeyTokens.BodyLarge;
        ListItemLargeLeadingVideoHeight = Dp.m5155constructorimpl((float) 69.0d);
        ListItemLeadingAvatarColor = ColorSchemeKeyTokens.PrimaryContainer;
        ListItemLeadingAvatarLabelColor = ColorSchemeKeyTokens.OnPrimaryContainer;
        ListItemLeadingAvatarLabelFont = TypographyKeyTokens.TitleMedium;
        ListItemLeadingAvatarShape = ShapeKeyTokens.CornerFull;
        ListItemLeadingAvatarSize = Dp.m5155constructorimpl((float) 40.0d);
        ListItemLeadingIconColor = colorSchemeKeyTokens2;
        ListItemLeadingIconSize = Dp.m5155constructorimpl((float) 18.0d);
        ListItemLeadingImageHeight = Dp.m5155constructorimpl(f8);
        ListItemLeadingImageShape = shapeKeyTokens;
        ListItemLeadingImageWidth = Dp.m5155constructorimpl(f8);
        ListItemLeadingVideoShape = shapeKeyTokens;
        ListItemLeadingVideoWidth = Dp.m5155constructorimpl((float) 100.0d);
        ListItemOverlineColor = colorSchemeKeyTokens2;
        TypographyKeyTokens typographyKeyTokens = TypographyKeyTokens.LabelSmall;
        ListItemOverlineFont = typographyKeyTokens;
        ListItemPressedLabelTextColor = colorSchemeKeyTokens;
        ListItemPressedLeadingIconColor = colorSchemeKeyTokens2;
        ListItemPressedTrailingIconColor = colorSchemeKeyTokens2;
        ListItemSelectedTrailingIconColor = ColorSchemeKeyTokens.Primary;
        ListItemSmallLeadingVideoHeight = Dp.m5155constructorimpl(f8);
        ListItemSupportingTextColor = colorSchemeKeyTokens2;
        ListItemSupportingTextFont = TypographyKeyTokens.BodyMedium;
        ListItemTrailingIconColor = colorSchemeKeyTokens2;
        ListItemTrailingIconSize = Dp.m5155constructorimpl((float) 24.0d);
        ListItemTrailingSupportingTextColor = colorSchemeKeyTokens2;
        ListItemTrailingSupportingTextFont = typographyKeyTokens;
        ListItemUnselectedTrailingIconColor = colorSchemeKeyTokens;
    }

    private ListTokens() {
    }

    public final ColorSchemeKeyTokens getListItemContainerColor() {
        return ListItemContainerColor;
    }

    /* renamed from: getListItemContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2180getListItemContainerElevationD9Ej5fM() {
        return ListItemContainerElevation;
    }

    /* renamed from: getListItemContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m2181getListItemContainerHeightD9Ej5fM() {
        return ListItemContainerHeight;
    }

    public final ShapeKeyTokens getListItemContainerShape() {
        return ListItemContainerShape;
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

    /* renamed from: getListItemDraggedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2182getListItemDraggedContainerElevationD9Ej5fM() {
        return ListItemDraggedContainerElevation;
    }

    public final ColorSchemeKeyTokens getListItemDraggedLabelTextColor() {
        return ListItemDraggedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getListItemDraggedLeadingIconColor() {
        return ListItemDraggedLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getListItemDraggedTrailingIconColor() {
        return ListItemDraggedTrailingIconColor;
    }

    public final ColorSchemeKeyTokens getListItemFocusLabelTextColor() {
        return ListItemFocusLabelTextColor;
    }

    public final ColorSchemeKeyTokens getListItemFocusLeadingIconColor() {
        return ListItemFocusLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getListItemFocusTrailingIconColor() {
        return ListItemFocusTrailingIconColor;
    }

    public final ColorSchemeKeyTokens getListItemHoverLabelTextColor() {
        return ListItemHoverLabelTextColor;
    }

    public final ColorSchemeKeyTokens getListItemHoverLeadingIconColor() {
        return ListItemHoverLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getListItemHoverTrailingIconColor() {
        return ListItemHoverTrailingIconColor;
    }

    public final ColorSchemeKeyTokens getListItemLabelTextColor() {
        return ListItemLabelTextColor;
    }

    public final TypographyKeyTokens getListItemLabelTextFont() {
        return ListItemLabelTextFont;
    }

    /* renamed from: getListItemLargeLeadingVideoHeight-D9Ej5fM, reason: not valid java name */
    public final float m2183getListItemLargeLeadingVideoHeightD9Ej5fM() {
        return ListItemLargeLeadingVideoHeight;
    }

    public final ColorSchemeKeyTokens getListItemLeadingAvatarColor() {
        return ListItemLeadingAvatarColor;
    }

    public final ColorSchemeKeyTokens getListItemLeadingAvatarLabelColor() {
        return ListItemLeadingAvatarLabelColor;
    }

    public final TypographyKeyTokens getListItemLeadingAvatarLabelFont() {
        return ListItemLeadingAvatarLabelFont;
    }

    public final ShapeKeyTokens getListItemLeadingAvatarShape() {
        return ListItemLeadingAvatarShape;
    }

    /* renamed from: getListItemLeadingAvatarSize-D9Ej5fM, reason: not valid java name */
    public final float m2184getListItemLeadingAvatarSizeD9Ej5fM() {
        return ListItemLeadingAvatarSize;
    }

    public final ColorSchemeKeyTokens getListItemLeadingIconColor() {
        return ListItemLeadingIconColor;
    }

    /* renamed from: getListItemLeadingIconSize-D9Ej5fM, reason: not valid java name */
    public final float m2185getListItemLeadingIconSizeD9Ej5fM() {
        return ListItemLeadingIconSize;
    }

    /* renamed from: getListItemLeadingImageHeight-D9Ej5fM, reason: not valid java name */
    public final float m2186getListItemLeadingImageHeightD9Ej5fM() {
        return ListItemLeadingImageHeight;
    }

    public final ShapeKeyTokens getListItemLeadingImageShape() {
        return ListItemLeadingImageShape;
    }

    /* renamed from: getListItemLeadingImageWidth-D9Ej5fM, reason: not valid java name */
    public final float m2187getListItemLeadingImageWidthD9Ej5fM() {
        return ListItemLeadingImageWidth;
    }

    public final ShapeKeyTokens getListItemLeadingVideoShape() {
        return ListItemLeadingVideoShape;
    }

    /* renamed from: getListItemLeadingVideoWidth-D9Ej5fM, reason: not valid java name */
    public final float m2188getListItemLeadingVideoWidthD9Ej5fM() {
        return ListItemLeadingVideoWidth;
    }

    public final ColorSchemeKeyTokens getListItemOverlineColor() {
        return ListItemOverlineColor;
    }

    public final TypographyKeyTokens getListItemOverlineFont() {
        return ListItemOverlineFont;
    }

    public final ColorSchemeKeyTokens getListItemPressedLabelTextColor() {
        return ListItemPressedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getListItemPressedLeadingIconColor() {
        return ListItemPressedLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getListItemPressedTrailingIconColor() {
        return ListItemPressedTrailingIconColor;
    }

    public final ColorSchemeKeyTokens getListItemSelectedTrailingIconColor() {
        return ListItemSelectedTrailingIconColor;
    }

    /* renamed from: getListItemSmallLeadingVideoHeight-D9Ej5fM, reason: not valid java name */
    public final float m2189getListItemSmallLeadingVideoHeightD9Ej5fM() {
        return ListItemSmallLeadingVideoHeight;
    }

    public final ColorSchemeKeyTokens getListItemSupportingTextColor() {
        return ListItemSupportingTextColor;
    }

    public final TypographyKeyTokens getListItemSupportingTextFont() {
        return ListItemSupportingTextFont;
    }

    public final ColorSchemeKeyTokens getListItemTrailingIconColor() {
        return ListItemTrailingIconColor;
    }

    /* renamed from: getListItemTrailingIconSize-D9Ej5fM, reason: not valid java name */
    public final float m2190getListItemTrailingIconSizeD9Ej5fM() {
        return ListItemTrailingIconSize;
    }

    public final ColorSchemeKeyTokens getListItemTrailingSupportingTextColor() {
        return ListItemTrailingSupportingTextColor;
    }

    public final TypographyKeyTokens getListItemTrailingSupportingTextFont() {
        return ListItemTrailingSupportingTextFont;
    }

    public final ColorSchemeKeyTokens getListItemUnselectedTrailingIconColor() {
        return ListItemUnselectedTrailingIconColor;
    }
}
