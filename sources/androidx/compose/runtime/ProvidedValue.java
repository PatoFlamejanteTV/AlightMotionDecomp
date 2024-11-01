package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class ProvidedValue<T> {
    public static final int $stable = 0;
    private final boolean canOverride;
    private final CompositionLocal<T> compositionLocal;
    private final T value;

    public ProvidedValue(CompositionLocal<T> compositionLocal, T t8, boolean z8) {
        this.compositionLocal = compositionLocal;
        this.value = t8;
        this.canOverride = z8;
    }

    public final boolean getCanOverride() {
        return this.canOverride;
    }

    public final CompositionLocal<T> getCompositionLocal() {
        return this.compositionLocal;
    }

    public final T getValue() {
        return this.value;
    }
}
