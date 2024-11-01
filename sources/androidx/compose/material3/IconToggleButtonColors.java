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
/* loaded from: classes.dex */
public final class IconToggleButtonColors {
    private final long checkedContainerColor;
    private final long checkedContentColor;
    private final long containerColor;
    private final long contentColor;
    private final long disabledContainerColor;
    private final long disabledContentColor;

    public /* synthetic */ IconToggleButtonColors(long j8, long j9, long j10, long j11, long j12, long j13, AbstractC3284p abstractC3284p) {
        this(j8, j9, j10, j11, j12, j13);
    }

    @Composable
    public final State<Color> containerColor$material3_release(boolean z8, boolean z9, Composer composer, int i8) {
        long j8;
        composer.startReplaceableGroup(1175394478);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1175394478, i8, -1, "androidx.compose.material3.IconToggleButtonColors.containerColor (IconButton.kt:886)");
        }
        if (!z8) {
            j8 = this.disabledContainerColor;
        } else if (!z9) {
            j8 = this.containerColor;
        } else {
            j8 = this.checkedContainerColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2938boximpl(j8), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Composable
    public final State<Color> contentColor$material3_release(boolean z8, boolean z9, Composer composer, int i8) {
        long j8;
        composer.startReplaceableGroup(1340854054);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1340854054, i8, -1, "androidx.compose.material3.IconToggleButtonColors.contentColor (IconButton.kt:902)");
        }
        if (!z8) {
            j8 = this.disabledContentColor;
        } else if (!z9) {
            j8 = this.contentColor;
        } else {
            j8 = this.checkedContentColor;
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
        if (obj == null || !(obj instanceof IconToggleButtonColors)) {
            return false;
        }
        IconToggleButtonColors iconToggleButtonColors = (IconToggleButtonColors) obj;
        if (Color.m2949equalsimpl0(this.containerColor, iconToggleButtonColors.containerColor) && Color.m2949equalsimpl0(this.contentColor, iconToggleButtonColors.contentColor) && Color.m2949equalsimpl0(this.disabledContainerColor, iconToggleButtonColors.disabledContainerColor) && Color.m2949equalsimpl0(this.disabledContentColor, iconToggleButtonColors.disabledContentColor) && Color.m2949equalsimpl0(this.checkedContainerColor, iconToggleButtonColors.checkedContainerColor) && Color.m2949equalsimpl0(this.checkedContentColor, iconToggleButtonColors.checkedContentColor)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((Color.m2955hashCodeimpl(this.containerColor) * 31) + Color.m2955hashCodeimpl(this.contentColor)) * 31) + Color.m2955hashCodeimpl(this.disabledContainerColor)) * 31) + Color.m2955hashCodeimpl(this.disabledContentColor)) * 31) + Color.m2955hashCodeimpl(this.checkedContainerColor)) * 31) + Color.m2955hashCodeimpl(this.checkedContentColor);
    }

    private IconToggleButtonColors(long j8, long j9, long j10, long j11, long j12, long j13) {
        this.containerColor = j8;
        this.contentColor = j9;
        this.disabledContainerColor = j10;
        this.disabledContentColor = j11;
        this.checkedContainerColor = j12;
        this.checkedContentColor = j13;
    }
}
