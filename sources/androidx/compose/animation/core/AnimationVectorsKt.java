package androidx.compose.animation.core;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class AnimationVectorsKt {
    public static final AnimationVector1D AnimationVector(float f8) {
        return new AnimationVector1D(f8);
    }

    public static final <T extends AnimationVector> T copy(T t8) {
        AbstractC3292y.i(t8, "<this>");
        T t9 = (T) newInstance(t8);
        int size$animation_core_release = t9.getSize$animation_core_release();
        for (int i8 = 0; i8 < size$animation_core_release; i8++) {
            t9.set$animation_core_release(i8, t8.get$animation_core_release(i8));
        }
        return t9;
    }

    public static final <T extends AnimationVector> void copyFrom(T t8, T source) {
        AbstractC3292y.i(t8, "<this>");
        AbstractC3292y.i(source, "source");
        int size$animation_core_release = t8.getSize$animation_core_release();
        for (int i8 = 0; i8 < size$animation_core_release; i8++) {
            t8.set$animation_core_release(i8, source.get$animation_core_release(i8));
        }
    }

    public static final <T extends AnimationVector> T newInstance(T t8) {
        AbstractC3292y.i(t8, "<this>");
        T t9 = (T) t8.newVector$animation_core_release();
        AbstractC3292y.g(t9, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
        return t9;
    }

    public static final AnimationVector2D AnimationVector(float f8, float f9) {
        return new AnimationVector2D(f8, f9);
    }

    public static final AnimationVector3D AnimationVector(float f8, float f9, float f10) {
        return new AnimationVector3D(f8, f9, f10);
    }

    public static final AnimationVector4D AnimationVector(float f8, float f9, float f10, float f11) {
        return new AnimationVector4D(f8, f9, f10, f11);
    }
}
