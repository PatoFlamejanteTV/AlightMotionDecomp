package androidx.compose.animation.core;

import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class AnimationKt {
    public static final long MillisToNanos = 1000000;

    public static final DecayAnimation<Float, AnimationVector1D> DecayAnimation(FloatDecayAnimationSpec animationSpec, float f8, float f9) {
        AbstractC3292y.i(animationSpec, "animationSpec");
        return new DecayAnimation<>((DecayAnimationSpec<Float>) DecayAnimationSpecKt.generateDecayAnimationSpec(animationSpec), VectorConvertersKt.getVectorConverter(r.f34602a), Float.valueOf(f8), AnimationVectorsKt.AnimationVector(f9));
    }

    public static /* synthetic */ DecayAnimation DecayAnimation$default(FloatDecayAnimationSpec floatDecayAnimationSpec, float f8, float f9, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            f9 = 0.0f;
        }
        return DecayAnimation(floatDecayAnimationSpec, f8, f9);
    }

    public static final <T, V extends AnimationVector> TargetBasedAnimation<T, V> TargetBasedAnimation(AnimationSpec<T> animationSpec, TwoWayConverter<T, V> typeConverter, T t8, T t9, T t10) {
        AbstractC3292y.i(animationSpec, "animationSpec");
        AbstractC3292y.i(typeConverter, "typeConverter");
        return new TargetBasedAnimation<>(animationSpec, typeConverter, t8, t9, (AnimationVector) typeConverter.getConvertToVector().invoke(t10));
    }

    public static final <V extends AnimationVector> TargetBasedAnimation<V, V> createAnimation(VectorizedAnimationSpec<V> vectorizedAnimationSpec, V initialValue, V targetValue, V initialVelocity) {
        AbstractC3292y.i(vectorizedAnimationSpec, "<this>");
        AbstractC3292y.i(initialValue, "initialValue");
        AbstractC3292y.i(targetValue, "targetValue");
        AbstractC3292y.i(initialVelocity, "initialVelocity");
        return new TargetBasedAnimation<>(vectorizedAnimationSpec, (TwoWayConverter<V, V>) VectorConvertersKt.TwoWayConverter(AnimationKt$createAnimation$1.INSTANCE, AnimationKt$createAnimation$2.INSTANCE), initialValue, targetValue, initialVelocity);
    }

    public static final long getDurationMillis(Animation<?, ?> animation) {
        AbstractC3292y.i(animation, "<this>");
        return animation.getDurationNanos() / 1000000;
    }

    public static final <T, V extends AnimationVector> T getVelocityFromNanos(Animation<T, V> animation, long j8) {
        AbstractC3292y.i(animation, "<this>");
        return (T) animation.getTypeConverter().getConvertFromVector().invoke(animation.getVelocityVectorFromNanos(j8));
    }
}
