package androidx.compose.material3;

import Q5.I;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SliderKt$RangeSlider$2$gestureEndAction$1$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Function0 $onValueChangeFinished;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$RangeSlider$2$gestureEndAction$1$1(Function0 function0) {
        super(1);
        this.$onValueChangeFinished = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return I.f8786a;
    }

    public final void invoke(boolean z8) {
        Function0 function0 = this.$onValueChangeFinished;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
