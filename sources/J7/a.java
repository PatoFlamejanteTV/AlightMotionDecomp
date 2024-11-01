package J7;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: J7.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0078a implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        private final Object[] f4509a;

        /* renamed from: b, reason: collision with root package name */
        private int f4510b = 0;

        public C0078a(Object[] objArr) {
            this.f4509a = objArr;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f4510b < this.f4509a.length) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            int i8 = this.f4510b;
            Object[] objArr = this.f4509a;
            if (i8 != objArr.length) {
                this.f4510b = i8 + 1;
                return objArr[i8];
            }
            throw new NoSuchElementException("Out of elements: " + this.f4510b);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Cannot remove element from an Array.");
        }
    }

    public static boolean a(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    public static boolean b(char[] cArr, char[] cArr2) {
        return Arrays.equals(cArr, cArr2);
    }

    public static boolean c(short[] sArr, short[] sArr2) {
        return Arrays.equals(sArr, sArr2);
    }

    public static byte[] d(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public static short[] e(short[] sArr) {
        if (sArr == null) {
            return null;
        }
        return (short[]) sArr.clone();
    }

    public static byte[] f(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return d(bArr2);
        }
        if (bArr2 == null) {
            return d(bArr);
        }
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static boolean g(byte[] bArr, byte[] bArr2) {
        int length;
        if (bArr == null || bArr2 == null) {
            return false;
        }
        if (bArr == bArr2) {
            return true;
        }
        if (bArr.length < bArr2.length) {
            length = bArr.length;
        } else {
            length = bArr2.length;
        }
        int length2 = bArr.length ^ bArr2.length;
        for (int i8 = 0; i8 != length; i8++) {
            length2 |= bArr[i8] ^ bArr2[i8];
        }
        while (length < bArr2.length) {
            byte b9 = bArr2[length];
            length2 |= b9 ^ (~b9);
            length++;
        }
        if (length2 != 0) {
            return false;
        }
        return true;
    }

    public static byte[] h(byte[] bArr, int i8, int i9) {
        int j8 = j(i8, i9);
        byte[] bArr2 = new byte[j8];
        System.arraycopy(bArr, i8, bArr2, 0, Math.min(bArr.length - i8, j8));
        return bArr2;
    }

    public static void i(byte[] bArr, byte b9) {
        Arrays.fill(bArr, b9);
    }

    private static int j(int i8, int i9) {
        int i10 = i9 - i8;
        if (i10 >= 0) {
            return i10;
        }
        StringBuffer stringBuffer = new StringBuffer(i8);
        stringBuffer.append(" > ");
        stringBuffer.append(i9);
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    public static int k(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int length = bArr.length;
        int i8 = length + 1;
        while (true) {
            length--;
            if (length >= 0) {
                i8 = (i8 * 257) ^ bArr[length];
            } else {
                return i8;
            }
        }
    }

    public static int l(byte[] bArr, int i8, int i9) {
        if (bArr == null) {
            return 0;
        }
        int i10 = i9 + 1;
        while (true) {
            i9--;
            if (i9 >= 0) {
                i10 = (i10 * 257) ^ bArr[i8 + i9];
            } else {
                return i10;
            }
        }
    }

    public static int m(char[] cArr) {
        if (cArr == null) {
            return 0;
        }
        int length = cArr.length;
        int i8 = length + 1;
        while (true) {
            length--;
            if (length >= 0) {
                i8 = (i8 * 257) ^ cArr[length];
            } else {
                return i8;
            }
        }
    }

    public static int n(int[] iArr) {
        if (iArr == null) {
            return 0;
        }
        int length = iArr.length;
        int i8 = length + 1;
        while (true) {
            length--;
            if (length >= 0) {
                i8 = (i8 * 257) ^ iArr[length];
            } else {
                return i8;
            }
        }
    }

    public static int o(short[] sArr) {
        if (sArr == null) {
            return 0;
        }
        int length = sArr.length;
        int i8 = length + 1;
        while (true) {
            length--;
            if (length >= 0) {
                i8 = (i8 * 257) ^ (sArr[length] & 255);
            } else {
                return i8;
            }
        }
    }

    public static int p(short[][] sArr) {
        int i8 = 0;
        for (int i9 = 0; i9 != sArr.length; i9++) {
            i8 = (i8 * 257) + o(sArr[i9]);
        }
        return i8;
    }

    public static int q(short[][][] sArr) {
        int i8 = 0;
        for (int i9 = 0; i9 != sArr.length; i9++) {
            i8 = (i8 * 257) + p(sArr[i9]);
        }
        return i8;
    }
}
