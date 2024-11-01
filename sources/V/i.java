package V;

/* loaded from: classes3.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f10395a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b, reason: collision with root package name */
    private static final char[] f10396b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i8 = 0;
        for (byte b9 : bArr) {
            char[] cArr2 = f10396b;
            cArr[i8] = cArr2[(b9 & 255) >>> 4];
            cArr[i8 + 1] = cArr2[b9 & 15];
            i8 += 2;
        }
        return new String(cArr);
    }

    public static String b(byte[] bArr, boolean z8) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (int i8 = 0; i8 < length && (!z8 || i8 != length - 1 || (bArr[i8] & 255) != 0); i8++) {
            char[] cArr = f10395a;
            sb.append(cArr[(bArr[i8] & 240) >>> 4]);
            sb.append(cArr[bArr[i8] & 15]);
        }
        return sb.toString();
    }
}
