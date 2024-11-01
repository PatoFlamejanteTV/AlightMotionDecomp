package androidx.compose.foundation.lazy;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class LazyListIntervalContent$item$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Object $key;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListIntervalContent$item$1(Object obj) {
        super(1);
        this.$key = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final Object invoke(int i8) {
        return this.$key;
    }
}
