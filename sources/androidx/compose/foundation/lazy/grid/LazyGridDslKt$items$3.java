package androidx.compose.foundation.lazy.grid;

import c6.InterfaceC2072n;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
public final class LazyGridDslKt$items$3 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ List<T> $items;
    final /* synthetic */ InterfaceC2072n $span;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridDslKt$items$3(InterfaceC2072n interfaceC2072n, List<? extends T> list) {
        super(2);
        this.$span = interfaceC2072n;
        this.$items = list;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return GridItemSpan.m690boximpl(m699invoke_orMbw((LazyGridItemSpanScope) obj, ((Number) obj2).intValue()));
    }

    /* renamed from: invoke-_-orMbw, reason: not valid java name */
    public final long m699invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i8) {
        AbstractC3292y.i(lazyGridItemSpanScope, "$this$null");
        return ((GridItemSpan) this.$span.invoke(lazyGridItemSpanScope, this.$items.get(i8))).m697unboximpl();
    }
}
