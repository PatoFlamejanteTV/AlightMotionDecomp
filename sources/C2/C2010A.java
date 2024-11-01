package c2;

import c2.C2017c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: c2.A, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2010A extends z {

    /* renamed from: c, reason: collision with root package name */
    private final C2012C f15182c;

    /* renamed from: d, reason: collision with root package name */
    private final int f15183d;

    /* renamed from: e, reason: collision with root package name */
    private final int f15184e;

    /* renamed from: f, reason: collision with root package name */
    private int f15185f;

    /* renamed from: g, reason: collision with root package name */
    private C2016b f15186g;

    /* renamed from: h, reason: collision with root package name */
    private C2016b f15187h;

    /* renamed from: i, reason: collision with root package name */
    private C2016b f15188i;

    /* renamed from: j, reason: collision with root package name */
    private C2016b f15189j;

    /* renamed from: k, reason: collision with root package name */
    private C2017c f15190k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2010A(C2012C c2012c, String str, String str2, String str3) {
        super(589824);
        this.f15182c = c2012c;
        this.f15183d = c2012c.D(str);
        this.f15184e = c2012c.D(str2);
        if (str3 != null) {
            this.f15185f = c2012c.D(str3);
        }
    }

    @Override // c2.z
    public AbstractC2015a a(String str, boolean z8) {
        if (z8) {
            C2016b j8 = C2016b.j(this.f15182c, str, this.f15186g);
            this.f15186g = j8;
            return j8;
        }
        C2016b j9 = C2016b.j(this.f15182c, str, this.f15187h);
        this.f15187h = j9;
        return j9;
    }

    @Override // c2.z
    public void b(C2017c c2017c) {
        c2017c.f15238c = this.f15190k;
        this.f15190k = c2017c;
    }

    @Override // c2.z
    public AbstractC2015a d(int i8, C2014E c2014e, String str, boolean z8) {
        if (z8) {
            C2016b i9 = C2016b.i(this.f15182c, i8, c2014e, str, this.f15188i);
            this.f15188i = i9;
            return i9;
        }
        C2016b i10 = C2016b.i(this.f15182c, i8, c2014e, str, this.f15189j);
        this.f15189j = i10;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(C2017c.a aVar) {
        aVar.b(this.f15190k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        int b9 = C2017c.b(this.f15182c, 0, this.f15185f) + 6 + C2016b.f(this.f15186g, this.f15187h, this.f15188i, this.f15189j);
        C2017c c2017c = this.f15190k;
        if (c2017c != null) {
            return b9 + c2017c.a(this.f15182c);
        }
        return b9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(C2018d c2018d) {
        int i8;
        c2018d.k(this.f15183d).k(this.f15184e);
        if (this.f15185f != 0) {
            i8 = 1;
        } else {
            i8 = 0;
        }
        if (this.f15186g != null) {
            i8++;
        }
        if (this.f15187h != null) {
            i8++;
        }
        if (this.f15188i != null) {
            i8++;
        }
        if (this.f15189j != null) {
            i8++;
        }
        C2017c c2017c = this.f15190k;
        if (c2017c != null) {
            i8 += c2017c.d();
        }
        c2018d.k(i8);
        C2017c.f(this.f15182c, 0, this.f15185f, c2018d);
        C2016b.l(this.f15182c, this.f15186g, this.f15187h, this.f15188i, this.f15189j, c2018d);
        C2017c c2017c2 = this.f15190k;
        if (c2017c2 != null) {
            c2017c2.g(this.f15182c, c2018d);
        }
    }

    @Override // c2.z
    public void c() {
    }
}
