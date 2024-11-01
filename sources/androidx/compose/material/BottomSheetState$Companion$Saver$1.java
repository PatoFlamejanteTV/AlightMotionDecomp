package androidx.compose.material;

import androidx.compose.runtime.saveable.SaverScope;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class BottomSheetState$Companion$Saver$1 extends AbstractC3293z implements InterfaceC2072n {
    public static final BottomSheetState$Companion$Saver$1 INSTANCE = new BottomSheetState$Companion$Saver$1();

    BottomSheetState$Companion$Saver$1() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public final BottomSheetValue invoke(SaverScope Saver, BottomSheetState it) {
        AbstractC3292y.i(Saver, "$this$Saver");
        AbstractC3292y.i(it, "it");
        return it.getAnchoredDraggableState$material_release().getCurrentValue();
    }
}
