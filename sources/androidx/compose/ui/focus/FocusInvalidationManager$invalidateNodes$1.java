package androidx.compose.ui.focus;

import Q5.I;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeKind;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class FocusInvalidationManager$invalidateNodes$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ FocusInvalidationManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusInvalidationManager$invalidateNodes$1(FocusInvalidationManager focusInvalidationManager) {
        super(0);
        this.this$0 = focusInvalidationManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m2643invoke();
        return I.f8786a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m2643invoke() {
        Set set;
        Set set2;
        Set<FocusEventModifierNode> set3;
        Set set4;
        Set<FocusTargetNode> set5;
        Set set6;
        Set set7;
        Set set8;
        Set set9;
        FocusState focusState;
        Set set10;
        Set set11;
        Set set12;
        Set set13;
        set = this.this$0.focusPropertiesNodes;
        FocusInvalidationManager focusInvalidationManager = this.this$0;
        Iterator it = set.iterator();
        while (true) {
            int i8 = 1024;
            int i9 = 16;
            int i10 = 0;
            int i11 = 1;
            if (!it.hasNext()) {
                set2 = this.this$0.focusPropertiesNodes;
                set2.clear();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                set3 = this.this$0.focusEventNodes;
                FocusInvalidationManager focusInvalidationManager2 = this.this$0;
                for (FocusEventModifierNode focusEventModifierNode : set3) {
                    if (!focusEventModifierNode.getNode().isAttached()) {
                        focusEventModifierNode.onFocusEvent(FocusStateImpl.Inactive);
                    } else {
                        int m4320constructorimpl = NodeKind.m4320constructorimpl(i8);
                        Modifier.Node node = focusEventModifierNode.getNode();
                        FocusTargetNode focusTargetNode = null;
                        MutableVector mutableVector = null;
                        boolean z8 = true;
                        boolean z9 = false;
                        while (node != null) {
                            if (node instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) node;
                                if (focusTargetNode != null) {
                                    z9 = true;
                                }
                                set11 = focusInvalidationManager2.focusTargetNodes;
                                if (set11.contains(focusTargetNode2)) {
                                    linkedHashSet.add(focusTargetNode2);
                                    z8 = false;
                                }
                                focusTargetNode = focusTargetNode2;
                            } else if ((node.getKindSet$ui_release() & m4320constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release();
                                int i12 = 0;
                                while (delegate$ui_release != null) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                                        i12++;
                                        if (i12 == i11) {
                                            node = delegate$ui_release;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[i9], i10);
                                            }
                                            if (node != null) {
                                                mutableVector.add(node);
                                                node = null;
                                            }
                                            mutableVector.add(delegate$ui_release);
                                        }
                                    }
                                    delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                    i11 = 1;
                                }
                                if (i12 == 1) {
                                    i11 = 1;
                                }
                            }
                            node = DelegatableNodeKt.pop(mutableVector);
                            i11 = 1;
                        }
                        if (focusEventModifierNode.getNode().isAttached()) {
                            MutableVector mutableVector2 = new MutableVector(new Modifier.Node[i9], i10);
                            Modifier.Node child$ui_release = focusEventModifierNode.getNode().getChild$ui_release();
                            if (child$ui_release == null) {
                                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusEventModifierNode.getNode());
                            } else {
                                mutableVector2.add(child$ui_release);
                            }
                            while (mutableVector2.isNotEmpty()) {
                                Modifier.Node node2 = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
                                if ((node2.getAggregateChildKindSet$ui_release() & m4320constructorimpl) == 0) {
                                    DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, node2);
                                } else {
                                    while (node2 != null) {
                                        if ((node2.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                                            MutableVector mutableVector3 = null;
                                            while (node2 != null) {
                                                if (node2 instanceof FocusTargetNode) {
                                                    FocusTargetNode focusTargetNode3 = (FocusTargetNode) node2;
                                                    if (focusTargetNode != null) {
                                                        z9 = true;
                                                    }
                                                    set10 = focusInvalidationManager2.focusTargetNodes;
                                                    if (set10.contains(focusTargetNode3)) {
                                                        linkedHashSet.add(focusTargetNode3);
                                                        z8 = false;
                                                    }
                                                    focusTargetNode = focusTargetNode3;
                                                } else if ((node2.getKindSet$ui_release() & m4320constructorimpl) != 0 && (node2 instanceof DelegatingNode)) {
                                                    Modifier.Node delegate$ui_release2 = ((DelegatingNode) node2).getDelegate$ui_release();
                                                    int i13 = 0;
                                                    while (delegate$ui_release2 != null) {
                                                        if ((delegate$ui_release2.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                                                            i13++;
                                                            if (i13 == 1) {
                                                                node2 = delegate$ui_release2;
                                                            } else {
                                                                if (mutableVector3 == null) {
                                                                    mutableVector3 = new MutableVector(new Modifier.Node[i9], 0);
                                                                }
                                                                if (node2 != null) {
                                                                    mutableVector3.add(node2);
                                                                    node2 = null;
                                                                }
                                                                mutableVector3.add(delegate$ui_release2);
                                                                delegate$ui_release2 = delegate$ui_release2.getChild$ui_release();
                                                                i9 = 16;
                                                            }
                                                        }
                                                        delegate$ui_release2 = delegate$ui_release2.getChild$ui_release();
                                                        i9 = 16;
                                                    }
                                                    if (i13 == 1) {
                                                        i9 = 16;
                                                    }
                                                    node2 = DelegatableNodeKt.pop(mutableVector3);
                                                    i9 = 16;
                                                }
                                                node2 = DelegatableNodeKt.pop(mutableVector3);
                                                i9 = 16;
                                            }
                                        } else {
                                            node2 = node2.getChild$ui_release();
                                            i9 = 16;
                                        }
                                    }
                                }
                                i9 = 16;
                            }
                            if (z8) {
                                if (z9) {
                                    focusState = FocusEventModifierNodeKt.getFocusState(focusEventModifierNode);
                                } else if (focusTargetNode == null || (focusState = focusTargetNode.getFocusState()) == null) {
                                    focusState = FocusStateImpl.Inactive;
                                }
                                focusEventModifierNode.onFocusEvent(focusState);
                            }
                        } else {
                            throw new IllegalStateException("visitChildren called on an unattached node".toString());
                        }
                    }
                    i8 = 1024;
                    i9 = 16;
                    i10 = 0;
                    i11 = 1;
                }
                set4 = this.this$0.focusEventNodes;
                set4.clear();
                set5 = this.this$0.focusTargetNodes;
                for (FocusTargetNode focusTargetNode4 : set5) {
                    if (focusTargetNode4.isAttached()) {
                        FocusStateImpl focusState2 = focusTargetNode4.getFocusState();
                        focusTargetNode4.invalidateFocus$ui_release();
                        if (focusState2 != focusTargetNode4.getFocusState() || linkedHashSet.contains(focusTargetNode4)) {
                            FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode4);
                        }
                    }
                }
                set6 = this.this$0.focusTargetNodes;
                set6.clear();
                linkedHashSet.clear();
                set7 = this.this$0.focusPropertiesNodes;
                if (set7.isEmpty()) {
                    set8 = this.this$0.focusEventNodes;
                    if (set8.isEmpty()) {
                        set9 = this.this$0.focusTargetNodes;
                        if (!set9.isEmpty()) {
                            throw new IllegalStateException("Unprocessed FocusTarget nodes".toString());
                        }
                        return;
                    }
                    throw new IllegalStateException("Unprocessed FocusEvent nodes".toString());
                }
                throw new IllegalStateException("Unprocessed FocusProperties nodes".toString());
            }
            FocusPropertiesModifierNode focusPropertiesModifierNode = (FocusPropertiesModifierNode) it.next();
            if (focusPropertiesModifierNode.getNode().isAttached()) {
                int m4320constructorimpl2 = NodeKind.m4320constructorimpl(1024);
                Modifier.Node node3 = focusPropertiesModifierNode.getNode();
                MutableVector mutableVector4 = null;
                while (node3 != null) {
                    if (node3 instanceof FocusTargetNode) {
                        set13 = focusInvalidationManager.focusTargetNodes;
                        set13.add((FocusTargetNode) node3);
                    } else if ((node3.getKindSet$ui_release() & m4320constructorimpl2) != 0 && (node3 instanceof DelegatingNode)) {
                        int i14 = 0;
                        for (Modifier.Node delegate$ui_release3 = ((DelegatingNode) node3).getDelegate$ui_release(); delegate$ui_release3 != null; delegate$ui_release3 = delegate$ui_release3.getChild$ui_release()) {
                            if ((delegate$ui_release3.getKindSet$ui_release() & m4320constructorimpl2) != 0) {
                                i14++;
                                if (i14 == 1) {
                                    node3 = delegate$ui_release3;
                                } else {
                                    if (mutableVector4 == null) {
                                        mutableVector4 = new MutableVector(new Modifier.Node[16], 0);
                                    }
                                    if (node3 != null) {
                                        mutableVector4.add(node3);
                                        node3 = null;
                                    }
                                    mutableVector4.add(delegate$ui_release3);
                                }
                            }
                        }
                        if (i14 == 1) {
                        }
                    }
                    node3 = DelegatableNodeKt.pop(mutableVector4);
                }
                if (focusPropertiesModifierNode.getNode().isAttached()) {
                    MutableVector mutableVector5 = new MutableVector(new Modifier.Node[16], 0);
                    Modifier.Node child$ui_release2 = focusPropertiesModifierNode.getNode().getChild$ui_release();
                    if (child$ui_release2 == null) {
                        DelegatableNodeKt.addLayoutNodeChildren(mutableVector5, focusPropertiesModifierNode.getNode());
                    } else {
                        mutableVector5.add(child$ui_release2);
                    }
                    while (mutableVector5.isNotEmpty()) {
                        Modifier.Node node4 = (Modifier.Node) mutableVector5.removeAt(mutableVector5.getSize() - 1);
                        if ((node4.getAggregateChildKindSet$ui_release() & m4320constructorimpl2) == 0) {
                            DelegatableNodeKt.addLayoutNodeChildren(mutableVector5, node4);
                        } else {
                            while (true) {
                                if (node4 == null) {
                                    break;
                                }
                                if ((node4.getKindSet$ui_release() & m4320constructorimpl2) != 0) {
                                    MutableVector mutableVector6 = null;
                                    while (node4 != null) {
                                        if (node4 instanceof FocusTargetNode) {
                                            set12 = focusInvalidationManager.focusTargetNodes;
                                            set12.add((FocusTargetNode) node4);
                                        } else if ((node4.getKindSet$ui_release() & m4320constructorimpl2) != 0 && (node4 instanceof DelegatingNode)) {
                                            int i15 = 0;
                                            for (Modifier.Node delegate$ui_release4 = ((DelegatingNode) node4).getDelegate$ui_release(); delegate$ui_release4 != null; delegate$ui_release4 = delegate$ui_release4.getChild$ui_release()) {
                                                if ((delegate$ui_release4.getKindSet$ui_release() & m4320constructorimpl2) != 0) {
                                                    i15++;
                                                    if (i15 == 1) {
                                                        node4 = delegate$ui_release4;
                                                    } else {
                                                        if (mutableVector6 == null) {
                                                            mutableVector6 = new MutableVector(new Modifier.Node[16], 0);
                                                        }
                                                        if (node4 != null) {
                                                            mutableVector6.add(node4);
                                                            node4 = null;
                                                        }
                                                        mutableVector6.add(delegate$ui_release4);
                                                    }
                                                }
                                            }
                                            if (i15 == 1) {
                                            }
                                        }
                                        node4 = DelegatableNodeKt.pop(mutableVector6);
                                    }
                                } else {
                                    node4 = node4.getChild$ui_release();
                                }
                            }
                        }
                    }
                } else {
                    throw new IllegalStateException("visitChildren called on an unattached node".toString());
                }
            }
        }
    }
}
