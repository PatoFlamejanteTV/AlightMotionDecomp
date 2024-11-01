package androidx.collection;

import c6.InterfaceC2072n;
import c6.InterfaceC2074p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class LruCacheKt {
    public static final <K, V> LruCache<K, V> lruCache(int i8, InterfaceC2072n sizeOf, Function1 create, InterfaceC2074p onEntryRemoved) {
        AbstractC3292y.i(sizeOf, "sizeOf");
        AbstractC3292y.i(create, "create");
        AbstractC3292y.i(onEntryRemoved, "onEntryRemoved");
        return new LruCacheKt$lruCache$4(i8, sizeOf, create, onEntryRemoved);
    }

    public static /* synthetic */ LruCache lruCache$default(int i8, InterfaceC2072n sizeOf, Function1 create, InterfaceC2074p onEntryRemoved, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            sizeOf = LruCacheKt$lruCache$1.INSTANCE;
        }
        if ((i9 & 4) != 0) {
            create = LruCacheKt$lruCache$2.INSTANCE;
        }
        if ((i9 & 8) != 0) {
            onEntryRemoved = LruCacheKt$lruCache$3.INSTANCE;
        }
        AbstractC3292y.i(sizeOf, "sizeOf");
        AbstractC3292y.i(create, "create");
        AbstractC3292y.i(onEntryRemoved, "onEntryRemoved");
        return new LruCacheKt$lruCache$4(i8, sizeOf, create, onEntryRemoved);
    }
}
