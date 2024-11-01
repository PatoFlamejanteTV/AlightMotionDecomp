package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class LazyStaggeredGridIntervalContent$item$3$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ StaggeredGridItemSpan $span;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridIntervalContent$item$3$1(StaggeredGridItemSpan staggeredGridItemSpan) {
        super(1);
        this.$span = staggeredGridItemSpan;
    }

    public final StaggeredGridItemSpan invoke(int i8) {
        return this.$span;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
