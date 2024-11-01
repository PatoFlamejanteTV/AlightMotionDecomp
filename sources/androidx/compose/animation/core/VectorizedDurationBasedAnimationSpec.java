package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public interface VectorizedDurationBasedAnimationSpec<V extends AnimationVector> extends VectorizedFiniteAnimationSpec<V> {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static <V extends AnimationVector> long getDurationNanos(VectorizedDurationBasedAnimationSpec<V> vectorizedDurationBasedAnimationSpec, V initialValue, V targetValue, V initialVelocity) {
            long a9;
            AbstractC3292y.i(initialValue, "initialValue");
            AbstractC3292y.i(targetValue, "targetValue");
            AbstractC3292y.i(initialVelocity, "initialVelocity");
            a9 = g.a(vectorizedDurationBasedAnimationSpec, initialValue, targetValue, initialVelocity);
            return a9;
        }

        @Deprecated
        public static <V extends AnimationVector> V getEndVelocity(VectorizedDurationBasedAnimationSpec<V> vectorizedDurationBasedAnimationSpec, V initialValue, V targetValue, V initialVelocity) {
            AnimationVector a9;
            AbstractC3292y.i(initialValue, "initialValue");
            AbstractC3292y.i(targetValue, "targetValue");
            AbstractC3292y.i(initialVelocity, "initialVelocity");
            a9 = f.a(vectorizedDurationBasedAnimationSpec, initialValue, targetValue, initialVelocity);
            return (V) a9;
        }

        @Deprecated
        public static <V extends AnimationVector> boolean isInfinite(VectorizedDurationBasedAnimationSpec<V> vectorizedDurationBasedAnimationSpec) {
            boolean a9;
            a9 = h.a(vectorizedDurationBasedAnimationSpec);
            return a9;
        }
    }

    int getDelayMillis();

    int getDurationMillis();

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    long getDurationNanos(V v8, V v9, V v10);
}
