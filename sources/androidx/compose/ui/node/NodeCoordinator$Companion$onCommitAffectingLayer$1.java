package androidx.compose.ui.node;

import Q5.I;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class NodeCoordinator$Companion$onCommitAffectingLayer$1 extends AbstractC3293z implements Function1 {
    public static final NodeCoordinator$Companion$onCommitAffectingLayer$1 INSTANCE = new NodeCoordinator$Companion$onCommitAffectingLayer$1();

    NodeCoordinator$Companion$onCommitAffectingLayer$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((NodeCoordinator) obj);
        return I.f8786a;
    }

    public final void invoke(NodeCoordinator nodeCoordinator) {
        OwnedLayer layer = nodeCoordinator.getLayer();
        if (layer != null) {
            layer.invalidate();
        }
    }
}
