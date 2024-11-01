package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class LazyGridSpanLayoutProvider$getLineIndexOfItem$lowerBoundBucket$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ int $itemIndex;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyGridSpanLayoutProvider$getLineIndexOfItem$lowerBoundBucket$1(int i8) {
        super(1);
        this.$itemIndex = i8;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Integer invoke(LazyGridSpanLayoutProvider.Bucket it) {
        AbstractC3292y.i(it, "it");
        return Integer.valueOf(it.getFirstItemIndex() - this.$itemIndex);
    }
}
