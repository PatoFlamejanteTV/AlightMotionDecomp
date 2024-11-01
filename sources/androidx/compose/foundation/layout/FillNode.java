package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import e6.AbstractC2829a;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class FillNode extends Modifier.Node implements LayoutModifierNode {
    private Direction direction;
    private float fraction;

    public FillNode(Direction direction, float f8) {
        AbstractC3292y.i(direction, "direction");
        this.direction = direction;
        this.fraction = f8;
    }

    public final Direction getDirection() {
        return this.direction;
    }

    public final float getFraction() {
        return this.fraction;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        return LayoutModifierNode.CC.a(this, intrinsicMeasureScope, intrinsicMeasurable, i8);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        return LayoutModifierNode.CC.b(this, intrinsicMeasureScope, intrinsicMeasurable, i8);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo340measure3p2s80s(MeasureScope measure, Measurable measurable, long j8) {
        int m5125getMinWidthimpl;
        int m5123getMaxWidthimpl;
        int m5122getMaxHeightimpl;
        int i8;
        AbstractC3292y.i(measure, "$this$measure");
        AbstractC3292y.i(measurable, "measurable");
        if (Constraints.m5119getHasBoundedWidthimpl(j8) && this.direction != Direction.Vertical) {
            m5125getMinWidthimpl = i6.m.k(AbstractC2829a.d(Constraints.m5123getMaxWidthimpl(j8) * this.fraction), Constraints.m5125getMinWidthimpl(j8), Constraints.m5123getMaxWidthimpl(j8));
            m5123getMaxWidthimpl = m5125getMinWidthimpl;
        } else {
            m5125getMinWidthimpl = Constraints.m5125getMinWidthimpl(j8);
            m5123getMaxWidthimpl = Constraints.m5123getMaxWidthimpl(j8);
        }
        if (Constraints.m5118getHasBoundedHeightimpl(j8) && this.direction != Direction.Horizontal) {
            i8 = i6.m.k(AbstractC2829a.d(Constraints.m5122getMaxHeightimpl(j8) * this.fraction), Constraints.m5124getMinHeightimpl(j8), Constraints.m5122getMaxHeightimpl(j8));
            m5122getMaxHeightimpl = i8;
        } else {
            int m5124getMinHeightimpl = Constraints.m5124getMinHeightimpl(j8);
            m5122getMaxHeightimpl = Constraints.m5122getMaxHeightimpl(j8);
            i8 = m5124getMinHeightimpl;
        }
        Placeable mo4108measureBRTryo0 = measurable.mo4108measureBRTryo0(ConstraintsKt.Constraints(m5125getMinWidthimpl, m5123getMaxWidthimpl, i8, m5122getMaxHeightimpl));
        return MeasureScope.CC.q(measure, mo4108measureBRTryo0.getWidth(), mo4108measureBRTryo0.getHeight(), null, new FillNode$measure$1(mo4108measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        return LayoutModifierNode.CC.c(this, intrinsicMeasureScope, intrinsicMeasurable, i8);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        return LayoutModifierNode.CC.d(this, intrinsicMeasureScope, intrinsicMeasurable, i8);
    }

    public final void setDirection(Direction direction) {
        AbstractC3292y.i(direction, "<set-?>");
        this.direction = direction;
    }

    public final void setFraction(float f8) {
        this.fraction = f8;
    }
}
