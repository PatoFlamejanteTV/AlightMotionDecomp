package androidx.compose.material3;

import androidx.compose.runtime.saveable.SaverScope;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class DrawerState$Companion$Saver$1 extends AbstractC3293z implements InterfaceC2072n {
    public static final DrawerState$Companion$Saver$1 INSTANCE = new DrawerState$Companion$Saver$1();

    DrawerState$Companion$Saver$1() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public final DrawerValue invoke(SaverScope Saver, DrawerState it) {
        AbstractC3292y.i(Saver, "$this$Saver");
        AbstractC3292y.i(it, "it");
        return it.getCurrentValue();
    }
}
