package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.internal.StabilityInferred;
import d6.InterfaceC2767a;
import java.util.Iterator;
import java.util.Map;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class PersistentOrderedMapBuilderEntriesIterator<K, V> implements Iterator<Map.Entry<K, V>>, InterfaceC2767a {
    public static final int $stable = 8;
    private final PersistentOrderedMapBuilderLinksIterator<K, V> internal;

    public PersistentOrderedMapBuilderEntriesIterator(PersistentOrderedMapBuilder<K, V> persistentOrderedMapBuilder) {
        this.internal = new PersistentOrderedMapBuilderLinksIterator<>(persistentOrderedMapBuilder.getFirstKey$runtime_release(), persistentOrderedMapBuilder);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.internal.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.internal.remove();
    }

    @Override // java.util.Iterator
    public Map.Entry<K, V> next() {
        return new MutableMapEntry(this.internal.getBuilder$runtime_release().getHashMapBuilder$runtime_release(), this.internal.getLastIteratedKey$runtime_release(), this.internal.next());
    }
}
