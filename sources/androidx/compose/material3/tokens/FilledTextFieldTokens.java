package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;

/* loaded from: classes.dex */
public final class FilledTextFieldTokens {
    private static final ColorSchemeKeyTokens ActiveIndicatorColor;
    private static final float ActiveIndicatorHeight;
    private static final ColorSchemeKeyTokens CaretColor;
    private static final ColorSchemeKeyTokens ContainerColor;
    private static final float ContainerHeight;
    private static final ShapeKeyTokens ContainerShape;
    private static final ColorSchemeKeyTokens DisabledActiveIndicatorColor;
    private static final float DisabledActiveIndicatorHeight;
    public static final float DisabledActiveIndicatorOpacity = 0.38f;
    private static final ColorSchemeKeyTokens DisabledContainerColor;
    public static final float DisabledContainerOpacity = 0.04f;
    private static final ColorSchemeKeyTokens DisabledInputColor;
    public static final float DisabledInputOpacity = 0.38f;
    private static final ColorSchemeKeyTokens DisabledLabelColor;
    public static final float DisabledLabelOpacity = 0.38f;
    private static final ColorSchemeKeyTokens DisabledLeadingIconColor;
    public static final float DisabledLeadingIconOpacity = 0.38f;
    private static final ColorSchemeKeyTokens DisabledSupportingColor;
    public static final float DisabledSupportingOpacity = 0.38f;
    private static final ColorSchemeKeyTokens DisabledTrailingIconColor;
    public static final float DisabledTrailingIconOpacity = 0.38f;
    private static final ColorSchemeKeyTokens ErrorActiveIndicatorColor;
    private static final ColorSchemeKeyTokens ErrorFocusActiveIndicatorColor;
    private static final ColorSchemeKeyTokens ErrorFocusCaretColor;
    private static final ColorSchemeKeyTokens ErrorFocusInputColor;
    private static final ColorSchemeKeyTokens ErrorFocusLabelColor;
    private static final ColorSchemeKeyTokens ErrorFocusLeadingIconColor;
    private static final ColorSchemeKeyTokens ErrorFocusSupportingColor;
    private static final ColorSchemeKeyTokens ErrorFocusTrailingIconColor;
    private static final ColorSchemeKeyTokens ErrorHoverActiveIndicatorColor;
    private static final ColorSchemeKeyTokens ErrorHoverInputColor;
    private static final ColorSchemeKeyTokens ErrorHoverLabelColor;
    private static final ColorSchemeKeyTokens ErrorHoverLeadingIconColor;
    private static final ColorSchemeKeyTokens ErrorHoverSupportingColor;
    private static final ColorSchemeKeyTokens ErrorHoverTrailingIconColor;
    private static final ColorSchemeKeyTokens ErrorInputColor;
    private static final ColorSchemeKeyTokens ErrorLabelColor;
    private static final ColorSchemeKeyTokens ErrorLeadingIconColor;
    private static final ColorSchemeKeyTokens ErrorSupportingColor;
    private static final ColorSchemeKeyTokens ErrorTrailingIconColor;
    private static final ColorSchemeKeyTokens FocusActiveIndicatorColor;
    private static final float FocusActiveIndicatorHeight;
    private static final ColorSchemeKeyTokens FocusInputColor;
    private static final ColorSchemeKeyTokens FocusLabelColor;
    private static final ColorSchemeKeyTokens FocusLeadingIconColor;
    private static final ColorSchemeKeyTokens FocusSupportingColor;
    private static final ColorSchemeKeyTokens FocusTrailingIconColor;
    private static final ColorSchemeKeyTokens HoverActiveIndicatorColor;
    private static final float HoverActiveIndicatorHeight;
    private static final ColorSchemeKeyTokens HoverInputColor;
    private static final ColorSchemeKeyTokens HoverLabelColor;
    private static final ColorSchemeKeyTokens HoverLeadingIconColor;
    private static final ColorSchemeKeyTokens HoverSupportingColor;
    private static final ColorSchemeKeyTokens HoverTrailingIconColor;
    public static final FilledTextFieldTokens INSTANCE = new FilledTextFieldTokens();
    private static final ColorSchemeKeyTokens InputColor;
    private static final TypographyKeyTokens InputFont;
    private static final ColorSchemeKeyTokens InputPlaceholderColor;
    private static final ColorSchemeKeyTokens InputPrefixColor;
    private static final ColorSchemeKeyTokens InputSuffixColor;
    private static final ColorSchemeKeyTokens LabelColor;
    private static final TypographyKeyTokens LabelFont;
    private static final ColorSchemeKeyTokens LeadingIconColor;
    private static final float LeadingIconSize;
    private static final ColorSchemeKeyTokens SupportingColor;
    private static final TypographyKeyTokens SupportingFont;
    private static final ColorSchemeKeyTokens TrailingIconColor;
    private static final float TrailingIconSize;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurfaceVariant;
        ActiveIndicatorColor = colorSchemeKeyTokens;
        float f8 = (float) 1.0d;
        ActiveIndicatorHeight = Dp.m5155constructorimpl(f8);
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.Primary;
        CaretColor = colorSchemeKeyTokens2;
        ContainerColor = ColorSchemeKeyTokens.SurfaceVariant;
        ContainerHeight = Dp.m5155constructorimpl((float) 56.0d);
        ContainerShape = ShapeKeyTokens.CornerExtraSmallTop;
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.OnSurface;
        DisabledActiveIndicatorColor = colorSchemeKeyTokens3;
        DisabledActiveIndicatorHeight = Dp.m5155constructorimpl(f8);
        DisabledContainerColor = colorSchemeKeyTokens3;
        DisabledInputColor = colorSchemeKeyTokens3;
        DisabledLabelColor = colorSchemeKeyTokens3;
        DisabledLeadingIconColor = colorSchemeKeyTokens3;
        DisabledSupportingColor = colorSchemeKeyTokens3;
        DisabledTrailingIconColor = colorSchemeKeyTokens3;
        ColorSchemeKeyTokens colorSchemeKeyTokens4 = ColorSchemeKeyTokens.Error;
        ErrorActiveIndicatorColor = colorSchemeKeyTokens4;
        ErrorFocusActiveIndicatorColor = colorSchemeKeyTokens4;
        ErrorFocusCaretColor = colorSchemeKeyTokens4;
        ErrorFocusInputColor = colorSchemeKeyTokens3;
        ErrorFocusLabelColor = colorSchemeKeyTokens4;
        ErrorFocusLeadingIconColor = colorSchemeKeyTokens;
        ErrorFocusSupportingColor = colorSchemeKeyTokens4;
        ErrorFocusTrailingIconColor = colorSchemeKeyTokens4;
        ColorSchemeKeyTokens colorSchemeKeyTokens5 = ColorSchemeKeyTokens.OnErrorContainer;
        ErrorHoverActiveIndicatorColor = colorSchemeKeyTokens5;
        ErrorHoverInputColor = colorSchemeKeyTokens3;
        ErrorHoverLabelColor = colorSchemeKeyTokens5;
        ErrorHoverLeadingIconColor = colorSchemeKeyTokens;
        ErrorHoverSupportingColor = colorSchemeKeyTokens4;
        ErrorHoverTrailingIconColor = colorSchemeKeyTokens5;
        ErrorInputColor = colorSchemeKeyTokens3;
        ErrorLabelColor = colorSchemeKeyTokens4;
        ErrorLeadingIconColor = colorSchemeKeyTokens;
        ErrorSupportingColor = colorSchemeKeyTokens4;
        ErrorTrailingIconColor = colorSchemeKeyTokens4;
        FocusActiveIndicatorColor = colorSchemeKeyTokens2;
        FocusActiveIndicatorHeight = Dp.m5155constructorimpl((float) 2.0d);
        FocusInputColor = colorSchemeKeyTokens3;
        FocusLabelColor = colorSchemeKeyTokens2;
        FocusLeadingIconColor = colorSchemeKeyTokens;
        FocusSupportingColor = colorSchemeKeyTokens;
        FocusTrailingIconColor = colorSchemeKeyTokens;
        HoverActiveIndicatorColor = colorSchemeKeyTokens3;
        HoverActiveIndicatorHeight = Dp.m5155constructorimpl(f8);
        HoverInputColor = colorSchemeKeyTokens3;
        HoverLabelColor = colorSchemeKeyTokens;
        HoverLeadingIconColor = colorSchemeKeyTokens;
        HoverSupportingColor = colorSchemeKeyTokens;
        HoverTrailingIconColor = colorSchemeKeyTokens;
        InputColor = colorSchemeKeyTokens3;
        TypographyKeyTokens typographyKeyTokens = TypographyKeyTokens.BodyLarge;
        InputFont = typographyKeyTokens;
        InputPlaceholderColor = colorSchemeKeyTokens;
        InputPrefixColor = colorSchemeKeyTokens;
        InputSuffixColor = colorSchemeKeyTokens;
        LabelColor = colorSchemeKeyTokens;
        LabelFont = typographyKeyTokens;
        LeadingIconColor = colorSchemeKeyTokens;
        LeadingIconSize = Dp.m5155constructorimpl((float) 20.0d);
        SupportingColor = colorSchemeKeyTokens;
        SupportingFont = TypographyKeyTokens.BodySmall;
        TrailingIconColor = colorSchemeKeyTokens;
        TrailingIconSize = Dp.m5155constructorimpl((float) 24.0d);
    }

    private FilledTextFieldTokens() {
    }

    public final ColorSchemeKeyTokens getActiveIndicatorColor() {
        return ActiveIndicatorColor;
    }

    /* renamed from: getActiveIndicatorHeight-D9Ej5fM, reason: not valid java name */
    public final float m2135getActiveIndicatorHeightD9Ej5fM() {
        return ActiveIndicatorHeight;
    }

    public final ColorSchemeKeyTokens getCaretColor() {
        return CaretColor;
    }

    public final ColorSchemeKeyTokens getContainerColor() {
        return ContainerColor;
    }

    /* renamed from: getContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m2136getContainerHeightD9Ej5fM() {
        return ContainerHeight;
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    public final ColorSchemeKeyTokens getDisabledActiveIndicatorColor() {
        return DisabledActiveIndicatorColor;
    }

    /* renamed from: getDisabledActiveIndicatorHeight-D9Ej5fM, reason: not valid java name */
    public final float m2137getDisabledActiveIndicatorHeightD9Ej5fM() {
        return DisabledActiveIndicatorHeight;
    }

    public final ColorSchemeKeyTokens getDisabledContainerColor() {
        return DisabledContainerColor;
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

    public final ColorSchemeKeyTokens getDisabledSupportingColor() {
        return DisabledSupportingColor;
    }

    public final ColorSchemeKeyTokens getDisabledTrailingIconColor() {
        return DisabledTrailingIconColor;
    }

    public final ColorSchemeKeyTokens getErrorActiveIndicatorColor() {
        return ErrorActiveIndicatorColor;
    }

    public final ColorSchemeKeyTokens getErrorFocusActiveIndicatorColor() {
        return ErrorFocusActiveIndicatorColor;
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

    public final ColorSchemeKeyTokens getErrorFocusSupportingColor() {
        return ErrorFocusSupportingColor;
    }

    public final ColorSchemeKeyTokens getErrorFocusTrailingIconColor() {
        return ErrorFocusTrailingIconColor;
    }

    public final ColorSchemeKeyTokens getErrorHoverActiveIndicatorColor() {
        return ErrorHoverActiveIndicatorColor;
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

    public final ColorSchemeKeyTokens getErrorSupportingColor() {
        return ErrorSupportingColor;
    }

    public final ColorSchemeKeyTokens getErrorTrailingIconColor() {
        return ErrorTrailingIconColor;
    }

    public final ColorSchemeKeyTokens getFocusActiveIndicatorColor() {
        return FocusActiveIndicatorColor;
    }

    /* renamed from: getFocusActiveIndicatorHeight-D9Ej5fM, reason: not valid java name */
    public final float m2138getFocusActiveIndicatorHeightD9Ej5fM() {
        return FocusActiveIndicatorHeight;
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

    public final ColorSchemeKeyTokens getFocusSupportingColor() {
        return FocusSupportingColor;
    }

    public final ColorSchemeKeyTokens getFocusTrailingIconColor() {
        return FocusTrailingIconColor;
    }

    public final ColorSchemeKeyTokens getHoverActiveIndicatorColor() {
        return HoverActiveIndicatorColor;
    }

    /* renamed from: getHoverActiveIndicatorHeight-D9Ej5fM, reason: not valid java name */
    public final float m2139getHoverActiveIndicatorHeightD9Ej5fM() {
        return HoverActiveIndicatorHeight;
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
    public final float m2140getLeadingIconSizeD9Ej5fM() {
        return LeadingIconSize;
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
    public final float m2141getTrailingIconSizeD9Ej5fM() {
        return TrailingIconSize;
    }
}
