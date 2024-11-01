package androidx.compose.ui;

import Q5.I;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class ZIndexNode$measure$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Placeable $placeable;
    final /* synthetic */ ZIndexNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZIndexNode$measure$1(Placeable placeable, ZIndexNode zIndexNode) {
        super(1);
        this.$placeable = placeable;
        this.this$0 = zIndexNode;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return I.f8786a;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        placementScope.place(this.$placeable, 0, 0, this.this$0.getZIndex());
    }
}
