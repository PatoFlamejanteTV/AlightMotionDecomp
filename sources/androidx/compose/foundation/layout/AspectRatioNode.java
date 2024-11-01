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
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import e6.AbstractC2829a;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
final class AspectRatioNode extends Modifier.Node implements LayoutModifierNode {
    private float aspectRatio;
    private boolean matchHeightConstraintsFirst;

    public AspectRatioNode(float f8, boolean z8) {
        this.aspectRatio = f8;
        this.matchHeightConstraintsFirst = z8;
    }

    /* renamed from: findSize-ToXhtMw, reason: not valid java name */
    private final long m505findSizeToXhtMw(long j8) {
        if (!this.matchHeightConstraintsFirst) {
            long m509tryMaxWidthJN0ABg$default = m509tryMaxWidthJN0ABg$default(this, j8, false, 1, null);
            IntSize.Companion companion = IntSize.Companion;
            if (!IntSize.m5319equalsimpl0(m509tryMaxWidthJN0ABg$default, companion.m5326getZeroYbymL2g())) {
                return m509tryMaxWidthJN0ABg$default;
            }
            long m507tryMaxHeightJN0ABg$default = m507tryMaxHeightJN0ABg$default(this, j8, false, 1, null);
            if (!IntSize.m5319equalsimpl0(m507tryMaxHeightJN0ABg$default, companion.m5326getZeroYbymL2g())) {
                return m507tryMaxHeightJN0ABg$default;
            }
            long m513tryMinWidthJN0ABg$default = m513tryMinWidthJN0ABg$default(this, j8, false, 1, null);
            if (!IntSize.m5319equalsimpl0(m513tryMinWidthJN0ABg$default, companion.m5326getZeroYbymL2g())) {
                return m513tryMinWidthJN0ABg$default;
            }
            long m511tryMinHeightJN0ABg$default = m511tryMinHeightJN0ABg$default(this, j8, false, 1, null);
            if (!IntSize.m5319equalsimpl0(m511tryMinHeightJN0ABg$default, companion.m5326getZeroYbymL2g())) {
                return m511tryMinHeightJN0ABg$default;
            }
            long m508tryMaxWidthJN0ABg = m508tryMaxWidthJN0ABg(j8, false);
            if (!IntSize.m5319equalsimpl0(m508tryMaxWidthJN0ABg, companion.m5326getZeroYbymL2g())) {
                return m508tryMaxWidthJN0ABg;
            }
            long m506tryMaxHeightJN0ABg = m506tryMaxHeightJN0ABg(j8, false);
            if (!IntSize.m5319equalsimpl0(m506tryMaxHeightJN0ABg, companion.m5326getZeroYbymL2g())) {
                return m506tryMaxHeightJN0ABg;
            }
            long m512tryMinWidthJN0ABg = m512tryMinWidthJN0ABg(j8, false);
            if (!IntSize.m5319equalsimpl0(m512tryMinWidthJN0ABg, companion.m5326getZeroYbymL2g())) {
                return m512tryMinWidthJN0ABg;
            }
            long m510tryMinHeightJN0ABg = m510tryMinHeightJN0ABg(j8, false);
            if (!IntSize.m5319equalsimpl0(m510tryMinHeightJN0ABg, companion.m5326getZeroYbymL2g())) {
                return m510tryMinHeightJN0ABg;
            }
        } else {
            long m507tryMaxHeightJN0ABg$default2 = m507tryMaxHeightJN0ABg$default(this, j8, false, 1, null);
            IntSize.Companion companion2 = IntSize.Companion;
            if (!IntSize.m5319equalsimpl0(m507tryMaxHeightJN0ABg$default2, companion2.m5326getZeroYbymL2g())) {
                return m507tryMaxHeightJN0ABg$default2;
            }
            long m509tryMaxWidthJN0ABg$default2 = m509tryMaxWidthJN0ABg$default(this, j8, false, 1, null);
            if (!IntSize.m5319equalsimpl0(m509tryMaxWidthJN0ABg$default2, companion2.m5326getZeroYbymL2g())) {
                return m509tryMaxWidthJN0ABg$default2;
            }
            long m511tryMinHeightJN0ABg$default2 = m511tryMinHeightJN0ABg$default(this, j8, false, 1, null);
            if (!IntSize.m5319equalsimpl0(m511tryMinHeightJN0ABg$default2, companion2.m5326getZeroYbymL2g())) {
                return m511tryMinHeightJN0ABg$default2;
            }
            long m513tryMinWidthJN0ABg$default2 = m513tryMinWidthJN0ABg$default(this, j8, false, 1, null);
            if (!IntSize.m5319equalsimpl0(m513tryMinWidthJN0ABg$default2, companion2.m5326getZeroYbymL2g())) {
                return m513tryMinWidthJN0ABg$default2;
            }
            long m506tryMaxHeightJN0ABg2 = m506tryMaxHeightJN0ABg(j8, false);
            if (!IntSize.m5319equalsimpl0(m506tryMaxHeightJN0ABg2, companion2.m5326getZeroYbymL2g())) {
                return m506tryMaxHeightJN0ABg2;
            }
            long m508tryMaxWidthJN0ABg2 = m508tryMaxWidthJN0ABg(j8, false);
            if (!IntSize.m5319equalsimpl0(m508tryMaxWidthJN0ABg2, companion2.m5326getZeroYbymL2g())) {
                return m508tryMaxWidthJN0ABg2;
            }
            long m510tryMinHeightJN0ABg2 = m510tryMinHeightJN0ABg(j8, false);
            if (!IntSize.m5319equalsimpl0(m510tryMinHeightJN0ABg2, companion2.m5326getZeroYbymL2g())) {
                return m510tryMinHeightJN0ABg2;
            }
            long m512tryMinWidthJN0ABg2 = m512tryMinWidthJN0ABg(j8, false);
            if (!IntSize.m5319equalsimpl0(m512tryMinWidthJN0ABg2, companion2.m5326getZeroYbymL2g())) {
                return m512tryMinWidthJN0ABg2;
            }
        }
        return IntSize.Companion.m5326getZeroYbymL2g();
    }

    /* renamed from: tryMaxHeight-JN-0ABg, reason: not valid java name */
    private final long m506tryMaxHeightJN0ABg(long j8, boolean z8) {
        int d8;
        int m5122getMaxHeightimpl = Constraints.m5122getMaxHeightimpl(j8);
        if (m5122getMaxHeightimpl != Integer.MAX_VALUE && (d8 = AbstractC2829a.d(m5122getMaxHeightimpl * this.aspectRatio)) > 0) {
            long IntSize = IntSizeKt.IntSize(d8, m5122getMaxHeightimpl);
            if (!z8 || ConstraintsKt.m5138isSatisfiedBy4WqzIAM(j8, IntSize)) {
                return IntSize;
            }
        }
        return IntSize.Companion.m5326getZeroYbymL2g();
    }

    /* renamed from: tryMaxHeight-JN-0ABg$default, reason: not valid java name */
    static /* synthetic */ long m507tryMaxHeightJN0ABg$default(AspectRatioNode aspectRatioNode, long j8, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = true;
        }
        return aspectRatioNode.m506tryMaxHeightJN0ABg(j8, z8);
    }

    /* renamed from: tryMaxWidth-JN-0ABg, reason: not valid java name */
    private final long m508tryMaxWidthJN0ABg(long j8, boolean z8) {
        int d8;
        int m5123getMaxWidthimpl = Constraints.m5123getMaxWidthimpl(j8);
        if (m5123getMaxWidthimpl != Integer.MAX_VALUE && (d8 = AbstractC2829a.d(m5123getMaxWidthimpl / this.aspectRatio)) > 0) {
            long IntSize = IntSizeKt.IntSize(m5123getMaxWidthimpl, d8);
            if (!z8 || ConstraintsKt.m5138isSatisfiedBy4WqzIAM(j8, IntSize)) {
                return IntSize;
            }
        }
        return IntSize.Companion.m5326getZeroYbymL2g();
    }

    /* renamed from: tryMaxWidth-JN-0ABg$default, reason: not valid java name */
    static /* synthetic */ long m509tryMaxWidthJN0ABg$default(AspectRatioNode aspectRatioNode, long j8, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = true;
        }
        return aspectRatioNode.m508tryMaxWidthJN0ABg(j8, z8);
    }

    /* renamed from: tryMinHeight-JN-0ABg, reason: not valid java name */
    private final long m510tryMinHeightJN0ABg(long j8, boolean z8) {
        int m5124getMinHeightimpl = Constraints.m5124getMinHeightimpl(j8);
        int d8 = AbstractC2829a.d(m5124getMinHeightimpl * this.aspectRatio);
        if (d8 > 0) {
            long IntSize = IntSizeKt.IntSize(d8, m5124getMinHeightimpl);
            if (!z8 || ConstraintsKt.m5138isSatisfiedBy4WqzIAM(j8, IntSize)) {
                return IntSize;
            }
        }
        return IntSize.Companion.m5326getZeroYbymL2g();
    }

    /* renamed from: tryMinHeight-JN-0ABg$default, reason: not valid java name */
    static /* synthetic */ long m511tryMinHeightJN0ABg$default(AspectRatioNode aspectRatioNode, long j8, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = true;
        }
        return aspectRatioNode.m510tryMinHeightJN0ABg(j8, z8);
    }

    /* renamed from: tryMinWidth-JN-0ABg, reason: not valid java name */
    private final long m512tryMinWidthJN0ABg(long j8, boolean z8) {
        int m5125getMinWidthimpl = Constraints.m5125getMinWidthimpl(j8);
        int d8 = AbstractC2829a.d(m5125getMinWidthimpl / this.aspectRatio);
        if (d8 > 0) {
            long IntSize = IntSizeKt.IntSize(m5125getMinWidthimpl, d8);
            if (!z8 || ConstraintsKt.m5138isSatisfiedBy4WqzIAM(j8, IntSize)) {
                return IntSize;
            }
        }
        return IntSize.Companion.m5326getZeroYbymL2g();
    }

    /* renamed from: tryMinWidth-JN-0ABg$default, reason: not valid java name */
    static /* synthetic */ long m513tryMinWidthJN0ABg$default(AspectRatioNode aspectRatioNode, long j8, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = true;
        }
        return aspectRatioNode.m512tryMinWidthJN0ABg(j8, z8);
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    public final boolean getMatchHeightConstraintsFirst() {
        return this.matchHeightConstraintsFirst;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i8) {
        AbstractC3292y.i(intrinsicMeasureScope, "<this>");
        AbstractC3292y.i(measurable, "measurable");
        if (i8 != Integer.MAX_VALUE) {
            return AbstractC2829a.d(i8 / this.aspectRatio);
        }
        return measurable.maxIntrinsicHeight(i8);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i8) {
        AbstractC3292y.i(intrinsicMeasureScope, "<this>");
        AbstractC3292y.i(measurable, "measurable");
        if (i8 != Integer.MAX_VALUE) {
            return AbstractC2829a.d(i8 * this.aspectRatio);
        }
        return measurable.maxIntrinsicWidth(i8);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo340measure3p2s80s(MeasureScope measure, Measurable measurable, long j8) {
        AbstractC3292y.i(measure, "$this$measure");
        AbstractC3292y.i(measurable, "measurable");
        long m505findSizeToXhtMw = m505findSizeToXhtMw(j8);
        if (!IntSize.m5319equalsimpl0(m505findSizeToXhtMw, IntSize.Companion.m5326getZeroYbymL2g())) {
            j8 = Constraints.Companion.m5131fixedJhjzzOo(IntSize.m5321getWidthimpl(m505findSizeToXhtMw), IntSize.m5320getHeightimpl(m505findSizeToXhtMw));
        }
        Placeable mo4108measureBRTryo0 = measurable.mo4108measureBRTryo0(j8);
        return MeasureScope.CC.q(measure, mo4108measureBRTryo0.getWidth(), mo4108measureBRTryo0.getHeight(), null, new AspectRatioNode$measure$1(mo4108measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i8) {
        AbstractC3292y.i(intrinsicMeasureScope, "<this>");
        AbstractC3292y.i(measurable, "measurable");
        if (i8 != Integer.MAX_VALUE) {
            return AbstractC2829a.d(i8 / this.aspectRatio);
        }
        return measurable.minIntrinsicHeight(i8);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i8) {
        AbstractC3292y.i(intrinsicMeasureScope, "<this>");
        AbstractC3292y.i(measurable, "measurable");
        if (i8 != Integer.MAX_VALUE) {
            return AbstractC2829a.d(i8 * this.aspectRatio);
        }
        return measurable.minIntrinsicWidth(i8);
    }

    public final void setAspectRatio(float f8) {
        this.aspectRatio = f8;
    }

    public final void setMatchHeightConstraintsFirst(boolean z8) {
        this.matchHeightConstraintsFirst = z8;
    }
}
