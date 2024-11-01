package androidx.compose.material3;

import Q5.I;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class NavigationRailKt$placeIcon$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ int $height;
    final /* synthetic */ Placeable $iconPlaceable;
    final /* synthetic */ int $iconX;
    final /* synthetic */ int $iconY;
    final /* synthetic */ Placeable $indicatorPlaceable;
    final /* synthetic */ Placeable $indicatorRipplePlaceable;
    final /* synthetic */ int $rippleX;
    final /* synthetic */ int $rippleY;
    final /* synthetic */ int $width;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationRailKt$placeIcon$1(Placeable placeable, Placeable placeable2, int i8, int i9, Placeable placeable3, int i10, int i11, int i12, int i13) {
        super(1);
        this.$indicatorPlaceable = placeable;
        this.$iconPlaceable = placeable2;
        this.$iconX = i8;
        this.$iconY = i9;
        this.$indicatorRipplePlaceable = placeable3;
        this.$rippleX = i10;
        this.$rippleY = i11;
        this.$width = i12;
        this.$height = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return I.f8786a;
    }

    public final void invoke(Placeable.PlacementScope layout) {
        AbstractC3292y.i(layout, "$this$layout");
        Placeable placeable = this.$indicatorPlaceable;
        if (placeable != null) {
            Placeable.PlacementScope.placeRelative$default(layout, placeable, (this.$width - placeable.getWidth()) / 2, (this.$height - placeable.getHeight()) / 2, 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(layout, this.$iconPlaceable, this.$iconX, this.$iconY, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(layout, this.$indicatorRipplePlaceable, this.$rippleX, this.$rippleY, 0.0f, 4, null);
    }
}
