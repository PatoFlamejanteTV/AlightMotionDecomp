package androidx.compose.foundation.lazy.grid;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LazyGridStateKt$rememberLazyGridState$1$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ int $initialFirstVisibleItemIndex;
    final /* synthetic */ int $initialFirstVisibleItemScrollOffset;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyGridStateKt$rememberLazyGridState$1$1(int i8, int i9) {
        super(0);
        this.$initialFirstVisibleItemIndex = i8;
        this.$initialFirstVisibleItemScrollOffset = i9;
    }

    @Override // kotlin.jvm.functions.Function0
    public final LazyGridState invoke() {
        return new LazyGridState(this.$initialFirstVisibleItemIndex, this.$initialFirstVisibleItemScrollOffset);
    }
}
