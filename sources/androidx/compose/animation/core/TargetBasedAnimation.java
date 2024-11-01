package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class TargetBasedAnimation<T, V extends AnimationVector> implements Animation<T, V> {
    public static final int $stable = 0;
    private final VectorizedAnimationSpec<V> animationSpec;
    private final long durationNanos;
    private final V endVelocity;
    private final T initialValue;
    private final V initialValueVector;
    private final V initialVelocityVector;
    private final T targetValue;
    private final V targetValueVector;
    private final TwoWayConverter<T, V> typeConverter;

    public TargetBasedAnimation(VectorizedAnimationSpec<V> animationSpec, TwoWayConverter<T, V> typeConverter, T t8, T t9, V v8) {
        AbstractC3292y.i(animationSpec, "animationSpec");
        AbstractC3292y.i(typeConverter, "typeConverter");
        this.animationSpec = animationSpec;
        this.typeConverter = typeConverter;
        this.initialValue = t8;
        this.targetValue = t9;
        V v9 = (V) getTypeConverter().getConvertToVector().invoke(t8);
        this.initialValueVector = v9;
        V v10 = (V) getTypeConverter().getConvertToVector().invoke(getTargetValue());
        this.targetValueVector = v10;
        V v11 = (v8 == null || (v11 = (V) AnimationVectorsKt.copy(v8)) == null) ? (V) AnimationVectorsKt.newInstance((AnimationVector) getTypeConverter().getConvertToVector().invoke(t8)) : v11;
        this.initialVelocityVector = v11;
        this.durationNanos = animationSpec.getDurationNanos(v9, v10, v11);
        this.endVelocity = animationSpec.getEndVelocity(v9, v10, v11);
    }

    public final VectorizedAnimationSpec<V> getAnimationSpec$animation_core_release() {
        return this.animationSpec;
    }

    @Override // androidx.compose.animation.core.Animation
    public long getDurationNanos() {
        return this.durationNanos;
    }

    public final T getInitialValue() {
        return this.initialValue;
    }

    @Override // androidx.compose.animation.core.Animation
    public T getTargetValue() {
        return this.targetValue;
    }

    @Override // androidx.compose.animation.core.Animation
    public TwoWayConverter<T, V> getTypeConverter() {
        return this.typeConverter;
    }

    @Override // androidx.compose.animation.core.Animation
    public T getValueFromNanos(long j8) {
        if (!isFinishedFromNanos(j8)) {
            V valueFromNanos = this.animationSpec.getValueFromNanos(j8, this.initialValueVector, this.targetValueVector, this.initialVelocityVector);
            int size$animation_core_release = valueFromNanos.getSize$animation_core_release();
            for (int i8 = 0; i8 < size$animation_core_release; i8++) {
                if (!(!Float.isNaN(valueFromNanos.get$animation_core_release(i8)))) {
                    throw new IllegalStateException(("AnimationVector cannot contain a NaN. " + valueFromNanos + ". Animation: " + this + ", playTimeNanos: " + j8).toString());
                }
            }
            return (T) getTypeConverter().getConvertFromVector().invoke(valueFromNanos);
        }
        return getTargetValue();
    }

    @Override // androidx.compose.animation.core.Animation
    public V getVelocityVectorFromNanos(long j8) {
        if (!isFinishedFromNanos(j8)) {
            return this.animationSpec.getVelocityFromNanos(j8, this.initialValueVector, this.targetValueVector, this.initialVelocityVector);
        }
        return this.endVelocity;
    }

    @Override // androidx.compose.animation.core.Animation
    public /* synthetic */ boolean isFinishedFromNanos(long j8) {
        return a.a(this, j8);
    }

    @Override // androidx.compose.animation.core.Animation
    public boolean isInfinite() {
        return this.animationSpec.isInfinite();
    }

    public String toString() {
        return "TargetBasedAnimation: " + this.initialValue + " -> " + getTargetValue() + ",initial velocity: " + this.initialVelocityVector + ", duration: " + AnimationKt.getDurationMillis(this) + " ms,animationSpec: " + this.animationSpec;
    }

    public /* synthetic */ TargetBasedAnimation(VectorizedAnimationSpec vectorizedAnimationSpec, TwoWayConverter twoWayConverter, Object obj, Object obj2, AnimationVector animationVector, int i8, AbstractC3284p abstractC3284p) {
        this((VectorizedAnimationSpec<AnimationVector>) vectorizedAnimationSpec, (TwoWayConverter<Object, AnimationVector>) twoWayConverter, obj, obj2, (i8 & 16) != 0 ? null : animationVector);
    }

    public /* synthetic */ TargetBasedAnimation(AnimationSpec animationSpec, TwoWayConverter twoWayConverter, Object obj, Object obj2, AnimationVector animationVector, int i8, AbstractC3284p abstractC3284p) {
        this((AnimationSpec<Object>) animationSpec, (TwoWayConverter<Object, AnimationVector>) twoWayConverter, obj, obj2, (i8 & 16) != 0 ? null : animationVector);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TargetBasedAnimation(AnimationSpec<T> animationSpec, TwoWayConverter<T, V> typeConverter, T t8, T t9, V v8) {
        this(animationSpec.vectorize(typeConverter), typeConverter, t8, t9, v8);
        AbstractC3292y.i(animationSpec, "animationSpec");
        AbstractC3292y.i(typeConverter, "typeConverter");
    }
}
