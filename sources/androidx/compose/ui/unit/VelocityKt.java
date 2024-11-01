package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;

/* loaded from: classes.dex */
public final class VelocityKt {
    @Stable
    public static final long Velocity(float f8, float f9) {
        return Velocity.m5380constructorimpl((Float.floatToRawIntBits(f9) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32));
    }
}
