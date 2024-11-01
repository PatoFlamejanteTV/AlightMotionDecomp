package androidx.compose.ui.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LayoutIdElement extends ModifierNodeElement<LayoutIdModifier> {
    private final Object layoutId;

    public LayoutIdElement(Object obj) {
        this.layoutId = obj;
    }

    private final Object component1() {
        return this.layoutId;
    }

    public static /* synthetic */ LayoutIdElement copy$default(LayoutIdElement layoutIdElement, Object obj, int i8, Object obj2) {
        if ((i8 & 1) != 0) {
            obj = layoutIdElement.layoutId;
        }
        return layoutIdElement.copy(obj);
    }

    public final LayoutIdElement copy(Object obj) {
        return new LayoutIdElement(obj);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutIdElement) && AbstractC3292y.d(this.layoutId, ((LayoutIdElement) obj).layoutId);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.layoutId.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("layoutId");
        inspectorInfo.setValue(this.layoutId);
    }

    public String toString() {
        return "LayoutIdElement(layoutId=" + this.layoutId + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public LayoutIdModifier create() {
        return new LayoutIdModifier(this.layoutId);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(LayoutIdModifier layoutIdModifier) {
        layoutIdModifier.setLayoutId$ui_release(this.layoutId);
    }
}
