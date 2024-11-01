package androidx.compose.ui.draganddrop;

import androidx.compose.ui.node.TraversableNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.T;

/* loaded from: classes.dex */
public final class DragAndDropNode$Companion$firstChildOrNull$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ T $match;
    final /* synthetic */ Function1 $predicate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragAndDropNode$Companion$firstChildOrNull$1(Function1 function1, T t8) {
        super(1);
        this.$predicate = function1;
        this.$match = t8;
    }

    @Override // kotlin.jvm.functions.Function1
    public final TraversableNode.Companion.TraverseDescendantsAction invoke(TraversableNode traversableNode) {
        if ((traversableNode instanceof DragAndDropModifierNode) && ((Boolean) this.$predicate.invoke(traversableNode)).booleanValue()) {
            this.$match.f34573a = traversableNode;
            return TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal;
        }
        return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
    }
}
