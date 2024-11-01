package androidx.compose.foundation.lazy.grid;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class LazyGridAnimateScrollScope$calculateLineAverageMainAxisSize$lineOf$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ boolean $isVertical;
    final /* synthetic */ List<LazyGridItemInfo> $visibleItems;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridAnimateScrollScope$calculateLineAverageMainAxisSize$lineOf$1(boolean z8, List<? extends LazyGridItemInfo> list) {
        super(1);
        this.$isVertical = z8;
        this.$visibleItems = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final Integer invoke(int i8) {
        return Integer.valueOf(this.$isVertical ? this.$visibleItems.get(i8).getRow() : this.$visibleItems.get(i8).getColumn());
    }
}
