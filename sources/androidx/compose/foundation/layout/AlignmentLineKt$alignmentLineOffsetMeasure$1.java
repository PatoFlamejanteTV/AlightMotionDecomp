package androidx.compose.foundation.layout;

import Q5.I;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AlignmentLineKt$alignmentLineOffsetMeasure$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ AlignmentLine $alignmentLine;
    final /* synthetic */ float $before;
    final /* synthetic */ int $height;
    final /* synthetic */ int $paddingAfter;
    final /* synthetic */ int $paddingBefore;
    final /* synthetic */ Placeable $placeable;
    final /* synthetic */ int $width;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlignmentLineKt$alignmentLineOffsetMeasure$1(AlignmentLine alignmentLine, float f8, int i8, int i9, int i10, Placeable placeable, int i11) {
        super(1);
        this.$alignmentLine = alignmentLine;
        this.$before = f8;
        this.$paddingBefore = i8;
        this.$width = i9;
        this.$paddingAfter = i10;
        this.$placeable = placeable;
        this.$height = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return I.f8786a;
    }

    public final void invoke(Placeable.PlacementScope layout) {
        boolean horizontal;
        int width;
        boolean horizontal2;
        int height;
        AbstractC3292y.i(layout, "$this$layout");
        horizontal = AlignmentLineKt.getHorizontal(this.$alignmentLine);
        if (horizontal) {
            width = 0;
        } else {
            width = !Dp.m5160equalsimpl0(this.$before, Dp.Companion.m5175getUnspecifiedD9Ej5fM()) ? this.$paddingBefore : (this.$width - this.$paddingAfter) - this.$placeable.getWidth();
        }
        horizontal2 = AlignmentLineKt.getHorizontal(this.$alignmentLine);
        if (horizontal2) {
            height = !Dp.m5160equalsimpl0(this.$before, Dp.Companion.m5175getUnspecifiedD9Ej5fM()) ? this.$paddingBefore : (this.$height - this.$paddingAfter) - this.$placeable.getHeight();
        } else {
            height = 0;
        }
        Placeable.PlacementScope.placeRelative$default(layout, this.$placeable, width, height, 0.0f, 4, null);
    }
}
