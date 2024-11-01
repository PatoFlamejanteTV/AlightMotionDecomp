package androidx.compose.foundation.lazy;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class LazyListState$Companion$Saver$2 extends AbstractC3293z implements Function1 {
    public static final LazyListState$Companion$Saver$2 INSTANCE = new LazyListState$Companion$Saver$2();

    LazyListState$Companion$Saver$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final LazyListState invoke(List<Integer> it) {
        AbstractC3292y.i(it, "it");
        return new LazyListState(it.get(0).intValue(), it.get(1).intValue());
    }
}
