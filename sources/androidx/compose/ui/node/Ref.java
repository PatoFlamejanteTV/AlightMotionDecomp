package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class Ref<T> {
    public static final int $stable = 8;
    private T value;

    public final T getValue() {
        return this.value;
    }

    public final void setValue(T t8) {
        this.value = t8;
    }
}
