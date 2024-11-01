package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.TraversableNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.T;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class PointerHoverIconModifierNode$findDescendantNodeWithCursorInBounds$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ T $descendantNodeWithCursorInBounds;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointerHoverIconModifierNode$findDescendantNodeWithCursorInBounds$1(T t8) {
        super(1);
        this.$descendantNodeWithCursorInBounds = t8;
    }

    @Override // kotlin.jvm.functions.Function1
    public final TraversableNode.Companion.TraverseDescendantsAction invoke(PointerHoverIconModifierNode pointerHoverIconModifierNode) {
        boolean z8;
        TraversableNode.Companion.TraverseDescendantsAction traverseDescendantsAction = TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
        z8 = pointerHoverIconModifierNode.cursorInBoundsOfNode;
        if (!z8) {
            return traverseDescendantsAction;
        }
        this.$descendantNodeWithCursorInBounds.f34573a = pointerHoverIconModifierNode;
        return pointerHoverIconModifierNode.getOverrideDescendants() ? TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal : traverseDescendantsAction;
    }
}
