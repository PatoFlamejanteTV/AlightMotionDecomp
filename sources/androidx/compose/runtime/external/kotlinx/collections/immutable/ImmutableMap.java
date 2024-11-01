package androidx.compose.runtime.external.kotlinx.collections.immutable;

import d6.InterfaceC2767a;
import java.util.Map;

/* loaded from: classes.dex */
public interface ImmutableMap<K, V> extends Map<K, V>, InterfaceC2767a {
    ImmutableSet<Map.Entry<K, V>> getEntries();

    ImmutableSet<K> getKeys();

    ImmutableCollection<V> getValues();
}
