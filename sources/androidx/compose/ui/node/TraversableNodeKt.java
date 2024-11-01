package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Actual_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.TraversableNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class TraversableNodeKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v9 */
    public static final TraversableNode findNearestAncestor(DelegatableNode delegatableNode, Object obj) {
        NodeChain nodes$ui_release;
        int m4320constructorimpl = NodeKind.m4320constructorimpl(262144);
        if (delegatableNode.getNode().isAttached()) {
            Modifier.Node parent$ui_release = delegatableNode.getNode().getParent$ui_release();
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
            while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m4320constructorimpl) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                            DelegatingNode delegatingNode = parent$ui_release;
                            MutableVector mutableVector = null;
                            while (delegatingNode != 0) {
                                if (delegatingNode instanceof TraversableNode) {
                                    TraversableNode traversableNode = (TraversableNode) delegatingNode;
                                    if (AbstractC3292y.d(obj, traversableNode.getTraverseKey())) {
                                        return traversableNode;
                                    }
                                } else if ((delegatingNode.getKindSet$ui_release() & m4320constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                    Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                                    int i8 = 0;
                                    delegatingNode = delegatingNode;
                                    while (delegate$ui_release != null) {
                                        if ((delegate$ui_release.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                                            i8++;
                                            if (i8 == 1) {
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
                                    if (i8 == 1) {
                                    }
                                }
                                delegatingNode = DelegatableNodeKt.pop(mutableVector);
                            }
                        }
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui_release();
                parent$ui_release = (requireLayoutNode == null || (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
            }
            return null;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.ui.Modifier$Node] */
    public static final void traverseAncestors(DelegatableNode delegatableNode, Object obj, Function1 function1) {
        NodeChain nodes$ui_release;
        int m4320constructorimpl = NodeKind.m4320constructorimpl(262144);
        if (delegatableNode.getNode().isAttached()) {
            Modifier.Node parent$ui_release = delegatableNode.getNode().getParent$ui_release();
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
            while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m4320constructorimpl) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                            DelegatingNode delegatingNode = parent$ui_release;
                            MutableVector mutableVector = null;
                            while (delegatingNode != 0) {
                                if (delegatingNode instanceof TraversableNode) {
                                    TraversableNode traversableNode = (TraversableNode) delegatingNode;
                                    if (!(AbstractC3292y.d(obj, traversableNode.getTraverseKey()) ? ((Boolean) function1.invoke(traversableNode)).booleanValue() : true)) {
                                        return;
                                    }
                                } else {
                                    if (((delegatingNode.getKindSet$ui_release() & m4320constructorimpl) != 0) && (delegatingNode instanceof DelegatingNode)) {
                                        Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                                        int i8 = 0;
                                        delegatingNode = delegatingNode;
                                        while (delegate$ui_release != null) {
                                            if ((delegate$ui_release.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                                                i8++;
                                                if (i8 == 1) {
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
                                        if (i8 == 1) {
                                        }
                                    }
                                }
                                delegatingNode = DelegatableNodeKt.pop(mutableVector);
                            }
                        }
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui_release();
                parent$ui_release = (requireLayoutNode == null || (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
            }
            return;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x002f, code lost:            continue;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r10v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r10v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r10v8, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.jvm.functions.Function1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void traverseChildren(androidx.compose.ui.node.DelegatableNode r10, java.lang.Object r11, kotlin.jvm.functions.Function1 r12) {
        /*
            r0 = 262144(0x40000, float:3.67342E-40)
            int r0 = androidx.compose.ui.node.NodeKind.m4320constructorimpl(r0)
            androidx.compose.ui.Modifier$Node r1 = r10.getNode()
            boolean r1 = r1.isAttached()
            if (r1 == 0) goto Lc9
            androidx.compose.runtime.collection.MutableVector r1 = new androidx.compose.runtime.collection.MutableVector
            r2 = 16
            androidx.compose.ui.Modifier$Node[] r3 = new androidx.compose.ui.Modifier.Node[r2]
            r4 = 0
            r1.<init>(r3, r4)
            androidx.compose.ui.Modifier$Node r3 = r10.getNode()
            androidx.compose.ui.Modifier$Node r3 = r3.getChild$ui_release()
            if (r3 != 0) goto L2c
            androidx.compose.ui.Modifier$Node r10 = r10.getNode()
            androidx.compose.ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r1, r10)
            goto L2f
        L2c:
            r1.add(r3)
        L2f:
            boolean r10 = r1.isNotEmpty()
            if (r10 == 0) goto Lc8
            int r10 = r1.getSize()
            r3 = 1
            int r10 = r10 - r3
            java.lang.Object r10 = r1.removeAt(r10)
            androidx.compose.ui.Modifier$Node r10 = (androidx.compose.ui.Modifier.Node) r10
            int r5 = r10.getAggregateChildKindSet$ui_release()
            r5 = r5 & r0
            if (r5 != 0) goto L4c
            androidx.compose.ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r1, r10)
            goto L2f
        L4c:
            if (r10 == 0) goto L2f
            int r5 = r10.getKindSet$ui_release()
            r5 = r5 & r0
            if (r5 == 0) goto Lc3
            r5 = 0
            r6 = r5
        L57:
            if (r10 == 0) goto L2f
            boolean r7 = r10 instanceof androidx.compose.ui.node.TraversableNode
            if (r7 == 0) goto L78
            androidx.compose.ui.node.TraversableNode r10 = (androidx.compose.ui.node.TraversableNode) r10
            java.lang.Object r7 = r10.getTraverseKey()
            boolean r7 = kotlin.jvm.internal.AbstractC3292y.d(r11, r7)
            if (r7 == 0) goto L74
            java.lang.Object r10 = r12.invoke(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            goto L75
        L74:
            r10 = 1
        L75:
            if (r10 != 0) goto Lbe
            return
        L78:
            int r7 = r10.getKindSet$ui_release()
            r7 = r7 & r0
            if (r7 == 0) goto L81
            r7 = 1
            goto L82
        L81:
            r7 = 0
        L82:
            if (r7 == 0) goto Lbe
            boolean r7 = r10 instanceof androidx.compose.ui.node.DelegatingNode
            if (r7 == 0) goto Lbe
            r7 = r10
            androidx.compose.ui.node.DelegatingNode r7 = (androidx.compose.ui.node.DelegatingNode) r7
            androidx.compose.ui.Modifier$Node r7 = r7.getDelegate$ui_release()
            r8 = 0
        L90:
            if (r7 == 0) goto Lbb
            int r9 = r7.getKindSet$ui_release()
            r9 = r9 & r0
            if (r9 == 0) goto L9b
            r9 = 1
            goto L9c
        L9b:
            r9 = 0
        L9c:
            if (r9 == 0) goto Lb6
            int r8 = r8 + 1
            if (r8 != r3) goto La4
            r10 = r7
            goto Lb6
        La4:
            if (r6 != 0) goto Lad
            androidx.compose.runtime.collection.MutableVector r6 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r9 = new androidx.compose.ui.Modifier.Node[r2]
            r6.<init>(r9, r4)
        Lad:
            if (r10 == 0) goto Lb3
            r6.add(r10)
            r10 = r5
        Lb3:
            r6.add(r7)
        Lb6:
            androidx.compose.ui.Modifier$Node r7 = r7.getChild$ui_release()
            goto L90
        Lbb:
            if (r8 != r3) goto Lbe
            goto L57
        Lbe:
            androidx.compose.ui.Modifier$Node r10 = androidx.compose.ui.node.DelegatableNodeKt.access$pop(r6)
            goto L57
        Lc3:
            androidx.compose.ui.Modifier$Node r10 = r10.getChild$ui_release()
            goto L4c
        Lc8:
            return
        Lc9:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "visitChildren called on an unattached node"
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.TraversableNodeKt.traverseChildren(androidx.compose.ui.node.DelegatableNode, java.lang.Object, kotlin.jvm.functions.Function1):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    public static final void traverseDescendants(DelegatableNode delegatableNode, Object obj, Function1 function1) {
        TraversableNode.Companion.TraverseDescendantsAction traverseDescendantsAction;
        int m4320constructorimpl = NodeKind.m4320constructorimpl(262144);
        if (delegatableNode.getNode().isAttached()) {
            MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector, delegatableNode.getNode());
            } else {
                mutableVector.add(child$ui_release);
            }
            while (mutableVector.isNotEmpty()) {
                Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
                if ((node.getAggregateChildKindSet$ui_release() & m4320constructorimpl) != 0) {
                    for (Modifier.Node node2 = node; node2 != null; node2 = node2.getChild$ui_release()) {
                        if ((node2.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                            DelegatingNode delegatingNode = node2;
                            MutableVector mutableVector2 = null;
                            while (delegatingNode != 0) {
                                if (delegatingNode instanceof TraversableNode) {
                                    TraversableNode traversableNode = (TraversableNode) delegatingNode;
                                    if (AbstractC3292y.d(obj, traversableNode.getTraverseKey())) {
                                        traverseDescendantsAction = (TraversableNode.Companion.TraverseDescendantsAction) function1.invoke(traversableNode);
                                    } else {
                                        traverseDescendantsAction = TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                                    }
                                    if (traverseDescendantsAction == TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal) {
                                        return;
                                    }
                                    if (traverseDescendantsAction == TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal) {
                                        break;
                                    }
                                } else if ((delegatingNode.getKindSet$ui_release() & m4320constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                    Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                                    int i8 = 0;
                                    delegatingNode = delegatingNode;
                                    while (delegate$ui_release != null) {
                                        if ((delegate$ui_release.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                                            i8++;
                                            if (i8 == 1) {
                                                delegatingNode = delegate$ui_release;
                                            } else {
                                                if (mutableVector2 == null) {
                                                    mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (delegatingNode != 0) {
                                                    mutableVector2.add(delegatingNode);
                                                    delegatingNode = 0;
                                                }
                                                mutableVector2.add(delegate$ui_release);
                                            }
                                        }
                                        delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                        delegatingNode = delegatingNode;
                                    }
                                    if (i8 == 1) {
                                    }
                                }
                                delegatingNode = DelegatableNodeKt.pop(mutableVector2);
                            }
                        }
                    }
                }
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector, node);
            }
            return;
        }
        throw new IllegalStateException("visitSubtreeIf called on an unattached node".toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static final <T extends TraversableNode> T findNearestAncestor(T t8) {
        NodeChain nodes$ui_release;
        int m4320constructorimpl = NodeKind.m4320constructorimpl(262144);
        if (t8.getNode().isAttached()) {
            Modifier.Node parent$ui_release = t8.getNode().getParent$ui_release();
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(t8);
            while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m4320constructorimpl) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                            DelegatingNode delegatingNode = parent$ui_release;
                            MutableVector mutableVector = null;
                            while (delegatingNode != 0) {
                                if (delegatingNode instanceof TraversableNode) {
                                    T t9 = (T) delegatingNode;
                                    if (AbstractC3292y.d(t8.getTraverseKey(), t9.getTraverseKey()) && Actual_jvmKt.areObjectsOfSameType(t8, t9)) {
                                        return t9;
                                    }
                                } else if ((delegatingNode.getKindSet$ui_release() & m4320constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                    Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                                    int i8 = 0;
                                    delegatingNode = delegatingNode;
                                    while (delegate$ui_release != null) {
                                        if ((delegate$ui_release.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                                            i8++;
                                            if (i8 == 1) {
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
                                    if (i8 == 1) {
                                    }
                                }
                                delegatingNode = DelegatableNodeKt.pop(mutableVector);
                            }
                        }
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui_release();
                parent$ui_release = (requireLayoutNode == null || (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
            }
            return null;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.ui.Modifier$Node] */
    public static final <T extends TraversableNode> void traverseAncestors(T t8, Function1 function1) {
        NodeChain nodes$ui_release;
        int m4320constructorimpl = NodeKind.m4320constructorimpl(262144);
        if (t8.getNode().isAttached()) {
            Modifier.Node parent$ui_release = t8.getNode().getParent$ui_release();
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(t8);
            while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m4320constructorimpl) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                            DelegatingNode delegatingNode = parent$ui_release;
                            MutableVector mutableVector = null;
                            while (delegatingNode != 0) {
                                boolean z8 = true;
                                if (delegatingNode instanceof TraversableNode) {
                                    TraversableNode traversableNode = (TraversableNode) delegatingNode;
                                    if (AbstractC3292y.d(t8.getTraverseKey(), traversableNode.getTraverseKey()) && Actual_jvmKt.areObjectsOfSameType(t8, traversableNode)) {
                                        z8 = ((Boolean) function1.invoke(traversableNode)).booleanValue();
                                    }
                                    if (!z8) {
                                        return;
                                    }
                                } else {
                                    if (((delegatingNode.getKindSet$ui_release() & m4320constructorimpl) != 0) && (delegatingNode instanceof DelegatingNode)) {
                                        Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                                        int i8 = 0;
                                        delegatingNode = delegatingNode;
                                        while (delegate$ui_release != null) {
                                            if ((delegate$ui_release.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                                                i8++;
                                                if (i8 == 1) {
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
                                        if (i8 == 1) {
                                        }
                                    }
                                }
                                delegatingNode = DelegatableNodeKt.pop(mutableVector);
                            }
                        }
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui_release();
                parent$ui_release = (requireLayoutNode == null || (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
            }
            return;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x002f, code lost:            continue;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v8, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v9, types: [androidx.compose.ui.Modifier$Node] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T extends androidx.compose.ui.node.TraversableNode> void traverseChildren(T r11, kotlin.jvm.functions.Function1 r12) {
        /*
            r0 = 262144(0x40000, float:3.67342E-40)
            int r0 = androidx.compose.ui.node.NodeKind.m4320constructorimpl(r0)
            androidx.compose.ui.Modifier$Node r1 = r11.getNode()
            boolean r1 = r1.isAttached()
            if (r1 == 0) goto Ld4
            androidx.compose.runtime.collection.MutableVector r1 = new androidx.compose.runtime.collection.MutableVector
            r2 = 16
            androidx.compose.ui.Modifier$Node[] r3 = new androidx.compose.ui.Modifier.Node[r2]
            r4 = 0
            r1.<init>(r3, r4)
            androidx.compose.ui.Modifier$Node r3 = r11.getNode()
            androidx.compose.ui.Modifier$Node r3 = r3.getChild$ui_release()
            if (r3 != 0) goto L2c
            androidx.compose.ui.Modifier$Node r3 = r11.getNode()
            androidx.compose.ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r1, r3)
            goto L2f
        L2c:
            r1.add(r3)
        L2f:
            boolean r3 = r1.isNotEmpty()
            if (r3 == 0) goto Ld3
            int r3 = r1.getSize()
            r5 = 1
            int r3 = r3 - r5
            java.lang.Object r3 = r1.removeAt(r3)
            androidx.compose.ui.Modifier$Node r3 = (androidx.compose.ui.Modifier.Node) r3
            int r6 = r3.getAggregateChildKindSet$ui_release()
            r6 = r6 & r0
            if (r6 != 0) goto L4c
            androidx.compose.ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r1, r3)
            goto L2f
        L4c:
            if (r3 == 0) goto L2f
            int r6 = r3.getKindSet$ui_release()
            r6 = r6 & r0
            if (r6 == 0) goto Lcd
            r6 = 0
            r7 = r6
        L57:
            if (r3 == 0) goto L2f
            boolean r8 = r3 instanceof androidx.compose.ui.node.TraversableNode
            if (r8 == 0) goto L82
            androidx.compose.ui.node.TraversableNode r3 = (androidx.compose.ui.node.TraversableNode) r3
            java.lang.Object r8 = r11.getTraverseKey()
            java.lang.Object r9 = r3.getTraverseKey()
            boolean r8 = kotlin.jvm.internal.AbstractC3292y.d(r8, r9)
            if (r8 == 0) goto L7e
            boolean r8 = androidx.compose.ui.Actual_jvmKt.areObjectsOfSameType(r11, r3)
            if (r8 == 0) goto L7e
            java.lang.Object r3 = r12.invoke(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            goto L7f
        L7e:
            r3 = 1
        L7f:
            if (r3 != 0) goto Lc8
            return
        L82:
            int r8 = r3.getKindSet$ui_release()
            r8 = r8 & r0
            if (r8 == 0) goto L8b
            r8 = 1
            goto L8c
        L8b:
            r8 = 0
        L8c:
            if (r8 == 0) goto Lc8
            boolean r8 = r3 instanceof androidx.compose.ui.node.DelegatingNode
            if (r8 == 0) goto Lc8
            r8 = r3
            androidx.compose.ui.node.DelegatingNode r8 = (androidx.compose.ui.node.DelegatingNode) r8
            androidx.compose.ui.Modifier$Node r8 = r8.getDelegate$ui_release()
            r9 = 0
        L9a:
            if (r8 == 0) goto Lc5
            int r10 = r8.getKindSet$ui_release()
            r10 = r10 & r0
            if (r10 == 0) goto La5
            r10 = 1
            goto La6
        La5:
            r10 = 0
        La6:
            if (r10 == 0) goto Lc0
            int r9 = r9 + 1
            if (r9 != r5) goto Lae
            r3 = r8
            goto Lc0
        Lae:
            if (r7 != 0) goto Lb7
            androidx.compose.runtime.collection.MutableVector r7 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r10 = new androidx.compose.ui.Modifier.Node[r2]
            r7.<init>(r10, r4)
        Lb7:
            if (r3 == 0) goto Lbd
            r7.add(r3)
            r3 = r6
        Lbd:
            r7.add(r8)
        Lc0:
            androidx.compose.ui.Modifier$Node r8 = r8.getChild$ui_release()
            goto L9a
        Lc5:
            if (r9 != r5) goto Lc8
            goto L57
        Lc8:
            androidx.compose.ui.Modifier$Node r3 = androidx.compose.ui.node.DelegatableNodeKt.access$pop(r7)
            goto L57
        Lcd:
            androidx.compose.ui.Modifier$Node r3 = r3.getChild$ui_release()
            goto L4c
        Ld3:
            return
        Ld4:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "visitChildren called on an unattached node"
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.TraversableNodeKt.traverseChildren(androidx.compose.ui.node.TraversableNode, kotlin.jvm.functions.Function1):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object] */
    public static final <T extends TraversableNode> void traverseDescendants(T t8, Function1 function1) {
        TraversableNode.Companion.TraverseDescendantsAction traverseDescendantsAction;
        int m4320constructorimpl = NodeKind.m4320constructorimpl(262144);
        if (t8.getNode().isAttached()) {
            MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child$ui_release = t8.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector, t8.getNode());
            } else {
                mutableVector.add(child$ui_release);
            }
            while (mutableVector.isNotEmpty()) {
                Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
                if ((node.getAggregateChildKindSet$ui_release() & m4320constructorimpl) != 0) {
                    for (Modifier.Node node2 = node; node2 != null; node2 = node2.getChild$ui_release()) {
                        if ((node2.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                            DelegatingNode delegatingNode = node2;
                            MutableVector mutableVector2 = null;
                            while (delegatingNode != 0) {
                                if (delegatingNode instanceof TraversableNode) {
                                    TraversableNode traversableNode = (TraversableNode) delegatingNode;
                                    if (AbstractC3292y.d(t8.getTraverseKey(), traversableNode.getTraverseKey()) && Actual_jvmKt.areObjectsOfSameType(t8, traversableNode)) {
                                        traverseDescendantsAction = (TraversableNode.Companion.TraverseDescendantsAction) function1.invoke(traversableNode);
                                    } else {
                                        traverseDescendantsAction = TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                                    }
                                    if (traverseDescendantsAction == TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal) {
                                        return;
                                    }
                                    if (traverseDescendantsAction == TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal) {
                                        break;
                                    }
                                } else if ((delegatingNode.getKindSet$ui_release() & m4320constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                    Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                                    int i8 = 0;
                                    delegatingNode = delegatingNode;
                                    while (delegate$ui_release != null) {
                                        if ((delegate$ui_release.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                                            i8++;
                                            if (i8 == 1) {
                                                delegatingNode = delegate$ui_release;
                                            } else {
                                                if (mutableVector2 == null) {
                                                    mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (delegatingNode != 0) {
                                                    mutableVector2.add(delegatingNode);
                                                    delegatingNode = 0;
                                                }
                                                mutableVector2.add(delegate$ui_release);
                                            }
                                        }
                                        delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                        delegatingNode = delegatingNode;
                                    }
                                    if (i8 == 1) {
                                    }
                                }
                                delegatingNode = DelegatableNodeKt.pop(mutableVector2);
                            }
                        }
                    }
                }
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector, node);
            }
            return;
        }
        throw new IllegalStateException("visitSubtreeIf called on an unattached node".toString());
    }
}
