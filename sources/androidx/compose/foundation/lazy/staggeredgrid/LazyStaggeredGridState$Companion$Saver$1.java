package androidx.compose.foundation.lazy.staggeredgrid;

import R5.AbstractC1435t;
import androidx.compose.runtime.saveable.SaverScope;
import c6.InterfaceC2072n;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class LazyStaggeredGridState$Companion$Saver$1 extends AbstractC3293z implements InterfaceC2072n {
    public static final LazyStaggeredGridState$Companion$Saver$1 INSTANCE = new LazyStaggeredGridState$Companion$Saver$1();

    LazyStaggeredGridState$Companion$Saver$1() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public final List<int[]> invoke(SaverScope listSaver, LazyStaggeredGridState state) {
        AbstractC3292y.i(listSaver, "$this$listSaver");
        AbstractC3292y.i(state, "state");
        return AbstractC1435t.p(state.getScrollPosition$foundation_release().getIndices(), state.getScrollPosition$foundation_release().getOffsets());
    }
}
