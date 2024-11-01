package androidx.compose.ui.layout;

import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes.dex */
public final class FixedScale implements ContentScale {
    public static final int $stable = 0;
    private final float value;

    public FixedScale(float f8) {
        this.value = f8;
    }

    public static /* synthetic */ FixedScale copy$default(FixedScale fixedScale, float f8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = fixedScale.value;
        }
        return fixedScale.copy(f8);
    }

    public final float component1() {
        return this.value;
    }

    @Override // androidx.compose.ui.layout.ContentScale
    /* renamed from: computeScaleFactor-H7hwNQA */
    public long mo4099computeScaleFactorH7hwNQA(long j8, long j9) {
        float f8 = this.value;
        return ScaleFactorKt.ScaleFactor(f8, f8);
    }

    public final FixedScale copy(float f8) {
        return new FixedScale(f8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FixedScale) && Float.compare(this.value, ((FixedScale) obj).value) == 0;
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.value);
    }

    public String toString() {
        return "FixedScale(value=" + this.value + ')';
    }
}
