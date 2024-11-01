package androidx.compose.material3;

import Q5.I;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import c6.InterfaceC2072n;
import i6.InterfaceC2977e;
import i6.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.P;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SliderKt$RangeSlider$2$onDrag$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ P $maxPx;
    final /* synthetic */ P $minPx;
    final /* synthetic */ State<Function1> $onValueChangeState;
    final /* synthetic */ MutableState<Float> $rawOffsetEnd;
    final /* synthetic */ MutableState<Float> $rawOffsetStart;
    final /* synthetic */ float[] $tickFractions;
    final /* synthetic */ InterfaceC2977e $value;
    final /* synthetic */ InterfaceC2977e $valueRange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$RangeSlider$2$onDrag$1(MutableState<Float> mutableState, MutableState<Float> mutableState2, InterfaceC2977e interfaceC2977e, P p8, float[] fArr, P p9, State<? extends Function1> state, InterfaceC2977e interfaceC2977e2) {
        super(2);
        this.$rawOffsetStart = mutableState;
        this.$rawOffsetEnd = mutableState2;
        this.$value = interfaceC2977e;
        this.$minPx = p8;
        this.$tickFractions = fArr;
        this.$maxPx = p9;
        this.$onValueChangeState = state;
        this.$valueRange = interfaceC2977e2;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke(((Boolean) obj).booleanValue(), ((Number) obj2).floatValue());
        return I.f8786a;
    }

    public final void invoke(boolean z8, float f8) {
        float snapValueToTick;
        InterfaceC2977e b9;
        InterfaceC2977e invoke$scaleToUserValue;
        float snapValueToTick2;
        if (z8) {
            MutableState<Float> mutableState = this.$rawOffsetStart;
            mutableState.setValue(Float.valueOf(mutableState.getValue().floatValue() + f8));
            this.$rawOffsetEnd.setValue(Float.valueOf(SliderKt$RangeSlider$2.invoke$scaleToOffset(this.$valueRange, this.$minPx, this.$maxPx, ((Number) this.$value.getEndInclusive()).floatValue())));
            float floatValue = this.$rawOffsetEnd.getValue().floatValue();
            snapValueToTick2 = SliderKt.snapValueToTick(m.j(this.$rawOffsetStart.getValue().floatValue(), this.$minPx.f34570a, floatValue), this.$tickFractions, this.$minPx.f34570a, this.$maxPx.f34570a);
            b9 = m.b(snapValueToTick2, floatValue);
        } else {
            MutableState<Float> mutableState2 = this.$rawOffsetEnd;
            mutableState2.setValue(Float.valueOf(mutableState2.getValue().floatValue() + f8));
            this.$rawOffsetStart.setValue(Float.valueOf(SliderKt$RangeSlider$2.invoke$scaleToOffset(this.$valueRange, this.$minPx, this.$maxPx, ((Number) this.$value.getStart()).floatValue())));
            float floatValue2 = this.$rawOffsetStart.getValue().floatValue();
            snapValueToTick = SliderKt.snapValueToTick(m.j(this.$rawOffsetEnd.getValue().floatValue(), floatValue2, this.$maxPx.f34570a), this.$tickFractions, this.$minPx.f34570a, this.$maxPx.f34570a);
            b9 = m.b(floatValue2, snapValueToTick);
        }
        Function1 value = this.$onValueChangeState.getValue();
        invoke$scaleToUserValue = SliderKt$RangeSlider$2.invoke$scaleToUserValue(this.$minPx, this.$maxPx, this.$valueRange, b9);
        value.invoke(invoke$scaleToUserValue);
    }
}
