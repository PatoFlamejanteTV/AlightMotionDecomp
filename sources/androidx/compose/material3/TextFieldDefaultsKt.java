package androidx.compose.material3;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.unit.Dp;

/* loaded from: classes.dex */
public final class TextFieldDefaultsKt {
    /* renamed from: access$animateBorderStrokeAsState-NuRrP5Q */
    public static final /* synthetic */ State m1839access$animateBorderStrokeAsStateNuRrP5Q(boolean z8, boolean z9, InteractionSource interactionSource, TextFieldColors textFieldColors, float f8, float f9, Composer composer, int i8) {
        return m1840animateBorderStrokeAsStateNuRrP5Q(z8, z9, interactionSource, textFieldColors, f8, f9, composer, i8);
    }

    @Composable
    /* renamed from: animateBorderStrokeAsState-NuRrP5Q */
    public static final State<BorderStroke> m1840animateBorderStrokeAsStateNuRrP5Q(boolean z8, boolean z9, InteractionSource interactionSource, TextFieldColors textFieldColors, float f8, float f9, Composer composer, int i8) {
        float f10;
        State rememberUpdatedState;
        composer.startReplaceableGroup(-1633063017);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1633063017, i8, -1, "androidx.compose.material3.animateBorderStrokeAsState (TextFieldDefaults.kt:943)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i8 >> 6) & 14);
        State<Color> indicatorColor$material3_release = textFieldColors.indicatorColor$material3_release(z8, z9, interactionSource, composer, i8 & 8190);
        if (m1841animateBorderStrokeAsState_NuRrP5Q$lambda0(collectIsFocusedAsState)) {
            f10 = f8;
        } else {
            f10 = f9;
        }
        if (z8) {
            composer.startReplaceableGroup(-1927801001);
            rememberUpdatedState = AnimateAsStateKt.m177animateDpAsStateKz89ssw(f10, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, composer, 48, 4);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-1927800903);
            rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Dp.m5153boximpl(f9), composer, (i8 >> 15) & 14);
            composer.endReplaceableGroup();
        }
        State<BorderStroke> rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(new BorderStroke(((Dp) rememberUpdatedState.getValue()).m5169unboximpl(), new SolidColor(indicatorColor$material3_release.getValue().m2958unboximpl(), null), null), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState2;
    }

    /* renamed from: animateBorderStrokeAsState_NuRrP5Q$lambda-0 */
    private static final boolean m1841animateBorderStrokeAsState_NuRrP5Q$lambda0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
