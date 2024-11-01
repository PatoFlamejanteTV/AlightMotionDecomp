package androidx.compose.ui.graphics;

import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class BlockGraphicsLayerModifier$measure$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Placeable $placeable;
    final /* synthetic */ BlockGraphicsLayerModifier this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockGraphicsLayerModifier$measure$1(Placeable placeable, BlockGraphicsLayerModifier blockGraphicsLayerModifier) {
        super(1);
        this.$placeable = placeable;
        this.this$0 = blockGraphicsLayerModifier;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return Q5.I.f8786a;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeWithLayer$default(placementScope, this.$placeable, 0, 0, 0.0f, this.this$0.getLayerBlock(), 4, null);
    }
}
