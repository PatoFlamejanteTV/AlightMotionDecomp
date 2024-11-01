package c2;

import c2.C2017c;

/* loaded from: classes4.dex */
public class h extends g {

    /* renamed from: A, reason: collision with root package name */
    private int f15255A;

    /* renamed from: B, reason: collision with root package name */
    private C2018d f15256B;

    /* renamed from: C, reason: collision with root package name */
    private int f15257C;

    /* renamed from: D, reason: collision with root package name */
    private C2018d f15258D;

    /* renamed from: E, reason: collision with root package name */
    private C2010A f15259E;

    /* renamed from: F, reason: collision with root package name */
    private C2010A f15260F;

    /* renamed from: G, reason: collision with root package name */
    private C2017c f15261G;

    /* renamed from: H, reason: collision with root package name */
    private int f15262H;

    /* renamed from: c, reason: collision with root package name */
    private int f15263c;

    /* renamed from: d, reason: collision with root package name */
    private final C2012C f15264d;

    /* renamed from: e, reason: collision with root package name */
    private int f15265e;

    /* renamed from: f, reason: collision with root package name */
    private int f15266f;

    /* renamed from: g, reason: collision with root package name */
    private int f15267g;

    /* renamed from: h, reason: collision with root package name */
    private int f15268h;

    /* renamed from: i, reason: collision with root package name */
    private int[] f15269i;

    /* renamed from: j, reason: collision with root package name */
    private o f15270j;

    /* renamed from: k, reason: collision with root package name */
    private o f15271k;

    /* renamed from: l, reason: collision with root package name */
    private v f15272l;

    /* renamed from: m, reason: collision with root package name */
    private v f15273m;

    /* renamed from: n, reason: collision with root package name */
    private int f15274n;

    /* renamed from: o, reason: collision with root package name */
    private C2018d f15275o;

    /* renamed from: p, reason: collision with root package name */
    private int f15276p;

    /* renamed from: q, reason: collision with root package name */
    private int f15277q;

    /* renamed from: r, reason: collision with root package name */
    private int f15278r;

    /* renamed from: s, reason: collision with root package name */
    private int f15279s;

    /* renamed from: t, reason: collision with root package name */
    private C2018d f15280t;

    /* renamed from: u, reason: collision with root package name */
    private C2016b f15281u;

    /* renamed from: v, reason: collision with root package name */
    private C2016b f15282v;

    /* renamed from: w, reason: collision with root package name */
    private C2016b f15283w;

    /* renamed from: x, reason: collision with root package name */
    private C2016b f15284x;

    /* renamed from: y, reason: collision with root package name */
    private x f15285y;

    /* renamed from: z, reason: collision with root package name */
    private int f15286z;

    public h(int i8) {
        this(null, i8);
    }

    private C2017c[] p() {
        C2017c.a aVar = new C2017c.a();
        aVar.b(this.f15261G);
        for (o oVar = this.f15270j; oVar != null; oVar = (o) oVar.f15314b) {
            oVar.e(aVar);
        }
        for (v vVar = this.f15272l; vVar != null; vVar = (v) vVar.f15365b) {
            vVar.H(aVar);
        }
        for (C2010A c2010a = this.f15259E; c2010a != null; c2010a = (C2010A) c2010a.f15446b) {
            c2010a.e(aVar);
        }
        return aVar.d();
    }

    private byte[] s(byte[] bArr, boolean z8) {
        int i8;
        C2017c[] p8 = p();
        this.f15270j = null;
        this.f15271k = null;
        this.f15272l = null;
        this.f15273m = null;
        this.f15281u = null;
        this.f15282v = null;
        this.f15283w = null;
        this.f15284x = null;
        this.f15285y = null;
        int i9 = 0;
        this.f15286z = 0;
        this.f15255A = 0;
        this.f15256B = null;
        this.f15257C = 0;
        this.f15258D = null;
        this.f15259E = null;
        this.f15260F = null;
        this.f15261G = null;
        if (z8) {
            i8 = 3;
        } else {
            i8 = 0;
        }
        this.f15262H = i8;
        C2019e c2019e = new C2019e(bArr, 0, false);
        if (z8) {
            i9 = 8;
        }
        c2019e.a(this, p8, i9 | 256);
        return t();
    }

    @Override // c2.g
    public final void a(int i8, int i9, String str, String str2, String str3, String[] strArr) {
        int i10;
        this.f15263c = i8;
        this.f15265e = i9;
        int i11 = i8 & 65535;
        this.f15266f = this.f15264d.f0(i11, str);
        if (str2 != null) {
            this.f15278r = this.f15264d.D(str2);
        }
        if (str3 == null) {
            i10 = 0;
        } else {
            i10 = this.f15264d.e(str3).f15191a;
        }
        this.f15267g = i10;
        if (strArr != null && strArr.length > 0) {
            int length = strArr.length;
            this.f15268h = length;
            this.f15269i = new int[length];
            for (int i12 = 0; i12 < this.f15268h; i12++) {
                this.f15269i[i12] = this.f15264d.e(strArr[i12]).f15191a;
            }
        }
        if (this.f15262H == 1 && i11 >= 51) {
            this.f15262H = 2;
        }
    }

    @Override // c2.g
    public final AbstractC2015a b(String str, boolean z8) {
        if (z8) {
            C2016b j8 = C2016b.j(this.f15264d, str, this.f15281u);
            this.f15281u = j8;
            return j8;
        }
        C2016b j9 = C2016b.j(this.f15264d, str, this.f15282v);
        this.f15282v = j9;
        return j9;
    }

    @Override // c2.g
    public final void c(C2017c c2017c) {
        c2017c.f15238c = this.f15261G;
        this.f15261G = c2017c;
    }

    @Override // c2.g
    public final n e(int i8, String str, String str2, String str3, Object obj) {
        o oVar = new o(this.f15264d, i8, str, str2, str3, obj);
        if (this.f15270j == null) {
            this.f15270j = oVar;
        } else {
            this.f15271k.f15314b = oVar;
        }
        this.f15271k = oVar;
        return oVar;
    }

    @Override // c2.g
    public final void f(String str, String str2, String str3, int i8) {
        int i9;
        if (this.f15275o == null) {
            this.f15275o = new C2018d();
        }
        AbstractC2011B e8 = this.f15264d.e(str);
        if (e8.f15197g == 0) {
            this.f15274n++;
            this.f15275o.k(e8.f15191a);
            C2018d c2018d = this.f15275o;
            int i10 = 0;
            if (str2 == null) {
                i9 = 0;
            } else {
                i9 = this.f15264d.e(str2).f15191a;
            }
            c2018d.k(i9);
            C2018d c2018d2 = this.f15275o;
            if (str3 != null) {
                i10 = this.f15264d.D(str3);
            }
            c2018d2.k(i10);
            this.f15275o.k(i8);
            e8.f15197g = this.f15274n;
        }
    }

    @Override // c2.g
    public final u g(int i8, String str, String str2, String str3, String[] strArr) {
        v vVar = new v(this.f15264d, i8, str, str2, str3, strArr, this.f15262H);
        if (this.f15272l == null) {
            this.f15272l = vVar;
        } else {
            this.f15273m.f15365b = vVar;
        }
        this.f15273m = vVar;
        return vVar;
    }

    @Override // c2.g
    public final w h(String str, int i8, String str2) {
        int D8;
        C2012C c2012c = this.f15264d;
        int i9 = c2012c.y(str).f15191a;
        if (str2 == null) {
            D8 = 0;
        } else {
            D8 = this.f15264d.D(str2);
        }
        x xVar = new x(c2012c, i9, i8, D8);
        this.f15285y = xVar;
        return xVar;
    }

    @Override // c2.g
    public final void i(String str) {
        this.f15286z = this.f15264d.e(str).f15191a;
    }

    @Override // c2.g
    public final void j(String str) {
        if (this.f15256B == null) {
            this.f15256B = new C2018d();
        }
        this.f15255A++;
        this.f15256B.k(this.f15264d.e(str).f15191a);
    }

    @Override // c2.g
    public final void k(String str, String str2, String str3) {
        this.f15276p = this.f15264d.e(str).f15191a;
        if (str2 != null && str3 != null) {
            this.f15277q = this.f15264d.z(str2, str3);
        }
    }

    @Override // c2.g
    public final void l(String str) {
        if (this.f15258D == null) {
            this.f15258D = new C2018d();
        }
        this.f15257C++;
        this.f15258D.k(this.f15264d.e(str).f15191a);
    }

    @Override // c2.g
    public final z m(String str, String str2, String str3) {
        C2010A c2010a = new C2010A(this.f15264d, str, str2, str3);
        if (this.f15259E == null) {
            this.f15259E = c2010a;
        } else {
            this.f15260F.f15446b = c2010a;
        }
        this.f15260F = c2010a;
        return c2010a;
    }

    @Override // c2.g
    public final void n(String str, String str2) {
        if (str != null) {
            this.f15279s = this.f15264d.D(str);
        }
        if (str2 != null) {
            this.f15280t = new C2018d().a(str2, 0, Integer.MAX_VALUE);
        }
    }

    @Override // c2.g
    public final AbstractC2015a o(int i8, C2014E c2014e, String str, boolean z8) {
        if (z8) {
            C2016b i9 = C2016b.i(this.f15264d, i8, c2014e, str, this.f15283w);
            this.f15283w = i9;
            return i9;
        }
        C2016b i10 = C2016b.i(this.f15264d, i8, c2014e, str, this.f15284x);
        this.f15284x = i10;
        return i10;
    }

    protected ClassLoader q() {
        return getClass().getClassLoader();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String r(String str, String str2) {
        ClassLoader q8 = q();
        try {
            Class<?> cls = Class.forName(str.replace('/', '.'), false, q8);
            try {
                Class<?> cls2 = Class.forName(str2.replace('/', '.'), false, q8);
                if (cls.isAssignableFrom(cls2)) {
                    return str;
                }
                if (cls2.isAssignableFrom(cls)) {
                    return str2;
                }
                if (cls.isInterface() || cls2.isInterface()) {
                    return "java/lang/Object";
                }
                do {
                    cls = cls.getSuperclass();
                } while (!cls.isAssignableFrom(cls2));
                return cls.getName().replace('.', '/');
            } catch (ClassNotFoundException e8) {
                throw new TypeNotPresentException(str2, e8);
            }
        } catch (ClassNotFoundException e9) {
            throw new TypeNotPresentException(str, e9);
        }
    }

    public byte[] t() {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = (this.f15268h * 2) + 24;
        int i15 = 0;
        for (o oVar = this.f15270j; oVar != null; oVar = (o) oVar.f15314b) {
            i15++;
            i14 += oVar.f();
        }
        int i16 = 0;
        for (v vVar = this.f15272l; vVar != null; vVar = (v) vVar.f15365b) {
            i16++;
            i14 += vVar.K();
        }
        C2018d c2018d = this.f15275o;
        if (c2018d != null) {
            i14 += c2018d.f15242b + 8;
            this.f15264d.D("InnerClasses");
            i8 = 1;
        } else {
            i8 = 0;
        }
        if (this.f15276p != 0) {
            i8++;
            i14 += 10;
            this.f15264d.D("EnclosingMethod");
        }
        if ((this.f15265e & 4096) != 0 && (this.f15263c & 65535) < 49) {
            i8++;
            i14 += 6;
            this.f15264d.D("Synthetic");
        }
        if (this.f15278r != 0) {
            i8++;
            i14 += 8;
            this.f15264d.D("Signature");
        }
        if (this.f15279s != 0) {
            i8++;
            i14 += 8;
            this.f15264d.D("SourceFile");
        }
        C2018d c2018d2 = this.f15280t;
        if (c2018d2 != null) {
            i8++;
            i14 += c2018d2.f15242b + 6;
            this.f15264d.D("SourceDebugExtension");
        }
        if ((this.f15265e & 131072) != 0) {
            i8++;
            i14 += 6;
            this.f15264d.D("Deprecated");
        }
        C2016b c2016b = this.f15281u;
        if (c2016b != null) {
            i8++;
            i14 += c2016b.g("RuntimeVisibleAnnotations");
        }
        C2016b c2016b2 = this.f15282v;
        if (c2016b2 != null) {
            i8++;
            i14 += c2016b2.g("RuntimeInvisibleAnnotations");
        }
        C2016b c2016b3 = this.f15283w;
        if (c2016b3 != null) {
            i8++;
            i14 += c2016b3.g("RuntimeVisibleTypeAnnotations");
        }
        C2016b c2016b4 = this.f15284x;
        if (c2016b4 != null) {
            i8++;
            i14 += c2016b4.g("RuntimeInvisibleTypeAnnotations");
        }
        if (this.f15264d.L() > 0) {
            i8++;
            i14 += this.f15264d.L();
        }
        x xVar = this.f15285y;
        if (xVar != null) {
            i8 += xVar.j();
            i14 += this.f15285y.i();
        }
        if (this.f15286z != 0) {
            i8++;
            i14 += 8;
            this.f15264d.D("NestHost");
        }
        C2018d c2018d3 = this.f15256B;
        if (c2018d3 != null) {
            i8++;
            i14 += c2018d3.f15242b + 8;
            this.f15264d.D("NestMembers");
        }
        C2018d c2018d4 = this.f15258D;
        if (c2018d4 != null) {
            i8++;
            i14 += c2018d4.f15242b + 8;
            this.f15264d.D("PermittedSubclasses");
        }
        if ((this.f15265e & 65536) == 0 && this.f15259E == null) {
            i9 = 0;
            i10 = 0;
        } else {
            i9 = 0;
            i10 = 0;
            for (C2010A c2010a = this.f15259E; c2010a != null; c2010a = (C2010A) c2010a.f15446b) {
                i10++;
                i9 += c2010a.f();
            }
            i8++;
            i14 += i9 + 8;
            this.f15264d.D("Record");
        }
        C2017c c2017c = this.f15261G;
        if (c2017c != null) {
            int d8 = i8 + c2017c.d();
            i14 += this.f15261G.a(this.f15264d);
            i8 = d8;
        }
        int Q8 = i14 + this.f15264d.Q();
        int P8 = this.f15264d.P();
        if (P8 <= 65535) {
            C2018d c2018d5 = new C2018d(Q8);
            c2018d5.i(-889275714).i(this.f15263c);
            this.f15264d.e0(c2018d5);
            if ((this.f15263c & 65535) < 49) {
                i11 = 4096;
            } else {
                i11 = 0;
            }
            c2018d5.k((~i11) & this.f15265e).k(this.f15266f).k(this.f15267g);
            c2018d5.k(this.f15268h);
            for (int i17 = 0; i17 < this.f15268h; i17++) {
                c2018d5.k(this.f15269i[i17]);
            }
            c2018d5.k(i15);
            for (o oVar2 = this.f15270j; oVar2 != null; oVar2 = (o) oVar2.f15314b) {
                oVar2.g(c2018d5);
            }
            c2018d5.k(i16);
            boolean z8 = false;
            boolean z9 = false;
            for (v vVar2 = this.f15272l; vVar2 != null; vVar2 = (v) vVar2.f15365b) {
                z8 |= vVar2.N();
                z9 |= vVar2.M();
                vVar2.R(c2018d5);
            }
            c2018d5.k(i8);
            if (this.f15275o != null) {
                C2018d k8 = c2018d5.k(this.f15264d.D("InnerClasses")).i(this.f15275o.f15242b + 2).k(this.f15274n);
                C2018d c2018d6 = this.f15275o;
                k8.h(c2018d6.f15241a, 0, c2018d6.f15242b);
            }
            if (this.f15276p != 0) {
                c2018d5.k(this.f15264d.D("EnclosingMethod")).i(4).k(this.f15276p).k(this.f15277q);
            }
            if ((this.f15265e & 4096) != 0 && (this.f15263c & 65535) < 49) {
                c2018d5.k(this.f15264d.D("Synthetic")).i(0);
            }
            if (this.f15278r != 0) {
                i12 = 2;
                c2018d5.k(this.f15264d.D("Signature")).i(2).k(this.f15278r);
            } else {
                i12 = 2;
            }
            if (this.f15279s != 0) {
                c2018d5.k(this.f15264d.D("SourceFile")).i(i12).k(this.f15279s);
            }
            C2018d c2018d7 = this.f15280t;
            if (c2018d7 != null) {
                int i18 = c2018d7.f15242b;
                i13 = 0;
                c2018d5.k(this.f15264d.D("SourceDebugExtension")).i(i18).h(this.f15280t.f15241a, 0, i18);
            } else {
                i13 = 0;
            }
            if ((this.f15265e & 131072) != 0) {
                c2018d5.k(this.f15264d.D("Deprecated")).i(i13);
            }
            C2016b.l(this.f15264d, this.f15281u, this.f15282v, this.f15283w, this.f15284x, c2018d5);
            this.f15264d.d0(c2018d5);
            x xVar2 = this.f15285y;
            if (xVar2 != null) {
                xVar2.k(c2018d5);
            }
            if (this.f15286z != 0) {
                c2018d5.k(this.f15264d.D("NestHost")).i(2).k(this.f15286z);
            }
            if (this.f15256B != null) {
                C2018d k9 = c2018d5.k(this.f15264d.D("NestMembers")).i(this.f15256B.f15242b + 2).k(this.f15255A);
                C2018d c2018d8 = this.f15256B;
                k9.h(c2018d8.f15241a, 0, c2018d8.f15242b);
            }
            if (this.f15258D != null) {
                C2018d k10 = c2018d5.k(this.f15264d.D("PermittedSubclasses")).i(this.f15258D.f15242b + 2).k(this.f15257C);
                C2018d c2018d9 = this.f15258D;
                k10.h(c2018d9.f15241a, 0, c2018d9.f15242b);
            }
            if ((this.f15265e & 65536) != 0 || this.f15259E != null) {
                c2018d5.k(this.f15264d.D("Record")).i(i9 + 2).k(i10);
                for (C2010A c2010a2 = this.f15259E; c2010a2 != null; c2010a2 = (C2010A) c2010a2.f15446b) {
                    c2010a2.g(c2018d5);
                }
            }
            C2017c c2017c2 = this.f15261G;
            if (c2017c2 != null) {
                c2017c2.g(this.f15264d, c2018d5);
            }
            if (z9) {
                return s(c2018d5.f15241a, z8);
            }
            return c2018d5.f15241a;
        }
        throw new C2020f(this.f15264d.O(), P8);
    }

    public h(C2019e c2019e, int i8) {
        super(589824);
        this.f15264d = c2019e == null ? new C2012C(this) : new C2012C(this, c2019e);
        if ((i8 & 2) != 0) {
            this.f15262H = 4;
        } else if ((i8 & 1) != 0) {
            this.f15262H = 1;
        } else {
            this.f15262H = 0;
        }
    }

    @Override // c2.g
    public final void d() {
    }
}
