package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;

/* loaded from: classes.dex */
public interface VectorizedDecayAnimationSpec<V extends AnimationVector> {
    float getAbsVelocityThreshold();

    long getDurationNanos(V v8, V v9);

    V getTargetValue(V v8, V v9);

    V getValueFromNanos(long j8, V v8, V v9);

    V getVelocityFromNanos(long j8, V v8, V v9);
}
