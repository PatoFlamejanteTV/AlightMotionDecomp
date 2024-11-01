package g3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class N {

    /* renamed from: b, reason: collision with root package name */
    public static final N f32057b = new N("Automatic", 0, "automatic");

    /* renamed from: c, reason: collision with root package name */
    public static final N f32058c = new N("Skip", 1, "skip");

    /* renamed from: d, reason: collision with root package name */
    public static final N f32059d = new N("Microdeposits", 2, "microdeposits");

    /* renamed from: e, reason: collision with root package name */
    public static final N f32060e = new N("Instant", 3, "instant");

    /* renamed from: f, reason: collision with root package name */
    public static final N f32061f = new N("InstantOrSkip", 4, "instant_or_skip");

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ N[] f32062g;

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ W5.a f32063h;

    /* renamed from: a, reason: collision with root package name */
    private final String f32064a;

    static {
        N[] a9 = a();
        f32062g = a9;
        f32063h = W5.b.a(a9);
    }

    private N(String str, int i8, String str2) {
        this.f32064a = str2;
    }

    private static final /* synthetic */ N[] a() {
        return new N[]{f32057b, f32058c, f32059d, f32060e, f32061f};
    }

    public static N valueOf(String str) {
        return (N) Enum.valueOf(N.class, str);
    }

    public static N[] values() {
        return (N[]) f32062g.clone();
    }

    public final String b() {
        return this.f32064a;
    }
}
