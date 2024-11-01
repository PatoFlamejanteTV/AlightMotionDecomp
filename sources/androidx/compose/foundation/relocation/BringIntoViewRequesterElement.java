package androidx.compose.foundation.relocation;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC3292y;

@ExperimentalFoundationApi
/* loaded from: classes.dex */
final class BringIntoViewRequesterElement extends ModifierNodeElement<BringIntoViewRequesterNode> {
    private final BringIntoViewRequester requester;

    public BringIntoViewRequesterElement(BringIntoViewRequester requester) {
        AbstractC3292y.i(requester, "requester");
        this.requester = requester;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this != obj && (!(obj instanceof BringIntoViewRequesterElement) || !AbstractC3292y.d(this.requester, ((BringIntoViewRequesterElement) obj).requester))) {
            return false;
        }
        return true;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.requester.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        AbstractC3292y.i(inspectorInfo, "<this>");
        inspectorInfo.setName("bringIntoViewRequester");
        inspectorInfo.getProperties().set("bringIntoViewRequester", this.requester);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public BringIntoViewRequesterNode create() {
        return new BringIntoViewRequesterNode(this.requester);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(BringIntoViewRequesterNode node) {
        AbstractC3292y.i(node, "node");
        node.updateRequester(this.requester);
    }
}
