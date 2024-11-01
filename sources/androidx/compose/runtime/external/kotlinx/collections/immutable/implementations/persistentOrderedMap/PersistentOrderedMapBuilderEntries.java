package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.AbstractMapBuilderEntries;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class PersistentOrderedMapBuilderEntries<K, V> extends AbstractMapBuilderEntries<Map.Entry<K, V>, K, V> {
    public static final int $stable = 8;
    private final PersistentOrderedMapBuilder<K, V> builder;

    public PersistentOrderedMapBuilderEntries(PersistentOrderedMapBuilder<K, V> persistentOrderedMapBuilder) {
        this.builder = persistentOrderedMapBuilder;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.builder.clear();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.AbstractMapBuilderEntries
    public boolean containsEntry(Map.Entry<? extends K, ? extends V> entry) {
        V v8 = this.builder.get(entry.getKey());
        if (v8 != null) {
            return AbstractC3292y.d(v8, entry.getValue());
        }
        if (entry.getValue() == null && this.builder.containsKey(entry.getKey())) {
            return true;
        }
        return false;
    }

    @Override // R5.AbstractC1424h
    public int getSize() {
        return this.builder.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<K, V>> iterator() {
        return new PersistentOrderedMapBuilderEntriesIterator(this.builder);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.AbstractMapBuilderEntries
    public boolean removeEntry(Map.Entry<? extends K, ? extends V> entry) {
        return this.builder.remove(entry.getKey(), entry.getValue());
    }

    @Override // R5.AbstractC1424h, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Map.Entry<K, V> entry) {
        throw new UnsupportedOperationException();
    }
}
