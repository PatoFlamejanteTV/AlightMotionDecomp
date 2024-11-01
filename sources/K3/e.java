package K3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f4624a = new e("Active", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final e f4625b = new e("Success", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final e f4626c = new e("Failed", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final e f4627d = new e("Canceled", 3);

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ e[] f4628e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ W5.a f4629f;

    static {
        e[] a9 = a();
        f4628e = a9;
        f4629f = W5.b.a(a9);
    }

    private e(String str, int i8) {
    }

    private static final /* synthetic */ e[] a() {
        return new e[]{f4624a, f4625b, f4626c, f4627d};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f4628e.clone();
    }
}
