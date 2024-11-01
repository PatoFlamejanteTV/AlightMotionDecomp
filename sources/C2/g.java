package c2;

/* loaded from: classes4.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    protected final int f15253a;

    /* renamed from: b, reason: collision with root package name */
    protected g f15254b;

    public g(int i8) {
        this(i8, null);
    }

    public abstract void a(int i8, int i9, String str, String str2, String str3, String[] strArr);

    public abstract AbstractC2015a b(String str, boolean z8);

    public abstract void c(C2017c c2017c);

    public abstract void d();

    public abstract n e(int i8, String str, String str2, String str3, Object obj);

    public abstract void f(String str, String str2, String str3, int i8);

    public abstract u g(int i8, String str, String str2, String str3, String[] strArr);

    public abstract w h(String str, int i8, String str2);

    public abstract void i(String str);

    public abstract void j(String str);

    public abstract void k(String str, String str2, String str3);

    public abstract void l(String str);

    public abstract z m(String str, String str2, String str3);

    public abstract void n(String str, String str2);

    public abstract AbstractC2015a o(int i8, C2014E c2014e, String str, boolean z8);

    public g(int i8, g gVar) {
        if (i8 != 589824 && i8 != 524288 && i8 != 458752 && i8 != 393216 && i8 != 327680 && i8 != 262144 && i8 != 17432576) {
            throw new IllegalArgumentException("Unsupported api " + i8);
        }
        if (i8 == 17432576) {
            j.a(this);
        }
        this.f15253a = i8;
        this.f15254b = gVar;
    }
}
