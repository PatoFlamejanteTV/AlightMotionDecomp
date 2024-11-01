package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public abstract class V3 {

    /* renamed from: b, reason: collision with root package name */
    private static volatile int f16472b = 100;

    /* renamed from: a, reason: collision with root package name */
    int f16473a;

    public static int a(int i8) {
        return (-(i8 & 1)) ^ (i8 >>> 1);
    }

    public static long b(long j8) {
        return (-(j8 & 1)) ^ (j8 >>> 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static V3 c(byte[] bArr, int i8, int i9, boolean z8) {
        Y3 y32 = new Y3(bArr, i9);
        try {
            y32.d(i9);
            return y32;
        } catch (A4 e8) {
            throw new IllegalArgumentException(e8);
        }
    }

    public abstract int d(int i8);

    public abstract int e();

    private V3() {
        this.f16473a = f16472b;
    }
}
