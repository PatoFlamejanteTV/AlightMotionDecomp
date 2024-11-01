package androidx.compose.foundation.gestures;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DraggableNode$_startDragImmediately$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ DraggableNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraggableNode$_startDragImmediately$1(DraggableNode draggableNode) {
        super(0);
        this.this$0 = draggableNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        Function0 function0;
        function0 = this.this$0.startDragImmediately;
        return (Boolean) function0.invoke();
    }
}
