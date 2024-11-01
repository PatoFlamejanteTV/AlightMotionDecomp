package androidx.compose.foundation.layout;

import Q5.I;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class FlowLayoutKt$breakDownItems$nextSize$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Placeable[] $placeables;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowLayoutKt$breakDownItems$nextSize$1(Placeable[] placeableArr) {
        super(1);
        this.$placeables = placeableArr;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable) obj);
        return I.f8786a;
    }

    public final void invoke(Placeable placeable) {
        this.$placeables[0] = placeable;
    }
}
