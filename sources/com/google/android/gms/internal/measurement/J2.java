package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public abstract class J2 {

    /* renamed from: a, reason: collision with root package name */
    private static I2 f16331a;

    public static synchronized I2 a() {
        I2 i22;
        synchronized (J2.class) {
            try {
                if (f16331a == null) {
                    b(new L2());
                }
                i22 = f16331a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i22;
    }

    private static synchronized void b(I2 i22) {
        synchronized (J2.class) {
            if (f16331a == null) {
                f16331a = i22;
            } else {
                throw new IllegalStateException("init() already called");
            }
        }
    }
}
