package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LazyStaggeredGridState$firstVisibleItemScrollOffset$2 extends AbstractC3293z implements Function0 {
    final /* synthetic */ LazyStaggeredGridState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridState$firstVisibleItemScrollOffset$2(LazyStaggeredGridState lazyStaggeredGridState) {
        super(0);
        this.this$0 = lazyStaggeredGridState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        int[] offsets = this.this$0.getScrollPosition$foundation_release().getOffsets();
        LazyStaggeredGridState lazyStaggeredGridState = this.this$0;
        int firstVisibleItemIndex = lazyStaggeredGridState.getFirstVisibleItemIndex();
        int[] indices = lazyStaggeredGridState.getScrollPosition$foundation_release().getIndices();
        int length = offsets.length;
        int i8 = Integer.MAX_VALUE;
        for (int i9 = 0; i9 < length; i9++) {
            if (indices[i9] == firstVisibleItemIndex) {
                i8 = Math.min(i8, offsets[i9]);
            }
        }
        return Integer.valueOf(i8 != Integer.MAX_VALUE ? i8 : 0);
    }
}
