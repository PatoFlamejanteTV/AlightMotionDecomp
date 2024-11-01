package androidx.compose.ui.draganddrop;

import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.TraversableNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.T;

/* loaded from: classes.dex */
public final class DragAndDropNode$onMoved$$inlined$firstChildOrNull$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ DragAndDropEvent $event$inlined;
    final /* synthetic */ T $match;
    final /* synthetic */ DragAndDropNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragAndDropNode$onMoved$$inlined$firstChildOrNull$1(T t8, DragAndDropNode dragAndDropNode, DragAndDropEvent dragAndDropEvent) {
        super(1);
        this.$match = t8;
        this.this$0 = dragAndDropNode;
        this.$event$inlined = dragAndDropEvent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final TraversableNode.Companion.TraverseDescendantsAction invoke(TraversableNode traversableNode) {
        if (traversableNode instanceof DragAndDropModifierNode) {
            DragAndDropModifierNode dragAndDropModifierNode = (DragAndDropModifierNode) traversableNode;
            if (DelegatableNodeKt.requireOwner(this.this$0).getDragAndDropManager().isInterestedNode(dragAndDropModifierNode) && DragAndDropNodeKt.m2599access$containsUv8p0NA(dragAndDropModifierNode, DragAndDrop_androidKt.getPositionInRoot(this.$event$inlined))) {
                this.$match.f34573a = traversableNode;
                return TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal;
            }
        }
        return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
    }
}
