package c2;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: c2.C, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2012C {

    /* renamed from: a, reason: collision with root package name */
    final h f15198a;

    /* renamed from: b, reason: collision with root package name */
    private final C2019e f15199b;

    /* renamed from: c, reason: collision with root package name */
    private int f15200c;

    /* renamed from: d, reason: collision with root package name */
    private String f15201d;

    /* renamed from: e, reason: collision with root package name */
    private int f15202e;

    /* renamed from: f, reason: collision with root package name */
    private a[] f15203f;

    /* renamed from: g, reason: collision with root package name */
    private int f15204g;

    /* renamed from: h, reason: collision with root package name */
    private C2018d f15205h;

    /* renamed from: i, reason: collision with root package name */
    private int f15206i;

    /* renamed from: j, reason: collision with root package name */
    private C2018d f15207j;

    /* renamed from: k, reason: collision with root package name */
    private int f15208k;

    /* renamed from: l, reason: collision with root package name */
    private a[] f15209l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2012C(h hVar) {
        this.f15198a = hVar;
        this.f15199b = null;
        this.f15203f = new a[256];
        this.f15204g = 1;
        this.f15205h = new C2018d();
    }

    private void A(int i8, String str, String str2) {
        a(new a(i8, 12, str, str2, Y(12, str, str2)));
    }

    private void E(int i8, String str) {
        a(new a(i8, 1, str, W(1, str)));
    }

    private AbstractC2011B F(int i8, String str) {
        int W8 = W(i8, str);
        for (a N8 = N(W8); N8 != null; N8 = N8.f15211i) {
            if (N8.f15192b == i8 && N8.f15210h == W8 && N8.f15195e.equals(str)) {
                return N8;
            }
        }
        this.f15205h.e(i8, D(str));
        int i9 = this.f15204g;
        this.f15204g = i9 + 1;
        return c0(new a(i9, i8, str, W8));
    }

    private void G(int i8, int i9, String str) {
        a(new a(i8, i9, str, W(i9, str)));
    }

    private int J(a aVar) {
        if (this.f15209l == null) {
            this.f15209l = new a[16];
        }
        int i8 = this.f15208k;
        a[] aVarArr = this.f15209l;
        if (i8 == aVarArr.length) {
            a[] aVarArr2 = new a[aVarArr.length * 2];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, aVarArr.length);
            this.f15209l = aVarArr2;
        }
        a[] aVarArr3 = this.f15209l;
        int i9 = this.f15208k;
        this.f15208k = i9 + 1;
        aVarArr3[i9] = aVar;
        return c0(aVar).f15191a;
    }

    private void M(C2019e c2019e, char[] cArr) {
        byte[] bArr = c2019e.f15245c;
        int e8 = c2019e.e();
        int I8 = c2019e.I(e8 - 2);
        while (true) {
            if (I8 <= 0) {
                break;
            }
            if ("BootstrapMethods".equals(c2019e.H(e8, cArr))) {
                this.f15206i = c2019e.I(e8 + 6);
                break;
            } else {
                e8 += c2019e.t(e8 + 2) + 6;
                I8--;
            }
        }
        if (this.f15206i > 0) {
            int i8 = e8 + 8;
            int t8 = c2019e.t(e8 + 2) - 2;
            C2018d c2018d = new C2018d(t8);
            this.f15207j = c2018d;
            c2018d.h(bArr, i8, t8);
            int i9 = i8;
            for (int i10 = 0; i10 < this.f15206i; i10++) {
                int i11 = i9 - i8;
                int I9 = c2019e.I(i9);
                int I10 = c2019e.I(i9 + 2);
                i9 += 4;
                int hashCode = c2019e.o(I9, cArr).hashCode();
                while (true) {
                    int i12 = I10 - 1;
                    if (I10 > 0) {
                        int I11 = c2019e.I(i9);
                        i9 += 2;
                        hashCode ^= c2019e.o(I11, cArr).hashCode();
                        I10 = i12;
                    }
                }
                a(new a(i10, 64, i11, hashCode & Integer.MAX_VALUE));
            }
        }
    }

    private a N(int i8) {
        a[] aVarArr = this.f15203f;
        return aVarArr[i8 % aVarArr.length];
    }

    private static int U(int i8, int i9) {
        return (i8 + i9) & Integer.MAX_VALUE;
    }

    private static int V(int i8, long j8) {
        return (i8 + ((int) j8) + ((int) (j8 >>> 32))) & Integer.MAX_VALUE;
    }

    private static int W(int i8, String str) {
        return (i8 + str.hashCode()) & Integer.MAX_VALUE;
    }

    private static int X(int i8, String str, int i9) {
        return (i8 + str.hashCode() + i9) & Integer.MAX_VALUE;
    }

    private static int Y(int i8, String str, String str2) {
        return (i8 + (str.hashCode() * str2.hashCode())) & Integer.MAX_VALUE;
    }

    private static int Z(int i8, String str, String str2, int i9) {
        return (i8 + (str.hashCode() * str2.hashCode() * (i9 + 1))) & Integer.MAX_VALUE;
    }

    private void a(a aVar) {
        this.f15202e++;
        int i8 = aVar.f15210h;
        a[] aVarArr = this.f15203f;
        int length = i8 % aVarArr.length;
        aVar.f15211i = aVarArr[length];
        aVarArr[length] = aVar;
    }

    private static int a0(int i8, String str, String str2, String str3) {
        return (i8 + (str.hashCode() * str2.hashCode() * str3.hashCode())) & Integer.MAX_VALUE;
    }

    private AbstractC2011B b(int i8, int i9, int i10) {
        byte[] bArr = this.f15207j.f15241a;
        for (a N8 = N(i10); N8 != null; N8 = N8.f15211i) {
            if (N8.f15192b == 64 && N8.f15210h == i10) {
                int i11 = (int) N8.f15196f;
                for (int i12 = 0; i12 < i9; i12++) {
                    if (bArr[i8 + i12] != bArr[i11 + i12]) {
                        break;
                    }
                }
                this.f15207j.f15242b = i8;
                return N8;
            }
        }
        int i13 = this.f15206i;
        this.f15206i = i13 + 1;
        return c0(new a(i13, 64, i8, i10));
    }

    private static int b0(int i8, String str, String str2, String str3, int i9) {
        return (i8 + (str.hashCode() * str2.hashCode() * str3.hashCode() * i9)) & Integer.MAX_VALUE;
    }

    private a c0(a aVar) {
        int i8 = this.f15202e;
        a[] aVarArr = this.f15203f;
        if (i8 > (aVarArr.length * 3) / 4) {
            int length = aVarArr.length;
            int i9 = (length * 2) + 1;
            a[] aVarArr2 = new a[i9];
            for (int i10 = length - 1; i10 >= 0; i10--) {
                a aVar2 = this.f15203f[i10];
                while (aVar2 != null) {
                    int i11 = aVar2.f15210h % i9;
                    a aVar3 = aVar2.f15211i;
                    aVar2.f15211i = aVarArr2[i11];
                    aVarArr2[i11] = aVar2;
                    aVar2 = aVar3;
                }
            }
            this.f15203f = aVarArr2;
        }
        this.f15202e++;
        int i12 = aVar.f15210h;
        a[] aVarArr3 = this.f15203f;
        int length2 = i12 % aVarArr3.length;
        aVar.f15211i = aVarArr3[length2];
        aVarArr3[length2] = aVar;
        return aVar;
    }

    private AbstractC2011B h(int i8, String str, String str2, int i9) {
        int Z8 = Z(i8, str, str2, i9);
        for (a N8 = N(Z8); N8 != null; N8 = N8.f15211i) {
            if (N8.f15192b == i8 && N8.f15210h == Z8 && N8.f15196f == i9 && N8.f15194d.equals(str) && N8.f15195e.equals(str2)) {
                return N8;
            }
        }
        this.f15205h.f(i8, i9, z(str, str2));
        int i10 = this.f15204g;
        this.f15204g = i10 + 1;
        return c0(new a(i10, i8, null, str, str2, i9, Z8));
    }

    private void i(int i8, int i9, String str, String str2, int i10) {
        a(new a(i9, i8, null, str, str2, i10, Z(i8, str, str2, i10)));
    }

    private AbstractC2011B m(int i8, int i9) {
        int U8 = U(i8, i9);
        for (a N8 = N(U8); N8 != null; N8 = N8.f15211i) {
            if (N8.f15192b == i8 && N8.f15210h == U8 && N8.f15196f == i9) {
                return N8;
            }
        }
        this.f15205h.g(i8).i(i9);
        int i10 = this.f15204g;
        this.f15204g = i10 + 1;
        return c0(new a(i10, i8, i9, U8));
    }

    private void n(int i8, int i9, int i10) {
        a(new a(i8, i9, i10, U(i9, i10)));
    }

    private AbstractC2011B q(int i8, long j8) {
        int V8 = V(i8, j8);
        for (a N8 = N(V8); N8 != null; N8 = N8.f15211i) {
            if (N8.f15192b == i8 && N8.f15210h == V8 && N8.f15196f == j8) {
                return N8;
            }
        }
        int i9 = this.f15204g;
        this.f15205h.g(i8).j(j8);
        this.f15204g += 2;
        return c0(new a(i9, i8, j8, V8));
    }

    private void r(int i8, int i9, long j8) {
        a(new a(i8, i9, j8, V(i9, j8)));
    }

    private a s(int i8, String str, String str2, String str3) {
        int a02 = a0(i8, str, str2, str3);
        for (a N8 = N(a02); N8 != null; N8 = N8.f15211i) {
            if (N8.f15192b == i8 && N8.f15210h == a02 && N8.f15193c.equals(str) && N8.f15194d.equals(str2) && N8.f15195e.equals(str3)) {
                return N8;
            }
        }
        this.f15205h.f(i8, e(str).f15191a, z(str2, str3));
        int i9 = this.f15204g;
        this.f15204g = i9 + 1;
        return c0(new a(i9, i8, str, str2, str3, 0L, a02));
    }

    private void t(int i8, int i9, String str, String str2, String str3) {
        a(new a(i8, i9, str, str2, str3, 0L, a0(i9, str, str2, str3)));
    }

    private void v(int i8, int i9, String str, String str2, String str3) {
        a(new a(i8, 15, str, str2, str3, i9, b0(15, str, str2, str3, i9)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2011B B(String str) {
        return F(20, str);
    }

    AbstractC2011B C(String str) {
        return F(8, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int D(String str) {
        int W8 = W(1, str);
        for (a N8 = N(W8); N8 != null; N8 = N8.f15211i) {
            if (N8.f15192b == 1 && N8.f15210h == W8 && N8.f15195e.equals(str)) {
                return N8.f15191a;
            }
        }
        this.f15205h.g(1).l(str);
        int i8 = this.f15204g;
        this.f15204g = i8 + 1;
        return c0(new a(i8, 1, str, W8)).f15191a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int H(int i8, int i9) {
        long j8;
        long j9;
        if (i8 < i9) {
            j8 = i8;
            j9 = i9;
        } else {
            j8 = i9;
            j9 = i8;
        }
        long j10 = j8 | (j9 << 32);
        int U8 = U(TsExtractor.TS_STREAM_TYPE_HDMV_DTS, i8 + i9);
        for (a N8 = N(U8); N8 != null; N8 = N8.f15211i) {
            if (N8.f15192b == 130 && N8.f15210h == U8 && N8.f15196f == j10) {
                return N8.f15197g;
            }
        }
        a[] aVarArr = this.f15209l;
        int I8 = I(this.f15198a.r(aVarArr[i8].f15195e, aVarArr[i9].f15195e));
        c0(new a(this.f15208k, TsExtractor.TS_STREAM_TYPE_HDMV_DTS, j10, U8)).f15197g = I8;
        return I8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int I(String str) {
        int W8 = W(128, str);
        for (a N8 = N(W8); N8 != null; N8 = N8.f15211i) {
            if (N8.f15192b == 128 && N8.f15210h == W8 && N8.f15195e.equals(str)) {
                return N8.f15191a;
            }
        }
        return J(new a(this.f15208k, 128, str, W8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int K(String str, int i8) {
        int X8 = X(TsExtractor.TS_STREAM_TYPE_AC3, str, i8);
        for (a N8 = N(X8); N8 != null; N8 = N8.f15211i) {
            if (N8.f15192b == 129 && N8.f15210h == X8 && N8.f15196f == i8 && N8.f15195e.equals(str)) {
                return N8.f15191a;
            }
        }
        return J(new a(this.f15208k, TsExtractor.TS_STREAM_TYPE_AC3, str, i8, X8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int L() {
        if (this.f15207j != null) {
            D("BootstrapMethods");
            return this.f15207j.f15242b + 8;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String O() {
        return this.f15201d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int P() {
        return this.f15204g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int Q() {
        return this.f15205h.f15242b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int R() {
        return this.f15200c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2019e S() {
        return this.f15199b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2011B T(int i8) {
        return this.f15209l[i8];
    }

    AbstractC2011B c(q qVar, Object... objArr) {
        C2018d c2018d = this.f15207j;
        if (c2018d == null) {
            c2018d = new C2018d();
            this.f15207j = c2018d;
        }
        int length = objArr.length;
        int[] iArr = new int[length];
        for (int i8 = 0; i8 < length; i8++) {
            iArr[i8] = d(objArr[i8]).f15191a;
        }
        int i9 = c2018d.f15242b;
        c2018d.k(u(qVar.d(), qVar.c(), qVar.b(), qVar.a(), qVar.e()).f15191a);
        c2018d.k(length);
        for (int i10 = 0; i10 < length; i10++) {
            c2018d.k(iArr[i10]);
        }
        int i11 = c2018d.f15242b - i9;
        int hashCode = qVar.hashCode();
        for (Object obj : objArr) {
            hashCode ^= obj.hashCode();
        }
        return b(i9, i11, hashCode & Integer.MAX_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2011B d(Object obj) {
        if (obj instanceof Integer) {
            return l(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return l(((Byte) obj).intValue());
        }
        if (obj instanceof Character) {
            return l(((Character) obj).charValue());
        }
        if (obj instanceof Short) {
            return l(((Short) obj).intValue());
        }
        if (obj instanceof Boolean) {
            return l(((Boolean) obj).booleanValue() ? 1 : 0);
        }
        if (obj instanceof Float) {
            return k(((Float) obj).floatValue());
        }
        if (obj instanceof Long) {
            return p(((Long) obj).longValue());
        }
        if (obj instanceof Double) {
            return f(((Double) obj).doubleValue());
        }
        if (obj instanceof String) {
            return C((String) obj);
        }
        if (obj instanceof C2013D) {
            C2013D c2013d = (C2013D) obj;
            int l8 = c2013d.l();
            if (l8 == 10) {
                return e(c2013d.f());
            }
            if (l8 == 11) {
                return w(c2013d.d());
            }
            return e(c2013d.d());
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            return u(qVar.d(), qVar.c(), qVar.b(), qVar.a(), qVar.e());
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return g(iVar.d(), iVar.c(), iVar.a(), iVar.b());
        }
        throw new IllegalArgumentException("value " + obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d0(C2018d c2018d) {
        if (this.f15207j != null) {
            C2018d k8 = c2018d.k(D("BootstrapMethods")).i(this.f15207j.f15242b + 2).k(this.f15206i);
            C2018d c2018d2 = this.f15207j;
            k8.h(c2018d2.f15241a, 0, c2018d2.f15242b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2011B e(String str) {
        return F(7, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e0(C2018d c2018d) {
        C2018d k8 = c2018d.k(this.f15204g);
        C2018d c2018d2 = this.f15205h;
        k8.h(c2018d2.f15241a, 0, c2018d2.f15242b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2011B f(double d8) {
        return q(6, Double.doubleToRawLongBits(d8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f0(int i8, String str) {
        this.f15200c = i8;
        this.f15201d = str;
        return e(str).f15191a;
    }

    AbstractC2011B g(String str, String str2, q qVar, Object... objArr) {
        return h(17, str, str2, c(qVar, objArr).f15191a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2011B j(String str, String str2, String str3) {
        return s(9, str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2011B k(float f8) {
        return m(4, Float.floatToRawIntBits(f8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2011B l(int i8) {
        return m(3, i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2011B o(String str, String str2, q qVar, Object... objArr) {
        return h(18, str, str2, c(qVar, objArr).f15191a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2011B p(long j8) {
        return q(5, j8);
    }

    AbstractC2011B u(int i8, String str, String str2, String str3, boolean z8) {
        int b02 = b0(15, str, str2, str3, i8);
        for (a N8 = N(b02); N8 != null; N8 = N8.f15211i) {
            if (N8.f15192b == 15 && N8.f15210h == b02 && N8.f15196f == i8 && N8.f15193c.equals(str) && N8.f15194d.equals(str2) && N8.f15195e.equals(str3)) {
                return N8;
            }
        }
        if (i8 <= 4) {
            this.f15205h.d(15, i8, j(str, str2, str3).f15191a);
        } else {
            this.f15205h.d(15, i8, x(str, str2, str3, z8).f15191a);
        }
        int i9 = this.f15204g;
        this.f15204g = i9 + 1;
        return c0(new a(i9, 15, str, str2, str3, i8, b02));
    }

    AbstractC2011B w(String str) {
        return F(16, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2011B x(String str, String str2, String str3, boolean z8) {
        int i8;
        if (z8) {
            i8 = 11;
        } else {
            i8 = 10;
        }
        return s(i8, str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2011B y(String str) {
        return F(19, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int z(String str, String str2) {
        int Y8 = Y(12, str, str2);
        for (a N8 = N(Y8); N8 != null; N8 = N8.f15211i) {
            if (N8.f15192b == 12 && N8.f15210h == Y8 && N8.f15194d.equals(str) && N8.f15195e.equals(str2)) {
                return N8.f15191a;
            }
        }
        this.f15205h.f(12, D(str), D(str2));
        int i8 = this.f15204g;
        this.f15204g = i8 + 1;
        return c0(new a(i8, 12, str, str2, Y8)).f15191a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c2.C$a */
    /* loaded from: classes4.dex */
    public static class a extends AbstractC2011B {

        /* renamed from: h, reason: collision with root package name */
        final int f15210h;

        /* renamed from: i, reason: collision with root package name */
        a f15211i;

        a(int i8, int i9, String str, String str2, String str3, long j8, int i10) {
            super(i8, i9, str, str2, str3, j8);
            this.f15210h = i10;
        }

        a(int i8, int i9, String str, int i10) {
            super(i8, i9, null, null, str, 0L);
            this.f15210h = i10;
        }

        a(int i8, int i9, String str, long j8, int i10) {
            super(i8, i9, null, null, str, j8);
            this.f15210h = i10;
        }

        a(int i8, int i9, String str, String str2, int i10) {
            super(i8, i9, null, str, str2, 0L);
            this.f15210h = i10;
        }

        a(int i8, int i9, long j8, int i10) {
            super(i8, i9, null, null, null, j8);
            this.f15210h = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2012C(h hVar, C2019e c2019e) {
        this.f15198a = hVar;
        this.f15199b = c2019e;
        byte[] bArr = c2019e.f15245c;
        int f8 = c2019e.f(1) - 1;
        int i8 = c2019e.f15244b - f8;
        this.f15204g = c2019e.g();
        C2018d c2018d = new C2018d(i8);
        this.f15205h = c2018d;
        c2018d.h(bArr, f8, i8);
        this.f15203f = new a[this.f15204g * 2];
        char[] cArr = new char[c2019e.h()];
        boolean z8 = false;
        int i9 = 1;
        while (i9 < this.f15204g) {
            int f9 = c2019e.f(i9);
            byte b9 = bArr[f9 - 1];
            switch (b9) {
                case 1:
                    E(i9, c2019e.K(i9, cArr));
                    break;
                case 2:
                case 13:
                case 14:
                default:
                    throw new IllegalArgumentException();
                case 3:
                case 4:
                    n(i9, b9, c2019e.t(f9));
                    break;
                case 5:
                case 6:
                    r(i9, b9, c2019e.v(f9));
                    break;
                case 7:
                case 8:
                case 16:
                case 19:
                case 20:
                    G(i9, b9, c2019e.H(f9, cArr));
                    break;
                case 9:
                case 10:
                case 11:
                    int f10 = c2019e.f(c2019e.I(f9 + 2));
                    t(i9, b9, c2019e.m(f9, cArr), c2019e.H(f10, cArr), c2019e.H(f10 + 2, cArr));
                    break;
                case 12:
                    A(i9, c2019e.H(f9, cArr), c2019e.H(f9 + 2, cArr));
                    break;
                case 15:
                    int f11 = c2019e.f(c2019e.I(f9 + 1));
                    int f12 = c2019e.f(c2019e.I(f11 + 2));
                    v(i9, c2019e.l(f9), c2019e.m(f11, cArr), c2019e.H(f12, cArr), c2019e.H(f12 + 2, cArr));
                    break;
                case 17:
                case 18:
                    int f13 = c2019e.f(c2019e.I(f9 + 2));
                    i(b9, i9, c2019e.H(f13, cArr), c2019e.H(f13 + 2, cArr), c2019e.I(f9));
                    z8 = true;
                    break;
            }
            i9 += (b9 == 5 || b9 == 6) ? 2 : 1;
        }
        if (z8) {
            M(c2019e, cArr);
        }
    }
}
