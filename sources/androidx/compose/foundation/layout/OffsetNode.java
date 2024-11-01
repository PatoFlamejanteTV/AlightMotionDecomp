package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class OffsetNode extends Modifier.Node implements LayoutModifierNode {
    private boolean rtlAware;

    /* renamed from: x, reason: collision with root package name */
    private float f14405x;

    /* renamed from: y, reason: collision with root package name */
    private float f14406y;

    public /* synthetic */ OffsetNode(float f8, float f9, boolean z8, AbstractC3284p abstractC3284p) {
        this(f8, f9, z8);
    }

    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    /* renamed from: getX-D9Ej5fM, reason: not valid java name */
    public final float m539getXD9Ej5fM() {
        return this.f14405x;
    }

    /* renamed from: getY-D9Ej5fM, reason: not valid java name */
    public final float m540getYD9Ej5fM() {
        return this.f14406y;
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
        Placeable mo4108measureBRTryo0 = measurable.mo4108measureBRTryo0(j8);
        return MeasureScope.CC.q(measure, mo4108measureBRTryo0.getWidth(), mo4108measureBRTryo0.getHeight(), null, new OffsetNode$measure$1(this, mo4108measureBRTryo0, measure), 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        return LayoutModifierNode.CC.c(this, intrinsicMeasureScope, intrinsicMeasurable, i8);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        return LayoutModifierNode.CC.d(this, intrinsicMeasureScope, intrinsicMeasurable, i8);
    }

    public final void setRtlAware(boolean z8) {
        this.rtlAware = z8;
    }

    /* renamed from: setX-0680j_4, reason: not valid java name */
    public final void m541setX0680j_4(float f8) {
        this.f14405x = f8;
    }

    /* renamed from: setY-0680j_4, reason: not valid java name */
    public final void m542setY0680j_4(float f8) {
        this.f14406y = f8;
    }

    private OffsetNode(float f8, float f9, boolean z8) {
        this.f14405x = f8;
        this.f14406y = f9;
        this.rtlAware = z8;
    }
}
