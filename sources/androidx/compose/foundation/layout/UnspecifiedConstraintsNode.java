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
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class UnspecifiedConstraintsNode extends Modifier.Node implements LayoutModifierNode {
    private float minHeight;
    private float minWidth;

    public /* synthetic */ UnspecifiedConstraintsNode(float f8, float f9, AbstractC3284p abstractC3284p) {
        this(f8, f9);
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m643getMinHeightD9Ej5fM() {
        return this.minHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m644getMinWidthD9Ej5fM() {
        return this.minWidth;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i8) {
        int i9;
        AbstractC3292y.i(intrinsicMeasureScope, "<this>");
        AbstractC3292y.i(measurable, "measurable");
        int maxIntrinsicHeight = measurable.maxIntrinsicHeight(i8);
        if (!Dp.m5160equalsimpl0(this.minHeight, Dp.Companion.m5175getUnspecifiedD9Ej5fM())) {
            i9 = intrinsicMeasureScope.mo419roundToPx0680j_4(this.minHeight);
        } else {
            i9 = 0;
        }
        return i6.m.d(maxIntrinsicHeight, i9);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i8) {
        int i9;
        AbstractC3292y.i(intrinsicMeasureScope, "<this>");
        AbstractC3292y.i(measurable, "measurable");
        int maxIntrinsicWidth = measurable.maxIntrinsicWidth(i8);
        if (!Dp.m5160equalsimpl0(this.minWidth, Dp.Companion.m5175getUnspecifiedD9Ej5fM())) {
            i9 = intrinsicMeasureScope.mo419roundToPx0680j_4(this.minWidth);
        } else {
            i9 = 0;
        }
        return i6.m.d(maxIntrinsicWidth, i9);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo340measure3p2s80s(MeasureScope measure, Measurable measurable, long j8) {
        int m5125getMinWidthimpl;
        int m5124getMinHeightimpl;
        AbstractC3292y.i(measure, "$this$measure");
        AbstractC3292y.i(measurable, "measurable");
        float f8 = this.minWidth;
        Dp.Companion companion = Dp.Companion;
        if (!Dp.m5160equalsimpl0(f8, companion.m5175getUnspecifiedD9Ej5fM()) && Constraints.m5125getMinWidthimpl(j8) == 0) {
            m5125getMinWidthimpl = i6.m.d(i6.m.g(measure.mo419roundToPx0680j_4(this.minWidth), Constraints.m5123getMaxWidthimpl(j8)), 0);
        } else {
            m5125getMinWidthimpl = Constraints.m5125getMinWidthimpl(j8);
        }
        int m5123getMaxWidthimpl = Constraints.m5123getMaxWidthimpl(j8);
        if (!Dp.m5160equalsimpl0(this.minHeight, companion.m5175getUnspecifiedD9Ej5fM()) && Constraints.m5124getMinHeightimpl(j8) == 0) {
            m5124getMinHeightimpl = i6.m.d(i6.m.g(measure.mo419roundToPx0680j_4(this.minHeight), Constraints.m5122getMaxHeightimpl(j8)), 0);
        } else {
            m5124getMinHeightimpl = Constraints.m5124getMinHeightimpl(j8);
        }
        Placeable mo4108measureBRTryo0 = measurable.mo4108measureBRTryo0(ConstraintsKt.Constraints(m5125getMinWidthimpl, m5123getMaxWidthimpl, m5124getMinHeightimpl, Constraints.m5122getMaxHeightimpl(j8)));
        return MeasureScope.CC.q(measure, mo4108measureBRTryo0.getWidth(), mo4108measureBRTryo0.getHeight(), null, new UnspecifiedConstraintsNode$measure$1(mo4108measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i8) {
        int i9;
        AbstractC3292y.i(intrinsicMeasureScope, "<this>");
        AbstractC3292y.i(measurable, "measurable");
        int minIntrinsicHeight = measurable.minIntrinsicHeight(i8);
        if (!Dp.m5160equalsimpl0(this.minHeight, Dp.Companion.m5175getUnspecifiedD9Ej5fM())) {
            i9 = intrinsicMeasureScope.mo419roundToPx0680j_4(this.minHeight);
        } else {
            i9 = 0;
        }
        return i6.m.d(minIntrinsicHeight, i9);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i8) {
        int i9;
        AbstractC3292y.i(intrinsicMeasureScope, "<this>");
        AbstractC3292y.i(measurable, "measurable");
        int minIntrinsicWidth = measurable.minIntrinsicWidth(i8);
        if (!Dp.m5160equalsimpl0(this.minWidth, Dp.Companion.m5175getUnspecifiedD9Ej5fM())) {
            i9 = intrinsicMeasureScope.mo419roundToPx0680j_4(this.minWidth);
        } else {
            i9 = 0;
        }
        return i6.m.d(minIntrinsicWidth, i9);
    }

    /* renamed from: setMinHeight-0680j_4, reason: not valid java name */
    public final void m645setMinHeight0680j_4(float f8) {
        this.minHeight = f8;
    }

    /* renamed from: setMinWidth-0680j_4, reason: not valid java name */
    public final void m646setMinWidth0680j_4(float f8) {
        this.minWidth = f8;
    }

    public /* synthetic */ UnspecifiedConstraintsNode(float f8, float f9, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? Dp.Companion.m5175getUnspecifiedD9Ej5fM() : f8, (i8 & 2) != 0 ? Dp.Companion.m5175getUnspecifiedD9Ej5fM() : f9, null);
    }

    private UnspecifiedConstraintsNode(float f8, float f9) {
        this.minWidth = f8;
        this.minHeight = f9;
    }
}
