package androidx.compose.ui.node;

import Q5.I;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class NodeCoordinator$updateLayerParameters$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ Function1 $layerBlock;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NodeCoordinator$updateLayerParameters$1(Function1 function1) {
        super(0);
        this.$layerBlock = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m4316invoke();
        return I.f8786a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m4316invoke() {
        ReusableGraphicsLayerScope reusableGraphicsLayerScope;
        Function1 function1 = this.$layerBlock;
        reusableGraphicsLayerScope = NodeCoordinator.graphicsLayerScope;
        function1.invoke(reusableGraphicsLayerScope);
    }
}
