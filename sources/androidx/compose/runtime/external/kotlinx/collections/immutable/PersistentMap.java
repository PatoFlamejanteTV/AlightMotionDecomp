package androidx.compose.runtime.external.kotlinx.collections.immutable;

import d6.InterfaceC2770d;
import java.util.Map;

/* loaded from: classes.dex */
public interface PersistentMap<K, V> extends ImmutableMap<K, V> {

    /* loaded from: classes.dex */
    public interface Builder<K, V> extends Map<K, V>, InterfaceC2770d {
        PersistentMap<K, V> build();
    }

    Builder<K, V> builder();

    @Override // java.util.Map
    PersistentMap<K, V> clear();

    @Override // java.util.Map
    PersistentMap<K, V> put(K k8, V v8);

    @Override // java.util.Map
    PersistentMap<K, V> putAll(Map<? extends K, ? extends V> map);

    @Override // java.util.Map
    PersistentMap<K, V> remove(K k8);

    @Override // java.util.Map
    PersistentMap<K, V> remove(K k8, V v8);
}
