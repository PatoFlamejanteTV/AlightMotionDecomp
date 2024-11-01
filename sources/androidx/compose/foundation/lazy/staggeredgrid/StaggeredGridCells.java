package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@Stable
/* loaded from: classes.dex */
public interface StaggeredGridCells {

    @StabilityInferred(parameters = 0)
    /* loaded from: classes.dex */
    public static final class Adaptive implements StaggeredGridCells {
        public static final int $stable = 0;
        private final float minSize;

        public /* synthetic */ Adaptive(float f8, AbstractC3284p abstractC3284p) {
            this(f8);
        }

        @Override // androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
        public int[] calculateCrossAxisCellSizes(Density density, int i8, int i9) {
            int[] calculateCellsCrossAxisSizeImpl;
            AbstractC3292y.i(density, "<this>");
            calculateCellsCrossAxisSizeImpl = LazyStaggeredGridCellsKt.calculateCellsCrossAxisSizeImpl(i8, Math.max((i8 + i9) / (density.mo419roundToPx0680j_4(this.minSize) + i9), 1), i9);
            return calculateCellsCrossAxisSizeImpl;
        }

        public boolean equals(Object obj) {
            if ((obj instanceof Adaptive) && Dp.m5160equalsimpl0(this.minSize, ((Adaptive) obj).minSize)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Dp.m5161hashCodeimpl(this.minSize);
        }

        private Adaptive(float f8) {
            this.minSize = f8;
            if (Dp.m5154compareTo0680j_4(f8, Dp.m5155constructorimpl(0)) <= 0) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
    }

    @StabilityInferred(parameters = 0)
    /* loaded from: classes.dex */
    public static final class Fixed implements StaggeredGridCells {
        public static final int $stable = 0;
        private final int count;

        public Fixed(int i8) {
            this.count = i8;
            if (i8 > 0) {
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }

        @Override // androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
        public int[] calculateCrossAxisCellSizes(Density density, int i8, int i9) {
            int[] calculateCellsCrossAxisSizeImpl;
            AbstractC3292y.i(density, "<this>");
            calculateCellsCrossAxisSizeImpl = LazyStaggeredGridCellsKt.calculateCellsCrossAxisSizeImpl(i8, this.count, i9);
            return calculateCellsCrossAxisSizeImpl;
        }

        public boolean equals(Object obj) {
            if ((obj instanceof Fixed) && this.count == ((Fixed) obj).count) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -this.count;
        }
    }

    @StabilityInferred(parameters = 0)
    /* loaded from: classes.dex */
    public static final class FixedSize implements StaggeredGridCells {
        public static final int $stable = 0;
        private final float size;

        public /* synthetic */ FixedSize(float f8, AbstractC3284p abstractC3284p) {
            this(f8);
        }

        @Override // androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
        public int[] calculateCrossAxisCellSizes(Density density, int i8, int i9) {
            AbstractC3292y.i(density, "<this>");
            int mo419roundToPx0680j_4 = density.mo419roundToPx0680j_4(this.size);
            int i10 = mo419roundToPx0680j_4 + i9;
            int i11 = i9 + i8;
            if (i10 < i11) {
                int i12 = i11 / i10;
                int[] iArr = new int[i12];
                for (int i13 = 0; i13 < i12; i13++) {
                    iArr[i13] = mo419roundToPx0680j_4;
                }
                return iArr;
            }
            return new int[]{i8};
        }

        public boolean equals(Object obj) {
            if ((obj instanceof FixedSize) && Dp.m5160equalsimpl0(this.size, ((FixedSize) obj).size)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Dp.m5161hashCodeimpl(this.size);
        }

        private FixedSize(float f8) {
            this.size = f8;
        }
    }

    int[] calculateCrossAxisCellSizes(Density density, int i8, int i9);
}
