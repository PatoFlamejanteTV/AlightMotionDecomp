package androidx.compose.material;

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
        int size = list.size();
        int i9 = 0;
        while (i9 < size) {
            List<Placeable> list3 = list.get(i9);
            int size2 = list3.size();
            int[] iArr = new int[size2];
            int i10 = 0;
            while (i10 < size2) {
                iArr[i10] = list3.get(i10).getWidth() + (i10 < AbstractC1435t.o(list3) ? measureScope.mo419roundToPx0680j_4(f8) : 0);
                i10++;
            }
            Arrangement.Vertical bottom = Arrangement.INSTANCE.getBottom();
            int[] iArr2 = new int[size2];
            for (int i11 = 0; i11 < size2; i11++) {
                iArr2[i11] = 0;
            }
            bottom.arrange(measureScope, i8, iArr, iArr2);
            int size3 = list3.size();
            int i12 = 0;
            while (i12 < size3) {
                Placeable.PlacementScope.place$default(layout, list3.get(i12), iArr2[i12], list2.get(i9).intValue(), 0.0f, 4, null);
                i12++;
                size3 = size3;
                iArr2 = iArr2;
                i9 = i9;
                list3 = list3;
            }
            i9++;
        }
    }
}
