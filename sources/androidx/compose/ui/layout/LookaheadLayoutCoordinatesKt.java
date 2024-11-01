package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LookaheadDelegate;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class LookaheadLayoutCoordinatesKt {
    public static final LookaheadDelegate getRootLookaheadDelegate(LookaheadDelegate lookaheadDelegate) {
        LayoutNode layoutNode;
        LayoutNode layoutNode2 = lookaheadDelegate.getLayoutNode();
        while (true) {
            LayoutNode parent$ui_release = layoutNode2.getParent$ui_release();
            LayoutNode layoutNode3 = null;
            if (parent$ui_release != null) {
                layoutNode = parent$ui_release.getLookaheadRoot$ui_release();
            } else {
                layoutNode = null;
            }
            if (layoutNode != null) {
                LayoutNode parent$ui_release2 = layoutNode2.getParent$ui_release();
                if (parent$ui_release2 != null) {
                    layoutNode3 = parent$ui_release2.getLookaheadRoot$ui_release();
                }
                AbstractC3292y.f(layoutNode3);
                if (layoutNode3.isVirtualLookaheadRoot$ui_release()) {
                    layoutNode2 = layoutNode2.getParent$ui_release();
                    AbstractC3292y.f(layoutNode2);
                } else {
                    LayoutNode parent$ui_release3 = layoutNode2.getParent$ui_release();
                    AbstractC3292y.f(parent$ui_release3);
                    layoutNode2 = parent$ui_release3.getLookaheadRoot$ui_release();
                    AbstractC3292y.f(layoutNode2);
                }
            } else {
                LookaheadDelegate lookaheadDelegate2 = layoutNode2.getOuterCoordinator$ui_release().getLookaheadDelegate();
                AbstractC3292y.f(lookaheadDelegate2);
                return lookaheadDelegate2;
            }
        }
    }
}
