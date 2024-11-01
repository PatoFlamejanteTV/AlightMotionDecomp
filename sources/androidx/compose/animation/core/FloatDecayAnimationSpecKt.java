package androidx.compose.animation.core;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class FloatDecayAnimationSpecKt {
    private static final float ExponentialDecayFriction = -4.2f;

    public static final Animation<Float, AnimationVector1D> createAnimation(FloatDecayAnimationSpec floatDecayAnimationSpec, float f8, float f9) {
        AbstractC3292y.i(floatDecayAnimationSpec, "<this>");
        return AnimationKt.DecayAnimation(floatDecayAnimationSpec, f8, f9);
    }

    public static /* synthetic */ Animation createAnimation$default(FloatDecayAnimationSpec floatDecayAnimationSpec, float f8, float f9, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            f9 = 0.0f;
        }
        return createAnimation(floatDecayAnimationSpec, f8, f9);
    }
}
