package androidx.compose.ui.modifier;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v9 */
    public static Object a(ModifierLocalModifierNode modifierLocalModifierNode, ModifierLocal modifierLocal) {
        NodeChain nodes$ui_release;
        if (modifierLocalModifierNode.getNode().isAttached()) {
            int m4320constructorimpl = NodeKind.m4320constructorimpl(32);
            if (modifierLocalModifierNode.getNode().isAttached()) {
                Modifier.Node parent$ui_release = modifierLocalModifierNode.getNode().getParent$ui_release();
                LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(modifierLocalModifierNode);
                while (requireLayoutNode != null) {
                    if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m4320constructorimpl) != 0) {
                        while (parent$ui_release != null) {
                            if ((parent$ui_release.getKindSet$ui_release() & m4320constructorimpl) != 0) {
                                DelegatingNode delegatingNode = parent$ui_release;
                                MutableVector mutableVector = null;
                                while (delegatingNode != 0) {
                                    if (delegatingNode instanceof ModifierLocalModifierNode) {
                                        ModifierLocalModifierNode modifierLocalModifierNode2 = (ModifierLocalModifierNode) delegatingNode;
                                        if (modifierLocalModifierNode2.getProvidedValues().contains$ui_release(modifierLocal)) {
                                            return modifierLocalModifierNode2.getProvidedValues().get$ui_release(modifierLocal);
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
                    if (requireLayoutNode != null && (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) != null) {
                        parent$ui_release = nodes$ui_release.getTail$ui_release();
                    } else {
                        parent$ui_release = null;
                    }
                }
                return modifierLocal.getDefaultFactory$ui_release().invoke();
            }
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        throw new IllegalArgumentException("ModifierLocal accessed from an unattached node".toString());
    }

    public static ModifierLocalMap b(ModifierLocalModifierNode modifierLocalModifierNode) {
        return EmptyMap.INSTANCE;
    }

    public static void c(ModifierLocalModifierNode modifierLocalModifierNode, ModifierLocal modifierLocal, Object obj) {
        if (modifierLocalModifierNode.getProvidedValues() != EmptyMap.INSTANCE) {
            if (modifierLocalModifierNode.getProvidedValues().contains$ui_release(modifierLocal)) {
                modifierLocalModifierNode.getProvidedValues().mo4183set$ui_release(modifierLocal, obj);
                return;
            }
            throw new IllegalArgumentException(("Any provided key must be initially provided in the overridden providedValues: ModifierLocalMap property. Key " + modifierLocal + " was not found.").toString());
        }
        throw new IllegalArgumentException("In order to provide locals you must override providedValues: ModifierLocalMap".toString());
    }
}
