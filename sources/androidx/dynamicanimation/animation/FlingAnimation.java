package androidx.dynamicanimation.animation;

import androidx.annotation.FloatRange;
import androidx.dynamicanimation.animation.DynamicAnimation;

/* loaded from: classes3.dex */
public final class FlingAnimation extends DynamicAnimation<FlingAnimation> {
    private final DragForce mFlingForce;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class DragForce implements Force {
        private static final float DEFAULT_FRICTION = -4.2f;
        private static final float VELOCITY_THRESHOLD_MULTIPLIER = 62.5f;
        private float mFriction = DEFAULT_FRICTION;
        private final DynamicAnimation.MassState mMassState = new DynamicAnimation.MassState();
        private float mVelocityThreshold;

        DragForce() {
        }

        @Override // androidx.dynamicanimation.animation.Force
        public float getAcceleration(float f8, float f9) {
            return f9 * this.mFriction;
        }

        float getFrictionScalar() {
            return this.mFriction / DEFAULT_FRICTION;
        }

        @Override // androidx.dynamicanimation.animation.Force
        public boolean isAtEquilibrium(float f8, float f9) {
            if (Math.abs(f9) < this.mVelocityThreshold) {
                return true;
            }
            return false;
        }

        void setFrictionScalar(float f8) {
            this.mFriction = f8 * DEFAULT_FRICTION;
        }

        void setValueThreshold(float f8) {
            this.mVelocityThreshold = f8 * VELOCITY_THRESHOLD_MULTIPLIER;
        }

        DynamicAnimation.MassState updateValueAndVelocity(float f8, float f9, long j8) {
            float f10 = (float) j8;
            this.mMassState.mVelocity = (float) (f9 * Math.exp((f10 / 1000.0f) * this.mFriction));
            DynamicAnimation.MassState massState = this.mMassState;
            float f11 = this.mFriction;
            massState.mValue = (float) ((f8 - (f9 / f11)) + ((f9 / f11) * Math.exp((f11 * f10) / 1000.0f)));
            DynamicAnimation.MassState massState2 = this.mMassState;
            if (isAtEquilibrium(massState2.mValue, massState2.mVelocity)) {
                this.mMassState.mVelocity = 0.0f;
            }
            return this.mMassState;
        }
    }

    public FlingAnimation(FloatValueHolder floatValueHolder) {
        super(floatValueHolder);
        DragForce dragForce = new DragForce();
        this.mFlingForce = dragForce;
        dragForce.setValueThreshold(getValueThreshold());
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    float getAcceleration(float f8, float f9) {
        return this.mFlingForce.getAcceleration(f8, f9);
    }

    public float getFriction() {
        return this.mFlingForce.getFrictionScalar();
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    boolean isAtEquilibrium(float f8, float f9) {
        if (f8 < this.mMaxValue && f8 > this.mMinValue && !this.mFlingForce.isAtEquilibrium(f8, f9)) {
            return false;
        }
        return true;
    }

    public FlingAnimation setFriction(@FloatRange(from = 0.0d, fromInclusive = false) float f8) {
        if (f8 > 0.0f) {
            this.mFlingForce.setFrictionScalar(f8);
            return this;
        }
        throw new IllegalArgumentException("Friction must be positive");
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    void setValueThreshold(float f8) {
        this.mFlingForce.setValueThreshold(f8);
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    boolean updateValueAndVelocity(long j8) {
        DynamicAnimation.MassState updateValueAndVelocity = this.mFlingForce.updateValueAndVelocity(this.mValue, this.mVelocity, j8);
        float f8 = updateValueAndVelocity.mValue;
        this.mValue = f8;
        float f9 = updateValueAndVelocity.mVelocity;
        this.mVelocity = f9;
        float f10 = this.mMinValue;
        if (f8 < f10) {
            this.mValue = f10;
            return true;
        }
        float f11 = this.mMaxValue;
        if (f8 > f11) {
            this.mValue = f11;
            return true;
        }
        if (isAtEquilibrium(f8, f9)) {
            return true;
        }
        return false;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public FlingAnimation setMaxValue(float f8) {
        super.setMaxValue(f8);
        return this;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public FlingAnimation setMinValue(float f8) {
        super.setMinValue(f8);
        return this;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public FlingAnimation setStartVelocity(float f8) {
        super.setStartVelocity(f8);
        return this;
    }

    public <K> FlingAnimation(K k8, FloatPropertyCompat<K> floatPropertyCompat) {
        super(k8, floatPropertyCompat);
        DragForce dragForce = new DragForce();
        this.mFlingForce = dragForce;
        dragForce.setValueThreshold(getValueThreshold());
    }
}
