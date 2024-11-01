package I3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f3397a = new b("Primary", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final b f3398b = new b("Secondary", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ b[] f3399c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ W5.a f3400d;

    static {
        b[] a9 = a();
        f3399c = a9;
        f3400d = W5.b.a(a9);
    }

    private b(String str, int i8) {
    }

    private static final /* synthetic */ b[] a() {
        return new b[]{f3397a, f3398b};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f3399c.clone();
    }
}
