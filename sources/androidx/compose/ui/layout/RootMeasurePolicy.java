package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.ArrayList;
import java.util.List;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class RootMeasurePolicy extends LayoutNode.NoIntrinsicsMeasurePolicy {
    public static final int $stable = 0;
    public static final RootMeasurePolicy INSTANCE = new RootMeasurePolicy();

    private RootMeasurePolicy() {
        super("Undefined intrinsics block and it is required");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo109measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j8) {
        if (list.isEmpty()) {
            return MeasureScope.CC.q(measureScope, Constraints.m5125getMinWidthimpl(j8), Constraints.m5124getMinHeightimpl(j8), null, RootMeasurePolicy$measure$1.INSTANCE, 4, null);
        }
        if (list.size() == 1) {
            Placeable mo4108measureBRTryo0 = list.get(0).mo4108measureBRTryo0(j8);
            return MeasureScope.CC.q(measureScope, ConstraintsKt.m5137constrainWidthK40F9xA(j8, mo4108measureBRTryo0.getWidth()), ConstraintsKt.m5136constrainHeightK40F9xA(j8, mo4108measureBRTryo0.getHeight()), null, new RootMeasurePolicy$measure$2(mo4108measureBRTryo0), 4, null);
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.add(list.get(i8).mo4108measureBRTryo0(j8));
        }
        int size2 = arrayList.size();
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < size2; i11++) {
            Placeable placeable = (Placeable) arrayList.get(i11);
            i9 = Math.max(placeable.getWidth(), i9);
            i10 = Math.max(placeable.getHeight(), i10);
        }
        return MeasureScope.CC.q(measureScope, ConstraintsKt.m5137constrainWidthK40F9xA(j8, i9), ConstraintsKt.m5136constrainHeightK40F9xA(j8, i10), null, new RootMeasurePolicy$measure$4(arrayList), 4, null);
    }
}
