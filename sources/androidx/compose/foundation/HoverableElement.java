package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
final class HoverableElement extends ModifierNodeElement<HoverableNode> {
    private final MutableInteractionSource interactionSource;

    public HoverableElement(MutableInteractionSource interactionSource) {
        AbstractC3292y.i(interactionSource, "interactionSource");
        this.interactionSource = interactionSource;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof HoverableElement) && AbstractC3292y.d(((HoverableElement) obj).interactionSource, this.interactionSource)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.interactionSource.hashCode() * 31;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        AbstractC3292y.i(inspectorInfo, "<this>");
        inspectorInfo.setName("hoverable");
        inspectorInfo.getProperties().set("interactionSource", this.interactionSource);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public HoverableNode create() {
        return new HoverableNode(this.interactionSource);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(HoverableNode node) {
        AbstractC3292y.i(node, "node");
        node.updateInteractionSource(this.interactionSource);
    }
}
