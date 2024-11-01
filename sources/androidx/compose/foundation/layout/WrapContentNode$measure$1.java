package androidx.compose.foundation.layout;

import Q5.I;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class WrapContentNode$measure$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Placeable $placeable;
    final /* synthetic */ MeasureScope $this_measure;
    final /* synthetic */ int $wrapperHeight;
    final /* synthetic */ int $wrapperWidth;
    final /* synthetic */ WrapContentNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrapContentNode$measure$1(WrapContentNode wrapContentNode, int i8, Placeable placeable, int i9, MeasureScope measureScope) {
        super(1);
        this.this$0 = wrapContentNode;
        this.$wrapperWidth = i8;
        this.$placeable = placeable;
        this.$wrapperHeight = i9;
        this.$this_measure = measureScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return I.f8786a;
    }

    public final void invoke(Placeable.PlacementScope layout) {
        AbstractC3292y.i(layout, "$this$layout");
        Placeable.PlacementScope.m4146place70tqf50$default(layout, this.$placeable, ((IntOffset) this.this$0.getAlignmentCallback().invoke(IntSize.m5313boximpl(IntSizeKt.IntSize(this.$wrapperWidth - this.$placeable.getWidth(), this.$wrapperHeight - this.$placeable.getHeight())), this.$this_measure.getLayoutDirection())).m5288unboximpl(), 0.0f, 2, null);
    }
}
