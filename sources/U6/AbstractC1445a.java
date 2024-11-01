package U6;

import U6.C1452h;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: U6.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1445a {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f10183a;

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f10184b;

    static {
        C1452h.a aVar = C1452h.f10221d;
        f10183a = aVar.c("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").i();
        f10184b = aVar.c("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").i();
    }

    public static final byte[] a(String str) {
        int i8;
        char charAt;
        AbstractC3292y.i(str, "<this>");
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
            if ('A' <= charAt2 && charAt2 < '[') {
                i8 = charAt2 - 'A';
            } else if ('a' <= charAt2 && charAt2 < '{') {
                i8 = charAt2 - 'G';
            } else if ('0' <= charAt2 && charAt2 < ':') {
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
            i11 = (i11 << 6) | i8;
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
        if (i15 != 2) {
            if (i15 == 3) {
                int i16 = i11 << 6;
                int i17 = i12 + 1;
                bArr[i12] = (byte) (i16 >> 16);
                i12 += 2;
                bArr[i17] = (byte) (i16 >> 8);
            }
        } else {
            bArr[i12] = (byte) ((i11 << 12) >> 16);
            i12++;
        }
        if (i12 == i9) {
            return bArr;
        }
        byte[] copyOf = Arrays.copyOf(bArr, i12);
        AbstractC3292y.h(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    public static final String b(byte[] bArr, byte[] map) {
        AbstractC3292y.i(bArr, "<this>");
        AbstractC3292y.i(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            byte b9 = bArr[i8];
            int i10 = i8 + 2;
            byte b10 = bArr[i8 + 1];
            i8 += 3;
            byte b11 = bArr[i10];
            bArr2[i9] = map[(b9 & 255) >> 2];
            bArr2[i9 + 1] = map[((b9 & 3) << 4) | ((b10 & 255) >> 4)];
            int i11 = i9 + 3;
            bArr2[i9 + 2] = map[((b10 & 15) << 2) | ((b11 & 255) >> 6)];
            i9 += 4;
            bArr2[i11] = map[b11 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 != 1) {
            if (length2 == 2) {
                int i12 = i8 + 1;
                byte b12 = bArr[i8];
                byte b13 = bArr[i12];
                bArr2[i9] = map[(b12 & 255) >> 2];
                bArr2[i9 + 1] = map[((b12 & 3) << 4) | ((b13 & 255) >> 4)];
                bArr2[i9 + 2] = map[(b13 & 15) << 2];
                bArr2[i9 + 3] = 61;
            }
        } else {
            byte b14 = bArr[i8];
            bArr2[i9] = map[(b14 & 255) >> 2];
            bArr2[i9 + 1] = map[(b14 & 3) << 4];
            bArr2[i9 + 2] = 61;
            bArr2[i9 + 3] = 61;
        }
        return c0.c(bArr2);
    }

    public static /* synthetic */ String c(byte[] bArr, byte[] bArr2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            bArr2 = f10183a;
        }
        return b(bArr, bArr2);
    }
}
