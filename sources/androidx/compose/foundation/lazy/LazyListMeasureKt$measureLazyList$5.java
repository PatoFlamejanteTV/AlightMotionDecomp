package androidx.compose.foundation.lazy;

import Q5.I;
import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class LazyListMeasureKt$measureLazyList$5 extends AbstractC3293z implements Function1 {
    final /* synthetic */ LazyListMeasuredItem $headerItem;
    final /* synthetic */ List<LazyListMeasuredItem> $positionedItems;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListMeasureKt$measureLazyList$5(List<LazyListMeasuredItem> list, LazyListMeasuredItem lazyListMeasuredItem) {
        super(1);
        this.$positionedItems = list;
        this.$headerItem = lazyListMeasuredItem;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return I.f8786a;
    }

    public final void invoke(Placeable.PlacementScope invoke) {
        AbstractC3292y.i(invoke, "$this$invoke");
        List<LazyListMeasuredItem> list = this.$positionedItems;
        LazyListMeasuredItem lazyListMeasuredItem = this.$headerItem;
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            LazyListMeasuredItem lazyListMeasuredItem2 = list.get(i8);
            if (lazyListMeasuredItem2 != lazyListMeasuredItem) {
                lazyListMeasuredItem2.place(invoke);
            }
        }
        LazyListMeasuredItem lazyListMeasuredItem3 = this.$headerItem;
        if (lazyListMeasuredItem3 != null) {
            lazyListMeasuredItem3.place(invoke);
        }
    }
}
