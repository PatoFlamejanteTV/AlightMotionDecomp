package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class VectorizedTweenSpec<V extends AnimationVector> implements VectorizedDurationBasedAnimationSpec<V> {
    public static final int $stable = 8;
    private final VectorizedFloatAnimationSpec<V> anim;
    private final int delayMillis;
    private final int durationMillis;
    private final Easing easing;

    public VectorizedTweenSpec() {
        this(0, 0, null, 7, null);
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

    public final Easing getEasing() {
        return this.easing;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public /* synthetic */ AnimationVector getEndVelocity(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return f.a(this, animationVector, animationVector2, animationVector3);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getValueFromNanos(long j8, V initialValue, V targetValue, V initialVelocity) {
        AbstractC3292y.i(initialValue, "initialValue");
        AbstractC3292y.i(targetValue, "targetValue");
        AbstractC3292y.i(initialVelocity, "initialVelocity");
        return this.anim.getValueFromNanos(j8, initialValue, targetValue, initialVelocity);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getVelocityFromNanos(long j8, V initialValue, V targetValue, V initialVelocity) {
        AbstractC3292y.i(initialValue, "initialValue");
        AbstractC3292y.i(targetValue, "targetValue");
        AbstractC3292y.i(initialVelocity, "initialVelocity");
        return this.anim.getVelocityFromNanos(j8, initialValue, targetValue, initialVelocity);
    }

    @Override // androidx.compose.animation.core.VectorizedFiniteAnimationSpec, androidx.compose.animation.core.VectorizedAnimationSpec
    public /* synthetic */ boolean isInfinite() {
        return h.a(this);
    }

    public VectorizedTweenSpec(int i8, int i9, Easing easing) {
        AbstractC3292y.i(easing, "easing");
        this.durationMillis = i8;
        this.delayMillis = i9;
        this.easing = easing;
        this.anim = new VectorizedFloatAnimationSpec<>(new FloatTweenSpec(getDurationMillis(), getDelayMillis(), easing));
    }

    public /* synthetic */ VectorizedTweenSpec(int i8, int i9, Easing easing, int i10, AbstractC3284p abstractC3284p) {
        this((i10 & 1) != 0 ? 300 : i8, (i10 & 2) != 0 ? 0 : i9, (i10 & 4) != 0 ? EasingKt.getFastOutSlowInEasing() : easing);
    }
}
