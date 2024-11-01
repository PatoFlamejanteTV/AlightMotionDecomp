package androidx.compose.ui.node;

import Q5.I;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LayoutNodeLayoutDelegate$performMeasureBlock$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ LayoutNodeLayoutDelegate this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutNodeLayoutDelegate$performMeasureBlock$1(LayoutNodeLayoutDelegate layoutNodeLayoutDelegate) {
        super(0);
        this.this$0 = layoutNodeLayoutDelegate;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m4260invoke();
        return I.f8786a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m4260invoke() {
        long j8;
        NodeCoordinator outerCoordinator = this.this$0.getOuterCoordinator();
        j8 = this.this$0.performMeasureConstraints;
        outerCoordinator.mo4108measureBRTryo0(j8);
    }
}
