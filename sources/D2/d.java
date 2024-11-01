package d2;

import java.math.BigInteger;

/* loaded from: classes4.dex */
public abstract class d {
    public static byte[] a(BigInteger bigInteger) {
        int bitLength = ((bigInteger.bitLength() + 7) >> 3) << 3;
        byte[] byteArray = bigInteger.toByteArray();
        int i8 = 1;
        if (bigInteger.bitLength() % 8 != 0 && (bigInteger.bitLength() / 8) + 1 == bitLength / 8) {
            return byteArray;
        }
        int length = byteArray.length;
        if (bigInteger.bitLength() % 8 == 0) {
            length--;
        } else {
            i8 = 0;
        }
        int i9 = bitLength / 8;
        int i10 = i9 - length;
        byte[] bArr = new byte[i9];
        System.arraycopy(byteArray, i8, bArr, i10, length);
        return bArr;
    }
}
