package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class LazyStaggeredGridDslKt$rememberRowSlots$1$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ StaggeredGridCells $rows;
    final /* synthetic */ Arrangement.Vertical $verticalArrangement;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridDslKt$rememberRowSlots$1$1(PaddingValues paddingValues, StaggeredGridCells staggeredGridCells, Arrangement.Vertical vertical) {
        super(2);
        this.$contentPadding = paddingValues;
        this.$rows = staggeredGridCells;
        this.$verticalArrangement = vertical;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m748invoke0kLqBqw((Density) obj, ((Constraints) obj2).m5129unboximpl());
    }

    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
    public final LazyStaggeredGridSlots m748invoke0kLqBqw(Density $receiver, long j8) {
        AbstractC3292y.i($receiver, "$this$$receiver");
        if (Constraints.m5122getMaxHeightimpl(j8) != Integer.MAX_VALUE) {
            int m5122getMaxHeightimpl = Constraints.m5122getMaxHeightimpl(j8) - $receiver.mo419roundToPx0680j_4(Dp.m5155constructorimpl(this.$contentPadding.mo530calculateTopPaddingD9Ej5fM() + this.$contentPadding.mo527calculateBottomPaddingD9Ej5fM()));
            StaggeredGridCells staggeredGridCells = this.$rows;
            Arrangement.Vertical vertical = this.$verticalArrangement;
            int[] calculateCrossAxisCellSizes = staggeredGridCells.calculateCrossAxisCellSizes($receiver, m5122getMaxHeightimpl, $receiver.mo419roundToPx0680j_4(vertical.mo497getSpacingD9Ej5fM()));
            int[] iArr = new int[calculateCrossAxisCellSizes.length];
            vertical.arrange($receiver, m5122getMaxHeightimpl, calculateCrossAxisCellSizes, iArr);
            return new LazyStaggeredGridSlots(iArr, calculateCrossAxisCellSizes);
        }
        throw new IllegalArgumentException("LazyHorizontalStaggeredGrid's height should be bound by parent.".toString());
    }
}
