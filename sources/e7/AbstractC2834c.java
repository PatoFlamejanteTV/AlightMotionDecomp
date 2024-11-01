package e7;

/* renamed from: e7.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2834c implements d7.e {

    /* renamed from: o, reason: collision with root package name */
    static final long[] f31736o = {4794697086780616226L, 8158064640168781261L, -5349999486874862801L, -1606136188198331460L, 4131703408338449720L, 6480981068601479193L, -7908458776815382629L, -6116909921290321640L, -2880145864133508542L, 1334009975649890238L, 2608012711638119052L, 6128411473006802146L, 8268148722764581231L, -9160688886553864527L, -7215885187991268811L, -4495734319001033068L, -1973867731355612462L, -1171420211273849373L, 1135362057144423861L, 2597628984639134821L, 3308224258029322869L, 5365058923640841347L, 6679025012923562964L, 8573033837759648693L, -7476448914759557205L, -6327057829258317296L, -5763719355590565569L, -4658551843659510044L, -4116276920077217854L, -3051310485924567259L, 489312712824947311L, 1452737877330783856L, 2861767655752347644L, 3322285676063803686L, 5560940570517711597L, 5996557281743188959L, 7280758554555802590L, 8532644243296465576L, -9096487096722542874L, -7894198246740708037L, -6719396339535248540L, -6333637450476146687L, -4446306890439682159L, -4076793802049405392L, -3345356375505022440L, -2983346525034927856L, -860691631967231958L, 1182934255886127544L, 1847814050463011016L, 2177327727835720531L, 2830643537854262169L, 3796741975233480872L, 4115178125766777443L, 5681478168544905931L, 6601373596472566643L, 7507060721942968483L, 8399075790359081724L, 8693463985226723168L, -8878714635349349518L, -8302665154208450068L, -8016688836872298968L, -6606660893046293015L, -4685533653050689259L, -4147400797238176981L, -3880063495543823972L, -3348786107499101689L, -1523767162380948706L, -757361751448694408L, 500013540394364858L, 748580250866718886L, 1242879168328830382L, 1977374033974150939L, 2944078676154940804L, 3659926193048069267L, 4368137639120453308L, 4836135668995329356L, 5532061633213252278L, 6448918945643986474L, 6902733635092675308L, 7801388544844847127L};

    /* renamed from: c, reason: collision with root package name */
    private long f31739c;

    /* renamed from: d, reason: collision with root package name */
    private long f31740d;

    /* renamed from: e, reason: collision with root package name */
    protected long f31741e;

    /* renamed from: f, reason: collision with root package name */
    protected long f31742f;

    /* renamed from: g, reason: collision with root package name */
    protected long f31743g;

    /* renamed from: h, reason: collision with root package name */
    protected long f31744h;

    /* renamed from: i, reason: collision with root package name */
    protected long f31745i;

    /* renamed from: j, reason: collision with root package name */
    protected long f31746j;

    /* renamed from: k, reason: collision with root package name */
    protected long f31747k;

    /* renamed from: l, reason: collision with root package name */
    protected long f31748l;

    /* renamed from: n, reason: collision with root package name */
    private int f31750n;

    /* renamed from: a, reason: collision with root package name */
    private byte[] f31737a = new byte[8];

    /* renamed from: m, reason: collision with root package name */
    private long[] f31749m = new long[80];

    /* renamed from: b, reason: collision with root package name */
    private int f31738b = 0;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC2834c() {
        r();
    }

    private long g(long j8, long j9, long j10) {
        return ((~j8) & j10) ^ (j9 & j8);
    }

    private long h(long j8, long j9, long j10) {
        return ((j8 & j10) ^ (j8 & j9)) ^ (j9 & j10);
    }

    private long i(long j8) {
        return (j8 >>> 7) ^ (((j8 << 63) | (j8 >>> 1)) ^ ((j8 << 56) | (j8 >>> 8)));
    }

    private long j(long j8) {
        return (j8 >>> 6) ^ (((j8 << 45) | (j8 >>> 19)) ^ ((j8 << 3) | (j8 >>> 61)));
    }

    private long k(long j8) {
        return ((j8 >>> 39) | (j8 << 25)) ^ (((j8 << 36) | (j8 >>> 28)) ^ ((j8 << 30) | (j8 >>> 34)));
    }

    private long l(long j8) {
        return ((j8 >>> 41) | (j8 << 23)) ^ (((j8 << 50) | (j8 >>> 14)) ^ ((j8 << 46) | (j8 >>> 18)));
    }

    private void m() {
        long j8 = this.f31739c;
        if (j8 > 2305843009213693951L) {
            this.f31740d += j8 >>> 61;
            this.f31739c = j8 & 2305843009213693951L;
        }
    }

    @Override // d7.e
    public void b(byte[] bArr, int i8, int i9) {
        while (this.f31738b != 0 && i9 > 0) {
            c(bArr[i8]);
            i8++;
            i9--;
        }
        while (i9 > this.f31737a.length) {
            q(bArr, i8);
            byte[] bArr2 = this.f31737a;
            i8 += bArr2.length;
            i9 -= bArr2.length;
            this.f31739c += bArr2.length;
        }
        while (i9 > 0) {
            c(bArr[i8]);
            i8++;
            i9--;
        }
    }

    @Override // d7.e
    public void c(byte b9) {
        byte[] bArr = this.f31737a;
        int i8 = this.f31738b;
        int i9 = i8 + 1;
        this.f31738b = i9;
        bArr[i8] = b9;
        if (i9 == bArr.length) {
            q(bArr, 0);
            this.f31738b = 0;
        }
        this.f31739c++;
    }

    public void n() {
        m();
        long j8 = this.f31739c << 3;
        long j9 = this.f31740d;
        byte b9 = Byte.MIN_VALUE;
        while (true) {
            c(b9);
            if (this.f31738b != 0) {
                b9 = 0;
            } else {
                p(j8, j9);
                o();
                return;
            }
        }
    }

    protected void o() {
        m();
        for (int i8 = 16; i8 <= 79; i8++) {
            long[] jArr = this.f31749m;
            long j8 = j(jArr[i8 - 2]);
            long[] jArr2 = this.f31749m;
            jArr[i8] = j8 + jArr2[i8 - 7] + i(jArr2[i8 - 15]) + this.f31749m[i8 - 16];
        }
        long j9 = this.f31741e;
        long j10 = this.f31742f;
        long j11 = this.f31743g;
        long j12 = this.f31744h;
        long j13 = this.f31745i;
        long j14 = this.f31746j;
        long j15 = this.f31747k;
        long j16 = j14;
        long j17 = j12;
        int i9 = 0;
        long j18 = j10;
        long j19 = j11;
        long j20 = j13;
        int i10 = 0;
        long j21 = this.f31748l;
        long j22 = j9;
        long j23 = j15;
        while (i10 < 10) {
            long j24 = j20;
            long l8 = l(j20) + g(j20, j16, j23);
            long[] jArr3 = f31736o;
            int i11 = i9 + 1;
            long j25 = j21 + l8 + jArr3[i9] + this.f31749m[i9];
            long j26 = j17 + j25;
            long k8 = j25 + k(j22) + h(j22, j18, j19);
            int i12 = i9 + 2;
            long l9 = j23 + l(j26) + g(j26, j24, j16) + jArr3[i11] + this.f31749m[i11];
            long j27 = j19 + l9;
            long k9 = l9 + k(k8) + h(k8, j22, j18);
            int i13 = i9 + 3;
            long l10 = j16 + l(j27) + g(j27, j26, j24) + jArr3[i12] + this.f31749m[i12];
            long j28 = j18 + l10;
            long k10 = l10 + k(k9) + h(k9, k8, j22);
            int i14 = i9 + 4;
            long l11 = j24 + l(j28) + g(j28, j27, j26) + jArr3[i13] + this.f31749m[i13];
            long j29 = j22 + l11;
            long k11 = l11 + k(k10) + h(k10, k9, k8);
            int i15 = i9 + 5;
            long l12 = j26 + l(j29) + g(j29, j28, j27) + jArr3[i14] + this.f31749m[i14];
            long j30 = k8 + l12;
            long k12 = l12 + k(k11) + h(k11, k10, k9);
            int i16 = i9 + 6;
            long l13 = j27 + l(j30) + g(j30, j29, j28) + jArr3[i15] + this.f31749m[i15];
            long j31 = k9 + l13;
            long k13 = l13 + k(k12) + h(k12, k11, k10);
            j23 = j31;
            int i17 = i9 + 7;
            long l14 = j28 + l(j31) + g(j31, j30, j29) + jArr3[i16] + this.f31749m[i16];
            long j32 = k10 + l14;
            j16 = j32;
            j18 = l14 + k(k13) + h(k13, k12, k11);
            i9 += 8;
            long l15 = j29 + l(j32) + g(j32, j23, j30) + jArr3[i17] + this.f31749m[i17];
            long k14 = l15 + k(j18) + h(j18, k13, k12);
            i10++;
            j20 = k11 + l15;
            j19 = k13;
            j21 = j30;
            j17 = k12;
            j22 = k14;
        }
        this.f31741e += j22;
        this.f31742f += j18;
        this.f31743g += j19;
        this.f31744h += j17;
        this.f31745i += j20;
        this.f31746j += j16;
        this.f31747k += j23;
        this.f31748l += j21;
        this.f31750n = 0;
        for (int i18 = 0; i18 < 16; i18++) {
            this.f31749m[i18] = 0;
        }
    }

    protected void p(long j8, long j9) {
        if (this.f31750n > 14) {
            o();
        }
        long[] jArr = this.f31749m;
        jArr[14] = j9;
        jArr[15] = j8;
    }

    protected void q(byte[] bArr, int i8) {
        this.f31749m[this.f31750n] = J7.f.b(bArr, i8);
        int i9 = this.f31750n + 1;
        this.f31750n = i9;
        if (i9 == 16) {
            o();
        }
    }

    public void r() {
        this.f31739c = 0L;
        this.f31740d = 0L;
        int i8 = 0;
        this.f31738b = 0;
        int i9 = 0;
        while (true) {
            byte[] bArr = this.f31737a;
            if (i9 >= bArr.length) {
                break;
            }
            bArr[i9] = 0;
            i9++;
        }
        this.f31750n = 0;
        while (true) {
            long[] jArr = this.f31749m;
            if (i8 != jArr.length) {
                jArr[i8] = 0;
                i8++;
            } else {
                return;
            }
        }
    }
}
