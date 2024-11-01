package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry;
import d6.InterfaceC2770d;
import java.util.Map;

/* loaded from: classes.dex */
final class MutableMapEntry<K, V> extends MapEntry<K, V> implements Map.Entry<K, V>, InterfaceC2770d.a {
    private LinkedValue<V> links;
    private final Map<K, LinkedValue<V>> mutableMap;

    public MutableMapEntry(Map<K, LinkedValue<V>> map, K k8, LinkedValue<V> linkedValue) {
        super(k8, linkedValue.getValue());
        this.mutableMap = map;
        this.links = linkedValue;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry, java.util.Map.Entry
    public V getValue() {
        return this.links.getValue();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry, java.util.Map.Entry
    public V setValue(V v8) {
        V value = this.links.getValue();
        this.links = this.links.withValue(v8);
        this.mutableMap.put(getKey(), this.links);
        return value;
    }
}
