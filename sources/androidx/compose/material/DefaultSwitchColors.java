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
/* loaded from: classes.dex */
final class DefaultSwitchColors implements SwitchColors {
    private final long checkedThumbColor;
    private final long checkedTrackColor;
    private final long disabledCheckedThumbColor;
    private final long disabledCheckedTrackColor;
    private final long disabledUncheckedThumbColor;
    private final long disabledUncheckedTrackColor;
    private final long uncheckedThumbColor;
    private final long uncheckedTrackColor;

    public /* synthetic */ DefaultSwitchColors(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, AbstractC3284p abstractC3284p) {
        this(j8, j9, j10, j11, j12, j13, j14, j15);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DefaultSwitchColors.class != obj.getClass()) {
            return false;
        }
        DefaultSwitchColors defaultSwitchColors = (DefaultSwitchColors) obj;
        if (Color.m2949equalsimpl0(this.checkedThumbColor, defaultSwitchColors.checkedThumbColor) && Color.m2949equalsimpl0(this.checkedTrackColor, defaultSwitchColors.checkedTrackColor) && Color.m2949equalsimpl0(this.uncheckedThumbColor, defaultSwitchColors.uncheckedThumbColor) && Color.m2949equalsimpl0(this.uncheckedTrackColor, defaultSwitchColors.uncheckedTrackColor) && Color.m2949equalsimpl0(this.disabledCheckedThumbColor, defaultSwitchColors.disabledCheckedThumbColor) && Color.m2949equalsimpl0(this.disabledCheckedTrackColor, defaultSwitchColors.disabledCheckedTrackColor) && Color.m2949equalsimpl0(this.disabledUncheckedThumbColor, defaultSwitchColors.disabledUncheckedThumbColor) && Color.m2949equalsimpl0(this.disabledUncheckedTrackColor, defaultSwitchColors.disabledUncheckedTrackColor)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((Color.m2955hashCodeimpl(this.checkedThumbColor) * 31) + Color.m2955hashCodeimpl(this.checkedTrackColor)) * 31) + Color.m2955hashCodeimpl(this.uncheckedThumbColor)) * 31) + Color.m2955hashCodeimpl(this.uncheckedTrackColor)) * 31) + Color.m2955hashCodeimpl(this.disabledCheckedThumbColor)) * 31) + Color.m2955hashCodeimpl(this.disabledCheckedTrackColor)) * 31) + Color.m2955hashCodeimpl(this.disabledUncheckedThumbColor)) * 31) + Color.m2955hashCodeimpl(this.disabledUncheckedTrackColor);
    }

    @Override // androidx.compose.material.SwitchColors
    @Composable
    public State<Color> thumbColor(boolean z8, boolean z9, Composer composer, int i8) {
        long j8;
        composer.startReplaceableGroup(-66424183);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-66424183, i8, -1, "androidx.compose.material.DefaultSwitchColors.thumbColor (Switch.kt:366)");
        }
        if (z8) {
            if (z9) {
                j8 = this.checkedThumbColor;
            } else {
                j8 = this.uncheckedThumbColor;
            }
        } else if (z9) {
            j8 = this.disabledCheckedThumbColor;
        } else {
            j8 = this.disabledUncheckedThumbColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2938boximpl(j8), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.SwitchColors
    @Composable
    public State<Color> trackColor(boolean z8, boolean z9, Composer composer, int i8) {
        long j8;
        composer.startReplaceableGroup(-1176343362);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1176343362, i8, -1, "androidx.compose.material.DefaultSwitchColors.trackColor (Switch.kt:377)");
        }
        if (z8) {
            if (z9) {
                j8 = this.checkedTrackColor;
            } else {
                j8 = this.uncheckedTrackColor;
            }
        } else if (z9) {
            j8 = this.disabledCheckedTrackColor;
        } else {
            j8 = this.disabledUncheckedTrackColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2938boximpl(j8), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    private DefaultSwitchColors(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15) {
        this.checkedThumbColor = j8;
        this.checkedTrackColor = j9;
        this.uncheckedThumbColor = j10;
        this.uncheckedTrackColor = j11;
        this.disabledCheckedThumbColor = j12;
        this.disabledCheckedTrackColor = j13;
        this.disabledUncheckedThumbColor = j14;
        this.disabledUncheckedTrackColor = j15;
    }
}
