package androidx.compose.material;

import Q5.I;
import androidx.compose.runtime.MutableFloatState;
import i6.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SwipeableState$draggableState$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ SwipeableState<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableState$draggableState$1(SwipeableState<T> swipeableState) {
        super(1);
        this.this$0 = swipeableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).floatValue());
        return I.f8786a;
    }

    public final void invoke(float f8) {
        MutableFloatState mutableFloatState;
        MutableFloatState mutableFloatState2;
        MutableFloatState mutableFloatState3;
        MutableFloatState mutableFloatState4;
        mutableFloatState = ((SwipeableState) this.this$0).absoluteOffset;
        float floatValue = mutableFloatState.getFloatValue() + f8;
        float j8 = m.j(floatValue, this.this$0.getMinBound$material_release(), this.this$0.getMaxBound$material_release());
        float f9 = floatValue - j8;
        ResistanceConfig resistance$material_release = this.this$0.getResistance$material_release();
        float computeResistance = resistance$material_release != null ? resistance$material_release.computeResistance(f9) : 0.0f;
        mutableFloatState2 = ((SwipeableState) this.this$0).offsetState;
        mutableFloatState2.setFloatValue(j8 + computeResistance);
        mutableFloatState3 = ((SwipeableState) this.this$0).overflowState;
        mutableFloatState3.setFloatValue(f9);
        mutableFloatState4 = ((SwipeableState) this.this$0).absoluteOffset;
        mutableFloatState4.setFloatValue(floatValue);
    }
}
