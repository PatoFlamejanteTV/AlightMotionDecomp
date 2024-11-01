package androidx.compose.ui.draganddrop;

import Q5.I;
import androidx.compose.ui.node.DelegatableNodeKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.O;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DragAndDropNode$acceptDragAndDropTransfer$2 extends AbstractC3293z implements Function1 {
    final /* synthetic */ O $handledByChild;
    final /* synthetic */ DragAndDropEvent $startEvent;
    final /* synthetic */ DragAndDropNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragAndDropNode$acceptDragAndDropTransfer$2(O o8, DragAndDropEvent dragAndDropEvent, DragAndDropNode dragAndDropNode) {
        super(1);
        this.$handledByChild = o8;
        this.$startEvent = dragAndDropEvent;
        this.this$0 = dragAndDropNode;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(DragAndDropNode dragAndDropNode) {
        O o8 = this.$handledByChild;
        boolean z8 = o8.f34569a;
        boolean acceptDragAndDropTransfer = dragAndDropNode.acceptDragAndDropTransfer(this.$startEvent);
        DragAndDropNode dragAndDropNode2 = this.this$0;
        if (acceptDragAndDropTransfer) {
            DelegatableNodeKt.requireOwner(dragAndDropNode2).getDragAndDropManager().registerNodeInterest(dragAndDropNode);
        }
        I i8 = I.f8786a;
        o8.f34569a = z8 | acceptDragAndDropTransfer;
        return Boolean.TRUE;
    }
}
