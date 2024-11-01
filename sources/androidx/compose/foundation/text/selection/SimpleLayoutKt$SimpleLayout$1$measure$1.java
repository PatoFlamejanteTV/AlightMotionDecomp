package androidx.compose.foundation.text.selection;

import Q5.I;
import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SimpleLayoutKt$SimpleLayout$1$measure$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ List<Placeable> $placeables;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SimpleLayoutKt$SimpleLayout$1$measure$1(List<? extends Placeable> list) {
        super(1);
        this.$placeables = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return I.f8786a;
    }

    public final void invoke(Placeable.PlacementScope layout) {
        AbstractC3292y.i(layout, "$this$layout");
        List<Placeable> list = this.$placeables;
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            Placeable.PlacementScope.place$default(layout, list.get(i8), 0, 0, 0.0f, 4, null);
        }
    }
}
