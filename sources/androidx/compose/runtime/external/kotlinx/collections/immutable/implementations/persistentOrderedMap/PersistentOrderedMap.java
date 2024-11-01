package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import R5.AbstractC1420d;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class PersistentOrderedMap<K, V> extends AbstractC1420d implements PersistentMap<K, V> {
    private static final PersistentOrderedMap EMPTY;
    private final Object firstKey;
    private final PersistentHashMap<K, LinkedValue<V>> hashMap;
    private final Object lastKey;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final <K, V> PersistentOrderedMap<K, V> emptyOf$runtime_release() {
            PersistentOrderedMap<K, V> persistentOrderedMap = PersistentOrderedMap.EMPTY;
            AbstractC3292y.g(persistentOrderedMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.Companion.emptyOf>");
            return persistentOrderedMap;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    static {
        EndOfChain endOfChain = EndOfChain.INSTANCE;
        EMPTY = new PersistentOrderedMap(endOfChain, endOfChain, PersistentHashMap.Companion.emptyOf$runtime_release());
    }

    public PersistentOrderedMap(Object obj, Object obj2, PersistentHashMap<K, LinkedValue<V>> persistentHashMap) {
        this.firstKey = obj;
        this.lastKey = obj2;
        this.hashMap = persistentHashMap;
    }

    private final ImmutableSet<Map.Entry<K, V>> createEntries() {
        return new PersistentOrderedMapEntries(this);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    /* renamed from: builder */
    public PersistentMap.Builder<K, V> builder2() {
        return new PersistentOrderedMapBuilder(this);
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public PersistentMap<K, V> clear() {
        return Companion.emptyOf$runtime_release();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.hashMap.containsKey(obj);
    }

    @Override // R5.AbstractC1420d, java.util.Map
    public final /* bridge */ ImmutableSet<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public V get(Object obj) {
        LinkedValue<V> linkedValue = this.hashMap.get(obj);
        if (linkedValue != null) {
            return linkedValue.getValue();
        }
        return null;
    }

    @Override // R5.AbstractC1420d, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    public ImmutableSet<Map.Entry<K, V>> getEntries() {
        return createEntries();
    }

    public final Object getFirstKey$runtime_release() {
        return this.firstKey;
    }

    public final PersistentHashMap<K, LinkedValue<V>> getHashMap$runtime_release() {
        return this.hashMap;
    }

    public final Object getLastKey$runtime_release() {
        return this.lastKey;
    }

    @Override // R5.AbstractC1420d
    public int getSize() {
        return this.hashMap.size();
    }

    @Override // R5.AbstractC1420d, java.util.Map
    public final /* bridge */ ImmutableSet<K> keySet() {
        return getKeys();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // R5.AbstractC1420d, java.util.Map
    public /* bridge */ /* synthetic */ PersistentMap put(Object obj, Object obj2) {
        return put((PersistentOrderedMap<K, V>) obj, obj2);
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
        return remove((PersistentOrderedMap<K, V>) obj);
    }

    @Override // R5.AbstractC1420d, java.util.Map
    public final /* bridge */ ImmutableCollection<V> values() {
        return getValues();
    }

    @Override // R5.AbstractC1420d, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    public final Set<Map.Entry<K, V>> getEntries() {
        return createEntries();
    }

    @Override // R5.AbstractC1420d, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    public ImmutableSet<K> getKeys() {
        return new PersistentOrderedMapKeys(this);
    }

    @Override // R5.AbstractC1420d, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    public ImmutableCollection<V> getValues() {
        return new PersistentOrderedMapValues(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // R5.AbstractC1420d, java.util.Map
    public PersistentOrderedMap<K, V> put(K k8, V v8) {
        if (isEmpty()) {
            return new PersistentOrderedMap<>(k8, k8, this.hashMap.put((PersistentHashMap<K, LinkedValue<V>>) k8, (K) new LinkedValue<>(v8)));
        }
        LinkedValue<V> linkedValue = this.hashMap.get(k8);
        if (linkedValue != null) {
            if (linkedValue.getValue() == v8) {
                return this;
            }
            return new PersistentOrderedMap<>(this.firstKey, this.lastKey, this.hashMap.put((PersistentHashMap<K, LinkedValue<V>>) k8, (K) linkedValue.withValue(v8)));
        }
        Object obj = this.lastKey;
        Object obj2 = this.hashMap.get(obj);
        AbstractC3292y.f(obj2);
        return new PersistentOrderedMap<>(this.firstKey, k8, this.hashMap.put((PersistentHashMap<K, LinkedValue<V>>) obj, (Object) ((LinkedValue) obj2).withNext(k8)).put((PersistentHashMap) k8, (K) new LinkedValue(v8, obj)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public /* bridge */ /* synthetic */ PersistentMap remove(Object obj, Object obj2) {
        return remove((PersistentOrderedMap<K, V>) obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // R5.AbstractC1420d, java.util.Map
    public PersistentOrderedMap<K, V> remove(K k8) {
        LinkedValue<V> linkedValue = this.hashMap.get(k8);
        if (linkedValue == null) {
            return this;
        }
        PersistentHashMap<K, LinkedValue<V>> remove = this.hashMap.remove((PersistentHashMap<K, LinkedValue<V>>) k8);
        ?? r52 = remove;
        if (linkedValue.getHasPrevious()) {
            Object obj = remove.get(linkedValue.getPrevious());
            AbstractC3292y.f(obj);
            r52 = (PersistentHashMap<K, LinkedValue<V>>) remove.put((PersistentHashMap<K, LinkedValue<V>>) linkedValue.getPrevious(), (Object) ((LinkedValue) obj).withNext(linkedValue.getNext()));
        }
        PersistentHashMap persistentHashMap = r52;
        if (linkedValue.getHasNext()) {
            Object obj2 = r52.get(linkedValue.getNext());
            AbstractC3292y.f(obj2);
            persistentHashMap = r52.put(linkedValue.getNext(), ((LinkedValue) obj2).withPrevious(linkedValue.getPrevious()));
        }
        return new PersistentOrderedMap<>(!linkedValue.getHasPrevious() ? linkedValue.getNext() : this.firstKey, !linkedValue.getHasNext() ? linkedValue.getPrevious() : this.lastKey, persistentHashMap);
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public PersistentOrderedMap<K, V> remove(K k8, V v8) {
        LinkedValue<V> linkedValue = this.hashMap.get(k8);
        if (linkedValue != null && AbstractC3292y.d(linkedValue.getValue(), v8)) {
            return remove((PersistentOrderedMap<K, V>) k8);
        }
        return this;
    }
}
