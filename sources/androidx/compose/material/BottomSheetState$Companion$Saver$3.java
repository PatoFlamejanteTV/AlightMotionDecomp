package androidx.compose.material;

import androidx.compose.runtime.saveable.SaverScope;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class BottomSheetState$Companion$Saver$3 extends AbstractC3293z implements InterfaceC2072n {
    public static final BottomSheetState$Companion$Saver$3 INSTANCE = new BottomSheetState$Companion$Saver$3();

    BottomSheetState$Companion$Saver$3() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public final BottomSheetValue invoke(SaverScope Saver, BottomSheetState it) {
        AbstractC3292y.i(Saver, "$this$Saver");
        AbstractC3292y.i(it, "it");
        return it.getAnchoredDraggableState$material_release().getCurrentValue();
    }
}
