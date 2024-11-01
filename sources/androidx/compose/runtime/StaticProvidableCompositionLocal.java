package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 2)
/* loaded from: classes.dex */
public final class StaticProvidableCompositionLocal<T> extends ProvidableCompositionLocal<T> {
    public static final int $stable = 0;

    public StaticProvidableCompositionLocal(Function0 function0) {
        super(function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.CompositionLocal
    public State<T> updatedStateOf$runtime_release(T t8, State<? extends T> state) {
        if (state == 0 || !AbstractC3292y.d(state.getValue(), t8)) {
            return new StaticValueHolder(t8);
        }
        return state;
    }
}
