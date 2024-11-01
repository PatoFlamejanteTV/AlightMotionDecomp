package androidx.compose.animation;

import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;

/* loaded from: classes.dex */
public final class AndroidActualDefaultDecayAnimationSpec_androidKt {
    @Composable
    public static final DecayAnimationSpec<Float> defaultDecayAnimationSpec(Composer composer, int i8) {
        composer.startReplaceableGroup(-1468328074);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1468328074, i8, -1, "androidx.compose.animation.defaultDecayAnimationSpec (AndroidActualDefaultDecayAnimationSpec.android.kt:23)");
        }
        DecayAnimationSpec<Float> rememberSplineBasedDecay = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberSplineBasedDecay;
    }
}
