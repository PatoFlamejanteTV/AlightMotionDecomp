package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.StabilityInferred;
import d6.InterfaceC2767a;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 3)
/* loaded from: classes.dex */
public class MapEntry<K, V> implements Map.Entry<K, V>, InterfaceC2767a {
    public static final int $stable = 0;
    private final K key;
    private final V value;

    public MapEntry(K k8, V v8) {
        this.key = k8;
        this.value = v8;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        Map.Entry entry;
        if (obj instanceof Map.Entry) {
            entry = (Map.Entry) obj;
        } else {
            entry = null;
        }
        if (entry == null || !AbstractC3292y.d(entry.getKey(), getKey()) || !AbstractC3292y.d(entry.getValue(), getValue())) {
            return false;
        }
        return true;
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
    public int hashCode() {
        int i8;
        K key = getKey();
        int i9 = 0;
        if (key != null) {
            i8 = key.hashCode();
        } else {
            i8 = 0;
        }
        V value = getValue();
        if (value != null) {
            i9 = value.hashCode();
        }
        return i8 ^ i9;
    }

    @Override // java.util.Map.Entry
    public V setValue(V v8) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
