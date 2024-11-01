package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.functions.Function0;

@StabilityInferred(parameters = 2)
/* loaded from: classes.dex */
public final class DynamicProvidableCompositionLocal<T> extends ProvidableCompositionLocal<T> {
    public static final int $stable = 0;
    private final SnapshotMutationPolicy<T> policy;

    public DynamicProvidableCompositionLocal(SnapshotMutationPolicy<T> snapshotMutationPolicy, Function0 function0) {
        super(function0);
        this.policy = snapshotMutationPolicy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.CompositionLocal
    public State<T> updatedStateOf$runtime_release(T t8, State<? extends T> state) {
        if (state != 0 && (state instanceof MutableState)) {
            ((MutableState) state).setValue(t8);
            return state;
        }
        return SnapshotStateKt.mutableStateOf(t8, this.policy);
    }
}
