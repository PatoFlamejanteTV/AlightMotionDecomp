package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@Immutable
/* loaded from: classes.dex */
public final class SpringSpec<T> implements FiniteAnimationSpec<T> {
    public static final int $stable = 0;
    private final float dampingRatio;
    private final float stiffness;
    private final T visibilityThreshold;

    public SpringSpec() {
        this(0.0f, 0.0f, null, 7, null);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SpringSpec)) {
            return false;
        }
        SpringSpec springSpec = (SpringSpec) obj;
        if (springSpec.dampingRatio != this.dampingRatio || springSpec.stiffness != this.stiffness || !AbstractC3292y.d(springSpec.visibilityThreshold, this.visibilityThreshold)) {
            return false;
        }
        return true;
    }

    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    public final float getStiffness() {
        return this.stiffness;
    }

    public final T getVisibilityThreshold() {
        return this.visibilityThreshold;
    }

    public int hashCode() {
        int i8;
        T t8 = this.visibilityThreshold;
        if (t8 != null) {
            i8 = t8.hashCode();
        } else {
            i8 = 0;
        }
        return (((i8 * 31) + Float.floatToIntBits(this.dampingRatio)) * 31) + Float.floatToIntBits(this.stiffness);
    }

    public SpringSpec(float f8, float f9, T t8) {
        this.dampingRatio = f8;
        this.stiffness = f9;
        this.visibilityThreshold = t8;
    }

    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public <V extends AnimationVector> VectorizedSpringSpec<V> vectorize(TwoWayConverter<T, V> converter) {
        AnimationVector convert;
        AbstractC3292y.i(converter, "converter");
        float f8 = this.dampingRatio;
        float f9 = this.stiffness;
        convert = AnimationSpecKt.convert(converter, this.visibilityThreshold);
        return new VectorizedSpringSpec<>(f8, f9, convert);
    }

    public /* synthetic */ SpringSpec(float f8, float f9, Object obj, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? 1.0f : f8, (i8 & 2) != 0 ? 1500.0f : f9, (i8 & 4) != 0 ? null : obj);
    }
}
