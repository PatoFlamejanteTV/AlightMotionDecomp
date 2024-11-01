package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class UnboxedLongState implements LongState {
    public static final int $stable = 0;
    private final State<Long> baseState;

    public UnboxedLongState(State<Long> state) {
        this.baseState = state;
    }

    @Override // androidx.compose.runtime.LongState
    public long getLongValue() {
        return this.baseState.getValue().longValue();
    }

    public String toString() {
        return "UnboxedLongState(baseState=" + this.baseState + ")@" + hashCode();
    }

    @Override // androidx.compose.runtime.LongState, androidx.compose.runtime.State
    public Long getValue() {
        return this.baseState.getValue();
    }
}
