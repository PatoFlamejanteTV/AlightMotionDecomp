package androidx.compose.material;

import androidx.compose.runtime.saveable.SaverScope;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class BottomDrawerState$Companion$Saver$3 extends AbstractC3293z implements InterfaceC2072n {
    public static final BottomDrawerState$Companion$Saver$3 INSTANCE = new BottomDrawerState$Companion$Saver$3();

    BottomDrawerState$Companion$Saver$3() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public final BottomDrawerValue invoke(SaverScope Saver, BottomDrawerState it) {
        AbstractC3292y.i(Saver, "$this$Saver");
        AbstractC3292y.i(it, "it");
        return it.getAnchoredDraggableState$material_release().getCurrentValue();
    }
}
