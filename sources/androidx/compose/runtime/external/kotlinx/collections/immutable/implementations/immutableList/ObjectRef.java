package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class ObjectRef {
    public static final int $stable = 8;
    private Object value;

    public ObjectRef(Object obj) {
        this.value = obj;
    }

    public final Object getValue() {
        return this.value;
    }

    public final void setValue(Object obj) {
        this.value = obj;
    }
}
