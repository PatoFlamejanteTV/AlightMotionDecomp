package com.mbridge.msdk.click.a;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public final class c implements com.mbridge.msdk.foundation.same.a.c<String, b> {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap<String, b> f19339a;

    /* renamed from: b, reason: collision with root package name */
    private final int f19340b;

    /* renamed from: c, reason: collision with root package name */
    private int f19341c;

    public c(int i8) {
        if (i8 > 0) {
            this.f19340b = i8;
            this.f19339a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final synchronized String toString() {
        return String.format("LruCache[maxSize=%d]", Integer.valueOf(this.f19340b));
    }

    @Override // com.mbridge.msdk.foundation.same.a.c
    /* renamed from: b, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final void a(String str) {
        if (str != null) {
            synchronized (this) {
                try {
                    if (this.f19339a.remove(str) != null) {
                        this.f19341c--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        throw new NullPointerException("key == null");
    }

    @Override // com.mbridge.msdk.foundation.same.a.c
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final b b(String str) {
        if (str != null) {
            synchronized (this) {
                try {
                    b bVar = this.f19339a.get(str);
                    if (bVar != null) {
                        return bVar;
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new NullPointerException("key == null");
    }

    @Override // com.mbridge.msdk.foundation.same.a.c
    public final void b() {
        a(-1);
    }

    @Override // com.mbridge.msdk.foundation.same.a.c
    public final boolean a(String str, b bVar) {
        if (str != null && bVar != null) {
            synchronized (this) {
                try {
                    this.f19341c++;
                    if (this.f19339a.put(str, bVar) != null) {
                        this.f19341c--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            a(this.f19340b);
            return true;
        }
        throw new NullPointerException("key == null || value == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x006c, code lost:            throw new java.lang.IllegalStateException(com.mbridge.msdk.click.a.c.class.getName() + ".sizeOf() is reporting inconsistent results!");     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(int r3) {
        /*
            r2 = this;
        L0:
            monitor-enter(r2)
            int r0 = r2.f19341c     // Catch: java.lang.Throwable -> L12
            if (r0 < 0) goto L50
            java.util.LinkedHashMap<java.lang.String, com.mbridge.msdk.click.a.b> r0 = r2.f19339a     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            int r0 = r2.f19341c     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L50
            goto L14
        L12:
            r3 = move-exception
            goto L6d
        L14:
            int r0 = r2.f19341c     // Catch: java.lang.Throwable -> L12
            if (r0 <= r3) goto L4e
            java.util.LinkedHashMap<java.lang.String, com.mbridge.msdk.click.a.b> r0 = r2.f19339a     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L21
            goto L4e
        L21:
            java.util.LinkedHashMap<java.lang.String, com.mbridge.msdk.click.a.b> r0 = r2.f19339a     // Catch: java.lang.Throwable -> L12
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L12
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L12
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L35
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            goto L4f
        L35:
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L12
            com.mbridge.msdk.click.a.b r0 = (com.mbridge.msdk.click.a.b) r0     // Catch: java.lang.Throwable -> L12
            java.util.LinkedHashMap<java.lang.String, com.mbridge.msdk.click.a.b> r0 = r2.f19339a     // Catch: java.lang.Throwable -> L4c
            r0.remove(r1)     // Catch: java.lang.Throwable -> L4c
            int r0 = r2.f19341c     // Catch: java.lang.Throwable -> L4c
            int r0 = r0 + (-1)
            r2.f19341c = r0     // Catch: java.lang.Throwable -> L4c
        L4c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            goto L0
        L4e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
        L4f:
            return
        L50:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L12
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12
            r0.<init>()     // Catch: java.lang.Throwable -> L12
            java.lang.Class<com.mbridge.msdk.click.a.c> r1 = com.mbridge.msdk.click.a.c.class
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L12
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L12
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L12
            throw r3     // Catch: java.lang.Throwable -> L12
        L6d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.a.c.a(int):void");
    }

    @Override // com.mbridge.msdk.foundation.same.a.c
    public final Collection<String> a() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f19339a.keySet());
        }
        return hashSet;
    }
}
