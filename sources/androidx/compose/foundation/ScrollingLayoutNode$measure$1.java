package androidx.compose.foundation;

import Q5.I;
import androidx.compose.ui.layout.Placeable;
import i6.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class ScrollingLayoutNode$measure$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Placeable $placeable;
    final /* synthetic */ int $side;
    final /* synthetic */ ScrollingLayoutNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLayoutNode$measure$1(ScrollingLayoutNode scrollingLayoutNode, int i8, Placeable placeable) {
        super(1);
        this.this$0 = scrollingLayoutNode;
        this.$side = i8;
        this.$placeable = placeable;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return I.f8786a;
    }

    public final void invoke(Placeable.PlacementScope layout) {
        AbstractC3292y.i(layout, "$this$layout");
        int k8 = m.k(this.this$0.getScrollerState().getValue(), 0, this.$side);
        int i8 = this.this$0.isReversed() ? k8 - this.$side : -k8;
        Placeable.PlacementScope.placeRelativeWithLayer$default(layout, this.$placeable, this.this$0.isVertical() ? 0 : i8, this.this$0.isVertical() ? i8 : 0, 0.0f, null, 12, null);
    }
}
