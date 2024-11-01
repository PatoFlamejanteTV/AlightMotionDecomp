package c2;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class x extends w {

    /* renamed from: c, reason: collision with root package name */
    private final C2012C f15421c;

    /* renamed from: d, reason: collision with root package name */
    private final int f15422d;

    /* renamed from: e, reason: collision with root package name */
    private final int f15423e;

    /* renamed from: f, reason: collision with root package name */
    private final int f15424f;

    /* renamed from: g, reason: collision with root package name */
    private int f15425g;

    /* renamed from: h, reason: collision with root package name */
    private final C2018d f15426h;

    /* renamed from: i, reason: collision with root package name */
    private int f15427i;

    /* renamed from: j, reason: collision with root package name */
    private final C2018d f15428j;

    /* renamed from: k, reason: collision with root package name */
    private int f15429k;

    /* renamed from: l, reason: collision with root package name */
    private final C2018d f15430l;

    /* renamed from: m, reason: collision with root package name */
    private int f15431m;

    /* renamed from: n, reason: collision with root package name */
    private final C2018d f15432n;

    /* renamed from: o, reason: collision with root package name */
    private int f15433o;

    /* renamed from: p, reason: collision with root package name */
    private final C2018d f15434p;

    /* renamed from: q, reason: collision with root package name */
    private int f15435q;

    /* renamed from: r, reason: collision with root package name */
    private final C2018d f15436r;

    /* renamed from: s, reason: collision with root package name */
    private int f15437s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(C2012C c2012c, int i8, int i9, int i10) {
        super(589824);
        this.f15421c = c2012c;
        this.f15422d = i8;
        this.f15423e = i9;
        this.f15424f = i10;
        this.f15426h = new C2018d();
        this.f15428j = new C2018d();
        this.f15430l = new C2018d();
        this.f15432n = new C2018d();
        this.f15434p = new C2018d();
        this.f15436r = new C2018d();
    }

    @Override // c2.w
    public void b(String str, int i8, String... strArr) {
        this.f15428j.k(this.f15421c.B(str).f15191a).k(i8);
        if (strArr == null) {
            this.f15428j.k(0);
        } else {
            this.f15428j.k(strArr.length);
            for (String str2 : strArr) {
                this.f15428j.k(this.f15421c.y(str2).f15191a);
            }
        }
        this.f15427i++;
    }

    @Override // c2.w
    public void c(String str) {
        this.f15437s = this.f15421c.e(str).f15191a;
    }

    @Override // c2.w
    public void d(String str, int i8, String... strArr) {
        this.f15430l.k(this.f15421c.B(str).f15191a).k(i8);
        if (strArr == null) {
            this.f15430l.k(0);
        } else {
            this.f15430l.k(strArr.length);
            for (String str2 : strArr) {
                this.f15430l.k(this.f15421c.y(str2).f15191a);
            }
        }
        this.f15429k++;
    }

    @Override // c2.w
    public void e(String str) {
        this.f15436r.k(this.f15421c.B(str).f15191a);
        this.f15435q++;
    }

    @Override // c2.w
    public void f(String str, String... strArr) {
        this.f15434p.k(this.f15421c.e(str).f15191a);
        this.f15434p.k(strArr.length);
        for (String str2 : strArr) {
            this.f15434p.k(this.f15421c.e(str2).f15191a);
        }
        this.f15433o++;
    }

    @Override // c2.w
    public void g(String str, int i8, String str2) {
        int D8;
        C2018d k8 = this.f15426h.k(this.f15421c.y(str).f15191a).k(i8);
        if (str2 == null) {
            D8 = 0;
        } else {
            D8 = this.f15421c.D(str2);
        }
        k8.k(D8);
        this.f15425g++;
    }

    @Override // c2.w
    public void h(String str) {
        this.f15432n.k(this.f15421c.e(str).f15191a);
        this.f15431m++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int i() {
        this.f15421c.D("Module");
        int i8 = this.f15426h.f15242b + 22 + this.f15428j.f15242b + this.f15430l.f15242b + this.f15432n.f15242b + this.f15434p.f15242b;
        if (this.f15435q > 0) {
            this.f15421c.D("ModulePackages");
            i8 += this.f15436r.f15242b + 8;
        }
        if (this.f15437s > 0) {
            this.f15421c.D("ModuleMainClass");
            return i8 + 8;
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j() {
        int i8;
        int i9 = 0;
        if (this.f15435q > 0) {
            i8 = 1;
        } else {
            i8 = 0;
        }
        int i10 = i8 + 1;
        if (this.f15437s > 0) {
            i9 = 1;
        }
        return i10 + i9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(C2018d c2018d) {
        C2018d k8 = c2018d.k(this.f15421c.D("Module")).i(this.f15426h.f15242b + 16 + this.f15428j.f15242b + this.f15430l.f15242b + this.f15432n.f15242b + this.f15434p.f15242b).k(this.f15422d).k(this.f15423e).k(this.f15424f).k(this.f15425g);
        C2018d c2018d2 = this.f15426h;
        C2018d k9 = k8.h(c2018d2.f15241a, 0, c2018d2.f15242b).k(this.f15427i);
        C2018d c2018d3 = this.f15428j;
        C2018d k10 = k9.h(c2018d3.f15241a, 0, c2018d3.f15242b).k(this.f15429k);
        C2018d c2018d4 = this.f15430l;
        C2018d k11 = k10.h(c2018d4.f15241a, 0, c2018d4.f15242b).k(this.f15431m);
        C2018d c2018d5 = this.f15432n;
        C2018d k12 = k11.h(c2018d5.f15241a, 0, c2018d5.f15242b).k(this.f15433o);
        C2018d c2018d6 = this.f15434p;
        k12.h(c2018d6.f15241a, 0, c2018d6.f15242b);
        if (this.f15435q > 0) {
            C2018d k13 = c2018d.k(this.f15421c.D("ModulePackages")).i(this.f15436r.f15242b + 2).k(this.f15435q);
            C2018d c2018d7 = this.f15436r;
            k13.h(c2018d7.f15241a, 0, c2018d7.f15242b);
        }
        if (this.f15437s > 0) {
            c2018d.k(this.f15421c.D("ModuleMainClass")).i(2).k(this.f15437s);
        }
    }

    @Override // c2.w
    public void a() {
    }
}
