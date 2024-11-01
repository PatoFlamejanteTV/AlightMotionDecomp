package l6;

import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class v extends u {
    public static final Void h(String input) {
        AbstractC3292y.i(input, "input");
        throw new NumberFormatException("Invalid number format: '" + input + '\'');
    }

    public static Integer i(String str) {
        AbstractC3292y.i(str, "<this>");
        return j(str, 10);
    }

    public static final Integer j(String str, int i8) {
        boolean z8;
        int i9;
        int i10;
        AbstractC3292y.i(str, "<this>");
        AbstractC3335a.a(i8);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char charAt = str.charAt(0);
        int i12 = -2147483647;
        if (AbstractC3292y.k(charAt, 48) < 0) {
            i9 = 1;
            if (length == 1) {
                return null;
            }
            if (charAt != '+') {
                if (charAt != '-') {
                    return null;
                }
                i12 = Integer.MIN_VALUE;
                z8 = true;
            } else {
                z8 = false;
            }
        } else {
            z8 = false;
            i9 = 0;
        }
        int i13 = -59652323;
        while (i9 < length) {
            int b9 = AbstractC3336b.b(str.charAt(i9), i8);
            if (b9 < 0) {
                return null;
            }
            if ((i11 < i13 && (i13 != -59652323 || i11 < (i13 = i12 / i8))) || (i10 = i11 * i8) < i12 + b9) {
                return null;
            }
            i11 = i10 - b9;
            i9++;
        }
        if (z8) {
            return Integer.valueOf(i11);
        }
        return Integer.valueOf(-i11);
    }

    public static Long k(String str) {
        AbstractC3292y.i(str, "<this>");
        return l(str, 10);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Long l(java.lang.String r18, int r19) {
        /*
            r0 = r18
            r1 = r19
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.AbstractC3292y.i(r0, r2)
            l6.AbstractC3335a.a(r19)
            int r2 = r18.length()
            r3 = 0
            if (r2 != 0) goto L14
            return r3
        L14:
            r4 = 0
            char r5 = r0.charAt(r4)
            r6 = 48
            int r6 = kotlin.jvm.internal.AbstractC3292y.k(r5, r6)
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r6 >= 0) goto L38
            r6 = 1
            if (r2 != r6) goto L2a
            return r3
        L2a:
            r9 = 43
            if (r5 == r9) goto L37
            r4 = 45
            if (r5 == r4) goto L33
            return r3
        L33:
            r7 = -9223372036854775808
            r4 = 1
            goto L39
        L37:
            r4 = 1
        L38:
            r6 = 0
        L39:
            r9 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            r11 = 0
            r13 = r9
        L41:
            if (r4 >= r2) goto L72
            char r5 = r0.charAt(r4)
            int r5 = l6.AbstractC3336b.b(r5, r1)
            if (r5 >= 0) goto L4e
            return r3
        L4e:
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 >= 0) goto L5e
            int r15 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r15 != 0) goto L5d
            long r13 = (long) r1
            long r13 = r7 / r13
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 >= 0) goto L5e
        L5d:
            return r3
        L5e:
            long r9 = (long) r1
            long r11 = r11 * r9
            long r9 = (long) r5
            long r16 = r7 + r9
            int r5 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r5 >= 0) goto L69
            return r3
        L69:
            long r11 = r11 - r9
            int r4 = r4 + 1
            r9 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            goto L41
        L72:
            if (r6 == 0) goto L79
            java.lang.Long r0 = java.lang.Long.valueOf(r11)
            goto L7e
        L79:
            long r0 = -r11
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L7e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.v.l(java.lang.String, int):java.lang.Long");
    }
}
