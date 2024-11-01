package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import R5.AbstractC1420d;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public class PersistentHashMap<K, V> extends AbstractC1420d implements PersistentMap<K, V> {
    private final TrieNode<K, V> node;
    private final int size;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final PersistentHashMap EMPTY = new PersistentHashMap(TrieNode.Companion.getEMPTY$runtime_release(), 0);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final <K, V> PersistentHashMap<K, V> emptyOf$runtime_release() {
            PersistentHashMap<K, V> persistentHashMap = PersistentHashMap.EMPTY;
            AbstractC3292y.g(persistentHashMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
            return persistentHashMap;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public PersistentHashMap(TrieNode<K, V> trieNode, int i8) {
        this.node = trieNode;
        this.size = i8;
    }

    private final ImmutableSet<Map.Entry<K, V>> createEntries() {
        return new PersistentHashMapEntries(this);
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public PersistentMap<K, V> clear() {
        return Companion.emptyOf$runtime_release();
    }

    @Override // java.util.Map
    public boolean containsKey(K k8) {
        int i8;
        TrieNode<K, V> trieNode = this.node;
        if (k8 != null) {
            i8 = k8.hashCode();
        } else {
            i8 = 0;
        }
        return trieNode.containsKey(i8, k8, 0);
    }

    @Override // R5.AbstractC1420d, java.util.Map
    public final /* bridge */ ImmutableSet<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public V get(K k8) {
        int i8;
        TrieNode<K, V> trieNode = this.node;
        if (k8 != null) {
            i8 = k8.hashCode();
        } else {
            i8 = 0;
        }
        return trieNode.get(i8, k8, 0);
    }

    @Override // R5.AbstractC1420d, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    public ImmutableSet<Map.Entry<K, V>> getEntries() {
        return createEntries();
    }

    public final TrieNode<K, V> getNode$runtime_release() {
        return this.node;
    }

    @Override // R5.AbstractC1420d
    public int getSize() {
        return this.size;
    }

    @Override // R5.AbstractC1420d, java.util.Map
    public final /* bridge */ ImmutableSet<K> keySet() {
        return getKeys();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // R5.AbstractC1420d, java.util.Map
    public /* bridge */ /* synthetic */ PersistentMap put(Object obj, Object obj2) {
        return put((PersistentHashMap<K, V>) obj, obj2);
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public PersistentMap<K, V> putAll(Map<? extends K, ? extends V> map) {
        AbstractC3292y.g(this, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder<K, V> builder2 = builder2();
        builder2.putAll(map);
        return builder2.build2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // R5.AbstractC1420d, java.util.Map
    public /* bridge */ /* synthetic */ PersistentMap remove(Object obj) {
        return remove((PersistentHashMap<K, V>) obj);
    }

    @Override // R5.AbstractC1420d, java.util.Map
    public final /* bridge */ ImmutableCollection<V> values() {
        return getValues();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    /* renamed from: builder */
    public PersistentHashMapBuilder<K, V> builder2() {
        return new PersistentHashMapBuilder<>(this);
    }

    @Override // R5.AbstractC1420d, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    public final Set<Map.Entry<K, V>> getEntries() {
        return createEntries();
    }

    @Override // R5.AbstractC1420d, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    public ImmutableSet<K> getKeys() {
        return new PersistentHashMapKeys(this);
    }

    @Override // R5.AbstractC1420d, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    public ImmutableCollection<V> getValues() {
        return new PersistentHashMapValues(this);
    }

    @Override // R5.AbstractC1420d, java.util.Map
    public PersistentHashMap<K, V> put(K k8, V v8) {
        TrieNode.ModificationResult<K, V> put = this.node.put(k8 != null ? k8.hashCode() : 0, k8, v8, 0);
        return put == null ? this : new PersistentHashMap<>(put.getNode(), size() + put.getSizeDelta());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public /* bridge */ /* synthetic */ PersistentMap remove(Object obj, Object obj2) {
        return remove((PersistentHashMap<K, V>) obj, obj2);
    }

    @Override // R5.AbstractC1420d, java.util.Map
    public PersistentHashMap<K, V> remove(K k8) {
        TrieNode<K, V> remove = this.node.remove(k8 != null ? k8.hashCode() : 0, k8, 0);
        if (this.node == remove) {
            return this;
        }
        if (remove == null) {
            return Companion.emptyOf$runtime_release();
        }
        return new PersistentHashMap<>(remove, size() - 1);
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public PersistentHashMap<K, V> remove(K k8, V v8) {
        TrieNode<K, V> remove = this.node.remove(k8 != null ? k8.hashCode() : 0, k8, v8, 0);
        if (this.node == remove) {
            return this;
        }
        if (remove == null) {
            return Companion.emptyOf$runtime_release();
        }
        return new PersistentHashMap<>(remove, size() - 1);
    }
}
