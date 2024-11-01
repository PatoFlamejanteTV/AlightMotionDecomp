package androidx.compose.foundation.lazy.grid;

import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class LazyGridIntervalContent$Companion$DefaultSpan$1 extends AbstractC3293z implements InterfaceC2072n {
    public static final LazyGridIntervalContent$Companion$DefaultSpan$1 INSTANCE = new LazyGridIntervalContent$Companion$DefaultSpan$1();

    LazyGridIntervalContent$Companion$DefaultSpan$1() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return GridItemSpan.m690boximpl(m705invoke_orMbw((LazyGridItemSpanScope) obj, ((Number) obj2).intValue()));
    }

    /* renamed from: invoke-_-orMbw, reason: not valid java name */
    public final long m705invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i8) {
        AbstractC3292y.i(lazyGridItemSpanScope, "$this$null");
        return LazyGridSpanKt.GridItemSpan(1);
    }
}
