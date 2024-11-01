package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.internal.StabilityInferred;
import d6.InterfaceC2767a;
import java.util.Iterator;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class PersistentOrderedMapBuilderValuesIterator<K, V> implements Iterator<V>, InterfaceC2767a {
    public static final int $stable = 8;
    private final PersistentOrderedMapBuilderLinksIterator<K, V> internal;

    public PersistentOrderedMapBuilderValuesIterator(PersistentOrderedMapBuilder<K, V> persistentOrderedMapBuilder) {
        this.internal = new PersistentOrderedMapBuilderLinksIterator<>(persistentOrderedMapBuilder.getFirstKey$runtime_release(), persistentOrderedMapBuilder);
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
        this.internal.remove();
    }
}
