package androidx.compose.ui.focus;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
final class FocusEventElement extends ModifierNodeElement<FocusEventNode> {
    private final Function1 onFocusEvent;

    public FocusEventElement(Function1 function1) {
        this.onFocusEvent = function1;
    }

    public static /* synthetic */ FocusEventElement copy$default(FocusEventElement focusEventElement, Function1 function1, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            function1 = focusEventElement.onFocusEvent;
        }
        return focusEventElement.copy(function1);
    }

    public final Function1 component1() {
        return this.onFocusEvent;
    }

    public final FocusEventElement copy(Function1 function1) {
        return new FocusEventElement(function1);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusEventElement) && AbstractC3292y.d(this.onFocusEvent, ((FocusEventElement) obj).onFocusEvent);
    }

    public final Function1 getOnFocusEvent() {
        return this.onFocusEvent;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.onFocusEvent.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("onFocusEvent");
        inspectorInfo.getProperties().set("onFocusEvent", this.onFocusEvent);
    }

    public String toString() {
        return "FocusEventElement(onFocusEvent=" + this.onFocusEvent + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public FocusEventNode create() {
        return new FocusEventNode(this.onFocusEvent);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(FocusEventNode focusEventNode) {
        focusEventNode.setOnFocusEvent(this.onFocusEvent);
    }
}
