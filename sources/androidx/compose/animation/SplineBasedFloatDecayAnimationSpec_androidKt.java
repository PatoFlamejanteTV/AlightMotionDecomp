package androidx.compose.animation;

import android.view.ViewConfiguration;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class SplineBasedFloatDecayAnimationSpec_androidKt {
    private static final float platformFlingScrollFriction = ViewConfiguration.getScrollFriction();

    public static final float getPlatformFlingScrollFriction() {
        return platformFlingScrollFriction;
    }

    @Composable
    public static final <T> DecayAnimationSpec<T> rememberSplineBasedDecay(Composer composer, int i8) {
        composer.startReplaceableGroup(904445851);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(904445851, i8, -1, "androidx.compose.animation.rememberSplineBasedDecay (SplineBasedFloatDecayAnimationSpec.android.kt:40)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        Float valueOf = Float.valueOf(density.getDensity());
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(valueOf);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = DecayAnimationSpecKt.generateDecayAnimationSpec(new SplineBasedFloatDecayAnimationSpec(density));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        DecayAnimationSpec<T> decayAnimationSpec = (DecayAnimationSpec) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return decayAnimationSpec;
    }

    public static final /* synthetic */ DecayAnimationSpec splineBasedDecay(Density density) {
        AbstractC3292y.i(density, "density");
        return SplineBasedDecayKt.splineBasedDecay(density);
    }
}
