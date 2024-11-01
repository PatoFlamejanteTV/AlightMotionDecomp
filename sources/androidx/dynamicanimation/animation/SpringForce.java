package androidx.dynamicanimation.animation;

import androidx.annotation.FloatRange;
import androidx.annotation.RestrictTo;
import androidx.dynamicanimation.animation.DynamicAnimation;

/* loaded from: classes3.dex */
public final class SpringForce implements Force {
    public static final float DAMPING_RATIO_HIGH_BOUNCY = 0.2f;
    public static final float DAMPING_RATIO_LOW_BOUNCY = 0.75f;
    public static final float DAMPING_RATIO_MEDIUM_BOUNCY = 0.5f;
    public static final float DAMPING_RATIO_NO_BOUNCY = 1.0f;
    public static final float STIFFNESS_HIGH = 10000.0f;
    public static final float STIFFNESS_LOW = 200.0f;
    public static final float STIFFNESS_MEDIUM = 1500.0f;
    public static final float STIFFNESS_VERY_LOW = 50.0f;
    private static final double UNSET = Double.MAX_VALUE;
    private static final double VELOCITY_THRESHOLD_MULTIPLIER = 62.5d;
    private double mDampedFreq;
    double mDampingRatio;
    private double mFinalPosition;
    private double mGammaMinus;
    private double mGammaPlus;
    private boolean mInitialized;
    private final DynamicAnimation.MassState mMassState;
    double mNaturalFreq;
    private double mValueThreshold;
    private double mVelocityThreshold;

    public SpringForce() {
        this.mNaturalFreq = Math.sqrt(1500.0d);
        this.mDampingRatio = 0.5d;
        this.mInitialized = false;
        this.mFinalPosition = UNSET;
        this.mMassState = new DynamicAnimation.MassState();
    }

    private void init() {
        if (this.mInitialized) {
            return;
        }
        if (this.mFinalPosition != UNSET) {
            double d8 = this.mDampingRatio;
            if (d8 > 1.0d) {
                double d9 = this.mNaturalFreq;
                this.mGammaPlus = ((-d8) * d9) + (d9 * Math.sqrt((d8 * d8) - 1.0d));
                double d10 = this.mDampingRatio;
                double d11 = this.mNaturalFreq;
                this.mGammaMinus = ((-d10) * d11) - (d11 * Math.sqrt((d10 * d10) - 1.0d));
            } else if (d8 >= 0.0d && d8 < 1.0d) {
                this.mDampedFreq = this.mNaturalFreq * Math.sqrt(1.0d - (d8 * d8));
            }
            this.mInitialized = true;
            return;
        }
        throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
    }

    @Override // androidx.dynamicanimation.animation.Force
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public float getAcceleration(float f8, float f9) {
        float finalPosition = f8 - getFinalPosition();
        double d8 = this.mNaturalFreq;
        return (float) (((-(d8 * d8)) * finalPosition) - (((d8 * 2.0d) * this.mDampingRatio) * f9));
    }

    public float getDampingRatio() {
        return (float) this.mDampingRatio;
    }

    public float getFinalPosition() {
        return (float) this.mFinalPosition;
    }

    public float getStiffness() {
        double d8 = this.mNaturalFreq;
        return (float) (d8 * d8);
    }

    @Override // androidx.dynamicanimation.animation.Force
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean isAtEquilibrium(float f8, float f9) {
        if (Math.abs(f9) < this.mVelocityThreshold && Math.abs(f8 - getFinalPosition()) < this.mValueThreshold) {
            return true;
        }
        return false;
    }

    public SpringForce setDampingRatio(@FloatRange(from = 0.0d) float f8) {
        if (f8 >= 0.0f) {
            this.mDampingRatio = f8;
            this.mInitialized = false;
            return this;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    public SpringForce setFinalPosition(float f8) {
        this.mFinalPosition = f8;
        return this;
    }

    public SpringForce setStiffness(@FloatRange(from = 0.0d, fromInclusive = false) float f8) {
        if (f8 > 0.0f) {
            this.mNaturalFreq = Math.sqrt(f8);
            this.mInitialized = false;
            return this;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setValueThreshold(double d8) {
        double abs = Math.abs(d8);
        this.mValueThreshold = abs;
        this.mVelocityThreshold = abs * VELOCITY_THRESHOLD_MULTIPLIER;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DynamicAnimation.MassState updateValues(double d8, double d9, long j8) {
        double cos;
        double d10;
        init();
        double d11 = j8 / 1000.0d;
        double d12 = d8 - this.mFinalPosition;
        double d13 = this.mDampingRatio;
        if (d13 > 1.0d) {
            double d14 = this.mGammaMinus;
            double d15 = this.mGammaPlus;
            double d16 = d12 - (((d14 * d12) - d9) / (d14 - d15));
            double d17 = ((d12 * d14) - d9) / (d14 - d15);
            d10 = (Math.pow(2.718281828459045d, d14 * d11) * d16) + (Math.pow(2.718281828459045d, this.mGammaPlus * d11) * d17);
            double d18 = this.mGammaMinus;
            double pow = d16 * d18 * Math.pow(2.718281828459045d, d18 * d11);
            double d19 = this.mGammaPlus;
            cos = pow + (d17 * d19 * Math.pow(2.718281828459045d, d19 * d11));
        } else if (d13 == 1.0d) {
            double d20 = this.mNaturalFreq;
            double d21 = d9 + (d20 * d12);
            double d22 = d12 + (d21 * d11);
            d10 = Math.pow(2.718281828459045d, (-d20) * d11) * d22;
            double pow2 = d22 * Math.pow(2.718281828459045d, (-this.mNaturalFreq) * d11);
            double d23 = this.mNaturalFreq;
            cos = (d21 * Math.pow(2.718281828459045d, (-d23) * d11)) + (pow2 * (-d23));
        } else {
            double d24 = 1.0d / this.mDampedFreq;
            double d25 = this.mNaturalFreq;
            double d26 = d24 * ((d13 * d25 * d12) + d9);
            double pow3 = Math.pow(2.718281828459045d, (-d13) * d25 * d11) * ((Math.cos(this.mDampedFreq * d11) * d12) + (Math.sin(this.mDampedFreq * d11) * d26));
            double d27 = this.mNaturalFreq;
            double d28 = this.mDampingRatio;
            double d29 = (-d27) * pow3 * d28;
            double pow4 = Math.pow(2.718281828459045d, (-d28) * d27 * d11);
            double d30 = this.mDampedFreq;
            double sin = (-d30) * d12 * Math.sin(d30 * d11);
            double d31 = this.mDampedFreq;
            cos = d29 + (pow4 * (sin + (d26 * d31 * Math.cos(d31 * d11))));
            d10 = pow3;
        }
        DynamicAnimation.MassState massState = this.mMassState;
        massState.mValue = (float) (d10 + this.mFinalPosition);
        massState.mVelocity = (float) cos;
        return massState;
    }

    public SpringForce(float f8) {
        this.mNaturalFreq = Math.sqrt(1500.0d);
        this.mDampingRatio = 0.5d;
        this.mInitialized = false;
        this.mFinalPosition = UNSET;
        this.mMassState = new DynamicAnimation.MassState();
        this.mFinalPosition = f8;
    }
}
