package androidx.compose.foundation.relocation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.modifier.ModifierLocal;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.b;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.node.c;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public abstract class BringIntoViewChildNode extends Modifier.Node implements ModifierLocalModifierNode, LayoutAwareModifierNode, CompositionLocalConsumerModifierNode {
    private final BringIntoViewParent defaultParent = BringIntoViewResponder_androidKt.defaultBringIntoViewParent(this);
    private LayoutCoordinates layoutCoordinates;

    private final BringIntoViewParent getLocalParent() {
        return (BringIntoViewParent) getCurrent(BringIntoViewKt.getModifierLocalBringIntoViewParent());
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode, androidx.compose.ui.modifier.ModifierLocalReadScope
    public /* synthetic */ Object getCurrent(ModifierLocal modifierLocal) {
        return b.a(this, modifierLocal);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final LayoutCoordinates getLayoutCoordinates() {
        LayoutCoordinates layoutCoordinates = this.layoutCoordinates;
        if (layoutCoordinates == null || !layoutCoordinates.isAttached()) {
            return null;
        }
        return layoutCoordinates;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final BringIntoViewParent getParent() {
        BringIntoViewParent localParent = getLocalParent();
        if (localParent == null) {
            return this.defaultParent;
        }
        return localParent;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public /* synthetic */ ModifierLocalMap getProvidedValues() {
        return b.b(this);
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public void onPlaced(LayoutCoordinates coordinates) {
        AbstractC3292y.i(coordinates, "coordinates");
        this.layoutCoordinates = coordinates;
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public /* synthetic */ void mo314onRemeasuredozmzZPI(long j8) {
        c.b(this, j8);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public /* synthetic */ void provide(ModifierLocal modifierLocal, Object obj) {
        b.c(this, modifierLocal, obj);
    }
}
