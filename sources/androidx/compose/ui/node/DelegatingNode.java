package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public abstract class DelegatingNode extends Modifier.Node {
    public static final int $stable = 8;
    private Modifier.Node delegate;
    private final int selfKindSet = NodeKindKt.calculateNodeKindSetFrom(this);

    public static /* synthetic */ void getSelfKindSet$ui_release$annotations() {
    }

    private final void updateNodeKindSet(int i8, boolean z8) {
        int i9;
        Modifier.Node child$ui_release;
        int kindSet$ui_release = getKindSet$ui_release();
        setKindSet$ui_release(i8);
        if (kindSet$ui_release != i8) {
            if (DelegatableNodeKt.isDelegationRoot(this)) {
                setAggregateChildKindSet$ui_release(i8);
            }
            if (isAttached()) {
                Modifier.Node node = getNode();
                Modifier.Node node2 = this;
                while (node2 != null) {
                    i8 |= node2.getKindSet$ui_release();
                    node2.setKindSet$ui_release(i8);
                    if (node2 == node) {
                        break;
                    } else {
                        node2 = node2.getParent$ui_release();
                    }
                }
                if (z8 && node2 == node) {
                    i8 = NodeKindKt.calculateNodeKindSetFromIncludingDelegates(node);
                    node.setKindSet$ui_release(i8);
                }
                if (node2 != null && (child$ui_release = node2.getChild$ui_release()) != null) {
                    i9 = child$ui_release.getAggregateChildKindSet$ui_release();
                } else {
                    i9 = 0;
                }
                int i10 = i8 | i9;
                while (node2 != null) {
                    i10 |= node2.getKindSet$ui_release();
                    node2.setAggregateChildKindSet$ui_release(i10);
                    node2 = node2.getParent$ui_release();
                }
            }
        }
    }

    private final void validateDelegateKindSet(int i8, Modifier.Node node) {
        int kindSet$ui_release = getKindSet$ui_release();
        if ((i8 & NodeKind.m4320constructorimpl(2)) != 0 && (NodeKind.m4320constructorimpl(2) & kindSet$ui_release) != 0 && !(this instanceof LayoutModifierNode)) {
            throw new IllegalStateException(("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + node).toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final <T extends DelegatableNode> T delegate(T t8) {
        Modifier.Node node;
        Modifier.Node node2 = t8.getNode();
        Modifier.Node node3 = null;
        if (node2 != t8) {
            if (t8 instanceof Modifier.Node) {
                node = (Modifier.Node) t8;
            } else {
                node = null;
            }
            if (node != null) {
                node3 = node.getParent$ui_release();
            }
            if (node2 == getNode() && AbstractC3292y.d(node3, this)) {
                return t8;
            }
            throw new IllegalStateException("Cannot delegate to an already delegated node".toString());
        }
        if (!node2.isAttached()) {
            node2.setAsDelegateTo$ui_release(getNode());
            int kindSet$ui_release = getKindSet$ui_release();
            int calculateNodeKindSetFromIncludingDelegates = NodeKindKt.calculateNodeKindSetFromIncludingDelegates(node2);
            node2.setKindSet$ui_release(calculateNodeKindSetFromIncludingDelegates);
            validateDelegateKindSet(calculateNodeKindSetFromIncludingDelegates, node2);
            node2.setChild$ui_release(this.delegate);
            this.delegate = node2;
            node2.setParent$ui_release(this);
            updateNodeKindSet(getKindSet$ui_release() | calculateNodeKindSetFromIncludingDelegates, false);
            if (isAttached()) {
                if ((calculateNodeKindSetFromIncludingDelegates & NodeKind.m4320constructorimpl(2)) != 0 && (kindSet$ui_release & NodeKind.m4320constructorimpl(2)) == 0) {
                    NodeChain nodes$ui_release = DelegatableNodeKt.requireLayoutNode(this).getNodes$ui_release();
                    getNode().updateCoordinator$ui_release(null);
                    nodes$ui_release.syncCoordinators();
                } else {
                    updateCoordinator$ui_release(getCoordinator$ui_release());
                }
                node2.markAsAttached$ui_release();
                node2.runAttachLifecycle$ui_release();
                NodeKindKt.autoInvalidateInsertedNode(node2);
            }
            return t8;
        }
        throw new IllegalStateException("Cannot delegate to an already attached node".toString());
    }

    public final <T extends DelegatableNode> T delegateUnprotected$ui_release(T t8) {
        return (T) delegate(t8);
    }

    public final void forEachImmediateDelegate$ui_release(Function1 function1) {
        for (Modifier.Node delegate$ui_release = getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
            function1.invoke(delegate$ui_release);
        }
    }

    public final Modifier.Node getDelegate$ui_release() {
        return this.delegate;
    }

    public final int getSelfKindSet$ui_release() {
        return this.selfKindSet;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void markAsAttached$ui_release() {
        super.markAsAttached$ui_release();
        for (Modifier.Node delegate$ui_release = getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
            delegate$ui_release.updateCoordinator$ui_release(getCoordinator$ui_release());
            if (!delegate$ui_release.isAttached()) {
                delegate$ui_release.markAsAttached$ui_release();
            }
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void markAsDetached$ui_release() {
        for (Modifier.Node delegate$ui_release = getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
            delegate$ui_release.markAsDetached$ui_release();
        }
        super.markAsDetached$ui_release();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void reset$ui_release() {
        super.reset$ui_release();
        for (Modifier.Node delegate$ui_release = getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
            delegate$ui_release.reset$ui_release();
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void runAttachLifecycle$ui_release() {
        for (Modifier.Node delegate$ui_release = getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
            delegate$ui_release.runAttachLifecycle$ui_release();
        }
        super.runAttachLifecycle$ui_release();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void runDetachLifecycle$ui_release() {
        super.runDetachLifecycle$ui_release();
        for (Modifier.Node delegate$ui_release = getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
            delegate$ui_release.runDetachLifecycle$ui_release();
        }
    }

    public final void setDelegate$ui_release(Modifier.Node node) {
        this.delegate = node;
    }

    protected final void undelegate(DelegatableNode delegatableNode) {
        Modifier.Node node = null;
        for (Modifier.Node node2 = this.delegate; node2 != null; node2 = node2.getChild$ui_release()) {
            if (node2 == delegatableNode) {
                if (node2.isAttached()) {
                    NodeKindKt.autoInvalidateRemovedNode(node2);
                    node2.runDetachLifecycle$ui_release();
                    node2.markAsDetached$ui_release();
                }
                node2.setAsDelegateTo$ui_release(node2);
                node2.setAggregateChildKindSet$ui_release(0);
                if (node == null) {
                    this.delegate = node2.getChild$ui_release();
                } else {
                    node.setChild$ui_release(node2.getChild$ui_release());
                }
                node2.setChild$ui_release(null);
                node2.setParent$ui_release(null);
                int kindSet$ui_release = getKindSet$ui_release();
                int calculateNodeKindSetFromIncludingDelegates = NodeKindKt.calculateNodeKindSetFromIncludingDelegates(this);
                updateNodeKindSet(calculateNodeKindSetFromIncludingDelegates, true);
                if (isAttached() && (kindSet$ui_release & NodeKind.m4320constructorimpl(2)) != 0 && (NodeKind.m4320constructorimpl(2) & calculateNodeKindSetFromIncludingDelegates) == 0) {
                    NodeChain nodes$ui_release = DelegatableNodeKt.requireLayoutNode(this).getNodes$ui_release();
                    getNode().updateCoordinator$ui_release(null);
                    nodes$ui_release.syncCoordinators();
                    return;
                }
                return;
            }
            node = node2;
        }
        throw new IllegalStateException(("Could not find delegate: " + delegatableNode).toString());
    }

    public final void undelegateUnprotected$ui_release(DelegatableNode delegatableNode) {
        undelegate(delegatableNode);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void updateCoordinator$ui_release(NodeCoordinator nodeCoordinator) {
        super.updateCoordinator$ui_release(nodeCoordinator);
        for (Modifier.Node delegate$ui_release = getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
            delegate$ui_release.updateCoordinator$ui_release(nodeCoordinator);
        }
    }
}
