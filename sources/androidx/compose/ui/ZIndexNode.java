package androidx.compose.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class ZIndexNode extends Modifier.Node implements LayoutModifierNode {
    public static final int $stable = 8;
    private float zIndex;

    public ZIndexNode(float f8) {
        this.zIndex = f8;
    }

    public final float getZIndex() {
        return this.zIndex;
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
    public MeasureResult mo340measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j8) {
        Placeable mo4108measureBRTryo0 = measurable.mo4108measureBRTryo0(j8);
        return MeasureScope.CC.q(measureScope, mo4108measureBRTryo0.getWidth(), mo4108measureBRTryo0.getHeight(), null, new ZIndexNode$measure$1(mo4108measureBRTryo0, this), 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        return LayoutModifierNode.CC.c(this, intrinsicMeasureScope, intrinsicMeasurable, i8);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        return LayoutModifierNode.CC.d(this, intrinsicMeasureScope, intrinsicMeasurable, i8);
    }

    public final void setZIndex(float f8) {
        this.zIndex = f8;
    }

    public String toString() {
        return "ZIndexModifier(zIndex=" + this.zIndex + ')';
    }
}
