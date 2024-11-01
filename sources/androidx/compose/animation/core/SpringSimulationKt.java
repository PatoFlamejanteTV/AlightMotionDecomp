package androidx.compose.animation.core;

/* loaded from: classes.dex */
public final class SpringSimulationKt {
    private static final float UNSET = Float.MAX_VALUE;
    private static final double VelocityThresholdMultiplier = 62.5d;

    public static final long Motion(float f8, float f9) {
        return Motion.m194constructorimpl((Float.floatToIntBits(f9) & 4294967295L) | (Float.floatToIntBits(f8) << 32));
    }

    public static final float getUNSET() {
        return UNSET;
    }
}
