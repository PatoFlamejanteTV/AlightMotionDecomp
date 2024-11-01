package androidx.compose.material;

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

/* JADX INFO: Access modifiers changed from: package-private */
@Immutable
/* loaded from: classes.dex */
public final class DefaultRadioButtonColors implements RadioButtonColors {
    private final long disabledColor;
    private final long selectedColor;
    private final long unselectedColor;

    public /* synthetic */ DefaultRadioButtonColors(long j8, long j9, long j10, AbstractC3284p abstractC3284p) {
        this(j8, j9, j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DefaultRadioButtonColors.class != obj.getClass()) {
            return false;
        }
        DefaultRadioButtonColors defaultRadioButtonColors = (DefaultRadioButtonColors) obj;
        if (Color.m2949equalsimpl0(this.selectedColor, defaultRadioButtonColors.selectedColor) && Color.m2949equalsimpl0(this.unselectedColor, defaultRadioButtonColors.unselectedColor) && Color.m2949equalsimpl0(this.disabledColor, defaultRadioButtonColors.disabledColor)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((Color.m2955hashCodeimpl(this.selectedColor) * 31) + Color.m2955hashCodeimpl(this.unselectedColor)) * 31) + Color.m2955hashCodeimpl(this.disabledColor);
    }

    @Override // androidx.compose.material.RadioButtonColors
    @Composable
    public State<Color> radioColor(boolean z8, boolean z9, Composer composer, int i8) {
        long j8;
        State<Color> rememberUpdatedState;
        composer.startReplaceableGroup(1243421834);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1243421834, i8, -1, "androidx.compose.material.DefaultRadioButtonColors.radioColor (RadioButton.kt:187)");
        }
        if (!z8) {
            j8 = this.disabledColor;
        } else if (!z9) {
            j8 = this.unselectedColor;
        } else {
            j8 = this.selectedColor;
        }
        long j9 = j8;
        if (z8) {
            composer.startReplaceableGroup(-1052799107);
            rememberUpdatedState = SingleValueAnimationKt.m164animateColorAsStateeuL9pac(j9, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer, 48, 12);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-1052799002);
            rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2938boximpl(j9), composer, 0);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    private DefaultRadioButtonColors(long j8, long j9, long j10) {
        this.selectedColor = j8;
        this.unselectedColor = j9;
        this.disabledColor = j10;
    }
}
