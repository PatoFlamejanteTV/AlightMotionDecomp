package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class InfiniteRepeatableSpec<T> implements AnimationSpec<T> {
    public static final int $stable = 8;
    private final DurationBasedAnimationSpec<T> animation;
    private final long initialStartOffset;
    private final RepeatMode repeatMode;

    public /* synthetic */ InfiniteRepeatableSpec(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, long j8, AbstractC3284p abstractC3284p) {
        this(durationBasedAnimationSpec, repeatMode, j8);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof InfiniteRepeatableSpec)) {
            return false;
        }
        InfiniteRepeatableSpec infiniteRepeatableSpec = (InfiniteRepeatableSpec) obj;
        if (!AbstractC3292y.d(infiniteRepeatableSpec.animation, this.animation) || infiniteRepeatableSpec.repeatMode != this.repeatMode || !StartOffset.m211equalsimpl0(infiniteRepeatableSpec.initialStartOffset, this.initialStartOffset)) {
            return false;
        }
        return true;
    }

    public final DurationBasedAnimationSpec<T> getAnimation() {
        return this.animation;
    }

    /* renamed from: getInitialStartOffset-Rmkjzm4, reason: not valid java name */
    public final long m191getInitialStartOffsetRmkjzm4() {
        return this.initialStartOffset;
    }

    public final RepeatMode getRepeatMode() {
        return this.repeatMode;
    }

    public int hashCode() {
        return (((this.animation.hashCode() * 31) + this.repeatMode.hashCode()) * 31) + StartOffset.m214hashCodeimpl(this.initialStartOffset);
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    public <V extends AnimationVector> VectorizedAnimationSpec<V> vectorize(TwoWayConverter<T, V> converter) {
        AbstractC3292y.i(converter, "converter");
        return new VectorizedInfiniteRepeatableSpec(this.animation.vectorize((TwoWayConverter) converter), this.repeatMode, this.initialStartOffset, (AbstractC3284p) null);
    }

    private InfiniteRepeatableSpec(DurationBasedAnimationSpec<T> animation, RepeatMode repeatMode, long j8) {
        AbstractC3292y.i(animation, "animation");
        AbstractC3292y.i(repeatMode, "repeatMode");
        this.animation = animation;
        this.repeatMode = repeatMode;
        this.initialStartOffset = j8;
    }

    public /* synthetic */ InfiniteRepeatableSpec(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, long j8, int i8, AbstractC3284p abstractC3284p) {
        this(durationBasedAnimationSpec, (i8 & 2) != 0 ? RepeatMode.Restart : repeatMode, (i8 & 4) != 0 ? StartOffset.m209constructorimpl$default(0, 0, 2, null) : j8, (AbstractC3284p) null);
    }

    public /* synthetic */ InfiniteRepeatableSpec(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, int i8, AbstractC3284p abstractC3284p) {
        this(durationBasedAnimationSpec, (i8 & 2) != 0 ? RepeatMode.Restart : repeatMode);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InfiniteRepeatableSpec(DurationBasedAnimationSpec animation, RepeatMode repeatMode) {
        this(animation, repeatMode, StartOffset.m209constructorimpl$default(0, 0, 2, null), (AbstractC3284p) null);
        AbstractC3292y.i(animation, "animation");
        AbstractC3292y.i(repeatMode, "repeatMode");
    }
}
