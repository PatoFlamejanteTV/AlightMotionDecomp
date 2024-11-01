package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import R5.AbstractC1421e;
import androidx.compose.runtime.internal.StabilityInferred;
import d6.InterfaceC2768b;
import java.util.Collection;
import java.util.Iterator;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class PersistentOrderedMapBuilderValues<K, V> extends AbstractC1421e implements Collection<V>, InterfaceC2768b {
    public static final int $stable = 8;
    private final PersistentOrderedMapBuilder<K, V> builder;

    public PersistentOrderedMapBuilderValues(PersistentOrderedMapBuilder<K, V> persistentOrderedMapBuilder) {
        this.builder = persistentOrderedMapBuilder;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(V v8) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.builder.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.builder.containsValue(obj);
    }

    @Override // R5.AbstractC1421e
    public int getSize() {
        return this.builder.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        return new PersistentOrderedMapBuilderValuesIterator(this.builder);
    }
}
