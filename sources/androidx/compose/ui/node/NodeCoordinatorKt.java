package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;

/* loaded from: classes.dex */
public final class NodeCoordinatorKt {
    /* renamed from: access$nextUntil-hw7D004, reason: not valid java name */
    public static final /* synthetic */ Modifier.Node m4317access$nextUntilhw7D004(DelegatableNode delegatableNode, int i8, int i9) {
        return m4318nextUntilhw7D004(delegatableNode, i8, i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nextUntil-hw7D004, reason: not valid java name */
    public static final Modifier.Node m4318nextUntilhw7D004(DelegatableNode delegatableNode, int i8, int i9) {
        Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
        if (child$ui_release == null || (child$ui_release.getAggregateChildKindSet$ui_release() & i8) == 0) {
            return null;
        }
        while (child$ui_release != null) {
            int kindSet$ui_release = child$ui_release.getKindSet$ui_release();
            if ((kindSet$ui_release & i9) != 0) {
                return null;
            }
            if ((kindSet$ui_release & i8) != 0) {
                return child$ui_release;
            }
            child$ui_release = child$ui_release.getChild$ui_release();
        }
        return null;
    }
}
