package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class VectorizedInfiniteRepeatableSpec<V extends AnimationVector> implements VectorizedAnimationSpec<V> {
    public static final int $stable = 8;
    private final VectorizedDurationBasedAnimationSpec<V> animation;
    private final long durationNanos;
    private final long initialOffsetNanos;
    private final RepeatMode repeatMode;

    public /* synthetic */ VectorizedInfiniteRepeatableSpec(VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode, long j8, AbstractC3284p abstractC3284p) {
        this(vectorizedDurationBasedAnimationSpec, repeatMode, j8);
    }

    private final long repetitionPlayTimeNanos(long j8) {
        long j9 = this.initialOffsetNanos;
        if (j8 + j9 <= 0) {
            return 0L;
        }
        long j10 = j8 + j9;
        long j11 = this.durationNanos;
        long j12 = j10 / j11;
        if (this.repeatMode != RepeatMode.Restart && j12 % 2 != 0) {
            return ((j12 + 1) * j11) - j10;
        }
        Long.signum(j12);
        return j10 - (j12 * j11);
    }

    private final V repetitionStartVelocity(long j8, V v8, V v9, V v10) {
        long j9 = this.initialOffsetNanos;
        long j10 = j8 + j9;
        long j11 = this.durationNanos;
        if (j10 > j11) {
            return getVelocityFromNanos(j11 - j9, v8, v9, v10);
        }
        return v9;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public long getDurationNanos(V initialValue, V targetValue, V initialVelocity) {
        AbstractC3292y.i(initialValue, "initialValue");
        AbstractC3292y.i(targetValue, "targetValue");
        AbstractC3292y.i(initialVelocity, "initialVelocity");
        return Long.MAX_VALUE;
    }

    public final long getDurationNanos$animation_core_release() {
        return this.durationNanos;
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
        return this.animation.getValueFromNanos(repetitionPlayTimeNanos(j8), initialValue, targetValue, repetitionStartVelocity(j8, initialValue, initialVelocity, targetValue));
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getVelocityFromNanos(long j8, V initialValue, V targetValue, V initialVelocity) {
        AbstractC3292y.i(initialValue, "initialValue");
        AbstractC3292y.i(targetValue, "targetValue");
        AbstractC3292y.i(initialVelocity, "initialVelocity");
        return this.animation.getVelocityFromNanos(repetitionPlayTimeNanos(j8), initialValue, targetValue, repetitionStartVelocity(j8, initialValue, initialVelocity, targetValue));
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public boolean isInfinite() {
        return true;
    }

    private VectorizedInfiniteRepeatableSpec(VectorizedDurationBasedAnimationSpec<V> animation, RepeatMode repeatMode, long j8) {
        AbstractC3292y.i(animation, "animation");
        AbstractC3292y.i(repeatMode, "repeatMode");
        this.animation = animation;
        this.repeatMode = repeatMode;
        this.durationNanos = (animation.getDelayMillis() + animation.getDurationMillis()) * 1000000;
        this.initialOffsetNanos = j8 * 1000000;
    }

    public /* synthetic */ VectorizedInfiniteRepeatableSpec(VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode, long j8, int i8, AbstractC3284p abstractC3284p) {
        this(vectorizedDurationBasedAnimationSpec, (i8 & 2) != 0 ? RepeatMode.Restart : repeatMode, (i8 & 4) != 0 ? StartOffset.m209constructorimpl$default(0, 0, 2, null) : j8, (AbstractC3284p) null);
    }

    public /* synthetic */ VectorizedInfiniteRepeatableSpec(VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode, int i8, AbstractC3284p abstractC3284p) {
        this(vectorizedDurationBasedAnimationSpec, (i8 & 2) != 0 ? RepeatMode.Restart : repeatMode);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VectorizedInfiniteRepeatableSpec(VectorizedDurationBasedAnimationSpec animation, RepeatMode repeatMode) {
        this(animation, repeatMode, StartOffset.m209constructorimpl$default(0, 0, 2, null), (AbstractC3284p) null);
        AbstractC3292y.i(animation, "animation");
        AbstractC3292y.i(repeatMode, "repeatMode");
    }
}
