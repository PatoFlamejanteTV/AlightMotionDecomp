package androidx.compose.foundation;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
final class FocusedBoundsObserverElement extends ModifierNodeElement<FocusedBoundsObserverNode> {
    private final Function1 onPositioned;

    public FocusedBoundsObserverElement(Function1 onPositioned) {
        AbstractC3292y.i(onPositioned, "onPositioned");
        this.onPositioned = onPositioned;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        FocusedBoundsObserverElement focusedBoundsObserverElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof FocusedBoundsObserverElement) {
            focusedBoundsObserverElement = (FocusedBoundsObserverElement) obj;
        } else {
            focusedBoundsObserverElement = null;
        }
        if (focusedBoundsObserverElement == null) {
            return false;
        }
        return AbstractC3292y.d(this.onPositioned, focusedBoundsObserverElement.onPositioned);
    }

    public final Function1 getOnPositioned() {
        return this.onPositioned;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.onPositioned.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        AbstractC3292y.i(inspectorInfo, "<this>");
        inspectorInfo.setName("onFocusedBoundsChanged");
        inspectorInfo.getProperties().set("onPositioned", this.onPositioned);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public FocusedBoundsObserverNode create() {
        return new FocusedBoundsObserverNode(this.onPositioned);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(FocusedBoundsObserverNode node) {
        AbstractC3292y.i(node, "node");
        node.setOnPositioned(this.onPositioned);
    }
}
