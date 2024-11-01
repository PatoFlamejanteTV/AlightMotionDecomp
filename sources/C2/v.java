package c2;

import androidx.compose.runtime.ComposerKt;
import c2.C2017c;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class v extends u {

    /* renamed from: c0, reason: collision with root package name */
    private static final int[] f15366c0 = {0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 1, 1, 1, 2, 2, 1, 1, 1, 0, 0, 1, 2, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -1, 0, -1, -1, -1, -1, -1, -2, -1, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, -4, -3, -4, -3, -3, -3, -3, -1, -2, 1, 1, 1, 2, 2, 2, 0, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -2, -1, -2, -1, -2, 0, 1, 0, 1, -1, -1, 0, 0, 1, 1, -1, 0, -1, 0, 0, 0, -3, -1, -1, -3, -3, -1, -1, -1, -1, -1, -1, -2, -2, -2, -2, -2, -2, -2, -2, 0, 1, 0, -1, -1, -1, -2, -1, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, -1, -1, 0, 0, -1, -1, 0, 0};

    /* renamed from: A, reason: collision with root package name */
    private final int f15367A;

    /* renamed from: B, reason: collision with root package name */
    private C2016b f15368B;

    /* renamed from: C, reason: collision with root package name */
    private C2016b f15369C;

    /* renamed from: D, reason: collision with root package name */
    private int f15370D;

    /* renamed from: E, reason: collision with root package name */
    private C2016b[] f15371E;

    /* renamed from: F, reason: collision with root package name */
    private int f15372F;

    /* renamed from: G, reason: collision with root package name */
    private C2016b[] f15373G;

    /* renamed from: H, reason: collision with root package name */
    private C2016b f15374H;

    /* renamed from: I, reason: collision with root package name */
    private C2016b f15375I;

    /* renamed from: J, reason: collision with root package name */
    private C2018d f15376J;

    /* renamed from: K, reason: collision with root package name */
    private int f15377K;

    /* renamed from: L, reason: collision with root package name */
    private C2018d f15378L;

    /* renamed from: M, reason: collision with root package name */
    private C2017c f15379M;

    /* renamed from: N, reason: collision with root package name */
    private final int f15380N;

    /* renamed from: O, reason: collision with root package name */
    private s f15381O;

    /* renamed from: P, reason: collision with root package name */
    private s f15382P;

    /* renamed from: Q, reason: collision with root package name */
    private s f15383Q;

    /* renamed from: R, reason: collision with root package name */
    private int f15384R;

    /* renamed from: S, reason: collision with root package name */
    private int f15385S;

    /* renamed from: T, reason: collision with root package name */
    private int f15386T;

    /* renamed from: U, reason: collision with root package name */
    private int f15387U;

    /* renamed from: V, reason: collision with root package name */
    private int[] f15388V;

    /* renamed from: W, reason: collision with root package name */
    private int[] f15389W;

    /* renamed from: X, reason: collision with root package name */
    private boolean f15390X;

    /* renamed from: Y, reason: collision with root package name */
    private boolean f15391Y;

    /* renamed from: Z, reason: collision with root package name */
    private int f15392Z;

    /* renamed from: a0, reason: collision with root package name */
    private int f15393a0;

    /* renamed from: b0, reason: collision with root package name */
    private int f15394b0;

    /* renamed from: c, reason: collision with root package name */
    private final C2012C f15395c;

    /* renamed from: d, reason: collision with root package name */
    private final int f15396d;

    /* renamed from: e, reason: collision with root package name */
    private final int f15397e;

    /* renamed from: f, reason: collision with root package name */
    private final String f15398f;

    /* renamed from: g, reason: collision with root package name */
    private final int f15399g;

    /* renamed from: h, reason: collision with root package name */
    private final String f15400h;

    /* renamed from: i, reason: collision with root package name */
    private int f15401i;

    /* renamed from: j, reason: collision with root package name */
    private int f15402j;

    /* renamed from: k, reason: collision with root package name */
    private final C2018d f15403k;

    /* renamed from: l, reason: collision with root package name */
    private r f15404l;

    /* renamed from: m, reason: collision with root package name */
    private r f15405m;

    /* renamed from: n, reason: collision with root package name */
    private int f15406n;

    /* renamed from: o, reason: collision with root package name */
    private C2018d f15407o;

    /* renamed from: p, reason: collision with root package name */
    private int f15408p;

    /* renamed from: q, reason: collision with root package name */
    private C2018d f15409q;

    /* renamed from: r, reason: collision with root package name */
    private int f15410r;

    /* renamed from: s, reason: collision with root package name */
    private C2018d f15411s;

    /* renamed from: t, reason: collision with root package name */
    private int f15412t;

    /* renamed from: u, reason: collision with root package name */
    private C2018d f15413u;

    /* renamed from: v, reason: collision with root package name */
    private C2016b f15414v;

    /* renamed from: w, reason: collision with root package name */
    private C2016b f15415w;

    /* renamed from: x, reason: collision with root package name */
    private C2017c f15416x;

    /* renamed from: y, reason: collision with root package name */
    private final int f15417y;

    /* renamed from: z, reason: collision with root package name */
    private final int[] f15418z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(C2012C c2012c, int i8, String str, String str2, String str3, String[] strArr, int i9) {
        super(589824);
        int i10;
        int D8;
        this.f15403k = new C2018d();
        this.f15395c = c2012c;
        if ("<init>".equals(str)) {
            i10 = 262144 | i8;
        } else {
            i10 = i8;
        }
        this.f15396d = i10;
        this.f15397e = c2012c.D(str);
        this.f15398f = str;
        this.f15399g = c2012c.D(str2);
        this.f15400h = str2;
        if (str3 == null) {
            D8 = 0;
        } else {
            D8 = c2012c.D(str3);
        }
        this.f15367A = D8;
        if (strArr != null && strArr.length > 0) {
            int length = strArr.length;
            this.f15417y = length;
            this.f15418z = new int[length];
            for (int i11 = 0; i11 < this.f15417y; i11++) {
                this.f15418z[i11] = c2012c.e(strArr[i11]).f15191a;
            }
        } else {
            this.f15417y = 0;
            this.f15418z = null;
        }
        this.f15380N = i9;
        if (i9 != 0) {
            int c8 = C2013D.c(str2) >> 2;
            c8 = (i8 & 8) != 0 ? c8 - 1 : c8;
            this.f15402j = c8;
            this.f15386T = c8;
            s sVar = new s();
            this.f15381O = sVar;
            o(sVar);
        }
    }

    private void F(int i8, s sVar) {
        s sVar2 = this.f15383Q;
        sVar2.f15358l = new m(i8, sVar, sVar2.f15358l);
    }

    private void I() {
        int i8;
        r rVar = this.f15404l;
        while (true) {
            String str = "java/lang/Throwable";
            if (rVar == null) {
                break;
            }
            String str2 = rVar.f15344e;
            if (str2 != null) {
                str = str2;
            }
            int g8 = p.g(this.f15395c, str);
            s e8 = rVar.f15342c.e();
            e8.f15347a = (short) (e8.f15347a | 2);
            s e9 = rVar.f15341b.e();
            for (s e10 = rVar.f15340a.e(); e10 != e9; e10 = e10.f15357k) {
                e10.f15358l = new m(g8, e8, e10.f15358l);
            }
            rVar = rVar.f15345f;
        }
        p pVar = this.f15381O.f15356j;
        pVar.u(this.f15395c, this.f15396d, this.f15400h, this.f15402j);
        pVar.a(this);
        s sVar = this.f15381O;
        sVar.f15359m = s.f15346n;
        int i9 = 0;
        while (sVar != s.f15346n) {
            s sVar2 = sVar.f15359m;
            sVar.f15359m = null;
            sVar.f15347a = (short) (sVar.f15347a | 8);
            int j8 = sVar.f15356j.j() + sVar.f15354h;
            if (j8 > i9) {
                i9 = j8;
            }
            for (m mVar = sVar.f15358l; mVar != null; mVar = mVar.f15312c) {
                s e11 = mVar.f15311b.e();
                if (sVar.f15356j.m(this.f15395c, e11.f15356j, mVar.f15310a) && e11.f15359m == null) {
                    e11.f15359m = sVar2;
                    sVar2 = e11;
                }
            }
            sVar = sVar2;
        }
        for (s sVar3 = this.f15381O; sVar3 != null; sVar3 = sVar3.f15357k) {
            if ((sVar3.f15347a & 10) == 10) {
                sVar3.f15356j.a(this);
            }
            if ((sVar3.f15347a & 8) == 0) {
                s sVar4 = sVar3.f15357k;
                int i10 = sVar3.f15350d;
                if (sVar4 == null) {
                    i8 = this.f15403k.f15242b;
                } else {
                    i8 = sVar4.f15350d;
                }
                int i11 = i8 - 1;
                if (i11 >= i10) {
                    for (int i12 = i10; i12 < i11; i12++) {
                        this.f15403k.f15241a[i12] = 0;
                    }
                    this.f15403k.f15241a[i11] = -65;
                    this.f15389W[V(i10, 0, 1)] = p.g(this.f15395c, "java/lang/Throwable");
                    U();
                    this.f15404l = r.d(this.f15404l, sVar3, sVar4);
                    i9 = Math.max(i9, 1);
                }
            }
        }
        this.f15401i = i9;
    }

    private void J() {
        int i8;
        for (r rVar = this.f15404l; rVar != null; rVar = rVar.f15345f) {
            s sVar = rVar.f15342c;
            s sVar2 = rVar.f15341b;
            for (s sVar3 = rVar.f15340a; sVar3 != sVar2; sVar3 = sVar3.f15357k) {
                if ((sVar3.f15347a & 16) == 0) {
                    sVar3.f15358l = new m(Integer.MAX_VALUE, sVar, sVar3.f15358l);
                } else {
                    m mVar = sVar3.f15358l.f15312c;
                    mVar.f15312c = new m(Integer.MAX_VALUE, sVar, mVar.f15312c);
                }
            }
        }
        if (this.f15390X) {
            this.f15381O.f((short) 1);
            short s8 = 1;
            for (short s9 = 1; s9 <= s8; s9 = (short) (s9 + 1)) {
                for (s sVar4 = this.f15381O; sVar4 != null; sVar4 = sVar4.f15357k) {
                    if ((sVar4.f15347a & 16) != 0 && sVar4.f15355i == s9) {
                        s sVar5 = sVar4.f15358l.f15312c.f15311b;
                        if (sVar5.f15355i == 0) {
                            s8 = (short) (s8 + 1);
                            sVar5.f(s8);
                        }
                    }
                }
            }
            for (s sVar6 = this.f15381O; sVar6 != null; sVar6 = sVar6.f15357k) {
                if ((sVar6.f15347a & 16) != 0) {
                    sVar6.f15358l.f15312c.f15311b.d(sVar6);
                }
            }
        }
        s sVar7 = this.f15381O;
        sVar7.f15359m = s.f15346n;
        int i9 = this.f15401i;
        while (sVar7 != s.f15346n) {
            s sVar8 = sVar7.f15359m;
            short s10 = sVar7.f15352f;
            int i10 = sVar7.f15354h + s10;
            if (i10 > i9) {
                i9 = i10;
            }
            m mVar2 = sVar7.f15358l;
            if ((sVar7.f15347a & 16) != 0) {
                mVar2 = mVar2.f15312c;
            }
            sVar7 = sVar8;
            while (mVar2 != null) {
                s sVar9 = mVar2.f15311b;
                if (sVar9.f15359m == null) {
                    int i11 = mVar2.f15310a;
                    if (i11 == Integer.MAX_VALUE) {
                        i8 = 1;
                    } else {
                        i8 = i11 + s10;
                    }
                    sVar9.f15352f = (short) i8;
                    sVar9.f15359m = sVar7;
                    sVar7 = sVar9;
                }
                mVar2 = mVar2.f15312c;
            }
        }
        this.f15401i = i9;
    }

    private void L() {
        int i8 = this.f15380N;
        if (i8 == 4) {
            s sVar = new s();
            sVar.f15356j = new p(sVar);
            C2018d c2018d = this.f15403k;
            sVar.i(c2018d.f15241a, c2018d.f15242b);
            this.f15382P.f15357k = sVar;
            this.f15382P = sVar;
            this.f15383Q = null;
            return;
        }
        if (i8 == 1) {
            this.f15383Q.f15354h = (short) this.f15385S;
            this.f15383Q = null;
        }
    }

    private void O(int i8, int i9) {
        while (i8 < i9) {
            p.s(this.f15395c, this.f15389W[i8], this.f15413u);
            i8++;
        }
    }

    private void P() {
        int i8;
        char c8;
        int[] iArr = this.f15389W;
        int i9 = iArr[1];
        int i10 = iArr[2];
        int i11 = 0;
        if (this.f15395c.R() < 50) {
            this.f15413u.k(this.f15389W[0]).k(i9);
            int i12 = i9 + 3;
            O(3, i12);
            this.f15413u.k(i10);
            O(i12, i10 + i12);
            return;
        }
        if (this.f15412t == 0) {
            i8 = this.f15389W[0];
        } else {
            i8 = (this.f15389W[0] - this.f15388V[0]) - 1;
        }
        int i13 = this.f15388V[1];
        int i14 = i9 - i13;
        if (i10 == 0) {
            switch (i14) {
                case -3:
                case -2:
                case -1:
                    c8 = 248;
                    break;
                case 0:
                    if (i8 < 64) {
                        c8 = 0;
                        break;
                    } else {
                        c8 = 251;
                        break;
                    }
                case 1:
                case 2:
                case 3:
                    c8 = 252;
                    break;
                default:
                    c8 = 255;
                    break;
            }
        } else {
            if (i14 == 0 && i10 == 1) {
                if (i8 < 63) {
                    c8 = '@';
                } else {
                    c8 = 247;
                }
            }
            c8 = 255;
        }
        if (c8 != 255) {
            int i15 = 3;
            while (true) {
                if (i11 < i13 && i11 < i9) {
                    if (this.f15389W[i15] != this.f15388V[i15]) {
                        c8 = 255;
                    } else {
                        i15++;
                        i11++;
                    }
                }
            }
        }
        if (c8 != 0) {
            if (c8 != '@') {
                if (c8 != 247) {
                    if (c8 != 248) {
                        if (c8 != 251) {
                            if (c8 != 252) {
                                this.f15413u.g(255).k(i8).k(i9);
                                int i16 = i9 + 3;
                                O(3, i16);
                                this.f15413u.k(i10);
                                O(i16, i10 + i16);
                                return;
                            }
                            this.f15413u.g(i14 + 251).k(i8);
                            O(i13 + 3, i9 + 3);
                            return;
                        }
                        this.f15413u.g(251).k(i8);
                        return;
                    }
                    this.f15413u.g(i14 + 251).k(i8);
                    return;
                }
                this.f15413u.g(247).k(i8);
                O(i9 + 3, i9 + 4);
                return;
            }
            this.f15413u.g(i8 + 64);
            O(i9 + 3, i9 + 4);
            return;
        }
        this.f15413u.g(i8);
    }

    private void Q(Object obj) {
        if (obj instanceof Integer) {
            this.f15413u.g(((Integer) obj).intValue());
        } else if (obj instanceof String) {
            this.f15413u.g(7).k(this.f15395c.e((String) obj).f15191a);
        } else {
            this.f15413u.g(8).k(((s) obj).f15350d);
        }
    }

    private void W(s sVar, s[] sVarArr) {
        s sVar2 = this.f15383Q;
        if (sVar2 != null) {
            int i8 = this.f15380N;
            if (i8 == 4) {
                sVar2.f15356j.d(171, 0, null, null);
                F(0, sVar);
                s e8 = sVar.e();
                e8.f15347a = (short) (e8.f15347a | 2);
                for (s sVar3 : sVarArr) {
                    F(0, sVar3);
                    s e9 = sVar3.e();
                    e9.f15347a = (short) (e9.f15347a | 2);
                }
            } else if (i8 == 1) {
                int i9 = this.f15384R - 1;
                this.f15384R = i9;
                F(i9, sVar);
                for (s sVar4 : sVarArr) {
                    F(this.f15384R, sVar4);
                }
            }
            L();
        }
    }

    @Override // c2.u
    public AbstractC2015a A(int i8, C2014E c2014e, String str, boolean z8) {
        if (z8) {
            C2016b i9 = C2016b.i(this.f15395c, i8, c2014e, str, this.f15414v);
            this.f15414v = i9;
            return i9;
        }
        C2016b i10 = C2016b.i(this.f15395c, i8, c2014e, str, this.f15415w);
        this.f15415w = i10;
        return i10;
    }

    @Override // c2.u
    public void B(s sVar, s sVar2, s sVar3, String str) {
        int i8;
        if (str != null) {
            i8 = this.f15395c.e(str).f15191a;
        } else {
            i8 = 0;
        }
        r rVar = new r(sVar, sVar2, sVar3, i8, str);
        if (this.f15404l == null) {
            this.f15404l = rVar;
        } else {
            this.f15405m.f15345f = rVar;
        }
        this.f15405m = rVar;
    }

    @Override // c2.u
    public AbstractC2015a C(int i8, C2014E c2014e, String str, boolean z8) {
        if (z8) {
            C2016b i9 = C2016b.i(this.f15395c, i8, c2014e, str, this.f15374H);
            this.f15374H = i9;
            return i9;
        }
        C2016b i10 = C2016b.i(this.f15395c, i8, c2014e, str, this.f15375I);
        this.f15375I = i10;
        return i10;
    }

    @Override // c2.u
    public void D(int i8, String str) {
        this.f15392Z = this.f15403k.f15242b;
        AbstractC2011B e8 = this.f15395c.e(str);
        this.f15403k.e(i8, e8.f15191a);
        s sVar = this.f15383Q;
        if (sVar != null) {
            int i9 = this.f15380N;
            if (i9 != 4 && i9 != 3) {
                if (i8 == 187) {
                    int i10 = this.f15384R + 1;
                    if (i10 > this.f15385S) {
                        this.f15385S = i10;
                    }
                    this.f15384R = i10;
                    return;
                }
                return;
            }
            sVar.f15356j.d(i8, this.f15392Z, e8, this.f15395c);
        }
    }

    @Override // c2.u
    public void E(int i8, int i9) {
        int i10;
        int i11;
        C2018d c2018d = this.f15403k;
        this.f15392Z = c2018d.f15242b;
        if (i9 < 4 && i8 != 169) {
            if (i8 < 54) {
                i11 = ((i8 - 21) << 2) + 26;
            } else {
                i11 = ((i8 - 54) << 2) + 59;
            }
            c2018d.g(i11 + i9);
        } else if (i9 >= 256) {
            c2018d.g(196).e(i8, i9);
        } else {
            c2018d.c(i8, i9);
        }
        s sVar = this.f15383Q;
        if (sVar != null) {
            int i12 = this.f15380N;
            if (i12 != 4 && i12 != 3) {
                if (i8 == 169) {
                    sVar.f15347a = (short) (sVar.f15347a | 64);
                    sVar.f15353g = (short) this.f15384R;
                    L();
                } else {
                    int i13 = this.f15384R + f15366c0[i8];
                    if (i13 > this.f15385S) {
                        this.f15385S = i13;
                    }
                    this.f15384R = i13;
                }
            } else {
                sVar.f15356j.d(i8, i9, null, null);
            }
        }
        int i14 = this.f15380N;
        if (i14 != 0) {
            if (i8 != 22 && i8 != 24 && i8 != 55 && i8 != 57) {
                i10 = i9 + 1;
            } else {
                i10 = i9 + 2;
            }
            if (i10 > this.f15402j) {
                this.f15402j = i10;
            }
        }
        if (i8 >= 54 && i14 == 4 && this.f15404l != null) {
            o(new s());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean G(C2019e c2019e, boolean z8, boolean z9, int i8, int i9, int i10) {
        boolean z10;
        boolean z11;
        if (c2019e == this.f15395c.S() && i8 == this.f15399g && i9 == this.f15367A) {
            if ((this.f15396d & 131072) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z9 == z10) {
                if (this.f15395c.R() < 49 && (this.f15396d & 4096) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z8 != z11) {
                    return false;
                }
                if (i10 == 0) {
                    if (this.f15417y != 0) {
                        return false;
                    }
                } else if (c2019e.I(i10) == this.f15417y) {
                    int i11 = i10 + 2;
                    for (int i12 = 0; i12 < this.f15417y; i12++) {
                        if (c2019e.I(i11) != this.f15418z[i12]) {
                            return false;
                        }
                        i11 += 2;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void H(C2017c.a aVar) {
        aVar.b(this.f15379M);
        aVar.b(this.f15416x);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int K() {
        int i8;
        boolean z8;
        String str;
        if (this.f15393a0 != 0) {
            return this.f15394b0 + 6;
        }
        int i9 = this.f15403k.f15242b;
        if (i9 > 0) {
            if (i9 <= 65535) {
                this.f15395c.D("Code");
                i8 = this.f15403k.f15242b + 16 + r.b(this.f15404l) + 8;
                if (this.f15413u != null) {
                    if (this.f15395c.R() >= 50) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    C2012C c2012c = this.f15395c;
                    if (z8) {
                        str = "StackMapTable";
                    } else {
                        str = "StackMap";
                    }
                    c2012c.D(str);
                    i8 += this.f15413u.f15242b + 8;
                }
                if (this.f15407o != null) {
                    this.f15395c.D("LineNumberTable");
                    i8 += this.f15407o.f15242b + 8;
                }
                if (this.f15409q != null) {
                    this.f15395c.D("LocalVariableTable");
                    i8 += this.f15409q.f15242b + 8;
                }
                if (this.f15411s != null) {
                    this.f15395c.D("LocalVariableTypeTable");
                    i8 += this.f15411s.f15242b + 8;
                }
                C2016b c2016b = this.f15414v;
                if (c2016b != null) {
                    i8 += c2016b.g("RuntimeVisibleTypeAnnotations");
                }
                C2016b c2016b2 = this.f15415w;
                if (c2016b2 != null) {
                    i8 += c2016b2.g("RuntimeInvisibleTypeAnnotations");
                }
                C2017c c2017c = this.f15416x;
                if (c2017c != null) {
                    C2012C c2012c2 = this.f15395c;
                    C2018d c2018d = this.f15403k;
                    i8 += c2017c.c(c2012c2, c2018d.f15241a, c2018d.f15242b, this.f15401i, this.f15402j);
                }
            } else {
                throw new t(this.f15395c.O(), this.f15398f, this.f15400h, this.f15403k.f15242b);
            }
        } else {
            i8 = 8;
        }
        if (this.f15417y > 0) {
            this.f15395c.D("Exceptions");
            i8 += (this.f15417y * 2) + 8;
        }
        int b9 = i8 + C2017c.b(this.f15395c, this.f15396d, this.f15367A) + C2016b.f(this.f15368B, this.f15369C, this.f15374H, this.f15375I);
        C2016b[] c2016bArr = this.f15371E;
        if (c2016bArr != null) {
            int i10 = this.f15370D;
            if (i10 == 0) {
                i10 = c2016bArr.length;
            }
            b9 += C2016b.h("RuntimeVisibleParameterAnnotations", c2016bArr, i10);
        }
        C2016b[] c2016bArr2 = this.f15373G;
        if (c2016bArr2 != null) {
            int i11 = this.f15372F;
            if (i11 == 0) {
                i11 = c2016bArr2.length;
            }
            b9 += C2016b.h("RuntimeInvisibleParameterAnnotations", c2016bArr2, i11);
        }
        if (this.f15376J != null) {
            this.f15395c.D("AnnotationDefault");
            b9 += this.f15376J.f15242b + 6;
        }
        if (this.f15378L != null) {
            this.f15395c.D("MethodParameters");
            b9 += this.f15378L.f15242b + 7;
        }
        C2017c c2017c2 = this.f15379M;
        if (c2017c2 != null) {
            return b9 + c2017c2.a(this.f15395c);
        }
        return b9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean M() {
        return this.f15391Y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean N() {
        if (this.f15412t > 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void R(C2018d c2018d) {
        boolean z8;
        int i8;
        int i9;
        int i10;
        boolean z9;
        String str;
        if (this.f15395c.R() < 49) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            i8 = 4096;
        } else {
            i8 = 0;
        }
        c2018d.k((~i8) & this.f15396d).k(this.f15397e).k(this.f15399g);
        if (this.f15393a0 != 0) {
            c2018d.h(this.f15395c.S().f15245c, this.f15393a0, this.f15394b0);
            return;
        }
        if (this.f15403k.f15242b > 0) {
            i9 = 1;
        } else {
            i9 = 0;
        }
        if (this.f15417y > 0) {
            i9++;
        }
        int i11 = this.f15396d;
        if ((i11 & 4096) != 0 && z8) {
            i9++;
        }
        if (this.f15367A != 0) {
            i9++;
        }
        if ((131072 & i11) != 0) {
            i9++;
        }
        if (this.f15368B != null) {
            i9++;
        }
        if (this.f15369C != null) {
            i9++;
        }
        if (this.f15371E != null) {
            i9++;
        }
        if (this.f15373G != null) {
            i9++;
        }
        if (this.f15374H != null) {
            i9++;
        }
        if (this.f15375I != null) {
            i9++;
        }
        if (this.f15376J != null) {
            i9++;
        }
        if (this.f15378L != null) {
            i9++;
        }
        C2017c c2017c = this.f15379M;
        if (c2017c != null) {
            i9 += c2017c.d();
        }
        c2018d.k(i9);
        int i12 = this.f15403k.f15242b;
        if (i12 > 0) {
            int b9 = i12 + 10 + r.b(this.f15404l);
            C2018d c2018d2 = this.f15413u;
            if (c2018d2 != null) {
                b9 += c2018d2.f15242b + 8;
                i10 = 1;
            } else {
                i10 = 0;
            }
            C2018d c2018d3 = this.f15407o;
            if (c2018d3 != null) {
                b9 += c2018d3.f15242b + 8;
                i10++;
            }
            C2018d c2018d4 = this.f15409q;
            if (c2018d4 != null) {
                b9 += c2018d4.f15242b + 8;
                i10++;
            }
            C2018d c2018d5 = this.f15411s;
            if (c2018d5 != null) {
                b9 += c2018d5.f15242b + 8;
                i10++;
            }
            C2016b c2016b = this.f15414v;
            if (c2016b != null) {
                b9 += c2016b.g("RuntimeVisibleTypeAnnotations");
                i10++;
            }
            C2016b c2016b2 = this.f15415w;
            if (c2016b2 != null) {
                b9 += c2016b2.g("RuntimeInvisibleTypeAnnotations");
                i10++;
            }
            C2017c c2017c2 = this.f15416x;
            if (c2017c2 != null) {
                C2012C c2012c = this.f15395c;
                C2018d c2018d6 = this.f15403k;
                b9 += c2017c2.c(c2012c, c2018d6.f15241a, c2018d6.f15242b, this.f15401i, this.f15402j);
                i10 += this.f15416x.d();
            }
            C2018d i13 = c2018d.k(this.f15395c.D("Code")).i(b9).k(this.f15401i).k(this.f15402j).i(this.f15403k.f15242b);
            C2018d c2018d7 = this.f15403k;
            i13.h(c2018d7.f15241a, 0, c2018d7.f15242b);
            r.c(this.f15404l, c2018d);
            c2018d.k(i10);
            if (this.f15413u != null) {
                if (this.f15395c.R() >= 50) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                C2012C c2012c2 = this.f15395c;
                if (z9) {
                    str = "StackMapTable";
                } else {
                    str = "StackMap";
                }
                C2018d k8 = c2018d.k(c2012c2.D(str)).i(this.f15413u.f15242b + 2).k(this.f15412t);
                C2018d c2018d8 = this.f15413u;
                k8.h(c2018d8.f15241a, 0, c2018d8.f15242b);
            }
            if (this.f15407o != null) {
                C2018d k9 = c2018d.k(this.f15395c.D("LineNumberTable")).i(this.f15407o.f15242b + 2).k(this.f15406n);
                C2018d c2018d9 = this.f15407o;
                k9.h(c2018d9.f15241a, 0, c2018d9.f15242b);
            }
            if (this.f15409q != null) {
                C2018d k10 = c2018d.k(this.f15395c.D("LocalVariableTable")).i(this.f15409q.f15242b + 2).k(this.f15408p);
                C2018d c2018d10 = this.f15409q;
                k10.h(c2018d10.f15241a, 0, c2018d10.f15242b);
            }
            if (this.f15411s != null) {
                C2018d k11 = c2018d.k(this.f15395c.D("LocalVariableTypeTable")).i(this.f15411s.f15242b + 2).k(this.f15410r);
                C2018d c2018d11 = this.f15411s;
                k11.h(c2018d11.f15241a, 0, c2018d11.f15242b);
            }
            C2016b c2016b3 = this.f15414v;
            if (c2016b3 != null) {
                c2016b3.k(this.f15395c.D("RuntimeVisibleTypeAnnotations"), c2018d);
            }
            C2016b c2016b4 = this.f15415w;
            if (c2016b4 != null) {
                c2016b4.k(this.f15395c.D("RuntimeInvisibleTypeAnnotations"), c2018d);
            }
            C2017c c2017c3 = this.f15416x;
            if (c2017c3 != null) {
                C2012C c2012c3 = this.f15395c;
                C2018d c2018d12 = this.f15403k;
                c2017c3.h(c2012c3, c2018d12.f15241a, c2018d12.f15242b, this.f15401i, this.f15402j, c2018d);
            }
        }
        if (this.f15417y > 0) {
            c2018d.k(this.f15395c.D("Exceptions")).i((this.f15417y * 2) + 2).k(this.f15417y);
            for (int i14 : this.f15418z) {
                c2018d.k(i14);
            }
        }
        C2017c.f(this.f15395c, this.f15396d, this.f15367A, c2018d);
        C2016b.l(this.f15395c, this.f15368B, this.f15369C, this.f15374H, this.f15375I, c2018d);
        if (this.f15371E != null) {
            int D8 = this.f15395c.D("RuntimeVisibleParameterAnnotations");
            C2016b[] c2016bArr = this.f15371E;
            int i15 = this.f15370D;
            if (i15 == 0) {
                i15 = c2016bArr.length;
            }
            C2016b.m(D8, c2016bArr, i15, c2018d);
        }
        if (this.f15373G != null) {
            int D9 = this.f15395c.D("RuntimeInvisibleParameterAnnotations");
            C2016b[] c2016bArr2 = this.f15373G;
            int i16 = this.f15372F;
            if (i16 == 0) {
                i16 = c2016bArr2.length;
            }
            C2016b.m(D9, c2016bArr2, i16, c2018d);
        }
        if (this.f15376J != null) {
            C2018d i17 = c2018d.k(this.f15395c.D("AnnotationDefault")).i(this.f15376J.f15242b);
            C2018d c2018d13 = this.f15376J;
            i17.h(c2018d13.f15241a, 0, c2018d13.f15242b);
        }
        if (this.f15378L != null) {
            C2018d g8 = c2018d.k(this.f15395c.D("MethodParameters")).i(this.f15378L.f15242b + 1).g(this.f15377K);
            C2018d c2018d14 = this.f15378L;
            g8.h(c2018d14.f15241a, 0, c2018d14.f15242b);
        }
        C2017c c2017c4 = this.f15379M;
        if (c2017c4 != null) {
            c2017c4.g(this.f15395c, c2018d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void S(int i8, int i9) {
        this.f15393a0 = i8 + 6;
        this.f15394b0 = i9 - 6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void T(int i8, int i9) {
        this.f15389W[i8] = i9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void U() {
        if (this.f15388V != null) {
            if (this.f15413u == null) {
                this.f15413u = new C2018d();
            }
            P();
            this.f15412t++;
        }
        this.f15388V = this.f15389W;
        this.f15389W = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int V(int i8, int i9, int i10) {
        int i11 = i9 + 3 + i10;
        int[] iArr = this.f15389W;
        if (iArr == null || iArr.length < i11) {
            this.f15389W = new int[i11];
        }
        int[] iArr2 = this.f15389W;
        iArr2[0] = i8;
        iArr2[1] = i9;
        iArr2[2] = i10;
        return 3;
    }

    @Override // c2.u
    public void a(int i8, boolean z8) {
        if (z8) {
            this.f15370D = i8;
        } else {
            this.f15372F = i8;
        }
    }

    @Override // c2.u
    public AbstractC2015a b(String str, boolean z8) {
        if (z8) {
            C2016b j8 = C2016b.j(this.f15395c, str, this.f15368B);
            this.f15368B = j8;
            return j8;
        }
        C2016b j9 = C2016b.j(this.f15395c, str, this.f15369C);
        this.f15369C = j9;
        return j9;
    }

    @Override // c2.u
    public AbstractC2015a c() {
        C2018d c2018d = new C2018d();
        this.f15376J = c2018d;
        return new C2016b(this.f15395c, false, c2018d, null);
    }

    @Override // c2.u
    public void d(C2017c c2017c) {
        if (c2017c.e()) {
            c2017c.f15238c = this.f15416x;
            this.f15416x = c2017c;
        } else {
            c2017c.f15238c = this.f15379M;
            this.f15379M = c2017c;
        }
    }

    @Override // c2.u
    public void g(int i8, String str, String str2, String str3) {
        int i9;
        int i10;
        this.f15392Z = this.f15403k.f15242b;
        AbstractC2011B j8 = this.f15395c.j(str, str2, str3);
        this.f15403k.e(i8, j8.f15191a);
        s sVar = this.f15383Q;
        if (sVar != null) {
            int i11 = this.f15380N;
            int i12 = 0;
            if (i11 != 4 && i11 != 3) {
                char charAt = str3.charAt(0);
                int i13 = -2;
                int i14 = 1;
                switch (i8) {
                    case 178:
                        int i15 = this.f15384R;
                        if (charAt == 'D' || charAt == 'J') {
                            i14 = 2;
                        }
                        i9 = i15 + i14;
                        break;
                    case 179:
                        i10 = this.f15384R;
                        if (charAt != 'D' && charAt != 'J') {
                            i13 = -1;
                        }
                        i9 = i10 + i13;
                        break;
                    case SubsamplingScaleImageView.ORIENTATION_180 /* 180 */:
                        int i16 = this.f15384R;
                        if (charAt == 'D' || charAt == 'J') {
                            i12 = 1;
                        }
                        i9 = i16 + i12;
                        break;
                    default:
                        i10 = this.f15384R;
                        if (charAt == 'D' || charAt == 'J') {
                            i13 = -3;
                        }
                        i9 = i10 + i13;
                        break;
                }
                if (i9 > this.f15385S) {
                    this.f15385S = i9;
                }
                this.f15384R = i9;
                return;
            }
            sVar.f15356j.d(i8, 0, j8, this.f15395c);
        }
    }

    @Override // c2.u
    public void h(int i8, int i9, Object[] objArr, int i10, Object[] objArr2) {
        int i11;
        int i12 = this.f15380N;
        if (i12 == 4) {
            return;
        }
        if (i12 == 3) {
            s sVar = this.f15383Q;
            p pVar = sVar.f15356j;
            if (pVar == null) {
                sVar.f15356j = new l(sVar);
                this.f15383Q.f15356j.u(this.f15395c, this.f15396d, this.f15400h, i9);
                this.f15383Q.f15356j.a(this);
            } else {
                if (i8 == -1) {
                    pVar.t(this.f15395c, i9, objArr, i10, objArr2);
                }
                this.f15383Q.f15356j.a(this);
            }
        } else if (i8 == -1) {
            if (this.f15388V == null) {
                int c8 = C2013D.c(this.f15400h) >> 2;
                p pVar2 = new p(new s());
                pVar2.u(this.f15395c, this.f15396d, this.f15400h, c8);
                pVar2.a(this);
            }
            this.f15386T = i9;
            int V8 = V(this.f15403k.f15242b, i9, i10);
            int i13 = 0;
            while (i13 < i9) {
                this.f15389W[V8] = p.e(this.f15395c, objArr[i13]);
                i13++;
                V8++;
            }
            int i14 = 0;
            while (i14 < i10) {
                this.f15389W[V8] = p.e(this.f15395c, objArr2[i14]);
                i14++;
                V8++;
            }
            U();
        } else if (this.f15395c.R() >= 50) {
            if (this.f15413u == null) {
                this.f15413u = new C2018d();
                i11 = this.f15403k.f15242b;
            } else {
                i11 = (this.f15403k.f15242b - this.f15387U) - 1;
                if (i11 < 0) {
                    if (i8 == 3) {
                        return;
                    } else {
                        throw new IllegalStateException();
                    }
                }
            }
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 != 3) {
                            if (i8 == 4) {
                                if (i11 < 64) {
                                    this.f15413u.g(i11 + 64);
                                } else {
                                    this.f15413u.g(247).k(i11);
                                }
                                Q(objArr2[0]);
                            } else {
                                throw new IllegalArgumentException();
                            }
                        } else if (i11 < 64) {
                            this.f15413u.g(i11);
                        } else {
                            this.f15413u.g(251).k(i11);
                        }
                    } else {
                        this.f15386T -= i9;
                        this.f15413u.g(251 - i9).k(i11);
                    }
                } else {
                    this.f15386T += i9;
                    this.f15413u.g(i9 + 251).k(i11);
                    for (int i15 = 0; i15 < i9; i15++) {
                        Q(objArr[i15]);
                    }
                }
            } else {
                this.f15386T = i9;
                this.f15413u.g(255).k(i11).k(i9);
                for (int i16 = 0; i16 < i9; i16++) {
                    Q(objArr[i16]);
                }
                this.f15413u.k(i10);
                for (int i17 = 0; i17 < i10; i17++) {
                    Q(objArr2[i17]);
                }
            }
            this.f15387U = this.f15403k.f15242b;
            this.f15412t++;
        } else {
            throw new IllegalArgumentException("Class versions V1_5 or less must use F_NEW frames.");
        }
        if (this.f15380N == 2) {
            this.f15384R = i10;
            for (int i18 = 0; i18 < i10; i18++) {
                Object obj = objArr2[i18];
                if (obj == y.f15442e || obj == y.f15441d) {
                    this.f15384R++;
                }
            }
            int i19 = this.f15384R;
            if (i19 > this.f15385S) {
                this.f15385S = i19;
            }
        }
        this.f15401i = Math.max(this.f15401i, i10);
        this.f15402j = Math.max(this.f15402j, this.f15386T);
    }

    @Override // c2.u
    public void i(int i8, int i9) {
        int i10;
        int i11;
        C2018d c2018d = this.f15403k;
        this.f15392Z = c2018d.f15242b;
        if (i8 <= 255 && i9 <= 127 && i9 >= -128) {
            c2018d.g(132).c(i8, i9);
        } else {
            c2018d.g(196).e(132, i8).k(i9);
        }
        s sVar = this.f15383Q;
        if (sVar != null && ((i11 = this.f15380N) == 4 || i11 == 3)) {
            sVar.f15356j.d(132, i8, null, null);
        }
        if (this.f15380N != 0 && (i10 = i8 + 1) > this.f15402j) {
            this.f15402j = i10;
        }
    }

    @Override // c2.u
    public void j(int i8) {
        C2018d c2018d = this.f15403k;
        this.f15392Z = c2018d.f15242b;
        c2018d.g(i8);
        s sVar = this.f15383Q;
        if (sVar != null) {
            int i9 = this.f15380N;
            if (i9 != 4 && i9 != 3) {
                int i10 = this.f15384R + f15366c0[i8];
                if (i10 > this.f15385S) {
                    this.f15385S = i10;
                }
                this.f15384R = i10;
            } else {
                sVar.f15356j.d(i8, 0, null, null);
            }
            if ((i8 >= 172 && i8 <= 177) || i8 == 191) {
                L();
            }
        }
    }

    @Override // c2.u
    public AbstractC2015a k(int i8, C2014E c2014e, String str, boolean z8) {
        if (z8) {
            C2016b i9 = C2016b.i(this.f15395c, (i8 & (-16776961)) | (this.f15392Z << 8), c2014e, str, this.f15414v);
            this.f15414v = i9;
            return i9;
        }
        C2016b i10 = C2016b.i(this.f15395c, (i8 & (-16776961)) | (this.f15392Z << 8), c2014e, str, this.f15415w);
        this.f15415w = i10;
        return i10;
    }

    @Override // c2.u
    public void l(int i8, int i9) {
        C2018d c2018d = this.f15403k;
        this.f15392Z = c2018d.f15242b;
        if (i8 == 17) {
            c2018d.e(i8, i9);
        } else {
            c2018d.c(i8, i9);
        }
        s sVar = this.f15383Q;
        if (sVar != null) {
            int i10 = this.f15380N;
            if (i10 != 4 && i10 != 3) {
                if (i8 != 188) {
                    int i11 = this.f15384R + 1;
                    if (i11 > this.f15385S) {
                        this.f15385S = i11;
                    }
                    this.f15384R = i11;
                    return;
                }
                return;
            }
            sVar.f15356j.d(i8, i9, null, null);
        }
    }

    @Override // c2.u
    public void m(String str, String str2, q qVar, Object... objArr) {
        this.f15392Z = this.f15403k.f15242b;
        AbstractC2011B o8 = this.f15395c.o(str, str2, qVar, objArr);
        this.f15403k.e(186, o8.f15191a);
        this.f15403k.k(0);
        s sVar = this.f15383Q;
        if (sVar != null) {
            int i8 = this.f15380N;
            if (i8 != 4 && i8 != 3) {
                int a9 = o8.a();
                int i9 = this.f15384R + ((a9 & 3) - (a9 >> 2)) + 1;
                if (i9 > this.f15385S) {
                    this.f15385S = i9;
                }
                this.f15384R = i9;
                return;
            }
            sVar.f15356j.d(186, 0, o8, this.f15395c);
        }
    }

    @Override // c2.u
    public void n(int i8, s sVar) {
        int i9;
        boolean z8;
        int i10;
        C2018d c2018d = this.f15403k;
        int i11 = c2018d.f15242b;
        this.f15392Z = i11;
        if (i8 >= 200) {
            i9 = i8 - 33;
        } else {
            i9 = i8;
        }
        if ((sVar.f15347a & 4) != 0 && sVar.f15350d - i11 < -32768) {
            if (i9 == 167) {
                c2018d.g(200);
            } else if (i9 == 168) {
                c2018d.g(ComposerKt.providerKey);
            } else {
                if (i9 >= 198) {
                    i10 = i9 ^ 1;
                } else {
                    i10 = ((i9 + 1) ^ 1) - 1;
                }
                c2018d.g(i10);
                this.f15403k.k(8);
                this.f15403k.g(220);
                this.f15391Y = true;
                z8 = true;
                C2018d c2018d2 = this.f15403k;
                sVar.h(c2018d2, c2018d2.f15242b - 1, true);
            }
            z8 = false;
            C2018d c2018d22 = this.f15403k;
            sVar.h(c2018d22, c2018d22.f15242b - 1, true);
        } else {
            if (i9 != i8) {
                c2018d.g(i8);
                C2018d c2018d3 = this.f15403k;
                sVar.h(c2018d3, c2018d3.f15242b - 1, true);
            } else {
                c2018d.g(i9);
                C2018d c2018d4 = this.f15403k;
                sVar.h(c2018d4, c2018d4.f15242b - 1, false);
            }
            z8 = false;
        }
        s sVar2 = this.f15383Q;
        if (sVar2 != null) {
            int i12 = this.f15380N;
            s sVar3 = null;
            if (i12 == 4) {
                sVar2.f15356j.d(i9, 0, null, null);
                s e8 = sVar.e();
                e8.f15347a = (short) (e8.f15347a | 2);
                F(0, sVar);
                if (i9 != 167) {
                    sVar3 = new s();
                }
            } else if (i12 == 3) {
                sVar2.f15356j.d(i9, 0, null, null);
            } else if (i12 == 2) {
                this.f15384R += f15366c0[i9];
            } else if (i9 == 168) {
                short s8 = sVar.f15347a;
                if ((s8 & 32) == 0) {
                    sVar.f15347a = (short) (s8 | 32);
                    this.f15390X = true;
                }
                sVar2.f15347a = (short) (sVar2.f15347a | 16);
                F(this.f15384R + 1, sVar);
                sVar3 = new s();
            } else {
                int i13 = this.f15384R + f15366c0[i9];
                this.f15384R = i13;
                F(i13, sVar);
            }
            if (sVar3 != null) {
                if (z8) {
                    sVar3.f15347a = (short) (sVar3.f15347a | 2);
                }
                o(sVar3);
            }
            if (i9 == 167) {
                L();
            }
        }
    }

    @Override // c2.u
    public void o(s sVar) {
        boolean z8 = this.f15391Y;
        C2018d c2018d = this.f15403k;
        this.f15391Y = z8 | sVar.i(c2018d.f15241a, c2018d.f15242b);
        short s8 = sVar.f15347a;
        if ((s8 & 1) != 0) {
            return;
        }
        int i8 = this.f15380N;
        if (i8 == 4) {
            s sVar2 = this.f15383Q;
            if (sVar2 != null) {
                if (sVar.f15350d == sVar2.f15350d) {
                    sVar2.f15347a = (short) ((s8 & 2) | sVar2.f15347a);
                    sVar.f15356j = sVar2.f15356j;
                    return;
                }
                F(0, sVar);
            }
            s sVar3 = this.f15382P;
            if (sVar3 != null) {
                if (sVar.f15350d == sVar3.f15350d) {
                    sVar3.f15347a = (short) (sVar3.f15347a | (sVar.f15347a & 2));
                    sVar.f15356j = sVar3.f15356j;
                    this.f15383Q = sVar3;
                    return;
                }
                sVar3.f15357k = sVar;
            }
            this.f15382P = sVar;
            this.f15383Q = sVar;
            sVar.f15356j = new p(sVar);
            return;
        }
        if (i8 == 3) {
            s sVar4 = this.f15383Q;
            if (sVar4 == null) {
                this.f15383Q = sVar;
                return;
            } else {
                sVar4.f15356j.f15326a = sVar;
                return;
            }
        }
        if (i8 == 1) {
            s sVar5 = this.f15383Q;
            if (sVar5 != null) {
                sVar5.f15354h = (short) this.f15385S;
                F(this.f15384R, sVar);
            }
            this.f15383Q = sVar;
            this.f15384R = 0;
            this.f15385S = 0;
            s sVar6 = this.f15382P;
            if (sVar6 != null) {
                sVar6.f15357k = sVar;
            }
            this.f15382P = sVar;
            return;
        }
        if (i8 == 2 && this.f15383Q == null) {
            this.f15383Q = sVar;
        }
    }

    @Override // c2.u
    public void p(Object obj) {
        boolean z8;
        char charAt;
        this.f15392Z = this.f15403k.f15242b;
        AbstractC2011B d8 = this.f15395c.d(obj);
        int i8 = d8.f15191a;
        int i9 = d8.f15192b;
        int i10 = 1;
        if (i9 != 5 && i9 != 6 && (i9 != 17 || ((charAt = d8.f15195e.charAt(0)) != 'J' && charAt != 'D'))) {
            z8 = false;
        } else {
            z8 = true;
        }
        if (z8) {
            this.f15403k.e(20, i8);
        } else if (i8 >= 256) {
            this.f15403k.e(19, i8);
        } else {
            this.f15403k.c(18, i8);
        }
        s sVar = this.f15383Q;
        if (sVar != null) {
            int i11 = this.f15380N;
            if (i11 != 4 && i11 != 3) {
                int i12 = this.f15384R;
                if (z8) {
                    i10 = 2;
                }
                int i13 = i12 + i10;
                if (i13 > this.f15385S) {
                    this.f15385S = i13;
                }
                this.f15384R = i13;
                return;
            }
            sVar.f15356j.d(18, 0, d8, this.f15395c);
        }
    }

    @Override // c2.u
    public void q(int i8, s sVar) {
        if (this.f15407o == null) {
            this.f15407o = new C2018d();
        }
        this.f15406n++;
        this.f15407o.k(sVar.f15350d);
        this.f15407o.k(i8);
    }

    @Override // c2.u
    public void r(String str, String str2, String str3, s sVar, s sVar2, int i8) {
        int i9 = 1;
        if (str3 != null) {
            if (this.f15411s == null) {
                this.f15411s = new C2018d();
            }
            this.f15410r++;
            this.f15411s.k(sVar.f15350d).k(sVar2.f15350d - sVar.f15350d).k(this.f15395c.D(str)).k(this.f15395c.D(str3)).k(i8);
        }
        if (this.f15409q == null) {
            this.f15409q = new C2018d();
        }
        this.f15408p++;
        this.f15409q.k(sVar.f15350d).k(sVar2.f15350d - sVar.f15350d).k(this.f15395c.D(str)).k(this.f15395c.D(str2)).k(i8);
        if (this.f15380N != 0) {
            char charAt = str2.charAt(0);
            if (charAt == 'J' || charAt == 'D') {
                i9 = 2;
            }
            int i10 = i8 + i9;
            if (i10 > this.f15402j) {
                this.f15402j = i10;
            }
        }
    }

    @Override // c2.u
    public AbstractC2015a s(int i8, C2014E c2014e, s[] sVarArr, s[] sVarArr2, int[] iArr, String str, boolean z8) {
        C2018d c2018d = new C2018d();
        c2018d.g(i8 >>> 24).k(sVarArr.length);
        for (int i9 = 0; i9 < sVarArr.length; i9++) {
            c2018d.k(sVarArr[i9].f15350d).k(sVarArr2[i9].f15350d - sVarArr[i9].f15350d).k(iArr[i9]);
        }
        C2014E.d(c2014e, c2018d);
        c2018d.k(this.f15395c.D(str)).k(0);
        if (z8) {
            C2016b c2016b = new C2016b(this.f15395c, true, c2018d, this.f15414v);
            this.f15414v = c2016b;
            return c2016b;
        }
        C2016b c2016b2 = new C2016b(this.f15395c, true, c2018d, this.f15415w);
        this.f15415w = c2016b2;
        return c2016b2;
    }

    @Override // c2.u
    public void t(s sVar, int[] iArr, s[] sVarArr) {
        C2018d c2018d = this.f15403k;
        this.f15392Z = c2018d.f15242b;
        c2018d.g(171).h(null, 0, (4 - (this.f15403k.f15242b % 4)) % 4);
        sVar.h(this.f15403k, this.f15392Z, true);
        this.f15403k.i(sVarArr.length);
        for (int i8 = 0; i8 < sVarArr.length; i8++) {
            this.f15403k.i(iArr[i8]);
            sVarArr[i8].h(this.f15403k, this.f15392Z, true);
        }
        W(sVar, sVarArr);
    }

    @Override // c2.u
    public void u(int i8, int i9) {
        int i10 = this.f15380N;
        if (i10 == 4) {
            I();
            return;
        }
        if (i10 == 1) {
            J();
        } else if (i10 == 2) {
            this.f15401i = this.f15385S;
        } else {
            this.f15401i = i8;
            this.f15402j = i9;
        }
    }

    @Override // c2.u
    public void v(int i8, String str, String str2, String str3, boolean z8) {
        int i9;
        this.f15392Z = this.f15403k.f15242b;
        AbstractC2011B x8 = this.f15395c.x(str, str2, str3, z8);
        if (i8 == 185) {
            this.f15403k.e(185, x8.f15191a).c(x8.a() >> 2, 0);
        } else {
            this.f15403k.e(i8, x8.f15191a);
        }
        s sVar = this.f15383Q;
        if (sVar != null) {
            int i10 = this.f15380N;
            if (i10 != 4 && i10 != 3) {
                int a9 = x8.a();
                int i11 = (a9 & 3) - (a9 >> 2);
                if (i8 == 184) {
                    i9 = this.f15384R + i11 + 1;
                } else {
                    i9 = this.f15384R + i11;
                }
                if (i9 > this.f15385S) {
                    this.f15385S = i9;
                }
                this.f15384R = i9;
                return;
            }
            sVar.f15356j.d(i8, 0, x8, this.f15395c);
        }
    }

    @Override // c2.u
    public void w(String str, int i8) {
        this.f15392Z = this.f15403k.f15242b;
        AbstractC2011B e8 = this.f15395c.e(str);
        this.f15403k.e(197, e8.f15191a).g(i8);
        s sVar = this.f15383Q;
        if (sVar != null) {
            int i9 = this.f15380N;
            if (i9 != 4 && i9 != 3) {
                this.f15384R += 1 - i8;
            } else {
                sVar.f15356j.d(197, i8, e8, this.f15395c);
            }
        }
    }

    @Override // c2.u
    public void x(String str, int i8) {
        int D8;
        if (this.f15378L == null) {
            this.f15378L = new C2018d();
        }
        this.f15377K++;
        C2018d c2018d = this.f15378L;
        if (str == null) {
            D8 = 0;
        } else {
            D8 = this.f15395c.D(str);
        }
        c2018d.k(D8).k(i8);
    }

    @Override // c2.u
    public AbstractC2015a y(int i8, String str, boolean z8) {
        if (z8) {
            if (this.f15371E == null) {
                this.f15371E = new C2016b[C2013D.b(this.f15400h).length];
            }
            C2016b[] c2016bArr = this.f15371E;
            C2016b j8 = C2016b.j(this.f15395c, str, c2016bArr[i8]);
            c2016bArr[i8] = j8;
            return j8;
        }
        if (this.f15373G == null) {
            this.f15373G = new C2016b[C2013D.b(this.f15400h).length];
        }
        C2016b[] c2016bArr2 = this.f15373G;
        C2016b j9 = C2016b.j(this.f15395c, str, c2016bArr2[i8]);
        c2016bArr2[i8] = j9;
        return j9;
    }

    @Override // c2.u
    public void z(int i8, int i9, s sVar, s... sVarArr) {
        C2018d c2018d = this.f15403k;
        this.f15392Z = c2018d.f15242b;
        c2018d.g(170).h(null, 0, (4 - (this.f15403k.f15242b % 4)) % 4);
        sVar.h(this.f15403k, this.f15392Z, true);
        this.f15403k.i(i8).i(i9);
        for (s sVar2 : sVarArr) {
            sVar2.h(this.f15403k, this.f15392Z, true);
        }
        W(sVar, sVarArr);
    }

    @Override // c2.u
    public void e() {
    }

    @Override // c2.u
    public void f() {
    }
}
