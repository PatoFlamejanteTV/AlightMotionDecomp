package g7;

import d7.InterfaceC2772a;
import d7.InterfaceC2773b;
import d7.f;
import d7.g;
import h7.C2959a;
import h7.InterfaceC2960b;
import h7.c;
import h7.d;
import h7.e;
import i7.C2980a;
import i7.C2982c;

/* renamed from: g7.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C2924a {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC2772a f32469a;

    /* renamed from: b, reason: collision with root package name */
    private c f32470b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC2960b f32471c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f32472d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f32473e;

    /* renamed from: f, reason: collision with root package name */
    private int f32474f;

    /* renamed from: g, reason: collision with root package name */
    private byte[] f32475g;

    /* renamed from: h, reason: collision with root package name */
    private byte[] f32476h;

    /* renamed from: i, reason: collision with root package name */
    private byte[] f32477i;

    /* renamed from: j, reason: collision with root package name */
    private byte[] f32478j;

    /* renamed from: k, reason: collision with root package name */
    private byte[] f32479k;

    /* renamed from: l, reason: collision with root package name */
    private byte[] f32480l;

    /* renamed from: m, reason: collision with root package name */
    private byte[] f32481m;

    /* renamed from: n, reason: collision with root package name */
    private byte[] f32482n;

    /* renamed from: o, reason: collision with root package name */
    private byte[] f32483o;

    /* renamed from: p, reason: collision with root package name */
    private byte[] f32484p;

    /* renamed from: q, reason: collision with root package name */
    private byte[] f32485q;

    /* renamed from: r, reason: collision with root package name */
    private int f32486r;

    /* renamed from: s, reason: collision with root package name */
    private int f32487s;

    /* renamed from: t, reason: collision with root package name */
    private long f32488t;

    /* renamed from: u, reason: collision with root package name */
    private byte[] f32489u;

    /* renamed from: v, reason: collision with root package name */
    private int f32490v;

    /* renamed from: w, reason: collision with root package name */
    private long f32491w;

    /* renamed from: x, reason: collision with root package name */
    private long f32492x;

    public C2924a(InterfaceC2772a interfaceC2772a) {
        this(interfaceC2772a, null);
    }

    private void a() {
        if (!this.f32473e) {
            if (this.f32472d) {
                throw new IllegalStateException("GCM cipher cannot be reused for encryption");
            }
            throw new IllegalStateException("GCM cipher needs to be initialised");
        }
    }

    private void c(byte[] bArr, byte[] bArr2, int i8) {
        for (int i9 = 0; i9 < i8; i9 += 16) {
            f(bArr, bArr2, i9, Math.min(i8 - i9, 16));
        }
    }

    private void d(byte[] bArr, byte[] bArr2) {
        d.p(bArr, bArr2);
        this.f32470b.b(bArr);
    }

    private void e(byte[] bArr, byte[] bArr2, int i8) {
        d.q(bArr, bArr2, i8);
        this.f32470b.b(bArr);
    }

    private void f(byte[] bArr, byte[] bArr2, int i8, int i9) {
        d.r(bArr, bArr2, i8, i9);
        this.f32470b.b(bArr);
    }

    private void g(byte[] bArr) {
        int i8 = this.f32486r;
        if (i8 != 0) {
            this.f32486r = i8 - 1;
            byte[] bArr2 = this.f32485q;
            int i9 = (bArr2[15] & 255) + 1;
            bArr2[15] = (byte) i9;
            int i10 = (i9 >>> 8) + (bArr2[14] & 255);
            bArr2[14] = (byte) i10;
            int i11 = (i10 >>> 8) + (bArr2[13] & 255);
            bArr2[13] = (byte) i11;
            bArr2[12] = (byte) ((i11 >>> 8) + (bArr2[12] & 255));
            this.f32469a.a(bArr2, 0, bArr, 0);
            return;
        }
        throw new IllegalStateException("Attempt to process too many blocks");
    }

    private void j() {
        if (this.f32491w > 0) {
            System.arraycopy(this.f32483o, 0, this.f32484p, 0, 16);
            this.f32492x = this.f32491w;
        }
        int i8 = this.f32490v;
        if (i8 > 0) {
            f(this.f32484p, this.f32489u, 0, i8);
            this.f32492x += this.f32490v;
        }
        if (this.f32492x > 0) {
            System.arraycopy(this.f32484p, 0, this.f32482n, 0, 16);
        }
    }

    private void l(byte[] bArr, int i8, byte[] bArr2, int i9) {
        if (bArr2.length - i9 >= 16) {
            if (this.f32488t == 0) {
                j();
            }
            byte[] bArr3 = new byte[16];
            g(bArr3);
            if (this.f32472d) {
                d.q(bArr3, bArr, i8);
                d(this.f32482n, bArr3);
                System.arraycopy(bArr3, 0, bArr2, i9, 16);
            } else {
                e(this.f32482n, bArr, i8);
                d.o(bArr3, 0, bArr, i8, bArr2, i9);
            }
            this.f32488t += 16;
            return;
        }
        throw new g("Output buffer too short");
    }

    private void n(byte[] bArr, int i8, int i9, byte[] bArr2, int i10) {
        byte[] bArr3 = new byte[16];
        g(bArr3);
        if (this.f32472d) {
            d.n(bArr, i8, bArr3, 0, i9);
            f(this.f32482n, bArr, i8, i9);
        } else {
            f(this.f32482n, bArr, i8, i9);
            d.n(bArr, i8, bArr3, 0, i9);
        }
        System.arraycopy(bArr, i8, bArr2, i10, i9);
        this.f32488t += i9;
    }

    private void o(boolean z8) {
        this.f32469a.reset();
        this.f32482n = new byte[16];
        this.f32483o = new byte[16];
        this.f32484p = new byte[16];
        this.f32489u = new byte[16];
        this.f32490v = 0;
        this.f32491w = 0L;
        this.f32492x = 0L;
        this.f32485q = J7.a.d(this.f32479k);
        this.f32486r = -2;
        this.f32487s = 0;
        this.f32488t = 0L;
        byte[] bArr = this.f32480l;
        if (bArr != null) {
            J7.a.i(bArr, (byte) 0);
        }
        if (z8) {
            this.f32481m = null;
        }
        if (this.f32472d) {
            this.f32473e = false;
            return;
        }
        byte[] bArr2 = this.f32477i;
        if (bArr2 != null) {
            k(bArr2, 0, bArr2.length);
        }
    }

    public int b(byte[] bArr, int i8) {
        a();
        if (this.f32488t == 0) {
            j();
        }
        int i9 = this.f32487s;
        if (this.f32472d) {
            if (bArr.length - i8 < this.f32474f + i9) {
                throw new g("Output buffer too short");
            }
        } else {
            int i10 = this.f32474f;
            if (i9 >= i10) {
                i9 -= i10;
                if (bArr.length - i8 < i9) {
                    throw new g("Output buffer too short");
                }
            } else {
                throw new f("data too short");
            }
        }
        if (i9 > 0) {
            n(this.f32480l, 0, i9, bArr, i8);
        }
        long j8 = this.f32491w;
        int i11 = this.f32490v;
        long j9 = j8 + i11;
        this.f32491w = j9;
        if (j9 > this.f32492x) {
            if (i11 > 0) {
                f(this.f32483o, this.f32489u, 0, i11);
            }
            if (this.f32492x > 0) {
                d.p(this.f32483o, this.f32484p);
            }
            long j10 = ((this.f32488t * 8) + 127) >>> 7;
            byte[] bArr2 = new byte[16];
            if (this.f32471c == null) {
                C2959a c2959a = new C2959a();
                this.f32471c = c2959a;
                c2959a.a(this.f32478j);
            }
            this.f32471c.b(j10, bArr2);
            d.i(this.f32483o, bArr2);
            d.p(this.f32482n, this.f32483o);
        }
        byte[] bArr3 = new byte[16];
        J7.f.i(this.f32491w * 8, bArr3, 0);
        J7.f.i(this.f32488t * 8, bArr3, 8);
        d(this.f32482n, bArr3);
        byte[] bArr4 = new byte[16];
        this.f32469a.a(this.f32479k, 0, bArr4, 0);
        d.p(bArr4, this.f32482n);
        int i12 = this.f32474f;
        byte[] bArr5 = new byte[i12];
        this.f32481m = bArr5;
        System.arraycopy(bArr4, 0, bArr5, 0, i12);
        if (this.f32472d) {
            System.arraycopy(this.f32481m, 0, bArr, i8 + this.f32487s, this.f32474f);
            i9 += this.f32474f;
        } else {
            int i13 = this.f32474f;
            byte[] bArr6 = new byte[i13];
            System.arraycopy(this.f32480l, i9, bArr6, 0, i13);
            if (!J7.a.g(this.f32481m, bArr6)) {
                throw new f("mac check in GCM failed");
            }
        }
        o(false);
        return i9;
    }

    public int h(int i8) {
        int i9 = i8 + this.f32487s;
        if (this.f32472d) {
            return i9 + this.f32474f;
        }
        int i10 = this.f32474f;
        if (i9 < i10) {
            return 0;
        }
        return i9 - i10;
    }

    public void i(boolean z8, InterfaceC2773b interfaceC2773b) {
        int i8;
        byte[] bArr;
        this.f32472d = z8;
        this.f32481m = null;
        this.f32473e = true;
        if (interfaceC2773b instanceof C2980a) {
            C2980a c2980a = (C2980a) interfaceC2773b;
            byte[] d8 = c2980a.d();
            this.f32477i = c2980a.a();
            int c8 = c2980a.c();
            if (c8 >= 32 && c8 <= 128 && c8 % 8 == 0) {
                this.f32474f = c8 / 8;
                C2982c b9 = c2980a.b();
                if (z8) {
                    i8 = 16;
                } else {
                    i8 = this.f32474f + 16;
                }
                this.f32480l = new byte[i8];
                if (d8 != null && d8.length >= 1) {
                    if (z8 && (bArr = this.f32476h) != null && J7.a.a(bArr, d8)) {
                        if (b9 != null) {
                            byte[] bArr2 = this.f32475g;
                            if (bArr2 != null && J7.a.a(bArr2, b9.a())) {
                                throw new IllegalArgumentException("cannot reuse nonce for GCM encryption");
                            }
                        } else {
                            throw new IllegalArgumentException("cannot reuse nonce for GCM encryption");
                        }
                    }
                    this.f32476h = d8;
                    if (b9 != null) {
                        this.f32475g = b9.a();
                    }
                    if (b9 != null) {
                        this.f32469a.b(true, b9);
                        byte[] bArr3 = new byte[16];
                        this.f32478j = bArr3;
                        this.f32469a.a(bArr3, 0, bArr3, 0);
                        this.f32470b.a(this.f32478j);
                        this.f32471c = null;
                    } else if (this.f32478j == null) {
                        throw new IllegalArgumentException("Key must be specified in initial init");
                    }
                    byte[] bArr4 = new byte[16];
                    this.f32479k = bArr4;
                    byte[] bArr5 = this.f32476h;
                    if (bArr5.length == 12) {
                        System.arraycopy(bArr5, 0, bArr4, 0, bArr5.length);
                        this.f32479k[15] = 1;
                    } else {
                        c(bArr4, bArr5, bArr5.length);
                        byte[] bArr6 = new byte[16];
                        J7.f.i(this.f32476h.length * 8, bArr6, 8);
                        d(this.f32479k, bArr6);
                    }
                    this.f32482n = new byte[16];
                    this.f32483o = new byte[16];
                    this.f32484p = new byte[16];
                    this.f32489u = new byte[16];
                    this.f32490v = 0;
                    this.f32491w = 0L;
                    this.f32492x = 0L;
                    this.f32485q = J7.a.d(this.f32479k);
                    this.f32486r = -2;
                    this.f32487s = 0;
                    this.f32488t = 0L;
                    byte[] bArr7 = this.f32477i;
                    if (bArr7 != null) {
                        k(bArr7, 0, bArr7.length);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("IV must be at least 1 byte");
            }
            throw new IllegalArgumentException("Invalid value for MAC size: " + c8);
        }
        throw new IllegalArgumentException("invalid parameters passed to GCM");
    }

    public void k(byte[] bArr, int i8, int i9) {
        a();
        for (int i10 = 0; i10 < i9; i10++) {
            byte[] bArr2 = this.f32489u;
            int i11 = this.f32490v;
            bArr2[i11] = bArr[i8 + i10];
            int i12 = i11 + 1;
            this.f32490v = i12;
            if (i12 == 16) {
                d(this.f32483o, bArr2);
                this.f32490v = 0;
                this.f32491w += 16;
            }
        }
    }

    public int m(byte[] bArr, int i8, int i9, byte[] bArr2, int i10) {
        int i11;
        a();
        if (bArr.length - i8 >= i9) {
            if (this.f32472d) {
                if (this.f32487s != 0) {
                    while (i9 > 0) {
                        i9--;
                        byte[] bArr3 = this.f32480l;
                        int i12 = this.f32487s;
                        int i13 = i8 + 1;
                        bArr3[i12] = bArr[i8];
                        int i14 = i12 + 1;
                        this.f32487s = i14;
                        if (i14 == 16) {
                            l(bArr3, 0, bArr2, i10);
                            this.f32487s = 0;
                            i8 = i13;
                            i11 = 16;
                            break;
                        }
                        i8 = i13;
                    }
                }
                i11 = 0;
                while (i9 >= 16) {
                    l(bArr, i8, bArr2, i10 + i11);
                    i8 += 16;
                    i9 -= 16;
                    i11 += 16;
                }
                if (i9 > 0) {
                    System.arraycopy(bArr, i8, this.f32480l, 0, i9);
                    this.f32487s = i9;
                }
            } else {
                i11 = 0;
                for (int i15 = 0; i15 < i9; i15++) {
                    byte[] bArr4 = this.f32480l;
                    int i16 = this.f32487s;
                    bArr4[i16] = bArr[i8 + i15];
                    int i17 = i16 + 1;
                    this.f32487s = i17;
                    if (i17 == bArr4.length) {
                        l(bArr4, 0, bArr2, i10 + i11);
                        byte[] bArr5 = this.f32480l;
                        System.arraycopy(bArr5, 16, bArr5, 0, this.f32474f);
                        this.f32487s = this.f32474f;
                        i11 += 16;
                    }
                }
            }
            return i11;
        }
        throw new d7.d("Input buffer too short");
    }

    public C2924a(InterfaceC2772a interfaceC2772a, c cVar) {
        if (interfaceC2772a.c() != 16) {
            throw new IllegalArgumentException("cipher required with a block size of 16.");
        }
        cVar = cVar == null ? new e() : cVar;
        this.f32469a = interfaceC2772a;
        this.f32470b = cVar;
    }
}
