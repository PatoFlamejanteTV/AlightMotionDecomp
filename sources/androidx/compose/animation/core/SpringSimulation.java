package androidx.compose.animation.core;

/* loaded from: classes.dex */
public final class SpringSimulation {
    private double dampedFreq;
    private float finalPosition;
    private double gammaMinus;
    private double gammaPlus;
    private boolean initialized;
    private double naturalFreq = Math.sqrt(50.0d);
    private float dampingRatio = 1.0f;

    public SpringSimulation(float f8) {
        this.finalPosition = f8;
    }

    private final void init() {
        if (this.initialized) {
            return;
        }
        if (this.finalPosition != SpringSimulationKt.getUNSET()) {
            float f8 = this.dampingRatio;
            double d8 = f8 * f8;
            if (f8 > 1.0f) {
                double d9 = this.naturalFreq;
                double d10 = d8 - 1;
                this.gammaPlus = ((-f8) * d9) + (d9 * Math.sqrt(d10));
                double d11 = -this.dampingRatio;
                double d12 = this.naturalFreq;
                this.gammaMinus = (d11 * d12) - (d12 * Math.sqrt(d10));
            } else if (f8 >= 0.0f && f8 < 1.0f) {
                this.dampedFreq = this.naturalFreq * Math.sqrt(1 - d8);
            }
            this.initialized = true;
            return;
        }
        throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
    }

    public final float getAcceleration(float f8, float f9) {
        float f10 = f8 - this.finalPosition;
        double d8 = this.naturalFreq;
        return (float) (((-(d8 * d8)) * f10) - (((d8 * 2.0d) * this.dampingRatio) * f9));
    }

    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    public final float getFinalPosition() {
        return this.finalPosition;
    }

    public final float getStiffness() {
        double d8 = this.naturalFreq;
        return (float) (d8 * d8);
    }

    public final void setDampingRatio(float f8) {
        if (f8 >= 0.0f) {
            this.dampingRatio = f8;
            this.initialized = false;
            return;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    public final void setFinalPosition(float f8) {
        this.finalPosition = f8;
    }

    public final void setStiffness(float f8) {
        if (getStiffness() > 0.0f) {
            this.naturalFreq = Math.sqrt(f8);
            this.initialized = false;
            return;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    /* renamed from: updateValues-IJZedt4$animation_core_release, reason: not valid java name */
    public final long m205updateValuesIJZedt4$animation_core_release(float f8, float f9, long j8) {
        double cos;
        double d8;
        init();
        float f10 = f8 - this.finalPosition;
        double d9 = j8 / 1000.0d;
        float f11 = this.dampingRatio;
        if (f11 > 1.0f) {
            double d10 = f10;
            double d11 = this.gammaMinus;
            double d12 = f9;
            double d13 = this.gammaPlus;
            double d14 = d10 - (((d11 * d10) - d12) / (d11 - d13));
            double d15 = ((d10 * d11) - d12) / (d11 - d13);
            d8 = (Math.exp(d11 * d9) * d14) + (Math.exp(this.gammaPlus * d9) * d15);
            double d16 = this.gammaMinus;
            double exp = d14 * d16 * Math.exp(d16 * d9);
            double d17 = this.gammaPlus;
            cos = exp + (d15 * d17 * Math.exp(d17 * d9));
        } else if (f11 == 1.0f) {
            double d18 = this.naturalFreq;
            double d19 = f10;
            double d20 = f9 + (d18 * d19);
            double d21 = d19 + (d20 * d9);
            double exp2 = Math.exp((-d18) * d9) * d21;
            double exp3 = d21 * Math.exp((-this.naturalFreq) * d9);
            double d22 = this.naturalFreq;
            cos = (exp3 * (-d22)) + (d20 * Math.exp((-d22) * d9));
            d8 = exp2;
        } else {
            double d23 = 1 / this.dampedFreq;
            double d24 = this.naturalFreq;
            double d25 = f10;
            double d26 = d23 * ((f11 * d24 * d25) + f9);
            double exp4 = Math.exp((-f11) * d24 * d9) * ((Math.cos(this.dampedFreq * d9) * d25) + (Math.sin(this.dampedFreq * d9) * d26));
            double d27 = this.naturalFreq;
            double d28 = (-d27) * exp4 * this.dampingRatio;
            double exp5 = Math.exp((-r5) * d27 * d9);
            double d29 = this.dampedFreq;
            double sin = (-d29) * d25 * Math.sin(d29 * d9);
            double d30 = this.dampedFreq;
            cos = d28 + (exp5 * (sin + (d26 * d30 * Math.cos(d30 * d9))));
            d8 = exp4;
        }
        return SpringSimulationKt.Motion((float) (d8 + this.finalPosition), (float) cos);
    }
}
