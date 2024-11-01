package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.focus.FocusEventModifier;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusEventModifierNodeKt;
import androidx.compose.ui.focus.FocusOrderModifier;
import androidx.compose.ui.focus.FocusPropertiesModifierNode;
import androidx.compose.ui.focus.FocusPropertiesModifierNodeKt;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.FocusTargetNodeKt;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode;
import androidx.compose.ui.input.pointer.PointerInputModifier;
import androidx.compose.ui.input.rotary.RotaryInputModifierNode;
import androidx.compose.ui.layout.IntermediateLayoutModifierNode;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.OnGloballyPositionedModifier;
import androidx.compose.ui.layout.OnPlacedModifier;
import androidx.compose.ui.layout.OnRemeasuredModifier;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.semantics.SemanticsModifier;

/* loaded from: classes.dex */
public final class NodeKindKt {
    private static final int Inserted = 1;
    private static final int Removed = 2;
    private static final int Updated = 0;

    public static final void autoInvalidateInsertedNode(Modifier.Node node) {
        if (node.isAttached()) {
            autoInvalidateNodeIncludingDelegates(node, -1, 1);
            return;
        }
        throw new IllegalStateException("autoInvalidateInsertedNode called on unattached node".toString());
    }

    public static final void autoInvalidateNodeIncludingDelegates(Modifier.Node node, int i8, int i9) {
        if (node instanceof DelegatingNode) {
            DelegatingNode delegatingNode = (DelegatingNode) node;
            autoInvalidateNodeSelf(node, delegatingNode.getSelfKindSet$ui_release() & i8, i9);
            int i10 = (~delegatingNode.getSelfKindSet$ui_release()) & i8;
            for (Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                autoInvalidateNodeIncludingDelegates(delegate$ui_release, i10, i9);
            }
            return;
        }
        autoInvalidateNodeSelf(node, i8 & node.getKindSet$ui_release(), i9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void autoInvalidateNodeSelf(Modifier.Node node, int i8, int i9) {
        if (i9 == 0 && !node.getShouldAutoInvalidate()) {
            return;
        }
        if ((NodeKind.m4320constructorimpl(2) & i8) != 0 && (node instanceof LayoutModifierNode)) {
            LayoutModifierNodeKt.invalidateMeasurement((LayoutModifierNode) node);
            if (i9 == 2) {
                DelegatableNodeKt.m4203requireCoordinator64DMado(node, NodeKind.m4320constructorimpl(2)).onRelease();
            }
        }
        if ((NodeKind.m4320constructorimpl(256) & i8) != 0 && (node instanceof GlobalPositionAwareModifierNode)) {
            DelegatableNodeKt.requireLayoutNode(node).invalidateMeasurements$ui_release();
        }
        if ((NodeKind.m4320constructorimpl(4) & i8) != 0 && (node instanceof DrawModifierNode)) {
            DrawModifierNodeKt.invalidateDraw((DrawModifierNode) node);
        }
        if ((NodeKind.m4320constructorimpl(8) & i8) != 0 && (node instanceof SemanticsModifierNode)) {
            SemanticsModifierNodeKt.invalidateSemantics((SemanticsModifierNode) node);
        }
        if ((NodeKind.m4320constructorimpl(64) & i8) != 0 && (node instanceof ParentDataModifierNode)) {
            ParentDataModifierNodeKt.invalidateParentData((ParentDataModifierNode) node);
        }
        if ((NodeKind.m4320constructorimpl(1024) & i8) != 0 && (node instanceof FocusTargetNode)) {
            if (i9 == 2) {
                node.onReset();
            } else {
                DelegatableNodeKt.requireOwner(node).getFocusOwner().scheduleInvalidation((FocusTargetNode) node);
            }
        }
        if ((NodeKind.m4320constructorimpl(2048) & i8) != 0 && (node instanceof FocusPropertiesModifierNode)) {
            FocusPropertiesModifierNode focusPropertiesModifierNode = (FocusPropertiesModifierNode) node;
            if (specifiesCanFocusProperty(focusPropertiesModifierNode)) {
                if (i9 == 2) {
                    scheduleInvalidationOfAssociatedFocusTargets(focusPropertiesModifierNode);
                } else {
                    FocusPropertiesModifierNodeKt.invalidateFocusProperties(focusPropertiesModifierNode);
                }
            }
        }
        if ((i8 & NodeKind.m4320constructorimpl(4096)) != 0 && (node instanceof FocusEventModifierNode)) {
            FocusEventModifierNodeKt.invalidateFocusEvent((FocusEventModifierNode) node);
        }
    }

    public static final void autoInvalidateRemovedNode(Modifier.Node node) {
        if (node.isAttached()) {
            autoInvalidateNodeIncludingDelegates(node, -1, 2);
            return;
        }
        throw new IllegalStateException("autoInvalidateRemovedNode called on unattached node".toString());
    }

    public static final void autoInvalidateUpdatedNode(Modifier.Node node) {
        if (node.isAttached()) {
            autoInvalidateNodeIncludingDelegates(node, -1, 0);
            return;
        }
        throw new IllegalStateException("autoInvalidateUpdatedNode called on unattached node".toString());
    }

    public static final int calculateNodeKindSetFrom(Modifier.Node node) {
        if (node.getKindSet$ui_release() != 0) {
            return node.getKindSet$ui_release();
        }
        int m4320constructorimpl = NodeKind.m4320constructorimpl(1);
        if (node instanceof LayoutModifierNode) {
            m4320constructorimpl |= NodeKind.m4320constructorimpl(2);
        }
        if (node instanceof DrawModifierNode) {
            m4320constructorimpl |= NodeKind.m4320constructorimpl(4);
        }
        if (node instanceof SemanticsModifierNode) {
            m4320constructorimpl |= NodeKind.m4320constructorimpl(8);
        }
        if (node instanceof PointerInputModifierNode) {
            m4320constructorimpl |= NodeKind.m4320constructorimpl(16);
        }
        if (node instanceof ModifierLocalModifierNode) {
            m4320constructorimpl |= NodeKind.m4320constructorimpl(32);
        }
        if (node instanceof ParentDataModifierNode) {
            m4320constructorimpl |= NodeKind.m4320constructorimpl(64);
        }
        if (node instanceof LayoutAwareModifierNode) {
            m4320constructorimpl |= NodeKind.m4320constructorimpl(128);
        }
        if (node instanceof GlobalPositionAwareModifierNode) {
            m4320constructorimpl |= NodeKind.m4320constructorimpl(256);
        }
        if (node instanceof IntermediateLayoutModifierNode) {
            m4320constructorimpl |= NodeKind.m4320constructorimpl(512);
        }
        if (node instanceof FocusTargetNode) {
            m4320constructorimpl |= NodeKind.m4320constructorimpl(1024);
        }
        if (node instanceof FocusPropertiesModifierNode) {
            m4320constructorimpl |= NodeKind.m4320constructorimpl(2048);
        }
        if (node instanceof FocusEventModifierNode) {
            m4320constructorimpl |= NodeKind.m4320constructorimpl(4096);
        }
        if (node instanceof KeyInputModifierNode) {
            m4320constructorimpl |= NodeKind.m4320constructorimpl(8192);
        }
        if (node instanceof RotaryInputModifierNode) {
            m4320constructorimpl |= NodeKind.m4320constructorimpl(16384);
        }
        if (node instanceof CompositionLocalConsumerModifierNode) {
            m4320constructorimpl |= NodeKind.m4320constructorimpl(32768);
        }
        if (node instanceof SoftKeyboardInterceptionModifierNode) {
            m4320constructorimpl |= NodeKind.m4320constructorimpl(131072);
        }
        return node instanceof TraversableNode ? m4320constructorimpl | NodeKind.m4320constructorimpl(262144) : m4320constructorimpl;
    }

    public static final int calculateNodeKindSetFromIncludingDelegates(Modifier.Node node) {
        if (node instanceof DelegatingNode) {
            DelegatingNode delegatingNode = (DelegatingNode) node;
            int selfKindSet$ui_release = delegatingNode.getSelfKindSet$ui_release();
            for (Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                selfKindSet$ui_release |= calculateNodeKindSetFromIncludingDelegates(delegate$ui_release);
            }
            return selfKindSet$ui_release;
        }
        return calculateNodeKindSetFrom(node);
    }

    /* renamed from: contains-64DMado, reason: not valid java name */
    public static final boolean m4328contains64DMado(int i8, int i9) {
        return (i8 & i9) != 0;
    }

    /* renamed from: getIncludeSelfInTraversal-H91voCI, reason: not valid java name */
    public static final boolean m4329getIncludeSelfInTraversalH91voCI(int i8) {
        if ((i8 & NodeKind.m4320constructorimpl(128)) != 0) {
            return true;
        }
        return false;
    }

    private static /* synthetic */ void getInserted$annotations() {
    }

    private static /* synthetic */ void getRemoved$annotations() {
    }

    private static /* synthetic */ void getUpdated$annotations() {
    }

    /* renamed from: or-64DMado, reason: not valid java name */
    public static final int m4330or64DMado(int i8, int i9) {
        return i8 | i9;
    }

    private static final void scheduleInvalidationOfAssociatedFocusTargets(FocusPropertiesModifierNode focusPropertiesModifierNode) {
        int m4320constructorimpl = NodeKind.m4320constructorimpl(1024);
        if (focusPropertiesModifierNode.getNode().isAttached()) {
            MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child$ui_release = focusPropertiesModifierNode.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector, focusPropertiesModifierNode.getNode());
            } else {
                mutableVector.add(child$ui_release);
            }
            while (mutableVector.isNotEmpty()) {
                Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
                if ((node.getAggregateChildKindSet$ui_release() & m4320constructorimpl) == 0) {
                    DelegatableNodeKt.addLayoutNodeChildren(mutableVector, node);
                } else {
                    while (true) {
                        if (node == null) {
                            break;
                        }
                        if ((node.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                            MutableVector mutableVector2 = null;
                            while (node != null) {
                                if (node instanceof FocusTargetNode) {
                                    FocusTargetNodeKt.invalidateFocusTarget((FocusTargetNode) node);
                                } else if ((node.getKindSet$ui_release() & m4320constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                    int i8 = 0;
                                    for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                        if ((delegate$ui_release.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                                            i8++;
                                            if (i8 == 1) {
                                                node = delegate$ui_release;
                                            } else {
                                                if (mutableVector2 == null) {
                                                    mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (node != null) {
                                                    mutableVector2.add(node);
                                                    node = null;
                                                }
                                                mutableVector2.add(delegate$ui_release);
                                            }
                                        }
                                    }
                                    if (i8 == 1) {
                                    }
                                }
                                node = DelegatableNodeKt.pop(mutableVector2);
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

    private static final boolean specifiesCanFocusProperty(FocusPropertiesModifierNode focusPropertiesModifierNode) {
        CanFocusChecker canFocusChecker = CanFocusChecker.INSTANCE;
        canFocusChecker.reset();
        focusPropertiesModifierNode.applyFocusProperties(canFocusChecker);
        return canFocusChecker.isCanFocusSet();
    }

    public static final int calculateNodeKindSetFrom(Modifier.Element element) {
        int m4320constructorimpl = NodeKind.m4320constructorimpl(1);
        if (element instanceof LayoutModifier) {
            m4320constructorimpl |= NodeKind.m4320constructorimpl(2);
        }
        if (element instanceof DrawModifier) {
            m4320constructorimpl |= NodeKind.m4320constructorimpl(4);
        }
        if (element instanceof SemanticsModifier) {
            m4320constructorimpl |= NodeKind.m4320constructorimpl(8);
        }
        if (element instanceof PointerInputModifier) {
            m4320constructorimpl |= NodeKind.m4320constructorimpl(16);
        }
        if ((element instanceof ModifierLocalConsumer) || (element instanceof ModifierLocalProvider)) {
            m4320constructorimpl |= NodeKind.m4320constructorimpl(32);
        }
        if (element instanceof FocusEventModifier) {
            m4320constructorimpl |= NodeKind.m4320constructorimpl(4096);
        }
        if (element instanceof FocusOrderModifier) {
            m4320constructorimpl |= NodeKind.m4320constructorimpl(2048);
        }
        if (element instanceof OnGloballyPositionedModifier) {
            m4320constructorimpl |= NodeKind.m4320constructorimpl(256);
        }
        if (element instanceof ParentDataModifier) {
            m4320constructorimpl |= NodeKind.m4320constructorimpl(64);
        }
        return ((element instanceof OnPlacedModifier) || (element instanceof OnRemeasuredModifier)) ? m4320constructorimpl | NodeKind.m4320constructorimpl(128) : m4320constructorimpl;
    }
}
