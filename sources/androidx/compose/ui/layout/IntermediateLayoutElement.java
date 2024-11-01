package androidx.compose.ui.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
final class IntermediateLayoutElement extends ModifierNodeElement<IntermediateLayoutModifierNode> {
    private final InterfaceC2073o measure;

    public IntermediateLayoutElement(InterfaceC2073o interfaceC2073o) {
        this.measure = interfaceC2073o;
    }

    public static /* synthetic */ IntermediateLayoutElement copy$default(IntermediateLayoutElement intermediateLayoutElement, InterfaceC2073o interfaceC2073o, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            interfaceC2073o = intermediateLayoutElement.measure;
        }
        return intermediateLayoutElement.copy(interfaceC2073o);
    }

    public final InterfaceC2073o component1() {
        return this.measure;
    }

    public final IntermediateLayoutElement copy(InterfaceC2073o interfaceC2073o) {
        return new IntermediateLayoutElement(interfaceC2073o);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IntermediateLayoutElement) && AbstractC3292y.d(this.measure, ((IntermediateLayoutElement) obj).measure);
    }

    public final InterfaceC2073o getMeasure() {
        return this.measure;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.measure.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("intermediateLayout");
        inspectorInfo.getProperties().set("measure", this.measure);
    }

    public String toString() {
        return "IntermediateLayoutElement(measure=" + this.measure + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public IntermediateLayoutModifierNode create() {
        return new IntermediateLayoutModifierNode(this.measure);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(IntermediateLayoutModifierNode intermediateLayoutModifierNode) {
        intermediateLayoutModifierNode.setMeasureBlock$ui_release(this.measure);
    }
}
