package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class LazyStaggeredGridDslKt$rememberColumnSlots$1$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ StaggeredGridCells $columns;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ Arrangement.Horizontal $horizontalArrangement;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridDslKt$rememberColumnSlots$1$1(PaddingValues paddingValues, StaggeredGridCells staggeredGridCells, Arrangement.Horizontal horizontal) {
        super(2);
        this.$contentPadding = paddingValues;
        this.$columns = staggeredGridCells;
        this.$horizontalArrangement = horizontal;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m747invoke0kLqBqw((Density) obj, ((Constraints) obj2).m5129unboximpl());
    }

    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
    public final LazyStaggeredGridSlots m747invoke0kLqBqw(Density $receiver, long j8) {
        AbstractC3292y.i($receiver, "$this$$receiver");
        if (Constraints.m5123getMaxWidthimpl(j8) != Integer.MAX_VALUE) {
            PaddingValues paddingValues = this.$contentPadding;
            LayoutDirection layoutDirection = LayoutDirection.Ltr;
            int m5123getMaxWidthimpl = Constraints.m5123getMaxWidthimpl(j8) - $receiver.mo419roundToPx0680j_4(Dp.m5155constructorimpl(PaddingKt.calculateStartPadding(paddingValues, layoutDirection) + PaddingKt.calculateEndPadding(this.$contentPadding, layoutDirection)));
            StaggeredGridCells staggeredGridCells = this.$columns;
            Arrangement.Horizontal horizontal = this.$horizontalArrangement;
            int[] calculateCrossAxisCellSizes = staggeredGridCells.calculateCrossAxisCellSizes($receiver, m5123getMaxWidthimpl, $receiver.mo419roundToPx0680j_4(horizontal.mo497getSpacingD9Ej5fM()));
            int[] iArr = new int[calculateCrossAxisCellSizes.length];
            horizontal.arrange($receiver, m5123getMaxWidthimpl, calculateCrossAxisCellSizes, layoutDirection, iArr);
            return new LazyStaggeredGridSlots(iArr, calculateCrossAxisCellSizes);
        }
        throw new IllegalArgumentException("LazyVerticalStaggeredGrid's width should be bound by parent.".toString());
    }
}
