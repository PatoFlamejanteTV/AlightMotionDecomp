package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.AbstractC3284p;

@Immutable
@ExperimentalMaterialApi
/* loaded from: classes.dex */
final class DefaultSelectableChipColors implements SelectableChipColors {
    private final long backgroundColor;
    private final long contentColor;
    private final long disabledBackgroundColor;
    private final long disabledContentColor;
    private final long disabledLeadingIconColor;
    private final long leadingIconColor;
    private final long selectedBackgroundColor;
    private final long selectedContentColor;
    private final long selectedLeadingIconColor;

    public /* synthetic */ DefaultSelectableChipColors(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, AbstractC3284p abstractC3284p) {
        this(j8, j9, j10, j11, j12, j13, j14, j15, j16);
    }

    @Override // androidx.compose.material.SelectableChipColors
    @Composable
    public State<Color> backgroundColor(boolean z8, boolean z9, Composer composer, int i8) {
        long j8;
        composer.startReplaceableGroup(-403836585);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-403836585, i8, -1, "androidx.compose.material.DefaultSelectableChipColors.backgroundColor (Chip.kt:654)");
        }
        if (!z8) {
            j8 = this.disabledBackgroundColor;
        } else if (!z9) {
            j8 = this.backgroundColor;
        } else {
            j8 = this.selectedBackgroundColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2938boximpl(j8), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.SelectableChipColors
    @Composable
    public State<Color> contentColor(boolean z8, boolean z9, Composer composer, int i8) {
        long j8;
        composer.startReplaceableGroup(2025240134);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2025240134, i8, -1, "androidx.compose.material.DefaultSelectableChipColors.contentColor (Chip.kt:664)");
        }
        if (!z8) {
            j8 = this.disabledContentColor;
        } else if (!z9) {
            j8 = this.contentColor;
        } else {
            j8 = this.selectedContentColor;
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
        if (obj == null || DefaultSelectableChipColors.class != obj.getClass()) {
            return false;
        }
        DefaultSelectableChipColors defaultSelectableChipColors = (DefaultSelectableChipColors) obj;
        if (Color.m2949equalsimpl0(this.backgroundColor, defaultSelectableChipColors.backgroundColor) && Color.m2949equalsimpl0(this.contentColor, defaultSelectableChipColors.contentColor) && Color.m2949equalsimpl0(this.leadingIconColor, defaultSelectableChipColors.leadingIconColor) && Color.m2949equalsimpl0(this.disabledBackgroundColor, defaultSelectableChipColors.disabledBackgroundColor) && Color.m2949equalsimpl0(this.disabledContentColor, defaultSelectableChipColors.disabledContentColor) && Color.m2949equalsimpl0(this.disabledLeadingIconColor, defaultSelectableChipColors.disabledLeadingIconColor) && Color.m2949equalsimpl0(this.selectedBackgroundColor, defaultSelectableChipColors.selectedBackgroundColor) && Color.m2949equalsimpl0(this.selectedContentColor, defaultSelectableChipColors.selectedContentColor) && Color.m2949equalsimpl0(this.selectedLeadingIconColor, defaultSelectableChipColors.selectedLeadingIconColor)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((Color.m2955hashCodeimpl(this.backgroundColor) * 31) + Color.m2955hashCodeimpl(this.contentColor)) * 31) + Color.m2955hashCodeimpl(this.leadingIconColor)) * 31) + Color.m2955hashCodeimpl(this.disabledBackgroundColor)) * 31) + Color.m2955hashCodeimpl(this.disabledContentColor)) * 31) + Color.m2955hashCodeimpl(this.disabledLeadingIconColor)) * 31) + Color.m2955hashCodeimpl(this.selectedBackgroundColor)) * 31) + Color.m2955hashCodeimpl(this.selectedContentColor)) * 31) + Color.m2955hashCodeimpl(this.selectedLeadingIconColor);
    }

    @Override // androidx.compose.material.SelectableChipColors
    @Composable
    public State<Color> leadingIconColor(boolean z8, boolean z9, Composer composer, int i8) {
        long j8;
        composer.startReplaceableGroup(189838188);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(189838188, i8, -1, "androidx.compose.material.DefaultSelectableChipColors.leadingIconColor (Chip.kt:674)");
        }
        if (!z8) {
            j8 = this.disabledLeadingIconColor;
        } else if (!z9) {
            j8 = this.leadingIconColor;
        } else {
            j8 = this.selectedLeadingIconColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2938boximpl(j8), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    private DefaultSelectableChipColors(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        this.backgroundColor = j8;
        this.contentColor = j9;
        this.leadingIconColor = j10;
        this.disabledBackgroundColor = j11;
        this.disabledContentColor = j12;
        this.disabledLeadingIconColor = j13;
        this.selectedBackgroundColor = j14;
        this.selectedContentColor = j15;
        this.selectedLeadingIconColor = j16;
    }
}
