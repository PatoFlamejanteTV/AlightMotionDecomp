package androidx.compose.foundation.text;

import Q5.I;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class EmptyMeasurePolicy$placementBlock$1 extends AbstractC3293z implements Function1 {
    public static final EmptyMeasurePolicy$placementBlock$1 INSTANCE = new EmptyMeasurePolicy$placementBlock$1();

    EmptyMeasurePolicy$placementBlock$1() {
        super(1);
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        AbstractC3292y.i(placementScope, "$this$null");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return I.f8786a;
    }
}
