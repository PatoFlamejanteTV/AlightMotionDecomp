package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.jvm.internal.AbstractC3292y;

@Immutable
@ExperimentalMaterial3Api
/* loaded from: classes.dex */
public final class FractionalThreshold implements ThresholdConfig {
    private final float fraction;

    public FractionalThreshold(float f8) {
        this.fraction = f8;
    }

    private final float component1() {
        return this.fraction;
    }

    public static /* synthetic */ FractionalThreshold copy$default(FractionalThreshold fractionalThreshold, float f8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = fractionalThreshold.fraction;
        }
        return fractionalThreshold.copy(f8);
    }

    @Override // androidx.compose.material3.ThresholdConfig
    public float computeThreshold(Density density, float f8, float f9) {
        AbstractC3292y.i(density, "<this>");
        return MathHelpersKt.lerp(f8, f9, this.fraction);
    }

    public final FractionalThreshold copy(float f8) {
        return new FractionalThreshold(f8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FractionalThreshold) && AbstractC3292y.d(Float.valueOf(this.fraction), Float.valueOf(((FractionalThreshold) obj).fraction));
    }

    public int hashCode() {
        return Float.floatToIntBits(this.fraction);
    }

    public String toString() {
        return "FractionalThreshold(fraction=" + this.fraction + ')';
    }
}
