package androidx.compose.ui;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import e6.AbstractC2829a;

@Immutable
/* loaded from: classes.dex */
public final class BiasAbsoluteAlignment implements Alignment {
    public static final int $stable = 0;
    private final float horizontalBias;
    private final float verticalBias;

    @Immutable
    /* loaded from: classes.dex */
    public static final class Horizontal implements Alignment.Horizontal {
        public static final int $stable = 0;
        private final float bias;

        public Horizontal(float f8) {
            this.bias = f8;
        }

        private final float component1() {
            return this.bias;
        }

        public static /* synthetic */ Horizontal copy$default(Horizontal horizontal, float f8, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                f8 = horizontal.bias;
            }
            return horizontal.copy(f8);
        }

        @Override // androidx.compose.ui.Alignment.Horizontal
        public int align(int i8, int i9, LayoutDirection layoutDirection) {
            return AbstractC2829a.d(((i9 - i8) / 2.0f) * (1 + this.bias));
        }

        public final Horizontal copy(float f8) {
            return new Horizontal(f8);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Horizontal) && Float.compare(this.bias, ((Horizontal) obj).bias) == 0;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.bias);
        }

        public String toString() {
            return "Horizontal(bias=" + this.bias + ')';
        }
    }

    public BiasAbsoluteAlignment(float f8, float f9) {
        this.horizontalBias = f8;
        this.verticalBias = f9;
    }

    private final float component1() {
        return this.horizontalBias;
    }

    private final float component2() {
        return this.verticalBias;
    }

    public static /* synthetic */ BiasAbsoluteAlignment copy$default(BiasAbsoluteAlignment biasAbsoluteAlignment, float f8, float f9, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = biasAbsoluteAlignment.horizontalBias;
        }
        if ((i8 & 2) != 0) {
            f9 = biasAbsoluteAlignment.verticalBias;
        }
        return biasAbsoluteAlignment.copy(f8, f9);
    }

    @Override // androidx.compose.ui.Alignment
    /* renamed from: align-KFBX0sM */
    public long mo2585alignKFBX0sM(long j8, long j9, LayoutDirection layoutDirection) {
        long IntSize = IntSizeKt.IntSize(IntSize.m5321getWidthimpl(j9) - IntSize.m5321getWidthimpl(j8), IntSize.m5320getHeightimpl(j9) - IntSize.m5320getHeightimpl(j8));
        float f8 = 1;
        return IntOffsetKt.IntOffset(AbstractC2829a.d((IntSize.m5321getWidthimpl(IntSize) / 2.0f) * (this.horizontalBias + f8)), AbstractC2829a.d((IntSize.m5320getHeightimpl(IntSize) / 2.0f) * (f8 + this.verticalBias)));
    }

    public final BiasAbsoluteAlignment copy(float f8, float f9) {
        return new BiasAbsoluteAlignment(f8, f9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BiasAbsoluteAlignment)) {
            return false;
        }
        BiasAbsoluteAlignment biasAbsoluteAlignment = (BiasAbsoluteAlignment) obj;
        return Float.compare(this.horizontalBias, biasAbsoluteAlignment.horizontalBias) == 0 && Float.compare(this.verticalBias, biasAbsoluteAlignment.verticalBias) == 0;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.horizontalBias) * 31) + Float.floatToIntBits(this.verticalBias);
    }

    public String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.horizontalBias + ", verticalBias=" + this.verticalBias + ')';
    }
}
