package androidx.compose.foundation.lazy.staggeredgrid;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class LazyStaggeredGridDslKt$items$2$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ List<T> $items;
    final /* synthetic */ Function1 $key;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyStaggeredGridDslKt$items$2$1(Function1 function1, List<? extends T> list) {
        super(1);
        this.$key = function1;
        this.$items = list;
    }

    public final Object invoke(int i8) {
        return this.$key.invoke(this.$items.get(i8));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
