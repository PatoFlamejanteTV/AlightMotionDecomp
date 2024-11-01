package androidx.compose.runtime;

import Q5.I;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.internal.ThreadMap;
import androidx.compose.runtime.internal.ThreadMap_jvmKt;
import java.util.concurrent.atomic.AtomicReference;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class SnapshotThreadLocal<T> {
    public static final int $stable = 8;
    private T mainThreadValue;
    private final AtomicReference<ThreadMap> map = new AtomicReference<>(ThreadMap_jvmKt.getEmptyThreadMap());
    private final Object writeMutex = new Object();

    public final T get() {
        if (Thread.currentThread().getId() == ActualAndroid_androidKt.getMainThreadId()) {
            return this.mainThreadValue;
        }
        return (T) this.map.get().get(Thread.currentThread().getId());
    }

    public final void set(T t8) {
        long id = Thread.currentThread().getId();
        if (id == ActualAndroid_androidKt.getMainThreadId()) {
            this.mainThreadValue = t8;
            return;
        }
        synchronized (this.writeMutex) {
            ThreadMap threadMap = this.map.get();
            if (threadMap.trySet(id, t8)) {
                return;
            }
            this.map.set(threadMap.newWith(id, t8));
            I i8 = I.f8786a;
        }
    }
}
