package T2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f9960a = new a("Verified", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final a f9961b = new a("NeedsVerification", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final a f9962c = new a("VerificationStarted", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final a f9963d = new a("SignedOut", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final a f9964e = new a("Error", 4);

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ a[] f9965f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ W5.a f9966g;

    static {
        a[] a9 = a();
        f9965f = a9;
        f9966g = W5.b.a(a9);
    }

    private a(String str, int i8) {
    }

    private static final /* synthetic */ a[] a() {
        return new a[]{f9960a, f9961b, f9962c, f9963d, f9964e};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f9965f.clone();
    }
}
