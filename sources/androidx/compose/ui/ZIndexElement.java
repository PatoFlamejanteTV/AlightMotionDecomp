package androidx.compose.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class ZIndexElement extends ModifierNodeElement<ZIndexNode> {
    public static final int $stable = 0;
    private final float zIndex;

    public ZIndexElement(float f8) {
        this.zIndex = f8;
    }

    public static /* synthetic */ ZIndexElement copy$default(ZIndexElement zIndexElement, float f8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = zIndexElement.zIndex;
        }
        return zIndexElement.copy(f8);
    }

    public final float component1() {
        return this.zIndex;
    }

    public final ZIndexElement copy(float f8) {
        return new ZIndexElement(f8);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZIndexElement) && Float.compare(this.zIndex, ((ZIndexElement) obj).zIndex) == 0;
    }

    public final float getZIndex() {
        return this.zIndex;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return Float.floatToIntBits(this.zIndex);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("zIndex");
        inspectorInfo.getProperties().set("zIndex", Float.valueOf(this.zIndex));
    }

    public String toString() {
        return "ZIndexElement(zIndex=" + this.zIndex + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public ZIndexNode create() {
        return new ZIndexNode(this.zIndex);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(ZIndexNode zIndexNode) {
        zIndexNode.setZIndex(this.zIndex);
    }
}
