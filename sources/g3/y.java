package g3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class y {

    /* renamed from: b, reason: collision with root package name */
    public static final y f32276b = new y("Passthrough", 0, "PASSTHROUGH");

    /* renamed from: c, reason: collision with root package name */
    public static final y f32277c = new y("LinkPaymentMethod", 1, "LINK_PAYMENT_METHOD");

    /* renamed from: d, reason: collision with root package name */
    public static final y f32278d = new y("LinkCardBrand", 2, "LINK_CARD_BRAND");

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ y[] f32279e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ W5.a f32280f;

    /* renamed from: a, reason: collision with root package name */
    private final String f32281a;

    static {
        y[] a9 = a();
        f32279e = a9;
        f32280f = W5.b.a(a9);
    }

    private y(String str, int i8, String str2) {
        this.f32281a = str2;
    }

    private static final /* synthetic */ y[] a() {
        return new y[]{f32276b, f32277c, f32278d};
    }

    public static W5.a b() {
        return f32280f;
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f32279e.clone();
    }

    public final String c() {
        return this.f32281a;
    }
}
