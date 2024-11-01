package androidx.compose.ui.semantics;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.SemanticsModifierNode;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class SemanticsOwner {
    public static final int $stable = 8;
    private final LayoutNode rootNode;

    public SemanticsOwner(LayoutNode layoutNode) {
        this.rootNode = layoutNode;
    }

    public final SemanticsNode getRootSemanticsNode() {
        return SemanticsNodeKt.SemanticsNode(this.rootNode, true);
    }

    public final SemanticsNode getUnmergedRootSemanticsNode() {
        NodeChain nodes$ui_release = this.rootNode.getNodes$ui_release();
        int m4320constructorimpl = NodeKind.m4320constructorimpl(8);
        Object obj = null;
        if ((NodeChain.access$getAggregateChildKindSet(nodes$ui_release) & m4320constructorimpl) != 0) {
            Modifier.Node head$ui_release = nodes$ui_release.getHead$ui_release();
            loop0: while (true) {
                if (head$ui_release == null) {
                    break;
                }
                if ((head$ui_release.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                    Modifier.Node node = head$ui_release;
                    MutableVector mutableVector = null;
                    while (node != null) {
                        if (node instanceof SemanticsModifierNode) {
                            obj = node;
                            break loop0;
                        }
                        if ((node.getKindSet$ui_release() & m4320constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                            int i8 = 0;
                            for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                if ((delegate$ui_release.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                                    i8++;
                                    if (i8 == 1) {
                                        node = delegate$ui_release;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (node != null) {
                                            mutableVector.add(node);
                                            node = null;
                                        }
                                        mutableVector.add(delegate$ui_release);
                                    }
                                }
                            }
                            if (i8 == 1) {
                            }
                        }
                        node = DelegatableNodeKt.access$pop(mutableVector);
                    }
                }
                if ((head$ui_release.getAggregateChildKindSet$ui_release() & m4320constructorimpl) == 0) {
                    break;
                }
                head$ui_release = head$ui_release.getChild$ui_release();
            }
        }
        AbstractC3292y.f(obj);
        return new SemanticsNode(((SemanticsModifierNode) obj).getNode(), false, this.rootNode, new SemanticsConfiguration());
    }
}
