package androidx.compose.foundation.pager;

import Q5.I;
import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class PagerMeasureKt$measurePager$6 extends AbstractC3293z implements Function1 {
    final /* synthetic */ List<MeasuredPage> $positionedPages;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerMeasureKt$measurePager$6(List<MeasuredPage> list) {
        super(1);
        this.$positionedPages = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return I.f8786a;
    }

    public final void invoke(Placeable.PlacementScope invoke) {
        AbstractC3292y.i(invoke, "$this$invoke");
        List<MeasuredPage> list = this.$positionedPages;
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            list.get(i8).place(invoke);
        }
    }
}
