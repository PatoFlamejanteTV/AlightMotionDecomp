package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import R5.AbstractC1424h;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import java.util.Map.Entry;

@StabilityInferred(parameters = 8)
/* loaded from: classes.dex */
public abstract class AbstractMapBuilderEntries<E extends Map.Entry<? extends K, ? extends V>, K, V> extends AbstractC1424h {
    public static final int $stable = 0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return contains((AbstractMapBuilderEntries<E, K, V>) obj);
        }
        return false;
    }

    public abstract boolean containsEntry(Map.Entry<? extends K, ? extends V> entry);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return remove((AbstractMapBuilderEntries<E, K, V>) obj);
        }
        return false;
    }

    public abstract boolean removeEntry(Map.Entry<? extends K, ? extends V> entry);

    public final boolean contains(E e8) {
        if ((e8 instanceof Object ? e8 : null) instanceof Map.Entry) {
            return containsEntry(e8);
        }
        return false;
    }

    public final boolean remove(E e8) {
        if ((e8 instanceof Object ? e8 : null) instanceof Map.Entry) {
            return removeEntry(e8);
        }
        return false;
    }
}
