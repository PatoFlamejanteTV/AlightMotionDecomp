package androidx.compose.foundation.lazy.grid;

import R5.AbstractC1435t;
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
final class LazyGridDslKt$rememberColumnWidthSums$1$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ GridCells $columns;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ Arrangement.Horizontal $horizontalArrangement;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyGridDslKt$rememberColumnWidthSums$1$1(PaddingValues paddingValues, GridCells gridCells, Arrangement.Horizontal horizontal) {
        super(2);
        this.$contentPadding = paddingValues;
        this.$columns = gridCells;
        this.$horizontalArrangement = horizontal;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m703invoke0kLqBqw((Density) obj, ((Constraints) obj2).m5129unboximpl());
    }

    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
    public final LazyGridSlots m703invoke0kLqBqw(Density $receiver, long j8) {
        AbstractC3292y.i($receiver, "$this$$receiver");
        if (Constraints.m5123getMaxWidthimpl(j8) != Integer.MAX_VALUE) {
            PaddingValues paddingValues = this.$contentPadding;
            LayoutDirection layoutDirection = LayoutDirection.Ltr;
            int m5123getMaxWidthimpl = Constraints.m5123getMaxWidthimpl(j8) - $receiver.mo419roundToPx0680j_4(Dp.m5155constructorimpl(PaddingKt.calculateStartPadding(paddingValues, layoutDirection) + PaddingKt.calculateEndPadding(this.$contentPadding, layoutDirection)));
            GridCells gridCells = this.$columns;
            Arrangement.Horizontal horizontal = this.$horizontalArrangement;
            int[] V02 = AbstractC1435t.V0(gridCells.calculateCrossAxisCellSizes($receiver, m5123getMaxWidthimpl, $receiver.mo419roundToPx0680j_4(horizontal.mo497getSpacingD9Ej5fM())));
            int[] iArr = new int[V02.length];
            horizontal.arrange($receiver, m5123getMaxWidthimpl, V02, layoutDirection, iArr);
            return new LazyGridSlots(V02, iArr);
        }
        throw new IllegalArgumentException("LazyVerticalGrid's width should be bound by parent.".toString());
    }
}
