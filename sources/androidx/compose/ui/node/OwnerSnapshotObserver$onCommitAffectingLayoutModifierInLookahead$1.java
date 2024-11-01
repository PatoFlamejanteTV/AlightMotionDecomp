package androidx.compose.ui.node;

import Q5.I;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class OwnerSnapshotObserver$onCommitAffectingLayoutModifierInLookahead$1 extends AbstractC3293z implements Function1 {
    public static final OwnerSnapshotObserver$onCommitAffectingLayoutModifierInLookahead$1 INSTANCE = new OwnerSnapshotObserver$onCommitAffectingLayoutModifierInLookahead$1();

    OwnerSnapshotObserver$onCommitAffectingLayoutModifierInLookahead$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LayoutNode) obj);
        return I.f8786a;
    }

    public final void invoke(LayoutNode layoutNode) {
        if (layoutNode.isValidOwnerScope()) {
            LayoutNode.requestLookaheadRelayout$ui_release$default(layoutNode, false, 1, null);
        }
    }
}
