package androidx.compose.foundation.relocation;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public final class BringIntoViewResponderElement extends ModifierNodeElement<BringIntoViewResponderNode> {
    private final BringIntoViewResponder responder;

    public BringIntoViewResponderElement(BringIntoViewResponder responder) {
        AbstractC3292y.i(responder, "responder");
        this.responder = responder;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this != obj && (!(obj instanceof BringIntoViewResponderElement) || !AbstractC3292y.d(this.responder, ((BringIntoViewResponderElement) obj).responder))) {
            return false;
        }
        return true;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.responder.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        AbstractC3292y.i(inspectorInfo, "<this>");
        inspectorInfo.setName("bringIntoViewResponder");
        inspectorInfo.getProperties().set("responder", this.responder);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public BringIntoViewResponderNode create() {
        return new BringIntoViewResponderNode(this.responder);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(BringIntoViewResponderNode node) {
        AbstractC3292y.i(node, "node");
        node.setResponder(this.responder);
    }
}
