package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class VerticalAlignElement extends ModifierNodeElement<VerticalAlignNode> {
    private final Alignment.Vertical alignment;

    public VerticalAlignElement(Alignment.Vertical alignment) {
        AbstractC3292y.i(alignment, "alignment");
        this.alignment = alignment;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        VerticalAlignElement verticalAlignElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof VerticalAlignElement) {
            verticalAlignElement = (VerticalAlignElement) obj;
        } else {
            verticalAlignElement = null;
        }
        if (verticalAlignElement == null) {
            return false;
        }
        return AbstractC3292y.d(this.alignment, verticalAlignElement.alignment);
    }

    public final Alignment.Vertical getAlignment() {
        return this.alignment;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.alignment.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        AbstractC3292y.i(inspectorInfo, "<this>");
        inspectorInfo.setName("align");
        inspectorInfo.setValue(this.alignment);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public VerticalAlignNode create() {
        return new VerticalAlignNode(this.alignment);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(VerticalAlignNode node) {
        AbstractC3292y.i(node, "node");
        node.setVertical(this.alignment);
    }
}
