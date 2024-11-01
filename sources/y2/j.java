package Y2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f12018a = new j("Email", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final j f12019b = new j("Phone", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final j f12020c = new j("Name", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ j[] f12021d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ W5.a f12022e;

    static {
        j[] a9 = a();
        f12021d = a9;
        f12022e = W5.b.a(a9);
    }

    private j(String str, int i8) {
    }

    private static final /* synthetic */ j[] a() {
        return new j[]{f12018a, f12019b, f12020c};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f12021d.clone();
    }
}
