package c2;

/* loaded from: classes4.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    protected final int f15419a;

    /* renamed from: b, reason: collision with root package name */
    protected w f15420b;

    public w(int i8) {
        this(i8, null);
    }

    public abstract void a();

    public abstract void b(String str, int i8, String... strArr);

    public abstract void c(String str);

    public abstract void d(String str, int i8, String... strArr);

    public abstract void e(String str);

    public abstract void f(String str, String... strArr);

    public abstract void g(String str, int i8, String str2);

    public abstract void h(String str);

    public w(int i8, w wVar) {
        if (i8 != 589824 && i8 != 524288 && i8 != 458752 && i8 != 393216 && i8 != 327680 && i8 != 262144 && i8 != 17432576) {
            throw new IllegalArgumentException("Unsupported api " + i8);
        }
        if (i8 == 17432576) {
            j.a(this);
        }
        this.f15419a = i8;
        this.f15420b = wVar;
    }
}
