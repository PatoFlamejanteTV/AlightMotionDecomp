package K7;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* loaded from: classes5.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    private static final short[] f5203a = new short[128];

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f5204b;

    static {
        byte[] bArr = new byte[112];
        f5204b = bArr;
        byte[] bArr2 = new byte[128];
        a(bArr2, 0, 15, (byte) 1);
        a(bArr2, 16, 31, (byte) 2);
        a(bArr2, 32, 63, (byte) 3);
        a(bArr2, 64, 65, (byte) 0);
        a(bArr2, 66, 95, (byte) 4);
        a(bArr2, 96, 96, (byte) 5);
        a(bArr2, 97, 108, (byte) 6);
        a(bArr2, 109, 109, (byte) 7);
        a(bArr2, 110, 111, (byte) 6);
        a(bArr2, 112, 112, (byte) 8);
        a(bArr2, 113, 115, (byte) 9);
        a(bArr2, 116, 116, (byte) 10);
        a(bArr2, 117, ModuleDescriptor.MODULE_VERSION, (byte) 0);
        a(bArr, 0, bArr.length - 1, (byte) -2);
        a(bArr, 8, 11, (byte) -1);
        a(bArr, 24, 27, (byte) 0);
        a(bArr, 40, 43, (byte) 16);
        a(bArr, 58, 59, (byte) 0);
        a(bArr, 72, 73, (byte) 0);
        a(bArr, 89, 91, (byte) 16);
        a(bArr, 104, 104, (byte) 16);
        byte[] bArr3 = {0, 0, 0, 0, 31, 15, 15, 15, 7, 7, 7};
        byte[] bArr4 = {-2, -2, -2, -2, 0, 48, 16, 64, 80, 32, 96};
        for (int i8 = 0; i8 < 128; i8++) {
            byte b9 = bArr2[i8];
            f5203a[i8] = (short) (bArr4[b9] | ((bArr3[b9] & i8) << 8));
        }
    }

    private static void a(byte[] bArr, int i8, int i9, byte b9) {
        while (i8 <= i9) {
            bArr[i8] = b9;
            i8++;
        }
    }

    public static int b(byte[] bArr, char[] cArr) {
        int i8 = 0;
        int i9 = 0;
        while (i8 < bArr.length) {
            int i10 = i8 + 1;
            byte b9 = bArr[i8];
            if (b9 >= 0) {
                if (i9 >= cArr.length) {
                    return -1;
                }
                cArr[i9] = (char) b9;
                i8 = i10;
                i9++;
            } else {
                short s8 = f5203a[b9 & Byte.MAX_VALUE];
                int i11 = s8 >>> 8;
                byte b10 = (byte) s8;
                while (b10 >= 0) {
                    if (i10 >= bArr.length) {
                        return -1;
                    }
                    int i12 = i10 + 1;
                    byte b11 = bArr[i10];
                    i11 = (i11 << 6) | (b11 & 63);
                    b10 = f5204b[b10 + ((b11 & 255) >>> 4)];
                    i10 = i12;
                }
                if (b10 == -2) {
                    return -1;
                }
                if (i11 <= 65535) {
                    if (i9 >= cArr.length) {
                        return -1;
                    }
                    cArr[i9] = (char) i11;
                    i9++;
                } else {
                    if (i9 >= cArr.length - 1) {
                        return -1;
                    }
                    int i13 = i9 + 1;
                    cArr[i9] = (char) ((i11 >>> 10) + 55232);
                    i9 += 2;
                    cArr[i13] = (char) ((i11 & 1023) | 56320);
                }
                i8 = i10;
            }
        }
        return i9;
    }
}
