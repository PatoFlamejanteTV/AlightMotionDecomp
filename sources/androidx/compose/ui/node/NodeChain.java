package androidx.compose.ui.node;

import R5.AbstractC1435t;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.layout.ModifierInfo;
import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class NodeChain {
    public static final int $stable = 8;
    private MutableVector<Modifier.Element> buffer;
    private Differ cachedDiffer;
    private MutableVector<Modifier.Element> current;
    private Modifier.Node head;
    private final InnerNodeCoordinator innerCoordinator;
    private final LayoutNode layoutNode;
    private Logger logger;
    private NodeCoordinator outerCoordinator;
    private final Modifier.Node tail;

    /* loaded from: classes.dex */
    public final class Differ implements DiffCallback {
        private MutableVector<Modifier.Element> after;
        private MutableVector<Modifier.Element> before;
        private Modifier.Node node;
        private int offset;
        private boolean shouldAttachOnInsert;

        public Differ(Modifier.Node node, int i8, MutableVector<Modifier.Element> mutableVector, MutableVector<Modifier.Element> mutableVector2, boolean z8) {
            this.node = node;
            this.offset = i8;
            this.before = mutableVector;
            this.after = mutableVector2;
            this.shouldAttachOnInsert = z8;
        }

        @Override // androidx.compose.ui.node.DiffCallback
        public boolean areItemsTheSame(int i8, int i9) {
            MutableVector<Modifier.Element> mutableVector = this.before;
            Modifier.Element element = mutableVector.getContent()[this.offset + i8];
            MutableVector<Modifier.Element> mutableVector2 = this.after;
            if (NodeChainKt.actionForModifiers(element, mutableVector2.getContent()[this.offset + i9]) != 0) {
                return true;
            }
            return false;
        }

        public final MutableVector<Modifier.Element> getAfter() {
            return this.after;
        }

        public final MutableVector<Modifier.Element> getBefore() {
            return this.before;
        }

        public final Modifier.Node getNode() {
            return this.node;
        }

        public final int getOffset() {
            return this.offset;
        }

        public final boolean getShouldAttachOnInsert() {
            return this.shouldAttachOnInsert;
        }

        @Override // androidx.compose.ui.node.DiffCallback
        public void insert(int i8) {
            int i9 = this.offset + i8;
            Modifier.Node node = this.node;
            this.node = NodeChain.this.createAndInsertNodeAsChild(this.after.getContent()[i9], node);
            Logger logger = NodeChain.this.logger;
            if (logger != null) {
                logger.nodeInserted(i9, i9, this.after.getContent()[i9], node, this.node);
            }
            if (this.shouldAttachOnInsert) {
                Modifier.Node child$ui_release = this.node.getChild$ui_release();
                AbstractC3292y.f(child$ui_release);
                NodeCoordinator coordinator$ui_release = child$ui_release.getCoordinator$ui_release();
                AbstractC3292y.f(coordinator$ui_release);
                LayoutModifierNode asLayoutModifierNode = DelegatableNodeKt.asLayoutModifierNode(this.node);
                if (asLayoutModifierNode != null) {
                    LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = new LayoutModifierNodeCoordinator(NodeChain.this.getLayoutNode(), asLayoutModifierNode);
                    this.node.updateCoordinator$ui_release(layoutModifierNodeCoordinator);
                    NodeChain.this.propagateCoordinator(this.node, layoutModifierNodeCoordinator);
                    layoutModifierNodeCoordinator.setWrappedBy$ui_release(coordinator$ui_release.getWrappedBy$ui_release());
                    layoutModifierNodeCoordinator.setWrapped$ui_release(coordinator$ui_release);
                    coordinator$ui_release.setWrappedBy$ui_release(layoutModifierNodeCoordinator);
                } else {
                    this.node.updateCoordinator$ui_release(coordinator$ui_release);
                }
                this.node.markAsAttached$ui_release();
                this.node.runAttachLifecycle$ui_release();
                NodeKindKt.autoInvalidateInsertedNode(this.node);
                return;
            }
            this.node.setInsertedNodeAwaitingAttachForInvalidation$ui_release(true);
        }

        @Override // androidx.compose.ui.node.DiffCallback
        public void remove(int i8, int i9) {
            Modifier.Node child$ui_release = this.node.getChild$ui_release();
            AbstractC3292y.f(child$ui_release);
            Logger logger = NodeChain.this.logger;
            if (logger != null) {
                MutableVector<Modifier.Element> mutableVector = this.before;
                logger.nodeRemoved(i9, mutableVector.getContent()[this.offset + i9], child$ui_release);
            }
            if ((NodeKind.m4320constructorimpl(2) & child$ui_release.getKindSet$ui_release()) != 0) {
                NodeCoordinator coordinator$ui_release = child$ui_release.getCoordinator$ui_release();
                AbstractC3292y.f(coordinator$ui_release);
                NodeCoordinator wrappedBy$ui_release = coordinator$ui_release.getWrappedBy$ui_release();
                NodeCoordinator wrapped$ui_release = coordinator$ui_release.getWrapped$ui_release();
                AbstractC3292y.f(wrapped$ui_release);
                if (wrappedBy$ui_release != null) {
                    wrappedBy$ui_release.setWrapped$ui_release(wrapped$ui_release);
                }
                wrapped$ui_release.setWrappedBy$ui_release(wrappedBy$ui_release);
                NodeChain.this.propagateCoordinator(this.node, wrapped$ui_release);
            }
            this.node = NodeChain.this.detachAndRemoveNode(child$ui_release);
        }

        @Override // androidx.compose.ui.node.DiffCallback
        public void same(int i8, int i9) {
            Modifier.Node child$ui_release = this.node.getChild$ui_release();
            AbstractC3292y.f(child$ui_release);
            this.node = child$ui_release;
            MutableVector<Modifier.Element> mutableVector = this.before;
            Modifier.Element element = mutableVector.getContent()[this.offset + i8];
            MutableVector<Modifier.Element> mutableVector2 = this.after;
            Modifier.Element element2 = mutableVector2.getContent()[this.offset + i9];
            if (!AbstractC3292y.d(element, element2)) {
                NodeChain.this.updateNode(element, element2, this.node);
                Logger logger = NodeChain.this.logger;
                if (logger != null) {
                    int i10 = this.offset;
                    logger.nodeUpdated(i10 + i8, i10 + i9, element, element2, this.node);
                    return;
                }
                return;
            }
            Logger logger2 = NodeChain.this.logger;
            if (logger2 != null) {
                int i11 = this.offset;
                logger2.nodeReused(i11 + i8, i11 + i9, element, element2, this.node);
            }
        }

        public final void setAfter(MutableVector<Modifier.Element> mutableVector) {
            this.after = mutableVector;
        }

        public final void setBefore(MutableVector<Modifier.Element> mutableVector) {
            this.before = mutableVector;
        }

        public final void setNode(Modifier.Node node) {
            this.node = node;
        }

        public final void setOffset(int i8) {
            this.offset = i8;
        }

        public final void setShouldAttachOnInsert(boolean z8) {
            this.shouldAttachOnInsert = z8;
        }
    }

    /* loaded from: classes.dex */
    public interface Logger {
        void linearDiffAborted(int i8, Modifier.Element element, Modifier.Element element2, Modifier.Node node);

        void nodeInserted(int i8, int i9, Modifier.Element element, Modifier.Node node, Modifier.Node node2);

        void nodeRemoved(int i8, Modifier.Element element, Modifier.Node node);

        void nodeReused(int i8, int i9, Modifier.Element element, Modifier.Element element2, Modifier.Node node);

        void nodeUpdated(int i8, int i9, Modifier.Element element, Modifier.Element element2, Modifier.Node node);
    }

    public NodeChain(LayoutNode layoutNode) {
        this.layoutNode = layoutNode;
        InnerNodeCoordinator innerNodeCoordinator = new InnerNodeCoordinator(layoutNode);
        this.innerCoordinator = innerNodeCoordinator;
        this.outerCoordinator = innerNodeCoordinator;
        TailModifierNode tail = innerNodeCoordinator.getTail();
        this.tail = tail;
        this.head = tail;
    }

    public final Modifier.Node createAndInsertNodeAsChild(Modifier.Element element, Modifier.Node node) {
        Modifier.Node backwardsCompatNode;
        if (element instanceof ModifierNodeElement) {
            backwardsCompatNode = ((ModifierNodeElement) element).create();
            backwardsCompatNode.setKindSet$ui_release(NodeKindKt.calculateNodeKindSetFromIncludingDelegates(backwardsCompatNode));
        } else {
            backwardsCompatNode = new BackwardsCompatNode(element);
        }
        if (!backwardsCompatNode.isAttached()) {
            backwardsCompatNode.setInsertedNodeAwaitingAttachForInvalidation$ui_release(true);
            return insertChild(backwardsCompatNode, node);
        }
        throw new IllegalStateException("A ModifierNodeElement cannot return an already attached node from create() ".toString());
    }

    private final Modifier.Node createAndInsertNodeAsParent(Modifier.Element element, Modifier.Node node) {
        Modifier.Node backwardsCompatNode;
        if (element instanceof ModifierNodeElement) {
            backwardsCompatNode = ((ModifierNodeElement) element).create();
            backwardsCompatNode.setKindSet$ui_release(NodeKindKt.calculateNodeKindSetFromIncludingDelegates(backwardsCompatNode));
        } else {
            backwardsCompatNode = new BackwardsCompatNode(element);
        }
        if (!backwardsCompatNode.isAttached()) {
            backwardsCompatNode.setInsertedNodeAwaitingAttachForInvalidation$ui_release(true);
            return insertParent(backwardsCompatNode, node);
        }
        throw new IllegalStateException("createAndInsertNodeAsParent called on an attached node".toString());
    }

    public final Modifier.Node detachAndRemoveNode(Modifier.Node node) {
        if (node.isAttached()) {
            NodeKindKt.autoInvalidateRemovedNode(node);
            node.runDetachLifecycle$ui_release();
            node.markAsDetached$ui_release();
        }
        return removeNode(node);
    }

    public final int getAggregateChildKindSet() {
        return this.head.getAggregateChildKindSet$ui_release();
    }

    private final Differ getDiffer(Modifier.Node node, int i8, MutableVector<Modifier.Element> mutableVector, MutableVector<Modifier.Element> mutableVector2, boolean z8) {
        Differ differ = this.cachedDiffer;
        if (differ == null) {
            Differ differ2 = new Differ(node, i8, mutableVector, mutableVector2, z8);
            this.cachedDiffer = differ2;
            return differ2;
        }
        differ.setNode(node);
        differ.setOffset(i8);
        differ.setBefore(mutableVector);
        differ.setAfter(mutableVector2);
        differ.setShouldAttachOnInsert(z8);
        return differ;
    }

    private final Modifier.Node insertChild(Modifier.Node node, Modifier.Node node2) {
        Modifier.Node child$ui_release = node2.getChild$ui_release();
        if (child$ui_release != null) {
            child$ui_release.setParent$ui_release(node);
            node.setChild$ui_release(child$ui_release);
        }
        node2.setChild$ui_release(node);
        node.setParent$ui_release(node2);
        return node;
    }

    private final Modifier.Node insertParent(Modifier.Node node, Modifier.Node node2) {
        Modifier.Node parent$ui_release = node2.getParent$ui_release();
        if (parent$ui_release != null) {
            parent$ui_release.setChild$ui_release(node);
            node.setParent$ui_release(parent$ui_release);
        }
        node2.setParent$ui_release(node);
        node.setChild$ui_release(node2);
        return node;
    }

    private final boolean isUpdating() {
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$1;
        Modifier.Node node = this.head;
        nodeChainKt$SentinelHead$1 = NodeChainKt.SentinelHead;
        if (node == nodeChainKt$SentinelHead$1) {
            return true;
        }
        return false;
    }

    private final Modifier.Node padChain() {
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$1;
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$12;
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$13;
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$14;
        Modifier.Node node = this.head;
        nodeChainKt$SentinelHead$1 = NodeChainKt.SentinelHead;
        if (node != nodeChainKt$SentinelHead$1) {
            Modifier.Node node2 = this.head;
            nodeChainKt$SentinelHead$12 = NodeChainKt.SentinelHead;
            node2.setParent$ui_release(nodeChainKt$SentinelHead$12);
            nodeChainKt$SentinelHead$13 = NodeChainKt.SentinelHead;
            nodeChainKt$SentinelHead$13.setChild$ui_release(node2);
            nodeChainKt$SentinelHead$14 = NodeChainKt.SentinelHead;
            return nodeChainKt$SentinelHead$14;
        }
        throw new IllegalStateException("padChain called on already padded chain".toString());
    }

    public final void propagateCoordinator(Modifier.Node node, NodeCoordinator nodeCoordinator) {
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$1;
        NodeCoordinator nodeCoordinator2;
        for (Modifier.Node parent$ui_release = node.getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            nodeChainKt$SentinelHead$1 = NodeChainKt.SentinelHead;
            if (parent$ui_release == nodeChainKt$SentinelHead$1) {
                LayoutNode parent$ui_release2 = this.layoutNode.getParent$ui_release();
                if (parent$ui_release2 != null) {
                    nodeCoordinator2 = parent$ui_release2.getInnerCoordinator$ui_release();
                } else {
                    nodeCoordinator2 = null;
                }
                nodeCoordinator.setWrappedBy$ui_release(nodeCoordinator2);
                this.outerCoordinator = nodeCoordinator;
                return;
            }
            if ((NodeKind.m4320constructorimpl(2) & parent$ui_release.getKindSet$ui_release()) == 0) {
                parent$ui_release.updateCoordinator$ui_release(nodeCoordinator);
            } else {
                return;
            }
        }
    }

    private final Modifier.Node removeNode(Modifier.Node node) {
        Modifier.Node child$ui_release = node.getChild$ui_release();
        Modifier.Node parent$ui_release = node.getParent$ui_release();
        if (child$ui_release != null) {
            child$ui_release.setParent$ui_release(parent$ui_release);
            node.setChild$ui_release(null);
        }
        if (parent$ui_release != null) {
            parent$ui_release.setChild$ui_release(child$ui_release);
            node.setParent$ui_release(null);
        }
        AbstractC3292y.f(parent$ui_release);
        return parent$ui_release;
    }

    private final void structuralUpdate(int i8, MutableVector<Modifier.Element> mutableVector, MutableVector<Modifier.Element> mutableVector2, Modifier.Node node, boolean z8) {
        MyersDiffKt.executeDiff(mutableVector.getSize() - i8, mutableVector2.getSize() - i8, getDiffer(node, i8, mutableVector, mutableVector2, z8));
        syncAggregateChildKindSet();
    }

    private final void syncAggregateChildKindSet() {
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$1;
        int i8 = 0;
        for (Modifier.Node parent$ui_release = this.tail.getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            nodeChainKt$SentinelHead$1 = NodeChainKt.SentinelHead;
            if (parent$ui_release != nodeChainKt$SentinelHead$1) {
                i8 |= parent$ui_release.getKindSet$ui_release();
                parent$ui_release.setAggregateChildKindSet$ui_release(i8);
            } else {
                return;
            }
        }
    }

    private final Modifier.Node trimChain(Modifier.Node node) {
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$1;
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$12;
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$13;
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$14;
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$15;
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$16;
        nodeChainKt$SentinelHead$1 = NodeChainKt.SentinelHead;
        if (node == nodeChainKt$SentinelHead$1) {
            nodeChainKt$SentinelHead$12 = NodeChainKt.SentinelHead;
            Modifier.Node child$ui_release = nodeChainKt$SentinelHead$12.getChild$ui_release();
            if (child$ui_release == null) {
                child$ui_release = this.tail;
            }
            child$ui_release.setParent$ui_release(null);
            nodeChainKt$SentinelHead$13 = NodeChainKt.SentinelHead;
            nodeChainKt$SentinelHead$13.setChild$ui_release(null);
            nodeChainKt$SentinelHead$14 = NodeChainKt.SentinelHead;
            nodeChainKt$SentinelHead$14.setAggregateChildKindSet$ui_release(-1);
            nodeChainKt$SentinelHead$15 = NodeChainKt.SentinelHead;
            nodeChainKt$SentinelHead$15.updateCoordinator$ui_release(null);
            nodeChainKt$SentinelHead$16 = NodeChainKt.SentinelHead;
            if (child$ui_release != nodeChainKt$SentinelHead$16) {
                return child$ui_release;
            }
            throw new IllegalStateException("trimChain did not update the head".toString());
        }
        throw new IllegalStateException("trimChain called on already trimmed chain".toString());
    }

    public final void updateNode(Modifier.Element element, Modifier.Element element2, Modifier.Node node) {
        if ((element instanceof ModifierNodeElement) && (element2 instanceof ModifierNodeElement)) {
            NodeChainKt.updateUnsafe((ModifierNodeElement) element2, node);
            if (node.isAttached()) {
                NodeKindKt.autoInvalidateUpdatedNode(node);
                return;
            } else {
                node.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(true);
                return;
            }
        }
        if (node instanceof BackwardsCompatNode) {
            ((BackwardsCompatNode) node).setElement(element2);
            if (node.isAttached()) {
                NodeKindKt.autoInvalidateUpdatedNode(node);
                return;
            } else {
                node.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(true);
                return;
            }
        }
        throw new IllegalStateException("Unknown Modifier.Node type".toString());
    }

    /* renamed from: firstFromHead-aLcG6gQ$ui_release */
    public final /* synthetic */ <T> T m4276firstFromHeadaLcG6gQ$ui_release(int i8, Function1 function1) {
        if ((getAggregateChildKindSet() & i8) != 0) {
            for (Modifier.Node head$ui_release = getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
                if ((head$ui_release.getKindSet$ui_release() & i8) != 0) {
                    for (T t8 = (T) head$ui_release; t8 != null; t8 = (T) DelegatableNodeKt.pop(null)) {
                        AbstractC3292y.n(3, ExifInterface.GPS_DIRECTION_TRUE);
                        if (((Boolean) function1.invoke(t8)).booleanValue()) {
                            return t8;
                        }
                    }
                }
                if ((head$ui_release.getAggregateChildKindSet$ui_release() & i8) == 0) {
                    break;
                }
            }
        }
        return null;
    }

    public final Modifier.Node getHead$ui_release() {
        return this.head;
    }

    public final InnerNodeCoordinator getInnerCoordinator$ui_release() {
        return this.innerCoordinator;
    }

    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    public final List<ModifierInfo> getModifierInfo() {
        MutableVector<Modifier.Element> mutableVector = this.current;
        if (mutableVector == null) {
            return AbstractC1435t.m();
        }
        int i8 = 0;
        MutableVector mutableVector2 = new MutableVector(new ModifierInfo[mutableVector.getSize()], 0);
        Modifier.Node head$ui_release = getHead$ui_release();
        while (head$ui_release != null && head$ui_release != getTail$ui_release()) {
            NodeCoordinator coordinator$ui_release = head$ui_release.getCoordinator$ui_release();
            if (coordinator$ui_release != null) {
                OwnedLayer layer = coordinator$ui_release.getLayer();
                OwnedLayer layer2 = this.innerCoordinator.getLayer();
                Modifier.Node child$ui_release = head$ui_release.getChild$ui_release();
                if (child$ui_release != this.tail || head$ui_release.getCoordinator$ui_release() == child$ui_release.getCoordinator$ui_release()) {
                    layer2 = null;
                }
                if (layer == null) {
                    layer = layer2;
                }
                mutableVector2.add(new ModifierInfo(mutableVector.getContent()[i8], coordinator$ui_release, layer));
                head$ui_release = head$ui_release.getChild$ui_release();
                i8++;
            } else {
                throw new IllegalArgumentException("getModifierInfo called on node with no coordinator".toString());
            }
        }
        return mutableVector2.asMutableList();
    }

    public final NodeCoordinator getOuterCoordinator$ui_release() {
        return this.outerCoordinator;
    }

    public final Modifier.Node getTail$ui_release() {
        return this.tail;
    }

    public final boolean has$ui_release(int i8) {
        if ((i8 & getAggregateChildKindSet()) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: has-H91voCI$ui_release */
    public final boolean m4277hasH91voCI$ui_release(int i8) {
        if ((i8 & getAggregateChildKindSet()) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: head-H91voCI$ui_release */
    public final /* synthetic */ <T> T m4278headH91voCI$ui_release(int i8) {
        if ((getAggregateChildKindSet() & i8) != 0) {
            for (Object obj = (T) getHead$ui_release(); obj != null; obj = (T) ((Modifier.Node) obj).getChild$ui_release()) {
                if ((((Modifier.Node) obj).getKindSet$ui_release() & i8) != 0) {
                    AbstractC3292y.n(3, ExifInterface.GPS_DIRECTION_TRUE);
                    return (T) obj;
                }
                if ((((Modifier.Node) obj).getAggregateChildKindSet$ui_release() & i8) == 0) {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    public final void headToTail$ui_release(int i8, Function1 function1) {
        if ((getAggregateChildKindSet() & i8) == 0) {
            return;
        }
        for (Modifier.Node head$ui_release = getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
            if ((head$ui_release.getKindSet$ui_release() & i8) != 0) {
                function1.invoke(head$ui_release);
            }
            if ((head$ui_release.getAggregateChildKindSet$ui_release() & i8) == 0) {
                return;
            }
        }
    }

    /* renamed from: headToTail-aLcG6gQ$ui_release */
    public final /* synthetic */ <T> void m4279headToTailaLcG6gQ$ui_release(int i8, Function1 function1) {
        if ((getAggregateChildKindSet() & i8) != 0) {
            for (Modifier.Node head$ui_release = getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
                if ((head$ui_release.getKindSet$ui_release() & i8) != 0) {
                    for (Modifier.Node node = head$ui_release; node != null; node = DelegatableNodeKt.pop(null)) {
                        AbstractC3292y.n(3, ExifInterface.GPS_DIRECTION_TRUE);
                        function1.invoke(node);
                    }
                }
                if ((head$ui_release.getAggregateChildKindSet$ui_release() & i8) == 0) {
                    return;
                }
            }
        }
    }

    public final void headToTailExclusive$ui_release(Function1 function1) {
        for (Modifier.Node head$ui_release = getHead$ui_release(); head$ui_release != null && head$ui_release != getTail$ui_release(); head$ui_release = head$ui_release.getChild$ui_release()) {
            function1.invoke(head$ui_release);
        }
    }

    public final void markAsAttached() {
        for (Modifier.Node head$ui_release = getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
            head$ui_release.markAsAttached$ui_release();
        }
    }

    public final void markAsDetached$ui_release() {
        for (Modifier.Node tail$ui_release = getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
            if (tail$ui_release.isAttached()) {
                tail$ui_release.markAsDetached$ui_release();
            }
        }
    }

    public final void resetState$ui_release() {
        int size;
        for (Modifier.Node tail$ui_release = getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
            if (tail$ui_release.isAttached()) {
                tail$ui_release.reset$ui_release();
            }
        }
        MutableVector<Modifier.Element> mutableVector = this.current;
        if (mutableVector != null && (size = mutableVector.getSize()) > 0) {
            Modifier.Element[] content = mutableVector.getContent();
            int i8 = 0;
            do {
                Modifier.Element element = content[i8];
                if (element instanceof SuspendPointerInputElement) {
                    mutableVector.set(i8, new ForceUpdateElement((ModifierNodeElement) element));
                }
                i8++;
            } while (i8 < size);
        }
        runDetachLifecycle$ui_release();
        markAsDetached$ui_release();
    }

    public final void runAttachLifecycle() {
        for (Modifier.Node head$ui_release = getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
            head$ui_release.runAttachLifecycle$ui_release();
            if (head$ui_release.getInsertedNodeAwaitingAttachForInvalidation$ui_release()) {
                NodeKindKt.autoInvalidateInsertedNode(head$ui_release);
            }
            if (head$ui_release.getUpdatedNodeAwaitingAttachForInvalidation$ui_release()) {
                NodeKindKt.autoInvalidateUpdatedNode(head$ui_release);
            }
            head$ui_release.setInsertedNodeAwaitingAttachForInvalidation$ui_release(false);
            head$ui_release.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(false);
        }
    }

    public final void runDetachLifecycle$ui_release() {
        for (Modifier.Node tail$ui_release = getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
            if (tail$ui_release.isAttached()) {
                tail$ui_release.runDetachLifecycle$ui_release();
            }
        }
    }

    public final void syncCoordinators() {
        NodeCoordinator nodeCoordinator;
        NodeCoordinator layoutModifierNodeCoordinator;
        NodeCoordinator nodeCoordinator2 = this.innerCoordinator;
        for (Modifier.Node parent$ui_release = this.tail.getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            LayoutModifierNode asLayoutModifierNode = DelegatableNodeKt.asLayoutModifierNode(parent$ui_release);
            if (asLayoutModifierNode != null) {
                if (parent$ui_release.getCoordinator$ui_release() != null) {
                    NodeCoordinator coordinator$ui_release = parent$ui_release.getCoordinator$ui_release();
                    AbstractC3292y.g(coordinator$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                    layoutModifierNodeCoordinator = (LayoutModifierNodeCoordinator) coordinator$ui_release;
                    LayoutModifierNode layoutModifierNode = layoutModifierNodeCoordinator.getLayoutModifierNode();
                    layoutModifierNodeCoordinator.setLayoutModifierNode$ui_release(asLayoutModifierNode);
                    if (layoutModifierNode != parent$ui_release) {
                        layoutModifierNodeCoordinator.onLayoutModifierNodeChanged();
                    }
                } else {
                    layoutModifierNodeCoordinator = new LayoutModifierNodeCoordinator(this.layoutNode, asLayoutModifierNode);
                    parent$ui_release.updateCoordinator$ui_release(layoutModifierNodeCoordinator);
                }
                nodeCoordinator2.setWrappedBy$ui_release(layoutModifierNodeCoordinator);
                layoutModifierNodeCoordinator.setWrapped$ui_release(nodeCoordinator2);
                nodeCoordinator2 = layoutModifierNodeCoordinator;
            } else {
                parent$ui_release.updateCoordinator$ui_release(nodeCoordinator2);
            }
        }
        LayoutNode parent$ui_release2 = this.layoutNode.getParent$ui_release();
        if (parent$ui_release2 != null) {
            nodeCoordinator = parent$ui_release2.getInnerCoordinator$ui_release();
        } else {
            nodeCoordinator = null;
        }
        nodeCoordinator2.setWrappedBy$ui_release(nodeCoordinator);
        this.outerCoordinator = nodeCoordinator2;
    }

    /* renamed from: tail-H91voCI$ui_release */
    public final /* synthetic */ <T> T m4280tailH91voCI$ui_release(int i8) {
        if ((getAggregateChildKindSet() & i8) != 0) {
            for (Object obj = (T) getTail$ui_release(); obj != null; obj = (T) ((Modifier.Node) obj).getParent$ui_release()) {
                if ((((Modifier.Node) obj).getKindSet$ui_release() & i8) != 0) {
                    AbstractC3292y.n(3, ExifInterface.GPS_DIRECTION_TRUE);
                    return (T) obj;
                }
            }
            return null;
        }
        return null;
    }

    public final void tailToHead$ui_release(int i8, Function1 function1) {
        if ((getAggregateChildKindSet() & i8) == 0) {
            return;
        }
        for (Modifier.Node tail$ui_release = getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
            if ((tail$ui_release.getKindSet$ui_release() & i8) != 0) {
                function1.invoke(tail$ui_release);
            }
        }
    }

    /* renamed from: tailToHead-aLcG6gQ$ui_release */
    public final /* synthetic */ <T> void m4281tailToHeadaLcG6gQ$ui_release(int i8, Function1 function1) {
        if ((getAggregateChildKindSet() & i8) != 0) {
            for (Modifier.Node tail$ui_release = getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
                if ((tail$ui_release.getKindSet$ui_release() & i8) != 0) {
                    for (Modifier.Node node = tail$ui_release; node != null; node = DelegatableNodeKt.pop(null)) {
                        AbstractC3292y.n(3, ExifInterface.GPS_DIRECTION_TRUE);
                        function1.invoke(node);
                    }
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (this.head == this.tail) {
            sb.append("]");
        } else {
            Modifier.Node head$ui_release = getHead$ui_release();
            while (true) {
                if (head$ui_release == null || head$ui_release == getTail$ui_release()) {
                    break;
                }
                sb.append(String.valueOf(head$ui_release));
                if (head$ui_release.getChild$ui_release() == this.tail) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                head$ui_release = head$ui_release.getChild$ui_release();
            }
        }
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0087, code lost:            r5 = r3;     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0093, code lost:            if (r2 >= r1) goto L176;     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0095, code lost:            if (r8 == null) goto L142;     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0097, code lost:            if (r5 == null) goto L140;     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0099, code lost:            structuralUpdate(r2, r8, r9, r5, r18.layoutNode.isAttached());     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b7, code lost:            throw new java.lang.IllegalStateException("structuralUpdate requires a non-null tail".toString());     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c1, code lost:            throw new java.lang.IllegalStateException("expected prior modifier list to be non-empty".toString());     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void updateFrom$ui_release(androidx.compose.ui.Modifier r19) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.NodeChain.updateFrom$ui_release(androidx.compose.ui.Modifier):void");
    }

    public final void useLogger$ui_release(Logger logger) {
        this.logger = logger;
    }

    public final void tailToHead$ui_release(Function1 function1) {
        for (Modifier.Node tail$ui_release = getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
            function1.invoke(tail$ui_release);
        }
    }

    public final void headToTail$ui_release(Function1 function1) {
        for (Modifier.Node head$ui_release = getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
            function1.invoke(head$ui_release);
        }
    }
}
