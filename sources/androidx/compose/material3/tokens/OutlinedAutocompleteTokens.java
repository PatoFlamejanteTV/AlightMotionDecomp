package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;

/* loaded from: classes.dex */
public final class OutlinedAutocompleteTokens {
    private static final ColorSchemeKeyTokens FieldDisabledInputTextColor;
    public static final float FieldDisabledInputTextOpacity = 0.38f;
    private static final ColorSchemeKeyTokens FieldDisabledLabelTextColor;
    public static final float FieldDisabledLabelTextOpacity = 0.38f;
    private static final ColorSchemeKeyTokens FieldDisabledSupportingTextColor;
    public static final float FieldDisabledSupportingTextOpacity = 0.38f;
    private static final ColorSchemeKeyTokens FieldErrorFocusInputTextColor;
    private static final ColorSchemeKeyTokens FieldErrorFocusLabelTextColor;
    private static final ColorSchemeKeyTokens FieldErrorFocusSupportingTextColor;
    private static final ColorSchemeKeyTokens FieldErrorHoverInputTextColor;
    private static final ColorSchemeKeyTokens FieldErrorHoverLabelTextColor;
    private static final ColorSchemeKeyTokens FieldErrorHoverSupportingTextColor;
    private static final ColorSchemeKeyTokens FieldErrorInputTextColor;
    private static final ColorSchemeKeyTokens FieldErrorLabelTextColor;
    private static final ColorSchemeKeyTokens FieldErrorSupportingTextColor;
    private static final ColorSchemeKeyTokens FieldFocusInputTextColor;
    private static final ColorSchemeKeyTokens FieldFocusLabelTextColor;
    private static final ColorSchemeKeyTokens FieldFocusSupportingTextColor;
    private static final ColorSchemeKeyTokens FieldHoverInputTextColor;
    private static final ColorSchemeKeyTokens FieldHoverLabelTextColor;
    private static final ColorSchemeKeyTokens FieldHoverSupportingTextColor;
    private static final ColorSchemeKeyTokens FieldInputTextColor;
    private static final TypographyKeyTokens FieldInputTextFont;
    private static final ColorSchemeKeyTokens FieldLabelTextColor;
    private static final TypographyKeyTokens FieldLabelTextFont;
    private static final ColorSchemeKeyTokens FieldSupportingTextColor;
    private static final TypographyKeyTokens FieldSupportingTextFont;
    public static final OutlinedAutocompleteTokens INSTANCE = new OutlinedAutocompleteTokens();
    private static final ColorSchemeKeyTokens MenuContainerColor = ColorSchemeKeyTokens.Surface;
    private static final float MenuContainerElevation = ElevationTokens.INSTANCE.m2051getLevel2D9Ej5fM();
    private static final ShapeKeyTokens MenuContainerShape;
    private static final ColorSchemeKeyTokens MenuContainerSurfaceTintLayerColor;
    private static final ColorSchemeKeyTokens MenuDividerColor;
    private static final float MenuDividerHeight;
    private static final float MenuListItemContainerHeight;
    private static final ColorSchemeKeyTokens MenuListItemLabelTextColor;
    private static final TypographyKeyTokens MenuListItemLabelTextFont;
    private static final ColorSchemeKeyTokens MenuListItemSelectedContainerColor;
    private static final ColorSchemeKeyTokens TextFieldCaretColor;
    private static final ColorSchemeKeyTokens TextFieldContainerColor;
    private static final float TextFieldContainerHeight;
    private static final ShapeKeyTokens TextFieldContainerShape;
    private static final ColorSchemeKeyTokens TextFieldDisabledLeadingIconColor;
    public static final float TextFieldDisabledLeadingIconOpacity = 0.38f;
    private static final ColorSchemeKeyTokens TextFieldDisabledOutlineColor;
    public static final float TextFieldDisabledOutlineOpacity = 0.12f;
    private static final float TextFieldDisabledOutlineWidth;
    private static final ColorSchemeKeyTokens TextFieldDisabledTrailingIconColor;
    public static final float TextFieldDisabledTrailingIconOpacity = 0.38f;
    private static final ColorSchemeKeyTokens TextFieldErrorFocusCaretColor;
    private static final ColorSchemeKeyTokens TextFieldErrorFocusLeadingIconColor;
    private static final ColorSchemeKeyTokens TextFieldErrorFocusOutlineColor;
    private static final ColorSchemeKeyTokens TextFieldErrorFocusTrailingIconColor;
    private static final ColorSchemeKeyTokens TextFieldErrorHoverLeadingIconColor;
    private static final ColorSchemeKeyTokens TextFieldErrorHoverOutlineColor;
    private static final ColorSchemeKeyTokens TextFieldErrorHoverTrailingIconColor;
    private static final ColorSchemeKeyTokens TextFieldErrorLeadingIconColor;
    private static final ColorSchemeKeyTokens TextFieldErrorOutlineColor;
    private static final ColorSchemeKeyTokens TextFieldErrorTrailingIconColor;
    private static final ColorSchemeKeyTokens TextFieldFocusLeadingIconColor;
    private static final ColorSchemeKeyTokens TextFieldFocusOutlineColor;
    private static final float TextFieldFocusOutlineWidth;
    private static final ColorSchemeKeyTokens TextFieldFocusTrailingIconColor;
    private static final ColorSchemeKeyTokens TextFieldHoverLeadingIconColor;
    private static final ColorSchemeKeyTokens TextFieldHoverOutlineColor;
    private static final float TextFieldHoverOutlineWidth;
    private static final ColorSchemeKeyTokens TextFieldHoverTrailingIconColor;
    private static final ColorSchemeKeyTokens TextFieldLeadingIconColor;
    private static final float TextFieldLeadingIconSize;
    private static final ColorSchemeKeyTokens TextFieldOutlineColor;
    private static final float TextFieldOutlineWidth;
    private static final ColorSchemeKeyTokens TextFieldTrailingIconColor;
    private static final float TextFieldTrailingIconSize;

    static {
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerExtraSmall;
        MenuContainerShape = shapeKeyTokens;
        MenuContainerSurfaceTintLayerColor = ColorSchemeKeyTokens.SurfaceTint;
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.SurfaceVariant;
        MenuDividerColor = colorSchemeKeyTokens;
        float f8 = (float) 1.0d;
        MenuDividerHeight = Dp.m5155constructorimpl(f8);
        MenuListItemContainerHeight = Dp.m5155constructorimpl((float) 48.0d);
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurface;
        MenuListItemLabelTextColor = colorSchemeKeyTokens2;
        MenuListItemLabelTextFont = TypographyKeyTokens.LabelLarge;
        MenuListItemSelectedContainerColor = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.Primary;
        TextFieldCaretColor = colorSchemeKeyTokens3;
        TextFieldContainerColor = colorSchemeKeyTokens;
        TextFieldContainerHeight = Dp.m5155constructorimpl((float) 56.0d);
        TextFieldContainerShape = shapeKeyTokens;
        FieldDisabledInputTextColor = colorSchemeKeyTokens2;
        FieldDisabledLabelTextColor = colorSchemeKeyTokens2;
        TextFieldDisabledLeadingIconColor = colorSchemeKeyTokens2;
        TextFieldDisabledOutlineColor = colorSchemeKeyTokens2;
        TextFieldDisabledOutlineWidth = Dp.m5155constructorimpl(f8);
        FieldDisabledSupportingTextColor = colorSchemeKeyTokens2;
        TextFieldDisabledTrailingIconColor = colorSchemeKeyTokens2;
        ColorSchemeKeyTokens colorSchemeKeyTokens4 = ColorSchemeKeyTokens.Error;
        TextFieldErrorFocusCaretColor = colorSchemeKeyTokens4;
        FieldErrorFocusInputTextColor = colorSchemeKeyTokens2;
        FieldErrorFocusLabelTextColor = colorSchemeKeyTokens4;
        ColorSchemeKeyTokens colorSchemeKeyTokens5 = ColorSchemeKeyTokens.OnSurfaceVariant;
        TextFieldErrorFocusLeadingIconColor = colorSchemeKeyTokens5;
        TextFieldErrorFocusOutlineColor = colorSchemeKeyTokens4;
        FieldErrorFocusSupportingTextColor = colorSchemeKeyTokens4;
        TextFieldErrorFocusTrailingIconColor = colorSchemeKeyTokens4;
        FieldErrorHoverInputTextColor = colorSchemeKeyTokens2;
        ColorSchemeKeyTokens colorSchemeKeyTokens6 = ColorSchemeKeyTokens.OnErrorContainer;
        FieldErrorHoverLabelTextColor = colorSchemeKeyTokens6;
        TextFieldErrorHoverLeadingIconColor = colorSchemeKeyTokens5;
        TextFieldErrorHoverOutlineColor = colorSchemeKeyTokens6;
        FieldErrorHoverSupportingTextColor = colorSchemeKeyTokens4;
        TextFieldErrorHoverTrailingIconColor = colorSchemeKeyTokens6;
        FieldErrorInputTextColor = colorSchemeKeyTokens2;
        FieldErrorLabelTextColor = colorSchemeKeyTokens4;
        TextFieldErrorLeadingIconColor = colorSchemeKeyTokens5;
        TextFieldErrorOutlineColor = colorSchemeKeyTokens4;
        FieldErrorSupportingTextColor = colorSchemeKeyTokens4;
        TextFieldErrorTrailingIconColor = colorSchemeKeyTokens4;
        FieldFocusInputTextColor = colorSchemeKeyTokens2;
        FieldFocusLabelTextColor = colorSchemeKeyTokens3;
        TextFieldFocusLeadingIconColor = colorSchemeKeyTokens5;
        TextFieldFocusOutlineColor = colorSchemeKeyTokens3;
        TextFieldFocusOutlineWidth = Dp.m5155constructorimpl((float) 2.0d);
        FieldFocusSupportingTextColor = colorSchemeKeyTokens5;
        TextFieldFocusTrailingIconColor = colorSchemeKeyTokens5;
        FieldHoverInputTextColor = colorSchemeKeyTokens2;
        FieldHoverLabelTextColor = colorSchemeKeyTokens5;
        TextFieldHoverLeadingIconColor = colorSchemeKeyTokens5;
        TextFieldHoverOutlineColor = colorSchemeKeyTokens2;
        TextFieldHoverOutlineWidth = Dp.m5155constructorimpl(f8);
        FieldHoverSupportingTextColor = colorSchemeKeyTokens5;
        TextFieldHoverTrailingIconColor = colorSchemeKeyTokens5;
        FieldInputTextColor = colorSchemeKeyTokens2;
        TypographyKeyTokens typographyKeyTokens = TypographyKeyTokens.BodyLarge;
        FieldInputTextFont = typographyKeyTokens;
        FieldLabelTextColor = colorSchemeKeyTokens5;
        FieldLabelTextFont = typographyKeyTokens;
        TextFieldLeadingIconColor = colorSchemeKeyTokens5;
        float f9 = (float) 24.0d;
        TextFieldLeadingIconSize = Dp.m5155constructorimpl(f9);
        TextFieldOutlineColor = ColorSchemeKeyTokens.Outline;
        TextFieldOutlineWidth = Dp.m5155constructorimpl(f8);
        FieldSupportingTextColor = colorSchemeKeyTokens5;
        FieldSupportingTextFont = TypographyKeyTokens.BodySmall;
        TextFieldTrailingIconColor = colorSchemeKeyTokens5;
        TextFieldTrailingIconSize = Dp.m5155constructorimpl(f9);
    }

    private OutlinedAutocompleteTokens() {
    }

    public final ColorSchemeKeyTokens getFieldDisabledInputTextColor() {
        return FieldDisabledInputTextColor;
    }

    public final ColorSchemeKeyTokens getFieldDisabledLabelTextColor() {
        return FieldDisabledLabelTextColor;
    }

    public final ColorSchemeKeyTokens getFieldDisabledSupportingTextColor() {
        return FieldDisabledSupportingTextColor;
    }

    public final ColorSchemeKeyTokens getFieldErrorFocusInputTextColor() {
        return FieldErrorFocusInputTextColor;
    }

    public final ColorSchemeKeyTokens getFieldErrorFocusLabelTextColor() {
        return FieldErrorFocusLabelTextColor;
    }

    public final ColorSchemeKeyTokens getFieldErrorFocusSupportingTextColor() {
        return FieldErrorFocusSupportingTextColor;
    }

    public final ColorSchemeKeyTokens getFieldErrorHoverInputTextColor() {
        return FieldErrorHoverInputTextColor;
    }

    public final ColorSchemeKeyTokens getFieldErrorHoverLabelTextColor() {
        return FieldErrorHoverLabelTextColor;
    }

    public final ColorSchemeKeyTokens getFieldErrorHoverSupportingTextColor() {
        return FieldErrorHoverSupportingTextColor;
    }

    public final ColorSchemeKeyTokens getFieldErrorInputTextColor() {
        return FieldErrorInputTextColor;
    }

    public final ColorSchemeKeyTokens getFieldErrorLabelTextColor() {
        return FieldErrorLabelTextColor;
    }

    public final ColorSchemeKeyTokens getFieldErrorSupportingTextColor() {
        return FieldErrorSupportingTextColor;
    }

    public final ColorSchemeKeyTokens getFieldFocusInputTextColor() {
        return FieldFocusInputTextColor;
    }

    public final ColorSchemeKeyTokens getFieldFocusLabelTextColor() {
        return FieldFocusLabelTextColor;
    }

    public final ColorSchemeKeyTokens getFieldFocusSupportingTextColor() {
        return FieldFocusSupportingTextColor;
    }

    public final ColorSchemeKeyTokens getFieldHoverInputTextColor() {
        return FieldHoverInputTextColor;
    }

    public final ColorSchemeKeyTokens getFieldHoverLabelTextColor() {
        return FieldHoverLabelTextColor;
    }

    public final ColorSchemeKeyTokens getFieldHoverSupportingTextColor() {
        return FieldHoverSupportingTextColor;
    }

    public final ColorSchemeKeyTokens getFieldInputTextColor() {
        return FieldInputTextColor;
    }

    public final TypographyKeyTokens getFieldInputTextFont() {
        return FieldInputTextFont;
    }

    public final ColorSchemeKeyTokens getFieldLabelTextColor() {
        return FieldLabelTextColor;
    }

    public final TypographyKeyTokens getFieldLabelTextFont() {
        return FieldLabelTextFont;
    }

    public final ColorSchemeKeyTokens getFieldSupportingTextColor() {
        return FieldSupportingTextColor;
    }

    public final TypographyKeyTokens getFieldSupportingTextFont() {
        return FieldSupportingTextFont;
    }

    public final ColorSchemeKeyTokens getMenuContainerColor() {
        return MenuContainerColor;
    }

    /* renamed from: getMenuContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2213getMenuContainerElevationD9Ej5fM() {
        return MenuContainerElevation;
    }

    public final ShapeKeyTokens getMenuContainerShape() {
        return MenuContainerShape;
    }

    public final ColorSchemeKeyTokens getMenuContainerSurfaceTintLayerColor() {
        return MenuContainerSurfaceTintLayerColor;
    }

    public final ColorSchemeKeyTokens getMenuDividerColor() {
        return MenuDividerColor;
    }

    /* renamed from: getMenuDividerHeight-D9Ej5fM, reason: not valid java name */
    public final float m2214getMenuDividerHeightD9Ej5fM() {
        return MenuDividerHeight;
    }

    /* renamed from: getMenuListItemContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m2215getMenuListItemContainerHeightD9Ej5fM() {
        return MenuListItemContainerHeight;
    }

    public final ColorSchemeKeyTokens getMenuListItemLabelTextColor() {
        return MenuListItemLabelTextColor;
    }

    public final TypographyKeyTokens getMenuListItemLabelTextFont() {
        return MenuListItemLabelTextFont;
    }

    public final ColorSchemeKeyTokens getMenuListItemSelectedContainerColor() {
        return MenuListItemSelectedContainerColor;
    }

    public final ColorSchemeKeyTokens getTextFieldCaretColor() {
        return TextFieldCaretColor;
    }

    public final ColorSchemeKeyTokens getTextFieldContainerColor() {
        return TextFieldContainerColor;
    }

    /* renamed from: getTextFieldContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m2216getTextFieldContainerHeightD9Ej5fM() {
        return TextFieldContainerHeight;
    }

    public final ShapeKeyTokens getTextFieldContainerShape() {
        return TextFieldContainerShape;
    }

    public final ColorSchemeKeyTokens getTextFieldDisabledLeadingIconColor() {
        return TextFieldDisabledLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getTextFieldDisabledOutlineColor() {
        return TextFieldDisabledOutlineColor;
    }

    /* renamed from: getTextFieldDisabledOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m2217getTextFieldDisabledOutlineWidthD9Ej5fM() {
        return TextFieldDisabledOutlineWidth;
    }

    public final ColorSchemeKeyTokens getTextFieldDisabledTrailingIconColor() {
        return TextFieldDisabledTrailingIconColor;
    }

    public final ColorSchemeKeyTokens getTextFieldErrorFocusCaretColor() {
        return TextFieldErrorFocusCaretColor;
    }

    public final ColorSchemeKeyTokens getTextFieldErrorFocusLeadingIconColor() {
        return TextFieldErrorFocusLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getTextFieldErrorFocusOutlineColor() {
        return TextFieldErrorFocusOutlineColor;
    }

    public final ColorSchemeKeyTokens getTextFieldErrorFocusTrailingIconColor() {
        return TextFieldErrorFocusTrailingIconColor;
    }

    public final ColorSchemeKeyTokens getTextFieldErrorHoverLeadingIconColor() {
        return TextFieldErrorHoverLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getTextFieldErrorHoverOutlineColor() {
        return TextFieldErrorHoverOutlineColor;
    }

    public final ColorSchemeKeyTokens getTextFieldErrorHoverTrailingIconColor() {
        return TextFieldErrorHoverTrailingIconColor;
    }

    public final ColorSchemeKeyTokens getTextFieldErrorLeadingIconColor() {
        return TextFieldErrorLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getTextFieldErrorOutlineColor() {
        return TextFieldErrorOutlineColor;
    }

    public final ColorSchemeKeyTokens getTextFieldErrorTrailingIconColor() {
        return TextFieldErrorTrailingIconColor;
    }

    public final ColorSchemeKeyTokens getTextFieldFocusLeadingIconColor() {
        return TextFieldFocusLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getTextFieldFocusOutlineColor() {
        return TextFieldFocusOutlineColor;
    }

    /* renamed from: getTextFieldFocusOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m2218getTextFieldFocusOutlineWidthD9Ej5fM() {
        return TextFieldFocusOutlineWidth;
    }

    public final ColorSchemeKeyTokens getTextFieldFocusTrailingIconColor() {
        return TextFieldFocusTrailingIconColor;
    }

    public final ColorSchemeKeyTokens getTextFieldHoverLeadingIconColor() {
        return TextFieldHoverLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getTextFieldHoverOutlineColor() {
        return TextFieldHoverOutlineColor;
    }

    /* renamed from: getTextFieldHoverOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m2219getTextFieldHoverOutlineWidthD9Ej5fM() {
        return TextFieldHoverOutlineWidth;
    }

    public final ColorSchemeKeyTokens getTextFieldHoverTrailingIconColor() {
        return TextFieldHoverTrailingIconColor;
    }

    public final ColorSchemeKeyTokens getTextFieldLeadingIconColor() {
        return TextFieldLeadingIconColor;
    }

    /* renamed from: getTextFieldLeadingIconSize-D9Ej5fM, reason: not valid java name */
    public final float m2220getTextFieldLeadingIconSizeD9Ej5fM() {
        return TextFieldLeadingIconSize;
    }

    public final ColorSchemeKeyTokens getTextFieldOutlineColor() {
        return TextFieldOutlineColor;
    }

    /* renamed from: getTextFieldOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m2221getTextFieldOutlineWidthD9Ej5fM() {
        return TextFieldOutlineWidth;
    }

    public final ColorSchemeKeyTokens getTextFieldTrailingIconColor() {
        return TextFieldTrailingIconColor;
    }

    /* renamed from: getTextFieldTrailingIconSize-D9Ej5fM, reason: not valid java name */
    public final float m2222getTextFieldTrailingIconSizeD9Ej5fM() {
        return TextFieldTrailingIconSize;
    }
}
