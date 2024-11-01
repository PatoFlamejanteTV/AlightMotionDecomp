package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
final class BoxChildDataElement extends ModifierNodeElement<BoxChildDataNode> {
    private final Alignment alignment;
    private final Function1 inspectorInfo;
    private final boolean matchParentSize;

    public BoxChildDataElement(Alignment alignment, boolean z8, Function1 inspectorInfo) {
        AbstractC3292y.i(alignment, "alignment");
        AbstractC3292y.i(inspectorInfo, "inspectorInfo");
        this.alignment = alignment;
        this.matchParentSize = z8;
        this.inspectorInfo = inspectorInfo;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        BoxChildDataElement boxChildDataElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof BoxChildDataElement) {
            boxChildDataElement = (BoxChildDataElement) obj;
        } else {
            boxChildDataElement = null;
        }
        if (boxChildDataElement != null && AbstractC3292y.d(this.alignment, boxChildDataElement.alignment) && this.matchParentSize == boxChildDataElement.matchParentSize) {
            return true;
        }
        return false;
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final Function1 getInspectorInfo() {
        return this.inspectorInfo;
    }

    public final boolean getMatchParentSize() {
        return this.matchParentSize;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (this.alignment.hashCode() * 31) + androidx.compose.foundation.a.a(this.matchParentSize);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        AbstractC3292y.i(inspectorInfo, "<this>");
        this.inspectorInfo.invoke(inspectorInfo);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public BoxChildDataNode create() {
        return new BoxChildDataNode(this.alignment, this.matchParentSize);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(BoxChildDataNode node) {
        AbstractC3292y.i(node, "node");
        node.setAlignment(this.alignment);
        node.setMatchParentSize(this.matchParentSize);
    }
}
