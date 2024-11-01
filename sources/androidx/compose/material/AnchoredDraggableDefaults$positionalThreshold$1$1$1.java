package androidx.compose.material;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class AnchoredDraggableDefaults$positionalThreshold$1$1$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Density $this_with;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableDefaults$positionalThreshold$1$1$1(Density density) {
        super(1);
        this.$this_with = density;
    }

    public final Float invoke(float f8) {
        return Float.valueOf(this.$this_with.mo425toPx0680j_4(Dp.m5155constructorimpl(56)));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).floatValue());
    }
}
