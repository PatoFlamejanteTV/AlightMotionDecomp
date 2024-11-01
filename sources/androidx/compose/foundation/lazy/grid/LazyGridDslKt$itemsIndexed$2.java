package androidx.compose.foundation.lazy.grid;

import c6.InterfaceC2072n;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
public final class LazyGridDslKt$itemsIndexed$2 extends AbstractC3293z implements Function1 {
    final /* synthetic */ List<T> $items;
    final /* synthetic */ InterfaceC2072n $key;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridDslKt$itemsIndexed$2(InterfaceC2072n interfaceC2072n, List<? extends T> list) {
        super(1);
        this.$key = interfaceC2072n;
        this.$items = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final Object invoke(int i8) {
        return this.$key.invoke(Integer.valueOf(i8), this.$items.get(i8));
    }
}
