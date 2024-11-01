package androidx.compose.material3;

import Q5.I;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SliderKt$SliderImpl$2$measure$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ int $thumbOffsetX;
    final /* synthetic */ int $thumbOffsetY;
    final /* synthetic */ Placeable $thumbPlaceable;
    final /* synthetic */ int $trackOffsetX;
    final /* synthetic */ int $trackOffsetY;
    final /* synthetic */ Placeable $trackPlaceable;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$SliderImpl$2$measure$1(Placeable placeable, int i8, int i9, Placeable placeable2, int i10, int i11) {
        super(1);
        this.$trackPlaceable = placeable;
        this.$trackOffsetX = i8;
        this.$trackOffsetY = i9;
        this.$thumbPlaceable = placeable2;
        this.$thumbOffsetX = i10;
        this.$thumbOffsetY = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return I.f8786a;
    }

    public final void invoke(Placeable.PlacementScope layout) {
        AbstractC3292y.i(layout, "$this$layout");
        Placeable.PlacementScope.placeRelative$default(layout, this.$trackPlaceable, this.$trackOffsetX, this.$trackOffsetY, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(layout, this.$thumbPlaceable, this.$thumbOffsetX, this.$thumbOffsetY, 0.0f, 4, null);
    }
}
