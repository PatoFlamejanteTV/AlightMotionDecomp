package com.google.android.gms.internal.measurement;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class F3 {

    /* renamed from: a, reason: collision with root package name */
    private static volatile int f16297a = 100;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double a(byte[] bArr, int i8) {
        return Double.longBitsToDouble(t(bArr, i8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(int i8, byte[] bArr, int i9, int i10, B4 b42, I3 i32) {
        C2264u4 c2264u4 = (C2264u4) b42;
        int r8 = r(bArr, i9, i32);
        c2264u4.g(i32.f16321a);
        while (r8 < i10) {
            int r9 = r(bArr, r8, i32);
            if (i8 != i32.f16321a) {
                break;
            }
            r8 = r(bArr, r9, i32);
            c2264u4.g(i32.f16321a);
        }
        return r8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(int i8, byte[] bArr, int i9, int i10, C5 c52, I3 i32) {
        if ((i8 >>> 3) != 0) {
            int i11 = i8 & 7;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 5) {
                                c52.e(i8, Integer.valueOf(q(bArr, i9)));
                                return i9 + 4;
                            }
                            throw A4.b();
                        }
                        C5 l8 = C5.l();
                        int i12 = (i8 & (-8)) | 4;
                        int i13 = i32.f16325e + 1;
                        i32.f16325e = i13;
                        m(i13);
                        int i14 = 0;
                        while (true) {
                            if (i9 >= i10) {
                                break;
                            }
                            int r8 = r(bArr, i9, i32);
                            int i15 = i32.f16321a;
                            i14 = i15;
                            if (i15 != i12) {
                                int c8 = c(i14, bArr, r8, i10, l8, i32);
                                i14 = i15;
                                i9 = c8;
                            } else {
                                i9 = r8;
                                break;
                            }
                        }
                        i32.f16325e--;
                        if (i9 <= i10 && i14 == i12) {
                            c52.e(i8, l8);
                            return i9;
                        }
                        throw A4.e();
                    }
                    int r9 = r(bArr, i9, i32);
                    int i16 = i32.f16321a;
                    if (i16 >= 0) {
                        if (i16 <= bArr.length - r9) {
                            if (i16 == 0) {
                                c52.e(i8, J3.f16332b);
                            } else {
                                c52.e(i8, J3.n(bArr, r9, i16));
                            }
                            return r9 + i16;
                        }
                        throw A4.g();
                    }
                    throw A4.d();
                }
                c52.e(i8, Long.valueOf(t(bArr, i9)));
                return i9 + 8;
            }
            int s8 = s(bArr, i9, i32);
            c52.e(i8, Long.valueOf(i32.f16322b));
            return s8;
        }
        throw A4.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(int i8, byte[] bArr, int i9, int i10, Object obj, Y4 y42, D5 d52, I3 i32) {
        i32.f16324d.b(y42, i8 >>> 3);
        return c(i8, bArr, i9, i10, C2102b5.I(obj), i32);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(int i8, byte[] bArr, int i9, I3 i32) {
        int i10 = i8 & ModuleDescriptor.MODULE_VERSION;
        int i11 = i9 + 1;
        byte b9 = bArr[i9];
        if (b9 >= 0) {
            i32.f16321a = i10 | (b9 << 7);
            return i11;
        }
        int i12 = i10 | ((b9 & Byte.MAX_VALUE) << 7);
        int i13 = i9 + 2;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            i32.f16321a = i12 | (b10 << 14);
            return i13;
        }
        int i14 = i12 | ((b10 & Byte.MAX_VALUE) << 14);
        int i15 = i9 + 3;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            i32.f16321a = i14 | (b11 << 21);
            return i15;
        }
        int i16 = i14 | ((b11 & Byte.MAX_VALUE) << 21);
        int i17 = i9 + 4;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            i32.f16321a = i16 | (b12 << 28);
            return i17;
        }
        int i18 = i16 | ((b12 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i19 = i17 + 1;
            if (bArr[i17] >= 0) {
                i32.f16321a = i18;
                return i19;
            }
            i17 = i19;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(InterfaceC2210n5 interfaceC2210n5, int i8, byte[] bArr, int i9, int i10, B4 b42, I3 i32) {
        int i11 = (i8 & (-8)) | 4;
        int g8 = g(interfaceC2210n5, bArr, i9, i10, i11, i32);
        b42.add(i32.f16323c);
        while (g8 < i10) {
            int r8 = r(bArr, g8, i32);
            if (i8 != i32.f16321a) {
                break;
            }
            g8 = g(interfaceC2210n5, bArr, r8, i10, i11, i32);
            b42.add(i32.f16323c);
        }
        return g8;
    }

    private static int g(InterfaceC2210n5 interfaceC2210n5, byte[] bArr, int i8, int i9, int i10, I3 i32) {
        Object w8 = interfaceC2210n5.w();
        int i11 = i(w8, interfaceC2210n5, bArr, i8, i9, i10, i32);
        interfaceC2210n5.c(w8);
        i32.f16323c = w8;
        return i11;
    }

    static int h(InterfaceC2210n5 interfaceC2210n5, byte[] bArr, int i8, int i9, I3 i32) {
        Object w8 = interfaceC2210n5.w();
        int j8 = j(w8, interfaceC2210n5, bArr, i8, i9, i32);
        interfaceC2210n5.c(w8);
        i32.f16323c = w8;
        return j8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int i(Object obj, InterfaceC2210n5 interfaceC2210n5, byte[] bArr, int i8, int i9, int i10, I3 i32) {
        C2102b5 c2102b5 = (C2102b5) interfaceC2210n5;
        int i11 = i32.f16325e + 1;
        i32.f16325e = i11;
        m(i11);
        int l8 = c2102b5.l(obj, bArr, i8, i9, i10, i32);
        i32.f16325e--;
        i32.f16323c = obj;
        return l8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int j(Object obj, InterfaceC2210n5 interfaceC2210n5, byte[] bArr, int i8, int i9, I3 i32) {
        int i10 = i8 + 1;
        int i11 = bArr[i8];
        if (i11 < 0) {
            i10 = e(i11, bArr, i10, i32);
            i11 = i32.f16321a;
        }
        int i12 = i10;
        if (i11 >= 0 && i11 <= i9 - i12) {
            int i13 = i32.f16325e + 1;
            i32.f16325e = i13;
            m(i13);
            int i14 = i11 + i12;
            interfaceC2210n5.g(obj, bArr, i12, i14, i32);
            i32.f16325e--;
            i32.f16323c = obj;
            return i14;
        }
        throw A4.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int k(byte[] bArr, int i8, I3 i32) {
        int r8 = r(bArr, i8, i32);
        int i9 = i32.f16321a;
        if (i9 >= 0) {
            if (i9 <= bArr.length - r8) {
                if (i9 == 0) {
                    i32.f16323c = J3.f16332b;
                    return r8;
                }
                i32.f16323c = J3.n(bArr, r8, i9);
                return r8 + i9;
            }
            throw A4.g();
        }
        throw A4.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int l(byte[] bArr, int i8, B4 b42, I3 i32) {
        C2264u4 c2264u4 = (C2264u4) b42;
        int r8 = r(bArr, i8, i32);
        int i9 = i32.f16321a + r8;
        while (r8 < i9) {
            r8 = r(bArr, r8, i32);
            c2264u4.g(i32.f16321a);
        }
        if (r8 == i9) {
            return r8;
        }
        throw A4.g();
    }

    private static void m(int i8) {
        if (i8 < f16297a) {
        } else {
            throw A4.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float n(byte[] bArr, int i8) {
        return Float.intBitsToFloat(q(bArr, i8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int o(InterfaceC2210n5 interfaceC2210n5, int i8, byte[] bArr, int i9, int i10, B4 b42, I3 i32) {
        int h8 = h(interfaceC2210n5, bArr, i9, i10, i32);
        b42.add(i32.f16323c);
        while (h8 < i10) {
            int r8 = r(bArr, h8, i32);
            if (i8 != i32.f16321a) {
                break;
            }
            h8 = h(interfaceC2210n5, bArr, r8, i10, i32);
            b42.add(i32.f16323c);
        }
        return h8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int p(byte[] bArr, int i8, I3 i32) {
        int r8 = r(bArr, i8, i32);
        int i9 = i32.f16321a;
        if (i9 >= 0) {
            if (i9 == 0) {
                i32.f16323c = "";
                return r8;
            }
            i32.f16323c = I5.d(bArr, r8, i9);
            return r8 + i9;
        }
        throw A4.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int q(byte[] bArr, int i8) {
        return ((bArr[i8 + 3] & 255) << 24) | (bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8 + 2] & 255) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int r(byte[] bArr, int i8, I3 i32) {
        int i9 = i8 + 1;
        byte b9 = bArr[i8];
        if (b9 >= 0) {
            i32.f16321a = b9;
            return i9;
        }
        return e(b9, bArr, i9, i32);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int s(byte[] bArr, int i8, I3 i32) {
        int i9 = i8 + 1;
        long j8 = bArr[i8];
        if (j8 >= 0) {
            i32.f16322b = j8;
            return i9;
        }
        int i10 = i8 + 2;
        byte b9 = bArr[i9];
        long j9 = (j8 & 127) | ((b9 & Byte.MAX_VALUE) << 7);
        int i11 = 7;
        while (b9 < 0) {
            int i12 = i10 + 1;
            i11 += 7;
            j9 |= (r10 & Byte.MAX_VALUE) << i11;
            b9 = bArr[i10];
            i10 = i12;
        }
        i32.f16322b = j9;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long t(byte[] bArr, int i8) {
        return ((bArr[i8 + 7] & 255) << 56) | (bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8 + 2] & 255) << 16) | ((bArr[i8 + 3] & 255) << 24) | ((bArr[i8 + 4] & 255) << 32) | ((bArr[i8 + 5] & 255) << 40) | ((bArr[i8 + 6] & 255) << 48);
    }
}
