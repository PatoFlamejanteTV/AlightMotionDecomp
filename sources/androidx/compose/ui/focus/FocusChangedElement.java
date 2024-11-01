package androidx.compose.ui.focus;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
final class FocusChangedElement extends ModifierNodeElement<FocusChangedNode> {
    private final Function1 onFocusChanged;

    public FocusChangedElement(Function1 function1) {
        this.onFocusChanged = function1;
    }

    public static /* synthetic */ FocusChangedElement copy$default(FocusChangedElement focusChangedElement, Function1 function1, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            function1 = focusChangedElement.onFocusChanged;
        }
        return focusChangedElement.copy(function1);
    }

    public final Function1 component1() {
        return this.onFocusChanged;
    }

    public final FocusChangedElement copy(Function1 function1) {
        return new FocusChangedElement(function1);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusChangedElement) && AbstractC3292y.d(this.onFocusChanged, ((FocusChangedElement) obj).onFocusChanged);
    }

    public final Function1 getOnFocusChanged() {
        return this.onFocusChanged;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.onFocusChanged.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("onFocusChanged");
        inspectorInfo.getProperties().set("onFocusChanged", this.onFocusChanged);
    }

    public String toString() {
        return "FocusChangedElement(onFocusChanged=" + this.onFocusChanged + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public FocusChangedNode create() {
        return new FocusChangedNode(this.onFocusChanged);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(FocusChangedNode focusChangedNode) {
        focusChangedNode.setOnFocusChanged(this.onFocusChanged);
    }
}
