package androidx.compose.ui.node;

import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.unit.IntOffset;

/* loaded from: classes.dex */
public final class LayoutModifierNodeCoordinatorKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int calculateAlignmentAndPlaceChildAsNeeded(LookaheadCapablePlaceable lookaheadCapablePlaceable, AlignmentLine alignmentLine) {
        int m5279getXimpl;
        LookaheadCapablePlaceable child = lookaheadCapablePlaceable.getChild();
        if (child != null) {
            if (lookaheadCapablePlaceable.getMeasureResult$ui_release().getAlignmentLines().containsKey(alignmentLine)) {
                Integer num = lookaheadCapablePlaceable.getMeasureResult$ui_release().getAlignmentLines().get(alignmentLine);
                if (num == null) {
                    return Integer.MIN_VALUE;
                }
                return num.intValue();
            }
            int i8 = child.get(alignmentLine);
            if (i8 == Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            child.setShallowPlacing$ui_release(true);
            lookaheadCapablePlaceable.setPlacingForAlignment$ui_release(true);
            lookaheadCapablePlaceable.replace$ui_release();
            child.setShallowPlacing$ui_release(false);
            lookaheadCapablePlaceable.setPlacingForAlignment$ui_release(false);
            if (alignmentLine instanceof HorizontalAlignmentLine) {
                m5279getXimpl = IntOffset.m5280getYimpl(child.mo4261getPositionnOccac());
            } else {
                m5279getXimpl = IntOffset.m5279getXimpl(child.mo4261getPositionnOccac());
            }
            return i8 + m5279getXimpl;
        }
        throw new IllegalStateException(("Child of " + lookaheadCapablePlaceable + " cannot be null when calculating alignment line").toString());
    }
}
