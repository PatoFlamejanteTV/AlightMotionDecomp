package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.b2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2317b2 {

    /* renamed from: g, reason: collision with root package name */
    private static final Object f17691g = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final String f17692a;

    /* renamed from: b, reason: collision with root package name */
    private final Z1 f17693b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f17694c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f17695d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Object f17696e;

    /* renamed from: f, reason: collision with root package name */
    private volatile Object f17697f;

    public final Object a(Object obj) {
        Object obj2;
        synchronized (this.f17695d) {
        }
        if (obj != null) {
            return obj;
        }
        if (AbstractC2331d2.f17759a == null) {
            return this.f17694c;
        }
        synchronized (f17691g) {
            try {
                if (C2321c.a()) {
                    if (this.f17697f == null) {
                        obj2 = this.f17694c;
                    } else {
                        obj2 = this.f17697f;
                    }
                    return obj2;
                }
                try {
                    for (C2317b2 c2317b2 : G.U0()) {
                        if (!C2321c.a()) {
                            Object obj3 = null;
                            try {
                                Z1 z12 = c2317b2.f17693b;
                                if (z12 != null) {
                                    obj3 = z12.w();
                                }
                            } catch (IllegalStateException unused) {
                            }
                            synchronized (f17691g) {
                                c2317b2.f17697f = obj3;
                            }
                        } else {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                    }
                } catch (SecurityException unused2) {
                }
                Z1 z13 = this.f17693b;
                if (z13 == null) {
                    return this.f17694c;
                }
                try {
                    return z13.w();
                } catch (IllegalStateException unused3) {
                    return this.f17694c;
                } catch (SecurityException unused4) {
                    return this.f17694c;
                }
            } finally {
            }
        }
    }

    public final String b() {
        return this.f17692a;
    }

    private C2317b2(String str, Object obj, Object obj2, Z1 z12) {
        this.f17695d = new Object();
        this.f17696e = null;
        this.f17697f = null;
        this.f17692a = str;
        this.f17694c = obj;
        this.f17693b = z12;
    }
}
