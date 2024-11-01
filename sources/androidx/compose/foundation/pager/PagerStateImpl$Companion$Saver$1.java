package androidx.compose.foundation.pager;

import R5.AbstractC1435t;
import androidx.compose.runtime.saveable.SaverScope;
import c6.InterfaceC2072n;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class PagerStateImpl$Companion$Saver$1 extends AbstractC3293z implements InterfaceC2072n {
    public static final PagerStateImpl$Companion$Saver$1 INSTANCE = new PagerStateImpl$Companion$Saver$1();

    PagerStateImpl$Companion$Saver$1() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public final List<Object> invoke(SaverScope listSaver, PagerStateImpl it) {
        AbstractC3292y.i(listSaver, "$this$listSaver");
        AbstractC3292y.i(it, "it");
        return AbstractC1435t.p(Integer.valueOf(it.getCurrentPage()), Float.valueOf(it.getCurrentPageOffsetFraction()), Integer.valueOf(it.getPageCount()));
    }
}
