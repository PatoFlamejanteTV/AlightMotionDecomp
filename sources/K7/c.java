package K7;

import java.io.OutputStream;

/* loaded from: classes5.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    protected final byte[] f5201a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: b, reason: collision with root package name */
    protected final byte[] f5202b = new byte[128];

    public c() {
        c();
    }

    public int a(byte[] bArr, int i8, int i9, OutputStream outputStream) {
        byte[] bArr2 = new byte[72];
        while (i9 > 0) {
            int min = Math.min(36, i9);
            outputStream.write(bArr2, 0, b(bArr, i8, min, bArr2, 0));
            i8 += min;
            i9 -= min;
        }
        return i9 * 2;
    }

    public int b(byte[] bArr, int i8, int i9, byte[] bArr2, int i10) {
        int i11 = i9 + i8;
        int i12 = i10;
        while (i8 < i11) {
            int i13 = i8 + 1;
            byte b9 = bArr[i8];
            int i14 = i12 + 1;
            byte[] bArr3 = this.f5201a;
            bArr2[i12] = bArr3[(b9 & 255) >>> 4];
            i12 += 2;
            bArr2[i14] = bArr3[b9 & 15];
            i8 = i13;
        }
        return i12 - i10;
    }

    protected void c() {
        int i8 = 0;
        int i9 = 0;
        while (true) {
            byte[] bArr = this.f5202b;
            if (i9 >= bArr.length) {
                break;
            }
            bArr[i9] = -1;
            i9++;
        }
        while (true) {
            byte[] bArr2 = this.f5201a;
            if (i8 < bArr2.length) {
                this.f5202b[bArr2[i8]] = (byte) i8;
                i8++;
            } else {
                byte[] bArr3 = this.f5202b;
                bArr3[65] = bArr3[97];
                bArr3[66] = bArr3[98];
                bArr3[67] = bArr3[99];
                bArr3[68] = bArr3[100];
                bArr3[69] = bArr3[101];
                bArr3[70] = bArr3[102];
                return;
            }
        }
    }
}
