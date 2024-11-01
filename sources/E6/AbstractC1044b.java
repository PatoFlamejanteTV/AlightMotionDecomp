package E6;

/* renamed from: E6.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1044b {
    public static final byte a(char c8) {
        if (c8 < '~') {
            return C1049g.f2071c[c8];
        }
        return (byte) 0;
    }

    public static final char b(int i8) {
        if (i8 < 117) {
            return C1049g.f2070b[i8];
        }
        return (char) 0;
    }

    public static final String c(byte b9) {
        if (b9 == 1) {
            return "quotation mark '\"'";
        }
        if (b9 == 2) {
            return "string escape sequence '\\'";
        }
        if (b9 == 4) {
            return "comma ','";
        }
        if (b9 == 5) {
            return "colon ':'";
        }
        if (b9 == 6) {
            return "start of the object '{'";
        }
        if (b9 == 7) {
            return "end of the object '}'";
        }
        if (b9 == 8) {
            return "start of the array '['";
        }
        if (b9 == 9) {
            return "end of the array ']'";
        }
        if (b9 == 10) {
            return "end of the input";
        }
        if (b9 == Byte.MAX_VALUE) {
            return "invalid token";
        }
        return "valid token";
    }
}
