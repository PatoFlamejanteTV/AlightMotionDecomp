package E6;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public abstract class S {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f2048a;

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f2049b;

    static {
        String[] strArr = new String[93];
        for (int i8 = 0; i8 < 32; i8++) {
            strArr[i8] = "\\u" + e(i8 >> 12) + e(i8 >> 8) + e(i8 >> 4) + e(i8);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f2048a = strArr;
        byte[] bArr = new byte[93];
        for (int i9 = 0; i9 < 32; i9++) {
            bArr[i9] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        f2049b = bArr;
    }

    public static final byte[] a() {
        return f2049b;
    }

    public static final String[] b() {
        return f2048a;
    }

    public static final void c(StringBuilder sb, String value) {
        AbstractC3292y.i(sb, "<this>");
        AbstractC3292y.i(value, "value");
        sb.append('\"');
        int length = value.length();
        int i8 = 0;
        for (int i9 = 0; i9 < length; i9++) {
            char charAt = value.charAt(i9);
            String[] strArr = f2048a;
            if (charAt < strArr.length && strArr[charAt] != null) {
                sb.append((CharSequence) value, i8, i9);
                sb.append(strArr[charAt]);
                i8 = i9 + 1;
            }
        }
        if (i8 != 0) {
            sb.append((CharSequence) value, i8, value.length());
        } else {
            sb.append(value);
        }
        sb.append('\"');
    }

    public static final Boolean d(String str) {
        AbstractC3292y.i(str, "<this>");
        if (l6.n.s(str, "true", true)) {
            return Boolean.TRUE;
        }
        if (l6.n.s(str, "false", true)) {
            return Boolean.FALSE;
        }
        return null;
    }

    private static final char e(int i8) {
        int i9;
        int i10 = i8 & 15;
        if (i10 < 10) {
            i9 = i10 + 48;
        } else {
            i9 = i10 + 87;
        }
        return (char) i9;
    }
}
