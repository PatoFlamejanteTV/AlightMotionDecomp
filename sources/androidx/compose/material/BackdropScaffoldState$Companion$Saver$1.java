package androidx.compose.material;

import androidx.compose.runtime.saveable.SaverScope;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class BackdropScaffoldState$Companion$Saver$1 extends AbstractC3293z implements InterfaceC2072n {
    public static final BackdropScaffoldState$Companion$Saver$1 INSTANCE = new BackdropScaffoldState$Companion$Saver$1();

    BackdropScaffoldState$Companion$Saver$1() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public final BackdropValue invoke(SaverScope Saver, BackdropScaffoldState it) {
        AbstractC3292y.i(Saver, "$this$Saver");
        AbstractC3292y.i(it, "it");
        return it.getCurrentValue();
    }
}
