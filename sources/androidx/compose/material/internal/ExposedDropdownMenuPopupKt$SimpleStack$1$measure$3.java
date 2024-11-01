package androidx.compose.material.internal;

import Q5.I;
import R5.AbstractC1435t;
import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
public final class ExposedDropdownMenuPopupKt$SimpleStack$1$measure$3 extends AbstractC3293z implements Function1 {
    final /* synthetic */ List<Placeable> $placeables;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ExposedDropdownMenuPopupKt$SimpleStack$1$measure$3(List<? extends Placeable> list) {
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
        int o8 = AbstractC1435t.o(this.$placeables);
        if (o8 < 0) {
            return;
        }
        int i8 = 0;
        while (true) {
            Placeable.PlacementScope.placeRelative$default(layout, this.$placeables.get(i8), 0, 0, 0.0f, 4, null);
            if (i8 == o8) {
                return;
            } else {
                i8++;
            }
        }
    }
}
