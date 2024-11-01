package androidx.compose.material3;

import Q5.I;
import R5.AbstractC1435t;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class AlertDialogKt$AlertDialogFlowRow$1$measure$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ List<Integer> $crossAxisPositions;
    final /* synthetic */ int $mainAxisLayoutSize;
    final /* synthetic */ float $mainAxisSpacing;
    final /* synthetic */ List<List<Placeable>> $sequences;
    final /* synthetic */ MeasureScope $this_Layout;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertDialogKt$AlertDialogFlowRow$1$measure$1(List<List<Placeable>> list, MeasureScope measureScope, float f8, int i8, List<Integer> list2) {
        super(1);
        this.$sequences = list;
        this.$this_Layout = measureScope;
        this.$mainAxisSpacing = f8;
        this.$mainAxisLayoutSize = i8;
        this.$crossAxisPositions = list2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return I.f8786a;
    }

    public final void invoke(Placeable.PlacementScope layout) {
        AbstractC3292y.i(layout, "$this$layout");
        List<List<Placeable>> list = this.$sequences;
        MeasureScope measureScope = this.$this_Layout;
        float f8 = this.$mainAxisSpacing;
        int i8 = this.$mainAxisLayoutSize;
        List<Integer> list2 = this.$crossAxisPositions;
        int i9 = 0;
        for (Object obj : list) {
            int i10 = i9 + 1;
            if (i9 < 0) {
                AbstractC1435t.w();
            }
            List list3 = (List) obj;
            int size = list3.size();
            int[] iArr = new int[size];
            int i11 = 0;
            while (i11 < size) {
                iArr[i11] = ((Placeable) list3.get(i11)).getWidth() + (i11 < AbstractC1435t.o(list3) ? measureScope.mo419roundToPx0680j_4(f8) : 0);
                i11++;
            }
            Arrangement.Vertical bottom = Arrangement.INSTANCE.getBottom();
            int[] iArr2 = new int[size];
            for (int i12 = 0; i12 < size; i12++) {
                iArr2[i12] = 0;
            }
            bottom.arrange(measureScope, i8, iArr, iArr2);
            int i13 = 0;
            for (Object obj2 : list3) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    AbstractC1435t.w();
                }
                Placeable.PlacementScope.place$default(layout, (Placeable) obj2, iArr2[i13], list2.get(i9).intValue(), 0.0f, 4, null);
                i13 = i14;
                iArr2 = iArr2;
            }
            i9 = i10;
        }
    }
}
