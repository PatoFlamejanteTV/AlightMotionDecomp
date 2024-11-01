package androidx.compose.foundation.lazy.layout;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static Object a(LazyLayoutItemProvider lazyLayoutItemProvider, int i8) {
        return null;
    }

    public static int b(LazyLayoutItemProvider lazyLayoutItemProvider, Object key) {
        AbstractC3292y.i(key, "key");
        return -1;
    }

    public static Object c(LazyLayoutItemProvider lazyLayoutItemProvider, int i8) {
        return Lazy_androidKt.getDefaultLazyLayoutKey(i8);
    }
}
