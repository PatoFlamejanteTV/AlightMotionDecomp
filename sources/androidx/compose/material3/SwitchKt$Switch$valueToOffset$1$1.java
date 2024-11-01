package androidx.compose.material3;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SwitchKt$Switch$valueToOffset$1$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ float $maxBound;
    final /* synthetic */ float $minBound;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchKt$Switch$valueToOffset$1$1(float f8, float f9) {
        super(1);
        this.$maxBound = f8;
        this.$minBound = f9;
    }

    public final Float invoke(boolean z8) {
        return Float.valueOf(z8 ? this.$maxBound : this.$minBound);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Boolean) obj).booleanValue());
    }
}
