package androidx.compose.material3;

import Q5.I;
import androidx.compose.material3.tokens.BadgeTokens;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class BadgeKt$BadgedBox$2$measure$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Placeable $anchorPlaceable;
    final /* synthetic */ Placeable $badgePlaceable;
    final /* synthetic */ MeasureScope $this_Layout;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgeKt$BadgedBox$2$measure$1(Placeable placeable, MeasureScope measureScope, Placeable placeable2) {
        super(1);
        this.$badgePlaceable = placeable;
        this.$this_Layout = measureScope;
        this.$anchorPlaceable = placeable2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return I.f8786a;
    }

    public final void invoke(Placeable.PlacementScope layout) {
        AbstractC3292y.i(layout, "$this$layout");
        boolean z8 = this.$badgePlaceable.getWidth() > this.$this_Layout.mo419roundToPx0680j_4(BadgeTokens.INSTANCE.m1949getSizeD9Ej5fM());
        float badgeWithContentHorizontalOffset = z8 ? BadgeKt.getBadgeWithContentHorizontalOffset() : BadgeKt.getBadgeOffset();
        float badgeWithContentVerticalOffset = z8 ? BadgeKt.getBadgeWithContentVerticalOffset() : BadgeKt.getBadgeOffset();
        Placeable.PlacementScope.placeRelative$default(layout, this.$anchorPlaceable, 0, 0, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(layout, this.$badgePlaceable, this.$anchorPlaceable.getWidth() + this.$this_Layout.mo419roundToPx0680j_4(badgeWithContentHorizontalOffset), ((-this.$badgePlaceable.getHeight()) / 2) + this.$this_Layout.mo419roundToPx0680j_4(badgeWithContentVerticalOffset), 0.0f, 4, null);
    }
}
