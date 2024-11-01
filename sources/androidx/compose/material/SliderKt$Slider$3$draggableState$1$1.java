package androidx.compose.material;

import Q5.I;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.State;
import i6.InterfaceC2977e;
import i6.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.P;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SliderKt$Slider$3$draggableState$1$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ P $maxPx;
    final /* synthetic */ P $minPx;
    final /* synthetic */ State<Function1> $onValueChangeState;
    final /* synthetic */ MutableFloatState $pressOffset;
    final /* synthetic */ MutableFloatState $rawOffset;
    final /* synthetic */ InterfaceC2977e $valueRange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$Slider$3$draggableState$1$1(MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, P p8, P p9, State<? extends Function1> state, InterfaceC2977e interfaceC2977e) {
        super(1);
        this.$rawOffset = mutableFloatState;
        this.$pressOffset = mutableFloatState2;
        this.$minPx = p8;
        this.$maxPx = p9;
        this.$onValueChangeState = state;
        this.$valueRange = interfaceC2977e;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).floatValue());
        return I.f8786a;
    }

    public final void invoke(float f8) {
        float invoke$scaleToUserValue;
        MutableFloatState mutableFloatState = this.$rawOffset;
        mutableFloatState.setFloatValue(mutableFloatState.getFloatValue() + f8 + this.$pressOffset.getFloatValue());
        this.$pressOffset.setFloatValue(0.0f);
        float j8 = m.j(this.$rawOffset.getFloatValue(), this.$minPx.f34570a, this.$maxPx.f34570a);
        Function1 value = this.$onValueChangeState.getValue();
        invoke$scaleToUserValue = SliderKt$Slider$3.invoke$scaleToUserValue(this.$minPx, this.$maxPx, this.$valueRange, j8);
        value.invoke(Float.valueOf(invoke$scaleToUserValue));
    }
}
