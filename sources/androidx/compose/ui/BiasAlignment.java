package androidx.compose.ui;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import e6.AbstractC2829a;

@Immutable
/* loaded from: classes.dex */
public final class BiasAlignment implements Alignment {
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
            float f8;
            float f9 = (i9 - i8) / 2.0f;
            if (layoutDirection == LayoutDirection.Ltr) {
                f8 = this.bias;
            } else {
                f8 = (-1) * this.bias;
            }
            return AbstractC2829a.d(f9 * (1 + f8));
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

    @Immutable
    /* loaded from: classes.dex */
    public static final class Vertical implements Alignment.Vertical {
        public static final int $stable = 0;
        private final float bias;

        public Vertical(float f8) {
            this.bias = f8;
        }

        private final float component1() {
            return this.bias;
        }

        public static /* synthetic */ Vertical copy$default(Vertical vertical, float f8, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                f8 = vertical.bias;
            }
            return vertical.copy(f8);
        }

        @Override // androidx.compose.ui.Alignment.Vertical
        public int align(int i8, int i9) {
            return AbstractC2829a.d(((i9 - i8) / 2.0f) * (1 + this.bias));
        }

        public final Vertical copy(float f8) {
            return new Vertical(f8);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Vertical) && Float.compare(this.bias, ((Vertical) obj).bias) == 0;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.bias);
        }

        public String toString() {
            return "Vertical(bias=" + this.bias + ')';
        }
    }

    public BiasAlignment(float f8, float f9) {
        this.horizontalBias = f8;
        this.verticalBias = f9;
    }

    public static /* synthetic */ BiasAlignment copy$default(BiasAlignment biasAlignment, float f8, float f9, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = biasAlignment.horizontalBias;
        }
        if ((i8 & 2) != 0) {
            f9 = biasAlignment.verticalBias;
        }
        return biasAlignment.copy(f8, f9);
    }

    @Override // androidx.compose.ui.Alignment
    /* renamed from: align-KFBX0sM */
    public long mo2585alignKFBX0sM(long j8, long j9, LayoutDirection layoutDirection) {
        float f8;
        float m5321getWidthimpl = (IntSize.m5321getWidthimpl(j9) - IntSize.m5321getWidthimpl(j8)) / 2.0f;
        float m5320getHeightimpl = (IntSize.m5320getHeightimpl(j9) - IntSize.m5320getHeightimpl(j8)) / 2.0f;
        if (layoutDirection == LayoutDirection.Ltr) {
            f8 = this.horizontalBias;
        } else {
            f8 = (-1) * this.horizontalBias;
        }
        float f9 = 1;
        return IntOffsetKt.IntOffset(AbstractC2829a.d(m5321getWidthimpl * (f8 + f9)), AbstractC2829a.d(m5320getHeightimpl * (f9 + this.verticalBias)));
    }

    public final float component1() {
        return this.horizontalBias;
    }

    public final float component2() {
        return this.verticalBias;
    }

    public final BiasAlignment copy(float f8, float f9) {
        return new BiasAlignment(f8, f9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BiasAlignment)) {
            return false;
        }
        BiasAlignment biasAlignment = (BiasAlignment) obj;
        return Float.compare(this.horizontalBias, biasAlignment.horizontalBias) == 0 && Float.compare(this.verticalBias, biasAlignment.verticalBias) == 0;
    }

    public final float getHorizontalBias() {
        return this.horizontalBias;
    }

    public final float getVerticalBias() {
        return this.verticalBias;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.horizontalBias) * 31) + Float.floatToIntBits(this.verticalBias);
    }

    public String toString() {
        return "BiasAlignment(horizontalBias=" + this.horizontalBias + ", verticalBias=" + this.verticalBias + ')';
    }
}
