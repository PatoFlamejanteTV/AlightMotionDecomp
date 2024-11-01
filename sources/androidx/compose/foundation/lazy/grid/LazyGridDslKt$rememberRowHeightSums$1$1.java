package androidx.compose.foundation.lazy.grid;

import R5.AbstractC1435t;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class LazyGridDslKt$rememberRowHeightSums$1$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ GridCells $rows;
    final /* synthetic */ Arrangement.Vertical $verticalArrangement;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyGridDslKt$rememberRowHeightSums$1$1(PaddingValues paddingValues, GridCells gridCells, Arrangement.Vertical vertical) {
        super(2);
        this.$contentPadding = paddingValues;
        this.$rows = gridCells;
        this.$verticalArrangement = vertical;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m704invoke0kLqBqw((Density) obj, ((Constraints) obj2).m5129unboximpl());
    }

    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
    public final LazyGridSlots m704invoke0kLqBqw(Density $receiver, long j8) {
        AbstractC3292y.i($receiver, "$this$$receiver");
        if (Constraints.m5122getMaxHeightimpl(j8) != Integer.MAX_VALUE) {
            int m5122getMaxHeightimpl = Constraints.m5122getMaxHeightimpl(j8) - $receiver.mo419roundToPx0680j_4(Dp.m5155constructorimpl(this.$contentPadding.mo530calculateTopPaddingD9Ej5fM() + this.$contentPadding.mo527calculateBottomPaddingD9Ej5fM()));
            GridCells gridCells = this.$rows;
            Arrangement.Vertical vertical = this.$verticalArrangement;
            int[] V02 = AbstractC1435t.V0(gridCells.calculateCrossAxisCellSizes($receiver, m5122getMaxHeightimpl, $receiver.mo419roundToPx0680j_4(vertical.mo497getSpacingD9Ej5fM())));
            int[] iArr = new int[V02.length];
            vertical.arrange($receiver, m5122getMaxHeightimpl, V02, iArr);
            return new LazyGridSlots(V02, iArr);
        }
        throw new IllegalArgumentException("LazyHorizontalGrid's height should be bound by parent.".toString());
    }
}
