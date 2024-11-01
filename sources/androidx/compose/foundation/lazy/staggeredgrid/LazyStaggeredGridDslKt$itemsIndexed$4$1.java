package androidx.compose.foundation.lazy.staggeredgrid;

import c6.InterfaceC2072n;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class LazyStaggeredGridDslKt$itemsIndexed$4$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ List<T> $items;
    final /* synthetic */ InterfaceC2072n $span;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyStaggeredGridDslKt$itemsIndexed$4$1(InterfaceC2072n interfaceC2072n, List<? extends T> list) {
        super(1);
        this.$span = interfaceC2072n;
        this.$items = list;
    }

    public final StaggeredGridItemSpan invoke(int i8) {
        return (StaggeredGridItemSpan) this.$span.invoke(Integer.valueOf(i8), this.$items.get(i8));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
