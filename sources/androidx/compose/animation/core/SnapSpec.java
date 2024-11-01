package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@Immutable
/* loaded from: classes.dex */
public final class SnapSpec<T> implements DurationBasedAnimationSpec<T> {
    public static final int $stable = 0;
    private final int delay;

    public SnapSpec() {
        this(0, 1, null);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SnapSpec) || ((SnapSpec) obj).delay != this.delay) {
            return false;
        }
        return true;
    }

    public final int getDelay() {
        return this.delay;
    }

    public int hashCode() {
        return this.delay;
    }

    public SnapSpec(int i8) {
        this.delay = i8;
    }

    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public <V extends AnimationVector> VectorizedDurationBasedAnimationSpec<V> vectorize(TwoWayConverter<T, V> converter) {
        AbstractC3292y.i(converter, "converter");
        return new VectorizedSnapSpec(this.delay);
    }

    public /* synthetic */ SnapSpec(int i8, int i9, AbstractC3284p abstractC3284p) {
        this((i9 & 1) != 0 ? 0 : i8);
    }
}
