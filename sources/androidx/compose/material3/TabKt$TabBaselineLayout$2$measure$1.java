package androidx.compose.material3;

import Q5.I;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class TabKt$TabBaselineLayout$2$measure$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Integer $firstBaseline;
    final /* synthetic */ Placeable $iconPlaceable;
    final /* synthetic */ Integer $lastBaseline;
    final /* synthetic */ int $tabHeight;
    final /* synthetic */ int $tabWidth;
    final /* synthetic */ Placeable $textPlaceable;
    final /* synthetic */ MeasureScope $this_Layout;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabKt$TabBaselineLayout$2$measure$1(Placeable placeable, Placeable placeable2, MeasureScope measureScope, int i8, int i9, Integer num, Integer num2) {
        super(1);
        this.$textPlaceable = placeable;
        this.$iconPlaceable = placeable2;
        this.$this_Layout = measureScope;
        this.$tabWidth = i8;
        this.$tabHeight = i9;
        this.$firstBaseline = num;
        this.$lastBaseline = num2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return I.f8786a;
    }

    public final void invoke(Placeable.PlacementScope layout) {
        Placeable placeable;
        AbstractC3292y.i(layout, "$this$layout");
        Placeable placeable2 = this.$textPlaceable;
        if (placeable2 == null || (placeable = this.$iconPlaceable) == null) {
            if (placeable2 != null) {
                TabKt.placeTextOrIcon(layout, placeable2, this.$tabHeight);
                return;
            }
            Placeable placeable3 = this.$iconPlaceable;
            if (placeable3 != null) {
                TabKt.placeTextOrIcon(layout, placeable3, this.$tabHeight);
                return;
            }
            return;
        }
        MeasureScope measureScope = this.$this_Layout;
        int i8 = this.$tabWidth;
        int i9 = this.$tabHeight;
        Integer num = this.$firstBaseline;
        AbstractC3292y.f(num);
        int intValue = num.intValue();
        Integer num2 = this.$lastBaseline;
        AbstractC3292y.f(num2);
        TabKt.placeTextAndIcon(layout, measureScope, placeable2, placeable, i8, i9, intValue, num2.intValue());
    }
}
