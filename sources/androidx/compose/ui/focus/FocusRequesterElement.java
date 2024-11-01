package androidx.compose.ui.focus;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class FocusRequesterElement extends ModifierNodeElement<FocusRequesterNode> {
    private final FocusRequester focusRequester;

    public FocusRequesterElement(FocusRequester focusRequester) {
        this.focusRequester = focusRequester;
    }

    public static /* synthetic */ FocusRequesterElement copy$default(FocusRequesterElement focusRequesterElement, FocusRequester focusRequester, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            focusRequester = focusRequesterElement.focusRequester;
        }
        return focusRequesterElement.copy(focusRequester);
    }

    public final FocusRequester component1() {
        return this.focusRequester;
    }

    public final FocusRequesterElement copy(FocusRequester focusRequester) {
        return new FocusRequesterElement(focusRequester);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRequesterElement) && AbstractC3292y.d(this.focusRequester, ((FocusRequesterElement) obj).focusRequester);
    }

    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.focusRequester.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("focusRequester");
        inspectorInfo.getProperties().set("focusRequester", this.focusRequester);
    }

    public String toString() {
        return "FocusRequesterElement(focusRequester=" + this.focusRequester + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public FocusRequesterNode create() {
        return new FocusRequesterNode(this.focusRequester);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(FocusRequesterNode focusRequesterNode) {
        focusRequesterNode.getFocusRequester().getFocusRequesterNodes$ui_release().remove(focusRequesterNode);
        focusRequesterNode.setFocusRequester(this.focusRequester);
        focusRequesterNode.getFocusRequester().getFocusRequesterNodes$ui_release().add(focusRequesterNode);
    }
}
