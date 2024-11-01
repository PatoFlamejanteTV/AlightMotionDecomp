package I7;

import java.lang.reflect.Array;

/* loaded from: classes5.dex */
public class a extends g {

    /* renamed from: c, reason: collision with root package name */
    private int[][] f3806c;

    /* renamed from: d, reason: collision with root package name */
    private int f3807d;

    public a(int i8, int[][] iArr) {
        int[] iArr2 = iArr[0];
        if (iArr2.length != ((i8 + 31) >> 5)) {
            throw new ArithmeticException("Int array does not match given number of columns.");
        }
        this.f3818b = i8;
        this.f3817a = iArr.length;
        this.f3807d = iArr2.length;
        int i9 = i8 & 31;
        int i10 = i9 == 0 ? -1 : (1 << i9) - 1;
        for (int i11 = 0; i11 < this.f3817a; i11++) {
            int[] iArr3 = iArr[i11];
            int i12 = this.f3807d - 1;
            iArr3[i12] = iArr3[i12] & i10;
        }
        this.f3806c = iArr;
    }

    public byte[] c() {
        int i8 = (this.f3818b + 7) >>> 3;
        int i9 = this.f3817a;
        int i10 = 8;
        byte[] bArr = new byte[(i8 * i9) + 8];
        f.a(i9, bArr, 0);
        f.a(this.f3818b, bArr, 4);
        int i11 = this.f3818b;
        int i12 = i11 >>> 5;
        int i13 = i11 & 31;
        for (int i14 = 0; i14 < this.f3817a; i14++) {
            int i15 = 0;
            while (i15 < i12) {
                f.a(this.f3806c[i14][i15], bArr, i10);
                i15++;
                i10 += 4;
            }
            int i16 = 0;
            while (i16 < i13) {
                bArr[i10] = (byte) ((this.f3806c[i14][i12] >>> i16) & 255);
                i16 += 8;
                i10++;
            }
        }
        return bArr;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f3817a != aVar.f3817a || this.f3818b != aVar.f3818b || this.f3807d != aVar.f3807d) {
            return false;
        }
        for (int i8 = 0; i8 < this.f3817a; i8++) {
            if (!d.b(this.f3806c[i8], aVar.f3806c[i8])) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i8 = (((this.f3817a * 31) + this.f3818b) * 31) + this.f3807d;
        for (int i9 = 0; i9 < this.f3817a; i9++) {
            i8 = (i8 * 31) + J7.a.n(this.f3806c[i9]);
        }
        return i8;
    }

    public String toString() {
        int i8 = this.f3818b & 31;
        int i9 = this.f3807d;
        if (i8 != 0) {
            i9--;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i10 = 0; i10 < this.f3817a; i10++) {
            stringBuffer.append(i10 + ": ");
            for (int i11 = 0; i11 < i9; i11++) {
                int i12 = this.f3806c[i10][i11];
                for (int i13 = 0; i13 < 32; i13++) {
                    if (((i12 >>> i13) & 1) == 0) {
                        stringBuffer.append('0');
                    } else {
                        stringBuffer.append('1');
                    }
                }
                stringBuffer.append(' ');
            }
            int i14 = this.f3806c[i10][this.f3807d - 1];
            for (int i15 = 0; i15 < i8; i15++) {
                if (((i14 >>> i15) & 1) == 0) {
                    stringBuffer.append('0');
                } else {
                    stringBuffer.append('1');
                }
            }
            stringBuffer.append('\n');
        }
        return stringBuffer.toString();
    }

    public a(a aVar) {
        this.f3818b = aVar.a();
        this.f3817a = aVar.b();
        this.f3807d = aVar.f3807d;
        this.f3806c = new int[aVar.f3806c.length];
        int i8 = 0;
        while (true) {
            int[][] iArr = this.f3806c;
            if (i8 >= iArr.length) {
                return;
            }
            iArr[i8] = d.a(aVar.f3806c[i8]);
            i8++;
        }
    }

    public a(byte[] bArr) {
        if (bArr.length < 9) {
            throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
        }
        this.f3817a = f.e(bArr, 0);
        int e8 = f.e(bArr, 4);
        this.f3818b = e8;
        int i8 = this.f3817a;
        int i9 = ((e8 + 7) >>> 3) * i8;
        if (i8 > 0) {
            int i10 = 8;
            if (i9 == bArr.length - 8) {
                int i11 = (e8 + 31) >>> 5;
                this.f3807d = i11;
                this.f3806c = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i8, i11);
                int i12 = this.f3818b;
                int i13 = i12 >> 5;
                int i14 = i12 & 31;
                for (int i15 = 0; i15 < this.f3817a; i15++) {
                    int i16 = 0;
                    while (i16 < i13) {
                        this.f3806c[i15][i16] = f.e(bArr, i10);
                        i16++;
                        i10 += 4;
                    }
                    int i17 = 0;
                    while (i17 < i14) {
                        int[] iArr = this.f3806c[i15];
                        iArr[i13] = ((bArr[i10] & 255) << i17) ^ iArr[i13];
                        i17 += 8;
                        i10++;
                    }
                }
                return;
            }
        }
        throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
    }
}
