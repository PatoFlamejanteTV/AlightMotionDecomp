package androidx.compose.material;

import Q5.I;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class NavigationRailKt$placeLabelAndIcon$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Placeable $iconPlaceable;
    final /* synthetic */ float $iconPositionAnimationProgress;
    final /* synthetic */ int $iconX;
    final /* synthetic */ Placeable $labelPlaceable;
    final /* synthetic */ int $labelX;
    final /* synthetic */ int $labelY;
    final /* synthetic */ int $offset;
    final /* synthetic */ int $selectedIconY;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationRailKt$placeLabelAndIcon$1(float f8, Placeable placeable, int i8, int i9, int i10, Placeable placeable2, int i11, int i12) {
        super(1);
        this.$iconPositionAnimationProgress = f8;
        this.$labelPlaceable = placeable;
        this.$labelX = i8;
        this.$labelY = i9;
        this.$offset = i10;
        this.$iconPlaceable = placeable2;
        this.$iconX = i11;
        this.$selectedIconY = i12;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return I.f8786a;
    }

    public final void invoke(Placeable.PlacementScope layout) {
        AbstractC3292y.i(layout, "$this$layout");
        if (this.$iconPositionAnimationProgress != 0.0f) {
            Placeable.PlacementScope.placeRelative$default(layout, this.$labelPlaceable, this.$labelX, this.$labelY + this.$offset, 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(layout, this.$iconPlaceable, this.$iconX, this.$selectedIconY + this.$offset, 0.0f, 4, null);
    }
}
