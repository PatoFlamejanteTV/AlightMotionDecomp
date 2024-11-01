package androidx.compose.animation;

import androidx.compose.animation.core.FloatDecayAnimationSpec;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class SplineBasedFloatDecayAnimationSpec implements FloatDecayAnimationSpec {
    public static final int $stable = 0;
    private final FlingCalculator flingCalculator;

    public SplineBasedFloatDecayAnimationSpec(Density density) {
        AbstractC3292y.i(density, "density");
        this.flingCalculator = new FlingCalculator(SplineBasedFloatDecayAnimationSpec_androidKt.getPlatformFlingScrollFriction(), density);
    }

    private final float flingDistance(float f8) {
        return this.flingCalculator.flingDistance(f8) * Math.signum(f8);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getAbsVelocityThreshold() {
        return 0.0f;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public long getDurationNanos(float f8, float f9) {
        return this.flingCalculator.flingDuration(f9) * 1000000;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getTargetValue(float f8, float f9) {
        return f8 + flingDistance(f9);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getValueFromNanos(long j8, float f8, float f9) {
        return f8 + this.flingCalculator.flingInfo(f9).position(j8 / 1000000);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getVelocityFromNanos(long j8, float f8, float f9) {
        return this.flingCalculator.flingInfo(f9).velocity(j8 / 1000000);
    }
}
