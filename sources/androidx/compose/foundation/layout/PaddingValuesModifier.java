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
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class PaddingValuesModifier extends Modifier.Node implements LayoutModifierNode {
    private PaddingValues paddingValues;

    public PaddingValuesModifier(PaddingValues paddingValues) {
        AbstractC3292y.i(paddingValues, "paddingValues");
        this.paddingValues = paddingValues;
    }

    public final PaddingValues getPaddingValues() {
        return this.paddingValues;
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
        float f8 = 0;
        if (Dp.m5154compareTo0680j_4(this.paddingValues.mo528calculateLeftPaddingu2uoSUM(measure.getLayoutDirection()), Dp.m5155constructorimpl(f8)) >= 0 && Dp.m5154compareTo0680j_4(this.paddingValues.mo530calculateTopPaddingD9Ej5fM(), Dp.m5155constructorimpl(f8)) >= 0 && Dp.m5154compareTo0680j_4(this.paddingValues.mo529calculateRightPaddingu2uoSUM(measure.getLayoutDirection()), Dp.m5155constructorimpl(f8)) >= 0 && Dp.m5154compareTo0680j_4(this.paddingValues.mo527calculateBottomPaddingD9Ej5fM(), Dp.m5155constructorimpl(f8)) >= 0) {
            int mo419roundToPx0680j_4 = measure.mo419roundToPx0680j_4(this.paddingValues.mo528calculateLeftPaddingu2uoSUM(measure.getLayoutDirection())) + measure.mo419roundToPx0680j_4(this.paddingValues.mo529calculateRightPaddingu2uoSUM(measure.getLayoutDirection()));
            int mo419roundToPx0680j_42 = measure.mo419roundToPx0680j_4(this.paddingValues.mo530calculateTopPaddingD9Ej5fM()) + measure.mo419roundToPx0680j_4(this.paddingValues.mo527calculateBottomPaddingD9Ej5fM());
            Placeable mo4108measureBRTryo0 = measurable.mo4108measureBRTryo0(ConstraintsKt.m5139offsetNN6EwU(j8, -mo419roundToPx0680j_4, -mo419roundToPx0680j_42));
            return MeasureScope.CC.q(measure, ConstraintsKt.m5137constrainWidthK40F9xA(j8, mo4108measureBRTryo0.getWidth() + mo419roundToPx0680j_4), ConstraintsKt.m5136constrainHeightK40F9xA(j8, mo4108measureBRTryo0.getHeight() + mo419roundToPx0680j_42), null, new PaddingValuesModifier$measure$2(mo4108measureBRTryo0, measure, this), 4, null);
        }
        throw new IllegalArgumentException("Padding must be non-negative".toString());
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        return LayoutModifierNode.CC.c(this, intrinsicMeasureScope, intrinsicMeasurable, i8);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        return LayoutModifierNode.CC.d(this, intrinsicMeasureScope, intrinsicMeasurable, i8);
    }

    public final void setPaddingValues(PaddingValues paddingValues) {
        AbstractC3292y.i(paddingValues, "<set-?>");
        this.paddingValues = paddingValues;
    }
}
