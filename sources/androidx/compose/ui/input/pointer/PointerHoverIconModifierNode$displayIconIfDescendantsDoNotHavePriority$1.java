package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.TraversableNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.O;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class PointerHoverIconModifierNode$displayIconIfDescendantsDoNotHavePriority$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ O $hasIconRightsOverDescendants;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointerHoverIconModifierNode$displayIconIfDescendantsDoNotHavePriority$1(O o8) {
        super(1);
        this.$hasIconRightsOverDescendants = o8;
    }

    @Override // kotlin.jvm.functions.Function1
    public final TraversableNode.Companion.TraverseDescendantsAction invoke(PointerHoverIconModifierNode pointerHoverIconModifierNode) {
        boolean z8;
        z8 = pointerHoverIconModifierNode.cursorInBoundsOfNode;
        if (z8) {
            this.$hasIconRightsOverDescendants.f34569a = false;
            return TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal;
        }
        return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
    }
}
