package androidx.compose.material;

import Q5.I;
import androidx.compose.runtime.State;
import i6.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SliderKt$RangeSlider$2$startThumbSemantics$1$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ float $coercedEnd;
    final /* synthetic */ State<Function1> $onValueChangeState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$RangeSlider$2$startThumbSemantics$1$1(State<? extends Function1> state, float f8) {
        super(1);
        this.$onValueChangeState = state;
        this.$coercedEnd = f8;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).floatValue());
        return I.f8786a;
    }

    public final void invoke(float f8) {
        this.$onValueChangeState.getValue().invoke(m.b(f8, this.$coercedEnd));
    }
}
