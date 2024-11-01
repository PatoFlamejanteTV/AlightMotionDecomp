package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DraggableNode$_canDrag$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ DraggableNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraggableNode$_canDrag$1(DraggableNode draggableNode) {
        super(1);
        this.this$0 = draggableNode;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(PointerInputChange it) {
        Function1 function1;
        AbstractC3292y.i(it, "it");
        function1 = this.this$0.canDrag;
        return (Boolean) function1.invoke(it);
    }
}
