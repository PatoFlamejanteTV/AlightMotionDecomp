package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class LazyStaggeredGridDslKt$items$9$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ T[] $items;
    final /* synthetic */ Function1 $span;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridDslKt$items$9$1(Function1 function1, T[] tArr) {
        super(1);
        this.$span = function1;
        this.$items = tArr;
    }

    public final StaggeredGridItemSpan invoke(int i8) {
        return (StaggeredGridItemSpan) this.$span.invoke(this.$items[i8]);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
