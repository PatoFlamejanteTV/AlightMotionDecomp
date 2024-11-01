package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.IntOffset;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
final class AnimateItemPlacementElement extends ModifierNodeElement<AnimateItemPlacementNode> {
    private final FiniteAnimationSpec<IntOffset> animationSpec;

    public AnimateItemPlacementElement(FiniteAnimationSpec<IntOffset> animationSpec) {
        AbstractC3292y.i(animationSpec, "animationSpec");
        this.animationSpec = animationSpec;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnimateItemPlacementElement)) {
            return false;
        }
        return !AbstractC3292y.d(this.animationSpec, ((AnimateItemPlacementElement) obj).animationSpec);
    }

    public final FiniteAnimationSpec<IntOffset> getAnimationSpec() {
        return this.animationSpec;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.animationSpec.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        AbstractC3292y.i(inspectorInfo, "<this>");
        inspectorInfo.setName("animateItemPlacement");
        inspectorInfo.setValue(this.animationSpec);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public AnimateItemPlacementNode create() {
        return new AnimateItemPlacementNode(this.animationSpec);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(AnimateItemPlacementNode node) {
        AbstractC3292y.i(node, "node");
        node.getDelegatingNode().setPlacementAnimationSpec(this.animationSpec);
    }
}
