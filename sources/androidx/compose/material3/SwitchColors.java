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
public final class SwitchColors {
    private final long checkedBorderColor;
    private final long checkedIconColor;
    private final long checkedThumbColor;
    private final long checkedTrackColor;
    private final long disabledCheckedBorderColor;
    private final long disabledCheckedIconColor;
    private final long disabledCheckedThumbColor;
    private final long disabledCheckedTrackColor;
    private final long disabledUncheckedBorderColor;
    private final long disabledUncheckedIconColor;
    private final long disabledUncheckedThumbColor;
    private final long disabledUncheckedTrackColor;
    private final long uncheckedBorderColor;
    private final long uncheckedIconColor;
    private final long uncheckedThumbColor;
    private final long uncheckedTrackColor;

    public /* synthetic */ SwitchColors(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, AbstractC3284p abstractC3284p) {
        this(j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23);
    }

    @Composable
    public final State<Color> borderColor$material3_release(boolean z8, boolean z9, Composer composer, int i8) {
        long j8;
        composer.startReplaceableGroup(462653665);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(462653665, i8, -1, "androidx.compose.material3.SwitchColors.borderColor (Switch.kt:402)");
        }
        if (z8) {
            if (z9) {
                j8 = this.checkedBorderColor;
            } else {
                j8 = this.uncheckedBorderColor;
            }
        } else if (z9) {
            j8 = this.disabledCheckedBorderColor;
        } else {
            j8 = this.disabledUncheckedBorderColor;
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
        if (obj == null || !(obj instanceof SwitchColors)) {
            return false;
        }
        SwitchColors switchColors = (SwitchColors) obj;
        if (Color.m2949equalsimpl0(this.checkedThumbColor, switchColors.checkedThumbColor) && Color.m2949equalsimpl0(this.checkedTrackColor, switchColors.checkedTrackColor) && Color.m2949equalsimpl0(this.checkedBorderColor, switchColors.checkedBorderColor) && Color.m2949equalsimpl0(this.checkedIconColor, switchColors.checkedIconColor) && Color.m2949equalsimpl0(this.uncheckedThumbColor, switchColors.uncheckedThumbColor) && Color.m2949equalsimpl0(this.uncheckedTrackColor, switchColors.uncheckedTrackColor) && Color.m2949equalsimpl0(this.uncheckedBorderColor, switchColors.uncheckedBorderColor) && Color.m2949equalsimpl0(this.uncheckedIconColor, switchColors.uncheckedIconColor) && Color.m2949equalsimpl0(this.disabledCheckedThumbColor, switchColors.disabledCheckedThumbColor) && Color.m2949equalsimpl0(this.disabledCheckedTrackColor, switchColors.disabledCheckedTrackColor) && Color.m2949equalsimpl0(this.disabledCheckedBorderColor, switchColors.disabledCheckedBorderColor) && Color.m2949equalsimpl0(this.disabledCheckedIconColor, switchColors.disabledCheckedIconColor) && Color.m2949equalsimpl0(this.disabledUncheckedThumbColor, switchColors.disabledUncheckedThumbColor) && Color.m2949equalsimpl0(this.disabledUncheckedTrackColor, switchColors.disabledUncheckedTrackColor) && Color.m2949equalsimpl0(this.disabledUncheckedBorderColor, switchColors.disabledUncheckedBorderColor) && Color.m2949equalsimpl0(this.disabledUncheckedIconColor, switchColors.disabledUncheckedIconColor)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((Color.m2955hashCodeimpl(this.checkedThumbColor) * 31) + Color.m2955hashCodeimpl(this.checkedTrackColor)) * 31) + Color.m2955hashCodeimpl(this.checkedBorderColor)) * 31) + Color.m2955hashCodeimpl(this.checkedIconColor)) * 31) + Color.m2955hashCodeimpl(this.uncheckedThumbColor)) * 31) + Color.m2955hashCodeimpl(this.uncheckedTrackColor)) * 31) + Color.m2955hashCodeimpl(this.uncheckedBorderColor)) * 31) + Color.m2955hashCodeimpl(this.uncheckedIconColor)) * 31) + Color.m2955hashCodeimpl(this.disabledCheckedThumbColor)) * 31) + Color.m2955hashCodeimpl(this.disabledCheckedTrackColor)) * 31) + Color.m2955hashCodeimpl(this.disabledCheckedBorderColor)) * 31) + Color.m2955hashCodeimpl(this.disabledCheckedIconColor)) * 31) + Color.m2955hashCodeimpl(this.disabledUncheckedThumbColor)) * 31) + Color.m2955hashCodeimpl(this.disabledUncheckedTrackColor)) * 31) + Color.m2955hashCodeimpl(this.disabledUncheckedBorderColor)) * 31) + Color.m2955hashCodeimpl(this.disabledUncheckedIconColor);
    }

    @Composable
    public final State<Color> iconColor$material3_release(boolean z8, boolean z9, Composer composer, int i8) {
        long j8;
        composer.startReplaceableGroup(-153383122);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-153383122, i8, -1, "androidx.compose.material3.SwitchColors.iconColor (Switch.kt:419)");
        }
        if (z8) {
            if (z9) {
                j8 = this.checkedIconColor;
            } else {
                j8 = this.uncheckedIconColor;
            }
        } else if (z9) {
            j8 = this.disabledCheckedIconColor;
        } else {
            j8 = this.disabledUncheckedIconColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2938boximpl(j8), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Composable
    public final State<Color> thumbColor$material3_release(boolean z8, boolean z9, Composer composer, int i8) {
        long j8;
        composer.startReplaceableGroup(-1539933265);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1539933265, i8, -1, "androidx.compose.material3.SwitchColors.thumbColor (Switch.kt:368)");
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

    @Composable
    public final State<Color> trackColor$material3_release(boolean z8, boolean z9, Composer composer, int i8) {
        long j8;
        composer.startReplaceableGroup(961511844);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(961511844, i8, -1, "androidx.compose.material3.SwitchColors.trackColor (Switch.kt:385)");
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

    private SwitchColors(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23) {
        this.checkedThumbColor = j8;
        this.checkedTrackColor = j9;
        this.checkedBorderColor = j10;
        this.checkedIconColor = j11;
        this.uncheckedThumbColor = j12;
        this.uncheckedTrackColor = j13;
        this.uncheckedBorderColor = j14;
        this.uncheckedIconColor = j15;
        this.disabledCheckedThumbColor = j16;
        this.disabledCheckedTrackColor = j17;
        this.disabledCheckedBorderColor = j18;
        this.disabledCheckedIconColor = j19;
        this.disabledUncheckedThumbColor = j20;
        this.disabledUncheckedTrackColor = j21;
        this.disabledUncheckedBorderColor = j22;
        this.disabledUncheckedIconColor = j23;
    }
}
