package androidx.compose.foundation.layout;

import Q5.I;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class InsetsPaddingModifier$measure$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ int $left;
    final /* synthetic */ Placeable $placeable;
    final /* synthetic */ int $top;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InsetsPaddingModifier$measure$1(Placeable placeable, int i8, int i9) {
        super(1);
        this.$placeable = placeable;
        this.$left = i8;
        this.$top = i9;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return I.f8786a;
    }

    public final void invoke(Placeable.PlacementScope layout) {
        AbstractC3292y.i(layout, "$this$layout");
        Placeable.PlacementScope.place$default(layout, this.$placeable, this.$left, this.$top, 0.0f, 4, null);
    }
}
