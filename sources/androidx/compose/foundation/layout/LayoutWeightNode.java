package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class LayoutWeightNode extends Modifier.Node implements ParentDataModifierNode {
    private boolean fill;
    private float weight;

    public LayoutWeightNode(float f8, boolean z8) {
        this.weight = f8;
        this.fill = z8;
    }

    public final boolean getFill() {
        return this.fill;
    }

    public final float getWeight() {
        return this.weight;
    }

    public final void setFill(boolean z8) {
        this.fill = z8;
    }

    public final void setWeight(float f8) {
        this.weight = f8;
    }

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    public RowColumnParentData modifyParentData(Density density, Object obj) {
        AbstractC3292y.i(density, "<this>");
        RowColumnParentData rowColumnParentData = obj instanceof RowColumnParentData ? (RowColumnParentData) obj : null;
        if (rowColumnParentData == null) {
            rowColumnParentData = new RowColumnParentData(0.0f, false, null, 7, null);
        }
        rowColumnParentData.setWeight(this.weight);
        rowColumnParentData.setFill(this.fill);
        return rowColumnParentData;
    }
}
