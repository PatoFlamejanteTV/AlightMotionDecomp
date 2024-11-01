package androidx.compose.ui.focus;

import Q5.I;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.modifier.ModifierLocal;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3290w;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.T;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class FocusTargetNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, FocusTargetModifierNode, ObserverModifierNode, ModifierLocalModifierNode {
    public static final int $stable = 8;
    private FocusStateImpl committedFocusState = FocusStateImpl.Inactive;
    private boolean isProcessingCustomEnter;
    private boolean isProcessingCustomExit;
    private int previouslyFocusedChildHash;

    @StabilityInferred(parameters = 1)
    /* loaded from: classes.dex */
    public static final class FocusTargetElement extends ModifierNodeElement<FocusTargetNode> {
        public static final int $stable = 0;
        public static final FocusTargetElement INSTANCE = new FocusTargetElement();

        private FocusTargetElement() {
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public boolean equals(Object obj) {
            return obj == this;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public int hashCode() {
            return 1739042953;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void inspectableProperties(InspectorInfo inspectorInfo) {
            inspectorInfo.setName("focusTarget");
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void update(FocusTargetNode focusTargetNode) {
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public FocusTargetNode create() {
            return new FocusTargetNode();
        }
    }

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
                iArr[FocusStateImpl.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ void getFocusState$annotations() {
    }

    public final void commitFocusState$ui_release() {
        FocusStateImpl uncommittedFocusState = FocusTargetNodeKt.requireTransactionManager(this).getUncommittedFocusState(this);
        if (uncommittedFocusState != null) {
            this.committedFocusState = uncommittedFocusState;
            return;
        }
        throw new IllegalStateException("committing a node that was not updated in the current transaction".toString());
    }

    /* renamed from: fetchCustomEnter-aToIllA$ui_release, reason: not valid java name */
    public final void m2656fetchCustomEnteraToIllA$ui_release(int i8, Function1 function1) {
        if (!this.isProcessingCustomEnter) {
            this.isProcessingCustomEnter = true;
            try {
                FocusRequester focusRequester = (FocusRequester) fetchFocusProperties$ui_release().getEnter().invoke(FocusDirection.m2626boximpl(i8));
                if (focusRequester != FocusRequester.Companion.getDefault()) {
                    function1.invoke(focusRequester);
                }
            } finally {
                AbstractC3290w.b(1);
                this.isProcessingCustomEnter = false;
                AbstractC3290w.a(1);
            }
        }
    }

    /* renamed from: fetchCustomExit-aToIllA$ui_release, reason: not valid java name */
    public final void m2657fetchCustomExitaToIllA$ui_release(int i8, Function1 function1) {
        if (!this.isProcessingCustomExit) {
            this.isProcessingCustomExit = true;
            try {
                FocusRequester focusRequester = (FocusRequester) fetchFocusProperties$ui_release().getExit().invoke(FocusDirection.m2626boximpl(i8));
                if (focusRequester != FocusRequester.Companion.getDefault()) {
                    function1.invoke(focusRequester);
                }
            } finally {
                AbstractC3290w.b(1);
                this.isProcessingCustomExit = false;
                AbstractC3290w.a(1);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [androidx.compose.ui.Modifier$Node] */
    public final FocusProperties fetchFocusProperties$ui_release() {
        NodeChain nodes$ui_release;
        FocusPropertiesImpl focusPropertiesImpl = new FocusPropertiesImpl();
        int m4320constructorimpl = NodeKind.m4320constructorimpl(2048);
        int m4320constructorimpl2 = NodeKind.m4320constructorimpl(1024);
        Modifier.Node node = getNode();
        int i8 = m4320constructorimpl | m4320constructorimpl2;
        if (getNode().isAttached()) {
            Modifier.Node node2 = getNode();
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(this);
            loop0: while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i8) != 0) {
                    while (node2 != null) {
                        if ((node2.getKindSet$ui_release() & i8) != 0) {
                            if (node2 != node && (node2.getKindSet$ui_release() & m4320constructorimpl2) != 0) {
                                break loop0;
                            }
                            if ((node2.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                                DelegatingNode delegatingNode = node2;
                                MutableVector mutableVector = null;
                                while (delegatingNode != 0) {
                                    if (delegatingNode instanceof FocusPropertiesModifierNode) {
                                        ((FocusPropertiesModifierNode) delegatingNode).applyFocusProperties(focusPropertiesImpl);
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
            return focusPropertiesImpl;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    public final BeyondBoundsLayout getBeyondBoundsLayoutParent() {
        return (BeyondBoundsLayout) getCurrent(androidx.compose.ui.layout.BeyondBoundsLayoutKt.getModifierLocalBeyondBoundsLayout());
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode, androidx.compose.ui.modifier.ModifierLocalReadScope
    public /* synthetic */ Object getCurrent(ModifierLocal modifierLocal) {
        return androidx.compose.ui.modifier.b.a(this, modifierLocal);
    }

    public final int getPreviouslyFocusedChildHash() {
        return this.previouslyFocusedChildHash;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public /* synthetic */ ModifierLocalMap getProvidedValues() {
        return androidx.compose.ui.modifier.b.b(this);
    }

    public final void invalidateFocus$ui_release() {
        FocusProperties focusProperties;
        int i8 = WhenMappings.$EnumSwitchMapping$0[getFocusState().ordinal()];
        if (i8 == 1 || i8 == 2) {
            T t8 = new T();
            ObserverModifierNodeKt.observeReads(this, new FocusTargetNode$invalidateFocus$1(t8, this));
            Object obj = t8.f34573a;
            if (obj == null) {
                AbstractC3292y.y("focusProperties");
                focusProperties = null;
            } else {
                focusProperties = (FocusProperties) obj;
            }
            if (!focusProperties.getCanFocus()) {
                DelegatableNodeKt.requireOwner(this).getFocusOwner().clearFocus(true);
            }
        }
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        FocusStateImpl focusState = getFocusState();
        invalidateFocus$ui_release();
        if (focusState != getFocusState()) {
            FocusEventModifierNodeKt.refreshFocusEventNodes(this);
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onReset() {
        int i8 = WhenMappings.$EnumSwitchMapping$0[getFocusState().ordinal()];
        if (i8 != 1 && i8 != 2) {
            if (i8 != 3) {
                if (i8 == 4) {
                    scheduleInvalidationForFocusEvents$ui_release();
                    return;
                }
                return;
            }
            scheduleInvalidationForFocusEvents$ui_release();
            FocusTransactionManager requireTransactionManager = FocusTargetNodeKt.requireTransactionManager(this);
            try {
                if (requireTransactionManager.ongoingTransaction) {
                    requireTransactionManager.cancelTransaction();
                }
                requireTransactionManager.beginTransaction();
                setFocusState(FocusStateImpl.Inactive);
                I i9 = I.f8786a;
                requireTransactionManager.commitTransaction();
                return;
            } catch (Throwable th) {
                requireTransactionManager.commitTransaction();
                throw th;
            }
        }
        DelegatableNodeKt.requireOwner(this).getFocusOwner().clearFocus(true);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public /* synthetic */ void provide(ModifierLocal modifierLocal, Object obj) {
        androidx.compose.ui.modifier.b.c(this, modifierLocal, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    public final void scheduleInvalidationForFocusEvents$ui_release() {
        NodeChain nodes$ui_release;
        DelegatingNode node = getNode();
        int m4320constructorimpl = NodeKind.m4320constructorimpl(4096);
        MutableVector mutableVector = null;
        while (node != 0) {
            if (node instanceof FocusEventModifierNode) {
                FocusEventModifierNodeKt.invalidateFocusEvent((FocusEventModifierNode) node);
            } else if ((node.getKindSet$ui_release() & m4320constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                Modifier.Node delegate$ui_release = node.getDelegate$ui_release();
                int i8 = 0;
                node = node;
                while (delegate$ui_release != null) {
                    if ((delegate$ui_release.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                        i8++;
                        if (i8 == 1) {
                            node = delegate$ui_release;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (node != 0) {
                                mutableVector.add(node);
                                node = 0;
                            }
                            mutableVector.add(delegate$ui_release);
                        }
                    }
                    delegate$ui_release = delegate$ui_release.getChild$ui_release();
                    node = node;
                }
                if (i8 == 1) {
                }
            }
            node = DelegatableNodeKt.pop(mutableVector);
        }
        int m4320constructorimpl2 = NodeKind.m4320constructorimpl(4096) | NodeKind.m4320constructorimpl(1024);
        if (getNode().isAttached()) {
            Modifier.Node parent$ui_release = getNode().getParent$ui_release();
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(this);
            while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m4320constructorimpl2) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & m4320constructorimpl2) != 0 && (NodeKind.m4320constructorimpl(1024) & parent$ui_release.getKindSet$ui_release()) == 0 && parent$ui_release.isAttached()) {
                            int m4320constructorimpl3 = NodeKind.m4320constructorimpl(4096);
                            MutableVector mutableVector2 = null;
                            DelegatingNode delegatingNode = parent$ui_release;
                            while (delegatingNode != 0) {
                                if (delegatingNode instanceof FocusEventModifierNode) {
                                    FocusEventModifierNodeKt.invalidateFocusEvent((FocusEventModifierNode) delegatingNode);
                                } else if ((delegatingNode.getKindSet$ui_release() & m4320constructorimpl3) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                    Modifier.Node delegate$ui_release2 = delegatingNode.getDelegate$ui_release();
                                    int i9 = 0;
                                    delegatingNode = delegatingNode;
                                    while (delegate$ui_release2 != null) {
                                        if ((delegate$ui_release2.getKindSet$ui_release() & m4320constructorimpl3) != 0) {
                                            i9++;
                                            if (i9 == 1) {
                                                delegatingNode = delegate$ui_release2;
                                            } else {
                                                if (mutableVector2 == null) {
                                                    mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (delegatingNode != 0) {
                                                    mutableVector2.add(delegatingNode);
                                                    delegatingNode = 0;
                                                }
                                                mutableVector2.add(delegate$ui_release2);
                                            }
                                        }
                                        delegate$ui_release2 = delegate$ui_release2.getChild$ui_release();
                                        delegatingNode = delegatingNode;
                                    }
                                    if (i9 == 1) {
                                    }
                                }
                                delegatingNode = DelegatableNodeKt.pop(mutableVector2);
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

    public void setFocusState(FocusStateImpl focusStateImpl) {
        FocusTargetNodeKt.requireTransactionManager(this).setUncommittedFocusState(this, focusStateImpl);
    }

    public final void setPreviouslyFocusedChildHash(int i8) {
        this.previouslyFocusedChildHash = i8;
    }

    @Override // androidx.compose.ui.focus.FocusTargetModifierNode
    public FocusStateImpl getFocusState() {
        FocusStateImpl uncommittedFocusState;
        FocusTransactionManager access$getFocusTransactionManager = FocusTargetNodeKt.access$getFocusTransactionManager(this);
        return (access$getFocusTransactionManager == null || (uncommittedFocusState = access$getFocusTransactionManager.getUncommittedFocusState(this)) == null) ? this.committedFocusState : uncommittedFocusState;
    }
}
