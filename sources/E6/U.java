package E6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class U {

    /* renamed from: c, reason: collision with root package name */
    public static final U f2050c = new U("OBJ", 0, '{', '}');

    /* renamed from: d, reason: collision with root package name */
    public static final U f2051d = new U("LIST", 1, '[', ']');

    /* renamed from: e, reason: collision with root package name */
    public static final U f2052e = new U("MAP", 2, '{', '}');

    /* renamed from: f, reason: collision with root package name */
    public static final U f2053f = new U("POLY_OBJ", 3, '[', ']');

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ U[] f2054g;

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ W5.a f2055h;

    /* renamed from: a, reason: collision with root package name */
    public final char f2056a;

    /* renamed from: b, reason: collision with root package name */
    public final char f2057b;

    static {
        U[] a9 = a();
        f2054g = a9;
        f2055h = W5.b.a(a9);
    }

    private U(String str, int i8, char c8, char c9) {
        this.f2056a = c8;
        this.f2057b = c9;
    }

    private static final /* synthetic */ U[] a() {
        return new U[]{f2050c, f2051d, f2052e, f2053f};
    }

    public static W5.a b() {
        return f2055h;
    }

    public static U valueOf(String str) {
        return (U) Enum.valueOf(U.class, str);
    }

    public static U[] values() {
        return (U[]) f2054g.clone();
    }
}
