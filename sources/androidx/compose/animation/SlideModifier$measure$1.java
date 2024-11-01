package androidx.compose.animation;

import Q5.I;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SlideModifier$measure$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ long $measuredSize;
    final /* synthetic */ Placeable $placeable;
    final /* synthetic */ SlideModifier this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlideModifier$measure$1(SlideModifier slideModifier, Placeable placeable, long j8) {
        super(1);
        this.this$0 = slideModifier;
        this.$placeable = placeable;
        this.$measuredSize = j8;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return I.f8786a;
    }

    public final void invoke(Placeable.PlacementScope layout) {
        AbstractC3292y.i(layout, "$this$layout");
        Placeable.PlacementScope.m4149placeWithLayeraW9wM$default(layout, this.$placeable, this.this$0.getLazyAnimation().animate(this.this$0.getTransitionSpec(), new SlideModifier$measure$1$slideOffset$1(this.this$0, this.$measuredSize)).getValue().m5288unboximpl(), 0.0f, null, 6, null);
    }
}
