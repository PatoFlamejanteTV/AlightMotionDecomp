package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.functions.Function0;

@StabilityInferred(parameters = 2)
/* loaded from: classes.dex */
public final class ThreadLocal<T> extends java.lang.ThreadLocal<T> {
    public static final int $stable = 0;
    private final Function0 initialValue;

    public ThreadLocal(Function0 function0) {
        this.initialValue = function0;
    }

    @Override // java.lang.ThreadLocal
    public T get() {
        return (T) super.get();
    }

    @Override // java.lang.ThreadLocal
    protected T initialValue() {
        return (T) this.initialValue.invoke();
    }

    @Override // java.lang.ThreadLocal
    public void remove() {
        super.remove();
    }

    @Override // java.lang.ThreadLocal
    public void set(T t8) {
        super.set(t8);
    }
}
