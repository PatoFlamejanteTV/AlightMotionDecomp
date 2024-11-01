package androidx.compose.material3;

import Q5.I;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class NavigationRailKt$placeLabelAndIcon$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ boolean $alwaysShowLabel;
    final /* synthetic */ float $animationProgress;
    final /* synthetic */ Placeable $iconPlaceable;
    final /* synthetic */ int $iconX;
    final /* synthetic */ Placeable $indicatorPlaceable;
    final /* synthetic */ Placeable $indicatorRipplePlaceable;
    final /* synthetic */ Placeable $labelPlaceable;
    final /* synthetic */ int $labelX;
    final /* synthetic */ int $labelY;
    final /* synthetic */ int $offset;
    final /* synthetic */ int $rippleX;
    final /* synthetic */ int $rippleY;
    final /* synthetic */ int $selectedIconY;
    final /* synthetic */ MeasureScope $this_placeLabelAndIcon;
    final /* synthetic */ int $width;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationRailKt$placeLabelAndIcon$1(Placeable placeable, boolean z8, float f8, Placeable placeable2, int i8, int i9, int i10, Placeable placeable3, int i11, int i12, Placeable placeable4, int i13, int i14, int i15, MeasureScope measureScope) {
        super(1);
        this.$indicatorPlaceable = placeable;
        this.$alwaysShowLabel = z8;
        this.$animationProgress = f8;
        this.$labelPlaceable = placeable2;
        this.$labelX = i8;
        this.$labelY = i9;
        this.$offset = i10;
        this.$iconPlaceable = placeable3;
        this.$iconX = i11;
        this.$selectedIconY = i12;
        this.$indicatorRipplePlaceable = placeable4;
        this.$rippleX = i13;
        this.$rippleY = i14;
        this.$width = i15;
        this.$this_placeLabelAndIcon = measureScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return I.f8786a;
    }

    public final void invoke(Placeable.PlacementScope layout) {
        float f8;
        AbstractC3292y.i(layout, "$this$layout");
        Placeable placeable = this.$indicatorPlaceable;
        if (placeable != null) {
            int i8 = this.$width;
            int i9 = this.$selectedIconY;
            MeasureScope measureScope = this.$this_placeLabelAndIcon;
            int i10 = this.$offset;
            int width = (i8 - placeable.getWidth()) / 2;
            f8 = NavigationRailKt.IndicatorVerticalPaddingWithLabel;
            Placeable.PlacementScope.placeRelative$default(layout, placeable, width, i10 + (i9 - measureScope.mo419roundToPx0680j_4(f8)), 0.0f, 4, null);
        }
        if (this.$alwaysShowLabel || this.$animationProgress != 0.0f) {
            Placeable.PlacementScope.placeRelative$default(layout, this.$labelPlaceable, this.$labelX, this.$labelY + this.$offset, 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(layout, this.$iconPlaceable, this.$iconX, this.$selectedIconY + this.$offset, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(layout, this.$indicatorRipplePlaceable, this.$rippleX, this.$rippleY + this.$offset, 0.0f, 4, null);
    }
}
