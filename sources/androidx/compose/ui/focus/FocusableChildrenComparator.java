package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import java.util.Comparator;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
final class FocusableChildrenComparator implements Comparator<FocusTargetNode> {
    public static final FocusableChildrenComparator INSTANCE = new FocusableChildrenComparator();

    private FocusableChildrenComparator() {
    }

    private final MutableVector<LayoutNode> pathFromRoot(LayoutNode layoutNode) {
        MutableVector<LayoutNode> mutableVector = new MutableVector<>(new LayoutNode[16], 0);
        while (layoutNode != null) {
            mutableVector.add(0, layoutNode);
            layoutNode = layoutNode.getParent$ui_release();
        }
        return mutableVector;
    }

    @Override // java.util.Comparator
    public int compare(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2) {
        if (focusTargetNode == null) {
            throw new IllegalArgumentException("compare requires non-null focus targets".toString());
        }
        if (focusTargetNode2 != null) {
            int i8 = 0;
            if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode) && FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode2)) {
                LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
                LayoutNode requireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(focusTargetNode2);
                if (AbstractC3292y.d(requireLayoutNode, requireLayoutNode2)) {
                    return 0;
                }
                MutableVector<LayoutNode> pathFromRoot = pathFromRoot(requireLayoutNode);
                MutableVector<LayoutNode> pathFromRoot2 = pathFromRoot(requireLayoutNode2);
                int min = Math.min(pathFromRoot.getSize() - 1, pathFromRoot2.getSize() - 1);
                if (min >= 0) {
                    while (AbstractC3292y.d(pathFromRoot.getContent()[i8], pathFromRoot2.getContent()[i8])) {
                        if (i8 != min) {
                            i8++;
                        }
                    }
                    return AbstractC3292y.k(pathFromRoot.getContent()[i8].getPlaceOrder$ui_release(), pathFromRoot2.getContent()[i8].getPlaceOrder$ui_release());
                }
                throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.".toString());
            }
            if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode)) {
                return -1;
            }
            return FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode2) ? 1 : 0;
        }
        throw new IllegalArgumentException("compare requires non-null focus targets".toString());
    }
}
