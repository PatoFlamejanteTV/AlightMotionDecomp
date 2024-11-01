package r1;

import j$.util.DesugarTimeZone;
import java.util.TimeZone;

/* renamed from: r1.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3885a {

    /* renamed from: a, reason: collision with root package name */
    private static final TimeZone f37797a = DesugarTimeZone.getTimeZone("UTC");

    private static boolean a(String str, int i8, char c8) {
        if (i8 < str.length() && str.charAt(i8) == c8) {
            return true;
        }
        return false;
    }

    private static int b(String str, int i8) {
        while (i8 < str.length()) {
            char charAt = str.charAt(i8);
            if (charAt >= '0' && charAt <= '9') {
                i8++;
            } else {
                return i8;
            }
        }
        return str.length();
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Date c(java.lang.String r19, java.text.ParsePosition r20) {
        /*
            Method dump skipped, instructions count: 569
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.AbstractC3885a.c(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    private static int d(String str, int i8, int i9) {
        int i10;
        int i11;
        if (i8 >= 0 && i9 <= str.length() && i8 <= i9) {
            if (i8 < i9) {
                i11 = i8 + 1;
                int digit = Character.digit(str.charAt(i8), 10);
                if (digit >= 0) {
                    i10 = -digit;
                } else {
                    throw new NumberFormatException("Invalid number: " + str.substring(i8, i9));
                }
            } else {
                i10 = 0;
                i11 = i8;
            }
            while (i11 < i9) {
                int i12 = i11 + 1;
                int digit2 = Character.digit(str.charAt(i11), 10);
                if (digit2 >= 0) {
                    i10 = (i10 * 10) - digit2;
                    i11 = i12;
                } else {
                    throw new NumberFormatException("Invalid number: " + str.substring(i8, i9));
                }
            }
            return -i10;
        }
        throw new NumberFormatException(str);
    }
}
