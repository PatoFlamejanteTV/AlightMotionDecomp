package androidx.compose.animation.core;

import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class DecayAnimationSpecKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, V extends AnimationVector> T calculateTargetValue(DecayAnimationSpec<T> decayAnimationSpec, TwoWayConverter<T, V> typeConverter, T t8, T t9) {
        AbstractC3292y.i(decayAnimationSpec, "<this>");
        AbstractC3292y.i(typeConverter, "typeConverter");
        return (T) typeConverter.getConvertFromVector().invoke(decayAnimationSpec.vectorize(typeConverter).getTargetValue((AnimationVector) typeConverter.getConvertToVector().invoke(t8), (AnimationVector) typeConverter.getConvertToVector().invoke(t9)));
    }

    public static final <T> DecayAnimationSpec<T> exponentialDecay(float f8, float f9) {
        return generateDecayAnimationSpec(new FloatExponentialDecaySpec(f8, f9));
    }

    public static /* synthetic */ DecayAnimationSpec exponentialDecay$default(float f8, float f9, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = 1.0f;
        }
        if ((i8 & 2) != 0) {
            f9 = 0.1f;
        }
        return exponentialDecay(f8, f9);
    }

    public static final <T> DecayAnimationSpec<T> generateDecayAnimationSpec(FloatDecayAnimationSpec floatDecayAnimationSpec) {
        AbstractC3292y.i(floatDecayAnimationSpec, "<this>");
        return new DecayAnimationSpecImpl(floatDecayAnimationSpec);
    }

    public static final float calculateTargetValue(DecayAnimationSpec<Float> decayAnimationSpec, float f8, float f9) {
        AbstractC3292y.i(decayAnimationSpec, "<this>");
        return ((AnimationVector1D) decayAnimationSpec.vectorize(VectorConvertersKt.getVectorConverter(r.f34602a)).getTargetValue(AnimationVectorsKt.AnimationVector(f8), AnimationVectorsKt.AnimationVector(f9))).getValue();
    }
}
