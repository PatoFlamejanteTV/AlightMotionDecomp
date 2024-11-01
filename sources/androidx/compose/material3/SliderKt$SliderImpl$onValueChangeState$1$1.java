package androidx.compose.material3;

import Q5.I;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SliderKt$SliderImpl$onValueChangeState$1$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Function1 $onValueChange;
    final /* synthetic */ float $value;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$SliderImpl$onValueChangeState$1$1(float f8, Function1 function1) {
        super(1);
        this.$value = f8;
        this.$onValueChange = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).floatValue());
        return I.f8786a;
    }

    public final void invoke(float f8) {
        if (f8 == this.$value) {
            return;
        }
        this.$onValueChange.invoke(Float.valueOf(f8));
    }
}
