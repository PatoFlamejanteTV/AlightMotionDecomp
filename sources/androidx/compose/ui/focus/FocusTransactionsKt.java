package androidx.compose.ui.focus;

import Q5.p;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.node.Owner;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class FocusTransactionsKt {

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CustomDestinationResult.values().length];
            try {
                iArr[CustomDestinationResult.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CustomDestinationResult.Redirected.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CustomDestinationResult.Cancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CustomDestinationResult.RedirectCancelled.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FocusStateImpl.values().length];
            try {
                iArr2[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FocusStateImpl.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[FocusStateImpl.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final boolean captureFocus(FocusTargetNode focusTargetNode) {
        FocusTransactionManager requireTransactionManager = FocusTargetNodeKt.requireTransactionManager(focusTargetNode);
        try {
            if (requireTransactionManager.ongoingTransaction) {
                requireTransactionManager.cancelTransaction();
            }
            requireTransactionManager.beginTransaction();
            int i8 = WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
            boolean z8 = true;
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 3 && i8 != 4) {
                        throw new p();
                    }
                    z8 = false;
                }
            } else {
                focusTargetNode.setFocusState(FocusStateImpl.Captured);
                FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
            }
            return z8;
        } finally {
            requireTransactionManager.commitTransaction();
        }
    }

    private static final boolean clearChildFocus(FocusTargetNode focusTargetNode, boolean z8, boolean z9) {
        FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(focusTargetNode);
        if (activeChild != null) {
            return clearFocus(activeChild, z8, z9);
        }
        return true;
    }

    static /* synthetic */ boolean clearChildFocus$default(FocusTargetNode focusTargetNode, boolean z8, boolean z9, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        if ((i8 & 2) != 0) {
            z9 = true;
        }
        return clearChildFocus(focusTargetNode, z8, z9);
    }

    public static final boolean clearFocus(FocusTargetNode focusTargetNode, boolean z8, boolean z9) {
        int i8 = WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    if (i8 != 4) {
                        throw new p();
                    }
                } else if (clearChildFocus(focusTargetNode, z8, z9)) {
                    focusTargetNode.setFocusState(FocusStateImpl.Inactive);
                    if (z9) {
                        FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
                    }
                } else {
                    return false;
                }
            } else {
                if (z8) {
                    focusTargetNode.setFocusState(FocusStateImpl.Inactive);
                    if (z9) {
                        FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
                        return z8;
                    }
                    return z8;
                }
                return z8;
            }
        } else {
            focusTargetNode.setFocusState(FocusStateImpl.Inactive);
            if (z9) {
                FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
            }
        }
        return true;
    }

    public static /* synthetic */ boolean clearFocus$default(FocusTargetNode focusTargetNode, boolean z8, boolean z9, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        return clearFocus(focusTargetNode, z8, z9);
    }

    public static final boolean freeFocus(FocusTargetNode focusTargetNode) {
        FocusTransactionManager requireTransactionManager = FocusTargetNodeKt.requireTransactionManager(focusTargetNode);
        try {
            if (requireTransactionManager.ongoingTransaction) {
                requireTransactionManager.cancelTransaction();
            }
            requireTransactionManager.beginTransaction();
            int i8 = WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
            boolean z8 = true;
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 3 && i8 != 4) {
                        throw new p();
                    }
                    z8 = false;
                } else {
                    focusTargetNode.setFocusState(FocusStateImpl.Active);
                    FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
                }
            }
            return z8;
        } finally {
            requireTransactionManager.commitTransaction();
        }
    }

    private static final boolean grantFocus(FocusTargetNode focusTargetNode) {
        ObserverModifierNodeKt.observeReads(focusTargetNode, new FocusTransactionsKt$grantFocus$1(focusTargetNode));
        int i8 = WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
        if (i8 == 3 || i8 == 4) {
            focusTargetNode.setFocusState(FocusStateImpl.Active);
            return true;
        }
        return true;
    }

    /* renamed from: performCustomClearFocus-Mxy_nc0, reason: not valid java name */
    public static final CustomDestinationResult m2659performCustomClearFocusMxy_nc0(FocusTargetNode focusTargetNode, int i8) {
        int i9 = WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 != 4) {
                        throw new p();
                    }
                } else {
                    CustomDestinationResult m2659performCustomClearFocusMxy_nc0 = m2659performCustomClearFocusMxy_nc0(requireActiveChild(focusTargetNode), i8);
                    if (m2659performCustomClearFocusMxy_nc0 == CustomDestinationResult.None) {
                        m2659performCustomClearFocusMxy_nc0 = null;
                    }
                    if (m2659performCustomClearFocusMxy_nc0 == null) {
                        return m2661performCustomExitMxy_nc0(focusTargetNode, i8);
                    }
                    return m2659performCustomClearFocusMxy_nc0;
                }
            } else {
                return CustomDestinationResult.Cancelled;
            }
        }
        return CustomDestinationResult.None;
    }

    /* renamed from: performCustomEnter-Mxy_nc0, reason: not valid java name */
    private static final CustomDestinationResult m2660performCustomEnterMxy_nc0(FocusTargetNode focusTargetNode, int i8) {
        CustomDestinationResult customDestinationResult;
        if (!focusTargetNode.isProcessingCustomEnter) {
            focusTargetNode.isProcessingCustomEnter = true;
            try {
                FocusRequester focusRequester = (FocusRequester) focusTargetNode.fetchFocusProperties$ui_release().getEnter().invoke(FocusDirection.m2626boximpl(i8));
                FocusRequester.Companion companion = FocusRequester.Companion;
                if (focusRequester != companion.getDefault()) {
                    if (focusRequester == companion.getCancel()) {
                        return CustomDestinationResult.Cancelled;
                    }
                    if (focusRequester.focus$ui_release()) {
                        customDestinationResult = CustomDestinationResult.Redirected;
                    } else {
                        customDestinationResult = CustomDestinationResult.RedirectCancelled;
                    }
                    return customDestinationResult;
                }
            } finally {
                focusTargetNode.isProcessingCustomEnter = false;
            }
        }
        return CustomDestinationResult.None;
    }

    /* renamed from: performCustomExit-Mxy_nc0, reason: not valid java name */
    private static final CustomDestinationResult m2661performCustomExitMxy_nc0(FocusTargetNode focusTargetNode, int i8) {
        CustomDestinationResult customDestinationResult;
        if (!focusTargetNode.isProcessingCustomExit) {
            focusTargetNode.isProcessingCustomExit = true;
            try {
                FocusRequester focusRequester = (FocusRequester) focusTargetNode.fetchFocusProperties$ui_release().getExit().invoke(FocusDirection.m2626boximpl(i8));
                FocusRequester.Companion companion = FocusRequester.Companion;
                if (focusRequester != companion.getDefault()) {
                    if (focusRequester == companion.getCancel()) {
                        return CustomDestinationResult.Cancelled;
                    }
                    if (focusRequester.focus$ui_release()) {
                        customDestinationResult = CustomDestinationResult.Redirected;
                    } else {
                        customDestinationResult = CustomDestinationResult.RedirectCancelled;
                    }
                    return customDestinationResult;
                }
            } finally {
                focusTargetNode.isProcessingCustomExit = false;
            }
        }
        return CustomDestinationResult.None;
    }

    /* renamed from: performCustomRequestFocus-Mxy_nc0, reason: not valid java name */
    public static final CustomDestinationResult m2662performCustomRequestFocusMxy_nc0(FocusTargetNode focusTargetNode, int i8) {
        CustomDestinationResult customDestinationResult;
        Modifier.Node node;
        NodeChain nodes$ui_release;
        int i9 = WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
        if (i9 != 1 && i9 != 2) {
            if (i9 != 3) {
                if (i9 == 4) {
                    int m4320constructorimpl = NodeKind.m4320constructorimpl(1024);
                    if (focusTargetNode.getNode().isAttached()) {
                        Modifier.Node parent$ui_release = focusTargetNode.getNode().getParent$ui_release();
                        LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
                        loop0: while (true) {
                            customDestinationResult = null;
                            if (requireLayoutNode != null) {
                                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m4320constructorimpl) != 0) {
                                    while (parent$ui_release != null) {
                                        if ((parent$ui_release.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                                            node = parent$ui_release;
                                            MutableVector mutableVector = null;
                                            while (node != null) {
                                                if (node instanceof FocusTargetNode) {
                                                    break loop0;
                                                }
                                                if ((node.getKindSet$ui_release() & m4320constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                                    int i10 = 0;
                                                    for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                                        if ((delegate$ui_release.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                                                            i10++;
                                                            if (i10 == 1) {
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
                                                    if (i10 == 1) {
                                                    }
                                                }
                                                node = DelegatableNodeKt.pop(mutableVector);
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
                            } else {
                                node = null;
                                break;
                            }
                        }
                        FocusTargetNode focusTargetNode2 = (FocusTargetNode) node;
                        if (focusTargetNode2 == null) {
                            return CustomDestinationResult.None;
                        }
                        int i11 = WhenMappings.$EnumSwitchMapping$1[focusTargetNode2.getFocusState().ordinal()];
                        if (i11 != 1) {
                            if (i11 != 2) {
                                if (i11 != 3) {
                                    if (i11 == 4) {
                                        CustomDestinationResult m2662performCustomRequestFocusMxy_nc0 = m2662performCustomRequestFocusMxy_nc0(focusTargetNode2, i8);
                                        if (m2662performCustomRequestFocusMxy_nc0 != CustomDestinationResult.None) {
                                            customDestinationResult = m2662performCustomRequestFocusMxy_nc0;
                                        }
                                        if (customDestinationResult == null) {
                                            return m2660performCustomEnterMxy_nc0(focusTargetNode2, i8);
                                        }
                                        return customDestinationResult;
                                    }
                                    throw new p();
                                }
                                return m2662performCustomRequestFocusMxy_nc0(focusTargetNode2, i8);
                            }
                            return CustomDestinationResult.Cancelled;
                        }
                        return m2660performCustomEnterMxy_nc0(focusTargetNode2, i8);
                    }
                    throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                }
                throw new p();
            }
            return m2659performCustomClearFocusMxy_nc0(requireActiveChild(focusTargetNode), i8);
        }
        return CustomDestinationResult.None;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00d7, code lost:            if (grantFocus(r11) != false) goto L72;     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00f8, code lost:            if (grantFocus(r11) != false) goto L72;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean performRequestFocus(androidx.compose.ui.focus.FocusTargetNode r11) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTransactionsKt.performRequestFocus(androidx.compose.ui.focus.FocusTargetNode):boolean");
    }

    public static final boolean requestFocus(FocusTargetNode focusTargetNode) {
        FocusTransactionManager requireTransactionManager = FocusTargetNodeKt.requireTransactionManager(focusTargetNode);
        try {
            if (requireTransactionManager.ongoingTransaction) {
                requireTransactionManager.cancelTransaction();
            }
            requireTransactionManager.beginTransaction();
            int i8 = WhenMappings.$EnumSwitchMapping$0[m2662performCustomRequestFocusMxy_nc0(focusTargetNode, FocusDirection.Companion.m2636getEnterdhqQ8s()).ordinal()];
            boolean z8 = true;
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 3 && i8 != 4) {
                        throw new p();
                    }
                    z8 = false;
                }
            } else {
                z8 = performRequestFocus(focusTargetNode);
            }
            return z8;
        } finally {
            requireTransactionManager.commitTransaction();
        }
    }

    private static final boolean requestFocusForChild(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2) {
        Modifier.Node node;
        Modifier.Node node2;
        NodeChain nodes$ui_release;
        NodeChain nodes$ui_release2;
        int m4320constructorimpl = NodeKind.m4320constructorimpl(1024);
        if (focusTargetNode2.getNode().isAttached()) {
            Modifier.Node parent$ui_release = focusTargetNode2.getNode().getParent$ui_release();
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode2);
            loop0: while (true) {
                node = null;
                if (requireLayoutNode != null) {
                    if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m4320constructorimpl) != 0) {
                        while (parent$ui_release != null) {
                            if ((parent$ui_release.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                                node2 = parent$ui_release;
                                MutableVector mutableVector = null;
                                while (node2 != null) {
                                    if (node2 instanceof FocusTargetNode) {
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
                    if (requireLayoutNode != null && (nodes$ui_release2 = requireLayoutNode.getNodes$ui_release()) != null) {
                        parent$ui_release = nodes$ui_release2.getTail$ui_release();
                    } else {
                        parent$ui_release = null;
                    }
                } else {
                    node2 = null;
                    break;
                }
            }
            if (AbstractC3292y.d(node2, focusTargetNode)) {
                int i9 = WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
                if (i9 != 1) {
                    if (i9 != 2) {
                        if (i9 != 3) {
                            if (i9 == 4) {
                                int m4320constructorimpl2 = NodeKind.m4320constructorimpl(1024);
                                if (focusTargetNode.getNode().isAttached()) {
                                    Modifier.Node parent$ui_release2 = focusTargetNode.getNode().getParent$ui_release();
                                    LayoutNode requireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
                                    loop4: while (true) {
                                        if (requireLayoutNode2 == null) {
                                            break;
                                        }
                                        if ((requireLayoutNode2.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m4320constructorimpl2) != 0) {
                                            while (parent$ui_release2 != null) {
                                                if ((parent$ui_release2.getKindSet$ui_release() & m4320constructorimpl2) != 0) {
                                                    Modifier.Node node3 = parent$ui_release2;
                                                    MutableVector mutableVector2 = null;
                                                    while (node3 != null) {
                                                        if (node3 instanceof FocusTargetNode) {
                                                            node = node3;
                                                            break loop4;
                                                        }
                                                        if ((node3.getKindSet$ui_release() & m4320constructorimpl2) != 0 && (node3 instanceof DelegatingNode)) {
                                                            int i10 = 0;
                                                            for (Modifier.Node delegate$ui_release2 = ((DelegatingNode) node3).getDelegate$ui_release(); delegate$ui_release2 != null; delegate$ui_release2 = delegate$ui_release2.getChild$ui_release()) {
                                                                if ((delegate$ui_release2.getKindSet$ui_release() & m4320constructorimpl2) != 0) {
                                                                    i10++;
                                                                    if (i10 == 1) {
                                                                        node3 = delegate$ui_release2;
                                                                    } else {
                                                                        if (mutableVector2 == null) {
                                                                            mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                                        }
                                                                        if (node3 != null) {
                                                                            mutableVector2.add(node3);
                                                                            node3 = null;
                                                                        }
                                                                        mutableVector2.add(delegate$ui_release2);
                                                                    }
                                                                }
                                                            }
                                                            if (i10 == 1) {
                                                            }
                                                        }
                                                        node3 = DelegatableNodeKt.pop(mutableVector2);
                                                    }
                                                }
                                                parent$ui_release2 = parent$ui_release2.getParent$ui_release();
                                            }
                                        }
                                        requireLayoutNode2 = requireLayoutNode2.getParent$ui_release();
                                        if (requireLayoutNode2 != null && (nodes$ui_release = requireLayoutNode2.getNodes$ui_release()) != null) {
                                            parent$ui_release2 = nodes$ui_release.getTail$ui_release();
                                        } else {
                                            parent$ui_release2 = null;
                                        }
                                    }
                                    FocusTargetNode focusTargetNode3 = (FocusTargetNode) node;
                                    if (focusTargetNode3 == null && requestFocusForOwner(focusTargetNode)) {
                                        focusTargetNode.setFocusState(FocusStateImpl.Active);
                                        return requestFocusForChild(focusTargetNode, focusTargetNode2);
                                    }
                                    if (focusTargetNode3 != null && requestFocusForChild(focusTargetNode3, focusTargetNode)) {
                                        boolean requestFocusForChild = requestFocusForChild(focusTargetNode, focusTargetNode2);
                                        if (focusTargetNode.getFocusState() == FocusStateImpl.ActiveParent) {
                                            if (requestFocusForChild) {
                                                FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode3);
                                                return requestFocusForChild;
                                            }
                                            return requestFocusForChild;
                                        }
                                        throw new IllegalStateException("Deactivated node is focused".toString());
                                    }
                                } else {
                                    throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                                }
                            } else {
                                throw new p();
                            }
                        } else {
                            requireActiveChild(focusTargetNode);
                            if (clearChildFocus$default(focusTargetNode, false, false, 3, null) && grantFocus(focusTargetNode2)) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
                boolean grantFocus = grantFocus(focusTargetNode2);
                if (grantFocus) {
                    focusTargetNode.setFocusState(FocusStateImpl.ActiveParent);
                    return grantFocus;
                }
                return grantFocus;
            }
            throw new IllegalStateException("Non child node cannot request focus.".toString());
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    private static final boolean requestFocusForOwner(FocusTargetNode focusTargetNode) {
        LayoutNode layoutNode;
        Owner owner$ui_release;
        NodeCoordinator coordinator$ui_release = focusTargetNode.getCoordinator$ui_release();
        if (coordinator$ui_release != null && (layoutNode = coordinator$ui_release.getLayoutNode()) != null && (owner$ui_release = layoutNode.getOwner$ui_release()) != null) {
            return owner$ui_release.requestFocus();
        }
        throw new IllegalStateException("Owner not initialized.".toString());
    }

    private static final FocusTargetNode requireActiveChild(FocusTargetNode focusTargetNode) {
        FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(focusTargetNode);
        if (activeChild != null) {
            return activeChild;
        }
        throw new IllegalArgumentException("ActiveParent with no focused child".toString());
    }
}
