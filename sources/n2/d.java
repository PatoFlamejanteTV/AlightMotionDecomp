package N2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final d f6435b = new d("Production", 0, 1);

    /* renamed from: c, reason: collision with root package name */
    public static final d f6436c = new d("Test", 1, 3);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ d[] f6437d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ W5.a f6438e;

    /* renamed from: a, reason: collision with root package name */
    private final int f6439a;

    static {
        d[] a9 = a();
        f6437d = a9;
        f6438e = W5.b.a(a9);
    }

    private d(String str, int i8, int i9) {
        this.f6439a = i9;
    }

    private static final /* synthetic */ d[] a() {
        return new d[]{f6435b, f6436c};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f6437d.clone();
    }

    public final int b() {
        return this.f6439a;
    }
}
