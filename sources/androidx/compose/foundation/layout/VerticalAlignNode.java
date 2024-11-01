package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class VerticalAlignNode extends Modifier.Node implements ParentDataModifierNode {
    private Alignment.Vertical vertical;

    public VerticalAlignNode(Alignment.Vertical vertical) {
        AbstractC3292y.i(vertical, "vertical");
        this.vertical = vertical;
    }

    public final Alignment.Vertical getVertical() {
        return this.vertical;
    }

    public final void setVertical(Alignment.Vertical vertical) {
        AbstractC3292y.i(vertical, "<set-?>");
        this.vertical = vertical;
    }

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    public RowColumnParentData modifyParentData(Density density, Object obj) {
        AbstractC3292y.i(density, "<this>");
        RowColumnParentData rowColumnParentData = obj instanceof RowColumnParentData ? (RowColumnParentData) obj : null;
        if (rowColumnParentData == null) {
            rowColumnParentData = new RowColumnParentData(0.0f, false, null, 7, null);
        }
        rowColumnParentData.setCrossAxisAlignment(CrossAxisAlignment.Companion.vertical$foundation_layout_release(this.vertical));
        return rowColumnParentData;
    }
}
