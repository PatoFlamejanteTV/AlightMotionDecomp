package androidx.compose.runtime.collection;

import R5.AbstractC1428l;
import d6.InterfaceC2767a;
import j$.util.Map;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: Add missing generic type declarations: [Value, Key] */
/* loaded from: classes.dex */
public final class IdentityArrayMap$asMap$1<Key, Value> implements Map<Key, Value>, InterfaceC2767a, j$.util.Map {
    final /* synthetic */ IdentityArrayMap<Key, Value> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public IdentityArrayMap$asMap$1(IdentityArrayMap<Key, Value> identityArrayMap) {
        this.this$0 = identityArrayMap;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public Value compute(Key key, BiFunction<? super Key, ? super Value, ? extends Value> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public Value computeIfAbsent(Key key, Function<? super Key, ? extends Value> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public Value computeIfPresent(Key key, BiFunction<? super Key, ? super Value, ? extends Value> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        if (obj == null || this.this$0.get(obj) == null) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return AbstractC1428l.W(this.this$0.getValues(), obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<Key, Value>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public Value get(Object obj) {
        if (obj == null) {
            return null;
        }
        return this.this$0.get(obj);
    }

    public Set<Map.Entry<Key, Value>> getEntries() {
        return new IdentityArrayMap$asMap$1$entries$1(this.this$0);
    }

    public Set<Key> getKeys() {
        return new IdentityArrayMap$asMap$1$keys$1(this.this$0);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    public int getSize() {
        return this.this$0.getSize();
    }

    public Collection<Value> getValues() {
        return new IdentityArrayMap$asMap$1$values$1(this.this$0);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.this$0.isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Key> keySet() {
        return getKeys();
    }

    @Override // java.util.Map, j$.util.Map
    public Value merge(Key key, Value value, BiFunction<? super Value, ? super Value, ? extends Value> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Value put(Key key, Value value) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(java.util.Map<? extends Key, ? extends Value> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public Value putIfAbsent(Key key, Value value) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Value remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public Value replace(Key key, Value value) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public void replaceAll(BiFunction<? super Key, ? super Value, ? extends Value> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<Value> values() {
        return getValues();
    }

    @Override // java.util.Map, j$.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public boolean replace(Key key, Value value, Value value2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
