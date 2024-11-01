package androidx.compose.foundation.text;

import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.g;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
final class EmptyMeasurePolicy implements MeasurePolicy {
    public static final EmptyMeasurePolicy INSTANCE = new EmptyMeasurePolicy();
    private static final Function1 placementBlock = EmptyMeasurePolicy$placementBlock$1.INSTANCE;

    private EmptyMeasurePolicy() {
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
        return g.a(this, intrinsicMeasureScope, list, i8);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
        return g.b(this, intrinsicMeasureScope, list, i8);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo109measure3p2s80s(MeasureScope measure, List<? extends Measurable> measurables, long j8) {
        AbstractC3292y.i(measure, "$this$measure");
        AbstractC3292y.i(measurables, "measurables");
        return MeasureScope.CC.q(measure, Constraints.m5123getMaxWidthimpl(j8), Constraints.m5122getMaxHeightimpl(j8), null, placementBlock, 4, null);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
        return g.c(this, intrinsicMeasureScope, list, i8);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
        return g.d(this, intrinsicMeasureScope, list, i8);
    }
}
