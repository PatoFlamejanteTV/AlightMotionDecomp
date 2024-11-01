package androidx.collection;

import c6.InterfaceC2072n;
import c6.InterfaceC2074p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes.dex */
public final class LruCacheKt$lruCache$4<K, V> extends LruCache<K, V> {
    final /* synthetic */ Function1 $create;
    final /* synthetic */ InterfaceC2074p $onEntryRemoved;
    final /* synthetic */ InterfaceC2072n $sizeOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LruCacheKt$lruCache$4(int i8, InterfaceC2072n interfaceC2072n, Function1 function1, InterfaceC2074p interfaceC2074p) {
        super(i8);
        this.$sizeOf = interfaceC2072n;
        this.$create = function1;
        this.$onEntryRemoved = interfaceC2074p;
    }

    @Override // androidx.collection.LruCache
    protected V create(K key) {
        AbstractC3292y.i(key, "key");
        return (V) this.$create.invoke(key);
    }

    @Override // androidx.collection.LruCache
    protected void entryRemoved(boolean z8, K key, V oldValue, V v8) {
        AbstractC3292y.i(key, "key");
        AbstractC3292y.i(oldValue, "oldValue");
        this.$onEntryRemoved.invoke(Boolean.valueOf(z8), key, oldValue, v8);
    }

    @Override // androidx.collection.LruCache
    protected int sizeOf(K key, V value) {
        AbstractC3292y.i(key, "key");
        AbstractC3292y.i(value, "value");
        return ((Number) this.$sizeOf.invoke(key, value)).intValue();
    }
}
