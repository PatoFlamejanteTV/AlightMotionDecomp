package androidx.compose.ui.draganddrop;

import androidx.compose.ui.node.DelegatableNode;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public interface DragAndDropModifierNode extends DelegatableNode, DragAndDropTarget {
    boolean acceptDragAndDropTransfer(DragAndDropEvent dragAndDropEvent);

    /* renamed from: drag-12SF9DM, reason: not valid java name */
    void mo2598drag12SF9DM(DragAndDropTransferData dragAndDropTransferData, long j8, Function1 function1);
}
