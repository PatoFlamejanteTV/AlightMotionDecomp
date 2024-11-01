package androidx.compose.material3;

import Q5.I;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SnackbarKt$OneRowSnackbar$2$measure$4 extends AbstractC3293z implements Function1 {
    final /* synthetic */ int $actionButtonPlaceX;
    final /* synthetic */ int $actionButtonPlaceY;
    final /* synthetic */ Placeable $actionButtonPlaceable;
    final /* synthetic */ int $dismissButtonPlaceX;
    final /* synthetic */ int $dismissButtonPlaceY;
    final /* synthetic */ Placeable $dismissButtonPlaceable;
    final /* synthetic */ int $textPlaceY;
    final /* synthetic */ Placeable $textPlaceable;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarKt$OneRowSnackbar$2$measure$4(Placeable placeable, int i8, Placeable placeable2, int i9, int i10, Placeable placeable3, int i11, int i12) {
        super(1);
        this.$textPlaceable = placeable;
        this.$textPlaceY = i8;
        this.$dismissButtonPlaceable = placeable2;
        this.$dismissButtonPlaceX = i9;
        this.$dismissButtonPlaceY = i10;
        this.$actionButtonPlaceable = placeable3;
        this.$actionButtonPlaceX = i11;
        this.$actionButtonPlaceY = i12;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return I.f8786a;
    }

    public final void invoke(Placeable.PlacementScope layout) {
        AbstractC3292y.i(layout, "$this$layout");
        Placeable.PlacementScope.placeRelative$default(layout, this.$textPlaceable, 0, this.$textPlaceY, 0.0f, 4, null);
        Placeable placeable = this.$dismissButtonPlaceable;
        if (placeable != null) {
            Placeable.PlacementScope.placeRelative$default(layout, placeable, this.$dismissButtonPlaceX, this.$dismissButtonPlaceY, 0.0f, 4, null);
        }
        Placeable placeable2 = this.$actionButtonPlaceable;
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(layout, placeable2, this.$actionButtonPlaceX, this.$actionButtonPlaceY, 0.0f, 4, null);
        }
    }
}
