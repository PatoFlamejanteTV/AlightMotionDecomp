package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.internal.StabilityInferred;
import d6.InterfaceC2767a;
import java.util.Iterator;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class PersistentOrderedMapValuesIterator<K, V> implements Iterator<V>, InterfaceC2767a {
    public static final int $stable = 8;
    private final PersistentOrderedMapLinksIterator<K, V> internal;

    public PersistentOrderedMapValuesIterator(PersistentOrderedMap<K, V> persistentOrderedMap) {
        this.internal = new PersistentOrderedMapLinksIterator<>(persistentOrderedMap.getFirstKey$runtime_release(), persistentOrderedMap.getHashMap$runtime_release());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.internal.hasNext();
    }

    @Override // java.util.Iterator
    public V next() {
        return this.internal.next().getValue();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
