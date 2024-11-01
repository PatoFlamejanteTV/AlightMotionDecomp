package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import i6.m;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class FloatTweenSpec implements FloatAnimationSpec {
    public static final int $stable = 0;
    private final int delay;
    private final int duration;
    private final Easing easing;

    public FloatTweenSpec() {
        this(0, 0, null, 7, null);
    }

    private final long clampPlayTime(long j8) {
        return m.m(j8 - this.delay, 0L, this.duration);
    }

    public final int getDelay() {
        return this.delay;
    }

    public final int getDuration() {
        return this.duration;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public long getDurationNanos(float f8, float f9, float f10) {
        return (this.delay + this.duration) * 1000000;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public /* synthetic */ float getEndVelocity(float f8, float f9, float f10) {
        return c.a(this, f8, f9, f10);
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public float getValueFromNanos(long j8, float f8, float f9, float f10) {
        float f11;
        long clampPlayTime = clampPlayTime(j8 / 1000000);
        int i8 = this.duration;
        if (i8 == 0) {
            f11 = 1.0f;
        } else {
            f11 = ((float) clampPlayTime) / i8;
        }
        return VectorConvertersKt.lerp(f8, f9, this.easing.transform(m.j(f11, 0.0f, 1.0f)));
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public float getVelocityFromNanos(long j8, float f8, float f9, float f10) {
        long clampPlayTime = clampPlayTime(j8 / 1000000);
        if (clampPlayTime < 0) {
            return 0.0f;
        }
        if (clampPlayTime == 0) {
            return f10;
        }
        return (getValueFromNanos(clampPlayTime * 1000000, f8, f9, f10) - getValueFromNanos((clampPlayTime - 1) * 1000000, f8, f9, f10)) * 1000.0f;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public /* bridge */ /* synthetic */ VectorizedAnimationSpec vectorize(TwoWayConverter twoWayConverter) {
        VectorizedAnimationSpec vectorize;
        vectorize = vectorize(twoWayConverter);
        return vectorize;
    }

    public FloatTweenSpec(int i8, int i9, Easing easing) {
        AbstractC3292y.i(easing, "easing");
        this.duration = i8;
        this.delay = i9;
        this.easing = easing;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public /* synthetic */ VectorizedFloatAnimationSpec vectorize(TwoWayConverter twoWayConverter) {
        return c.c(this, twoWayConverter);
    }

    public /* synthetic */ FloatTweenSpec(int i8, int i9, Easing easing, int i10, AbstractC3284p abstractC3284p) {
        this((i10 & 1) != 0 ? 300 : i8, (i10 & 2) != 0 ? 0 : i9, (i10 & 4) != 0 ? EasingKt.getFastOutSlowInEasing() : easing);
    }
}
