package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
public final class LazyStaggeredGridLaneInfo$getGaps$$inlined$binarySearchBy$default$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Comparable $key;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridLaneInfo$getGaps$$inlined$binarySearchBy$default$1(Comparable comparable) {
        super(1);
        this.$key = comparable;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Integer invoke(LazyStaggeredGridLaneInfo.SpannedItem spannedItem) {
        return Integer.valueOf(T5.a.a(Integer.valueOf(spannedItem.getIndex()), this.$key));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((LazyStaggeredGridLaneInfo.SpannedItem) obj);
    }
}
