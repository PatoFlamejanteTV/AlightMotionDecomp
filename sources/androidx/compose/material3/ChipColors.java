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
public final class ChipColors {
    private final long containerColor;
    private final long disabledContainerColor;
    private final long disabledLabelColor;
    private final long disabledLeadingIconContentColor;
    private final long disabledTrailingIconContentColor;
    private final long labelColor;
    private final long leadingIconContentColor;
    private final long trailingIconContentColor;

    public /* synthetic */ ChipColors(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, AbstractC3284p abstractC3284p) {
        this(j8, j9, j10, j11, j12, j13, j14, j15);
    }

    @Composable
    public final State<Color> containerColor$material3_release(boolean z8, Composer composer, int i8) {
        long j8;
        composer.startReplaceableGroup(-136683658);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-136683658, i8, -1, "androidx.compose.material3.ChipColors.containerColor (Chip.kt:1785)");
        }
        if (z8) {
            j8 = this.containerColor;
        } else {
            j8 = this.disabledContainerColor;
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
        if (obj == null || !(obj instanceof ChipColors)) {
            return false;
        }
        ChipColors chipColors = (ChipColors) obj;
        if (Color.m2949equalsimpl0(this.containerColor, chipColors.containerColor) && Color.m2949equalsimpl0(this.labelColor, chipColors.labelColor) && Color.m2949equalsimpl0(this.leadingIconContentColor, chipColors.leadingIconContentColor) && Color.m2949equalsimpl0(this.trailingIconContentColor, chipColors.trailingIconContentColor) && Color.m2949equalsimpl0(this.disabledContainerColor, chipColors.disabledContainerColor) && Color.m2949equalsimpl0(this.disabledLabelColor, chipColors.disabledLabelColor) && Color.m2949equalsimpl0(this.disabledLeadingIconContentColor, chipColors.disabledLeadingIconContentColor) && Color.m2949equalsimpl0(this.disabledTrailingIconContentColor, chipColors.disabledTrailingIconContentColor)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((Color.m2955hashCodeimpl(this.containerColor) * 31) + Color.m2955hashCodeimpl(this.labelColor)) * 31) + Color.m2955hashCodeimpl(this.leadingIconContentColor)) * 31) + Color.m2955hashCodeimpl(this.trailingIconContentColor)) * 31) + Color.m2955hashCodeimpl(this.disabledContainerColor)) * 31) + Color.m2955hashCodeimpl(this.disabledLabelColor)) * 31) + Color.m2955hashCodeimpl(this.disabledLeadingIconContentColor)) * 31) + Color.m2955hashCodeimpl(this.disabledTrailingIconContentColor);
    }

    @Composable
    public final State<Color> labelColor$material3_release(boolean z8, Composer composer, int i8) {
        long j8;
        composer.startReplaceableGroup(559848681);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(559848681, i8, -1, "androidx.compose.material3.ChipColors.labelColor (Chip.kt:1795)");
        }
        if (z8) {
            j8 = this.labelColor;
        } else {
            j8 = this.disabledLabelColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2938boximpl(j8), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Composable
    public final State<Color> leadingIconContentColor$material3_release(boolean z8, Composer composer, int i8) {
        long j8;
        composer.startReplaceableGroup(5136811);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(5136811, i8, -1, "androidx.compose.material3.ChipColors.leadingIconContentColor (Chip.kt:1805)");
        }
        if (z8) {
            j8 = this.leadingIconContentColor;
        } else {
            j8 = this.disabledLeadingIconContentColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2938boximpl(j8), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Composable
    public final State<Color> trailingIconContentColor$material3_release(boolean z8, Composer composer, int i8) {
        long j8;
        composer.startReplaceableGroup(96182905);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(96182905, i8, -1, "androidx.compose.material3.ChipColors.trailingIconContentColor (Chip.kt:1817)");
        }
        if (z8) {
            j8 = this.trailingIconContentColor;
        } else {
            j8 = this.disabledTrailingIconContentColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2938boximpl(j8), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    private ChipColors(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15) {
        this.containerColor = j8;
        this.labelColor = j9;
        this.leadingIconContentColor = j10;
        this.trailingIconContentColor = j11;
        this.disabledContainerColor = j12;
        this.disabledLabelColor = j13;
        this.disabledLeadingIconContentColor = j14;
        this.disabledTrailingIconContentColor = j15;
    }
}
