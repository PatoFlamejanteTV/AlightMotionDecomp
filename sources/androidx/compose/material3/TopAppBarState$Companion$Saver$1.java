package androidx.compose.material3;

import R5.AbstractC1435t;
import androidx.compose.runtime.saveable.SaverScope;
import c6.InterfaceC2072n;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class TopAppBarState$Companion$Saver$1 extends AbstractC3293z implements InterfaceC2072n {
    public static final TopAppBarState$Companion$Saver$1 INSTANCE = new TopAppBarState$Companion$Saver$1();

    TopAppBarState$Companion$Saver$1() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public final List<Float> invoke(SaverScope listSaver, TopAppBarState it) {
        AbstractC3292y.i(listSaver, "$this$listSaver");
        AbstractC3292y.i(it, "it");
        return AbstractC1435t.p(Float.valueOf(it.getHeightOffsetLimit()), Float.valueOf(it.getHeightOffset()), Float.valueOf(it.getContentOffset()));
    }
}
