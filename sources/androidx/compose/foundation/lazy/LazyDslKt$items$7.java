package androidx.compose.foundation.lazy;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
public final class LazyDslKt$items$7 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Function1 $contentType;
    final /* synthetic */ T[] $items;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyDslKt$items$7(Function1 function1, T[] tArr) {
        super(1);
        this.$contentType = function1;
        this.$items = tArr;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final Object invoke(int i8) {
        return this.$contentType.invoke(this.$items[i8]);
    }
}
