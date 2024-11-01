package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import R5.AbstractC1425i;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class PersistentHashMapEntries<K, V> extends AbstractC1425i implements ImmutableSet<Map.Entry<? extends K, ? extends V>> {
    public static final int $stable = 8;
    private final PersistentHashMap<K, V> map;

    public PersistentHashMapEntries(PersistentHashMap<K, V> persistentHashMap) {
        this.map = persistentHashMap;
    }

    @Override // R5.AbstractC1417a, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return contains((Map.Entry) obj);
        }
        return false;
    }

    @Override // R5.AbstractC1417a
    public int getSize() {
        return this.map.size();
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<K, V>> iterator() {
        return new PersistentHashMapEntriesIterator(this.map.getNode$runtime_release());
    }

    public boolean contains(Map.Entry<? extends K, ? extends V> entry) {
        if (!(entry instanceof Map.Entry)) {
            return false;
        }
        V v8 = this.map.get(entry.getKey());
        return v8 != null ? AbstractC3292y.d(v8, entry.getValue()) : entry.getValue() == null && this.map.containsKey(entry.getKey());
    }
}
