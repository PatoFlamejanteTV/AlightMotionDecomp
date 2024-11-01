package androidx.compose.material;

import androidx.compose.runtime.saveable.SaverScope;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class ModalBottomSheetState$Companion$Saver$1 extends AbstractC3293z implements InterfaceC2072n {
    public static final ModalBottomSheetState$Companion$Saver$1 INSTANCE = new ModalBottomSheetState$Companion$Saver$1();

    ModalBottomSheetState$Companion$Saver$1() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public final ModalBottomSheetValue invoke(SaverScope Saver, ModalBottomSheetState it) {
        AbstractC3292y.i(Saver, "$this$Saver");
        AbstractC3292y.i(it, "it");
        return it.getCurrentValue();
    }
}
