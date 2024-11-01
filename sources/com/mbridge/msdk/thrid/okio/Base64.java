package com.mbridge.msdk.thrid.okio;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.UnsupportedEncodingException;

/* loaded from: classes4.dex */
final class Base64 {
    private static final byte[] MAP = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    private static final byte[] URL_MAP = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    private Base64() {
    }

    public static byte[] decode(String str) {
        int i8;
        char charAt;
        int length = str.length();
        while (length > 0 && ((charAt = str.charAt(length - 1)) == '=' || charAt == '\n' || charAt == '\r' || charAt == ' ' || charAt == '\t')) {
            length--;
        }
        int i9 = (int) ((length * 6) / 8);
        byte[] bArr = new byte[i9];
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            char charAt2 = str.charAt(i13);
            if (charAt2 >= 'A' && charAt2 <= 'Z') {
                i8 = charAt2 - 'A';
            } else if (charAt2 >= 'a' && charAt2 <= 'z') {
                i8 = charAt2 - 'G';
            } else if (charAt2 >= '0' && charAt2 <= '9') {
                i8 = charAt2 + 4;
            } else if (charAt2 != '+' && charAt2 != '-') {
                if (charAt2 != '/' && charAt2 != '_') {
                    if (charAt2 != '\n' && charAt2 != '\r' && charAt2 != ' ' && charAt2 != '\t') {
                        return null;
                    }
                } else {
                    i8 = 63;
                }
            } else {
                i8 = 62;
            }
            i11 = (i11 << 6) | ((byte) i8);
            i10++;
            if (i10 % 4 == 0) {
                bArr[i12] = (byte) (i11 >> 16);
                int i14 = i12 + 2;
                bArr[i12 + 1] = (byte) (i11 >> 8);
                i12 += 3;
                bArr[i14] = (byte) i11;
            }
        }
        int i15 = i10 % 4;
        if (i15 == 1) {
            return null;
        }
        if (i15 == 2) {
            bArr[i12] = (byte) ((i11 << 12) >> 16);
            i12++;
        } else if (i15 == 3) {
            int i16 = i11 << 6;
            int i17 = i12 + 1;
            bArr[i12] = (byte) (i16 >> 16);
            i12 += 2;
            bArr[i17] = (byte) (i16 >> 8);
        }
        if (i12 == i9) {
            return bArr;
        }
        byte[] bArr2 = new byte[i12];
        System.arraycopy(bArr, 0, bArr2, 0, i12);
        return bArr2;
    }

    public static String encode(byte[] bArr) {
        return encode(bArr, MAP);
    }

    public static String encodeUrl(byte[] bArr) {
        return encode(bArr, URL_MAP);
    }

    private static String encode(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i8 = 0;
        for (int i9 = 0; i9 < length; i9 += 3) {
            bArr3[i8] = bArr2[(bArr[i9] & 255) >> 2];
            int i10 = i9 + 1;
            bArr3[i8 + 1] = bArr2[((bArr[i9] & 3) << 4) | ((bArr[i10] & 255) >> 4)];
            int i11 = i8 + 3;
            int i12 = (bArr[i10] & 15) << 2;
            int i13 = i9 + 2;
            bArr3[i8 + 2] = bArr2[i12 | ((bArr[i13] & 255) >> 6)];
            i8 += 4;
            bArr3[i11] = bArr2[bArr[i13] & 63];
        }
        int length2 = bArr.length % 3;
        if (length2 == 1) {
            bArr3[i8] = bArr2[(bArr[length] & 255) >> 2];
            bArr3[i8 + 1] = bArr2[(bArr[length] & 3) << 4];
            bArr3[i8 + 2] = 61;
            bArr3[i8 + 3] = 61;
        } else if (length2 == 2) {
            bArr3[i8] = bArr2[(bArr[length] & 255) >> 2];
            int i14 = (bArr[length] & 3) << 4;
            int i15 = length + 1;
            bArr3[i8 + 1] = bArr2[((bArr[i15] & 255) >> 4) | i14];
            bArr3[i8 + 2] = bArr2[(bArr[i15] & 15) << 2];
            bArr3[i8 + 3] = 61;
        }
        try {
            return new String(bArr3, C.ASCII_NAME);
        } catch (UnsupportedEncodingException e8) {
            throw new AssertionError(e8);
        }
    }
}
