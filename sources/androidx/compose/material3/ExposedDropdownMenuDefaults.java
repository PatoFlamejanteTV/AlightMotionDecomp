package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.ArrowDropDownKt;
import androidx.compose.material3.tokens.FilledAutocompleteTokens;
import androidx.compose.material3.tokens.OutlinedAutocompleteTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.unit.Dp;

@StabilityInferred(parameters = 0)
@ExperimentalMaterial3Api
/* loaded from: classes.dex */
public final class ExposedDropdownMenuDefaults {
    public static final int $stable = 0;
    public static final ExposedDropdownMenuDefaults INSTANCE = new ExposedDropdownMenuDefaults();
    private static final PaddingValues ItemContentPadding;

    static {
        float f8;
        f8 = ExposedDropdownMenuKt.ExposedDropdownMenuItemHorizontalPadding;
        ItemContentPadding = PaddingKt.m571PaddingValuesYgX7TsA(f8, Dp.m5155constructorimpl(0));
    }

    private ExposedDropdownMenuDefaults() {
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @ExperimentalMaterial3Api
    public final void TrailingIcon(boolean z8, Composer composer, int i8) {
        int i9;
        float f8;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(-1803742020);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(z8)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i9 = i10 | i8;
        } else {
            i9 = i8;
        }
        if ((i9 & 11) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1803742020, i8, -1, "androidx.compose.material3.ExposedDropdownMenuDefaults.TrailingIcon (ExposedDropdownMenu.kt:298)");
            }
            ImageVector arrowDropDown = ArrowDropDownKt.getArrowDropDown(Icons.Filled.INSTANCE);
            Modifier.Companion companion = Modifier.Companion;
            if (z8) {
                f8 = 180.0f;
            } else {
                f8 = 0.0f;
            }
            IconKt.m1647Iconww6aTOc(arrowDropDown, (String) null, RotateKt.rotate(companion, f8), 0L, startRestartGroup, 48, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ExposedDropdownMenuDefaults$TrailingIcon$1(this, z8, i8));
        }
    }

    public final PaddingValues getItemContentPadding() {
        return ItemContentPadding;
    }

    @Composable
    /* renamed from: outlinedTextFieldColors-St-qZLY, reason: not valid java name */
    public final TextFieldColors m1595outlinedTextFieldColorsStqZLY(long j8, long j9, long j10, long j11, long j12, TextSelectionColors textSelectionColors, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, Composer composer, int i8, int i9, int i10, int i11) {
        composer.startReplaceableGroup(-83147315);
        long color = (i11 & 1) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldInputTextColor(), composer, 6) : j8;
        long m2947copywmQWz5c$default = (i11 & 2) != 0 ? Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledInputTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j9;
        long m2983getTransparent0d7_KjU = (i11 & 4) != 0 ? Color.Companion.m2983getTransparent0d7_KjU() : j10;
        long color2 = (i11 & 8) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldCaretColor(), composer, 6) : j11;
        long color3 = (i11 & 16) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorFocusCaretColor(), composer, 6) : j12;
        TextSelectionColors textSelectionColors2 = (i11 & 32) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long color4 = (i11 & 64) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusOutlineColor(), composer, 6) : j13;
        long color5 = (i11 & 128) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldOutlineColor(), composer, 6) : j14;
        long m2947copywmQWz5c$default2 = (i11 & 256) != 0 ? Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long color6 = (i11 & 512) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorOutlineColor(), composer, 6) : j16;
        long color7 = (i11 & 1024) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusLeadingIconColor(), composer, 6) : j17;
        long color8 = (i11 & 2048) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldLeadingIconColor(), composer, 6) : j18;
        long m2947copywmQWz5c$default3 = (i11 & 4096) != 0 ? Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j19;
        long color9 = (i11 & 8192) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorLeadingIconColor(), composer, 6) : j20;
        long color10 = (i11 & 16384) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusTrailingIconColor(), composer, 6) : j21;
        long color11 = (32768 & i11) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldTrailingIconColor(), composer, 6) : j22;
        long m2947copywmQWz5c$default4 = (65536 & i11) != 0 ? Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledTrailingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j23;
        long color12 = (131072 & i11) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorTrailingIconColor(), composer, 6) : j24;
        long color13 = (262144 & i11) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldFocusLabelTextColor(), composer, 6) : j25;
        long color14 = (524288 & i11) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldLabelTextColor(), composer, 6) : j26;
        long m2947copywmQWz5c$default5 = (1048576 & i11) != 0 ? Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledLabelTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j27;
        long color15 = (2097152 & i11) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldErrorLabelTextColor(), composer, 6) : j28;
        long color16 = (4194304 & i11) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j29;
        long m2947copywmQWz5c$default6 = (i11 & 8388608) != 0 ? Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledInputTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j30;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-83147315, i8, i9, "androidx.compose.material3.ExposedDropdownMenuDefaults.outlinedTextFieldColors (ExposedDropdownMenu.kt:440)");
        }
        TextFieldColors m1833outlinedTextFieldColorsl59Burw = TextFieldDefaults.INSTANCE.m1833outlinedTextFieldColorsl59Burw(color, m2947copywmQWz5c$default, m2983getTransparent0d7_KjU, color2, color3, textSelectionColors2, color4, color5, m2947copywmQWz5c$default2, color6, color7, color8, m2947copywmQWz5c$default3, color9, color10, color11, m2947copywmQWz5c$default4, color12, color13, color14, m2947copywmQWz5c$default5, color15, color16, m2947copywmQWz5c$default6, 0L, 0L, 0L, 0L, composer, i8 & 2147483646, i9 & 2147483646, (i10 & 14) | 100663296 | (i10 & 112) | (i10 & 896) | (i10 & 7168), 251658240);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m1833outlinedTextFieldColorsl59Burw;
    }

    @Composable
    /* renamed from: textFieldColors-St-qZLY, reason: not valid java name */
    public final TextFieldColors m1596textFieldColorsStqZLY(long j8, long j9, long j10, long j11, long j12, TextSelectionColors textSelectionColors, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, Composer composer, int i8, int i9, int i10, int i11) {
        composer.startReplaceableGroup(-2013303349);
        long color = (i11 & 1) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldInputTextColor(), composer, 6) : j8;
        long m2947copywmQWz5c$default = (i11 & 2) != 0 ? Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldDisabledInputTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j9;
        long color2 = (i11 & 4) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), composer, 6) : j10;
        long color3 = (i11 & 8) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldCaretColor(), composer, 6) : j11;
        long color4 = (i11 & 16) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorFocusCaretColor(), composer, 6) : j12;
        TextSelectionColors textSelectionColors2 = (i11 & 32) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long color5 = (i11 & 64) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusActiveIndicatorColor(), composer, 6) : j13;
        long color6 = (i11 & 128) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldActiveIndicatorColor(), composer, 6) : j14;
        long m2947copywmQWz5c$default2 = (i11 & 256) != 0 ? Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledActiveIndicatorColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long color7 = (i11 & 512) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorActiveIndicatorColor(), composer, 6) : j16;
        long color8 = (i11 & 1024) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusLeadingIconColor(), composer, 6) : j17;
        long color9 = (i11 & 2048) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldLeadingIconColor(), composer, 6) : j18;
        long m2947copywmQWz5c$default3 = (i11 & 4096) != 0 ? Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j19;
        long color10 = (i11 & 8192) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorLeadingIconColor(), composer, 6) : j20;
        long color11 = (i11 & 16384) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusTrailingIconColor(), composer, 6) : j21;
        long color12 = (32768 & i11) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldTrailingIconColor(), composer, 6) : j22;
        long m2947copywmQWz5c$default4 = (65536 & i11) != 0 ? Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledTrailingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j23;
        long color13 = (131072 & i11) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorTrailingIconColor(), composer, 6) : j24;
        long color14 = (262144 & i11) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldFocusLabelTextColor(), composer, 6) : j25;
        long color15 = (524288 & i11) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldLabelTextColor(), composer, 6) : j26;
        long color16 = (1048576 & i11) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldDisabledLabelTextColor(), composer, 6) : j27;
        long color17 = (2097152 & i11) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldErrorLabelTextColor(), composer, 6) : j28;
        long color18 = (4194304 & i11) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j29;
        long m2947copywmQWz5c$default5 = (i11 & 8388608) != 0 ? Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldDisabledInputTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j30;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2013303349, i8, i9, "androidx.compose.material3.ExposedDropdownMenuDefaults.textFieldColors (ExposedDropdownMenu.kt:338)");
        }
        TextFieldColors m1836textFieldColorsl59Burw = TextFieldDefaults.INSTANCE.m1836textFieldColorsl59Burw(color, m2947copywmQWz5c$default, color2, color3, color4, textSelectionColors2, color5, color6, m2947copywmQWz5c$default2, color7, color8, color9, m2947copywmQWz5c$default3, color10, color11, color12, m2947copywmQWz5c$default4, color13, color14, color15, color16, color17, color18, m2947copywmQWz5c$default5, 0L, 0L, 0L, 0L, composer, i8 & 2147483646, i9 & 2147483646, (i10 & 14) | 100663296 | (i10 & 112) | (i10 & 896) | (i10 & 7168), 251658240);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m1836textFieldColorsl59Burw;
    }
}
