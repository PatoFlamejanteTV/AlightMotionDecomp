package c2;

/* loaded from: classes4.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    protected final int f15445a;

    /* renamed from: b, reason: collision with root package name */
    z f15446b;

    public z(int i8) {
        this(i8, null);
    }

    public abstract AbstractC2015a a(String str, boolean z8);

    public abstract void b(C2017c c2017c);

    public abstract void c();

    public abstract AbstractC2015a d(int i8, C2014E c2014e, String str, boolean z8);

    public z(int i8, z zVar) {
        if (i8 != 589824 && i8 != 524288 && i8 != 458752 && i8 != 393216 && i8 != 327680 && i8 != 262144 && i8 != 17432576) {
            throw new IllegalArgumentException("Unsupported api " + i8);
        }
        if (i8 == 17432576) {
            j.a(this);
        }
        this.f15445a = i8;
        this.f15446b = zVar;
    }
}
