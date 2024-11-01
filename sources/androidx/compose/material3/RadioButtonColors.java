package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
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
public final class RadioButtonColors {
    private final long disabledSelectedColor;
    private final long disabledUnselectedColor;
    private final long selectedColor;
    private final long unselectedColor;

    public /* synthetic */ RadioButtonColors(long j8, long j9, long j10, long j11, AbstractC3284p abstractC3284p) {
        this(j8, j9, j10, j11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof RadioButtonColors)) {
            return false;
        }
        RadioButtonColors radioButtonColors = (RadioButtonColors) obj;
        if (Color.m2949equalsimpl0(this.selectedColor, radioButtonColors.selectedColor) && Color.m2949equalsimpl0(this.unselectedColor, radioButtonColors.unselectedColor) && Color.m2949equalsimpl0(this.disabledSelectedColor, radioButtonColors.disabledSelectedColor) && Color.m2949equalsimpl0(this.disabledUnselectedColor, radioButtonColors.disabledUnselectedColor)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((Color.m2955hashCodeimpl(this.selectedColor) * 31) + Color.m2955hashCodeimpl(this.unselectedColor)) * 31) + Color.m2955hashCodeimpl(this.disabledSelectedColor)) * 31) + Color.m2955hashCodeimpl(this.disabledUnselectedColor);
    }

    @Composable
    public final State<Color> radioColor$material3_release(boolean z8, boolean z9, Composer composer, int i8) {
        long j8;
        State<Color> rememberUpdatedState;
        composer.startReplaceableGroup(-1840145292);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1840145292, i8, -1, "androidx.compose.material3.RadioButtonColors.radioColor (RadioButton.kt:182)");
        }
        if (z8 && z9) {
            j8 = this.selectedColor;
        } else if (z8 && !z9) {
            j8 = this.unselectedColor;
        } else if (!z8 && z9) {
            j8 = this.disabledSelectedColor;
        } else {
            j8 = this.disabledUnselectedColor;
        }
        long j9 = j8;
        if (z8) {
            composer.startReplaceableGroup(-1943770140);
            rememberUpdatedState = SingleValueAnimationKt.m163animateColorAsStateKTwxG1Y(j9, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, composer, 48, 4);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-1943770035);
            rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2938boximpl(j9), composer, 0);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    private RadioButtonColors(long j8, long j9, long j10, long j11) {
        this.selectedColor = j8;
        this.unselectedColor = j9;
        this.disabledSelectedColor = j10;
        this.disabledUnselectedColor = j11;
    }
}
