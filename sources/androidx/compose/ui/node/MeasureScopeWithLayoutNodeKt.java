package androidx.compose.ui.node;

import Q5.p;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.node.LayoutNode;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class MeasureScopeWithLayoutNodeKt {

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutNode.LayoutState.values().length];
            try {
                iArr[LayoutNode.LayoutState.LookaheadMeasuring.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutNode.LayoutState.LookaheadLayingOut.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LayoutNode.LayoutState.Idle.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final List<List<Measurable>> getChildrenOfVirtualChildren(IntrinsicMeasureScope intrinsicMeasureScope) {
        List<Measurable> childMeasurables$ui_release;
        AbstractC3292y.g(intrinsicMeasureScope, "null cannot be cast to non-null type androidx.compose.ui.node.MeasureScopeWithLayoutNode");
        LayoutNode layoutNode = ((MeasureScopeWithLayoutNode) intrinsicMeasureScope).getLayoutNode();
        boolean isInLookaheadPass = isInLookaheadPass(layoutNode);
        List<LayoutNode> foldedChildren$ui_release = layoutNode.getFoldedChildren$ui_release();
        ArrayList arrayList = new ArrayList(foldedChildren$ui_release.size());
        int size = foldedChildren$ui_release.size();
        for (int i8 = 0; i8 < size; i8++) {
            LayoutNode layoutNode2 = foldedChildren$ui_release.get(i8);
            if (isInLookaheadPass) {
                childMeasurables$ui_release = layoutNode2.getChildLookaheadMeasurables$ui_release();
            } else {
                childMeasurables$ui_release = layoutNode2.getChildMeasurables$ui_release();
            }
            arrayList.add(childMeasurables$ui_release);
        }
        return arrayList;
    }

    private static final boolean isInLookaheadPass(LayoutNode layoutNode) {
        int i8 = WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()];
        if (i8 == 1 || i8 == 2) {
            return true;
        }
        if (i8 != 3 && i8 != 4) {
            if (i8 == 5) {
                LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
                if (parent$ui_release != null) {
                    return isInLookaheadPass(parent$ui_release);
                }
                throw new IllegalArgumentException("no parent for idle node".toString());
            }
            throw new p();
        }
        return false;
    }
}
