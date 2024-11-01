package androidx.compose.ui.graphics;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class BlockGraphicsLayerElement extends ModifierNodeElement<BlockGraphicsLayerModifier> {
    private final Function1 block;

    public BlockGraphicsLayerElement(Function1 function1) {
        this.block = function1;
    }

    public static /* synthetic */ BlockGraphicsLayerElement copy$default(BlockGraphicsLayerElement blockGraphicsLayerElement, Function1 function1, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            function1 = blockGraphicsLayerElement.block;
        }
        return blockGraphicsLayerElement.copy(function1);
    }

    public final Function1 component1() {
        return this.block;
    }

    public final BlockGraphicsLayerElement copy(Function1 function1) {
        return new BlockGraphicsLayerElement(function1);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BlockGraphicsLayerElement) && AbstractC3292y.d(this.block, ((BlockGraphicsLayerElement) obj).block);
    }

    public final Function1 getBlock() {
        return this.block;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.block.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("graphicsLayer");
        inspectorInfo.getProperties().set("block", this.block);
    }

    public String toString() {
        return "BlockGraphicsLayerElement(block=" + this.block + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public BlockGraphicsLayerModifier create() {
        return new BlockGraphicsLayerModifier(this.block);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(BlockGraphicsLayerModifier blockGraphicsLayerModifier) {
        blockGraphicsLayerModifier.setLayerBlock(this.block);
        blockGraphicsLayerModifier.invalidateLayerBlock();
    }
}
