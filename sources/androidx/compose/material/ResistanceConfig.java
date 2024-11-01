package androidx.compose.material;

import androidx.compose.runtime.Immutable;
import i6.m;
import kotlin.jvm.internal.AbstractC3284p;

@Immutable
/* loaded from: classes.dex */
public final class ResistanceConfig {
    public static final int $stable = 0;
    private final float basis;
    private final float factorAtMax;
    private final float factorAtMin;

    public ResistanceConfig(float f8, float f9, float f10) {
        this.basis = f8;
        this.factorAtMin = f9;
        this.factorAtMax = f10;
    }

    public final float computeResistance(float f8) {
        float f9;
        if (f8 < 0.0f) {
            f9 = this.factorAtMin;
        } else {
            f9 = this.factorAtMax;
        }
        if (f9 == 0.0f) {
            return 0.0f;
        }
        return (this.basis / f9) * ((float) Math.sin((m.j(f8 / this.basis, -1.0f, 1.0f) * 3.1415927f) / 2));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResistanceConfig)) {
            return false;
        }
        ResistanceConfig resistanceConfig = (ResistanceConfig) obj;
        if (this.basis == resistanceConfig.basis && this.factorAtMin == resistanceConfig.factorAtMin && this.factorAtMax == resistanceConfig.factorAtMax) {
            return true;
        }
        return false;
    }

    public final float getBasis() {
        return this.basis;
    }

    public final float getFactorAtMax() {
        return this.factorAtMax;
    }

    public final float getFactorAtMin() {
        return this.factorAtMin;
    }

    public int hashCode() {
        return (((Float.floatToIntBits(this.basis) * 31) + Float.floatToIntBits(this.factorAtMin)) * 31) + Float.floatToIntBits(this.factorAtMax);
    }

    public String toString() {
        return "ResistanceConfig(basis=" + this.basis + ", factorAtMin=" + this.factorAtMin + ", factorAtMax=" + this.factorAtMax + ')';
    }

    public /* synthetic */ ResistanceConfig(float f8, float f9, float f10, int i8, AbstractC3284p abstractC3284p) {
        this(f8, (i8 & 2) != 0 ? 10.0f : f9, (i8 & 4) != 0 ? 10.0f : f10);
    }
}
