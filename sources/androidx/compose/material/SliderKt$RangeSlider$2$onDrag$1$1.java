package androidx.compose.material;

import Q5.I;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.State;
import c6.InterfaceC2072n;
import i6.InterfaceC2977e;
import i6.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.P;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SliderKt$RangeSlider$2$onDrag$1$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ P $maxPx;
    final /* synthetic */ P $minPx;
    final /* synthetic */ State<Function1> $onValueChangeState;
    final /* synthetic */ MutableFloatState $rawOffsetEnd;
    final /* synthetic */ MutableFloatState $rawOffsetStart;
    final /* synthetic */ InterfaceC2977e $value;
    final /* synthetic */ InterfaceC2977e $valueRange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$RangeSlider$2$onDrag$1$1(MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, InterfaceC2977e interfaceC2977e, P p8, P p9, State<? extends Function1> state, InterfaceC2977e interfaceC2977e2) {
        super(2);
        this.$rawOffsetStart = mutableFloatState;
        this.$rawOffsetEnd = mutableFloatState2;
        this.$value = interfaceC2977e;
        this.$minPx = p8;
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
        InterfaceC2977e b9;
        InterfaceC2977e invoke$scaleToUserValue;
        if (z8) {
            MutableFloatState mutableFloatState = this.$rawOffsetStart;
            mutableFloatState.setFloatValue(mutableFloatState.getFloatValue() + f8);
            this.$rawOffsetEnd.setFloatValue(SliderKt$RangeSlider$2.invoke$scaleToOffset(this.$valueRange, this.$minPx, this.$maxPx, ((Number) this.$value.getEndInclusive()).floatValue()));
            float floatValue = this.$rawOffsetEnd.getFloatValue();
            b9 = m.b(m.j(this.$rawOffsetStart.getFloatValue(), this.$minPx.f34570a, floatValue), floatValue);
        } else {
            MutableFloatState mutableFloatState2 = this.$rawOffsetEnd;
            mutableFloatState2.setFloatValue(mutableFloatState2.getFloatValue() + f8);
            this.$rawOffsetStart.setFloatValue(SliderKt$RangeSlider$2.invoke$scaleToOffset(this.$valueRange, this.$minPx, this.$maxPx, ((Number) this.$value.getStart()).floatValue()));
            float floatValue2 = this.$rawOffsetStart.getFloatValue();
            b9 = m.b(floatValue2, m.j(this.$rawOffsetEnd.getFloatValue(), floatValue2, this.$maxPx.f34570a));
        }
        Function1 value = this.$onValueChangeState.getValue();
        invoke$scaleToUserValue = SliderKt$RangeSlider$2.invoke$scaleToUserValue(this.$minPx, this.$maxPx, this.$valueRange, b9);
        value.invoke(invoke$scaleToUserValue);
    }
}
