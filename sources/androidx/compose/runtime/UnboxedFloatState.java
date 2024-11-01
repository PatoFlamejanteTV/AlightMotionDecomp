package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class UnboxedFloatState implements FloatState {
    public static final int $stable = 0;
    private final State<Float> baseState;

    public UnboxedFloatState(State<Float> state) {
        this.baseState = state;
    }

    @Override // androidx.compose.runtime.FloatState
    public float getFloatValue() {
        return this.baseState.getValue().floatValue();
    }

    public String toString() {
        return "UnboxedFloatState(baseState=" + this.baseState + ")@" + hashCode();
    }

    @Override // androidx.compose.runtime.FloatState, androidx.compose.runtime.State
    public Float getValue() {
        return this.baseState.getValue();
    }
}
