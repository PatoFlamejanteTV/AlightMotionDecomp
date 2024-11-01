package androidx.compose.ui.node;

import Q5.I;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LayoutNodeLayoutDelegate$LookaheadPassDelegate$placeAt$2 extends AbstractC3293z implements Function0 {
    final /* synthetic */ Owner $owner;
    final /* synthetic */ long $position;
    final /* synthetic */ LayoutNodeLayoutDelegate this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutNodeLayoutDelegate$LookaheadPassDelegate$placeAt$2(LayoutNodeLayoutDelegate layoutNodeLayoutDelegate, Owner owner, long j8) {
        super(0);
        this.this$0 = layoutNodeLayoutDelegate;
        this.$owner = owner;
        this.$position = j8;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m4253invoke();
        return I.f8786a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m4253invoke() {
        LookaheadDelegate lookaheadDelegate;
        Placeable.PlacementScope placementScope = null;
        if (LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(this.this$0.layoutNode)) {
            NodeCoordinator wrappedBy$ui_release = this.this$0.getOuterCoordinator().getWrappedBy$ui_release();
            if (wrappedBy$ui_release != null) {
                placementScope = wrappedBy$ui_release.getPlacementScope();
            }
        } else {
            NodeCoordinator wrappedBy$ui_release2 = this.this$0.getOuterCoordinator().getWrappedBy$ui_release();
            if (wrappedBy$ui_release2 != null && (lookaheadDelegate = wrappedBy$ui_release2.getLookaheadDelegate()) != null) {
                placementScope = lookaheadDelegate.getPlacementScope();
            }
        }
        if (placementScope == null) {
            placementScope = this.$owner.getPlacementScope();
        }
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.this$0;
        long j8 = this.$position;
        LookaheadDelegate lookaheadDelegate2 = layoutNodeLayoutDelegate.getOuterCoordinator().getLookaheadDelegate();
        AbstractC3292y.f(lookaheadDelegate2);
        Placeable.PlacementScope.m4146place70tqf50$default(placementScope, lookaheadDelegate2, j8, 0.0f, 2, null);
    }
}
