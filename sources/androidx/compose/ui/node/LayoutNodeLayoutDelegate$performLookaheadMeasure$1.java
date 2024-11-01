package androidx.compose.ui.node;

import Q5.I;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LayoutNodeLayoutDelegate$performLookaheadMeasure$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ long $constraints;
    final /* synthetic */ LayoutNodeLayoutDelegate this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutNodeLayoutDelegate$performLookaheadMeasure$1(LayoutNodeLayoutDelegate layoutNodeLayoutDelegate, long j8) {
        super(0);
        this.this$0 = layoutNodeLayoutDelegate;
        this.$constraints = j8;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m4259invoke();
        return I.f8786a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m4259invoke() {
        LookaheadDelegate lookaheadDelegate = this.this$0.getOuterCoordinator().getLookaheadDelegate();
        AbstractC3292y.f(lookaheadDelegate);
        lookaheadDelegate.mo4108measureBRTryo0(this.$constraints);
    }
}
