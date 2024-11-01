package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@Stable
/* loaded from: classes.dex */
public interface GridCells {

    @StabilityInferred(parameters = 0)
    /* loaded from: classes.dex */
    public static final class Adaptive implements GridCells {
        public static final int $stable = 0;
        private final float minSize;

        public /* synthetic */ Adaptive(float f8, AbstractC3284p abstractC3284p) {
            this(f8);
        }

        @Override // androidx.compose.foundation.lazy.grid.GridCells
        public List<Integer> calculateCrossAxisCellSizes(Density density, int i8, int i9) {
            List<Integer> calculateCellsCrossAxisSizeImpl;
            AbstractC3292y.i(density, "<this>");
            calculateCellsCrossAxisSizeImpl = LazyGridDslKt.calculateCellsCrossAxisSizeImpl(i8, Math.max((i8 + i9) / (density.mo419roundToPx0680j_4(this.minSize) + i9), 1), i9);
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
            if (Dp.m5154compareTo0680j_4(f8, Dp.m5155constructorimpl(0)) > 0) {
                return;
            }
            throw new IllegalArgumentException(("Provided min size " + ((Object) Dp.m5166toStringimpl(f8)) + " should be larger than zero.").toString());
        }
    }

    @StabilityInferred(parameters = 0)
    /* loaded from: classes.dex */
    public static final class Fixed implements GridCells {
        public static final int $stable = 0;
        private final int count;

        public Fixed(int i8) {
            this.count = i8;
            if (i8 > 0) {
                return;
            }
            throw new IllegalArgumentException(("Provided count " + i8 + " should be larger than zero").toString());
        }

        @Override // androidx.compose.foundation.lazy.grid.GridCells
        public List<Integer> calculateCrossAxisCellSizes(Density density, int i8, int i9) {
            List<Integer> calculateCellsCrossAxisSizeImpl;
            AbstractC3292y.i(density, "<this>");
            calculateCellsCrossAxisSizeImpl = LazyGridDslKt.calculateCellsCrossAxisSizeImpl(i8, this.count, i9);
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
    public static final class FixedSize implements GridCells {
        public static final int $stable = 0;
        private final float size;

        public /* synthetic */ FixedSize(float f8, AbstractC3284p abstractC3284p) {
            this(f8);
        }

        @Override // androidx.compose.foundation.lazy.grid.GridCells
        public List<Integer> calculateCrossAxisCellSizes(Density density, int i8, int i9) {
            AbstractC3292y.i(density, "<this>");
            int mo419roundToPx0680j_4 = density.mo419roundToPx0680j_4(this.size);
            int i10 = mo419roundToPx0680j_4 + i9;
            int i11 = i9 + i8;
            if (i10 < i11) {
                int i12 = i11 / i10;
                ArrayList arrayList = new ArrayList(i12);
                for (int i13 = 0; i13 < i12; i13++) {
                    arrayList.add(Integer.valueOf(mo419roundToPx0680j_4));
                }
                return arrayList;
            }
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(Integer.valueOf(i8));
            return arrayList2;
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
            if (Dp.m5154compareTo0680j_4(f8, Dp.m5155constructorimpl(0)) > 0) {
                return;
            }
            throw new IllegalArgumentException(("Provided size " + ((Object) Dp.m5166toStringimpl(f8)) + " should be larger than zero.").toString());
        }
    }

    List<Integer> calculateCrossAxisCellSizes(Density density, int i8, int i9);
}
