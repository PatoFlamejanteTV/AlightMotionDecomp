package androidx.compose.foundation.layout;

import Q5.I;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class FlowLayoutKt$breakDownItems$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ int $index;
    final /* synthetic */ Placeable[] $placeables;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowLayoutKt$breakDownItems$1(Placeable[] placeableArr, int i8) {
        super(1);
        this.$placeables = placeableArr;
        this.$index = i8;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable) obj);
        return I.f8786a;
    }

    public final void invoke(Placeable placeable) {
        this.$placeables[this.$index + 1] = placeable;
    }
}
