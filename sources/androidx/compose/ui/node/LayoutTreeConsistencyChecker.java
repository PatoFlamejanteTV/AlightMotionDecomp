package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.MeasureAndLayoutDelegate;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class LayoutTreeConsistencyChecker {
    public static final int $stable = 8;
    private final List<MeasureAndLayoutDelegate.PostponedRequest> postponedMeasureRequests;
    private final DepthSortedSetsForDifferentPasses relayoutNodes;
    private final LayoutNode root;

    public LayoutTreeConsistencyChecker(LayoutNode layoutNode, DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses, List<MeasureAndLayoutDelegate.PostponedRequest> list) {
        this.root = layoutNode;
        this.relayoutNodes = depthSortedSetsForDifferentPasses;
        this.postponedMeasureRequests = list;
    }

    private final boolean consistentLayoutState(LayoutNode layoutNode) {
        LayoutNode.LayoutState layoutState;
        MeasureAndLayoutDelegate.PostponedRequest postponedRequest;
        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
        MeasureAndLayoutDelegate.PostponedRequest postponedRequest2 = null;
        if (parent$ui_release != null) {
            layoutState = parent$ui_release.getLayoutState$ui_release();
        } else {
            layoutState = null;
        }
        if (layoutNode.isPlaced() || (layoutNode.getPlaceOrder$ui_release() != Integer.MAX_VALUE && parent$ui_release != null && parent$ui_release.isPlaced())) {
            if (layoutNode.getMeasurePending$ui_release()) {
                List<MeasureAndLayoutDelegate.PostponedRequest> list = this.postponedMeasureRequests;
                int size = list.size();
                int i8 = 0;
                while (true) {
                    if (i8 < size) {
                        postponedRequest = list.get(i8);
                        MeasureAndLayoutDelegate.PostponedRequest postponedRequest3 = postponedRequest;
                        if (AbstractC3292y.d(postponedRequest3.getNode(), layoutNode) && !postponedRequest3.isLookahead()) {
                            break;
                        }
                        i8++;
                    } else {
                        postponedRequest = null;
                        break;
                    }
                }
                if (postponedRequest != null) {
                    return true;
                }
            }
            if (layoutNode.getMeasurePending$ui_release()) {
                if (!this.relayoutNodes.contains(layoutNode) && layoutNode.getLayoutState$ui_release() != LayoutNode.LayoutState.LookaheadMeasuring && ((parent$ui_release == null || !parent$ui_release.getMeasurePending$ui_release()) && ((parent$ui_release == null || !parent$ui_release.getLookaheadMeasurePending$ui_release()) && layoutState != LayoutNode.LayoutState.Measuring))) {
                    return false;
                }
                return true;
            }
            if (layoutNode.getLayoutPending$ui_release()) {
                if (!this.relayoutNodes.contains(layoutNode) && parent$ui_release != null && !parent$ui_release.getMeasurePending$ui_release() && !parent$ui_release.getLayoutPending$ui_release() && layoutState != LayoutNode.LayoutState.Measuring && layoutState != LayoutNode.LayoutState.LayingOut) {
                    return false;
                }
                return true;
            }
        }
        if (AbstractC3292y.d(layoutNode.isPlacedInLookahead(), Boolean.TRUE)) {
            if (layoutNode.getLookaheadMeasurePending$ui_release()) {
                List<MeasureAndLayoutDelegate.PostponedRequest> list2 = this.postponedMeasureRequests;
                int size2 = list2.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size2) {
                        break;
                    }
                    MeasureAndLayoutDelegate.PostponedRequest postponedRequest4 = list2.get(i9);
                    MeasureAndLayoutDelegate.PostponedRequest postponedRequest5 = postponedRequest4;
                    if (AbstractC3292y.d(postponedRequest5.getNode(), layoutNode) && postponedRequest5.isLookahead()) {
                        postponedRequest2 = postponedRequest4;
                        break;
                    }
                    i9++;
                }
                if (postponedRequest2 != null) {
                    return true;
                }
            }
            if (layoutNode.getLookaheadMeasurePending$ui_release()) {
                if (!this.relayoutNodes.contains(layoutNode, true) && ((parent$ui_release == null || !parent$ui_release.getLookaheadMeasurePending$ui_release()) && layoutState != LayoutNode.LayoutState.LookaheadMeasuring && (parent$ui_release == null || !parent$ui_release.getMeasurePending$ui_release() || !AbstractC3292y.d(layoutNode.getLookaheadRoot$ui_release(), layoutNode)))) {
                    return false;
                }
                return true;
            }
            if (layoutNode.getLookaheadLayoutPending$ui_release() && !this.relayoutNodes.contains(layoutNode, true) && parent$ui_release != null && !parent$ui_release.getLookaheadMeasurePending$ui_release() && !parent$ui_release.getLookaheadLayoutPending$ui_release() && layoutState != LayoutNode.LayoutState.LookaheadMeasuring && layoutState != LayoutNode.LayoutState.LookaheadLayingOut && (!parent$ui_release.getLayoutPending$ui_release() || !AbstractC3292y.d(layoutNode.getLookaheadRoot$ui_release(), layoutNode))) {
                return false;
            }
            return true;
        }
        return true;
    }

    private final boolean isTreeConsistent(LayoutNode layoutNode) {
        if (!consistentLayoutState(layoutNode)) {
            return false;
        }
        List<LayoutNode> children$ui_release = layoutNode.getChildren$ui_release();
        int size = children$ui_release.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (!isTreeConsistent(children$ui_release.get(i8))) {
                return false;
            }
        }
        return true;
    }

    private final String logTree() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tree state:");
        AbstractC3292y.h(sb, "append(value)");
        sb.append('\n');
        AbstractC3292y.h(sb, "append('\\n')");
        logTree$printSubTree(this, sb, this.root, 0);
        return sb.toString();
    }

    private static final void logTree$printSubTree(LayoutTreeConsistencyChecker layoutTreeConsistencyChecker, StringBuilder sb, LayoutNode layoutNode, int i8) {
        String nodeToString = layoutTreeConsistencyChecker.nodeToString(layoutNode);
        if (nodeToString.length() > 0) {
            for (int i9 = 0; i9 < i8; i9++) {
                sb.append("..");
            }
            sb.append(nodeToString);
            AbstractC3292y.h(sb, "append(value)");
            sb.append('\n');
            AbstractC3292y.h(sb, "append('\\n')");
            i8++;
        }
        List<LayoutNode> children$ui_release = layoutNode.getChildren$ui_release();
        int size = children$ui_release.size();
        for (int i10 = 0; i10 < size; i10++) {
            logTree$printSubTree(layoutTreeConsistencyChecker, sb, children$ui_release.get(i10), i8);
        }
    }

    private final String nodeToString(LayoutNode layoutNode) {
        StringBuilder sb = new StringBuilder();
        sb.append(layoutNode);
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        sb2.append(layoutNode.getLayoutState$ui_release());
        sb2.append(']');
        sb.append(sb2.toString());
        if (!layoutNode.isPlaced()) {
            sb.append("[!isPlaced]");
        }
        sb.append("[measuredByParent=" + layoutNode.getMeasuredByParent$ui_release() + ']');
        if (!consistentLayoutState(layoutNode)) {
            sb.append("[INCONSISTENT]");
        }
        return sb.toString();
    }

    public final void assertConsistent() {
        if (!(!isTreeConsistent(this.root))) {
            return;
        }
        System.out.println((Object) logTree());
        throw new IllegalStateException("Inconsistency found!");
    }
}
