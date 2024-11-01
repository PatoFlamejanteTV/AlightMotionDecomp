package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class I5 {

    /* renamed from: a, reason: collision with root package name */
    private static final K5 f16330a;

    static {
        if (E5.w()) {
            E5.z();
        }
        f16330a = new J5();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(String str) {
        int length = str.length();
        int i8 = 0;
        int i9 = 0;
        while (i9 < length && str.charAt(i9) < 128) {
            i9++;
        }
        int i10 = length;
        while (true) {
            if (i9 >= length) {
                break;
            }
            char charAt = str.charAt(i9);
            if (charAt < 2048) {
                i10 += (127 - charAt) >>> 31;
                i9++;
            } else {
                int length2 = str.length();
                while (i9 < length2) {
                    char charAt2 = str.charAt(i9);
                    if (charAt2 < 2048) {
                        i8 += (127 - charAt2) >>> 31;
                    } else {
                        i8 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i9) >= 65536) {
                                i9++;
                            } else {
                                throw new M5(i9, length2);
                            }
                        }
                    }
                    i9++;
                }
                i10 += i8;
            }
        }
        if (i10 >= length) {
            return i10;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i10 + 4294967296L));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(String str, byte[] bArr, int i8, int i9) {
        return f16330a.b(str, bArr, i8, i9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int c(byte[] bArr, int i8, int i9) {
        byte b9 = bArr[i8 - 1];
        int i10 = i9 - i8;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    byte b10 = bArr[i8];
                    byte b11 = bArr[i8 + 1];
                    if (b9 > -12 || b10 > -65 || b11 > -65) {
                        return -1;
                    }
                    return (b11 << 16) ^ ((b10 << 8) ^ b9);
                }
                throw new AssertionError();
            }
            byte b12 = bArr[i8];
            if (b9 > -12 || b12 > -65) {
                return -1;
            }
            return (b12 << 8) ^ b9;
        }
        if (b9 > -12) {
            return -1;
        }
        return b9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String d(byte[] bArr, int i8, int i9) {
        return f16330a.c(bArr, i8, i9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean e(byte[] bArr, int i8, int i9) {
        if (f16330a.a(0, bArr, i8, i9) != 0) {
            return false;
        }
        return true;
    }
}
