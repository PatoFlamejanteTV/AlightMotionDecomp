package androidx.core.util;

import android.util.LruCache;
import c6.InterfaceC2072n;
import c6.InterfaceC2074p;
import kotlin.jvm.functions.Function1;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes3.dex */
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

    @Override // android.util.LruCache
    protected V create(K k8) {
        return (V) this.$create.invoke(k8);
    }

    @Override // android.util.LruCache
    protected void entryRemoved(boolean z8, K k8, V v8, V v9) {
        this.$onEntryRemoved.invoke(Boolean.valueOf(z8), k8, v8, v9);
    }

    @Override // android.util.LruCache
    protected int sizeOf(K k8, V v8) {
        return ((Number) this.$sizeOf.invoke(k8, v8)).intValue();
    }
}
