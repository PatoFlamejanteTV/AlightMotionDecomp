package c2;

import c2.C2017c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class o extends n {

    /* renamed from: c, reason: collision with root package name */
    private final C2012C f15315c;

    /* renamed from: d, reason: collision with root package name */
    private final int f15316d;

    /* renamed from: e, reason: collision with root package name */
    private final int f15317e;

    /* renamed from: f, reason: collision with root package name */
    private final int f15318f;

    /* renamed from: g, reason: collision with root package name */
    private int f15319g;

    /* renamed from: h, reason: collision with root package name */
    private int f15320h;

    /* renamed from: i, reason: collision with root package name */
    private C2016b f15321i;

    /* renamed from: j, reason: collision with root package name */
    private C2016b f15322j;

    /* renamed from: k, reason: collision with root package name */
    private C2016b f15323k;

    /* renamed from: l, reason: collision with root package name */
    private C2016b f15324l;

    /* renamed from: m, reason: collision with root package name */
    private C2017c f15325m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(C2012C c2012c, int i8, String str, String str2, String str3, Object obj) {
        super(589824);
        this.f15315c = c2012c;
        this.f15316d = i8;
        this.f15317e = c2012c.D(str);
        this.f15318f = c2012c.D(str2);
        if (str3 != null) {
            this.f15319g = c2012c.D(str3);
        }
        if (obj != null) {
            this.f15320h = c2012c.d(obj).f15191a;
        }
    }

    @Override // c2.n
    public AbstractC2015a a(String str, boolean z8) {
        if (z8) {
            C2016b j8 = C2016b.j(this.f15315c, str, this.f15321i);
            this.f15321i = j8;
            return j8;
        }
        C2016b j9 = C2016b.j(this.f15315c, str, this.f15322j);
        this.f15322j = j9;
        return j9;
    }

    @Override // c2.n
    public void b(C2017c c2017c) {
        c2017c.f15238c = this.f15325m;
        this.f15325m = c2017c;
    }

    @Override // c2.n
    public AbstractC2015a d(int i8, C2014E c2014e, String str, boolean z8) {
        if (z8) {
            C2016b i9 = C2016b.i(this.f15315c, i8, c2014e, str, this.f15323k);
            this.f15323k = i9;
            return i9;
        }
        C2016b i10 = C2016b.i(this.f15315c, i8, c2014e, str, this.f15324l);
        this.f15324l = i10;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(C2017c.a aVar) {
        aVar.b(this.f15325m);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        int i8;
        if (this.f15320h != 0) {
            this.f15315c.D("ConstantValue");
            i8 = 16;
        } else {
            i8 = 8;
        }
        int b9 = i8 + C2017c.b(this.f15315c, this.f15316d, this.f15319g) + C2016b.f(this.f15321i, this.f15322j, this.f15323k, this.f15324l);
        C2017c c2017c = this.f15325m;
        if (c2017c != null) {
            return b9 + c2017c.a(this.f15315c);
        }
        return b9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(C2018d c2018d) {
        boolean z8;
        int i8;
        int i9 = 0;
        if (this.f15315c.R() < 49) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            i8 = 4096;
        } else {
            i8 = 0;
        }
        c2018d.k((~i8) & this.f15316d).k(this.f15317e).k(this.f15318f);
        if (this.f15320h != 0) {
            i9 = 1;
        }
        int i10 = this.f15316d;
        if ((i10 & 4096) != 0 && z8) {
            i9++;
        }
        if (this.f15319g != 0) {
            i9++;
        }
        if ((131072 & i10) != 0) {
            i9++;
        }
        if (this.f15321i != null) {
            i9++;
        }
        if (this.f15322j != null) {
            i9++;
        }
        if (this.f15323k != null) {
            i9++;
        }
        if (this.f15324l != null) {
            i9++;
        }
        C2017c c2017c = this.f15325m;
        if (c2017c != null) {
            i9 += c2017c.d();
        }
        c2018d.k(i9);
        if (this.f15320h != 0) {
            c2018d.k(this.f15315c.D("ConstantValue")).i(2).k(this.f15320h);
        }
        C2017c.f(this.f15315c, this.f15316d, this.f15319g, c2018d);
        C2016b.l(this.f15315c, this.f15321i, this.f15322j, this.f15323k, this.f15324l, c2018d);
        C2017c c2017c2 = this.f15325m;
        if (c2017c2 != null) {
            c2017c2.g(this.f15315c, c2018d);
        }
    }

    @Override // c2.n
    public void c() {
    }
}
