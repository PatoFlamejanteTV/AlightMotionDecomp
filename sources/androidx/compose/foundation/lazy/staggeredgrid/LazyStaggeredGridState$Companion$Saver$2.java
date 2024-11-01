package androidx.compose.foundation.lazy.staggeredgrid;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class LazyStaggeredGridState$Companion$Saver$2 extends AbstractC3293z implements Function1 {
    public static final LazyStaggeredGridState$Companion$Saver$2 INSTANCE = new LazyStaggeredGridState$Companion$Saver$2();

    LazyStaggeredGridState$Companion$Saver$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final LazyStaggeredGridState invoke(List<int[]> it) {
        AbstractC3292y.i(it, "it");
        return new LazyStaggeredGridState(it.get(0), it.get(1), null);
    }
}
