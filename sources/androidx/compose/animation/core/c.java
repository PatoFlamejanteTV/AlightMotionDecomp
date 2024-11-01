package androidx.compose.animation.core;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static float a(FloatAnimationSpec floatAnimationSpec, float f8, float f9, float f10) {
        return floatAnimationSpec.getVelocityFromNanos(floatAnimationSpec.getDurationNanos(f8, f9, f10), f8, f9, f10);
    }

    public static VectorizedFloatAnimationSpec c(FloatAnimationSpec floatAnimationSpec, TwoWayConverter converter) {
        AbstractC3292y.i(converter, "converter");
        return new VectorizedFloatAnimationSpec(floatAnimationSpec);
    }
}
