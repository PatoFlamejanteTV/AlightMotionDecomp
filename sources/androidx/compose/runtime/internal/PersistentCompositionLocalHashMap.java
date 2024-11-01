package androidx.compose.runtime.internal;

import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.CompositionLocalMapKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.State;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import j$.util.Map;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class PersistentCompositionLocalHashMap extends PersistentHashMap<CompositionLocal<Object>, State<? extends Object>> implements PersistentCompositionLocalMap, Map {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final PersistentCompositionLocalHashMap Empty;

    @StabilityInferred(parameters = 0)
    /* loaded from: classes.dex */
    public static final class Builder extends PersistentHashMapBuilder<CompositionLocal<Object>, State<? extends Object>> implements PersistentCompositionLocalMap.Builder, Map {
        public static final int $stable = 8;
        private PersistentCompositionLocalHashMap map;

        public Builder(PersistentCompositionLocalHashMap persistentCompositionLocalHashMap) {
            super(persistentCompositionLocalHashMap);
            this.map = persistentCompositionLocalHashMap;
        }

        public /* bridge */ boolean containsKey(CompositionLocal<Object> compositionLocal) {
            return super.containsKey((Builder) compositionLocal);
        }

        public /* bridge */ boolean containsValue(State<? extends Object> state) {
            return super.containsValue((Object) state);
        }

        public /* bridge */ State<Object> get(CompositionLocal<Object> compositionLocal) {
            return (State) super.get((Builder) compositionLocal);
        }

        public final PersistentCompositionLocalHashMap getMap$runtime_release() {
            return this.map;
        }

        public /* bridge */ State<Object> getOrDefault(CompositionLocal<Object> compositionLocal, State<? extends Object> state) {
            return (State) Map.CC.$default$getOrDefault(this, compositionLocal, state);
        }

        public /* bridge */ State<Object> remove(CompositionLocal<Object> compositionLocal) {
            return (State) super.remove((Builder) compositionLocal);
        }

        public final void setMap$runtime_release(PersistentCompositionLocalHashMap persistentCompositionLocalHashMap) {
            this.map = persistentCompositionLocalHashMap;
        }

        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof CompositionLocal) {
                return containsKey((CompositionLocal<Object>) obj);
            }
            return false;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof State) {
                return containsValue((State<? extends Object>) obj);
            }
            return false;
        }

        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, java.util.AbstractMap, java.util.Map
        public final /* bridge */ State<Object> get(Object obj) {
            if (obj instanceof CompositionLocal) {
                return get((CompositionLocal<Object>) obj);
            }
            return null;
        }

        public final /* bridge */ State getOrDefault(Object obj, State state) {
            return !(obj instanceof CompositionLocal) ? state : getOrDefault((CompositionLocal<Object>) obj, (State<? extends Object>) state);
        }

        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, java.util.AbstractMap, java.util.Map
        public final /* bridge */ State<Object> remove(Object obj) {
            if (obj instanceof CompositionLocal) {
                return remove((CompositionLocal<Object>) obj);
            }
            return null;
        }

        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (obj instanceof CompositionLocal) {
                return get((CompositionLocal<Object>) obj);
            }
            return null;
        }

        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, java.util.Map, j$.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof CompositionLocal) ? obj2 : getOrDefault((CompositionLocal<Object>) obj, (State<? extends Object>) obj2);
        }

        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (obj instanceof CompositionLocal) {
                return remove((CompositionLocal<Object>) obj);
            }
            return null;
        }

        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder
        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public PersistentMap<CompositionLocal<Object>, State<? extends Object>> build2() {
            PersistentCompositionLocalHashMap persistentCompositionLocalHashMap;
            if (getNode$runtime_release() == this.map.getNode$runtime_release()) {
                persistentCompositionLocalHashMap = this.map;
            } else {
                setOwnership(new MutabilityOwnership());
                persistentCompositionLocalHashMap = new PersistentCompositionLocalHashMap(getNode$runtime_release(), size());
            }
            this.map = persistentCompositionLocalHashMap;
            return persistentCompositionLocalHashMap;
        }
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ void getEmpty$annotations() {
        }

        public final PersistentCompositionLocalHashMap getEmpty() {
            return PersistentCompositionLocalHashMap.Empty;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    static {
        TrieNode eMPTY$runtime_release = TrieNode.Companion.getEMPTY$runtime_release();
        AbstractC3292y.g(eMPTY$runtime_release, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>");
        Empty = new PersistentCompositionLocalHashMap(eMPTY$runtime_release, 0);
    }

    public PersistentCompositionLocalHashMap(TrieNode<CompositionLocal<Object>, State<Object>> trieNode, int i8) {
        super(trieNode, i8);
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

    public /* bridge */ boolean containsKey(CompositionLocal<Object> compositionLocal) {
        return super.containsKey((PersistentCompositionLocalHashMap) compositionLocal);
    }

    public /* bridge */ boolean containsValue(State<? extends Object> state) {
        return super.containsValue((Object) state);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // androidx.compose.runtime.CompositionLocalMap
    public /* bridge */ State<Object> get(CompositionLocal<Object> compositionLocal) {
        return (State) super.get((PersistentCompositionLocalHashMap) compositionLocal);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap, R5.AbstractC1420d, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    public ImmutableSet<Map.Entry<CompositionLocal<Object>, State<Object>>> getEntries() {
        return super.getEntries();
    }

    public /* bridge */ State<Object> getOrDefault(CompositionLocal<Object> compositionLocal, State<? extends Object> state) {
        return (State) Map.CC.$default$getOrDefault(this, compositionLocal, state);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // androidx.compose.runtime.PersistentCompositionLocalMap
    public PersistentCompositionLocalMap putValue(CompositionLocal<Object> compositionLocal, State<? extends Object> state) {
        TrieNode.ModificationResult<CompositionLocal<Object>, State<? extends Object>> put = getNode$runtime_release().put(compositionLocal.hashCode(), compositionLocal, state, 0);
        if (put == null) {
            return this;
        }
        return new PersistentCompositionLocalHashMap(put.getNode(), size() + put.getSizeDelta());
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof CompositionLocal) {
            return containsKey((CompositionLocal<Object>) obj);
        }
        return false;
    }

    @Override // R5.AbstractC1420d, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof State) {
            return containsValue((State<? extends Object>) obj);
        }
        return false;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap, java.util.Map
    public final /* bridge */ State<Object> get(Object obj) {
        if (obj instanceof CompositionLocal) {
            return get((CompositionLocal<Object>) obj);
        }
        return null;
    }

    public final /* bridge */ State getOrDefault(Object obj, State state) {
        return !(obj instanceof CompositionLocal) ? state : getOrDefault((CompositionLocal<Object>) obj, (State<? extends Object>) state);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj instanceof CompositionLocal) {
            return get((CompositionLocal<Object>) obj);
        }
        return null;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof CompositionLocal) ? obj2 : getOrDefault((CompositionLocal<Object>) obj, (State<? extends Object>) obj2);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    /* renamed from: builder, reason: merged with bridge method [inline-methods] */
    public PersistentMap.Builder<CompositionLocal<Object>, State<? extends Object>> builder2() {
        return new Builder(this);
    }

    @Override // androidx.compose.runtime.CompositionLocalMap
    public <T> T get(CompositionLocal<T> compositionLocal) {
        return (T) CompositionLocalMapKt.read(this, compositionLocal);
    }
}
