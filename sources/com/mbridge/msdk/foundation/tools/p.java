package com.mbridge.msdk.foundation.tools;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.nio.charset.StandardCharsets;

/* loaded from: classes4.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f21331a;

    /* renamed from: b, reason: collision with root package name */
    public int f21332b;

    /* renamed from: c, reason: collision with root package name */
    private char[] f21333c;

    public p(int i8) {
        this(new byte[i8], 0);
    }

    public static int a(String str) {
        int length = str.length();
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            int i10 = i8 + 1;
            char charAt = str.charAt(i8);
            if (charAt < 128) {
                i9++;
            } else if (charAt < 2048) {
                i9 += 2;
            } else if (charAt < 55296 || charAt > 57343) {
                i9 += 3;
            } else {
                i8 += 2;
                i9 += 4;
            }
            i8 = i10;
        }
        return i9;
    }

    private long c(int i8) {
        byte[] bArr = this.f21331a;
        int i9 = i8 + 6;
        return (bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8 + 2] & 255) << 16) | ((bArr[i8 + 3] & 255) << 24) | ((bArr[i8 + 4] & 255) << 32) | ((bArr[i8 + 5] & 255) << 40) | ((bArr[i9] & 255) << 48) | (bArr[i8 + 7] << 56);
    }

    public final long b() {
        long c8 = c(this.f21332b);
        this.f21332b += 8;
        return c8;
    }

    public final short d() {
        byte[] bArr = this.f21331a;
        int i8 = this.f21332b;
        int i9 = i8 + 1;
        this.f21332b = i9;
        int i10 = bArr[i8] & 255;
        this.f21332b = i8 + 2;
        return (short) ((bArr[i9] << 8) | i10);
    }

    public p(byte[] bArr, int i8) {
        this.f21333c = null;
        this.f21331a = bArr;
        this.f21332b = i8;
    }

    public final int c() {
        byte[] bArr = this.f21331a;
        int i8 = this.f21332b;
        int i9 = i8 + 1;
        this.f21332b = i9;
        int i10 = bArr[i8] & 255;
        int i11 = i8 + 2;
        this.f21332b = i11;
        int i12 = ((bArr[i9] & 255) << 8) | i10;
        int i13 = i8 + 3;
        this.f21332b = i13;
        int i14 = i12 | ((bArr[i11] & 255) << 16);
        this.f21332b = i8 + 4;
        return (bArr[i13] << 24) | i14;
    }

    public final byte a() {
        byte[] bArr = this.f21331a;
        int i8 = this.f21332b;
        this.f21332b = i8 + 1;
        return bArr[i8];
    }

    public final void b(int i8) {
        byte[] bArr = this.f21331a;
        int i9 = this.f21332b;
        int i10 = i9 + 1;
        this.f21332b = i10;
        bArr[i9] = (byte) i8;
        int i11 = i9 + 2;
        this.f21332b = i11;
        bArr[i10] = (byte) (i8 >> 8);
        int i12 = i9 + 3;
        this.f21332b = i12;
        bArr[i11] = (byte) (i8 >> 16);
        this.f21332b = i9 + 4;
        bArr[i12] = (byte) (i8 >> 24);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long a(int i8, int i9) {
        long j8 = 0;
        if (i9 <= 0) {
            return 0L;
        }
        int i10 = i9 >> 3;
        int i11 = i9 & 7;
        int i12 = 0;
        int i13 = i8;
        for (int i14 = 0; i14 < i10; i14++) {
            j8 ^= c(i13);
            i13 += 8;
        }
        while (i12 < (i11 << 3)) {
            j8 ^= (this.f21331a[i13] & 255) << i12;
            i12 += 8;
            i13++;
        }
        int i15 = (i8 & 7) << 3;
        return (j8 >>> (64 - i15)) | (j8 << i15);
    }

    public p(byte[] bArr) {
        this(bArr, 0);
    }

    public final String a(int i8) {
        String str;
        if (i8 < 0) {
            return null;
        }
        if (i8 == 0) {
            return "";
        }
        if (i8 > 2048) {
            str = new String(this.f21331a, this.f21332b, i8, StandardCharsets.UTF_8);
        } else {
            char[] cArr = this.f21333c;
            if (cArr == null) {
                if (i8 <= 256) {
                    this.f21333c = new char[256];
                } else {
                    this.f21333c = new char[2048];
                }
            } else if (cArr.length < i8) {
                this.f21333c = new char[2048];
            }
            char[] cArr2 = this.f21333c;
            byte[] bArr = this.f21331a;
            int i9 = this.f21332b;
            int i10 = i9 + i8;
            int i11 = 0;
            while (i9 < i10) {
                int i12 = i9 + 1;
                byte b9 = bArr[i9];
                if (b9 > 0) {
                    cArr2[i11] = (char) b9;
                    i11++;
                    i9 = i12;
                } else if (b9 < -32) {
                    i9 += 2;
                    cArr2[i11] = (char) ((bArr[i12] & 63) | ((b9 & 31) << 6));
                    i11++;
                } else if (b9 < -16) {
                    int i13 = i9 + 2;
                    i9 += 3;
                    cArr2[i11] = (char) (((bArr[i12] & 63) << 6) | ((b9 & 15) << 12) | (bArr[i13] & 63));
                    i11++;
                } else {
                    byte b10 = bArr[i12];
                    int i14 = i9 + 3;
                    byte b11 = bArr[i9 + 2];
                    i9 += 4;
                    int i15 = ((b10 & 63) << 12) | ((b9 & 7) << 18) | ((b11 & 63) << 6) | (bArr[i14] & 63);
                    int i16 = i11 + 1;
                    cArr2[i11] = (char) ((i15 >>> 10) + 55232);
                    i11 += 2;
                    cArr2[i16] = (char) ((i15 & 1023) + 56320);
                }
            }
            if (i9 <= i10) {
                str = new String(cArr2, 0, i11);
            } else {
                throw new IllegalArgumentException("Invalid String");
            }
        }
        this.f21332b += i8;
        return str;
    }

    public final void b(int i8, int i9) {
        byte[] bArr = this.f21331a;
        bArr[i8] = (byte) i9;
        bArr[i8 + 1] = (byte) (i9 >> 8);
        bArr[i8 + 2] = (byte) (i9 >> 16);
        bArr[i8 + 3] = (byte) (i9 >> 24);
    }

    public final void b(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        byte[] bArr = this.f21331a;
        int i8 = this.f21332b;
        int length = str.length();
        int i9 = 0;
        while (i9 < length) {
            int i10 = i9 + 1;
            char charAt = str.charAt(i9);
            if (charAt < 128) {
                bArr[i8] = (byte) charAt;
                i8++;
            } else if (charAt < 2048) {
                int i11 = i8 + 1;
                bArr[i8] = (byte) ((charAt >>> 6) | PsExtractor.AUDIO_STREAM);
                i8 += 2;
                bArr[i11] = (byte) ((charAt & '?') | 128);
            } else if (charAt >= 55296 && charAt <= 57343) {
                i9 += 2;
                int charAt2 = ((charAt << '\n') + str.charAt(i10)) - 56613888;
                bArr[i8] = (byte) ((charAt2 >>> 18) | PsExtractor.VIDEO_STREAM_MASK);
                bArr[i8 + 1] = (byte) (((charAt2 >>> 12) & 63) | 128);
                int i12 = i8 + 3;
                bArr[i8 + 2] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i8 += 4;
                bArr[i12] = (byte) ((charAt2 & 63) | 128);
            } else {
                bArr[i8] = (byte) ((charAt >>> '\f') | 224);
                int i13 = i8 + 2;
                bArr[i8 + 1] = (byte) (((charAt >>> 6) & 63) | 128);
                i8 += 3;
                bArr[i13] = (byte) ((charAt & '?') | 128);
            }
            i9 = i10;
        }
        this.f21332b = i8;
    }

    public final void a(byte b9) {
        byte[] bArr = this.f21331a;
        int i8 = this.f21332b;
        this.f21332b = i8 + 1;
        bArr[i8] = b9;
    }

    public final void a(byte[] bArr) {
        int length = bArr.length;
        if (length > 0) {
            System.arraycopy(bArr, 0, this.f21331a, this.f21332b, length);
            this.f21332b += length;
        }
    }

    public final void a(long j8) {
        a(this.f21332b, j8);
        this.f21332b += 8;
    }

    public final void a(int i8, long j8) {
        byte[] bArr = this.f21331a;
        bArr[i8] = (byte) j8;
        bArr[i8 + 1] = (byte) (j8 >> 8);
        bArr[i8 + 2] = (byte) (j8 >> 16);
        bArr[i8 + 3] = (byte) (j8 >> 24);
        bArr[i8 + 4] = (byte) (j8 >> 32);
        bArr[i8 + 5] = (byte) (j8 >> 40);
        bArr[i8 + 6] = (byte) (j8 >> 48);
        bArr[i8 + 7] = (byte) (j8 >> 56);
    }

    public final void a(short s8) {
        byte[] bArr = this.f21331a;
        int i8 = this.f21332b;
        int i9 = i8 + 1;
        this.f21332b = i9;
        bArr[i8] = (byte) s8;
        this.f21332b = i8 + 2;
        bArr[i9] = (byte) (s8 >> 8);
    }
}
