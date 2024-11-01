package e7;

import com.mbridge.msdk.foundation.tools.SameMD5;

/* loaded from: classes5.dex */
public class d extends AbstractC2832a {

    /* renamed from: d, reason: collision with root package name */
    private int f31751d;

    /* renamed from: e, reason: collision with root package name */
    private int f31752e;

    /* renamed from: f, reason: collision with root package name */
    private int f31753f;

    /* renamed from: g, reason: collision with root package name */
    private int f31754g;

    /* renamed from: h, reason: collision with root package name */
    private int[] f31755h = new int[16];

    /* renamed from: i, reason: collision with root package name */
    private int f31756i;

    public d() {
        k();
    }

    private int l(int i8, int i9, int i10) {
        return ((~i8) & i10) | (i9 & i8);
    }

    private int m(int i8, int i9, int i10) {
        return (i8 & i10) | (i9 & (~i10));
    }

    private int n(int i8, int i9, int i10) {
        return (i8 ^ i9) ^ i10;
    }

    private int o(int i8, int i9, int i10) {
        return (i8 | (~i10)) ^ i9;
    }

    private int p(int i8, int i9) {
        return (i8 >>> (32 - i9)) | (i8 << i9);
    }

    private void q(int i8, byte[] bArr, int i9) {
        bArr[i9] = (byte) i8;
        bArr[i9 + 1] = (byte) (i8 >>> 8);
        bArr[i9 + 2] = (byte) (i8 >>> 16);
        bArr[i9 + 3] = (byte) (i8 >>> 24);
    }

    @Override // d7.e
    public int a(byte[] bArr, int i8) {
        g();
        q(this.f31751d, bArr, i8);
        q(this.f31752e, bArr, i8 + 4);
        q(this.f31753f, bArr, i8 + 8);
        q(this.f31754g, bArr, i8 + 12);
        k();
        return 16;
    }

    @Override // d7.e
    public String e() {
        return SameMD5.TAG;
    }

    @Override // d7.e
    public int f() {
        return 16;
    }

    @Override // e7.AbstractC2832a
    protected void h() {
        int i8 = this.f31751d;
        int i9 = this.f31752e;
        int i10 = this.f31753f;
        int i11 = this.f31754g;
        int p8 = p(((i8 + l(i9, i10, i11)) + this.f31755h[0]) - 680876936, 7) + i9;
        int p9 = p(((i11 + l(p8, i9, i10)) + this.f31755h[1]) - 389564586, 12) + p8;
        int p10 = p(i10 + l(p9, p8, i9) + this.f31755h[2] + 606105819, 17) + p9;
        int p11 = p(((i9 + l(p10, p9, p8)) + this.f31755h[3]) - 1044525330, 22) + p10;
        int p12 = p(((p8 + l(p11, p10, p9)) + this.f31755h[4]) - 176418897, 7) + p11;
        int p13 = p(p9 + l(p12, p11, p10) + this.f31755h[5] + 1200080426, 12) + p12;
        int p14 = p(((p10 + l(p13, p12, p11)) + this.f31755h[6]) - 1473231341, 17) + p13;
        int p15 = p(((p11 + l(p14, p13, p12)) + this.f31755h[7]) - 45705983, 22) + p14;
        int p16 = p(p12 + l(p15, p14, p13) + this.f31755h[8] + 1770035416, 7) + p15;
        int p17 = p(((p13 + l(p16, p15, p14)) + this.f31755h[9]) - 1958414417, 12) + p16;
        int p18 = p(((p14 + l(p17, p16, p15)) + this.f31755h[10]) - 42063, 17) + p17;
        int p19 = p(((p15 + l(p18, p17, p16)) + this.f31755h[11]) - 1990404162, 22) + p18;
        int p20 = p(p16 + l(p19, p18, p17) + this.f31755h[12] + 1804603682, 7) + p19;
        int p21 = p(((p17 + l(p20, p19, p18)) + this.f31755h[13]) - 40341101, 12) + p20;
        int p22 = p(((p18 + l(p21, p20, p19)) + this.f31755h[14]) - 1502002290, 17) + p21;
        int p23 = p(p19 + l(p22, p21, p20) + this.f31755h[15] + 1236535329, 22) + p22;
        int p24 = p(((p20 + m(p23, p22, p21)) + this.f31755h[1]) - 165796510, 5) + p23;
        int p25 = p(((p21 + m(p24, p23, p22)) + this.f31755h[6]) - 1069501632, 9) + p24;
        int p26 = p(p22 + m(p25, p24, p23) + this.f31755h[11] + 643717713, 14) + p25;
        int p27 = p(((p23 + m(p26, p25, p24)) + this.f31755h[0]) - 373897302, 20) + p26;
        int p28 = p(((p24 + m(p27, p26, p25)) + this.f31755h[5]) - 701558691, 5) + p27;
        int p29 = p(p25 + m(p28, p27, p26) + this.f31755h[10] + 38016083, 9) + p28;
        int p30 = p(((p26 + m(p29, p28, p27)) + this.f31755h[15]) - 660478335, 14) + p29;
        int p31 = p(((p27 + m(p30, p29, p28)) + this.f31755h[4]) - 405537848, 20) + p30;
        int p32 = p(p28 + m(p31, p30, p29) + this.f31755h[9] + 568446438, 5) + p31;
        int p33 = p(((p29 + m(p32, p31, p30)) + this.f31755h[14]) - 1019803690, 9) + p32;
        int p34 = p(((p30 + m(p33, p32, p31)) + this.f31755h[3]) - 187363961, 14) + p33;
        int p35 = p(p31 + m(p34, p33, p32) + this.f31755h[8] + 1163531501, 20) + p34;
        int p36 = p(((p32 + m(p35, p34, p33)) + this.f31755h[13]) - 1444681467, 5) + p35;
        int p37 = p(((p33 + m(p36, p35, p34)) + this.f31755h[2]) - 51403784, 9) + p36;
        int p38 = p(p34 + m(p37, p36, p35) + this.f31755h[7] + 1735328473, 14) + p37;
        int p39 = p(((p35 + m(p38, p37, p36)) + this.f31755h[12]) - 1926607734, 20) + p38;
        int p40 = p(((p36 + n(p39, p38, p37)) + this.f31755h[5]) - 378558, 4) + p39;
        int p41 = p(((p37 + n(p40, p39, p38)) + this.f31755h[8]) - 2022574463, 11) + p40;
        int p42 = p(p38 + n(p41, p40, p39) + this.f31755h[11] + 1839030562, 16) + p41;
        int p43 = p(((p39 + n(p42, p41, p40)) + this.f31755h[14]) - 35309556, 23) + p42;
        int p44 = p(((p40 + n(p43, p42, p41)) + this.f31755h[1]) - 1530992060, 4) + p43;
        int p45 = p(p41 + n(p44, p43, p42) + this.f31755h[4] + 1272893353, 11) + p44;
        int p46 = p(((p42 + n(p45, p44, p43)) + this.f31755h[7]) - 155497632, 16) + p45;
        int p47 = p(((p43 + n(p46, p45, p44)) + this.f31755h[10]) - 1094730640, 23) + p46;
        int p48 = p(p44 + n(p47, p46, p45) + this.f31755h[13] + 681279174, 4) + p47;
        int p49 = p(((p45 + n(p48, p47, p46)) + this.f31755h[0]) - 358537222, 11) + p48;
        int p50 = p(((p46 + n(p49, p48, p47)) + this.f31755h[3]) - 722521979, 16) + p49;
        int p51 = p(p47 + n(p50, p49, p48) + this.f31755h[6] + 76029189, 23) + p50;
        int p52 = p(((p48 + n(p51, p50, p49)) + this.f31755h[9]) - 640364487, 4) + p51;
        int p53 = p(((p49 + n(p52, p51, p50)) + this.f31755h[12]) - 421815835, 11) + p52;
        int p54 = p(p50 + n(p53, p52, p51) + this.f31755h[15] + 530742520, 16) + p53;
        int p55 = p(((p51 + n(p54, p53, p52)) + this.f31755h[2]) - 995338651, 23) + p54;
        int p56 = p(((p52 + o(p55, p54, p53)) + this.f31755h[0]) - 198630844, 6) + p55;
        int p57 = p(p53 + o(p56, p55, p54) + this.f31755h[7] + 1126891415, 10) + p56;
        int p58 = p(((p54 + o(p57, p56, p55)) + this.f31755h[14]) - 1416354905, 15) + p57;
        int p59 = p(((p55 + o(p58, p57, p56)) + this.f31755h[5]) - 57434055, 21) + p58;
        int p60 = p(p56 + o(p59, p58, p57) + this.f31755h[12] + 1700485571, 6) + p59;
        int p61 = p(((p57 + o(p60, p59, p58)) + this.f31755h[3]) - 1894986606, 10) + p60;
        int p62 = p(((p58 + o(p61, p60, p59)) + this.f31755h[10]) - 1051523, 15) + p61;
        int p63 = p(((p59 + o(p62, p61, p60)) + this.f31755h[1]) - 2054922799, 21) + p62;
        int p64 = p(p60 + o(p63, p62, p61) + this.f31755h[8] + 1873313359, 6) + p63;
        int p65 = p(((p61 + o(p64, p63, p62)) + this.f31755h[15]) - 30611744, 10) + p64;
        int p66 = p(((p62 + o(p65, p64, p63)) + this.f31755h[6]) - 1560198380, 15) + p65;
        int p67 = p(p63 + o(p66, p65, p64) + this.f31755h[13] + 1309151649, 21) + p66;
        int p68 = p(((p64 + o(p67, p66, p65)) + this.f31755h[4]) - 145523070, 6) + p67;
        int p69 = p(((p65 + o(p68, p67, p66)) + this.f31755h[11]) - 1120210379, 10) + p68;
        int p70 = p(p66 + o(p69, p68, p67) + this.f31755h[2] + 718787259, 15) + p69;
        int p71 = p(((p67 + o(p70, p69, p68)) + this.f31755h[9]) - 343485551, 21) + p70;
        this.f31751d += p68;
        this.f31752e += p71;
        this.f31753f += p70;
        this.f31754g += p69;
        this.f31756i = 0;
        int i12 = 0;
        while (true) {
            int[] iArr = this.f31755h;
            if (i12 != iArr.length) {
                iArr[i12] = 0;
                i12++;
            } else {
                return;
            }
        }
    }

    @Override // e7.AbstractC2832a
    protected void i(long j8) {
        if (this.f31756i > 14) {
            h();
        }
        int[] iArr = this.f31755h;
        iArr[14] = (int) j8;
        iArr[15] = (int) (j8 >>> 32);
    }

    @Override // e7.AbstractC2832a
    protected void j(byte[] bArr, int i8) {
        int[] iArr = this.f31755h;
        int i9 = this.f31756i;
        int i10 = i9 + 1;
        this.f31756i = i10;
        iArr[i9] = ((bArr[i8 + 3] & 255) << 24) | (bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8 + 2] & 255) << 16);
        if (i10 == 16) {
            h();
        }
    }

    @Override // e7.AbstractC2832a
    public void k() {
        super.k();
        this.f31751d = 1732584193;
        this.f31752e = -271733879;
        this.f31753f = -1732584194;
        this.f31754g = 271733878;
        this.f31756i = 0;
        int i8 = 0;
        while (true) {
            int[] iArr = this.f31755h;
            if (i8 != iArr.length) {
                iArr[i8] = 0;
                i8++;
            } else {
                return;
            }
        }
    }
}
