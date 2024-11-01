package androidx.compose.ui.input.key;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class KeyInputElement extends ModifierNodeElement<KeyInputNode> {
    private final Function1 onKeyEvent;
    private final Function1 onPreKeyEvent;

    public KeyInputElement(Function1 function1, Function1 function12) {
        this.onKeyEvent = function1;
        this.onPreKeyEvent = function12;
    }

    public static /* synthetic */ KeyInputElement copy$default(KeyInputElement keyInputElement, Function1 function1, Function1 function12, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            function1 = keyInputElement.onKeyEvent;
        }
        if ((i8 & 2) != 0) {
            function12 = keyInputElement.onPreKeyEvent;
        }
        return keyInputElement.copy(function1, function12);
    }

    public final Function1 component1() {
        return this.onKeyEvent;
    }

    public final Function1 component2() {
        return this.onPreKeyEvent;
    }

    public final KeyInputElement copy(Function1 function1, Function1 function12) {
        return new KeyInputElement(function1, function12);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) obj;
        return AbstractC3292y.d(this.onKeyEvent, keyInputElement.onKeyEvent) && AbstractC3292y.d(this.onPreKeyEvent, keyInputElement.onPreKeyEvent);
    }

    public final Function1 getOnKeyEvent() {
        return this.onKeyEvent;
    }

    public final Function1 getOnPreKeyEvent() {
        return this.onPreKeyEvent;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        Function1 function1 = this.onKeyEvent;
        int hashCode = (function1 == null ? 0 : function1.hashCode()) * 31;
        Function1 function12 = this.onPreKeyEvent;
        return hashCode + (function12 != null ? function12.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        Function1 function1 = this.onKeyEvent;
        if (function1 != null) {
            inspectorInfo.setName("onKeyEvent");
            inspectorInfo.getProperties().set("onKeyEvent", function1);
        }
        Function1 function12 = this.onPreKeyEvent;
        if (function12 != null) {
            inspectorInfo.setName("onPreviewKeyEvent");
            inspectorInfo.getProperties().set("onPreviewKeyEvent", function12);
        }
    }

    public String toString() {
        return "KeyInputElement(onKeyEvent=" + this.onKeyEvent + ", onPreKeyEvent=" + this.onPreKeyEvent + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public KeyInputNode create() {
        return new KeyInputNode(this.onKeyEvent, this.onPreKeyEvent);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(KeyInputNode keyInputNode) {
        keyInputNode.setOnEvent(this.onKeyEvent);
        keyInputNode.setOnPreEvent(this.onPreKeyEvent);
    }
}
