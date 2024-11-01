package com.mbridge.msdk.foundation.same.a;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class b implements c<String, JSONObject> {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap<String, JSONObject> f20681a;

    /* renamed from: b, reason: collision with root package name */
    private final int f20682b;

    /* renamed from: c, reason: collision with root package name */
    private int f20683c;

    public b(int i8) {
        if (i8 > 0) {
            this.f20682b = i8;
            this.f20681a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    @Override // com.mbridge.msdk.foundation.same.a.c
    public final /* synthetic */ void a(String str) {
        String str2 = str;
        if (str2 != null) {
            synchronized (this) {
                try {
                    if (this.f20681a.remove(str2) != null) {
                        this.f20683c--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        throw new NullPointerException("key == null");
    }

    public final synchronized String toString() {
        return String.format("LruCache[maxSize=%d]", Integer.valueOf(this.f20682b));
    }

    @Override // com.mbridge.msdk.foundation.same.a.c
    public final void b() {
        a(-1);
    }

    @Override // com.mbridge.msdk.foundation.same.a.c
    public final boolean a(String str, JSONObject jSONObject) {
        if (str != null && jSONObject != null) {
            synchronized (this) {
                try {
                    this.f20683c++;
                    if (this.f20681a.put(str, jSONObject) != null) {
                        this.f20683c--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            a(this.f20682b);
            return true;
        }
        throw new NullPointerException("key == null || value == null");
    }

    @Override // com.mbridge.msdk.foundation.same.a.c
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final JSONObject b(String str) {
        JSONObject jSONObject;
        if (str != null) {
            synchronized (this) {
                jSONObject = this.f20681a.get(str);
            }
            return jSONObject;
        }
        throw new NullPointerException("key == null");
    }

    @Override // com.mbridge.msdk.foundation.same.a.c
    public final Collection<String> a() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f20681a.keySet());
        }
        return hashSet;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x006f, code lost:            throw new java.lang.IllegalStateException(com.mbridge.msdk.foundation.same.a.b.class.getName() + ".sizeOf() is reporting inconsistent results!");     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(int r3) {
        /*
            r2 = this;
        L0:
            monitor-enter(r2)
            int r0 = r2.f20683c     // Catch: java.lang.Throwable -> L12
            if (r0 < 0) goto L53
            java.util.LinkedHashMap<java.lang.String, org.json.JSONObject> r0 = r2.f20681a     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            int r0 = r2.f20683c     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L53
            goto L14
        L12:
            r3 = move-exception
            goto L70
        L14:
            int r0 = r2.f20683c     // Catch: java.lang.Throwable -> L12
            if (r0 <= r3) goto L51
            java.util.LinkedHashMap<java.lang.String, org.json.JSONObject> r0 = r2.f20681a     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L21
            goto L51
        L21:
            java.util.LinkedHashMap<java.lang.String, org.json.JSONObject> r0 = r2.f20681a     // Catch: java.lang.Throwable -> L12
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L12
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L12
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L35
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            goto L52
        L35:
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L12
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch: java.lang.Throwable -> L12
            java.util.LinkedHashMap<java.lang.String, org.json.JSONObject> r0 = r2.f20681a     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r0 = r0.remove(r1)     // Catch: java.lang.Throwable -> L4f
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch: java.lang.Throwable -> L4f
            int r0 = r2.f20683c     // Catch: java.lang.Throwable -> L4f
            int r0 = r0 + (-1)
            r2.f20683c = r0     // Catch: java.lang.Throwable -> L4f
        L4f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            goto L0
        L51:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
        L52:
            return
        L53:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L12
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12
            r0.<init>()     // Catch: java.lang.Throwable -> L12
            java.lang.Class<com.mbridge.msdk.foundation.same.a.b> r1 = com.mbridge.msdk.foundation.same.a.b.class
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L12
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L12
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L12
            throw r3     // Catch: java.lang.Throwable -> L12
        L70:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.a.b.a(int):void");
    }
}
