package c2;

/* loaded from: classes4.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    protected final int f15364a;

    /* renamed from: b, reason: collision with root package name */
    protected u f15365b;

    public u(int i8) {
        this(i8, null);
    }

    public abstract AbstractC2015a A(int i8, C2014E c2014e, String str, boolean z8);

    public abstract void B(s sVar, s sVar2, s sVar3, String str);

    public abstract AbstractC2015a C(int i8, C2014E c2014e, String str, boolean z8);

    public abstract void D(int i8, String str);

    public abstract void E(int i8, int i9);

    public abstract void a(int i8, boolean z8);

    public abstract AbstractC2015a b(String str, boolean z8);

    public abstract AbstractC2015a c();

    public abstract void d(C2017c c2017c);

    public abstract void e();

    public abstract void f();

    public abstract void g(int i8, String str, String str2, String str3);

    public abstract void h(int i8, int i9, Object[] objArr, int i10, Object[] objArr2);

    public abstract void i(int i8, int i9);

    public abstract void j(int i8);

    public abstract AbstractC2015a k(int i8, C2014E c2014e, String str, boolean z8);

    public abstract void l(int i8, int i9);

    public abstract void m(String str, String str2, q qVar, Object... objArr);

    public abstract void n(int i8, s sVar);

    public abstract void o(s sVar);

    public abstract void p(Object obj);

    public abstract void q(int i8, s sVar);

    public abstract void r(String str, String str2, String str3, s sVar, s sVar2, int i8);

    public abstract AbstractC2015a s(int i8, C2014E c2014e, s[] sVarArr, s[] sVarArr2, int[] iArr, String str, boolean z8);

    public abstract void t(s sVar, int[] iArr, s[] sVarArr);

    public abstract void u(int i8, int i9);

    public abstract void v(int i8, String str, String str2, String str3, boolean z8);

    public abstract void w(String str, int i8);

    public abstract void x(String str, int i8);

    public abstract AbstractC2015a y(int i8, String str, boolean z8);

    public abstract void z(int i8, int i9, s sVar, s... sVarArr);

    public u(int i8, u uVar) {
        if (i8 != 589824 && i8 != 524288 && i8 != 458752 && i8 != 393216 && i8 != 327680 && i8 != 262144 && i8 != 17432576) {
            throw new IllegalArgumentException("Unsupported api " + i8);
        }
        if (i8 == 17432576) {
            j.a(this);
        }
        this.f15364a = i8;
        this.f15365b = uVar;
    }
}
