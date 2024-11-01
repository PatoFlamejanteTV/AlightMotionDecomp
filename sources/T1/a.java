package T1;

/* loaded from: classes4.dex */
public abstract class a {
    public static boolean a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return false;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < bArr.length; i9++) {
            i8 |= bArr[i9] ^ bArr2[i9];
        }
        if (i8 != 0) {
            return false;
        }
        return true;
    }
}
