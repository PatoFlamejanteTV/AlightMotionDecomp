package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.LayoutModifierNode;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AlignmentLineOffsetDpNode extends Modifier.Node implements LayoutModifierNode {
    private float after;
    private AlignmentLine alignmentLine;
    private float before;

    public /* synthetic */ AlignmentLineOffsetDpNode(AlignmentLine alignmentLine, float f8, float f9, AbstractC3284p abstractC3284p) {
        this(alignmentLine, f8, f9);
    }

    /* renamed from: getAfter-D9Ej5fM, reason: not valid java name */
    public final float m471getAfterD9Ej5fM() {
        return this.after;
    }

    public final AlignmentLine getAlignmentLine() {
        return this.alignmentLine;
    }

    /* renamed from: getBefore-D9Ej5fM, reason: not valid java name */
    public final float m472getBeforeD9Ej5fM() {
        return this.before;
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
        MeasureResult m460alignmentLineOffsetMeasuretjqqzMA;
        AbstractC3292y.i(measure, "$this$measure");
        AbstractC3292y.i(measurable, "measurable");
        m460alignmentLineOffsetMeasuretjqqzMA = AlignmentLineKt.m460alignmentLineOffsetMeasuretjqqzMA(measure, this.alignmentLine, this.before, this.after, measurable, j8);
        return m460alignmentLineOffsetMeasuretjqqzMA;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        return LayoutModifierNode.CC.c(this, intrinsicMeasureScope, intrinsicMeasurable, i8);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        return LayoutModifierNode.CC.d(this, intrinsicMeasureScope, intrinsicMeasurable, i8);
    }

    /* renamed from: setAfter-0680j_4, reason: not valid java name */
    public final void m473setAfter0680j_4(float f8) {
        this.after = f8;
    }

    public final void setAlignmentLine(AlignmentLine alignmentLine) {
        AbstractC3292y.i(alignmentLine, "<set-?>");
        this.alignmentLine = alignmentLine;
    }

    /* renamed from: setBefore-0680j_4, reason: not valid java name */
    public final void m474setBefore0680j_4(float f8) {
        this.before = f8;
    }

    private AlignmentLineOffsetDpNode(AlignmentLine alignmentLine, float f8, float f9) {
        AbstractC3292y.i(alignmentLine, "alignmentLine");
        this.alignmentLine = alignmentLine;
        this.before = f8;
        this.after = f9;
    }
}
