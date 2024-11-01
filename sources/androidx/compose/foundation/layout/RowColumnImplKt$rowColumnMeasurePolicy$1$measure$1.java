package androidx.compose.foundation.layout;

import Q5.I;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class RowColumnImplKt$rowColumnMeasurePolicy$1$measure$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ RowColumnMeasureHelperResult $measureResult;
    final /* synthetic */ RowColumnMeasurementHelper $rowColumnMeasureHelper;
    final /* synthetic */ MeasureScope $this_measure;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RowColumnImplKt$rowColumnMeasurePolicy$1$measure$1(RowColumnMeasurementHelper rowColumnMeasurementHelper, RowColumnMeasureHelperResult rowColumnMeasureHelperResult, MeasureScope measureScope) {
        super(1);
        this.$rowColumnMeasureHelper = rowColumnMeasurementHelper;
        this.$measureResult = rowColumnMeasureHelperResult;
        this.$this_measure = measureScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return I.f8786a;
    }

    public final void invoke(Placeable.PlacementScope layout) {
        AbstractC3292y.i(layout, "$this$layout");
        this.$rowColumnMeasureHelper.placeHelper(layout, this.$measureResult, 0, this.$this_measure.getLayoutDirection());
    }
}
