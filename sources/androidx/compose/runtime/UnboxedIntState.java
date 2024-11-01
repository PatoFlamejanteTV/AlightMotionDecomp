package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class UnboxedIntState implements IntState {
    public static final int $stable = 0;
    private final State<Integer> baseState;

    public UnboxedIntState(State<Integer> state) {
        this.baseState = state;
    }

    @Override // androidx.compose.runtime.IntState
    public int getIntValue() {
        return this.baseState.getValue().intValue();
    }

    public String toString() {
        return "UnboxedIntState(baseState=" + this.baseState + ")@" + hashCode();
    }

    @Override // androidx.compose.runtime.IntState, androidx.compose.runtime.State
    public Integer getValue() {
        return this.baseState.getValue();
    }
}
