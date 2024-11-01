package androidx.compose.material;

import Q5.I;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class AlertDialogKt$AlertDialogBaselineLayout$2$measure$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Placeable $textPlaceable;
    final /* synthetic */ int $textPositionY;
    final /* synthetic */ Placeable $titlePlaceable;
    final /* synthetic */ int $titlePositionY;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertDialogKt$AlertDialogBaselineLayout$2$measure$1(Placeable placeable, int i8, Placeable placeable2, int i9) {
        super(1);
        this.$titlePlaceable = placeable;
        this.$titlePositionY = i8;
        this.$textPlaceable = placeable2;
        this.$textPositionY = i9;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return I.f8786a;
    }

    public final void invoke(Placeable.PlacementScope layout) {
        AbstractC3292y.i(layout, "$this$layout");
        Placeable placeable = this.$titlePlaceable;
        if (placeable != null) {
            Placeable.PlacementScope.place$default(layout, placeable, 0, this.$titlePositionY, 0.0f, 4, null);
        }
        Placeable placeable2 = this.$textPlaceable;
        if (placeable2 != null) {
            Placeable.PlacementScope.place$default(layout, placeable2, 0, this.$textPositionY, 0.0f, 4, null);
        }
    }
}
