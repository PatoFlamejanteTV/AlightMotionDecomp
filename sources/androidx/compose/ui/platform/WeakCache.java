package androidx.compose.ui.platform;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class WeakCache<T> {
    public static final int $stable = 8;
    private final MutableVector<Reference<T>> values = new MutableVector<>(new Reference[16], 0);
    private final ReferenceQueue<T> referenceQueue = new ReferenceQueue<>();

    private final void clearWeakReferences() {
        Reference<? extends T> poll;
        do {
            poll = this.referenceQueue.poll();
            if (poll != null) {
                this.values.remove(poll);
            }
        } while (poll != null);
    }

    public final int getSize() {
        clearWeakReferences();
        return this.values.getSize();
    }

    public final T pop() {
        clearWeakReferences();
        while (this.values.isNotEmpty()) {
            T t8 = this.values.removeAt(r0.getSize() - 1).get();
            if (t8 != null) {
                return t8;
            }
        }
        return null;
    }

    public final void push(T t8) {
        clearWeakReferences();
        this.values.add(new WeakReference(t8, this.referenceQueue));
    }
}
