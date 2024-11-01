package androidx.compose.runtime.collection;

import android.util.SparseArray;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC3284p;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class IntMap<E> {
    public static final int $stable = 8;
    private final SparseArray<E> sparseArray;

    private IntMap(SparseArray<E> sparseArray) {
        this.sparseArray = sparseArray;
    }

    public final void clear() {
        this.sparseArray.clear();
    }

    public final boolean contains(int i8) {
        if (this.sparseArray.indexOfKey(i8) >= 0) {
            return true;
        }
        return false;
    }

    public final E get(int i8) {
        return this.sparseArray.get(i8);
    }

    public final int getSize() {
        return this.sparseArray.size();
    }

    public final void remove(int i8) {
        this.sparseArray.remove(i8);
    }

    public final void set(int i8, E e8) {
        this.sparseArray.put(i8, e8);
    }

    public final E get(int i8, E e8) {
        return this.sparseArray.get(i8, e8);
    }

    public IntMap(int i8) {
        this(new SparseArray(i8));
    }

    public /* synthetic */ IntMap(int i8, int i9, AbstractC3284p abstractC3284p) {
        this((i9 & 1) != 0 ? 10 : i8);
    }
}
