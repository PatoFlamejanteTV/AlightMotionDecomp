package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.AbstractC3284p;

/* JADX INFO: Access modifiers changed from: package-private */
@Immutable
/* loaded from: classes.dex */
public final class DefaultButtonColors implements ButtonColors {
    private final long backgroundColor;
    private final long contentColor;
    private final long disabledBackgroundColor;
    private final long disabledContentColor;

    public /* synthetic */ DefaultButtonColors(long j8, long j9, long j10, long j11, AbstractC3284p abstractC3284p) {
        this(j8, j9, j10, j11);
    }

    @Override // androidx.compose.material.ButtonColors
    @Composable
    public State<Color> backgroundColor(boolean z8, Composer composer, int i8) {
        long j8;
        composer.startReplaceableGroup(-655254499);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-655254499, i8, -1, "androidx.compose.material.DefaultButtonColors.backgroundColor (Button.kt:586)");
        }
        if (z8) {
            j8 = this.backgroundColor;
        } else {
            j8 = this.disabledBackgroundColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2938boximpl(j8), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.ButtonColors
    @Composable
    public State<Color> contentColor(boolean z8, Composer composer, int i8) {
        long j8;
        composer.startReplaceableGroup(-2133647540);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2133647540, i8, -1, "androidx.compose.material.DefaultButtonColors.contentColor (Button.kt:591)");
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
        if (obj == null || DefaultButtonColors.class != obj.getClass()) {
            return false;
        }
        DefaultButtonColors defaultButtonColors = (DefaultButtonColors) obj;
        if (Color.m2949equalsimpl0(this.backgroundColor, defaultButtonColors.backgroundColor) && Color.m2949equalsimpl0(this.contentColor, defaultButtonColors.contentColor) && Color.m2949equalsimpl0(this.disabledBackgroundColor, defaultButtonColors.disabledBackgroundColor) && Color.m2949equalsimpl0(this.disabledContentColor, defaultButtonColors.disabledContentColor)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((Color.m2955hashCodeimpl(this.backgroundColor) * 31) + Color.m2955hashCodeimpl(this.contentColor)) * 31) + Color.m2955hashCodeimpl(this.disabledBackgroundColor)) * 31) + Color.m2955hashCodeimpl(this.disabledContentColor);
    }

    private DefaultButtonColors(long j8, long j9, long j10, long j11) {
        this.backgroundColor = j8;
        this.contentColor = j9;
        this.disabledBackgroundColor = j10;
        this.disabledContentColor = j11;
    }
}
