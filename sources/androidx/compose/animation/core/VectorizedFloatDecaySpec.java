package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
final class VectorizedFloatDecaySpec<V extends AnimationVector> implements VectorizedDecayAnimationSpec<V> {
    private final float absVelocityThreshold;
    private final FloatDecayAnimationSpec floatDecaySpec;
    private V targetVector;
    private V valueVector;
    private V velocityVector;

    public VectorizedFloatDecaySpec(FloatDecayAnimationSpec floatDecaySpec) {
        AbstractC3292y.i(floatDecaySpec, "floatDecaySpec");
        this.floatDecaySpec = floatDecaySpec;
        this.absVelocityThreshold = floatDecaySpec.getAbsVelocityThreshold();
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public float getAbsVelocityThreshold() {
        return this.absVelocityThreshold;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public long getDurationNanos(V initialValue, V initialVelocity) {
        AbstractC3292y.i(initialValue, "initialValue");
        AbstractC3292y.i(initialVelocity, "initialVelocity");
        if (this.velocityVector == null) {
            this.velocityVector = (V) AnimationVectorsKt.newInstance(initialValue);
        }
        V v8 = this.velocityVector;
        if (v8 == null) {
            AbstractC3292y.y("velocityVector");
            v8 = null;
        }
        int size$animation_core_release = v8.getSize$animation_core_release();
        long j8 = 0;
        for (int i8 = 0; i8 < size$animation_core_release; i8++) {
            j8 = Math.max(j8, this.floatDecaySpec.getDurationNanos(initialValue.get$animation_core_release(i8), initialVelocity.get$animation_core_release(i8)));
        }
        return j8;
    }

    public final FloatDecayAnimationSpec getFloatDecaySpec() {
        return this.floatDecaySpec;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public V getTargetValue(V initialValue, V initialVelocity) {
        AbstractC3292y.i(initialValue, "initialValue");
        AbstractC3292y.i(initialVelocity, "initialVelocity");
        if (this.targetVector == null) {
            this.targetVector = (V) AnimationVectorsKt.newInstance(initialValue);
        }
        V v8 = this.targetVector;
        if (v8 == null) {
            AbstractC3292y.y("targetVector");
            v8 = null;
        }
        int size$animation_core_release = v8.getSize$animation_core_release();
        for (int i8 = 0; i8 < size$animation_core_release; i8++) {
            V v9 = this.targetVector;
            if (v9 == null) {
                AbstractC3292y.y("targetVector");
                v9 = null;
            }
            v9.set$animation_core_release(i8, this.floatDecaySpec.getTargetValue(initialValue.get$animation_core_release(i8), initialVelocity.get$animation_core_release(i8)));
        }
        V v10 = this.targetVector;
        if (v10 == null) {
            AbstractC3292y.y("targetVector");
            return null;
        }
        return v10;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public V getValueFromNanos(long j8, V initialValue, V initialVelocity) {
        AbstractC3292y.i(initialValue, "initialValue");
        AbstractC3292y.i(initialVelocity, "initialVelocity");
        if (this.valueVector == null) {
            this.valueVector = (V) AnimationVectorsKt.newInstance(initialValue);
        }
        V v8 = this.valueVector;
        if (v8 == null) {
            AbstractC3292y.y("valueVector");
            v8 = null;
        }
        int size$animation_core_release = v8.getSize$animation_core_release();
        for (int i8 = 0; i8 < size$animation_core_release; i8++) {
            V v9 = this.valueVector;
            if (v9 == null) {
                AbstractC3292y.y("valueVector");
                v9 = null;
            }
            v9.set$animation_core_release(i8, this.floatDecaySpec.getValueFromNanos(j8, initialValue.get$animation_core_release(i8), initialVelocity.get$animation_core_release(i8)));
        }
        V v10 = this.valueVector;
        if (v10 == null) {
            AbstractC3292y.y("valueVector");
            return null;
        }
        return v10;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public V getVelocityFromNanos(long j8, V initialValue, V initialVelocity) {
        AbstractC3292y.i(initialValue, "initialValue");
        AbstractC3292y.i(initialVelocity, "initialVelocity");
        if (this.velocityVector == null) {
            this.velocityVector = (V) AnimationVectorsKt.newInstance(initialValue);
        }
        V v8 = this.velocityVector;
        if (v8 == null) {
            AbstractC3292y.y("velocityVector");
            v8 = null;
        }
        int size$animation_core_release = v8.getSize$animation_core_release();
        for (int i8 = 0; i8 < size$animation_core_release; i8++) {
            V v9 = this.velocityVector;
            if (v9 == null) {
                AbstractC3292y.y("velocityVector");
                v9 = null;
            }
            v9.set$animation_core_release(i8, this.floatDecaySpec.getVelocityFromNanos(j8, initialValue.get$animation_core_release(i8), initialVelocity.get$animation_core_release(i8)));
        }
        V v10 = this.velocityVector;
        if (v10 == null) {
            AbstractC3292y.y("velocityVector");
            return null;
        }
        return v10;
    }
}
