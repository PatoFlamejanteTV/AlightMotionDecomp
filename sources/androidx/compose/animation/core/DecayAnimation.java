package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import i6.m;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class DecayAnimation<T, V extends AnimationVector> implements Animation<T, V> {
    public static final int $stable = 0;
    private final VectorizedDecayAnimationSpec<V> animationSpec;
    private final long durationNanos;
    private final V endVelocity;
    private final T initialValue;
    private final V initialValueVector;
    private final V initialVelocityVector;
    private final boolean isInfinite;
    private final T targetValue;
    private final TwoWayConverter<T, V> typeConverter;

    public DecayAnimation(VectorizedDecayAnimationSpec<V> animationSpec, TwoWayConverter<T, V> typeConverter, T t8, V initialVelocityVector) {
        AbstractC3292y.i(animationSpec, "animationSpec");
        AbstractC3292y.i(typeConverter, "typeConverter");
        AbstractC3292y.i(initialVelocityVector, "initialVelocityVector");
        this.animationSpec = animationSpec;
        this.typeConverter = typeConverter;
        this.initialValue = t8;
        V v8 = (V) getTypeConverter().getConvertToVector().invoke(t8);
        this.initialValueVector = v8;
        this.initialVelocityVector = (V) AnimationVectorsKt.copy(initialVelocityVector);
        this.targetValue = (T) getTypeConverter().getConvertFromVector().invoke(animationSpec.getTargetValue(v8, initialVelocityVector));
        this.durationNanos = animationSpec.getDurationNanos(v8, initialVelocityVector);
        V v9 = (V) AnimationVectorsKt.copy(animationSpec.getVelocityFromNanos(getDurationNanos(), v8, initialVelocityVector));
        this.endVelocity = v9;
        int size$animation_core_release = v9.getSize$animation_core_release();
        for (int i8 = 0; i8 < size$animation_core_release; i8++) {
            V v10 = this.endVelocity;
            v10.set$animation_core_release(i8, m.j(v10.get$animation_core_release(i8), -this.animationSpec.getAbsVelocityThreshold(), this.animationSpec.getAbsVelocityThreshold()));
        }
    }

    @Override // androidx.compose.animation.core.Animation
    public long getDurationNanos() {
        return this.durationNanos;
    }

    public final T getInitialValue() {
        return this.initialValue;
    }

    public final V getInitialVelocityVector() {
        return this.initialVelocityVector;
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
            return (T) getTypeConverter().getConvertFromVector().invoke(this.animationSpec.getValueFromNanos(j8, this.initialValueVector, this.initialVelocityVector));
        }
        return getTargetValue();
    }

    @Override // androidx.compose.animation.core.Animation
    public V getVelocityVectorFromNanos(long j8) {
        if (!isFinishedFromNanos(j8)) {
            return this.animationSpec.getVelocityFromNanos(j8, this.initialValueVector, this.initialVelocityVector);
        }
        return this.endVelocity;
    }

    @Override // androidx.compose.animation.core.Animation
    public /* synthetic */ boolean isFinishedFromNanos(long j8) {
        return a.a(this, j8);
    }

    @Override // androidx.compose.animation.core.Animation
    public boolean isInfinite() {
        return this.isInfinite;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DecayAnimation(DecayAnimationSpec<T> animationSpec, TwoWayConverter<T, V> typeConverter, T t8, V initialVelocityVector) {
        this(animationSpec.vectorize(typeConverter), typeConverter, t8, initialVelocityVector);
        AbstractC3292y.i(animationSpec, "animationSpec");
        AbstractC3292y.i(typeConverter, "typeConverter");
        AbstractC3292y.i(initialVelocityVector, "initialVelocityVector");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DecayAnimation(DecayAnimationSpec<T> animationSpec, TwoWayConverter<T, V> typeConverter, T t8, T t9) {
        this(animationSpec.vectorize(typeConverter), typeConverter, t8, (AnimationVector) typeConverter.getConvertToVector().invoke(t9));
        AbstractC3292y.i(animationSpec, "animationSpec");
        AbstractC3292y.i(typeConverter, "typeConverter");
    }
}
