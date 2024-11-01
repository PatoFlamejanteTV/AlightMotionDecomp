package androidx.compose.foundation.lazy.grid;

import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
public final class LazyGridDslKt$itemsIndexed$3 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ List<T> $items;
    final /* synthetic */ InterfaceC2073o $span;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridDslKt$itemsIndexed$3(InterfaceC2073o interfaceC2073o, List<? extends T> list) {
        super(2);
        this.$span = interfaceC2073o;
        this.$items = list;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return GridItemSpan.m690boximpl(m701invoke_orMbw((LazyGridItemSpanScope) obj, ((Number) obj2).intValue()));
    }

    /* renamed from: invoke-_-orMbw, reason: not valid java name */
    public final long m701invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i8) {
        AbstractC3292y.i(lazyGridItemSpanScope, "$this$null");
        return ((GridItemSpan) this.$span.invoke(lazyGridItemSpanScope, Integer.valueOf(i8), this.$items.get(i8))).m697unboximpl();
    }
}
