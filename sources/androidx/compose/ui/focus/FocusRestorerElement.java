package androidx.compose.ui.focus;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class FocusRestorerElement extends ModifierNodeElement<FocusRestorerNode> {
    private final Function0 onRestoreFailed;

    public FocusRestorerElement(Function0 function0) {
        this.onRestoreFailed = function0;
    }

    public static /* synthetic */ FocusRestorerElement copy$default(FocusRestorerElement focusRestorerElement, Function0 function0, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            function0 = focusRestorerElement.onRestoreFailed;
        }
        return focusRestorerElement.copy(function0);
    }

    public final Function0 component1() {
        return this.onRestoreFailed;
    }

    public final FocusRestorerElement copy(Function0 function0) {
        return new FocusRestorerElement(function0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRestorerElement) && AbstractC3292y.d(this.onRestoreFailed, ((FocusRestorerElement) obj).onRestoreFailed);
    }

    public final Function0 getOnRestoreFailed() {
        return this.onRestoreFailed;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        Function0 function0 = this.onRestoreFailed;
        if (function0 == null) {
            return 0;
        }
        return function0.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("focusRestorer");
        inspectorInfo.getProperties().set("onRestoreFailed", this.onRestoreFailed);
    }

    public String toString() {
        return "FocusRestorerElement(onRestoreFailed=" + this.onRestoreFailed + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public FocusRestorerNode create() {
        return new FocusRestorerNode(this.onRestoreFailed);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(FocusRestorerNode focusRestorerNode) {
        focusRestorerNode.setOnRestoreFailed(this.onRestoreFailed);
    }
}
