package androidx.compose.foundation.layout;

import androidx.compose.animation.core.FloatDecayAnimationSpec;
import androidx.compose.foundation.layout.AndroidFlingSpline;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SplineBasedFloatDecayAnimationSpec implements FloatDecayAnimationSpec {
    private final float magicPhysicalCoefficient;

    public SplineBasedFloatDecayAnimationSpec(Density density) {
        AbstractC3292y.i(density, "density");
        this.magicPhysicalCoefficient = density.getDensity() * 386.0878f * 160.0f * 0.84f;
    }

    private final double getSplineDeceleration(float f8) {
        float f9;
        AndroidFlingSpline androidFlingSpline = AndroidFlingSpline.INSTANCE;
        f9 = WindowInsetsConnection_androidKt.PlatformFlingScrollFriction;
        return androidFlingSpline.deceleration(f8, f9 * this.magicPhysicalCoefficient);
    }

    public final float flingDistance(float f8) {
        float f9;
        double d8;
        double d9;
        double splineDeceleration = getSplineDeceleration(f8);
        f9 = WindowInsetsConnection_androidKt.PlatformFlingScrollFriction;
        double d10 = f9 * this.magicPhysicalCoefficient;
        d8 = WindowInsetsConnection_androidKt.DecelerationRate;
        d9 = WindowInsetsConnection_androidKt.DecelMinusOne;
        return ((float) (d10 * Math.exp((d8 / d9) * splineDeceleration))) * Math.signum(f8);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getAbsVelocityThreshold() {
        return 0.0f;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public long getDurationNanos(float f8, float f9) {
        double d8;
        double splineDeceleration = getSplineDeceleration(f9);
        d8 = WindowInsetsConnection_androidKt.DecelMinusOne;
        return (long) (Math.exp(splineDeceleration / d8) * 1.0E9d);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getTargetValue(float f8, float f9) {
        return f8 + flingDistance(f9);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getValueFromNanos(long j8, float f8, float f9) {
        float f10;
        long durationNanos = getDurationNanos(0.0f, f9);
        if (durationNanos > 0) {
            f10 = ((float) j8) / ((float) durationNanos);
        } else {
            f10 = 1.0f;
        }
        return f8 + (flingDistance(f9) * AndroidFlingSpline.FlingResult.m486getDistanceCoefficientimpl(AndroidFlingSpline.INSTANCE.m481flingPositionLfoxSSI(f10)));
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getVelocityFromNanos(long j8, float f8, float f9) {
        float f10;
        long durationNanos = getDurationNanos(0.0f, f9);
        if (durationNanos > 0) {
            f10 = ((float) j8) / ((float) durationNanos);
        } else {
            f10 = 1.0f;
        }
        return ((AndroidFlingSpline.FlingResult.m487getVelocityCoefficientimpl(AndroidFlingSpline.INSTANCE.m481flingPositionLfoxSSI(f10)) * flingDistance(f9)) / ((float) durationNanos)) * 1.0E9f;
    }
}
