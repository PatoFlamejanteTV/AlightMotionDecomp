package J7;

import java.security.AccessController;
import java.security.PrivilegedAction;

/* loaded from: classes5.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static String f4520a;

    /* loaded from: classes5.dex */
    static class a implements PrivilegedAction {
        a() {
        }

        @Override // java.security.PrivilegedAction
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String run() {
            return System.getProperty("line.separator");
        }
    }

    static {
        try {
            try {
                f4520a = (String) AccessController.doPrivileged(new a());
            } catch (Exception unused) {
                f4520a = "\n";
            }
        } catch (Exception unused2) {
            f4520a = String.format("%n", new Object[0]);
        }
    }

    public static char[] a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i8 = 0; i8 != length; i8++) {
            cArr[i8] = (char) (bArr[i8] & 255);
        }
        return cArr;
    }

    public static String b(byte[] bArr) {
        return new String(a(bArr));
    }

    public static String c(byte[] bArr) {
        char[] cArr = new char[bArr.length];
        int b9 = K7.d.b(bArr, cArr);
        if (b9 >= 0) {
            return new String(cArr, 0, b9);
        }
        throw new IllegalArgumentException("Invalid UTF-8 input");
    }

    public static byte[] d(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i8 = 0; i8 != length; i8++) {
            bArr[i8] = (byte) str.charAt(i8);
        }
        return bArr;
    }

    public static String e(String str) {
        char[] charArray = str.toCharArray();
        boolean z8 = false;
        for (int i8 = 0; i8 != charArray.length; i8++) {
            char c8 = charArray[i8];
            if ('A' <= c8 && 'Z' >= c8) {
                charArray[i8] = (char) (c8 + ' ');
                z8 = true;
            }
        }
        if (z8) {
            return new String(charArray);
        }
        return str;
    }
}
