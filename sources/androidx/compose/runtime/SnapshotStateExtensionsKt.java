package androidx.compose.runtime;

/* loaded from: classes.dex */
public final class SnapshotStateExtensionsKt {
    @Stable
    public static final DoubleState asDoubleState(State<Double> state) {
        if (state instanceof DoubleState) {
            return (DoubleState) state;
        }
        return new UnboxedDoubleState(state);
    }

    @Stable
    public static final FloatState asFloatState(State<Float> state) {
        if (state instanceof FloatState) {
            return (FloatState) state;
        }
        return new UnboxedFloatState(state);
    }

    @Stable
    public static final IntState asIntState(State<Integer> state) {
        if (state instanceof IntState) {
            return (IntState) state;
        }
        return new UnboxedIntState(state);
    }

    @Stable
    public static final LongState asLongState(State<Long> state) {
        if (state instanceof LongState) {
            return (LongState) state;
        }
        return new UnboxedLongState(state);
    }
}
