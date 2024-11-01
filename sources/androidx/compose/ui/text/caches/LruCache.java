package androidx.compose.ui.text.caches;

import Q5.I;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.platform.Synchronization_jvmKt;
import androidx.compose.ui.text.platform.SynchronizedObject;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3290w;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public class LruCache<K, V> {
    public static final int $stable = 8;
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final LinkedHashSet<K> keySet;
    private final HashMap<K, V> map;
    private int maxSize;
    private int missCount;
    private final SynchronizedObject monitor = Synchronization_jvmKt.createSynchronizedObject();
    private int putCount;
    private int size;

    public LruCache(int i8) {
        if (i8 > 0) {
            this.maxSize = i8;
            this.map = new HashMap<>(0, 0.75f);
            this.keySet = new LinkedHashSet<>();
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

    protected V create(K k8) {
        return null;
    }

    public final int createCount() {
        int i8;
        synchronized (this.monitor) {
            i8 = this.createCount;
        }
        return i8;
    }

    protected void entryRemoved(boolean z8, K k8, V v8, V v9) {
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int evictionCount() {
        int i8;
        synchronized (this.monitor) {
            i8 = this.evictionCount;
        }
        return i8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V get(K k8) {
        synchronized (this.monitor) {
            V v8 = this.map.get(k8);
            if (v8 != null) {
                this.keySet.remove(k8);
                this.keySet.add(k8);
                this.hitCount++;
                return v8;
            }
            this.missCount++;
            V create = create(k8);
            if (create == null) {
                return null;
            }
            synchronized (this.monitor) {
                try {
                    this.createCount++;
                    Object put = this.map.put(k8, create);
                    this.keySet.remove(k8);
                    this.keySet.add(k8);
                    if (put != 0) {
                        this.map.put(k8, put);
                        v8 = put;
                    } else {
                        this.size = size() + safeSizeOf(k8, create);
                    }
                    I i8 = I.f8786a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (v8 != null) {
                entryRemoved(false, k8, create, v8);
                return v8;
            }
            trimToSize(this.maxSize);
            return create;
        }
    }

    public final int hitCount() {
        int i8;
        synchronized (this.monitor) {
            i8 = this.hitCount;
        }
        return i8;
    }

    public final int maxSize() {
        int i8;
        synchronized (this.monitor) {
            i8 = this.maxSize;
        }
        return i8;
    }

    public final int missCount() {
        int i8;
        synchronized (this.monitor) {
            i8 = this.missCount;
        }
        return i8;
    }

    public final V put(K k8, V v8) {
        V put;
        if (k8 != null && v8 != null) {
            synchronized (this.monitor) {
                try {
                    this.putCount++;
                    this.size = size() + safeSizeOf(k8, v8);
                    put = this.map.put(k8, v8);
                    if (put != null) {
                        this.size = size() - safeSizeOf(k8, put);
                    }
                    if (this.keySet.contains(k8)) {
                        this.keySet.remove(k8);
                    }
                    this.keySet.add(k8);
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (put != null) {
                entryRemoved(false, k8, put, v8);
            }
            trimToSize(this.maxSize);
            return put;
        }
        throw null;
    }

    public final int putCount() {
        int i8;
        synchronized (this.monitor) {
            i8 = this.putCount;
        }
        return i8;
    }

    public final V remove(K k8) {
        V remove;
        k8.getClass();
        synchronized (this.monitor) {
            try {
                remove = this.map.remove(k8);
                this.keySet.remove(k8);
                if (remove != null) {
                    this.size = size() - safeSizeOf(k8, remove);
                }
                I i8 = I.f8786a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (remove != null) {
            entryRemoved(false, k8, remove, null);
        }
        return remove;
    }

    public void resize(int i8) {
        if (i8 > 0) {
            synchronized (this.monitor) {
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
        synchronized (this.monitor) {
            i8 = this.size;
        }
        return i8;
    }

    protected int sizeOf(K k8, V v8) {
        return 1;
    }

    public final Map<K, V> snapshot() {
        LinkedHashMap linkedHashMap;
        synchronized (this.monitor) {
            linkedHashMap = new LinkedHashMap();
            Iterator<K> it = this.keySet.iterator();
            while (it.hasNext()) {
                K next = it.next();
                V v8 = this.map.get(next);
                AbstractC3292y.f(v8);
                linkedHashMap.put(next, v8);
            }
        }
        return linkedHashMap;
    }

    public final <R> R synchronizedValue$ui_text_release(Function0 function0) {
        R r8;
        synchronized (this.monitor) {
            try {
                r8 = (R) function0.invoke();
                AbstractC3290w.b(1);
            } catch (Throwable th) {
                AbstractC3290w.b(1);
                AbstractC3290w.a(1);
                throw th;
            }
        }
        AbstractC3290w.a(1);
        return r8;
    }

    public String toString() {
        int i8;
        String str;
        synchronized (this.monitor) {
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

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0094, code lost:            throw new java.lang.IllegalStateException("map/keySet size inconsistency");     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void trimToSize(int r8) {
        /*
            r7 = this;
        L0:
            androidx.compose.ui.text.platform.SynchronizedObject r0 = r7.monitor
            monitor-enter(r0)
            int r1 = r7.size()     // Catch: java.lang.Throwable -> L18
            if (r1 < 0) goto L8d
            java.util.HashMap<K, V> r1 = r7.map     // Catch: java.lang.Throwable -> L18
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L1b
            int r1 = r7.size()     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L8d
            goto L1b
        L18:
            r8 = move-exception
            goto L95
        L1b:
            java.util.HashMap<K, V> r1 = r7.map     // Catch: java.lang.Throwable -> L18
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L18
            java.util.LinkedHashSet<K> r2 = r7.keySet     // Catch: java.lang.Throwable -> L18
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L18
            if (r1 != r2) goto L8d
            int r1 = r7.size()     // Catch: java.lang.Throwable -> L18
            r2 = 1
            r3 = 0
            if (r1 <= r8) goto L78
            java.util.HashMap<K, V> r1 = r7.map     // Catch: java.lang.Throwable -> L18
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L78
            java.util.LinkedHashSet<K> r1 = r7.keySet     // Catch: java.lang.Throwable -> L18
            java.lang.Object r1 = R5.AbstractC1435t.l0(r1)     // Catch: java.lang.Throwable -> L18
            java.util.HashMap<K, V> r4 = r7.map     // Catch: java.lang.Throwable -> L18
            java.lang.Object r4 = r4.get(r1)     // Catch: java.lang.Throwable -> L18
            if (r4 == 0) goto L70
            java.util.HashMap<K, V> r5 = r7.map     // Catch: java.lang.Throwable -> L18
            java.util.Map r5 = kotlin.jvm.internal.Z.c(r5)     // Catch: java.lang.Throwable -> L18
            r5.remove(r1)     // Catch: java.lang.Throwable -> L18
            java.util.LinkedHashSet<K> r5 = r7.keySet     // Catch: java.lang.Throwable -> L18
            java.util.Collection r5 = kotlin.jvm.internal.Z.a(r5)     // Catch: java.lang.Throwable -> L18
            r5.remove(r1)     // Catch: java.lang.Throwable -> L18
            int r5 = r7.size()     // Catch: java.lang.Throwable -> L18
            kotlin.jvm.internal.AbstractC3292y.f(r1)     // Catch: java.lang.Throwable -> L18
            kotlin.jvm.internal.AbstractC3292y.f(r4)     // Catch: java.lang.Throwable -> L18
            int r6 = r7.safeSizeOf(r1, r4)     // Catch: java.lang.Throwable -> L18
            int r5 = r5 - r6
            r7.size = r5     // Catch: java.lang.Throwable -> L18
            int r5 = r7.evictionCount     // Catch: java.lang.Throwable -> L18
            int r5 = r5 + r2
            r7.evictionCount = r5     // Catch: java.lang.Throwable -> L18
            goto L7a
        L70:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L18
            java.lang.String r1 = "inconsistent state"
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L18
            throw r8     // Catch: java.lang.Throwable -> L18
        L78:
            r1 = r3
            r4 = r1
        L7a:
            Q5.I r5 = Q5.I.f8786a     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)
            if (r1 != 0) goto L82
            if (r4 != 0) goto L82
            return
        L82:
            kotlin.jvm.internal.AbstractC3292y.f(r1)
            kotlin.jvm.internal.AbstractC3292y.f(r4)
            r7.entryRemoved(r2, r1, r4, r3)
            goto L0
        L8d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L18
            java.lang.String r1 = "map/keySet size inconsistency"
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L18
            throw r8     // Catch: java.lang.Throwable -> L18
        L95:
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.caches.LruCache.trimToSize(int):void");
    }
}
