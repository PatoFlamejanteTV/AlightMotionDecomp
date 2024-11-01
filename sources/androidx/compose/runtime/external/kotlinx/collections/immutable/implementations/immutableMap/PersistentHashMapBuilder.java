package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import R5.AbstractC1423g;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import androidx.compose.runtime.internal.StabilityInferred;
import j$.util.Map;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public class PersistentHashMapBuilder<K, V> extends AbstractC1423g implements PersistentMap.Builder<K, V>, Map {
    public static final int $stable = 8;
    private PersistentHashMap<K, V> map;
    private int modCount;
    private TrieNode<K, V> node;
    private V operationResult;
    private MutabilityOwnership ownership = new MutabilityOwnership();
    private int size;

    public PersistentHashMapBuilder(PersistentHashMap<K, V> persistentHashMap) {
        this.map = persistentHashMap;
        this.node = this.map.getNode$runtime_release();
        this.size = this.map.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        TrieNode<K, V> eMPTY$runtime_release = TrieNode.Companion.getEMPTY$runtime_release();
        AbstractC3292y.g(eMPTY$runtime_release, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.node = eMPTY$runtime_release;
        setSize(0);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
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

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.AbstractMap, java.util.Map
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

    @Override // R5.AbstractC1423g
    public Set<Map.Entry<K, V>> getEntries() {
        return new PersistentHashMapBuilderEntries(this);
    }

    @Override // R5.AbstractC1423g
    public Set<K> getKeys() {
        return new PersistentHashMapBuilderKeys(this);
    }

    public final int getModCount$runtime_release() {
        return this.modCount;
    }

    public final TrieNode<K, V> getNode$runtime_release() {
        return this.node;
    }

    public final V getOperationResult$runtime_release() {
        return this.operationResult;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    public final MutabilityOwnership getOwnership() {
        return this.ownership;
    }

    @Override // R5.AbstractC1423g
    public int getSize() {
        return this.size;
    }

    @Override // R5.AbstractC1423g
    public Collection<V> getValues() {
        return new PersistentHashMapBuilderValues(this);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k8, V v8) {
        int i8;
        this.operationResult = null;
        TrieNode<K, V> trieNode = this.node;
        if (k8 != null) {
            i8 = k8.hashCode();
        } else {
            i8 = 0;
        }
        this.node = trieNode.mutablePut(i8, k8, v8, 0, this);
        return this.operationResult;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(java.util.Map<? extends K, ? extends V> map) {
        PersistentHashMap<K, V> persistentHashMap;
        PersistentHashMapBuilder persistentHashMapBuilder;
        if (map instanceof PersistentHashMap) {
            persistentHashMap = (PersistentHashMap) map;
        } else {
            persistentHashMap = null;
        }
        if (persistentHashMap == null) {
            if (map instanceof PersistentHashMapBuilder) {
                persistentHashMapBuilder = (PersistentHashMapBuilder) map;
            } else {
                persistentHashMapBuilder = null;
            }
            if (persistentHashMapBuilder != null) {
                persistentHashMap = persistentHashMapBuilder.build2();
            } else {
                persistentHashMap = null;
            }
        }
        if (persistentHashMap != null) {
            DeltaCounter deltaCounter = new DeltaCounter(0, 1, null);
            int size = size();
            TrieNode<K, V> trieNode = this.node;
            TrieNode<K, V> node$runtime_release = persistentHashMap.getNode$runtime_release();
            AbstractC3292y.g(node$runtime_release, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
            this.node = trieNode.mutablePutAll(node$runtime_release, 0, deltaCounter, this);
            int size2 = (persistentHashMap.size() + size) - deltaCounter.getCount();
            if (size != size2) {
                setSize(size2);
                return;
            }
            return;
        }
        super.putAll(map);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(K k8) {
        this.operationResult = null;
        TrieNode mutableRemove = this.node.mutableRemove(k8 != null ? k8.hashCode() : 0, k8, 0, this);
        if (mutableRemove == null) {
            mutableRemove = TrieNode.Companion.getEMPTY$runtime_release();
            AbstractC3292y.g(mutableRemove, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.node = mutableRemove;
        return this.operationResult;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    public final void setModCount$runtime_release(int i8) {
        this.modCount = i8;
    }

    public final void setNode$runtime_release(TrieNode<K, V> trieNode) {
        this.node = trieNode;
    }

    public final void setOperationResult$runtime_release(V v8) {
        this.operationResult = v8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setOwnership(MutabilityOwnership mutabilityOwnership) {
        this.ownership = mutabilityOwnership;
    }

    public void setSize(int i8) {
        this.size = i8;
        this.modCount++;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder
    /* renamed from: build */
    public PersistentHashMap<K, V> build2() {
        PersistentHashMap<K, V> persistentHashMap;
        if (this.node == this.map.getNode$runtime_release()) {
            persistentHashMap = this.map;
        } else {
            this.ownership = new MutabilityOwnership();
            persistentHashMap = new PersistentHashMap<>(this.node, size());
        }
        this.map = persistentHashMap;
        return persistentHashMap;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int size = size();
        TrieNode mutableRemove = this.node.mutableRemove(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (mutableRemove == null) {
            mutableRemove = TrieNode.Companion.getEMPTY$runtime_release();
            AbstractC3292y.g(mutableRemove, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.node = mutableRemove;
        return size != size();
    }
}
