package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
final class AnimateItemPlacementNode extends DelegatingNode implements ParentDataModifierNode {
    private final LazyLayoutAnimateItemModifierNode delegatingNode;

    public AnimateItemPlacementNode(FiniteAnimationSpec<IntOffset> animationSpec) {
        AbstractC3292y.i(animationSpec, "animationSpec");
        this.delegatingNode = (LazyLayoutAnimateItemModifierNode) delegate(new LazyLayoutAnimateItemModifierNode(animationSpec));
    }

    public final LazyLayoutAnimateItemModifierNode getDelegatingNode() {
        return this.delegatingNode;
    }

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    public Object modifyParentData(Density density, Object obj) {
        AbstractC3292y.i(density, "<this>");
        return this.delegatingNode;
    }
}
