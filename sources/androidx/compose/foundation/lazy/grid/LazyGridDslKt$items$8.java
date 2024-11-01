package androidx.compose.foundation.lazy.grid;

import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
public final class LazyGridDslKt$items$8 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ T[] $items;
    final /* synthetic */ InterfaceC2072n $span;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyGridDslKt$items$8(InterfaceC2072n interfaceC2072n, T[] tArr) {
        super(2);
        this.$span = interfaceC2072n;
        this.$items = tArr;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return GridItemSpan.m690boximpl(m700invoke_orMbw((LazyGridItemSpanScope) obj, ((Number) obj2).intValue()));
    }

    /* renamed from: invoke-_-orMbw, reason: not valid java name */
    public final long m700invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i8) {
        AbstractC3292y.i(lazyGridItemSpanScope, "$this$null");
        return ((GridItemSpan) this.$span.invoke(lazyGridItemSpanScope, this.$items[i8])).m697unboximpl();
    }
}
