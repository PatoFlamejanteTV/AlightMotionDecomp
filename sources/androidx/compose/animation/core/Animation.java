package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;

/* loaded from: classes.dex */
public interface Animation<T, V extends AnimationVector> {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static <T, V extends AnimationVector> boolean isFinishedFromNanos(Animation<T, V> animation, long j8) {
            boolean a9;
            a9 = a.a(animation, j8);
            return a9;
        }
    }

    long getDurationNanos();

    T getTargetValue();

    TwoWayConverter<T, V> getTypeConverter();

    T getValueFromNanos(long j8);

    V getVelocityVectorFromNanos(long j8);

    boolean isFinishedFromNanos(long j8);

    boolean isInfinite();
}
