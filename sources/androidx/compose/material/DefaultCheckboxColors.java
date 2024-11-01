package androidx.compose.material;

import Q5.p;
import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.state.ToggleableState;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
@Stable
/* loaded from: classes.dex */
public final class DefaultCheckboxColors implements CheckboxColors {
    private final long checkedBorderColor;
    private final long checkedBoxColor;
    private final long checkedCheckmarkColor;
    private final long disabledBorderColor;
    private final long disabledCheckedBoxColor;
    private final long disabledIndeterminateBorderColor;
    private final long disabledIndeterminateBoxColor;
    private final long disabledUncheckedBoxColor;
    private final long uncheckedBorderColor;
    private final long uncheckedBoxColor;
    private final long uncheckedCheckmarkColor;

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[ToggleableState.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleableState.Indeterminate.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToggleableState.Off.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ DefaultCheckboxColors(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, AbstractC3284p abstractC3284p) {
        this(j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18);
    }

    @Override // androidx.compose.material.CheckboxColors
    @Composable
    public State<Color> borderColor(boolean z8, ToggleableState state, Composer composer, int i8) {
        long j8;
        State<Color> rememberUpdatedState;
        int i9;
        AbstractC3292y.i(state, "state");
        composer.startReplaceableGroup(-1568341342);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1568341342, i8, -1, "androidx.compose.material.DefaultCheckboxColors.borderColor (Checkbox.kt:451)");
        }
        if (z8) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i10 != 1 && i10 != 2) {
                if (i10 == 3) {
                    j8 = this.uncheckedBorderColor;
                } else {
                    throw new p();
                }
            } else {
                j8 = this.checkedBorderColor;
            }
        } else {
            int i11 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new p();
                    }
                } else {
                    j8 = this.disabledIndeterminateBorderColor;
                }
            }
            j8 = this.disabledBorderColor;
        }
        long j9 = j8;
        if (z8) {
            composer.startReplaceableGroup(-796405227);
            if (state == ToggleableState.Off) {
                i9 = 100;
            } else {
                i9 = 50;
            }
            rememberUpdatedState = SingleValueAnimationKt.m164animateColorAsStateeuL9pac(j9, AnimationSpecKt.tween$default(i9, 0, null, 6, null), null, null, composer, 0, 12);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-796405041);
            rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2938boximpl(j9), composer, 0);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.CheckboxColors
    @Composable
    public State<Color> boxColor(boolean z8, ToggleableState state, Composer composer, int i8) {
        long j8;
        State<Color> rememberUpdatedState;
        int i9;
        AbstractC3292y.i(state, "state");
        composer.startReplaceableGroup(840901029);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(840901029, i8, -1, "androidx.compose.material.DefaultCheckboxColors.boxColor (Checkbox.kt:426)");
        }
        if (z8) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i10 != 1 && i10 != 2) {
                if (i10 == 3) {
                    j8 = this.uncheckedBoxColor;
                } else {
                    throw new p();
                }
            } else {
                j8 = this.checkedBoxColor;
            }
        } else {
            int i11 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        j8 = this.disabledUncheckedBoxColor;
                    } else {
                        throw new p();
                    }
                } else {
                    j8 = this.disabledIndeterminateBoxColor;
                }
            } else {
                j8 = this.disabledCheckedBoxColor;
            }
        }
        long j9 = j8;
        if (z8) {
            composer.startReplaceableGroup(-2010643468);
            if (state == ToggleableState.Off) {
                i9 = 100;
            } else {
                i9 = 50;
            }
            rememberUpdatedState = SingleValueAnimationKt.m164animateColorAsStateeuL9pac(j9, AnimationSpecKt.tween$default(i9, 0, null, 6, null), null, null, composer, 0, 12);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-2010643282);
            rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2938boximpl(j9), composer, 0);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.CheckboxColors
    @Composable
    public State<Color> checkmarkColor(ToggleableState state, Composer composer, int i8) {
        long j8;
        int i9;
        AbstractC3292y.i(state, "state");
        composer.startReplaceableGroup(544656267);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(544656267, i8, -1, "androidx.compose.material.DefaultCheckboxColors.checkmarkColor (Checkbox.kt:414)");
        }
        ToggleableState toggleableState = ToggleableState.Off;
        if (state == toggleableState) {
            j8 = this.uncheckedCheckmarkColor;
        } else {
            j8 = this.checkedCheckmarkColor;
        }
        long j9 = j8;
        if (state == toggleableState) {
            i9 = 100;
        } else {
            i9 = 50;
        }
        State<Color> m164animateColorAsStateeuL9pac = SingleValueAnimationKt.m164animateColorAsStateeuL9pac(j9, AnimationSpecKt.tween$default(i9, 0, null, 6, null), null, null, composer, 0, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m164animateColorAsStateeuL9pac;
    }

    private DefaultCheckboxColors(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18) {
        this.checkedCheckmarkColor = j8;
        this.uncheckedCheckmarkColor = j9;
        this.checkedBoxColor = j10;
        this.uncheckedBoxColor = j11;
        this.disabledCheckedBoxColor = j12;
        this.disabledUncheckedBoxColor = j13;
        this.disabledIndeterminateBoxColor = j14;
        this.checkedBorderColor = j15;
        this.uncheckedBorderColor = j16;
        this.disabledBorderColor = j17;
        this.disabledIndeterminateBorderColor = j18;
    }
}
