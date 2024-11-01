package j6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f34359a = new n("PUBLIC", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final n f34360b = new n("PROTECTED", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final n f34361c = new n("INTERNAL", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final n f34362d = new n("PRIVATE", 3);

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ n[] f34363e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ W5.a f34364f;

    static {
        n[] a9 = a();
        f34363e = a9;
        f34364f = W5.b.a(a9);
    }

    private n(String str, int i8) {
    }

    private static final /* synthetic */ n[] a() {
        return new n[]{f34359a, f34360b, f34361c, f34362d};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f34363e.clone();
    }
}
