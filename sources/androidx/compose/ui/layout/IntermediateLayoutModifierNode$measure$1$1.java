package androidx.compose.ui.layout;

import Q5.I;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class IntermediateLayoutModifierNode$measure$1$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Placeable $this_run;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntermediateLayoutModifierNode$measure$1$1(Placeable placeable) {
        super(1);
        this.$this_run = placeable;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return I.f8786a;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, this.$this_run, 0, 0, 0.0f, 4, null);
    }
}
