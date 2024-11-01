package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.SiblingsAlignedNode;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class WithAlignmentLineElement extends ModifierNodeElement<SiblingsAlignedNode.WithAlignmentLineNode> {
    private final AlignmentLine alignmentLine;

    public WithAlignmentLineElement(AlignmentLine alignmentLine) {
        AbstractC3292y.i(alignmentLine, "alignmentLine");
        this.alignmentLine = alignmentLine;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        WithAlignmentLineElement withAlignmentLineElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof WithAlignmentLineElement) {
            withAlignmentLineElement = (WithAlignmentLineElement) obj;
        } else {
            withAlignmentLineElement = null;
        }
        if (withAlignmentLineElement == null) {
            return false;
        }
        return AbstractC3292y.d(this.alignmentLine, withAlignmentLineElement.alignmentLine);
    }

    public final AlignmentLine getAlignmentLine() {
        return this.alignmentLine;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.alignmentLine.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        AbstractC3292y.i(inspectorInfo, "<this>");
        inspectorInfo.setName("alignBy");
        inspectorInfo.setValue(this.alignmentLine);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public SiblingsAlignedNode.WithAlignmentLineNode create() {
        return new SiblingsAlignedNode.WithAlignmentLineNode(this.alignmentLine);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(SiblingsAlignedNode.WithAlignmentLineNode node) {
        AbstractC3292y.i(node, "node");
        node.setAlignmentLine(this.alignmentLine);
    }
}
