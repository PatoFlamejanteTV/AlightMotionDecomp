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
public final class ButtonColors {
    private final long containerColor;
    private final long contentColor;
    private final long disabledContainerColor;
    private final long disabledContentColor;

    public /* synthetic */ ButtonColors(long j8, long j9, long j10, long j11, AbstractC3284p abstractC3284p) {
        this(j8, j9, j10, j11);
    }

    @Composable
    public final State<Color> containerColor$material3_release(boolean z8, Composer composer, int i8) {
        long j8;
        composer.startReplaceableGroup(-754887434);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-754887434, i8, -1, "androidx.compose.material3.ButtonColors.containerColor (Button.kt:917)");
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

    @Composable
    public final State<Color> contentColor$material3_release(boolean z8, Composer composer, int i8) {
        long j8;
        composer.startReplaceableGroup(-360303250);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-360303250, i8, -1, "androidx.compose.material3.ButtonColors.contentColor (Button.kt:927)");
        }
        if (z8) {
            j8 = this.contentColor;
        } else {
            j8 = this.disabledContentColor;
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
        if (obj == null || !(obj instanceof ButtonColors)) {
            return false;
        }
        ButtonColors buttonColors = (ButtonColors) obj;
        if (Color.m2949equalsimpl0(this.containerColor, buttonColors.containerColor) && Color.m2949equalsimpl0(this.contentColor, buttonColors.contentColor) && Color.m2949equalsimpl0(this.disabledContainerColor, buttonColors.disabledContainerColor) && Color.m2949equalsimpl0(this.disabledContentColor, buttonColors.disabledContentColor)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((Color.m2955hashCodeimpl(this.containerColor) * 31) + Color.m2955hashCodeimpl(this.contentColor)) * 31) + Color.m2955hashCodeimpl(this.disabledContainerColor)) * 31) + Color.m2955hashCodeimpl(this.disabledContentColor);
    }

    private ButtonColors(long j8, long j9, long j10, long j11) {
        this.containerColor = j8;
        this.contentColor = j9;
        this.disabledContainerColor = j10;
        this.disabledContentColor = j11;
    }
}
