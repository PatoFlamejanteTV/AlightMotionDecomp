package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
abstract class H5 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(byte b9, byte b10, byte b11, byte b12, char[] cArr, int i8) {
        if (!e(b10) && (((b9 << 28) + (b10 + 112)) >> 30) == 0 && !e(b11) && !e(b12)) {
            int i9 = ((b9 & 7) << 18) | ((b10 & 63) << 12) | ((b11 & 63) << 6) | (b12 & 63);
            cArr[i8] = (char) ((i9 >>> 10) + 55232);
            cArr[i8 + 1] = (char) ((i9 & 1023) + 56320);
            return;
        }
        throw A4.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void b(byte b9, byte b10, byte b11, char[] cArr, int i8) {
        if (!e(b10) && ((b9 != -32 || b10 >= -96) && ((b9 != -19 || b10 < -96) && !e(b11)))) {
            cArr[i8] = (char) (((b9 & 15) << 12) | ((b10 & 63) << 6) | (b11 & 63));
            return;
        }
        throw A4.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void c(byte b9, byte b10, char[] cArr, int i8) {
        if (b9 >= -62 && !e(b10)) {
            cArr[i8] = (char) (((b9 & 31) << 6) | (b10 & 63));
            return;
        }
        throw A4.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void d(byte b9, char[] cArr, int i8) {
        cArr[i8] = (char) b9;
    }

    private static boolean e(byte b9) {
        return b9 > -65;
    }
}
