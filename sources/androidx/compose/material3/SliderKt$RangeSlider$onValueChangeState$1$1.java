package androidx.compose.material3;

import Q5.I;
import i6.InterfaceC2977e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SliderKt$RangeSlider$onValueChangeState$1$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Function1 $onValueChange;
    final /* synthetic */ InterfaceC2977e $value;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$RangeSlider$onValueChangeState$1$1(InterfaceC2977e interfaceC2977e, Function1 function1) {
        super(1);
        this.$value = interfaceC2977e;
        this.$onValueChange = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InterfaceC2977e) obj);
        return I.f8786a;
    }

    public final void invoke(InterfaceC2977e it) {
        AbstractC3292y.i(it, "it");
        if (AbstractC3292y.d(it, this.$value)) {
            return;
        }
        this.$onValueChange.invoke(it);
    }
}
