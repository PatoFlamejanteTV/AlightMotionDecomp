package androidx.compose.ui.viewinterop;

import Q5.I;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidViewHolder$layoutNode$1$2 extends AbstractC3293z implements Function1 {
    final /* synthetic */ LayoutNode $layoutNode;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$layoutNode$1$2(LayoutNode layoutNode) {
        super(1);
        this.$layoutNode = layoutNode;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Density) obj);
        return I.f8786a;
    }

    public final void invoke(Density density) {
        this.$layoutNode.setDensity(density);
    }
}
