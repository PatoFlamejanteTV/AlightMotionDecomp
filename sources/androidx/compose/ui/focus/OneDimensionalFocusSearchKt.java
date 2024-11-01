package androidx.compose.ui.focus;

import Q5.p;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import i6.i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class OneDimensionalFocusSearchKt {
    private static final String InvalidFocusDirection = "This function should only be used for 1-D focus search";
    private static final String NoActiveChild = "ActiveParent must have a focusedChild";

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 2;
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

    private static final boolean backwardFocusSearch(FocusTargetNode focusTargetNode, Function1 function1) {
        boolean z8;
        FocusStateImpl focusState = focusTargetNode.getFocusState();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i8 = iArr[focusState.ordinal()];
        if (i8 != 1) {
            if (i8 != 2 && i8 != 3) {
                if (i8 == 4) {
                    if (!pickChildForBackwardSearch(focusTargetNode, function1)) {
                        if (focusTargetNode.fetchFocusProperties$ui_release().getCanFocus()) {
                            z8 = ((Boolean) function1.invoke(focusTargetNode)).booleanValue();
                        } else {
                            z8 = false;
                        }
                        if (!z8) {
                            return false;
                        }
                    }
                } else {
                    throw new p();
                }
            } else {
                return pickChildForBackwardSearch(focusTargetNode, function1);
            }
        } else {
            FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(focusTargetNode);
            if (activeChild != null) {
                int i9 = iArr[activeChild.getFocusState().ordinal()];
                if (i9 != 1) {
                    if (i9 != 2 && i9 != 3) {
                        if (i9 != 4) {
                            throw new p();
                        }
                        throw new IllegalStateException(NoActiveChild.toString());
                    }
                    return m2667generateAndSearchChildren4C6V_qg(focusTargetNode, activeChild, FocusDirection.Companion.m2640getPreviousdhqQ8s(), function1);
                }
                if (!backwardFocusSearch(activeChild, function1) && !m2667generateAndSearchChildren4C6V_qg(focusTargetNode, activeChild, FocusDirection.Companion.m2640getPreviousdhqQ8s(), function1) && (!activeChild.fetchFocusProperties$ui_release().getCanFocus() || !((Boolean) function1.invoke(activeChild)).booleanValue())) {
                    return false;
                }
            } else {
                throw new IllegalStateException(NoActiveChild.toString());
            }
        }
        return true;
    }

    private static final <T> void forEachItemAfter(MutableVector<T> mutableVector, T t8, Function1 function1) {
        boolean z8 = false;
        i iVar = new i(0, mutableVector.getSize() - 1);
        int e8 = iVar.e();
        int g8 = iVar.g();
        if (e8 > g8) {
            return;
        }
        while (true) {
            if (z8) {
                function1.invoke(mutableVector.getContent()[e8]);
            }
            if (AbstractC3292y.d(mutableVector.getContent()[e8], t8)) {
                z8 = true;
            }
            if (e8 != g8) {
                e8++;
            } else {
                return;
            }
        }
    }

    private static final <T> void forEachItemBefore(MutableVector<T> mutableVector, T t8, Function1 function1) {
        boolean z8 = false;
        i iVar = new i(0, mutableVector.getSize() - 1);
        int e8 = iVar.e();
        int g8 = iVar.g();
        if (e8 > g8) {
            return;
        }
        while (true) {
            if (z8) {
                function1.invoke(mutableVector.getContent()[g8]);
            }
            if (AbstractC3292y.d(mutableVector.getContent()[g8], t8)) {
                z8 = true;
            }
            if (g8 != e8) {
                g8--;
            } else {
                return;
            }
        }
    }

    private static final boolean forwardFocusSearch(FocusTargetNode focusTargetNode, Function1 function1) {
        int i8 = WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
        if (i8 != 1) {
            if (i8 != 2 && i8 != 3) {
                if (i8 == 4) {
                    if (focusTargetNode.fetchFocusProperties$ui_release().getCanFocus()) {
                        return ((Boolean) function1.invoke(focusTargetNode)).booleanValue();
                    }
                    return pickChildForForwardSearch(focusTargetNode, function1);
                }
                throw new p();
            }
            return pickChildForForwardSearch(focusTargetNode, function1);
        }
        FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(focusTargetNode);
        if (activeChild != null) {
            if (forwardFocusSearch(activeChild, function1) || m2667generateAndSearchChildren4C6V_qg(focusTargetNode, activeChild, FocusDirection.Companion.m2639getNextdhqQ8s(), function1)) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException(NoActiveChild.toString());
    }

    /* renamed from: generateAndSearchChildren-4C6V_qg, reason: not valid java name */
    private static final boolean m2667generateAndSearchChildren4C6V_qg(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i8, Function1 function1) {
        if (m2669searchChildren4C6V_qg(focusTargetNode, focusTargetNode2, i8, function1)) {
            return true;
        }
        Boolean bool = (Boolean) BeyondBoundsLayoutKt.m2625searchBeyondBoundsOMvw8(focusTargetNode, i8, new OneDimensionalFocusSearchKt$generateAndSearchChildren$1(focusTargetNode, focusTargetNode2, i8, function1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static /* synthetic */ void getInvalidFocusDirection$annotations() {
    }

    private static /* synthetic */ void getNoActiveChild$annotations() {
    }

    private static final boolean isRoot(FocusTargetNode focusTargetNode) {
        Modifier.Node node;
        NodeChain nodes$ui_release;
        int m4320constructorimpl = NodeKind.m4320constructorimpl(1024);
        if (focusTargetNode.getNode().isAttached()) {
            Modifier.Node parent$ui_release = focusTargetNode.getNode().getParent$ui_release();
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
            loop0: while (true) {
                node = null;
                if (requireLayoutNode == null) {
                    break;
                }
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m4320constructorimpl) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                            Modifier.Node node2 = parent$ui_release;
                            MutableVector mutableVector = null;
                            while (node2 != null) {
                                if (node2 instanceof FocusTargetNode) {
                                    node = node2;
                                    break loop0;
                                }
                                if ((node2.getKindSet$ui_release() & m4320constructorimpl) != 0 && (node2 instanceof DelegatingNode)) {
                                    int i8 = 0;
                                    for (Modifier.Node delegate$ui_release = ((DelegatingNode) node2).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                        if ((delegate$ui_release.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                                            i8++;
                                            if (i8 == 1) {
                                                node2 = delegate$ui_release;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (node2 != null) {
                                                    mutableVector.add(node2);
                                                    node2 = null;
                                                }
                                                mutableVector.add(delegate$ui_release);
                                            }
                                        }
                                    }
                                    if (i8 == 1) {
                                    }
                                }
                                node2 = DelegatableNodeKt.pop(mutableVector);
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
            if (node != null) {
                return false;
            }
            return true;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    /* renamed from: oneDimensionalFocusSearch--OM-vw8, reason: not valid java name */
    public static final boolean m2668oneDimensionalFocusSearchOMvw8(FocusTargetNode focusTargetNode, int i8, Function1 function1) {
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m2629equalsimpl0(i8, companion.m2639getNextdhqQ8s())) {
            return forwardFocusSearch(focusTargetNode, function1);
        }
        if (FocusDirection.m2629equalsimpl0(i8, companion.m2640getPreviousdhqQ8s())) {
            return backwardFocusSearch(focusTargetNode, function1);
        }
        throw new IllegalStateException(InvalidFocusDirection.toString());
    }

    private static final boolean pickChildForBackwardSearch(FocusTargetNode focusTargetNode, Function1 function1) {
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16], 0);
        int m4320constructorimpl = NodeKind.m4320constructorimpl(1024);
        if (focusTargetNode.getNode().isAttached()) {
            MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child$ui_release = focusTargetNode.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusTargetNode.getNode());
            } else {
                mutableVector2.add(child$ui_release);
            }
            while (mutableVector2.isNotEmpty()) {
                Modifier.Node node = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
                if ((node.getAggregateChildKindSet$ui_release() & m4320constructorimpl) == 0) {
                    DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, node);
                } else {
                    while (true) {
                        if (node == null) {
                            break;
                        }
                        if ((node.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                            MutableVector mutableVector3 = null;
                            while (node != null) {
                                if (node instanceof FocusTargetNode) {
                                    mutableVector.add((FocusTargetNode) node);
                                } else if ((node.getKindSet$ui_release() & m4320constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                    int i8 = 0;
                                    for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                        if ((delegate$ui_release.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                                            i8++;
                                            if (i8 == 1) {
                                                node = delegate$ui_release;
                                            } else {
                                                if (mutableVector3 == null) {
                                                    mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (node != null) {
                                                    mutableVector3.add(node);
                                                    node = null;
                                                }
                                                mutableVector3.add(delegate$ui_release);
                                            }
                                        }
                                    }
                                    if (i8 == 1) {
                                    }
                                }
                                node = DelegatableNodeKt.pop(mutableVector3);
                            }
                        } else {
                            node = node.getChild$ui_release();
                        }
                    }
                }
            }
            mutableVector.sortWith(FocusableChildrenComparator.INSTANCE);
            int size = mutableVector.getSize();
            if (size > 0) {
                int i9 = size - 1;
                Object[] content = mutableVector.getContent();
                do {
                    FocusTargetNode focusTargetNode2 = (FocusTargetNode) content[i9];
                    if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode2) && backwardFocusSearch(focusTargetNode2, function1)) {
                        return true;
                    }
                    i9--;
                } while (i9 >= 0);
            }
            return false;
        }
        throw new IllegalStateException("visitChildren called on an unattached node".toString());
    }

    private static final boolean pickChildForForwardSearch(FocusTargetNode focusTargetNode, Function1 function1) {
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16], 0);
        int m4320constructorimpl = NodeKind.m4320constructorimpl(1024);
        if (focusTargetNode.getNode().isAttached()) {
            MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child$ui_release = focusTargetNode.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusTargetNode.getNode());
            } else {
                mutableVector2.add(child$ui_release);
            }
            while (mutableVector2.isNotEmpty()) {
                Modifier.Node node = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
                if ((node.getAggregateChildKindSet$ui_release() & m4320constructorimpl) == 0) {
                    DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, node);
                } else {
                    while (true) {
                        if (node == null) {
                            break;
                        }
                        if ((node.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                            MutableVector mutableVector3 = null;
                            while (node != null) {
                                if (node instanceof FocusTargetNode) {
                                    mutableVector.add((FocusTargetNode) node);
                                } else if ((node.getKindSet$ui_release() & m4320constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                    int i8 = 0;
                                    for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                        if ((delegate$ui_release.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                                            i8++;
                                            if (i8 == 1) {
                                                node = delegate$ui_release;
                                            } else {
                                                if (mutableVector3 == null) {
                                                    mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (node != null) {
                                                    mutableVector3.add(node);
                                                    node = null;
                                                }
                                                mutableVector3.add(delegate$ui_release);
                                            }
                                        }
                                    }
                                    if (i8 == 1) {
                                    }
                                }
                                node = DelegatableNodeKt.pop(mutableVector3);
                            }
                        } else {
                            node = node.getChild$ui_release();
                        }
                    }
                }
            }
            mutableVector.sortWith(FocusableChildrenComparator.INSTANCE);
            int size = mutableVector.getSize();
            if (size <= 0) {
                return false;
            }
            Object[] content = mutableVector.getContent();
            int i9 = 0;
            do {
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) content[i9];
                if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode2) && forwardFocusSearch(focusTargetNode2, function1)) {
                    return true;
                }
                i9++;
            } while (i9 < size);
            return false;
        }
        throw new IllegalStateException("visitChildren called on an unattached node".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: searchChildren-4C6V_qg, reason: not valid java name */
    public static final boolean m2669searchChildren4C6V_qg(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i8, Function1 function1) {
        if (focusTargetNode.getFocusState() == FocusStateImpl.ActiveParent) {
            MutableVector mutableVector = new MutableVector(new FocusTargetNode[16], 0);
            int m4320constructorimpl = NodeKind.m4320constructorimpl(1024);
            if (focusTargetNode.getNode().isAttached()) {
                MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                Modifier.Node child$ui_release = focusTargetNode.getNode().getChild$ui_release();
                if (child$ui_release == null) {
                    DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusTargetNode.getNode());
                } else {
                    mutableVector2.add(child$ui_release);
                }
                while (mutableVector2.isNotEmpty()) {
                    Modifier.Node node = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
                    if ((node.getAggregateChildKindSet$ui_release() & m4320constructorimpl) == 0) {
                        DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, node);
                    } else {
                        while (true) {
                            if (node == null) {
                                break;
                            }
                            if ((node.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                                MutableVector mutableVector3 = null;
                                while (node != null) {
                                    if (node instanceof FocusTargetNode) {
                                        mutableVector.add((FocusTargetNode) node);
                                    } else if ((node.getKindSet$ui_release() & m4320constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                        int i9 = 0;
                                        for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                            if ((delegate$ui_release.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                                                i9++;
                                                if (i9 == 1) {
                                                    node = delegate$ui_release;
                                                } else {
                                                    if (mutableVector3 == null) {
                                                        mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                                    }
                                                    if (node != null) {
                                                        mutableVector3.add(node);
                                                        node = null;
                                                    }
                                                    mutableVector3.add(delegate$ui_release);
                                                }
                                            }
                                        }
                                        if (i9 == 1) {
                                        }
                                    }
                                    node = DelegatableNodeKt.pop(mutableVector3);
                                }
                            } else {
                                node = node.getChild$ui_release();
                            }
                        }
                    }
                }
                mutableVector.sortWith(FocusableChildrenComparator.INSTANCE);
                FocusDirection.Companion companion = FocusDirection.Companion;
                if (FocusDirection.m2629equalsimpl0(i8, companion.m2639getNextdhqQ8s())) {
                    i iVar = new i(0, mutableVector.getSize() - 1);
                    int e8 = iVar.e();
                    int g8 = iVar.g();
                    if (e8 <= g8) {
                        boolean z8 = false;
                        while (true) {
                            if (z8) {
                                FocusTargetNode focusTargetNode3 = (FocusTargetNode) mutableVector.getContent()[e8];
                                if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode3) && forwardFocusSearch(focusTargetNode3, function1)) {
                                    return true;
                                }
                            }
                            if (AbstractC3292y.d(mutableVector.getContent()[e8], focusTargetNode2)) {
                                z8 = true;
                            }
                            if (e8 == g8) {
                                break;
                            }
                            e8++;
                        }
                    }
                } else if (FocusDirection.m2629equalsimpl0(i8, companion.m2640getPreviousdhqQ8s())) {
                    i iVar2 = new i(0, mutableVector.getSize() - 1);
                    int e9 = iVar2.e();
                    int g9 = iVar2.g();
                    if (e9 <= g9) {
                        boolean z9 = false;
                        while (true) {
                            if (z9) {
                                FocusTargetNode focusTargetNode4 = (FocusTargetNode) mutableVector.getContent()[g9];
                                if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode4) && backwardFocusSearch(focusTargetNode4, function1)) {
                                    return true;
                                }
                            }
                            if (AbstractC3292y.d(mutableVector.getContent()[g9], focusTargetNode2)) {
                                z9 = true;
                            }
                            if (g9 == e9) {
                                break;
                            }
                            g9--;
                        }
                    }
                } else {
                    throw new IllegalStateException(InvalidFocusDirection.toString());
                }
                if (FocusDirection.m2629equalsimpl0(i8, FocusDirection.Companion.m2639getNextdhqQ8s()) || !focusTargetNode.fetchFocusProperties$ui_release().getCanFocus() || isRoot(focusTargetNode)) {
                    return false;
                }
                return ((Boolean) function1.invoke(focusTargetNode)).booleanValue();
            }
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
        }
        throw new IllegalStateException("This function should only be used within a parent that has focus.".toString());
    }
}
