package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import R5.AbstractC1423g;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
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
public final class PersistentOrderedMapBuilder<K, V> extends AbstractC1423g implements PersistentMap.Builder<K, V>, Map {
    public static final int $stable = 8;
    private Object firstKey;
    private final PersistentHashMapBuilder<K, LinkedValue<V>> hashMapBuilder;
    private Object lastKey;
    private PersistentOrderedMap<K, V> map;

    public PersistentOrderedMapBuilder(PersistentOrderedMap<K, V> persistentOrderedMap) {
        this.map = persistentOrderedMap;
        this.firstKey = persistentOrderedMap.getFirstKey$runtime_release();
        this.lastKey = this.map.getLastKey$runtime_release();
        this.hashMapBuilder = this.map.getHashMap$runtime_release().builder();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder
    public PersistentMap<K, V> build() {
        PersistentOrderedMap<K, V> persistentOrderedMap;
        boolean z8;
        PersistentHashMap<K, LinkedValue<V>> build = this.hashMapBuilder.build();
        if (build == this.map.getHashMap$runtime_release()) {
            boolean z9 = false;
            if (this.firstKey == this.map.getFirstKey$runtime_release()) {
                z8 = true;
            } else {
                z8 = false;
            }
            CommonFunctionsKt.m2559assert(z8);
            if (this.lastKey == this.map.getLastKey$runtime_release()) {
                z9 = true;
            }
            CommonFunctionsKt.m2559assert(z9);
            persistentOrderedMap = this.map;
        } else {
            persistentOrderedMap = new PersistentOrderedMap<>(this.firstKey, this.lastKey, build);
        }
        this.map = persistentOrderedMap;
        return persistentOrderedMap;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.hashMapBuilder.clear();
        EndOfChain endOfChain = EndOfChain.INSTANCE;
        this.firstKey = endOfChain;
        this.lastKey = endOfChain;
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
    public boolean containsKey(Object obj) {
        return this.hashMapBuilder.containsKey(obj);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        LinkedValue<V> linkedValue = this.hashMapBuilder.get(obj);
        if (linkedValue != null) {
            return linkedValue.getValue();
        }
        return null;
    }

    @Override // R5.AbstractC1423g
    public Set<Map.Entry<K, V>> getEntries() {
        return new PersistentOrderedMapBuilderEntries(this);
    }

    public final Object getFirstKey$runtime_release() {
        return this.firstKey;
    }

    public final PersistentHashMapBuilder<K, LinkedValue<V>> getHashMapBuilder$runtime_release() {
        return this.hashMapBuilder;
    }

    @Override // R5.AbstractC1423g
    public Set<K> getKeys() {
        return new PersistentOrderedMapBuilderKeys(this);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    @Override // R5.AbstractC1423g
    public int getSize() {
        return this.hashMapBuilder.size();
    }

    @Override // R5.AbstractC1423g
    public Collection<V> getValues() {
        return new PersistentOrderedMapBuilderValues(this);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k8, V v8) {
        LinkedValue<V> linkedValue = this.hashMapBuilder.get(k8);
        if (linkedValue != null) {
            if (linkedValue.getValue() == v8) {
                return v8;
            }
            this.hashMapBuilder.put(k8, linkedValue.withValue(v8));
            return linkedValue.getValue();
        }
        if (isEmpty()) {
            this.firstKey = k8;
            this.lastKey = k8;
            this.hashMapBuilder.put(k8, new LinkedValue<>(v8));
            return null;
        }
        Object obj = this.lastKey;
        Object obj2 = this.hashMapBuilder.get(obj);
        AbstractC3292y.f(obj2);
        CommonFunctionsKt.m2559assert(!r2.getHasNext());
        this.hashMapBuilder.put(obj, ((LinkedValue) obj2).withNext(k8));
        this.hashMapBuilder.put(k8, new LinkedValue<>(v8, obj));
        this.lastKey = k8;
        return null;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        LinkedValue<V> remove = this.hashMapBuilder.remove(obj);
        if (remove == null) {
            return null;
        }
        if (remove.getHasPrevious()) {
            LinkedValue<V> linkedValue = this.hashMapBuilder.get(remove.getPrevious());
            AbstractC3292y.f(linkedValue);
            this.hashMapBuilder.put(remove.getPrevious(), linkedValue.withNext(remove.getNext()));
        } else {
            this.firstKey = remove.getNext();
        }
        if (remove.getHasNext()) {
            LinkedValue<V> linkedValue2 = this.hashMapBuilder.get(remove.getNext());
            AbstractC3292y.f(linkedValue2);
            this.hashMapBuilder.put(remove.getNext(), linkedValue2.withPrevious(remove.getPrevious()));
        } else {
            this.lastKey = remove.getPrevious();
        }
        return remove.getValue();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        LinkedValue<V> linkedValue = this.hashMapBuilder.get(obj);
        if (linkedValue == null || !AbstractC3292y.d(linkedValue.getValue(), obj2)) {
            return false;
        }
        remove(obj);
        return true;
    }
}
