package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;

/* loaded from: classes.dex */
public final class OutlinedTextFieldTokens {
    private static final ColorSchemeKeyTokens CaretColor;
    private static final float ContainerHeight;
    private static final ShapeKeyTokens ContainerShape;
    private static final ColorSchemeKeyTokens DisabledInputColor;
    public static final float DisabledInputOpacity = 0.38f;
    private static final ColorSchemeKeyTokens DisabledLabelColor;
    public static final float DisabledLabelOpacity = 0.38f;
    private static final ColorSchemeKeyTokens DisabledLeadingIconColor;
    public static final float DisabledLeadingIconOpacity = 0.38f;
    private static final ColorSchemeKeyTokens DisabledOutlineColor;
    public static final float DisabledOutlineOpacity = 0.12f;
    private static final float DisabledOutlineWidth;
    private static final ColorSchemeKeyTokens DisabledSupportingColor;
    public static final float DisabledSupportingOpacity = 0.38f;
    private static final ColorSchemeKeyTokens DisabledTrailingIconColor;
    public static final float DisabledTrailingIconOpacity = 0.38f;
    private static final ColorSchemeKeyTokens ErrorFocusCaretColor;
    private static final ColorSchemeKeyTokens ErrorFocusInputColor;
    private static final ColorSchemeKeyTokens ErrorFocusLabelColor;
    private static final ColorSchemeKeyTokens ErrorFocusLeadingIconColor;
    private static final ColorSchemeKeyTokens ErrorFocusOutlineColor;
    private static final ColorSchemeKeyTokens ErrorFocusSupportingColor;
    private static final ColorSchemeKeyTokens ErrorFocusTrailingIconColor;
    private static final ColorSchemeKeyTokens ErrorHoverInputColor;
    private static final ColorSchemeKeyTokens ErrorHoverLabelColor;
    private static final ColorSchemeKeyTokens ErrorHoverLeadingIconColor;
    private static final ColorSchemeKeyTokens ErrorHoverOutlineColor;
    private static final ColorSchemeKeyTokens ErrorHoverSupportingColor;
    private static final ColorSchemeKeyTokens ErrorHoverTrailingIconColor;
    private static final ColorSchemeKeyTokens ErrorInputColor;
    private static final ColorSchemeKeyTokens ErrorLabelColor;
    private static final ColorSchemeKeyTokens ErrorLeadingIconColor;
    private static final ColorSchemeKeyTokens ErrorOutlineColor;
    private static final ColorSchemeKeyTokens ErrorSupportingColor;
    private static final ColorSchemeKeyTokens ErrorTrailingIconColor;
    private static final ColorSchemeKeyTokens FocusInputColor;
    private static final ColorSchemeKeyTokens FocusLabelColor;
    private static final ColorSchemeKeyTokens FocusLeadingIconColor;
    private static final ColorSchemeKeyTokens FocusOutlineColor;
    private static final float FocusOutlineWidth;
    private static final ColorSchemeKeyTokens FocusSupportingColor;
    private static final ColorSchemeKeyTokens FocusTrailingIconColor;
    private static final ColorSchemeKeyTokens HoverInputColor;
    private static final ColorSchemeKeyTokens HoverLabelColor;
    private static final ColorSchemeKeyTokens HoverLeadingIconColor;
    private static final ColorSchemeKeyTokens HoverOutlineColor;
    private static final float HoverOutlineWidth;
    private static final ColorSchemeKeyTokens HoverSupportingColor;
    private static final ColorSchemeKeyTokens HoverTrailingIconColor;
    public static final OutlinedTextFieldTokens INSTANCE = new OutlinedTextFieldTokens();
    private static final ColorSchemeKeyTokens InputColor;
    private static final TypographyKeyTokens InputFont;
    private static final ColorSchemeKeyTokens InputPlaceholderColor;
    private static final ColorSchemeKeyTokens InputPrefixColor;
    private static final ColorSchemeKeyTokens InputSuffixColor;
    private static final ColorSchemeKeyTokens LabelColor;
    private static final TypographyKeyTokens LabelFont;
    private static final ColorSchemeKeyTokens LeadingIconColor;
    private static final float LeadingIconSize;
    private static final ColorSchemeKeyTokens OutlineColor;
    private static final float OutlineWidth;
    private static final ColorSchemeKeyTokens SupportingColor;
    private static final TypographyKeyTokens SupportingFont;
    private static final ColorSchemeKeyTokens TrailingIconColor;
    private static final float TrailingIconSize;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.Primary;
        CaretColor = colorSchemeKeyTokens;
        ContainerHeight = Dp.m5155constructorimpl((float) 56.0d);
        ContainerShape = ShapeKeyTokens.CornerExtraSmall;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurface;
        DisabledInputColor = colorSchemeKeyTokens2;
        DisabledLabelColor = colorSchemeKeyTokens2;
        DisabledLeadingIconColor = colorSchemeKeyTokens2;
        DisabledOutlineColor = colorSchemeKeyTokens2;
        float f8 = (float) 1.0d;
        DisabledOutlineWidth = Dp.m5155constructorimpl(f8);
        DisabledSupportingColor = colorSchemeKeyTokens2;
        DisabledTrailingIconColor = colorSchemeKeyTokens2;
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.Error;
        ErrorFocusCaretColor = colorSchemeKeyTokens3;
        ErrorFocusInputColor = colorSchemeKeyTokens2;
        ErrorFocusLabelColor = colorSchemeKeyTokens3;
        ColorSchemeKeyTokens colorSchemeKeyTokens4 = ColorSchemeKeyTokens.OnSurfaceVariant;
        ErrorFocusLeadingIconColor = colorSchemeKeyTokens4;
        ErrorFocusOutlineColor = colorSchemeKeyTokens3;
        ErrorFocusSupportingColor = colorSchemeKeyTokens3;
        ErrorFocusTrailingIconColor = colorSchemeKeyTokens3;
        ErrorHoverInputColor = colorSchemeKeyTokens2;
        ColorSchemeKeyTokens colorSchemeKeyTokens5 = ColorSchemeKeyTokens.OnErrorContainer;
        ErrorHoverLabelColor = colorSchemeKeyTokens5;
        ErrorHoverLeadingIconColor = colorSchemeKeyTokens4;
        ErrorHoverOutlineColor = colorSchemeKeyTokens5;
        ErrorHoverSupportingColor = colorSchemeKeyTokens3;
        ErrorHoverTrailingIconColor = colorSchemeKeyTokens5;
        ErrorInputColor = colorSchemeKeyTokens2;
        ErrorLabelColor = colorSchemeKeyTokens3;
        ErrorLeadingIconColor = colorSchemeKeyTokens4;
        ErrorOutlineColor = colorSchemeKeyTokens3;
        ErrorSupportingColor = colorSchemeKeyTokens3;
        ErrorTrailingIconColor = colorSchemeKeyTokens3;
        FocusInputColor = colorSchemeKeyTokens2;
        FocusLabelColor = colorSchemeKeyTokens;
        FocusLeadingIconColor = colorSchemeKeyTokens4;
        FocusOutlineColor = colorSchemeKeyTokens;
        FocusOutlineWidth = Dp.m5155constructorimpl((float) 2.0d);
        FocusSupportingColor = colorSchemeKeyTokens4;
        FocusTrailingIconColor = colorSchemeKeyTokens4;
        HoverInputColor = colorSchemeKeyTokens2;
        HoverLabelColor = colorSchemeKeyTokens2;
        HoverLeadingIconColor = colorSchemeKeyTokens4;
        HoverOutlineColor = colorSchemeKeyTokens2;
        HoverOutlineWidth = Dp.m5155constructorimpl(f8);
        HoverSupportingColor = colorSchemeKeyTokens4;
        HoverTrailingIconColor = colorSchemeKeyTokens4;
        InputColor = colorSchemeKeyTokens2;
        TypographyKeyTokens typographyKeyTokens = TypographyKeyTokens.BodyLarge;
        InputFont = typographyKeyTokens;
        InputPlaceholderColor = colorSchemeKeyTokens4;
        InputPrefixColor = colorSchemeKeyTokens4;
        InputSuffixColor = colorSchemeKeyTokens4;
        LabelColor = colorSchemeKeyTokens4;
        LabelFont = typographyKeyTokens;
        LeadingIconColor = colorSchemeKeyTokens4;
        float f9 = (float) 24.0d;
        LeadingIconSize = Dp.m5155constructorimpl(f9);
        OutlineColor = ColorSchemeKeyTokens.Outline;
        OutlineWidth = Dp.m5155constructorimpl(f8);
        SupportingColor = colorSchemeKeyTokens4;
        SupportingFont = TypographyKeyTokens.BodySmall;
        TrailingIconColor = colorSchemeKeyTokens4;
        TrailingIconSize = Dp.m5155constructorimpl(f9);
    }

    private OutlinedTextFieldTokens() {
    }

    public final ColorSchemeKeyTokens getCaretColor() {
        return CaretColor;
    }

    /* renamed from: getContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m2237getContainerHeightD9Ej5fM() {
        return ContainerHeight;
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    public final ColorSchemeKeyTokens getDisabledInputColor() {
        return DisabledInputColor;
    }

    public final ColorSchemeKeyTokens getDisabledLabelColor() {
        return DisabledLabelColor;
    }

    public final ColorSchemeKeyTokens getDisabledLeadingIconColor() {
        return DisabledLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getDisabledOutlineColor() {
        return DisabledOutlineColor;
    }

    /* renamed from: getDisabledOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m2238getDisabledOutlineWidthD9Ej5fM() {
        return DisabledOutlineWidth;
    }

    public final ColorSchemeKeyTokens getDisabledSupportingColor() {
        return DisabledSupportingColor;
    }

    public final ColorSchemeKeyTokens getDisabledTrailingIconColor() {
        return DisabledTrailingIconColor;
    }

    public final ColorSchemeKeyTokens getErrorFocusCaretColor() {
        return ErrorFocusCaretColor;
    }

    public final ColorSchemeKeyTokens getErrorFocusInputColor() {
        return ErrorFocusInputColor;
    }

    public final ColorSchemeKeyTokens getErrorFocusLabelColor() {
        return ErrorFocusLabelColor;
    }

    public final ColorSchemeKeyTokens getErrorFocusLeadingIconColor() {
        return ErrorFocusLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getErrorFocusOutlineColor() {
        return ErrorFocusOutlineColor;
    }

    public final ColorSchemeKeyTokens getErrorFocusSupportingColor() {
        return ErrorFocusSupportingColor;
    }

    public final ColorSchemeKeyTokens getErrorFocusTrailingIconColor() {
        return ErrorFocusTrailingIconColor;
    }

    public final ColorSchemeKeyTokens getErrorHoverInputColor() {
        return ErrorHoverInputColor;
    }

    public final ColorSchemeKeyTokens getErrorHoverLabelColor() {
        return ErrorHoverLabelColor;
    }

    public final ColorSchemeKeyTokens getErrorHoverLeadingIconColor() {
        return ErrorHoverLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getErrorHoverOutlineColor() {
        return ErrorHoverOutlineColor;
    }

    public final ColorSchemeKeyTokens getErrorHoverSupportingColor() {
        return ErrorHoverSupportingColor;
    }

    public final ColorSchemeKeyTokens getErrorHoverTrailingIconColor() {
        return ErrorHoverTrailingIconColor;
    }

    public final ColorSchemeKeyTokens getErrorInputColor() {
        return ErrorInputColor;
    }

    public final ColorSchemeKeyTokens getErrorLabelColor() {
        return ErrorLabelColor;
    }

    public final ColorSchemeKeyTokens getErrorLeadingIconColor() {
        return ErrorLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getErrorOutlineColor() {
        return ErrorOutlineColor;
    }

    public final ColorSchemeKeyTokens getErrorSupportingColor() {
        return ErrorSupportingColor;
    }

    public final ColorSchemeKeyTokens getErrorTrailingIconColor() {
        return ErrorTrailingIconColor;
    }

    public final ColorSchemeKeyTokens getFocusInputColor() {
        return FocusInputColor;
    }

    public final ColorSchemeKeyTokens getFocusLabelColor() {
        return FocusLabelColor;
    }

    public final ColorSchemeKeyTokens getFocusLeadingIconColor() {
        return FocusLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getFocusOutlineColor() {
        return FocusOutlineColor;
    }

    /* renamed from: getFocusOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m2239getFocusOutlineWidthD9Ej5fM() {
        return FocusOutlineWidth;
    }

    public final ColorSchemeKeyTokens getFocusSupportingColor() {
        return FocusSupportingColor;
    }

    public final ColorSchemeKeyTokens getFocusTrailingIconColor() {
        return FocusTrailingIconColor;
    }

    public final ColorSchemeKeyTokens getHoverInputColor() {
        return HoverInputColor;
    }

    public final ColorSchemeKeyTokens getHoverLabelColor() {
        return HoverLabelColor;
    }

    public final ColorSchemeKeyTokens getHoverLeadingIconColor() {
        return HoverLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getHoverOutlineColor() {
        return HoverOutlineColor;
    }

    /* renamed from: getHoverOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m2240getHoverOutlineWidthD9Ej5fM() {
        return HoverOutlineWidth;
    }

    public final ColorSchemeKeyTokens getHoverSupportingColor() {
        return HoverSupportingColor;
    }

    public final ColorSchemeKeyTokens getHoverTrailingIconColor() {
        return HoverTrailingIconColor;
    }

    public final ColorSchemeKeyTokens getInputColor() {
        return InputColor;
    }

    public final TypographyKeyTokens getInputFont() {
        return InputFont;
    }

    public final ColorSchemeKeyTokens getInputPlaceholderColor() {
        return InputPlaceholderColor;
    }

    public final ColorSchemeKeyTokens getInputPrefixColor() {
        return InputPrefixColor;
    }

    public final ColorSchemeKeyTokens getInputSuffixColor() {
        return InputSuffixColor;
    }

    public final ColorSchemeKeyTokens getLabelColor() {
        return LabelColor;
    }

    public final TypographyKeyTokens getLabelFont() {
        return LabelFont;
    }

    public final ColorSchemeKeyTokens getLeadingIconColor() {
        return LeadingIconColor;
    }

    /* renamed from: getLeadingIconSize-D9Ej5fM, reason: not valid java name */
    public final float m2241getLeadingIconSizeD9Ej5fM() {
        return LeadingIconSize;
    }

    public final ColorSchemeKeyTokens getOutlineColor() {
        return OutlineColor;
    }

    /* renamed from: getOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m2242getOutlineWidthD9Ej5fM() {
        return OutlineWidth;
    }

    public final ColorSchemeKeyTokens getSupportingColor() {
        return SupportingColor;
    }

    public final TypographyKeyTokens getSupportingFont() {
        return SupportingFont;
    }

    public final ColorSchemeKeyTokens getTrailingIconColor() {
        return TrailingIconColor;
    }

    /* renamed from: getTrailingIconSize-D9Ej5fM, reason: not valid java name */
    public final float m2243getTrailingIconSizeD9Ej5fM() {
        return TrailingIconSize;
    }
}
