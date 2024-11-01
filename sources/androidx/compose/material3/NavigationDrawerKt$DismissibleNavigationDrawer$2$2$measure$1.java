package androidx.compose.material3;

import Q5.I;
import androidx.compose.ui.layout.Placeable;
import e6.AbstractC2829a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class NavigationDrawerKt$DismissibleNavigationDrawer$2$2$measure$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Placeable $contentPlaceable;
    final /* synthetic */ DrawerState $drawerState;
    final /* synthetic */ Placeable $sheetPlaceable;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawerKt$DismissibleNavigationDrawer$2$2$measure$1(Placeable placeable, Placeable placeable2, DrawerState drawerState) {
        super(1);
        this.$contentPlaceable = placeable;
        this.$sheetPlaceable = placeable2;
        this.$drawerState = drawerState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return I.f8786a;
    }

    public final void invoke(Placeable.PlacementScope layout) {
        AbstractC3292y.i(layout, "$this$layout");
        Placeable.PlacementScope.placeRelative$default(layout, this.$contentPlaceable, this.$sheetPlaceable.getWidth() + AbstractC2829a.d(this.$drawerState.getOffset().getValue().floatValue()), 0, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(layout, this.$sheetPlaceable, AbstractC2829a.d(this.$drawerState.getOffset().getValue().floatValue()), 0, 0.0f, 4, null);
    }
}
