package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.layout.Measurable;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class LayoutNodeLayoutDelegateKt {
    private static final String MeasuredTwiceErrorMessage = "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()";

    public static final boolean isOutMostLookaheadRoot(LayoutNode layoutNode) {
        LayoutNode layoutNode2;
        if (layoutNode.getLookaheadRoot$ui_release() != null) {
            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
            if (parent$ui_release != null) {
                layoutNode2 = parent$ui_release.getLookaheadRoot$ui_release();
            } else {
                layoutNode2 = null;
            }
            if (layoutNode2 == null || layoutNode.getLayoutDelegate$ui_release().getDetachedFromParentLookaheadPass$ui_release()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T extends Measurable> void updateChildMeasurables(LayoutNode layoutNode, MutableVector<T> mutableVector, Function1 function1) {
        MutableVector<LayoutNode> mutableVector2 = layoutNode.get_children$ui_release();
        int size = mutableVector2.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector2.getContent();
            int i8 = 0;
            do {
                LayoutNode layoutNode2 = content[i8];
                if (mutableVector.getSize() <= i8) {
                    mutableVector.add(function1.invoke(layoutNode2));
                } else {
                    mutableVector.set(i8, function1.invoke(layoutNode2));
                }
                i8++;
            } while (i8 < size);
        }
        mutableVector.removeRange(layoutNode.getChildren$ui_release().size(), mutableVector.getSize());
    }
}
