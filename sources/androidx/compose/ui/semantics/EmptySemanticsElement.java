package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class EmptySemanticsElement extends ModifierNodeElement<EmptySemanticsModifier> {
    public static final int $stable = 0;
    public static final EmptySemanticsElement INSTANCE = new EmptySemanticsElement();

    private EmptySemanticsElement() {
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return System.identityHashCode(this);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(EmptySemanticsModifier emptySemanticsModifier) {
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public EmptySemanticsModifier create() {
        return new EmptySemanticsModifier();
    }
}
