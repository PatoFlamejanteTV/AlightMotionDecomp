package androidx.compose.foundation;

import androidx.compose.runtime.saveable.SaverScope;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class ScrollState$Companion$Saver$1 extends AbstractC3293z implements InterfaceC2072n {
    public static final ScrollState$Companion$Saver$1 INSTANCE = new ScrollState$Companion$Saver$1();

    ScrollState$Companion$Saver$1() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public final Integer invoke(SaverScope Saver, ScrollState it) {
        AbstractC3292y.i(Saver, "$this$Saver");
        AbstractC3292y.i(it, "it");
        return Integer.valueOf(it.getValue());
    }
}
