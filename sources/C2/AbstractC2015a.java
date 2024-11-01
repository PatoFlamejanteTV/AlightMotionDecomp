package c2;

/* renamed from: c2.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2015a {

    /* renamed from: a, reason: collision with root package name */
    protected final int f15227a;

    /* renamed from: b, reason: collision with root package name */
    protected AbstractC2015a f15228b;

    public AbstractC2015a(int i8) {
        this(i8, null);
    }

    public abstract void a(String str, Object obj);

    public abstract AbstractC2015a b(String str, String str2);

    public abstract AbstractC2015a c(String str);

    public abstract void d();

    public abstract void e(String str, String str2, String str3);

    public AbstractC2015a(int i8, AbstractC2015a abstractC2015a) {
        if (i8 != 589824 && i8 != 524288 && i8 != 458752 && i8 != 393216 && i8 != 327680 && i8 != 262144 && i8 != 17432576) {
            throw new IllegalArgumentException("Unsupported api " + i8);
        }
        if (i8 == 17432576) {
            j.a(this);
        }
        this.f15227a = i8;
        this.f15228b = abstractC2015a;
    }
}
