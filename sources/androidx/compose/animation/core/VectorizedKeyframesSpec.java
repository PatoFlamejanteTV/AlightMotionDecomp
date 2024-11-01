package androidx.compose.animation.core;

import Q5.r;
import R5.Q;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class VectorizedKeyframesSpec<V extends AnimationVector> implements VectorizedDurationBasedAnimationSpec<V> {
    public static final int $stable = 8;
    private final int delayMillis;
    private final int durationMillis;
    private final Map<Integer, r> keyframes;
    private V valueVector;
    private V velocityVector;

    /* JADX WARN: Multi-variable type inference failed */
    public VectorizedKeyframesSpec(Map<Integer, ? extends r> keyframes, int i8, int i9) {
        AbstractC3292y.i(keyframes, "keyframes");
        this.keyframes = keyframes;
        this.durationMillis = i8;
        this.delayMillis = i9;
    }

    private final void init(V v8) {
        if (this.valueVector == null) {
            this.valueVector = (V) AnimationVectorsKt.newInstance(v8);
            this.velocityVector = (V) AnimationVectorsKt.newInstance(v8);
        }
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public int getDelayMillis() {
        return this.delayMillis;
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public int getDurationMillis() {
        return this.durationMillis;
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec, androidx.compose.animation.core.VectorizedAnimationSpec
    public /* synthetic */ long getDurationNanos(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return g.a(this, animationVector, animationVector2, animationVector3);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public /* synthetic */ AnimationVector getEndVelocity(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return f.a(this, animationVector, animationVector2, animationVector3);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getValueFromNanos(long j8, V initialValue, V targetValue, V initialVelocity) {
        long clampPlayTime;
        AbstractC3292y.i(initialValue, "initialValue");
        AbstractC3292y.i(targetValue, "targetValue");
        AbstractC3292y.i(initialVelocity, "initialVelocity");
        clampPlayTime = VectorizedAnimationSpecKt.clampPlayTime(this, j8 / 1000000);
        int i8 = (int) clampPlayTime;
        if (this.keyframes.containsKey(Integer.valueOf(i8))) {
            return (V) ((r) Q.i(this.keyframes, Integer.valueOf(i8))).c();
        }
        if (i8 >= getDurationMillis()) {
            return targetValue;
        }
        if (i8 <= 0) {
            return initialValue;
        }
        int durationMillis = getDurationMillis();
        Easing linearEasing = EasingKt.getLinearEasing();
        int i9 = 0;
        AnimationVector animationVector = initialValue;
        int i10 = 0;
        for (Map.Entry<Integer, r> entry : this.keyframes.entrySet()) {
            int intValue = entry.getKey().intValue();
            r value = entry.getValue();
            if (i8 > intValue && intValue >= i10) {
                animationVector = (AnimationVector) value.c();
                linearEasing = (Easing) value.d();
                i10 = intValue;
            } else if (i8 < intValue && intValue <= durationMillis) {
                targetValue = (V) value.c();
                durationMillis = intValue;
            }
        }
        float transform = linearEasing.transform((i8 - i10) / (durationMillis - i10));
        init(initialValue);
        int size$animation_core_release = animationVector.getSize$animation_core_release();
        while (true) {
            V v8 = null;
            if (i9 >= size$animation_core_release) {
                break;
            }
            V v9 = this.valueVector;
            if (v9 == null) {
                AbstractC3292y.y("valueVector");
            } else {
                v8 = v9;
            }
            v8.set$animation_core_release(i9, VectorConvertersKt.lerp(animationVector.get$animation_core_release(i9), targetValue.get$animation_core_release(i9), transform));
            i9++;
        }
        V v10 = this.valueVector;
        if (v10 == null) {
            AbstractC3292y.y("valueVector");
            return null;
        }
        return v10;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getVelocityFromNanos(long j8, V initialValue, V targetValue, V initialVelocity) {
        long clampPlayTime;
        AbstractC3292y.i(initialValue, "initialValue");
        AbstractC3292y.i(targetValue, "targetValue");
        AbstractC3292y.i(initialVelocity, "initialVelocity");
        clampPlayTime = VectorizedAnimationSpecKt.clampPlayTime(this, j8 / 1000000);
        if (clampPlayTime <= 0) {
            return initialVelocity;
        }
        AnimationVector valueFromMillis = VectorizedAnimationSpecKt.getValueFromMillis(this, clampPlayTime - 1, initialValue, targetValue, initialVelocity);
        AnimationVector valueFromMillis2 = VectorizedAnimationSpecKt.getValueFromMillis(this, clampPlayTime, initialValue, targetValue, initialVelocity);
        init(initialValue);
        int size$animation_core_release = valueFromMillis.getSize$animation_core_release();
        int i8 = 0;
        while (true) {
            V v8 = null;
            if (i8 >= size$animation_core_release) {
                break;
            }
            V v9 = this.velocityVector;
            if (v9 == null) {
                AbstractC3292y.y("velocityVector");
            } else {
                v8 = v9;
            }
            v8.set$animation_core_release(i8, (valueFromMillis.get$animation_core_release(i8) - valueFromMillis2.get$animation_core_release(i8)) * 1000.0f);
            i8++;
        }
        V v10 = this.velocityVector;
        if (v10 == null) {
            AbstractC3292y.y("velocityVector");
            return null;
        }
        return v10;
    }

    @Override // androidx.compose.animation.core.VectorizedFiniteAnimationSpec, androidx.compose.animation.core.VectorizedAnimationSpec
    public /* synthetic */ boolean isInfinite() {
        return h.a(this);
    }

    public /* synthetic */ VectorizedKeyframesSpec(Map map, int i8, int i9, int i10, AbstractC3284p abstractC3284p) {
        this(map, i8, (i10 & 4) != 0 ? 0 : i9);
    }
}
