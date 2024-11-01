package q5;

/* renamed from: q5.v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3797v {

    /* renamed from: a, reason: collision with root package name */
    public static final C3797v f37313a = new C3797v();

    /* renamed from: b, reason: collision with root package name */
    private static boolean f37314b;

    /* renamed from: c, reason: collision with root package name */
    private static int f37315c;

    /* renamed from: d, reason: collision with root package name */
    private static int f37316d;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f37317e;

    private C3797v() {
    }

    public final int a() {
        return f37315c;
    }

    public final int b() {
        return f37316d;
    }

    public final boolean c() {
        int i8 = f37315c;
        if (i8 == 0) {
            return true;
        }
        if (f37314b && (f37317e || i8 >= 4300)) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        return f37314b;
    }

    public final boolean e() {
        if (f37314b && (f37317e || f37316d >= 9152)) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return f37317e;
    }

    public final void g(int i8) {
        f37315c = i8;
    }

    public final void h(boolean z8) {
        f37314b = z8;
    }

    public final void i(int i8) {
        f37316d = i8;
    }

    public final void j(boolean z8) {
        f37317e = z8;
    }
}
