package androidx.compose.material;

import Q5.I;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class BottomNavigationKt$placeIcon$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Placeable $iconPlaceable;
    final /* synthetic */ int $iconY;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomNavigationKt$placeIcon$1(Placeable placeable, int i8) {
        super(1);
        this.$iconPlaceable = placeable;
        this.$iconY = i8;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return I.f8786a;
    }

    public final void invoke(Placeable.PlacementScope layout) {
        AbstractC3292y.i(layout, "$this$layout");
        Placeable.PlacementScope.placeRelative$default(layout, this.$iconPlaceable, 0, this.$iconY, 0.0f, 4, null);
    }
}
