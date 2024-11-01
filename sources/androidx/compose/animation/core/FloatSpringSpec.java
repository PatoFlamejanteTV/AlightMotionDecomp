package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC3284p;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class FloatSpringSpec implements FloatAnimationSpec {
    public static final int $stable = 8;
    private final float dampingRatio;
    private final SpringSimulation spring;
    private final float stiffness;
    private final float visibilityThreshold;

    public FloatSpringSpec() {
        this(0.0f, 0.0f, 0.0f, 7, null);
    }

    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public long getDurationNanos(float f8, float f9, float f10) {
        float stiffness = this.spring.getStiffness();
        float dampingRatio = this.spring.getDampingRatio();
        float f11 = f8 - f9;
        float f12 = this.visibilityThreshold;
        return SpringEstimationKt.estimateAnimationDurationMillis(stiffness, dampingRatio, f10 / f12, f11 / f12, 1.0f) * 1000000;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public float getEndVelocity(float f8, float f9, float f10) {
        return 0.0f;
    }

    public final float getStiffness() {
        return this.stiffness;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public float getValueFromNanos(long j8, float f8, float f9, float f10) {
        this.spring.setFinalPosition(f9);
        return Motion.m199getValueimpl(this.spring.m205updateValuesIJZedt4$animation_core_release(f8, f10, j8 / 1000000));
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public float getVelocityFromNanos(long j8, float f8, float f9, float f10) {
        this.spring.setFinalPosition(f9);
        return Motion.m200getVelocityimpl(this.spring.m205updateValuesIJZedt4$animation_core_release(f8, f10, j8 / 1000000));
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public /* bridge */ /* synthetic */ VectorizedAnimationSpec vectorize(TwoWayConverter twoWayConverter) {
        VectorizedAnimationSpec vectorize;
        vectorize = vectorize(twoWayConverter);
        return vectorize;
    }

    public FloatSpringSpec(float f8, float f9, float f10) {
        this.dampingRatio = f8;
        this.stiffness = f9;
        this.visibilityThreshold = f10;
        SpringSimulation springSimulation = new SpringSimulation(1.0f);
        springSimulation.setDampingRatio(f8);
        springSimulation.setStiffness(f9);
        this.spring = springSimulation;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public /* synthetic */ VectorizedFloatAnimationSpec vectorize(TwoWayConverter twoWayConverter) {
        return c.c(this, twoWayConverter);
    }

    public /* synthetic */ FloatSpringSpec(float f8, float f9, float f10, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? 1.0f : f8, (i8 & 2) != 0 ? 1500.0f : f9, (i8 & 4) != 0 ? 0.01f : f10);
    }
}
