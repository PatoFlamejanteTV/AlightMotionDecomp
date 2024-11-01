package V5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f10655a = new a("COROUTINE_SUSPENDED", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final a f10656b = new a("UNDECIDED", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final a f10657c = new a("RESUMED", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ a[] f10658d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ W5.a f10659e;

    static {
        a[] a9 = a();
        f10658d = a9;
        f10659e = W5.b.a(a9);
    }

    private a(String str, int i8) {
    }

    private static final /* synthetic */ a[] a() {
        return new a[]{f10655a, f10656b, f10657c};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f10658d.clone();
    }
}
