package androidx.compose.animation.core;

import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class AnimatableKt {
    public static final Animatable<Float, AnimationVector1D> Animatable(float f8, float f9) {
        return new Animatable<>(Float.valueOf(f8), VectorConvertersKt.getVectorConverter(r.f34602a), Float.valueOf(f9), null, 8, null);
    }

    public static /* synthetic */ Animatable Animatable$default(float f8, float f9, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            f9 = 0.01f;
        }
        return Animatable(f8, f9);
    }
}
