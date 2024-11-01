package e7;

/* loaded from: classes5.dex */
public class f extends AbstractC2832a {

    /* renamed from: n, reason: collision with root package name */
    static final int[] f31764n = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};

    /* renamed from: d, reason: collision with root package name */
    private int f31765d;

    /* renamed from: e, reason: collision with root package name */
    private int f31766e;

    /* renamed from: f, reason: collision with root package name */
    private int f31767f;

    /* renamed from: g, reason: collision with root package name */
    private int f31768g;

    /* renamed from: h, reason: collision with root package name */
    private int f31769h;

    /* renamed from: i, reason: collision with root package name */
    private int f31770i;

    /* renamed from: j, reason: collision with root package name */
    private int f31771j;

    /* renamed from: k, reason: collision with root package name */
    private int f31772k;

    /* renamed from: l, reason: collision with root package name */
    private int[] f31773l = new int[64];

    /* renamed from: m, reason: collision with root package name */
    private int f31774m;

    public f() {
        k();
    }

    private int l(int i8, int i9, int i10) {
        return ((~i8) & i10) ^ (i9 & i8);
    }

    private int m(int i8, int i9, int i10) {
        return ((i8 & i10) ^ (i8 & i9)) ^ (i9 & i10);
    }

    private int n(int i8) {
        return ((i8 << 10) | (i8 >>> 22)) ^ (((i8 >>> 2) | (i8 << 30)) ^ ((i8 >>> 13) | (i8 << 19)));
    }

    private int o(int i8) {
        return ((i8 << 7) | (i8 >>> 25)) ^ (((i8 >>> 6) | (i8 << 26)) ^ ((i8 >>> 11) | (i8 << 21)));
    }

    private int p(int i8) {
        return (i8 >>> 3) ^ (((i8 >>> 7) | (i8 << 25)) ^ ((i8 >>> 18) | (i8 << 14)));
    }

    private int q(int i8) {
        return (i8 >>> 10) ^ (((i8 >>> 17) | (i8 << 15)) ^ ((i8 >>> 19) | (i8 << 13)));
    }

    @Override // d7.e
    public int a(byte[] bArr, int i8) {
        g();
        J7.f.d(this.f31765d, bArr, i8);
        J7.f.d(this.f31766e, bArr, i8 + 4);
        J7.f.d(this.f31767f, bArr, i8 + 8);
        J7.f.d(this.f31768g, bArr, i8 + 12);
        J7.f.d(this.f31769h, bArr, i8 + 16);
        J7.f.d(this.f31770i, bArr, i8 + 20);
        J7.f.d(this.f31771j, bArr, i8 + 24);
        k();
        return 28;
    }

    @Override // d7.e
    public String e() {
        return "SHA-224";
    }

    @Override // d7.e
    public int f() {
        return 28;
    }

    @Override // e7.AbstractC2832a
    protected void h() {
        for (int i8 = 16; i8 <= 63; i8++) {
            int[] iArr = this.f31773l;
            int q8 = q(iArr[i8 - 2]);
            int[] iArr2 = this.f31773l;
            iArr[i8] = q8 + iArr2[i8 - 7] + p(iArr2[i8 - 15]) + this.f31773l[i8 - 16];
        }
        int i9 = this.f31765d;
        int i10 = this.f31766e;
        int i11 = this.f31767f;
        int i12 = this.f31768g;
        int i13 = this.f31769h;
        int i14 = this.f31770i;
        int i15 = this.f31771j;
        int i16 = this.f31772k;
        int i17 = 0;
        for (int i18 = 0; i18 < 8; i18++) {
            int o8 = o(i13) + l(i13, i14, i15);
            int[] iArr3 = f31764n;
            int i19 = i16 + o8 + iArr3[i17] + this.f31773l[i17];
            int i20 = i12 + i19;
            int n8 = i19 + n(i9) + m(i9, i10, i11);
            int i21 = i17 + 1;
            int o9 = i15 + o(i20) + l(i20, i13, i14) + iArr3[i21] + this.f31773l[i21];
            int i22 = i11 + o9;
            int n9 = o9 + n(n8) + m(n8, i9, i10);
            int i23 = i17 + 2;
            int o10 = i14 + o(i22) + l(i22, i20, i13) + iArr3[i23] + this.f31773l[i23];
            int i24 = i10 + o10;
            int n10 = o10 + n(n9) + m(n9, n8, i9);
            int i25 = i17 + 3;
            int o11 = i13 + o(i24) + l(i24, i22, i20) + iArr3[i25] + this.f31773l[i25];
            int i26 = i9 + o11;
            int n11 = o11 + n(n10) + m(n10, n9, n8);
            int i27 = i17 + 4;
            int o12 = i20 + o(i26) + l(i26, i24, i22) + iArr3[i27] + this.f31773l[i27];
            i16 = n8 + o12;
            i12 = o12 + n(n11) + m(n11, n10, n9);
            int i28 = i17 + 5;
            int o13 = i22 + o(i16) + l(i16, i26, i24) + iArr3[i28] + this.f31773l[i28];
            i15 = n9 + o13;
            i11 = o13 + n(i12) + m(i12, n11, n10);
            int i29 = i17 + 6;
            int o14 = i24 + o(i15) + l(i15, i16, i26) + iArr3[i29] + this.f31773l[i29];
            i14 = n10 + o14;
            i10 = o14 + n(i11) + m(i11, i12, n11);
            int i30 = i17 + 7;
            int o15 = i26 + o(i14) + l(i14, i15, i16) + iArr3[i30] + this.f31773l[i30];
            i13 = n11 + o15;
            i9 = o15 + n(i10) + m(i10, i11, i12);
            i17 += 8;
        }
        this.f31765d += i9;
        this.f31766e += i10;
        this.f31767f += i11;
        this.f31768g += i12;
        this.f31769h += i13;
        this.f31770i += i14;
        this.f31771j += i15;
        this.f31772k += i16;
        this.f31774m = 0;
        for (int i31 = 0; i31 < 16; i31++) {
            this.f31773l[i31] = 0;
        }
    }

    @Override // e7.AbstractC2832a
    protected void i(long j8) {
        if (this.f31774m > 14) {
            h();
        }
        int[] iArr = this.f31773l;
        iArr[14] = (int) (j8 >>> 32);
        iArr[15] = (int) j8;
    }

    @Override // e7.AbstractC2832a
    protected void j(byte[] bArr, int i8) {
        int i9 = (bArr[i8 + 3] & 255) | (bArr[i8] << 24) | ((bArr[i8 + 1] & 255) << 16) | ((bArr[i8 + 2] & 255) << 8);
        int[] iArr = this.f31773l;
        int i10 = this.f31774m;
        iArr[i10] = i9;
        int i11 = i10 + 1;
        this.f31774m = i11;
        if (i11 == 16) {
            h();
        }
    }

    @Override // e7.AbstractC2832a
    public void k() {
        super.k();
        this.f31765d = -1056596264;
        this.f31766e = 914150663;
        this.f31767f = 812702999;
        this.f31768g = -150054599;
        this.f31769h = -4191439;
        this.f31770i = 1750603025;
        this.f31771j = 1694076839;
        this.f31772k = -1090891868;
        this.f31774m = 0;
        int i8 = 0;
        while (true) {
            int[] iArr = this.f31773l;
            if (i8 != iArr.length) {
                iArr[i8] = 0;
                i8++;
            } else {
                return;
            }
        }
    }
}
