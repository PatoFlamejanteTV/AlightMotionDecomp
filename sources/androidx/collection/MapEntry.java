package androidx.collection;

import d6.InterfaceC2767a;
import java.util.Map;

/* loaded from: classes.dex */
final class MapEntry<K, V> implements Map.Entry<K, V>, InterfaceC2767a {
    private final K key;
    private final V value;

    public MapEntry(K k8, V v8) {
        this.key = k8;
        this.value = v8;
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return this.key;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.value;
    }

    @Override // java.util.Map.Entry
    public V setValue(V v8) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
