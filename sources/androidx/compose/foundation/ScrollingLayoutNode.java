package androidx.compose.foundation;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import i6.m;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ScrollingLayoutNode extends Modifier.Node implements LayoutModifierNode {
    private boolean isReversed;
    private boolean isVertical;
    private ScrollState scrollerState;

    public ScrollingLayoutNode(ScrollState scrollerState, boolean z8, boolean z9) {
        AbstractC3292y.i(scrollerState, "scrollerState");
        this.scrollerState = scrollerState;
        this.isReversed = z8;
        this.isVertical = z9;
    }

    public final ScrollState getScrollerState() {
        return this.scrollerState;
    }

    public final boolean isReversed() {
        return this.isReversed;
    }

    public final boolean isVertical() {
        return this.isVertical;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i8) {
        AbstractC3292y.i(intrinsicMeasureScope, "<this>");
        AbstractC3292y.i(measurable, "measurable");
        if (this.isVertical) {
            return measurable.maxIntrinsicHeight(i8);
        }
        return measurable.maxIntrinsicHeight(Integer.MAX_VALUE);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i8) {
        AbstractC3292y.i(intrinsicMeasureScope, "<this>");
        AbstractC3292y.i(measurable, "measurable");
        if (this.isVertical) {
            return measurable.maxIntrinsicWidth(Integer.MAX_VALUE);
        }
        return measurable.maxIntrinsicWidth(i8);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo340measure3p2s80s(MeasureScope measure, Measurable measurable, long j8) {
        Orientation orientation;
        int m5122getMaxHeightimpl;
        int i8;
        int i9;
        AbstractC3292y.i(measure, "$this$measure");
        AbstractC3292y.i(measurable, "measurable");
        if (this.isVertical) {
            orientation = Orientation.Vertical;
        } else {
            orientation = Orientation.Horizontal;
        }
        CheckScrollableContainerConstraintsKt.m287checkScrollableContainerConstraintsK40F9xA(j8, orientation);
        if (this.isVertical) {
            m5122getMaxHeightimpl = Integer.MAX_VALUE;
        } else {
            m5122getMaxHeightimpl = Constraints.m5122getMaxHeightimpl(j8);
        }
        if (this.isVertical) {
            i8 = Constraints.m5123getMaxWidthimpl(j8);
        } else {
            i8 = Integer.MAX_VALUE;
        }
        Placeable mo4108measureBRTryo0 = measurable.mo4108measureBRTryo0(Constraints.m5114copyZbe2FdA$default(j8, 0, i8, 0, m5122getMaxHeightimpl, 5, null));
        int g8 = m.g(mo4108measureBRTryo0.getWidth(), Constraints.m5123getMaxWidthimpl(j8));
        int g9 = m.g(mo4108measureBRTryo0.getHeight(), Constraints.m5122getMaxHeightimpl(j8));
        int height = mo4108measureBRTryo0.getHeight() - g9;
        int width = mo4108measureBRTryo0.getWidth() - g8;
        if (!this.isVertical) {
            height = width;
        }
        this.scrollerState.setMaxValue$foundation_release(height);
        ScrollState scrollState = this.scrollerState;
        if (this.isVertical) {
            i9 = g9;
        } else {
            i9 = g8;
        }
        scrollState.setViewportSize$foundation_release(i9);
        return MeasureScope.CC.q(measure, g8, g9, null, new ScrollingLayoutNode$measure$1(this, height, mo4108measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i8) {
        AbstractC3292y.i(intrinsicMeasureScope, "<this>");
        AbstractC3292y.i(measurable, "measurable");
        if (this.isVertical) {
            return measurable.minIntrinsicHeight(i8);
        }
        return measurable.minIntrinsicHeight(Integer.MAX_VALUE);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i8) {
        AbstractC3292y.i(intrinsicMeasureScope, "<this>");
        AbstractC3292y.i(measurable, "measurable");
        if (this.isVertical) {
            return measurable.minIntrinsicWidth(Integer.MAX_VALUE);
        }
        return measurable.minIntrinsicWidth(i8);
    }

    public final void setReversed(boolean z8) {
        this.isReversed = z8;
    }

    public final void setScrollerState(ScrollState scrollState) {
        AbstractC3292y.i(scrollState, "<set-?>");
        this.scrollerState = scrollState;
    }

    public final void setVertical(boolean z8) {
        this.isVertical = z8;
    }
}
