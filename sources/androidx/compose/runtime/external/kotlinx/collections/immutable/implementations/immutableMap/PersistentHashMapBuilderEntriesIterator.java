package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.StabilityInferred;
import d6.InterfaceC2767a;
import java.util.Iterator;
import java.util.Map;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class PersistentHashMapBuilderEntriesIterator<K, V> implements Iterator<Map.Entry<K, V>>, InterfaceC2767a {
    public static final int $stable = 8;
    private final PersistentHashMapBuilderBaseIterator<K, V, Map.Entry<K, V>> base;

    public PersistentHashMapBuilderEntriesIterator(PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        TrieNodeBaseIterator[] trieNodeBaseIteratorArr = new TrieNodeBaseIterator[8];
        for (int i8 = 0; i8 < 8; i8++) {
            trieNodeBaseIteratorArr[i8] = new TrieNodeMutableEntriesIterator(this);
        }
        this.base = new PersistentHashMapBuilderBaseIterator<>(persistentHashMapBuilder, trieNodeBaseIteratorArr);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.base.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.base.remove();
    }

    public final void setValue(K k8, V v8) {
        this.base.setValue(k8, v8);
    }

    @Override // java.util.Iterator
    public Map.Entry<K, V> next() {
        return this.base.next();
    }
}
