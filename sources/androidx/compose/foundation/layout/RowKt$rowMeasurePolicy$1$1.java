package androidx.compose.foundation.layout;

import Q5.I;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import c6.InterfaceC2075q;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class RowKt$rowMeasurePolicy$1$1 extends AbstractC3293z implements InterfaceC2075q {
    final /* synthetic */ Arrangement.Horizontal $horizontalArrangement;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RowKt$rowMeasurePolicy$1$1(Arrangement.Horizontal horizontal) {
        super(5);
        this.$horizontalArrangement = horizontal;
    }

    @Override // c6.InterfaceC2075q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        invoke(((Number) obj).intValue(), (int[]) obj2, (LayoutDirection) obj3, (Density) obj4, (int[]) obj5);
        return I.f8786a;
    }

    public final void invoke(int i8, int[] size, LayoutDirection layoutDirection, Density density, int[] outPosition) {
        AbstractC3292y.i(size, "size");
        AbstractC3292y.i(layoutDirection, "layoutDirection");
        AbstractC3292y.i(density, "density");
        AbstractC3292y.i(outPosition, "outPosition");
        this.$horizontalArrangement.arrange(density, i8, size, layoutDirection, outPosition);
    }
}
