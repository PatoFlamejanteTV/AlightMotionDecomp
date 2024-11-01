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

/* JADX INFO: Access modifiers changed from: package-private */
@Immutable
/* loaded from: classes.dex */
public final class DefaultTextFieldColors implements TextFieldColors {
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
    private final long leadingIconColor;
    private final long placeholderColor;
    private final long textColor;
    private final long trailingIconColor;
    private final long unfocusedIndicatorColor;
    private final long unfocusedLabelColor;

    public /* synthetic */ DefaultTextFieldColors(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, AbstractC3284p abstractC3284p) {
        this(j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28);
    }

    private static final boolean indicatorColor$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean labelColor$lambda$1(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    @Override // androidx.compose.material.TextFieldColors
    @Composable
    public State<Color> backgroundColor(boolean z8, Composer composer, int i8) {
        composer.startReplaceableGroup(-1423938813);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1423938813, i8, -1, "androidx.compose.material.DefaultTextFieldColors.backgroundColor (TextFieldDefaults.kt:741)");
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
        composer.startReplaceableGroup(-1446422485);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1446422485, i8, -1, "androidx.compose.material.DefaultTextFieldColors.cursorColor (TextFieldDefaults.kt:773)");
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
        if (obj == null || DefaultTextFieldColors.class != obj.getClass()) {
            return false;
        }
        DefaultTextFieldColors defaultTextFieldColors = (DefaultTextFieldColors) obj;
        if (Color.m2949equalsimpl0(this.textColor, defaultTextFieldColors.textColor) && Color.m2949equalsimpl0(this.disabledTextColor, defaultTextFieldColors.disabledTextColor) && Color.m2949equalsimpl0(this.cursorColor, defaultTextFieldColors.cursorColor) && Color.m2949equalsimpl0(this.errorCursorColor, defaultTextFieldColors.errorCursorColor) && Color.m2949equalsimpl0(this.focusedIndicatorColor, defaultTextFieldColors.focusedIndicatorColor) && Color.m2949equalsimpl0(this.unfocusedIndicatorColor, defaultTextFieldColors.unfocusedIndicatorColor) && Color.m2949equalsimpl0(this.errorIndicatorColor, defaultTextFieldColors.errorIndicatorColor) && Color.m2949equalsimpl0(this.disabledIndicatorColor, defaultTextFieldColors.disabledIndicatorColor) && Color.m2949equalsimpl0(this.leadingIconColor, defaultTextFieldColors.leadingIconColor) && Color.m2949equalsimpl0(this.disabledLeadingIconColor, defaultTextFieldColors.disabledLeadingIconColor) && Color.m2949equalsimpl0(this.errorLeadingIconColor, defaultTextFieldColors.errorLeadingIconColor) && Color.m2949equalsimpl0(this.trailingIconColor, defaultTextFieldColors.trailingIconColor) && Color.m2949equalsimpl0(this.disabledTrailingIconColor, defaultTextFieldColors.disabledTrailingIconColor) && Color.m2949equalsimpl0(this.errorTrailingIconColor, defaultTextFieldColors.errorTrailingIconColor) && Color.m2949equalsimpl0(this.backgroundColor, defaultTextFieldColors.backgroundColor) && Color.m2949equalsimpl0(this.focusedLabelColor, defaultTextFieldColors.focusedLabelColor) && Color.m2949equalsimpl0(this.unfocusedLabelColor, defaultTextFieldColors.unfocusedLabelColor) && Color.m2949equalsimpl0(this.disabledLabelColor, defaultTextFieldColors.disabledLabelColor) && Color.m2949equalsimpl0(this.errorLabelColor, defaultTextFieldColors.errorLabelColor) && Color.m2949equalsimpl0(this.placeholderColor, defaultTextFieldColors.placeholderColor) && Color.m2949equalsimpl0(this.disabledPlaceholderColor, defaultTextFieldColors.disabledPlaceholderColor)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((Color.m2955hashCodeimpl(this.textColor) * 31) + Color.m2955hashCodeimpl(this.disabledTextColor)) * 31) + Color.m2955hashCodeimpl(this.cursorColor)) * 31) + Color.m2955hashCodeimpl(this.errorCursorColor)) * 31) + Color.m2955hashCodeimpl(this.focusedIndicatorColor)) * 31) + Color.m2955hashCodeimpl(this.unfocusedIndicatorColor)) * 31) + Color.m2955hashCodeimpl(this.errorIndicatorColor)) * 31) + Color.m2955hashCodeimpl(this.disabledIndicatorColor)) * 31) + Color.m2955hashCodeimpl(this.leadingIconColor)) * 31) + Color.m2955hashCodeimpl(this.disabledLeadingIconColor)) * 31) + Color.m2955hashCodeimpl(this.errorLeadingIconColor)) * 31) + Color.m2955hashCodeimpl(this.trailingIconColor)) * 31) + Color.m2955hashCodeimpl(this.disabledTrailingIconColor)) * 31) + Color.m2955hashCodeimpl(this.errorTrailingIconColor)) * 31) + Color.m2955hashCodeimpl(this.backgroundColor)) * 31) + Color.m2955hashCodeimpl(this.focusedLabelColor)) * 31) + Color.m2955hashCodeimpl(this.unfocusedLabelColor)) * 31) + Color.m2955hashCodeimpl(this.disabledLabelColor)) * 31) + Color.m2955hashCodeimpl(this.errorLabelColor)) * 31) + Color.m2955hashCodeimpl(this.placeholderColor)) * 31) + Color.m2955hashCodeimpl(this.disabledPlaceholderColor);
    }

    @Override // androidx.compose.material.TextFieldColors
    @Composable
    public State<Color> indicatorColor(boolean z8, boolean z9, InteractionSource interactionSource, Composer composer, int i8) {
        long j8;
        State<Color> rememberUpdatedState;
        AbstractC3292y.i(interactionSource, "interactionSource");
        composer.startReplaceableGroup(998675979);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(998675979, i8, -1, "androidx.compose.material.DefaultTextFieldColors.indicatorColor (TextFieldDefaults.kt:720)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i8 >> 6) & 14);
        if (!z8) {
            j8 = this.disabledIndicatorColor;
        } else if (z9) {
            j8 = this.errorIndicatorColor;
        } else if (indicatorColor$lambda$0(collectIsFocusedAsState)) {
            j8 = this.focusedIndicatorColor;
        } else {
            j8 = this.unfocusedIndicatorColor;
        }
        long j9 = j8;
        if (z8) {
            composer.startReplaceableGroup(-2054190397);
            rememberUpdatedState = SingleValueAnimationKt.m164animateColorAsStateeuL9pac(j9, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, composer, 48, 12);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-2054190292);
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
        composer.startReplaceableGroup(727091888);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(727091888, i8, -1, "androidx.compose.material.DefaultTextFieldColors.labelColor (TextFieldDefaults.kt:751)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i8 >> 6) & 14);
        if (!z8) {
            j8 = this.disabledLabelColor;
        } else if (z9) {
            j8 = this.errorLabelColor;
        } else if (labelColor$lambda$1(collectIsFocusedAsState)) {
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

    @Override // androidx.compose.material.TextFieldColors
    @Composable
    public State<Color> leadingIconColor(boolean z8, boolean z9, Composer composer, int i8) {
        long j8;
        composer.startReplaceableGroup(1016171324);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1016171324, i8, -1, "androidx.compose.material.DefaultTextFieldColors.leadingIconColor (TextFieldDefaults.kt:698)");
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

    @Override // androidx.compose.material.TextFieldColors
    @Composable
    public State<Color> placeholderColor(boolean z8, Composer composer, int i8) {
        long j8;
        composer.startReplaceableGroup(264799724);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(264799724, i8, -1, "androidx.compose.material.DefaultTextFieldColors.placeholderColor (TextFieldDefaults.kt:746)");
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
        composer.startReplaceableGroup(9804418);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(9804418, i8, -1, "androidx.compose.material.DefaultTextFieldColors.textColor (TextFieldDefaults.kt:768)");
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
        composer.startReplaceableGroup(225259054);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(225259054, i8, -1, "androidx.compose.material.DefaultTextFieldColors.trailingIconColor (TextFieldDefaults.kt:709)");
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

    private DefaultTextFieldColors(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28) {
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
        this.disabledTrailingIconColor = j20;
        this.errorTrailingIconColor = j21;
        this.backgroundColor = j22;
        this.focusedLabelColor = j23;
        this.unfocusedLabelColor = j24;
        this.disabledLabelColor = j25;
        this.errorLabelColor = j26;
        this.placeholderColor = j27;
        this.disabledPlaceholderColor = j28;
    }
}
