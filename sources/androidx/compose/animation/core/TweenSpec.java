package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@Immutable
/* loaded from: classes.dex */
public final class TweenSpec<T> implements DurationBasedAnimationSpec<T> {
    public static final int $stable = 0;
    private final int delay;
    private final int durationMillis;
    private final Easing easing;

    public TweenSpec() {
        this(0, 0, null, 7, null);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TweenSpec)) {
            return false;
        }
        TweenSpec tweenSpec = (TweenSpec) obj;
        if (tweenSpec.durationMillis != this.durationMillis || tweenSpec.delay != this.delay || !AbstractC3292y.d(tweenSpec.easing, this.easing)) {
            return false;
        }
        return true;
    }

    public final int getDelay() {
        return this.delay;
    }

    public final int getDurationMillis() {
        return this.durationMillis;
    }

    public final Easing getEasing() {
        return this.easing;
    }

    public int hashCode() {
        return (((this.durationMillis * 31) + this.easing.hashCode()) * 31) + this.delay;
    }

    public TweenSpec(int i8, int i9, Easing easing) {
        AbstractC3292y.i(easing, "easing");
        this.durationMillis = i8;
        this.delay = i9;
        this.easing = easing;
    }

    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public <V extends AnimationVector> VectorizedTweenSpec<V> vectorize(TwoWayConverter<T, V> converter) {
        AbstractC3292y.i(converter, "converter");
        return new VectorizedTweenSpec<>(this.durationMillis, this.delay, this.easing);
    }

    public /* synthetic */ TweenSpec(int i8, int i9, Easing easing, int i10, AbstractC3284p abstractC3284p) {
        this((i10 & 1) != 0 ? 300 : i8, (i10 & 2) != 0 ? 0 : i9, (i10 & 4) != 0 ? EasingKt.getFastOutSlowInEasing() : easing);
    }
}
