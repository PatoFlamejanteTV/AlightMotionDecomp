package Q6;

import U6.C1452h;
import java.io.IOException;

/* loaded from: classes5.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    static final C1452h f8871a = C1452h.f("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f8872b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: c, reason: collision with root package name */
    static final String[] f8873c = new String[64];

    /* renamed from: d, reason: collision with root package name */
    static final String[] f8874d = new String[256];

    static {
        int i8 = 0;
        int i9 = 0;
        while (true) {
            String[] strArr = f8874d;
            if (i9 >= strArr.length) {
                break;
            }
            strArr[i9] = L6.c.o("%8s", Integer.toBinaryString(i9)).replace(' ', '0');
            i9++;
        }
        String[] strArr2 = f8873c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i10 = iArr[0];
        strArr2[i10 | 8] = strArr2[i10] + "|PADDED";
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i11 = 0; i11 < 3; i11++) {
            int i12 = iArr2[i11];
            int i13 = iArr[0];
            String[] strArr3 = f8873c;
            int i14 = i13 | i12;
            strArr3[i14] = strArr3[i13] + '|' + strArr3[i12];
            strArr3[i14 | 8] = strArr3[i13] + '|' + strArr3[i12] + "|PADDED";
        }
        while (true) {
            String[] strArr4 = f8873c;
            if (i8 < strArr4.length) {
                if (strArr4[i8] == null) {
                    strArr4[i8] = f8874d[i8];
                }
                i8++;
            } else {
                return;
            }
        }
    }

    static String a(byte b9, byte b10) {
        String str;
        if (b10 == 0) {
            return "";
        }
        if (b9 != 2 && b9 != 3) {
            if (b9 != 4 && b9 != 6) {
                if (b9 != 7 && b9 != 8) {
                    String[] strArr = f8873c;
                    if (b10 < strArr.length) {
                        str = strArr[b10];
                    } else {
                        str = f8874d[b10];
                    }
                    if (b9 == 5 && (b10 & 4) != 0) {
                        return str.replace("HEADERS", "PUSH_PROMISE");
                    }
                    if (b9 == 0 && (b10 & 32) != 0) {
                        return str.replace("PRIORITY", "COMPRESSED");
                    }
                    return str;
                }
            } else {
                if (b10 == 1) {
                    return "ACK";
                }
                return f8874d[b10];
            }
        }
        return f8874d[b10];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(boolean z8, int i8, int i9, byte b9, byte b10) {
        String o8;
        String str;
        String[] strArr = f8872b;
        if (b9 < strArr.length) {
            o8 = strArr[b9];
        } else {
            o8 = L6.c.o("0x%02x", Byte.valueOf(b9));
        }
        String a9 = a(b9, b10);
        if (z8) {
            str = "<<";
        } else {
            str = ">>";
        }
        return L6.c.o("%s 0x%08x %5d %-13s %s", str, Integer.valueOf(i8), Integer.valueOf(i9), o8, a9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static IllegalArgumentException c(String str, Object... objArr) {
        throw new IllegalArgumentException(L6.c.o(str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static IOException d(String str, Object... objArr) {
        throw new IOException(L6.c.o(str, objArr));
    }
}
