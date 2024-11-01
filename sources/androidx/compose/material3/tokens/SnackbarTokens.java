package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;

/* loaded from: classes.dex */
public final class SnackbarTokens {
    private static final ColorSchemeKeyTokens ActionFocusLabelTextColor;
    private static final ColorSchemeKeyTokens ActionHoverLabelTextColor;
    private static final ColorSchemeKeyTokens ActionLabelTextColor;
    private static final TypographyKeyTokens ActionLabelTextFont;
    private static final ColorSchemeKeyTokens ActionPressedLabelTextColor;
    private static final ColorSchemeKeyTokens ContainerColor;
    private static final float ContainerElevation;
    private static final ShapeKeyTokens ContainerShape;
    private static final ColorSchemeKeyTokens FocusIconColor;
    private static final ColorSchemeKeyTokens HoverIconColor;
    public static final SnackbarTokens INSTANCE = new SnackbarTokens();
    private static final ColorSchemeKeyTokens IconColor;
    private static final float IconSize;
    private static final ColorSchemeKeyTokens PressedIconColor;
    private static final float SingleLineContainerHeight;
    private static final ColorSchemeKeyTokens SupportingTextColor;
    private static final TypographyKeyTokens SupportingTextFont;
    private static final float TwoLinesContainerHeight;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.InversePrimary;
        ActionFocusLabelTextColor = colorSchemeKeyTokens;
        ActionHoverLabelTextColor = colorSchemeKeyTokens;
        ActionLabelTextColor = colorSchemeKeyTokens;
        ActionLabelTextFont = TypographyKeyTokens.LabelLarge;
        ActionPressedLabelTextColor = colorSchemeKeyTokens;
        ContainerColor = ColorSchemeKeyTokens.InverseSurface;
        ContainerElevation = ElevationTokens.INSTANCE.m2052getLevel3D9Ej5fM();
        ContainerShape = ShapeKeyTokens.CornerExtraSmall;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.InverseOnSurface;
        IconColor = colorSchemeKeyTokens2;
        FocusIconColor = colorSchemeKeyTokens2;
        HoverIconColor = colorSchemeKeyTokens2;
        PressedIconColor = colorSchemeKeyTokens2;
        IconSize = Dp.m5155constructorimpl((float) 24.0d);
        SupportingTextColor = colorSchemeKeyTokens2;
        SupportingTextFont = TypographyKeyTokens.BodyMedium;
        SingleLineContainerHeight = Dp.m5155constructorimpl((float) 48.0d);
        TwoLinesContainerHeight = Dp.m5155constructorimpl((float) 68.0d);
    }

    private SnackbarTokens() {
    }

    public final ColorSchemeKeyTokens getActionFocusLabelTextColor() {
        return ActionFocusLabelTextColor;
    }

    public final ColorSchemeKeyTokens getActionHoverLabelTextColor() {
        return ActionHoverLabelTextColor;
    }

    public final ColorSchemeKeyTokens getActionLabelTextColor() {
        return ActionLabelTextColor;
    }

    public final TypographyKeyTokens getActionLabelTextFont() {
        return ActionLabelTextFont;
    }

    public final ColorSchemeKeyTokens getActionPressedLabelTextColor() {
        return ActionPressedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getContainerColor() {
        return ContainerColor;
    }

    /* renamed from: getContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2344getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    public final ColorSchemeKeyTokens getFocusIconColor() {
        return FocusIconColor;
    }

    public final ColorSchemeKeyTokens getHoverIconColor() {
        return HoverIconColor;
    }

    public final ColorSchemeKeyTokens getIconColor() {
        return IconColor;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m2345getIconSizeD9Ej5fM() {
        return IconSize;
    }

    public final ColorSchemeKeyTokens getPressedIconColor() {
        return PressedIconColor;
    }

    /* renamed from: getSingleLineContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m2346getSingleLineContainerHeightD9Ej5fM() {
        return SingleLineContainerHeight;
    }

    public final ColorSchemeKeyTokens getSupportingTextColor() {
        return SupportingTextColor;
    }

    public final TypographyKeyTokens getSupportingTextFont() {
        return SupportingTextFont;
    }

    /* renamed from: getTwoLinesContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m2347getTwoLinesContainerHeightD9Ej5fM() {
        return TwoLinesContainerHeight;
    }
}
