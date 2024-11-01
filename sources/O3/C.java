package O3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public static final C f7147a = new C("None", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final C f7148b = new C("Removable", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final C f7149c = new C("Modifiable", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ C[] f7150d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ W5.a f7151e;

    static {
        C[] a9 = a();
        f7150d = a9;
        f7151e = W5.b.a(a9);
    }

    private C(String str, int i8) {
    }

    private static final /* synthetic */ C[] a() {
        return new C[]{f7147a, f7148b, f7149c};
    }

    public static C valueOf(String str) {
        return (C) Enum.valueOf(C.class, str);
    }

    public static C[] values() {
        return (C[]) f7150d.clone();
    }
}
