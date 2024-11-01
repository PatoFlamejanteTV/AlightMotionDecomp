package androidx.compose.material;

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
    public static final /* synthetic */ State m1379access$animateBorderStrokeAsStateNuRrP5Q(boolean z8, boolean z9, InteractionSource interactionSource, TextFieldColors textFieldColors, float f8, float f9, Composer composer, int i8) {
        return m1380animateBorderStrokeAsStateNuRrP5Q(z8, z9, interactionSource, textFieldColors, f8, f9, composer, i8);
    }

    @Composable
    /* renamed from: animateBorderStrokeAsState-NuRrP5Q */
    public static final State<BorderStroke> m1380animateBorderStrokeAsStateNuRrP5Q(boolean z8, boolean z9, InteractionSource interactionSource, TextFieldColors textFieldColors, float f8, float f9, Composer composer, int i8) {
        float f10;
        State<Dp> rememberUpdatedState;
        composer.startReplaceableGroup(1097899920);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1097899920, i8, -1, "androidx.compose.material.animateBorderStrokeAsState (TextFieldDefaults.kt:835)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i8 >> 6) & 14);
        State<Color> indicatorColor = textFieldColors.indicatorColor(z8, z9, interactionSource, composer, i8 & 8190);
        if (animateBorderStrokeAsState_NuRrP5Q$lambda$0(collectIsFocusedAsState)) {
            f10 = f8;
        } else {
            f10 = f9;
        }
        if (z8) {
            composer.startReplaceableGroup(1685712066);
            rememberUpdatedState = AnimateAsStateKt.m176animateDpAsStateAjpBEmI(f10, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, composer, 48, 12);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(1685712164);
            rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Dp.m5153boximpl(f9), composer, (i8 >> 15) & 14);
            composer.endReplaceableGroup();
        }
        State<BorderStroke> rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(new BorderStroke(rememberUpdatedState.getValue().m5169unboximpl(), new SolidColor(indicatorColor.getValue().m2958unboximpl(), null), null), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState2;
    }

    private static final boolean animateBorderStrokeAsState_NuRrP5Q$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
