package androidx.compose.ui.input.pointer;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.T;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class PointerHoverIconModifierNode$findOverridingAncestorNode$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ T $pointerHoverIconModifierNode;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointerHoverIconModifierNode$findOverridingAncestorNode$1(T t8) {
        super(1);
        this.$pointerHoverIconModifierNode = t8;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(PointerHoverIconModifierNode pointerHoverIconModifierNode) {
        boolean z8;
        if (pointerHoverIconModifierNode.getOverrideDescendants()) {
            z8 = pointerHoverIconModifierNode.cursorInBoundsOfNode;
            if (z8) {
                this.$pointerHoverIconModifierNode.f34573a = pointerHoverIconModifierNode;
            }
        }
        return Boolean.TRUE;
    }
}
