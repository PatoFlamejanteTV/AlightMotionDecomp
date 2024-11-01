package androidx.compose.foundation.lazy.grid;

import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class LazyGridIntervalContent$item$2$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ Function1 $span;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyGridIntervalContent$item$2$1(Function1 function1) {
        super(2);
        this.$span = function1;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return GridItemSpan.m690boximpl(m706invoke_orMbw((LazyGridItemSpanScope) obj, ((Number) obj2).intValue()));
    }

    /* renamed from: invoke-_-orMbw, reason: not valid java name */
    public final long m706invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i8) {
        AbstractC3292y.i(lazyGridItemSpanScope, "$this$null");
        return ((GridItemSpan) this.$span.invoke(lazyGridItemSpanScope)).m697unboximpl();
    }
}
