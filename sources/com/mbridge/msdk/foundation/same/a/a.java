package com.mbridge.msdk.foundation.same.a;

import android.graphics.Bitmap;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public final class a implements c<String, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap<String, Bitmap> f20678a;

    /* renamed from: b, reason: collision with root package name */
    private final int f20679b;

    /* renamed from: c, reason: collision with root package name */
    private int f20680c;

    public a(int i8) {
        if (i8 > 0) {
            this.f20679b = i8;
            this.f20678a = new LinkedHashMap<>(0, 0.75f, true);
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
                    Bitmap remove = this.f20678a.remove(str2);
                    if (remove != null) {
                        this.f20680c -= b(str2, remove);
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
        return String.format("LruCache[maxSize=%d]", Integer.valueOf(this.f20679b));
    }

    @Override // com.mbridge.msdk.foundation.same.a.c
    public final void b() {
        a(-1);
    }

    private int b(String str, Bitmap bitmap) {
        return bitmap.getRowBytes() * bitmap.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.mbridge.msdk.foundation.same.a.c
    public boolean a(String str, Bitmap bitmap) {
        if (str != null && bitmap != null) {
            synchronized (this) {
                try {
                    this.f20680c += b(str, bitmap);
                    Bitmap put = this.f20678a.put(str, bitmap);
                    if (put != null) {
                        this.f20680c -= b(str, put);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            a(this.f20679b);
            return true;
        }
        throw new NullPointerException("key == null || value == null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.mbridge.msdk.foundation.same.a.c
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public Bitmap b(String str) {
        if (str != null) {
            synchronized (this) {
                try {
                    Bitmap bitmap = this.f20678a.get(str);
                    if (bitmap == null || bitmap.isRecycled()) {
                        return null;
                    }
                    return bitmap;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new NullPointerException("key == null");
    }

    @Override // com.mbridge.msdk.foundation.same.a.c
    public final Collection<String> a() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f20678a.keySet());
        }
        return hashSet;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0075, code lost:            throw new java.lang.IllegalStateException(com.mbridge.msdk.foundation.same.a.a.class.getName() + ".sizeOf() is reporting inconsistent results!");     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(int r4) {
        /*
            r3 = this;
        L0:
            monitor-enter(r3)
            int r0 = r3.f20680c     // Catch: java.lang.Throwable -> L12
            if (r0 < 0) goto L59
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r3.f20678a     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            int r0 = r3.f20680c     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L59
            goto L14
        L12:
            r4 = move-exception
            goto L76
        L14:
            int r0 = r3.f20680c     // Catch: java.lang.Throwable -> L12
            if (r0 <= r4) goto L57
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r3.f20678a     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L21
            goto L57
        L21:
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r3.f20678a     // Catch: java.lang.Throwable -> L12
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L12
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L12
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L35
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            goto L58
        L35:
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L12
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch: java.lang.Throwable -> L12
            int r0 = r3.b(r1, r0)     // Catch: java.lang.Throwable -> L55
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r2 = r3.f20678a     // Catch: java.lang.Throwable -> L55
            java.lang.Object r1 = r2.remove(r1)     // Catch: java.lang.Throwable -> L55
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1     // Catch: java.lang.Throwable -> L55
            r1.recycle()     // Catch: java.lang.Throwable -> L55
            int r1 = r3.f20680c     // Catch: java.lang.Throwable -> L55
            int r1 = r1 - r0
            r3.f20680c = r1     // Catch: java.lang.Throwable -> L55
        L55:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            goto L0
        L57:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
        L58:
            return
        L59:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L12
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12
            r0.<init>()     // Catch: java.lang.Throwable -> L12
            java.lang.Class<com.mbridge.msdk.foundation.same.a.a> r1 = com.mbridge.msdk.foundation.same.a.a.class
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L12
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L12
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L12
            throw r4     // Catch: java.lang.Throwable -> L12
        L76:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.a.a.a(int):void");
    }
}
