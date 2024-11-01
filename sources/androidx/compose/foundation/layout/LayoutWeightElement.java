package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class LayoutWeightElement extends ModifierNodeElement<LayoutWeightNode> {
    private final boolean fill;
    private final float weight;

    public LayoutWeightElement(float f8, boolean z8) {
        this.weight = f8;
        this.fill = z8;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        LayoutWeightElement layoutWeightElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof LayoutWeightElement) {
            layoutWeightElement = (LayoutWeightElement) obj;
        } else {
            layoutWeightElement = null;
        }
        if (layoutWeightElement != null && this.weight == layoutWeightElement.weight && this.fill == layoutWeightElement.fill) {
            return true;
        }
        return false;
    }

    public final boolean getFill() {
        return this.fill;
    }

    public final float getWeight() {
        return this.weight;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (Float.floatToIntBits(this.weight) * 31) + androidx.compose.foundation.a.a(this.fill);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        AbstractC3292y.i(inspectorInfo, "<this>");
        inspectorInfo.setName("weight");
        inspectorInfo.setValue(Float.valueOf(this.weight));
        inspectorInfo.getProperties().set("weight", Float.valueOf(this.weight));
        inspectorInfo.getProperties().set("fill", Boolean.valueOf(this.fill));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public LayoutWeightNode create() {
        return new LayoutWeightNode(this.weight, this.fill);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(LayoutWeightNode node) {
        AbstractC3292y.i(node, "node");
        node.setWeight(this.weight);
        node.setFill(this.fill);
    }
}
