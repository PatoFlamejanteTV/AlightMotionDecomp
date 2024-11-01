package androidx.collection;

import Q5.I;
import androidx.annotation.IntRange;
import androidx.collection.internal.Lock;
import androidx.collection.internal.LruHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public class LruCache<K, V> {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final Lock lock;
    private final LruHashMap<K, V> map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public LruCache(@IntRange(from = 1, to = Long.MAX_VALUE) int i8) {
        this.maxSize = i8;
        if (i8 > 0) {
            this.map = new LruHashMap<>(0, 0.75f);
            this.lock = new Lock();
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0".toString());
    }

    private final int safeSizeOf(K k8, V v8) {
        int sizeOf = sizeOf(k8, v8);
        if (sizeOf >= 0) {
            return sizeOf;
        }
        throw new IllegalStateException(("Negative size: " + k8 + '=' + v8).toString());
    }

    protected V create(K key) {
        AbstractC3292y.i(key, "key");
        return null;
    }

    public final int createCount() {
        int i8;
        synchronized (this.lock) {
            i8 = this.createCount;
        }
        return i8;
    }

    protected void entryRemoved(boolean z8, K key, V oldValue, V v8) {
        AbstractC3292y.i(key, "key");
        AbstractC3292y.i(oldValue, "oldValue");
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int evictionCount() {
        int i8;
        synchronized (this.lock) {
            i8 = this.evictionCount;
        }
        return i8;
    }

    public final V get(K key) {
        V v8;
        AbstractC3292y.i(key, "key");
        synchronized (this.lock) {
            V v9 = this.map.get(key);
            if (v9 != null) {
                this.hitCount++;
                return v9;
            }
            this.missCount++;
            V create = create(key);
            if (create == null) {
                return null;
            }
            synchronized (this.lock) {
                try {
                    this.createCount++;
                    v8 = (V) this.map.put(key, create);
                    if (v8 != null) {
                        this.map.put(key, v8);
                    } else {
                        this.size += safeSizeOf(key, create);
                        I i8 = I.f8786a;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (v8 != null) {
                entryRemoved(false, key, create, v8);
                return v8;
            }
            trimToSize(this.maxSize);
            return create;
        }
    }

    public final int hitCount() {
        int i8;
        synchronized (this.lock) {
            i8 = this.hitCount;
        }
        return i8;
    }

    public final int maxSize() {
        int i8;
        synchronized (this.lock) {
            i8 = this.maxSize;
        }
        return i8;
    }

    public final int missCount() {
        int i8;
        synchronized (this.lock) {
            i8 = this.missCount;
        }
        return i8;
    }

    public final V put(K key, V value) {
        V put;
        AbstractC3292y.i(key, "key");
        AbstractC3292y.i(value, "value");
        synchronized (this.lock) {
            try {
                this.putCount++;
                this.size += safeSizeOf(key, value);
                put = this.map.put(key, value);
                if (put != null) {
                    this.size -= safeSizeOf(key, put);
                }
                I i8 = I.f8786a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (put != null) {
            entryRemoved(false, key, put, value);
        }
        trimToSize(this.maxSize);
        return put;
    }

    public final int putCount() {
        int i8;
        synchronized (this.lock) {
            i8 = this.putCount;
        }
        return i8;
    }

    public final V remove(K key) {
        V remove;
        AbstractC3292y.i(key, "key");
        synchronized (this.lock) {
            try {
                remove = this.map.remove(key);
                if (remove != null) {
                    this.size -= safeSizeOf(key, remove);
                }
                I i8 = I.f8786a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (remove != null) {
            entryRemoved(false, key, remove, null);
        }
        return remove;
    }

    public void resize(@IntRange(from = 1, to = Long.MAX_VALUE) int i8) {
        if (i8 > 0) {
            synchronized (this.lock) {
                this.maxSize = i8;
                I i9 = I.f8786a;
            }
            trimToSize(i8);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0".toString());
    }

    public final int size() {
        int i8;
        synchronized (this.lock) {
            i8 = this.size;
        }
        return i8;
    }

    protected int sizeOf(K key, V value) {
        AbstractC3292y.i(key, "key");
        AbstractC3292y.i(value, "value");
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map<K, V> snapshot() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (this.lock) {
            try {
                Iterator<T> it = this.map.getEntries().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                I i8 = I.f8786a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return linkedHashMap;
    }

    public String toString() {
        int i8;
        String str;
        synchronized (this.lock) {
            try {
                int i9 = this.hitCount;
                int i10 = this.missCount + i9;
                if (i10 != 0) {
                    i8 = (i9 * 100) / i10;
                } else {
                    i8 = 0;
                }
                str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + i8 + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0064, code lost:            throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!".toString());     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void trimToSize(int r6) {
        /*
            r5 = this;
        L0:
            androidx.collection.internal.Lock r0 = r5.lock
            monitor-enter(r0)
            int r1 = r5.size     // Catch: java.lang.Throwable -> L14
            if (r1 < 0) goto L59
            androidx.collection.internal.LruHashMap<K, V> r1 = r5.map     // Catch: java.lang.Throwable -> L14
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L16
            int r1 = r5.size     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L59
            goto L16
        L14:
            r6 = move-exception
            goto L65
        L16:
            int r1 = r5.size     // Catch: java.lang.Throwable -> L14
            if (r1 <= r6) goto L57
            androidx.collection.internal.LruHashMap<K, V> r1 = r5.map     // Catch: java.lang.Throwable -> L14
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L23
            goto L57
        L23:
            androidx.collection.internal.LruHashMap<K, V> r1 = r5.map     // Catch: java.lang.Throwable -> L14
            java.util.Set r1 = r1.getEntries()     // Catch: java.lang.Throwable -> L14
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L14
            java.lang.Object r1 = R5.AbstractC1435t.n0(r1)     // Catch: java.lang.Throwable -> L14
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L35
            monitor-exit(r0)
            return
        L35:
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L14
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L14
            androidx.collection.internal.LruHashMap<K, V> r3 = r5.map     // Catch: java.lang.Throwable -> L14
            r3.remove(r2)     // Catch: java.lang.Throwable -> L14
            int r3 = r5.size     // Catch: java.lang.Throwable -> L14
            int r4 = r5.safeSizeOf(r2, r1)     // Catch: java.lang.Throwable -> L14
            int r3 = r3 - r4
            r5.size = r3     // Catch: java.lang.Throwable -> L14
            int r3 = r5.evictionCount     // Catch: java.lang.Throwable -> L14
            r4 = 1
            int r3 = r3 + r4
            r5.evictionCount = r3     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)
            r0 = 0
            r5.entryRemoved(r4, r2, r1, r0)
            goto L0
        L57:
            monitor-exit(r0)
            return
        L59:
            java.lang.String r6 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L14
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L14
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L14
            throw r1     // Catch: java.lang.Throwable -> L14
        L65:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LruCache.trimToSize(int):void");
    }
}
