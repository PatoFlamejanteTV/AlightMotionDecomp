package androidx.compose.runtime;

import kotlin.jvm.functions.Function0;

@Stable
/* loaded from: classes.dex */
public abstract class ProvidableCompositionLocal<T> extends CompositionLocal<T> {
    public static final int $stable = 0;

    public ProvidableCompositionLocal(Function0 function0) {
        super(function0, null);
    }

    public final ProvidedValue<T> provides(T t8) {
        return new ProvidedValue<>(this, t8, true);
    }

    public final ProvidedValue<T> providesDefault(T t8) {
        return new ProvidedValue<>(this, t8, false);
    }
}
