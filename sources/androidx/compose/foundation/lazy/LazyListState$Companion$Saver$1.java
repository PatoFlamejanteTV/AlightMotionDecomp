package androidx.compose.foundation.lazy;

import R5.AbstractC1435t;
import androidx.compose.runtime.saveable.SaverScope;
import c6.InterfaceC2072n;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class LazyListState$Companion$Saver$1 extends AbstractC3293z implements InterfaceC2072n {
    public static final LazyListState$Companion$Saver$1 INSTANCE = new LazyListState$Companion$Saver$1();

    LazyListState$Companion$Saver$1() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public final List<Integer> invoke(SaverScope listSaver, LazyListState it) {
        AbstractC3292y.i(listSaver, "$this$listSaver");
        AbstractC3292y.i(it, "it");
        return AbstractC1435t.p(Integer.valueOf(it.getFirstVisibleItemIndex()), Integer.valueOf(it.getFirstVisibleItemScrollOffset()));
    }
}
