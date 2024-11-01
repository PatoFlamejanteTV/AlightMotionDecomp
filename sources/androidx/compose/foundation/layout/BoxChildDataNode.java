package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
final class BoxChildDataNode extends Modifier.Node implements ParentDataModifierNode {
    private Alignment alignment;
    private boolean matchParentSize;

    public BoxChildDataNode(Alignment alignment, boolean z8) {
        AbstractC3292y.i(alignment, "alignment");
        this.alignment = alignment;
        this.matchParentSize = z8;
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final boolean getMatchParentSize() {
        return this.matchParentSize;
    }

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    public BoxChildDataNode modifyParentData(Density density, Object obj) {
        AbstractC3292y.i(density, "<this>");
        return this;
    }

    public final void setAlignment(Alignment alignment) {
        AbstractC3292y.i(alignment, "<set-?>");
        this.alignment = alignment;
    }

    public final void setMatchParentSize(boolean z8) {
        this.matchParentSize = z8;
    }
}
