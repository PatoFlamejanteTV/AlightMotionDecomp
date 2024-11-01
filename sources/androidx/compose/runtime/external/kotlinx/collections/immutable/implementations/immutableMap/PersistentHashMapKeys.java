package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import R5.AbstractC1425i;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class PersistentHashMapKeys<K, V> extends AbstractC1425i implements ImmutableSet<K> {
    public static final int $stable = 8;
    private final PersistentHashMap<K, V> map;

    public PersistentHashMapKeys(PersistentHashMap<K, V> persistentHashMap) {
        this.map = persistentHashMap;
    }

    @Override // R5.AbstractC1417a, java.util.Collection
    public boolean contains(Object obj) {
        return this.map.containsKey(obj);
    }

    @Override // R5.AbstractC1417a
    public int getSize() {
        return this.map.size();
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<K> iterator() {
        return new PersistentHashMapKeysIterator(this.map.getNode$runtime_release());
    }
}
