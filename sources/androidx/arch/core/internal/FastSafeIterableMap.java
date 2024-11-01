package androidx.arch.core.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.arch.core.internal.SafeIterableMap;
import java.util.HashMap;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class FastSafeIterableMap<K, V> extends SafeIterableMap<K, V> {
    private final HashMap<K, SafeIterableMap.Entry<K, V>> mHashMap = new HashMap<>();

    @Nullable
    public Map.Entry<K, V> ceil(K k8) {
        if (contains(k8)) {
            return this.mHashMap.get(k8).mPrevious;
        }
        return null;
    }

    public boolean contains(K k8) {
        return this.mHashMap.containsKey(k8);
    }

    @Override // androidx.arch.core.internal.SafeIterableMap
    @Nullable
    protected SafeIterableMap.Entry<K, V> get(K k8) {
        return this.mHashMap.get(k8);
    }

    @Override // androidx.arch.core.internal.SafeIterableMap
    public V putIfAbsent(@NonNull K k8, @NonNull V v8) {
        SafeIterableMap.Entry<K, V> entry = get(k8);
        if (entry != null) {
            return entry.mValue;
        }
        this.mHashMap.put(k8, put(k8, v8));
        return null;
    }

    @Override // androidx.arch.core.internal.SafeIterableMap
    public V remove(@NonNull K k8) {
        V v8 = (V) super.remove(k8);
        this.mHashMap.remove(k8);
        return v8;
    }
}
