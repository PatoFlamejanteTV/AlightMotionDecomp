package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class DraggableKt$draggable$3 extends AbstractC3293z implements Function1 {
    public static final DraggableKt$draggable$3 INSTANCE = new DraggableKt$draggable$3();

    DraggableKt$draggable$3() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(PointerInputChange it) {
        AbstractC3292y.i(it, "it");
        return Boolean.TRUE;
    }
}
