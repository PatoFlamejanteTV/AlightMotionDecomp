package c2;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: c2.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2016b extends AbstractC2015a {

    /* renamed from: c, reason: collision with root package name */
    private final C2012C f15229c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f15230d;

    /* renamed from: e, reason: collision with root package name */
    private final C2018d f15231e;

    /* renamed from: f, reason: collision with root package name */
    private final int f15232f;

    /* renamed from: g, reason: collision with root package name */
    private int f15233g;

    /* renamed from: h, reason: collision with root package name */
    private final C2016b f15234h;

    /* renamed from: i, reason: collision with root package name */
    private C2016b f15235i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2016b(C2012C c2012c, boolean z8, C2018d c2018d, C2016b c2016b) {
        super(589824);
        int i8;
        this.f15229c = c2012c;
        this.f15230d = z8;
        this.f15231e = c2018d;
        int i9 = c2018d.f15242b;
        if (i9 == 0) {
            i8 = -1;
        } else {
            i8 = i9 - 2;
        }
        this.f15232f = i8;
        this.f15234h = c2016b;
        if (c2016b != null) {
            c2016b.f15235i = this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(C2016b c2016b, C2016b c2016b2, C2016b c2016b3, C2016b c2016b4) {
        int i8;
        if (c2016b != null) {
            i8 = c2016b.g("RuntimeVisibleAnnotations");
        } else {
            i8 = 0;
        }
        if (c2016b2 != null) {
            i8 += c2016b2.g("RuntimeInvisibleAnnotations");
        }
        if (c2016b3 != null) {
            i8 += c2016b3.g("RuntimeVisibleTypeAnnotations");
        }
        if (c2016b4 != null) {
            return i8 + c2016b4.g("RuntimeInvisibleTypeAnnotations");
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int h(String str, C2016b[] c2016bArr, int i8) {
        int i9 = (i8 * 2) + 7;
        for (int i10 = 0; i10 < i8; i10++) {
            C2016b c2016b = c2016bArr[i10];
            i9 += c2016b == null ? 0 : c2016b.g(str) - 8;
        }
        return i9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C2016b i(C2012C c2012c, int i8, C2014E c2014e, String str, C2016b c2016b) {
        C2018d c2018d = new C2018d();
        F.a(i8, c2018d);
        C2014E.d(c2014e, c2018d);
        c2018d.k(c2012c.D(str)).k(0);
        return new C2016b(c2012c, true, c2018d, c2016b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C2016b j(C2012C c2012c, String str, C2016b c2016b) {
        C2018d c2018d = new C2018d();
        c2018d.k(c2012c.D(str)).k(0);
        return new C2016b(c2012c, true, c2018d, c2016b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void l(C2012C c2012c, C2016b c2016b, C2016b c2016b2, C2016b c2016b3, C2016b c2016b4, C2018d c2018d) {
        if (c2016b != null) {
            c2016b.k(c2012c.D("RuntimeVisibleAnnotations"), c2018d);
        }
        if (c2016b2 != null) {
            c2016b2.k(c2012c.D("RuntimeInvisibleAnnotations"), c2018d);
        }
        if (c2016b3 != null) {
            c2016b3.k(c2012c.D("RuntimeVisibleTypeAnnotations"), c2018d);
        }
        if (c2016b4 != null) {
            c2016b4.k(c2012c.D("RuntimeInvisibleTypeAnnotations"), c2018d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void m(int i8, C2016b[] c2016bArr, int i9, C2018d c2018d) {
        int i10 = (i9 * 2) + 1;
        for (int i11 = 0; i11 < i9; i11++) {
            C2016b c2016b = c2016bArr[i11];
            i10 += c2016b == null ? 0 : c2016b.g(null) - 8;
        }
        c2018d.k(i8);
        c2018d.i(i10);
        c2018d.g(i9);
        for (int i12 = 0; i12 < i9; i12++) {
            C2016b c2016b2 = null;
            int i13 = 0;
            for (C2016b c2016b3 = c2016bArr[i12]; c2016b3 != null; c2016b3 = c2016b3.f15234h) {
                c2016b3.d();
                i13++;
                c2016b2 = c2016b3;
            }
            c2018d.k(i13);
            while (c2016b2 != null) {
                C2018d c2018d2 = c2016b2.f15231e;
                c2018d.h(c2018d2.f15241a, 0, c2018d2.f15242b);
                c2016b2 = c2016b2.f15235i;
            }
        }
    }

    @Override // c2.AbstractC2015a
    public void a(String str, Object obj) {
        this.f15233g++;
        if (this.f15230d) {
            this.f15231e.k(this.f15229c.D(str));
        }
        if (obj instanceof String) {
            this.f15231e.e(115, this.f15229c.D((String) obj));
            return;
        }
        if (obj instanceof Byte) {
            this.f15231e.e(66, this.f15229c.l(((Byte) obj).byteValue()).f15191a);
            return;
        }
        if (obj instanceof Boolean) {
            this.f15231e.e(90, this.f15229c.l(((Boolean) obj).booleanValue() ? 1 : 0).f15191a);
            return;
        }
        if (obj instanceof Character) {
            this.f15231e.e(67, this.f15229c.l(((Character) obj).charValue()).f15191a);
            return;
        }
        if (obj instanceof Short) {
            this.f15231e.e(83, this.f15229c.l(((Short) obj).shortValue()).f15191a);
            return;
        }
        if (obj instanceof C2013D) {
            this.f15231e.e(99, this.f15229c.D(((C2013D) obj).d()));
            return;
        }
        int i8 = 0;
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            this.f15231e.e(91, bArr.length);
            int length = bArr.length;
            while (i8 < length) {
                this.f15231e.e(66, this.f15229c.l(bArr[i8]).f15191a);
                i8++;
            }
            return;
        }
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            this.f15231e.e(91, zArr.length);
            int length2 = zArr.length;
            while (i8 < length2) {
                this.f15231e.e(90, this.f15229c.l(zArr[i8] ? 1 : 0).f15191a);
                i8++;
            }
            return;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            this.f15231e.e(91, sArr.length);
            int length3 = sArr.length;
            while (i8 < length3) {
                this.f15231e.e(83, this.f15229c.l(sArr[i8]).f15191a);
                i8++;
            }
            return;
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            this.f15231e.e(91, cArr.length);
            int length4 = cArr.length;
            while (i8 < length4) {
                this.f15231e.e(67, this.f15229c.l(cArr[i8]).f15191a);
                i8++;
            }
            return;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            this.f15231e.e(91, iArr.length);
            int length5 = iArr.length;
            while (i8 < length5) {
                this.f15231e.e(73, this.f15229c.l(iArr[i8]).f15191a);
                i8++;
            }
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            this.f15231e.e(91, jArr.length);
            int length6 = jArr.length;
            while (i8 < length6) {
                this.f15231e.e(74, this.f15229c.p(jArr[i8]).f15191a);
                i8++;
            }
            return;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            this.f15231e.e(91, fArr.length);
            int length7 = fArr.length;
            while (i8 < length7) {
                this.f15231e.e(70, this.f15229c.k(fArr[i8]).f15191a);
                i8++;
            }
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            this.f15231e.e(91, dArr.length);
            int length8 = dArr.length;
            while (i8 < length8) {
                this.f15231e.e(68, this.f15229c.f(dArr[i8]).f15191a);
                i8++;
            }
            return;
        }
        AbstractC2011B d8 = this.f15229c.d(obj);
        this.f15231e.e(".s.IFJDCS".charAt(d8.f15192b), d8.f15191a);
    }

    @Override // c2.AbstractC2015a
    public AbstractC2015a b(String str, String str2) {
        this.f15233g++;
        if (this.f15230d) {
            this.f15231e.k(this.f15229c.D(str));
        }
        this.f15231e.e(64, this.f15229c.D(str2)).k(0);
        return new C2016b(this.f15229c, true, this.f15231e, null);
    }

    @Override // c2.AbstractC2015a
    public AbstractC2015a c(String str) {
        this.f15233g++;
        if (this.f15230d) {
            this.f15231e.k(this.f15229c.D(str));
        }
        this.f15231e.e(91, 0);
        return new C2016b(this.f15229c, false, this.f15231e, null);
    }

    @Override // c2.AbstractC2015a
    public void d() {
        int i8 = this.f15232f;
        if (i8 != -1) {
            byte[] bArr = this.f15231e.f15241a;
            int i9 = this.f15233g;
            bArr[i8] = (byte) (i9 >>> 8);
            bArr[i8 + 1] = (byte) i9;
        }
    }

    @Override // c2.AbstractC2015a
    public void e(String str, String str2, String str3) {
        this.f15233g++;
        if (this.f15230d) {
            this.f15231e.k(this.f15229c.D(str));
        }
        this.f15231e.e(101, this.f15229c.D(str2)).k(this.f15229c.D(str3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g(String str) {
        if (str != null) {
            this.f15229c.D(str);
        }
        int i8 = 8;
        for (C2016b c2016b = this; c2016b != null; c2016b = c2016b.f15234h) {
            i8 += c2016b.f15231e.f15242b;
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(int i8, C2018d c2018d) {
        int i9 = 2;
        int i10 = 0;
        C2016b c2016b = null;
        for (C2016b c2016b2 = this; c2016b2 != null; c2016b2 = c2016b2.f15234h) {
            c2016b2.d();
            i9 += c2016b2.f15231e.f15242b;
            i10++;
            c2016b = c2016b2;
        }
        c2018d.k(i8);
        c2018d.i(i9);
        c2018d.k(i10);
        while (c2016b != null) {
            C2018d c2018d2 = c2016b.f15231e;
            c2018d.h(c2018d2.f15241a, 0, c2018d2.f15242b);
            c2016b = c2016b.f15235i;
        }
    }
}
