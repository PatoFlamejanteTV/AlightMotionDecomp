package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 2)
/* loaded from: classes.dex */
public final class StaticValueHolder<T> implements State<T> {
    public static final int $stable = 0;
    private final T value;

    public StaticValueHolder(T t8) {
        this.value = t8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StaticValueHolder copy$default(StaticValueHolder staticValueHolder, Object obj, int i8, Object obj2) {
        if ((i8 & 1) != 0) {
            obj = staticValueHolder.value;
        }
        return staticValueHolder.copy(obj);
    }

    public final T component1() {
        return this.value;
    }

    public final StaticValueHolder<T> copy(T t8) {
        return new StaticValueHolder<>(t8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StaticValueHolder) && AbstractC3292y.d(this.value, ((StaticValueHolder) obj).value);
    }

    @Override // androidx.compose.runtime.State
    public T getValue() {
        return this.value;
    }

    public int hashCode() {
        T t8 = this.value;
        if (t8 == null) {
            return 0;
        }
        return t8.hashCode();
    }

    public String toString() {
        return "StaticValueHolder(value=" + this.value + ')';
    }
}
