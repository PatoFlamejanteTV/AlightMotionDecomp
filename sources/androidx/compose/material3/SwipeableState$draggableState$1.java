package androidx.compose.material3;

import Q5.I;
import androidx.compose.runtime.MutableState;
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
        MutableState mutableState;
        MutableState mutableState2;
        MutableState mutableState3;
        MutableState mutableState4;
        mutableState = ((SwipeableState) this.this$0).absoluteOffset;
        float floatValue = ((Number) mutableState.getValue()).floatValue() + f8;
        float j8 = m.j(floatValue, this.this$0.getMinBound$material3_release(), this.this$0.getMaxBound$material3_release());
        float f9 = floatValue - j8;
        ResistanceConfig resistance$material3_release = this.this$0.getResistance$material3_release();
        float computeResistance = resistance$material3_release != null ? resistance$material3_release.computeResistance(f9) : 0.0f;
        mutableState2 = ((SwipeableState) this.this$0).offsetState;
        mutableState2.setValue(Float.valueOf(j8 + computeResistance));
        mutableState3 = ((SwipeableState) this.this$0).overflowState;
        mutableState3.setValue(Float.valueOf(f9));
        mutableState4 = ((SwipeableState) this.this$0).absoluteOffset;
        mutableState4.setValue(Float.valueOf(floatValue));
    }
}
