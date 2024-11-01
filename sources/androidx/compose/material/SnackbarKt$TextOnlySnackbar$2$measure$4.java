package androidx.compose.material;

import Q5.I;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SnackbarKt$TextOnlySnackbar$2$measure$4 extends AbstractC3293z implements Function1 {
    final /* synthetic */ int $containerHeight;
    final /* synthetic */ Placeable $textPlaceable;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarKt$TextOnlySnackbar$2$measure$4(int i8, Placeable placeable) {
        super(1);
        this.$containerHeight = i8;
        this.$textPlaceable = placeable;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return I.f8786a;
    }

    public final void invoke(Placeable.PlacementScope layout) {
        AbstractC3292y.i(layout, "$this$layout");
        Placeable.PlacementScope.placeRelative$default(layout, this.$textPlaceable, 0, (this.$containerHeight - this.$textPlaceable.getHeight()) / 2, 0.0f, 4, null);
    }
}
