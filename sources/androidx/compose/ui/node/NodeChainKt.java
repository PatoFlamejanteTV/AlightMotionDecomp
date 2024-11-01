package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Actual_jvmKt;
import androidx.compose.ui.CombinedModifier;
import androidx.compose.ui.Modifier;
import i6.m;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class NodeChainKt {
    private static final int ActionReplace = 0;
    private static final int ActionReuse = 2;
    private static final int ActionUpdate = 1;
    private static final NodeChainKt$SentinelHead$1 SentinelHead;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.Modifier$Node, androidx.compose.ui.node.NodeChainKt$SentinelHead$1] */
    static {
        ?? r02 = new Modifier.Node() { // from class: androidx.compose.ui.node.NodeChainKt$SentinelHead$1
            public String toString() {
                return "<Head>";
            }
        };
        r02.setAggregateChildKindSet$ui_release(-1);
        SentinelHead = r02;
    }

    public static final /* synthetic */ MutableVector access$fillVector(Modifier modifier, MutableVector mutableVector) {
        return fillVector(modifier, mutableVector);
    }

    public static final /* synthetic */ NodeChainKt$SentinelHead$1 access$getSentinelHead$p() {
        return SentinelHead;
    }

    public static final /* synthetic */ void access$updateUnsafe(ModifierNodeElement modifierNodeElement, Modifier.Node node) {
        updateUnsafe(modifierNodeElement, node);
    }

    public static final int actionForModifiers(Modifier.Element element, Modifier.Element element2) {
        if (AbstractC3292y.d(element, element2)) {
            return 2;
        }
        if (!Actual_jvmKt.areObjectsOfSameType(element, element2) && (!(element instanceof ForceUpdateElement) || !Actual_jvmKt.areObjectsOfSameType(((ForceUpdateElement) element).getOriginal(), element2))) {
            return 0;
        }
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final MutableVector<Modifier.Element> fillVector(Modifier modifier, MutableVector<Modifier.Element> mutableVector) {
        MutableVector mutableVector2 = new MutableVector(new Modifier[m.d(mutableVector.getSize(), 16)], 0);
        mutableVector2.add(modifier);
        NodeChainKt$fillVector$1 nodeChainKt$fillVector$1 = null;
        while (mutableVector2.isNotEmpty()) {
            Modifier modifier2 = (Modifier) mutableVector2.removeAt(mutableVector2.getSize() - 1);
            if (modifier2 instanceof CombinedModifier) {
                CombinedModifier combinedModifier = (CombinedModifier) modifier2;
                mutableVector2.add(combinedModifier.getInner$ui_release());
                mutableVector2.add(combinedModifier.getOuter$ui_release());
            } else if (modifier2 instanceof Modifier.Element) {
                mutableVector.add(modifier2);
            } else {
                if (nodeChainKt$fillVector$1 == null) {
                    nodeChainKt$fillVector$1 = new NodeChainKt$fillVector$1(mutableVector);
                }
                modifier2.all(nodeChainKt$fillVector$1);
                nodeChainKt$fillVector$1 = nodeChainKt$fillVector$1;
            }
        }
        return mutableVector;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends Modifier.Node> void updateUnsafe(ModifierNodeElement<T> modifierNodeElement, Modifier.Node node) {
        AbstractC3292y.g(node, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
        modifierNodeElement.update(node);
    }
}
