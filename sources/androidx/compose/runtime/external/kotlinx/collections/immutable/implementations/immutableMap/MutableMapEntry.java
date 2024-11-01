package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import d6.InterfaceC2770d;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class MutableMapEntry<K, V> extends MapEntry<K, V> implements Map.Entry<K, V>, InterfaceC2770d.a {
    private final PersistentHashMapBuilderEntriesIterator<K, V> parentIterator;
    private V value;

    public MutableMapEntry(PersistentHashMapBuilderEntriesIterator<K, V> persistentHashMapBuilderEntriesIterator, K k8, V v8) {
        super(k8, v8);
        this.parentIterator = persistentHashMapBuilderEntriesIterator;
        this.value = v8;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry, java.util.Map.Entry
    public V getValue() {
        return this.value;
    }

    @Override // java.util.Map.Entry
    public void setValue(V v8) {
        this.value = v8;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry, java.util.Map.Entry
    public V setValue(V v8) {
        V value = getValue();
        setValue((MutableMapEntry<K, V>) v8);
        this.parentIterator.setValue(getKey(), v8);
        return value;
    }
}
