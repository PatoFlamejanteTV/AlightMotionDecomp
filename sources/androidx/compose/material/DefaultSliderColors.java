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
public final class DefaultSliderColors implements SliderColors {
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

    public /* synthetic */ DefaultSliderColors(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, AbstractC3284p abstractC3284p) {
        this(j8, j9, j10, j11, j12, j13, j14, j15, j16, j17);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DefaultSliderColors.class != obj.getClass()) {
            return false;
        }
        DefaultSliderColors defaultSliderColors = (DefaultSliderColors) obj;
        if (Color.m2949equalsimpl0(this.thumbColor, defaultSliderColors.thumbColor) && Color.m2949equalsimpl0(this.disabledThumbColor, defaultSliderColors.disabledThumbColor) && Color.m2949equalsimpl0(this.activeTrackColor, defaultSliderColors.activeTrackColor) && Color.m2949equalsimpl0(this.inactiveTrackColor, defaultSliderColors.inactiveTrackColor) && Color.m2949equalsimpl0(this.disabledActiveTrackColor, defaultSliderColors.disabledActiveTrackColor) && Color.m2949equalsimpl0(this.disabledInactiveTrackColor, defaultSliderColors.disabledInactiveTrackColor) && Color.m2949equalsimpl0(this.activeTickColor, defaultSliderColors.activeTickColor) && Color.m2949equalsimpl0(this.inactiveTickColor, defaultSliderColors.inactiveTickColor) && Color.m2949equalsimpl0(this.disabledActiveTickColor, defaultSliderColors.disabledActiveTickColor) && Color.m2949equalsimpl0(this.disabledInactiveTickColor, defaultSliderColors.disabledInactiveTickColor)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((Color.m2955hashCodeimpl(this.thumbColor) * 31) + Color.m2955hashCodeimpl(this.disabledThumbColor)) * 31) + Color.m2955hashCodeimpl(this.activeTrackColor)) * 31) + Color.m2955hashCodeimpl(this.inactiveTrackColor)) * 31) + Color.m2955hashCodeimpl(this.disabledActiveTrackColor)) * 31) + Color.m2955hashCodeimpl(this.disabledInactiveTrackColor)) * 31) + Color.m2955hashCodeimpl(this.activeTickColor)) * 31) + Color.m2955hashCodeimpl(this.inactiveTickColor)) * 31) + Color.m2955hashCodeimpl(this.disabledActiveTickColor)) * 31) + Color.m2955hashCodeimpl(this.disabledInactiveTickColor);
    }

    @Override // androidx.compose.material.SliderColors
    @Composable
    public State<Color> thumbColor(boolean z8, Composer composer, int i8) {
        long j8;
        composer.startReplaceableGroup(-1733795637);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1733795637, i8, -1, "androidx.compose.material.DefaultSliderColors.thumbColor (Slider.kt:1086)");
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

    @Override // androidx.compose.material.SliderColors
    @Composable
    public State<Color> tickColor(boolean z8, boolean z9, Composer composer, int i8) {
        long j8;
        composer.startReplaceableGroup(-1491563694);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1491563694, i8, -1, "androidx.compose.material.DefaultSliderColors.tickColor (Slider.kt:1102)");
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

    @Override // androidx.compose.material.SliderColors
    @Composable
    public State<Color> trackColor(boolean z8, boolean z9, Composer composer, int i8) {
        long j8;
        composer.startReplaceableGroup(1575395620);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1575395620, i8, -1, "androidx.compose.material.DefaultSliderColors.trackColor (Slider.kt:1091)");
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

    private DefaultSliderColors(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17) {
        this.thumbColor = j8;
        this.disabledThumbColor = j9;
        this.activeTrackColor = j10;
        this.inactiveTrackColor = j11;
        this.disabledActiveTrackColor = j12;
        this.disabledInactiveTrackColor = j13;
        this.activeTickColor = j14;
        this.inactiveTickColor = j15;
        this.disabledActiveTickColor = j16;
        this.disabledInactiveTickColor = j17;
    }
}
