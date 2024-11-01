package androidx.core.util;

import android.util.LruCache;
import c6.InterfaceC2072n;
import c6.InterfaceC2074p;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class LruCacheKt {
    public static final <K, V> LruCache<K, V> lruCache(int i8, InterfaceC2072n interfaceC2072n, Function1 function1, InterfaceC2074p interfaceC2074p) {
        return new LruCacheKt$lruCache$4(i8, interfaceC2072n, function1, interfaceC2074p);
    }

    public static /* synthetic */ LruCache lruCache$default(int i8, InterfaceC2072n interfaceC2072n, Function1 function1, InterfaceC2074p interfaceC2074p, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            interfaceC2072n = LruCacheKt$lruCache$1.INSTANCE;
        }
        if ((i9 & 4) != 0) {
            function1 = LruCacheKt$lruCache$2.INSTANCE;
        }
        if ((i9 & 8) != 0) {
            interfaceC2074p = LruCacheKt$lruCache$3.INSTANCE;
        }
        return new LruCacheKt$lruCache$4(i8, interfaceC2072n, function1, interfaceC2074p);
    }
}
