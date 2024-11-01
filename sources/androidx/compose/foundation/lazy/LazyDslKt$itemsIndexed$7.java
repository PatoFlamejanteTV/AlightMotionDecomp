package androidx.compose.foundation.lazy;

import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
public final class LazyDslKt$itemsIndexed$7 extends AbstractC3293z implements Function1 {
    final /* synthetic */ InterfaceC2072n $contentType;
    final /* synthetic */ T[] $items;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyDslKt$itemsIndexed$7(InterfaceC2072n interfaceC2072n, T[] tArr) {
        super(1);
        this.$contentType = interfaceC2072n;
        this.$items = tArr;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final Object invoke(int i8) {
        return this.$contentType.invoke(Integer.valueOf(i8), this.$items[i8]);
    }
}
