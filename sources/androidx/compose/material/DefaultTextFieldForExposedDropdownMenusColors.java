package androidx.compose.material;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@Immutable
/* loaded from: classes.dex */
final class DefaultTextFieldForExposedDropdownMenusColors implements TextFieldColorsWithIcons {
    private final long backgroundColor;
    private final long cursorColor;
    private final long disabledIndicatorColor;
    private final long disabledLabelColor;
    private final long disabledLeadingIconColor;
    private final long disabledPlaceholderColor;
    private final long disabledTextColor;
    private final long disabledTrailingIconColor;
    private final long errorCursorColor;
    private final long errorIndicatorColor;
    private final long errorLabelColor;
    private final long errorLeadingIconColor;
    private final long errorTrailingIconColor;
    private final long focusedIndicatorColor;
    private final long focusedLabelColor;
    private final long focusedTrailingIconColor;
    private final long leadingIconColor;
    private final long placeholderColor;
    private final long textColor;
    private final long trailingIconColor;
    private final long unfocusedIndicatorColor;
    private final long unfocusedLabelColor;

    public /* synthetic */ DefaultTextFieldForExposedDropdownMenusColors(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, AbstractC3284p abstractC3284p) {
        this(j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29);
    }

    private static final boolean indicatorColor$lambda$1(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean labelColor$lambda$2(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean trailingIconColor$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    @Override // androidx.compose.material.TextFieldColors
    @Composable
    public State<Color> backgroundColor(boolean z8, Composer composer, int i8) {
        composer.startReplaceableGroup(-28962788);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-28962788, i8, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.backgroundColor (ExposedDropdownMenu.kt:643)");
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2938boximpl(this.backgroundColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    @Composable
    public State<Color> cursorColor(boolean z8, Composer composer, int i8) {
        long j8;
        composer.startReplaceableGroup(-930693132);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-930693132, i8, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.cursorColor (ExposedDropdownMenu.kt:675)");
        }
        if (z8) {
            j8 = this.errorCursorColor;
        } else {
            j8 = this.cursorColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2938boximpl(j8), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DefaultTextFieldForExposedDropdownMenusColors.class != obj.getClass()) {
            return false;
        }
        DefaultTextFieldForExposedDropdownMenusColors defaultTextFieldForExposedDropdownMenusColors = (DefaultTextFieldForExposedDropdownMenusColors) obj;
        if (Color.m2949equalsimpl0(this.textColor, defaultTextFieldForExposedDropdownMenusColors.textColor) && Color.m2949equalsimpl0(this.disabledTextColor, defaultTextFieldForExposedDropdownMenusColors.disabledTextColor) && Color.m2949equalsimpl0(this.cursorColor, defaultTextFieldForExposedDropdownMenusColors.cursorColor) && Color.m2949equalsimpl0(this.errorCursorColor, defaultTextFieldForExposedDropdownMenusColors.errorCursorColor) && Color.m2949equalsimpl0(this.focusedIndicatorColor, defaultTextFieldForExposedDropdownMenusColors.focusedIndicatorColor) && Color.m2949equalsimpl0(this.unfocusedIndicatorColor, defaultTextFieldForExposedDropdownMenusColors.unfocusedIndicatorColor) && Color.m2949equalsimpl0(this.errorIndicatorColor, defaultTextFieldForExposedDropdownMenusColors.errorIndicatorColor) && Color.m2949equalsimpl0(this.disabledIndicatorColor, defaultTextFieldForExposedDropdownMenusColors.disabledIndicatorColor) && Color.m2949equalsimpl0(this.leadingIconColor, defaultTextFieldForExposedDropdownMenusColors.leadingIconColor) && Color.m2949equalsimpl0(this.disabledLeadingIconColor, defaultTextFieldForExposedDropdownMenusColors.disabledLeadingIconColor) && Color.m2949equalsimpl0(this.errorLeadingIconColor, defaultTextFieldForExposedDropdownMenusColors.errorLeadingIconColor) && Color.m2949equalsimpl0(this.trailingIconColor, defaultTextFieldForExposedDropdownMenusColors.trailingIconColor) && Color.m2949equalsimpl0(this.focusedTrailingIconColor, defaultTextFieldForExposedDropdownMenusColors.focusedTrailingIconColor) && Color.m2949equalsimpl0(this.disabledTrailingIconColor, defaultTextFieldForExposedDropdownMenusColors.disabledTrailingIconColor) && Color.m2949equalsimpl0(this.errorTrailingIconColor, defaultTextFieldForExposedDropdownMenusColors.errorTrailingIconColor) && Color.m2949equalsimpl0(this.backgroundColor, defaultTextFieldForExposedDropdownMenusColors.backgroundColor) && Color.m2949equalsimpl0(this.focusedLabelColor, defaultTextFieldForExposedDropdownMenusColors.focusedLabelColor) && Color.m2949equalsimpl0(this.unfocusedLabelColor, defaultTextFieldForExposedDropdownMenusColors.unfocusedLabelColor) && Color.m2949equalsimpl0(this.disabledLabelColor, defaultTextFieldForExposedDropdownMenusColors.disabledLabelColor) && Color.m2949equalsimpl0(this.errorLabelColor, defaultTextFieldForExposedDropdownMenusColors.errorLabelColor) && Color.m2949equalsimpl0(this.placeholderColor, defaultTextFieldForExposedDropdownMenusColors.placeholderColor) && Color.m2949equalsimpl0(this.disabledPlaceholderColor, defaultTextFieldForExposedDropdownMenusColors.disabledPlaceholderColor)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((Color.m2955hashCodeimpl(this.textColor) * 31) + Color.m2955hashCodeimpl(this.disabledTextColor)) * 31) + Color.m2955hashCodeimpl(this.cursorColor)) * 31) + Color.m2955hashCodeimpl(this.errorCursorColor)) * 31) + Color.m2955hashCodeimpl(this.focusedIndicatorColor)) * 31) + Color.m2955hashCodeimpl(this.unfocusedIndicatorColor)) * 31) + Color.m2955hashCodeimpl(this.errorIndicatorColor)) * 31) + Color.m2955hashCodeimpl(this.disabledIndicatorColor)) * 31) + Color.m2955hashCodeimpl(this.leadingIconColor)) * 31) + Color.m2955hashCodeimpl(this.disabledLeadingIconColor)) * 31) + Color.m2955hashCodeimpl(this.errorLeadingIconColor)) * 31) + Color.m2955hashCodeimpl(this.trailingIconColor)) * 31) + Color.m2955hashCodeimpl(this.focusedTrailingIconColor)) * 31) + Color.m2955hashCodeimpl(this.disabledTrailingIconColor)) * 31) + Color.m2955hashCodeimpl(this.errorTrailingIconColor)) * 31) + Color.m2955hashCodeimpl(this.backgroundColor)) * 31) + Color.m2955hashCodeimpl(this.focusedLabelColor)) * 31) + Color.m2955hashCodeimpl(this.unfocusedLabelColor)) * 31) + Color.m2955hashCodeimpl(this.disabledLabelColor)) * 31) + Color.m2955hashCodeimpl(this.errorLabelColor)) * 31) + Color.m2955hashCodeimpl(this.placeholderColor)) * 31) + Color.m2955hashCodeimpl(this.disabledPlaceholderColor);
    }

    @Override // androidx.compose.material.TextFieldColors
    @Composable
    public State<Color> indicatorColor(boolean z8, boolean z9, InteractionSource interactionSource, Composer composer, int i8) {
        long j8;
        State<Color> rememberUpdatedState;
        AbstractC3292y.i(interactionSource, "interactionSource");
        composer.startReplaceableGroup(476110356);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(476110356, i8, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.indicatorColor (ExposedDropdownMenu.kt:622)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i8 >> 6) & 14);
        if (!z8) {
            j8 = this.disabledIndicatorColor;
        } else if (z9) {
            j8 = this.errorIndicatorColor;
        } else if (indicatorColor$lambda$1(collectIsFocusedAsState)) {
            j8 = this.focusedIndicatorColor;
        } else {
            j8 = this.unfocusedIndicatorColor;
        }
        long j9 = j8;
        if (z8) {
            composer.startReplaceableGroup(182315078);
            rememberUpdatedState = SingleValueAnimationKt.m164animateColorAsStateeuL9pac(j9, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, composer, 48, 12);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(182315183);
            rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2938boximpl(j9), composer, 0);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    @Composable
    public State<Color> labelColor(boolean z8, boolean z9, InteractionSource interactionSource, Composer composer, int i8) {
        long j8;
        AbstractC3292y.i(interactionSource, "interactionSource");
        composer.startReplaceableGroup(-1749156593);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1749156593, i8, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.labelColor (ExposedDropdownMenu.kt:653)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i8 >> 6) & 14);
        if (!z8) {
            j8 = this.disabledLabelColor;
        } else if (z9) {
            j8 = this.errorLabelColor;
        } else if (labelColor$lambda$2(collectIsFocusedAsState)) {
            j8 = this.focusedLabelColor;
        } else {
            j8 = this.unfocusedLabelColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2938boximpl(j8), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColorsWithIcons
    public /* synthetic */ State leadingIconColor(boolean z8, boolean z9, InteractionSource interactionSource, Composer composer, int i8) {
        return b.a(this, z8, z9, interactionSource, composer, i8);
    }

    @Override // androidx.compose.material.TextFieldColors
    @Composable
    public State<Color> placeholderColor(boolean z8, Composer composer, int i8) {
        long j8;
        composer.startReplaceableGroup(1742462291);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1742462291, i8, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.placeholderColor (ExposedDropdownMenu.kt:648)");
        }
        if (z8) {
            j8 = this.placeholderColor;
        } else {
            j8 = this.disabledPlaceholderColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2938boximpl(j8), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    @Composable
    public State<Color> textColor(boolean z8, Composer composer, int i8) {
        long j8;
        composer.startReplaceableGroup(394526077);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(394526077, i8, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.textColor (ExposedDropdownMenu.kt:670)");
        }
        if (z8) {
            j8 = this.textColor;
        } else {
            j8 = this.disabledTextColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2938boximpl(j8), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    @Composable
    public State<Color> trailingIconColor(boolean z8, boolean z9, Composer composer, int i8) {
        long j8;
        composer.startReplaceableGroup(1665901393);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1665901393, i8, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.trailingIconColor (ExposedDropdownMenu.kt:593)");
        }
        if (!z8) {
            j8 = this.disabledTrailingIconColor;
        } else if (z9) {
            j8 = this.errorTrailingIconColor;
        } else {
            j8 = this.trailingIconColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2938boximpl(j8), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    private DefaultTextFieldForExposedDropdownMenusColors(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29) {
        this.textColor = j8;
        this.disabledTextColor = j9;
        this.cursorColor = j10;
        this.errorCursorColor = j11;
        this.focusedIndicatorColor = j12;
        this.unfocusedIndicatorColor = j13;
        this.errorIndicatorColor = j14;
        this.disabledIndicatorColor = j15;
        this.leadingIconColor = j16;
        this.disabledLeadingIconColor = j17;
        this.errorLeadingIconColor = j18;
        this.trailingIconColor = j19;
        this.focusedTrailingIconColor = j20;
        this.disabledTrailingIconColor = j21;
        this.errorTrailingIconColor = j22;
        this.backgroundColor = j23;
        this.focusedLabelColor = j24;
        this.unfocusedLabelColor = j25;
        this.disabledLabelColor = j26;
        this.errorLabelColor = j27;
        this.placeholderColor = j28;
        this.disabledPlaceholderColor = j29;
    }

    @Override // androidx.compose.material.TextFieldColors
    @Composable
    public State<Color> leadingIconColor(boolean z8, boolean z9, Composer composer, int i8) {
        long j8;
        composer.startReplaceableGroup(-776179197);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-776179197, i8, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.leadingIconColor (ExposedDropdownMenu.kt:582)");
        }
        if (!z8) {
            j8 = this.disabledLeadingIconColor;
        } else if (z9) {
            j8 = this.errorLeadingIconColor;
        } else {
            j8 = this.leadingIconColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2938boximpl(j8), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColorsWithIcons
    @Composable
    public State<Color> trailingIconColor(boolean z8, boolean z9, InteractionSource interactionSource, Composer composer, int i8) {
        long j8;
        AbstractC3292y.i(interactionSource, "interactionSource");
        composer.startReplaceableGroup(79259602);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(79259602, i8, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.trailingIconColor (ExposedDropdownMenu.kt:604)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i8 >> 6) & 14);
        if (!z8) {
            j8 = this.disabledTrailingIconColor;
        } else if (z9) {
            j8 = this.errorTrailingIconColor;
        } else {
            j8 = trailingIconColor$lambda$0(collectIsFocusedAsState) ? this.focusedTrailingIconColor : this.trailingIconColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2938boximpl(j8), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }
}
