package androidx.compose.material3;

import Q5.I;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class AppBarKt$TopAppBarLayout$2$measure$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Placeable $actionIconsPlaceable;
    final /* synthetic */ long $constraints;
    final /* synthetic */ int $layoutHeight;
    final /* synthetic */ Placeable $navigationIconPlaceable;
    final /* synthetic */ MeasureScope $this_Layout;
    final /* synthetic */ int $titleBaseline;
    final /* synthetic */ int $titleBottomPadding;
    final /* synthetic */ Arrangement.Horizontal $titleHorizontalArrangement;
    final /* synthetic */ Placeable $titlePlaceable;
    final /* synthetic */ Arrangement.Vertical $titleVerticalArrangement;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarKt$TopAppBarLayout$2$measure$1(Placeable placeable, int i8, Placeable placeable2, Arrangement.Horizontal horizontal, long j8, Placeable placeable3, MeasureScope measureScope, Arrangement.Vertical vertical, int i9, int i10) {
        super(1);
        this.$navigationIconPlaceable = placeable;
        this.$layoutHeight = i8;
        this.$titlePlaceable = placeable2;
        this.$titleHorizontalArrangement = horizontal;
        this.$constraints = j8;
        this.$actionIconsPlaceable = placeable3;
        this.$this_Layout = measureScope;
        this.$titleVerticalArrangement = vertical;
        this.$titleBottomPadding = i9;
        this.$titleBaseline = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return I.f8786a;
    }

    public final void invoke(Placeable.PlacementScope layout) {
        float f8;
        int max;
        int i8;
        int height;
        int max2;
        int i9;
        AbstractC3292y.i(layout, "$this$layout");
        Placeable placeable = this.$navigationIconPlaceable;
        Placeable.PlacementScope.placeRelative$default(layout, placeable, 0, (this.$layoutHeight - placeable.getHeight()) / 2, 0.0f, 4, null);
        Placeable placeable2 = this.$titlePlaceable;
        Arrangement.Horizontal horizontal = this.$titleHorizontalArrangement;
        Arrangement arrangement = Arrangement.INSTANCE;
        if (AbstractC3292y.d(horizontal, arrangement.getCenter())) {
            max = (Constraints.m5123getMaxWidthimpl(this.$constraints) - this.$titlePlaceable.getWidth()) / 2;
        } else if (AbstractC3292y.d(horizontal, arrangement.getEnd())) {
            max = (Constraints.m5123getMaxWidthimpl(this.$constraints) - this.$titlePlaceable.getWidth()) - this.$actionIconsPlaceable.getWidth();
        } else {
            MeasureScope measureScope = this.$this_Layout;
            f8 = AppBarKt.TopAppBarTitleInset;
            max = Math.max(measureScope.mo419roundToPx0680j_4(f8), this.$navigationIconPlaceable.getWidth());
        }
        int i10 = max;
        Arrangement.Vertical vertical = this.$titleVerticalArrangement;
        if (AbstractC3292y.d(vertical, arrangement.getCenter())) {
            i9 = (this.$layoutHeight - this.$titlePlaceable.getHeight()) / 2;
        } else if (AbstractC3292y.d(vertical, arrangement.getBottom())) {
            if (this.$titleBottomPadding == 0) {
                height = this.$layoutHeight;
                max2 = this.$titlePlaceable.getHeight();
            } else {
                height = this.$layoutHeight - this.$titlePlaceable.getHeight();
                max2 = Math.max(0, (this.$titleBottomPadding - this.$titlePlaceable.getHeight()) + this.$titleBaseline);
            }
            i9 = height - max2;
        } else {
            i8 = 0;
            Placeable.PlacementScope.placeRelative$default(layout, placeable2, i10, i8, 0.0f, 4, null);
            Placeable.PlacementScope.placeRelative$default(layout, this.$actionIconsPlaceable, Constraints.m5123getMaxWidthimpl(this.$constraints) - this.$actionIconsPlaceable.getWidth(), (this.$layoutHeight - this.$actionIconsPlaceable.getHeight()) / 2, 0.0f, 4, null);
        }
        i8 = i9;
        Placeable.PlacementScope.placeRelative$default(layout, placeable2, i10, i8, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(layout, this.$actionIconsPlaceable, Constraints.m5123getMaxWidthimpl(this.$constraints) - this.$actionIconsPlaceable.getWidth(), (this.$layoutHeight - this.$actionIconsPlaceable.getHeight()) / 2, 0.0f, 4, null);
    }
}
