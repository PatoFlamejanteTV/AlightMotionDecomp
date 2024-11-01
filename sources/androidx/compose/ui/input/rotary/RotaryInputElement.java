package androidx.compose.ui.input.rotary;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class RotaryInputElement extends ModifierNodeElement<RotaryInputNode> {
    private final Function1 onPreRotaryScrollEvent;
    private final Function1 onRotaryScrollEvent;

    public RotaryInputElement(Function1 function1, Function1 function12) {
        this.onRotaryScrollEvent = function1;
        this.onPreRotaryScrollEvent = function12;
    }

    public static /* synthetic */ RotaryInputElement copy$default(RotaryInputElement rotaryInputElement, Function1 function1, Function1 function12, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            function1 = rotaryInputElement.onRotaryScrollEvent;
        }
        if ((i8 & 2) != 0) {
            function12 = rotaryInputElement.onPreRotaryScrollEvent;
        }
        return rotaryInputElement.copy(function1, function12);
    }

    public final Function1 component1() {
        return this.onRotaryScrollEvent;
    }

    public final Function1 component2() {
        return this.onPreRotaryScrollEvent;
    }

    public final RotaryInputElement copy(Function1 function1, Function1 function12) {
        return new RotaryInputElement(function1, function12);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RotaryInputElement)) {
            return false;
        }
        RotaryInputElement rotaryInputElement = (RotaryInputElement) obj;
        return AbstractC3292y.d(this.onRotaryScrollEvent, rotaryInputElement.onRotaryScrollEvent) && AbstractC3292y.d(this.onPreRotaryScrollEvent, rotaryInputElement.onPreRotaryScrollEvent);
    }

    public final Function1 getOnPreRotaryScrollEvent() {
        return this.onPreRotaryScrollEvent;
    }

    public final Function1 getOnRotaryScrollEvent() {
        return this.onRotaryScrollEvent;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        Function1 function1 = this.onRotaryScrollEvent;
        int hashCode = (function1 == null ? 0 : function1.hashCode()) * 31;
        Function1 function12 = this.onPreRotaryScrollEvent;
        return hashCode + (function12 != null ? function12.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        Function1 function1 = this.onRotaryScrollEvent;
        if (function1 != null) {
            inspectorInfo.setName("onRotaryScrollEvent");
            inspectorInfo.getProperties().set("onRotaryScrollEvent", function1);
        }
        Function1 function12 = this.onPreRotaryScrollEvent;
        if (function12 != null) {
            inspectorInfo.setName("onPreRotaryScrollEvent");
            inspectorInfo.getProperties().set("onPreRotaryScrollEvent", function12);
        }
    }

    public String toString() {
        return "RotaryInputElement(onRotaryScrollEvent=" + this.onRotaryScrollEvent + ", onPreRotaryScrollEvent=" + this.onPreRotaryScrollEvent + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public RotaryInputNode create() {
        return new RotaryInputNode(this.onRotaryScrollEvent, this.onPreRotaryScrollEvent);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(RotaryInputNode rotaryInputNode) {
        rotaryInputNode.setOnEvent(this.onRotaryScrollEvent);
        rotaryInputNode.setOnPreEvent(this.onPreRotaryScrollEvent);
    }
}
