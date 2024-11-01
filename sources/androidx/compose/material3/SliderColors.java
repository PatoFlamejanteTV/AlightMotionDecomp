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
public final class SliderColors {
    private final long activeTickColor;
    private final long activeTrackColor;
    private final long disabledActiveTickColor;
    private final long disabledActiveTrackColor;
    private final long disabledInactiveTickColor;
    private final long disabledInactiveTrackColor;
    private final long disabledThumbColor;
    private final long inactiveTickColor;
    private final long inactiveTrackColor;
    private final long thumbColor;

    public /* synthetic */ SliderColors(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, AbstractC3284p abstractC3284p) {
        this(j8, j9, j10, j11, j12, j13, j14, j15, j16, j17);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SliderColors)) {
            return false;
        }
        SliderColors sliderColors = (SliderColors) obj;
        if (Color.m2949equalsimpl0(this.thumbColor, sliderColors.thumbColor) && Color.m2949equalsimpl0(this.activeTrackColor, sliderColors.activeTrackColor) && Color.m2949equalsimpl0(this.activeTickColor, sliderColors.activeTickColor) && Color.m2949equalsimpl0(this.inactiveTrackColor, sliderColors.inactiveTrackColor) && Color.m2949equalsimpl0(this.inactiveTickColor, sliderColors.inactiveTickColor) && Color.m2949equalsimpl0(this.disabledThumbColor, sliderColors.disabledThumbColor) && Color.m2949equalsimpl0(this.disabledActiveTrackColor, sliderColors.disabledActiveTrackColor) && Color.m2949equalsimpl0(this.disabledActiveTickColor, sliderColors.disabledActiveTickColor) && Color.m2949equalsimpl0(this.disabledInactiveTrackColor, sliderColors.disabledInactiveTrackColor) && Color.m2949equalsimpl0(this.disabledInactiveTickColor, sliderColors.disabledInactiveTickColor)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((Color.m2955hashCodeimpl(this.thumbColor) * 31) + Color.m2955hashCodeimpl(this.activeTrackColor)) * 31) + Color.m2955hashCodeimpl(this.activeTickColor)) * 31) + Color.m2955hashCodeimpl(this.inactiveTrackColor)) * 31) + Color.m2955hashCodeimpl(this.inactiveTickColor)) * 31) + Color.m2955hashCodeimpl(this.disabledThumbColor)) * 31) + Color.m2955hashCodeimpl(this.disabledActiveTrackColor)) * 31) + Color.m2955hashCodeimpl(this.disabledActiveTickColor)) * 31) + Color.m2955hashCodeimpl(this.disabledInactiveTrackColor)) * 31) + Color.m2955hashCodeimpl(this.disabledInactiveTickColor);
    }

    @Composable
    public final State<Color> thumbColor$material3_release(boolean z8, Composer composer, int i8) {
        long j8;
        composer.startReplaceableGroup(-1917959445);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1917959445, i8, -1, "androidx.compose.material3.SliderColors.thumbColor (Slider.kt:1307)");
        }
        if (z8) {
            j8 = this.thumbColor;
        } else {
            j8 = this.disabledThumbColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2938boximpl(j8), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Composable
    public final State<Color> tickColor$material3_release(boolean z8, boolean z9, Composer composer, int i8) {
        long j8;
        composer.startReplaceableGroup(337026738);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(337026738, i8, -1, "androidx.compose.material3.SliderColors.tickColor (Slider.kt:1323)");
        }
        if (z8) {
            if (z9) {
                j8 = this.activeTickColor;
            } else {
                j8 = this.inactiveTickColor;
            }
        } else if (z9) {
            j8 = this.disabledActiveTickColor;
        } else {
            j8 = this.disabledInactiveTickColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2938boximpl(j8), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Composable
    public final State<Color> trackColor$material3_release(boolean z8, boolean z9, Composer composer, int i8) {
        long j8;
        composer.startReplaceableGroup(760609284);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(760609284, i8, -1, "androidx.compose.material3.SliderColors.trackColor (Slider.kt:1312)");
        }
        if (z8) {
            if (z9) {
                j8 = this.activeTrackColor;
            } else {
                j8 = this.inactiveTrackColor;
            }
        } else if (z9) {
            j8 = this.disabledActiveTrackColor;
        } else {
            j8 = this.disabledInactiveTrackColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2938boximpl(j8), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    private SliderColors(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17) {
        this.thumbColor = j8;
        this.activeTrackColor = j9;
        this.activeTickColor = j10;
        this.inactiveTrackColor = j11;
        this.inactiveTickColor = j12;
        this.disabledThumbColor = j13;
        this.disabledActiveTrackColor = j14;
        this.disabledActiveTickColor = j15;
        this.disabledInactiveTrackColor = j16;
        this.disabledInactiveTickColor = j17;
    }
}
