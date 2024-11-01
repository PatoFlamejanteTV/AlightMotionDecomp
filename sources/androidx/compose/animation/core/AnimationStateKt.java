package androidx.compose.animation.core;

import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class AnimationStateKt {
    public static final AnimationState<Float, AnimationVector1D> AnimationState(float f8, float f9, long j8, long j9, boolean z8) {
        return new AnimationState<>(VectorConvertersKt.getVectorConverter(r.f34602a), Float.valueOf(f8), AnimationVectorsKt.AnimationVector(f9), j8, j9, z8);
    }

    public static /* synthetic */ AnimationState AnimationState$default(float f8, float f9, long j8, long j9, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            f9 = 0.0f;
        }
        return AnimationState(f8, f9, (i8 & 4) != 0 ? Long.MIN_VALUE : j8, (i8 & 8) == 0 ? j9 : Long.MIN_VALUE, (i8 & 16) != 0 ? false : z8);
    }

    public static final <T, V extends AnimationVector> AnimationState<T, V> copy(AnimationState<T, V> animationState, T t8, V v8, long j8, long j9, boolean z8) {
        AbstractC3292y.i(animationState, "<this>");
        return new AnimationState<>(animationState.getTypeConverter(), t8, v8, j8, j9, z8);
    }

    public static /* synthetic */ AnimationState copy$default(AnimationState animationState, Object obj, AnimationVector animationVector, long j8, long j9, boolean z8, int i8, Object obj2) {
        if ((i8 & 1) != 0) {
            obj = animationState.getValue();
        }
        if ((i8 & 2) != 0) {
            animationVector = AnimationVectorsKt.copy(animationState.getVelocityVector());
        }
        AnimationVector animationVector2 = animationVector;
        if ((i8 & 4) != 0) {
            j8 = animationState.getLastFrameTimeNanos();
        }
        long j10 = j8;
        if ((i8 & 8) != 0) {
            j9 = animationState.getFinishedTimeNanos();
        }
        long j11 = j9;
        if ((i8 & 16) != 0) {
            z8 = animationState.isRunning();
        }
        return copy((AnimationState<Object, AnimationVector>) animationState, obj, animationVector2, j10, j11, z8);
    }

    public static final <T, V extends AnimationVector> V createZeroVectorFrom(TwoWayConverter<T, V> twoWayConverter, T t8) {
        AbstractC3292y.i(twoWayConverter, "<this>");
        return (V) AnimationVectorsKt.newInstance((AnimationVector) twoWayConverter.getConvertToVector().invoke(t8));
    }

    public static final boolean isFinished(AnimationState<?, ?> animationState) {
        AbstractC3292y.i(animationState, "<this>");
        if (animationState.getFinishedTimeNanos() != Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public static final AnimationState<Float, AnimationVector1D> copy(AnimationState<Float, AnimationVector1D> animationState, float f8, float f9, long j8, long j9, boolean z8) {
        AbstractC3292y.i(animationState, "<this>");
        return new AnimationState<>(animationState.getTypeConverter(), Float.valueOf(f8), AnimationVectorsKt.AnimationVector(f9), j8, j9, z8);
    }

    public static final <T, V extends AnimationVector> AnimationState<T, V> AnimationState(TwoWayConverter<T, V> typeConverter, T t8, T t9, long j8, long j9, boolean z8) {
        AbstractC3292y.i(typeConverter, "typeConverter");
        return new AnimationState<>(typeConverter, t8, (AnimationVector) typeConverter.getConvertToVector().invoke(t9), j8, j9, z8);
    }

    public static /* synthetic */ AnimationState copy$default(AnimationState animationState, float f8, float f9, long j8, long j9, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = ((Number) animationState.getValue()).floatValue();
        }
        if ((i8 & 2) != 0) {
            f9 = ((AnimationVector1D) animationState.getVelocityVector()).getValue();
        }
        float f10 = f9;
        if ((i8 & 4) != 0) {
            j8 = animationState.getLastFrameTimeNanos();
        }
        long j10 = j8;
        if ((i8 & 8) != 0) {
            j9 = animationState.getFinishedTimeNanos();
        }
        long j11 = j9;
        if ((i8 & 16) != 0) {
            z8 = animationState.isRunning();
        }
        return copy((AnimationState<Float, AnimationVector1D>) animationState, f8, f10, j10, j11, z8);
    }
}
