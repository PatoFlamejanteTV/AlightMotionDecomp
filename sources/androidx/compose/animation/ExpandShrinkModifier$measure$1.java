package androidx.compose.animation;

import Q5.I;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class ExpandShrinkModifier$measure$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ long $offset;
    final /* synthetic */ long $offsetDelta;
    final /* synthetic */ Placeable $placeable;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandShrinkModifier$measure$1(Placeable placeable, long j8, long j9) {
        super(1);
        this.$placeable = placeable;
        this.$offset = j8;
        this.$offsetDelta = j9;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return I.f8786a;
    }

    public final void invoke(Placeable.PlacementScope layout) {
        AbstractC3292y.i(layout, "$this$layout");
        Placeable.PlacementScope.place$default(layout, this.$placeable, IntOffset.m5279getXimpl(this.$offset) + IntOffset.m5279getXimpl(this.$offsetDelta), IntOffset.m5280getYimpl(this.$offset) + IntOffset.m5280getYimpl(this.$offsetDelta), 0.0f, 4, null);
    }
}
