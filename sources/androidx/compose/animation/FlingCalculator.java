package androidx.compose.animation;

import androidx.collection.a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class FlingCalculator {
    private final Density density;
    private final float friction;
    private final float magicPhysicalCoefficient;

    @StabilityInferred(parameters = 0)
    /* loaded from: classes.dex */
    public static final class FlingInfo {
        public static final int $stable = 0;
        private final float distance;
        private final long duration;
        private final float initialVelocity;

        public FlingInfo(float f8, float f9, long j8) {
            this.initialVelocity = f8;
            this.distance = f9;
            this.duration = j8;
        }

        public static /* synthetic */ FlingInfo copy$default(FlingInfo flingInfo, float f8, float f9, long j8, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                f8 = flingInfo.initialVelocity;
            }
            if ((i8 & 2) != 0) {
                f9 = flingInfo.distance;
            }
            if ((i8 & 4) != 0) {
                j8 = flingInfo.duration;
            }
            return flingInfo.copy(f8, f9, j8);
        }

        public final float component1() {
            return this.initialVelocity;
        }

        public final float component2() {
            return this.distance;
        }

        public final long component3() {
            return this.duration;
        }

        public final FlingInfo copy(float f8, float f9, long j8) {
            return new FlingInfo(f8, f9, j8);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FlingInfo)) {
                return false;
            }
            FlingInfo flingInfo = (FlingInfo) obj;
            return Float.compare(this.initialVelocity, flingInfo.initialVelocity) == 0 && Float.compare(this.distance, flingInfo.distance) == 0 && this.duration == flingInfo.duration;
        }

        public final float getDistance() {
            return this.distance;
        }

        public final long getDuration() {
            return this.duration;
        }

        public final float getInitialVelocity() {
            return this.initialVelocity;
        }

        public int hashCode() {
            return (((Float.floatToIntBits(this.initialVelocity) * 31) + Float.floatToIntBits(this.distance)) * 31) + a.a(this.duration);
        }

        public final float position(long j8) {
            float f8;
            long j9 = this.duration;
            if (j9 > 0) {
                f8 = ((float) j8) / ((float) j9);
            } else {
                f8 = 1.0f;
            }
            return this.distance * Math.signum(this.initialVelocity) * AndroidFlingSpline.INSTANCE.flingPosition(f8).getDistanceCoefficient();
        }

        public String toString() {
            return "FlingInfo(initialVelocity=" + this.initialVelocity + ", distance=" + this.distance + ", duration=" + this.duration + ')';
        }

        public final float velocity(long j8) {
            float f8;
            long j9 = this.duration;
            if (j9 > 0) {
                f8 = ((float) j8) / ((float) j9);
            } else {
                f8 = 1.0f;
            }
            return (((AndroidFlingSpline.INSTANCE.flingPosition(f8).getVelocityCoefficient() * Math.signum(this.initialVelocity)) * this.distance) / ((float) this.duration)) * 1000.0f;
        }
    }

    public FlingCalculator(float f8, Density density) {
        AbstractC3292y.i(density, "density");
        this.friction = f8;
        this.density = density;
        this.magicPhysicalCoefficient = computeDeceleration(density);
    }

    private final float computeDeceleration(Density density) {
        float computeDeceleration;
        computeDeceleration = FlingCalculatorKt.computeDeceleration(0.84f, density.getDensity());
        return computeDeceleration;
    }

    private final double getSplineDeceleration(float f8) {
        return AndroidFlingSpline.INSTANCE.deceleration(f8, this.friction * this.magicPhysicalCoefficient);
    }

    public final float flingDistance(float f8) {
        float f9;
        float f10;
        double splineDeceleration = getSplineDeceleration(f8);
        f9 = FlingCalculatorKt.DecelerationRate;
        double d8 = f9 - 1.0d;
        double d9 = this.friction * this.magicPhysicalCoefficient;
        f10 = FlingCalculatorKt.DecelerationRate;
        return (float) (d9 * Math.exp((f10 / d8) * splineDeceleration));
    }

    public final long flingDuration(float f8) {
        float f9;
        double splineDeceleration = getSplineDeceleration(f8);
        f9 = FlingCalculatorKt.DecelerationRate;
        return (long) (Math.exp(splineDeceleration / (f9 - 1.0d)) * 1000.0d);
    }

    public final FlingInfo flingInfo(float f8) {
        float f9;
        float f10;
        double splineDeceleration = getSplineDeceleration(f8);
        f9 = FlingCalculatorKt.DecelerationRate;
        double d8 = f9 - 1.0d;
        double d9 = this.friction * this.magicPhysicalCoefficient;
        f10 = FlingCalculatorKt.DecelerationRate;
        return new FlingInfo(f8, (float) (d9 * Math.exp((f10 / d8) * splineDeceleration)), (long) (Math.exp(splineDeceleration / d8) * 1000.0d));
    }

    public final Density getDensity() {
        return this.density;
    }
}
