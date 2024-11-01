package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.SemanticsModifierNode;
import kotlin.jvm.functions.Function1;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class CoreSemanticsModifierNode extends Modifier.Node implements SemanticsModifierNode {
    public static final int $stable = 8;
    private boolean isClearingSemantics;
    private boolean mergeDescendants;
    private Function1 properties;

    public CoreSemanticsModifierNode(boolean z8, boolean z9, Function1 function1) {
        this.mergeDescendants = z8;
        this.isClearingSemantics = z9;
        this.properties = function1;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        this.properties.invoke(semanticsPropertyReceiver);
    }

    public final boolean getMergeDescendants() {
        return this.mergeDescendants;
    }

    public final Function1 getProperties() {
        return this.properties;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public boolean getShouldClearDescendantSemantics() {
        return this.isClearingSemantics;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public boolean getShouldMergeDescendantSemantics() {
        return this.mergeDescendants;
    }

    public final boolean isClearingSemantics() {
        return this.isClearingSemantics;
    }

    public final void setClearingSemantics(boolean z8) {
        this.isClearingSemantics = z8;
    }

    public final void setMergeDescendants(boolean z8) {
        this.mergeDescendants = z8;
    }

    public final void setProperties(Function1 function1) {
        this.properties = function1;
    }
}
