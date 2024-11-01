package l6;

import R5.AbstractC1419c;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public abstract class w extends v {
    public static boolean A(String str, String prefix, boolean z8) {
        AbstractC3292y.i(str, "<this>");
        AbstractC3292y.i(prefix, "prefix");
        if (!z8) {
            return str.startsWith(prefix);
        }
        return n.u(str, 0, prefix, 0, prefix.length(), z8);
    }

    public static /* synthetic */ boolean B(String str, String str2, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return n.A(str, str2, z8);
    }

    public static int m(String str, String other, boolean z8) {
        AbstractC3292y.i(str, "<this>");
        AbstractC3292y.i(other, "other");
        if (z8) {
            return str.compareToIgnoreCase(other);
        }
        return str.compareTo(other);
    }

    public static String n(char[] cArr) {
        AbstractC3292y.i(cArr, "<this>");
        return new String(cArr);
    }

    public static String o(char[] cArr, int i8, int i9) {
        AbstractC3292y.i(cArr, "<this>");
        AbstractC1419c.Companion.a(i8, i9, cArr.length);
        return new String(cArr, i8, i9 - i8);
    }

    public static byte[] p(String str) {
        AbstractC3292y.i(str, "<this>");
        byte[] bytes = str.getBytes(C3338d.f34755b);
        AbstractC3292y.h(bytes, "getBytes(...)");
        return bytes;
    }

    public static boolean q(String str, String suffix, boolean z8) {
        AbstractC3292y.i(str, "<this>");
        AbstractC3292y.i(suffix, "suffix");
        if (!z8) {
            return str.endsWith(suffix);
        }
        return n.u(str, str.length() - suffix.length(), suffix, 0, suffix.length(), true);
    }

    public static /* synthetic */ boolean r(String str, String str2, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return n.q(str, str2, z8);
    }

    public static boolean s(String str, String str2, boolean z8) {
        if (str == null) {
            if (str2 == null) {
                return true;
            }
            return false;
        }
        if (!z8) {
            return str.equals(str2);
        }
        return str.equalsIgnoreCase(str2);
    }

    public static /* synthetic */ boolean t(String str, String str2, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return n.s(str, str2, z8);
    }

    public static boolean u(String str, int i8, String other, int i9, int i10, boolean z8) {
        AbstractC3292y.i(str, "<this>");
        AbstractC3292y.i(other, "other");
        if (!z8) {
            return str.regionMatches(i8, other, i9, i10);
        }
        return str.regionMatches(z8, i8, other, i9, i10);
    }

    public static String v(CharSequence charSequence, int i8) {
        AbstractC3292y.i(charSequence, "<this>");
        if (i8 >= 0) {
            if (i8 == 0) {
                return "";
            }
            int i9 = 1;
            if (i8 != 1) {
                int length = charSequence.length();
                if (length == 0) {
                    return "";
                }
                if (length != 1) {
                    StringBuilder sb = new StringBuilder(charSequence.length() * i8);
                    if (1 <= i8) {
                        while (true) {
                            sb.append(charSequence);
                            if (i9 == i8) {
                                break;
                            }
                            i9++;
                        }
                    }
                    String sb2 = sb.toString();
                    AbstractC3292y.f(sb2);
                    return sb2;
                }
                char charAt = charSequence.charAt(0);
                char[] cArr = new char[i8];
                for (int i10 = 0; i10 < i8; i10++) {
                    cArr[i10] = charAt;
                }
                return new String(cArr);
            }
            return charSequence.toString();
        }
        throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i8 + '.').toString());
    }

    public static final String w(String str, char c8, char c9, boolean z8) {
        AbstractC3292y.i(str, "<this>");
        if (!z8) {
            String replace = str.replace(c8, c9);
            AbstractC3292y.h(replace, "replace(...)");
            return replace;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i8 = 0; i8 < str.length(); i8++) {
            char charAt = str.charAt(i8);
            if (AbstractC3337c.h(charAt, c8, z8)) {
                charAt = c9;
            }
            sb.append(charAt);
        }
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "toString(...)");
        return sb2;
    }

    public static String x(String str, String oldValue, String newValue, boolean z8) {
        AbstractC3292y.i(str, "<this>");
        AbstractC3292y.i(oldValue, "oldValue");
        AbstractC3292y.i(newValue, "newValue");
        int i8 = 0;
        int N8 = x.N(str, oldValue, 0, z8);
        if (N8 < 0) {
            return str;
        }
        int length = oldValue.length();
        int d8 = i6.m.d(length, 1);
        int length2 = (str.length() - length) + newValue.length();
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            do {
                sb.append((CharSequence) str, i8, N8);
                sb.append(newValue);
                i8 = N8 + length;
                if (N8 >= str.length()) {
                    break;
                }
                N8 = x.N(str, oldValue, N8 + d8, z8);
            } while (N8 > 0);
            sb.append((CharSequence) str, i8, str.length());
            String sb2 = sb.toString();
            AbstractC3292y.h(sb2, "toString(...)");
            return sb2;
        }
        throw new OutOfMemoryError();
    }

    public static /* synthetic */ String y(String str, char c8, char c9, boolean z8, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            z8 = false;
        }
        return w(str, c8, c9, z8);
    }

    public static /* synthetic */ String z(String str, String str2, String str3, boolean z8, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            z8 = false;
        }
        return n.x(str, str2, str3, z8);
    }
}
