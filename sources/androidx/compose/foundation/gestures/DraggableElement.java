package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class DraggableElement extends ModifierNodeElement<DraggableNode> {
    private final Function1 canDrag;
    private final boolean enabled;
    private final MutableInteractionSource interactionSource;
    private final InterfaceC2073o onDragStarted;
    private final InterfaceC2073o onDragStopped;
    private final Orientation orientation;
    private final boolean reverseDirection;
    private final Function0 startDragImmediately;
    private final DraggableState state;

    public DraggableElement(DraggableState state, Function1 canDrag, Orientation orientation, boolean z8, MutableInteractionSource mutableInteractionSource, Function0 startDragImmediately, InterfaceC2073o onDragStarted, InterfaceC2073o onDragStopped, boolean z9) {
        AbstractC3292y.i(state, "state");
        AbstractC3292y.i(canDrag, "canDrag");
        AbstractC3292y.i(orientation, "orientation");
        AbstractC3292y.i(startDragImmediately, "startDragImmediately");
        AbstractC3292y.i(onDragStarted, "onDragStarted");
        AbstractC3292y.i(onDragStopped, "onDragStopped");
        this.state = state;
        this.canDrag = canDrag;
        this.orientation = orientation;
        this.enabled = z8;
        this.interactionSource = mutableInteractionSource;
        this.startDragImmediately = startDragImmediately;
        this.onDragStarted = onDragStarted;
        this.onDragStopped = onDragStopped;
        this.reverseDirection = z9;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!AbstractC3292y.d(DraggableElement.class, cls)) {
            return false;
        }
        AbstractC3292y.g(obj, "null cannot be cast to non-null type androidx.compose.foundation.gestures.DraggableElement");
        DraggableElement draggableElement = (DraggableElement) obj;
        if (AbstractC3292y.d(this.state, draggableElement.state) && AbstractC3292y.d(this.canDrag, draggableElement.canDrag) && this.orientation == draggableElement.orientation && this.enabled == draggableElement.enabled && AbstractC3292y.d(this.interactionSource, draggableElement.interactionSource) && AbstractC3292y.d(this.startDragImmediately, draggableElement.startDragImmediately) && AbstractC3292y.d(this.onDragStarted, draggableElement.onDragStarted) && AbstractC3292y.d(this.onDragStopped, draggableElement.onDragStopped) && this.reverseDirection == draggableElement.reverseDirection) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int i8;
        int hashCode = ((((((this.state.hashCode() * 31) + this.canDrag.hashCode()) * 31) + this.orientation.hashCode()) * 31) + androidx.compose.foundation.a.a(this.enabled)) * 31;
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        if (mutableInteractionSource != null) {
            i8 = mutableInteractionSource.hashCode();
        } else {
            i8 = 0;
        }
        return ((((((((hashCode + i8) * 31) + this.startDragImmediately.hashCode()) * 31) + this.onDragStarted.hashCode()) * 31) + this.onDragStopped.hashCode()) * 31) + androidx.compose.foundation.a.a(this.reverseDirection);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        AbstractC3292y.i(inspectorInfo, "<this>");
        inspectorInfo.setName("draggable");
        inspectorInfo.getProperties().set("canDrag", this.canDrag);
        inspectorInfo.getProperties().set("orientation", this.orientation);
        inspectorInfo.getProperties().set("enabled", Boolean.valueOf(this.enabled));
        inspectorInfo.getProperties().set("reverseDirection", Boolean.valueOf(this.reverseDirection));
        inspectorInfo.getProperties().set("interactionSource", this.interactionSource);
        inspectorInfo.getProperties().set("startDragImmediately", this.startDragImmediately);
        inspectorInfo.getProperties().set("onDragStarted", this.onDragStarted);
        inspectorInfo.getProperties().set("onDragStopped", this.onDragStopped);
        inspectorInfo.getProperties().set("state", this.state);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public DraggableNode create() {
        return new DraggableNode(this.state, this.canDrag, this.orientation, this.enabled, this.interactionSource, this.startDragImmediately, this.onDragStarted, this.onDragStopped, this.reverseDirection);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(DraggableNode node) {
        AbstractC3292y.i(node, "node");
        node.update(this.state, this.canDrag, this.orientation, this.enabled, this.interactionSource, this.startDragImmediately, this.onDragStarted, this.onDragStopped, this.reverseDirection);
    }
}
