package androidx.compose.ui.graphics;

import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SimpleGraphicsLayerModifier$measure$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Placeable $placeable;
    final /* synthetic */ SimpleGraphicsLayerModifier this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleGraphicsLayerModifier$measure$1(Placeable placeable, SimpleGraphicsLayerModifier simpleGraphicsLayerModifier) {
        super(1);
        this.$placeable = placeable;
        this.this$0 = simpleGraphicsLayerModifier;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return Q5.I.f8786a;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        Function1 function1;
        Placeable placeable = this.$placeable;
        function1 = this.this$0.layerBlock;
        Placeable.PlacementScope.placeWithLayer$default(placementScope, placeable, 0, 0, 0.0f, function1, 4, null);
    }
}
