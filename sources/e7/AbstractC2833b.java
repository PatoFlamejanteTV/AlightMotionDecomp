package e7;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;

/* renamed from: e7.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2833b implements d7.e {

    /* renamed from: g, reason: collision with root package name */
    private static long[] f31729g = {1, 32898, -9223372036854742902L, -9223372034707259392L, 32907, 2147483649L, -9223372034707259263L, -9223372036854743031L, 138, 136, 2147516425L, 2147483658L, 2147516555L, -9223372036854775669L, -9223372036854742903L, -9223372036854743037L, -9223372036854743038L, -9223372036854775680L, 32778, -9223372034707292150L, -9223372034707259263L, -9223372036854742912L, 2147483649L, -9223372034707259384L};

    /* renamed from: a, reason: collision with root package name */
    protected long[] f31730a = new long[25];

    /* renamed from: b, reason: collision with root package name */
    protected byte[] f31731b = new byte[PsExtractor.AUDIO_STREAM];

    /* renamed from: c, reason: collision with root package name */
    protected int f31732c;

    /* renamed from: d, reason: collision with root package name */
    protected int f31733d;

    /* renamed from: e, reason: collision with root package name */
    protected int f31734e;

    /* renamed from: f, reason: collision with root package name */
    protected boolean f31735f;

    public AbstractC2833b(int i8) {
        n(i8);
    }

    private void g(byte[] bArr, int i8) {
        int i9 = this.f31732c >>> 6;
        for (int i10 = 0; i10 < i9; i10++) {
            long[] jArr = this.f31730a;
            jArr[i10] = jArr[i10] ^ J7.f.g(bArr, i8);
            i8 += 8;
        }
        K7.b.c(m()).toLowerCase();
        i();
    }

    private void h() {
        i();
        m();
        J7.f.l(this.f31730a, 0, this.f31732c >>> 6, this.f31731b, 0);
        this.f31733d = this.f31732c;
    }

    private void i() {
        long[] jArr = this.f31730a;
        int i8 = 0;
        long j8 = jArr[0];
        char c8 = 1;
        long j9 = jArr[1];
        long j10 = jArr[2];
        char c9 = 3;
        long j11 = jArr[3];
        long j12 = jArr[4];
        long j13 = jArr[5];
        long j14 = jArr[6];
        long j15 = jArr[7];
        long j16 = jArr[8];
        long j17 = jArr[9];
        long j18 = jArr[10];
        long j19 = jArr[11];
        long j20 = jArr[12];
        long j21 = jArr[13];
        long j22 = jArr[14];
        long j23 = jArr[15];
        long j24 = jArr[16];
        long j25 = jArr[17];
        long j26 = jArr[18];
        long j27 = jArr[19];
        long j28 = jArr[20];
        long j29 = jArr[21];
        long j30 = jArr[22];
        long j31 = jArr[23];
        int i9 = 24;
        long j32 = jArr[24];
        while (i8 < i9) {
            long j33 = (((j8 ^ j13) ^ j18) ^ j23) ^ j28;
            long j34 = (((j9 ^ j14) ^ j19) ^ j24) ^ j29;
            long j35 = (((j10 ^ j15) ^ j20) ^ j25) ^ j30;
            long j36 = (((j11 ^ j16) ^ j21) ^ j26) ^ j31;
            long j37 = (((j12 ^ j17) ^ j22) ^ j27) ^ j32;
            long j38 = ((j34 << c8) | (j34 >>> (-1))) ^ j37;
            long j39 = ((j35 << c8) | (j35 >>> (-1))) ^ j33;
            long j40 = ((j36 << c8) | (j36 >>> (-1))) ^ j34;
            long j41 = ((j37 << c8) | (j37 >>> (-1))) ^ j35;
            long j42 = ((j33 << c8) | (j33 >>> (-1))) ^ j36;
            long j43 = j8 ^ j38;
            long j44 = j13 ^ j38;
            long j45 = j18 ^ j38;
            long j46 = j23 ^ j38;
            long j47 = j28 ^ j38;
            long j48 = j9 ^ j39;
            long j49 = j14 ^ j39;
            long j50 = j19 ^ j39;
            long j51 = j24 ^ j39;
            long j52 = j29 ^ j39;
            long j53 = j10 ^ j40;
            long j54 = j15 ^ j40;
            long j55 = j20 ^ j40;
            long j56 = j25 ^ j40;
            long j57 = j30 ^ j40;
            long j58 = j11 ^ j41;
            long j59 = j16 ^ j41;
            long j60 = j21 ^ j41;
            long j61 = j26 ^ j41;
            long j62 = j31 ^ j41;
            long j63 = j12 ^ j42;
            long j64 = j17 ^ j42;
            long j65 = j22 ^ j42;
            long j66 = j27 ^ j42;
            long j67 = j32 ^ j42;
            long j68 = (j48 << c8) | (j48 >>> 63);
            long j69 = (j49 << 44) | (j49 >>> 20);
            long j70 = (j64 << 20) | (j64 >>> 44);
            long j71 = (j57 << 61) | (j57 >>> c9);
            long j72 = (j65 << 39) | (j65 >>> 25);
            long j73 = (j47 << 18) | (j47 >>> 46);
            long j74 = (j53 << 62) | (j53 >>> 2);
            long j75 = (j55 << 43) | (j55 >>> 21);
            long j76 = (j60 << 25) | (j60 >>> 39);
            long j77 = (j66 << 8) | (j66 >>> 56);
            long j78 = (j62 << 56) | (j62 >>> 8);
            long j79 = (j46 << 41) | (j46 >>> 23);
            long j80 = (j63 << 27) | (j63 >>> 37);
            long j81 = (j67 << 14) | (j67 >>> 50);
            long j82 = (j52 << 2) | (j52 >>> 62);
            long j83 = (j59 << 55) | (j59 >>> 9);
            long j84 = (j51 << 45) | (j51 >>> 19);
            long j85 = (j44 << 36) | (j44 >>> 28);
            long j86 = (j58 << 28) | (j58 >>> 36);
            long j87 = (j61 << 21) | (j61 >>> 43);
            long j88 = (j56 << 15) | (j56 >>> 49);
            long j89 = (j50 << 10) | (j50 >>> 54);
            long j90 = (j54 << 6) | (j54 >>> 58);
            long j91 = (j45 << 3) | (j45 >>> 61);
            long j92 = ((~j69) & j75) ^ j43;
            long j93 = ((~j75) & j87) ^ j69;
            j10 = j75 ^ ((~j87) & j81);
            j11 = j87 ^ ((~j81) & j43);
            long j94 = j81 ^ ((~j43) & j69);
            long j95 = j86 ^ ((~j70) & j91);
            long j96 = ((~j91) & j84) ^ j70;
            long j97 = ((~j84) & j71) ^ j91;
            long j98 = j84 ^ ((~j71) & j86);
            long j99 = ((~j86) & j70) ^ j71;
            j18 = j68 ^ ((~j90) & j76);
            long j100 = ((~j76) & j77) ^ j90;
            long j101 = ((~j77) & j73) ^ j76;
            long j102 = j77 ^ ((~j73) & j68);
            long j103 = ((~j68) & j90) ^ j73;
            long j104 = j80 ^ ((~j85) & j89);
            long j105 = ((~j89) & j88) ^ j85;
            long j106 = j89 ^ ((~j88) & j78);
            long j107 = ((~j78) & j80) ^ j88;
            long j108 = ((~j80) & j85) ^ j78;
            long j109 = j74 ^ ((~j83) & j72);
            long j110 = ((~j72) & j79) ^ j83;
            j28 = j109;
            long j111 = j72 ^ ((~j79) & j82);
            long j112 = ((~j82) & j74) ^ j79;
            long j113 = ((~j74) & j83) ^ j82;
            long j114 = j92 ^ f31729g[i8];
            i8++;
            j14 = j96;
            j20 = j101;
            j19 = j100;
            j21 = j102;
            j29 = j110;
            c9 = 3;
            j31 = j112;
            j30 = j111;
            j17 = j99;
            jArr = jArr;
            j27 = j108;
            j22 = j103;
            j15 = j97;
            j16 = j98;
            j25 = j106;
            j23 = j104;
            j12 = j94;
            j13 = j95;
            i9 = 24;
            j26 = j107;
            j24 = j105;
            c8 = 1;
            j9 = j93;
            j32 = j113;
            j8 = j114;
        }
        long[] jArr2 = jArr;
        jArr2[0] = j8;
        jArr2[1] = j9;
        jArr2[2] = j10;
        jArr2[3] = j11;
        jArr2[4] = j12;
        jArr2[5] = j13;
        jArr2[6] = j14;
        jArr2[7] = j15;
        jArr2[8] = j16;
        jArr2[9] = j17;
        jArr2[10] = j18;
        jArr2[11] = j19;
        jArr2[12] = j20;
        jArr2[13] = j21;
        jArr2[14] = j22;
        jArr2[15] = j23;
        jArr2[16] = j24;
        jArr2[17] = j25;
        jArr2[18] = j26;
        jArr2[19] = j27;
        jArr2[20] = j28;
        jArr2[21] = j29;
        jArr2[22] = j30;
        jArr2[23] = j31;
        jArr2[24] = j32;
    }

    private void n(int i8) {
        if (i8 != 128 && i8 != 224 && i8 != 256 && i8 != 288 && i8 != 384 && i8 != 512) {
            throw new IllegalArgumentException("bitLength must be one of 128, 224, 256, 288, 384, or 512.");
        }
        o(1600 - (i8 << 1));
    }

    private void o(int i8) {
        if (i8 > 0 && i8 < 1600 && i8 % 64 == 0) {
            this.f31732c = i8;
            int i9 = 0;
            while (true) {
                long[] jArr = this.f31730a;
                if (i9 < jArr.length) {
                    jArr[i9] = 0;
                    i9++;
                } else {
                    J7.a.i(this.f31731b, (byte) 0);
                    this.f31733d = 0;
                    this.f31735f = false;
                    this.f31734e = (1600 - i8) / 2;
                    return;
                }
            }
        } else {
            throw new IllegalStateException("invalid rate value");
        }
    }

    private void p() {
        byte[] bArr = this.f31731b;
        int i8 = this.f31733d;
        int i9 = i8 >>> 3;
        bArr[i9] = (byte) (bArr[i9] | ((byte) (1 << (i8 & 7))));
        int i10 = i8 + 1;
        this.f31733d = i10;
        if (i10 == this.f31732c) {
            g(bArr, 0);
        } else {
            int i11 = i10 >>> 6;
            int i12 = i10 & 63;
            int i13 = 0;
            for (int i14 = 0; i14 < i11; i14++) {
                long[] jArr = this.f31730a;
                jArr[i14] = jArr[i14] ^ J7.f.g(this.f31731b, i13);
                i13 += 8;
            }
            m();
            if (i12 > 0) {
                long[] jArr2 = this.f31730a;
                jArr2[i11] = (((1 << i12) - 1) & J7.f.g(this.f31731b, i13)) ^ jArr2[i11];
            }
        }
        long[] jArr3 = this.f31730a;
        int i15 = (this.f31732c - 1) >>> 6;
        jArr3[i15] = jArr3[i15] ^ Long.MIN_VALUE;
        this.f31733d = 0;
        this.f31735f = true;
    }

    @Override // d7.e
    public int a(byte[] bArr, int i8) {
        r(bArr, i8, this.f31734e);
        q();
        return f();
    }

    @Override // d7.e
    public void b(byte[] bArr, int i8, int i9) {
        k(bArr, i8, i9);
    }

    @Override // d7.e
    public void c(byte b9) {
        j(b9);
    }

    @Override // d7.e
    public int f() {
        return this.f31734e / 8;
    }

    protected void j(byte b9) {
        int i8 = this.f31733d;
        if (i8 % 8 == 0) {
            if (!this.f31735f) {
                byte[] bArr = this.f31731b;
                bArr[i8 >>> 3] = b9;
                int i9 = i8 + 8;
                this.f31733d = i9;
                if (i9 == this.f31732c) {
                    g(bArr, 0);
                    this.f31733d = 0;
                    return;
                }
                return;
            }
            throw new IllegalStateException("attempt to absorb while squeezing");
        }
        throw new IllegalStateException("attempt to absorb with odd length queue");
    }

    protected void k(byte[] bArr, int i8, int i9) {
        int i10;
        int i11;
        int i12 = this.f31733d;
        if (i12 % 8 == 0) {
            if (!this.f31735f) {
                int i13 = i12 >>> 3;
                int i14 = this.f31732c >>> 3;
                int i15 = i14 - i13;
                if (i9 < i15) {
                    System.arraycopy(bArr, i8, this.f31731b, i13, i9);
                    i11 = this.f31733d + (i9 << 3);
                } else {
                    if (i13 > 0) {
                        System.arraycopy(bArr, i8, this.f31731b, i13, i15);
                        g(this.f31731b, 0);
                    } else {
                        i15 = 0;
                    }
                    while (true) {
                        i10 = i9 - i15;
                        if (i10 < i14) {
                            break;
                        }
                        g(bArr, i8 + i15);
                        i15 += i14;
                    }
                    System.arraycopy(bArr, i8 + i15, this.f31731b, 0, i10);
                    i11 = i10 << 3;
                }
                this.f31733d = i11;
                return;
            }
            throw new IllegalStateException("attempt to absorb while squeezing");
        }
        throw new IllegalStateException("attempt to absorb with odd length queue");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void l(int i8, int i9) {
        if (i9 >= 1 && i9 <= 7) {
            int i10 = this.f31733d;
            if (i10 % 8 == 0) {
                if (!this.f31735f) {
                    this.f31731b[i10 >>> 3] = (byte) (i8 & ((1 << i9) - 1));
                    this.f31733d = i10 + i9;
                    return;
                }
                throw new IllegalStateException("attempt to absorb while squeezing");
            }
            throw new IllegalStateException("attempt to absorb with odd length queue");
        }
        throw new IllegalArgumentException("'bits' must be in the range 1 to 7");
    }

    protected byte[] m() {
        byte[] bArr = new byte[this.f31730a.length * 8];
        int i8 = 0;
        int i9 = 0;
        while (true) {
            long[] jArr = this.f31730a;
            if (i8 != jArr.length) {
                J7.f.k(jArr[i8], bArr, i9);
                i9 += 8;
                i8++;
            } else {
                return bArr;
            }
        }
    }

    public void q() {
        n(this.f31734e);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void r(byte[] bArr, int i8, long j8) {
        if (!this.f31735f) {
            p();
        }
        m();
        long j9 = 0;
        if (j8 % 8 == 0) {
            while (j9 < j8) {
                if (this.f31733d == 0) {
                    h();
                }
                int min = (int) Math.min(this.f31733d, j8 - j9);
                System.arraycopy(this.f31731b, (this.f31732c - this.f31733d) / 8, bArr, ((int) (j9 / 8)) + i8, min / 8);
                this.f31733d -= min;
                j9 += min;
            }
            m();
            return;
        }
        throw new IllegalStateException("outputLength not a multiple of 8");
    }
}
