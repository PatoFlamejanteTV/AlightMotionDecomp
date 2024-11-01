package androidx.compose.material3;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.AbstractC3284p;

@Immutable
@ExperimentalMaterial3Api
/* loaded from: classes.dex */
public final class SelectableChipColors {
    private final long containerColor;
    private final long disabledContainerColor;
    private final long disabledLabelColor;
    private final long disabledLeadingIconColor;
    private final long disabledSelectedContainerColor;
    private final long disabledTrailingIconColor;
    private final long labelColor;
    private final long leadingIconColor;
    private final long selectedContainerColor;
    private final long selectedLabelColor;
    private final long selectedLeadingIconColor;
    private final long selectedTrailingIconColor;
    private final long trailingIconColor;

    public /* synthetic */ SelectableChipColors(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, AbstractC3284p abstractC3284p) {
        this(j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20);
    }

    @Composable
    public final State<Color> containerColor$material3_release(boolean z8, boolean z9, Composer composer, int i8) {
        long j8;
        composer.startReplaceableGroup(-2126903408);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2126903408, i8, -1, "androidx.compose.material3.SelectableChipColors.containerColor (Chip.kt:1884)");
        }
        if (!z8) {
            if (z9) {
                j8 = this.disabledSelectedContainerColor;
            } else {
                j8 = this.disabledContainerColor;
            }
        } else if (!z9) {
            j8 = this.containerColor;
        } else {
            j8 = this.selectedContainerColor;
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
        if (obj == null || !(obj instanceof SelectableChipColors)) {
            return false;
        }
        SelectableChipColors selectableChipColors = (SelectableChipColors) obj;
        if (Color.m2949equalsimpl0(this.containerColor, selectableChipColors.containerColor) && Color.m2949equalsimpl0(this.labelColor, selectableChipColors.labelColor) && Color.m2949equalsimpl0(this.leadingIconColor, selectableChipColors.leadingIconColor) && Color.m2949equalsimpl0(this.trailingIconColor, selectableChipColors.trailingIconColor) && Color.m2949equalsimpl0(this.disabledContainerColor, selectableChipColors.disabledContainerColor) && Color.m2949equalsimpl0(this.disabledLabelColor, selectableChipColors.disabledLabelColor) && Color.m2949equalsimpl0(this.disabledLeadingIconColor, selectableChipColors.disabledLeadingIconColor) && Color.m2949equalsimpl0(this.disabledTrailingIconColor, selectableChipColors.disabledTrailingIconColor) && Color.m2949equalsimpl0(this.selectedContainerColor, selectableChipColors.selectedContainerColor) && Color.m2949equalsimpl0(this.disabledSelectedContainerColor, selectableChipColors.disabledSelectedContainerColor) && Color.m2949equalsimpl0(this.selectedLabelColor, selectableChipColors.selectedLabelColor) && Color.m2949equalsimpl0(this.selectedLeadingIconColor, selectableChipColors.selectedLeadingIconColor) && Color.m2949equalsimpl0(this.selectedTrailingIconColor, selectableChipColors.selectedTrailingIconColor)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((((((((Color.m2955hashCodeimpl(this.containerColor) * 31) + Color.m2955hashCodeimpl(this.labelColor)) * 31) + Color.m2955hashCodeimpl(this.leadingIconColor)) * 31) + Color.m2955hashCodeimpl(this.trailingIconColor)) * 31) + Color.m2955hashCodeimpl(this.disabledContainerColor)) * 31) + Color.m2955hashCodeimpl(this.disabledLabelColor)) * 31) + Color.m2955hashCodeimpl(this.disabledLeadingIconColor)) * 31) + Color.m2955hashCodeimpl(this.disabledTrailingIconColor)) * 31) + Color.m2955hashCodeimpl(this.selectedContainerColor)) * 31) + Color.m2955hashCodeimpl(this.disabledSelectedContainerColor)) * 31) + Color.m2955hashCodeimpl(this.selectedLabelColor)) * 31) + Color.m2955hashCodeimpl(this.selectedLeadingIconColor)) * 31) + Color.m2955hashCodeimpl(this.selectedTrailingIconColor);
    }

    @Composable
    public final State<Color> labelColor$material3_release(boolean z8, boolean z9, Composer composer, int i8) {
        long j8;
        composer.startReplaceableGroup(-829231549);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-829231549, i8, -1, "androidx.compose.material3.SelectableChipColors.labelColor (Chip.kt:1900)");
        }
        if (!z8) {
            j8 = this.disabledLabelColor;
        } else if (!z9) {
            j8 = this.labelColor;
        } else {
            j8 = this.selectedLabelColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2938boximpl(j8), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Composable
    public final State<Color> leadingIconContentColor$material3_release(boolean z8, boolean z9, Composer composer, int i8) {
        long j8;
        composer.startReplaceableGroup(-1112029563);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1112029563, i8, -1, "androidx.compose.material3.SelectableChipColors.leadingIconContentColor (Chip.kt:1916)");
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

    @Composable
    public final State<Color> trailingIconContentColor$material3_release(boolean z8, boolean z9, Composer composer, int i8) {
        long j8;
        composer.startReplaceableGroup(963620819);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(963620819, i8, -1, "androidx.compose.material3.SelectableChipColors.trailingIconContentColor (Chip.kt:1932)");
        }
        if (!z8) {
            j8 = this.disabledTrailingIconColor;
        } else if (!z9) {
            j8 = this.trailingIconColor;
        } else {
            j8 = this.selectedTrailingIconColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2938boximpl(j8), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    private SelectableChipColors(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20) {
        this.containerColor = j8;
        this.labelColor = j9;
        this.leadingIconColor = j10;
        this.trailingIconColor = j11;
        this.disabledContainerColor = j12;
        this.disabledLabelColor = j13;
        this.disabledLeadingIconColor = j14;
        this.disabledTrailingIconColor = j15;
        this.selectedContainerColor = j16;
        this.disabledSelectedContainerColor = j17;
        this.selectedLabelColor = j18;
        this.selectedLeadingIconColor = j19;
        this.selectedTrailingIconColor = j20;
    }
}
