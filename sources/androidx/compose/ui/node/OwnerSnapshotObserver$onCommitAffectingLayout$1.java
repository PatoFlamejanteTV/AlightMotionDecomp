package androidx.compose.ui.node;

import Q5.I;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class OwnerSnapshotObserver$onCommitAffectingLayout$1 extends AbstractC3293z implements Function1 {
    public static final OwnerSnapshotObserver$onCommitAffectingLayout$1 INSTANCE = new OwnerSnapshotObserver$onCommitAffectingLayout$1();

    OwnerSnapshotObserver$onCommitAffectingLayout$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LayoutNode) obj);
        return I.f8786a;
    }

    public final void invoke(LayoutNode layoutNode) {
        if (layoutNode.isValidOwnerScope()) {
            LayoutNode.requestRelayout$ui_release$default(layoutNode, false, 1, null);
        }
    }
}
