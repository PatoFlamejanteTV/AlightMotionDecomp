package androidx.compose.material3;

import Q5.I;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import i6.InterfaceC2977e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SliderKt$SliderImpl$draggableState$1$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ State<Function1> $onValueChangeState;
    final /* synthetic */ MutableState<Float> $pressOffset;
    final /* synthetic */ MutableState<Float> $rawOffset;
    final /* synthetic */ MutableState<Float> $thumbWidth;
    final /* synthetic */ float[] $tickFractions;
    final /* synthetic */ MutableState<Integer> $totalWidth;
    final /* synthetic */ InterfaceC2977e $valueRange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$SliderImpl$draggableState$1$1(MutableState<Integer> mutableState, MutableState<Float> mutableState2, MutableState<Float> mutableState3, MutableState<Float> mutableState4, float[] fArr, State<? extends Function1> state, InterfaceC2977e interfaceC2977e) {
        super(1);
        this.$totalWidth = mutableState;
        this.$thumbWidth = mutableState2;
        this.$rawOffset = mutableState3;
        this.$pressOffset = mutableState4;
        this.$tickFractions = fArr;
        this.$onValueChangeState = state;
        this.$valueRange = interfaceC2977e;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).floatValue());
        return I.f8786a;
    }

    public final void invoke(float f8) {
        float snapValueToTick;
        float SliderImpl$scaleToUserValue;
        float f9 = 2;
        float max = Math.max(this.$totalWidth.getValue().floatValue() - (this.$thumbWidth.getValue().floatValue() / f9), 0.0f);
        float min = Math.min(this.$thumbWidth.getValue().floatValue() / f9, max);
        MutableState<Float> mutableState = this.$rawOffset;
        mutableState.setValue(Float.valueOf(mutableState.getValue().floatValue() + f8 + this.$pressOffset.getValue().floatValue()));
        this.$pressOffset.setValue(Float.valueOf(0.0f));
        snapValueToTick = SliderKt.snapValueToTick(this.$rawOffset.getValue().floatValue(), this.$tickFractions, min, max);
        Function1 value = this.$onValueChangeState.getValue();
        SliderImpl$scaleToUserValue = SliderKt.SliderImpl$scaleToUserValue(this.$valueRange, min, max, snapValueToTick);
        value.invoke(Float.valueOf(SliderImpl$scaleToUserValue));
    }
}
