package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class DelegatableNodeKt {
    public static final /* synthetic */ Modifier.Node access$pop(MutableVector mutableVector) {
        return pop(mutableVector);
    }

    public static final void addLayoutNodeChildren(MutableVector<Modifier.Node> mutableVector, Modifier.Node node) {
        MutableVector<LayoutNode> mutableVector2 = requireLayoutNode(node).get_children$ui_release();
        int size = mutableVector2.getSize();
        if (size > 0) {
            int i8 = size - 1;
            LayoutNode[] content = mutableVector2.getContent();
            do {
                mutableVector.add(content[i8].getNodes$ui_release().getHead$ui_release());
                i8--;
            } while (i8 >= 0);
        }
    }

    /* renamed from: ancestors-64DMado */
    public static final /* synthetic */ <T> List<T> m4199ancestors64DMado(DelegatableNode delegatableNode, int i8) {
        NodeChain nodes$ui_release;
        if (delegatableNode.getNode().isAttached()) {
            Modifier.Node parent$ui_release = delegatableNode.getNode().getParent$ui_release();
            LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
            ArrayList arrayList = null;
            while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i8) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & i8) != 0) {
                            for (Modifier.Node node = parent$ui_release; node != null; node = pop(null)) {
                                AbstractC3292y.n(3, ExifInterface.GPS_DIRECTION_TRUE);
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.add(node);
                            }
                        }
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui_release();
                if (requireLayoutNode != null && (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) != null) {
                    parent$ui_release = nodes$ui_release.getTail$ui_release();
                } else {
                    parent$ui_release = null;
                }
            }
            return arrayList;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final LayoutModifierNode asLayoutModifierNode(Modifier.Node node) {
        if ((NodeKind.m4320constructorimpl(2) & node.getKindSet$ui_release()) != 0) {
            if (node instanceof LayoutModifierNode) {
                return (LayoutModifierNode) node;
            }
            if (node instanceof DelegatingNode) {
                Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release();
                while (delegate$ui_release != 0) {
                    if (delegate$ui_release instanceof LayoutModifierNode) {
                        return (LayoutModifierNode) delegate$ui_release;
                    }
                    if ((delegate$ui_release instanceof DelegatingNode) && (NodeKind.m4320constructorimpl(2) & delegate$ui_release.getKindSet$ui_release()) != 0) {
                        delegate$ui_release = ((DelegatingNode) delegate$ui_release).getDelegate$ui_release();
                    } else {
                        delegate$ui_release = delegate$ui_release.getChild$ui_release();
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: dispatchForKind-6rFNWt0 */
    public static final /* synthetic */ <T> void m4200dispatchForKind6rFNWt0(Modifier.Node node, int i8, Function1 function1) {
        while (node != null) {
            AbstractC3292y.n(3, ExifInterface.GPS_DIRECTION_TRUE);
            function1.invoke(node);
            node = pop(null);
        }
    }

    /* renamed from: has-64DMado */
    public static final boolean m4201has64DMado(DelegatableNode delegatableNode, int i8) {
        if ((delegatableNode.getNode().getAggregateChildKindSet$ui_release() & i8) != 0) {
            return true;
        }
        return false;
    }

    public static final void invalidateSubtree(DelegatableNode delegatableNode) {
        if (delegatableNode.getNode().isAttached()) {
            LayoutNode.invalidateSubtree$default(requireLayoutNode(delegatableNode), false, 1, null);
        }
    }

    public static final boolean isDelegationRoot(DelegatableNode delegatableNode) {
        if (delegatableNode.getNode() == delegatableNode) {
            return true;
        }
        return false;
    }

    public static final Modifier.Node nearestAncestor(DelegatableNode delegatableNode, int i8) {
        NodeChain nodes$ui_release;
        if (delegatableNode.getNode().isAttached()) {
            Modifier.Node parent$ui_release = delegatableNode.getNode().getParent$ui_release();
            LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
            while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i8) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & i8) != 0) {
                            return parent$ui_release;
                        }
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui_release();
                if (requireLayoutNode != null && (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) != null) {
                    parent$ui_release = nodes$ui_release.getTail$ui_release();
                } else {
                    parent$ui_release = null;
                }
            }
            return null;
        }
        throw new IllegalStateException("nearestAncestor called on an unattached node".toString());
    }

    /* renamed from: nearestAncestor-64DMado */
    public static final /* synthetic */ <T> T m4202nearestAncestor64DMado(DelegatableNode delegatableNode, int i8) {
        NodeChain nodes$ui_release;
        if (delegatableNode.getNode().isAttached()) {
            Object parent$ui_release = delegatableNode.getNode().getParent$ui_release();
            LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
            while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i8) != 0) {
                    while (parent$ui_release != null) {
                        if ((((Modifier.Node) parent$ui_release).getKindSet$ui_release() & i8) != 0) {
                            AbstractC3292y.n(3, ExifInterface.GPS_DIRECTION_TRUE);
                            return (T) parent$ui_release;
                        }
                        parent$ui_release = (T) ((Modifier.Node) parent$ui_release).getParent$ui_release();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui_release();
                if (requireLayoutNode != null && (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) != null) {
                    parent$ui_release = (T) nodes$ui_release.getTail$ui_release();
                } else {
                    parent$ui_release = (T) null;
                }
            }
            return null;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    public static final Modifier.Node pop(MutableVector<Modifier.Node> mutableVector) {
        if (mutableVector != null && !mutableVector.isEmpty()) {
            return mutableVector.removeAt(mutableVector.getSize() - 1);
        }
        return null;
    }

    /* renamed from: requireCoordinator-64DMado */
    public static final NodeCoordinator m4203requireCoordinator64DMado(DelegatableNode delegatableNode, int i8) {
        NodeCoordinator coordinator$ui_release = delegatableNode.getNode().getCoordinator$ui_release();
        AbstractC3292y.f(coordinator$ui_release);
        if (coordinator$ui_release.getTail() == delegatableNode && NodeKindKt.m4329getIncludeSelfInTraversalH91voCI(i8)) {
            NodeCoordinator wrapped$ui_release = coordinator$ui_release.getWrapped$ui_release();
            AbstractC3292y.f(wrapped$ui_release);
            return wrapped$ui_release;
        }
        return coordinator$ui_release;
    }

    public static final Density requireDensity(DelegatableNode delegatableNode) {
        return requireLayoutNode(delegatableNode).getDensity();
    }

    public static final LayoutDirection requireLayoutDirection(DelegatableNode delegatableNode) {
        return requireLayoutNode(delegatableNode).getLayoutDirection();
    }

    public static final LayoutNode requireLayoutNode(DelegatableNode delegatableNode) {
        NodeCoordinator coordinator$ui_release = delegatableNode.getNode().getCoordinator$ui_release();
        if (coordinator$ui_release != null) {
            return coordinator$ui_release.getLayoutNode();
        }
        throw new IllegalStateException("Cannot obtain node coordinator. Is the Modifier.Node attached?".toString());
    }

    public static final Owner requireOwner(DelegatableNode delegatableNode) {
        Owner owner$ui_release = requireLayoutNode(delegatableNode).getOwner$ui_release();
        if (owner$ui_release != null) {
            return owner$ui_release;
        }
        throw new IllegalStateException("This node does not have an owner.".toString());
    }

    public static final void visitAncestors(DelegatableNode delegatableNode, int i8, boolean z8, Function1 function1) {
        Modifier.Node parent$ui_release;
        NodeChain nodes$ui_release;
        if (delegatableNode.getNode().isAttached()) {
            if (z8) {
                parent$ui_release = delegatableNode.getNode();
            } else {
                parent$ui_release = delegatableNode.getNode().getParent$ui_release();
            }
            LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
            while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i8) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & i8) != 0) {
                            function1.invoke(parent$ui_release);
                        }
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui_release();
                if (requireLayoutNode != null && (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) != null) {
                    parent$ui_release = nodes$ui_release.getTail$ui_release();
                } else {
                    parent$ui_release = null;
                }
            }
            return;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    public static /* synthetic */ void visitAncestors$default(DelegatableNode delegatableNode, int i8, boolean z8, Function1 function1, int i9, Object obj) {
        Modifier.Node parent$ui_release;
        NodeChain nodes$ui_release;
        if ((i9 & 2) != 0) {
            z8 = false;
        }
        if (delegatableNode.getNode().isAttached()) {
            if (z8) {
                parent$ui_release = delegatableNode.getNode();
            } else {
                parent$ui_release = delegatableNode.getNode().getParent$ui_release();
            }
            LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
            while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i8) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & i8) != 0) {
                            function1.invoke(parent$ui_release);
                        }
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui_release();
                if (requireLayoutNode != null && (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) != null) {
                    parent$ui_release = nodes$ui_release.getTail$ui_release();
                } else {
                    parent$ui_release = null;
                }
            }
            return;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    /* renamed from: visitAncestors-Y-YKmho */
    public static final /* synthetic */ <T> void m4204visitAncestorsYYKmho(DelegatableNode delegatableNode, int i8, boolean z8, Function1 function1) {
        Modifier.Node parent$ui_release;
        NodeChain nodes$ui_release;
        if (delegatableNode.getNode().isAttached()) {
            if (z8) {
                parent$ui_release = delegatableNode.getNode();
            } else {
                parent$ui_release = delegatableNode.getNode().getParent$ui_release();
            }
            LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
            while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i8) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & i8) != 0) {
                            for (Modifier.Node node = parent$ui_release; node != null; node = pop(null)) {
                                AbstractC3292y.n(3, ExifInterface.GPS_DIRECTION_TRUE);
                                function1.invoke(node);
                            }
                        }
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui_release();
                if (requireLayoutNode != null && (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) != null) {
                    parent$ui_release = nodes$ui_release.getTail$ui_release();
                } else {
                    parent$ui_release = null;
                }
            }
            return;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    /* renamed from: visitAncestors-Y-YKmho$default */
    public static /* synthetic */ void m4205visitAncestorsYYKmho$default(DelegatableNode delegatableNode, int i8, boolean z8, Function1 function1, int i9, Object obj) {
        Modifier.Node parent$ui_release;
        NodeChain nodes$ui_release;
        if ((i9 & 2) != 0) {
            z8 = false;
        }
        if (delegatableNode.getNode().isAttached()) {
            if (z8) {
                parent$ui_release = delegatableNode.getNode();
            } else {
                parent$ui_release = delegatableNode.getNode().getParent$ui_release();
            }
            LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
            while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i8) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & i8) != 0) {
                            for (Modifier.Node node = parent$ui_release; node != null; node = pop(null)) {
                                AbstractC3292y.n(3, ExifInterface.GPS_DIRECTION_TRUE);
                                function1.invoke(node);
                            }
                        }
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui_release();
                if (requireLayoutNode != null && (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) != null) {
                    parent$ui_release = nodes$ui_release.getTail$ui_release();
                } else {
                    parent$ui_release = null;
                }
            }
            return;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    public static final void visitChildren(DelegatableNode delegatableNode, int i8, Function1 function1) {
        if (delegatableNode.getNode().isAttached()) {
            MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                addLayoutNodeChildren(mutableVector, delegatableNode.getNode());
            } else {
                mutableVector.add(child$ui_release);
            }
            while (mutableVector.isNotEmpty()) {
                Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
                if ((node.getAggregateChildKindSet$ui_release() & i8) == 0) {
                    addLayoutNodeChildren(mutableVector, node);
                } else {
                    while (true) {
                        if (node == null) {
                            break;
                        }
                        if ((node.getKindSet$ui_release() & i8) != 0) {
                            function1.invoke(node);
                            break;
                        }
                        node = node.getChild$ui_release();
                    }
                }
            }
            return;
        }
        throw new IllegalStateException("visitChildren called on an unattached node".toString());
    }

    /* renamed from: visitChildren-6rFNWt0 */
    public static final /* synthetic */ <T> void m4206visitChildren6rFNWt0(DelegatableNode delegatableNode, int i8, Function1 function1) {
        if (delegatableNode.getNode().isAttached()) {
            MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                addLayoutNodeChildren(mutableVector, delegatableNode.getNode());
            } else {
                mutableVector.add(child$ui_release);
            }
            while (mutableVector.isNotEmpty()) {
                Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
                if ((node.getAggregateChildKindSet$ui_release() & i8) == 0) {
                    addLayoutNodeChildren(mutableVector, node);
                } else {
                    while (true) {
                        if (node == null) {
                            break;
                        }
                        if ((node.getKindSet$ui_release() & i8) != 0) {
                            while (node != null) {
                                AbstractC3292y.n(3, ExifInterface.GPS_DIRECTION_TRUE);
                                function1.invoke(node);
                                node = pop(null);
                            }
                        } else {
                            node = node.getChild$ui_release();
                        }
                    }
                }
            }
            return;
        }
        throw new IllegalStateException("visitChildren called on an unattached node".toString());
    }

    public static final void visitLocalAncestors(DelegatableNode delegatableNode, int i8, Function1 function1) {
        if (delegatableNode.getNode().isAttached()) {
            for (Modifier.Node parent$ui_release = delegatableNode.getNode().getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
                if ((parent$ui_release.getKindSet$ui_release() & i8) != 0) {
                    function1.invoke(parent$ui_release);
                }
            }
            return;
        }
        throw new IllegalStateException("visitLocalAncestors called on an unattached node".toString());
    }

    /* renamed from: visitLocalAncestors-6rFNWt0 */
    public static final /* synthetic */ <T> void m4207visitLocalAncestors6rFNWt0(DelegatableNode delegatableNode, int i8, Function1 function1) {
        if (delegatableNode.getNode().isAttached()) {
            for (Modifier.Node parent$ui_release = delegatableNode.getNode().getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
                if ((parent$ui_release.getKindSet$ui_release() & i8) != 0) {
                    for (Modifier.Node node = parent$ui_release; node != null; node = pop(null)) {
                        AbstractC3292y.n(3, ExifInterface.GPS_DIRECTION_TRUE);
                        function1.invoke(node);
                    }
                }
            }
            return;
        }
        throw new IllegalStateException("visitLocalAncestors called on an unattached node".toString());
    }

    public static final void visitLocalDescendants(DelegatableNode delegatableNode, int i8, Function1 function1) {
        if (delegatableNode.getNode().isAttached()) {
            Modifier.Node node = delegatableNode.getNode();
            if ((node.getAggregateChildKindSet$ui_release() & i8) == 0) {
                return;
            }
            for (Modifier.Node child$ui_release = node.getChild$ui_release(); child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                if ((child$ui_release.getKindSet$ui_release() & i8) != 0) {
                    function1.invoke(child$ui_release);
                }
            }
            return;
        }
        throw new IllegalStateException("visitLocalDescendants called on an unattached node".toString());
    }

    /* renamed from: visitLocalDescendants-6rFNWt0 */
    public static final /* synthetic */ <T> void m4208visitLocalDescendants6rFNWt0(DelegatableNode delegatableNode, int i8, Function1 function1) {
        if (delegatableNode.getNode().isAttached()) {
            Modifier.Node node = delegatableNode.getNode();
            if ((node.getAggregateChildKindSet$ui_release() & i8) != 0) {
                for (Modifier.Node child$ui_release = node.getChild$ui_release(); child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                    if ((child$ui_release.getKindSet$ui_release() & i8) != 0) {
                        for (Modifier.Node node2 = child$ui_release; node2 != null; node2 = pop(null)) {
                            AbstractC3292y.n(3, ExifInterface.GPS_DIRECTION_TRUE);
                            function1.invoke(node2);
                        }
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("visitLocalDescendants called on an unattached node".toString());
    }

    /* renamed from: visitSelfAndAncestors-5BbP62I */
    public static final /* synthetic */ <T> void m4209visitSelfAndAncestors5BbP62I(DelegatableNode delegatableNode, int i8, int i9, Function1 function1) {
        NodeChain nodes$ui_release;
        Modifier.Node node = delegatableNode.getNode();
        int i10 = i8 | i9;
        if (delegatableNode.getNode().isAttached()) {
            Modifier.Node node2 = delegatableNode.getNode();
            LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
            while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i10) != 0) {
                    while (node2 != null) {
                        if ((node2.getKindSet$ui_release() & i10) != 0) {
                            if (node2 != node && (node2.getKindSet$ui_release() & i9) != 0) {
                                return;
                            }
                            if ((node2.getKindSet$ui_release() & i8) != 0) {
                                for (Modifier.Node node3 = node2; node3 != null; node3 = pop(null)) {
                                    AbstractC3292y.n(3, ExifInterface.GPS_DIRECTION_TRUE);
                                    function1.invoke(node3);
                                }
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

    /* renamed from: visitSelfAndChildren-6rFNWt0 */
    public static final /* synthetic */ <T> void m4210visitSelfAndChildren6rFNWt0(DelegatableNode delegatableNode, int i8, Function1 function1) {
        for (Object node = delegatableNode.getNode(); node != null; node = pop(null)) {
            AbstractC3292y.n(3, ExifInterface.GPS_DIRECTION_TRUE);
            function1.invoke(node);
        }
        if (delegatableNode.getNode().isAttached()) {
            MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                addLayoutNodeChildren(mutableVector, delegatableNode.getNode());
            } else {
                mutableVector.add(child$ui_release);
            }
            while (mutableVector.isNotEmpty()) {
                Modifier.Node node2 = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
                if ((node2.getAggregateChildKindSet$ui_release() & i8) == 0) {
                    addLayoutNodeChildren(mutableVector, node2);
                } else {
                    while (true) {
                        if (node2 == null) {
                            break;
                        }
                        if ((node2.getKindSet$ui_release() & i8) != 0) {
                            while (node2 != null) {
                                AbstractC3292y.n(3, ExifInterface.GPS_DIRECTION_TRUE);
                                function1.invoke(node2);
                                node2 = pop(null);
                            }
                        } else {
                            node2 = node2.getChild$ui_release();
                        }
                    }
                }
            }
            return;
        }
        throw new IllegalStateException("visitChildren called on an unattached node".toString());
    }

    public static final void visitSubtree(DelegatableNode delegatableNode, int i8, Function1 function1) {
        if (delegatableNode.getNode().isAttached()) {
            Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
            LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
            NestedVectorStack nestedVectorStack = new NestedVectorStack();
            while (requireLayoutNode != null) {
                if (child$ui_release == null) {
                    child$ui_release = requireLayoutNode.getNodes$ui_release().getHead$ui_release();
                }
                if ((child$ui_release.getAggregateChildKindSet$ui_release() & i8) != 0) {
                    while (child$ui_release != null) {
                        if ((child$ui_release.getKindSet$ui_release() & i8) != 0) {
                            function1.invoke(child$ui_release);
                        }
                        child$ui_release = child$ui_release.getChild$ui_release();
                    }
                }
                nestedVectorStack.push(requireLayoutNode.get_children$ui_release());
                child$ui_release = null;
                if (nestedVectorStack.isNotEmpty()) {
                    requireLayoutNode = (LayoutNode) nestedVectorStack.pop();
                } else {
                    requireLayoutNode = null;
                }
            }
            return;
        }
        throw new IllegalStateException("visitSubtree called on an unattached node".toString());
    }

    /* renamed from: visitSubtree-6rFNWt0 */
    public static final /* synthetic */ <T> void m4211visitSubtree6rFNWt0(DelegatableNode delegatableNode, int i8, Function1 function1) {
        if (delegatableNode.getNode().isAttached()) {
            Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
            LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
            NestedVectorStack nestedVectorStack = new NestedVectorStack();
            while (requireLayoutNode != null) {
                if (child$ui_release == null) {
                    child$ui_release = requireLayoutNode.getNodes$ui_release().getHead$ui_release();
                }
                if ((child$ui_release.getAggregateChildKindSet$ui_release() & i8) != 0) {
                    while (child$ui_release != null) {
                        if ((child$ui_release.getKindSet$ui_release() & i8) != 0) {
                            for (Modifier.Node node = child$ui_release; node != null; node = pop(null)) {
                                AbstractC3292y.n(3, ExifInterface.GPS_DIRECTION_TRUE);
                                function1.invoke(node);
                            }
                        }
                        child$ui_release = child$ui_release.getChild$ui_release();
                    }
                }
                nestedVectorStack.push(requireLayoutNode.get_children$ui_release());
                if (nestedVectorStack.isNotEmpty()) {
                    requireLayoutNode = (LayoutNode) nestedVectorStack.pop();
                } else {
                    requireLayoutNode = null;
                }
                child$ui_release = null;
            }
            return;
        }
        throw new IllegalStateException("visitSubtree called on an unattached node".toString());
    }

    public static final void visitSubtreeIf(DelegatableNode delegatableNode, int i8, Function1 function1) {
        if (delegatableNode.getNode().isAttached()) {
            MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                addLayoutNodeChildren(mutableVector, delegatableNode.getNode());
            } else {
                mutableVector.add(child$ui_release);
            }
            while (mutableVector.isNotEmpty()) {
                Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
                if ((node.getAggregateChildKindSet$ui_release() & i8) != 0) {
                    for (Modifier.Node node2 = node; node2 != null; node2 = node2.getChild$ui_release()) {
                        if ((node2.getKindSet$ui_release() & i8) == 0 || ((Boolean) function1.invoke(node2)).booleanValue()) {
                        }
                    }
                }
                addLayoutNodeChildren(mutableVector, node);
            }
            return;
        }
        throw new IllegalStateException("visitSubtreeIf called on an unattached node".toString());
    }

    /* renamed from: visitSubtreeIf-6rFNWt0 */
    public static final /* synthetic */ <T> void m4212visitSubtreeIf6rFNWt0(DelegatableNode delegatableNode, int i8, Function1 function1) {
        if (delegatableNode.getNode().isAttached()) {
            MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                addLayoutNodeChildren(mutableVector, delegatableNode.getNode());
            } else {
                mutableVector.add(child$ui_release);
            }
            while (mutableVector.isNotEmpty()) {
                Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
                if ((node.getAggregateChildKindSet$ui_release() & i8) != 0) {
                    for (Modifier.Node node2 = node; node2 != null; node2 = node2.getChild$ui_release()) {
                        if ((node2.getKindSet$ui_release() & i8) != 0) {
                            for (Modifier.Node node3 = node2; node3 != null; node3 = pop(null)) {
                                AbstractC3292y.n(3, ExifInterface.GPS_DIRECTION_TRUE);
                                if (!((Boolean) function1.invoke(node3)).booleanValue()) {
                                    break;
                                }
                            }
                        }
                    }
                }
                addLayoutNodeChildren(mutableVector, node);
            }
            return;
        }
        throw new IllegalStateException("visitSubtreeIf called on an unattached node".toString());
    }
}
