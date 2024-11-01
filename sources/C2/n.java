package c2;

/* loaded from: classes4.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    protected final int f15313a;

    /* renamed from: b, reason: collision with root package name */
    protected n f15314b;

    public n(int i8) {
        this(i8, null);
    }

    public abstract AbstractC2015a a(String str, boolean z8);

    public abstract void b(C2017c c2017c);

    public abstract void c();

    public abstract AbstractC2015a d(int i8, C2014E c2014e, String str, boolean z8);

    public n(int i8, n nVar) {
        if (i8 != 589824 && i8 != 524288 && i8 != 458752 && i8 != 393216 && i8 != 327680 && i8 != 262144 && i8 != 17432576) {
            throw new IllegalArgumentException("Unsupported api " + i8);
        }
        if (i8 == 17432576) {
            j.a(this);
        }
        this.f15313a = i8;
        this.f15314b = nVar;
    }
}
