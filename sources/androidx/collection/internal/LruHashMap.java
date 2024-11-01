package androidx.collection.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class LruHashMap<K, V> {
    private final LinkedHashMap<K, V> map;

    public LruHashMap() {
        this(0, 0.0f, 3, null);
    }

    public final V get(K key) {
        AbstractC3292y.i(key, "key");
        return this.map.get(key);
    }

    public final Set<Map.Entry<K, V>> getEntries() {
        Set<Map.Entry<K, V>> entrySet = this.map.entrySet();
        AbstractC3292y.h(entrySet, "map.entries");
        return entrySet;
    }

    public final boolean isEmpty() {
        return this.map.isEmpty();
    }

    public final V put(K key, V value) {
        AbstractC3292y.i(key, "key");
        AbstractC3292y.i(value, "value");
        return this.map.put(key, value);
    }

    public final V remove(K key) {
        AbstractC3292y.i(key, "key");
        return this.map.remove(key);
    }

    public LruHashMap(int i8, float f8) {
        this.map = new LinkedHashMap<>(i8, f8, true);
    }

    public /* synthetic */ LruHashMap(int i8, float f8, int i9, AbstractC3284p abstractC3284p) {
        this((i9 & 1) != 0 ? 16 : i8, (i9 & 2) != 0 ? 0.75f : f8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LruHashMap(LruHashMap<? extends K, V> original) {
        this(0, 0.0f, 3, null);
        AbstractC3292y.i(original, "original");
        for (Map.Entry<? extends K, V> entry : original.getEntries()) {
            put(entry.getKey(), entry.getValue());
        }
    }
}
