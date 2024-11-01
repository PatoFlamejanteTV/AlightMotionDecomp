package androidx.compose.animation.core;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public interface FloatAnimationSpec extends AnimationSpec<Float> {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static float getEndVelocity(FloatAnimationSpec floatAnimationSpec, float f8, float f9, float f10) {
            float a9;
            a9 = c.a(floatAnimationSpec, f8, f9, f10);
            return a9;
        }

        @Deprecated
        public static <V extends AnimationVector> VectorizedFloatAnimationSpec<V> vectorize(FloatAnimationSpec floatAnimationSpec, TwoWayConverter<Float, V> converter) {
            VectorizedFloatAnimationSpec<V> c8;
            AbstractC3292y.i(converter, "converter");
            c8 = c.c(floatAnimationSpec, converter);
            return c8;
        }
    }

    long getDurationNanos(float f8, float f9, float f10);

    float getEndVelocity(float f8, float f9, float f10);

    float getValueFromNanos(long j8, float f8, float f9, float f10);

    float getVelocityFromNanos(long j8, float f8, float f9, float f10);

    @Override // androidx.compose.animation.core.AnimationSpec
    /* bridge */ /* synthetic */ VectorizedAnimationSpec vectorize(TwoWayConverter twoWayConverter);

    @Override // androidx.compose.animation.core.AnimationSpec
    <V extends AnimationVector> VectorizedFloatAnimationSpec<V> vectorize(TwoWayConverter<Float, V> twoWayConverter);
}
