package D3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f1233a = new b("Buy", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final b f1234b = new b("Book", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final b f1235c = new b("Checkout", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final b f1236d = new b("Donate", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final b f1237e = new b("Order", 4);

    /* renamed from: f, reason: collision with root package name */
    public static final b f1238f = new b("Pay", 5);

    /* renamed from: g, reason: collision with root package name */
    public static final b f1239g = new b("Subscribe", 6);

    /* renamed from: h, reason: collision with root package name */
    public static final b f1240h = new b("Plain", 7);

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ b[] f1241i;

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ W5.a f1242j;

    static {
        b[] a9 = a();
        f1241i = a9;
        f1242j = W5.b.a(a9);
    }

    private b(String str, int i8) {
    }

    private static final /* synthetic */ b[] a() {
        return new b[]{f1233a, f1234b, f1235c, f1236d, f1237e, f1238f, f1239g, f1240h};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f1241i.clone();
    }
}
