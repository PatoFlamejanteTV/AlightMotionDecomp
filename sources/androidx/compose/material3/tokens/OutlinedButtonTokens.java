package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;

/* loaded from: classes.dex */
public final class OutlinedButtonTokens {
    private static final ColorSchemeKeyTokens DisabledIconColor;
    public static final float DisabledIconOpacity = 0.38f;
    private static final ColorSchemeKeyTokens DisabledLabelTextColor;
    public static final float DisabledLabelTextOpacity = 0.38f;
    private static final ColorSchemeKeyTokens DisabledOutlineColor;
    public static final float DisabledOutlineOpacity = 0.12f;
    private static final ColorSchemeKeyTokens FocusIconColor;
    private static final ColorSchemeKeyTokens FocusLabelTextColor;
    private static final ColorSchemeKeyTokens FocusOutlineColor;
    private static final ColorSchemeKeyTokens HoverIconColor;
    private static final ColorSchemeKeyTokens HoverLabelTextColor;
    private static final ColorSchemeKeyTokens HoverOutlineColor;
    private static final ColorSchemeKeyTokens IconColor;
    private static final float IconSize;
    private static final ColorSchemeKeyTokens LabelTextColor;
    private static final TypographyKeyTokens LabelTextFont;
    private static final ColorSchemeKeyTokens OutlineColor;
    private static final float OutlineWidth;
    private static final ColorSchemeKeyTokens PressedIconColor;
    private static final ColorSchemeKeyTokens PressedLabelTextColor;
    private static final ColorSchemeKeyTokens PressedOutlineColor;
    public static final OutlinedButtonTokens INSTANCE = new OutlinedButtonTokens();
    private static final float ContainerHeight = Dp.m5155constructorimpl((float) 40.0d);
    private static final ShapeKeyTokens ContainerShape = ShapeKeyTokens.CornerFull;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurface;
        DisabledLabelTextColor = colorSchemeKeyTokens;
        DisabledOutlineColor = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.Primary;
        FocusLabelTextColor = colorSchemeKeyTokens2;
        FocusOutlineColor = colorSchemeKeyTokens2;
        HoverLabelTextColor = colorSchemeKeyTokens2;
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.Outline;
        HoverOutlineColor = colorSchemeKeyTokens3;
        LabelTextColor = colorSchemeKeyTokens2;
        LabelTextFont = TypographyKeyTokens.LabelLarge;
        OutlineColor = colorSchemeKeyTokens3;
        OutlineWidth = Dp.m5155constructorimpl((float) 1.0d);
        PressedLabelTextColor = colorSchemeKeyTokens2;
        PressedOutlineColor = colorSchemeKeyTokens3;
        DisabledIconColor = colorSchemeKeyTokens;
        FocusIconColor = colorSchemeKeyTokens2;
        HoverIconColor = colorSchemeKeyTokens2;
        IconColor = colorSchemeKeyTokens2;
        IconSize = Dp.m5155constructorimpl((float) 18.0d);
        PressedIconColor = colorSchemeKeyTokens2;
    }

    private OutlinedButtonTokens() {
    }

    /* renamed from: getContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m2223getContainerHeightD9Ej5fM() {
        return ContainerHeight;
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    public final ColorSchemeKeyTokens getDisabledIconColor() {
        return DisabledIconColor;
    }

    public final ColorSchemeKeyTokens getDisabledLabelTextColor() {
        return DisabledLabelTextColor;
    }

    public final ColorSchemeKeyTokens getDisabledOutlineColor() {
        return DisabledOutlineColor;
    }

    public final ColorSchemeKeyTokens getFocusIconColor() {
        return FocusIconColor;
    }

    public final ColorSchemeKeyTokens getFocusLabelTextColor() {
        return FocusLabelTextColor;
    }

    public final ColorSchemeKeyTokens getFocusOutlineColor() {
        return FocusOutlineColor;
    }

    public final ColorSchemeKeyTokens getHoverIconColor() {
        return HoverIconColor;
    }

    public final ColorSchemeKeyTokens getHoverLabelTextColor() {
        return HoverLabelTextColor;
    }

    public final ColorSchemeKeyTokens getHoverOutlineColor() {
        return HoverOutlineColor;
    }

    public final ColorSchemeKeyTokens getIconColor() {
        return IconColor;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m2224getIconSizeD9Ej5fM() {
        return IconSize;
    }

    public final ColorSchemeKeyTokens getLabelTextColor() {
        return LabelTextColor;
    }

    public final TypographyKeyTokens getLabelTextFont() {
        return LabelTextFont;
    }

    public final ColorSchemeKeyTokens getOutlineColor() {
        return OutlineColor;
    }

    /* renamed from: getOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m2225getOutlineWidthD9Ej5fM() {
        return OutlineWidth;
    }

    public final ColorSchemeKeyTokens getPressedIconColor() {
        return PressedIconColor;
    }

    public final ColorSchemeKeyTokens getPressedLabelTextColor() {
        return PressedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getPressedOutlineColor() {
        return PressedOutlineColor;
    }
}
