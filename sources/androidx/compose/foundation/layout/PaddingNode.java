package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class PaddingNode extends Modifier.Node implements LayoutModifierNode {
    private float bottom;
    private float end;
    private boolean rtlAware;
    private float start;
    private float top;

    public /* synthetic */ PaddingNode(float f8, float f9, float f10, float f11, boolean z8, AbstractC3284p abstractC3284p) {
        this(f8, f9, f10, f11, z8);
    }

    /* renamed from: getBottom-D9Ej5fM, reason: not valid java name */
    public final float m582getBottomD9Ej5fM() {
        return this.bottom;
    }

    /* renamed from: getEnd-D9Ej5fM, reason: not valid java name */
    public final float m583getEndD9Ej5fM() {
        return this.end;
    }

    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    /* renamed from: getStart-D9Ej5fM, reason: not valid java name */
    public final float m584getStartD9Ej5fM() {
        return this.start;
    }

    /* renamed from: getTop-D9Ej5fM, reason: not valid java name */
    public final float m585getTopD9Ej5fM() {
        return this.top;
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
        AbstractC3292y.i(measure, "$this$measure");
        AbstractC3292y.i(measurable, "measurable");
        int mo419roundToPx0680j_4 = measure.mo419roundToPx0680j_4(this.start) + measure.mo419roundToPx0680j_4(this.end);
        int mo419roundToPx0680j_42 = measure.mo419roundToPx0680j_4(this.top) + measure.mo419roundToPx0680j_4(this.bottom);
        Placeable mo4108measureBRTryo0 = measurable.mo4108measureBRTryo0(ConstraintsKt.m5139offsetNN6EwU(j8, -mo419roundToPx0680j_4, -mo419roundToPx0680j_42));
        return MeasureScope.CC.q(measure, ConstraintsKt.m5137constrainWidthK40F9xA(j8, mo4108measureBRTryo0.getWidth() + mo419roundToPx0680j_4), ConstraintsKt.m5136constrainHeightK40F9xA(j8, mo4108measureBRTryo0.getHeight() + mo419roundToPx0680j_42), null, new PaddingNode$measure$1(this, mo4108measureBRTryo0, measure), 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        return LayoutModifierNode.CC.c(this, intrinsicMeasureScope, intrinsicMeasurable, i8);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        return LayoutModifierNode.CC.d(this, intrinsicMeasureScope, intrinsicMeasurable, i8);
    }

    /* renamed from: setBottom-0680j_4, reason: not valid java name */
    public final void m586setBottom0680j_4(float f8) {
        this.bottom = f8;
    }

    /* renamed from: setEnd-0680j_4, reason: not valid java name */
    public final void m587setEnd0680j_4(float f8) {
        this.end = f8;
    }

    public final void setRtlAware(boolean z8) {
        this.rtlAware = z8;
    }

    /* renamed from: setStart-0680j_4, reason: not valid java name */
    public final void m588setStart0680j_4(float f8) {
        this.start = f8;
    }

    /* renamed from: setTop-0680j_4, reason: not valid java name */
    public final void m589setTop0680j_4(float f8) {
        this.top = f8;
    }

    private PaddingNode(float f8, float f9, float f10, float f11, boolean z8) {
        this.start = f8;
        this.top = f9;
        this.end = f10;
        this.bottom = f11;
        this.rtlAware = z8;
    }

    public /* synthetic */ PaddingNode(float f8, float f9, float f10, float f11, boolean z8, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? Dp.m5155constructorimpl(0) : f8, (i8 & 2) != 0 ? Dp.m5155constructorimpl(0) : f9, (i8 & 4) != 0 ? Dp.m5155constructorimpl(0) : f10, (i8 & 8) != 0 ? Dp.m5155constructorimpl(0) : f11, z8, null);
    }
}
