package androidx.compose.foundation.lazy.staggeredgrid;

import R5.AbstractC1428l;
import R5.N;
import i6.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LazyStaggeredGridState$firstVisibleItemIndex$2 extends AbstractC3293z implements Function0 {
    final /* synthetic */ LazyStaggeredGridState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridState$firstVisibleItemIndex$2(LazyStaggeredGridState lazyStaggeredGridState) {
        super(0);
        this.this$0 = lazyStaggeredGridState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        Integer num;
        int[] indices = this.this$0.getScrollPosition$foundation_release().getIndices();
        if (indices.length == 0) {
            num = null;
        } else {
            int i8 = indices[0];
            if (i8 == -1) {
                i8 = 0;
            }
            Integer valueOf = Integer.valueOf(i8);
            N it = new i(1, AbstractC1428l.g0(indices)).iterator();
            while (it.hasNext()) {
                int i9 = indices[it.nextInt()];
                if (i9 == -1) {
                    i9 = 0;
                }
                Integer valueOf2 = Integer.valueOf(i9);
                if (valueOf.compareTo(valueOf2) > 0) {
                    valueOf = valueOf2;
                }
            }
            num = valueOf;
        }
        return Integer.valueOf(num != null ? num.intValue() : 0);
    }
}
