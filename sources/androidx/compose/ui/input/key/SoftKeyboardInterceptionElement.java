package androidx.compose.ui.input.key;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
final class SoftKeyboardInterceptionElement extends ModifierNodeElement<InterceptedKeyInputNode> {
    private final Function1 onKeyEvent;
    private final Function1 onPreKeyEvent;

    public SoftKeyboardInterceptionElement(Function1 function1, Function1 function12) {
        this.onKeyEvent = function1;
        this.onPreKeyEvent = function12;
    }

    public static /* synthetic */ SoftKeyboardInterceptionElement copy$default(SoftKeyboardInterceptionElement softKeyboardInterceptionElement, Function1 function1, Function1 function12, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            function1 = softKeyboardInterceptionElement.onKeyEvent;
        }
        if ((i8 & 2) != 0) {
            function12 = softKeyboardInterceptionElement.onPreKeyEvent;
        }
        return softKeyboardInterceptionElement.copy(function1, function12);
    }

    public final Function1 component1() {
        return this.onKeyEvent;
    }

    public final Function1 component2() {
        return this.onPreKeyEvent;
    }

    public final SoftKeyboardInterceptionElement copy(Function1 function1, Function1 function12) {
        return new SoftKeyboardInterceptionElement(function1, function12);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SoftKeyboardInterceptionElement)) {
            return false;
        }
        SoftKeyboardInterceptionElement softKeyboardInterceptionElement = (SoftKeyboardInterceptionElement) obj;
        return AbstractC3292y.d(this.onKeyEvent, softKeyboardInterceptionElement.onKeyEvent) && AbstractC3292y.d(this.onPreKeyEvent, softKeyboardInterceptionElement.onPreKeyEvent);
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
            inspectorInfo.setName("onKeyToSoftKeyboardInterceptedEvent");
            inspectorInfo.getProperties().set("onKeyToSoftKeyboardInterceptedEvent", function1);
        }
        Function1 function12 = this.onPreKeyEvent;
        if (function12 != null) {
            inspectorInfo.setName("onPreKeyToSoftKeyboardInterceptedEvent");
            inspectorInfo.getProperties().set("onPreKeyToSoftKeyboardInterceptedEvent", function12);
        }
    }

    public String toString() {
        return "SoftKeyboardInterceptionElement(onKeyEvent=" + this.onKeyEvent + ", onPreKeyEvent=" + this.onPreKeyEvent + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public InterceptedKeyInputNode create() {
        return new InterceptedKeyInputNode(this.onKeyEvent, this.onPreKeyEvent);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(InterceptedKeyInputNode interceptedKeyInputNode) {
        interceptedKeyInputNode.setOnEvent(this.onKeyEvent);
        interceptedKeyInputNode.setOnPreEvent(this.onPreKeyEvent);
    }
}
