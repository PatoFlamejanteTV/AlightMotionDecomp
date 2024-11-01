package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class HorizontalAlignNode extends Modifier.Node implements ParentDataModifierNode {
    private Alignment.Horizontal horizontal;

    public HorizontalAlignNode(Alignment.Horizontal horizontal) {
        AbstractC3292y.i(horizontal, "horizontal");
        this.horizontal = horizontal;
    }

    public final Alignment.Horizontal getHorizontal() {
        return this.horizontal;
    }

    public final void setHorizontal(Alignment.Horizontal horizontal) {
        AbstractC3292y.i(horizontal, "<set-?>");
        this.horizontal = horizontal;
    }

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    public RowColumnParentData modifyParentData(Density density, Object obj) {
        AbstractC3292y.i(density, "<this>");
        RowColumnParentData rowColumnParentData = obj instanceof RowColumnParentData ? (RowColumnParentData) obj : null;
        if (rowColumnParentData == null) {
            rowColumnParentData = new RowColumnParentData(0.0f, false, null, 7, null);
        }
        rowColumnParentData.setCrossAxisAlignment(CrossAxisAlignment.Companion.horizontal$foundation_layout_release(this.horizontal));
        return rowColumnParentData;
    }
}
