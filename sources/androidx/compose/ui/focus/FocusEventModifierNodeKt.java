package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;

/* loaded from: classes.dex */
public final class FocusEventModifierNodeKt {

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0095, code lost:            continue;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.ui.focus.FocusState getFocusState(androidx.compose.ui.focus.FocusEventModifierNode r12) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusEventModifierNodeKt.getFocusState(androidx.compose.ui.focus.FocusEventModifierNode):androidx.compose.ui.focus.FocusState");
    }

    public static final void invalidateFocusEvent(FocusEventModifierNode focusEventModifierNode) {
        DelegatableNodeKt.requireOwner(focusEventModifierNode).getFocusOwner().scheduleInvalidation(focusEventModifierNode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [androidx.compose.ui.Modifier$Node] */
    public static final void refreshFocusEventNodes(FocusTargetNode focusTargetNode) {
        NodeChain nodes$ui_release;
        int m4320constructorimpl = NodeKind.m4320constructorimpl(4096);
        int m4320constructorimpl2 = NodeKind.m4320constructorimpl(1024);
        Modifier.Node node = focusTargetNode.getNode();
        int i8 = m4320constructorimpl | m4320constructorimpl2;
        if (focusTargetNode.getNode().isAttached()) {
            Modifier.Node node2 = focusTargetNode.getNode();
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
            while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i8) != 0) {
                    while (node2 != null) {
                        if ((node2.getKindSet$ui_release() & i8) != 0) {
                            if (node2 == node || (node2.getKindSet$ui_release() & m4320constructorimpl2) == 0) {
                                if ((node2.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                                    DelegatingNode delegatingNode = node2;
                                    MutableVector mutableVector = null;
                                    while (delegatingNode != 0) {
                                        if (delegatingNode instanceof FocusEventModifierNode) {
                                            FocusEventModifierNode focusEventModifierNode = (FocusEventModifierNode) delegatingNode;
                                            focusEventModifierNode.onFocusEvent(getFocusState(focusEventModifierNode));
                                        } else if ((delegatingNode.getKindSet$ui_release() & m4320constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                            Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                                            int i9 = 0;
                                            delegatingNode = delegatingNode;
                                            while (delegate$ui_release != null) {
                                                if ((delegate$ui_release.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                                                    i9++;
                                                    if (i9 == 1) {
                                                        delegatingNode = delegate$ui_release;
                                                    } else {
                                                        if (mutableVector == null) {
                                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                        }
                                                        if (delegatingNode != 0) {
                                                            mutableVector.add(delegatingNode);
                                                            delegatingNode = 0;
                                                        }
                                                        mutableVector.add(delegate$ui_release);
                                                    }
                                                }
                                                delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                                delegatingNode = delegatingNode;
                                            }
                                            if (i9 == 1) {
                                            }
                                        }
                                        delegatingNode = DelegatableNodeKt.pop(mutableVector);
                                    }
                                }
                            } else {
                                return;
                            }
                        }
                        node2 = node2.getParent$ui_release();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui_release();
                if (requireLayoutNode != null && (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) != null) {
                    node2 = nodes$ui_release.getTail$ui_release();
                } else {
                    node2 = null;
                }
            }
            return;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }
}
