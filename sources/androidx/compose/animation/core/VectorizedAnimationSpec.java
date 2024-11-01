package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public interface VectorizedAnimationSpec<V extends AnimationVector> {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static <V extends AnimationVector> V getEndVelocity(VectorizedAnimationSpec<V> vectorizedAnimationSpec, V initialValue, V targetValue, V initialVelocity) {
            AnimationVector a9;
            AbstractC3292y.i(initialValue, "initialValue");
            AbstractC3292y.i(targetValue, "targetValue");
            AbstractC3292y.i(initialVelocity, "initialVelocity");
            a9 = f.a(vectorizedAnimationSpec, initialValue, targetValue, initialVelocity);
            return (V) a9;
        }
    }

    long getDurationNanos(V v8, V v9, V v10);

    V getEndVelocity(V v8, V v9, V v10);

    V getValueFromNanos(long j8, V v8, V v9, V v10);

    V getVelocityFromNanos(long j8, V v8, V v9, V v10);

    boolean isInfinite();
}
