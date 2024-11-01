package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class J3 implements Serializable, Iterable {

    /* renamed from: b, reason: collision with root package name */
    public static final J3 f16332b = new U3(AbstractC2256t4.f17011b);

    /* renamed from: c, reason: collision with root package name */
    private static final Q3 f16333c = new T3();

    /* renamed from: a, reason: collision with root package name */
    private int f16334a = 0;

    static {
        new L3();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int e(byte b9) {
        return b9 & 255;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int g(int i8, int i9, int i10) {
        int i11 = i9 - i8;
        if ((i8 | i9 | i11 | (i10 - i9)) < 0) {
            if (i8 >= 0) {
                if (i9 < i8) {
                    throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i8 + ", " + i9);
                }
                throw new IndexOutOfBoundsException("End index: " + i9 + " >= " + i10);
            }
            throw new IndexOutOfBoundsException("Beginning index: " + i8 + " < 0");
        }
        return i11;
    }

    public static J3 k(String str) {
        return new U3(str.getBytes(AbstractC2256t4.f17010a));
    }

    public static J3 m(byte[] bArr) {
        return n(bArr, 0, bArr.length);
    }

    public static J3 n(byte[] bArr, int i8, int i9) {
        g(i8, i8 + i9, bArr.length);
        return new U3(f16333c.a(bArr, i8, i9));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static S3 u(int i8) {
        return new S3(i8);
    }

    public abstract byte c(int i8);

    /* JADX INFO: Access modifiers changed from: protected */
    public final int d() {
        return this.f16334a;
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i8 = this.f16334a;
        if (i8 == 0) {
            int r8 = r();
            i8 = t(r8, 0, r8);
            if (i8 == 0) {
                i8 = 1;
            }
            this.f16334a = i8;
        }
        return i8;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator iterator() {
        return new M3(this);
    }

    public abstract J3 j(int i8, int i9);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void o(K3 k32);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract byte q(int i8);

    public abstract int r();

    protected abstract int t(int i8, int i9, int i10);

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        Integer valueOf = Integer.valueOf(r());
        if (r() <= 50) {
            str = AbstractC2305z5.a(this);
        } else {
            str = AbstractC2305z5.a(j(0, 47)) + "...";
        }
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", hexString, valueOf, str);
    }
}
