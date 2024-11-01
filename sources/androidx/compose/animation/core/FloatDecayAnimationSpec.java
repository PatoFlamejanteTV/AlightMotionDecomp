package androidx.compose.animation.core;

/* loaded from: classes.dex */
public interface FloatDecayAnimationSpec {
    float getAbsVelocityThreshold();

    long getDurationNanos(float f8, float f9);

    float getTargetValue(float f8, float f9);

    float getValueFromNanos(long j8, float f8, float f9);

    float getVelocityFromNanos(long j8, float f8, float f9);
}
