package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class UnboxedDoubleState implements DoubleState {
    public static final int $stable = 0;
    private final State<Double> baseState;

    public UnboxedDoubleState(State<Double> state) {
        this.baseState = state;
    }

    @Override // androidx.compose.runtime.DoubleState
    public double getDoubleValue() {
        return this.baseState.getValue().doubleValue();
    }

    public String toString() {
        return "UnboxedDoubleState(baseState=" + this.baseState + ")@" + hashCode();
    }

    @Override // androidx.compose.runtime.DoubleState, androidx.compose.runtime.State
    public Double getValue() {
        return this.baseState.getValue();
    }
}
