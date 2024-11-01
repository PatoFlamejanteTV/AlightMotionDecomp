package com.mbridge.msdk.foundation.tools;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f21341a;

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f21342b;

    static {
        char[] charArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
        f21341a = charArray;
        int[] iArr = new int[256];
        f21342b = iArr;
        Arrays.fill(iArr, -1);
        int length = charArray.length;
        for (int i8 = 0; i8 < length; i8++) {
            f21342b[f21341a[i8]] = i8;
        }
        f21342b[61] = 0;
    }

    public static String a(String str) {
        int i8;
        int i9;
        byte[] bArr;
        int i10;
        int length = str.length();
        if (length == 0) {
            bArr = new byte[0];
        } else {
            int i11 = length - 1;
            int i12 = 0;
            while (i12 < i11 && f21342b[str.charAt(i12) & 255] < 0) {
                i12++;
            }
            while (i11 > 0 && f21342b[str.charAt(i11) & 255] < 0) {
                i11--;
            }
            if (str.charAt(i11) == '=') {
                if (str.charAt(i11 - 1) == '=') {
                    i8 = 2;
                } else {
                    i8 = 1;
                }
            } else {
                i8 = 0;
            }
            int i13 = (i11 - i12) + 1;
            if (length > 76) {
                if (str.charAt(76) == '\r') {
                    i10 = i13 / 78;
                } else {
                    i10 = 0;
                }
                i9 = i10 << 1;
            } else {
                i9 = 0;
            }
            int i14 = (((i13 - i9) * 6) >> 3) - i8;
            byte[] bArr2 = new byte[i14];
            int i15 = (i14 / 3) * 3;
            int i16 = 0;
            int i17 = 0;
            while (i16 < i15) {
                int[] iArr = f21342b;
                int i18 = i12 + 4;
                int i19 = iArr[str.charAt(i12 + 3)] | (iArr[str.charAt(i12 + 1)] << 12) | (iArr[str.charAt(i12)] << 18) | (iArr[str.charAt(i12 + 2)] << 6);
                bArr2[i16] = (byte) (i19 >> 16);
                int i20 = i16 + 2;
                bArr2[i16 + 1] = (byte) (i19 >> 8);
                i16 += 3;
                bArr2[i20] = (byte) i19;
                if (i9 > 0 && (i17 = i17 + 1) == 19) {
                    i12 += 6;
                    i17 = 0;
                } else {
                    i12 = i18;
                }
            }
            if (i16 < i14) {
                int i21 = 0;
                int i22 = 0;
                while (i12 <= i11 - i8) {
                    i21 |= f21342b[str.charAt(i12)] << (18 - (i22 * 6));
                    i22++;
                    i12++;
                }
                int i23 = 16;
                while (i16 < i14) {
                    bArr2[i16] = (byte) (i21 >> i23);
                    i23 -= 8;
                    i16++;
                }
            }
            bArr = bArr2;
        }
        if (bArr.length == 0) {
            return "";
        }
        return new String(bArr, StandardCharsets.UTF_8);
    }
}
