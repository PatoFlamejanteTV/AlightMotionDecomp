package androidx.compose.animation;

import androidx.compose.runtime.internal.StabilityInferred;

/* loaded from: classes.dex */
public final class AndroidFlingSpline {
    public static final AndroidFlingSpline INSTANCE = new AndroidFlingSpline();
    private static final int NbSamples = 100;
    private static final float[] SplinePositions;
    private static final float[] SplineTimes;

    @StabilityInferred(parameters = 0)
    /* loaded from: classes.dex */
    public static final class FlingResult {
        public static final int $stable = 0;
        private final float distanceCoefficient;
        private final float velocityCoefficient;

        public FlingResult(float f8, float f9) {
            this.distanceCoefficient = f8;
            this.velocityCoefficient = f9;
        }

        public static /* synthetic */ FlingResult copy$default(FlingResult flingResult, float f8, float f9, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                f8 = flingResult.distanceCoefficient;
            }
            if ((i8 & 2) != 0) {
                f9 = flingResult.velocityCoefficient;
            }
            return flingResult.copy(f8, f9);
        }

        public final float component1() {
            return this.distanceCoefficient;
        }

        public final float component2() {
            return this.velocityCoefficient;
        }

        public final FlingResult copy(float f8, float f9) {
            return new FlingResult(f8, f9);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FlingResult)) {
                return false;
            }
            FlingResult flingResult = (FlingResult) obj;
            return Float.compare(this.distanceCoefficient, flingResult.distanceCoefficient) == 0 && Float.compare(this.velocityCoefficient, flingResult.velocityCoefficient) == 0;
        }

        public final float getDistanceCoefficient() {
            return this.distanceCoefficient;
        }

        public final float getVelocityCoefficient() {
            return this.velocityCoefficient;
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.distanceCoefficient) * 31) + Float.floatToIntBits(this.velocityCoefficient);
        }

        public String toString() {
            return "FlingResult(distanceCoefficient=" + this.distanceCoefficient + ", velocityCoefficient=" + this.velocityCoefficient + ')';
        }
    }

    static {
        float[] fArr = new float[101];
        SplinePositions = fArr;
        float[] fArr2 = new float[101];
        SplineTimes = fArr2;
        SplineBasedDecayKt.computeSplineInfo(fArr, fArr2, 100);
    }

    private AndroidFlingSpline() {
    }

    public final double deceleration(float f8, float f9) {
        return Math.log((Math.abs(f8) * 0.35f) / f9);
    }

    public final FlingResult flingPosition(float f8) {
        float f9;
        float f10;
        float f11 = 100;
        int i8 = (int) (f11 * f8);
        if (i8 < 100) {
            float f12 = i8 / f11;
            int i9 = i8 + 1;
            float f13 = i9 / f11;
            float[] fArr = SplinePositions;
            float f14 = fArr[i8];
            f10 = (fArr[i9] - f14) / (f13 - f12);
            f9 = f14 + ((f8 - f12) * f10);
        } else {
            f9 = 1.0f;
            f10 = 0.0f;
        }
        return new FlingResult(f9, f10);
    }
}
