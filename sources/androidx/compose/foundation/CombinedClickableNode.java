package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.semantics.Role;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
final class CombinedClickableNode extends AbstractClickableNode {
    private final CombinedClickablePointerInputNode clickablePointerInputNode;
    private final ClickableSemanticsNode clickableSemanticsNode;
    private Function0 onLongClick;

    public /* synthetic */ CombinedClickableNode(MutableInteractionSource mutableInteractionSource, boolean z8, String str, Role role, Function0 function0, String str2, Function0 function02, Function0 function03, AbstractC3284p abstractC3284p) {
        this(mutableInteractionSource, z8, str, role, function0, str2, function02, function03);
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public ClickableSemanticsNode getClickableSemanticsNode() {
        return this.clickableSemanticsNode;
    }

    /* renamed from: update-cJG_KMw, reason: not valid java name */
    public final void m309updatecJG_KMw(MutableInteractionSource interactionSource, boolean z8, String str, Role role, Function0 onClick, String str2, Function0 function0, Function0 function02) {
        boolean z9;
        AbstractC3292y.i(interactionSource, "interactionSource");
        AbstractC3292y.i(onClick, "onClick");
        boolean z10 = false;
        if (this.onLongClick == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (function0 == null) {
            z10 = true;
        }
        if (z9 != z10) {
            disposeInteractionSource();
        }
        this.onLongClick = function0;
        m244updateCommonXHw0xAI(interactionSource, z8, str, role, onClick);
        getClickableSemanticsNode().m304updateUMe6uN4(z8, str, role, onClick, str2, function0);
        getClickablePointerInputNode().update(z8, interactionSource, onClick, function0, function02);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private CombinedClickableNode(MutableInteractionSource interactionSource, boolean z8, String str, Role role, Function0 onClick, String str2, Function0 function0, Function0 function02) {
        super(interactionSource, z8, str, role, onClick, null);
        AbstractC3292y.i(interactionSource, "interactionSource");
        AbstractC3292y.i(onClick, "onClick");
        this.onLongClick = function0;
        this.clickableSemanticsNode = (ClickableSemanticsNode) delegate(new ClickableSemanticsNode(z8, str, role, onClick, str2, function0, null));
        this.clickablePointerInputNode = (CombinedClickablePointerInputNode) delegate(new CombinedClickablePointerInputNode(z8, interactionSource, onClick, getInteractionData(), this.onLongClick, function02));
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public CombinedClickablePointerInputNode getClickablePointerInputNode() {
        return this.clickablePointerInputNode;
    }
}
