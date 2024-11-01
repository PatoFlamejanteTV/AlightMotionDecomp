package androidx.datastore.preferences.core;

import R5.AbstractC1435t;
import androidx.annotation.RestrictTo;
import j$.util.DesugarCollections;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;
import n6.C3445b0;
import n6.I;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class Actual_jvmKt {
    public static final <T> Set<T> immutableCopyOfSet(Set<? extends T> set) {
        AbstractC3292y.i(set, "set");
        Set<T> unmodifiableSet = DesugarCollections.unmodifiableSet(AbstractC1435t.b1(set));
        AbstractC3292y.h(unmodifiableSet, "unmodifiableSet(set.toSet())");
        return unmodifiableSet;
    }

    public static final <K, V> Map<K, V> immutableMap(Map<K, ? extends V> map) {
        AbstractC3292y.i(map, "map");
        Map<K, V> unmodifiableMap = DesugarCollections.unmodifiableMap(map);
        AbstractC3292y.h(unmodifiableMap, "unmodifiableMap(map)");
        return unmodifiableMap;
    }

    public static final I ioDispatcher() {
        return C3445b0.b();
    }
}
