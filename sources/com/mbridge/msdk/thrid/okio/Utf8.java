package com.mbridge.msdk.thrid.okio;

/* loaded from: classes4.dex */
public final class Utf8 {
    private Utf8() {
    }

    public static long size(String str) {
        return size(str, 0, str.length());
    }

    public static long size(String str, int i8, int i9) {
        long j8;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i8 < 0) {
            throw new IllegalArgumentException("beginIndex < 0: " + i8);
        }
        if (i9 >= i8) {
            if (i9 > str.length()) {
                throw new IllegalArgumentException("endIndex > string.length: " + i9 + " > " + str.length());
            }
            long j9 = 0;
            while (i8 < i9) {
                char charAt = str.charAt(i8);
                if (charAt < 128) {
                    j9++;
                } else {
                    if (charAt < 2048) {
                        j8 = 2;
                    } else if (charAt < 55296 || charAt > 57343) {
                        j8 = 3;
                    } else {
                        int i10 = i8 + 1;
                        char charAt2 = i10 < i9 ? str.charAt(i10) : (char) 0;
                        if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                            j9++;
                            i8 = i10;
                        } else {
                            j9 += 4;
                            i8 += 2;
                        }
                    }
                    j9 += j8;
                }
                i8++;
            }
            return j9;
        }
        throw new IllegalArgumentException("endIndex < beginIndex: " + i9 + " < " + i8);
    }
}
