package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class HorizontalAlignElement extends ModifierNodeElement<HorizontalAlignNode> {
    private final Alignment.Horizontal horizontal;

    public HorizontalAlignElement(Alignment.Horizontal horizontal) {
        AbstractC3292y.i(horizontal, "horizontal");
        this.horizontal = horizontal;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        HorizontalAlignElement horizontalAlignElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof HorizontalAlignElement) {
            horizontalAlignElement = (HorizontalAlignElement) obj;
        } else {
            horizontalAlignElement = null;
        }
        if (horizontalAlignElement == null) {
            return false;
        }
        return AbstractC3292y.d(this.horizontal, horizontalAlignElement.horizontal);
    }

    public final Alignment.Horizontal getHorizontal() {
        return this.horizontal;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.horizontal.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        AbstractC3292y.i(inspectorInfo, "<this>");
        inspectorInfo.setName("align");
        inspectorInfo.setValue(this.horizontal);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public HorizontalAlignNode create() {
        return new HorizontalAlignNode(this.horizontal);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(HorizontalAlignNode node) {
        AbstractC3292y.i(node, "node");
        node.setHorizontal(this.horizontal);
    }
}
