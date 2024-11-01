package androidx.compose.ui.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
final class OnPlacedElement extends ModifierNodeElement<OnPlacedNode> {
    private final Function1 onPlaced;

    public OnPlacedElement(Function1 function1) {
        this.onPlaced = function1;
    }

    public static /* synthetic */ OnPlacedElement copy$default(OnPlacedElement onPlacedElement, Function1 function1, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            function1 = onPlacedElement.onPlaced;
        }
        return onPlacedElement.copy(function1);
    }

    public final Function1 component1() {
        return this.onPlaced;
    }

    public final OnPlacedElement copy(Function1 function1) {
        return new OnPlacedElement(function1);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnPlacedElement) && AbstractC3292y.d(this.onPlaced, ((OnPlacedElement) obj).onPlaced);
    }

    public final Function1 getOnPlaced() {
        return this.onPlaced;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.onPlaced.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("onPlaced");
        inspectorInfo.getProperties().set("onPlaced", this.onPlaced);
    }

    public String toString() {
        return "OnPlacedElement(onPlaced=" + this.onPlaced + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public OnPlacedNode create() {
        return new OnPlacedNode(this.onPlaced);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(OnPlacedNode onPlacedNode) {
        onPlacedNode.setCallback(this.onPlaced);
    }
}
