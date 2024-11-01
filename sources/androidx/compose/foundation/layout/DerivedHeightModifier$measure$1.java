package androidx.compose.foundation.layout;

import Q5.I;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class DerivedHeightModifier$measure$1 extends AbstractC3293z implements Function1 {
    public static final DerivedHeightModifier$measure$1 INSTANCE = new DerivedHeightModifier$measure$1();

    DerivedHeightModifier$measure$1() {
        super(1);
    }

    public final void invoke(Placeable.PlacementScope layout) {
        AbstractC3292y.i(layout, "$this$layout");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return I.f8786a;
    }
}
