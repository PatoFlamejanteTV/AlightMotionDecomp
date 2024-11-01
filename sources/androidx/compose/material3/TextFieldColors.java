package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.text.selection.TextSelectionColors;
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
public final class TextFieldColors {
    private final long containerColor;
    private final long cursorColor;
    private final long disabledIndicatorColor;
    private final long disabledLabelColor;
    private final long disabledLeadingIconColor;
    private final long disabledPlaceholderColor;
    private final long disabledSupportingTextColor;
    private final long disabledTextColor;
    private final long disabledTrailingIconColor;
    private final long errorCursorColor;
    private final long errorIndicatorColor;
    private final long errorLabelColor;
    private final long errorLeadingIconColor;
    private final long errorSupportingTextColor;
    private final long errorTrailingIconColor;
    private final long focusedIndicatorColor;
    private final long focusedLabelColor;
    private final long focusedLeadingIconColor;
    private final long focusedSupportingTextColor;
    private final long focusedTrailingIconColor;
    private final long placeholderColor;
    private final long textColor;
    private final TextSelectionColors textSelectionColors;
    private final long unfocusedIndicatorColor;
    private final long unfocusedLabelColor;
    private final long unfocusedLeadingIconColor;
    private final long unfocusedSupportingTextColor;
    private final long unfocusedTrailingIconColor;

    public /* synthetic */ TextFieldColors(long j8, long j9, long j10, long j11, long j12, TextSelectionColors textSelectionColors, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, AbstractC3284p abstractC3284p) {
        this(j8, j9, j10, j11, j12, textSelectionColors, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34);
    }

    /* renamed from: indicatorColor$lambda-2, reason: not valid java name */
    private static final boolean m1817indicatorColor$lambda2(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* renamed from: labelColor$lambda-3, reason: not valid java name */
    private static final boolean m1818labelColor$lambda3(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* renamed from: leadingIconColor$lambda-0, reason: not valid java name */
    private static final boolean m1819leadingIconColor$lambda0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* renamed from: supportingTextColor$lambda-4, reason: not valid java name */
    private static final boolean m1820supportingTextColor$lambda4(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* renamed from: trailingIconColor$lambda-1, reason: not valid java name */
    private static final boolean m1821trailingIconColor$lambda1(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    @Composable
    public final State<Color> containerColor$material3_release(Composer composer, int i8) {
        composer.startReplaceableGroup(954653884);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(954653884, i8, -1, "androidx.compose.material3.TextFieldColors.containerColor (TextFieldDefaults.kt:794)");
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2938boximpl(this.containerColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Composable
    public final State<Color> cursorColor$material3_release(boolean z8, Composer composer, int i8) {
        long j8;
        composer.startReplaceableGroup(-1885422187);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1885422187, i8, -1, "androidx.compose.material3.TextFieldColors.cursorColor (TextFieldDefaults.kt:862)");
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
        if (obj == null || !(obj instanceof TextFieldColors)) {
            return false;
        }
        TextFieldColors textFieldColors = (TextFieldColors) obj;
        if (Color.m2949equalsimpl0(this.textColor, textFieldColors.textColor) && Color.m2949equalsimpl0(this.disabledTextColor, textFieldColors.disabledTextColor) && Color.m2949equalsimpl0(this.cursorColor, textFieldColors.cursorColor) && Color.m2949equalsimpl0(this.errorCursorColor, textFieldColors.errorCursorColor) && AbstractC3292y.d(this.textSelectionColors, textFieldColors.textSelectionColors) && Color.m2949equalsimpl0(this.focusedIndicatorColor, textFieldColors.focusedIndicatorColor) && Color.m2949equalsimpl0(this.unfocusedIndicatorColor, textFieldColors.unfocusedIndicatorColor) && Color.m2949equalsimpl0(this.errorIndicatorColor, textFieldColors.errorIndicatorColor) && Color.m2949equalsimpl0(this.disabledIndicatorColor, textFieldColors.disabledIndicatorColor) && Color.m2949equalsimpl0(this.focusedLeadingIconColor, textFieldColors.focusedLeadingIconColor) && Color.m2949equalsimpl0(this.unfocusedLeadingIconColor, textFieldColors.unfocusedLeadingIconColor) && Color.m2949equalsimpl0(this.disabledLeadingIconColor, textFieldColors.disabledLeadingIconColor) && Color.m2949equalsimpl0(this.errorLeadingIconColor, textFieldColors.errorLeadingIconColor) && Color.m2949equalsimpl0(this.focusedTrailingIconColor, textFieldColors.focusedTrailingIconColor) && Color.m2949equalsimpl0(this.unfocusedTrailingIconColor, textFieldColors.unfocusedTrailingIconColor) && Color.m2949equalsimpl0(this.disabledTrailingIconColor, textFieldColors.disabledTrailingIconColor) && Color.m2949equalsimpl0(this.errorTrailingIconColor, textFieldColors.errorTrailingIconColor) && Color.m2949equalsimpl0(this.containerColor, textFieldColors.containerColor) && Color.m2949equalsimpl0(this.focusedLabelColor, textFieldColors.focusedLabelColor) && Color.m2949equalsimpl0(this.unfocusedLabelColor, textFieldColors.unfocusedLabelColor) && Color.m2949equalsimpl0(this.disabledLabelColor, textFieldColors.disabledLabelColor) && Color.m2949equalsimpl0(this.errorLabelColor, textFieldColors.errorLabelColor) && Color.m2949equalsimpl0(this.placeholderColor, textFieldColors.placeholderColor) && Color.m2949equalsimpl0(this.disabledPlaceholderColor, textFieldColors.disabledPlaceholderColor) && Color.m2949equalsimpl0(this.focusedSupportingTextColor, textFieldColors.focusedSupportingTextColor) && Color.m2949equalsimpl0(this.unfocusedSupportingTextColor, textFieldColors.unfocusedSupportingTextColor) && Color.m2949equalsimpl0(this.disabledSupportingTextColor, textFieldColors.disabledSupportingTextColor) && Color.m2949equalsimpl0(this.errorSupportingTextColor, textFieldColors.errorSupportingTextColor)) {
            return true;
        }
        return false;
    }

    @Composable
    public final TextSelectionColors getSelectionColors(Composer composer, int i8) {
        composer.startReplaceableGroup(997785083);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(997785083, i8, -1, "androidx.compose.material3.TextFieldColors.<get-selectionColors> (TextFieldDefaults.kt:870)");
        }
        TextSelectionColors textSelectionColors = this.textSelectionColors;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textSelectionColors;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((Color.m2955hashCodeimpl(this.textColor) * 31) + Color.m2955hashCodeimpl(this.disabledTextColor)) * 31) + Color.m2955hashCodeimpl(this.cursorColor)) * 31) + Color.m2955hashCodeimpl(this.errorCursorColor)) * 31) + this.textSelectionColors.hashCode()) * 31) + Color.m2955hashCodeimpl(this.focusedIndicatorColor)) * 31) + Color.m2955hashCodeimpl(this.unfocusedIndicatorColor)) * 31) + Color.m2955hashCodeimpl(this.errorIndicatorColor)) * 31) + Color.m2955hashCodeimpl(this.disabledIndicatorColor)) * 31) + Color.m2955hashCodeimpl(this.focusedLeadingIconColor)) * 31) + Color.m2955hashCodeimpl(this.unfocusedLeadingIconColor)) * 31) + Color.m2955hashCodeimpl(this.disabledLeadingIconColor)) * 31) + Color.m2955hashCodeimpl(this.errorLeadingIconColor)) * 31) + Color.m2955hashCodeimpl(this.focusedTrailingIconColor)) * 31) + Color.m2955hashCodeimpl(this.unfocusedTrailingIconColor)) * 31) + Color.m2955hashCodeimpl(this.disabledTrailingIconColor)) * 31) + Color.m2955hashCodeimpl(this.errorTrailingIconColor)) * 31) + Color.m2955hashCodeimpl(this.containerColor)) * 31) + Color.m2955hashCodeimpl(this.focusedLabelColor)) * 31) + Color.m2955hashCodeimpl(this.unfocusedLabelColor)) * 31) + Color.m2955hashCodeimpl(this.disabledLabelColor)) * 31) + Color.m2955hashCodeimpl(this.errorLabelColor)) * 31) + Color.m2955hashCodeimpl(this.placeholderColor)) * 31) + Color.m2955hashCodeimpl(this.disabledPlaceholderColor)) * 31) + Color.m2955hashCodeimpl(this.focusedSupportingTextColor)) * 31) + Color.m2955hashCodeimpl(this.unfocusedSupportingTextColor)) * 31) + Color.m2955hashCodeimpl(this.disabledSupportingTextColor)) * 31) + Color.m2955hashCodeimpl(this.errorSupportingTextColor);
    }

    @Composable
    public final State<Color> indicatorColor$material3_release(boolean z8, boolean z9, InteractionSource interactionSource, Composer composer, int i8) {
        long j8;
        State<Color> rememberUpdatedState;
        AbstractC3292y.i(interactionSource, "interactionSource");
        composer.startReplaceableGroup(-1877482635);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1877482635, i8, -1, "androidx.compose.material3.TextFieldColors.indicatorColor (TextFieldDefaults.kt:770)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i8 >> 6) & 14);
        if (!z8) {
            j8 = this.disabledIndicatorColor;
        } else if (z9) {
            j8 = this.errorIndicatorColor;
        } else if (m1817indicatorColor$lambda2(collectIsFocusedAsState)) {
            j8 = this.focusedIndicatorColor;
        } else {
            j8 = this.unfocusedIndicatorColor;
        }
        long j9 = j8;
        if (z8) {
            composer.startReplaceableGroup(715730990);
            rememberUpdatedState = SingleValueAnimationKt.m163animateColorAsStateKTwxG1Y(j9, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, composer, 48, 4);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(715731095);
            rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2938boximpl(j9), composer, 0);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Composable
    public final State<Color> labelColor$material3_release(boolean z8, boolean z9, InteractionSource interactionSource, Composer composer, int i8) {
        long j8;
        AbstractC3292y.i(interactionSource, "interactionSource");
        composer.startReplaceableGroup(1167161306);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1167161306, i8, -1, "androidx.compose.material3.TextFieldColors.labelColor (TextFieldDefaults.kt:817)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i8 >> 6) & 14);
        if (!z8) {
            j8 = this.disabledLabelColor;
        } else if (z9) {
            j8 = this.errorLabelColor;
        } else if (m1818labelColor$lambda3(collectIsFocusedAsState)) {
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

    @Composable
    public final State<Color> leadingIconColor$material3_release(boolean z8, boolean z9, InteractionSource interactionSource, Composer composer, int i8) {
        long j8;
        AbstractC3292y.i(interactionSource, "interactionSource");
        composer.startReplaceableGroup(925127045);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(925127045, i8, -1, "androidx.compose.material3.TextFieldColors.leadingIconColor (TextFieldDefaults.kt:718)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i8 >> 6) & 14);
        if (!z8) {
            j8 = this.disabledLeadingIconColor;
        } else if (z9) {
            j8 = this.errorLeadingIconColor;
        } else if (m1819leadingIconColor$lambda0(collectIsFocusedAsState)) {
            j8 = this.focusedLeadingIconColor;
        } else {
            j8 = this.unfocusedLeadingIconColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2938boximpl(j8), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Composable
    public final State<Color> placeholderColor$material3_release(boolean z8, Composer composer, int i8) {
        long j8;
        composer.startReplaceableGroup(-117469162);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-117469162, i8, -1, "androidx.compose.material3.TextFieldColors.placeholderColor (TextFieldDefaults.kt:804)");
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

    @Composable
    public final State<Color> supportingTextColor$material3_release(boolean z8, boolean z9, InteractionSource interactionSource, Composer composer, int i8) {
        long j8;
        AbstractC3292y.i(interactionSource, "interactionSource");
        composer.startReplaceableGroup(1464709698);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1464709698, i8, -1, "androidx.compose.material3.TextFieldColors.supportingTextColor (TextFieldDefaults.kt:839)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i8 >> 6) & 14);
        if (!z8) {
            j8 = this.disabledSupportingTextColor;
        } else if (z9) {
            j8 = this.errorSupportingTextColor;
        } else if (m1820supportingTextColor$lambda4(collectIsFocusedAsState)) {
            j8 = this.focusedSupportingTextColor;
        } else {
            j8 = this.unfocusedSupportingTextColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2938boximpl(j8), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Composable
    public final State<Color> textColor$material3_release(boolean z8, Composer composer, int i8) {
        long j8;
        composer.startReplaceableGroup(2080722220);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2080722220, i8, -1, "androidx.compose.material3.TextFieldColors.textColor (TextFieldDefaults.kt:834)");
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

    @Composable
    public final State<Color> trailingIconColor$material3_release(boolean z8, boolean z9, InteractionSource interactionSource, Composer composer, int i8) {
        long j8;
        AbstractC3292y.i(interactionSource, "interactionSource");
        composer.startReplaceableGroup(-109504137);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-109504137, i8, -1, "androidx.compose.material3.TextFieldColors.trailingIconColor (TextFieldDefaults.kt:744)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i8 >> 6) & 14);
        if (!z8) {
            j8 = this.disabledTrailingIconColor;
        } else if (z9) {
            j8 = this.errorTrailingIconColor;
        } else if (m1821trailingIconColor$lambda1(collectIsFocusedAsState)) {
            j8 = this.focusedTrailingIconColor;
        } else {
            j8 = this.unfocusedTrailingIconColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2938boximpl(j8), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    private TextFieldColors(long j8, long j9, long j10, long j11, long j12, TextSelectionColors textSelectionColors, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34) {
        this.textColor = j8;
        this.disabledTextColor = j9;
        this.containerColor = j10;
        this.cursorColor = j11;
        this.errorCursorColor = j12;
        this.textSelectionColors = textSelectionColors;
        this.focusedIndicatorColor = j13;
        this.unfocusedIndicatorColor = j14;
        this.errorIndicatorColor = j15;
        this.disabledIndicatorColor = j16;
        this.focusedLeadingIconColor = j17;
        this.unfocusedLeadingIconColor = j18;
        this.disabledLeadingIconColor = j19;
        this.errorLeadingIconColor = j20;
        this.focusedTrailingIconColor = j21;
        this.unfocusedTrailingIconColor = j22;
        this.disabledTrailingIconColor = j23;
        this.errorTrailingIconColor = j24;
        this.focusedLabelColor = j25;
        this.unfocusedLabelColor = j26;
        this.disabledLabelColor = j27;
        this.errorLabelColor = j28;
        this.placeholderColor = j29;
        this.disabledPlaceholderColor = j30;
        this.focusedSupportingTextColor = j31;
        this.unfocusedSupportingTextColor = j32;
        this.disabledSupportingTextColor = j33;
        this.errorSupportingTextColor = j34;
    }
}
