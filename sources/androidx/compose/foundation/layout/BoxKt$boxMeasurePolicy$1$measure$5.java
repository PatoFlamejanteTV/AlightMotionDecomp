package androidx.compose.foundation.layout;

import Q5.I;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.Q;

/* loaded from: classes.dex */
final class BoxKt$boxMeasurePolicy$1$measure$5 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Alignment $alignment;
    final /* synthetic */ Q $boxHeight;
    final /* synthetic */ Q $boxWidth;
    final /* synthetic */ List<Measurable> $measurables;
    final /* synthetic */ Placeable[] $placeables;
    final /* synthetic */ MeasureScope $this_MeasurePolicy;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BoxKt$boxMeasurePolicy$1$measure$5(Placeable[] placeableArr, List<? extends Measurable> list, MeasureScope measureScope, Q q8, Q q9, Alignment alignment) {
        super(1);
        this.$placeables = placeableArr;
        this.$measurables = list;
        this.$this_MeasurePolicy = measureScope;
        this.$boxWidth = q8;
        this.$boxHeight = q9;
        this.$alignment = alignment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return I.f8786a;
    }

    public final void invoke(Placeable.PlacementScope layout) {
        AbstractC3292y.i(layout, "$this$layout");
        Placeable[] placeableArr = this.$placeables;
        List<Measurable> list = this.$measurables;
        MeasureScope measureScope = this.$this_MeasurePolicy;
        Q q8 = this.$boxWidth;
        Q q9 = this.$boxHeight;
        Alignment alignment = this.$alignment;
        int length = placeableArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i9 < length) {
            Placeable placeable = placeableArr[i9];
            AbstractC3292y.g(placeable, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
            BoxKt.placeInBox(layout, placeable, list.get(i8), measureScope.getLayoutDirection(), q8.f34571a, q9.f34571a, alignment);
            i9++;
            i8++;
        }
    }
}
