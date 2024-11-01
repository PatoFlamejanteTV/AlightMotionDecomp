package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC3284p;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class FloatExponentialDecaySpec implements FloatDecayAnimationSpec {
    public static final int $stable = 0;
    private final float absVelocityThreshold;
    private final float friction;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public FloatExponentialDecaySpec() {
        /*
            r3 = this;
            r0 = 3
            r1 = 0
            r2 = 0
            r3.<init>(r2, r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.FloatExponentialDecaySpec.<init>():void");
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getAbsVelocityThreshold() {
        return this.absVelocityThreshold;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public long getDurationNanos(float f8, float f9) {
        return ((((float) Math.log(getAbsVelocityThreshold() / Math.abs(f9))) * 1000.0f) / this.friction) * 1000000;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getTargetValue(float f8, float f9) {
        if (Math.abs(f9) <= getAbsVelocityThreshold()) {
            return f8;
        }
        double log = Math.log(Math.abs(getAbsVelocityThreshold() / f9));
        float f10 = this.friction;
        return (f8 - (f9 / f10)) + ((f9 / f10) * ((float) Math.exp((f10 * ((log / f10) * 1000)) / 1000.0f)));
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getValueFromNanos(long j8, float f8, float f9) {
        float f10 = this.friction;
        return (f8 - (f9 / f10)) + ((f9 / f10) * ((float) Math.exp((f10 * ((float) (j8 / 1000000))) / 1000.0f)));
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getVelocityFromNanos(long j8, float f8, float f9) {
        return f9 * ((float) Math.exp((((float) (j8 / 1000000)) / 1000.0f) * this.friction));
    }

    public FloatExponentialDecaySpec(float f8, float f9) {
        this.absVelocityThreshold = Math.max(1.0E-7f, Math.abs(f9));
        this.friction = Math.max(1.0E-4f, f8) * (-4.2f);
    }

    public /* synthetic */ FloatExponentialDecaySpec(float f8, float f9, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? 1.0f : f8, (i8 & 2) != 0 ? 0.1f : f9);
    }
}
